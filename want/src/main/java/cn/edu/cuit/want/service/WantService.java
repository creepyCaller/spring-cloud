package cn.edu.cuit.want.service;

import cn.edu.cuit.want.entity.Want;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * (Want)表服务
 *
 * @author fpc
 * create on 2019-12-22 16:46:10
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WantService {
    private static List<Want> wants;

    static {
        wants = new ArrayList<>();
        wants.add(Want.builder().id(0).date(new Date()).name("a").price(9.9).status(1).amount(1).remark("none").build());
        wants.add(Want.builder().id(1).date(new Date()).name("a").price(9.9).status(1).amount(1).remark("none").build());
        wants.add(Want.builder().id(2).date(new Date()).name("a").price(9.9).status(1).amount(1).remark("none").build());
    }

    public boolean insert(Want want) {
        return wants.add(want);
    }

    public Want selectOne(Integer id) {
        AtomicReference<Want> ret = new AtomicReference<>();
        wants.parallelStream().forEach(each -> {
            if (each.getId().equals(id)) {
                ret.set(each);
            }
        });
        return ret.get();
    }

    public List<Want> findAll() {
        return wants;
    }
}