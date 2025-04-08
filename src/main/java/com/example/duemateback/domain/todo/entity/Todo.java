package com.example.duemateback.domain.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;
    private LocalDate date;
    private boolean completed;
    private String category;

    private Long userId; // 지금은 고정값 사용, 이후 로그인 유저 정보로 대체
}
