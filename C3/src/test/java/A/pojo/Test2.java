package A.pojo;
import com.A.Delete;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


import java.io.*;


import static com.A.Delete.deletearea;
import static com.A.Delete.deletecoun;

public class Test2 {


    public static void main(String[] args) throws IOException {
        deletearea("1");
        deletecoun("Japan");

    }
}