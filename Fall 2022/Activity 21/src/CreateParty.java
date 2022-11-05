public class CreateParty {
    public static void main(String[] args) {
        Character aerith = new Character();
        Character bob = new Character();
        int size1 = aerith.getPartySize();
        System.out.println("Accordint to Aerith, the party's size is " + size1 + ".");
        int size2 = bob.getPartySize();
        System.out.println("That's convenient, because Bob says the party's\nsize is " + size2 + "!");
        int size3 = Character.getPartySize();
        System.out.println("They agree! The party's size is " + size3 + "!");
    }
}
