package com.ignacia.VAT.Model;

import javafx.scene.control.SpinnerValueFactory;

/**
 * Created by jhudeska on Oct, 2020
 */
public class DoubleSpinnerFactory extends SpinnerValueFactory<Double> {


    @Override
    public void decrement(int steps) {
        this.valueProperty().setValue(this.valueProperty().getValue() - steps);
    }


    @Override
    public void increment(int steps) {
        this.valueProperty().setValue(this.valueProperty().getValue() + steps);
    }
}
