

var rio = require("rio");

function Rfunc (res){
	options = {
		host : "127.0.0.1",
		port : 6311,
	callback: function (err, val) {
            if (!err) {
            	console.log("RETURN:"+val);
            	// return res.send({'success':true,'res':val});
            } else {
            	console.log("ERROR:Rserve call failed")
            	// return res.send({'success':false});
            }
        },
    }
    rio.enableDebug(true);//��������ģʽ
    rio.evaluate({command: "pi / 2 * 2"}, options);//����R����
};

Rfunc()