package com.cnpc.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author 鬼王
 * @Date 2018/11/29 19:26
 */
@FeignClient("bus-admin")
public interface UserService {

    @GetMapping("user/get")
    String get();

    @GetMapping("user/list")
    List<String> list();

}
