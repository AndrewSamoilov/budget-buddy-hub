package com.andrewsmv.budgetbuddyhub.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long id;
    private String name;
    private String description;
    private boolean isParent;
    private List<Category> children = Collections.emptyList();
}
