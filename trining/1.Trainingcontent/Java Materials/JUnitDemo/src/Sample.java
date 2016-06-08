
public class Sample {
	public static void main(String[] args){
        int j=~-3;
        switch(j){
            default:break;
            case 0:++j;
            case 1:break;
            case 2:j-=2;
            continue;
        }
   }

}
