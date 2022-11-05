/* Name: Gale Sexton
Data Structures and Objects
Date: 3 Oct♠, 2022
***************************
This class creates a Move object that has fields for a move's name,
type, category, PP, power, accuracy, and description. It has methods
for setting these fields and displaying them, with a constructor that
creates the move Transform if the fields aren't specified at creation.
 */
package PackagesDemo;
public class PKMNMove {
    public PKMNMove() {
        this.name = "Transform";
        this.type = "Normal";
        this.category = "Status";
        this.PP = 10;
        this.power = 0;
        this.accuracy = 100;
        this.description = "The user transforms into a copy of its target.\nIts types become that of the target's, its final stats, except for HP, become equal to the target's,\nand its moves are replaced by the target's.\nEach move has 5 PP.";
    }
    public PKMNMove (String move, String tp, String cat, int p, int pwr, int acc, String desc) {
        this.name = move;
        this.type = tp;
        this.category = cat;
        this.PP = p;
        this.power = pwr;
        this.accuracy = acc;
        this.description = desc;
    }
    public String name, type;
    private String category, description;
    private int PP, power, accuracy;
    private void setMove(String move) {
        this.name = move;
    }
    private void setType(String tp) {
        this.type = tp;
    }
    public void setCategory(String cat) {
        this.category = cat;
    }
    public void setPP(int p) {
        this.PP = p;
    }
    public void setPower(int pwr) {
        this.power = pwr;
    }
    public void setAccuracy(int acc) {
        this.accuracy = acc;
    }
    public void setDescription(String desc) {
        this.description = desc;
    }
    private String getName() {
        return this.name;
    }
    private String getType() {
        return this.type;
    }
    public String getCategory() {
        return this.category;
    }
    public int getPP () {
        return this.PP;
    }
    public int getPower() {
        return this.power;
    }
    public int getAccuracy() {
        return this.accuracy;
    }
    public String getDescription() {
        return this.description;
    }
}
