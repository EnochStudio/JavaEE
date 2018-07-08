package com.enoch.studio.util;

import com.enoch.studio.common.CustomerResponseEntity;
import com.enoch.studio.model.Command;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Enoch on 2018/4/25.
 */
public class GsonUtilsTest {
    @Test
    public void fromJsonObject() throws Exception {
    }

    @Test
    public void fromJsonArray() throws Exception {
    }

    @Test
    public void parseJsonWithGson() throws Exception {
    }

    @Test
    public void parseJsonArrayWithGson() throws Exception {
        String str = "{\"code\":0,\"message\":\"执行成功\",\"data\":[{\"terminalID\":15,\"terminalName\":\"407-北大-武大-测试-20170829\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":0,\"command\":\"5424\",\"newFlag\":1},{\"terminalID\":17,\"terminalName\":\"17\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":1,\"command\":\"1\",\"newFlag\":0},{\"terminalID\":19,\"terminalName\":\"19\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":19,\"command\":\"reboot\",\"newFlag\":0},{\"terminalID\":20,\"terminalName\":\"20\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":20,\"command\":\"probe repower\",\"newFlag\":1},{\"terminalID\":21,\"terminalName\":\"21\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":21,\"command\":\"ls -l /opt/tftpd\",\"newFlag\":0},{\"terminalID\":22,\"terminalName\":\"22\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":22,\"command\":\"reboot\",\"newFlag\":0},{\"terminalID\":24,\"terminalName\":\"24\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":24,\"command\":\"ls -l /opt/tftpd\",\"newFlag\":0},{\"terminalID\":26,\"terminalName\":\"26\",\"time\":null,\"timeSave\":null,\"deviceNum\":0,\"deviceID\":26,\"command\":\"reboot\",\"newFlag\":0}]}";
        CustomerResponseEntity<List<Command>> entity = GsonUtils.fromJsonArray(str, Command.class);
        System.out.println("");
        Integer integer = Integer.valueOf("90");
        Integer integer2 = 90;
        System.out.println(integer == integer2);
        int i = Integer.parseInt("2");
    }

}