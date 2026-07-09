/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.tinyexr;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.tinyexr.*;

import java.io.*;
import java.nio.*;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.util.tinyexr.TinyEXR.*;

public final class HelloTinyEXR {

    private HelloTinyEXR() {
    }

    public static void main(String[] args) {
        String filename = args.length == 0 ? "https://github.com/syoyo/tinyexr/raw/release/asakusa.exr" : args[0];

        ByteBuffer memory;
        try {
            memory = ioResourceToByteBuffer(filename, 1200 * 1024);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int result;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            EXRHeader  header  = EXRHeader.malloc(stack);
            EXRVersion version = EXRVersion.malloc(stack);

            PointerBuffer err = stack.mallocPointer(1);

            result = ParseEXRVersionFromMemory(version, memory);
            if (result < 0) {
                throw new IllegalStateException("Failed to parse EXR image version: " + result);
            }

            System.out.println("Parsed EXR image version successfully.");
            System.out.println("--------------------------------------");

            System.out.println("Version : " + version.version());
            System.out.println("Tiled : " + version.tiled());
            System.out.println("Long name : " + version.long_name());
            System.out.println("Non-image : " + version.non_image());
            System.out.println("Multipart : " + version.multipart());

            InitEXRHeader(header);
            result = ParseEXRHeaderFromMemory(header, version, memory, err);
            check(result, err);

            System.out.println();
            System.out.println("Parsed EXR image header successfully.");
            System.out.println("-------------------------------------");

            System.out.println("Pixel aspect ratio : " + header.pixel_aspect_ratio());
            System.out.println("Line order : " + header.line_order());
            System.out.println("Data window : " + header.data_window().min_x() + ", " + header.data_window().min_y() + " -> " + header.data_window().max_x() + ", " + header.data_window().max_y());
            System.out.println("Display window : " + header.display_window().min_x() + ", " + header.display_window().min_y() + " -> " + header.display_window().max_x() + ", " + header.display_window().max_y());
            System.out.println("Screen window center : " + header.screen_window_center().get(0) + ", " + header.screen_window_center().get(1));
            System.out.println("Screen window width : " + header.screen_window_width());
            System.out.println("Chunk count : " + header.chunk_count());
            System.out.println("Tiled : " + header.tiled());
            System.out.println("Tile size x : " + header.tile_size_x());
            System.out.println("Tile size y : " + header.tile_size_y());
            System.out.println("Tile level mode : " + header.tile_level_mode());
            System.out.println("Tile rounding mode : " + header.tile_rounding_mode());
            System.out.println("Long name : " + header.long_name());
            System.out.println("Non-image : " + header.non_image());
            System.out.println("Multipart : " + header.multipart());
            System.out.println("Header length : " + header.header_len());
            System.out.println("Number of custom attributes : " + header.num_custom_attributes());
            System.out.println("Custom attributes : " + header.custom_attributes());
            System.out.println("Channels : " + header.channels().remaining());
            System.out.println("Pixel types : " + header.pixel_types().remaining());
            System.out.println("Number of channels : " + header.num_channels());
            System.out.println("Compression type : " + header.compression_type());
            System.out.println("Requested pixel types : " + header.requested_pixel_types().remaining());
            System.out.println("Name : " + header.nameString());

            EXRImage image = EXRImage.malloc(stack);
            InitEXRImage(image);

            result = LoadEXRImageFromMemory(image, header, memory, err);
            check(result, err);

            System.out.println();
            System.out.println("Parsed EXR image successfully.");
            System.out.println("------------------------------");

            System.out.println("Level x: " + image.level_x());
            System.out.println("Level y: " + image.level_y());
            System.out.println("Images: " + image.images().remaining());
            System.out.println("Width: " + image.width());
            System.out.println("Height: " + image.height());
            System.out.println("Number of channels: " + image.num_channels());
            System.out.println("Number of tiles: " + image.num_tiles());

            FreeEXRImage(image);
            FreeEXRHeader(header);
        }
    }

    private static void check(int result, PointerBuffer err) {
        if (result < 0) {
            String msg = err.getStringASCII(0);
            nFreeEXRErrorMessage(err.get(0));
            throw new IllegalStateException("EXR error: " + result + " | " + msg);
        }
    }

}