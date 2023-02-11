package com.lsh.myopenai.service;

import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:24
 * @Desc:
 */
@Service
public class OpenAIServiceImpl implements OpenAIService{

    @Value("${open.ai.api.completions}")
    String completionsUrl;

    @Value("${open.ai.api.images}")
    String imagesUrl;

    @Value("${open.ai.apiKey}")
    String apiKey;

    @Value("${open.ai.organization}")
    String organization;


    @Autowired
    RestTemplate restTemplate;

    @Override
    public void completionApi(CompletionsRequestModel requestModel) {

    }

    @Override
    public void imagesApi(ImagesRequestModel requestModel) {

    }
}
