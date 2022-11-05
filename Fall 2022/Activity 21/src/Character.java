public class Character {
    public Character() {
        partySize++;
        atk = 3;
        def = 3;
        hp = 27;
    }
    private int atk, def, hp;
    private static int partySize = 0;
    public static int getPartySize() {
        return partySize;
    }
}
