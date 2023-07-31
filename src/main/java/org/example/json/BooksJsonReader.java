package org.example.json;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BooksJsonReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        File booksJsonFile=new File("src/main/resources/books.json");
//        Book[] books= objectMapper.readValue(booksJsonFile ,Book[].class);
        List<Book> books=objectMapper.readValue(booksJsonFile,new TypeReference<List<Book>>(){});
        System.out.println(books);
    }
}
