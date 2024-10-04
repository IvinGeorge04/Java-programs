package Tutorial;

public class Demo {

public static void main(String[] args) {

try

{ int firstNumber=0;

int secondNumber=100;

if(firstNumber==0)

{

throw new ArithmeticException("Division By Zero");

}

int result=secondNumber/firstNumber;

System.out.println("Result="+result);

}catch(ArithmeticException e)

{ System.out.println("Division By Zero is not possible");}

}

}
