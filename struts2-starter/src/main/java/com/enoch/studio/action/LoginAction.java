package com.enoch.studio.action;

/**
 * Created by Enoch on 2018/4/26.
 */
public class LoginAction {
    private String name;
    private Integer age;
    private String result;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String login() {
        setResult("name:" + name);
        setResult(result + "&age=" + age);

        return "success";
    }
}
