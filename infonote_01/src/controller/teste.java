package controller;

import model.*;

public class teste {
public static void main(String[] args) {

ItemDepedido idp1 = new ItemDepedido();
	
	idp1.setQtde(2);
	idp1.setSubtotal(22.98);
	System.out.println(idp1.toString());


ItemDepedido idp2 = new ItemDepedido();

	idp2.setQtde(1);
	idp2.setSubtotal(98.75);
	System.out.println(idp2.toString());
	

Usuario usuario = new Usuario(5,"romulosouza9275","Romulo souza","romulo-souza16@hotmail.com","5","as");


Endereco endereco = new Endereco("554","20","4","grajaú","rio de janeiro","rio de janeiro","20554321");
  
  
Pedido pedido = new Pedido(2,"20/11/2018","dinheiro",20.0,"00");

  
Notebook notebook = new Notebook("X300"."não sei",5.20,"Sim",24/12/2018);

  
}
}

