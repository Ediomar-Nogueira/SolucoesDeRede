package br.edu.ifba.mobile.wmobile.problema.rede.cadeia;

public class SolucaoSCR extends Solucoes{

	@Override
	public String resolver(TipoProblema problema) {
		if (problema == TipoProblema.SEM_CONEXAO_REDE){
			return "solucaoscr.bsi";
		}
		
		return proximo.resolver(problema);
	}

}
