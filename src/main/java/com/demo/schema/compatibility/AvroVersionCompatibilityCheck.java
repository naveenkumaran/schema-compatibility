package com.demo.schema.compatibility;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Verify forward and backward compatibility
 *
 */
public class AvroVersionCompatibilityCheck {

    public static void baseVersion() throws IOException {
        Payment payment = Payment.newBuilder()
                .setId("Trans-id-0")
                .setAmount(100)
                .build();

        final DataFileWriter<Payment> paymentDataFileWriter= new DataFileWriter<>(new SpecificDatumWriter<>(Payment.class));
        paymentDataFileWriter.create(payment.getSchema(), new File("payment_V0.avro"));
        paymentDataFileWriter.append(payment);
        paymentDataFileWriter.close();
    }
}
