using System;


namespace WindowsFormsApplication1
{
    public class DPTimer
    {
        private volatile bool _shouldStop;
        public DPTimer()
        {

        }
    
        public void RequestStop()
        {
            _shouldStop = true;
        }

        public void DoWork()
        {
            while (!_shouldStop)
            {
                Console.WriteLine("worker thread: working...");
            }
            Console.WriteLine("worker thread: terminating gracefully.");
        }

    }
}