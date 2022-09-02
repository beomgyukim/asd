package study.introduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "Spring");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMVC(@RequestParam("data") String data, Model model){
        model.addAttribute("data", data);
        return "hello-mvc";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("data") String data){
        return "안녕하세요. " + data +"님";
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("data") String data){
        Hello hello = new Hello();
        hello.setData(data);
        return hello;
    }

    static class Hello{
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
