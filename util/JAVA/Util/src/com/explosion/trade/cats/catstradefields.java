package com.explosion.trade.cats;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.xBaseJ.xBaseJException;
import org.xBaseJ.fields.CharField;
import org.xBaseJ.fields.NumField;

import com.linuxense.javadbf.DBFField;

public class catstradefields {
	public static DBFField[] INSTRUCTIONSFIELDS = null;
	
	public final static String INSTRUCTIONS_INST_TYPE = "INST_TYPE";
	public final static String INSTRUCTIONS_CLIENT_ID = "CLIENT_ID";
	public final static String INSTRUCTIONS_ACCT_TYPE = "ACCT_TYPE";
	public final static String INSTRUCTIONS_ACCT	  = "ACCT";	
	public final static String INSTRUCTIONS_ORD_NO 	  = "ORD_NO";	
	public final static String INSTRUCTIONS_SYMBOL 	  = "SYMBOL";	
	public final static String INSTRUCTIONS_TRADESIDE = "TRADESIDE";
	public final static String INSTRUCTIONS_ORD_QTY   = "ORD_QTY";	
	public final static String INSTRUCTIONS_ORD_PRICE = "ORD_PRICE";
	public final static String INSTRUCTIONS_ORD_TYPE  = "ORD_TYPE";
	public final static String INSTRUCTIONS_ORD_PARAM = "ORD_PARAM";
	
	
	public static CharField INST_TYPE;
	public static NumField  CLIENT_ID;
	public static CharField ACCT_TYPE;
	public static CharField ACCT;		
	public static CharField ORD_NO;		
	public static CharField SYMBOL;		
	public static CharField TRADESIDE;	
	public static NumField  ORD_QTY;	
	public static NumField  ORD_PRICE;	
	public static CharField ORD_TYPE;	
	public static CharField ORD_PARAM;
	
	static {
		ArrayList<DBFField> fieldsarr = new ArrayList<DBFField>();
		DBFField field = null;
		
		field = new DBFField();
		field.setName("INST_TYPE");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(2);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("CLIENT_ID");
		field.setDataType(DBFField.FIELD_TYPE_N);
		field.setFieldLength(9);
		field.setDecimalCount(0);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ACCT_TYPE");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(8);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ACCT");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(16);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ORD_NO");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(32);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("SYMBOL");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(32);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("TRADESIDE");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(8);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ORD_QTY");
		field.setDataType(DBFField.FIELD_TYPE_N);
		field.setFieldLength(9);
		field.setDecimalCount(0);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ORD_PRICE");
		field.setDataType(DBFField.FIELD_TYPE_N);
		field.setFieldLength(18);
		field.setDecimalCount(9);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ORD_TYPE");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(8);
		fieldsarr.add(field);

		field = new DBFField();
		field.setName("ORD_PARAM");
		field.setDataType(DBFField.FIELD_TYPE_C);
		field.setFieldLength(32);
		fieldsarr.add(field);

		INSTRUCTIONSFIELDS = fieldsarr.toArray(new DBFField[1]);
//		INSTRUCTIONSFIELDS = (DBFField[]) fieldsarr.toArray();
		
		try {
			CharField INST_TYPE 	= new CharField("INST_TYPE", 	1);
			NumField  CLIENT_ID 	= new NumField("CLIENT_ID", 	9,  0);
			CharField ACCT_TYPE 	= new CharField("ACCT_TYPE", 	8);
			CharField ACCT			= new CharField("ACCT", 		16);
			CharField ORD_NO		= new CharField("ORD_NO", 		32);
			CharField SYMBOL		= new CharField("SYMBOL", 		32);
			CharField TRADESIDE		= new CharField("TRADESIDE", 	8);
			NumField  ORD_QTY		= new NumField("ORD_QTY", 	9,  0);
			NumField  ORD_PRICE		= new NumField("ORD_PRICE", 	18, 9);
			CharField ORD_TYPE		= new CharField("ORD_TYPE", 	8);
			CharField ORD_PARAM		= new CharField("ORD_PARAM", 	32);
		} catch (xBaseJException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
