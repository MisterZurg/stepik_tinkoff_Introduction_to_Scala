## Задача 1
Раскомментируйте строчку в методе fibs и допишите код так, чтобы метод возвращал число Фибоначчи по его порядковому номеру; а затем исправьте ошибку компиляции.


P.S. Данная реализация вычисления чисел Фибоначчи крайне неоптимальна (имеет временную сложность алгоритма до $Θ(φ^n)$)

Sample Input 1:

1
Sample Output 1:

1
Sample Input 2:

3
Sample Output 2:

2


Представьте, что банк решил подарить несколько долларов клиентам, которые держат на мультивалютном вкладе от 500$ и более.

Функция getGift: () => Int возвращает размер подарка (при тестировании передается на вход программе), а также выводит на экран фразу "The gift is received". Уже реализовано:
val getGift = () => {
      println("The gift is received")
      StdIn.readLine.toInt
 }
Метод sendGift принимает два аргумента: текущую сумму на счете и размер подарка, а затем суммирует их в соответствии с условием выше.
В массиве accountAmounts лежат текущие суммы вкладов клиентов, которые отображаются на новые значения.
Результат выводится в консоль:

val newAmounts = accountAmounts.map(amount => sendGift(amount, getGift())) 
println(newAmounts)
Задание: исправить код так, чтобы фраза  "The gift is received" выводилась на экран только в том случае, если клиент получает подарок.

Sample Input:

100
Sample Output:

The gift is received
The gift is received
List(100, 200, 600, 300, 800)