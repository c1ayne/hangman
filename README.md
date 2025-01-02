# Hangman / Виселица

## Description / Описание
Task implementation / Реализация задания  
[TASK](https://zhukovsd.github.io/java-backend-learning-course/projects/hangman/)

## Description of the game / Описание игры
[EN]  
The computer guesses the word. A gallows with a noose is also drawn.

According to the tradition of Russian linguistic games, a word should be
a noun, a noun in the nominative singular,
or a plural if the word does not have a singular form.

You write a letter that can be included in this word.
If there is such a letter in a word, then the computer replaces the dash as many times
as it occurs in the word. If there is no such letter, then it is added to the gallows.
a circle in a loop representing a head. You keep guessing the letters until then.,
until he guesses the whole word. For each wrong answer, the computer adds
one part of the torso to the gallows (head, torso, 2 arms and 2 legs).

If the torso in the gallows is completely drawn, then you lose. If you
manage to guess the word, you win.  

[RU]  
Компьютер загадывает слово. Также рисуется виселица с петлёй.

Согласно традиции русских лингвистических игр, слово должно быть именем
существительным, нарицательным в именительном падеже единственного числа,
либо множественного числа при отсутствии у слова формы единственного числа.  

Вы пишете букву, которая может входить в это слово.
Если такая буква есть в слове, то компьютер заменяет черточку столько раз, 
сколько она встречается в слове. Если такой буквы нет, то к виселице добавляется
круг в петле, изображающий голову. Вы продолжаете отгадывать буквы до тех пор,
пока не отгадает всё слово. За каждый неправильный ответ компьютер добавляет
одну часть туловища к виселице (голова, туловище, 2 руки и 2 ноги).

Если туловище в виселице нарисовано полностью, то вы проигрываете. Если вам
удаётся угадать слово, вы выигрываете.