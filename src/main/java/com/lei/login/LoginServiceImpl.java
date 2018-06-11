package com.lei.login;

import com.lei.thrift.LoginService;
import com.lei.thrift.Request;
import com.lei.thrift.RequestException;
import org.apache.thrift.TException;

public class LoginServiceImpl implements LoginService.Iface{

    @Override
    public String doAction(Request request) throws RequestException, TException {
        System.out.println("username: " + request.getUsername());
        System.out.println("password: " + request.getPassword());
        return "success";
    }
}
