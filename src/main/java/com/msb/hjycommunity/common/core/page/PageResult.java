package com.msb.hjycommunity.common.core.page;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {

    private static final long serialVersionUID = 3569196449974963450L;

    private long total;
    private List<?> rows;
    private int code;
    private String msg;

    public PageResult() {

    }
    public PageResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
