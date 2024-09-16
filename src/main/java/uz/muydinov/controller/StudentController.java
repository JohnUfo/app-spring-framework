package uz.muydinov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.muydinov.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudentPage(Model model) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Umidjon",19,"+998900679575"),
                new Student("Sevara",18,"+998907777777"),
                new Student("Nigga",19,"+987089789765"),
                new Student("Bobur",27,"777777777")));
        model.addAttribute("students", students);


        return "student";
    }


    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudentPage() {
        return "addStudent";
    }
}
