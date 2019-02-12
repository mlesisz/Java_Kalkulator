package moj.kalkulator;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Liczenie {
    public String Liczenie(String rownanie,String RLubD){
        LinkedList<String> kolejka= new LinkedList<>();
        kolejka=ZamiananaONP(rownanie);
        Double a,b;
        LinkedList<Double> wyjscie= new LinkedList<>();
        while(!kolejka.isEmpty()){
            if (kolejka.getLast().equals("+")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                b=wyjscie.removeFirst();
                b+=a;
                wyjscie.push(b);
            }else if(kolejka.getLast().equals("-")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                b=wyjscie.removeFirst();
                b-=a;
                wyjscie.push(b);
            }else if (kolejka.getLast().equals("*")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                b=wyjscie.removeFirst();
                a=a*b;
                wyjscie.push(a);
            } else if(kolejka.getLast().equals("/")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                b=wyjscie.removeFirst();
                if(a==0){
                    return "Dzielenie przez zero!!!";
                }
                b=b/a;
                wyjscie.push(b);
            }else if(kolejka.getLast().equals("%")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                a=a/100;
                wyjscie.push(a);
            }else if(kolejka.getLast().equals("sqrt(")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                a=Math.sqrt(a);
                wyjscie.push(a);
            } else if(kolejka.getLast().equals("^")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                b=wyjscie.removeFirst();
                b=Math.pow(b,a);
                wyjscie.push(b);
            }else if(kolejka.getLast().equals("mod")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                b=wyjscie.removeFirst();
                b=b%a;
                wyjscie.push(b);
            }else if(kolejka.getLast().equals("log(")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                a=Math.log10(a);
                wyjscie.push(a);
            }else if(kolejka.getLast().equals("exp(")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                a=Math.exp(a);
                wyjscie.push(a);
            }else if(kolejka.getLast().equals("tan(")) {
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                if(RLubD.equals("Rad")) {
                    a=Math.tan(a);
                    wyjscie.push(a);
                }else if(RLubD.equals("Deg")){
                    a=Math.toRadians(a);
                    a=Math.tan(a);
                    wyjscie.push(a);
                }else {
                    return "Nie wybrałeś Deg czy Rad!!!";
                }
            }else if(kolejka.getLast().equals("tanh(")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                if(RLubD.equals("Rad")) {
                    a=Math.tanh(a);
                    wyjscie.push(a);
                }else if(RLubD.equals("Deg")){
                    a=Math.toRadians(a);
                    a=Math.tanh(a);
                    wyjscie.push(a);
                }else {
                    return "Nie wybrałeś Deg czy Rad!!!";
                }
            }else if(kolejka.getLast().equals("cos(")) {
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                if(RLubD.equals("Rad")) {
                    a=Math.cos(a);
                    wyjscie.push(a);
                }else if(RLubD.equals("Deg")){
                    a=Math.toRadians(a);
                    a=Math.cos(a);
                    wyjscie.push(a);
                }else {
                    return "Nie wybrałeś Deg czy Rad!!!";
                }
            }else if(kolejka.getLast().equals("sin(")){
                kolejka.removeLast();
                a=wyjscie.removeFirst();
                if(RLubD.equals("Rad")) {
                    a=Math.sin(a);
                    wyjscie.push(a);
                }else if(RLubD.equals("Deg")){
                    //a=Math.toRadians(a);
                    a=Math.sin(Math.toRadians(a));
                    wyjscie.push(a);
                }else {
                    return "Nie wybrałeś Deg czy Rad!!!";
                }
            } else if(kolejka.getLast().equals("PI")){
                kolejka.removeLast();
                wyjscie.push(Math.PI);
            } else{
                wyjscie.push(Double.parseDouble(kolejka.removeLast()));
            }
        }
        if(!wyjscie.isEmpty()) {
            return String.valueOf(wyjscie.remove());
        }else{
            return "";
        }
    }
    private LinkedList<String> ZamiananaONP(String rownanie){
        Priorytet priorytet= new Priorytet();
        Stack<String> stos=new Stack<>();
        LinkedList<String> kolejka= new LinkedList<>();
        int rozmiar=rownanie.length();
        char a;
        int i=0;
        while(i<rozmiar){
            a=rownanie.charAt(i);
            if(a>47 && a<58){
                String liczba="";
                liczba+=a;
                i++;
                while(i<rozmiar){
                    a=rownanie.charAt(i);
                    if(a>47 && a<58){
                        liczba+=a;
                        i++;
                    }else if(a=='.'){
                        liczba+=a;
                        i++;
                    }else{
                        break;
                    }
                }
                kolejka.push(liczba);
            }else if(a=='('){
                stos.push("(");
                i++;
            }else if(a==')'){
                while (true){
                    if(stos.lastElement().equals("(")){
                        stos.pop();
                        break;
                    }else if(stos.lastElement().equals("exp(") || stos.lastElement().equals("log(") ||
                            stos.lastElement().equals("tan(") || stos.lastElement().equals("sin(")
                            || stos.lastElement().equals("cos(") || stos.lastElement().equals("tanh(")
                    || stos.lastElement().equals("sqrt(")){
                        kolejka.push(stos.lastElement());
                        stos.pop();
                        break;
                    }
                    else{
                        kolejka.push(stos.lastElement());
                        stos.pop();
                    }
                }
                i++;
            }else if(a=='+' || a=='-'){
                if(rownanie.charAt(i-1)=='(' && a=='-'){
                    String liczba="";
                    i++;
                    liczba+=a;
                    while(i<rozmiar){
                        a=rownanie.charAt(i);
                        if(a>47 && a<58){
                            liczba+=a;
                            i++;
                        }else if(a=='.'){
                            liczba+=a;
                            i++;
                        }else{
                            break;
                        }
                    }

                    kolejka.push(liczba);
                }else {
                if(stos.isEmpty()){
                    stos.push(Character.toString(a));
                }else if(priorytet.priorytet(stos.lastElement())<1){
                    stos.push(Character.toString(a));
                }else {
                    while(!stos.isEmpty()){
                        if(priorytet.priorytet(stos.lastElement())<1){
                            stos.push(Character.toString(a));
                           /* kolejka.push(stos.lastElement());
                            stos.pop();*/
                            break;
                        }else{
                            kolejka.push(stos.lastElement());
                            stos.pop();
                        }
                    }
                    if(stos.isEmpty()){
                        stos.push(Character.toString(a));
                    }
                }
                    i++;
                }
            }else if(a=='*' || a=='/' || a=='%'){
                if(stos.isEmpty()){
                    stos.push(Character.toString(a));
                }else if(priorytet.priorytet(stos.lastElement())<2){
                    stos.push(Character.toString(a));
                }else {
                    while(!stos.isEmpty()){
                        if(priorytet.priorytet(stos.lastElement())<2){
                            stos.push(Character.toString(a));
                            /*kolejka.push(stos.lastElement());
                            stos.pop();*/
                            break;
                        }else{
                            kolejka.push(stos.lastElement());
                            stos.pop();
                        }
                    }
                    if(stos.isEmpty()){
                        stos.push(Character.toString(a));
                    }
                }
                i++;
            }else if(a=='m'){
                if(stos.isEmpty()){
                    stos.push("mod");
                }else if(priorytet.priorytet(stos.lastElement())<2){
                    stos.push("mod");
                }else {
                    while(!stos.isEmpty()){
                        if(priorytet.priorytet(stos.lastElement())<2){
                            stos.push("mod");
                            break;
                        }else{
                            kolejka.push(stos.lastElement());
                            stos.pop();
                            stos.push("mod");
                        }
                    }
                }
                i+=3;
            }else if(a=='^'){
                stos.push("^");
                i++;
            }else if(a=='P'){
                kolejka.push("PI");
                i+=2;
            }else if(a>96 && a< 123){
                String pom="";
                pom+=a;
                i++;
                while(i<rozmiar){
                    a=rownanie.charAt(i);
                    if(a=='('){
                        pom+=a;
                        i++;
                        break;
                    }else if(a>47 && a<58){
                        break;
                    }
                    else{
                        pom+=a;
                        i++;
                    }
                }
                stos.push(pom);
            }
        }
        while(!stos.empty()){
            kolejka.push(stos.lastElement());
            stos.pop();
        }

        return kolejka;
    }
}
