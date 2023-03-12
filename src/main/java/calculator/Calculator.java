package calculator;

public class Calculator {
    public Calculator(){
        // TODO document why this constructor is empty
    }
    public double add(double a, double b) {
        return a+b;
    }

    public double sub(double a, double b) {
        return a-b;
    }

    public double mul(double a, double b) {
        return a*b;
    }

    public double div(double a, double b) throws DivisionByZeroException {
        if(b!=0){
            return a/b;
        }else{
            throw new DivisionByZeroException();
        }
    }

}
