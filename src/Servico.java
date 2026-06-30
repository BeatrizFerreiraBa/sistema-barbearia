package Main;

public class Servico {
	String nome;
	Double preco;
	
		
	  	public	Servico(String nome,Double preco) {
	  		this.nome=nome;
	  		this.preco=preco;
	  		
	  	}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public Double getPreco() {
			return preco;
		}


		public void setPreco(Double preco) {
			this.preco = preco;
		}
		
		public void mostrarServico() {
			System.out.println("-------------------");
			System.out.println("Serviço: "+nome);
			System.out.println("Preço: R$ "+preco);
		}
	}

