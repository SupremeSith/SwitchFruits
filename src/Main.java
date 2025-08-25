import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Digite o nome do produto");
        Scanner s = new Scanner((System.in));

        String nomeProduto = s.next();
        System.out.println(nomeProduto);

        switch (nomeProduto) {
            case "banana":
                System.out.println("R$9,50");
                break;

            case "manga":
                System.out.println("R$12,90");

            case "limão":
                System.out.println("R$6,90");

            case "laranja":
                System.out.println("R$7,90");
        }

    }

}