package calvuelto;

import java.util.ArrayList;

public class vueltoCalculador {
 ArrayList<Integer> monedas; 
 
 public vueltoCalculador(ArrayList<Integer> monedas){
	 this();
	 this.monedas= monedas;
	 	 
 }

public vueltoCalculador() {
	this.monedas= new ArrayList<Integer>();
	
}

public void setMonedas(ArrayList<Integer> Monedas){
	this.monedas= Monedas;
	
}

public ArrayList<Integer> vuelto(Integer cantidad){
	ArrayList<Integer> resp = new ArrayList<Integer>();
	int j= this.monedas.size()-1;
	int x;
	for(x=0;x<j;x++){
		resp.add(0);
		
	}
	Integer tcantidad= cantidad;
	int contador=0;
	while(tcantidad>0){
		
		if((tcantidad-this.monedas.get(j))>=0){
			contador= contador+1;
			tcantidad=tcantidad-this.monedas.get(j);
		}
		if((tcantidad-this.monedas.get(j))<0)
		{
			resp.add(j, contador);
			j=j-1;
			contador=0;
		}
		
	}
	return resp;
} 
}
