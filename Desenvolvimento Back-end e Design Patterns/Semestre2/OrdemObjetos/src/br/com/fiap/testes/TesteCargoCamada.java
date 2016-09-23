package br.com.fiap.testes;

import javax.swing.JOptionPane;

import br.com.fiap.bo.CargoBOList;
import br.com.fiap.dao.CargoDAOList;
import br.com.fiap.excecoes.Excecao;

public class TesteCargoCamada {

	public static void main(String[] args) throws Excecao{
		String strCargo = null, strNivel = null;
		double dblSalario = 0;
		int resp = 0;
		CargoDAOList objDAO = new CargoDAOList();
		CargoBOList objBO = new CargoBOList();
		//List<Cargo> listCargos = new Arraylist<Cargo>();
		try {
			while(resp == 0){
				strCargo = JOptionPane.showInputDialog("Digite o cargo: ");
				strNivel = JOptionPane.showInputDialog("Digite o nível: ");
				dblSalario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
				//Cargo c = new Cargo(strCargo, strNivel, dblSalario);
				//CargoDAO cDAO = new CargoDAO();
				//System.out.println(cDAO.gravar(c));
				//System.out.println(new CargoDAO().gravar(c));
				//System.out.println(new CargoDAO().gravar(strCargo, strNivel, dblSalario));
				//System.out.println(objDAO.gravar(strCargo, strNivel, dblSalario));
				objBO.incluir(strCargo, strNivel, dblSalario);
				//listCargos.add(c);
				resp = JOptionPane.showConfirmDialog(null, "Continuar?", "Camadas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
			}
			//exibe o que foi salvo na lista
			//System.out.println(objDAO.exibir());
			//String pesquisa = JOptionPane.showInputDialog("Digite o cargo para pesquisar: ");
			//objDAO.pesquisar(pesquisa);
			objBO.exibir();
			objBO.pesquisar();
			objBO.apagar(JOptionPane.showInputDialog("Digite o cargo para apagar: "));
			//objBO.exibir();
			
		}
		catch(Exception e){
			throw new Excecao("Algo deu errado!", e);
		}

	}

}
