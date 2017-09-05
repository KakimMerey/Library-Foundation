package data;

import enums.LibraryDataType;

/**
 * Created by Kakim on 04.09.2017.
 */
public class LibraryData {
    private int id;        // Идентификатор записи
    private LibraryDataType type;      // Тип - брошюра, журнал или книга
    private String name;   // Наименование книги, журнала или брошюры
    //private Date date;     // (год/месяц/день) издательства
    private int year;
    private int pageCount; // Количество страниц
    private String isbn;   // Издательство

    public LibraryData() {
    }

    public LibraryData(LibraryDataType type, String name, int year, int pageCount, String isbn) {
        this.type = type;
        this.name = name;
        this.year = year;
        this.pageCount = pageCount;
        this.isbn = isbn;
    }



    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LibraryDataType getType() {
        return type;
    }

    public void setType(LibraryDataType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return "LibraryData{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                '}';
    }
}
