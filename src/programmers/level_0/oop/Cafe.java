package programmers.level_0.oop;

enum Cafe {

    AMERICANO(5500);

    private final int price;

    private Cafe(int price) {
        this.price = price;
    }

    public int getAmericanoPrice() {
        return AMERICANO.price;
    }

}
