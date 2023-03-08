package com.chetan.farmfresh.service;

import com.chetan.farmfresh.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {

    List<Book> products = new ArrayList<>();
    public List<Book> getBooks(){

        if(products.isEmpty()){
            Book book1 = new Book(1, "Harry Potter",
                    29, "JK Rowling", "https://m.media-amazon.com/images/I/81HteEu+D6L.jpg");
            Book book2 = new Book(1, "Game of throne",
                    35, "George R Martin", "https://i5.walmartimages.com/asr/78a40f34-d247-4d2b-978c-11531fdf1fb6_1.4c70c731f38b368b13a7dcf9d730dbe5.jpeg");

            products.add(book1);
            products.add(book2);
        }
        return products;

    }

    public List<Book> searchBooks(String authorName){
        List<Book> product = new ArrayList<>();
        for(Book book : products){
            if (authorName.equals(book.getAuthor())){
                product.add(book);
                return product;
            }
        }

        return null;
    }
}
