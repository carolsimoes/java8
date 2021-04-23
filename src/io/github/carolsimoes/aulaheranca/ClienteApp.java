package io.github.carolsimoes.aulaheranca;

public class ClienteApp {

	public static void main (String[] Args) {
		
	ClientePF clientepj1 = new ClientePF("Carol", "endereco tal" ,"1111111111");	
	
	ClientePJ clientepj2 = new ClientePJ("Julia" , "blalbalbla endereco", "111133234/32");
	
	System.out.println("cliente pf dados:" + clientepj1.getNome() + " "+ clientepj1.getEndereco());
	
	
	}
}
