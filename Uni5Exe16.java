/*
Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do gênero 
(gênero = 'M' ou gênero = 'm' para masculino; 
gênero = 'F' e gênero = 'f' para feminino ou 
gênero = 'O' ou gênero = 'o' para outro) 
de cada pessoa informe a média da altura das mulheres 
e a média de altura do grupo. 
A leitura deve ser finalizada ao digitar 0 para a altura.
 */

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Menu: Genero");
        System.out.println("Masculino = 'M' ou 'm'");
        System.out.println("Feminino = 'F' ou 'f'");
        System.out.println("Outro: 'O' ou 'o'");
        System.out.println("");

        System.out.print("Gênero: ");
        String genero = teclado.next();
        char letra = genero.charAt(0);
        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        double alturaF = 0, alturaMascOutros = 0, mediaFeminina, mediaTodos;
        int qtdFeminina = 0, qtdMascOutros = 0;

        while (altura != 0) {
            if (letra == 'f' || letra == 'F') {
                alturaF += altura;
                qtdFeminina++;
            }
            System.out.print("Gênero: ");
            genero = teclado.next();
            letra = genero.charAt(0);
            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            alturaMascOutros += altura;
            qtdMascOutros++;
        }

        mediaFeminina = alturaF / qtdFeminina;
        System.out.println("Média das alturas Femininas: " + mediaFeminina);
        int somaQTD = qtdFeminina + qtdMascOutros;
        mediaTodos = (alturaF + alturaMascOutros) / somaQTD;
        System.out.println("Média das alturas do grupo: " + mediaTodos);

        teclado.close();
    }
}
