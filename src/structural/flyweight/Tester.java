package structural.flyweight;

public class Tester  implements  Employee{
    private String skill;
    @Override
    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester has the following skill: "+skill);
    }


}
