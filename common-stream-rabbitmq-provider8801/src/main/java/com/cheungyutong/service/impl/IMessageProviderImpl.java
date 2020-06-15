package com.cheungyutong.service.impl;

import com.cheungyutong.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @Author cheungyutong
 * @Date 2020/6/16 0:45
 * @deprecation 不需要@Service,因为这已经不再是传统的Service层,而是在这定义一个消息生产者的发送管道
 */
@EnableBinding(Source.class)//定义消息推送的管道
@Slf4j
public class IMessageProviderImpl implements IMessageProvider {

    @Autowired
    private MessageChannel output;//消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("******serial："+serial);
        return serial;
    }
}
