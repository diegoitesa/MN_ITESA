// Source code is decompiled from a .class file using FernFlower decompiler.
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class EulerCafe {
   public EulerCafe() {
   }

   public static void main(String[] var0) {
      boolean var1 = true;
      String[] var10000 = new String[]{"y"};
      String var3 = "-0.1*(y - 22)";
      double var4 = 90.0;
      double var6 = 1.0;
      double var8 = 10.0;
      Expression var10 = (new ExpressionBuilder(var3)).variables(new String[]{"t", "y"}).build();
      int var11 = (int)Math.round(var8 / var6) + 1;
      double[] var12 = new double[var11];
      double[] var13 = new double[var11];
      var12[0] = var4;

      int var14;
      for(var14 = 0; var14 < var11; ++var14) {
         var13[var14] = (double)var14 * var6;
      }

      for(var14 = 1; var14 < var11; ++var14) {
         double var15 = var13[var14 - 1];
         double var17 = var12[var14 - 1];
         var10.setVariable("t", var15);
         var10.setVariable("y", var17);
         double var19 = var10.evaluate();
         var12[var14] = var17 + var6 * var19;
      }

      System.out.println("Resultados numéricos del enfriamiento del café:");
      System.out.println("t (min)\t y (°C)");

      for(var14 = 0; var14 < var11; ++var14) {
         System.out.printf("%.2f\t %.6f\n", var13[var14], var12[var14]);
      }

   }
}
