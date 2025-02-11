package Day1Generics.DynamicOnlineMarketplace;

public class Clothing implements Category {
        private String type;

        public Clothing(String type) {
            this.type = type;
        }

        @Override
        public String getCategoryName() {
            return "Clothing - " + type;
        }
}
