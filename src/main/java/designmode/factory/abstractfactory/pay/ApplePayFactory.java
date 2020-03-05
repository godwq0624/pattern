package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:58
 * @description:
 */
public class ApplePayFactory extends PayFactory {
    @Override
    protected IPayAbroad createPayAbroad() {
        super.init();
        return new ApplePayAbroad();
    }

    @Override
    protected IPayInland createPayInland() {
        super.init();
        return new ApplePayInland();
    }
}
