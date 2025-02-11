package Day1Generics.DynamicOnlineMarketplace;

public class Gadget implements Category {
        private String type;

        public Gadget(String type) {
            this.type = type;
        }

        @Override
        public String getCategoryName() {
            return "Gadget - " + type;
        }
}
