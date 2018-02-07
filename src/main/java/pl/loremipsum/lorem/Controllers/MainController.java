package pl.loremipsum.lorem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.loremipsum.lorem.Models.LoremIpsumModel;

@Controller
public class MainController {

        @GetMapping("/")
        public String indexGet(Model model) {
            return "index";
        }

        @PostMapping("/")
        public String indexPost(@RequestParam("ile")String ile, Model model){
            LoremIpsumModel loremIpsumModel = new LoremIpsumModel();

            model.addAttribute("randomSentens",loremIpsumModel.sentences(Integer.parseInt(ile)));
            return "index";
        }


//        public String loremPost(@ModelAttribute("loremIpsumModel") LoremIpsumModel loremIpsumModel, Model model) {
//
//            model.addAttribute("possibleInstallments", loremIpsumModel.calculatePossibleInstallments());
//            model.addAttribute("income", loremIpsumModel.getIncome());
//            model.addAttribute("amount", loremIpsumModel.getAmount());
//
//            model.addAttribute("requestedInstallments", loremIpsumModel.getNumberOfInstallments());
//
//            return "index";
//
//        }

    }

