package com.boot.example.mapper;

import com.boot.example.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {
    @Results(id = "courseResult", value = {
            @Result(column = "no", property = "no"),
            @Result(column = "c_num", property = "courseNum"),
            @Result(column = "c_name", property = "courseName"),
            @Result(column = "c_credit", property = "courseCredit"),
            @Result(column = "c_section", property = "courseSection"),
    })
    @Select("SELECT no, c_num, c_name, c_credit, c_section FROM course ORDER BY no")
    public List<Course> courseList();
}
