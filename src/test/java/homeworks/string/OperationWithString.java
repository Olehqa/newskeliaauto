package homeworks.string;



import homework.string.OperationWIthUserInput;
import homework.string.ReadUserTextUtil;
import homework.string.model.OperationsWithStringModel;

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
змінити методи на гет якщо вони щось вертають
змінити безкінечні цикли
перейменувати змінні і методи на  логічні назви
змінити вічні цикли
змінити метод трім щоб пеервірка велась на два символи і дозволяла ввесит знову перший символ при помилці



Задачка

треба написати такі класи:
людина
 працівник
 компанія
 поля довільні  просто логічно  функції поки що теж тдовільні


 */



public class OperationWithString {


    public static void main(String[] args) {
        OperationsWithStringModel model = new OperationsWithStringModel ();

        /* Call the methods and set in model */

        new ReadUserTextUtil ();
        model.setSentence ( ReadUserTextUtil.getStringFromConsole () );

//        System.out.println ("getSentence method 1 " + m.getSentence ());

        model.setSentenceLength ( OperationWIthUserInput.getTextLength ( model.getSentence () ) );

        model.setCountLetters ( OperationWIthUserInput.countLetters ( model.getSentence () ) );

        model.setChangeSymbolFromOldToNewOne ( OperationWIthUserInput.changeSymbolFromOldToNew ( model.getSentence () ) );

        model.setStringToArray ( OperationWIthUserInput.sentenceToArray ( model.getSentence () ) );

        model.setTextFromTo ( OperationWIthUserInput.getPartOfSentence ( model.getSentence () ) );

        OperationWIthUserInput.getIndexOfSymbols ( model.getSentence () );

        model.setReverseSentence ( OperationWIthUserInput.viceVersa ( model.getSentence () ) );

        model.setSmallLT ( OperationWIthUserInput.toLoverCase ( model.getSentence () ) );

        model.setBigLT ( OperationWIthUserInput.toUpperCase ( model.getSentence () ) );

    }
}




