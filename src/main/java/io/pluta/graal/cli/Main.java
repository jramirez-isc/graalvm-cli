package io.pluta.graal.cli;

import com.beust.jcommander.JCommander;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Arrays.asList(args));

        final Args parsedArgs = new Args();

        final JCommander jCommander = JCommander.newBuilder()
                .addObject(parsedArgs)
                .build();

        jCommander.setProgramName("Graal CLI 1.0.0");
        jCommander.parse(args);

        if(parsedArgs.isHelp()) {
            jCommander.usage();
        } else if(parsedArgs.isStatus()) {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("http://httpbin.org/status/200")
                    .build();

            Response response = client.newCall(request).execute();

            System.out.println(response.code());
        }
    }
}