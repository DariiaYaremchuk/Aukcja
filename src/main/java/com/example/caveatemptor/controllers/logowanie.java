package com.example.caveatemptor.controllers;

import com.example.caveatemptor.models.Bid;
import com.example.caveatemptor.models.Category;
import com.example.caveatemptor.models.Items;
import com.example.caveatemptor.models.Users;
import com.example.caveatemptor.repositories.BidRepository;
import com.example.caveatemptor.repositories.CategoryRepository;
import com.example.caveatemptor.repositories.ItemsRepository;
import com.example.caveatemptor.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Map;
import java.util.Optional;

@Controller
public class logowanie
{
    @Autowired
    private ItemsRepository itemsRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private BidRepository bidRepository;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping()
    public String indeks(){
        return "indeks";
    }

    @GetMapping("/indeks")
    public String home(){
        return "indeks";
    }

    @GetMapping("/obrazy2")
    public String ShowAllPictures(Map<String, Object> model) {
        Category category = categoryRepository.findBynameCategory("Obrazy");
        Iterable<Items> items = itemsRepository.findBycategory(category);
        model.put("items", items);
        return "obrazy2";
    }

    @GetMapping("/book")
    public String ShowAllBook(Map<String, Object> model) {
        Category category = categoryRepository.findBynameCategory("Książki");
        Iterable<Items> items = itemsRepository.findBycategory(category);
        model.put("items", items);
        return "book";
    }

    @PostMapping("/obrazy2")
    public String setBid(@RequestParam(name="nameItems", required = true) String nameItems,
                         @RequestParam(name="bidStawka", required = true) String bidStawka,
                         Map<String, Object> model)

    {
        BigDecimal bigDecimalbidStawka = new BigDecimal(bidStawka);
        Items items = itemsRepository.findBynameItems(nameItems);
        Users user = usersRepository.findByuserName("Olka");
        bidRepository.save(new Bid(bigDecimalbidStawka, items, user, Date.valueOf("2020-06-12") ));
        model.put("bidStawka", bidStawka);
        model.put("nameItems", items.getNameItems());

        return "stawkaOK";
    }

    @PostMapping("/book")
    public String setBidForBook(@RequestParam(name="nameItems", required = true) String nameItems,
                         @RequestParam(name="bidStawka", required = true) String bidStawka,
                         Map<String, Object> model)

    {
        BigDecimal bigDecimalbidStawka = new BigDecimal(bidStawka);
        Items items = itemsRepository.findBynameItems(nameItems);
        Users user = usersRepository.findByuserName("Olka");
        bidRepository.save(new Bid(bigDecimalbidStawka, items, user, Date.valueOf("2020-06-24") ));
        model.put("bidStawka", bidStawka);
        model.put("nameItems", items.getNameItems());

        return "stawkaOK";
    }


}