using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    class DpWork
    {
        private volatile bool _shouldStop;

        public void DoWork()
        {
            while (!_shouldStop)
            {
                MessageBox.Show("DpTimer thread: working...");
                Thread.Sleep(10);
            }
        }

        public void RequestStop()
        {
            _shouldStop = true;
        }
    }
}
