import java.util.Scanner;


class Calculator {
public double add(double a, double b) { return a + b; }
public double sub(double a, double b) { return a - b; }
public double mul(double a, double b) { return a * b; }
public double div(double a, double b) {
if (b == 0) throw new ArithmeticException("Division by zero");
return a / b;
}
}


public class Problem_1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a (double):");
double a = sc.nextDouble();
System.out.println("Enter b (double):");
double b = sc.nextDouble();
sc.nextLine();
System.out.println("Enter operation (add, sub, mul, div):");
String op = sc.nextLine().trim().toLowerCase();


Calculator calc = new Calculator();
try {
double result;
switch (op) {
case "add": result = calc.add(a, b); break;
case "sub": result = calc.sub(a, b); break;
case "mul": result = calc.mul(a, b); break;
case "div": result = calc.div(a, b); break;
default: System.out.println("Unsupported operation: " + op); return;
}
System.out.println("Result: " + result);
} catch (ArithmeticException ex) {
System.out.println("Error: " + ex.getMessage());
}
}
}
