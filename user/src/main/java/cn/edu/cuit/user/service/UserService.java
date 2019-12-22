package cn.edu.cuit.user.service;

import cn.edu.cuit.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * (User)表服务
 *
 * @author fpc
 * create on 2019-12-22 16:45:53
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserService {
    private static Map<Integer, User> users;

    static {
        users = new HashMap<>();
    }

    public User insert(User user) {
        return users.put(user.getId(), user);
    }

    public User selectOne(Integer id) {
        return users.get(id);
    }
}