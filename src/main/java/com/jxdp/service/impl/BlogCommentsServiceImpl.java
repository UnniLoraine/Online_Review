package com.jxdp.service.impl;

import com.jxdp.entity.BlogComments;
import com.jxdp.mapper.BlogCommentsMapper;
import com.jxdp.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
