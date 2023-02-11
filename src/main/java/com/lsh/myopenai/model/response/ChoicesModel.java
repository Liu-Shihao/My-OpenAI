package com.lsh.myopenai.model.response;

import lombok.Data;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:45
 * @Desc:
 */
@Data
public class ChoicesModel {
    private String text;
    private int index;
    private Object logprobs;
    private String finish_reason;

}
