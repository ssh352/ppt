using System;
using System.Collections;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Windows.Forms;




namespace WindowsFormsApplication1
{
    class DpTimer
    {
        private System.Timers.Timer timer;
        private String ConnString;
        private SqlConnection Conn;
        private ArrayList sPortIDList;

        public DpTimer(string sConUrl)
        {
            timer = new System.Timers.Timer();
            timer.Enabled = true;
            timer.Interval = 60000;//执行间隔时间,单位为毫秒;此时时间间隔为1分钟  
            timer.Start();
            timer.Elapsed += new System.Timers.ElapsedEventHandler(OnTimer);
            ConnString = sConUrl;
            sPortIDList = new ArrayList();
            sPortIDList.Add("HB0A01");
            sPortIDList.Add("PH0A02");
            sPortIDList.Add("CS2B02");
            sPortIDList.Add("CS2B0201");
        }


        private void OnTimer(object source, System.Timers.ElapsedEventArgs e)
        {

            //MessageBox.Show(DateTime.Now.ToString());

            //如果当前时间是10点30分
            if (DateTime.Now.Hour == 23 && DateTime.Now.Minute == 0)
            {
                //MessageBox.Show("OK, event fired at: " + DateTime.Now.ToString());
                CheckValution();
            }

        }

        private void CheckValution()
        {

            String sql = "select * from jydb_all.dbo.v_dpNAV where portID in ('{0}') and Date = (select date from jydb_all.dbo.v_dplastTradingday);";
            foreach (string sPort in sPortIDList)
            {
                Conn = new SqlConnection(ConnString);
                Conn.Open();
                SqlCommand command = new SqlCommand(String.Format(sql, sPort), Conn);

                if (command.ExecuteNonQuery() != -1)
                {
                    Mail.SendMail("Execute " + sql + " fail!");
                    return;
                }
                else {
                    SqlDataReader dataReader = command.ExecuteReader();
                    if (!dataReader.Read())
                    {
                        Mail.SendMail("Not recieve " + sPort + " report!" + "SQL:" + String.Format(sql, sPort));
                    }
                    else 
                    {
                        Mail.SendMail("recieve " + sPort + " report");
                    }
                }
            }
        }


    }
}
