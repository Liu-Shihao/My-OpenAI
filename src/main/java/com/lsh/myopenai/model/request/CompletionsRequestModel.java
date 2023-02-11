package com.lsh.myopenai.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 01:26
 * @Desc:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompletionsRequestModel extends BaseRequestModel {

    // 必填，指定功能模型
    private String model = "text-davinci-003";

    private String suffix;

    //max_tokens决定了返回内容的最大长度，主要模型支持的token上限是2048，而最新的模型支持4098。
    private int max_tokens = 2048;

    //采样精度 默认值为1 取值范围为0~2
    private int temperature = 1;

    //默认值1，采样精度的另一种表示方式,不要和temperature同时使用
    private int top_p ;

    //默认值false，是否流式输出内容
    private boolean stream;

    private int logprobs;

    //默认值false，是否回显prompt内容
    private boolean echo;

    // string or array
    private String stop;

    private int presence_penalty;

    private int frequency_penalty;

    private int best_of = 1;

    private Map logit_bias = new HashMap();


}
