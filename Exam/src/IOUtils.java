import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public interface IOUtils {
		//add a static method to store the product details from the map using ser.
			static void storeProductDetails(String fileName, List<Mobile> mobile) throws IOException {
				// Java App --> OOS --> FOS --> bin file
				try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
					out.writeObject(mobile);// serialization
				}
			}

			// add a static method for restoring product details , using de-ser from bin
			// file
			@SuppressWarnings("unchecked")
			static List<Mobile> restoreProductDetails(String fileName) throws IOException,ClassNotFoundException{
				// attach data strms for de-ser.
				// Java App <----- OIS: deserializer<-----FIS : node strm<---- Bin File
				try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
					return (List<Mobile>)in.readObject();
				}
			}
		}

