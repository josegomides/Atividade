package atividadegit1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       int idade, opcao;
       double comprimento;
       
       Scanner sc = new Scanner (System.in);
       
       do {
           System.out.println("1 - VERIFICADOR DE IDADE PARA VOTAÇÃO");
           System.out.println("2 - CALCULADORA GEOMETRICA");
           System.out.println("3 - CONVERSOR DE TEMPERATURA");
           System.out.println("4 - CONCATENADOR DE NOME COMPLETO");
           System.out.println("5 - SAIR");
           System.out.println("ESCOLHA UMA OPCAO:   ");
           opcao = sc.nextInt();
           sc.nextLine();
           
           switch (opcao) {
               case 1:
                   System.out.println("DIGITE A SUA IDADE");
                   idade = sc.nextInt();
                   
                   VerificadorVoto oVerificador = new VerificadorVoto(idade);
                   oVerificador.podeVotar();
                break;
                
               case 2:
                   System.out.println("DIGITE O COMPRIMENTO DO LADO");
                   comprimento = sc.nextDouble();
                   
                   CalculadoraGeometria oCalcular = new CalculadoraGeometria(comprimento, comprimento);
                   oCalcular.calcularGeo();
                break;
                   
           }
           
       } while (opcao <= 5);
    }
}
