package com.example.android.topquiz.model;

import java.util.List;

public class QuestionBank {

    private List<Question> mQuestionList;
    private int mQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;
        // Shuffle the question list before storing it
    }

    public Question getCurrentQuestion() {
        return mQuestionList.get(mQuestionIndex);
        // Loop over the questions and return a new one at each call
    }
    public Question getNextQuestion() {
        mQuestionIndex++;
        return getCurrentQuestion();
    }
}

