package com.boot.example.controller;

import com.boot.example.domain.Course;
import com.boot.example.domain.Subject;
import com.boot.example.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;


    @GetMapping("/courseAllList")
    @ResponseBody
    public List<Course> courseList(){
        List<Course> courseAllList = courseService.courseList();

        return courseAllList;
//    @GetMapping("/courseList")
//    public String courseList(Model model, Course course) {
//        List<Course> courseList = courseService.courseList();
//        model.addAttribute("courseList", courseList);
//        model.addAttribute("course", course);
//
//        return "/course/courseList";
    }
}
