package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:54
 * @description:
 */
public class AliPayAbroad implements IPayAbroad {
    @Override
    public void pay() {
        System.out.println("支付宝国外支付");
    }
}
