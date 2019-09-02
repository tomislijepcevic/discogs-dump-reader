package tslic.discogs.dump;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import tslic.discogs.dump.models.Release;

public class Demo {

  public static void main(String[] args) throws IOException {
    InputStream inputStream =
        new URL(
                "https://discogs-data.s3-us-west-2.amazonaws.com/data/2019/discogs_20190801_releases.xml.gz")
            .openStream();

    //    or
    //    InputStream inputStream = new FileInputStream("discogs_20190201_releases.xml.gz");

    try (InputStream is = new GZIPInputStream(inputStream)) {
      Iterator<Release> releases = DumpRecords.readReleases(is);

      System.out.println(releases.next());
    }
  }
}
