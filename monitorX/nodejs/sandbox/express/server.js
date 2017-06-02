var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var fs = require("fs");
var iconv = require('iconv-lite')  

var bodyParser = require('body-parser');
var multer  = require('multer');

app.use(express.static('public'));
app.use(bodyParser.urlencoded({ extended: false }));
app.use(multer({ dest: '/tmp/'}).array('image'));

//��ӵ����û�����
var user = {
   "user4" : {
      "name" : "mohit",
      "password" : "password4",
      "profession" : "teacher",
      "id": 4
   }
}



// ���� application/x-www-form-urlencoded �������
var urlencodedParser = bodyParser.urlencoded({ extended: false })

app.use(express.static('public'));

app.get('/index.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "index.htm" );
})

app.get('/upload.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "upload.htm" );
})

app.get('/pie.htm', function (req, res) {
   res.sendFile( __dirname + "/" + "pie.htm" );
})

app.post('/process_post', urlencodedParser, function (req, res) {

   // ��� JSON ��ʽ
   response = {
       first_name:req.body.first_name,
       last_name:req.body.last_name
   };
   console.log(response);
   res.end(JSON.stringify(response));
})


app.post('/file_upload', function (req, res) {

   console.log(req.files[0]);  // �ϴ����ļ���Ϣ

   var des_file = __dirname + "/tmp/" + req.files[0].originalname;
   fs.readFile( req.files[0].path, function (err, data) {
        fs.writeFile(des_file, data, function (err) {
         if( err ){
              console.log( err );
         }else{
               response = {
                   message:'File uploaded successfully', 
                   filename:req.files[0].originalname
              };
          }
          console.log( response );
          res.end( JSON.stringify( response ) );
       });
   });
})


app.get('/listUsers', function (req, res) {
   fs.readFile( __dirname + "/" + "users.json", 'utf8', function (err, data) {
       console.log( data );
       res.end( data );
   });
})


app.get('/addUser', function (req, res) {
   // ��ȡ�Ѵ��ڵ�����
   fs.readFile( __dirname + "/" + "users.json", 'utf8', function (err, data) {
       data = JSON.parse( data );
       data["user4"] = user["user4"];
       console.log( data );
       res.end( JSON.stringify(data));
   });
})


var server = app.listen(8081, function () {

  var host = server.address().address
  var port = server.address().port

  console.log("Ӧ��ʵ�������ʵ�ַΪ http://%s:%s", host, port)

})