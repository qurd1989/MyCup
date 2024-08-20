package org.myCompany.mycup;

import org.myCompany.mycup.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCupApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyCupApplication.class, args);
        Product product = new Product();

    }

}
