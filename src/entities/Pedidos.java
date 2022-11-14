package entities;

import java.util.Date;

import entities.enums.StatusPedidos;

public class Pedidos {
	
	private Integer codigo;
	private Date monento;
	private StatusPedidos status;
	
	//construtores
	public Pedidos() {
		
	}
	
	public Pedidos(Integer codigo, Date monento, StatusPedidos status) {
		super();
		this.codigo = codigo;
		this.monento = monento;
		this.status = status;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getMonento() {
		return monento;
	}

	public void setMonento(Date monento) {
		this.monento = monento;
	}

	public StatusPedidos getStatus() {
		return status;
	}

	public void setStatus(StatusPedidos status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedidos [codigo=" + codigo + ", monento=" + monento + ", status=" + status + "]";
	}

}
