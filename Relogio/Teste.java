public class Teste {
	public static void main(String[] args) {
		byte dia = 29;
		byte mes = 2;
		short ano = 2020;
		
		byte hora= 23;
		byte minuto= 57;
		byte segundo = 12;
		
		Hora h = new Hora(hora,minuto,segundo);
		System.out.println(h);
		
		Data d  = new Data( dia,  mes,  ano);
		System.out.println(d);
	}

}