public class fraction {
	
	private int numerator;
	private int denominator;
	
	public fraction(int numerator, int denominator) {
		this.numerator= numerator;
		this.denominator= denominator;
		simplify();
	}
    private void simplify() {
    	
    	int gcd=1;
    	int smaller= Math.min(numerator,  denominator);
        for (int i=2; i<=smaller; i++) {
        	if(numerator % i== 0 && denominator % i ==0) {
        	gcd= i;	
        	}
        }
       numerator = numerator/gcd;
       denominator =denominator /gcd;
    }
    public void print() {
    	System.out.println(numerator+ "/" + denominator);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       fraction f1= new fraction(100,20);
       f1.print();
	}

}