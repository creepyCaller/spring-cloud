package cn.edu.cuit.user.service;

import cn.edu.cuit.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * (User)表服务
 *
 * @author fpc
 * create on 2019-12-22 16:45:53
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserService {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(User.builder().id(0).username("a").email("b").password("p").status(1).build());
        users.add(User.builder().id(1).username("a").email("b").password("p").status(1).build());
        users.add(User.builder().id(2).username("a").email("b").password("p").status(1).build());
    }

    public boolean insert(User user) {
        return users.add(user);
    }

    public User selectOne(Integer id) {
        AtomicReference<User> ret = new AtomicReference<>();
        users.parallelStream().forEach(each -> {
            if (each.getId().equals(id)) {
                ret.set(each);
            }
        });
        return ret.get();
    }

    public List<User> findAll() {
        return users;
    }
}