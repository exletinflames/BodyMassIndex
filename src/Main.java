public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService () ;
        int weight = 80 ;
        double height = 1.73 ;
        int bmi = service.calculate(80,1.73);

        System.out.println("Body Mass Index = " + bmi);


        System.out.println("120/1.90");
        System.out.println(service.calculate(120,1.90));

        System.out.println("50/1.65");
        System.out.println(service.calculate(50,1.65));

    }
}