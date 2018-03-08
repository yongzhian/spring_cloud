package cn.zain.hystrix;

import cn.zain.service.ComputeService;
import org.springframework.stereotype.Component;

/**
 * @author Zain
 */
@Component
public class ComputeHystrixImpl implements ComputeService {
    @Override
    public Integer add(Integer a, Integer b) {
        System.out.println("服务异常，熔断器处理..");
        return 0;
    }
}
