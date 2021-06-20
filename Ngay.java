package Cau1;


public class Ngay {
	protected int DD,MM,YY;
	protected int Lastday;
	Ngay(){
		DD=MM=YY=0;
	}
	public void setDD(int dD) {
		DD = dD;
	}
	public void setMM(int mM) {
		MM = mM;
	}
	public void setYY(int yY) {
		YY = yY;
	}
	public int getDD() {
		return DD;
	}
	public int getMM() {
		return MM;
	}
	public int getYY() {
		return YY;
	}
	Ngay(int a, int b, int c)
	{
		setDD(a);
		setMM(b);
		setYY(c);
	}
	public boolean checkDay() {
		switch (MM) {
		case 1: case 3: case 5: case 7: case 8 : case 10: case 12:
			Lastday=31;
			break;
		case 4: case 6: case 9: case 11:
			Lastday=30;
			break;
		case 2:
			if (YY % 400 == 0 || (YY % 4 == 0 && YY % 100 != 0))
				Lastday = 29;
			else Lastday = 28;
			break;
		default:
			Lastday = 0;
			break;
		}
		if (Lastday == 0 || YY < 1 || (Lastday != 0 && (DD > Lastday || DD < 1)))
		{
			return false;
			
		}
		return true;
	}
	public Ngay nextNgay()
		{
			int a,b,c=0;
			if (DD < Lastday)
			{
				a = DD + 1;
				b = MM;
				c = YY;
			}
			else
			{
				if (MM != 12)
				{
					a = 1;
					b = MM + 1;
					c = YY;
				}
				else
				{
					a = 1;
					b = 1;
					c = YY + 1;
				}
			}
			return new Ngay(a,b,c);
		}
		
	
}
