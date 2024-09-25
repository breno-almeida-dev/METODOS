public class Main {

	public static void main(String[] args) {
		
		//Determina o valor das variáveis que serão utilizadas nos cálculos.
		int a = -62;
		int b = 75;
		int c = 10; 
		
		
		Metodos metodos = new Metodos();
		
		//Utiliza os setters para enviar os valores para a classe Metodos.
		//E usa os getters para receber o resultados dos métodos da classe.
        metodos.setNumeroPN(a);
		System.out.println(metodos.getNumeroPN());
		
        metodos.setMediaAri(a, b, c);
		System.out.println(metodos.getMediaAri());
		
		
		int[] array = {a, b, c};
        metodos.setMaiorNum(array);
        System.out.println(metodos.getMaiorNum());
        
        metodos.setPotenciaNumeros(a, b);
        System.out.println(metodos.getPotenciaNumeros());       
        
        //Um int apenas para o cálculo de horas e minutos.
        int minInfo = 564;
        metodos.setHorario(minInfo);
        System.out.println(metodos.getHorario());
        
        
        //Um int apenas para o cálculo do fatorial.
        int fatorial = 5;
        metodos.setFatorial(fatorial);
        System.out.println(metodos.getFatorial());

	}

}
