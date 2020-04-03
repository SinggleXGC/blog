package com.xgc.blog.service;

import com.xgc.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
