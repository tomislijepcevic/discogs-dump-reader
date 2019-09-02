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

@XmlRootElement(name = "release")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Release {

  @XmlAttribute(name = "id")
  private Integer id;

  @XmlElement(name = "title")
  private String title;

  @XmlElement(name = "country")
  private String country;

  @XmlElement(name = "notes")
  private String notes;

  @XmlElement(name = "released")
  private String released;

  @XmlAttribute(name = "status")
  private String status;

  @XmlElement(name = "data_quality")
  private String dataQuality;

  @XmlElement(name = "master_id")
  private Integer masterId;

  @XmlElementWrapper(name = "genres")
  @XmlElement(name = "genre")
  private List<String> genres = new LinkedList<>();

  @XmlElementWrapper(name = "styles")
  @XmlElement(name = "style")
  private List<String> styles = new LinkedList<>();

  @XmlElementWrapper(name = "artists")
  @XmlElement(name = "artist")
  private List<ReleaseArtist> artists = new LinkedList<>();

  @XmlElementWrapper(name = "extraartists")
  @XmlElement(name = "artist")
  private List<ReleaseExtraArtist> extraArtists = new LinkedList<>();

  @XmlElementWrapper(name = "formats")
  @XmlElement(name = "format")
  private List<ReleaseFormat> formats = new LinkedList<>();

  @XmlElementWrapper(name = "videos")
  @XmlElement(name = "video")
  private List<ReleaseVideo> videos = new LinkedList<>();

  @XmlElementWrapper(name = "companies")
  @XmlElement(name = "company")
  private List<Company> companies = new LinkedList<>();

  @XmlElementWrapper(name = "labels")
  @XmlElement(name = "label")
  private List<ReleaseLabel> labels = new LinkedList<>();

  @XmlElementWrapper(name = "tracklist")
  @XmlElement(name = "track")
  private List<Track> tracks = new LinkedList<>();
}
