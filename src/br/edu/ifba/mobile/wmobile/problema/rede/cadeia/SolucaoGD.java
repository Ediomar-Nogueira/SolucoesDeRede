package br.edu.ifba.mobile.wmobile.problema.rede.cadeia;

public class SolucaoGD extends Solucoes{

	@Override
	public String resolver(TipoProblema problema) {
		if (problema == TipoProblema.GRUPO_DOMESTICO){
			return "solucaogd.bsi";
		}
		return "N�o existem solu��es cadastradas para o seu problema";
	}

}
