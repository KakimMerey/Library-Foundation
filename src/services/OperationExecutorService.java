package services;

import data.LibraryData;
import enums.LibraryDataType;
import manager.LibraryDataManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by Kakim on 05.09.2017.
 */
public class OperationExecutorService {

    static LibraryDataManager manager = new LibraryDataManager();

    /**
     * Просмотр зарегистрированных изданий в фонд
     */
    public static void viewRegisteredEditions(List<LibraryData> datas) {
        datas.forEach(System.out::println);
    }

    /**
     * Добавление новой записи --------------------- OperationTypes.ADDING_NEW_EDITION
     * @throws IOException
     */
    public static void addingNewEdition(BufferedReader reader) throws IOException {
        LibraryData libraryData = new LibraryData();
        System.out.println("Заполните все поля для создания издания");
        System.out.print("Тип - брошюра, журнал или книга: " +
                "1) Книга   2) Журнал   3) Брошюра");
        int type = Integer.parseInt(reader.readLine());
        switch (type) {
            case 1:
                libraryData.setType(LibraryDataType.BOOK);
                break;
            case 2:
                libraryData.setType(LibraryDataType.JOURNAL);
                break;
            case 3:
                libraryData.setType(LibraryDataType.BROCHURE);
                break;
        }

        System.out.print("Наименование книги, журнала или брошюры: ");
        String name = reader.readLine();
        System.out.print("Год издательства, если это книга или же месяц и год издательства в случае журнала или брошюры: ");
        int year = Integer.parseInt(reader.readLine());
        System.out.print("Количество страниц: ");
        int pageCount = Integer.parseInt(reader.readLine());
        System.out.print("Издательство: ");
        String isbn = reader.readLine();

        LibraryData data = new LibraryData(libraryData.getType(), name, year, pageCount, isbn);

        manager.add(data);
    }
}
