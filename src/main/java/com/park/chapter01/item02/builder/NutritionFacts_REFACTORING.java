package com.park.chapter01.item02.builder;

import lombok.Builder;

@Builder
public class NutritionFacts_REFACTORING {
    private final int servingSize; // 필수
    private final int servings; // 필수
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFacts_REFACTORING nutritionFacts = new NutritionFacts_REFACTORINGBuilder()
                .servingSize(100)
                .servings(10)
                .build();
    }
}
