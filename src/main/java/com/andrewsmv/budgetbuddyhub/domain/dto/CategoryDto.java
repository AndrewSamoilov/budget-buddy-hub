package com.andrewsmv.budgetbuddyhub.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static java.util.Collections.emptyList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private Long id;
    private LocalizationDto name;
    private boolean parent;
    private List<CategoryDto> subCategories = emptyList();
}
