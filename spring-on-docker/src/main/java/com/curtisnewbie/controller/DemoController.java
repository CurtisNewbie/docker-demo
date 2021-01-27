package com.curtisnewbie.controller;

import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author yongjie.zhuang
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @PostConstruct
    private void setCache() {
        RBucket<String> rBucket = redissonClient.getBucket("cache");
        rBucket.set("This is craeted by yongjie.zhuang");
    }

    @Autowired
    private RedissonClient redissonClient;

    @GetMapping
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok(String.format("DemoController running in docker container, cached value: '%s'", getCache()));
    }

    private String getCache() {
        RBucket<String> rBucket = redissonClient.getBucket("cache");
        if (rBucket.isExists())
            return rBucket.get();
        else
            return "";
    }

}
