package tslic.discogs.dump.models;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Track {

  @XmlElement(name = "title")
  private String title;

  @XmlElement(name = "duration")
  private String duration;

  @XmlElement(name = "position")
  private String position;

  @XmlElementWrapper(name = "artists")
  @XmlElement(name = "artist")
  private List<TrackArtist> artists = new LinkedList<>();

  @XmlElementWrapper(name = "extraartists")
  @XmlElement(name = "artist")
  private List<TrackExtraArtist> extraArtists = new LinkedList<>();
}
