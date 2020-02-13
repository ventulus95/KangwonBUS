package com.jistol.boilerplate.DTO;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@XmlRootElement(name = "item")
public class Item {
    private String nodeid;
    private String routeno;
    private String routetp;
    private int arrprevstationcnt;
    private String vehicletp;
    private int arrtime;

    public void setArrtime(int arrtime) {
        this.arrtime = arrtime/60;
    }
}
