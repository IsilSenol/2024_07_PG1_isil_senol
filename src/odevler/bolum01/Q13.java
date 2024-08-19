package odevler.bolum01;

public class Q13 {
    public static void main(String[] args){
        /* 3.4x + 50.2 =44.5
           2.1x + 0.55y =5.9 */
        double a=3.4, b=50.2, c=2.1, d=0.55, e=44.5, f=5.9,x,y;
        x= (e * d - b * f) / (a * d - b * c);
        y= (a*f-b*c)/(a*d-b*d);
        System.out.println(x);
        System.out.println(y);
    }
}
