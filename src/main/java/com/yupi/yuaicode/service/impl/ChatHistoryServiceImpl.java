package com.yupi.yuaicode.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.yupi.yuaicode.model.entity.ChatHistory;
import com.yupi.yuaicode.mapper.ChatHistoryMapper;
import com.yupi.yuaicode.service.ChatHistoryService;
import org.springframework.stereotype.Service;

/**
 * 对话历史 服务层实现。
 *
 * @author Administrator
 */
@Service
public class ChatHistoryServiceImpl extends ServiceImpl<ChatHistoryMapper, ChatHistory>  implements ChatHistoryService {

}
