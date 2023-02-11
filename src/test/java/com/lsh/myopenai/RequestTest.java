package com.lsh.myopenai;

import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;
import com.lsh.myopenai.model.request.ImagesSizeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 01:24
 * @Desc:
 */
@SpringBootTest
public class RequestTest {

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

    @Test
    public void testCompletionsRequest(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+apiKey);
        headers.add("OpenAI-Organization",organization);
        CompletionsRequestModel requestModel = new CompletionsRequestModel();
        requestModel.setModel("text-davinci-003");
        requestModel.setPrompt("Say this is a test");
        requestModel.setMax_tokens(7);
        requestModel.setTemperature(0);
        HttpEntity<CompletionsRequestModel> requestModelHttpEntity = new HttpEntity<>(requestModel, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(completionsUrl, HttpMethod.POST, requestModelHttpEntity, String.class);
        System.out.println(responseEntity.getBody());
    }
    @Test
    public void testImgRequest(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization","Bearer "+apiKey);
        headers.add("OpenAI-Organization",organization);
        ImagesRequestModel requestModel = new ImagesRequestModel();
        requestModel.setPrompt("A Cat");
        requestModel.setN(1);
        requestModel.setSize(ImagesSizeEnum.SIZE_1024x1024.getValue());
        requestModel.setUser("");
        HttpEntity<ImagesRequestModel> requestModelHttpEntity = new HttpEntity<>(requestModel, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(imagesUrl, HttpMethod.POST, requestModelHttpEntity, String.class);
        System.out.println(responseEntity.getBody());
    }




}
