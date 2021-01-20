package com.kkukielka.repositories;

import com.kkukielka.web.domain.Beer;
import com.kkukielka.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);
    Page<Beer> findAllByBeerName(String beerName, PageRequest pageRequest);
    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, PageRequest pageRequest);
    Optional<Beer> findBeerByUpc(String upc);
}
