package aeroporto;

public class Data {
	
	int dia, mes, ano;
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	Data(){
		dia = 1;
		mes = 1;
		ano = 1;
	}
	
	int getDia() {
		return dia;
	}
	int getMes() {
		return mes;
	}
	int getAno() {
		return ano;
	}
}
