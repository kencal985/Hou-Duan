package Hero_View;

public class Robot_A {
	 int X,Y;
	 int Direction;//设置人物当前方向 1上，2右，3下，4左
	  public Robot_A(int X,int Y)
	  {
		  this.X=X;
		  this.Y=Y;
	  }
	  //获取人物当前方向，坐标
	  public void GetDirection(int X,int Y,int Direction,int Map[][],int Select)
	  {
		  this.Direction=Direction;
		  switch(Select)
		  {
		  case 1: Go_L( X, Y, Direction,Map);break;//将要向左
		  case 2: Go_R( X, Y, Direction,Map);break;//将要向右
		  case 3: Go_Straight( X, Y, Direction,Map);break;//将要直走		 
		  case 4: Jump_Straight( X, Y, Direction,Map);break;//将要跳起来
		  }
	  }
	  public  int Attack( )
	  {
		  return 0;
	  }
	  //向左走
	  public int Go_L(int X,int Y,int Direction,int Map[][])
	  {
		  if(Direction==1)
		  {
			  Map[X][Y]=1;
			  Map[X][Y-1]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=4;//改变头的方向
		  }
		  else if(Direction==2)
		  {
			  Map[X][Y]=1;
			  Map[X-1][Y]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=1;//改变头的方向
		  }
		  else if(Direction==3)
		  {
			  Map[X][Y]=1;
			  Map[X][Y+1]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=2;//改变头的方向
		  }
		  else if(Direction==4)
		  {
			  Map[X][Y]=1;
			  Map[X+1][Y]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=3;//改变头的方向
		  }
		  return Direction;
	  }
	  //向右走
	  public int Go_R(int X,int Y,int Direction,int Map[][])
	  {
		  if(Direction==1)
		  {
			  Map[X][Y]=1;
			  Map[X][Y+1]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=2;//改变头的方向
		  }
		  else if(Direction==2)
		  {
			  Map[X][Y]=1;
			  Map[X+1][Y]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=3;//改变头的方向
		  }
		  else if(Direction==3)
		  {
			  Map[X][Y]=1;
			  Map[X][Y-1]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=4;//改变头的方向
		  }
		  else if(Direction==4)
		  {
			  Map[X][Y]=1;
			  Map[X-1][Y]=100;
			  this.X=X;
			  this.Y=Y-1;
			  Direction=1;//改变头的方向
		  }
		  return Direction;
	  }
	  //向上走
	  public int Go_Straight(int X,int Y,int Direction,int Map[][])
	  {		
		  if(Direction==1)
		  {
			  Map[X][Y]=1;
			  Map[X-1][Y]=100;
			  this.X=X;
			  this.Y=Y-1;
		  }
		  else if(Direction==2)
		  {
			  Map[X][Y]=1;
			  Map[X][Y+1]=100;
			  this.X=X;
			  this.Y=Y-1;
		  }
		  else if(Direction==3)
		  {
			  Map[X][Y]=1;
			  Map[X+1][Y]=100;
			  this.X=X;
			  this.Y=Y-1;
		  }
		  else if(Direction==4)
		  {
			  Map[X][Y]=1;
			  Map[X][Y-1]=100;
			  this.X=X;
			  this.Y=Y-1;
		  }
		  return Direction;
		  
	  }	 
	  //跳
	  public int Jump_Straight(int X,int Y,int Direction,int Map[][])
	  { 
		  if((Direction==1)&&( Map[X][Y]!=Map[X-1][Y]))
	  {
		  Map[X][Y]=1;
		  Map[X-1][Y]=100;
		  this.X=X;
		  this.Y=Y-1;
	  }
	  else if((Direction==2)&&( Map[X][Y]!=Map[X-1][Y+1]))
	  {
		  Map[X][Y]=1;
		  Map[X][Y+1]=100;
		  this.X=X;
		  this.Y=Y-1;
	  }
	  else if((Direction==3)&&( Map[X][Y]!=Map[X+1][Y]))
	  {
		  Map[X][Y]=1;
		  Map[X+1][Y]=100;
		  this.X=X;
		  this.Y=Y-1;
	  }
	  else if((Direction==4)&&( Map[X][Y]!=Map[X][Y-1]))
	  {
		  Map[X][Y]=1;
		  Map[X][Y-1]=100;
		  this.X=X;
		  this.Y=Y-1;
	  }
	  return Direction;
	  }
	  //向上左跳
	  public int Jump_Left(int X,int Y,int Direction,int Map[][])
	  {
		  if((Direction==1)&&( Map[X][Y]!=Map[X-1][Y]))
		  {
			  Map[X][Y]=1;
			  Map[X-1][Y]=100;
		  }
		  else if((Direction==2)&&( Map[X][Y]!=Map[X-1][Y+1]))
		  {
			  Map[X][Y]=1;
			  Map[X][Y+1]=100;
		  }
		  else if((Direction==3)&&( Map[X][Y]!=Map[X+1][Y]))
		  {
			  Map[X][Y]=1;
			  Map[X+1][Y]=100;
		  }
		  else if((Direction==4)&&( Map[X][Y]!=Map[X][Y-1]))
		  {
			  Map[X][Y]=1;
			  Map[X][Y-1]=100;
		  }
		  return Direction;
	  }
	  //向上右跳
	  public int Jump_Right(int X,int Y,int Direction,int Map[][])
	  {
		  if((Direction==1)&&( Map[X][Y]!=Map[X-1][Y]))
		  {
			  Map[X][Y]=1;
			  Map[X-1][Y]=100;
			  
		  }
		  else if((Direction==2)&&( Map[X][Y]!=Map[X-1][Y+1]))
		  {
			  Map[X][Y]=1;
			  Map[X][Y+1]=100;
		  }
		  else if((Direction==3)&&( Map[X][Y]!=Map[X+1][Y]))
		  {
			  Map[X][Y]=1;
			  Map[X+1][Y]=100;
		  }
		  else if((Direction==4)&&( Map[X][Y]!=Map[X][Y-1]))
		  {
			  Map[X][Y]=1;
			  Map[X][Y-1]=100;
		  }
		  return Direction;
	  }
	 
	 
	 
}
