/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.msdfgen;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.freetype.*;
import org.lwjgl.util.msdfgen.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.stb.STBImageWrite.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.msdfgen.MSDFGen.*;
import static org.lwjgl.util.msdfgen.MSDFGenExt.*;

public class HelloMSDFGen {

    private HelloMSDFGen() {
    }

    public static void main(String[] args) throws IOException {
        ByteBuffer fontData = ioResourceToByteBuffer("demo/FiraSans.ttf", 512 * 1024);

        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            check(msdf_ft_set_load_callback(name -> FreeType.getLibrary().getFunctionAddress(memByteBuffer(name, memByteBufferNT1(name).capacity() + 1))));
            check(msdf_ft_init(pp));
            long ft = pp.get(0);

            check(msdf_ft_load_font_data(ft, fontData, pp));
            long font = pp.get(0);

            check(msdf_ft_font_load_glyph(font, 'A', MSDF_FONT_SCALING_EM_NORMALIZED, pp));
            long shape = pp.get(0);

            check(msdf_shape_normalize(shape));
            check(msdf_shape_edge_colors_simple(shape, 3.0));

            MSDFGenBitmap bitmap = MSDFGenBitmap.calloc(stack);
            check(msdf_bitmap_alloc(MSDF_BITMAP_TYPE_MSDF, 32, 32, bitmap));

            check(msdf_generate_msdf(bitmap, shape, MSDFGenTransform.calloc(stack)
                .scale(it -> it
                    .x(32.0)
                    .y(32.0))
                .translation(it -> it
                    .x(0.125)
                    .y(0.125))
                .distance_mapping(it -> it.
                    lower(-0.5 * 0.125)
                    .upper(0.5 * 0.125))
            ));

            MSDFGenBitmap output = bitmap;
            /*
            MSDFGenBitmap output = MSDFGenBitmap.calloc(stack);
            check(msdf_bitmap_alloc(MSDF_BITMAP_TYPE_MSDF, 32, 32, output));

            msdf_render_sdf(output, bitmap);
            //*/

            IntBuffer pi = stack.mallocInt(1);
            msdf_bitmap_get_channel_count(output, pi);
            int channelCount = pi.get(0);

            ByteBuffer pixels = getBitmapU8(stack, output, channelCount);

            //msdf_bitmap_free(output);
            msdf_bitmap_free(bitmap);

            stbi_flip_vertically_on_write(true);
            stbi_write_png("msdfgen.png", output.width(), output.height(), channelCount, pixels, 0);

            memFree(pixels);

            nmsdf_ft_font_destroy(font);
            msdf_ft_deinit(ft);

            Objects.requireNonNull(msdf_ft_get_load_callback()).free();
        }
    }

    private static ByteBuffer getBitmapU8(MemoryStack stack, MSDFGenBitmap bitmap, int channelCount) {
        PointerBuffer pp = stack.mallocPointer(1);

        check(msdf_bitmap_get_byte_size(bitmap, pp));
        long byteSize = pp.get(0);

        check(msdf_bitmap_get_pixels(bitmap, pp));
        FloatBuffer pixels = memFloatBuffer(pp.get(0), (int)byteSize >> 2);

        ByteBuffer data = memAlloc(pixels.capacity());
        for (int i = 0; i < pixels.capacity(); i++) {
            // clamp to [0, 1] range
            float v = max(0.0f, min(1.0f, pixels.get(i)));
            // half-down rounding (this is what msdfgen does)
            data.put(i, (byte)(~(int)(255.5f - 255.0f * v)));
            // half-up rounding
            //data.put(i, (byte)(255.f * v + 0.5f));
        }

        return data;
    }

    private static void check(int result) {
        if (result != MSDF_SUCCESS) {
            throw new IllegalStateException("Operation failed with error code: " + result);
        }
    }
}
