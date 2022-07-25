import java.util.Scanner;

public class PasswordG {
	
	public static int RandomLength(String compr) {
		return (int) (compr.length() * Math.random());
	}
	public static String CharIndex(String atrb, int rand) {
		return String.valueOf(atrb.charAt(rand));
	}

	public static void main(String[] args) {
		
		
		String num = "1234567890";
		String upper = "ABCDEFGHIJLMNOPQRSTUVXYKZ";
		String lower = "abcdefghijlmnopqrstuvxykz";
		String symbols = "!@#$%&*(){}[]";
		String password = "";
		
		String name = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		name = input.nextLine();
		System.out.println("Qual comprimento você deseja para a sua senha?");
		int digit = input.nextInt();
		
		for(int i = 0; i < digit; i++) {
			int rand = (int) (5 * Math.random());
			
			switch(rand) {
				case 0:
					password += String.valueOf((int) (0 * Math.random()));
					break;
				case 1:
					rand = RandomLength(num);
					password += CharIndex(num, rand);	
					break;
				case 2:
					rand = (int) (upper.length() * Math.random());
					password += String.valueOf(upper.charAt(rand));		
					break;
				case 3:
					rand = (int) (lower.length() * Math.random());
					password += String.valueOf(lower.charAt(rand));					
					break;
				case 4:
					rand = (int) (symbols.length() * Math.random());
					password += String.valueOf(symbols.charAt(rand));
					
			}
		
		}
		System.out.println("Sua senha é: " + name + password);
		input.close();
		
	}

}
