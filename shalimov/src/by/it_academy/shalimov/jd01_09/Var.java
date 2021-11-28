package by.it_academy.shalimov.jd01_09;

public abstract class Var implements Operation {

    @Override
    public Var add(Var other) {
        System.out.println("Операция сложения"+this+"+"+other+" Невозможна");
        return null;
    }

    @Override
    public Var sub(Var other) {
        System.out.println("Операция вычитания"+this+"+"+other+" Невозможна");
        return null;
    }

    @Override
    public Var mul(Var other) {
        System.out.println("Операция умножения"+this+"+"+other+" Невозможна");
        return null;
    }

    @Override
    public Var div(Var other) {
        System.out.println("Операция деления"+this+"+"+other+" Невозможна");
        return null;
    }

    static Var createVar(String operand){
        operand=operand.trim().replace("\\s+", "");
        if(operand.matches(Patterns.SCALAR))
            return new Scalar(operand);
        if(operand.matches(Patterns.VECTOR))
            return new Vector(operand);
        if(operand.matches(Patterns.MATRIX))
            return new Matrix(operand);
        return null;
    }
}
