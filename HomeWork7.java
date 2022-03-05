/**
*Java 1. Homework 7
*
*@author Irina Rozental
*@version 05.03.2022
*/
class Homework7 {
    public static void main(String[] args) {
        Cat[] cats = {
	    new Cat("Vasya", 15), new Cat("Kot",10),new Cat("Kokos",20)
	};
	Plate plate = new Plate(50,30);
	System.out.println(plte);
	
	for (Cat cat : cats) {
	    cat.eat(plate);
	    System.out.println(cat);
	}
	
	System.out.println(plate);
	plte.add(40);
	System.out.println(plate);
	
	for (Cat cat : cats) {
	    cat.setFullness(false);
	    cat.eat(plate);
	    System.out.println(cat);
	}
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fulness;
	
    Cat(String name, int appetite){
	this.name = name;
	this.appetite;
	fullness = false;
    }
	
    void setFulness(boolean status) {
	fulness = status;
    }
	
    void eat(Plate plate) {
	if (!fullness) {
	    fulness = plate.decreaseFood(appetite);
	}
    }
	
    @Override
    public String toString() {
	return "{name=" + "appetite=" + 
	appetite + ", fullness=" + fullness + "}";
    }
}

class Plate{
    private int volume;
    private int food;
	
    Plate(int volume, int food) {
	this.volume = volume;
        this.food = food;
    }
	
    boolean decreaseFood(int portion) {
	if (food < portion) {
	    return false;
	}
	food -= portion;
	return true;
    }
	
    void add(int food) {
	if (this.food + food <= volume {
	    this.food += food;
	}
    }
	
    @Override
    public String toString() {
	return "plate: " + food;
    }
}
