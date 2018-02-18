package pl.loremipsum.lorem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.loremipsum.lorem.Models.GeneratorOptions;
import pl.loremipsum.lorem.Models.LoremIpsumModel;
import pl.loremipsum.lorem.Services.LoremService;

@Controller
public class MainController {

    @Autowired
    LoremService loremService;

    @GetMapping("/")
    public String indexGet(Model model) {
        model.addAttribute("generatorOptions", new GeneratorOptions());
        model.addAttribute("loremIpsumModel", new LoremIpsumModel());
        return "index";
    }

    @PostMapping("/saveOptions")
    public String saveOptions(@ModelAttribute GeneratorOptions generatorOptions, Model model) {
        LoremIpsumModel loremIpsumModel = new LoremIpsumModel();
        String generatedSentense =loremIpsumModel.sentences(generatorOptions.getAmount());
        model.addAttribute("randomSentens", generatedSentense);
        System.out.println(generatorOptions.getAmount());
        System.out.println(generatedSentense);
        return "index";
    }

    @PostMapping("/")
    public String indexPost(@RequestParam("typ") String typ, Model model) {
        LoremIpsumModel loremIpsumModel = new LoremIpsumModel();
        model.addAttribute("randomSentens", loremIpsumModel.sentences(Integer.parseInt(typ)));
        model.addAttribute("randomSentens", loremIpsumModel.paragraphs(Integer.parseInt(typ)));
        model.addAttribute("randomSentens", loremIpsumModel.words(Integer.parseInt(typ)));
        return "index";
    }
}

