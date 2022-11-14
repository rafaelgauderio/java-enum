package application;

import java.util.Date;

import entities.Pedidos;
import entities.enums.StatusPedidos;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Enum: É um tipo especial que serve para especificar de forma literal um conjunto de contantes relacioandas.\n"
				+ "Vantagem: Possui um código mais flexível, melhor semântica e um código auxiliado pelo compilador.\n"
				+ "");
		
		Pedidos pedido = new Pedidos(1080, new Date(), StatusPedidos.AGUARDANDO_PAGAMENTO);
		
		Pedidos pedido02 = new Pedidos ();
		pedido02.setCodigo(1029);
		pedido02.setMonento(new Date() );
		pedido02.setStatus(StatusPedidos.PROCESSANDO);
		
		System.out.println(pedido);
		System.out.println(pedido02);
		
		StatusPedidos os1 = StatusPedidos.ENTREGUE;
		StatusPedidos os2 = StatusPedidos.valueOf("ENTREGUE");
		StatusPedidos os3 = StatusPedidos.AGUARDANDO_PAGAMENTO;
		StatusPedidos os4 = StatusPedidos.ENVIADO;
		StatusPedidos os5 = StatusPedidos.PROCESSANDO;
		
		System.out.println("\nValores possuveis para o tipo Enum StatusPedidos");
		System.out.println(os1);
		System.out.println(os2);
		System.out.println(os3);
		System.out.println(os4);
		System.out.println(os5);

	}

}
