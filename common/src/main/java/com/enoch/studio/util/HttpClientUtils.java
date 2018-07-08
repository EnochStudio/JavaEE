package com.enoch.studio.util;

import com.enoch.studio.common.CustomerResponseEntity;
import com.enoch.studio.model.Command;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Created by Enoch on 2018/4/25.
 */
@Slf4j
public abstract class HttpClientUtils {

    private static HttpClientUtils[] utils = {new Get(), new Json(), new FormUrlencoded()};

    public static String get(String url, Map<String, Object> param) {
        return utils[0].doRequest(url, param, "get");
    }

    public static String postJson(String url, Map<String, Object> param) {
        return utils[1].doRequest(url, param, "post");
    }

    public static String postFormUrlencoded(String url, Map<String, Object> param) {
        return utils[2].doRequest(url, param, "post");
    }


    private String doRequest(String url, Map<String, Object> param, String method) {
        //创建httpclient对象
        CloseableHttpClient client = HttpClients.createDefault();

        String responseStr = null;

        CloseableHttpResponse response = null;

        try {

            if ("get".equalsIgnoreCase(method)) {

                //创建get方式请求对象
                HttpGet get = new HttpGet(url);

                //执行get请求
                response = client.execute(get);

            } else if ("post".equalsIgnoreCase(method)) {
                //创建post方式请求对象
                HttpPost post = new HttpPost(url);

                prepare(null, post, param);

                //执行post请求
                response = client.execute(post);
            } else {

            }

            responseStr = parse(response);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (client != null) {
                try {
                    //关闭连接释放资源
                    client.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        }

        System.out.println(responseStr);
        return responseStr;
    }


    protected void prepare(HttpGet get, HttpPost post, Map<String, Object> param) throws UnsupportedEncodingException {
    }

    protected String parse(CloseableHttpResponse response) throws IOException {
        if (null == response) return null;
        String responseStr = null;
        //获取响应消息实体
        HttpEntity entity = response.getEntity();

        //响应状态
        System.out.println("响应状态：" + response.getStatusLine());


        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            //状态码为200的情况
                /*
                使用EntityUtils.toString()会关闭流，所以如果想继续使用流的话，建议使用以下方法：
                InputStream in = null;
                try {
                    in = entity.getContent();
                    BufferedReader rd = new BufferedReader(new InputStreamReader(, "UTF-8"));
                    StringBuffer result = new StringBuffer();
                    String line = "";
                    while ((line = rd.readLine()) != null) {
                        result.append(line + "/n");
                    }
                } finally {
                    if (null != in) {
                        in.close();
                    }
                }
                */

            //判断响应实体是否为空
            if (entity != null) {
                responseStr = EntityUtils.toString(entity, "UTF-8");
            } else {
                responseStr = "";
            }
        } else {
            log.error("响应异常:{}", EntityUtils.toString(entity, "UTF-8"));
            responseStr = null;
        }
        return responseStr;
    }


    static class Get extends HttpClientUtils {
        @Override
        public void prepare(HttpGet get, HttpPost post, Map<String, Object> param) throws UnsupportedEncodingException {

        }

    }

    static class Json extends HttpClientUtils {
        @Override
        public void prepare(HttpGet get, HttpPost post, Map<String, Object> param) throws UnsupportedEncodingException {
            Gson gson = new GsonBuilder().create();
            StringBuilder sb = new StringBuilder();
            sb.append(gson.toJson(param));
            String json = sb.toString();

            //设置header信息
            post.setHeader("Content-Type", "application/json;charset=UTF-8");

            StringEntity se = new StringEntity(json, "UTF-8");
            se.setContentType("text/json");
            post.setEntity(se);
        }

    }

    static class FormUrlencoded extends HttpClientUtils {
        @Override
        public void prepare(HttpGet get, HttpPost post, Map<String, Object> param) throws UnsupportedEncodingException {
            //装填参数
            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
            if (param != null) {
                for (Entry<String, Object> entry : param.entrySet()) {
                    nvps.add(new BasicNameValuePair(entry.getKey(), String.valueOf(entry.getValue())));
                }
            }
            //设置header信息
            //指定报文头【Content-type】、【User-Agent】
            post.setHeader("Content-Type", "application/x-www-form-urlencoded");
            post.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

            //设置参数到请求对象中
            UrlEncodedFormEntity ue = new UrlEncodedFormEntity(nvps, "UTF-8");
            post.setEntity(ue);
        }

    }

}

