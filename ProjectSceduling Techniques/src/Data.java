
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zephyr
 */
class Data   {
    
    public static String actName1,pd;
    public static int noAct,ad,stop1=0;
    public String activityName,preDecessor,preDecessorTo1,preDecessorTo2,critical;
    public int  es,ls,actDuration,lf,ef,slack,stop;
    public void setValues(int j)
    {
        Fram.getValuesFromTable(j);
        activityName=actName1;
        preDecessor=pd;
        actDuration=ad;
    }
   public void slack()
   {
       slack=lf-ef;
   }
   public void critical()
   {
       if(slack==0)
           critical="Yes";
       else
           critical="No";

   }
    public int EF()
    {
        return ef=es+actDuration;
    }    
}
