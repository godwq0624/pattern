package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:54
 * @description:
 */
public class ApplePayAbroad implements IPayAbroad {
    @Override
    public void pay() {
        System.out.println("苹果国外支付");
    }
}
