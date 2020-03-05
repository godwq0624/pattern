package designmode.factory.abstractfactory.pay;

/**
 * @Author God
 * @Date 2020/2/26 11:50
 * @description: 把国内支付和国外支付看成两个产品等级（种类）
 */
public abstract class PayFactory {
    public void init(){
        System.out.println("初始化基础数据");
    }

    /**
     * 国外支付
     * @return
     */
    protected abstract IPayAbroad createPayAbroad();

    /**
     * 国内支付
     * @return
     */
    protected abstract IPayInland createPayInland();
}
