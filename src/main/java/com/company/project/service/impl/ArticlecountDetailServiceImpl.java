package com.company.project.service.impl;

import com.company.project.dao.ArticlecountDetailMapper;
import com.company.project.model.ArticlecountDetail;
import com.company.project.service.ArticlecountDetailService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/07/30.
 */
@Service
@Transactional
public class ArticlecountDetailServiceImpl extends AbstractService<ArticlecountDetail> implements ArticlecountDetailService {
    @Resource
    private ArticlecountDetailMapper articlecountDetailMapper;

}
