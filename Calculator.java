class Calculator
{
String brand; 
int price; 
Calculator(String brand, int price) 
{
System.out.println("No-args Constructor");
}
Calculator()  
{
}
public static void main(String[] args)
{
Calculator calc2 = new Calculator();
Calculator calc = new Calculator("casio", 750);
}
}
