
public class calculatordriver {

	public static void main(String[] args) {
		double [] numb = new double [5];
		numb[0] = 1.0;
		numb[1] = 2.0;
		numb[2] = 3.0;
		numb[3] = 4.0;
		numb[4] = 5.0;
		double [] product = new double [3];
		numb[0] = 3;
		numb[1] = 2;
		numb[2] = 4;

		
 		System.out.println("The average is " + calculator.getAverage(numb));
		System.out.println("The product is " + calculator.getProduct(numb));
		System.out.println("The sum is " + calculator.getSum(numb));
}
}