package com.sjw.studentmanagersystem.entity;

/**
 * 实体类：Admin
 * Created by 石景文 on 2017/3/30.
 */

public class Admin {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    public Admin() {
        super();
    }

    public Admin(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    /**
     * 获取用户名
     *
     * @return 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
