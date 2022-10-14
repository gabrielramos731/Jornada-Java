package televisaoControle;

public class ControleRemoto {
	
	int volume = 5, canal;
	
	void aumentarDiminuirVolume(int a) {
		if(a == 1)
			this.volume++;
		else if(a == -1)
			this.volume--;
	}
	
	void aumentarDiminuirCanal(int a) {
		if(a == 1)
			this.canal++;
		else if(a == -1)
			this.canal--;
	}
	
	void mudarVolume(int vol) {
		this.volume = vol;
	}
	
	void mudarCanal(int canal) {
		this.canal = canal;
	}
}
