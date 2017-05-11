/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

/*
 * Copyright (c) 2013 Mikko Mononen memon@inside.org
 *
 * This software is provided 'as-is', without any express or implied
 * warranty.  In no event will the authors be held liable for any damages
 * arising from the use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 *
 * 1. The origin of this software must not be misrepresented; you must not
 * claim that you wrote the original software. If you use this software
 * in a product, an acknowledgment in the product documentation would be
 * appreciated but is not required.
 * 2. Altered source versions must be plainly marked as such, and must not be
 * misrepresented as being the original software.
 * 3. This notice may not be removed or altered from any source distribution.
 */

import org.lwjgl.*;
import org.lwjgl.nanovg.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.nanovg.NanoVG.*;
import static org.lwjgl.opengl.ARBTimerQuery.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.stb.STBImageWrite.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Base NanoVG demo class.
 *
 * <p>This is a Java port of
 * <a href="https://github.com/memononen/nanovg/blob/master/example/demo.c">https://github.com/memononen/nanovg/blob/master/example/demo.c</a>.</p>
 */
class Demo {

    private static final ByteBuffer ICON_SEARCH        = cpToUTF8(0x1F50D);
    private static final ByteBuffer ICON_CIRCLED_CROSS = cpToUTF8(0x2716);
    private static final ByteBuffer ICON_CHEVRON_RIGHT = cpToUTF8(0xE75E);
    private static final ByteBuffer ICON_CHECK         = cpToUTF8(0x2713);
    private static final ByteBuffer ICON_LOGIN         = cpToUTF8(0xE740);
    private static final ByteBuffer ICON_TRASH         = cpToUTF8(0xE729);

    static final NVGColor
        colorA = NVGColor.create(),
        colorB = NVGColor.create(),
        colorC = NVGColor.create();

    static final NVGPaint
        paintA = NVGPaint.create(),
        paintB = NVGPaint.create(),
        paintC = NVGPaint.create();

    private static final NVGTextRow.Buffer       rows      = NVGTextRow.create(3);
    private static final NVGGlyphPosition.Buffer glyphs    = NVGGlyphPosition.create(100);
    private static final ByteBuffer              paragraph = memUTF8(
        "This is longer chunk of text.\n  \n  Would have used lorem ipsum but she    was busy jumping over the lazy dog with the fox and all the men " +
        "who came to the aid of the party.🎉",
        false
    );

    private static final FloatBuffer lineh  = BufferUtils.createFloatBuffer(1);
    private static final FloatBuffer bounds = BufferUtils.createFloatBuffer(4);

    private static final ByteBuffer hoverText = memASCII("Hover your mouse over the text to see calculated caret position.", false);

    static class DemoData {

        final ByteBuffer entypo           = loadResource("demo/nanovg/entypo.ttf", 40 * 1024);
        final ByteBuffer RobotoRegular    = loadResource("demo/nanovg/Roboto-Regular.ttf", 150 * 1024);
        final ByteBuffer RobotoBold       = loadResource("demo/nanovg/Roboto-Bold.ttf", 150 * 1024);
        final ByteBuffer NotoEmojiRegular = loadResource("demo/nanovg/NotoEmoji-Regular.ttf", 450 * 1024);

        int fontNormal,
            fontBold,
            fontIcons,
            fontEmoji;

        int[] images = new int[12];
    }

    static final DoubleBuffer
        mx = BufferUtils.createDoubleBuffer(1),
        my = BufferUtils.createDoubleBuffer(1);

    static final IntBuffer
        winWidth  = BufferUtils.createIntBuffer(1),
        winHeight = BufferUtils.createIntBuffer(1);

    static final IntBuffer
        fbWidth  = BufferUtils.createIntBuffer(1),
        fbHeight = BufferUtils.createIntBuffer(1);

    static final FloatBuffer gpuTimes = BufferUtils.createFloatBuffer(3);

    protected Demo() {
    }

    private static float maxf(float a, float b)              { return a > b ? a : b; }
    private static float clampf(float a, float mn, float mx) { return a < mn ? mn : (a > mx ? mx : a); }

    private static boolean isBlack(NVGColor col) {
        return col.r() == 0.0f && col.g() == 0.0f && col.b() == 0.0f && col.a() == 0.0f;
    }

    private static ByteBuffer cpToUTF8(int cp) {
        return memUTF8(new String(Character.toChars(cp)), false);
    }

    static NVGColor rgba(int r, int g, int b, int a, NVGColor color) {
        color.r(r / 255.0f);
        color.g(g / 255.0f);
        color.b(b / 255.0f);
        color.a(a / 255.0f);

        return color;
    }

    private static void drawWindow(long vg, String title, float x, float y, float w, float h) {
        float    cornerRadius = 3.0f;
        NVGPaint shadowPaint  = paintA;
        NVGPaint headerPaint  = paintB;

        nvgSave(vg);
        //nvgClearState(vg);

        // Window
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x, y, w, h, cornerRadius);
        nvgFillColor(vg, rgba(28, 30, 34, 192, colorA));
        //nvgFillColor(vg, rgba(0,0,0,128, color));
        nvgFill(vg);

