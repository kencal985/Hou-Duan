package Start_View;
import Level1_Map.Map1_1;
import Hero_View.Robot_A;
//创建地图，人物放置地图
public class Parpare1_1 {
	public void Start()
	{
		Map1_1 mp1=new Map1_1(6, 6);
		Robot_A rbA=new Robot_A(1, 1);
		mp1.SetStart();
		mp1.SetWall();
		mp1.SetFinish();//终点值为-1
		mp1.SetPrepare(rbA.Num);//开始位置值为100
	}
}
