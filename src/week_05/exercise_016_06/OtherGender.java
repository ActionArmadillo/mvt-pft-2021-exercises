package week_05.exercise_016_06;

public class OtherGender extends Person{
    private static final String CLASS_NAME = "Male";

    public OtherGender(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void printClassName() {
        System.out.println("The person " + name + " belongs to class " + CLASS_NAME);
    }
}
