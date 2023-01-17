package 암호체크;

public class PwdCheckClass {


    boolean validlength(String pwd){
        if(10<=pwd.length()&&pwd.length()<=30) return true;
        else return false;
    }
    boolean validNumber(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;

        }
        return false;
    }
    boolean validUpper(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') return true;
        }
        return false;
    }
    boolean validLower(String pwd){
        for(int i =0; i < pwd.length();i++){
            if(pwd.charAt(i) >='a' && pwd.charAt(i)<='z') return true;
        }
        return false;
    }
    boolean validRex(String pwd) {
        String specialLetter= "!,%,_,#,&,+,-,*,/";
        for(int i = 0; i < specialLetter.length(); i ++){
            for(int j = 0; j <pwd.length(); j++) {
                if(specialLetter.charAt(i) == pwd.charAt(j)) return true;
            }
        }
        return false;
    }

}
