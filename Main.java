import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int c1 =0;int c2=0;int c3=0;int c4=0;
		Scanner s = new Scanner(System.in);
		ArrayList<FormaGeometrica> formas = new ArrayList<FormaGeometrica>();

		System.out.println("Digite o numero de formas que deseja criar");
		int x = Integer.parseInt(s.nextLine());

		while (x != 0) {
			x--;
			System.out.println("Digite 1 para quadrilatero");
			System.out.println("Digite 2 para retangulo");
			System.out.println("Digite 3 para quadrado");
			System.out.println("Digite 4 para circulo");
			int t = Integer.parseInt(s.nextLine());

			
			if (t == 2) {
				System.out.println("Digite 2 tamanhos de lados");
				int u = Integer.parseInt(s.nextLine());
				int i = Integer.parseInt(s.nextLine());
				formas.add(new Retangulo(u, i));
				c2++;
			}
			if (t == 3) {
				System.out.println("Digite 1 tamanho de lado");
				int u = Integer.parseInt(s.nextLine());
				formas.add(new Quadrado(u));
				c3++;
			}
			if (t == 4) {
				System.out.println("Digite o raio");
				int u = Integer.parseInt(s.nextLine());
				formas.add(new Circulo(u));
				c4++;
			}

		}
		for(int i=0;i<formas.size();i++) {
			
				System.out.println(formas.get(i).toString());
				System.out.println("O perimetro é: "+formas.get(i).perimetro());
				System.out.println("A area é: "+formas.get(i).area());
				System.out.println();
			
		}

	}

}
