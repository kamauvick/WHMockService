package com.graphqljava.tutorial.bookDetails;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String id;
    private String name;
    private int pageCount;
    private String authorId;

    public Book(String id, String name, int pageCount, String authorId) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.authorId = authorId;
    }

    private static List<Book> books = Arrays.asList(
            new Book("1", "Harry Porter", 45, "a1"),
            new Book("2", "Ikigai", 23, "a2"),
            new Book("3", "The Alchemist", 43, "a3")
    );

    public static Book getById(String id){
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getAuthorId(){
        return authorId;
    }


}
