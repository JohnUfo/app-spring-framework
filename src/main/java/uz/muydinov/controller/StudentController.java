package uz.muydinov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import uz.muydinov.model.Student;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    static List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Umidjon", 19, "+998900679575"),
            new Student("Sevara", 18, "+998907777777"),
            new Student("Nodir", 19, "+987089789765"),
            new Student("Bobur", 27, "777777777")));

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudentPage(Model model) {
        model.addAttribute("students", students);
        return "student";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudentPage() {
        return "addStudent";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public RedirectView addStudent(HttpServletRequest request, Model model) {
        String fullName = request.getParameter("fullName");
        int age = Integer.parseInt(request.getParameter("age"));
        String phoneNumber = request.getParameter("phoneNumber");
        students.add(new Student(fullName, age, phoneNumber));
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("/student");
        return redirectView;
    }
}
