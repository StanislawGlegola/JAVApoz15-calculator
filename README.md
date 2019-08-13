Kalkulator – zadania
1. Sforkuj repozytorium https://github.com/CKochanski/JAVApoz15-calculator. Będzie
stanowiło code base dla kolejnych zadań.
2. Sklonuj repozytorium ze swojego githuba z wykorzystaniem Intellij „Check out from
Version Control” i otwórz projekt.
3. Odszukaj klasę testową CalculatorTest, w katalogu src/test/java w pakiecie
pl.sda.spring, a następnie odpal test z wykorzystaniem Ctrl+Shift+F10 lub prawym
przyciskiem na nazwie klasy i „Run CalculatorTest”. Jeśli test przejdzie pozytywnie to
znaczy, że udało się poprawnie skonfigurować środowisko.
4. Dopisz test dla funkcjonalności odejmowania w klasie CalculatorTest o nazwie
shouldReturnExpectedResultForGivenArgumentsOnSubtractionOperation(). Aby tego
dokonać, należy dodać kolejną metodę, publiczną z typem zwracanym void
oznaczoną adnotacją @Test. Przy wywołaniu metody calculator.calculate(…) pamiętaj
o zmienieniu OperationType na OperationType.SUBTRACTION.
5. Analogicznie do zadania 4, dopisz test dla funkcjonalności mnożenia o nazwie
shouldReturnExpectedResultForGivenArgumentsOnMultiplicationOperation().
6. Dopisz funkcjonalność dzielenia. Zadeklaruj bean z wykorzystaniem adnotacji
@Component (podobnie jak w przypadku funkcjonalności dodawania). Aby tego
dokonać dodaj w enumie OperationType wartość Division. Następnie dodaj klasę
DivisionOperation w pakiecie pl.sda.spring.operation i zaimplementuj interfejs
Operation (jak w przypadku pozostałych operacji). W metodzie
getSupportedOperationType() zwróć OperationType.DIVISION. Pamiętaj o dzieleniu
przez 0!
7. Do funkcjonalności dzielenia dodaj test w klasie CalculatorTest analogicznie jak w
zadaniu 4.
8. Dopisz, analogicznie jak w zadaniu 6, funkcjonalność liczenia procentu z liczby o
nazwie PercentageOperation, gdzie pierwszym argumentem jest liczba, a drugim
wartość procentu. Zadeklaruj bean z wykorzystaniem klasy konfiguracyjnej
(analogicznie jak dla funkcjonalności odejmowania).
9. Do funkcjonalności liczenia procentu z liczby dodaj test w klasie CalculatorTest
analogicznie jak w zadaniu 4.
10. Dopisz, analogicznie jak w zadaniu 6, funkcjonalność liczenia potęgi liczby o nazwie
PowerOperation, gdzie pierwszym argumentem jest liczba, a drugim wartość potęgi.
Zadeklaruj bean z wykorzystaniem pliku application-beans.xml (analogicznie jak dla
funkcjonalności mnożenia).
11. Do funkcjonalności liczenia potęgi liczby dodaj test w klasie CalculatorTest,
analogicznie jak w zadaniu 4.
12. Spushuj zmiany do repozytorium.
