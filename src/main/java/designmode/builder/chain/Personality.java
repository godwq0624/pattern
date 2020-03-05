package designmode.builder.chain;

import lombok.Data;

/**
 * @Author God
 * @Date 2020/3/5 10:22
 * @description:女朋友的性格
 * 根据每个人的爱好不同，构建不同的女朋友的性格，但是结果一样，还是你的女朋友
 */
@Data
public class Personality {
    /*漂亮 */
    private String  beautiful ;
    /*温柔 */
    private String  soft;
    /*刁蛮 */
    private String  obstinate;
    /*大气 */
    private String  atmosphere;
    /*撒娇 */
    private String  showing;

}
