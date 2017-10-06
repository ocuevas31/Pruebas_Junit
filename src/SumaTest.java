import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

   @Test
   public void sumaPositivos() {
      System.out.println("Sumando dos n�meros positivos ...");
       Suma S = new Suma(2, 3);
       //assertTrue(S.sumar() == 5);
       
       assertEquals(5,S.sumar());
   }

   @Test
   public void sumaNegativos() {
       System.out.println("Sumando dos n�meros negativos ...");
       Suma S = new Suma(-2, -3);
       assertEquals(-5,S.sumar());
   }

   @Test
   public void sumaPositivoNegativo() {
       System.out.println("Sumando un n�mero positivo y un n�mero negativo ...");
       Suma S = new Suma(2, -3);
       assertEquals(-1,S.sumar());
   }
   
   
   
   @Test
   public  void testconIf()
   {
	   Suma s=new Suma(1,2);
	   assertEquals(0, s.conIf());
	   
	   /*Como el metodo tiene un if  hay que probar las 2 ramas del if*/
	   Suma s2=new Suma(2,2);
	   assertEquals(1, s2.conIf());
   }
   
   @Test
   public void testconIfconAND()
   {
	   
	   //como es un and hay que probar que 1� verd y 2� falso
	   Suma s=new Suma(1,2);
	   assertEquals(0, s.conIfconAND());
	   
	   //1� verd y 2� verd
	   Suma s2=new Suma(1,-2);
	   assertEquals(1, s2.conIfconAND());
	   
	   //falta los 2 falsos
	   Suma s3=new Suma(-1,2);
	   assertEquals(0, s3.conIfconAND());
	   
   }
   
   
   @Test
   public void testconIfconOR()
   {
	   
	   //como es un and hay que probar que 1� verd y 2� falso
	   Suma s=new Suma(1,2);
	   assertEquals(1, s.conIfconOR());
	   
	   //1� verd y 2� verd
	   Suma s2=new Suma(-1,-2);
	   assertEquals(1, s2.conIfconOR());
	   
	   Suma s3=new Suma(-1,2);
	   assertEquals(0, s3.conIfconOR());
	   
   }
   
} 