package com.lsh.myopenai.model.request;

import lombok.Data;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 01:58
 * @Desc:
 */
@Data
public class BaseRequestModel {
    // 提示语  string or array
    private String prompt;

    // 返回内容的条数/生成图片的数量 Must be between 1 and 10. 默认值1
    private int n;

    private String user;

}
