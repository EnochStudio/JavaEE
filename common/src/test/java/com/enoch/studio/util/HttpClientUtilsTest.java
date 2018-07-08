package com.enoch.studio.util;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Enoch on 2018/4/25.
 */
public class HttpClientUtilsTest {
    @Test
    public void postJson() throws Exception {
    }

    @Test
    public void postForm() throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("page",1);
        map.put("pageSize",1);
//        HttpClientUtils.postJson("http://localhost:7080/aeta_middleware_DS/operationManagement/queryTerminalCommandInfo-33333", map);
        HttpClientUtils.postJson("http://localhost:7080/aeta_middleware_DS/operationManagement/queryTerminalCommandInfo-33333",map);
    }

}