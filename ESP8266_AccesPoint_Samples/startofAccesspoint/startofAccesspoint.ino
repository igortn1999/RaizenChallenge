/*
   Copyright (c) 2015, Majenko Technologies
   All rights reserved.

   Redistribution and use in source and binary forms, with or without modification,
   are permitted provided that the following conditions are met:

 * * Redistributions of source code must retain the above copyright notice, this
     list of conditions and the following disclaimer.

 * * Redistributions in binary form must reproduce the above copyright notice, this
     list of conditions and the following disclaimer in the documentation and/or
     other materials provided with the distribution.

 * * Neither the name of Majenko Technologies nor the names of its
     contributors may be used to endorse or promote products derived from
     this software without specific prior written permission.

   THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
   ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
   WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
   DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
   ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
   (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
   LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
   ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
   SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/* Create a WiFi access point and provide a web server on it. */

#include <ESP8266WiFi.h>
#include <WiFiClient.h>
#include <ESP8266WebServer.h>

#define blue D0 //blue GPIO 10
#define red D3 //red GPIO 5
#define green D2//green GPIO 4

#define analog A0 //analog ADC 0


#ifndef APSSID
#define APSSID "Raizen-Guardian"
#define APPSK  "Guardi4n"
#endif

/* Set these to your desired credentials. */
const char *ssid = APSSID;
const char *password = APPSK;

ESP8266WebServer server(80);

/* Just a little test message.  Go to http://192.168.4.1 in a web browser
   connected to this access point to see it.
*/
void handleRoot() {
  Serial.println("Connection atempt");
  server.send(200, "text/html", "<h1>You are connected</h1>");
}

void ledOn(){
  Serial.println("led on");
  digitalWrite(blue, HIGH);
  digitalWrite(red, HIGH);

  server.send(200,"text/html", "<h1>Setting led to ON</h1>");
}

void ledOff(){
  Serial.println("led off");
  digitalWrite(blue, LOW);
  digitalWrite(red, LOW);

  server.send(200,"text/html", "<h1>Setting led to OFF</h1>");
}

void sensor(){
//  server.send(200, "text/html", ((String)digitalRead(analog)));
  Serial.println("sensor");
  server.send(200, "text/html", ((String)analogRead(analog)));
}

void setup() {
  delay(1000);
  Serial.begin(115200);
  Serial.println();
  Serial.print("Configuring access point...");
  /* You can remove the password parameter if you want the AP to be open. */
  WiFi.softAP(ssid, password);

  IPAddress myIP = WiFi.softAPIP();
  Serial.print("AP IP address: ");
  Serial.println(myIP);
  server.on("/", handleRoot);
  //adding endpoints
  server.on("/on", ledOn);
  Serial.println("/on enabled");
  server.on("/off", ledOff);
  Serial.println("/off enabled");
  server.on("/sensor", sensor);
  Serial.println("/sensor enabled");
  
  server.begin();
  Serial.println("HTTP server started");

  //Start of setup for light and transistors
  pinMode(blue, OUTPUT);
  digitalWrite(blue, HIGH);
  digitalWrite(red, LOW);
  delay(500);
  digitalWrite(blue, LOW);
  digitalWrite(red, HIGH);
  delay(500);
  digitalWrite(blue, HIGH);
  digitalWrite(red, LOW);
  delay(500);
  digitalWrite(blue, LOW);
  digitalWrite(red, HIGH);
  delay(500);
  digitalWrite(red, LOW);
  Serial.println("end setup");
  Serial.print("ssid: ");
  Serial.println(ssid);
  Serial.print("password: ");
  Serial.println(password);
}

void loop() {
  server.handleClient();
}
