package model;

import lombok.*;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;
    private Author author;
    private String genre;
    private double price;
    private int count;
    private User registeredUser;

}
