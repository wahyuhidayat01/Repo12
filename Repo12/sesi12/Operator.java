public class Operator{
	public static void main(String args[]){
		int num1=100;
		int num2=120;
		int result1, result2, result3, result4, result5;
		result1= num1 | num2;
		result2= num2 - num1;
		result3= -~ num2;
		result4= --  num1;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}