package com.ignacia.VAT.Model;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created by jhudeska on Oct, 2020
 */
public class Cube extends Shape{
    private Property<Double> lengthProperty = new SimpleObjectProperty<>(0.0);
    private Property<Double> widthProperty = new SimpleObjectProperty<>(0.0);
    private Property<Double> heightProperty = new SimpleObjectProperty<>(0.0);

    protected static Shape from(ResultSet resultSet) throws SQLException {
        Cube cube = new Cube();
        cube.lengthProperty.setValue(resultSet.getDouble("lengte"));
        cube.widthProperty.setValue(resultSet.getDouble("breedte"));
        cube.heightProperty.setValue(resultSet.getDouble("hoogte"));
        return cube;
    }

    /**
     * Abstract method
     */
    @Override
    public String getDetails() {
        return null;
    }

    @Override
    HashMap<String, Object> getProperties() {
        return null;
    }

    @Override
    double getVolume() {
        return 0;
    }
}
