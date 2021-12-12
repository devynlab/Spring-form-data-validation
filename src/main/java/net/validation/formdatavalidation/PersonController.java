package net.validation.formdatavalidation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {
  @Autowired
  private PersonRepository repo;

  @GetMapping("/add")
  public String showAddPersonForm(Person person) {
    return "add-person";
  }

  @PostMapping("/add")
  public String showAddPersonForm(@Valid Person person, BindingResult result, Model model) {
    if (result.hasErrors()) {
      return "add-person";
    }
    repo.save(person);
    return "redirect:/";
  }
}
