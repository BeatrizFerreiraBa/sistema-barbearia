package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	testarServico();
	testarClientes();
	menuinterativo(scan);
	
	}

	public static void menuinterativo(Scanner scan) {
	while (true) {
		
		
		System.out.println("-----------------");
		System.out.println("1- Cadastrar Cliente ");
		System.out.println("2- Listar Clientes");
		System.out.println("3- Buscar Clientes");
		System.out.println("4- Cadastrar Servicos");
		System.out.println("5- Listar Servicos");
		System.out.println("6- Agendar");
		System.out.println("7- Listar Agendamentos");
		System.out.println("0- Sair");
		System.out.println("Escolha:");
		System.out.println("-----------------");
		
		
		String opcao=scan.nextLine();
		
		switch(opcao) {
			case "1":
				cadastrarCliente(scan);break;
			case "2":
				listarCliente();break;
			case "3":
				buscarCliente(scan);break;
			case"4":
				cadastrarServico(scan);break;
			case"5":
				listarServico();break;
			case"6":
				agendamento(scan);break;
			case"7":
				mostrarAgendamento(scan);break;
			case "0":
                return;
				
 		}
	}
			
	}
	
	///----Lista Cliente
	
	static ArrayList<Cliente> clientes=new ArrayList<>();
	
	
	///----Metodo Cadastrar Cliente
	
	public static void cadastrarCliente(Scanner scan) {
		System.out.println("Digite seu nome:   ");
		String nome = scan.nextLine();
		
		
		System.out.println("Digite seu telefone:   ");
		String telefone = scan.nextLine();

		
		clientes.add(new Cliente(nome,telefone)); 
		
		System.out.println("Cliente Cadastrado com Sucesso!");
		
		
	}
	
	public static void listarCliente() {
		for (Cliente c : clientes) {
	        c.mostrardados();
		}
		
	}
	
	public static void testarClientes() {
		clientes.add(new Cliente("Maria","(11)98373892"));
	    clientes.add(new Cliente("Alice","(11)962828927"));
	    clientes.add(new Cliente("Nattan","(11)97627581"));
	    clientes.add(new Cliente("Mateus","(11)95378963"));
	    
		
	}
	
	public static void buscarCliente(Scanner scan) {
		System.out.print("Digite o nome do Cliente para Busca: ");
		String cliBusca = scan.nextLine();
		
		boolean encontrado = false;
		
		for (Cliente c : clientes) {
	        if (c.getNome().equalsIgnoreCase(cliBusca)) {
	        	System.out.println("-----------------");
	        	System.out.println("Dados do Cliente: ");
	            c.mostrardados();
	            System.out.println("-----------------"+"\n");
	   
	            
	            encontrado = true;
	        }
	    }

	    if (!encontrado) {
	        System.out.println("Cliente não encontrado!");
	    }
		
		
	
	}
	///---Lista Servico
	
	static ArrayList<Servico> servico=new ArrayList<>();
	
	public static void testarServico() {
		    servico.add(new Servico("Corte",40.00));
		    servico.add(new Servico("Escova",100.00));
		    servico.add(new Servico("Luzes",400.00));
		    servico.add(new Servico("Hidratacao",60.00));
		}
		
	
	public static void cadastrarServico(Scanner scan) {
		System.out.println("Digite o nome do serviço:   ");
		String nome = scan.nextLine();
		
		double preco = 0;
	    boolean valido = false;

	    // Loop até o usuário digitar um número válido
	    while (!valido) {
	        System.out.println("Digite o preço (somente números): ");
	        String input = scan.nextLine();

	        try {
	            preco = Double.parseDouble(input); 
	            valido = true; 
	        } catch (NumberFormatException e) {
	            System.out.println("Valor inválido! Digite apenas números, ex: 40.0");
	        }
	    }
		
		servico.add(new Servico(nome, preco)); 

	    System.out.println("Serviço cadastrado com sucesso!");
		
	}	
	
	public static void listarServico() {
		for (Servico s : servico) {
	        s.mostrarServico();
		}
	}
	
	////Agendamento
	static ArrayList<Agendamento> agendamentos=new ArrayList<>();
	

	 public static void agendamento(Scanner scan) {
		 System.out.print("Digite o nome do cliente: ");
		    String nome = scan.nextLine();

		    Cliente clienteEncontrado = null;

		    for (Cliente c : clientes) {
		        if (c.getNome().equalsIgnoreCase(nome)) {
		            clienteEncontrado = c;
		            break;
		        }
		    }

		    if (clienteEncontrado == null) {
		        System.out.println("Cliente não encontrado!");
		        return;
		    }
		    
		    System.out.print("Digite o nome do Serviço: ");
		    String nomeServico = scan.nextLine();
		    
		    Servico servicoEncontrado = null;
		    
		    for(Servico s: servico) {
		    	if(s.getNome().equalsIgnoreCase(nomeServico)) {
		    		servicoEncontrado=s;
		    		break;
		    	}
		    }
		    
		    if (servicoEncontrado == null) {
		    	    System.out.println("Serviço não encontrado!");
		    	    return;
		    }
		    

		    System.out.print("Digite a Data: ");
		    String dia = scan.nextLine();

		    System.out.print("Digite o Horário: ");
		    String horario = scan.nextLine();
		    
		    agendamentos.add(new Agendamento(dia, horario, clienteEncontrado,servicoEncontrado));

		    System.out.println("Agendamento realizado!");
		}
	 
	 public static void mostrarAgendamento(Scanner scan) {
		 System.out.print("Digite o nome do cliente: ");
		    String nome = scan.nextLine();

		    boolean encontrado = false;

		    for (Agendamento a : agendamentos) {
		        if (a.getCliente().getNome().equalsIgnoreCase(nome)) {
		            a.mostrarAgendamento();
		            encontrado = true;
		        }
		    }

		    if (!encontrado) {
		        System.out.println("Nenhum agendamento encontrado para esse cliente.");
		    }
		}
	 
	 }



