/**
 * Created at 2015-09-27.
 * Info:
 * @Tiantanhehe (C)2011-3011 Tiantanhehe
 * @Author huke <huke@tiantanhehe.com>
 */
package com.yiguan.search.common.util;

/**
 * <p>
 * @classname ResponseCode
 * <p>
 * <p>
 * @description TODO
 * <p>
 * @author huk
 * @since JDK 1.6
 * @version
 * @date 2014-8-31
 */
public enum ResponseCode{
	/* 表示成功。 */
    SUCCESS(0),

	/* 表示失败(通用)。 */
    FAILURE(-1),
    
    /* 表示失败(手机号被注册)。 */
    EXIST(1001),
   
    /* 表示失败(验证码错误)。 */
    VERIFI(1002),
    
    /* 表示失败(参数错误)。 */
    PARAMETER(1003),

    /* 表示用户非法()。 */
    INVALID(1005);
    
    private Integer value;

    ResponseCode(Integer value){
        this.value = value;
    }

    @Override
    public String toString(){
        return value.toString();
    }

    public int getValue(){
        return value;
    }
}
