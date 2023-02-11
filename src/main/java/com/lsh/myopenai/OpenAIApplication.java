package com.lsh.myopenai;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 01:06
 * @Desc:
 */
@Slf4j
@SpringBootApplication
public class OpenAIApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenAIApplication.class,args);
        log.info("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
        log.info("* * * * * * * * * * * * * * * My OpenAI Is Start Up!* * * * * * * * * * * * * * * ");
        log.info("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
