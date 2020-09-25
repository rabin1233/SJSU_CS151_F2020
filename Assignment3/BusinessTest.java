

public class BusinessTest {
    public static void main(String[] args) {
        //Address add;
        Customer cust = new Customer("Ains", "greg", new Address(1123, "Norvell St", "El Cerrito", "94530", "CA"), 1234, "Cash");
        cust.introduce();
        cust.makePayment("Cash");
        System.out.println("");

        Customer cust1= new Customer("aony", "hunur", new Address(4534, "Chiquita St", "Berkeley", "23424", "MI"), 4323, "Credit");
        cust1.introduce();
        cust1.makePayment("Credit");
        System.out.println("");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        Contractor cont = new Contractor("roy", "gurung", new Address(111,"Holly St",  "San Pablo", "92392", "CA"), 123231,50 );
        cont.setSsn("2332424");
        cont.introduce(true);
        System.out.println("Your Pay: " + cont.computePay(45));
        System.out.println("");

        Contractor cont1 = new Contractor("abhi", "patel", new Address(2324,"lincoln St",  "Richmond", "942432", "CA"), 11232,50 );
        cont1.setSsn("2332424");
        cont1.introduce(false);
        System.out.println("Your Pay: " + cont1.computePay(20));
        System.out.println("");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        PartTimeHourly part = new PartTimeHourly("Ram", "Bahadur", new Address(1234,"Holly St",  "San Pablo", "92392", "CA"), 112, 124);
        part.setSsn("1231212");
        part.introduce(true);
        System.out.println("Your pay: " + part.computePay(50));
        System.out.println(" ");

        PartTimeHourly part1 = new PartTimeHourly("Nikhil", "Khan", new Address(3422,"Molly St",  "Berkeley", "92393", "CA"), 2113, 100);
        part1.setSsn("12334212");
        part1.introduce(false);
        System.out.println("Your pay: " + part1.computePay(40));
        System.out.println("");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Executive exe = new Executive("Yash", "huklu", new Address (34664,"Holly St",  "San Pablo", "92392", "CA"), 1244, 12423.00, 12312.00);
        exe.setSsn("12371242");
        exe.introduce(true);
        System.out.println("Your pay: " + exe.computePay());
        System.out.println(" ");

        Executive exe1 = new Executive("Ayush", "Ahmad", new Address (32232,"Craiglist St",  "San francisco", "932324", "CA"), 12534, 234223.00, 123122.00);
        exe1.setSsn("123422342");
        exe1.introduce(false);
        System.out.println("Your pay: " + exe1.computePay());
        System.out.println("");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        FullTimeHourly fullH = new FullTimeHourly("yakuza", "naruto", new Address (1123, "Norvell St", "Cerrito", "92232", "CA"), 12413, 1231.00, 45.00);
        fullH.setSsn("14214114");
        fullH.introduce(true);
        System.out.println("Your Pay: " + fullH.computePay(45));
        System.out.println(" ");

        FullTimeHourly fullH1 = new FullTimeHourly("Genzi", "Takiya", new Address (1232, "Hurricane St", "San Jose", "92322", "CA"), 12343, 1234.00, 50.00);
        fullH1.setSsn("1423224");
        fullH1.introduce(false);
        System.out.println("Your Pay: " + fullH1.computePay(70));
        System.out.println("");


        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        FullTimeSalaried fullS = new FullTimeSalaried("anmol", "ahmda", new Address(1231, "Barrett", "Cerrito", "92232", "CA"),12312, 5555.00);
        fullS.setSsn("1213121");
        fullS.introduce(true);
        System.out.println("Your Pay: "+ fullS.computePay(12));
        System.out.println(" ");

        FullTimeSalaried fullS1 = new FullTimeSalaried("Anup", "Mahaz", new Address(1324, "Barrett", "Cupertino", "923223", "CA"),123412, 5235.00);
        fullS1.setSsn("192342");
        fullS1.introduce(false);
        System.out.println("Your Pay: "+ fullS1.computePay(12));
    }
}