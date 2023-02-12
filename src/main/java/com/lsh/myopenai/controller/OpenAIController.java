package com.lsh.myopenai.controller;

import com.lsh.myopenai.model.ResultBody;
import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;
import com.lsh.myopenai.service.OpenAIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:22
 * @Desc:
 */
@RestController
@RequestMapping("/openai")
public class OpenAIController {


    @Autowired
    OpenAIService openAIService;


    @PostMapping("/text")
    public ResultBody CompletionApi(@RequestBody CompletionsRequestModel requestModel){
        return ResultBody.SUCCESS(openAIService.completionApi(requestModel).getChoices().get(0).getText());


    }
    @PostMapping("/img")
    public ResultBody ImagesApi(@RequestBody ImagesRequestModel requestModel){
        return ResultBody.SUCCESS(openAIService.imagesApi(requestModel).getData().get(0).getUrl());
    }
}
