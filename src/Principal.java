
public class Principal {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(82, 1.75);
		Paciente p2 = new Paciente(40, 1.59);
		Paciente p3 = new Paciente(92, 1.69);
		
		System.out.println("INFORMACOES SOBRE PACIENTES");
		System.out.println("NUMERO - IMC  - DIAGNOSTICO");
		System.out.println("  1     " + String.format("%.2f",p1.calcularIMC()) + "    " + p1.diagnostico());
		System.out.println("  2     " + String.format("%.2f",p2.calcularIMC()) + "    " + p2.diagnostico());
		System.out.println("  3     " + String.format("%.2f",p3.calcularIMC()) + "    " + p3.diagnostico());
	}
	
}
