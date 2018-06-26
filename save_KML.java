//Method to save KML file (Java - Android)

public void save_KML() {
    try {
        FileOutputStream fileOutputStream = openFileOutput("location.kml", Context.MODE_PRIVATE);
        XmlSerializer xmlSerializer;

        xmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        xmlSerializer.setOutput(fileOutputStream, "UTF-8");
        xmlSerializer.startDocument(null, null);
        xmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);

        xmlSerializer.startTag(null, "kml");
        xmlSerializer.startTag(null, "Document");
        xmlSerializer.startTag(null, "name");
        xmlSerializer.text("kmlFile");
        xmlSerializer.endTag(null, "name");
        xmlSerializer.startTag(null, "Style");
        xmlSerializer.attribute(null, "id", "transGreenPoly");
        xmlSerializer.startTag(null, "LineStyle");
        xmlSerializer.startTag(null, "width");
        xmlSerializer.text("1");
        xmlSerializer.endTag(null, "width");
        xmlSerializer.startTag(null, "color");
        xmlSerializer.text("7dff0000");
        xmlSerializer.endTag(null, "color");
        xmlSerializer.startTag(null, "colorMode");
        xmlSerializer.text("random");
        xmlSerializer.endTag(null, "colorMode");
        xmlSerializer.endTag(null, "LineStyle");
        xmlSerializer.endTag(null, "Style");
        xmlSerializer.startTag(null, "Folder");
        xmlSerializer.startTag(null, "name");
        xmlSerializer.text("Google Campus");
        xmlSerializer.endTag(null, "name");
        xmlSerializer.startTag(null, "visibility");
        xmlSerializer.text("1");
        xmlSerializer.endTag(null, "visibility");
        xmlSerializer.startTag(null, "description");
        xmlSerializer.text("Your Data");
        xmlSerializer.endTag(null, "description");
        xmlSerializer.startTag(null, "Placemark");
        xmlSerializer.startTag(null, "name");
        xmlSerializer.text("Data");
        xmlSerializer.endTag(null, "name");
        xmlSerializer.startTag(null, "visibility");
        xmlSerializer.text("1");
        xmlSerializer.endTag(null, "visibility");
        xmlSerializer.startTag(null, "styleUrl");
        xmlSerializer.text("#transRedPoly");
        xmlSerializer.endTag(null, "styleUrl");
        xmlSerializer.startTag(null, "LineString");
        xmlSerializer.startTag(null, "extrude");
        xmlSerializer.text("1");
        xmlSerializer.endTag(null, "extrude");
        xmlSerializer.startTag(null, "altitudeMode");
        xmlSerializer.text("relativeToGround");
        xmlSerializer.endTag(null, "altitudeMode");
        //xmlSerializer.startTag(null, "outerBoundaryIs");
        // xmlSerializer.startTag(null, "LinearRing");
        xmlSerializer.startTag(null, "coordinates");

            xmlSerializer.text(longitude_1_buffer + "," + latitude_1_buffer + ",17 \n");
            xmlSerializer.text(longitude_2_buffer + "," + latitude_2_buffer + ",17 \n");;
            xmlSerializer.text(longitude_3_buffer + "," + latitude_3_buffer + ",17 \n");
            xmlSerializer.text(longitude_4_buffer + "," + latitude_4_buffer + ",17 \n");
            xmlSerializer.text(longitude_5_buffer + "," + latitude_5_buffer + ",17 \n");

        xmlSerializer.endTag(null, "coordinates");
        // xmlSerializer.endTag(null, "LinearRing");
        //xmlSerializer.endTag(null, "outerBoundaryIs");
        xmlSerializer.endTag(null, "LineString");
        xmlSerializer.endTag(null, "Placemark");
        xmlSerializer.endTag(null, "Folder");
        xmlSerializer.endTag(null, "Document");
        xmlSerializer.endTag(null, "kml");
        xmlSerializer.endDocument();
        xmlSerializer.flush();
        fileOutputStream.close();

    } catch (IOException | XmlPullParserException e) {
        e.printStackTrace();
    }
}