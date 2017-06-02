//express_demo.js 文件
var express = require('express');
var rio = require("rio");
var app = express();

app.get('/', function (req, res) {
   res.send('Hello World');
})

app.get('/Rfunc', function(req, res){
	options = {
		host : "127.0.0.1",
		port : 6311,
		command: "rnorm(10)",
		callback: function (err, val) {
            if (!err) {
				console.log("RETURN:"+val);
            	return res.send({'success':true,'res':val});
            } else {
            	console.log("ERROR:Rserve call failed")
            	return res.send({'success':false});
            }
        },
    }
	rio.enableDebug(false);//开启调试模式
    rio.evaluate(options);//运行R代码
})

var server = app.listen(8081, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("应用实例，访问地址为 http://%s:%s", host, port)

})