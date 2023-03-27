public class Calculator{
    int a;
    int b;
    public int add(int a, int b){
        int soma = a+b;
        return soma;
    } 
    public int subtract(int a, int b){
        int sub = a-b;
        return sub;
    }
    public int multiply(int a, int b){
        int multiplica = a*b;
        return multiplica;
    }
    public int divide(int a, int b){
        int divisao = a/b;
        return divisao;
    }
    public int modulo(int a, int b){
        int mod = a%b;
        return mod;
    }

    public static void main(String [] args){
        Calculator myCalculator = new Calculator();
        System.out.println("Soma = "+myCalculator.add(5,7));
        System.out.println("Subtração = "+myCalculator.subtract(12,34));
        System.out.println("Divisão = "+myCalculator.divide(12,34));
    }
}