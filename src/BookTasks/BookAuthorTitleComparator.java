package BookTasks;

import java.util.Comparator;

class BookAuthorTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        int result = StringComparator.compare(o1.GetAuthor(), o2.GetAuthor());
        if (result == 0)
            result = StringComparator.compare(o1.GetTitle(), o2.GetTitle());

        return result;
    }
}
