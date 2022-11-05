import java.util.*;
 
 public class App {
    public static void main(String args[]) {

		   
			   Scanner input = new Scanner(System.in);
			   
			   int qtd_estacoes;
			   int comandos;
			   int estacao = 0;
			   int direcao = 0;
			   int estacao_ini = 1;
			   int cont = 0;
			   int cont_comandos = 0;
			   
			   
			   System.out.println("Digite o numero de estacoes na plantacao: ");
			   qtd_estacoes = input.nextInt();
				   
			   if(qtd_estacoes >= 2 && qtd_estacoes <= 100 ) {
				   
				   System.out.println("Digite quantos comandos devem ser executados: ");
				   comandos = input.nextInt();
				   
				   if(comandos >= 1 && comandos <= 1000) {
					   
					   System.out.println("Digite o numero da estacao mais proxima a area devastada: ");
					   estacao = input.nextInt();
					   
				   if(estacao_ini == estacao) {
							   cont++;
						   }
					   
					   while(cont_comandos < comandos) {
						   
						   cont_comandos++;
						   System.out.println("Digite se o movimento ira ser pra direita[1] ou para esquerda[-1]: ");
						   direcao = input.nextInt();
						   
						   
						   if(direcao == 1) {
							   estacao_ini++;
						   }
						   else {
							   if(direcao == -1) {
								   estacao_ini--;
							   }
						   }
						   if(estacao_ini == 0){
							   estacao_ini = qtd_estacoes;
						   }
						   if(estacao_ini > qtd_estacoes){
							   estacao_ini = 1;
						   }
						   if(estacao_ini == estacao) {
							   cont++;
						   }
						   
	   
					   }
				   }
			   }
			   System.out.println("O robo permaneceu na estação " + estacao + " : " + cont + " vezes");
		   }
		   }