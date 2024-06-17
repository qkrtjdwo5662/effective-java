package com.park.chapter01.item02.telescopingconstructor;

public class NutritionFacts {
    private final int servingSize;  // (mL, 1회 제공량)     필수
    private final int servings;     // (회, 총 n회 제공량)  필수
    private final int calories;     // (1회 제공량당)       선택
    private final int fat;          // (g/1회 제공량)       선택
    private final int sodium;       // (mg/1회 제공량)      선택
    private final int carbohydrate; // (g/1회 제공량)       선택

    public NutritionFacts(int servingSize, int servings){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = 0;
        this.fat = 0;
        this.sodium = 0;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = 0;
        this.sodium = 0;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = 0;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = 0;
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium ,int carbohydrate){
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola =
                new NutritionFacts(10, 10);
    }

}