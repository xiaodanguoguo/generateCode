package com.king.gecode.core;

import java.util.List;

/**
 * @author kim
 */
public class Column {


	//����������
    private String type;

    //�ֶ���
    private String name;

    //�ֶ�����java���
    private String nameJ;

    //��ע��ע��
    private String remark;


    public Column() {
    }

    public Column(String type, String name, String nameJ) {
        this.type = type;
        this.name = name;
        this.nameJ = nameJ;
    }

    public Column(String type, String name, String nameJ, String remark) {
        this.type = type;
        this.name = name;
        this.nameJ = nameJ;
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameJ() {
        return nameJ;
    }

    public void setNameJ(String nameJ) {
        this.nameJ = nameJ;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    //�? 是否包含 类型
    public static boolean typeContains(List<Column> columns, String type) {
        for (Column c : columns) {
            if (c.getType().equals(type)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Column{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", nameJ='" + nameJ + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
