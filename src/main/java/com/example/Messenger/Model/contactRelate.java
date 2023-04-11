package com.example.Messenger.Model;
import jakarta.persistence.*;

@Entity
@Table (name = "ContactRelate")
public class contactRelate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne(optional = false/*fetch = FetchType.EAGER*/, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contactRelateId1")
    private User one;

    @ManyToOne(optional = false/*fetch = FetchType.EAGER*/, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "contactRelateId2")
    private User two;

    contactRelate(){}



}
