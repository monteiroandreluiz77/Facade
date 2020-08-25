package aluguel;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fazendo a reserva de seu item...");   
        SiteFacade facade = new SiteFacade();
        facade.pedido();

	}

}
