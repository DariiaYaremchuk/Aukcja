package com.example.caveatemptor.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
public class Items {

    @ManyToOne
    @JoinColumn(name = "Category_id", nullable = false)
    private Category category;

    @OneToMany(mappedBy="items")
    private Set<Image> imageSet;

    @OneToMany(mappedBy="items")
    private Set<Bid> bidSet;

    @ManyToOne
    @JoinColumn(name="seller_id", nullable = false)
    private Users seller;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Items_id;
    private String nameItems;
    private BigDecimal initialPrice;
    private Date auctionEnd;

    protected Items () {}


    public Items(Category category, String nameItems, BigDecimal initialPrice, Date auctionEnd, Users seller) {
        this.category = category;
        this.seller = seller;
        this.nameItems = nameItems;
        this.initialPrice = initialPrice;
        this.auctionEnd = auctionEnd;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    public BigDecimal getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(BigDecimal initialPrice) {
        this.initialPrice = initialPrice;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Date auclionEnd) {
        this.auctionEnd = auclionEnd;
    }

    @Override
    public String toString() {
        return "Items{" +
                "category=" + category.getNameCategory() +
                ", nameItems='" + nameItems + '\n' +
                ", initialPrice=" + initialPrice +
                ", auctionEnd=" + auctionEnd +
                '}';
    }
}
