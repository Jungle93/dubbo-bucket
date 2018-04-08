package com.jungle.entity.po;

import java.io.Serializable;

/**
 * @author : jungle
 * @Title : Message
 * @Package : com.jungle.entity.po
 * @Description: 消息.
 * @Date : 2018/4/8-12:50
 */
public class Message implements Serializable{

    /**
     * 标题。
     */
    private String title;
    /**
     * 内容。
     */
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
