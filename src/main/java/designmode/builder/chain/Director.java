package designmode.builder.chain;

/**
 * @Author God
 * @Date 2020/3/5 10:34
 * @description:
 */
public class Director {
    public static void main(String[] args) {
        ConcreteGfBuilder builder = new ConcreteGfBuilder();
        Personality personality = builder.addAtmosphere("大气")
                .addBeautiful("美丽")
                .addSoft("温柔")
                .build();
        System.out.println(personality);
    }
}
