public class calculator {
	public static double getSum(double [] numb) {
		double sum = 0.0;
		for(int s=0; s< numb.length; s++) {
			sum+=numb[s];
		}
		return (sum);
	}
	
	public static double getAverage(double first, double second) {
		return (first + second)/2.0;
	}
	public static double getAverage(double [] numb) {
		double sum = 0.0;
		for(int s=0; s<numb.length; s++) {
			sum+=numb[s];
		}
		return(sum/numb.length);
	}
	public static double getProduct(double [] product) {
		double pro = 0;
		for(int s=0; s < product.length; s++) {
			pro = product[0] * product[2]*product[1];
		}
		return(pro);
	}
	

}

