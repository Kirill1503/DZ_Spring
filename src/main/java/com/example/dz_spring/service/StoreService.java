package com.example.dz_spring.service;

import com.example.dz_spring.component.Basket;
import com.example.dz_spring.model.Item;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoreService {


    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> add(List<Integer> ids) {
        return basket.add(
                ids.stream()
                .map(id -> new Item(id))
                .collect(Collectors.toList())
        );
    }

    public List<Item> get() {
        return basket.get();
    }
}
