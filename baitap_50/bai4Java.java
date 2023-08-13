package baitap_50;

public class bai4Java {
    static public void dientich(double a, double b, double c)
    {
        double p = 0.5*(a+b+c);
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.printf("dien tich tam giac = %.3f", s);

    };

    public static void main(String[] args) {
        dientich(5,6,7);


    }
}
