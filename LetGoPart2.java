import java.util.Scanner;

public class LetGoPart2 {
    public static void main(String[] args) {
        System.out.println("when u stand up. u feel a slow breath closer and closer to u. The stomach is shanking as your's leg walk forward ");
        System.out.println("Appearese of her/him make u nervious");
        System.out.println("TA : Where r u gonna go ??");
        System.out.println("U : E- Em  , I- I...");

        Scanner sc = new Scanner(System.in);

        System.out.println("choose your's excuess (1-5) interger only : ");
        Integer excuess = sc.nextInt();

        sc.close();

        switch (excuess) {
            case 1:
                System.out.println("U :Sorry my mom injure herself and now it hospital , pls i need to go. My mom is not well for a long time , i don't know is this the last time i gonna see her alive");
                break;
            case 2:
                System.out.println("U :My stomach , It's gonna explode soon. pls i need a toliet ");
                break;
            case 3:
                System.out.println("U :My cat is dying . pls i saw her suffer and now lying on the floor. I.. -I can't leave without her ");
                break;
            case 4:
                System.out.println("U : Sever is broken so I have to go and get my harddrive");
                break;
            case 5:
                System.out.println("U : I think u forgot yours homework. I will go and get it for u. Thank me later.");
                break;
            default:
                System.out.println("U :I- I - I");
                System.out.println("TA : U DON'T HAVE AN EXCUESS , HUH");
                break;
        }
        

    }
}
