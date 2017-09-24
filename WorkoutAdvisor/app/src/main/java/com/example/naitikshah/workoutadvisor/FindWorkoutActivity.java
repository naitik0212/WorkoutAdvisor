package com.example.naitikshah.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.naitikshah.workoutadvisor.WorkoutExpert.WorkoutExpert.WorkoutExpert;

import java.util.List;

public class FindWorkoutActivity extends Activity {

    private WorkoutExpert expert= new WorkoutExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View view){

        TextView workouts=(TextView) findViewById(R.id.workout);

        Spinner workouttype = (Spinner) findViewById(R.id.workouttype);

        String workout=String.valueOf(workouttype.getSelectedItem());

        //workouts.setText(workout);

        List<String> workoutList=expert.getWorkouts(workout);

        StringBuilder workoutsformatted= new StringBuilder();

        for(String work: workoutList){
            workoutsformatted.append(work).append('\n');

        }
        workouts.setText(workoutsformatted);
    }
}
