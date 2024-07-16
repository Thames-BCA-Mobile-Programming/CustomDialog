package com.example.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class CustomDialog extends Dialog {


    EditText editText;
    Button myButton;
    public CustomDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.custom_dialog);
        editText = findViewById(R.id.dialog_et1);
        myButton = findViewById(R.id.dialog_btn);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Message from Dialog "+ editText.getText().toString(), Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
    }
}
