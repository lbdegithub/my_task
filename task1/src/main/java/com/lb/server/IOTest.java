package com.lb.server;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LiBin
 * @email libin@ellabook.cn
 * @date 2018-11-02 14:10
 **/
public class IOTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("aa", "123");
        map.put("aa", "aaa");
        System.out.println(map.get("aa"));
    }

}
