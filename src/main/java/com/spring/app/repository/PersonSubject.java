package com.spring.app.repository;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class PersonSubject {
    @Id
    private Long id;

    private Long userId;
    private Long subjectId;

    public PersonSubject(Long id, Long userId, Long subjectId){
        this.id = id;
        this.userId = userId;
        this.subjectId = subjectId;
    }
}
