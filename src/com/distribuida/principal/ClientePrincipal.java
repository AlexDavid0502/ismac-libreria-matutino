package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"170123456","Juan","Taipe","Tumbaco","0987546738","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"1728556500","David","Cóndor","Yaruqui","0987972020","davidcc@correo.com");
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());

	}

}
