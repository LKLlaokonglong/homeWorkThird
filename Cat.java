package homeWorkThird;

public final class Cat extends Animal {
    @Override
    void eat(){
        System.out.println(this.getName() + "吃的是鱼");
    }
    @Override
        void sleep(){
        System.out.println("喜欢躺着睡");
        super.sleep();
    }
    void say(){
        System.out.println(this.getName() + "喜欢喵喵叫");
    }
}
