package cn.bdqn.service;

import cn.bdqn.entity.Student;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface SchoolService {
    //查询所有学生
   PageInfo<Student>pageInfo(Integer PageNo, Integer PageSize);
}
