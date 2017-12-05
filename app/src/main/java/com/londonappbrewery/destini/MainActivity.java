package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mRedButton;
    Button mBlueButton;
    TextView mTextView;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mRedButton = (Button) findViewById(R.id.buttonTop);
        mBlueButton = (Button) findViewById(R.id.buttonBottom);
        mTextView = (TextView) findViewById(R.id.storyTextView);





        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mRedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex++;
                if (mStoryIndex == 2) {
                    mTextView.setText(R.string.T3_Story);
                    mRedButton.setText(R.string.T3_Ans1);
                    mBlueButton.setText(R.string.T3_Ans2);
                } else if (mStoryIndex == 3) {
                    mTextView.setText(R.string.T6_End);
                    mRedButton.setVisibility(View.GONE);
                    mBlueButton.setVisibility(View.GONE);
                } else {
                    mTextView.setText(R.string.T3_Story);
                    mRedButton.setText(R.string.T3_Ans1);
                    mBlueButton.setText(R.string.T3_Ans2);
                    mStoryIndex = 2;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBlueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex--;
                if (mStoryIndex == 0) {
                    mTextView.setText(R.string.T2_Story);
                    mRedButton.setText(R.string.T2_Ans1);
                    mBlueButton.setText(R.string.T2_Ans2);
                } else if (mStoryIndex < 0) {
                    mTextView.setText(R.string.T4_End);
                    mRedButton.setVisibility(View.GONE);
                    mBlueButton.setVisibility(View.GONE);
                } else if (mStoryIndex == 1) {
                    mTextView.setText(R.string.T5_End);
                    mRedButton.setVisibility(View.GONE);
                    mBlueButton.setVisibility(View.GONE);
                }
            }
        });

    }
    
}
