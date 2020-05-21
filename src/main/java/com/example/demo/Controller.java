package com.example.demo;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {
    private ArrayList<ToDoList> allToDoList = new ArrayList<>();

    @RequestMapping("/home")
    public String displayToDoList(Model model){
        model.addAttribute("allToDoList",allToDoList);
        return "display";
    }

    @GetMapping("/add")
    public String addToDoListForm(Model model){
        model.addAttribute("newToDoList", new ToDoList());
        return "addForm";
    }

    @PostMapping("/check")
    public String processForm(@Valid @ModelAttribute("newToDoList") ToDoList list, BindingResult result){
        if(result.hasErrors()){
            return "addForm";
        }
        allToDoList.add(list);
        return "redirect:/home";
    }
}
