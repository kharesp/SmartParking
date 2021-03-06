package edu.vanderbilt.kharesp.smartparkingapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.ls.widgets.map.MapWidget;
import edu.vanderbilt.kharesp.gimbaltutorial.R;

/*
 * Created on 5/3/15.
 * <p/>
 * Contributors:
 * Michael A. Walker
 * Shweta P. Khare
 */

/**
 * This Activity will display a map (no fragment at this point)
 */
public
class MapActivity extends Activity {

	 final private static String MAP_ASSETS = "nashville_map";

	 @Override
	 protected
	 void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);

        /*
			* Attach the layout to this Activity
         */
		  setContentView(R.layout.map_layout);

        /*
			* Create the custom MapWidget Map
         */
		  MapWidget map = new MapWidget(this, MAP_ASSETS);

        /*
			* Find the LinearLayout in the Map Layout, and add the map to it.
         */
		  LinearLayout layout = (LinearLayout) findViewById(R.id.mainMapLayout);
		  layout.addView(map);


	 }


}
