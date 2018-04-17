package at.refugeescode.mp15_pirates_of_the_code_bean.view;

import at.refugeescode.mp15_pirates_of_the_code_bean.model.Steps;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final Steps steps;

    @ModelAttribute("stepOne")
    public Boolean doneOne() {
        return steps.getStepOne();
    }

    @ModelAttribute("stepTwo")
    public Boolean doneTwo() {
        return steps.getStepTwo();
    }

    @ModelAttribute("stepThree")
    public Boolean doneThree() {
        return steps.getStepThree();
    }

    @ModelAttribute("stepFour")
    public Boolean doneFour() {
        return steps.getStepFour();
    }

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/stepOne")
    public String stepOne() {
        steps.setStepOne(true);
        return "redirect:/";
    }

    @GetMapping("/stepTwo")
    public String stepTwo() {
        steps.setStepTwo(true);
        return "redirect:/";
    }

    @GetMapping("/stepThree")
    public String stepThree() {
        steps.setStepThree(true);
        return "redirect:/";
    }

    @GetMapping("/stepFour")
    public String stepFour() {
        steps.setStepFour(true);
        return "redirect:/";
    }

}
