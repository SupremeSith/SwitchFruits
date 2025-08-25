import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("========= FRUTAS DISPONÍVEIS =========");
        System.out.println("| Banana   |");
        System.out.println("| Manga    |");
        System.out.println("| Limão    |");
        System.out.println("| Laranja  |");
        System.out.println("| Maçã     |");
        System.out.println("| Uva      |");
        System.out.println("| Melancia |");
        System.out.println("=======================================");

        //entrada do clientee
        System.out.print("\nDigite o nome da fruta desejada: ");
        String nomeProduto = s.next().toLowerCase();
        System.out.println("\nVocê escolheu: " + nomeProduto);

        //estrutura switch para exibir valores das frutas
        switch (nomeProduto) {
            case "banana":
                System.out.println("Preço: R$ 9,50");
                break;

            case "manga":
                System.out.println("Preço: R$ 12,90");
                break;

            case "limão":
                System.out.println("Preço: R$ 6,90");
                break;

            case "laranja":
                System.out.println("Preço: R$ 7,90");
                break;

            case "maçã":
                System.out.println("Preço: R$ 5,50");
                break;

            case "uva":
                System.out.println("Preço: R$ 15,00");
                break;

            case "melancia":
                System.out.println("Preço: R$ 25,00");
                break;
            default:
                System.out.println("Produto não encontrado no nosso sistema.");
                break;
        }
        s.close();
    }
}