package com.shan.excel.utils;

import com.shan.common.Common;

/**
 * Created by shanlehong on 2017/5/8.
 */
public class Util {
    /**
     * get postfix of the path
     * @param path
     * @return
             */
    public static String getPostfix(String path) {
        if (path == null || Common.EMPTY.equals(path.trim())) {
            return Common.EMPTY;
        }
        if (path.contains(Common.POINT)) {
            return path.substring(path.lastIndexOf(Common.POINT) + 1, path.length());
        }
        return Common.EMPTY;
    }
}
