import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField total;
    private String op1;
    private String op2;
    private char operate;
    private boolean chosenOperation;
    private Label error;

    @Override
    public void start(Stage stage){
        Label lbl = new Label();
        Menu menu = new Menu("Menu");
        MenuBar menubar = new MenuBar();
        menubar.getMenus().add(menu);
        AnchorPane menuroot = new AnchorPane();
        menuroot.getChildren().addAll(menubar,lbl);
        menuroot.setBottomAnchor(lbl,0.0);

        total = new TextField();
        error = new Label();
        error.setTextFill(Color.RED);
        op1 = "";
        op2 = "";
        chosenOperation = false;
        total.setDisable(true);
        total.setOpacity(1);
        total.setText(" ");



        Button one = new Button(" 1 ");
        Button two = new Button(" 2 ");
        Button three = new Button(" 3 ");
        Button four = new Button(" 4 ");
        Button five = new Button(" 5 ");
        Button six = new Button(" 6 ");
        Button seven = new Button(" 7 ");
        Button eight = new Button(" 8 ");
        Button nine = new Button(" 9 ");
        Button zero = new Button(" 0 ");


        one.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('1'));
        two.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('2'));
        three.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('3'));
        four.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('4'));
        five.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('5'));
        six.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('6'));
        seven.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('7'));
        eight.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('8'));
        nine.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('9'));
        zero.addEventHandler(MouseEvent.MOUSE_CLICKED, generateDigit('0'));



        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");
        Button del = new Button("del");
        Button calc = new Button("=");


        add.addEventHandler(MouseEvent.MOUSE_CLICKED, generateOperation('+'));
        sub.addEventHandler(MouseEvent.MOUSE_CLICKED, generateOperation('-'));
        mul.addEventHandler(MouseEvent.MOUSE_CLICKED, generateOperation('*'));
        div.addEventHandler(MouseEvent.MOUSE_CLICKED, generateOperation('/'));

        del.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                error.setText("");
                if(chosenOperation){
                    if(op2.isEmpty()){
                        operate = '\0';
                        chosenOperation = false;
                        total.setText(op1);
                    }else{
                        if(op2.length() > 1)
                            op2 = op2.substring(0, op2.length() - 1);
                        else
                            op2 = "";
                        total.setText(op1 + operate + op2);
                    }
                }else{
                    if(op1.length() > 1)
                        op1 = op1.substring(0, op1.length() - 1);
                    else
                        op1 = "";
                    total.setText(op1);
                }
            }
        });

        calc.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(chosenOperation){
                    if(op2.isEmpty()){
                        error.setText("Syntax Error");
                    }else{
                        long num1 = Long.parseLong(op1);
                        long num2 = Long.parseLong(op2);
                        switch(operate){
                            case '+':
                                op1 = String.valueOf(num1 + num2);
                                op2 = "";
                                chosenOperation = false;
                                operate = '\0';
                                total.setText(op1);
                                break;
                            case '-':
                                op1 = String.valueOf(num1 - num2);
                                op2 = "";
                                chosenOperation = false;
                                operate = '\0';
                                total.setText(op1);
                                break;
                            case '*':
                                op1 = String.valueOf(num1 * num2);
                                op2 = "";
                                chosenOperation = false;
                                operate = '\0';
                                total.setText(op1);
                                break;
                            case '/':
                                if(num2 == 0){
                                    error.setText("Divide By Zero Error");
                                }else{
                                    op1 = String.valueOf(num1 / num2);
                                    op2 = "";
                                    chosenOperation = false;
                                    operate = '\0';
                                    total.setText(op1);
                                }
                                break;
                        }
                    }
                }
            }
        });

        GridPane buttonMatrix = new GridPane();
        buttonMatrix.addColumn(0, one, four, seven, del);
        buttonMatrix.addColumn(1, two, five, eight, zero);
        buttonMatrix.addColumn(2, three, six, nine, calc);
        buttonMatrix.addColumn(3, add, sub, mul, div);

        VBox root = new VBox(menuroot, total, buttonMatrix, error);
        root.setPadding(new Insets(20, 15,20,15));
        root.setSpacing(10);
        root.setStyle("-fx-backgound-color: #CC2EFA");

        Scene scene = new Scene(root);
        stage.setScene(scene);


        stage.setX(200);
        stage.setY(300);
        stage.setMinHeight(300);
        stage.setMinWidth(200);
        stage.setTitle("JAVA FX Calculator");
        stage.show();
        System.out.println(stage.getHeight());
        System.out.println(stage.getWidth());
    }

    public static void main(String[] args) {
        launch(args);
    }

    private EventHandler<MouseEvent> generateDigit(char character){
        return new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                error.setText("");
                if(chosenOperation){
                    op2 += character;
                    total.setText(op1 + operate + op2);
                }else{
                    op1 += character;
                    total.setText(op1);
                }
            }
        };
    }

    private EventHandler<MouseEvent> generateOperation(char op){
        return new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                error.setText("");
                if(!chosenOperation){
                    chosenOperation = true;
                    operate = op;
                    total.setText(op1 + operate);
                }else{
                    total.setText(op1 + operate + op2);
                }
            }
        };
    }
}

