
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public String exibirPagina(String url) {
		
		return "------->>>>>>> Exibindo pagina " + url;
	}

	@Override
	public String adicionarNovaAba() {
		
		return "------->>>>>>> Nova aba adicionada no navegador web";
	}

	@Override
	public String atualizarPagina() {
	
			return "------->>>>>>> Atualizando pagina web";
	}

	@Override
	public String ligar(String numero) {
		
		return "------->>>>>>> ligando para o numero " + numero;
	}

	@Override
	public String atender() {
			
		return "------->>>>>>> Chamada atendida";
	}

	@Override
	public String iniciarCorreioVoz() {
		
		return "------->>>>>>> Reproduzindo correio de voz";
    }
	
	@Override
	public String tocarMusica() {
		return "------->>>>>>> Tocando musica";
	}

	@Override
	public String pausarMusica() {
		
		return "------->>>>>>> Musica pausada";
	}

	@Override
	public String selecionarMusica() {
		
		return "------->>>>>>> Musica selecionada";
	}

	
}
