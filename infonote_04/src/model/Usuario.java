package model;
// import Usuario.user;
// boolean logado = false; 
class Usuario {

	int matricula;
	private String login;
	private String senha;
	private String nome;
	private String email;
	private String telefone;

	private int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
}
public void mostrarMenu() {
    System.out.println("===================================================");
	System.out.println("      infonote - Se n�o � Info n�o vendemos.       ");
	System.out.println("===================================================");
	System.out.println("1 - login");
	System.out.println("2 - Cadastrar Cliente");
	System.out.println("3 - Buscar notebook");
	System.out.println("4 - Inserir Notebook no carrinho");
	System.out.println("5 - Remover Notebook no carrinho");
	System.out.println("6 - Ver Carrinho");
	System.out.println("7 - Efetuar Comprar");
	System.out.println("8 - sair");
	
public void efetuarLogin () {
    String login, senha;
    login = Teclado.lerTexto("digite login: ");
    senha = Teclado.lerTexto("digite senha: ");
   
    if(login.equals("admin") && senha.equals("1234")) {
    System.out.println(" login efetuado com sucesso.");
    logado = true;
    } else {
    System.out.println("login ou senha inv�lido.");
    efetuarLogin();
    }
}
public void cadastrarUsuario () {
	System.out.println("===================================================");
	System.out.println("          infonote - cadastro usu�rios.            ");
}   System.out.println("===================================================");
    
    System.out.println(user);
    
public void buscarNotebook() {
    System.out.println("buscarNotebook - Em constru��o");

}
public void manterCarrinho() {
	System.out.println("manterCarrinho - Em constru��o");

public void efetuarCompra() {
	System.out.println("efetuarCompra - Em contru��o ");
}
}
