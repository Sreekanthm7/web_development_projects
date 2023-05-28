package substring;

public class StringIndex {
    String mainString;
     
    StringIndex(String mainString){
        this.mainString = mainString;
    }

    public String getMainString() {
        return mainString;
    }

    public void setMainString(String mainString) {
        this.mainString = mainString;
    }

    public int firstOccurence(char ch) {
        for(int i = 0; i < mainString.length(); i++) {
            if (ch == mainString.charAt(i)) {
                return i;
            }
        }
        return -1;
        }

        public int subStringIdx(String subString) {
            int index = -1;
            for (int i = 0; i < mainString.length(); i++) {
                String tempString = "";
    
                for (int j = i; j < i + subString.length(); j++) {
                    tempString += mainString.charAt(j);
                }
    
                if (tempString.equals(subString)) {
                    index = i;
                    break;
                }
            }
    
            return index;
        }

    }

