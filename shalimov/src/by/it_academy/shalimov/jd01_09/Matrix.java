package by.it_academy.shalimov.jd01_09;

import java.util.Arrays;

class Matrix extends Var {
    private double[][] value;

    public Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(String strMatrix) {
        String one = "";
        String two = "";
        strMatrix = strMatrix.replaceAll(" ", "");
        String[] matr = strMatrix.split("\\},\\{");
        for (int i = 0; i < matr.length; i++) {
            if (i < (matr.length - 1)) one = matr[i];
            else two = matr[i];
        }
        one = one.replaceAll("\\{|\\}", "");
        String[] oneArray = one.split(",");
        two = two.replaceAll("\\{|\\}", "");
        String[] twoArray = two.split(",");
        String[] both = new String[(oneArray.length + twoArray.length)];
        for (int i = 0; i < oneArray.length; i++) {
            both[i] = oneArray[i];
            both[(i + 2)] = twoArray[i];
        }
        value = new double[oneArray.length][twoArray.length];
        for (int i = 0; i < oneArray.length; i++) {
            for (int j = 0; j < oneArray.length; j++) {
                if (i < (oneArray.length - 1)) value[i][j] = Double.parseDouble(oneArray[j]);
                else value[i][j] = Double.parseDouble(twoArray[j]);
            }
        }
    }


    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Matrix) {
            if (this.value.length == ((Matrix) other).value.length && this.value[0].length == ((Matrix) other).value[0].length) {
                double[][] sub = Arrays.copyOf(value, value.length);
                for (int i = 0; i < sub.length; i++) {
                    for (int j = 0; j < sub[i].length; j++){
                        sub[i][j]+=((Matrix) other).value[i][j];
                    }
                }
                return new Matrix(sub);
            }
        }
        else if(other instanceof Scalar){
            double[][] sub = Arrays.copyOf(value, value.length);
            for (int i = 0; i < sub.length; i++) {
                for (int j = 0; j < sub[i].length; j++){
                    double val = sub[i][j] + ((Scalar) other).getValue();
                    sub[i][j]=val;
                }
            }
            return new Matrix(sub);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Matrix) {
            if (this.value.length == ((Matrix) other).value.length && this.value[0].length == ((Matrix) other).value[0].length) {
                double[][] sub = Arrays.copyOf(value, value.length);
                for (int i = 0; i < sub.length; i++) {
                    for (int j = 0; j < sub[i].length; j++){
                        sub[i][j]-=((Matrix) other).value[i][j];
                    }
                }
                return new Matrix(sub);
            }
        }
        else if(other instanceof Scalar){
            double[][] sub = Arrays.copyOf(value, value.length);
            for (int i = 0; i < sub.length; i++) {
                for (int j = 0; j < sub[i].length; j++){
                    sub[i][j]-=((Scalar) other).getValue();
                }
            }
            return new Matrix(sub);
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Matrix) {
            if (value.length == ((Matrix) other).value.length && value[0].length == ((Matrix) other).value[0].length) {
                double[][] res = new double[value.length][0];
                double[][] last = new double[res.length][((Matrix) other).value[0].length];
                for (int i = 0; i < res.length; i++) {
                    res[i] = Arrays.copyOf(value[i], value[i].length);
                }
                for (int i = 0; i < res.length; i++) {
                    for (int j = 0; j < ((Matrix) other).value[0].length; j++) {
                        for (int k = 0; k < ((Matrix) other).value.length; k++) {
                            last[i][j] += res[i][k] * ((Matrix) other).value[k][j];
                        }
                    }
                }
                return new Matrix(last);
            } else return super.mul(other);
        }

        else if (other instanceof Vector) {
            if (value[0].length == ((Vector) other).getValue().length || value.length == ((Vector) other).getValue().length) {
                double[][] res = new double[value.length][0];
                for (int i = 0; i < res.length; i++) {
                    res[i] = Arrays.copyOf(value[i], value[i].length);
                }
                double[] vector = ((Vector) other).getValue();
                double[] matrixSize = new double[res.length];

                for (int i = 0; i < res.length; i++) {
                    for (int j = 0; j < vector.length; j++) {
                        matrixSize[i] += res[i][j] * vector[j];
                    }
                }

                return new Vector(matrixSize);
            }
        }


        else if(other instanceof Scalar){
            double[][] sub = Arrays.copyOf(value, value.length);
            for (int i = 0; i < sub.length; i++) {
                for (int j = 0; j < sub[i].length; j++){
                    sub[i][j]*=((Scalar) other).getValue();
                }
            }
            return new Matrix(sub);
        }
        return super.mul(other);
    }

    @Override
    public Var div(Var other) {
        if(other instanceof Scalar){
            double[][] sub = Arrays.copyOf(value, value.length);
            for (int i = 0; i < sub.length; i++) {
                for (int j = 0; j < sub[i].length; j++){
                    sub[i][j]/=((Scalar) other).getValue();
                }
            }
            return new Matrix(sub);
        }
        return super.div(other);
    }

    @Override
    public String toString() {
        StringBuilder matrix = new StringBuilder("{{");
        String delimiter = "";
        String delimiter1 = "";
        for (double element1[] : value) {
            matrix.append(delimiter1);
            delimiter = "";
            for (double element : element1) {
                matrix.append(delimiter).append(element);
                delimiter = ", ";
            }
            delimiter1 = ("}, {");
        }
        matrix.append("}}");
        return matrix.toString();
    }
}
