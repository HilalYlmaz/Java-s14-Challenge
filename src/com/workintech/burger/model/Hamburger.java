package com.workintech.burger.model;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price,String meat ) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = "NORMAL";
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
    public void addHamburgerAddition1(String addition, double addition1Price){
        this.addition1Name= addition;
        this.addition1Price= addition1Price;
    }
    public void addHamburgerAddition2(String addition, double addition2Price){
        this.addition2Name= addition;
        this.addition2Price= addition2Price;
    }
    public void addHamburgerAddition3(String addition, double addition3Price){
        this.addition3Name= addition;
        this.addition3Price= addition3Price;
    }
    public void addHamburgerAddition4(String addition, double addition4Price){
        this.addition4Name= addition;
        this.addition4Price= addition4Price;
    }

    public String itemize(){
        StringBuilder builder= new StringBuilder();
        builder.append("name: " + name+ "\n");
        builder.append("meat: " + meat+ "\n");
        builder.append("breadRollType: " + breadRollType+ "\n");
        if (addition1Name!= null){
            builder.append("addition1: " + addition1Name + "\n");
            price= price+ addition1Price;
        }
        if (addition2Name!= null){
            builder.append("addition2: " + addition2Name + "\n");
            price= price+ addition2Price;
        }
        if (addition3Name!= null){
            builder.append("addition3: " + addition3Name+ "\n");
            price= price+ addition3Price;
        }
        if (addition4Name!= null){
            builder.append("addition4: " + addition4Name+ "\n");
            price= price+ addition4Price;
        }
        return builder.toString();
    }
    public double itemizeHamburger(){
        String addMetod= itemize();
        System.out.println(addMetod);
        System.out.println("price: " + getPrice());
        return getPrice();
    }
}
