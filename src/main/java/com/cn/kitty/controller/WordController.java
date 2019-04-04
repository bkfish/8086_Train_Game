package com.cn.kitty.controller;

import com.cn.kitty.service.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/word")
public class WordController {
    @Resource
    private WordService wordService;

    @GetMapping("/getTwentyWords")
    public Object getTwentyWords() {
        return wordService.getTwentyWords();
    }

    @GetMapping("/getWordsByNum")
    public Object getWordsByNum(@RequestParam(value = "num",defaultValue = "10")int num) {
        return wordService.getWordsByNum(num);
    }

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        view.addObject("title","这里是主页");
        Object words=wordService.getTwentyWords();
        view.addObject("words",words);
        return view;
    }
}
