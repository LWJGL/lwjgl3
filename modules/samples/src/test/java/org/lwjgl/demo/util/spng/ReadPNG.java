/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.spng;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.spng.*;

import java.io.*;
import java.nio.*;
import java.security.*;
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.spng.SPNG.*;

public class ReadPNG {

    private ReadPNG() {
    }

    public static void main(String[] args) {
        // Forward declerations for easier cleanup.
        ByteBuffer buffer = null;
        ByteBuffer pixels = null;

        // Create a new context
        long context = spng_ctx_new(0);
        if (context == NULL) {
            throw new RuntimeException("Failed to create new spng context");
        }

        // Set some limits for untusted PNG files
        spng_set_image_limits(context, 4096, 4096);
        spng_set_chunk_limits(context, 1024 * 1024, 1024 * 1024);

        try (MemoryStack stack = stackPush()) {
            // Read a PNG file into a ByteBuffer to pass to spng.
            try (
                InputStream input = Objects.requireNonNull(ReadPNG.class.getResourceAsStream("/lwjgl16.png"));
                ByteArrayOutputStream output = new ByteArrayOutputStream()
            ) {
                byte[] staging = new byte[1024 * 1024];
                int    read;
                while ((read = input.read(staging)) > 0) {
                    output.write(staging, 0, read);
                }

                byte[] data = output.toByteArray();
                buffer = memAlloc(data.length);
                buffer.put(data);
                buffer.position(0);
            } catch (IOException e) {
                throw new RuntimeException("Failed to read sample image", e);
            }

            // Give the buffer to spng to read.
            int result = spng_set_png_buffer(context, buffer);
            if (result != SPNG_OK) {
                throw new RuntimeException("spng_set_png_buffer failed with " + spng_strerror(result) + " (" + result + ')');
            }

            // Get the IHDR chunk to get information about the image.
            spng_ihdr header = spng_ihdr.calloc(stack);
            result = spng_get_ihdr(context, header);
            if (result != SPNG_OK) {
                throw new RuntimeException("spng_get_ihdr failed with " + spng_strerror(result) + " (" + result + ')');
            }

            // ... like the width and height.
            int width  = header.width();
            int height = header.height();
            System.out.println("Loading PNG image with dimensions: " + width + "x" + height);

            // Get the size of buffer we will need to store the pixel data
            PointerBuffer bufferSizePointer = stack.pointers(0);
            result = spng_decoded_image_size(context, SPNG_FMT_RGBA8, bufferSizePointer);
            if (result != SPNG_OK) {
                throw new RuntimeException("spng_decoded_image_size failed with " + spng_strerror(result) + " (" + result + ')');
            }
            int size = (int)bufferSizePointer.get(0);

            // Parse the PNG file and put the pixels into the pixel buffer
            pixels = memAlloc(size);
            result = spng_decode_image(context, pixels, SPNG_FMT_RGBA8, 0);
            if (result != SPNG_OK) {
                throw new RuntimeException("spng_decode_image failed with " + spng_strerror(result) + " (" + result + ')');
            }

            // You can access the pixels of the image from the pixels buffer now!

            // Just as a simple example, compute the hash of the pixel data and print it out.
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");
                digest.update(pixels);

                System.out.println("lwjgl16.png pixel data hash:");
                byte[] hash = digest.digest();
                for (byte datum : hash) {
                    System.out.printf("%02X", datum);
                }
                System.out.println();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("Failed to get SHA-256 digest?", e);
            }
        } finally {
            // Ensure that things get cleaned up.
            spng_ctx_free(context);
            memFree(buffer);
            memFree(pixels);
        }
    }
}
