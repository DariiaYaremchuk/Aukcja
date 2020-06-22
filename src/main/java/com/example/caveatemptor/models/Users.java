package com.example.caveatemptor.models;
import javax.persistence.*;
import java.util.Set;

@Entity
/*@NamedQuery(name = "Users.findByUsersName",
    query = "select u from users u where u.user_name = ?1")*/

public class Users {

    @OneToMany(mappedBy = "owner")
    private Set<BankAccount> bankAccountSet;
    @OneToMany(mappedBy = "owner")
    private Set<CreditCard> creditCardSet;

    @OneToMany(mappedBy="seller")
    private Set<Items> sellingItemsSet;
    @OneToMany(mappedBy="bidder")
    private Set<Bid> bidSet;
    @OneToMany(mappedBy="users")
    private Set<Address> addressSet;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Users_id;
    private String userName;
    private String firstName;
    private String lastName;
    public enum UserType{ SELLER, BUYER, ADMIN}
    @Enumerated(EnumType.STRING)
    private UserType userType;



    protected Users() {}

    // userName,  firstName,  lastName,  userType, addressSet,  bankAccountSet, Set<CreditCard> creditCardSet
    public Users(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }
// userName, firstName, lastName,  userType,
    public Users(String userName, String firstName, String lastName, UserType userType) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Users{" +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}






