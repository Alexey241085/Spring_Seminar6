package ru.gb.Seminar06.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "notes")
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NonNull
    private String title;

    @NonNull
    @Column(name = "content")
    private String content;


    @Column(name = "data_time")
    private LocalDateTime localDateTime = LocalDateTime.now().withNano(0);

}
