package com.api.aruba.controller;

import com.api.aruba.arangodb.repository.TestArango;
import com.api.aruba.graphql.test.Author;
import com.api.aruba.graphql.test.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private TestArango testArango;

    @QueryMapping
    public Book bookById(@Argument String id) {
        try {
            testArango.test();
        } catch (Exception e) {
            System.out.println(e.getCause().toString());
            throw new RuntimeException(e);
        }
        return Book.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }
}
