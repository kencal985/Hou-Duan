package Level1_Map;

public class Map1_1 {
	int N,M;//N=6,M=6
    int Map1[][]=new int [N][M];
    //设置地图大小
    public Map1_1(int N,int M)
    {
    	this.M=M;
    	this.N=N;
    	SetStart(N,M);
    }
	//从数据库中提取数据
	public void Getdata() {
		// TODO Auto-generated method stub		
		
	}
	//储存数据库
	public void Storedata() {
		// TODO Auto-generated method stub
		
		
	}
	//初始化地图，0为墙
	public void SetStart(int N,int M) {
		 
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				Map1[i][j]=0;
			}
		}
		
	}
   //设置行走的路径
	public void SetWall(int N) 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<N-2;i++)
		{
			Map1[1][i]=1;
			
		}
		for(int i=1;i<N-2;i++)
		{
			Map1[4][i]=1;
		}
		Map1[2][3]=1;
		Map1[3][3]=1;
		
	}
	//设置判定点，终点值为-1
	public void SetFinish(int x,int y)
	{
		Map1[4][1]=-1;
	}
	//设置初始位置
	public void SetPrepare(int x,int y)
	{
		Map1[1][1]=-2;
	}
	//设置陷阱
	public void SetDrop()
	{
		
	}
	//判断是否胜利
	public int  JudgeVictory(int X,int Y)
	{
		if(X==4&&Y==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
