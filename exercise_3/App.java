public class App {
    public static void main(String[] args) {

        Character mage = new Character();

        mage.strength = 10;
        mage.agility = 5;
        mage.agent = "Neon";
        mage.sayMyAgent();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyName();
        mage.attack();
        
        Weapon Sword = new Weapon();

        Sword.name = "Taco";
        Sword.damage = 100;
        Sword.rarity = "Common";
        Sword.AddDamage(20);
        
        System.out.print(Sword.showNameandRarity());

    }
}
    
