package AdminStudents;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AConsole
{	
	BufferedReader reader; 

	public AConsole()
	{		
		InputStreamReader m = new InputStreamReader(System.in);
		reader = new BufferedReader(m);
	}
	
	// �����ʾһ���ַ���
	public void print(String s)
	{
		System.out.print(s);
	}
	// �����ʾһ���ַ�����������)
	public void println(String s)
	{
		System.out.println(s);
	}
	
	// �ӿ���̨��ȡ�û����룺��ȡһ���ַ���
	//     ����û�ֱ�Ӱ��˻س����򷵻�Ĭ��ֵ��
	public String readString(String defValue)
	{
		try {
			String s = reader.readLine();
			if(s.trim().length() == 0)
			{
				return defValue;
			}
			return s;
		}catch(Exception e)
		{
			return defValue;
		}
		
	}
	
	// �ӿ���̨��ȡ�û����룺��ȡһ������
	//     ����û�ֱ�Ӱ��˻س����򷵻�Ĭ��ֵ��
	public int readInt(int defValue)
	{
		try {
			String s = readString(null);
			return Integer.valueOf( s );
		}catch(Exception e)
		{
			return defValue;
		}
	}
	
}
