package ua.com.adr.android.beatboxactivity;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
