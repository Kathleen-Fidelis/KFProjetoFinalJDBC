package com.proj.servlets;

import java.lang.ref.WeakReference;

public class TesteConexao {

	public static void main(String[] args) {
		
		//Teste de conex�o
				Conexao c = new Conexao();
				c.getConnection();
				WeakReference ref = new WeakReference<Object>(c);
				c = null;
				//System.gc(); //Garbage Collector
				while(ref.get() != null) {
			       System.gc();
			       System.out.println(".");
			     }
				c = new Conexao();
				c.getConnection();

	}

}
