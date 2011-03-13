package com.trit.gallerator.services;

import java.util.ArrayList;
import java.util.List;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.appengine.repackaged.org.json.JSONArray;
import com.google.appengine.repackaged.org.json.JSONObject;
import com.trit.gallerator.data.ImageData;

public class ImageService extends ServerResource
{
	@Get
	public String GetImages()
	{
		List<JSONObject> test = new ArrayList<JSONObject>();
		ImageData imageData = new ImageData();
		imageData.setServingUrl("http://farm6.static.flickr.com/5211/5515072779_54c76f4279_m.jpg");
		test.add(new JSONObject(imageData));
		JSONArray array = new JSONArray(test);
		
		return array.toString();

	}

}
