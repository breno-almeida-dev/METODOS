
/*Dentro dessa classe Metodos é criado os atributos privados que serão 
 * utilizadas nos metodos presentes dentro da classe.*/
public class Metodos {
	private int a;
	private int b;
	private int c;
	private int[] array;
	private int minInfo;
	private int fatorial;
	
	/*Um construtor vazio para criar o objeto na classe sem a necessidade de argumentos
	 * iniciais, pois será utilizado setters para informar os valores.*/
	public Metodos() {
	}	
	
	
	/*Método de calcula e informa se o número é positivo ou negativo a partir
	 * de uma condição if.*/
	private String numeroPN() {
		if (this.a<0) {
			return
					"O número " + a + " é negativo. \n";
		} else {
			return
					"O número " + a + " é positivo. \n";
		}
	}
	
	
	/*Método para calculo da média aritimética, na qual é criada uma variável media que recebe
	 * seu valor após realizar a soma dos atributos e realizar a divisão por 3.*/
	private String mediaAri() {
		int media = (this.a + this.b + this.c) / 3;
		return
				//Após o calculo retorna a mensagem com a média informada. 
				"A média aritimética de " + a +", " + b + ", " + c + " é igual a: " + media + "\n"; 	
	}
	
	
	/*Recebe os números dentro de um array e cria um int maior com o valor da primeira posição do array.
	 * Então dentro do for passa por cada posição do array e compara se o valor armazenado no int maior é realmente
	 * maior ou se é menor que o número atual sendo comparado.
	 * Caso o número de outra posição seja maior o valor é trocado no int maior. */
	private String maiorNum() {
		int maior = this.array[0]; 
        for (int i = 1; i < this.array.length; i++) {
            if (this.array[i] > maior) {
                maior = this.array[i];
            }
        }
		return
				/*Ao fim retorna a mensagem informando o número maior.*/
				"O número " + maior + " é o maior número. \n";
	}
	
	/* Utiliza a função Math.pow para elevar o valor do atributo A pelo atributo B.
    * O resultado é armazenado na variável double resultado.*/
	private String potenciaNumeros() {
		double resultado = Math.pow(this.a, this.b);
		return
				//retorna os númneros de cada variável e informa o resultado da conta.
				"O valor de " + this.a + " elevado a " + this.b + " é igual a: " + resultado + "\n";
	}
	
	/*Método calcula o tempo em minutos e tranforma em horas.
	 * O cálculo é realizado definindo dois int, um horas e outro minutos, o int horas recebe o seu valor
	 * após dividir o valor do atributo por 60, já o int minutos recebe seu valor após fazer o cálculo de módulo,
	 * na onde o restante da divisão do atributo por 60 é o seu valor.*/
	private String horario() {
		int horas = this.minInfo/60;
		int minutos = this.minInfo % 60;
		return
				minInfo + " minutos corresponde a " + horas + " horas e " + minutos + " minutos. \n";
	}
	
	/*Esse método recebe o valor do fatorial informado e armazena em um int resultado.*/
	private String fatorial() {
		int resultado = this.fatorial;
		/*Dentro desse if caso o número seja igual a 0 ou 1 já retorna dizendo que o fatorial é igual a 1.*/
		if (this.fatorial == 0 || this.fatorial == 1) {
			return
					"O fatorial do número " + fatorial + " é igual a 1. \n";					
		} else {
			/*Caso a condição do if não seja real, dentro desse else o valor do fatorial e multiplicado e armazenado
			 * junto do int resultado, multiplicando e somando ao seu valor inicial.
			 * O for passar pelo número fatorial de forma decrescente até chegar ao 1.*/
			for (int i=this.fatorial-1; i<this.fatorial && i>0; i--) {
				resultado *= i;
			}
			return
					/*Ao fim do loop for, acontece o retorno da mensagem informando o número base do cálculo
					 * e o resultado do fatorial.*/
					"O fatorial do número " + this.fatorial + " é igual a " + resultado + " \n";
		 }
	}
	
	
		//Setters para atribuir valores aos atributos da classe.
	    public void setNumeroPN(int a) {
	        this.a = a;
	    }
	
	    public void setMediaAri(int a, int b, int c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }
	
	    public void setMaiorNum(int[] array) {
	        this.array = array;
	    }
	    
	    public void setPotenciaNumeros(int a, int b) {
	    	this.a = a;
	    	this.b = b;
	    }
	    
	    
	    public void setHorario(int minInfo) {
	    	this.minInfo = minInfo;
	    }
	    
	    
	    public void setFatorial(int numFatorial) {
	    	this.fatorial = numFatorial;
	    }
	
	    
	
	    
	    //getters para serem acessados da classe Main após serem tratados em seus respectivos métodos.
		public String getNumeroPN() {
			return 
					numeroPN();
		}
		
		
		public String getMediaAri() {
			return
					mediaAri();
		}
		
		
		public String getMaiorNum() {
			return
					maiorNum();
		}
		
		public String getPotenciaNumeros() {
			return 
					potenciaNumeros();
		}
		
		public String getHorario() {
			return
					horario();
		}
		
		public String getFatorial() {
			return
					fatorial();
		}

}
