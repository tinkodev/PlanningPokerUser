package com.example.planningpokerprojectuser.Objects;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.planningpokerprojectuser.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    Context context;
    ArrayList<Question> questions;
    public MyAdapter(Context c, ArrayList<Question> q){
        context = c;
        questions = q;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.questionview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.roomID.setText(questions.get(position).getQuestionID());
        Log.d("create1","HolderID: "+questions.get(position).getQuestionID());
        holder.roomQuestion.setText(questions.get(position).getQuestion());
        Log.d("create1","Holder:Question "+questions.get(position).getQuestion());
        holder.roomPass.setText(questions.get(position).getQuestionPASS());
        Log.d("create1","HolderPass: "+questions.get(position).getQuestionPASS());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder {

        TextView roomID,roomQuestion,roomPass;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            roomID = (TextView) itemView.findViewById(R.id.room_id);
            roomPass = (TextView) itemView.findViewById(R.id.room_pass);
            roomQuestion = (TextView) itemView.findViewById(R.id.room_question);
        }
    }
}
