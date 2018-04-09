package com.spring.app.repository;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter @Setter
@ToString
@EqualsAndHashCode
public class Subject {
    @Id
    private Long id;
    @NonNull
    private String title;

    public Subject(Long id, String title){
        this.id = id;
        this.title = title;
    }
}
