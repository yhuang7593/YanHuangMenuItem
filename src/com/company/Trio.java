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
                double priceSandwich = this.sandwich.getPrice();
                double priceSalad = this.salad.getPrice();
                double priceDrink = this.drink.getPrice();
                double price = 0;

                if ((priceSandwich <= priceSalad) && (priceSandwich <= priceDrink)) {
                    price =  priceSalad + priceDrink;
                } else if ((priceSalad <= priceSandwich) && (priceSalad <= priceDrink)) {
                    price = priceSandwich + priceDrink;
                } else if ((priceDrink <= priceSalad) && (priceDrink <= priceSandwich)) {
                    price = priceSalad + priceSandwich;
                }
                return price;
            }
}

