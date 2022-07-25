
public class Cargo {
	
	private String cargo;
	private int cargaHoraria;
	private int salario;
	
	Cargo(String cargo, int cargaHoraria, int salario) {
		this.cargo = cargo;
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
}
