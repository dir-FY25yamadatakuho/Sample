package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        System.out.println("処理開始！");
        
        try {
            //例外コード行きます
            System.out.println("割り算開始！");
            int A=10/0;
            System.out.println(A);
        }catch(ArithmeticException e) {
            //アリスメティックの処理
            System.out.println("やばい:" +e.getMessage());
                    }
        finally {
            //例外に関係ないコード
            System.out.println("割り算終了！！！");
                 }
        System.out.println("処理終了！！！");
        
        
        
        
        
        //ここまで
    }

}
