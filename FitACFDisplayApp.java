/* FitACFDisplayApp.java
   ==================== 
   Author: R.J.Barnes
*/

/*
 $License$
*/




import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class FitACFDisplayApp {

 
public static void main(String args[]) {
  String hosts=null;
  String ports=null;
  String names=null;
  String streams=null;
  String channels=null;
  String beams=null;
  String nrangs=null;
  String deltas=null;
  String sf=null;
  String mapname=null;
  String fname=null;

  fname="radar.cfg";
  File tf=new File(fname);
  if (tf.exists()==false) fname=null;

  int i,j;

    for (i=0;i<args.length;i++) {
	if (args[i].startsWith("-p")==true) {
	    ports=args[i+1];
            i++;
	} else if (args[i].startsWith("-n")==true) {
	    names=args[i+1];
            i++;
	} else if (args[i].startsWith("-s")==true) {
	    streams=args[i+1];
            i++;
	} else if (args[i].startsWith("-c")==true) {
	  channels=args[i+1];
          i++;
	} else if (args[i].startsWith("-b")==true) {
	  beams=args[i+1];
          i++;
	} else if (args[i].startsWith("-r")==true) {
	  nrangs=args[i+1];
          i++;

	} else if (args[i].startsWith("-d")==true) {
	  deltas=args[i+1];
          i++;

	} else if (args[i].startsWith("-m")==true) {
	  mapname=args[i+1];
          i++;
	}  else if (args[i].startsWith("-sf")==true) {
	  sf=args[i+1];
          i++;
	} else if (args[i].startsWith("-f")==true) {
	  fname=args[i+1];
	  i++;
	} else hosts=args[i];
    }
 
    if (fname !=null) {
	/* load configuration from a file */
      try {
        String line=null,arg=null;
        FileInputStream in=null;
        BufferedReader txt=null;
        in=new FileInputStream(fname);
        txt=new BufferedReader(new InputStreamReader(in));
        
        while (true) {
          line=txt.readLine();
          if (line==null) break;
         
        
          for (i=0;(i<line.length()) &&
                    ((line.charAt(i)==' ') || (line.charAt(i) == '\t'));i++);
          if (i==line.length()) continue;
          if (line.charAt(i)=='#') continue;
          arg=line.substring(i);
          System.err.println(arg);
          if (arg.startsWith("hosts")==true) {
             j=arg.indexOf("=");
             hosts=arg.substring(j+1);
	  }
          if (arg.startsWith("ports")==true) {
             j=arg.indexOf("=");
             ports=arg.substring(j+1);
	  }
          if (arg.startsWith("names")==true) {
             j=arg.indexOf("=");
             names=arg.substring(j+1);
	  }
          if (arg.startsWith("streams")==true) {
             j=arg.indexOf("=");
             streams=arg.substring(j+1);
	  }
          if (arg.startsWith("channels")==true) {
             j=arg.indexOf("=");
             channels=arg.substring(j+1);
	  }
          if (arg.startsWith("beams")==true) {
             j=arg.indexOf("=");
             beams=arg.substring(j+1);
	  }
          if (arg.startsWith("nrangs")==true) {
             j=arg.indexOf("=");
             nrangs=arg.substring(j+1);
	  }

          if (arg.startsWith("deltas")==true) {
             j=arg.indexOf("=");
             deltas=arg.substring(j+1);
	  }
          if (arg.startsWith("mapname")==true) {
             j=arg.indexOf("=");
             mapname=arg.substring(j+1);
	  }
          if (arg.startsWith("scale")==true) {
             j=arg.indexOf("=");
             sf=arg.substring(j+1);
	  }


	}

      } catch (IOException e) {
        System.err.println("Failed to open configuration file.");
      }
    }


    if (hosts==null) hosts="209.128.50.18";	
    if (ports==null) ports="1024";
    if (names==null) names="Unknown";
    if (streams==null) streams="1";
    if (channels==null) channels="a";
    if (beams==null) beams="7";
    if (nrangs==null) nrangs="75";

    if (mapname==null) mapname="mapdata";
    if (sf==null) sf="2.8";
    new FitACFWindow(hosts,ports,names,streams,channels,beams,
                     nrangs,deltas,sf,mapname); 
  }     

}












