package com.fengqun.fengqunspotticket.ResponseVo;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:52
 */

/**
 * 接口返回数据的统一包装类  :  T：type
 * @param <T>
 */
public class ResponseVo<T> {
    /**
     * 状态码 ： 正确结果：200 ，  错误结果：40xxxx
     */
    private Integer code;
    /**
     * 对于错误结果状态码的解释说明
     */
    private String message;
    /**
     * 正确结果的返回数据
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
