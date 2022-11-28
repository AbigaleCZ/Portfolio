package pokémonData;
public class Move {
    private String name, type;
    private int power;
    public Move(String mName, String mType, int mPower) {
        name = mName;
        type = mType;
        power = mPower;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getPower() {
        return power;
    }
}
