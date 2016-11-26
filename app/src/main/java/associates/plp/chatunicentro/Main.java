package associates.plp.chatunicentro;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends AppCompatActivity {
    private static Button button_sbm;
    public final static String EXTRA_MESSAGE = "com.example.chatunicentro.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListener();
    }
    public void onClickButtonListener(){
        button_sbm = (Button)findViewById(R.id.entrar);
        button_sbm.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("associates.plp.chatunicentro.SecondActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    // Called when the user clicks the Send button */
    //NAO FUNFA AINDA
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Menu.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        Intent secondActivity = new Intent(this, Menu.class);
        startActivity(secondActivity);
    }

    //NAO FUNFA AINDA
   public void startSecondActivity(View view) {

        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }

}
