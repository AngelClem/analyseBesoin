public class Machine {

    public int actualMoney;

    private boolean coffeeAvailable = true;
    private boolean cupAvailable = true;

    public int numberOfCoffeesServed;
    public int ArgentEncaisseEnCentimes;
    public boolean mugDetected;
    public int cutNumber;

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

    public int getArgentEncaisseEnCentimes() {
        return ArgentEncaisseEnCentimes;
    }

    public void setArgentEncaisseEnCentimes(int argentEncaisseEnCentimes) {
        ArgentEncaisseEnCentimes = argentEncaisseEnCentimes;
    }

    public boolean isTasseDetectee() {
        return mugDetected;
    }

    public void setTasseDetectee(boolean tasseDetectee) {
        mugDetected = tasseDetectee;
    }

    public int getCutNumber() {
        return cutNumber;
    }

    public void setCutNumber(int cutNumber) {
        this.cutNumber = cutNumber;
    }

    public void setNumberOfCoffeesServed(int nbrCafeServis) {
        this.numberOfCoffeesServed = nbrCafeServis;
    }

    ////////////// FUNCTION / VOID ///////////////////////////////////

    public int getMonnaieActuelle() {
        return actualMoney;
    }

    public void setMonnaieActuelle(int monnaieActuelle) {
        this.actualMoney = monnaieActuelle;
    }

    public int serveCoffee() {
        this.setNumberOfCoffeesServed(this.getNumberOfCoffeesServed()+1);
        return this.getNumberOfCoffeesServed();
    }

    public void insererMonnaie(int nbrCentime) {
        setMonnaieActuelle(nbrCentime);
    }

    public int cancel() {
        int moneyToBeReturned = this.getMonnaieActuelle();
        this.setMonnaieActuelle(0);
        return moneyToBeReturned;
    }

    public void cancelCafe(){
        setNumberOfCoffeesServed(this.getNumberOfCoffeesServed()-1);
    }

    public void ViderStockCafé()
    {
        coffeeAvailable = false;
    }

    public void ViderStockGobelets()
    {
        cupAvailable = false;
    }

    public void InsérerMonnaie(int nombreDeCentimes)
    {
        if(coffeeAvailable && (cupAvailable || mugDetected))
        {
            ArgentEncaisseEnCentimes = nombreDeCentimes;
            numberOfCoffeesServed = 1;
        }
    }
}