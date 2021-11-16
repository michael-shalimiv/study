package by.it_academy.shalimov.jd01_07;

import java.util.Arrays;

class Vector extends Var {
    private double[] value;

    public Vector(double[] value) {
        this.value = value;
    }

    Vector(String str) {
        this.value=Arrays.stream(str.trim().substring(1,str.length()-1).split(",")).mapToDouble(Double::parseDouble).toArray();
    }

    Vector(Vector vector){
        this.value= vector.value;
    }


    @Override
    public String toString() {
        StringBuilder vect = new StringBuilder("{");
        String delimiter = "";
        for (double element : value) {
            vect.append(delimiter).append(element);
            delimiter = ", ";
        }
        vect.append("}");
        return vect.toString();
    }
}
