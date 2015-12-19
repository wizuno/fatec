package br.sceweb.view;

import br.sceweb.model.Controle;

public class FormManterEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controle controle = new Controle();
		String msg="";
		try{
		msg = controle.cadastrarEmpresa("89424232000180", "empresa x", "empresa x", "av. brasil", "121212");
		msg = controle.excluirEmpresa("89424232000180");
		}catch(Exception e){
			msg = "erros no acesso a funcao cadastrarEmpresa()" + e.getMessage();
		}
		System.out.println(msg); 
		

	}

}
