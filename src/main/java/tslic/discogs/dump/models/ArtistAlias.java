package tslic.discogs.dump.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ArtistAlias {

  @XmlAttribute(name = "id")
  private Integer id;

  @XmlValue private String name;
}
