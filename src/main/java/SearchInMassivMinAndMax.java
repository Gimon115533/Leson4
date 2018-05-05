public class SearchInMassivMinAndMax {
    public static void main(String[] args) {
//создание заполнение массива
        double massiv[] = {10, -10, 9, -9, 8, -8, 7, -7, 6, -6, 5, -5, 4, -4, 3, -3, 2, -2, 1, -1};
//задаются переменные индекса мин и макс и сами значения
        int indexMin = 0;
        int indexMax = 0;
        double minValue, maxValue;
//поиск инндекса макс отрицательного и мин положительного значения
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 0) {
                do {
                    indexMax = i;
                }
                while (massiv[i] > massiv[indexMax]);

            } else if (massiv[i] < massiv[indexMin]) {
                indexMin = i;
            }
        }
        //Вывод найденных значений
        System.out.println("Индекс макисального отрицательного "+indexMax + " Значение " + massiv[indexMax] + " Индекс миниального положительного " + indexMin + " Значение " + massiv[indexMin]);
        //Присвоение праметраз значений найденных переменных
        minValue = massiv[indexMin];
        maxValue = massiv[indexMax];
        //Переназначение элементов масива
        massiv[indexMax]=minValue;
        massiv[indexMin]=maxValue;
        //Проверка переназначения
        System.out.println("Индекс макисального отрицательного "+indexMax + " Измененное значение " + massiv[indexMax] + " Индекс миниального положительного " + indexMin + " Измененное значение " + massiv[indexMin]);
    }
}