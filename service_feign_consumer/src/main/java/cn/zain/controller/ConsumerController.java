package cn.zain.controller;

import cn.zain.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zain
 */
@RestController
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @GetMapping(value = "/add")
    public Integer add() {
        return computeService.add(10,20);
    }
}