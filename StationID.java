/* StationID.java
   ============== 
   Author: R.J.Barnes
*/

/*
 $License$
*/




public class StationID {

   static String station[]={
      "Unused",
      "Goose Bay",
      "Schefferville",
      "Kapuskasing",
      "Halley",
      "Saskatoon",
      "Prince George",
      "Kodiak",
      "Stokkseyri",
      "Pykkvibaer",
      "Hankasalmi",
      "SANAE",
      "Syowa South",
      "Syowa East",
      "TIGER",
      "Kerguelen",
      "King Salmon",
      "Unused",
      "TIGER Unwin",
      "Zhongshan Station",
      "McMurdo",
      "Falkland Islands",
      "South Pole Station",
      "Unused",
      "Buckland Park",
      "Unknown"};

    static String stationmid[]={
        "Wallops Island",
        "Blackstone",
        "Unknown"};

    static String stationjapan[]={
        "Hokkaido East",
        "Hokkaido West",
        "Unknown"};

    static String stationchina[]={
        "Jiamusi East",
        "Unknown"};

   static String stationpolar[]={
        "Inuvik",
        "Rankin Inlet",
        "Clyde River",
        "Unknown"};

   static String stationpolar2[]={
        "Longyearbyen",
        "Unused",
        "Unused",
        "Unused",
        "Unused",
        "Unused",
        "Dome C East",
        "Dome C North",
        "Unknown"};

   static String stationmsi[]={
        "Fort Hays West",
        "Fort Hays East",
        "Christmas Valley West",
        "Christmas Valley East",
        "Adak West",
        "Adak East",
        "Iceland West",
        "Iceland East",
        "Unknown"};



    public static String toString(int id) {
      System.err.println("Stid="+id);
      if (id < 0) return station[station.length-1];


      if ((id>=32) && (id<40)) {
        if ((id-32)>stationmid.length-1) return stationmid[station.length-1];
        return stationmid[id-32];
      }
      if ((id>=40) && (id<50)) {
        if ((id-40)>stationjapan.length-1) return stationjapan[station.length-1];
        return stationjapan[id-40];
      }
      if ((id>=50) && (id<64)) {
        if ((id-50)>stationchina.length-1) return stationchina[station.length-1];
        return stationchina[id-50];
      }
      if ((id>=64) && (id<90)) {
        if ((id-64)>stationpolar.length-1) return stationpolar[station.length-1];
        return stationpolar[id-64];
      }
      if ((id>=90) && (id<128)) {
        if ((id-90)>stationpolar2.length-1) return stationpolar2[station.length-1];
        return stationpolar2[id-90];
      }
      if ((id>=204) && (id<512)) {
        if ((id-204)>stationmsi.length-1) return stationmsi[station.length-1];
        return stationmsi[id-204];
      }


      if (id > station.length-1) return station[station.length-1];
      return station[id];
    }


}

   


