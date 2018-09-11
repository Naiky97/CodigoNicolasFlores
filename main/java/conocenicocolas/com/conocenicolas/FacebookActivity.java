package conocenicocolas.com.conocenicolas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        WebView browser = (WebView) findViewById(R.id.webView);

        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // Cargamos la web
        browser.loadUrl("https://www.facebook.com/Turismo-Nicol%C3%A1s-Flores-1810557402543071/?fb_dtsg_ag=AdyyR4PB8_sHFBHfefI17hNDzZ-mkVPg7XzigpCjknc0PQ%3AAdxq21C5GNuWWuaA1no3jjzPT_wPlMDuNOZf3L6KckLVRA");

    }
}
