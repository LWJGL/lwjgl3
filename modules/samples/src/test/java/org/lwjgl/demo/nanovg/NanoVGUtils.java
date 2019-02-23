/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.zip.*;

import static java.lang.Math.*;
import static org.lwjgl.opengl.ARBTimerQuery.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.opengl.GL15C.*;
import static org.lwjgl.stb.STBImageWrite.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

class NanoVGUtils {

    private static final int GPU_QUERY_COUNT = 5;

    private NanoVGUtils() {
    }

    static class GPUtimer {
        boolean supported;
        int     cur, ret;
        IntBuffer queries = BufferUtils.createIntBuffer(GPU_QUERY_COUNT);
    }

    static void initGPUTimer(GPUtimer timer) {
        //memset(timer, 0, sizeof(*timer));
        timer.supported = GL.getCapabilities().GL_ARB_timer_query;
        timer.cur = 0;
        timer.ret = 0;
        BufferUtils.zeroBuffer(timer.queries);

        if (timer.supported) {
            glGenQueries(timer.queries);
        }
    }

    static void startGPUTimer(GPUtimer timer) {
        if (!timer.supported) {
            return;
        }
        glBeginQuery(GL_TIME_ELAPSED, timer.queries.get(timer.cur % GPU_QUERY_COUNT));
        timer.cur++;
    }

    static int stopGPUTimer(GPUtimer timer, FloatBuffer times, int maxTimes) {
        int n = 0;
        if (!timer.supported) {
            return 0;
        }

        glEndQuery(GL_TIME_ELAPSED);

        try (MemoryStack stack = stackPush()) {
            IntBuffer available = stack.ints(1);
            while (available.get(0) != 0 && timer.ret <= timer.cur) {
                // check for results if there are any
                glGetQueryObjectiv(timer.queries.get(timer.ret % GPU_QUERY_COUNT), GL_QUERY_RESULT_AVAILABLE, available);
                if (available.get(0) != 0) {
                    LongBuffer timeElapsed = stack.mallocLong(1);
                    glGetQueryObjectui64v(timer.queries.get(timer.ret % GPU_QUERY_COUNT), GL_QUERY_RESULT, timeElapsed);
                    timer.ret++;
                    if (n < maxTimes) {
                        times.put(n, (float)(timeElapsed.get(0) * 1e-9));
                        n++;
                    }
                }
            }
        }
        return n;
    }

    static void saveScreenShotGL(int w, int h, boolean premult, String name) {
        ByteBuffer image = memAlloc(w * h * 4);

        // TODO: Make this work for GLES
        glReadPixels(0, 0, w, h, GL_RGBA, GL_UNSIGNED_BYTE, image);
        if (premult) {
            unpremultiplyAlpha(image, w, h, w * 4);
        } else {
            setAlpha(image, w, h, w * 4, (byte)255);
        }
        flipHorizontal(image, w, h, w * 4);
        stbi_write_png(name, w, h, 4, image, w * 4);
        memFree(image);
    }

    static void premultiplyAlpha(ByteBuffer image, int w, int h, int stride) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int i = y * stride + x * 4;

                float alpha = (image.get(i + 3) & 0xFF) / 255.0f;
                image.put(i + 0, (byte)round(((image.get(i + 0) & 0xFF) * alpha)));
                image.put(i + 1, (byte)round(((image.get(i + 1) & 0xFF) * alpha)));
                image.put(i + 2, (byte)round(((image.get(i + 2) & 0xFF) * alpha)));
            }
        }
    }

    private static int mini(int a, int b) { return a < b ? a : b; }

    static void unpremultiplyAlpha(ByteBuffer image, int w, int h, int stride) {
        int x, y;

        // Unpremultiply
        for (y = 0; y < h; y++) {
            int row = y * stride;
            for (x = 0; x < w; x++) {
                int r = image.get(row + 0) & 0xFF,
                    g = image.get(row + 1) & 0xFF,
                    b = image.get(row + 2) & 0xFF,
                    a = image.get(row + 3) & 0xFF;

                if (a != 0) {
                    image.put(row + 0, (byte)mini(r * 255 / a, 255));
                    image.put(row + 1, (byte)mini(g * 255 / a, 255));
                    image.put(row + 2, (byte)mini(b * 255 / a, 255));
                }

                row += 4;
            }
        }

        // Defringe
        for (y = 0; y < h; y++) {
            int row = y * stride;
            for (x = 0; x < w; x++) {
                int r = 0, g = 0, b = 0, a = image.get(row + 3) & 0xFF, n = 0;
                if (a == 0) {
                    if (x - 1 > 0 && image.get(row - 1) != 0) {
                        r += image.get(row - 4) & 0xFF;
                        g += image.get(row - 3) & 0xFF;
                        b += image.get(row - 2) & 0xFF;
                        n++;
                    }
                    if (x + 1 < w && image.get(row + 7) != 0) {
                        r += image.get(row + 4) & 0xFF;
                        g += image.get(row + 5) & 0xFF;
                        b += image.get(row + 6) & 0xFF;
                        n++;
                    }
                    if (y - 1 > 0 && image.get(row - stride + 3) != 0) {
                        r += image.get(row - stride) & 0xFF;
                        g += image.get(row - stride + 1) & 0xFF;
                        b += image.get(row - stride + 2) & 0xFF;
                        n++;
                    }
                    if (y + 1 < h && image.get(row + stride + 3) != 0) {
                        r += image.get(row + stride) & 0xFF;
                        g += image.get(row + stride + 1) & 0xFF;
                        b += image.get(row + stride + 2) & 0xFF;
                        n++;
                    }
                    if (n > 0) {
                        image.put(row + 0, (byte)(r / n));
                        image.put(row + 1, (byte)(g / n));
                        image.put(row + 2, (byte)(b / n));
                    }
                }
                row += 4;
            }
        }
    }

    static void setAlpha(ByteBuffer image, int w, int h, int stride, byte a) {
        int x, y;
        for (y = 0; y < h; y++) {
            int row = y * stride;
            for (x = 0; x < w; x++) {
                image.put(row + x * 4 + 3, a);
            }
        }
    }

    static void flipHorizontal(ByteBuffer image, int w, int h, int stride) {
        int i = 0, j = h - 1, k;
        while (i < j) {
            int ri = i * stride;
            int rj = j * stride;
            for (k = 0; k < w * 4; k++) {
                byte t = image.get(ri + k);
                image.put(ri + k, image.get(rj + k));
                image.put(rj + k, t);
            }
            i++;
            j--;
        }
    }

    static ByteBuffer downloadSVG(String spec) {
        ByteBuffer buffer = memAlloc(128 * 1024);
        try {
            URL url = new URL(spec);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("Accept-Encoding", "gzip");
            InputStream is = con.getInputStream();
            if ("gzip".equals(con.getContentEncoding())) {
                is = new GZIPInputStream(is);
            }

            try (ReadableByteChannel rbc = Channels.newChannel(is)) {
                int c;
                while ((c = rbc.read(buffer)) != -1) {
                    if (c == 0) {
                        buffer = memRealloc(buffer, (buffer.capacity() * 3) >> 1);
                    }
                }
            }
        } catch (IOException e) {
            memFree(buffer);
            throw new RuntimeException(e);
        }
        buffer.put((byte)0);
        buffer.flip();

        return buffer;
    }

}