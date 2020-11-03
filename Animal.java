package homeWorkThird;

public class Animal {
    private String name;
    private char sex;
    private int age;

    void eat() {
        System.out.println(this.name + "吃的是肉");
    }

    void sleep() {
        System.out.println(this.name + "喜欢站着睡");

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

}



