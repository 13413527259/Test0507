package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.message.req.Message;

public interface ReqMessageDao extends JpaRepository<Message, Integer>{

}
