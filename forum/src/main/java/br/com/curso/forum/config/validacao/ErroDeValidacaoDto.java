package br.com.curso.forum.config.validacao;

public class ErroDeValidacaoDto {

	private String campo;
	private String erro;
	
	public ErroDeValidacaoDto(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}

	public String getCampo() {
		return campo;
	}

	public String getErro() {
		return erro;
	}
}
