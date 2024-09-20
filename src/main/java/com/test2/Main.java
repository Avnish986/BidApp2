package com.test2;

import com.test2.bid.Bid;
import com.test2.event.Event;
import com.test2.repository.EventsRepository;
import com.test2.repository.UserRepository;
import com.test2.service.EventsService;
import com.test2.service.UserService;
import com.test2.user.User;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        UserRepository userRepository = new UserRepository();
        EventsRepository eventsRepository = new EventsRepository(userRepository);
        EventsService eventsService = new EventsService(eventsRepository, userRepository);
        UserService userService = new UserService(userRepository);

        User u1 = userService.createUser ("Vaibhav", 1000);
        User u2 =  userService.createUser ("Shyam", 1000);
        User u3 =  userService.createUser ("Ram", 5000);
        Event e = eventsService.createEvent(LocalDate.of(2024,9,20), "Iphone");

        eventsService.addParticipant(u1, e.getId());
        eventsService.addParticipant(u2, e.getId());
        eventsService.addParticipant(u3, e.getId());

        eventsService.submitBidding(u1.getId(), e.getId(), 400);
        eventsService.submitBidding(u2.getId(), e.getId(), 100);

        eventsService.submitBidding(u3.getId(), e.getId(), 100);
        eventsService.submitBidding(u3.getId(), e.getId(), 200);
        eventsService.submitBidding(u3.getId(), e.getId(), 300);
        eventsService.submitBidding(u3.getId(), e.getId(), 400);
//        eventsService.submitBidding(u3.getId(), e.getId(), 20);
        eventsService.submitBidding(u3.getId(), e.getId(), 600);
//        eventsService.submitBidding(u3.getId(), e.getId(), 870);




//        eventsService.submitBidding(u3.getId(), e.getId(), 600);

        Bid winner = eventsService.declareWinner(e.getId());
        userService.showBalance();
        System.out.println("Winner is :"+ winner.getUser().getName()+" with bid of :"+ winner.getAmt());

//        Event e2 = eventsService.c

        eventsService.top5Events();
    }
}