
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		
		
		/*String[][] animais = { {"Cavalo", "Gaivota", "Gato", "Cachorro"},
							   {"Papagaio", "Tubarão", "Peixe boi", "Girafa"},
							   {"Veado", "Cervo", "Crocodilo", "Jacaré"}
				
		};
		
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(animais[i][j]);
			}
			
		}
		//////////////////////////////////////////////////////////////////////////
		/*int[] n = {3, 2, 8, 7 ,5 , 4, 7, 10};
		
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Na posição " + i + " temos o valor  " + n[i]);
		}
		
		//////////////////////////////////////////////////////////////////////////
		
		//verificação do ano bissexto
		/*Scanner input = new Scanner(System.in);
		
		String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		String[] bi =  {"31",  "29",  "31",  "30",  "31",  "30",  "31",  "31",  "30",  "31",  "30",  "31"};
		String[] tot = {"31",  "28",  "31",  "30",  "31",  "30",  "31",  "31",  "30",  "31",  "30",  "31"};
		
		System.out.println("O ano é bissexto [s/n]");
		String answer = input.next();
		
		if(answer.equals("s")) {
			for(int i = 0; i < bi.length; i++) {
				System.out.println(mes[i] + " tem " + bi[i] + " dias");
			}
		} else {
			for(int j = 0; j < tot.length; j++) {
				System.out.println(mes[j] + " tem " + tot[j] + " dias");
			}
		}
		
		//outra opção para o código acima
		/*for(int i = 0; i < mes.length; i++) {
			System.out.println(mes[i] + " tem " + 
							   tot[i] + " dias");
		}
		
		
		if(mes[1].equals("Fev") && (tot[1].equals("29"))) {
			System.out.println("Ano bissexto!");
		}
		else 
		{
			System.out.println("O ano não é bissexto!");
		}
		
		////////////////////////////////////////////////////////////////////////////////////
		//for wich (para cada) ex:
		/*int num[] = {3,5,1,8,4};

		for(int valor: num) {
			system.out.println(valor);
		}
		
		/////////////////////////////////////////////////////////////////////////////////////
		//colocando vetores em ordem utilizando a biblioteca java.util.Arrays;
		/*int v[] = {3, 2, 9, -4};
		
		Arrays.sort(v);
		
		for(int valores: v) {
			System.out.println(valores + " ");
		}*/
		
		/////////////////////////////////////////////////////////////////////////////////////
		//fazendo busca nos vetores utilizando a biblioteca java.util.Arrays;
		
	  /*int[] vet = {3, 7, 6, 1, 9, 4, 2};
		int position = Arrays.binarySearch(vet, 2);
		
		System.out.println(position);
		
		
		int num[] = new int[5];
		
		Arrays.fill(num, 0);
		
		for(int valor: num) {
			System.out.println(valor);
		}*/
		
		/*int num1 = (int) (5 + Math.random() * (10-5));
		int num2 = (int) (50 + Math.random() * (100-50));
		
		int divi = num1 / num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(divi);
		
		if(num1 < num2) {
			System.out.println("ERRO indivisível");
		}*/
		
		int[] number = {(int) (10 + Math.random() * (50-10)), 
						(int) (50 + Math.random() * (100-50)), 
						(int) (55 + Math.random() * (100-55)),
						(int) (80 + Math.random() * (200-80)), 
						(int) (20 + Math.random() * (70-20)), 
						(int) (99 + Math.random() * (150-99))
		};
		
		for(int i = 0; i < number.length; i++) {
			if(i == 0) {
				System.out.println("0 número: " + number[i]);
			}else {
				System.out.println(i+"o número: " + number[i]);
			}
			
		}
		float media = (number[0] + number[1] + number[2] + number[3] + number[4] + number[5])/6;
		System.out.println(media);
		if(media >= 70 && media < 80) {
			System.out.println("Lucas vencedor!!");
		} else if(media < 70) {
			System.out.println("Nickolas vencedor!!");
		} else if(media >= 80 && media < 85)  {
			System.out.println("EMPATE!!!!");
		}
		
		/*int[][] number = {{(int) (10 + Math.random() * (50-10)), (int) (50 + Math.random() * (100-50)), 
						   (int) (55 + Math.random() * (100-55)),(int) (80 + Math.random() * (200-80)), 
						   (int) (20 + Math.random() * (70-20)), (int) (99 + Math.random() * (150-99))
		}};
		
		for(int row = 0; row < 10; row++) {
			for(int column = 0; column < 10; column++) {
				System.out.println(number[row][column]);
			}
		}
		float mediarow = (number[0][2] + number[1][2] + number[2][2])/3;
		System.out.println(mediarow);
		float mediacolumn = (number[0][3] + number[1][3] + number[2][3])/2;
		System.out.println(mediacolumn);
		*/
		
		
		print(retDiv(retMult(retSum(retNum()))));
		
		//System.out.println(Desconto(559.5, 50));
		
		double Media = (Media(30.5,6));
		System.out.println(Media);
		
	//o primeiro número é o menor número a ser gerado, seguido do maior número subtraído por esse mesmo menor número
		int rand = (int) RandomNum(50,100);
		System.out.println("O número aleatório gerado é: " + rand);
		
		int total = 0;
		int c[] = new int[10];
		for (int i = 0; i<c.length; i++) {
			c[i] = i + i;
		}
		for (int i = 0; i<c.length; i++) {
			total += c[i];
		}
		System.out.println("TOTAL " +total);
		
	}
	
	public static int retNum() {
		return 400;
	}
	public static int retMult(int x) {
		return x * x;
	}
	public static int retDiv(int y) {
		return y / 2;
	}
	public static int retSum(int k) {
		return k + k;
	}
	public static void print(double txt) {
		System.out.println(txt);
	}

	public static String Desconto(double valor, int desconto) {
		System.out.println("Valor: R$"+valor);
		double porcentagem = desconto * valor / 100;
		double valorfinal = valor - porcentagem;
		System.out.println("Desconto: " + desconto +"%");
		return "Valor final da compra: R$"+valorfinal;
	}
	
	public static double Media(double soma, int qtd) {
		double result = soma / qtd;
		double media = result;
		return media;
	}
	
	public static double RandomNum(int x, int y) {
		return (int) ((int) x + Math.random() * (y - x));
	}
	
}
