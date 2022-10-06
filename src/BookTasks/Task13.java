package BookTasks;

public class Task13 {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook();
        book1.createValues("123", "456", "c#", 2,1);

        ProgrammerBook book2 = new ProgrammerBook();
        book2.createValues("123", "456", "c#", 2,2);

        printResult(book2.equals(book1));
        System.out.println(book2.hashCode());

        System.out.println(book2.toString());
    }

    private static void printResult(boolean bool){
        if(bool){
            System.out.println("Objects are equal");
        }else{
            System.out.println("Objects are not equal");
        }
    }
}
    class ProgrammerBook extends Book {
        private String language;
        private int level;


        public void createValues(String title,String author,String language, int level,int isbn){
            this.createValues(title,author,isbn);

            this.language=language;
            this.level = level;

        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }

            ProgrammerBook object = (ProgrammerBook)obj;

            if(object.GetTitle().equals(this.GetTitle()) && object.GetAuthor().equals(this.GetAuthor()) &&
                    object.GetPrice()==this.GetPrice() && object.GetEdition()==this.GetEdition()
                    && object.language.equals(this.language) && object.level==this.level)
                return true;

            return false;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + ((GetTitle() == null) ? 0 :GetTitle().hashCode());
            result = 31 * result + ((GetAuthor() == null) ? 0 :GetAuthor().hashCode());
            result = 31 * result + GetPrice();
            result = 31 * result + GetEdition();
            result = 31 * result +  ((language == null) ? 0 :language.hashCode());
            result = 31 * result + level;
            return result;
        }

        @Override
        public String toString() {
            String result = "Title: " + GetTitle().toString() +"\n";
            result+= "Author: " + GetAuthor().toString() +"\n";
            result+= "Price: " + GetPrice() +"\n";
            result+= "Edition: " + GetEdition() +"\n";
            result+= "Language: " + language +"\n";
            result+= "Level: " + level +"\n";
            return result;
        }
    }

