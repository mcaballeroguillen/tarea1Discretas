package calvuelto;

import java.util.ArrayList;

public class Conjuntocomparador {
	protected ArrayList<Integer> subconjunto;
	protected ArrayList<Integer> conjunto;
	
	public Conjuntocomparador(){
		subconjunto=null;
		conjunto=null;
	}
	
	public void setsubconjunto(ArrayList<Integer> subconjunto){
		this.subconjunto=subconjunto;
		
	}
	
	public void setconjunto(ArrayList<Integer> conjunto){
		this.conjunto=conjunto;
	}
	
	public boolean contenido(){
		int x;
		for(x=0;x<this.subconjunto.size();x++){
			Integer elemento = this.subconjunto.get(x);
			if(this.conjunto.contains(elemento)==false){return false;}
			
		}
		return true;
	}
}
