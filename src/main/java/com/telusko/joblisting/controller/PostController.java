// Controller class
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @GetMapping("/post")
    public String showPost(Model model) {
        model.addAttribute("post", "Hello, World! This is a post.");
        return "post";
    }
}
