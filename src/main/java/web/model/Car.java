package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
private long id;
private String model;
private int series;


public Car(int id, String model, int series) {
    this.id = id;
    this.model = model;
    this.series = series;
}

public long getId() {
    return id;
}

public String getModel() {
    return model;
}

public int getSeries() {
    return series;
}

@Override
public String toString() {
    return "Car{" +
            "id=" + id +
            ", model='" + model + '\'' +
            ", series=" + series +
            '}';
}
}
