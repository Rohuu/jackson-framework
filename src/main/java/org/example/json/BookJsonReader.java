package org.example.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class BookJsonReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        File bookJsonFile= new File("src/main/resources/book.json");
        Book book=objectMapper.readValue(bookJsonFile,Book.class);
        System.out.println(book);
        System.out.println(book.getLanguage());
    }
}
