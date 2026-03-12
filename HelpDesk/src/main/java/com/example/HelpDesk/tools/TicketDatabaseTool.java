package com.example.HelpDesk.tools;

import com.example.HelpDesk.entity.Ticket;
import com.example.HelpDesk.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketDatabaseTool {
    @Autowired
    private  TicketService ticketService;

    //create ticket tool
    @Tool(description = "This tool helps to create new ticket in database.")
    public Ticket createTicketTool(@ToolParam(description = "Ticket fields required to create new ticket") Ticket ticket) {
        try {
            System.out.println("going to create ticket");
            System.out.println(ticket);
            return ticketService.createTicket(ticket);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @Tool(description = "This tool helps to get ticket by email.")
    public Ticket getTicketByUserName(@ToolParam(description = " email whose ticket is required ") String username) {
        return ticketService.getTicketByEmail(username);
    }
    @Tool(description = "This tool helps to update ticket.")
    public Ticket updateTicket(@ToolParam(description = "new ticket fields required to update with ticket id.") Ticket ticket) {
        return ticketService.updateTicket(ticket);
    }
    @Tool(description = "This tool helps to get current system time.")
    public String getCurrentTime() {
        return String.valueOf(System.currentTimeMillis());
    }


}
