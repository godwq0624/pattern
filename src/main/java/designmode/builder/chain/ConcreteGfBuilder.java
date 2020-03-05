package designmode.builder.chain;

/**
 * @Author God
 * @Date 2020/3/5 10:29
 * @description:
 */
public class ConcreteGfBuilder{

    private Personality personality = new Personality();

    public Personality build() {
        return this.personality;
    }

    public ConcreteGfBuilder addAtmosphere(String atmosphere) {
        personality.setAtmosphere(atmosphere);
        return this;
    }

    public ConcreteGfBuilder addObstinate(String obstinate) {
        personality.setObstinate(obstinate);
        return this;
    }

    public ConcreteGfBuilder addBeautiful(String beautiful) {
        personality.setBeautiful(beautiful);
        return this;
    }

    public ConcreteGfBuilder addShowing(String showing) {
        personality.setShowing(showing);
        return this;
    }

    public ConcreteGfBuilder addSoft(String soft) {
        personality.setSoft(soft);
        return this;
    }

}
