package org.walker.math;

public class SimpleMath {

    //Adição entre dois números:
    public Double addition(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }
    //Subtração entre dois números:
    public Double subtraction(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }
    //Multiplicação entre dois números:
    public Double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }
    //Divisão entre dois números:
    public Double division(Double firstNumber, Double secondNumber) {
        return firstNumber / secondNumber;
    }
    //Média entre dois números:
    public Double mean(Double firstNumber, Double secondNumber) {
        return (firstNumber + secondNumber) / 2;
    }
    //Raiz quadrada de um número:
    public Double squareRoot(int number) {
        return (Double) Math.sqrt(number);
    }
}
