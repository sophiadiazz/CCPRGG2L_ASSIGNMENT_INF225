public class App {
    public static void main(String[] args) throws Exception {
        
        Person Friend = new Person ("Luna" , 18);
        Myself Me = new Myself ("Sophia" , 18);
        Pet Cat = new Pet ("Cheshire", Friend);
        Car Toyota = new Car ("Toyota - Innova", Me);

        Me.addFriend(Friend);
        Cat.showOwnerName();
        Toyota.showKeeperName();
    }
}
