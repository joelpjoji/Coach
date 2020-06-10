package com.joey.coach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.View;
import android.widget.GridLayout.LayoutParams;
import android.widget.LinearLayout;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private OnboardingAdapter onboardingAdapter;
    private LinearLayout layoutOnboardingIndicators;
    private MaterialButton buttonOnboardingAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutOnboardingIndicators = findViewById(R.id.layoutOnboardingIndicators);
        buttonOnboardingAction = findViewById(R.id.buttonOnboardingAction);

        setOnboardingItems();
        final ViewPager2 onboardingViewPAger = findViewById(R.id.onboardingViewPager);
        onboardingViewPAger.setAdapter(onboardingAdapter);
        setOnboardingIndicators();
        setCurrentOnboardingIndicator(0);
            onboardingViewPAger.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
                @Override
                public void onPageSelected(int position) {
                    setCurrentOnboardingIndicator(position);
                }
            });
            buttonOnboardingAction.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onboardingViewPAger.getCurrentItem()+1 <onboardingAdapter.getItemCount()){
                        onboardingViewPAger.setCurrentItem(onboardingViewPAger.getCurrentItem()+1);
                    }else {
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class ));
                        finish();

                    }
                }
            });


    }

    private void setOnboardingItems() {
        List<OnboardingItem> onboardingItems = new ArrayList<>();
        OnboardingItem itemchess = new OnboardingItem();
        itemchess.setTitle("Win Your Games");
        itemchess.setDescription("You can study with the best tutor in the country.");
        itemchess.setImage(R.drawable.chess);

        OnboardingItem itemguitar = new OnboardingItem();
        itemguitar.setTitle("Study with Your Favourite Mentor");
        itemguitar.setDescription("Ask your doubts from anywhere , even if you're halfway across the world.");
        itemguitar.setImage(R.drawable.guitar);

        OnboardingItem itemduck = new OnboardingItem();
        itemduck.setTitle("Do something Extra ");
        itemduck.setDescription("It Improves concentration and spatial awareness.");
        itemduck.setImage(R.drawable.duck);


        OnboardingItem itembrush = new OnboardingItem();
        itembrush.setTitle("Enjoy Yourself");
        itembrush.setDescription("Everything feels a lot easier with a refreshed mind and body.");
        itembrush.setImage(R.drawable.brush);

        onboardingItems.add(itemchess);
        onboardingItems.add(itemguitar);
        onboardingItems.add(itemduck);
        onboardingItems.add(itembrush);
        onboardingAdapter = new OnboardingAdapter(onboardingItems);


    }

    private void setOnboardingIndicators() {

        ImageView[] indicators = new ImageView[onboardingAdapter.getItemCount()];
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(8, 0, 8, 0);
        for (int i = 0; i < indicators.length; i++) {

            indicators[i] = new ImageView((getApplicationContext()));
            indicators[i].setImageDrawable(ContextCompat.getDrawable(
                    getApplicationContext(),
                    R.drawable.onboarding_indicator_inactive
            ));
            indicators[i].setLayoutParams(layoutParams);
            layoutOnboardingIndicators.addView(indicators[i]);

        }
    }

    private void setCurrentOnboardingIndicator(int index) {
        int ChildCount = layoutOnboardingIndicators.getChildCount();
        for (int i = 0; i < ChildCount; i++) {
            ImageView imageView = (ImageView) layoutOnboardingIndicators.getChildAt(i);
            if (i == index) {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_active)
                );
            } else {
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(getApplicationContext(), R.drawable.onboarding_indicator_inactive)
                );
            }
        }
        if(index ==onboardingAdapter.getItemCount()-1){
            buttonOnboardingAction.setText("Start");
        }else{
            buttonOnboardingAction.setText("Next");
        }
    }
}





