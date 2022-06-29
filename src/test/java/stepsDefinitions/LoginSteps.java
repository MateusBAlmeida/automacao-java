package stepsDefinitions;

import io.cucumber.java.pt.*;
import pageObjects.LoginPage;

public class LoginSteps {
	
	LoginPage lp = new LoginPage();

	@Quando("eu informar um usuario {string}")
	public void euInformarUmUsuario(String usuario) {
	    lp.informarCampoUsuario(usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
	    lp.informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
	    lp.acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
	    lp.validaErro();
	}
	
	@Entao("o sistema exibe um usuario logado")
	public void oSistemaExibeUmUsuarioLogado() {
	    lp.validaLogin();
	}
}
