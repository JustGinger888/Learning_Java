public class funtions {

    public static double salaryCalc(double HPW, double RPH, double VD) {
        if (HPW < 0) {
            return -1;
        }
        if (RPH < 0) {
            return -1;
        }

        double WP = HPW * RPH;
        double UT = VD * RPH * 8;
        return  (WP * 52) - UT;
    }

    public static void main(String[] args) {
        double salary = salaryCalc(40, 10, 8);
        System.out.println(salary);
    }
}
