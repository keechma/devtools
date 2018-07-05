#!/usr/bin/env node

var dashdash = require("dashdash");
var express = require("express");
var app = express();
var server = require("http").Server(app);
var io = require("socket.io")(server);
var path = require("path");
var bodyParser = require("body-parser");
var cors = require("cors");

var options = [{ names: ["port", "p"], type: "integer", help: "Server port" }];
var parser = dashdash.createParser({ options: options });

try {
  var opts = parser.parse(process.argv);
} catch (e) {
  console.error("Error: %s", e.message);
  process.exit(1);
}

app.use(express.static(path.join(__dirname, "..", "resources", "public")));
app.use(bodyParser.json());
app.use(cors());

app.post("/e", function(req, res, next) {
  io.emit("event", req.body.body);
  res.json({});
});

server.listen(opts.port || 4567);
