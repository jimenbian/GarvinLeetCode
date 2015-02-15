package No67.AddBinary;

public class Solution {
    public static String addBinary(String a, String b) {
        
     String lon= a.length()-b.length()>=0 ? a:b;
     String sho= a.length()-b.length()<0 ? a:b;
     char[] lon_char=lon.toCharArray();
     char[] sho_char=sho.toCharArray();
     char temp='0';
     int final_length=lon.length()-1;
     int index=0;
     String[] str=new String[lon.length()+1];
     String addBinary_str="";
     for(int i=0;i<sho.length();i++){
          String temp_s=String.valueOf(temp);
          String sho_char_s=String.valueOf(sho_char[sho.length()-1-i]);
          String lon_char_s=String.valueOf(lon_char[lon.length()-1-i]);
          switch(Integer.parseInt(temp_s)+Integer.parseInt(sho_char_s)+Integer.parseInt(lon_char_s))
          { case 0:
              temp='0';
              str[index++]="0";
              break;
            case 1:
              temp='0';
              str[index++]="1";
              break;
            case 2:
                temp='1';
                str[index++]="0";
                break;
            case 3:
                temp='1';
                str[index++]="1";
                break;
          }
     }
     while(index<lon.length()){
          String temp_s=String.valueOf(temp);
          String lon_char_s=String.valueOf(lon_char[lon.length()-index-1]);
          
          switch(Integer.parseInt(temp_s)+Integer.parseInt(lon_char_s))
          { case 0:
              temp='0';
              str[index++]="0";
              break;
            case 1:
              temp='0';
              str[index++]="1";
              break;
            case 2:
                temp='1';
                str[index++]="0";
                break;
          }
          
     }
     
     if(temp=='1'){
         str[lon.length()]="1";
         final_length=lon.length();
     }
     for(int k=final_length;k>=0;k--){
         addBinary_str+=str[k];
     }
        return addBinary_str;
    }
    public static void main(String[] args){
    	   System.out.print(addBinary("100","110010"));
    } 
}