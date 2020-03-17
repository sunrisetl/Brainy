package servlet;

import org.json.Test;
import utils.BaseConnection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindUser {
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        this.doPost(request, response);
//    }
//    public void checkUser(HttpServletRequest request,HttpServletResponse response)
//            throws ServletException, IOException {
//        try{
//            Connection conn = BaseConnection.getConnection();
//            Statement stmt = conn.createStatement();
//            String user = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
////如果页面上输入的用户名为中文，则传输到后端来会乱码，这个是用来转码。
//            String password = request.getParameter("password");
//            String result = "";
//            String sql = "select*from tb_user where userName = '"+user+"'and password='"+password+"' ;";
////主要的数据库查询语句，判断用户名和密码是否匹配，如果匹配，则能查询到结果，如果不匹配，则查询为空。
//            System.out.println(sql);
//            ResultSet rs = stmt.executeQuery(sql);
//            if(rs.next()){
//                result = "0";
//            }else{
//                result = "1";
//            }
//            String string ="successCallback("+JSON.toJSONString(result,true).toString()+")";
//            response.setContentType("text/html;charset=UTF-8");
//            PrintWriter out = response.getWriter();
//            out.write(string);
//            System.out.println(string);
//            out.flush();
//            out.close();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
//    public void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        this.checkUser(request, response);
//    }
}
