package by.it_academy.shalimov.jd01_07;

public class Runner {
    public static void main(String[] args) {
        Var v1=new Scalar(3.14);
        Var v2 = new Vector(new String("{1,2,4}"));
        Var v3 = new Matrix(new double[][]{{2,3},{3,4}});
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
