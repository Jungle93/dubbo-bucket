package com.jungle.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jungle.entity.po.Message;
import com.jungle.service.MessageService;

/**
 * @author : jungle
 * @Title : MessageServiceImpl
 * @Package : com.jungle.service.impl
 * @Description: 消息服务实现类.
 * @Date : 2018/4/8-12:55
 */
@Service(timeout = 5000)
public class MessageServiceImpl implements MessageService{
    @Override
    public Message getMessage(String name) {
        Message message = new Message();
        message.setTitle("say hello");
        message.setContent("hello "+name);
        return message;
    }
}
