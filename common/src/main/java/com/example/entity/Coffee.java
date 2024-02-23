package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Coffee {
    @Id
    private String id;
    private String name;

    public Coffee(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

}
