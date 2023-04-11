package com.example.Messenger.Model;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "MessengerDB")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_user;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    public User() { }
    public User(String log, String pass, String number) {
        this.login = log;
        this.password = pass;
        this.phoneNumber = number;
    }
    @OneToMany( mappedBy = "Sender", fetch = FetchType.EAGER)
    private Set<Call> callsSender;


   @OneToMany(mappedBy = "Receiver", fetch = FetchType.EAGER)
    private Set<Call> callsReceiver;

    @OneToMany( mappedBy = "Sender", fetch = FetchType.EAGER)
    private Set<Message> messagesSenderM;

    @OneToMany(mappedBy = "Receiver", fetch = FetchType.EAGER)
    private Set<Message> messagesReceiverM;


    @OneToMany(mappedBy = "one", fetch = FetchType.EAGER)
    private Set<contactRelate> oneUser;

    @OneToMany(mappedBy = "two", fetch = FetchType.EAGER)
    private Set<contactRelate> twoUser;

    public Set<contactRelate> getOneUser() {
        return oneUser;
    }

    public Set<contactRelate> getTwoUser() {
        return twoUser;
    }

    public void setOneUser(Set<contactRelate> oneUser) {
        this.oneUser = oneUser;
    }

    public void setTwoUser(Set<contactRelate> twoUser) {
        this.twoUser = twoUser;
    }

    public Set<Call> getCallsReceiver(){
        return callsReceiver;
    }
    public void setCallsReceiver(Set<Call> calls)
    {
        this.callsReceiver = calls;
    }

    public Set<Message> getMessageReceiver() {
        return messagesReceiverM;
    }

    public Set<Message> getMessageSender() {
        return messagesSenderM;
    }

    public void setMessageReceiver(Set<Message> messageReceiver) {
        this.messagesReceiverM = messageReceiver;
    }

    public void setMessageSender(Set<Message> messageSender) {
        this.messagesSenderM = messageSender;
    }

    public Set<Call> getCallsSender()
    {
        return callsSender;
    }
    public void setCallsSender(Set<Call> calls) {
        this.callsSender = calls;
    }

    public int getId_user()
    {
        return this.id_user;
    }
    public String getLogin()
    {
        return this.login;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

   public void setLogin(String log){
        this.login = log;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public void setPhoneNumber(String number){
        this.phoneNumber = number;
   }
}
