package com.lsh.myopenai.service;

import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:24
 * @Desc:
 */

public interface OpenAIService {
    void completionApi(CompletionsRequestModel requestModel);

    void imagesApi(ImagesRequestModel requestModel);
}
