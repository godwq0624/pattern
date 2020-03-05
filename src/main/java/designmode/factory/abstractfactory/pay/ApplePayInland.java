package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:54
 * @description:
 */
public class ApplePayInland implements IPayInland {
    @Override
    public void pay() {
        System.out.println("苹果国内支付");
    }
}
