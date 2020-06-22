package com.example.caveatemptor.models;

import javax.persistence.*;

@Entity
    public class Address {




        @ManyToOne
        @JoinColumn(name="Users_id", nullable = false)
        private Users users;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long Address_id;
        private String street;
        private String zipcode;
        private String city;
        public enum AddressType{home, billing, shipping}
        @Enumerated(EnumType.STRING)
        private AddressType addressType;


        protected Address () {}

    public Address(Users users, String street, String zipcode, String city, AddressType addressType) {
        this.users = users;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.addressType = addressType;
    }

    public Address(String street, String zipcode, String city) {
            this.street = street;
            this.zipcode = zipcode;
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public AddressType getAddressType() {
            return addressType;
        }

        public void setAddressType(AddressType addressType) {
            this.addressType = addressType;
        }
}