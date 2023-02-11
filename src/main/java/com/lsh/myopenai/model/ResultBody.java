package com.lsh.myopenai.model;

import com.lsh.myopenai.model.response.ResponseModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 03:05
 * @Desc:
 */
@Data
@AllArgsConstructor
public class ResultBody {
    private String code;
    private String msg;
    private String data;

    public static ResultBody SUCCESS(String data){
        return new ResultBody("200","success",data);
    }
    public static ResultBody FAIL(String data){
        return new ResultBody("500","fail",data);
    }

}
