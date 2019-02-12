package moj.kalkulator;

//zwraca priorytet jaki mają poszczegolne operatory

public class Priorytet {
    public int priorytet(String opPro)
    {
        if (opPro.equals("+") || opPro.equals("-"))
        {
            return 1;
        }
        else if (opPro.equals("*") || opPro.equals("/") || opPro.equals("%") || opPro.equals("mod"))
        {
            return 2;
        }
        else if(opPro.equals("^"))
        {
            return 3;
        }else {
            return 0;
        }
    }
}
