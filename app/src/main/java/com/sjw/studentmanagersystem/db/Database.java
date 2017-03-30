package com.sjw.studentmanagersystem.db;

import com.sjw.studentmanagersystem.entity.Admin;
/**
 * Created by 石景文 on 2017/3/30.
 */

public class Database {
    /**
     * 默认的管理员账号
     */
    public static Admin admin;

    // 初始化默认管理员账号，设置正确的用户名和密码
    static {
        admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("admin888");
    }
}
