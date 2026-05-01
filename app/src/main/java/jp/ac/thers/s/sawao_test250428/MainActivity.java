package jp.ac.thers.s.sawao_test250428;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // start color pared

        FrameLayout layout = new FrameLayout(this);
        MyView myView = new MyView(this);

        Button redBtn = new Button(this);
        redBtn.setText("赤");
        redBtn.setBackgroundColor(Color.RED);

        Button bluBtn = new Button(this);
        bluBtn.setText("青");
        bluBtn.setBackgroundColor(Color.BLUE);

        Button greBtn = new Button(this);
        greBtn.setText("緑");
        greBtn.setBackgroundColor(Color.GREEN);

        FrameLayout.LayoutParams redParams = new FrameLayout.LayoutParams(200, 100);
        redParams.leftMargin = 50;
        redParams.topMargin = 200;
        redBtn.setLayoutParams(redParams);

        FrameLayout.LayoutParams bluParams = new FrameLayout.LayoutParams(200, 100);
        bluParams.leftMargin = 300;
        bluParams.topMargin = 200;
        bluBtn.setLayoutParams(bluParams);

        FrameLayout.LayoutParams greParams = new FrameLayout.LayoutParams(200, 100);
        greParams.leftMargin = 550;
        greParams.topMargin = 200;
        greBtn.setLayoutParams(greParams);

        redBtn.setOnClickListener(v -> myView.setColor(Color.RED));
        bluBtn.setOnClickListener(v -> myView.setColor(Color.BLUE));
        greBtn.setOnClickListener(v -> myView.setColor(Color.GREEN));

        layout.addView(myView);
        layout.addView(redBtn);
        layout.addView(bluBtn);
        layout.addView(greBtn);

        setContentView(layout);

        //end color pared

        /* Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }); */
    }

    @Override
    public void onClick(View v) {
        showToast("アプリ終了しました");
    }

    public void showToast(String string) {
        Toast t = Toast.makeText(
                this, string, Toast.LENGTH_SHORT);
        t.show();
    }
}

