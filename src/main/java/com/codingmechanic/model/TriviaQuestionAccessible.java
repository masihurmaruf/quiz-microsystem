package com.codingmechanic.model;

import java.util.List;

/**
 * Created by masihur on 4/1/17.
 */
public interface TriviaQuestionAccessible {

    /**
     * Returns a {@link TriviaQuestion} by index.
     *
     * @param index the index of the trivia question
     * @return an trivia question by index
     */
    TriviaQuestion getQuestionByIndex(long index);

    /**
     * Returns a {@link TriviaQuestion} by index.
     *
     * @param id the identifier of the trivia question
     * @return an trivia question by index
     */
    TriviaQuestion getQuestionById(long id);

    /**
     * Returns a random {@link TriviaQuestion}
     *
     * @return a random trivia question
     */
    TriviaQuestion getRandomQuestion();

    /**
     * Returns a list of at most 10 {@link TriviaQuestion} starting at the offset
     *
     * @param offset the starting point
     * @return a list of at most 10 questions starting the offset
     */
    List<TriviaQuestion> getQuestionList(long offset);

    /**
     * Returns a list of at most 10 {@link TriviaQuestion} starting at the offset
     *
     * @param id
     * @return a list of at most 10 questions starting the offset
     */
    List<TriviaQuestion> getSpecifiedQuestionList(long... id);

    /**
     * Returns the total number of {@link TriviaQuestion} in the database
     *
     * @return the number of trivia questions
     */
    long getQuestionListSize();
}
