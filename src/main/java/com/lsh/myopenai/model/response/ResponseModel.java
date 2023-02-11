package com.lsh.myopenai.model.response;

import lombok.Data;

import java.util.List;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:43
 * @Desc:
 */
@Data
public class ResponseModel {

    private String id;
    private String object;
    private String created;
    private String model;
    private List<ChoicesModel> choices;
    private UsageModel usage;
    private List<DateModel> data;
}
