package com.lsh.myopenai.controller;

import com.lsh.myopenai.model.ResultBody;
import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;
import com.lsh.myopenai.service.OpenAIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:22
 * @Desc:
 */
@Slf4j
@Controller
public class OpenAIController {


    @Autowired
    OpenAIService openAIService;

    /**
     * Model model,
     * @param request
     * @return
     */
    @GetMapping("/index")
    public String index(HttpServletRequest request){
        log.info("- - - - - - - - - - - - - - - - - - - - - - - - -");
        log.info("- - - - - - - Welcome {} - - - - - - - -",request.getRemoteAddr());
        log.info("- - - - - - - - - - - - - - - - - - - - - - - - -");
        return "index";
    }


    @PostMapping("/openai/text")
    public String CompletionApi( CompletionsRequestModel requestModel,Model model){
        model.addAttribute("request",requestModel.getPrompt());
        model.addAttribute("response",openAIService.completionApi(requestModel).getChoices().get(0).getText());
        return "index";


    }
    @PostMapping("/openai/img")
    public String ImagesApi(ImagesRequestModel requestModel){
        openAIService.imagesApi(requestModel).getData().get(0).getUrl();
        return "index";
    }
}
