package com.hq.future.utils;

import java.util.UUID;

/**
 * Created by lijiang on 2017/2/24.
 */
public class UUIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
