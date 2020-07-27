package fallak.petveterinaryclinic.controllers;

import fallak.petveterinaryclinic.data.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ownerController {
    private final OwnerService ownerService;

    public ownerController(final OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","/owners/index.html"})
    public String listOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping("owners/find")
    public String findOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "owners/find";
    }
}

