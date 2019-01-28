package com.mjun.demo.example51;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ldoublem.loadingView.R;

import github.devwilliamzhang.library.mtransition.ITransitPrepareListener;
import github.devwilliamzhang.library.mtransition.MTransition;
import github.devwilliamzhang.library.mtransition.MTransitionManager;
import github.devwilliamzhang.library.mtransition.MTransitionView;
import github.devwilliamzhang.library.mtransition.MTranstionUtil;


/**
 * Created by huijun on 2018/4/8.
 */

public class Example51EntryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example51_entry);
        init();
    }

    private void init() {
        final View myContainer = findViewById(R.id.container);
        final ActionBtn btn = (ActionBtn) findViewById(R.id.enter_btn);
        btn.setProgress(0f);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MTransition transition = MTransitionManager.getInstance().createTransition("example");
                transition.fromPage().setContainer(myContainer, new ITransitPrepareListener() {
                    @Override
                    public void onPrepare(MTransitionView container) {
                        transition.fromPage().addTransitionView("btn", findViewById(R.id.enter_btn));
                    }
                });
                Intent intent = new Intent(Example51EntryActivity.this, Example51DetailActivity.class);
                startActivity(intent);
                MTranstionUtil.removeActivityAnimation(Example51EntryActivity.this);
            }
        });
    }
}
