package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:58
 * @description:
 */
public class UcPayFactory extends PayFactory {
    @Override
    protected IPayAbroad createPayAbroad() {
        super.init();
        return new UcPayAbroad();
    }

    @Override
    protected IPayInland createPayInland() {
        super.init();
        return new UcPayInland();
    }
}
