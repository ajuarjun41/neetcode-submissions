class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String s:strs){
           String l = String.valueOf(s.length());
           sb.append(l+'#'+s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> stringList = new ArrayList<>();
        int strLength = str.length();
        int startIndex =0;
        while(startIndex<strLength){
           int hash = str.indexOf('#',startIndex);
           int length = Integer.valueOf(str.substring(startIndex,hash));
           startIndex = hash+1;
           stringList.add(str.substring(startIndex,startIndex+length));
           startIndex = startIndex+length;

        }
        return stringList;

    }
}
