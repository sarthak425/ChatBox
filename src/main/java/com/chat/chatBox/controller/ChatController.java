package com.chat.chatBox.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public String handleMessage(String rawJson) {
        System.out.println("Received: " + rawJson); // raw JSON from frontend
        return rawJson;
    }

    @GetMapping("/")
    public String loadChatPage() {
        return "chat"; // loads chat.html
    }
}
