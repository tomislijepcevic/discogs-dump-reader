package tslic.discogs.dump.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReleaseArtist {

  @XmlElement(name = "id")
  private Integer id;

  @XmlElement(name = "name")
  private String name;

  @XmlElement(name = "anv")
  private String anv;

  @XmlElement(name = "join")
  private String join;

  @XmlElement(name = "tracks")
  private String tracks;
}
