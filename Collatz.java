// Demonstrates the Collatz conjecture.
public class Collatz {
   public Collatz() {
   }

   public static void main(String[] var0) {
      int var1 = Integer.parseInt(var0[0]);
      String var2 = var0[1];

      for(int var3 = 1; var3 <= var1; ++var3) {
         int var4 = var3;
         int var5 = 1;
         if (var2.equals("v")) {
            System.out.print("" + var3 + " ");
         }

         while(var4 != 1) {
            if (var4 % 2 == 0) {
               var4 /= 2;
            } else {
               var4 = 3 * var4 + 1;
            }

            ++var5;
            if (var2.equals("v")) {
               System.out.print("" + var4 + " ");
            }
         }

         if (var2.equals("v")) {
            System.out.println("(" + var5 + ")");
         }
      }

      System.out.println("Every one of the first " + var1 + " hailstone sequences reached 1.");
	}
}