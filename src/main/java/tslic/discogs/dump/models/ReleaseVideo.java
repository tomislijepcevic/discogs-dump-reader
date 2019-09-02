package tslic.discogs.dump.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReleaseVideo {

  @XmlAttribute(name = "src")
  private String src;

  @XmlAttribute(name = "duration")
  private String duration;

  @XmlAttribute(name = "embed")
  private Boolean embed;

  @XmlElement(name = "title")
  private String title;

  @XmlElement(name = "description")
  private String description;
}
