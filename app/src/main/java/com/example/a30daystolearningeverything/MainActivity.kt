package com.example.a30daystolearningeverything

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daystolearningeverything.adapter.RecyclerAdapter
import com.example.a30daystolearningeverything.adapter.RecyclerModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private val recyclerModel: MutableList<RecyclerModel> = ArrayList()
    private lateinit var recyclerAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv_name)

        populateRecyclerModel()

        recyclerAdapter = RecyclerAdapter(this, recyclerModel)
        recyclerView.apply {
            adapter = recyclerAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun populateRecyclerModel() {
        recyclerModel.add(RecyclerModel("Day 1", "Set a Clear Goal", R.drawable.c1, "Define your learning goal: What exactly do you want to learn (e.g., basic coding, photography, a new language)?\n" +
                "\n" + "Write down why you want to learn it and what success looks like."))
        recyclerModel.add(RecyclerModel("Day 2", "Break Down the Goal", R.drawable.c2, "Break your goal into smaller, specific tasks (e.g., if learning guitar, break it down into chords, scales, and songs).\n" +
                "\n" + "Set weekly milestones to track progress."))
        recyclerModel.add(RecyclerModel("Day 3", "Find Resources", R.drawable.c3, "Gather learning materials: books, websites, courses, tutorials, etc.\n" +
                "\n" + "Organize them into a sequence based on difficulty or relevance to your goal."))
        recyclerModel.add(RecyclerModel("Day 4", "Familiarize Yourself", R.drawable.c4, "Spend time going over basic concepts.\n" +
                "\n" + "Get comfortable with the materials or tools you will be using (e.g., familiarize yourself with the camera if learning photography)."))
        recyclerModel.add(RecyclerModel("Day 5", "Create a Routine", R.drawable.c5, "Set a dedicated time for learning each day, aiming for at least 30-60 minutes.\n" +
                "\n" + "Prioritize this time in your schedule to build consistency.\n"));
        recyclerModel.add(RecyclerModel("Day 6", "Start Small", R.drawable.c6, "Tackle the most fundamental skill or concept.\n" +
                "\n" + "Focus on quality over quantity; mastery of the basics is key."))
        recyclerModel.add(RecyclerModel("Day 7", "Reflect and Review", R.drawable.c7, "Look back on the first week: What have you learned so far?\n" +
                "\n" + "Identify any difficulties and adjust your approach if necessary."))
        recyclerModel.add(RecyclerModel("Day 8", "Apply What You Learned", R.drawable.c8, "Practice hands-on: If learning to code, write a simple program; if learning a language, speak or write sentences.\n" +
                "\n" + "Don’t worry about mistakes; learning by doing is essential.\n"))
        recyclerModel.add(RecyclerModel("Day 9", "Deepen Your Understanding", R.drawable.c9, "Dive deeper into a specific aspect of your subject.\n" +
                "\n" + "Look for more advanced resources to explore that area in detail.\n"))
        recyclerModel.add(RecyclerModel("Day 10", "Seek Feedback", R.drawable.c10, "Share what you’ve done with others or ask for feedback from a mentor, friend, or online community.\n" +
                "\n" + "Learn from the feedback and adjust your approach.\n"));


        recyclerModel.add(RecyclerModel("Day 11", "Solve Problems", R.drawable.c11, "Focus on an area you find challenging.\n" +
                "\n" + "Use multiple sources to help tackle these problem areas (e.g., YouTube tutorials, discussion forums, etc.).\n"))
        recyclerModel.add(RecyclerModel("Day 12", "Repetition and Reinforcement", R.drawable.c12, "Repeat key exercises or concepts you’ve learned.\n" +
                "\n" + "Repetition helps solidify new knowledge and skills in your brain."))
        recyclerModel.add(RecyclerModel("Day 13", "Learn in Context", R.drawable.c13, "Immerse yourself in the subject through related content: watch videos, read articles, or interact with others in the field.\n" +
                "\n" + "Try to use your new knowledge in a real-world scenario."))
        recyclerModel.add(RecyclerModel("Day 14", "Review Week 2", R.drawable.c14, "Review your progress from the second week.\n" +
                "\n" + "Write down what’s working well and what you want to improve in Week 3."))
        recyclerModel.add(RecyclerModel("Day 15", "Tackle a Small Project", R.drawable.c15, "Start a small project to apply what you’ve learned so far.\n" +
                "\n" + "This could be a mini-assignment like writing a short story (for writing), a small app (for coding), or taking photos (for photography)."));
        recyclerModel.add(RecyclerModel("Day 16", "Build on Your Project", R.drawable.c16, "Expand your small project by adding new features or complexity.\n" +
                "\n" + "Focus on problem-solving and overcoming challenges as they arise."))
        recyclerModel.add(RecyclerModel("Day 17", "Challenge Yourself", R.drawable.c17, "Set a challenge that stretches your skills beyond your current level.\n" +
                "\n" + "This could be taking on a harder project or learning an advanced concept.\n"))
        recyclerModel.add(RecyclerModel("Day 18", "Focus on Weak Areas", R.drawable.c18, "Spend today focusing on any areas you still struggle with.\n" +
                "\n" + "Use a different learning technique (e.g., visual aids, hands-on practice, or group learning) to reinforce those areas.\n"))
        recyclerModel.add(RecyclerModel("Day 19", "Test Yourself", R.drawable.c19, "Give yourself a mini-quiz or practical test on what you’ve learned so far.\n" +
                "\n" + "Assess how well you understand key concepts and skills."))
        recyclerModel.add(RecyclerModel("Day 20", "Consolidate Knowledge", R.drawable.c20, "Review your notes, projects, or exercises from the past 20 days.\n" +
                "\n" + "Summarize key points in your own words or explain them to someone else."));


        recyclerModel.add(RecyclerModel("Day 21", "Week 3 Review", R.drawable.c21, "Reflect on your progress again, identifying areas of strength and weakness.\n" +
                "\n" + "Plan what you want to focus on in your final week."))
        recyclerModel.add(RecyclerModel("Day 22", "Work on a Bigger Project", R.drawable.c22, "Start a larger project that encompasses everything you’ve learned so far.\n" +
                "\n" + "Dedicate time over the next few days to complete this project."))
        recyclerModel.add(RecyclerModel("Day 23", "Collaborate or Teach", R.drawable.c23, "If possible, work with someone else who’s learning the same skill.\n" +
                "\n" + "Teach someone what you’ve learned; explaining concepts reinforces your understanding."))
        recyclerModel.add(RecyclerModel("Day 24", "Build Consistency", R.drawable.c24, "Focus on building consistency in the skill you’ve learned.\n" +
                "\n" + "Try to work faster or more efficiently while maintaining accuracy."))
        recyclerModel.add(RecyclerModel("Day 25", "Challenge Assumptions", R.drawable.c25, "Look at the knowledge or skills you’ve gained and challenge any assumptions.\n" +
                "\n" + "Push yourself to explore different methods or ways of thinking within your field."));
        recyclerModel.add(RecyclerModel("Day 26", "Prepare for Mastery", R.drawable.c26, "Start revising and perfecting your final project.\n" +
                "\n" + "Focus on refining the details and adding finishing touches."))
        recyclerModel.add(RecyclerModel("Day 27", "Test in Real Situations", R.drawable.c27, "Put your skill or knowledge to use in a real-world setting.\n" +
                "\n" + "For example, if learning public speaking, give a short talk; if learning a programming language, deploy a working app.\n"))
        recyclerModel.add(RecyclerModel("Day 28", "Seek External Validation", R.drawable.c28, "Share your final project or demonstrate your skills to others.\n" +
                "\n" + "Get feedback from people experienced in your field."))
        recyclerModel.add(RecyclerModel("Day 29", "Reflect on the Journey", R.drawable.c29, "Reflect on how far you’ve come in the last 30 days.\n" +
                "\n" + "Write down what you’ve learned, what you still want to improve, and how you’ll continue growing in the future.\n"))
        recyclerModel.add(RecyclerModel("Day 30", "Celebrate and Plan Next Steps", R.drawable.c30, "Celebrate your progress! Completing 30 days of learning is an achievement.\n" +
                "\n" + "Decide whether to continue mastering this subject or move on to another challenge."));



    }
}
