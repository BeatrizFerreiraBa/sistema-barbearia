package Main;

public class Agendamento {
	private String dia;
    private String horario;
    private Cliente cliente;
    private Servico  servico;

    public Agendamento(String dia, String horario, Cliente cliente,Servico servico) {
        this.dia = dia;
        this.horario = horario;
        this.cliente = cliente;
        this.servico=servico;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public Servico getServico() {
		return servico;
   
    }

    public void mostrarAgendamento() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + dia);
        System.out.println("Horário: " + horario);
        System.out.println("Serviço:"+servico.getNome());
        System.out.println("-----------------");
    }
}
