
public class setsHello {

		public static void main(String[] args) {
			String mensagem = new setsHello().retornaMensagem();
			System.out.println(mensagem);
		}

		public setsHello(){
			String mensagem = retornaMensagem();
			System.out.println(mensagem);
		}

		public String retornaMensagem(){
			return ("HelloWorld");
		}
}
