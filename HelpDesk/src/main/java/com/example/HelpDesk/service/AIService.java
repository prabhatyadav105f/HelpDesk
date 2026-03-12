package com.example.HelpDesk.service;

import com.example.HelpDesk.tools.EmailTool;
import com.example.HelpDesk.tools.TicketDatabaseTool;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.core.io.Resource;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
@Getter
@Setter
public class AIService {
    @Autowired
    private EmailTool emailTool;
    @Autowired
    private  ChatClient chatClient;
    @Autowired
    private TicketDatabaseTool ticketDatabaseTool;
    @Value("classpath:/helpDesk-system.st")
    private Resource systemPromptResource;

    public String getResponseFromAssistant(String query,String conversationId){
        return this.chatClient
                .prompt()
                 .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))
                .tools(ticketDatabaseTool,emailTool)
                .system(systemPromptResource)
                .user(query)
                .call()
                .content();
    }

    public Flux<String> streamResponseFromAssistant(String query, String conversationId) {


        return this.chatClient
                .prompt()
                .advisors(advisorSpec -> advisorSpec.param(ChatMemory.CONVERSATION_ID, conversationId))
                //tool informations
                .tools(ticketDatabaseTool, emailTool)
                .system(systemPromptResource)
                .user(query)
                .stream().content();

    }

}
