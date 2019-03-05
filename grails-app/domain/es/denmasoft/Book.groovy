package es.denmasoft

class Book {

    String title
    String isbn

    static belongsTo = [author: Author]

    static constraints = {
        title nullable: false
        isbn nullable: true
    }

    String toString(){
        title
    }
}
