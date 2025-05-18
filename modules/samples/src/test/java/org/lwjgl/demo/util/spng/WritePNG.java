/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.spng;

import org.lwjgl.system.*;
import org.lwjgl.util.spng.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.spng.SPNG.*;

public class WritePNG {

    private WritePNG() {
    }

    public static void main(String[] args) {
        // A forward decleration for easier cleanup
        ByteBuffer pixels = null;

        // Create a new context that can encode PNG images instead of decode them
        long context = spng_ctx_new(SPNG_CTX_ENCODER);
        if (context == NULL) {
            throw new RuntimeException("Failed to create spng context");
        }

        try (MemoryStack stack = stackPush()) {
            // Set SPNG to encode to an internal buffer
            int result = spng_set_option(context, SPNG_ENCODE_TO_BUFFER, 1);
            if (result != SPNG_OK) {
                throw new RuntimeException("Failed to set options: " + spng_strerror(result));
            }

            // Setup an IHDR chunk that defines the basic properites of the PNG file
            spng_ihdr header = spng_ihdr.calloc(stack)
                .width(1024)
                .height(1024)
                .color_type(SPNG_COLOR_TYPE_TRUECOLOR_ALPHA)
                .bit_depth((byte)8);

            // ... and give it to SPNG.
            result = spng_set_ihdr(context, header);
            if (result != SPNG_OK) {
                throw new RuntimeException("Failed to set IHDR: " + spng_strerror(result));
            }

            // Generate some "graphics".
            pixels = memAlloc(1024 * 1024 * 4);
            Random random = new Random(0x123456789ABCDEFL);
            for (int i = 0; i < pixels.capacity(); i += 4) {
                pixels.putInt(i, random.nextInt() | 0xFF000000);
            }

            // Encode the PNG file
            result = spng_encode_image(context, pixels, SPNG_FMT_PNG, SPNG_ENCODE_FINALIZE);
            if (result != SPNG_OK) {
                throw new RuntimeException("Failed to encode image: " + spng_strerror(result));
            }

            // Get the buffer of the file, it is the format used on disk
            IntBuffer pi = stack.mallocInt(1);

            ByteBuffer buffer = spng_get_png_buffer(context, pi);
            result = pi.get(0);
            if (result != SPNG_OK || buffer == null) {
                throw new RuntimeException("Failed to get buffer: " + spng_strerror(result));
            }

            // Quick and dirty "is this a PNG file" check
            if (buffer.get(1) != 'P' || buffer.get(2) != 'N' || buffer.get(3) != 'G') {
                throw new RuntimeException("Generated PNG file did not appear to have a valid header");
            }

            memFree(buffer);
        } finally {
            // Cleanup
            memFree(pixels);
            spng_ctx_free(context);
        }
    }

}