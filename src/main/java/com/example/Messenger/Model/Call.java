package com.example.Messenger.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Calls")
public class Call {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CallId;

    @Column(name = "Date")
   private LocalDateTime CallTime;

    @ManyToOne(optional = false/*fetch = FetchType.EAGER*/, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "senderId")
    private User Sender;

   @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "receiverId")
    private User Receiver;

    public Call() { }
    public Call(LocalDateTime t, User sender, User receiver) {
        this.CallTime = t;
        this.Sender = sender;
        this.Receiver = receiver;
    }

    public int getCallId() {
        return CallId;
    }

    public LocalDateTime getCallTime() {
        return CallTime;
    }

    public void setCallTime(LocalDateTime callTime) {
        CallTime = callTime;
    }


    public User getSender() {
        return Sender;
    }
    public void setSender(User user) {
        this.Sender = user;
    }

   public User getReceiver() {
        return Receiver;
    }
    public void setReceiver(User user) {
        this.Receiver = user;
    }
}


