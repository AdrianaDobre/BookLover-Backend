package com.bookloverbackend.bookloverbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String title;

    private String author;

    private String category;

    private String description;
}
