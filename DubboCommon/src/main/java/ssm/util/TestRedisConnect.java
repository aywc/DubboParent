package ssm.util;

import redis.clients.jedis.Jedis;

/**
 * className:TestRedisConnect
 * discriptoin:
 * author:邢博
 * createTime:2018-12-29 16:39
 */
public class TestRedisConnect {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.206.99");
        System.out.println(jedis.ping());
    }
}
