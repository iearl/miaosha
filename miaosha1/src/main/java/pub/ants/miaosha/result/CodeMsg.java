package pub.ants.miaosha.result;

import lombok.Getter;

/**
 * @author magw
 * @version 1.0
 * @date 2020/1/2 上午12:20
 * @description: No Description
 */
@Getter
public class CodeMsg {
    private int code;
    private String msg;

    public static CodeMsg SUCCESS = new CodeMsg(200,"success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500,"服务端异常");

    private CodeMsg(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
