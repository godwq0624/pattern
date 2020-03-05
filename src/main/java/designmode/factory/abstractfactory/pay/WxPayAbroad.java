package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:54
 * @description:
 */
public class WxPayAbroad implements IPayAbroad {
    @Override
    public void pay() {
        System.out.println("微信国外支付");
    }
}
