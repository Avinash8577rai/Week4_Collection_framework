package Day5.Regex.ExtractionProblems.ReplaceSpace;

public class ReplaceSpace {

        public static String normalizeSpaces(String text) {
            if (text == null) return null; // Handle null case
            return text.replaceAll("\\s+", " ").trim(); // Replace multiple spaces with a single space
        }
    }

