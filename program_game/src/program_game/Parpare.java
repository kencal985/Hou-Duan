package program_game;

public class Parpare {
  public void Pre_start(int select)
  {
	  if(select==1)
	  {
		  Map1_1 M1=new Map1_1(6, 6);
	  }
	  else if(select==2)
	  {
		  Map1_2 M2=new Map1_2(6, 6);
		  
	  }
	  else if(select==3)
	  {
		  Map1_3 M3=new Map1_3(6,6);
	  }
  }
}
