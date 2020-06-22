package com.example.caveatemptor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


    @Entity
        public class BankAccount extends BillingDetails{
        private static final long serialVersionUID = 1L;

           // @Id
           // @GeneratedValue(strategy = GenerationType.AUTO)
            //private Long BankAccount_id;
            private String account;
            private String bankname;
            private String swift;

        protected BankAccount () {}

        public BankAccount(String account, String bankname, String swift, Users user) {
            this.account = account;
            this.bankname = bankname;
            this.swift = swift;
            this.owner = user;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getBankname() {
            return bankname;
        }

        public void setBankname(String bankname) {
            this.bankname = bankname;
        }

        public String getSwift() {
            return swift;
        }

        public void setSwift(String swift) {
            this.swift = swift;
        }
    }
