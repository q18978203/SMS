package com.sjw.studentmanagersystem.bll;

import com.sjw.studentmanagersystem.dao.AdminDao;
import com.sjw.studentmanagersystem.entity.Admin;

/**Admin数据的业务逻辑类
 * Created by 石景文 on 2017/3/30.
 */

public class AdminBiz {
    /**
     * 验证登录
     *
     * @param admin
     *            请求登录的管理员数据
     * @return 返回true表示用户名和密码正确，返回false表示用户名或密码错误
     */
    public boolean login(Admin admin) {
        AdminDao dao = new AdminDao();
        return dao.login(admin);
    }
}
