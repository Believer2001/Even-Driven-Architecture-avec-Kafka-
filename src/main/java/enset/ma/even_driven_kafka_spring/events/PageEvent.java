package enset.ma.even_driven_kafka_spring.events;

import java.util.Date;

public record PageEvent(String name, String user, Date date, long duration ){ }
