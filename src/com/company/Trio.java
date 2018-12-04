package com.company;

public class Trio implements MenuItem{
        Sandwich Sandwich;
        Salad Salad;
        Drink Drink;
        public Trio(Sandwich sandwich, Salad salad, Drink drink){
            this.Sandwich=Sandwich;
            this.Salad=Salad;
            this.Drink=Drink;
        }
        public String getName(){return sandwich.getName() +"/"+salad.getName()+"/"+ drink.getName();}
        public double getPrice() {
            return Sandwich.getPrice();
            return Salad.getPrice();
            return Drink.getPrice();
        }

        public lowestOfThree() {
            int first=Sandwich.getPrice();
            int second=Salad.getPrice();
            int third=Drink.getPrice();
            int lowestOfThree{
                if (first<second){
                    if (first<third){
                        return second,third;
                    }
                }
        }





    }
}
