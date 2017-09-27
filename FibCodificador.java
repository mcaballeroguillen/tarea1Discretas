package calvuelto;

import java.util.ArrayList;

public class FibCodificador {
	private ArrayList<Integer> FibNumbers;
	private ArrayList<Integer> suma;
	private Integer number;
	public FibCodificador(Integer number){
		this.number=number;
		FibNumbers= new ArrayList<Integer> ();
		suma= new ArrayList<Integer> ();
		this.cargarFibnumber();
	}
	
	private void cargarFibnumber(){
		int x1=0;
		int x2=1;
		this.FibNumbers.add(1);
		this.FibNumbers.add(1);
		int tempFib= this.FibNumbers.get(x1)+this.FibNumbers.get(x2);
		while (tempFib<=number){
			FibNumbers.add(tempFib);
			x1=x1+1;
			x2=x2+1;
			tempFib= this.FibNumbers.get(x1)+this.FibNumbers.get(x2);
			
		}
		
	}
	
	private  Integer getFibnum(Integer n){
		int x;Integer resp=this.FibNumbers.get(this.FibNumbers.size()-1);
		
		for(x=0;x<this.FibNumbers.size();x++){
			if(this.FibNumbers.get(x)==n){resp= this.FibNumbers.get(x);break;}
			if(this.FibNumbers.get(x)>n){break;}
			resp=this.FibNumbers.get(x);
		}
		
		return resp;
	}
			
	private void cargarSum(){
		Integer fib= this.getFibnum(this.number);
		
		this.suma.add(fib);
		int cont=0;
		Integer tempnumber=this.number-fib;
		while(tempnumber>0){
			fib=this.getFibnum(tempnumber);
			this.suma.add(fib);
			tempnumber= tempnumber-fib;
			
			
			if(cont>5){break;}
			cont=cont+1;
		}
	}
	
	public String getString(){
		this.cargarSum();
		StringBuffer resp= new StringBuffer();
		int x;
		for(x=this.FibNumbers.size()-1;x>0;x--){
			if(this.suma.contains(this.FibNumbers.get(x))){resp.append('1');}else{resp.append('0');}
		}
		resp.append('0');
		System.out.println(resp.toString());
		return resp.toString();
	}
	
}
