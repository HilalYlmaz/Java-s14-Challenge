package com.workintech.burger.model;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("deluxeBurger", 20, "double");
    }


    @Override
    public void addHamburgerAddition1(String addition, double price) {
        super.addHamburgerAddition1(addition, price);
        System.out.println("bu menüye ekleme yapamazsınız");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        super.addHamburgerAddition2(addition, price);
        System.out.println("bu menüye ekleme yapamazsınız");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        super.addHamburgerAddition3(addition, price);
        System.out.println("bu menüye ekleme yapamazsınız");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        super.addHamburgerAddition4(addition, price);
        System.out.println("bu menüye ekleme yapamazsınız");
    }
}
