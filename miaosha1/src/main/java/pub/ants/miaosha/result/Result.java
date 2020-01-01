package pub.ants.miaosha.result;

import lombok.Getter;

/**
 * @author magw
 * @version 1.0
 * @date 2020/1/2 上午12:27
 * @description: No Description
 */
@Getter
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    private Result (T data){
        this.code=0;
        this.msg="success";
        this.data = data;
    }
    private Result (CodeMsg codeMsg){
        if(codeMsg ==null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    //成功跳用
    public static <T>Result<T> success(T data){
        return new Result<>(data);
    }
    //失败时调用
    public static <T>Result<T> error(CodeMsg codeMsg){
       return new Result<>(codeMsg);

    }
}
