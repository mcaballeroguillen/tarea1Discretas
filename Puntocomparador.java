package calvuelto;

import java.util.ArrayList;
import java.util.HashMap;

public class Puntocomparador {
	
	protected HashMap<Integer,ArrayList<Integer>> matris;
	
public Puntocomparador(HashMap<Integer,ArrayList<Integer>> matris){
		
		this.matris=matris;
	}

public boolean comparar(int i, int j){
	Integer resp;
	resp= matris.get(i).get(j);
	return (resp==1);
}
}