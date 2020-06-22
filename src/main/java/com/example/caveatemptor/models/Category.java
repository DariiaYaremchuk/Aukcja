package com.example.caveatemptor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Set;

@Entity
/*@NamedQuery(name = "findBynameCategory",
            query = "SELECT c FROM Category WHERE c.nameCategory = ?1") */
public class Category {
        @OneToMany(mappedBy = "category")
        private Set<Items> items;

        @ManyToOne
        @JoinColumn(name="parent_id")
        private Category parent;

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long Category_id;
        private String nameCategory;

        protected Category() {}

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }


    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nameCategory='" + nameCategory  +
                '}';
    }
}
