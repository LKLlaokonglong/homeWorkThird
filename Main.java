package homeWorkThird;

public class Main {
    public static void main(String[] args) {
            Animal mimi = new Cat();
            mimi.setName("狸花猫");
            mimi.setAge(5);
            mimi.eat();
            mimi.sleep();
            Cat miaomiao = new Cat();
            miaomiao.setName("橘猫");
            miaomiao.eat();
            miaomiao.say();
            miaomiao.sleep();
            Dog hashiqi = new Dog();
            hashiqi.setName("二哈");
            hashiqi.sleep();
            hashiqi.say();
            System.out.println(hashiqi.run("慢跑","快跑"));
            System.out.println(hashiqi.run("躺下"));
    }
}
