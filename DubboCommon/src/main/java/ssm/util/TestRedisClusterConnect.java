package ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * className:TestRedisClusterConnect
 * discriptoin:
 * author:邢博
 * createTime:2019-01-03 14:41
 */
public class TestRedisClusterConnect {
    public static void main(String[] args) {
        Set<HostAndPort> node = new HashSet<HostAndPort>();
        node.add(new HostAndPort("192.168.206.101",6661));
        node.add(new HostAndPort("192.168.206.101",6662));
        node.add(new HostAndPort("192.168.206.101",6663));
        node.add(new HostAndPort("192.168.206.102",8881));
        node.add(new HostAndPort("192.168.206.102",8882));
        node.add(new HostAndPort("192.168.206.102",8883));
        JedisCluster jedisCluster = new JedisCluster(node);
        jedisCluster.set("qy86","马上放假");
        System.out.println(jedisCluster.get("qy86"));
    }
}
