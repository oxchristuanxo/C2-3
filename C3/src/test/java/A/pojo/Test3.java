package A.pojo;

import com.A.Get;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static com.A.Get.Getarea;
import static com.A.Get.Getcoun;
import static com.A.Httpapi.httpGet;

public class Test3 {

    public static void main(String[] args) throws IOException {
        Getcoun(httpGet("https://covid-api.mmediagroup.fr/v1/cases"));
        Getarea(httpGet("https://covid-api.mmediagroup.fr/v1/cases"));
    }


}
