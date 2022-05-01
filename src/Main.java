public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmi1 = service.calculate(200, 180);
        System.out.println(bmi1);

        int bmi2 = service.calculate(85, 185);
        System.out.println(bmi2);

        int bmi3 = service.calculate(60, 170);
        System.out.println(bmi3);

        int bmi4 = service.calculate(45, 180);
        System.out.println(bmi4);


    }
}