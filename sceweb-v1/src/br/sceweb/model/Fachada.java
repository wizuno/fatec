package br.sceweb.model;


import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Fachada {
	Empresa empresa;
	
    EmpresaDAO daoEmpresa;
    Logger logger = Logger.getLogger(Fachada.class);
    public Fachada(){
     	daoEmpresa = new EmpresaDAO();
    }
	public String incluirEmpresa(String nomeDaEmpresa, String cnpj, String nomeFantasia, String endereco, String telefone, 
		   String responsavel, String telefoneResponsavel, String setor, String email) {
		
		empresa = new Empresa();
		String msg="";
		
		try {
			empresa.setNomeDaEmpresa(nomeDaEmpresa);
			empresa.setCnpj(cnpj);
			empresa.setNomeFantasia(nomeFantasia);
			empresa.setEndereco(endereco);
			empresa.setTelefone(telefone);
			empresa.setResponsavel(responsavel);
			empresa.setTelefoneResponsavel(telefoneResponsavel);
			empresa.setSetor(setor);
			empresa.setEmail(email);
			daoEmpresa.adiciona(empresa);
			msg = "cadastro realizado com sucesso";
		} catch (Exception e) {
			logger.info("erro na inclusao: "+ e.getMessage());
			logger.info("erro na inclusao causa: "+ e.getCause());
			msg =  e.getMessage();
		}
		return msg;
		
	}
	
	public int excluirEmpresa(String cnpj){
		logger.info(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>obtem parametro do cnpj para exclusao ="+ cnpj );
		return daoEmpresa.exclui(cnpj);
		
	}
	
}