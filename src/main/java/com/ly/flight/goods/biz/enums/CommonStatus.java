package com.ly.flight.goods.biz.enums;

/**
 * Created by gl46227 on 2017/4/2.
 */
public enum CommonStatus {
    UNKNOW("-1", "未知错误"),
    FAIL("0", "失败"),
    SUCCESS("1", "成功");

    CommonStatus(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String code;
    public String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
