package tslic.discogs.dump.models;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "label")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Label {

  @XmlElement(name = "id")
  private Integer id;

  @XmlElement(name = "name")
  private String name;

  @XmlElement(name = "contactinfo")
  private String contactInfo;

  @XmlElement(name = "profile")
  private String profile;

  @XmlElement(name = "data_quality")
  private String dataQuality;

  @XmlElementWrapper(name = "urls")
  @XmlElement(name = "url")
  private List<String> urls = new LinkedList<>();

  @XmlElementWrapper(name = "sublabels")
  @XmlElement(name = "label")
  private List<SubLabel> subLabels = new LinkedList<>();
}
