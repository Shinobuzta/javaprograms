package sudoku;

import javax.swing.JOptionPane;

public class Sodoku {
	public static void main(String args[]){
		int initVal[][]={
				{0,4,0,0},
				{0,0,0,2},
				{0,0,0,0},
				{0,0,2,3}
		};
		int[][] curVal= new int[4][4];
		for(int copyY=0;copyY<4;copyY++)
		{
			for(int copyX=0;copyX<4;copyX++)
			{
				curVal[copyY][copyX]=initVal[copyY][copyX];
			}
		}
		
		
		
		boolean clearY=false,clearX=false,clearBox=false;
		int startX=0;
		for(int y=0;y<4;y++)
		{
			for(int x=startX;x<4;x++)
			{
				if(startX!=0)startX=0;
				if(initVal[y][x]==0)
				{
					for(int testVal=curVal[y][x]+1;testVal<=4;testVal++)
					{
						//JOptionPane.showMessageDialog(null, y+" "+x+" "+testVal+" "+curVal[y][x]);
						/*JOptionPane.showMessageDialog(null, 
								 curVal[0][0]+""+curVal[0][1]+""+curVal[0][2]+""+curVal[0][3]+
							"\n"+curVal[1][0]+""+curVal[1][1]+""+curVal[1][2]+""+curVal[1][3]+
							"\n"+curVal[2][0]+""+curVal[2][1]+""+curVal[2][2]+""+curVal[2][3]+
							"\n"+curVal[3][0]+""+curVal[3][1]+""+curVal[3][2]+""+curVal[3][3]);*/
						for(int yy=0;yy<4;yy++)
						{
							if(curVal[yy][x]==testVal)
							{
								yy=5;
							}
							else if(yy==3)
							{
								clearY=true;
							}
						}
						for(int xx=0;xx<4;xx++)
						{
							if(curVal[y][xx]==testVal)
							{
								xx=5;
							}
							else if(xx==3)
							{
								clearX=true;
							}
						}
						switch(y+"|"+x)
						{
						case "0|0":
						case "0|1":
						case "1|0":
						case "1|1":
							if (!(
								curVal[0][0]==testVal ||
								curVal[0][1]==testVal ||
								curVal[1][0]==testVal ||
								curVal[1][1]==testVal
								)) clearBox=true;break;
						case "0|2":
						case "0|3":
						case "1|2":
						case "1|3":
							if (!(
								curVal[0][2]==testVal ||
								curVal[0][3]==testVal ||
								curVal[1][2]==testVal ||
								curVal[1][3]==testVal
								)) clearBox=true;break;
						case "2|0":
						case "2|1":
						case "3|0":
						case "3|1":
							if (!(
								curVal[2][0]==testVal ||
								curVal[2][1]==testVal ||
								curVal[3][0]==testVal ||
								curVal[3][1]==testVal
								)) clearBox=true;break;
						case "2|2":
						case "2|3":
						case "3|2":
						case "3|3":
							if (!(
								curVal[2][2]==testVal ||
								curVal[2][3]==testVal ||
								curVal[3][2]==testVal ||
								curVal[3][3]==testVal
								)) clearBox=true;break;
						}
						
						if(clearX==true && clearY==true && clearBox==true)
						{
							curVal[y][x]=testVal;
							testVal=5;
						}
						else if(testVal==4)
						{
							int backY=1;
							curVal[y][x]=0;
							for(int ry=3;ry>=0;ry--)
							{
								for(int rx=3;rx>=0;rx--)
								{
									if(initVal[ry][rx]!=0)
									{
										
									}
									else if(curVal[ry][rx]==4)
									{
										curVal[ry][rx]=0;
									}
									else if(curVal[ry][rx]!=0)
									{
										startX=rx;
										x=5;
										y=ry-backY;
										//JOptionPane.showMessageDialog(null, ry+" "+rx);
										rx=-1;
										ry=-1;
									}
								}
								//backY++;
							}
						}
						
						clearY=false;
						clearX=false;
						clearBox=false;
						
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, 
					 curVal[0][0]+""+curVal[0][1]+""+curVal[0][2]+""+curVal[0][3]+
				"\n"+curVal[1][0]+""+curVal[1][1]+""+curVal[1][2]+""+curVal[1][3]+
				"\n"+curVal[2][0]+""+curVal[2][1]+""+curVal[2][2]+""+curVal[2][3]+
				"\n"+curVal[3][0]+""+curVal[3][1]+""+curVal[3][2]+""+curVal[3][3]);
	}
}
