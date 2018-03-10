package example.com.sights;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class Pop extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);
    }
}
