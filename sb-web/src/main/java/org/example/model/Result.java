package org.example.model;

public class Result<T>{
    public int code = 0;
    public String msg = "成功";

    public T data;

    public static <T> Result<T> ok(T data){
        Result<T> result = new Result<>();
        result.data = data;
        return result;
    }

    public static Result<Object> error(String msg){
        Result<Object> result = new Result<>();
        result.code = -1;
        result.msg = msg;
        return result;
    }

    public static Result<Object> okMsg(String msg){
        Result<Object> result = new Result<>();
        result.msg = msg;
        return result;
    }
}
