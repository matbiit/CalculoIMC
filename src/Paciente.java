
public class Paciente {

	private double peso;
	private double altura;
	
	public Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularIMC(){
		return getPeso()/(getAltura()*getAltura());
	}
	
	public String diagnostico(){
		double imc = calcularIMC();
		String resultado = "";
		if(imc < 16){
			resultado = "Baixo peso muito grave";
		} else if((imc >= 16) && (imc < 17)){
			resultado = "Baixo peso grave";
		} else if((imc >= 17) && (imc < 18.50)){
			resultado = "Baixo peso";
		} else if((imc >= 18.50) && (imc < 25)){
			resultado = "Peso normal";
		} else if((imc >= 25) && (imc < 30)){
			resultado = "Sobrepeso";
		} else if((imc >= 30) && (imc < 35)){
			resultado = "Obesidade grau I";
		} else if((imc >= 35) && (imc < 40)){
			resultado = "Obesidade grau II";
		} else {
			resultado = "Obesidade grau III (obesidade mórbida)";
		}
		return resultado;
	}
	
}
