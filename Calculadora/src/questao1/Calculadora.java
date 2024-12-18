package questao1;

public class Calculadora{
    public Calculadora(){}    
    
    public double adicao(double numero1, double numero2){
        // Retorna a soma entre os dois parâmetros
        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2){
        // Retorna a subtração entre os dois parâmetros
        return numero1 - numero2;
    }
    
    public double multiplicacao(double numero1, double numero2){
        // Retorna o produto entre os dois parâmetros
        return numero1 * numero2;
    }
    
    public double divisao(double numero1, double numero2) throws ArithmeticException {
    	// Caso o divisor seja 0, ocorre uma exceção e o método é interrompido
    	if (numero2 == 0) {
    		throw new ArithmeticException("Divisão por zero não é permitida.");
    	}
        // Retorna a divisão entre os dois parâmetros
        return numero1 / numero2;
    }
    
    public int divisaoInteira(int numero1, int numero2) throws ArithmeticException {
        // Caso o divisor seja 0, ocorre uma exceção e o método é interrompido
    	if (numero2 == 0) {
    		throw new ArithmeticException("Divisão por zero não é permitida.");
    	}
        // Retorna a divisão inteira entre os dois parâmetros
        return numero1 / numero2;
    }

    public double resto(double numero1, double numero2) throws ArithmeticException {
        // Caso o divisor seja 0, ocorre uma exceção e o método é interrompido
    	if (numero2 == 0) {
    		throw new ArithmeticException("Divisão por zero não é permitida.");
    	}
        // Retorna o resto da divisão entre os dois parâmetros
        return numero1 % numero2;
    }   
    
    public double exponenciacao(double base, double expoente){
        // Método disponível em Java para o cálculo de potências.
        return Math.pow(base, expoente);
    }  

    public int fatorial(int numero){
        // Variável que armazena o resultado
        int resultado = 1;
        // Caso o número seja negativo, retorna -1 como valor padrão
        if (numero < 0){
            return -1;
        }   // Caso o número seja positivo, calcula o fatorial dos demais valores multiplicando: n x (n-1) x (n-2) x ... x 1
        else if (numero > 0){
            for (int i = numero; i > 0; i--){
                resultado *= i;
            }
        }
        // Caso o número seja igual a 0, ele apenas retorna o valor padrão 1
        // Retorno do resultado
        return resultado;
    }

    public int arranjo(int n, int p){
        // Retorna o Arranjo simples de n termos de p em p 
        return this.fatorial(n)/this.fatorial((n-p));
    }

    public int permutacao(int n){
        // Retorna a Permutação simples de n termos
        return this.fatorial(n);
    }

    public double piso(double numero){
        // Verificar a parte decimal, se for diferente de zero, trunca o número
        if (numero % 1 != 0){
            return (int)numero;
        } else{
            return numero; // Se não houver parte decimal, o número já é inteiro, então basta retornar ele
        }
    }

    public double teto(double numero){
        // Verificar a parte decimal, se for diferente de zero, trunca o número e soma 1
        if (numero % 1 != 0){
            return (int)numero + 1;
        } else{
            return numero; // Se não houver parte decimal, o número já é inteiro, então basta retornar ele
        }
    }

    public double raizGrauN(double base, double n){
        // Raíz é uma exponenciação com expoente em forma de fração
        double grau = 1 / n; 
        return Math.pow(base, grau);
    }

    public boolean isNumeroPrimo(int numero){
        // Quantidade de divisores
        int divisores = 0;
        // Verifica quantos divisores o número possui
        for (int i = 1; i <= numero; i++){
            // Se o resto da divisão do número por i for 0, então a divisão é exata e i é um divisor dele
            if (numero % i == 0){
                // Incremento da quantidade de divisores
                divisores++;
            }
        }
        // Se tiver somente 2 divisores, o número é primo
        return divisores == 2;
    }

    public boolean isQuadradoPerfeito(int numero){
        // Calcula a raíz quadrada do número e verifica se esse valor tem parte decimal
        // Se não houver, o número é um quadrado perfeito
        return (this.raizGrauN(numero, 2) % 1) == 0;
    }
    
}