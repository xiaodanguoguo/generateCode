package com.king.gecode.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.king.gecode.core.Column;
import com.king.gecode.util.StringUtil;


/**
 * @author kim
 */
public class MysqlDao extends AbstractDaoSupport {
    @Override
    public List<String> queryAllTables() {
        return queryAllTables("show tables");
    }

    @Override
    public List<Column> queryColumns(String tableName) {
        List<Column> list = new ArrayList<Column>();
        try {
            checkDriver();
            Connection conn = getConn();
            ResultSet rs = createQuary(conn, "show full fields from " + tableName);
            while (rs.next()) {
                String type = typesConvert(rs.getString(2));
                String javaStyle = StringUtil.javaStyle(rs.getString(1));
                list.add(new Column(type, rs.getString(1), javaStyle, rs.getString(9)));
            }
            rs.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public String typesConvert(String mysqlType) {
        if (mysqlType.startsWith("varchar") || mysqlType.startsWith("longtext")) {
            return "String";
        } else if (mysqlType.startsWith("int") || mysqlType.startsWith("bigint")) {
            return "Integer";
        } else if (mysqlType.startsWith("double")) {
            return "Double";
        } else if (mysqlType.startsWith("timestamp")) {
            return "Date";
        } else if (mysqlType.startsWith("tinyint")) {
            return "Boolean";
        } else if (mysqlType.startsWith("date")) {
            return "Date";
        } else if (mysqlType.startsWith("decimal")) {
            return "BigDecimal";
        }
        return mysqlType;
    }
}
