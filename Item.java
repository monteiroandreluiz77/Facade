package aluguel;

public class Item {
	
	private boolean item = true;
	
	 public void disponibilidade(){
	        if(item = true){
	            System.out.println("Item dispon�vel para reserva.");   
	        }    
	        else{
	            System.out.println("item indispon�vel no momento!");
	        }
	    }
	    
	    public void quantidade(){
	        System.out.println("Verificando quantidade em estoque...");
	    }
}
