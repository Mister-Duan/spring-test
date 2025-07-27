package com.msb.hjycommunity.common.core.domain;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 2796878090206022376L;

    /**
     * 响应的状态码
     */
    private String code;
    private String message;

    private T Data;

    /**
     * 成功返回
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data) {

        BaseResponse<T> response = new BaseResponse<>();
        response.setData(data);
        response.setMessage(ResultCode.SUCCESS.getMessage());
        response.setCode(ResultCode.SUCCESS.getCode());
        return response;
    }

    /**
     * 失败返回
     * @return
     */
    public static <T> BaseResponse<T> fail (String message){
        BaseResponse<T> tBaseResponse = new BaseResponse<>();
        tBaseResponse.setMessage(message);
        tBaseResponse.setCode(ResultCode.ERROR.getCode());
        return tBaseResponse;
    }

    /**
     * 失败返回 重栽
     * @param message
     * @param code
     * @return
     * @param <T>
     */

    public static <T> BaseResponse<T> fail(String message,String code){
        BaseResponse<T> response = new BaseResponse<T>();
        response.setMessage(message);
        response.setCode(code);
        return response;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
