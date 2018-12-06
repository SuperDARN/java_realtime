Here are some basic instructions for compiling and using the java applet on a linux computer.
Similar instructions should work on any operating system where the java SDK is installed.

To compile java in this directory:

`javac *.java`

This will create a series of class files.

Now to open up a basic realtime display window from a terminal run:

`java FitACFDisplayApp -n <name> -p <port> <host>`

where:

`<name>` is the descriptive name you want to use for the radar in the display  
`<port>` is the tcp port number for the real time feed  
`<host>` is the internet host (ip address or hostname) providing the feed  

Other command line options include:

`-c <channel>`  
`-b <beam>`  (default is 7)  
`-r <nrang>` (default is 75)  
`-f <config_filename>` (default is radar.cfg)  

where a configuration file has the format:

```
hosts=<host>  
ports=<port>  
names=<name>
...
```
