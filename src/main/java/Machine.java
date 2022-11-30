public class Machine {

    public int actualMoney;

    private boolean coffeeAvailable = true;
    private boolean cupAvailable = true;

    public int numberOfCoffeesServed;
    public int moneyCollected;
    public boolean mugDetected;
    public int cupNumber;

    public Machine() {
    }

    public int getActualMoney() {
        return actualMoney;
    }

    public void setActualMoney(int actualMoney) {
        this.actualMoney = actualMoney;
    }

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

    public int getNumberOfCoffeesServed() {
        return numberOfCoffeesServed;
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

    public void setCupNumber(int cutNumber) {
        this.cupNumber = cutNumber;
    }

    public void setNumberOfCoffeesServed(int nbrCafeServis) {
        this.numberOfCoffeesServed = nbrCafeServis;
    }

    ////////////// FUNCTION / VOID //////////////////////////////////

    public void serveCoffee() {

        if ( this.cupNumber <= 0 ) {
            //throw new Exception("There are no more cups");
        }

        this.numberOfCoffeesServed += 1;
        this.cupNumber -= 1;
        this.moneyCollected += this.actualMoney;
        this.actualMoney = 0;
    }

    public void insertMoney(int valueInCents) {
        this.moneyCollected += valueInCents;
    }

    public void cancel() {
        this.actualMoney = 0;
    }

    public void cancelCafe(){
        setNumberOfCoffeesServed(this.getNumberOfCoffeesServed()-1);
    }

    public void ViderStockCafe()
    {
        coffeeAvailable = false;
    }

    public void ViderStockGobelets()
    {
        cupAvailable = false;
    }



}
