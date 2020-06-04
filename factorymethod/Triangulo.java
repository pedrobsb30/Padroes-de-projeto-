public abstract class Triangulo {


		private double A;
		private double B;
		private double C;
		
		public abstract String getForma();
				

		public double getA() {
			return A;
		}

		public void setA(double A) {
			this.A = A;
		}

		public double getB() {
			return B;
		}

		public void setB(double B) {
			this.B = B;
		}

		public double getC() {
			return C;
		}

		public void setC(double C) {
			this.C = C;
		}
		
	
	@Override
	public String toString() {
		return "["+ A + ":" + B + ":" + C + "]";
	}

}