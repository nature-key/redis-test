package com.test.redis;

import redis.clients.jedis.Jedis;

public class redis {

    public static void main(String[] args) {
    Jedis  redis=    new Jedis("127.0.0.1", 6379);
            for (int i = 50000; i <5000000 ; i++) {
            System.out.println(i);
            redis.set("redis"+i,"test"+i);
        }

    }

}
