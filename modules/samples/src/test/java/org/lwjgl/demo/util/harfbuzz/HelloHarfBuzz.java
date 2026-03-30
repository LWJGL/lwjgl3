/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.harfbuzz;

import org.lwjgl.system.*;
import org.lwjgl.util.harfbuzz.*;

import java.io.*;
import java.nio.*;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.harfbuzz.HarfBuzz.*;
import static org.lwjgl.util.harfbuzz.HarfBuzzGPU.*;
import static org.testng.Assert.*;

public class HelloHarfBuzz {

    public static void main(String[] args) {
        // For now just verify that the HarfBuzz library loads correctly
        System.out.println("Loaded HarfBuzz v" + hb_version_string());

        System.out.println("Loaded HarfBuzz GPU: " + HarfBuzzGPU.getLibrary());
        System.out.println("Loaded HarfBuzz Raster: " + HarfBuzzRaster.getLibrary());
        System.out.println("Loaded HarfBuzz Vector: " + HarfBuzzVector.getLibrary());

        // TODO: add real HarfBuzz sample

        // migrated from test/api/test-gpu.cc
        test_create_destroy();
        test_empty_encode();
        test_encode_glyph();
        test_reset();
        test_draw_funcs();
        test_shader_sources();
        test_recycle_blob();
    }

    private static void test_create_destroy() {
        long draw = hb_gpu_draw_create_or_fail();
        assertNotEquals(draw, NULL);

        long ref = hb_gpu_draw_reference(draw);
        assertEquals(ref, draw);
        hb_gpu_draw_destroy(ref);

        hb_gpu_draw_destroy(draw);
    }

    private static void test_empty_encode() {
        long draw = hb_gpu_draw_create_or_fail();
        assertNotEquals(draw, NULL);

        /* Encode with no curves should return empty blob. */
        long blob = hb_gpu_draw_encode(draw);
        assertNotEquals(blob, NULL);
        assertEquals(hb_blob_get_length(blob), 0);
        hb_blob_destroy(blob);

        /* Extents should be zero. */
        try (MemoryStack stack = stackPush()) {
            hb_glyph_extents_t ext = hb_glyph_extents_t.malloc(stack);
            hb_gpu_draw_get_extents(draw, ext);

            assertEquals(ext.x_bearing(), 0);
            assertEquals(ext.y_bearing(), 0);
            assertEquals(ext.width(), 0);
            assertEquals(ext.height(), 0);
        }

        hb_gpu_draw_destroy(draw);
    }

    private static final String FONT_FILE = "demo/FiraSans.ttf";

    private static void test_encode_glyph() {
        long face = hb_test_open_font_file(FONT_FILE);
        assertNotEquals(face, NULL);

        long font = hb_font_create(face);

        long draw = hb_gpu_draw_create_or_fail();
        assertNotEquals(draw, NULL);

        // Draw glyph for 'a' (glyph index from cmap).
        int gid;
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi    = stack.mallocInt(1);
            boolean   found = hb_font_get_nominal_glyph(font, 'a', pi);
            assertTrue(found);

            gid = pi.get(0);
        }

        hb_gpu_draw_glyph(draw, font, gid);

        // Encode should produce non -empty blob.
        long blob = hb_gpu_draw_encode(draw);
        assertNotEquals(blob, NULL);
        assertTrue(hb_blob_get_length(blob) > 0);

        // Blob size should be a multiple of 8 (RGBA16I texels).
        assertEquals(hb_blob_get_length(blob) % 8, 0);

        // Extents should be non -zero.
        /* Extents should be zero. */
        try (MemoryStack stack = stackPush()) {
            hb_glyph_extents_t ext = hb_glyph_extents_t.malloc(stack);
            hb_gpu_draw_get_extents(draw, ext);

            assertTrue(ext.width() > 0);
            assertTrue(ext.height() < 0); // height is negative(y - down)
        }

        hb_blob_destroy(blob);
        hb_gpu_draw_destroy(draw);
        hb_font_destroy(font);
        hb_face_destroy(face);
    }

    private static void test_reset() {
        long face = hb_test_open_font_file(FONT_FILE);
        long font = hb_font_create(face);

        long draw = hb_gpu_draw_create_or_fail();
        assertNotEquals(draw, NULL);

        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            hb_font_get_nominal_glyph(font, 'a', pi);
            int gid = pi.get(0);

            // Draw, encode, reset, encode again —should work.
            hb_gpu_draw_glyph(draw, font, gid);
            long blob1 = hb_gpu_draw_encode(draw);
            assertTrue(hb_blob_get_length(blob1) > 0);
            hb_blob_destroy(blob1);

            hb_gpu_draw_reset(draw);

            // After reset, encode should be empty.
            long blob2 = hb_gpu_draw_encode(draw);
            assertTrue(hb_blob_get_length(blob2) == 0);
            hb_blob_destroy(blob2);

            // Draw again after reset.
            hb_gpu_draw_glyph(draw, font, gid);
            long blob3 = hb_gpu_draw_encode(draw);
            assertTrue(hb_blob_get_length(blob3) > 0);
            hb_blob_destroy(blob3);
        }

        hb_gpu_draw_destroy(draw);
        hb_font_destroy(font);
        hb_face_destroy(face);
    }

    private static void test_draw_funcs() {
        long funcs = hb_gpu_draw_get_funcs();
        assertNotEquals(funcs, NULL);

        // Should be the same singleton each time.
        assertEquals(hb_gpu_draw_get_funcs(), funcs);
    }

    private static void test_shader_sources() {
        assertNotEquals(hb_gpu_shader_fragment_source(HB_GPU_SHADER_LANG_GLSL), NULL);
        assertNotEquals(hb_gpu_shader_vertex_source(HB_GPU_SHADER_LANG_GLSL), NULL);
    }

    private static void test_recycle_blob() {
        long face = hb_test_open_font_file(FONT_FILE);
        long font = hb_font_create(face);

        long draw = hb_gpu_draw_create_or_fail();

        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);
            hb_font_get_nominal_glyph(font, 'b', pi);
            int gid = pi.get(0);
            hb_gpu_draw_glyph(draw, font, gid);
        }

        long blob = hb_gpu_draw_encode(draw);
        assertNotEquals(blob, NULL);

        // Recycle should not crash.
        hb_gpu_draw_recycle_blob(draw, blob);

        hb_gpu_draw_destroy(draw);
        hb_font_destroy(font);
        hb_face_destroy(face);
    }

    private static long hb_test_open_font_file(String font_path) { return hb_test_open_font_file_with_index(font_path, 0); }
    private static long hb_test_open_font_file_with_index(String font_path, int face_index) {
        long blob = NULL;
        try {
            ByteBuffer buffer = ioResourceToByteBuffer(font_path, 512 * 1024);

            blob = hb_blob_create_or_fail(buffer, HB_MEMORY_MODE_READONLY, NULL, null);
            assertNotEquals(blob, NULL, "Failed to load font file: " + font_path);

            return hb_face_create(blob, face_index);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (blob != NULL) {
                hb_blob_destroy(blob);
            }
        }
    }

}
