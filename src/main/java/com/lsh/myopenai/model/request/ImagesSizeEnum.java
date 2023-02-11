package com.lsh.myopenai.model.request;

/**
 * @Author: LiuShihao
 * @Date: 2023/2/12 02:01
 * @Desc:
 */
public enum ImagesSizeEnum {
    SIZE_256x256("256x256"),
    SIZE_512x512("512x512"),
    SIZE_1024x1024("1024x1024");

    private String value;

    public String getValue() {
        return value;
    }

    ImagesSizeEnum(String value) {
        this.value = value;
    }
}
