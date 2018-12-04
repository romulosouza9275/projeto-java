package controller;
import model.ItemDepedido;
import model.Notebook;
import model.Pedido;
import model.Usuario;
import util.Teclado;
public class InfoNote Notebook;

	Usuario user;

	boolean logado = false;

public void mostrarMenu() {
 System.out.println("================================================================================");
 System.out.println("                    InfoNote - Se n�o � Info n�o Vendemos                       ");
 System.out.println("================================================================================");
 System.out.println("1 - Login");
 System.out.println("2 - Cadastrar Cliente");
 System.out.println("3 - Buscar Notebook");
 System.out.println("4 - Inserir Notebook no Carrinho");
 System.out.println("5 - Remover Notebook no Carrinho");
 System.out.println("6 - Ver Carrinho");
 System.out.println("7 - Efetuar Compra");
 System.out.println("8 - Sair");
}

public void efetuarLogin() {

 String login;
String senha;
 login = Teclado.LerTexto("Digite o Login : ");
 senha = Teclado.LerTexto("Digite a Senha : ");
 if (login.equals("admin") && senha.equals("1234")) {
  System.out.println("Login Efetuado com Sucesso !");
  login = true;
 } else {
  System.out.println("Login ou Senha Inv�lido!");
  efetuarLogin();

 }
}

public void cadastrarUsuario() {

 System.out.println("================================================================================");
 System.out.println("                    InfoNote - Cadastro de Usuarios                ");
 System.out.println("================================================================================");
 matricula = Teclado.int("Matricula : ");
 String login = Teclado.LerTexto("Login : ");
 String senha = Teclado.LerTexto("Senha : ");
 String nome = Teclado.LerTexto("Nome : ");
 String email = Teclado.LerTexto("Email : ");
 String telefone = Teclado.LerTexto("Telefone : ");

 System.out.println("================================================================================");
 System.out.println("     Usuario Cadastrado com Sucesso!                ");
 System.out.println("================================================================================");

 System.out.println(user);
}

@SuppressWarnings("unlikely-arg-type")
public void inserirNotebook() {
}{
 
 String numeroNote = Teclado.LerTexto("Informe o n�mero do notebook" + "para compra:");

 Object pedido;

 if (pedido == null) {
  pedido = new Pedido;
 }

 Notebook aux = null;
 Notebook[] notebooks;
for (int i = 0; i < notebooks.length; i++) {
  if (notebooks[i] != null && numeroNote.equals(((Object) notebooks[i]).getNumeroNote())); {
   aux = notebooks[i];
  }
  
  if (aux == null) {
   return;
  }
 
  ItemDepedido item = new ItemDepedido(1, aux, aux.getPrecoUnitario)

  
  ((Object) pedido).inserirItem(item);
 }
}

public abstract void buscarNotebook();{
	
 System.out.println(" buscarNotebook - Em Constru��o");
}

public void manterCarrinho() {
}{
 System.out.println(" manterCarrinho - Em Constru��o");
}

public void efetuarCompra() {
}{
 System.out.println(" efetuarCompra - Em Constru��o");
 
}

public InfoNote(Usuario user, boolean logado) {
	super();
	this.user = user;
	this.logado = logado;
}

}
