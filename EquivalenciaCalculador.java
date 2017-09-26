package calvuelto;

import java.util.ArrayList;
import java.util.HashMap;

public class EquivalenciaCalculador {
	private HashMap <Integer, ArrayList<Integer>> matriz;
	private HashMap <Integer, ArrayList<Integer>> inversa;
	private InverseCalculator calinversa;
	private Puntocomparador punto1;
	private Puntocomparador punto2;
	
	public EquivalenciaCalculador(HashMap <Integer, ArrayList<Integer>> matriz){
		this.matriz=matriz;
		calinversa= new InverseCalculator(matriz);
		inversa= calinversa.getinverse();
		punto1= new Puntocomparador(matriz);
		punto2 = new  Puntocomparador(inversa);
		
	}
	
	public HashMap <Integer, ArrayList<Integer>> getClasedeEquivalencia(){
		HashMap <Integer, ArrayList<Integer>> resp = new HashMap <Integer, ArrayList<Integer>>();
		int x,y;
		for(x=0;x<matriz.size();x++){
			ArrayList<Integer> fila= new ArrayList<Integer>();
			for(y=0; y<matriz.size();y++){
				if(punto1.comparar(x, y) && punto2.comparar(x, y)){
					fila.add(1);
					}
				else{fila.add(0);}
			}
			resp.put(x, fila);
		}
		return resp;
	}
	
	
	

}
