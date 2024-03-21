package structural.flyweight;

public class Developer implements Employee{
    private String skill;
    @Override
    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Developer has this skill: "+ skill);
    }
}
