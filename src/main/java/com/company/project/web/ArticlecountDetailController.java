package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ArticlecountDetail;
import com.company.project.service.ArticlecountDetailService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/07/30.
*/
@RestController
@RequestMapping("/articlecount/detail")
public class ArticlecountDetailController {
    @Resource
    private ArticlecountDetailService articlecountDetailService;

    @PostMapping("/add")
    public Result add(ArticlecountDetail articlecountDetail) {
        articlecountDetailService.save(articlecountDetail);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        articlecountDetailService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ArticlecountDetail articlecountDetail) {
        articlecountDetailService.update(articlecountDetail);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ArticlecountDetail articlecountDetail = articlecountDetailService.findById(id);
        return ResultGenerator.genSuccessResult(articlecountDetail);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ArticlecountDetail> list = articlecountDetailService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
