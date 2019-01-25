package com.company;

public class Trio implements MenuItem{
        Sandwich sandwich;
        Salad salad;
        Drink drink;
        public Trio(Sandwich sandwich, Salad salad, Drink drink){
            this.sandwich=sandwich;
            this.salad=salad;
            this.drink=drink;
        }
        public String getName(){return sandwich.getName() +"/"+salad.getName()+"/"+ drink.getName();}
        public double getPrice(){
            double a=sandwich.getPrice()+salad.getPrice()+drink.getPrice();
            double b=0;
            if(sandwich.getPrice()<=salad.getPrice()) {
                if (salad.getPrice() <= salad.getPrice()) {
                    b = sandwich.getPrice();
                } else {
                    b = drink.getPrice();
                }
            }else{
                if(salad.getPrice()<=drink.getPrice()){
                    b=salad.getPrice();
                }else{
                    b=drink.getPrice();
                }
            }
            return a-b;
        }
}

