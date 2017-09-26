package calvuelto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class Testmatriz {
	public MatrizComparador comparador; 
	public HashMap<Integer, ArrayList<Integer>> matriz= new HashMap<Integer, ArrayList<Integer>>();
	@Before public void setUp(){
		ArrayList<Integer> fila1= new ArrayList<Integer>();
		fila1.add(1);fila1.add(0);fila1.add(1);fila1.add(0);fila1.add(1);
		ArrayList<Integer> fila2= new ArrayList<Integer>();
		fila2.add(0);fila2.add(1);fila2.add(0);fila2.add(0);fila2.add(0);
		ArrayList<Integer> fila3= new ArrayList<Integer>();
		fila3.add(0);fila3.add(0);fila3.add(1);fila3.add(0);fila3.add(1);
		ArrayList<Integer> fila4= new ArrayList<Integer>();
		fila4.add(0);fila4.add(0);fila4.add(0);fila4.add(1);fila4.add(0);
		ArrayList<Integer> fila5= new ArrayList<Integer>();
		fila5.add(0);fila5.add(0);fila5.add(0);fila5.add(0);fila5.add(1);
		 matriz.put(0, fila1);
		 matriz.put(1, fila2);
		 matriz.put(2, fila3);
		 matriz.put(3, fila4);
		 matriz.put(4, fila5);
	}
	
	@Test
	public void test() {
		this.comparador= new MatrizComparador(matriz);
		
		assertTrue(comparador.preordencomparador());
	}

}
