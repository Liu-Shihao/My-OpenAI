package com.lsh.myopenai.model.response;

import lombok.Data;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:46
 * @Desc:
 */
@Data
public class UsageModel {
    private int prompt_tokens;
    private int completion_tokens;
    private int total_tokens;

}
