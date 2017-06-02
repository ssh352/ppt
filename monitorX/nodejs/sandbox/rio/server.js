
var rio 		 = require("rio");
var express		 = require('express');
var app 		 = express();
var bodyParser 	 = require('body-parser');
var fs 			 = require("fs");
var iconv 		 = require('iconv-lite')  

var bodyParser 	 = require('body-parser');
var multer  	 = require('multer');

app.use(express.static('public'));
app.use(bodyParser.urlencoded({ extended: false }));
app.use(multer({ dest: '/tmp/'}).array('image'));

//添加的新用户数据
var user = {
   "user4" : {
      "name" : "mohit",
      "password" : "password4",
      "profession" : "teacher",
      "id": 4
   }
}


// 创建 application/x-www-form-urlencoded 编码解析
var urlencodedParser = bodyParser.urlencoded({ extended: false })

app.use(express.static('public'));


app.get('/init.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "init.htm" );
})

app.get('/index.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "index.htm" );
})

app.get('/index6.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "index6.htm" );
})

app.get('/icheck.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "icheck.htm" );
})

app.get('/portfolio_minitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "portfolio_minitor_div.html" );
})

app.get('/portfolio_analyze_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "portfolio_analyze_div.html" );
})

app.get('/market_minitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "market_minitor_div.html" );
})

app.get('/process_minitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "process_minitor_div.html" );
})

app.get('/left_menu.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "left_menu.html" );
})

app.get('/product_monitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "product_monitor_div.html" );
})

app.get('/theme_minitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "theme_minitor_div.html" );
})

app.get('/wind_theme_minitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "wind_theme_minitor_div.html" );
})

app.get('/product_summary_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "product_summary_div.html" );
})

app.get('/strategy_event_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "strategy_event_div.html" );
})

app.get('/strategy_event_dgdzjc_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "strategy_event_dgdzjc_div.html" );
})

app.get('/strategy_etf_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "strategy_etf_div.html" );
})

app.get('/macro_minitor_div.html', function (req, res) {
   res.sendFile( __dirname + "/public/src/" + "macro_minitor_div.html" );
})


app.get('/Rfunc', function(req, res){
	options = {
		host : "127.0.0.1",
		port : 6311,
		command: req.query["cmd"],
		filename: req.query["filename"],
		callback: function (err, val) {
            if (!err) {
				console.log("RETURN:" + val + "; FileName: " + req.query["filename"]
											+ "; Command: "  + req.query["cmd"])
            	return res.send({'success':true,'res':val});
            } else {
            	console.log("ERROR:Rserve call failed" + "; FileName: " + req.query["filename"]
													   + "; Command: "  + req.query["cmd"])
            	return res.send({'success':false});
            }
        },
    }
	rio.enableDebug(false);			//开启调试模式
    rio.evaluate(options);			//运行R代码
})

app.get('/python', function(req, res){
	var ret = '';
	//var cmd = req.query["cmd"];
	var args = req.query["args"];
	//console.log("发送的请求为："+cmd+args);
	function run_cmd(cmd, args, cb, end) {
		var spawn 	= require('child_process').spawn,
		child 		= spawn(cmd, args),
		me		 	= this;
		child.stdout.on('data', function (buffer) { cb(me, buffer) });
		child.stdout.on('end', end);
	}

	var foo = new run_cmd(
		'python', 
		[args],//windows路径，注意要用双斜杠，单个是转译
		function (me, buffer) { me.stdout += buffer.toString() },
		function () { 
			var result = foo.stdout;
			console.log(result);
			var pos = result.indexOf('{');
			ret = result.slice(pos,foo.stdout.length);
			console.log(ret);
			res.send({'success':true,'res':ret});
			res.end;		
		}
	);
})


var server = app.listen(8081, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("应用实例，访问地址为 http://%s:%s", host, port)

})