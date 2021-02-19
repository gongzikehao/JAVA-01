package com.zht.test;

import com.zht.jdbc.MyJDBCTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestJDBC {

    public static void main(String[] args) {
//        MyJDBCTemplate.simpleAdd("insert into t_stu (t_name,t_number) values ('zhang3','20200101')");
//        MyJDBCTemplate.simpleAdd("insert into t_stu (t_name,t_number) values ('li4','20200102')");
//        MyJDBCTemplate.simpleAdd("insert into t_stu (t_name,t_number) values ('zhao5','20200103')");
//        MyJDBCTemplate.simpleRemove("delete from t_stu where id=1");
//        MyJDBCTemplate.simpleModify("update t_stu set t_name='update1' where id=2");
//        List<Map<String, Object>> list = MyJDBCTemplate.simpleQuery("select * from t_stu");
//        for (Map<String, Object> map : list) {
//            System.out.println(map);
//        }
        List<String> sqlList = new ArrayList<>();
        sqlList.add("insert into t_stu (t_name,t_number) values ('111','111000')");
        sqlList.add("insert into t_stu (t_name,t_number) values ('222','222000')");
        sqlList.add("insert into t_stu (t_name,t_number) values ('333','333000')");
        MyJDBCTemplate.batchUpdate(sqlList);
    }
}
