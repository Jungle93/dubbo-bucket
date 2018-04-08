package com.jungle.service;

import com.jungle.entity.po.Message;

/**
 * @author : jungle
 * @Title : MessageService
 * @Package : com.jungle.service
 * @Description: 消息服务.
 * @Date : 2018/4/8-12:51
 */
public interface MessageService {

    /**
     * 使用名称拼装消息。
     * @param name  名称
     * @return  {@link com.jungle.entity.po.Message}
     */
    Message getMessage(String name);
}
