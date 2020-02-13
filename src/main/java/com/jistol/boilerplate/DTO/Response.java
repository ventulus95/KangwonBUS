package com.jistol.boilerplate.DTO;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name ="response")
public class Response {
    private Header header;
    private Body body;

}
