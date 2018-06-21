package lk.dmg.cache_demo.controller;

import lk.dmg.cache_demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/ha")
public class HAEndpoint  {
    @Autowired
    ProductRepository productRepository;
    @RequestMapping(method = RequestMethod.GET, value = "allproducts")
    public String initProducts() {
        return productRepository.findAll().toString();
    }

    @RequestMapping(method = RequestMethod.GET, value = "loadAll")
    public String initEhCache() {
        return "OKAY";
    }
}
