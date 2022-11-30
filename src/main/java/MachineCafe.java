public class MachineCafe {
    private int actualMoney;

    private boolean coffeeAvailable = true;
    private boolean cupAvailable = true;

    private int water = 50;

    private int numberOfCoffeesServed;
    private int moneyCollected;
    private boolean mugDetected;
    private int cupNumber = 50;

    private int coffeeNumber = 30;

    private boolean sugar = false;

    public int getCoffeeNumber() {
        return coffeeNumber;
    }

    public void setCoffeeNumber(int coffeeNumber) {
        this.coffeeNumber = coffeeNumber;
    }

    public MachineCafe(){};

    public boolean isCoffeeAvailable() {
        return coffeeAvailable;
    }

    public void setCoffeeAvailable(boolean coffeeAvailable) {
        this.coffeeAvailable = coffeeAvailable;
    }

    public boolean isCupAvailable() {
        return cupAvailable;
    }

    public void setCupAvailable(boolean cupAvailable) {
        this.cupAvailable = cupAvailable;
    }

    public int getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(int actualMoney) {
        this.actualMoney = actualMoney;
    }

    public int getNumberOfCoffeesServed() {
        return this.numberOfCoffeesServed;
    }

    public void setNumberOfCoffeesServed(int numberOfCoffeesServed) {
        this.numberOfCoffeesServed = numberOfCoffeesServed;
    }

    public int getMoneyCollected() {
        return moneyCollected;
    }

    public void setMoneyCollected(int moneyCollected) {
        this.moneyCollected = moneyCollected;
    }

    public boolean isMugDetected() {
        return mugDetected;
    }

    public void setMugDetected(boolean mugDetected) {
        this.mugDetected = mugDetected;
    }

    public int getCupNumber() {
        return cupNumber;
    }

    public void setCupNumber(int cupNumber) {
        this.cupNumber = cupNumber;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }
}
