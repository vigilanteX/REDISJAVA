package org.example;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Jedis jedis=new Jedis("localhost",6379);
        System.out.println(jedis.ping());
        jedis.setex("name",10,"Aman");
        Thread.sleep(11000);
        System.out.println(jedis.get("name"));

    }
}
