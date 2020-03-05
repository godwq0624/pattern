package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:54
 * @description:
 */
public class UcPayInland implements IPayInland {
    @Override
    public void pay() {
        System.out.println("银联国内支付");
    }
}
