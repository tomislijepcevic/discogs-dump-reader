package tslic.discogs.dump.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ReleaseFormat {

  @XmlAttribute(name = "name")
  private String name;

  @XmlAttribute(name = "qty")
  private String qty;

  @XmlAttribute(name = "text")
  private String text;

  //	 Missing array of descriptions

  //	<descriptions>
  //	    <description>12"</description>
  //	    <description>33 ⅓ RPM</description>
  //	</descriptions>
}
