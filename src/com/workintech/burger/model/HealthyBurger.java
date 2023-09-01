package com.workintech.burger.model;


public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String meat) {
        super(name, price, meat);
    }


    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name= name;
        this.healthyExtra1Price= price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name= name;
        this.healthyExtra2Price= price;
    }

    @Override
    public double itemizeHamburger() {
        String explanation= super.itemize();
        System.out.println(explanation);
        StringBuilder builder= new StringBuilder();
        if (healthyExtra1Name!= null){
            builder.append("healthyAddition1: " + healthyExtra1Name+ "\n");
        }
        if (healthyExtra2Name!= null){
            builder.append("healthyAddition2: " + healthyExtra2Name+ "\n");
        }
        double totalPrice= getPrice()+ healthyExtra1Price+healthyExtra2Price;
        builder.append("total price: " + totalPrice);
        System.out.println(builder.toString());
        return totalPrice;
    }
}
