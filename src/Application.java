import models.Moeda;
import services.ConversorMoeda;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo(a) ao Conversor de Moedas =)");

        Scanner sc = new Scanner(System.in);
        int escolhaUsuario;

        while (true){
            System.out.println("\n**********************************");
            System.out.println("1) Dólar =>> Peso Argentino");
            System.out.println("2) Peso Argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real Brasileiro");
            System.out.println("4) Real Brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso Colombiano");
            System.out.println("6) Peso Colombiano =>> Dólar");
            System.out.println("7) SAIR");
            System.out.println("**********************************");
            System.out.print("\nEscolha uma opção válida: ");

            escolhaUsuario = sc.nextInt();
            if (escolhaUsuario == 7) {
                sc.close();
                System.out.println("Obrigado! Volte Sempre =)");
                break;
            }
            else if (escolhaUsuario < 1 || escolhaUsuario > 7) {
                System.out.println("Opção Inválida! Escolha um valor entre 1 e 7");
                continue;
            }

            System.out.print("Digite o valor que deseja converter: ");
            double valorParaConverter = sc.nextDouble();

            switch (escolhaUsuario) {
                case 1 -> System.out.println("ARS = " + ConversorMoeda.converter(valorParaConverter, Moeda.USD, Moeda.ARS));
                case 2 -> System.out.println("USD = " + ConversorMoeda.converter(valorParaConverter, Moeda.ARS, Moeda.USD));
                case 3 -> System.out.println("BRL = " + ConversorMoeda.converter(valorParaConverter, Moeda.USD, Moeda.BRL));
                case 4 -> System.out.println("USD = " + ConversorMoeda.converter(valorParaConverter, Moeda.BRL, Moeda.USD));
                case 5 -> System.out.println("COP = " + ConversorMoeda.converter(valorParaConverter, Moeda.USD, Moeda.COP));
                case 6 -> System.out.println("USD = " + ConversorMoeda.converter(valorParaConverter, Moeda.COP, Moeda.USD));
                default -> throw new IllegalStateException("Valor inesperado: " + escolhaUsuario);
            };
        }
    }
}