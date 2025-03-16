package practice_5.test4;

public abstract class Pet {
    private String name;
    private String gender;

    public Pet(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public abstract void eat();
    public abstract void play();

}
