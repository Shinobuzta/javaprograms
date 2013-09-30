package sudoku;

import javax.swing.JOptionPane;

public class Sodoku2 {
	public static void main(String args[]){
		int max=9;
		int initVal[][]={
				{0,1,0,5,0,2,0,7,0},
				{8,6,0,0,1,0,0,5,4},
				{0,0,0,4,0,6,0,0,0},
				{7,0,8,0,0,0,6,0,2},
				{0,2,0,0,0,0,0,4,0},
				{9,0,6,0,0,0,7,0,1},
				{0,0,0,9,0,1,0,0,0},
				{6,8,0,0,2,0,0,9,5},
				{0,9,0,8,0,7,0,2,0}
		};
		/*int initVal[][]={
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0}
		};*/
		int[][] curVal= new int[max][max];
		for(int copyY=0;copyY<max;copyY++)
		{
			for(int copyX=0;copyX<max;copyX++)
			{
				curVal[copyY][copyX]=initVal[copyY][copyX];
			}
		}
		String output="";
		for(int outY=0;outY<max;outY++)
		{
			for(int outX=0;outX<max;outX++)
			{
				output+=" "+curVal[outY][outX];
			}
			output+="\n";
		}
		JOptionPane.showMessageDialog(null, output);
		
		
		boolean clearY=false,clearX=false,clearBox=false;
		int startX=0;
		for(int y=0;y<max;y++)
		{
			for(int x=startX;x<max;x++)
			{
				if(startX!=0)startX=0;
				if(initVal[y][x]==0)
				{
					for(int testVal=curVal[y][x]+1;testVal<=max;testVal++)
					{
						//JOptionPane.showMessageDialog(null, y+" "+x+" "+testVal+" "+curVal[y][x]);
						
						for(int yy=0;yy<max;yy++)
						{
							if(curVal[yy][x]==testVal)
							{
								yy=max+1;
							}
							else if(yy==max-1)
							{
								clearY=true;
							}
						}
						for(int xx=0;xx<max;xx++)
						{
							if(curVal[y][xx]==testVal)
							{
								xx=max+1;
							}
							else if(xx==max-1)
							{
								clearX=true;
							}
						}
						switch(y+"|"+x)
						{
						case "0|0":
						case "0|1":
						case "0|2":
						case "1|0":
						case "1|1":
						case "1|2":
						case "2|0":
						case "2|1":
						case "2|2":
							if (!(
								curVal[0][0]==testVal ||
								curVal[0][1]==testVal ||
								curVal[0][2]==testVal ||
								curVal[1][0]==testVal ||
								curVal[1][1]==testVal ||
								curVal[1][2]==testVal ||
								curVal[2][0]==testVal ||
								curVal[2][1]==testVal ||
								curVal[2][2]==testVal
								)) clearBox=true;break;
						case "0|3":
						case "0|4":
						case "0|5":
						case "1|3":
						case "1|4":
						case "1|5":
						case "2|3":
						case "2|4":
						case "2|5":
							if (!(
								curVal[0][3]==testVal ||
								curVal[0][4]==testVal ||
								curVal[0][5]==testVal ||
								curVal[1][3]==testVal ||
								curVal[1][4]==testVal ||
								curVal[1][5]==testVal ||
								curVal[2][3]==testVal ||
								curVal[2][4]==testVal ||
								curVal[2][5]==testVal
								)) clearBox=true;break;
						case "0|6":
						case "0|7":
						case "0|8":
						case "1|6":
						case "1|7":
						case "1|8":
						case "2|6":
						case "2|7":
						case "2|8":
							if (!(
								curVal[0][6]==testVal ||
								curVal[0][7]==testVal ||
								curVal[0][8]==testVal ||
								curVal[1][6]==testVal ||
								curVal[1][7]==testVal ||
								curVal[1][8]==testVal ||
								curVal[2][6]==testVal ||
								curVal[2][7]==testVal ||
								curVal[2][8]==testVal
								)) clearBox=true;break;
						case "3|0":
						case "3|1":
						case "3|2":
						case "4|0":
						case "4|1":
						case "4|2":
						case "5|0":
						case "5|1":
						case "5|2":
							if (!(
								curVal[3][0]==testVal ||
								curVal[3][1]==testVal ||
								curVal[3][2]==testVal ||
								curVal[4][0]==testVal ||
								curVal[4][1]==testVal ||
								curVal[4][2]==testVal ||
								curVal[5][0]==testVal ||
								curVal[5][1]==testVal ||
								curVal[5][2]==testVal
								)) clearBox=true;break;
						case "3|3":
						case "3|4":
						case "3|5":
						case "4|3":
						case "4|4":
						case "4|5":
						case "5|3":
						case "5|4":
						case "5|5":
							if (!(
								curVal[3][3]==testVal ||
								curVal[3][4]==testVal ||
								curVal[3][5]==testVal ||
								curVal[4][3]==testVal ||
								curVal[4][4]==testVal ||
								curVal[4][5]==testVal ||
								curVal[5][3]==testVal ||
								curVal[5][4]==testVal ||
								curVal[5][5]==testVal
								)) clearBox=true;break;
						case "3|6":
						case "3|7":
						case "3|8":
						case "4|6":
						case "4|7":
						case "4|8":
						case "5|6":
						case "5|7":
						case "5|8":
							if (!(
								curVal[3][6]==testVal ||
								curVal[3][7]==testVal ||
								curVal[3][8]==testVal ||
								curVal[4][6]==testVal ||
								curVal[4][7]==testVal ||
								curVal[4][8]==testVal ||
								curVal[5][6]==testVal ||
								curVal[5][7]==testVal ||
								curVal[5][8]==testVal
								)) clearBox=true;break;
						case "6|0":
						case "6|1":
						case "6|2":
						case "7|0":
						case "7|1":
						case "7|2":
						case "8|0":
						case "8|1":
						case "8|2":
							if (!(
								curVal[6][0]==testVal ||
								curVal[6][1]==testVal ||
								curVal[6][2]==testVal ||
								curVal[7][0]==testVal ||
								curVal[7][1]==testVal ||
								curVal[7][2]==testVal ||
								curVal[8][0]==testVal ||
								curVal[8][1]==testVal ||
								curVal[8][2]==testVal
								)) clearBox=true;break;
						case "6|3":
						case "6|4":
						case "6|5":
						case "7|3":
						case "7|4":
						case "7|5":
						case "8|3":
						case "8|4":
						case "8|5":
							if (!(
								curVal[6][3]==testVal ||
								curVal[6][4]==testVal ||
								curVal[6][5]==testVal ||
								curVal[7][3]==testVal ||
								curVal[7][4]==testVal ||
								curVal[7][5]==testVal ||
								curVal[8][3]==testVal ||
								curVal[8][4]==testVal ||
								curVal[8][5]==testVal
								)) clearBox=true;break;
						case "6|6":
						case "6|7":
						case "6|8":
						case "7|6":
						case "7|7":
						case "7|8":
						case "8|6":
						case "8|7":
						case "8|8":
							if (!(
								curVal[6][6]==testVal ||
								curVal[6][7]==testVal ||
								curVal[6][8]==testVal ||
								curVal[7][6]==testVal ||
								curVal[7][7]==testVal ||
								curVal[7][8]==testVal ||
								curVal[8][6]==testVal ||
								curVal[8][7]==testVal ||
								curVal[8][8]==testVal
								)) clearBox=true;break;
						}
						
						if(clearX==true && clearY==true && clearBox==true)
						{
							curVal[y][x]=testVal;
							output="";
							for(int outY=0;outY<max;outY++)
							{
								for(int outX=0;outX<max;outX++)
								{
									output+=" "+curVal[outY][outX];
								}
								output+="\n";
							}
							
							
							//JOptionPane.showMessageDialog(null, output);
							
							System.out.println(output);
							
							
							
							testVal=max+1;
						}
						else if(testVal==max)
						{
							//JOptionPane.showMessageDialog(null, clearY+" "+clearX+" "+clearBox);
							int backY=1;
							curVal[y][x]=0;
							for(int ry=max-1;ry>=0;ry--)
							{
								for(int rx=max-1;rx>=0;rx--)
								{
									if(initVal[ry][rx]!=0)
									{
										
									}
									else if(curVal[ry][rx]==max)
									{
										curVal[ry][rx]=0;
									}
									else if(curVal[ry][rx]!=0)
									{
										startX=rx;
										x=max+1;
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
		output="";
		for(int outY=0;outY<max;outY++)
		{
			for(int outX=0;outX<max;outX++)
			{
				output+=" "+curVal[outY][outX];
			}
			output+="\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}
}
