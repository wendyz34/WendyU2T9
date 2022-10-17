
public class TriangleRunner {
    public static void main(String[]args){
        RightTriangle right = new RightTriangle(3,4);
        RightTriangle right1 = new RightTriangle(6.5,10.7);
        double hypo1= right.hypotenuse();
        double hypo2 = right1.hypotenuse();

        System.out.println(hypo1);
        System.out.println(hypo2);
    }


}

