package com.lsh.myopenai.service;

import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;
import com.lsh.myopenai.model.request.ImagesSizeEnum;
import com.lsh.myopenai.model.response.ResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:24
 * @Desc:
 */
@Slf4j
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
    public ResponseModel completionApi(CompletionsRequestModel requestModel) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+apiKey);
        headers.add("OpenAI-Organization",organization);
        requestModel.setMax_tokens(7);
        requestModel.setTemperature(0);
        HttpEntity<CompletionsRequestModel> requestModelHttpEntity = new HttpEntity<>(requestModel, headers);
        ResponseEntity<ResponseModel> responseEntity = restTemplate.exchange(completionsUrl, HttpMethod.POST, requestModelHttpEntity, ResponseModel.class);
        log.info(String.valueOf(responseEntity.getBody()));
        return responseEntity.getBody();

    }

    @Override
    public ResponseModel imagesApi(ImagesRequestModel requestModel) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+apiKey);
        headers.add("OpenAI-Organization",organization);
        requestModel.setPrompt(requestModel.getPrompt());
        HttpEntity<ImagesRequestModel> requestModelHttpEntity = new HttpEntity<>(requestModel, headers);
        ResponseEntity<ResponseModel> responseEntity = restTemplate.exchange(imagesUrl, HttpMethod.POST, requestModelHttpEntity, ResponseModel.class);
        log.info(String.valueOf(responseEntity.getBody()));
        return responseEntity.getBody();
    }
}
