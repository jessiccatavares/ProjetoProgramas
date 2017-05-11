# ProjetoProgramas

package financeiro;
import java.util.ArrayList;
public class Divida {
		private String mes;
		private ArrayList<Conta> contas = new ArrayList<Conta>();

		public Divida() {}
		
		public String getMes() {
		return mes;
		}
		public void setMes(String mes) {
		this.mes = mes;
		}
		
		public float getValorTotal(){
			float total = 0;
			for(int i = 0; i < contas.size(); i++){
		            total += this.contas.get(i).getValor();
		    }
		       return total;

		    }

		public ArrayList<Conta> getContas() {
			return contas;
		}
		public void setContas(ArrayList<Conta> contas) {
			this.contas = contas;
		}
		
		public void addConta(Conta conta){
			this.contas.add(conta);
		}
		
		public String getConta(){
			String lista_contas = "";
			for(int i=0; i<this.contas.size(); i++){
				lista_contas += "Código: "+this.contas.get(i).getCodigo()+"\n"
								+"Tipo: "+this.contas.get(i).getTipo()+"\n"
								+"Valor: "+this.contas.get(i).getValor()+"\n\n";
								
		}
			return lista_contas;
		}
		






}
