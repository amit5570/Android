package sycs69.prac7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnClick(View v){
        if(v.getId() == R.id.btnAction){
            Intent i= new  Intent(this,Action.class);
                    startActivity(i);
        }
    }
}
