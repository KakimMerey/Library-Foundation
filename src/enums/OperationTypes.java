package enums;

/**
 * Created by Kakim on 05.09.2017.
 */
public enum OperationTypes {

    VIEW_REGISTERED_EDITIONS_IN_THE_FUND(1, "Просмотр зарегистрированных изданий в фонде"),
    ADDING_NEW_EDITION(2, "Добавление нового издания в фонд"),
    VIEW_INFORMATION_OF_THE_SELECTED_EDITION(3, "Просмотр информации выбранного издания"),
    REMOVE_SELECTED_EDITION(4, "Удаление выбранного издания"),
    EXIT(5, "Выход");

    private final int id;
    private final String name;

    OperationTypes(final int id, final String name) {
        this.id = id;
        this.name = name;
    }


    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
