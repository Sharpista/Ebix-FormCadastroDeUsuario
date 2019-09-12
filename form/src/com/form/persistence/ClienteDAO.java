package com.form.persistence;

import com.form.entidade.Cliente;

public class ClienteDAO extends Dao{
	
	public void criar(Cliente cliente) throws Exception {
		
		try {

			abrir();
			stm = ondeline.prepareStatement("INSERT INTO clientes (nome, cpf, rg, sexo, correntista, seguro, visitas)values(?,?,?,?,?,?,?)");
			stm.setString(1, cliente.getNome());
			stm.setString(2, cliente.getCpf());
			stm.setString(3, cliente.getRg());
			stm.setString(4, cliente.getSexo());
			stm.setString(5, cliente.getCorrentista());
			StringBuffer buffer = new StringBuffer();
			StringBuffer buffer2 = new StringBuffer();
			for (String seguro : cliente.getSeguros()) {
				buffer.append(seguro);
				buffer.append(",");
			}
			for (String visitas : cliente.getDiasVisita()) {
				buffer2.append(visitas);
				buffer2.append(",");
			}
			stm.setNString(6,buffer2.toString());
			stm.setNString(7,buffer.toString());
			stm.execute();
			fechar();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
//	public static void main(String[] args) {
//		Cliente cliente = new Cliente("Naruto", "1522220714", "274201474", "feminino", "cu", "sim", "segunda");
//		ClienteDAO dao = new ClienteDAO();
//		try {
//			dao.criar(cliente);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

}
