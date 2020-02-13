package com.jistol.boilerplate.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@NoArgsConstructor
@Setter
@Getter
@ToString
@XmlRootElement(name = "body")
public class Body {
    private List<Item> items;
    private int numOfRows;
    private int pageNo;
    private int totalCount;

    @XmlElementWrapper(name = "items")
    @XmlElement(name = "item")
    public List<Item> getItems() {
        return items;
    }
}
