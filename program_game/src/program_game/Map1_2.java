package program_game;

public class Map1_2 {
	int N,M;//N=6,M=6
    int Map2[][]=new int [N][M];
    public Map1_2(int N,int M)
    {
    	this.M=M;
    	this.N=N;
    	setStart(N,M);
    }
	
	public void getdata() {
		// TODO Auto-generated method stub		
		
	}
	public void storedata() {
		// TODO Auto-generated method stub
		
		
	}
	public void setStart(int N,int M) {
		// TODO Auto-generated method stub
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				Map2[i][j]=0;
			}
		}
		
	}

	public void setWall(int N) {
		// TODO Auto-generated method stub
		for(int i=1;i<N-2;i++)
		{
			Map2[1][i]=1;
			
		}
		for(int i=1;i<N-2;i++)
		{
			Map2[4][i]=1;
		}
		Map2[2][3]=1;
		Map2[3][3]=1;
		
	}
	
}
