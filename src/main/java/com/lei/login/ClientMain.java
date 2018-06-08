package com.lei.login;

import com.lei.thrift.LoginService;
import com.lei.thrift.Request;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ClientMain {
    public static void main(String[] args) throws Exception {
        TTransport transport = new TSocket("localhost", 8888);
        TProtocol protocol = new TBinaryProtocol(transport);

        // 创建client
        LoginService.Client client = new LoginService.Client(protocol);

        transport.open();  // 建立连接

        // 第一种请求类型
        Request request = new Request().setUsername("liulongling").setPassword("123456");
        System.out.println(client.doAction(request));
        transport.close();  // 请求结束，断开连接
    }
}
