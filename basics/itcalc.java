public class itcalc {
    public static void main(String[] args) {
        double income = 500000;
        double t1=0.00;
        double t2 = 0.20;
        double t3 = 0.30;
        income = income<500000 ? income *t1 : 0;
        System.out.println(income);
    }
}
