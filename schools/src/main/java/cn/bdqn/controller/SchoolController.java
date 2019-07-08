package cn.bdqn.controller;

import cn.bdqn.entity.Student;
import cn.bdqn.service.SchoolService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class SchoolController {
    @Resource
    private SchoolService schoolService;

    @RequestMapping(value="query")
    public String sList(Integer pageNo,Integer pageSize,Model model) {
        if(pageNo==null) {
            pageNo=1;
        }
        if(pageSize==null) {
            pageSize=3;
        }
       PageInfo<Student> pageInfo=schoolService.pageInfo(pageNo,pageSize);
       model.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}
