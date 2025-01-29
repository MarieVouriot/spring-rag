package fr.efrei.springrag.service;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;
import org.springframework.stereotype.Service;

@AiService
public interface AssistantAiService {
    @SystemMessage(fromResource =  "/prompts/system.st")
    String chat(String userMessage);
}
