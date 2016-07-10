package com.king.gecode.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.king.gecode.config.SetupConfig;

/**
 * @author kim
 */
public class StringUtil {

    public static String capFirst(String str) {
        String firstC = str.substring(0, 1);

        return str.replaceFirst(firstC, firstC.toUpperCase());
    }


    public static String javaStyle(String columnName) {
        String patternStr = "(_[a-z,A-Z])";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(columnName.toLowerCase());
        StringBuffer buf = new StringBuffer();
        while (matcher.find()) {
            String replaceStr = matcher.group();
            matcher.appendReplacement(buf, replaceStr.toUpperCase());
        }
        matcher.appendTail(buf);
        return buf.toString().replaceAll("_", "");
    }

    //去前缀
    public static String javaStyleOfTableName(String tableName) {
        String prefixs = SetupConfig.getInstance().getIgnorePrefix();
        String[] ps = prefixs.split(",");
        for (int i = 0; i < ps.length; i++) {
            if (tableName.startsWith(ps[i])) {
                tableName = tableName.replaceAll(ps[i], "");
            }
        }
        return StringUtil.javaStyle(tableName);
    }


    // 类名
    public static String className(String tableName) {
        return capFirst(javaStyleOfTableName(tableName));
    }
}
