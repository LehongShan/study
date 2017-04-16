package com.shan.activemq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by 41973_000 on 2017-4-15.
 */
public class JMSProducer {

    //默认连接用户名
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    //默认连接密码
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    //默认连接地址
    private static final String BROKEURL = "tcp://192.168.0.10:61616";
    //发送的消息数量
    private static final int SENDNUM = 10;

    public static void main(String [] args){
        //连接工厂
        ConnectionFactory connectionFactory;
        //连接
        Connection connection = null;
        //会话接收或发送的线程
        Session session;
        //连接目的地
        Destination destination;
        //消息生产者
        MessageProducer messageProducer;
        //实例化工厂
        connectionFactory = new ActiveMQConnectionFactory(JMSProducer.USERNAME,JMSProducer.PASSWORD,JMSProducer.BROKEURL);

        try{
            //连接工厂获取连接
            connection = connectionFactory.createConnection();
            //创建Session
            session = connection.createSession(true,Session.AUTO_ACKNOWLEDGE);
            //创建队列
            destination = session.createQueue("Shanlh_Study_MQ_001");
            //创建生产者
            messageProducer = session.createProducer(destination);
            //发送消息
            sendMessage(session,messageProducer);
            session.commit();

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            if(connection != null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }

        }


    }


    public static void sendMessage(Session session,MessageProducer messageProducer) throws JMSException {

        for (int i = 0;i<JMSProducer.SENDNUM;i++){

            //创建一条文本消息
            TextMessage message = session.createTextMessage("ActiveMQ 发送消息" +i);
            System.out.println("发送消息：Activemq 发送消息" + i);
            //通过消息生产者发出消息
            messageProducer.send(message);

        }

    }
}
