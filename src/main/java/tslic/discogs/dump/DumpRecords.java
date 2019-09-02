package tslic.discogs.dump;

import java.io.InputStream;
import java.util.Iterator;
import tslic.discogs.dump.models.Artist;
import tslic.discogs.dump.models.Label;
import tslic.discogs.dump.models.Master;
import tslic.discogs.dump.models.Release;

public class DumpRecords {

  public static Iterator<Artist> readArtists(InputStream inputStream) {
    return new DumpRecordIterator<>(inputStream, Artist.class);
  }

  public static Iterator<Release> readReleases(InputStream inputStream) {
    return new DumpRecordIterator<>(inputStream, Release.class);
  }

  public static Iterator<Master> readMasters(InputStream inputStream) {
    return new DumpRecordIterator<>(inputStream, Master.class);
  }

  public static Iterator<Label> readLabels(InputStream inputStream) {
    return new DumpRecordIterator<>(inputStream, Label.class);
  }
}
