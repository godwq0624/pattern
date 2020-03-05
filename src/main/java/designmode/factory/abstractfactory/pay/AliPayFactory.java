package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:58
 * @description:
 */
public class AliPayFactory extends PayFactory {
    @Override
    protected IPayAbroad createPayAbroad() {
        super.init();
        return new AliPayAbroad();
    }

    @Override
    protected IPayInland createPayInland() {
        super.init();
        return new AliPayInland();
    }
}
