package jp.ac.ecc.se.todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class todoNew_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_new);

        //画面上のパーツの宣言
        TextView title = findViewById(R.id.title2);
        Button clear = findViewById(R.id.clear);
        EditText memo2 = findViewById(R.id.memo2);
        ImageView photo2 = findViewById(R.id.photo2);
        Button register = findViewById(R.id.register);
       //  FloatingActionButton phototuika = findViewById(R.id.)





        //クリアを押した時、テキストクリア
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title.setText("");
            }
        });
    }
}