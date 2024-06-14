package Ollama;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

public class OllamaChatController {
    private final ChatLanguageModel model;

    public OllamaChatController() {
		String MODEL_NAME = "duckdb-nsql";
        // Inicializa o modelo
    	 String baseUrl = "http://localhost:11434/";

         // Cria modelo do chat e a config desejada
    	 this.model = OllamaChatModel.builder()
                 .baseUrl(baseUrl)
                 .modelName(MODEL_NAME)
                 .build();
    }

    public String generateResponse(String prompt) {
        // Gerar resposta com base no input do user
        return model.generate(prompt);
    }
}
