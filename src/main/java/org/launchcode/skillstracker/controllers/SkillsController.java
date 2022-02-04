package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class SkillsController {

    @RequestMapping(value = " ")
    @ResponseBody
    public String skillsControllerForm () {
        String html =
                "<html>" +
                        "<h1>SkillsTracker</h1>" +
                        "<h2> We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>1.) Java</li>" +
                            "<li>2.) JavaScript</li>" +
                            "<li>3.) Python</li>" +
                        "</ol>" +
                "</html>";
        return html;
    }

    @GetMapping(value = "form")
    @ResponseBody
    public String skillsTrackerForm () {
        String html = "<form method = 'post'>" +
                "Name: <br>" +
                "<input type = 'text' name = 'name'/>" +
                "<br>My Favorite Language:<br>" +
                "<select name = 'firstChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My Second Favorite Language:<br>" +
                "<select name = 'secondChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select>" +
                "<br>My Third Favorite Language:<br>" +
                "<select name = 'thirdChoice'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Python'>Python</option>" +
                "</select><br>" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";

        return html;
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String namePage (@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";

        return html;
    }

}
