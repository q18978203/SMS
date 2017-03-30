package com.sjw.studentmanagersystem.dao;

import com.sjw.studentmanagersystem.db.Database;
import com.sjw.studentmanagersystem.entity.Admin;

/**Admin的数据访问类
 * Created by 石景文 on 2017/3/30.
 */

public class AdminDao {
    /**
     * 验证登录
     *
     * @param admin
     *            请求登录的管理员数据
     * @return 返回true表示用户名和密码正确，返回false表示用户名或密码错误
     */
    public boolean login(Admin admin) {
        if (admin.getUsername().equals(Database.admin.getUsername())
                && admin.getPassword().equals(Database.admin.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
