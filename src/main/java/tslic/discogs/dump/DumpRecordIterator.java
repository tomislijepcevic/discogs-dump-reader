package tslic.discogs.dump;

import java.io.InputStream;
import java.util.Iterator;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class DumpRecordIterator<T> implements Iterator<T> {

  private final Class<T> typeClass;
  private final XMLStreamReader xmlReader;
  private final Unmarshaller unmarshaller;

  DumpRecordIterator(InputStream inputStream, Class<T> typeClass) {
    try {
      this.typeClass = typeClass;
      xmlReader = XMLInputFactory.newInstance().createXMLStreamReader(inputStream);
      unmarshaller = JAXBContext.newInstance(typeClass).createUnmarshaller();

      // move to parent tag
      xmlReader.nextTag();

      // move to first child tag
      xmlReader.nextTag();
    } catch (JAXBException | XMLStreamException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public boolean hasNext() {
    return xmlReader.getEventType() == XMLStreamConstants.START_ELEMENT;
  }

  @Override
  public T next() {
    try {
      T item = typeClass.cast(unmarshaller.unmarshal(xmlReader));

      if (xmlReader.getEventType() == XMLStreamConstants.CHARACTERS) {
        xmlReader.next();
      }

      return item;
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
