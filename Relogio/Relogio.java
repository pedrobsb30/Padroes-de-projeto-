
public class Relogio {
private static Relogio instance;
	   
       private Data d;
	   private Hora h;
	
 public class Relogio{
	
	private static Relogio instance;
	
	private Singleton(){
		
	}
	
	public static Relogio getInstance(){
		
		if(instance == null){
			instance = new Relogio();
		}
		
		return instance;
	}
 
 }
}
