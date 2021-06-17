package com.davieyang.test;

import com.davieyang.dto.MoodDTO;
import com.davieyang.model.Mood;
import com.davieyang.mq.MoodProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;

import javax.annotation.Resource;
import javax.jms.Destination;

/**
 * @author davieyang
 * @create 2018/07/14
 **/
public class MQTest extends BaseJunit4Test {

    @Resource
    private MoodProducer moodProducer;

    //队列
    private static Destination destination = new ActiveMQQueue("ay.queue.high.concurrency-praise");

    @Test
    public void testMQ() {
        MoodDTO mood = new MoodDTO();
        mood.setId("1");
        mood.setContent("aaaa");
        moodProducer.sendMessage(destination, mood);
    }
}
