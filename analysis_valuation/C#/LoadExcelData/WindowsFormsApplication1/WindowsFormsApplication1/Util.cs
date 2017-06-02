using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data;


namespace WindowsFormsApplication1
{
    class Util
    {
        static public double GetDouble(DataRow dr, int location)
        {
            double ret = 0;
            if (!dr[location].ToString().Equals(""))
            {
                ret = Convert.ToDouble(dr[location, DataRowVersion.Original].ToString());
            }
            return ret;
        }

        static public bool IsNumber(string number)
        {
            decimal temp;
            return decimal.TryParse(number, out temp);
        }

        // eg. 20150721
        static public string NowDate()
        {
            return DateTime.Now.ToString("yyyyMMdd"); 
        }

    }
}
