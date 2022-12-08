package tw.edu.pu.s1090383.puonepiecev1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);


        //
        updatamyDB();

    }

    private void updatamyDB() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("s109999");

        //myRef.setValue("Hello, I am Jun Zhi");
        myRef.child("name").setValue("commit1");
        myRef.child("lat").setValue(24.778899);
        myRef.child("lng").setValue(120.44558899);
    }
}