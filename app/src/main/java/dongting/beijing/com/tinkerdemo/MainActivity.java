package dongting.beijing.com.tinkerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");
                System.out.println("file = " + file.length());
                //加载补丁
                TinkerInstaller.onReceiveUpgradePatch(getApplicationContext(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/patch_signed_7zip.apk");

            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //toast
                Toast.makeText(MainActivity.this, "apk", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
