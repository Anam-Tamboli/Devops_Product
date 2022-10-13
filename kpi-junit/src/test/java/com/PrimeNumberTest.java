package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PrimeNumberTest {
@Test
public void evaluatesExpression() {
			 PrimeNumber n=new PrimeNumber();
			boolean s=n.isPrime(5);
			 assertEquals(true, s);
		 }
		 
		        
}


