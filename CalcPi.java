// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] var0) { 
	int var1 = Integer.parseInt(var0[0]);
	double var2 = 0.0;

	for(int var4=0; var4 < var1; ++var4) {
		var2 += Math.pow(-1.0, (double)var4) / (2.0 * (double)var4 + 1.0);
	}

	double var6 = 4.0 * var2;
	System.out.println("pi according to Java: 3.141592653589793");
	System.out.println("pi, approximated: " + var6);

	}
}
