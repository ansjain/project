package ShoppingFrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingbackend.dao.CategoryRepository;
import com.niit.shoppingbackend.model.Category;

@Controller

public class HomeController {

@Autowired
private Category category;

@Autowired
CategoryRepository categoryRepository;

@RequestMapping("/log in ")
public String homePage()
 {
	return "index";
	
 }

@RequestMapping("/LogIn")
public String LogInPage()
 {
	return "LogIn";
	
 }

@RequestMapping("/category")
public String categoryPage(Model model)
 {
	List<Category> allCategories= categoryRepository.getAllCategories();
	model.addAttribute("cat",category);
	model.addAttribute("categoryList",allCategories);
	return "category";
 }
}
