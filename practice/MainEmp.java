import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainEmp {

	public static void main(String[] args) {
		
		PessoaCargo();

	}
	private static void PessoaCargo() {
		HashMap<Pessoa, Cargo> empresa = new HashMap<Pessoa, Cargo>();
		
		/*Scanner input = new Scanner(System.in);
		for(int i = 1; i < 7; i++) {
			
			String[] nome = new String[7];
			String[] sobrenome = new String[7];
			int[] idade = new int[7];
			
			System.out.println("Cadastro de funcionários:");
			System.out.println();
			System.out.println("Funcionário " + i);
			
			System.out.print("Nome: " );
			nome[i] = input.nextLine();
			
			System.out.print("Sobrenome: ");
			sobrenome[i] = input.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = input.nextInt();
			
			Pessoa pessoa1 = new Pessoa(nome[i], sobrenome[i], idade[i]);
			Pessoa pessoa2 = new Pessoa(nome[i], sobrenome[i], idade[i]);
			Pessoa pessoa3 = new Pessoa(nome[i], sobrenome[i], idade[i]);
			Pessoa pessoa4 = new Pessoa(nome[i], sobrenome[i], idade[i]);
			Pessoa pessoa5 = new Pessoa(nome[i], sobrenome[i], idade[i]);
			Pessoa pessoa6 = new Pessoa(nome[i], sobrenome[i], idade[i]);
		}*/
		
		Pessoa pessoa1 = new Pessoa("Nickolas", "Flamel", 23);
		Pessoa pessoa2 = new Pessoa("Lucas", "Henrique", 22);
		Pessoa pessoa3 = new Pessoa("Claudiane", "Marinho", 37);
		Pessoa pessoa4 = new Pessoa("Carla", "Santos", 28);
		Pessoa pessoa5 = new Pessoa("Matheus", "Melchiades", 25);
		Pessoa pessoa6 = new Pessoa("Alan", "Lima", 21);
		
		Cargo desenvolvedorJunior = new Cargo("Desenvolvedor Júnior", 12, 5000);
		Cargo desenvolvedorPleno = new Cargo("Desenvolvedor Pleno", 8, 8000);
		Cargo desenvolvedorSenior = new Cargo("Desenvolvedor Sênior", 6, 12000); 
		
		empresa.put(pessoa1, desenvolvedorJunior);
		empresa.put(pessoa2, desenvolvedorJunior);
		empresa.put(pessoa3, desenvolvedorPleno);
		empresa.put(pessoa4, desenvolvedorPleno);
		empresa.put(pessoa5, desenvolvedorSenior);
		empresa.put(pessoa6, desenvolvedorSenior);
		
		for(Entry<Pessoa, Cargo> emp : empresa.entrySet()) {
			Pessoa pessoa = emp.getKey();
			Cargo cargo = emp.getValue();
			System.out.println();
			System.out.println("Funcionário: " + pessoa.getNome() +" "+ pessoa.getSobrenome());
			System.out.println("Idade: " + pessoa.getIdade());
			System.out.println("Cargo: " + cargo.getCargo());
			System.out.println("Carga Horária: " + cargo.getCargaHoraria()+"h diárias");
			if(cargo.equals(desenvolvedorJunior)) {
				NumberFormat formatterDevJ = NumberFormat.getCurrencyInstance();
				String salarioDevJ = formatterDevJ.format(desenvolvedorJunior.getSalario());
				System.out.println("Salário: " + salarioDevJ);
			} 
			else if(cargo.equals(desenvolvedorPleno)) {
				NumberFormat formatterDevP = NumberFormat.getCurrencyInstance();
				String salarioDevP = formatterDevP.format(desenvolvedorPleno.getSalario());
				System.out.println("Salário: " + salarioDevP);
			}
			else {
				NumberFormat formatterDevS = NumberFormat.getCurrencyInstance();
				String salarioDevS = formatterDevS.format(desenvolvedorSenior.getSalario());
				System.out.println("Salário: " + salarioDevS);
			}
		}
	}
}
