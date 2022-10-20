package day12;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
                Mantıksal Operatörler
                & (ampersant)   : ve (and) operatörü
                | (pipe)        : veya (or) operatörü
                ^               : xor operatörü
                !               : Değil

                and & operatörü:
                true & true     : true
                true & false    : false
                false & true    : false
                false & false   : false

                veya | öperatörü:
                true | true     : true
                true | false    : true
                false | true    : true
                false | false   : false

                xor ^ operatörü:
                true ^ true     : false
                true ^ true     : true
                false ^ false   : true
                false ^ false   : false

                not, değil ! operatörü:
                !true       : false
                !false      : true
         */

        int age=40;
        if (!(age<18 | age>=60)){
            System.out.println("Gift will be given.");
        }else {
            System.out.println("No gift.");
        }

    }
}
