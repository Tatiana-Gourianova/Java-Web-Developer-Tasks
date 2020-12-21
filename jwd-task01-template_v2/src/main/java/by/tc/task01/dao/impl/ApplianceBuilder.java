package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceBuilder {

    public List<Appliance> ApplianceBuilder() {

        return null;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-')
                    || (chars.length == 1 && c == '-'))
            {
                return false;
            }
        }
        return true;

    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! написать
    public static List<Appliance> build(List<String> parsedFiltredApplianceData,Criteria  criteria) {

        String[] words;

        String[] s2;
        String st2;

        // ArrayList<Integer> index=new ArrayList<>();
        int[] index=new int[10];
        int count=0;
        //criteria.getCritaria().values().toArray(); - можно по массиву пройтись и найти

        for (int j = 0; j < parsedFiltredApplianceData.toArray().length; j++) {

            words = parsedFiltredApplianceData.toArray()[j].toString().split(",");


                          for (int k = 0; k < words.length; k++) {
                              String st = words[k].replace("= =", " =");
                               s2 = st.split("=");//`//("(?<== )(\\f+)(?<=})");
                               st2 = s2[2].replace("}", "");
                              // System.out.println("!!++!!" + s2[1].toString() + "!$$!" );
                              //  if (criteria.find(s2[1])
                              if (isNumber(st2)) {
                                  //float value = Float.parseFloat(st2);
                                  // Добавить сравнения s[1] подчищенной с criteria.getkey(), s[2]с criteria.getvalue
                                  // и   выбрать мз Map соответств Appliances и добавить в список
                                  if (criteria.find(s2[1], st2) )
                                  {
                                      //index.add((Integer) j);//сохраняем индексы тех элементов, которые совпадают с критерием поиска
                                      index[count]=j;
                                      count++;
                                  }


                                  //System.out.println("++" + st + "$$" + value);
                              }
                          }

            }
// В index[] находятся порядковые номера свойств, которые удовлетворяют критерию поиска
//если  эти все свойства принадлежат одному и томуже appliance, то он искомый.


        //System.out.println("FDFVDF"+parsedFiltredApplianceData.size()); 21
        List<Appliance> a = null;
        List<String> v = null;
        for(int i=0;i<count;i++)
        {
            int l=index[i];
            //v.add( пройтись по мэпу и добавить в
//            System.out.println("DGFF"+parsedFiltredApplianceData);//!!!!!!{}{}{} !!!!!!! в такой список
        }
        System.out.println("DGFF"+parsedFiltredApplianceData);//!!!!!!{}{}{} !!!!!!! в такой список v сколько у конечного элементов =21/3 и проверять, чтобы l
        //попала в каждую из 3 частей по стольку раз, сколько критериев поиска а вообще лучше не мучиться, а в бд и там sql-запросами!!!!!!!
            //System.out.println("dfvsdfv"+ v+"vdfvgsd" );
            return a;
    }
}

