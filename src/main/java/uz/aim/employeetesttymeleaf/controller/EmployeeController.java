package uz.aim.employeetesttymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import uz.aim.employeetesttymeleaf.domains.Employee;
import uz.aim.employeetesttymeleaf.repository.EmployeeRepository;

import java.util.List;

/**
 * @author : Abbosbek Murodov
 * @since : 05/05/23 / 23:31
 * Project : employee-test-tymeleaf / IntelliJ IDEA
 */

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping({"/", "/getAll"})
    public ModelAndView getAllPage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("employees", repository.findAll());
        return mav;
    }
    @GetMapping("/add")
    public ModelAndView addPage() {
        ModelAndView mav = new ModelAndView("add");
        mav.addObject("employee", new Employee());
        return mav;
    }
    @GetMapping("/update")
    public ModelAndView updatePage(@RequestParam Long employeeId) {
        ModelAndView mav = new ModelAndView("add");
        Employee employee = repository.findById(employeeId).get();
        mav.addObject("employee", employee);
        return mav;
    }

    @GetMapping("/delete")
    public String deletePage(@RequestParam Long employeeId) {
        repository.deleteById(employeeId);
        return "redirect:/";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Employee employee) {
        repository.save(employee);
        return "redirect:/";
    }

}
