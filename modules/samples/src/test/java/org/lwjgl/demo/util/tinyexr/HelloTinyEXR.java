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
        System.out.println("exr_get_version_string() = " + exr_get_version_string());
        System.out.println("exr_get_simd_info() = " + exr_get_simd_info());

        String filename = args.length == 0 ? "https://github.com/syoyo/tinyexr/raw/release/asakusa.exr" : args[0];

        ByteBuffer memory;
        try {
            memory = ioResourceToByteBuffer(filename, 1200 * 1024);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (MemoryStack stack = MemoryStack.stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            check(exr_context_create(ExrContextCreateInfo.calloc(stack).api_version(TINYEXR_C_API_VERSION), pp));

            long ctx = pp.get(0);

            System.out.println("ctx = " + ctx);

            ExrDataSource source = ExrDataSource.calloc(stack);
            check(exr_data_source_from_memory(memory, source));

            System.out.println("source.total_size() = " + source.total_size());
            System.out.println("source.flags() = " + source.flags());

            check(exr_decoder_create(ctx, ExrDecoderCreateInfo.calloc(stack)
                .source(source), pp));

            long decoder = pp.get(0);

            //exr_decoder_parse_header()
            System.out.println("decoder = " + decoder);

            check(exr_decoder_parse_header(decoder, pp));

            long image = pp.get(0);
            System.out.println("image = " + image);

            ExrImageInfo info = ExrImageInfo.calloc(stack);
            check(exr_image_get_info(image, info));

            System.out.println("info.width() = " + info.width());
            System.out.println("info.height() = " + info.height());
            System.out.println("info.data_window() = " + info.data_window());
            System.out.println("info.display_window() = " + info.display_window());
            System.out.println("info.num_channels() = " + info.num_channels());
            System.out.println("info.num_parts() = " + info.num_parts());
            System.out.println("info.compression() = " + info.compression());
            System.out.println("info.flags() = " + info.flags());
            System.out.println("info.tile_size_x() = " + info.tile_size_x());
            System.out.println("info.tile_size_y() = " + info.tile_size_y());
            System.out.println("info.num_x_levels() = " + info.num_x_levels());
            System.out.println("info.num_y_levels() = " + info.num_y_levels());
            System.out.println("info.pixel_aspect_ratio() = " + info.pixel_aspect_ratio());
            System.out.println("info.screen_window_center() = " + info.screen_window_center());
            System.out.println("info.screen_window_width() = " + info.screen_window_width());

            IntBuffer pi = stack.mallocInt(1);

            check(exr_image_get_channel_count(image, pi));
            int channelCount = pi.get(0);
            System.out.println("channelCount = " + channelCount);

            for (int c = 0; c < channelCount; c++) {
                try (MemoryStack frame = stack.push()) {
                    System.out.println("CHANNEL: " + c);
                    ExrChannelInfo channelInfo = ExrChannelInfo.calloc(frame);
                    check(exr_image_get_channel(image, c, channelInfo));

                    System.out.println("channelInfo.name() = " + channelInfo.nameString());
                    System.out.println("channelInfo.pixel_type() = " + channelInfo.pixel_type());
                    System.out.println("channelInfo.x_sampling() = " + channelInfo.x_sampling());
                    System.out.println("channelInfo.y_sampling() = " + channelInfo.y_sampling());
                    System.out.println("channelInfo.p_linear() = " + channelInfo.p_linear());
                }
            }

            check(exr_image_get_part_count(image, pi));
            int partCount = pi.get(0);
            System.out.println("partCount = " + partCount);

            for (int p = 0; p < partCount; p++) {
                try (MemoryStack frame = stack.push()) {
                    System.out.println("PART: " + p);
                    check(exr_image_get_part(image, p, pp));

                    long part = pp.get(0);

                    ExrPartInfo partInfo = ExrPartInfo.calloc(frame);
                    check(exr_part_get_info(part, partInfo));

                    System.out.println("partInfo.name() = " + partInfo.nameString());
                    System.out.println("partInfo.part_type() = " + partInfo.part_type());
                    System.out.println("partInfo.width() = " + partInfo.width());
                    System.out.println("partInfo.height() = " + partInfo.height());
                    System.out.println("partInfo.num_channels() = " + partInfo.num_channels());
                    System.out.println("partInfo.compression() = " + partInfo.compression());
                    System.out.println("partInfo.flags() = " + partInfo.flags());

                    check(exr_part_get_chunk_count(part, pi));
                    int chunkCount = pi.get(0);
                    System.out.println("chunkCount = " + chunkCount);

                    exr_part_destroy(part);
                }
            }

            exr_decoder_destroy(decoder);

            exr_context_destroy(ctx);
        }
    }

    private static void check(int result) {
        if (EXR_FAILED(result)) {
            throw new IllegalStateException("EXR error: " + result);
        }
    }

}