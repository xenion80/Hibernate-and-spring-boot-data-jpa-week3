package com.codingshuttle.jpaTutorial.Jpatuts;

import com.codingshuttle.jpaTutorial.Jpatuts.entities.ProductEntity;
import com.codingshuttle.jpaTutorial.Jpatuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpatutorialApplicationTests {

    @Autowired
    ProductRepository productRepository;

	@Test
	void contextLoads() {
	}
    @Test
    void testRepository(){


        ProductEntity productEntity= ProductEntity.builder()
                .sku("nestle234")
                .title("Nestle Chocolate")
                .quantity(12)
                .build();
        ProductEntity saproductRepository=productRepository.save(productEntity);
        System.out.println(saproductRepository);
    }



}
