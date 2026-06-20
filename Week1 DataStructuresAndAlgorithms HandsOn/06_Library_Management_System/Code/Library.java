public class Library {
    // Changed static data: Classic Literature theme
    Book[] books = {
            new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
            new Book(4, "The Hobbit", "J.R.R. Tolkien"),
            new Book(5, "Moby Dick", "Herman Melville"),
            new Book(6, "War and Peace", "Leo Tolstoy"),
            new Book(7, "Pride and Prejudice", "Jane Austen"),
            new Book(8, "The Catcher in the Rye", "J.D. Salinger")
    };

    public void displayBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    public void linearSearch(int id){
        for(Book book : books){
            if(book.getId() == id){
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void binarySearch(int id){
        int start = 0, end = books.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(books[mid].getId() == id){
                System.out.println(books[mid]);
                return;
            }else if(books[mid].getId() > id){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        System.out.println("Book not found");
    }
}