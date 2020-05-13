package br.com.exercicios.modulo13.entidade;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.exercicios.modulo13.enums.PedidoStatus;

public class Pedido {

	private Date momento;
	private PedidoStatus pedidoStatus;
	private Cliente cliente;
	private List<ListaPedido> listaPedidos = new ArrayList<ListaPedido>();
	
	public Pedido() {}

	public Pedido(Date momento, PedidoStatus pedidoStatus, Cliente cliente) {
		this.momento = momento;
		this.pedidoStatus = pedidoStatus;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public PedidoStatus getPedidoStatus() {
		return pedidoStatus;
	}

	public void setPedidoStatus(PedidoStatus pedidoStatus) {
		this.pedidoStatus = pedidoStatus;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ListaPedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(List<ListaPedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
	public void addPedido(ListaPedido listaPedido) {
		listaPedidos.add(listaPedido);
	}
	
	public void removePedido(ListaPedido listaPedido) {
		listaPedidos.remove(listaPedido);
	}
	
	public Double getTotal() {
		double soma = 0;
		for(ListaPedido l : listaPedidos) {
			soma+=l.getSubTotal();
		}
		
		return soma;
	}

	
	
	
	
}
