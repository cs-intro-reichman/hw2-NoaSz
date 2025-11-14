public class CalcPi {
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        double piApprox = 0.0;

        for (int i = 0; i < n; i++) {
            piApprox += Math.pow(-1.0, i) / (2.0 * i + 1.0);
        }

        piApprox *= 4.0;

        System.out.println("pi according to Java: 3.141592653589793");

        // EXACT formatting required by GitHub: 5 spaces before %f
        System.out.printf("pi, approximated:     %.15f%n", piApprox);
    }
}