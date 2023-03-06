package com.kiran.resttemplate.resttemplate;

import com.kiran.resttemplate.resttemplate.modal.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;


@RestController
public class ConsumeWebService {
    @Autowired
    RestTemplate restTemplate;

    //get
    @RequestMapping(value="/template/products",method= RequestMethod.GET)
    public String getProductList(){
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Product> entity=new HttpEntity<Product>(headers);
        return restTemplate.exchange("http://localhost:8080/products", HttpMethod.GET,entity,String.class).getBody();
    }

    //add
    @RequestMapping(value="/template/products",method= RequestMethod.POST)
    public String createProducts(@RequestBody Product product){
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Product> entity=new HttpEntity<>(product,headers);
        return restTemplate.exchange("http://localhost:8080/products",HttpMethod.POST,entity,String.class).getBody();

    }

    //update
    @RequestMapping(value="/template/products/{id}",method=RequestMethod.PUT)
    public String updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Product> entity=new HttpEntity<>(product,headers);
        return restTemplate.exchange("http://localhost:8080/products/"+id,HttpMethod.PUT,entity,String.class).getBody();
    }
    //delete
    @RequestMapping(value="/template/products/{id}",method = RequestMethod.DELETE)
    public String deleteProduct(@PathVariable ("id") String id){
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Product> entity=new HttpEntity<Product>(headers);

        return restTemplate.exchange("http://localhost:8080/products/"+id,HttpMethod.DELETE,entity,String.class).getBody();

    }
}
