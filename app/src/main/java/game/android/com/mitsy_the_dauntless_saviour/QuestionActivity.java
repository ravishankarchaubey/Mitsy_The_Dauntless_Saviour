package game.android.com.mitsy_the_dauntless_saviour;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuestionActivity extends Activity implements View.OnClickListener{

    String dt[][]={
            {"What is the correct name for the Nerve cell?","Neuron","Responder","Senses","Muscles","Neuron"},
            {"Which blood group is called Universal donor?","Group A","Group B","Group O", "Group AB","Group O"},
            {"How many chromosomes are there in Human gene?","23","46","12", "67","46"},
            {"Where are villi not found?","Jejunum","Ileum","Colon", "Duedenum","Ileum"},
            {"Which is the smallest bone in the body?","patella","stirrup","hammer", "femur","femur"},
            {"What are your nails made of?","Gelatin","Keratin","Chloestrol", "calcium","Keratin"},
            {"A foetus acquires fingerprints at what age?","immediately","9 months","3 months", "6 months","3 months"},
            {"Which of these diseases is airborne?","Bronchitis","Arithritis","Malaris","Lung cancer","Bronchitis"},
            {"What is the hardest substance in the human body?", "tooth enamel","bone","keratin","bile juice","tooth enamel"},
            {"What is the powerhouse of the cell","Mitochondria","Cell wall","Nucleus","Dentrites","Mitochondria"},

            {"Which one of these has the lowest density?","water","cork","glass","milk","cork"},
            {"Which temperature has same value in both Celsius and Farenheit?","0","-40","37", "273","-40"},
            {"Which of these has the highest density?","lead","mercury","juice", "tungsten","tungsten"},
            {"What can't sound travel through?","vacuum","steel walls","mountain", "titanium","vacuum"},
            {"What is the name of the magnetic iron ore once used as a primitive compass?","Pewter","Keeper","Soft Iron", "Lodestone","Lodestone"},
            {"What is the SI unit of time?","second","month","year", "eon","second"},
            {"Who won Two Nobel Prizes for her work in physics and chemistry?","Catherine Curry","Marie Curie","Edwina Einstein", "Madam Orsloff","Marie Curie"},
            {"Which of these diseases is airborne?"," Bronchitis","Arithritis","Malaris","Lung cancer","273K"},
            {"What is the distance between two consecutive crests of a wave called?", "tide name","wavelength","period","bars","wavelength"},
            {"What is the SI unit of Force","Newton","Pascal","Hertz","Decibal","Newton"},

            {"Which one of the following is also called Stranger Gas?","Neon","Argon","Xenon","Nitrous Oxide"},
            {"Which of these is also called Common Salt?","NaCl","HCl","KCl","H20","NaCl"},
            {"Who is regarded as father of modern Chemistry?","Rutherford","Einstein","Lavoisier","C.V.Raman","Lavoisier"},
            {"Which is not type of Elements?","Metals","Non-Metals","Metalloids","Gases","Gases"},
            {"Which acid is present in lemon?","Marlic Acid","Citric Acid","Lactic Acid","Tartaric acid","Citric Acid"},
            {"What is the first element on the periodic table","Hydrogen","Helium","Lithium","Magnesium","Hydrogen"},
            {"What is the third most common gas found in the air we breath","Helium","Argon","Oxygen","Nitrogen","Argon"},
            {"Famous New Zealand scientist Ernest Rutherford was awarded a Nobel Prize in which field?","Chemistry","Modern Physics","Organic Chemistry","Biology","Chemistry"},
            {"Atoms of the same chemical element that have different atomic mass are known as?","Isotopes","Isotones","Isobars","Isomorphic","Isotopes"},
            {"What is Sodium Hydroixide(NaOH)?","Acid","Base","Salt","Anion"}
    };
    TextView que,sc,tlevel;
    Button ans1,ans2,ans3,ans4;
    int level,score,id,flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        que=(TextView)findViewById(R.id.que);
        sc=(TextView)findViewById(R.id.sc);
        tlevel=(TextView)findViewById(R.id.level);
        ans1=(Button)findViewById(R.id.ans1);
        ans2=(Button)findViewById(R.id.ans2);
        ans3=(Button)findViewById(R.id.ans3);
        ans4=(Button)findViewById(R.id.ans4);
        ans1.setOnClickListener(this);
        ans2.setOnClickListener(this);
        ans3.setOnClickListener(this);
        ans4.setOnClickListener(this);
        level=0;
        score=0;
        Random generator=new Random();
        id=level*10+ generator.nextInt(10);
        /*id=generator.nextInt(10);
        id=id%10;
        id+=level*10;*/
        que.setText(dt[id][0]);
        ans1.setText(dt[id][1]);
        ans2.setText(dt[id][2]);
        ans3.setText(dt[id][3]);
        ans4.setText(dt[id][4]);
    }


    @Override
    public void onClick(View v) {
        if(v.equals(ans1))
        {
            String ans=ans1.getText().toString();
            if(ans.equals(dt[id][5]))
            {
                flag=1;
                score++;
                sc.setText("Score : "+score);
            }
        }
        else if(v.equals(ans2))
        {
            String ans=ans2.getText().toString();
            if(ans.equals(dt[id][5]))
            {
                flag=1;
                score++;
                sc.setText("Score : "+score);
            }
        }
        else if(v.equals(ans3))
        {
            String ans=ans3.getText().toString();
            if(ans.equals(dt[id][5]))
            {
                flag=1;
                score++;
                sc.setText("Score : "+score);
            }
        }
        else if(v.equals(ans4))
        {
            String ans=ans4.getText().toString();
            if(ans.equals(dt[id][5]))
            {
                flag=1;
                score++;
                sc.setText("Score : "+score);
            }
        }
        if(flag==1)
        {
            /*AlertDialog.Builder b=new AlertDialog.Builder(this);
            b.setTitle("Congrats");
            b.setMessage("Continue");
            b.setPositiveButton("OK", null);
            b.show();*/
            Toast toast=Toast.makeText(this,"Correct Answer",Toast.LENGTH_SHORT);
            toast.show();
            if(score/10>level)
            {
                level++;
                tlevel.setText("Level : "+level);
            }
            playnext();
        }
        else
        {
            AlertDialog.Builder b=new AlertDialog.Builder(this);
            b.setTitle("You Missed");
            b.setMessage("Try Again");
            b.setPositiveButton("OK", null);
            b.show();
        }

    }
    public  void playnext()
    {
        Random generator=new Random();
        id=generator.nextInt(10);
        id=id%10;
        id+=level*10;
        que.setText(dt[id][0]);
        ans1.setText(dt[id][1]);
        ans2.setText(dt[id][2]);
        ans3.setText(dt[id][3]);
        ans4.setText(dt[id][4]);
        flag=0;
    }
}
