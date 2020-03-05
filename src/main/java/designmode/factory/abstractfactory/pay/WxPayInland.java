package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:55
 * @description:
 */
public class WxPayInland implements IPayInland {
    @Override
    public void pay() {
        System.out.println("微信国外支付");
    }
}
