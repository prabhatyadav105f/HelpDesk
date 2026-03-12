package com.example.HelpDesk.service;

import com.example.HelpDesk.Repository.TicketRepository;
import com.example.HelpDesk.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
    @Autowired
    private  TicketRepository ticketRepository;
    //crate ticket
    public Ticket createTicket(Ticket ticket){
        ticket.setId(null);//jaki hibernate ko lage se ticket ke parr id nhi hain or vo auto gen kare
        return ticketRepository.save(ticket);
    }
    //update tickets
    public Ticket updateTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }
    public Ticket getTicket(Long ticketId){
       var ticket= ticketRepository.findById(ticketId).orElse(null);
       return ticket;
    }
    public Ticket getTicketByEmail(String username){
        return ticketRepository.findByEmail(username).orElse(null);
    }

}
