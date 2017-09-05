package manager;

import data.LibraryData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kakim on 04.09.2017.
 */
public class LibraryDataManager {
    private List<LibraryData> datas = new ArrayList<>();


    /**
     * Добавление нового издания в фонд
     */
    public void add(LibraryData libraryData) {
        this.datas.add(libraryData);
    }

    /**
     * Удаление выбранного издания
     */
    public void delete(int id) {
        this.datas.remove(id);
    }


    // getters
    public List<LibraryData> getDatas() {
        return this.datas;
    }
}
