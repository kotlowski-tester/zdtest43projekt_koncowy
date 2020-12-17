public class InstrukcaWarunkowaSwitch {
    public static void main(String[] args) {
        int  x = 1;
        switch(x){
            case 1:
                System.out.println("x rowna sie 1");
                break;
            case 2:
                System.out.println("x rowna sie 2");
                break;
            case 3:
                System.out.println("x rowna sie 3");
                break;
            default:
                System.out.println("x jest rozne od 1 oraz 2 oraz  3");
        }
        int c = 2;
        switch(c){
            case 2:
                System.out.println("aaa");
                break;
            case 3:
                System.out.println("bbbb");
                break;
            default:
                System.out.println("ccc");
        }
    if(c==2){
        System.out.println("AAAA");
    }
    else if (c==3){
        System.out.println("BBBB");

    }
    else{
        System.out.println("CCC");
    }

    int i = 2,k;
    if(i<0){
        k = -i;
    } else{
        k=i;
    }
        k = (i<0) ? -i :i;



    }

}
