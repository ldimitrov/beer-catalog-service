package com.ldimitrov.beercatalogservice.repository;

import com.ldimitrov.beercatalogservice.model.Beer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@RepositoryRestResource
public interface BeerRepository extends JpaRepository<Beer, Long> {
}

@Component
class BeerInitializer implements CommandLineRunner {
    private final BeerRepository beerRepository;
    BeerInitializer(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Stream.of("Augustiner", "Hacker Pschorr", "Hofbräu", "Löwenbräu", "Paulaner",
                "Spaten", "König Ludwig", "Weihenstephaner", "Giesinger", "Tegernsee")
                .forEach(beer -> beerRepository.save(new Beer(beer)));
        beerRepository.findAll().forEach(System.out::println);
    }
}