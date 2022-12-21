public class Move {
    private String name, type;
    private int power;
    public Move(String mName, String mType, int mPower) {
        this.name = mName;
        this.type = mType;
        this.power = mPower;
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