public class Adapter extends Data {
		
		public void Data(int dia, int mes, int ano){
	    	super.setDia(dia);
	    	super.setMes(mes);
	    	super.setAno(ano);
	    }

		public void setDiaMes(int dia){
	        super.setDia(dia);
		}

		public void setMes(int mes){
		    super.setMes(mes);
		}

		public void setAno(int ano){
		    super.setAno(ano);
		}

		public byte getDia(){
		    return super.getDia();
		}

		public byte getMes(){
		    return super.getMes();
		}

		public short getAno(){
		    return super.getAno();
		}

		public String toString(){
		    return super.getAno() + "/" + super.getMes() + "/" + super.getDia();
		}
	}