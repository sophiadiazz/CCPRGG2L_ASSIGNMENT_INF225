public class Pet {
    
    String name;
    Person owner;

    Pet(String petName, Person ownerName){
        this.name = petName;
        this.owner = ownerName;
    }
        void showOwnerName(){
            System.out.println("Meow~! My name is "+ this.name +" and my owner name is "+ owner.name + " (^._.^)/");

    }
}
