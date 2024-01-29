package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testFindQueryInSimpleTaskTrue() {
        SimpleTask task = new SimpleTask(1, "Прочитать книгу");

        boolean actual = task.matches("книгу");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindQueryInSimpleTaskFalse() {
        SimpleTask task = new SimpleTask(1, "Прочитать книгу");

        boolean actual = task.matches("статью");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindQueryInEpicTrue() {
        String[] subtasks = { "хлеб", "мука", "молоко", "йогург", "лук" };
        Epic epic = new Epic(25, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("лук");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindQueryInEpicFalse() {
        String[] subtasks = { "хлеб", "мука", "молоко", "йогург", "лук" };
        Epic epic = new Epic(25, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("сливки");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindQueryInMeetingTrue() {
        Meeting meeting = new Meeting(
                15,
                "Собеседование о работе",
                "Организация - Бургер-Кинг",
                "11:00"
        );

        boolean expected = true;
        boolean actual = meeting.matches("работе");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindQueryInMeetingTrue1() {
        Meeting meeting = new Meeting(
                13,
                "Собеседование о работе",
                "Организация - Бургер-Кинг",
                "11:00"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Организация");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindQueryInMeetingFalse() {
        Meeting meeting = new Meeting(
                13,
                "Собеседование о работе",
                "Организация - Бургер-Кинг",
                "11:00"
        );

        boolean expected = false;
        boolean actual = meeting.matches("море");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testFindQueryInTaskFalse() {
        Task task = new Task(18);

        boolean expected = false;
        boolean actual = task.matches("квартира");

        Assertions.assertEquals(expected, actual);
    }



}