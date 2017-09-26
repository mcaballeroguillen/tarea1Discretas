package calvuelto;

import java.util.ArrayList;
import java.util.HashMap;

public class InverseCalculator {
		private HashMap<Integer, ArrayList<Integer>> matriz;
		
	public InverseCalculator(HashMap<Integer, ArrayList<Integer>> matriz){
		this.matriz=matriz;
		
	}
	
	public HashMap<Integer, ArrayList<Integer>> getinverse(){
		HashMap<Integer, ArrayList<Integer>> inversa= new HashMap<Integer, ArrayList<Integer>>();
		int x,y;
		for(x=0;x<matriz.size();x++){
			ArrayList<Integer> nuevaLinea = new ArrayList<Integer>();
			for(y=0;y<matriz.size();y++){
				nuevaLinea.add(matriz.get(y).get(x));
				
			}
			inversa.put(x, nuevaLinea);
		}
		return inversa;
	}
}
