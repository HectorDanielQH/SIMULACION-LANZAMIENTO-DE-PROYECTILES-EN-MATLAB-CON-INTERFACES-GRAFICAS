package hallar.raiz;
import java.text.DecimalFormat;
import java.util.Scanner;

public class HALLARRAIZ 
{
	public static String fraccion(String pen)
	{
		String frac="";
		int cont=0;
		boolean empezar=false;
		for(int i=0;i<pen.length();i++)
		{
			if(pen.charAt(i)=='.')
				empezar=true;
			if (empezar) 
				cont++;
		}
		cont-=1;
		String supert="1";
		for(int i=0;i<cont;i++)
			supert+="0";
		String num,den;
		double wt=Long.parseLong(supert)*Double.parseDouble(pen);
		den=supert;
		num=Double.toString(wt);
		frac=simplificado(num,den);
		return frac;
	}
	public static String simplificado(String num, String den)
	{
		int i=2;
		String tuyo="ew";
		long numerador=(long)Double.parseDouble(num),denominador=(long)Double.parseDouble(den);
		long para_el_for=0;
		if(numerador>denominador)
			para_el_for=numerador;
		else
		{
			if(numerador<denominador)
				para_el_for=denominador;
			else
				para_el_for=1;
		}
		if(para_el_for==1)
			tuyo="1";
		else
		{
			while(i<=para_el_for)
			{
				if(numerador%i==0 && denominador%i==0)
				{
					numerador=numerador/i;
					denominador/=i;
				}
				else
					i++;
			}
			tuyo=Long.toString(numerador)+"/"+Long.toString(denominador);
		}
		return tuyo;
	}
}
