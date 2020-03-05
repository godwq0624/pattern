package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:58
 * @description:
 */
public class WxPayFactory extends PayFactory {
    @Override
    protected IPayAbroad createPayAbroad() {
        super.init();
        return new WxPayAbroad();
    }

    @Override
    protected IPayInland createPayInland() {
        super.init();
        return new WxPayInland();
    }
}
