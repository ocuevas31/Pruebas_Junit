public class Suma {

    private int num1;

   private int num2;

   public Suma(int n1, int n2) {
       num1 = n1;
       num2 = n2;
   }
   public int sumar() {
       int resultado = num1 + num2;
       return resultado;
   }
   
   
   
   public  int conIf()
   {
	   if (num1%2==0) return 1;
	   else return 0;
	   
   }
   
   public int  conIfconAND()
   {
	   
	   if (num1>0 && num2<0) return 1;
	   else return 0;
	   
   }
   
   
   public int  conIfconOR()
   {
	   
	   if (num1>0 || num2<0) return 1;
	   else return 0;
	   
   }
   
   
}