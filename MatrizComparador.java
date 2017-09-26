package calvuelto;

import java.util.ArrayList;
import java.util.HashMap;

public class MatrizComparador {
	protected HashMap<Integer, ArrayList<Integer>> matriz;
	protected Puntocomparador punto;
	protected Filacomparador fila1,fila2;
	protected Conjuntocomparador conjunto;
	public MatrizComparador(HashMap<Integer, ArrayList<Integer>> matriz){
		this.matriz=matriz;
		punto = new Puntocomparador(matriz);
		conjunto= new Conjuntocomparador();
	}
	
	public boolean reflejacomparador(){
		int x;
		for(x=0;x<matriz.size();x++){
			if(punto.comparar(x, x)==false){return false;}
		}
		return true;
	}
	public boolean transitivecomparator(){
		int x,y;
		for(x=0;x<matriz.size();x++){
			fila1= new Filacomparador(matriz.get(x));
			ArrayList<Integer>  componentesx= fila1.buscar();
			if(componentesx.isEmpty()){continue;}
			for(y=0;y<componentesx.size();y++){
				fila2= new Filacomparador(matriz.get(componentesx.get(y)));
				ArrayList<Integer>  componentesy= fila2.buscar();
				
				conjunto.setsubconjunto(componentesy);
				conjunto.setconjunto(componentesx);
				if(conjunto.contenido()==false){return false;}
			}
			
		}
		return true;
	}
	
	public boolean preordencomparador(){
		return (this.reflejacomparador()&& this.transitivecomparator());
	}
}
