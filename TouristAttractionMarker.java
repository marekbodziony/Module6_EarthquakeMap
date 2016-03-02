package module6;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

public class TouristAttractionMarker extends CommonMarker {
	
	// TouristAttractionMarker shape is square and triangle
	public static int TRI_SIZE = 6;  // The size of the triangle marker
	public static int SQR_SIZE = 8;  // The size of the square marker
	
	public TouristAttractionMarker(Feature place){
		super(((PointFeature)place).getLocation(),place.getProperties());
		
	}

	public void showTitle(PGraphics pg, float x, float y){
		
	}
	
	public void drawMarker(PGraphics pg, float x, float y){
		pg.fill(102,102,255);
		pg.rect(x-SQR_SIZE/2, y, SQR_SIZE, 2*SQR_SIZE/3);
		pg.triangle(x-TRI_SIZE, y, x+TRI_SIZE, y, x, y-2*TRI_SIZE/3);
		
	}
}
