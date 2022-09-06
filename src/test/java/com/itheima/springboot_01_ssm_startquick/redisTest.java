package com.itheima.springboot_01_ssm_startquick;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Set;

@SpringBootTest
public class redisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    @Test
    public void redistest() {


        String name = stringRedisTemplate.opsForValue().get("name");
        String user_list = stringRedisTemplate.opsForList().index("user_list", 0);
        Set<String> user_set = stringRedisTemplate.opsForSet().members("set_user");
        Object o = stringRedisTemplate.opsForHash().get("user_hash", "good");
        System.out.println(name);
        System.out.println(user_list);
        System.out.println(user_set);
        System.out.println(o);
    }
}
