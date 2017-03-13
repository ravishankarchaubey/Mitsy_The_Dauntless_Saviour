package game.android.com.mitsy_the_dauntless_saviour;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

    Button play,inst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.play);
        inst=(Button)findViewById(R.id.inst);
        play.setOnClickListener(this);
        inst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(play))
        {
            Intent intent=new Intent(this,QuestionActivity.class);
            startActivity(intent);
            //finish();
        }
        else
        if(v.equals(inst))
        {
            Intent intent=new Intent(this,InstActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
