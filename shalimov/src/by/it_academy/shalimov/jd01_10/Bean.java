package by.it_academy.shalimov.jd01_10;

public class Bean {

    @Param(a=3,b=4)
    static double sum(int a, int b){
        return a+b;
    }
    @Param(a=3,b=6)
    static double avg(int a, int b){
        return (a+b)/2.0;
    }
    @Param(a=2,b=9)
    double max(int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }

    double min(int a, int b){
        return a < b ? a : b;
    }

}
