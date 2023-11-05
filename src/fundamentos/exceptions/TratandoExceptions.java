package fundamentos.exceptions;

/*
Tratamento de Exceções:
 - As exceções mais específicas vêm primeiro...
 - Ao terminar a execução do programa, o finally NÃO é executado.
 - Em projetos reais, não se usa a classe "Throwable" e sim "Exception", desta maneira:
	    System.out.println(e.getMessage());
	    e.printStackTrace();
Desta maneira, aparecerá na tela erro ocorrido e as informações do erro (tipo, linha, etc).
 - Erro: resulta na finalização do programa;
 - Exception: possível tratar o erro e continuar a execução do programa.
 */
public class TratandoExceptions extends Exception {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominador = {2, 4, 6, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "\n" + denominador[i] + " = " + (numeros[i] / denominador[i]));
            } catch (ArithmeticException e) {
                System.out.println("Erro ao tentar dividir por zero");
                //System.exit(0);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição do array inválida");
                //System.exit(0);
            } catch (Throwable e) {//Pai das classes de erro do Java, erro mais generico possivel.
                System.out.println(e.getMessage());
                //System.exit(0);
            } finally {// Nao muito utilizado; sempre executado após os blocos try ou catch
                System.out.println("Teste");
            }
            //A partir do Java 7, tambem e possivel agrupar excecoes
            //da mesma familia de erros, utilizando o operador " | "

//			 try {
//				System.out.println(numeros[i] + "\n" + denominador[i] + " = " + (numeros[i] / denominador[i]));
//			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
//				System.out.println("Ocorreu um erro aritmetico ou de index de arrays!!");
//			}catch(Throwable e) {//Pai das classes de erro do Java, erro mais generico possivel.
//				System.out.println("Ocorreu um erro!");
//			}finally {//Nao muito utilizado; sempre executado após os blocos try/catch
//				System.out.println("Teste");
//			}

        }

    }

}