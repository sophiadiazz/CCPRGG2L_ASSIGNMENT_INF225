public class Character {
    int strength;
    int agility;
    String agent;

    public void sayMyAgent() {
        System.out.println("Agent: " + agent);
    }
    
    public void sayMyStrength() {
        System.out.println("Strength: " + strength);
    }

    public void sayMyAgility() {
        System.out.println("Agility: " + agility);
    }

    public void sayMyName(){
        System.out.println("Sword Name: " + name);
    }

    public void attack() {
        System.out.println("I am attacking!");
    }
}
