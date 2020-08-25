package aluguel;

public class SiteFacade {
	
	protected Cliente cliente;
	protected Item item;
	

	
	 public void pedido() {
		 item = new Item();
		 item.disponibilidade();
		 item.quantidade();
		 
		 cliente = new Cliente();
		 cliente.verificarCadastro();
		 cliente.verificarCompras();
	 }
	 public void finalizar(){
	       pedido();
	        System.out.println("Finalizando reserva...");
	        System.out.println("Reserva realizada! Favor devolver no prazo.");
	    }

}
