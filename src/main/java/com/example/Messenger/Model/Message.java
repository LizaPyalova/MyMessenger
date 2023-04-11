package com.example.Messenger.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "Messange")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int messageId;

    @Column (name = "Text")
    private String text;

    @Column(name = "Time")
    private LocalDateTime time;

    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "senderId")
    private User Sender;

    @ManyToOne(optional = false, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "receiverId")
    private User Receiver;

    public Message() { }
    public Message(LocalDateTime t, User sender, User receiver, String s) {
        this.Receiver = receiver;
        this.Sender= sender;
        this.text = s;
        this.time = t;
    }

    public int getMessageId() {
        return messageId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getText() {
        return text;
    }

    public User getReceiverM() {
        return Receiver;
    }

    public User getSenderM() {
        return Sender;
    }

    public void setReceiverM(User receiverM) {
        Receiver = receiverM;
    }

    public void setSenderM(User senderM) {
        Sender = senderM;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
