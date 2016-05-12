package br.edu.ifba.mobile.wmobile.problema.rede.cadeia;

public abstract class Solucoes {

	protected Solucoes proximo = null;

	public void setProximaSolucao(Solucoes proximo) {

		if (this.proximo != null) {
			this.proximo.setProximaSolucao(proximo);
		} else {
			this.proximo = proximo;
		}
	}
	public abstract String resolver(TipoProblema problema);
}
