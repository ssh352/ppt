
var exec = require("child_process").exec;
var rio = require("rio");
var G_res;

function start(response) {
	console.log("Request handler 'start' was called.");
	var content = "empty";

	exec("ipconfig", function (error, stdout, stderr) {
		response.writeHead(200, {"Content-Type": "text/plain",  "charset": "UTF-8"});
		response.write(stdout);
		response.end();
	});

  return content;
}

function upload(response) {
	console.log("Request handler 'upload' was called.");
	response.writeHead(200, {"Content-Type": "text/plain"});
	response.write("Hello Upload");
	response.end();
}

function displayResponse(err, res) {
    var i;

    if (!err) {
        res = JSON.parse(res);
        for (i = 0; i < args.prods.length; i += 1) {
            console.log("Optimal weight for " + args.prods[i] +
                " is " + res.pw[i]);
        }
        // Optimal weights: 0.27107,0.2688,0.46013
    } else {
        console.log("Optimization failed");
    }
}

function Rfunc (response){
	G_res = response;
	options = {
		host : "127.0.0.1",
		port : 6311,
		command: "rnorm(10)",
		callback: function (err, val) {
            if (!err) {
            	console.log("RETURN:"+val);
				G_res.writeHead(200, {"Content-Type": "text/plain"});
				G_res.write('res: ' + val);
				G_res.end();
            } else {
            	console.log("ERROR:Rserve call failed")
				G_res.writeHead(200, {"Content-Type": "text/plain"});
				G_res.write('failed');
				G_res.end();
            }
        },
    }
	rio.enableDebug(false);//开启调试模式
    rio.evaluate(options);//运行R代码
};

exports.start = start;
exports.upload = upload;
exports.Rfunc = Rfunc;

