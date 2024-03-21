package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeGenerator {
    Map<String, Map<String, Employee>> employeeMapping;

    public EmployeeGenerator(){
        this.employeeMapping = new HashMap<>();
    }

    public Employee getEmployee(String employee, String skill){
        Employee emp = switch (employee){
            case "Developer" ->{
                Map<String, Employee> employeeSkills = employeeMapping.computeIfAbsent(employee, empl -> new HashMap<>());
                if(employeeSkills.containsKey(skill)){
                    yield employeeSkills.get(skill);
                }else{
                    Developer developer = new Developer();
                    developer.setSkill(skill);
                    employeeSkills.put(skill, developer);
                    yield developer;
                }
            }

            case "Tester" -> {
                Map<String, Employee> employeeSkills = employeeMapping.computeIfAbsent(employee, empl -> new HashMap<>());
                if(employeeSkills.containsKey(skill)){
                    yield employeeSkills.get(skill);
                }else{
                    Tester tester = new Tester();
                    tester.setSkill(skill);
                    employeeSkills.put(skill, tester);
                    yield tester;
                }
            }
            default-> null;
        };
        return emp;
    }
}

