package com.example.caveatemptor.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Bid {

    @ManyToOne
    @JoinColumn(name="Items_id", nullable = false)
    private Items items;

    @ManyToOne
    @JoinColumn(name="bidder_id", nullable = false)
    private Users bidder;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Bid_id;
    private BigDecimal amount;
    private Date createdOn;


    protected Bid () {}

    public Bid(BigDecimal amount, Date createdOn) {
        this.amount = amount;
        this.createdOn = createdOn;
    }

    public Bid(BigDecimal amount, Items items, Users bidder, Date createdOn) {
        this.items = items;
        this.bidder = bidder;
        this.amount = amount;
        this.createdOn = createdOn;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
