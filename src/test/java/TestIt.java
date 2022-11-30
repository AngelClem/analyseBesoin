import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIt {


  //  public void "Quand on met 40cts ALORS un café coule"


  // Quand on met 40cts ALORS le café coule et l'argent est encaissé
  @Test
  public void testDrawCafe(){
    Machine machine = new Machine();
    machine.insertMoney(40);
    machine.serveCoffee();
  }
  // Etant donné qu'il n'y a plus de café Quand on met 40cts Alors l'argent est rendu
  @Test
  public void testEmptyCoffee() {
    Machine machine = new Machine();
    machine.setCoffeeAvailable(false);
    machine.insertMoney(40);
  }
  // Etant donné qu'il n'y a plus de gobelets Quand on met 40cts ALORS rends 40cts et pas de café
  // Etant donné qu'il n'y a plus de gobelets et qu'une tasse est détectée Quand on met 40cts ALORS le café coule
  // Etant donné que la machine n'a plus d'eau Quand on met 40cts ALORS l'argent est rendu
  // Etant donné que l'utilisateur a appuyé sur "Sucre" Quand l'utilisateur on met 40cts ALORS le café coule avec le sucre ajouté
  // Etant donné que le café n'a pas coulé et que 40cts ont été insérés Quand le client appuie sur annuler ALORS le paiement est remboursé et aucun café servi

// Trucs un peu propre
  /**
   * QUAND on met 40cts ALORS un café coule
   */
  @Test
  public void testGetCoffeeOK()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();

    action.getCoffee(40, m, false);

    assertEquals(m.getNumberOfCoffeesServed(), 1);
  }

  /**
   * ETANT DONNE qu'il n'y a plus de café QUAND on met 40cts ALORS l'argent est rendu
   */
  @Test
  public void testGiveMoneyBackNoCoffee()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();
    m.setCoffeeNumber(0);

    action.getCoffee(40, m, false);

    assertEquals(0, m.getNumberOfCoffeesServed());
  }

  /**
   * GIVEN - WHEN - Donner >40cts THEN - Café coule ET on encaisse tout l'argent
   */
  @Test
  public void testGetCoffeeAndMoney()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();

    action.getCoffee(40, m, false);

    assertEquals(m.getMoneyCollected(), 40);
    assertEquals(m.getNumberOfCoffeesServed(), 1);
    assertEquals(49, m.getCupNumber());
  }


  /**
  * ETANT DONNE qu'il n'y a plus de gobelets QUAND on met 40cts ALORS rend 40cts et pas de café
  */
  @Test
  public void testGiveMoneyBackNoCup()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();
    m.setCupNumber(0);

    action.getCoffee(40, m, false);

    assertEquals(m.getNumberOfCoffeesServed(), 0);
    assertEquals(m.getMoneyCollected(), 0);
  }

  /**
   * ETANT donne qu'il n'y a plus de gobelets ET qu'une tasse est détectée QUAND on met 40cts ALORS le café coule
   */
  @Test
  public void testGetCoffeWithMugNoCup()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();
    m.setCupNumber(0);
    m.setMugDetected(true);

    action.getCoffee(40, m, false);

    assertEquals(m.getNumberOfCoffeesServed(), 1);
    assertEquals(m.getMoneyCollected(), 40);
  }

  /**
   * ETANT donné que la machine n'a plus d'eau QUAND on met 40cts ALORS l'argent est rendu
   */
  @Test
  public void testGiveMoneyBackNoWater()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();
    m.setWater(0);

    action.getCoffee(40, m, false);

    assertEquals(m.getNumberOfCoffeesServed(), 0);
    assertEquals(m.getMoneyCollected(), 0);
  }

  /**
   * ETANT donné qu'une tasse est détectée QUAND on met 40cts ALORS le café coule ET aucun gobelet n'est consommé
   */
  @Test
  public void testGetCoffeeWhenMug()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();
    m.setMugDetected(true);

    action.getCoffee(40, m, false);

    assertEquals(50, m.getCupNumber());
    assertEquals(1, m.getNumberOfCoffeesServed());
  }

  /**
   * Etant donné que l'utilisateur a appuyé sur sucre Quand l'utilisateur met 40 cts  Alors  le café coule avec le sucre ajouté
   */
  @Test
  public void testGetSugar()
  {
    MachineCafe m = new MachineCafe();
    MachineCafeAction action = new MachineCafeAction();

    action.getCoffee(40, m, true);

    assertEquals(true, m.isSugar());
  }

}
