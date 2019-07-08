package cn.bdqn.service;

import cn.bdqn.dao.SchoolMapper;
import cn.bdqn.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {
    @Resource
    private SchoolMapper schoolMapper;

    public PageInfo<Student>pageInfo(Integer PageNo, Integer PageSize) {
        PageHelper.startPage(PageNo,PageSize);
        List<Student> sList=schoolMapper.sList();
        PageInfo<Student> pageInfo=new PageInfo<>(sList);
        return pageInfo;
    }
}
