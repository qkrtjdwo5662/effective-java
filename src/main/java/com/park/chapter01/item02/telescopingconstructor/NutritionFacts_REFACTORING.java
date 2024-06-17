package com.park.chapter01.item02.telescopingconstructor;

public class NutritionFacts_REFACTORING {
    private final int servingSize;  // (mL, 1회 제공량)     필수
    private final int servings;     // (회, 총 n회 제공량)  필수
    private final int calories;     // (1회 제공량당)       선택
    private final int fat;          // (g/1회 제공량)       선택
    private final int sodium;       // (mg/1회 제공량)      선택
    private final int carbohydrate; // (g/1회 제공량)       선택


    public NutritionFacts_REFACTORING(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts_REFACTORING(int servingSize, int servings,
                                      int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts_REFACTORING(int servingSize, int servings,
                                      int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts_REFACTORING(int servingSize, int servings,
                                      int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts_REFACTORING(int servingSize, int servings,
                                      int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize  = servingSize;
        this.servings     = servings;
        this.calories     = calories;
        this.fat          = fat;
        this.sodium       = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts_REFACTORING cocaCola =
                new NutritionFacts_REFACTORING(10, 10);
        // 생성자에 어떤 파라미터를 넣어줘야 할까?
    }

}