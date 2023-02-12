package com.lsh.myopenai.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:01
 * @Desc:
 */
@Data
public class ImagesRequestModel {

    //Must be one of 256x256, 512x512, or 1024x1024
    private String size =  ImagesSizeEnum.SIZE_1024x1024.getValue();

    //Must be one of url or b64_json
    private String response_format = "url";

    // 提示语  string or array
    public String prompt;

    // 返回内容的条数/生成图片的数量 Must be between 1 and 10. 默认值1
    public int n = 1;

    public String user = "";

}
