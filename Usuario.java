package pessoal;
import java.util.ArrayList;
import financeiro.Divida;

public class Usuario {
	private ArrayList<Divida> dividas = new ArrayList<Divida>();;
	private int cpf;
	private String nome;
	
	public Usuario(){}
	
	public ArrayList<Divida> getDividas() {
		return dividas;
	}
	public void setDividas(ArrayList<Divida> dividas) {
		this.dividas = dividas;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addDivida(Divida divida){
		this.dividas.add(divida);
	}
	
	public String getDivida(){
		String lista_dividas = "Lista de dividas\n";
		for(int i=0; i<this.dividas.size(); i++){
			lista_dividas += this.dividas.get(i).getConta()+"\n";
	}
		return lista_dividas;
	}

	

}
