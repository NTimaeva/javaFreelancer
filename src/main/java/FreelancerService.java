package ru.netology.services;

public class FreelancerService {

<<<<<<< HEAD
    public int calculate(int income, int expenses, int threshold) {
        int balance = 0;
        int counter = 0;

        for (int i = 0; i < 12; i++) {

            if (balance >= threshold) {
                // отдыхаем
                balance -= expenses;
                balance /= 3;
                counter++;

            } else {
                //работаем
                //balance = balance + income;
                balance += income;
                balance -= expenses;
            }

        }
        return counter;
=======
public class FreelancerService {
  public int calculate(int income, int expenses, int threshold) {
    int balance = 0;
    int counter = 0;
    for (int i = 0; i < 12; i++) {
      if (balance >= threshold) {
        // отдыхаем
        balance -= expenses;
        balance /= 3;
        counter++;
      } else {
        //работаем
        // balance = balance + income;
        balance += income;
        balance -= expenses;
      }
>>>>>>> 918420f6e393700df3a582b50d118fa13a58f656
    }
    return counter;
  }
}
