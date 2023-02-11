package com.lsh.myopenai.model.request;

import lombok.Data;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:01
 * @Desc:
 */
@Data
public class ImagesRequestModel extends BaseRequestModel {

    private String size;

    private String response_format = "url";


}
