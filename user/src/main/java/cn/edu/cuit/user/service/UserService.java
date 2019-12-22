package cn.edu.cuit.user.service;

import cn.edu.cuit.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * (User)表服务
 *
 * @author fpc
 * create on 2019-12-22 16:45:53
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserService {

    public User selectOne(String username) {
        return User.builder()
                .id(1)
                .username(username)
                .email("fpc@creepyCaller.com")
                .status(1)
                .build();
    }
}