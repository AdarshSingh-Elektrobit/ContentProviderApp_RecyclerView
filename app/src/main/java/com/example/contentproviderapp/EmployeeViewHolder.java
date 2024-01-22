package com.example.contentproviderapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder{

    TextView Username, designation, name,salary;
    View view;
    public EmployeeViewHolder(@NonNull View itemView) {
        super(itemView);

        Username = itemView.findViewById(R.id.employee_Username);
        designation = itemView.findViewById(R.id.employee_designation);
        name = itemView.findViewById(R.id.employee_name);
        salary =itemView.findViewById(R.id.employee_salary);


        view = itemView;
    }
}
