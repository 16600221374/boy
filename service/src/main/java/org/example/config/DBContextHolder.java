package org.example.config;


/**
 * <p>desc: 数据源的切换</p>
 * <p>类名：DBContextHolder </p>
 * <p>创建时间：2018-7-10 上午9:39:24 </p>
 * <p>@author：mmy</p>
 */
public class DBContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setDbType(String dbType) {
        contextHolder.set(dbType);
    }

    public static String getDbType() {
        return ((String) contextHolder.get());
    }

    public static void clearDbType() {
        contextHolder.remove();
    }
}
