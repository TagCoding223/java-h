import calculator.*;
public class perform_cal {
    public static void main(String[] args) {
        System.out.println("Normal calculator operation ,");
        normalCal objNormalCal=new normalCal();
        objNormalCal.showAdd();
        objNormalCal.showSubtraction();
        objNormalCal.showMultiplication();
        objNormalCal.showDivison();
        System.out.println("\nScientific Calculater operation ,");
        sciCal objSciCal=new sciCal();
        objSciCal.showPower();
        objSciCal.showInSin();
        objSciCal.showInCos();
        System.out.println("\nHybrid Calculater operation ,");
        hybridCal oHybridCal=new hybridCal();
        oHybridCal.sumOfTwoSquerValue();
        oHybridCal.showSinAddCos();
    }
}
// first compiler all package file one by one (javac -d . sciCal.java) , then after run this file using terminal (java perform.java ya java calculater/perfrom) 