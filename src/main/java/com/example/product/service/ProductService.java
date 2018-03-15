package com.example.product.service;


import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    Logger logger = LoggerFactory.getLogger("ProductRepository");

    public Product addProduct(Product product){
        Product p = repository.save(product);
        logger.info(" added new product:"+p.getUid());
        return p;
    }

    public List<Product> getProductsByName(String productName){
        return repository.findByProductName(productName);
    }
    public List<Product> getProductsByService(String service){
        return repository.findByServiceId(service);
    }




}
