package tslic.discogs.dump.models;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "artist")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Artist {

  @XmlElement(name = "id")
  private Integer id;

  @XmlElement(name = "name")
  private String name;

  @XmlElement(name = "realname")
  private String realName;

  @XmlElement(name = "profile")
  private String profile;

  @XmlAttribute(name = "status")
  private String status;

  @XmlElement(name = "data_quality")
  private String dataQuality;

  @XmlElementWrapper(name = "namevariations")
  @XmlElement(name = "name")
  private List<String> nameVariations = new LinkedList<>();

  @XmlElementWrapper(name = "urls")
  @XmlElement(name = "url")
  private List<String> urls = new LinkedList<>();

  @XmlElementWrapper(name = "aliases")
  @XmlElement(name = "name")
  private List<ArtistAlias> aliases = new LinkedList<>();

  @XmlElementWrapper(name = "groups")
  @XmlElement(name = "name")
  private List<Group> groups = new LinkedList<>();

  @XmlElementWrapper(name = "members")
  @XmlElement(name = "name")
  private List<GroupMember> members = new LinkedList<>();
}
