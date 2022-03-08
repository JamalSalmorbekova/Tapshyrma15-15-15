public class Danser15 extends Person15 {
    String groupName;

    public Danser15() {
    }

    public Danser15(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    public void danсing() {
        super.Learn();
        super.Walk();
        super.Eat();
        System.out.println("Biichi bilep jatat");
    }

    @Override
    public String toString() {
        return "2. Бийчи{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
