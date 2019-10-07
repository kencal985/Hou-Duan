package Level1_Map;

public class Map1_2 {
	int N,M;//N=6,M=6
    int Map1[][]=new int [N][M];
    //设置地图大小
    public Map1_2(int N,int M)
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
		for(int i=2;i<N-2;i++)
		{
			Map1[4][i]=2;
		}
		Map1[3][1]=3;
		Map1[3][2]=3;
		
	}
	public int  JudgeVictory(int X,int Y)
	{
		if(X==3&&Y==1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
