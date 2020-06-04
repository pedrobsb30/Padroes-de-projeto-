public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;
  
public Hora(int hora,int minuto,int segundo) {
     setHora(hora);
     setMinuto(minuto);
     setSegundo(segundo);
	  
  }

public void setHora(int hora) {
	if (hora>=1 && hora<=23)
		this.hora=(byte)hora;
		else {
			throw new RuntimeException("A hora "+hora+" é  invalida");
			}		
}
public void setMinuto(int minuto) {
	if (hora>=0 && minuto<60)
		this.minuto=(byte)minuto;
		else {
			throw new RuntimeException("O minuto "+minuto+" é  invalido");
			}	
}
	public void setSegundo(int segundo) {
		if (segundo>=0 && segundo<60)
			this.segundo=(byte)segundo;
			else {
				throw new RuntimeException("O segundo "+segundo+" é  invalido");
				}	
		
		
	}

	@Override
	public String toString() {
		return this.hora + ":" + this.minuto +":"+ this.segundo;
	}
	
}