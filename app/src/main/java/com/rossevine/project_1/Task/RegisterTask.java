package com.rossevine.project_1.Task;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rossevine.project_1.RegisterActivity;
import com.rossevine.project_1.Wrapper.UserWrapper;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by LENOVO on 2/26/2018.
 */

public class RegisterTask extends AsyncTask<String, Void, UserWrapper> {
    private Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public RegisterTask(Context context) {
        this.context = context;
    }

    @Override
    protected UserWrapper doInBackground(String... strings) {
        Uri uri = Uri.parse("http://10.0.2.2/WSProjectMobile/Service/addUserService.php").buildUpon().build();
        UserWrapper userWrapper = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(uri.toString());
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setConnectTimeout(6000);
            StringBuilder stringBuilder = new StringBuilder("name=")
                    .append(URLEncoder.encode(strings[0], "UTF-8"))
                    .append("&email=")
                    .append(URLEncoder.encode(strings[1], "UTF-8"))
                    .append("&password=")
                    .append(URLEncoder.encode(strings[2], "UTF-8"));

            DataOutputStream outputStream = new DataOutputStream(urlConnection.getOutputStream());
            outputStream.writeBytes(stringBuilder.toString());
            outputStream.flush();
            outputStream.close();

            urlConnection.connect();
            int responseCode = urlConnection.getResponseCode();
            //System.out.println(responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
                ObjectMapper objectMapper = new ObjectMapper();
                userWrapper =
                        objectMapper.readValue(inputStream, UserWrapper.class);
                inputStream.close();

            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return userWrapper;
    }

    @Override
    protected void onPostExecute(UserWrapper userWrapper) {
        super.onPostExecute(userWrapper);
        ((RegisterActivity) context).openDataActivity(userWrapper);


    }
}
