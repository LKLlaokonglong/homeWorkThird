package homeWorkThird;

public class Dog extends Animal{
 @Override
    void sleep() {
      System.out.println(this.getName() + "趴着睡");
 }
   public String run(String x) {
          return this.getName() + "喜欢" + x;
   }
   public String run(String x,String y){
          return this.getName()+ "喜欢" + x + y;
   }
   void say(){
    System.out.println(this.getName() + "汪汪叫");
   }


}


