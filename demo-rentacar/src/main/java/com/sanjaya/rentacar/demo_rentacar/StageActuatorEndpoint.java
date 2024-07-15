package com.sanjaya.rentacar.demo_rentacar;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="stage")
public class StageActuatorEndpoint {
    Map<String,Stage> stages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String,Stage> getAllStages(){
        return stages;
    }

    @ReadOperation
    public Stage getStages(@Selector String name) {//http://localhost:8080/actuator/{name}
        return stages.get(name);
    }

    @WriteOperation
    public void setStages(@Selector String name, int stage) {//http://localhost:8080/actuator/{name}
        stages.put(name, new Stage(stage));
    }

    static class Stage {
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    /*static class Stage {
        String value;

        public Stage(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }*/
}
