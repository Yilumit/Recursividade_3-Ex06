package controller;

public class CalcSerieController {

	public CalcSerieController() {
		super();
	}
	
	public int Serie5(int num){
        int fat, x;
        if (num!=1) {
            fat=1;
            x=num;
            do {
                fat= fat*x;//fatorial
                x=x-1;
            } while (x>1);
            
            return fat+Serie5(num-1);
        }
        return 1;
    }

}
