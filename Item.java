package aluguel;

public class Item {
	
	private boolean item = true;
	
	 public void disponibilidade(){
	        if(item = true){
	            System.out.println("Item disponível para reserva.");   
	        }    
	        else{
	            System.out.println("item indisponível no momento!");
	        }
	    }
	    
	    public void quantidade(){
	        System.out.println("Verificando quantidade em estoque...");
	    }
}
