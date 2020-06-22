package com.example.caveatemptor.models;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
    public abstract class BillingDetails implements Serializable {
        private static final long serialVersionUID = 1L;

        @ManyToOne
        @JoinColumn(name = "Users_id", nullable = false)
        protected Users owner;

        @Id
        @GeneratedValue (strategy = GenerationType.AUTO)
        private long BillingDetails_id;



        public Users getOwner() {
            return owner;
        }

        public void setOwner(Users owner) {
            this.owner = owner;
        }
    }

