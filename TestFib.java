package calvuelto;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class TestFib {
		private FibCodificador num1;
		private FibCodificador num2;
		private FibCodificador num3;
	@Before public void setUp(){
		num1 = new FibCodificador(5);
		num2 = new FibCodificador(16);
		num3 = new FibCodificador(12);
	}
	
	@Test
	public void test() {
		
		assertEquals(num1.getString(),"10000");
		assertEquals(num2.getString(),"1001000");
		assertEquals(num3.getString(),"101010");
	}

}
