import java.sql.SQLOutput;

public class MachineCafeAction {
    public void getCoffee(int cts, MachineCafe m, boolean isSugarPressed){
        if(cts >= 40)
        {
            if(m.getCoffeeNumber() > 0 && (m.getCupNumber() > 0 || m.isMugDetected()) && m.getWater() > 0)
            {
                m.setNumberOfCoffeesServed(m.getNumberOfCoffeesServed() + 1);
                m.setMoneyCollected(m.getMoneyCollected() + cts);
                if(!m.isMugDetected())
                {
                    m.setCupNumber(m.getCupNumber() - 1);
                }
                if (isSugarPressed) {
                    m.setSugar(true);
                }
            } else
            {
                giveBackMoney(cts);
            }
        } else
        {
            giveBackMoney(cts);
        }

    }

    public void giveBackMoney(int cts)
    {
        System.out.println("Les " + cts + " centimes sont rendus");
    }
}
