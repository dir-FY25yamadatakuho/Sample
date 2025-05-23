package sample;

public class SwitchSample {

    public static void main(String[] args) {
        var 得点= 50; //成績
                
                switch(得点/10) {
                case 10 ->System.out.println("満点");
                case 9,8 ->System.out.println("やるやん");
                case 7,6 ->System.out.println("合格");
                default -> System.out.println("赤点"); 
                }
             

    }

}
