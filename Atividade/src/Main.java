import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean estaAtivo = true;
        String entrada;


        Scanner s = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<>();


        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Adicionar\n" +
                    "2 - Remover\n" +
                    "3 - alterar \n"+
                    "4 - listar \n"+
                    "x - finalizar o programa");

            entrada = s.nextLine();


            boolean querContinuar = true;


            switch (entrada) {
                case "1":
                    while (querContinuar) {
                        System.out.println("Escreva o nome do item que deseja adicionar");
                        entrada = s.nextLine();
                        listaProdutos.add(entrada);

                        System.out.println("O item " + entrada + " foi adicionado com sucesso! Deseja adicionar mais? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")) {
                            querContinuar = true;
                        } else {
                            querContinuar = false;
                        }
                    }
                    break;


                case "2":
                    while (querContinuar) {
                    System.out.println("Escreva o nome do item que deseja remover");
                    listaProdutos.remove(entrada = s.nextLine());


                    System.out.println("O item " + entrada + " foi removido com sucesso! Deseja remover mais? s/n");
                    entrada = s.nextLine();


                    if (entrada.equals("s")) {
                        querContinuar = true;
                    } else {
                        querContinuar = false;
                    }
                    }
                    break;

                case "3":
                    while (querContinuar) {
                        System.out.println("Escreva o nome do item que deseja alterar");
                        entrada = s.nextLine();
                        listaProdutos.remove(entrada);
                        System.out.println("Escreva o nome do item que deseja adicionar no seu lugar");
                        entrada = s.nextLine();
                        listaProdutos.add(entrada);


                        System.out.println("O item " + entrada + " foi alterado  com sucesso! Deseja alterar mais? s/n");
                        entrada = s.nextLine();


                        if (entrada.equals("s")) {
                            querContinuar = true;
                        } else {
                            querContinuar = false;
                        }
                        }
                    break;

                case "4":
                    System.out.println(listaProdutos);
                    break;


                case "x":
                    System.out.println("Finalizando o programa...");
                    estaAtivo = false;
                    break;




            }

        }
    }
}