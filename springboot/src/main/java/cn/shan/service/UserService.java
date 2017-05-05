package cn.shan.service;

import cn.shan.mapper.UserMapper;
import cn.shan.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shanlehong on 2017/5/5.
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public User getUserInfo() {
        User user = userMapper.findUserInfo();

        return  user;

    }
}
