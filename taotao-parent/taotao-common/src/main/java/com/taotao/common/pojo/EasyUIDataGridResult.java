package com.taotao.common.pojo;

import java.util.List;

/**
 *
 * 商品列表展示
 * Created by yazhou on 16-9-11.
 *
 */
public class EasyUIDataGridResult {

    private long total;    //商品列表总计录数
    private List<?> rows;  //
    private long getTotal; //

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

    public long getGetTotal() {
        return getTotal;
    }

    public void setGetTotal(long getTotal) {
        this.getTotal = getTotal;
    }
}
