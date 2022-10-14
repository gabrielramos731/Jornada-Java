package televisaoControle;

public class Televisao {
	public static void main(String[] args) {
	
		ControleRemoto c = new ControleRemoto();
		c.mudarVolume(8);
		c.mudarCanal(20);
		System.out.println(c.volume);
		System.out.println(c.canal);
		
		c.aumentarDiminuirCanal(1);
		System.out.println(c.canal);
		
		c.aumentarDiminuirVolume(-1);
		System.out.println(c.volume);
	}
}
