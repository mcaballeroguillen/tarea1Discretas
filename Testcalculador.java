package calvuelto;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class Testcalculador {
	public vueltoCalculador calculadora= new vueltoCalculador();
	@Before public void setUp(){
		ArrayList<Integer> monedas= new ArrayList<Integer>();
		monedas.add(1); monedas.add(2);monedas.add(6); monedas.add(12);
		calculadora.setMonedas(monedas);
	}
	
	@Test
	public void test() {
		ArrayList<Integer> resp1= new ArrayList<Integer>();
		resp1.add(0);resp1.add(0);resp1.add(0);resp1.add(1);
		System.out.println(calculadora.vuelto(25).toString());
		assertEquals(resp1,calculadora.vuelto(12));
		ArrayList<Integer> resp2= new ArrayList<Integer>();
		resp2.add(1);resp2.add(0);resp2.add(0);resp2.add(2);
		assertEquals(resp2,calculadora.vuelto(25));
	}

}
