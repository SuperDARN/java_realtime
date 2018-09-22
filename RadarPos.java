/* RadarPos.java
   =============
   Author R.J.Barnes
*/

/*
 $License$
*/




import java.lang.*;


class RadarPos {
   double gdlat=0;
   double gdlon=0;
   double rxris=0;
   double bmwidth=0;
   double boresite=0;
   

   public RadarPos(double gdlat,double gdlon,double boresite,
            double bmwidth,double rxris) {
     this.gdlat=gdlat;
     this.gdlon=gdlon;
     this.rxris=rxris;
     this.bmwidth=bmwidth;
     this.boresite=boresite;
   }

   public RadarPos(int st_id) {
    this.setPos(st_id);
   }

   public void setPos(int st_id) {
     switch (st_id){
       case 1: /* Goose Bay (gbr) */
         this.gdlat=+53.32;
         this.gdlon=-60.46;
         this.boresite=5.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 3: /* Kapuskasing (kap) */
         this.gdlat=+49.39;
         this.gdlon=-82.32;
         this.boresite=-12.00;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 4: /* Halley (hal) */
         this.gdlat=-75.52;
         this.gdlon=-26.63;
         this.boresite=5.0;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
       case 5: /* Saskatoon (sas) */
         this.gdlat=+52.16;
         this.gdlon=-106.53;
         this.boresite=23.10;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 6: /* Prince George (pgr) */
         this.gdlat=+53.98;
         this.gdlon=-122.59;
         this.boresite=-5.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 7: /* Kodiak (kod) */
         this.gdlat=+57.61;
         this.gdlon=-152.28;
         this.boresite=30.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
       case 8: /* Stokkseyri (sto) */
         this.gdlat=+63.86;
         this.gdlon=-21.03;
         this.boresite=-59.0;
         this.bmwidth=3.29;
         this.rxris=100.0;
         break;
       case 9: /* Pykkvibaer (pyk) */
         this.gdlat=+63.77;
         this.gdlon=-20.54;
         this.boresite=30.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
       case 10: /* Hankasalmi (han) */
         this.gdlat=+62.32;
         this.gdlon=+26.61;
         this.boresite=-12.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
       case 11: /* Sanae (san) */
         this.gdlat=-71.68;
         this.gdlon=-2.85;
         this.boresite=173.2;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
       case 12: /* Syowa South (sys) */
         this.gdlat=-69.0;
         this.gdlon=+39.58;
         this.boresite=165.0;
         this.bmwidth=-3.33;
         this.rxris=50.0;
         break;
       case 13: /* Syowa East (sye) */
         this.gdlat=-69.01;
         this.gdlon=+39.61;
         this.boresite=106.5;
         this.bmwidth=-3.33;
         this.rxris=50.0;
         break;
       case 14: /* TIGER (tig) */
         this.gdlat=-43.38;
         this.gdlon=+147.23;
         this.boresite=180.0;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
       case 15: /* Kerguelen (ker) */
         this.gdlat=-49.35;
         this.gdlon=+70.26;
         this.boresite=168.0;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
       case 16: /* King Salmon (ksr) */
         this.gdlat=58.68;
         this.gdlon=-156.65;
         this.boresite=-20.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
      case 18: /* Unwin (unw) */
         this.gdlat=-46.51;
         this.gdlon=168.38;
         this.boresite=227.9;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
      case 20: /* McMurdo (mcm) */
         this.gdlat=-77.88;
         this.gdlon=166.73;
         this.boresite=+263.4;
         this.bmwidth=+3.24;
         this.rxris=0.0;
         break;
      case 21: /* Falkland Islands (fir) */
         this.gdlat=-51.831;
         this.gdlon=-58.979;
         this.boresite=+178.3;
         this.bmwidth=-3.24;
         this.rxris=0.0;
         break;
      case 22: /* South Pole (sps) */
         this.gdlat=-89.995;
         this.gdlon=+118.291;
         this.boresite=+75.7;
         this.bmwidth=+3.24;
         this.rxris=0.0;
         break;
      case 32: /* Wallops Island (wal) */
         this.gdlat=+37.93;
         this.gdlon=-75.47;
         this.boresite=35.9;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 33: /* Blackstone (bks) */
         this.gdlat=+37.10;
         this.gdlon=-77.95;
         this.boresite=-40.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 40: /* Hokkaido East (hok) */
         this.gdlat=+43.53;
         this.gdlon=143.61;
         this.boresite=30.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
      case 41: /* Hokkaido West (hkw) */
         this.gdlat=+43.54;
         this.gdlon=143.61;
         this.boresite=-30.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
      case 64: /* Inuvik (inv) */
         this.gdlat=+68.414;
         this.gdlon=-133.772;
         this.boresite=29.5;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 65: /* Rankin Inlet (rkn) */
         this.gdlat=+62.828;
         this.gdlon=-93.113;
         this.boresite=5.7;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 66: /* Clyde River (cly) */
         this.gdlat=+70.487;
         this.gdlon=-68.504;
         this.boresite=-55.62;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 90: /* Longyearbyen (lyr) */
         this.gdlat=+78.153;
         this.gdlon=16.074;
         this.boresite=23.7;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
      case 96: /* Dome C East (dce) */
         this.gdlat=-75.09;
         this.gdlon=123.35;
         this.boresite=115.0;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
      case 204: /* Fort Hays West (fhw) */
         this.gdlat=+38.859;
         this.gdlon=-99.389;
         this.boresite=-25.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 205: /* Fort Hays East (fhe) */
         this.gdlat=+38.859;
         this.gdlon=-99.389;
         this.boresite=45.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
      case 206: /* Christmas Valley West (cvw) */
         this.gdlat=+43.271;
         this.gdlon=-120.358;
         this.boresite=-20.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 207: /* Christmas Valley East (cve) */
         this.gdlat=+43.271;
         this.gdlon=-120.358;
         this.boresite=54.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
      case 208: /* Adak West (adw) */
         this.gdlat=+51.89;
         this.gdlon=-176.63;
         this.boresite=-28.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      case 209: /* Adak East (ade) */
         this.gdlat=+51.89;
         this.gdlon=-176.63;
         this.boresite=46.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
      default:
         this.gdlat=+53.32;
         this.gdlon=-60.46;
         this.boresite=5.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;


     }
   }
}
