package homeworks.string;



import homeworks.string.model.OperationsWithStringModel;

/**
 * HomeworkString.OperationWithString
 * 26.11.2019
 * <p>
 * проаналізувати довільний тект, котрий можна ввести з консолі, вивести на еран:
 * DONE  1) Кількість символів в тектсі;
 * DONE  2) Кількість літер 'a';
 * DONE  3) Тесктс з заміненими всіма літерами 'a' на 'A';
 * DONE  4) Всі слова в вигляді масиву;
 * DONE  5) ЧАстину тестку від першої букви 'a' до останньої 'a';
 * DONE  6) Номери літер 'a' в тексті (індекси);
 * DONE  7) Стрічку задом наперед;
 * DONE  8) ВЕсь текст малими літерами;
 * DONE  9) Весь текст великими;
 * DONE  10) приведення
 * DONE  11) ^ символ
 */

/**
 * DONE  змінити методи на гет якщо вони щось вертають
 * DONE  змінити безкінечні цикли
 * DONE перейменувати змінні і методи на логічні назви
 * DONE змінити вічні цикли
змінити метод трім щоб пеервірка велась на два символи і дозволяла ввесит знову перший символ при помилці


  */



public class OperationWithString {


    public static void main(String[] args) {
        OperationsWithStringModel model = new OperationsWithStringModel ();

        /* Call the methods and set in model */

        new ReadUserTextUtil ();
        model.setSentence ( ReadUserTextUtil.getStringFromConsole () );

//        System.out.println ("getSentence method 1 " + m.getSentence ());

        model.setSentenceLength ( OperationWIthUserInput.getTextLength ( model.getSentence () ) );

        model.setCountLetters ( OperationWIthUserInput.getNumberOfSymbols ( model.getSentence () ) );

        model.setChangeSymbolFromOldToNewOne ( OperationWIthUserInput.getChangedSentenceWithNewSymbols ( model.getSentence () ) );

        model.setStringToArray ( OperationWIthUserInput.getArrOfCharsFromSentence ( model.getSentence () ) );

        model.setTextFromTo ( OperationWIthUserInput.getPartOfSentence ( model.getSentence () ) );

        OperationWIthUserInput.indexOfSymbols ( model.getSentence () );

        model.setReverseSentence ( OperationWIthUserInput.getSentenceViseVersa ( model.getSentence () ) );

        model.setSmallLT ( OperationWIthUserInput.getSentenceToLoverCase ( model.getSentence () ) );

        model.setBigLT ( OperationWIthUserInput.getSentenceToUpperCase ( model.getSentence () ) );

    }
}




