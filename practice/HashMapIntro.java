import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapIntro {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Nickolas");
		hm.put(2, "Lucas");
		hm.put(3, "José");
		hm.put(4, "Maurício");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Empregado> emp = new HashMap<Integer, Empregado>();
		
		Empregado e1 = new Empregado("Claudiane", 37, "Esteticista");
		Empregado e2 = new Empregado("Nickolas", 23, "Desenvolvedor estagiário");
		Empregado e3 = new Empregado("Matheus", 26, "Professor");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Empregado> m : emp.entrySet()) {
			int key = m.getKey();
			Empregado e = m.getValue();
			System.out.println();
			System.out.println("Empregado " + key + " Info: ");
			
			System.out.println("Nome: " + e.nome);
			System.out.println("Idade: " + e.idade);
			System.out.println("Cargo: " + e.cargo);
		}
		
		

	}

}
