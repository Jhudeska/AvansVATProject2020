package com.ignacia.VAT.Model;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * Created by jhudeska on Oct, 2020
 */
public class Cubiod extends Shape{
    private Property<Double> lengthProperty = new SimpleObjectProperty<>(0.0);
    private Property<Double> widthProperty = new SimpleObjectProperty<>(0.0);
    private Property<Double> heightProperty = new SimpleObjectProperty<>(0.0);


    @Override
    public String toString() {
        return super.toString();
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

    @Override
    public void insert(Connection connection) throws SQLException {
        super.insert(connection);
    }

    @Override
    public void delete() {
        super.delete();
    }
}
