package noam.trafficlight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void carsClicked(View v) {
        Button cars = (Button) findViewById(R.id.carsButton);
        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            //whenPressOnCars
            public void onClick(View view) {
                //carsSetColor
                Button greenCars = (Button) findViewById(R.id.greenCars);
                greenCars.setBackgroundColor(getResources().getColor(R.color.green));
                Button redCars = (Button) findViewById(R.id.redCars);
                redCars.setBackgroundColor(getResources().getColor(R.color.defult));
                //WalkerSetColor
                Button redwalker = (Button) findViewById(R.id.redWalker);
                redwalker.setBackgroundColor(getResources().getColor(R.color.red));
                Button greenwalker = (Button) findViewById(R.id.greenWalker);
                greenwalker.setBackgroundColor(getResources().getColor(R.color.defult));
            }
        });
    }

    public void walkerClicked(View v) {
        Button walker = (Button) findViewById(R.id.walkerButton);
        walker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //WalkerSetColor
                Button greenWalker = (Button) findViewById(R.id.greenWalker);
                greenWalker.setBackgroundColor(getResources().getColor(R.color.green));
                Button redWalker = (Button) findViewById(R.id.redWalker);
                redWalker.setBackgroundColor(getResources().getColor(R.color.defult));
                //carsSetColor
                Button redCars = (Button) findViewById(R.id.redCars);
                redCars.setBackgroundColor(getResources().getColor(R.color.red));
                Button greenCars = (Button) findViewById(R.id.greenCars);
                greenCars.setBackgroundColor(getResources().getColor(R.color.defult));


            }
        });
    }
}