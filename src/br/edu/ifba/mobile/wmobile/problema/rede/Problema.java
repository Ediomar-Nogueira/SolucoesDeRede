package br.edu.ifba.mobile.wmobile.problema.rede;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.mobile.wmobile.problema.rede.cadeia.SolucaoDNS;
import br.edu.ifba.mobile.wmobile.problema.rede.cadeia.SolucaoSCR;
import br.edu.ifba.mobile.wmobile.problema.rede.cadeia.SolucaoSW;
import br.edu.ifba.mobile.wmobile.problema.rede.cadeia.Solucoes;
import br.edu.ifba.mobile.wmobile.problema.rede.cadeia.TipoProblema;

@ManagedBean(name = "pro")
@SessionScoped
public class Problema {
	private String nome = "";

	private String resultado = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResultado() {
		return resultado;
	}

	public List<String> getTiposProblema() {
		List<String> tipos = new ArrayList<String>();
		tipos.add("ERRO_DNS");
		tipos.add("SEM_SINAL_WIRELESS");
		tipos.add("SEM_CONEXAO_REDE");

		return tipos;
	}

	public void setProblemaEscolhido(String tipoProblema) {

		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat formatador = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'");

		TipoProblema tipo = TipoProblema.SEM_PROBLEMA;
		if (tipoProblema.equals("ERRO_DNS")) {
			tipo = TipoProblema.ERRO_DNS;
		} else if (tipoProblema.equals("SEM_SINAL_WIRELESS")) {
			tipo = TipoProblema.SEM_SINAL_WIRELESS;
		} else if (tipoProblema.equals("SEM_CONEXAO_REDE")) {
			tipo = TipoProblema.SEM_CONEXAO_REDE;
		}

		Solucoes pro = new SolucaoDNS();
		pro.setProximaSolucao(new SolucaoSW());
		pro.setProximaSolucao(new SolucaoSCR());

		System.out.println("Aplicação utilizada por " + nome + " " + (formatador.format(calendar.getTime())));
		resultado = pro.resolver(tipo);
	}
}
