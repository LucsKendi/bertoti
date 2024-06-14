package Factory;

import java.util.Scanner;

import Ollama.OllamaChatController;

public class Main {
    public static void main(String[] args) {
        OllamaChatController chatController = new OllamaChatController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Para encerrar, digite 'sair' ");

        String userInput;
        do {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            if (!userInput.equalsIgnoreCase("sair")) {
                String response = chatController.generateResponse(userInput);
                System.out.println("AI: " + response);
            }
        } while (!userInput.equalsIgnoreCase("sair"));

        System.out.println("Obrigado pela presença!");
        scanner.close();
    }
}
