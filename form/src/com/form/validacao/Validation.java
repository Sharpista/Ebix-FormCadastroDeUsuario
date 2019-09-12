package com.form.validacao;

import java.util.ArrayList;

import com.form.entidade.Cliente;

public class Validation{
	
	
	public ArrayList<String> validacao(Cliente cliente) {
		
		ArrayList<String> erros = new ArrayList<String>();
		
		if (null == cliente.getNome() || "".equals(cliente.getNome())) {
			erros.add("O campo correntista �  obrigatorio\"");
		}
		if(cliente.getNome().matches("^[0-9]*$")) {
			erros.add("O campo de nome n�o pode conter n�meros");
		}
		if(cliente.getCpf() == null || cliente.getCpf().equals("")) {
			erros.add("O campo de CPF �  obrigatorio\"");
		}
		if(cliente.getCpf().matches("^[A-Z]*$")) {
			erros.add("O campo de CPF n�o pode conter letras");
		}
		if(cliente.getCpf().length() != 11) {
			erros.add("O CPF deve conter 11 caracteres");
		}
		if(cliente.getRg() == null || cliente.getRg().equals("")) {
			erros.add("O campo de RG �  obrigatorio");
		}
		if(cliente.getRg().length() !=9) {
			erros.add(" O RG deve conter 9 caracteres");
		}
		if(cliente.getRg().matches("^[A-Z]*$")) {
			erros.add("O campo de RG n�o pode conter letras");
		}
		if (cliente.getSexo() == null || cliente.getSexo().equals("")){
			erros.add("O campo sexo �  obrigatorio");
		}
		if (cliente.getCorrentista() == null ||cliente.getCorrentista().equals("")){
			erros.add("O campo correntista �  obrigatorio");
		}
		if (cliente.getSeguros() == null || cliente.getSeguros().equals("")){
			erros.add("O campo seguro �  obrigatorio");
		}
		if(cliente.getDiasVisita() == null || cliente.getDiasVisita().equals("")) {
			erros.add("o campo de visitas �  obrigatorio");
		}
		
		
		return erros;
	}
	
	
	
	
	
	

	
}
