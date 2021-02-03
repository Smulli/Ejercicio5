public class TomarValor {
	
	public static void main (String args[]) {
		int A = 4;
		int B = 8;
		int C = 6;
		int D = 5;
		System.out.println("Valor de B=" +B);
		System.out.println("Valor de C=" +C);
		System.out.println("Valor de A=" +A);
		System.out.println("Valor de D=" +D);
		
		int B2 = B;
		B = C;
		C = A;
		A = D;
		D = B2;
		System.out.println("B toma el valor de C=" +B);
		System.out.println("C toma el valor de A=" +C);
		System.out.println("A toma el valor de D=" +A);
		System.out.println("D toma el valor de B=" +D);
	}
}
	

