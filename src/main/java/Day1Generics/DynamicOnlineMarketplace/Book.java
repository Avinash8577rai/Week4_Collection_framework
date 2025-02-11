package Day1Generics.DynamicOnlineMarketplace;

public class Book implements Category {
        private String genre;

        public Book(String genre) {
            this.genre = genre;
        }

        @Override
        public String getCategoryName() {
            return "Book - " + genre;
        }
    }
