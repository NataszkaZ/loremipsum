package pl.loremipsum.lorem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.loremipsum.lorem.Models.GeneratorOptions;
import pl.loremipsum.lorem.Models.LoremIpsumModel;

@Controller
public class MainController {

        @GetMapping("/")
        public String indexGet(Model model) {
            // 2. dodanie klasy modelu opcji pod nazwa generatorOptions  (dostepne w index.html jako ${generatorOptions. }
            model.addAttribute("generatorOptions", new GeneratorOptions());
            model.addAttribute("loremIpsumModel", new LoremIpsumModel());

            return "index";
        }

        // 3. handler zapisu opcji lub przekierowanie na strone z wynikiem
        @PostMapping("/saveOptions")
        public String saveOptions(@ModelAttribute GeneratorOptions generatorOptions) {
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

