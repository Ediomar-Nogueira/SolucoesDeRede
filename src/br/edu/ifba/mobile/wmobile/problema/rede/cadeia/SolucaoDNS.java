package br.edu.ifba.mobile.wmobile.problema.rede.cadeia;

public class SolucaoDNS extends Solucoes {

	@Override
	public String resolver(TipoProblema problema) {
		if (problema == TipoProblema.ERRO_DNS){
			return "solucaodns.bsi";
		}
		
		return proximo.resolver(problema);
	}

}
