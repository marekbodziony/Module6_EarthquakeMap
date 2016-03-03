package module6;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PConstants;
import processing.core.PGraphics;

public class TouristAttractionMarker extends CommonMarker {
	
	// TouristAttractionMarker shape is square and triangle
	public static int TRI_SIZE = 8;  // The size of the triangle marker
	public static int SQR_SIZE = 10;  // The size of the square marker
	
	public TouristAttractionMarker(Feature place){
		super(((PointFeature)place).getLocation(),place.getProperties());
		
	}

	public void showTitle(PGraphics pg, float x, float y){
		
		String attractionName = getName();
		String attractionAddress = getCity() + ", " + getCountry();
		
		pg.pushStyle();
		
		pg.fill(255, 255, 255);
		pg.textSize(12);
		pg.rectMode(PConstants.CORNER);
		pg.rect(x, y-TRI_SIZE-39, Math.max(pg.textWidth(attractionName), pg.textWidth(attractionAddress)) + 6, 39);
		pg.fill(0, 0, 0);
		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.text(attractionName, x+3, y-TRI_SIZE-33);
		pg.text(attractionAddress, x+3, y - TRI_SIZE -18);
		
		pg.popStyle();
	}
	
	public void drawMarker(PGraphics pg, float x, float y){
		pg.fill(0,192,0);
		pg.rect(x-SQR_SIZE/2, y, SQR_SIZE, 2*SQR_SIZE/3);
		pg.triangle(x-TRI_SIZE, y, x+TRI_SIZE, y, x, y-3*TRI_SIZE/4);
		
	}
	
	// helper method
	public String getCity(){
		return getStringProperty("city");
	}
	public String getCountry(){
		return getStringProperty("country");
	}
	public String getRegion(){
		return getStringProperty("region");
	}
	public String getName(){
		return getStringProperty("name");
	}
	
}
