package br.edu.ifba.mobile.wmobile.problema.rede.cadeia;

public class SolucaoPGIndisponivel extends Solucoes{

	@Override
	public String resolver(TipoProblema problema) {
		if (problema == TipoProblema.PAGINA_INDISPONIVEL)
		{
			return "solucaopgindisponivel.bsi";
		}
		return proximo.resolver(problema);
	}

}
