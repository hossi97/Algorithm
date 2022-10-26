package programmers.level_0.oop;

public enum Menu {

    LAMB("양꼬치", 12000),
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
