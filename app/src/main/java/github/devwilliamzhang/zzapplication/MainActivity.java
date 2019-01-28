package github.devwilliamzhang.zzapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.ldoublem.loadingView.Lemonhello;
import com.ldoublem.loadingView.Main;
import com.mjun.demo.EnterActivity;

import org.wuhenzhizao.LaunchActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void titilebar(View view) {
        Intent intent = new Intent(this, LaunchActivity.class);
        startActivity(intent);
    }

    public void loadingview(View view) {
        Intent intent = new Intent(this, com.ldoublem.loadingView.MainActivity.class);
        startActivity(intent);
    }

    public void lemonhello(View view) {
        Intent intent = new Intent(this, Lemonhello.class);
        startActivity(intent);
    }

    public void bottomsheet(View view) {
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }
    public void enterActivity(View view) {
        Intent intent = new Intent(this, EnterActivity.class);
        startActivity(intent);
    }

    public void catlog(View view) {
        Intent intent = new Intent(this, com.zy.logcatdemo.MainActivity .class);
        startActivity(intent);
    }

    public void crash(View view) {

        Intent intent = new Intent(this, com.simple.MainActivity.class);
        startActivity(intent);
    }
}
