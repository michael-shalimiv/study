package by.it_academy.shalimov.jd01_07;

import java.util.Arrays;

class Matrix extends Var {
    private double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }

   /* Matrix(String str) {
        int lenght =0 ;
        for (String elments : str.substring(2,str.length()-3).split("},{"))
            lenght=elments.split(",").length;
        String[][] values = new String[str.substring(2,str.length()-3).split("},{").length][lenght];
        int i =0;
        int j = 0;
       for (String elments : str.substring(2,str.length()-3).split("},{")) {
           for (String element : elments.split("[,}{]+")) {
               values[i][j] = element;
               j++;
           }
           i++;
           j=0;
       }


        this.value = Arrays.stream(values).mapToDouble(Double::parseDouble).toArray();
    }*/
    Matrix(Matrix matrix){
        this.value=matrix.value;
    }

    @Override
    public String toString() {
        StringBuilder matrix = new StringBuilder("{{");
        String delimiter = "";
        String delimiter1 ="";
        for (double element1[] : value) {
            matrix.append(delimiter1);
            delimiter="";
            for (double element : element1) {
                matrix.append(delimiter).append(element);
                delimiter = ", ";
            }
           delimiter1=("}, {");
        }
        matrix.append("}}");
        return matrix.toString();
    }
}
