package jp.techacademy.kousuke.koizumi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human= new Human("浦島太郎", 724,"竜宮城");     // ★Humanのインスタンスを作る★

        human.say();

        human.think();     // ★thinkメソッド★

    }

}