package ControlStatementsMathString;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0;i<=20;i++){
            System.out.println("value is :: "+ i);
        }

        System.out.println("---------------------------------------------------------");
        String[] name ={"Ram","Shaym","Soham","Mohan","gaurish","ramesh"};

        for (String _item:name){
            if(_item == "Soham"){
                continue;
            }
            if(_item == "gaurish"){
                break;
            }

            System.out.println("Array item are:: "+_item);
        }
    }
}
