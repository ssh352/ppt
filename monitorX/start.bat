cd D:\Program Files\R\R-3.3.2\library\Rserve\libs\x64
d:
start /MIN cmd /k R CMD Rserve --RS-enable-remote 
 
 

cd E:\DP\DpRepo\Project X\nodejs\sandbox\rio
e:
start /MIN cmd /k node server.js
 
 
start "" "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" "192.168.1.227:8081/init.htm"
start "" "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" "192.168.1.227:8081/index.htm"

exit