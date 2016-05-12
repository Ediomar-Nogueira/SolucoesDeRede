package br.edu.ifba.mobile.wmobile.problema.rede.cadeia;

public class SolucaoSW extends Solucoes{

	@Override
	public String resolver(TipoProblema problema) {
		if (problema == TipoProblema.SEM_SINAL_WIRELESS){
			return "solucaosw.bsi";
		}
		
		return proximo.resolver(problema);
	}

}
