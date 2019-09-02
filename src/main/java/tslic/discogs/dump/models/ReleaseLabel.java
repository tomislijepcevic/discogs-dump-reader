package tslic.discogs.dump.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReleaseLabel {

  @XmlAttribute(name = "id")
  private Integer id;

  @XmlAttribute(name = "name")
  private String name;

  @XmlAttribute(name = "catno")
  private String catno;
}
