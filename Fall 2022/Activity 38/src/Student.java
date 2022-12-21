public class Student {
    public Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }
    private String name, major;
    private int id;
    public void setName(String n) {
        name = n;
    }
    public void setMajor(String m) {
        major = m;
    }
    public void setID(int i) {
        id = i;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public int getID() {
        return id;
    }
}