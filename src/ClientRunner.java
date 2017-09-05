import data.LibraryData;
import enums.LibraryDataType;
import enums.OperationTypes;
import manager.LibraryDataManager;
import services.OperationExecutorService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kakim on 04.09.2017.
 */
public class ClientRunner {
    public static void main(String[] args) throws IOException, InterruptedException {
        LibraryDataManager manager = new LibraryDataManager();
        manager.add(new LibraryData(LibraryDataType.BOOK, "Адхимик", 1985, 55, "LA"));
        manager.add(new LibraryData(LibraryDataType.JOURNAL, "Адхимик1", 1986, 56, "LAPS"));
        manager.add(new LibraryData(LibraryDataType.BROCHURE, "Адхимик2", 1987, 58, "PPA"));

        for (OperationTypes operation : OperationTypes.values()) {
            System.out.println(operation.getId() + ") " + operation.getName());
        }


        System.out.print("Выберите операцию: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int chosenOperation = Integer.parseInt(reader.readLine());

        switch (chosenOperation) {
            case 1:
                // Просмотр зарегистрированных изданий в фонде
                OperationExecutorService.viewRegisteredEditions(manager.getDatas()); break;
            case 2:
                // Добавление нового издания в фонд
                OperationExecutorService.addingNewEdition(reader); break;
            case 3:
                // Просмотр информации выбранного издания
                System.out.println(""); break;
            case 4:
                // Удаление выбранного издания
                System.out.println(""); break;
            case 5:
                // Выход из системы
                System.exit(1); break;

            default:
                System.out.println("not chosen"); break;
        }

    }



}
