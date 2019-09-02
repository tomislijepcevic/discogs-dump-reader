package tslic.discogs.dump.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "master")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Master {

  @XmlAttribute(name = "id")
  private Integer id;

  @XmlElement(name = "main_release")
  private Integer mainReleaseId;
}
