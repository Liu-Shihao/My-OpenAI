package com.lsh.myopenai.service;

import com.lsh.myopenai.model.request.CompletionsRequestModel;
import com.lsh.myopenai.model.request.ImagesRequestModel;
import com.lsh.myopenai.model.response.ResponseModel;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:24
 * @Desc:
 */

public interface OpenAIService {

    ResponseModel completionApi(CompletionsRequestModel requestModel);

    ResponseModel imagesApi(ImagesRequestModel requestModel);
}
