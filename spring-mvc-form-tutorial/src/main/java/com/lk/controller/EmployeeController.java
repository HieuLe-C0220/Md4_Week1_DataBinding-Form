package com.lk.controller;

import com.lk.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @RequestMapping(value = "showform",method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("employee",new Employee());
        return "employee/create";
    }
    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactName",employee.getContactName());
        model.addAttribute("id",employee.getId());
        return "employee/info";
    }
}