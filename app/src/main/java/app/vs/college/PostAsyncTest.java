package app.vs.college;

import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PostAsyncTest extends AsyncTask<String, Void, String> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.e("on pre execute", "on pre execute");
    }

    @Override
    protected String doInBackground(String... params) {
        String urlString = "https://jsonplaceholder.typicode.com/posts";
        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            InputStreamReader isw = new InputStreamReader(inputStream);

            int data = isw.read();
            while (data != -1) {
                result.append((char) data);
                data = isw.read();
            }

            Log.e("connection", result.toString());

        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Error", e.getMessage());
        }

        return result.toString();
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        Log.e("on post execute", result);
    }
}