        // Drop shadow
        nvgBoxGradient(vg, x, y + 2, w, h, cornerRadius * 2, 10, rgba(0, 0, 0, 128, colorA), rgba(0, 0, 0, 0, colorB), shadowPaint);
        nvgBeginPath(vg);
        nvgRect(vg, x - 10, y - 10, w + 20, h + 30);
        nvgRoundedRect(vg, x, y, w, h, cornerRadius);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, shadowPaint);
        nvgFill(vg);

        // Header
        nvgLinearGradient(vg, x, y, x, y + 15, rgba(255, 255, 255, 8, colorA), rgba(0, 0, 0, 16, colorB), headerPaint);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 1, y + 1, w - 2, 30, cornerRadius - 1);
        nvgFillPaint(vg, headerPaint);
        nvgFill(vg);
        nvgBeginPath(vg);
        nvgMoveTo(vg, x + 0.5f, y + 0.5f + 30);
        nvgLineTo(vg, x + 0.5f + w - 1, y + 0.5f + 30);
        nvgStrokeColor(vg, rgba(0, 0, 0, 32, colorA));
        nvgStroke(vg);

        nvgFontSize(vg, 18.0f);
        nvgFontFace(vg, "sans-bold");
        nvgTextAlign(vg, NVG_ALIGN_CENTER | NVG_ALIGN_MIDDLE);

        try (MemoryStack stack = stackPush()) {
            ByteBuffer titleText = stack.ASCII(title, false);

            nvgFontBlur(vg, 2);
            nvgFillColor(vg, rgba(0, 0, 0, 128, colorA));
            nvgText(vg, x + w / 2, y + 16 + 1, titleText);

            nvgFontBlur(vg, 0);
            nvgFillColor(vg, rgba(220, 220, 220, 160, colorA));
            nvgText(vg, x + w / 2, y + 16, titleText);
        }

        nvgRestore(vg);
    }

    private static void drawSearchBox(long vg, String text, float x, float y, float w, float h) {
        NVGPaint bg           = paintA;
        float    cornerRadius = h / 2 - 1;

        // Edit
        nvgBoxGradient(vg, x, y + 1.5f, w, h, h / 2, 5, rgba(0, 0, 0, 16, colorA), rgba(0, 0, 0, 92, colorB), bg);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x, y, w, h, cornerRadius);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

		/*nvgBeginPath(vg);
        nvgRoundedRect(vg, x+0.5f,y+0.5f, w-1,h-1, cornerRadius-0.5f);
		nvgStrokeColor(vg, rgba(0,0,0,48, colorA));
		nvgStroke(vg);*/

        nvgFontSize(vg, h * 1.3f);
        nvgFontFace(vg, "icons");
        nvgFillColor(vg, rgba(255, 255, 255, 64, colorA));
        nvgTextAlign(vg, NVG_ALIGN_CENTER | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + h * 0.55f, y + h * 0.55f, ICON_SEARCH);

        nvgFontSize(vg, 20.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 32, colorA));

        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + h * 1.05f, y + h * 0.5f, text);

        nvgFontSize(vg, h * 1.3f);
        nvgFontFace(vg, "icons");
        nvgFillColor(vg, rgba(255, 255, 255, 32, colorA));
        nvgTextAlign(vg, NVG_ALIGN_CENTER | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + w - h * 0.55f, y + h * 0.55f, ICON_CIRCLED_CROSS);
    }

    private static void drawDropDown(long vg, String text, float x, float y, float w, float h) {
        NVGPaint bg           = paintA;
        float    cornerRadius = 4.0f;

        nvgLinearGradient(vg, x, y, x, y + h, rgba(255, 255, 255, 16, colorA), rgba(0, 0, 0, 16, colorB), bg);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 1, y + 1, w - 2, h - 2, cornerRadius - 1);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 0.5f, y + 0.5f, w - 1, h - 1, cornerRadius - 0.5f);
        nvgStrokeColor(vg, rgba(0, 0, 0, 48, colorA));
        nvgStroke(vg);

        nvgFontSize(vg, 20.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 160, colorA));
        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + h * 0.3f, y + h * 0.5f, text);

        nvgFontSize(vg, h * 1.3f);
        nvgFontFace(vg, "icons");
        nvgFillColor(vg, rgba(255, 255, 255, 64, colorA));
        nvgTextAlign(vg, NVG_ALIGN_CENTER | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + w - h * 0.5f, y + h * 0.5f, ICON_CHEVRON_RIGHT);
    }

    private static void drawLabel(long vg, String text, float x, float y, float w, float h) {
        nvgFontSize(vg, 18.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 128, colorA));

        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x, y + h * 0.5f, text);
    }

    private static void drawEditBoxBase(long vg, float x, float y, float w, float h) {
        NVGPaint bg = paintA;

        // Edit
        nvgBoxGradient(vg, x + 1, y + 1 + 1.5f, w - 2, h - 2, 3, 4, rgba(255, 255, 255, 32, colorA), rgba(32, 32, 32, 32, colorB), bg);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 1, y + 1, w - 2, h - 2, 4 - 1);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 0.5f, y + 0.5f, w - 1, h - 1, 4 - 0.5f);
        nvgStrokeColor(vg, rgba(0, 0, 0, 48, colorA));
        nvgStroke(vg);
    }

    private static void drawEditBox(long vg, String text, float x, float y, float w, float h) {
        drawEditBoxBase(vg, x, y, w, h);

        nvgFontSize(vg, 20.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 64, colorA));
        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + h * 0.3f, y + h * 0.5f, text);
    }

    private static void drawEditBoxNum(
        long vg,
        String text, String units, float x, float y, float w, float h
    ) {

        float uw;

        drawEditBoxBase(vg, x, y, w, h);

        uw = nvgTextBounds(vg, 0, 0, units, (FloatBuffer)null);

        nvgFontSize(vg, 18.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 64, colorA));
        nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + w - h * 0.3f, y + h * 0.5f, units);

        nvgFontSize(vg, 20.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 128, colorA));
        nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + w - uw - h * 0.5f, y + h * 0.5f, text);
    }

    private static void drawCheckBox(long vg, String text, float x, float y, float w, float h) {
        NVGPaint bg = paintA;

        nvgFontSize(vg, 18.0f);
        nvgFontFace(vg, "sans");
        nvgFillColor(vg, rgba(255, 255, 255, 160, colorA));

        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + 28, y + h * 0.5f, text);

        nvgBoxGradient(vg, x + 1, y + (int)(h * 0.5f) - 9 + 1, 18, 18, 3, 3, rgba(0, 0, 0, 32, colorA), rgba(0, 0, 0, 92, colorB), bg);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 1, y + (int)(h * 0.5f) - 9, 18, 18, 3);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        nvgFontSize(vg, 40);
        nvgFontFace(vg, "icons");
        nvgFillColor(vg, rgba(255, 255, 255, 128, colorA));
        nvgTextAlign(vg, NVG_ALIGN_CENTER | NVG_ALIGN_MIDDLE);
        nvgText(vg, x + 9 + 2, y + h * 0.5f, ICON_CHECK);
    }

    private static void drawButton(long vg, ByteBuffer preicon, String text, float x, float y, float w, float h, NVGColor col) {
        NVGPaint bg           = paintA;
        float    cornerRadius = 4.0f;
        float    tw, iw       = 0;

        nvgLinearGradient(vg, x, y, x, y + h, rgba(255, 255, 255, isBlack(col) ? 16 : 32, colorB), rgba(0, 0, 0, isBlack(col) ? 16 : 32, colorC), bg);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 1, y + 1, w - 2, h - 2, cornerRadius - 1);
        if (!isBlack(col)) {
            nvgFillColor(vg, col);
            nvgFill(vg);
        }
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + 0.5f, y + 0.5f, w - 1, h - 1, cornerRadius - 0.5f);
        nvgStrokeColor(vg, rgba(0, 0, 0, 48, colorA));
        nvgStroke(vg);

        try (MemoryStack stack = stackPush()) {
            ByteBuffer textEncoded = stack.ASCII(text, false);

            nvgFontSize(vg, 20.0f);
            nvgFontFace(vg, "sans-bold");
            tw = nvgTextBounds(vg, 0, 0, textEncoded, (FloatBuffer)null);
            if (preicon != null) {
                nvgFontSize(vg, h * 1.3f);
                nvgFontFace(vg, "icons");
                iw = nvgTextBounds(vg, 0, 0, preicon, (FloatBuffer)null);
                iw += h * 0.15f;
            }

            if (preicon != null) {
                nvgFontSize(vg, h * 1.3f);
                nvgFontFace(vg, "icons");
                nvgFillColor(vg, rgba(255, 255, 255, 96, colorA));
                nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
                nvgText(vg, x + w * 0.5f - tw * 0.5f - iw * 0.75f, y + h * 0.5f, preicon);
            }

            nvgFontSize(vg, 20.0f);
            nvgFontFace(vg, "sans-bold");
            nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_MIDDLE);
            nvgFillColor(vg, rgba(0, 0, 0, 160, colorA));
            nvgText(vg, x + w * 0.5f - tw * 0.5f + iw * 0.25f, y + h * 0.5f - 1, textEncoded);
            nvgFillColor(vg, rgba(255, 255, 255, 160, colorA));
            nvgText(vg, x + w * 0.5f - tw * 0.5f + iw * 0.25f, y + h * 0.5f, textEncoded);
        }
    }

    private static void drawSlider(long vg, float pos, float x, float y, float w, float h) {
        NVGPaint bg = paintA, knob = paintB;
        float    cy = y + (int)(h * 0.5f);
        float    kr = (int)(h * 0.25f);

        nvgSave(vg);
        //nvgClearState(vg);

        // Slot
        nvgBoxGradient(vg, x, cy - 2 + 1, w, 4, 2, 2, rgba(0, 0, 0, 32, colorA), rgba(0, 0, 0, 128, colorB), bg);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x, cy - 2, w, 4, 2);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Knob Shadow
        nvgRadialGradient(vg, x + (int)(pos * w), cy + 1, kr - 3, kr + 3, rgba(0, 0, 0, 64, colorA), rgba(0, 0, 0, 0, colorB), bg);
        nvgBeginPath(vg);
        nvgRect(vg, x + (int)(pos * w) - kr - 5, cy - kr - 5, kr * 2 + 5 + 5, kr * 2 + 5 + 5 + 3);
        nvgCircle(vg, x + (int)(pos * w), cy, kr);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Knob
        nvgLinearGradient(vg, x, cy - kr, x, cy + kr, rgba(255, 255, 255, 16, colorA), rgba(0, 0, 0, 16, colorB), knob);
        nvgBeginPath(vg);
        nvgCircle(vg, x + (int)(pos * w), cy, kr - 1);
        nvgFillColor(vg, rgba(40, 43, 48, 255, colorA));
        nvgFill(vg);
        nvgFillPaint(vg, knob);
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgCircle(vg, x + (int)(pos * w), cy, kr - 0.5f);
        nvgStrokeColor(vg, rgba(0, 0, 0, 92, colorA));
        nvgStroke(vg);

        nvgRestore(vg);
    }

    private static void drawEyes(long vg, float x, float y, float w, float h, float mx, float my, float t) {
        NVGPaint gloss = paintA, bg = paintB;
        float    ex    = w * 0.23f;
        float    ey    = h * 0.5f;
        float    lx    = x + ex;
        float    ly    = y + ey;
        float    rx    = x + w - ex;
        float    ry    = y + ey;
        float    dx, dy, d;
        float    br    = (ex < ey ? ex : ey) * 0.5f;
        float    blink = 1 - (float)pow((float)sin(t * 0.5f), 200) * 0.8f;

        nvgLinearGradient(vg, x, y + h * 0.5f, x + w * 0.1f, y + h, rgba(0, 0, 0, 32, colorA), rgba(0, 0, 0, 16, colorB), bg);
        nvgBeginPath(vg);
        nvgEllipse(vg, lx + 3.0f, ly + 16.0f, ex, ey);
        nvgEllipse(vg, rx + 3.0f, ry + 16.0f, ex, ey);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        nvgLinearGradient(vg, x, y + h * 0.25f, x + w * 0.1f, y + h, rgba(220, 220, 220, 255, colorA), rgba(128, 128, 128, 255, colorB), bg);
        nvgBeginPath(vg);
        nvgEllipse(vg, lx, ly, ex, ey);
        nvgEllipse(vg, rx, ry, ex, ey);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        dx = (mx - rx) / (ex * 10);
        dy = (my - ry) / (ey * 10);
        d = (float)Math.sqrt(dx * dx + dy * dy);
        if (d > 1.0f) {
            dx /= d;
            dy /= d;
        }
        dx *= ex * 0.4f;
        dy *= ey * 0.5f;
        nvgBeginPath(vg);
        nvgEllipse(vg, lx + dx, ly + dy + ey * 0.25f * (1 - blink), br, br * blink);
        nvgFillColor(vg, rgba(32, 32, 32, 255, colorA));
        nvgFill(vg);

        dx = (mx - rx) / (ex * 10);
        dy = (my - ry) / (ey * 10);
        d = (float)Math.sqrt(dx * dx + dy * dy);
        if (d > 1.0f) {
            dx /= d;
            dy /= d;
        }
        dx *= ex * 0.4f;
        dy *= ey * 0.5f;
        nvgBeginPath(vg);
        nvgEllipse(vg, rx + dx, ry + dy + ey * 0.25f * (1 - blink), br, br * blink);
        nvgFillColor(vg, rgba(32, 32, 32, 255, colorA));
        nvgFill(vg);

        nvgRadialGradient(vg, lx - ex * 0.25f, ly - ey * 0.5f, ex * 0.1f, ex * 0.75f, rgba(255, 255, 255, 128, colorA), rgba(255, 255, 255, 0, colorB), gloss);
        nvgBeginPath(vg);
        nvgEllipse(vg, lx, ly, ex, ey);
        nvgFillPaint(vg, gloss);
        nvgFill(vg);

        nvgRadialGradient(vg, rx - ex * 0.25f, ry - ey * 0.5f, ex * 0.1f, ex * 0.75f, rgba(255, 255, 255, 128, colorA), rgba(255, 255, 255, 0, colorB), gloss);
        nvgBeginPath(vg);
        nvgEllipse(vg, rx, ry, ex, ey);
        nvgFillPaint(vg, gloss);
        nvgFill(vg);
    }

    private static final float[]
        samples = new float[6],
        sx      = new float[6],
        sy      = new float[6];

    private static void drawGraph(long vg, float x, float y, float w, float h, float t) {
        NVGPaint bg = paintA;

        float dx = w / 5.0f;
        int   i;

        samples[0] = (1 + (float)sin(t * 1.2345f + (float)cos(t * 0.33457f) * 0.44f)) * 0.5f;
        samples[1] = (1 + (float)sin(t * 0.68363f + (float)cos(t * 1.3f) * 1.55f)) * 0.5f;
        samples[2] = (1 + (float)sin(t * 1.1642f + (float)cos(t * 0.33457) * 1.24f)) * 0.5f;
        samples[3] = (1 + (float)sin(t * 0.56345f + (float)cos(t * 1.63f) * 0.14f)) * 0.5f;
        samples[4] = (1 + (float)sin(t * 1.6245f + (float)cos(t * 0.254f) * 0.3f)) * 0.5f;
        samples[5] = (1 + (float)sin(t * 0.345f + (float)cos(t * 0.03f) * 0.6f)) * 0.5f;

        for (i = 0; i < 6; i++) {
            sx[i] = x + i * dx;
            sy[i] = y + h * samples[i] * 0.8f;
        }

        // Graph background
        nvgLinearGradient(vg, x, y, x, y + h, rgba(0, 160, 192, 0, colorA), rgba(0, 160, 192, 64, colorB), bg);
        nvgBeginPath(vg);
        nvgMoveTo(vg, sx[0], sy[0]);
        for (i = 1; i < 6; i++) {
            nvgBezierTo(vg, sx[i - 1] + dx * 0.5f, sy[i - 1], sx[i] - dx * 0.5f, sy[i], sx[i], sy[i]);
        }
        nvgLineTo(vg, x + w, y + h);
        nvgLineTo(vg, x, y + h);
        nvgFillPaint(vg, bg);
        nvgFill(vg);

        // Graph line
        nvgBeginPath(vg);
        nvgMoveTo(vg, sx[0], sy[0] + 2);
        for (i = 1; i < 6; i++) {
            nvgBezierTo(vg, sx[i - 1] + dx * 0.5f, sy[i - 1] + 2, sx[i] - dx * 0.5f, sy[i] + 2, sx[i], sy[i] + 2);
        }
        nvgStrokeColor(vg, rgba(0, 0, 0, 32, colorA));
        nvgStrokeWidth(vg, 3.0f);
        nvgStroke(vg);

        nvgBeginPath(vg);
        nvgMoveTo(vg, sx[0], sy[0]);
        for (i = 1; i < 6; i++) {
            nvgBezierTo(vg, sx[i - 1] + dx * 0.5f, sy[i - 1], sx[i] - dx * 0.5f, sy[i], sx[i], sy[i]);
        }
        nvgStrokeColor(vg, rgba(0, 160, 192, 255, colorA));
        nvgStrokeWidth(vg, 3.0f);
        nvgStroke(vg);

        // Graph sample pos
        for (i = 0; i < 6; i++) {
            nvgRadialGradient(vg, sx[i], sy[i] + 2, 3.0f, 8.0f, rgba(0, 0, 0, 32, colorA), rgba(0, 0, 0, 0, colorB), bg);
            nvgBeginPath(vg);
            nvgRect(vg, sx[i] - 10, sy[i] - 10 + 2, 20, 20);
            nvgFillPaint(vg, bg);
            nvgFill(vg);
        }

        nvgBeginPath(vg);
        for (i = 0; i < 6; i++) {
            nvgCircle(vg, sx[i], sy[i], 4.0f);
        }
        nvgFillColor(vg, rgba(0, 160, 192, 255, colorA));
        nvgFill(vg);
        nvgBeginPath(vg);
        for (i = 0; i < 6; i++) {
            nvgCircle(vg, sx[i], sy[i], 2.0f);
        }
        nvgFillColor(vg, rgba(220, 220, 220, 255, colorA));
        nvgFill(vg);

        nvgStrokeWidth(vg, 1.0f);
    }

    private static void drawSpinner(long vg, float cx, float cy, float r, float t) {
        float    a0    = 0.0f + t * 6;
        float    a1    = NVG_PI + t * 6;
        float    r0    = r;
        float    r1    = r * 0.75f;
        float    ax, ay, bx, by;
        NVGPaint paint = paintA;

        nvgSave(vg);

        nvgBeginPath(vg);
        nvgArc(vg, cx, cy, r0, a0, a1, NVG_CW);
        nvgArc(vg, cx, cy, r1, a1, a0, NVG_CCW);
        nvgClosePath(vg);
        ax = cx + (float)cos(a0) * (r0 + r1) * 0.5f;
        ay = cy + (float)sin(a0) * (r0 + r1) * 0.5f;
        bx = cx + (float)cos(a1) * (r0 + r1) * 0.5f;
        by = cy + (float)sin(a1) * (r0 + r1) * 0.5f;
        nvgLinearGradient(vg, ax, ay, bx, by, rgba(0, 0, 0, 0, colorA), rgba(0, 0, 0, 128, colorB), paint);
        nvgFillPaint(vg, paint);
        nvgFill(vg);

        nvgRestore(vg);
    }

    private static void drawThumbnails(long vg, float x, float y, float w, float h, int[] images, int nimages, float t) {
        NVGPaint
            shadowPaint = paintA,
            imgPaint = paintB,
            fadePaint = paintC;

        float cornerRadius = 3.0f;
        float thumb        = 60.0f;
        float arry         = 30.5f;

        float stackh = (nimages / 2) * (thumb + 10) + 10;

        float u  = (1 + (float)cos(t * 0.5f)) * 0.5f;
        float u2 = (1 - (float)cos(t * 0.2f)) * 0.5f;

        nvgSave(vg);
        //nvgClearState(vg);

        // Drop shadow
        nvgBoxGradient(vg, x, y + 4, w, h, cornerRadius * 2, 20, rgba(0, 0, 0, 128, colorA), rgba(0, 0, 0, 0, colorB), shadowPaint);
        nvgBeginPath(vg);
        nvgRect(vg, x - 10, y - 10, w + 20, h + 30);
        nvgRoundedRect(vg, x, y, w, h, cornerRadius);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, shadowPaint);
        nvgFill(vg);

        // Window
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x, y, w, h, cornerRadius);
        nvgMoveTo(vg, x - 10, y + arry);
        nvgLineTo(vg, x + 1, y + arry - 11);
        nvgLineTo(vg, x + 1, y + arry + 11);
        nvgFillColor(vg, rgba(200, 200, 200, 255, colorA));
        nvgFill(vg);

        nvgSave(vg);
        nvgScissor(vg, x, y, w, h);
        nvgTranslate(vg, 0, -(stackh - h) * u);

        float dv = 1.0f / (float)(nimages - 1);

        try (MemoryStack stack = stackPush()) {
            IntBuffer
                imgw = stack.mallocInt(1),
                imgh = stack.mallocInt(1);

            for (int i = 0; i < nimages; i++) {
                float tx, ty, v, a;
                tx = x + 10;
                ty = y + 10;
                tx += (i % 2) * (thumb + 10);
                ty += (i / 2) * (thumb + 10);
                nvgImageSize(vg, images[i], imgw, imgh);

                float ix, iy, iw, ih;

                if (imgw.get(0) < imgh.get(0)) {
                    iw = thumb;
                    ih = iw * (float)imgh.get(0) / (float)imgw.get(0);
                    ix = 0;
                    iy = -(ih - thumb) * 0.5f;
                } else {
                    ih = thumb;
                    iw = ih * (float)imgw.get(0) / (float)imgh.get(0);
                    ix = -(iw - thumb) * 0.5f;
                    iy = 0;
                }

                v = i * dv;
                a = clampf((u2 - v) / dv, 0, 1);

                if (a < 1.0f) {
                    drawSpinner(vg, tx + thumb / 2, ty + thumb / 2, thumb * 0.25f, t);
                }

                nvgImagePattern(vg, tx + ix, ty + iy, iw, ih, 0.0f / 180.0f * NVG_PI, images[i], a, imgPaint);
                nvgBeginPath(vg);
                nvgRoundedRect(vg, tx, ty, thumb, thumb, 5);
                nvgFillPaint(vg, imgPaint);
                nvgFill(vg);

                nvgBoxGradient(vg, tx - 1, ty, thumb + 2, thumb + 2, 5, 3, rgba(0, 0, 0, 128, colorA), rgba(0, 0, 0, 0, colorB), shadowPaint);
                nvgBeginPath(vg);
                nvgRect(vg, tx - 5, ty - 5, thumb + 10, thumb + 10);
                nvgRoundedRect(vg, tx, ty, thumb, thumb, 6);
                nvgPathWinding(vg, NVG_HOLE);
                nvgFillPaint(vg, shadowPaint);
                nvgFill(vg);

                nvgBeginPath(vg);
                nvgRoundedRect(vg, tx + 0.5f, ty + 0.5f, thumb - 1, thumb - 1, 4 - 0.5f);
                nvgStrokeWidth(vg, 1.0f);
                nvgStrokeColor(vg, rgba(255, 255, 255, 192, colorA));
                nvgStroke(vg);
            }
        }
        nvgRestore(vg);

        // Hide fades
        nvgLinearGradient(vg, x, y, x, y + 6, rgba(200, 200, 200, 255, colorA), rgba(200, 200, 200, 0, colorB), fadePaint);
        nvgBeginPath(vg);
        nvgRect(vg, x + 4, y, w - 8, 6);
        nvgFillPaint(vg, fadePaint);
        nvgFill(vg);

        nvgLinearGradient(vg, x, y + h, x, y + h - 6, rgba(200, 200, 200, 255, colorA), rgba(200, 200, 200, 0, colorB), fadePaint);
        nvgBeginPath(vg);
        nvgRect(vg, x + 4, y + h - 6, w - 8, 6);
        nvgFillPaint(vg, fadePaint);
        nvgFill(vg);

        // Scroll bar
        nvgBoxGradient(vg, x + w - 12 + 1, y + 4 + 1, 8, h - 8, 3, 4, rgba(0, 0, 0, 32, colorA), rgba(0, 0, 0, 92, colorB), shadowPaint);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + w - 12, y + 4, 8, h - 8, 3);
        nvgFillPaint(vg, shadowPaint);
        //nvgFillColor(vg, rgba(255,0,0,128, color));
        nvgFill(vg);

        float scrollh = (h / stackh) * (h - 8);
        nvgBoxGradient(vg,
            x + w - 12 - 1,
            y + 4 + (h - 8 - scrollh) * u - 1,
            8,
            scrollh,
            3,
            4,
            rgba(220, 220, 220, 255, colorA),
            rgba(128, 128, 128, 255, colorB),
            shadowPaint);
        nvgBeginPath(vg);
        nvgRoundedRect(vg, x + w - 12 + 1, y + 4 + 1 + (h - 8 - scrollh) * u, 8 - 2, scrollh - 2, 2);
        nvgFillPaint(vg, shadowPaint);
        //nvgFillColor(vg, rgba(0,0,0,128, color));
        nvgFill(vg);

        nvgRestore(vg);
    }

    private static void drawColorwheel(long vg, float x, float y, float w, float h, float t) {
        float hue = (float)sin(t * 0.12f);

        NVGPaint paint = paintA;

        nvgSave(vg);

		/*nvgBeginPath(vg);
        nvgRect(vg, x,y,w,h);
		nvgFillColor(vg, rgba(255,0,0,128, colorA));
		nvgFill(vg);*/

        float cx   = x + w * 0.5f;
        float cy   = y + h * 0.5f;
        float r1   = (w < h ? w : h) * 0.5f - 5.0f;
        float r0   = r1 - 20.0f;
        float aeps = 0.5f / r1;    // half a pixel arc length in radians (2pi cancels out).

        for (int i = 0; i < 6; i++) {
            float a0 = (float)i / 6.0f * NVG_PI * 2.0f - aeps;
            float a1 = (i + 1.0f) / 6.0f * NVG_PI * 2.0f + aeps;
            nvgBeginPath(vg);
            nvgArc(vg, cx, cy, r0, a0, a1, NVG_CW);
            nvgArc(vg, cx, cy, r1, a1, a0, NVG_CCW);
            nvgClosePath(vg);
            float ax = cx + (float)cos(a0) * (r0 + r1) * 0.5f;
            float ay = cy + (float)sin(a0) * (r0 + r1) * 0.5f;
            float bx = cx + (float)cos(a1) * (r0 + r1) * 0.5f;
            float by = cy + (float)sin(a1) * (r0 + r1) * 0.5f;
            nvgHSLA(a0 / (NVG_PI * 2), 1.0f, 0.55f, (byte)255, colorA);
            nvgHSLA(a1 / (NVG_PI * 2), 1.0f, 0.55f, (byte)255, colorB);
            nvgLinearGradient(vg, ax, ay, bx, by, colorA, colorB, paint);
            nvgFillPaint(vg, paint);
            nvgFill(vg);
        }

        nvgBeginPath(vg);
        nvgCircle(vg, cx, cy, r0 - 0.5f);
        nvgCircle(vg, cx, cy, r1 + 0.5f);
        nvgStrokeColor(vg, rgba(0, 0, 0, 64, colorA));
        nvgStrokeWidth(vg, 1.0f);
        nvgStroke(vg);

        // Selector
        nvgSave(vg);
        nvgTranslate(vg, cx, cy);
        nvgRotate(vg, hue * NVG_PI * 2);

        // Marker on
        nvgStrokeWidth(vg, 2.0f);
        nvgBeginPath(vg);
        nvgRect(vg, r0 - 1, -3, r1 - r0 + 2, 6);
        nvgStrokeColor(vg, rgba(255, 255, 255, 192, colorA));
        nvgStroke(vg);

        nvgBoxGradient(vg, r0 - 3, -5, r1 - r0 + 6, 10, 2, 4, rgba(0, 0, 0, 128, colorA), rgba(0, 0, 0, 0, colorB), paint);
        nvgBeginPath(vg);
        nvgRect(vg, r0 - 2 - 10, -4 - 10, r1 - r0 + 4 + 20, 8 + 20);
        nvgRect(vg, r0 - 2, -4, r1 - r0 + 4, 8);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, paint);
        nvgFill(vg);

        // Center triangle
        float r  = r0 - 6;
        float ax = (float)cos(120.0f / 180.0f * NVG_PI) * r;
        float ay = (float)sin(120.0f / 180.0f * NVG_PI) * r;
        float bx = (float)cos(-120.0f / 180.0f * NVG_PI) * r;
        float by = (float)sin(-120.0f / 180.0f * NVG_PI) * r;
        nvgBeginPath(vg);
        nvgMoveTo(vg, r, 0);
        nvgLineTo(vg, ax, ay);
        nvgLineTo(vg, bx, by);
        nvgClosePath(vg);
        nvgHSLA(hue, 1.0f, 0.5f, (byte)255, colorA);
        nvgLinearGradient(vg, r, 0, ax, ay, colorA, rgba(255, 255, 255, 255, colorB), paint);
        nvgFillPaint(vg, paint);
        nvgFill(vg);
        nvgLinearGradient(vg, (r + ax) * 0.5f, (0 + ay) * 0.5f, bx, by, rgba(0, 0, 0, 0, colorA), rgba(0, 0, 0, 255, colorB), paint);
        nvgFillPaint(vg, paint);
        nvgFill(vg);
        nvgStrokeColor(vg, rgba(0, 0, 0, 64, colorA));
        nvgStroke(vg);

        // Select circle on triangle
        ax = (float)cos(120.0f / 180.0f * NVG_PI) * r * 0.3f;
        ay = (float)sin(120.0f / 180.0f * NVG_PI) * r * 0.4f;
        nvgStrokeWidth(vg, 2.0f);
        nvgBeginPath(vg);
        nvgCircle(vg, ax, ay, 5);
        nvgStrokeColor(vg, rgba(255, 255, 255, 192, colorA));
        nvgStroke(vg);

        nvgRadialGradient(vg, ax, ay, 7, 9, rgba(0, 0, 0, 64, colorA), rgba(0, 0, 0, 0, colorB), paint);
        nvgBeginPath(vg);
        nvgRect(vg, ax - 20, ay - 20, 40, 40);
        nvgCircle(vg, ax, ay, 7);
        nvgPathWinding(vg, NVG_HOLE);
        nvgFillPaint(vg, paint);
        nvgFill(vg);

        nvgRestore(vg);

        nvgRestore(vg);
    }

    private static final float[] pts = new float[4 * 2];

    private static final int[] joins = {NVG_MITER, NVG_ROUND, NVG_BEVEL};
    private static final int[] caps  = {NVG_BUTT, NVG_ROUND, NVG_SQUARE};

    private static void drawLines(long vg, float x, float y, float w, float h, float t) {
        float pad = 5.0f, s = w / 9.0f - pad * 2;

        nvgSave(vg);
        drawLinesPoints(pts, s, t);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                float fx = x + s * 0.5f + (i * 3 + j) / 9.0f * w + pad;
                float fy = y - s * 0.5f + pad;

                nvgLineCap(vg, caps[i]);
                nvgLineJoin(vg, joins[j]);

                nvgStrokeWidth(vg, s * 0.3f);
                drawLinesLine(vg, fx, fy);
            }
        }

        nvgRestore(vg);
    }

    private static void drawLinesPoints(float[] pts, float s, float t) {
        pts[0] = -s * 0.25f + (float)cos(t * 0.3f) * s * 0.5f;
        pts[1] = (float)sin(t * 0.3f) * s * 0.5f;
        pts[2] = -s * 0.25f;
        pts[3] = 0;
        pts[4] = s * 0.25f;
        pts[5] = 0;
        pts[6] = s * 0.25f + (float)cos(-t * 0.3f) * s * 0.5f;
        pts[7] = (float)sin(-t * 0.3f) * s * 0.5f;
    }

    private static void drawLinesLine(long vg, float fx, float fy) {
        float[] pts = Demo.pts;

        nvgStrokeColor(vg, rgba(0, 0, 0, 160, colorA));
        nvgBeginPath(vg);
        nvgMoveTo(vg, fx + pts[0], fy + pts[1]);
        nvgLineTo(vg, fx + pts[2], fy + pts[3]);
        nvgLineTo(vg, fx + pts[4], fy + pts[5]);
        nvgLineTo(vg, fx + pts[6], fy + pts[7]);
        nvgStroke(vg);

        nvgLineCap(vg, NVG_BUTT);
        nvgLineJoin(vg, NVG_BEVEL);

        nvgStrokeWidth(vg, 1.0f);
        nvgStrokeColor(vg, rgba(0, 192, 255, 255, colorA));
        nvgBeginPath(vg);
        nvgMoveTo(vg, fx + pts[0], fy + pts[1]);
        nvgLineTo(vg, fx + pts[2], fy + pts[3]);
        nvgLineTo(vg, fx + pts[4], fy + pts[5]);
        nvgLineTo(vg, fx + pts[6], fy + pts[7]);
        nvgStroke(vg);
    }

    static int loadDemoData(long vg, DemoData data) {
        if (vg == NULL) {
            return -1;
        }

        for (int i = 0; i < 12; i++) {
            String     file = "demo/nanovg/images/image" + (i + 1) + ".jpg";
            ByteBuffer img  = loadResource(file, 32 * 1024);
            data.images[i] = nvgCreateImageMem(vg, 0, img);
            if (data.images[i] == 0) {
                System.err.format("Could not load %s.\n", file);
                return -1;
            }
        }

        data.fontIcons = nvgCreateFontMem(vg, "icons", data.entypo, 0);
        if (data.fontIcons == -1) {
            System.err.format("Could not add font icons.\n");
            return -1;
        }
        data.fontNormal = nvgCreateFontMem(vg, "sans", data.RobotoRegular, 0);
        if (data.fontNormal == -1) {
            System.err.format("Could not add font italic.\n");
            return -1;
        }
        data.fontBold = nvgCreateFontMem(vg, "sans-bold", data.RobotoBold, 0);
        if (data.fontBold == -1) {
            System.err.format("Could not add font bold.\n");
            return -1;
        }

        data.fontEmoji = nvgCreateFontMem(vg, "emoji", data.NotoEmojiRegular, 0);
        if (data.fontBold == -1) {
            System.err.format("Could not add font emoji.\n");
            return -1;
        }

        nvgAddFallbackFontId(vg, data.fontNormal, data.fontEmoji);
        nvgAddFallbackFontId(vg, data.fontBold, data.fontEmoji);

        return 0;
    }

    static ByteBuffer loadResource(String resource, int bufferSize) {
        try {
            return ioResourceToByteBuffer(resource, bufferSize);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load resource: " + resource, e);
        }
    }

    static void freeDemoData(long vg, DemoData data) {
        if (vg == NULL) {
            return;
        }

        for (int i = 0; i < 12; i++) {
            nvgDeleteImage(vg, data.images[i]);
        }

        memFree(hoverText);
        memFree(paragraph);

        memFree(ICON_TRASH);
        memFree(ICON_LOGIN);
        memFree(ICON_CHECK);
        memFree(ICON_CHEVRON_RIGHT);
        memFree(ICON_CIRCLED_CROSS);
        memFree(ICON_SEARCH);
    }

    private static void drawParagraph(long vg, float x, float y, float width, float height, float mx, float my) {
        float
            gx = 0.0f,
            gy = 0.0f;

        int gutter = 0;

        nvgSave(vg);

        nvgFontSize(vg, 18.0f);
        nvgFontFace(vg, "sans");
        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_TOP);
        nvgTextMetrics(vg, null, null, lineh);

        // The text break API can be used to fill a large buffer of rows,
        // or to iterate over the text just few lines (or just one) at a time.
        // The "next" variable of the last returned item tells where to continue.
        long start       = memAddress(paragraph);
        long end         = start + paragraph.remaining();
        int  nrows, lnum = 0;
        while ((nrows = nnvgTextBreakLines(vg, start, end, width, memAddress(rows), 3)) != 0) {
            for (int i = 0; i < nrows; i++) {
                NVGTextRow row = rows.get(i);
                boolean    hit = mx > x && mx < (x + width) && my >= y && my < (y + lineh.get(0));

                nvgBeginPath(vg);
                nvgFillColor(vg, rgba(255, 255, 255, hit ? 64 : 16, colorA));
                nvgRect(vg, x, y, row.width(), lineh.get(0));
                nvgFill(vg);

                nvgFillColor(vg, rgba(255, 255, 255, 255, colorA));
                nnvgText(vg, x, y, row.start(), row.end());

                if (hit) {
                    drawCaret(vg, row, lineh.get(0), x, y, mx);

                    gutter = lnum + 1;
                    gx = x - 10;
                    gy = y + lineh.get(0) / 2;
                }
                lnum++;
                y += lineh.get(0);
            }
            // Keep going...
            start = rows.get(nrows - 1).next();
        }

        if (gutter != 0) {
            drawGutter(vg, gutter, gx, gy, bounds);
        }

        y += 20.0f;

        nvgFontSize(vg, 13.0f);
        nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_TOP);
        nvgTextLineHeight(vg, 1.2f);

        nvgTextBoxBounds(vg, x, y, 150, hoverText, bounds);

        // Fade the tooltip out when close to it.
        gx = abs((mx - (bounds.get(0) + bounds.get(2)) * 0.5f) / (bounds.get(0) - bounds.get(2)));
        gy = abs((my - (bounds.get(1) + bounds.get(3)) * 0.5f) / (bounds.get(1) - bounds.get(3)));
        float a = maxf(gx, gy) - 0.5f;
        a = clampf(a, 0, 1);
        nvgGlobalAlpha(vg, a);

        nvgBeginPath(vg);
        nvgFillColor(vg, rgba(220, 220, 220, 255, colorA));
        nvgRoundedRect(vg, bounds.get(0) - 2, bounds.get(1) - 2, (int)(bounds.get(2) - bounds.get(0)) + 4, (int)(bounds.get(3) - bounds.get(1)) + 4, 3);
        int px = (int)((bounds.get(2) + bounds.get(0)) / 2);
        nvgMoveTo(vg, px, bounds.get(1) - 10);
        nvgLineTo(vg, px + 7, bounds.get(1) + 1);
        nvgLineTo(vg, px - 7, bounds.get(1) + 1);
        nvgFill(vg);

        nvgFillColor(vg, rgba(0, 0, 0, 220, colorA));
        nvgTextBox(vg, x, y, 150, hoverText);

        nvgRestore(vg);
    }

    private static void drawCaret(long vg, NVGTextRow row, float lineh, float x, float y, float mx) {
        float caretx = (mx < x + row.width() / 2) ? x : x + row.width();

        float px = x;

        int nglyphs = nnvgTextGlyphPositions(vg, x, y, row.start(), row.end(), memAddress(glyphs), 100);
        for (int j = 0; j < nglyphs; j++) {
            NVGGlyphPosition glyphPosition = glyphs.get(j);

            float x0  = glyphPosition.x();
            float x1  = (j + 1 < nglyphs) ? glyphs.get(j + 1).x() : x + row.width();
            float gx2 = x0 * 0.3f + x1 * 0.7f;

            if (mx >= px && mx < gx2) {
                caretx = glyphPosition.x();
            }
            px = gx2;
        }
        nvgBeginPath(vg);
        nvgFillColor(vg, rgba(255, 192, 0, 255, colorA));
        nvgRect(vg, caretx, y, 1, lineh);
        nvgFill(vg);
    }

    private static void drawGutter(long vg, int gutter, float gx, float gy, FloatBuffer bounds) {
        String txt = Integer.toString(gutter);

        nvgFontSize(vg, 13.0f);
        nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_MIDDLE);

        nvgTextBounds(vg, gx, gy, txt, bounds);

        nvgBeginPath(vg);
        nvgFillColor(vg, rgba(255, 192, 0, 255, colorA));
        nvgRoundedRect(vg,
            (int)bounds.get(0) - 4,
            (int)bounds.get(1) - 2,
            (int)(bounds.get(2) - bounds.get(0)) + 8,
            (int)(bounds.get(3) - bounds.get(1)) + 4,
            ((int)(bounds.get(3) - bounds.get(1)) + 4) / 2 - 1);
        nvgFill(vg);

        nvgFillColor(vg, rgba(32, 32, 32, 255, colorA));
        nvgText(vg, gx, gy, txt);
    }

    private static void drawWidths(long vg, float x, float y, float width) {
        nvgSave(vg);

        nvgStrokeColor(vg, rgba(0, 0, 0, 255, colorA));

        for (int i = 0; i < 20; i++) {
            float w = (i + 0.5f) * 0.1f;
            nvgStrokeWidth(vg, w);
            nvgBeginPath(vg);
            nvgMoveTo(vg, x, y);
            nvgLineTo(vg, x + width, y + width * 0.3f);
            nvgStroke(vg);
            y += 10;
        }

        nvgRestore(vg);
    }

    private static void drawCaps(long vg, float x, float y, float width) {
        int[] caps = {NVG_BUTT, NVG_ROUND, NVG_SQUARE};

        float lineWidth = 8.0f;

        nvgSave(vg);

        nvgBeginPath(vg);
        nvgRect(vg, x - lineWidth / 2, y, width + lineWidth, 40);
        nvgFillColor(vg, rgba(255, 255, 255, 32, colorA));
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgRect(vg, x, y, width, 40);
        nvgFillColor(vg, rgba(255, 255, 255, 32, colorA));
        nvgFill(vg);

        nvgStrokeWidth(vg, lineWidth);
        for (int i = 0; i < 3; i++) {
            nvgLineCap(vg, caps[i]);
            nvgStrokeColor(vg, rgba(0, 0, 0, 255, colorA));
            nvgBeginPath(vg);
            nvgMoveTo(vg, x, y + i * 10 + 5);
            nvgLineTo(vg, x + width, y + i * 10 + 5);
            nvgStroke(vg);
        }

        nvgRestore(vg);
    }

    private static void drawScissor(long vg, float x, float y, float t) {
        nvgSave(vg);

        // Draw first rect and set scissor to it's area.
        nvgTranslate(vg, x, y);
        nvgRotate(vg, nvgDegToRad(5));
        nvgBeginPath(vg);
        nvgRect(vg, -20, -20, 60, 40);
        nvgFillColor(vg, rgba(255, 0, 0, 255, colorA));
        nvgFill(vg);
        nvgScissor(vg, -20, -20, 60, 40);

        // Draw second rectangle with offset and rotation.
        nvgTranslate(vg, 40, 0);
        nvgRotate(vg, t);

        // Draw the intended second rectangle without any scissoring.
        nvgSave(vg);
        nvgResetScissor(vg);
        nvgBeginPath(vg);
        nvgRect(vg, -20, -10, 60, 30);
        nvgFillColor(vg, rgba(255, 128, 0, 64, colorA));
        nvgFill(vg);
        nvgRestore(vg);

        // Draw second rectangle with combined scissoring.
        nvgIntersectScissor(vg, -20, -10, 60, 30);
        nvgBeginPath(vg);
        nvgRect(vg, -20, -10, 60, 30);
        nvgFillColor(vg, rgba(255, 128, 0, 255, colorA));
        nvgFill(vg);

        nvgRestore(vg);
    }

    static void renderDemo(
        long vg, float mx, float my, float width, float height,
        float t, boolean blowup, DemoData data
    ) {
        float x, y, popy;

        drawEyes(vg, width - 250, 50, 150, 100, mx, my, t);
        drawParagraph(vg, width - 450, 50, 150, 100, mx, my);
        drawGraph(vg, 0, height / 2, width, height / 2, t);
        drawColorwheel(vg, width - 300, height - 300, 250.0f, 250.0f, t);

        // Line joints
        drawLines(vg, 120, height - 50, 600, 50, t);

        // Line caps
        drawWidths(vg, 10, 50, 30);

        // Line caps
        drawCaps(vg, 10, 300, 30);

        drawScissor(vg, 50, height - 80, t);

        nvgSave(vg);
        if (blowup) {
            nvgRotate(vg, (float)sin(t * 0.3f) * 5.0f / 180.0f * NVG_PI);
            nvgScale(vg, 2.0f, 2.0f);
        }

        // Widgets
        drawWindow(vg, "Widgets `n Stuff", 50, 50, 300, 400);
        x = 60;
        y = 95;
        drawSearchBox(vg, "Search", x, y, 280, 25);
        y += 40;
        drawDropDown(vg, "Effects", x, y, 280, 28);
        popy = y + 14;
        y += 45;

        // Form
        drawLabel(vg, "Login", x, y, 280, 20);
        y += 25;
        drawEditBox(vg, "Email", x, y, 280, 28);
        y += 35;
        drawEditBox(vg, "Password", x, y, 280, 28);
        y += 38;
        drawCheckBox(vg, "Remember me", x, y, 140, 28);
        drawButton(vg, ICON_LOGIN, "Sign in", x + 138, y, 140, 28, rgba(0, 96, 128, 255, colorA));
        y += 45;

        // Slider
        drawLabel(vg, "Diameter", x, y, 280, 20);
        y += 25;
        drawEditBoxNum(vg, "123.00", "px", x + 180, y, 100, 28);
        drawSlider(vg, 0.4f, x, y, 170, 28);
        y += 55;

        drawButton(vg, ICON_TRASH, "Delete", x, y, 160, 28, rgba(128, 16, 8, 255, colorA));
        drawButton(vg, null, "Cancel", x + 170, y, 110, 28, rgba(0, 0, 0, 0, colorA));

        // Thumbnails box
        drawThumbnails(vg, 365, popy - 30, 160, 300, data.images, 12, t);

        nvgRestore(vg);
    }

    private static int mini(int a, int b) { return a < b ? a : b; }

    private static void unpremultiplyAlpha(ByteBuffer image, int w, int h, int stride) {
        int x, y;

        // Unpremultiply
        for (y = 0; y < h; y++) {
            int row = y * stride;
            for (x = 0; x < w; x++) {
                int r = image.get(row + 0), g = image.get(row + 1), b = image.get(row + 2), a = image.get(row + 3);
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
                int r = 0, g = 0, b = 0, a = image.get(row + 3), n = 0;
                if (a == 0) {
                    if (x - 1 > 0 && image.get(row - 1) != 0) {
                        r += image.get(row - 4);
                        g += image.get(row - 3);
                        b += image.get(row - 2);
                        n++;
                    }
                    if (x + 1 < w && image.get(row + 7) != 0) {
                        r += image.get(row + 4);
                        g += image.get(row + 5);
                        b += image.get(row + 6);
                        n++;
                    }
                    if (y - 1 > 0 && image.get(row - stride + 3) != 0) {
                        r += image.get(row - stride);
                        g += image.get(row - stride + 1);
                        b += image.get(row - stride + 2);
                        n++;
                    }
                    if (y + 1 < h && image.get(row + stride + 3) != 0) {
                        r += image.get(row + stride);
                        g += image.get(row + stride + 1);
                        b += image.get(row + stride + 2);
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

    private static void setAlpha(ByteBuffer image, int w, int h, int stride, byte a) {
        int x, y;
        for (y = 0; y < h; y++) {
            int row = y * stride;
            for (x = 0; x < w; x++) {
                image.put(row + x * 4 + 3, a);
            }
        }
    }

    private static void flipHorizontal(ByteBuffer image, int w, int h, int stride) {
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

    static void saveScreenShot(int w, int h, boolean premult, String name) {
        ByteBuffer image = memAlloc(w * h * 4);
        if (image == null) {
            return;
        }

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

    // PERF

    static final int
        GRAPH_RENDER_FPS     = 0,
        GRAPH_RENDER_MS      = 1,
        GRAPH_RENDER_PERCENT = 2;

    private static final int GRAPH_HISTORY_COUNT = 100;

    private static final int GPU_QUERY_COUNT = 5;

    static class PerfGraph {
        int style;
        ByteBuffer name   = BufferUtils.createByteBuffer(32);
        float[]    values = new float[GRAPH_HISTORY_COUNT];
        int head;
    }

    static class GPUtimer {
        boolean supported;
        int     cur, ret;
        IntBuffer queries = BufferUtils.createIntBuffer(GPU_QUERY_COUNT);
    }

    // TODO: move to implementation
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
                        times.put(n, (float)((double)timeElapsed.get(0) * 1e-9));
                        n++;
                    }
                }
            }
        }
        return n;
    }

    static void initGraph(PerfGraph fps, int style, String name) {
        fps.style = style;
        memUTF8(name, false, fps.name);
        Arrays.fill(fps.values, 0);
        fps.head = 0;
    }

    static void updateGraph(PerfGraph fps, float frameTime) {
        fps.head = (fps.head + 1) % GRAPH_HISTORY_COUNT;
        fps.values[fps.head] = frameTime;
    }

    static float getGraphAverage(PerfGraph fps) {
        float avg = 0;
        for (int i = 0; i < GRAPH_HISTORY_COUNT; i++) {
            avg += fps.values[i];
        }
        return avg / (float)GRAPH_HISTORY_COUNT;
    }

    static void renderGraph(long vg, float x, float y, PerfGraph fps) {
        float avg = getGraphAverage(fps);

        int w = 200;
        int h = 35;

        nvgBeginPath(vg);
        nvgRect(vg, x, y, w, h);
        nvgFillColor(vg, rgba(0, 0, 0, 128, colorA));
        nvgFill(vg);

        nvgBeginPath(vg);
        nvgMoveTo(vg, x, y + h);
        if (fps.style == GRAPH_RENDER_FPS) {
            for (int i = 0; i < GRAPH_HISTORY_COUNT; i++) {
                float v = 1.0f / (0.00001f + fps.values[(fps.head + i) % GRAPH_HISTORY_COUNT]);
                float vx, vy;
                if (v > 1000.0f) {
                    v = 1000.0f;
                }
                vx = x + ((float)i / (GRAPH_HISTORY_COUNT - 1)) * w;
                vy = y + h - ((v / 1000.0f) * h);
                nvgLineTo(vg, vx, vy);
            }
        } else if (fps.style == GRAPH_RENDER_PERCENT) {
            for (int i = 0; i < GRAPH_HISTORY_COUNT; i++) {
                float v = fps.values[(fps.head + i) % GRAPH_HISTORY_COUNT] * 1.0f;
                float vx, vy;
                if (v > 100.0f) {
                    v = 100.0f;
                }
                vx = x + ((float)i / (GRAPH_HISTORY_COUNT - 1)) * w;
                vy = y + h - ((v / 100.0f) * h);
                nvgLineTo(vg, vx, vy);
            }
        } else {
            for (int i = 0; i < GRAPH_HISTORY_COUNT; i++) {
                float v = fps.values[(fps.head + i) % GRAPH_HISTORY_COUNT] * 1000.0f;
                float vx, vy;
                if (v > 4.0f) {
                    v = 4.0f;
                }
                vx = x + ((float)i / (GRAPH_HISTORY_COUNT - 1)) * w;
                vy = y + h - ((v / 4.0f) * h);
                nvgLineTo(vg, vx, vy);
            }
        }
        nvgLineTo(vg, x + w, y + h);
        nvgFillColor(vg, rgba(255, 192, 0, 128, colorA));
        nvgFill(vg);

        nvgFontFace(vg, "sans");

        if (fps.name.get(0) != '\0') {
            nvgFontSize(vg, 14.0f);
            nvgTextAlign(vg, NVG_ALIGN_LEFT | NVG_ALIGN_TOP);
            nvgFillColor(vg, rgba(240, 240, 240, 192, colorA));
            nvgText(vg, x + 3, y + 1, fps.name);
        }

        if (fps.style == GRAPH_RENDER_FPS) {
            nvgFontSize(vg, 18.0f);
            nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_TOP);
            nvgFillColor(vg, rgba(240, 240, 240, 255, colorA));
            nvgText(vg, x + w - 3, y + 1, String.format("%.2f FPS", 1.0f / avg));

            nvgFontSize(vg, 15.0f);
            nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_BOTTOM);
            nvgFillColor(vg, rgba(240, 240, 240, 160, colorA));
            nvgText(vg, x + w - 3, y + h - 1, String.format("%.2f ms", avg * 1000.0f));
        } else if (fps.style == GRAPH_RENDER_PERCENT) {
            nvgFontSize(vg, 18.0f);
            nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_TOP);
            nvgFillColor(vg, rgba(240, 240, 240, 255, colorA));
            nvgText(vg, x + w - 3, y + 1, String.format("%.1f %%", avg * 1.0f));
        } else {
            nvgFontSize(vg, 18.0f);
            nvgTextAlign(vg, NVG_ALIGN_RIGHT | NVG_ALIGN_TOP);
            nvgFillColor(vg, rgba(240, 240, 240, 255, colorA));
            nvgText(vg, x + w - 3, y + 1, String.format("%.2f ms", avg * 1000.0f));
        }
    }

}