package Main;

public class Cliente {
	String nome;
	String telefone;
		
	  	public Cliente(String nome,String telefone) {
	  		this.nome=nome;
	  		this.telefone=telefone;
	  		
	  	}
	  	
	  	public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public void mostrardados() {
			System.out.println("-------------------");
	  		System.out.println("Nome: "+ nome);
	  		System.out.println("Telefone: "+ telefone);
	  		
	  	}
	}


