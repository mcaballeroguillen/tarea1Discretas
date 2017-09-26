package calvuelto;

import java.util.ArrayList;

public class Filacomparador {
 private ArrayList<Integer> fila;

 
 public Filacomparador(ArrayList<Integer> fila){
	 this.fila=fila;
	
 }
 
 
 public ArrayList<Integer> buscar(){
	 ArrayList<Integer> resp = new ArrayList<Integer>();
	 int x;
	 for(x=0;x<fila.size();x++){
		 if(fila.get(x)==1){resp.add(x);}
	 }
	 return resp;
	 }
}
