import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]){
		System.out.println("Digite os tr�s lados do tri�ngulo: ");
		double ladoA = 0,ladoB = 0,ladoC = 0;
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Lado A: ");
			ladoA = sc.nextDouble();
			System.out.print("Lado B: ");
			ladoB = sc.nextDouble();
			System.out.print("Lado C: ");
			ladoC = sc.nextDouble();
			System.out.print("Os lados formam um tri�ngulo: ");
		}
		
		Triangulo triangulo = FiguraGeometricaBidimensional.criarTriangulo(ladoA, ladoB, ladoC);
		System.out.println(triangulo.getForma());
		System.out.println(triangulo);
	}
	
}
