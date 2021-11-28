package by.it_academy.shalimov.jd01_09;

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
    public Var add(Var other) {
        if (other instanceof Vector){
            if(this.value.length==((Vector) other).value.length){
                double[] sub = new double[this.value.length];
                int i = 0;
                for (double element : this.value){
                    sub[i]=element;
                    i++;
                }
                i=0;
            for (double element : ((Vector) other).value){
                sub[i]+=element;
                i++;
            }
            return new Vector(sub);}
            else
                return super.add(other);
        }
        else if (other instanceof Scalar){

            double[] sub = new double[value.length];
            int i = 0;
            for (double element : this.value){
                sub[i]=element;
                i++;
            }
            i=0;
            for (double element : sub){
                double m = ((Scalar) other).getValue();
                sub[i]=element+m;
                i++;
            }
            return new Vector(sub);
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Vector) {
            if (this.value.length == ((Vector) other).value.length) {
                double[] sub = new double[this.value.length];
                int i = 0;
                for (double element : this.value) {
                    sub[i] = element;
                    i++;
                }
                i = 0;
                for (double element : ((Vector) other).value) {
                    sub[i] -= element;
                    i++;
                }
                return new Vector(sub);
            }
        } else if (other instanceof Scalar) {

            double[] sub = new double[value.length];
            int i = 0;
            for (double element : this.value) {
                sub[i] = element;
                i++;
            }
            i = 0;
            for (double element : sub) {
                double m = ((Scalar) other).getValue();
                sub[i] = element - m;
                i++;
            }
            return new Vector(sub);
        }

        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
            if (other instanceof Scalar){

                double[] sub = new double[value.length];
                int i = 0;
                for (double element : this.value){
                    sub[i]=element;
                    i++;
                }
                i=0;
                for (double element : sub){
                    double m = ((Scalar) other).getValue();
                    sub[i]=element*m;
                    i++;
                }
                return new Vector(sub);
            }
            else if (other instanceof Vector) {
                if (value.length == ((Vector) other).value.length) {
                    double[] res = Arrays.copyOf(value, value.length);
                    double mul = 0;
                    for (int i = 0; i < res.length; i++) {
                        mul += res[i] * ((Vector) other).value[i];
                    }
                    return new Scalar(mul);
                } else return super.mul(other);
            } else return super.mul(other);
        }



    @Override
    public Var div(Var other) {
        if (other instanceof Scalar) {
            if (((Scalar) other).getValue() != 0) {
                double[] res = Arrays.copyOf(value, value.length);
                for (int i = 0; i < res.length; i++) {
                    res[i] = res[i] / ((Scalar) other).getValue();
                }
                return new Vector(res);
            } else return super.div(other);
        } else return super.div(other);

    }

    public double[] getValue() {
        return value;
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
