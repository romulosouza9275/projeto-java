package model;

public class Usuario {

int matricula;
public String login;
public String senha;
public String nome;
public String email;
public String telefone;
public int getMatricula() {
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
	this.telefone = telefone;}


// Construtor padr�o de classe.
// Objeto vazio para o momento que o usu�rio ainda n�o cadastou dados.
public Usuario() {
super();}
//super faz refer�ncia � super classe.
//Toda classe java � sub classe da classe Object.



//Construtor em atributos da Classe.Ser� utilizado para o usu�rio efetuar o cadastro.
public Usuario(int matricula,String login,String senha,String nome,String email,String telefone) {

super();
this.matricula = matricula;
this.login = login;
this.senha = senha;
this.telefone = telefone;
this.nome = nome;
}

public void mostrar() {
//mostrar usu�rio
System.out.println("\n\nUsu�rio:\n");
System.out.println("Matricula:"+ this.matricula);
System.out.println("Login:"+this.login);
System.out.println("Senha:"+this.senha);
System.out.println("nome: "+this.nome);
System.out.println("E-mail:"+this.email);
System.out.println("Telefone:"+this.telefone);

}
}
