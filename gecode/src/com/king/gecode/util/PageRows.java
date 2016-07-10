/*
 * (C) 2013 NTCO Platform Milipp
 */

package com.king.gecode.util;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * @author kim
 */
@SuppressWarnings("serial")
public class PageRows<T> implements Serializable {
    private Pagination page;
    private List<T> rows = new ArrayList<T>();

    public PageRows() {
    }

    public Pagination getPage() {
        return page;
    }

    public void setPage(Pagination page) {
        this.page = page;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }


}
