import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = 0, X, i = 0, somaIn = 0, somaOut = 0;
		
		N = sc.nextInt();
		
		for (X = 0; i != N; i ++) {
			X = sc.nextInt();
			if(X >= 10 && X <= 20) {
				somaIn = somaIn + 1;
			}else {
				somaOut = somaOut + 1;
			}
		}
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");
		
		
		
		sc.close();

	}

}
