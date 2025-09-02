
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        char[] charArray = identifier.toCharArray();
        List<String> kebabPatterns = new ArrayList<>();
        //identifier = identifier.replace(' ', '_');
        //identifier = identifier.replaceAll("-\\s", identifier)
        
        for(int i=0; i<charArray.length; i++){

            switch (charArray[i]) {
                case ' ' -> charArray[i]='_';
                case '-' -> {
                    Pattern pattern = Pattern.compile("^[a-z]");
                    Matcher mattcher = pattern.matcher(Character.toString(charArray[i+1]));
                    if(mattcher.find()){
                        kebabPatterns.add("-"+Character.toString(charArray[i+1]));             
                    }          
                }
                case '4'-> charArray[i]='a';
                case '3' -> charArray[i]='e';
                case '0' -> charArray[i]='o';
                case '1' -> charArray[i]='l';
                case '7' -> charArray[i]='t';
                default -> {
                    // if character is not a number or a letter between a-z A-Z convert to @
                    Pattern pattern = Pattern.compile("[a-zA-Z|\\d|_|-]");
                    Matcher matcher = pattern.matcher(Character.toString(charArray[i]));
                    if(!matcher.find()){
                        charArray[i] = '@';
                    }
                }
            }
        }

        identifier = new String(charArray);

        // replace kebab cases
        if(!kebabPatterns.isEmpty()){
            System.out.println("This is the list of kebab patterns: "+kebabPatterns.toString());
            for(String pattern : kebabPatterns){
                identifier = identifier.replace(pattern, Character.toString(pattern.charAt(1)).toUpperCase());
            }
        }

        //remove all characters that are not letters or numbers by replacing all @
        identifier = identifier.replace("@", "");
        
        return identifier;
    }
}
