package com.king.gecode.builder;


import java.util.List;
import java.util.Map;

import com.king.gecode.config.SetupConfig;
import com.king.gecode.config.TemplateMapping;
import com.king.gecode.core.BuildFactory;
import com.king.gecode.jdbc.AbstractDaoSupport;
import com.king.gecode.util.MyUtils;

/**
 *@author kim
 */
public class Builder {

    /**
     * beetl factory
     */
    private static BuildFactory factory = new BuildFactory();
    /**
     * config instance
     */
    private static SetupConfig config = SetupConfig.getInstance();


    public void db2entry() {
        // iterator all template file
        TemplateMapping[] mappings = config.getMappings();
        List<String> tablesList = AbstractDaoSupport.getInstance().queryAllTables();
        for (TemplateMapping m : mappings) {
            // iterator all databases tables.
            for (String tableName : tablesList) {
                String packagePath = m.buildPackage(config.getProject(), config.getPackagePath(), MyUtils.getModelName(tableName, "."));
                Map<String, Object> data = factory.getParams(tableName, packagePath);
                factory.build(MyUtils.getTemplatePath(m), data, MyUtils.getOutPutPath(m, tableName));
            }
        }
    }


    public static void main(String[] args) {

        BuildFactory.setLoadingDir(System.getProperty("user.dir") + "/resources/");
        Builder builder = new Builder();

        builder.db2entry();
        System.out.println("代码已生成!");
    }

}
