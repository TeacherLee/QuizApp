package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "A noun is the name of a  ?",

           "person",
           "place",
           "thing",
           "All of the above",
           4
       )
       var question2 = QuestionData(
           2,
           "Which of the following is a proper noun?",

           "dog",
           "man",
           "Statue of Liberty",
           "statue of freedom",
           3
       )
       var question3 = QuestionData(
           3,
           "The verb 'to be' is what kind of verb?",

           "action verb",
           "linking verb",
           "",
           "",
           2
       )
       var question4 = QuestionData(
           4,
           "An adjective can modify which of the following:",

           "noun or pronoun",
           "another adjective",
           "an adverb",
           "a conjunction",
           1
       )

       var question5 = QuestionData(
           5,
           "The Eiffel Tower is what kind of noun?",

           "Collective",
           "Common",
           "Compound",
           "Proper",
           4
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}