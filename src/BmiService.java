public class BmiService {

    public int calculate(int mass, int height) {

        int mCalc = mass * 1000;
        int hCalc = height * height / 10;
        int bmi = mCalc / hCalc;
        return bmi;

    }
}
