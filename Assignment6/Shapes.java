package Assignment6;

import org.ietf.jgss.GSSManager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Shapes implements Runnable{
    private ArrayList<Shape> shapeList;
    private Thread thread;

    public Shapes(){
        shapeList = new ArrayList<>();
    }

    public boolean add(Shape shape){
        return shapeList.add(shape);
    }

    public boolean remove(Shape shape){
        return shapeList.remove(shape);
    }

    public synchronized void compute(){
        System.out.println("Computation Started");
        for (Shape shape : shapeList) {
            System.out.println(shape +" has an area " + shape.computeArea());
        }
    }

    public void max(){
        Shape largest = null;
        for (Shape shape : shapeList) {
            if(largest == null || shape.computeArea() > largest.computeArea()){
                largest = shape;
            }
        }
        System.out.println("Biggest shape: " + largest);
    }

    public void min(){
        Shape smallest = null;
        for (Shape shape : shapeList) {
            if(smallest == null || shape.computeArea() < smallest.computeArea()){
                smallest = shape;
            }
        }
        System.out.println("Biggest shape: " + smallest);
    }

    @Override
    public void run() {
        System.out.println("Thread Starting");
        try {
            compute();
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Thread stopped");
    }

    public void start(){
        if(thread == null){
            thread = new Thread(this, "Shapes Thread");
            thread.start();
        }
    }

    public void serializeList(){
        try{
            for (int i = 0; i < shapeList.size(); i++) {
                FileOutputStream fileOutputStream = new FileOutputStream("obj" + (i + 1) +".ser");
                ObjectOutputStream stream = new ObjectOutputStream(fileOutputStream);

                stream.writeObject(shapeList.get(i));

                stream.close();
                fileOutputStream.close();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

