package kr.hs.emirim.s2125.mirim_project_0726_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgV;
    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgV = findViewById(R.id.imgV);
        edit=findViewById(R.id.edit);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item1:
                imgV.setImageResource(R.drawable.b63);
                item.setChecked(true); // 버튼체크
                return true;
            case R.id.item2:
                imgV.setImageResource(R.drawable.sh);
                item.setChecked(true);
                return true;
            case R.id.item3:
                imgV.setImageResource(R.drawable.s12);
                item.setChecked(true);
                return true;
            case R.id.btn:
                imgV.setRotation(Integer.parseInt(edit.getText().toString()));
                return true;

        }
        return false;
    }
}