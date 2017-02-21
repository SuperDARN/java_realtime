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
       case 1: /* goose bay */
         this.gdlat=+53.32;
         this.gdlon=-60.46;
         this.boresite=5.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 3: /* kapuskasing */
         this.gdlat=+49.39;
         this.gdlon=-82.32;
         this.boresite=-12.00;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
       case 4: /* halley bay */
         this.gdlat=-75.52;
         this.gdlon=-26.63;
         this.boresite=5.0;
         this.bmwidth=-3.24;
         this.rxris=200.0;
         break;
       case 5: /* saskatoon */
         this.gdlat=+52.16;
         this.gdlon=-106.53;
         this.boresite=23.10;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 6: /* British Columbia */
         this.gdlat=+55.;
         this.gdlon=-125.;
         this.boresite=-15.0;
         this.bmwidth=3.24;
         this.rxris=0.0;
         break;
       case 7: /* kodiak */

         this.gdlat=+57.61;
         this.gdlon=-152.28;
         this.boresite=30.0;
         this.bmwidth=3.24;
         this.rxris=100.0;

         break;
       case 8: /* stokkseyri */
         this.gdlat=+63.86;
         this.gdlon=-22.02;
         this.boresite=-59.0;
         this.bmwidth=3.29;
         this.rxris=100.0;
         break;
       case 9: /* pykkvibaer */
         this.gdlat=+63.77;
         this.gdlon=-20.54;
         this.boresite=+30.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
       case 10: /* finland */
         this.gdlat=+62.32;
         this.gdlon=+26.61;
         this.boresite=-12.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
         break;
       case 11: /* sanae */
         this.gdlat=-72;
         this.gdlon=-3;
         this.boresite=170.0;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;
       case 12: /* syowa */
         this.gdlat=-69.0;
         this.gdlon=+39.58;
         this.boresite=159.0;
         this.bmwidth=-3.33;
         this.rxris=100.0;
         break;
       case 13: /* syowa */
         this.gdlat=-69.0;
         this.gdlon=+39.58;
         this.boresite=107.0;
         this.bmwidth=-3.33;
         this.rxris=50.0;
         break;
       case 14: /* tiger */
         this.gdlat=-43.38;
         this.gdlon=+147.23;
         this.boresite=180.0;
         this.bmwidth=-3.24;
         this.rxris=100.0;
         break;


       case 16: /* King Salmon */
         this.gdlat=58.68;
         this.gdlon=-156.65;
         this.boresite=-25.0;
         this.bmwidth=3.24;
         this.rxris=100.0;
      
         break;

      case 18: /* tiger NZ (Unwin) */
         this.gdlat=-46.51;
         this.gdlon=168.38;
         this.boresite=227.9;
         this.bmwidth=-3.24;
         this.rxris=100.0;
      
         break;

      case 32: /* Wallops Island */
         this.gdlat=+37.93;
         this.gdlon=-75.47;
         this.boresite=35.86;
         this.bmwidth=+3.24;
         this.rxris=0.0;      
         break;

      case 20: /* McMurdo */
	 this.gdlat=-77.88;
	 this.gdlon=166.73;
	 this.boresite=+263.4;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 22: /* South Pole */
	 this.gdlat=-89.995;
	 this.gdlon=+118.291;
	 this.boresite=+75.709;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 65: /* Rankin Inlet */
	 this.gdlat=+62.82;
	 this.gdlon=-93.11;
	 this.boresite=+8.73;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 204: /* FH West */
	 this.gdlat=+38.859;
	 this.gdlon=-99.389;
	 this.boresite=-25.;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 205: /* FH East */
	 this.gdlat=+38.859;
	 this.gdlon=-99.389;
	 this.boresite=+45.;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;


      case 206: /* CV West */
	 this.gdlat=+43.271;
	 this.gdlon=-120.358;
	 this.boresite=-20.;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 207: /* CV East */
	 this.gdlat=+43.271;
	 this.gdlon=-120.358;
	 this.boresite=+54.;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 208: /* Adak West */
	 this.gdlat=+51.833;
	 this.gdlon=-176.617;
	 this.boresite=-28.;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;

      case 209: /* Adak East */
	 this.gdlat=+51.833;
	 this.gdlon=-176.617;
	 this.boresite=+46.;
         this.bmwidth=+3.24;
         this.rxris=100.0;      
         break;



       default:
         this.gdlat=+53.32;
         this.gdlon=-60.46;
         this.boresite=5.0;
         this.bmwidth=3.24;
         this.rxris=50.0;
         break;


     }
   }
}
