package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Category;
import com.example.caveatemptor.models.Items;
import org.springframework.data.repository.CrudRepository;
import java.util.Set;

public interface ItemsRepository extends CrudRepository<Items,Long> {
    Items findBynameItems(String name);
    Set<Items> findBycategory(Category category);

}
