package cn.edu.cuit.want.service;

import cn.edu.cuit.want.entity.Want;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * (Want)表服务
 *
 * @author fpc
 * create on 2019-12-22 16:46:10
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WantService {
    private Map<Integer, Want> wants;

    public Want insert(Want want) {
        return wants.put(want.getId(), want);
    }

    public Want selectOne(Integer id) {
        return wants.get(id);

    }
}