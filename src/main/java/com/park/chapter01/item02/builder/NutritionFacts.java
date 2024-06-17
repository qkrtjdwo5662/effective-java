package com.park.chapter01.item02.builder;

// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만
public class NutritionFacts {
    private final int servingSize; // 필수
    private final int servings; // 필수
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder{
        private final int servingSize;
        private final int servings;

        private int calories        = 0;
        private int fat             = 0;
        private int sodium          = 0;
        private int carbohydrate    = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }
        // op

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    public NutritionFacts(Builder builder) {
        servingSize         = builder.servingSize;
        servings            = builder.servings;
        calories            = builder.calories;
        fat                 = builder.fat;
        sodium              = builder.sodium;
        carbohydrate        = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
        // 필수 매개변수는 생성자를 만들어서 넣고
        // optional 자유롭게 넣을 수 있음
        // 최종적으로 build 호출
    }
}