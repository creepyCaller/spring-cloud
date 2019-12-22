package cn.edu.cuit.want.service;

import cn.edu.cuit.want.entity.Want;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * (Want)表服务
 *
 * @author fpc
 * create on 2019-12-22 16:46:10
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WantService {

    public Want selectOne(Integer id) {
        return Want.builder()
                .id(id)
                .name("测试订单")
                .amount(1)
                .date(new Date())
                .price(9.9)
                .remark("测试订单的备注")
                .status(1)
                .build();

    }
}