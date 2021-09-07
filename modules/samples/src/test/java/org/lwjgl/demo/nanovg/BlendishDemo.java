/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.nanovg.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import javax.annotation.*;
import java.io.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.nanovg.NanoVGUtils.*;
import static org.lwjgl.demo.nanovg.SubType.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.nanovg.Blendish.*;
import static org.lwjgl.nanovg.NanoSVG.*;
import static org.lwjgl.nanovg.NanoVG.*;
import static org.lwjgl.nanovg.NanoVGGL2.*;
import static org.lwjgl.nanovg.OUI.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Blendish demo.
 *
 * <p>This is a Java port of
 * <a href="https://bitbucket.org/duangle/oui-blendish/src/eb226e17ec5b5bdb323a4a1182a8f7697c8655d3/example.cpp">example.cpp</a>.</p>
 */
public final class BlendishDemo {

    private static final ByteBuffer font;

    static {
        try {
            font = ioResourceToByteBuffer("demo/FiraSans.ttf", 512 * 1024);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private BlendishDemo() {
    }

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new RuntimeException("Failed to init GLFW.");
        }

        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        long window = glfwCreateWindow(650, 650, "OUI Blendish Demo", NULL, NULL);
        if (window == NULL) {
            glfwTerminate();
            throw new RuntimeException();
        }

        glfwSetMouseButtonCallback(window, (handle, button, action, mods) -> {
            switch (button) {
                case 1:
                    button = 2;
                    break;
                case 2:
                    button = 1;
                    break;
            }
            uiSetButton(button, mods, action == GLFW_PRESS);
        });
        glfwSetCursorPosCallback(window, (handle, xpos, ypos) -> uiSetCursor((int)xpos, (int)ypos));
        glfwSetScrollCallback(window, (handle, xoffset, yoffset) -> uiSetScroll((int)xoffset, (int)yoffset));
        glfwSetCharCallback(window, (handle, codepoint) -> uiSetChar(codepoint));
        glfwSetKeyCallback(window, (handle, keyCode, scancode, action, mods) -> {
            if (keyCode == GLFW_KEY_ESCAPE && action == GLFW_PRESS) {
                glfwSetWindowShouldClose(handle, true);
            }
            uiSetKey(keyCode, mods, action != GLFW_RELEASE);
        });

        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        glfwSwapInterval(0);

        long vg = nvgCreate(NVG_ANTIALIAS);
        if (vg == NULL) {
            throw new RuntimeException("Could not init nanovg.");
        }
        initBlendish(vg);

        OUIState ouiState = new OUIState();

        glfwSetTime(0);

        double c     = 0.0;
        int    total = 0;

        glClearColor(0.3f, 0.3f, 0.32f, 1.0f);
        glfwShowWindow(window);
        while (!glfwWindowShouldClose(window)) {
            int ww, wh;
            int fw, fh;
            try (MemoryStack stack = stackPush()) {
                IntBuffer pw = stack.mallocInt(1);
                IntBuffer ph = stack.mallocInt(1);

                glfwGetWindowSize(window, pw, ph);
                ww = pw.get(0);
                wh = ph.get(0);

                glfwGetFramebufferSize(window, pw, ph);
                fw = pw.get(0);
                fh = ph.get(0);
            }

            // Update and render
            glViewport(0, 0, fw, fh);
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);

            double t = glfwGetTime();

            nvgBeginFrame(vg, ww, wh, fw / (float)ww);

            ouiState.draw(vg, ww, wh);

            nvgEndFrame(vg);
            double t2 = glfwGetTime();
            c += (t2 - t);
            total++;
            if (c >= 1.0) {
                System.out.printf("%.2f ms/frame (~%d fps)\n", (c / total) * 1000.0, round(total / c));
                total = 0;
                c = 0.0;
            }

            glfwSwapBuffers(window);
            glfwPollEvents();
        }

        ouiState.destroy();

        nvgDelete(vg);

        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    private static void initBlendish(long vg) {
        bndSetFont(nvgCreateFontMem(vg, "system", font, 0));

        System.out.println("Downloading Blender icons...");
        long t = System.nanoTime();

        ByteBuffer iconsSVG = downloadSVG("https://raw.githubusercontent.com/sobotka/blender/master/release/datafiles/blender_icons.svg");

        System.out.format("\t%dms\n", (System.nanoTime() - t) / 1000 / 1000);

        NSVGImage svg;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            svg = nsvgParse(iconsSVG, stack.ASCII("px"), 96.0f);
        }
        if (svg == null) {
            throw new IllegalStateException("Failed to parse SVG.");
        }

        long rast = nsvgCreateRasterizer();
        if (rast == NULL) {
            throw new IllegalStateException("Failed to create SVG rasterizer.");
        }

        int w = (int)svg.width();
        int h = (int)svg.height();

        ByteBuffer image = memAlloc(w * h * 4);
        nsvgRasterize(rast, svg, 0, 0, 1, image, w, h, w * 4);
        premultiplyAlpha(image, w, h, w * 4);
        bndSetIconImage(nvgCreateImageRGBA(vg, w, h, NVG_IMAGE_PREMULTIPLIED, image));
    }

}

class OUIState {

    private static final SubType[] SUBTYPES = values();

    private final UIHandler ui_handler = new UIHandler() {
        @Override public void invoke(int item, int event) {
            UIData data = UIData.createSafe(uiGetHandle(item));
            if (data != null) {
                UIHandler handler = data.handler();
                if (handler != null) {
                    handler.invoke(item, event);
                }
            }
        }
    };

    private final UIHandler demohandler = new UIHandler() {
        @Override public void invoke(int item, int event) {
            UIButtonData data = UIButtonData.create(uiGetHandle(item));
            System.out.printf("clicked: %d %s\n", uiGetHandle(item), data.labelString());
        }
    };

    private static final UIHandler checkhandler = new UIHandler() {
        @Override public void invoke(int item, int event) {
            UICheckData data   = UICheckData.create(uiGetHandle(item));
            IntBuffer   option = data.option(1);
            option.put(0, 1 - option.get(0));
        }
    };

    // event handler for slider (same handler for all sliders)
    private final UIHandler sliderhandler = new UIHandler() {

        // starting offset of the currently active slider
        private float sliderstart;

        @Override public void invoke(int item, int event) {
            // retrieve the custom data we saved with the slider
            UISliderData data = UISliderData.create(uiGetHandle(item));
            switch (event) {
                case UI_BUTTON0_DOWN:
                    // button was pressed for the first time; capture initial
                    // slider value.
                    sliderstart = data.progress(1).get(0);
                    break;
                case UI_BUTTON0_CAPTURE:
                    try (MemoryStack stack = stackPush()) {
                        // called for every frame that the button is pressed.
                        // get the delta between the click point and the current
                        // mouse position
                        UIVec2 pos = uiGetCursorStartDelta(UIVec2.malloc(stack));
                        // get the items layouted rectangle
                        UIRect rc = uiGetRect(item, UIRect.malloc(stack));
                        // calculate our new offset and clamp
                        float value = sliderstart + (pos.x() / (float)rc.w());
                        // assign the new value
                        data.progress(1).put(0, max(0.0f, min(value, 1.0f)));
                    }
                    break;
                default:
                    break;
            }
        }
    };

    private final UIHandler textboxhandler = new UIHandler() {
        @Override public void invoke(int item, int event) {
            UITextData data = UITextData.create(uiGetHandle(item));
            switch (event) {
                case UI_BUTTON0_DOWN:
                    uiFocus(item);
                    break;
                case UI_KEY_DOWN: {
                    int key = uiGetKey();
                    switch (key) {
                        case GLFW_KEY_BACKSPACE:
                            ByteBuffer text = Objects.requireNonNull(data.text());

                            int size = text.remaining();
                            if (size == 0) {
                                return;
                            }

                            memPutByte(memAddress(text) + size - 1, (byte)0);
                            break;
                        case GLFW_KEY_ENTER:
                            uiFocus(-1);
                            break;
                        default:
                            break;
                    }
                }
                break;
                case UI_CHAR:
                    int key = uiGetKey();
                    if ((key > 255) || (key < 32)) {
                        return;
                    }
                    ByteBuffer text = Objects.requireNonNull(data.text());

                    int size = text.remaining();
                    if (size >= (data.maxsize() - 1)) {
                        return;
                    }
                    memPutByte(memAddress(text) + size, (byte)key);
                    break;
                default:
                    break;
            }
        }
    };

    // simple logic for a radio button
    private final UIHandler radiohandler = new UIHandler() {
        @Override public void invoke(int item, int event) {
            UIRadioData data = UIRadioData.create(uiGetHandle(item));
            data.value(1).put(0, item);
        }
    };

    private static final UIHandler roothandler = new UIHandler() {
        @Override public void invoke(int item, int event) {
            switch (event) {
                case UI_SCROLL:
                    try (MemoryStack stack = stackPush()) {
                        UIVec2 pos = uiGetScroll(UIVec2.malloc(stack));
                        System.out.printf("scroll! %d %d\n", pos.x(), pos.y());
                    }
                    break;
                case UI_BUTTON0_DOWN:
                    System.out.printf("%d clicks\n", uiGetClicks());
                    break;
                default:
                    break;
            }
        }
    };

    private final IntBuffer enum1 = BufferUtils.createIntBuffer(1);

    // some persistent variables for demonstration
    private final FloatBuffer progress1 = BufferUtils.createFloatBuffer(1);
    private final FloatBuffer progress2 = BufferUtils.createFloatBuffer(1);
    private final IntBuffer   option1   = BufferUtils.createIntBuffer(1);
    private final IntBuffer   option2   = BufferUtils.createIntBuffer(1);
    private final IntBuffer   option3   = BufferUtils.createIntBuffer(1);
    private final IntBuffer   choice    = BufferUtils.createIntBuffer(1);

    private final ByteBuffer textbuffer = BufferUtils.createByteBuffer(1024);

    private final Map<String, ByteBuffer> TEXT_MAP = new HashMap<>(32);

    private final long uictx;

    private int peak_items;
    private int peak_alloc;

    OUIState() {
        uictx = uiCreateContext(4096, 1 << 20);
        uiMakeCurrent(uictx);
        uiSetHandler(ui_handler);

        enum1.put(0, -1);
        progress1.put(0, 0.25f);
        progress2.put(0, 0.75f);
        choice.put(0, -1);

        memUTF8("The quick brown fox.", true, textbuffer);
    }

    void destroy() {
        System.out.printf("Peak item count: %d\nPeak allocated handles: %d bytes\n", peak_items, peak_alloc);

        uiDestroyContext(uictx);

        for (ByteBuffer value : TEXT_MAP.values()) {
            memFree(value);
        }

        roothandler.free();
        radiohandler.free();
        textboxhandler.free();
        sliderhandler.free();
        checkhandler.free();
        demohandler.free();
        ui_handler.free();
    }

    private static void testrect(long vg, UIRect rect) {
        /*nvgBeginPath(vg);
        nvgRect(vg,rect.x()+0.5f,rect.y()+0.5f,rect.w()-1,rect.h()-1);
        try (MemoryStack stack = stackPush()) {
            nvgStrokeColor(vg, nvgRGBf(1, 0, 0, NVGColor.malloc(stack)));
        }
        nvgStrokeWidth(vg,1);
        nvgStroke(vg);*/
    }

    private static void drawUIItems(long vg, int item, int corners) {
        int kid = uiFirstChild(item);
        while (kid > 0) {
            drawUI(vg, kid, corners);
            kid = uiNextSibling(kid);
        }
    }

    private static void drawUIItemsHbox(long vg, int item) {
        int kid = uiFirstChild(item);
        if (kid < 0) {
            return;
        }
        int nextkid = uiNextSibling(kid);
        if (nextkid < 0) {
            drawUI(vg, kid, BND_CORNER_NONE);
        } else {
            drawUI(vg, kid, BND_CORNER_RIGHT);
            kid = nextkid;
            while (uiNextSibling(kid) > 0) {
                drawUI(vg, kid, BND_CORNER_ALL);
                kid = uiNextSibling(kid);
            }
            drawUI(vg, kid, BND_CORNER_LEFT);
        }
    }

    private static void drawUIItemsVbox(long vg, int item) {
        int kid = uiFirstChild(item);
        if (kid < 0) {
            return;
        }
        int nextkid = uiNextSibling(kid);
        if (nextkid < 0) {
            drawUI(vg, kid, BND_CORNER_NONE);
        } else {
            drawUI(vg, kid, BND_CORNER_DOWN);
            kid = nextkid;
            while (uiNextSibling(kid) > 0) {
                drawUI(vg, kid, BND_CORNER_ALL);
                kid = uiNextSibling(kid);
            }
            drawUI(vg, kid, BND_CORNER_TOP);
        }
    }

    private static void drawUI(long vg, int item, int corners) {
        UIData head = UIData.createSafe(uiGetHandle(item));

        try (MemoryStack stack = stackPush()) {
            UIRect rect = uiGetRect(item, UIRect.malloc(stack));
            if (uiGetState(item) == UI_FROZEN) {
                nvgGlobalAlpha(vg, BND_DISABLED_ALPHA);
            }
            if (head != null) {
                switch (SUBTYPES[head.subtype()]) {
                    case ST_HBOX:
                        drawUIItemsHbox(vg, item);
                        break;
                    case ST_VBOX:
                        drawUIItemsVbox(vg, item);
                        break;
                    case ST_PANEL:
                        bndBevel(vg, rect.x(), rect.y(), rect.w(), rect.h());
                        drawUIItems(vg, item, corners);
                        break;
                    case ST_LABEL: {
                        UIButtonData data = UIButtonData.create(head.address());
                        bndLabel(vg, rect.x(), rect.y(), rect.w(), rect.h(), data.iconid(), NT(data.label()));
                    }
                    break;
                    case ST_BUTTON: {
                        UIButtonData data = UIButtonData.create(head.address());
                        bndToolButton(
                            vg, rect.x(), rect.y(), rect.w(), rect.h(), corners, uiGetState(item),
                            data.iconid(), NT(data.label())
                        );
                    }
                    break;
                    case ST_CHECK: {
                        UICheckData data  = UICheckData.create(head.address());
                        int         state = uiGetState(item);
                        if (data.option(1).get(0) != 0) {
                            state = BND_ACTIVE;
                        }
                        bndOptionButton(vg, rect.x(), rect.y(), rect.w(), rect.h(), state, NT(data.label()));
                    }
                    break;
                    case ST_RADIO: {
                        UIRadioData data  = UIRadioData.create(head.address());
                        int         state = uiGetState(item);
                        if (data.value(1).get(0) == item) {
                            state = BND_ACTIVE;
                        }
                        bndRadioButton(vg, rect.x(), rect.y(), rect.w(), rect.h(), corners, state, data.iconid(), NT(data.label()));
                    }
                    break;
                    case ST_SLIDER: {
                        UISliderData data  = UISliderData.create(head.address());
                        int          state = uiGetState(item);
                        ByteBuffer   value = stack.UTF8(String.format("%.0f%%", data.progress(1).get(0) * 100.0f));
                        bndSlider(
                            vg, rect.x(), rect.y(), rect.w(), rect.h(), corners, state,
                            data.progress(1).get(0), NT(data.label()), value
                        );
                    }
                    break;
                    case ST_TEXT: {
                        UITextData data  = UITextData.create(head.address());
                        int        state = uiGetState(item);
                        ByteBuffer text  = Objects.requireNonNull(data.text());
                        int        idx   = text.remaining();
                        bndTextField(vg, rect.x(), rect.y(), rect.w(), rect.h(), corners, state, -1, NT(text), idx, idx);
                    }
                    break;
                    case ST_DEMOSTUFF:
                        draw_demostuff(vg, rect.x(), rect.y(), rect.w(), rect.h());
                        break;
                    case ST_RECT:
                        UIRectData data = UIRectData.create(head.address());
                        if (rect.w() != 0 && rect.h() != 0) {
                            int state = uiGetState(item);
                            nvgSave(vg);

                            NVGColor ci = data.color();
                            NVGColor co = NVGColor.malloc(stack);
                            nvgStrokeColor(vg, nvgRGBAf(ci.r(), ci.g(), ci.b(), 0.9f, co));
                            if (state != BND_DEFAULT) {
                                nvgFillColor(vg, nvgRGBAf(ci.r(), ci.g(), ci.b(), 0.5f, co));
                            } else {
                                nvgFillColor(vg, nvgRGBAf(ci.r(), ci.g(), ci.b(), 0.1f, co));
                            }
                            nvgStrokeWidth(vg, 2);
                            nvgBeginPath(vg);
                            nvgRoundedRect(vg, rect.x(), rect.y(), rect.w(), rect.h(), 3);
                            nvgFill(vg);
                            nvgStroke(vg);

                            if (state != BND_DEFAULT) {
                                nvgFillColor(vg, nvgRGBAf(0.0f, 0.0f, 0.0f, 1.0f, co));
                                nvgFontSize(vg, 15.0f);
                                nvgBeginPath(vg);
                                nvgTextAlign(vg, NVG_ALIGN_TOP | NVG_ALIGN_CENTER);
                                nvgTextBox(vg, rect.x(), rect.y() + rect.h() * 0.3f, rect.w(), Objects.requireNonNull(data.label()));
                            }

                            nvgRestore(vg);
                        }
                        nvgSave(vg);
                        nvgIntersectScissor(vg, rect.x(), rect.y(), rect.w(), rect.h());

                        drawUIItems(vg, item, corners);

                        nvgRestore(vg);
                        break;
                    default:
                        testrect(vg, rect);
                        drawUIItems(vg, item, corners);
                        break;
                }
            } else {
                testrect(vg, rect);
                drawUIItems(vg, item, corners);
            }
        }

        if (uiGetState(item) == UI_FROZEN) {
            nvgGlobalAlpha(vg, 1.0f);
        }
    }

    private static int colorrect(ByteBuffer label, NVGColor color) {
        int        item = uiItem();
        UIRectData data = UIRectData.create(nuiAllocHandle(item, UIRectData.SIZEOF));
        data.head().subtype(ST_RECT.ordinal());
        data.head().handler(null);
        data.label(label);
        data.color(color);
        uiSetEvents(item, UI_BUTTON0_DOWN);
        return item;
    }

    private static int label(int iconid, ByteBuffer label) {
        int item = uiItem();
        uiSetSize(item, 0, BND_WIDGET_HEIGHT);
        UIButtonData data = UIButtonData.create(nuiAllocHandle(item, UIButtonData.SIZEOF));
        data.head().subtype(ST_LABEL.ordinal());
        data.head().handler(null);
        data.iconid(iconid);
        data.label(label);
        return item;
    }

    private static int button(int iconid, ByteBuffer label, UIHandler handler) {
        // create new ui item
        int item = uiItem();
        // set size of wiget; horizontal size is dynamic, vertical is fixed
        uiSetSize(item, 0, BND_WIDGET_HEIGHT);
        uiSetEvents(item, UI_BUTTON0_HOT_UP);
        // store some custom data with the button that we use for styling
        UIButtonData data = UIButtonData.create(nuiAllocHandle(item, UIButtonData.SIZEOF));
        data.head().subtype(ST_BUTTON.ordinal());
        data.head().handler(handler);
        data.iconid(iconid);
        data.label(label);
        return item;
    }

    private static int check(ByteBuffer label, IntBuffer option) {
        // create new ui item
        int item = uiItem();
        // set size of wiget; horizontal size is dynamic, vertical is fixed
        uiSetSize(item, 0, BND_WIDGET_HEIGHT);
        // attach event handler e.g. demohandler above
        uiSetEvents(item, UI_BUTTON0_DOWN);
        // store some custom data with the button that we use for styling
        UICheckData data = UICheckData.create(nuiAllocHandle(item, UICheckData.SIZEOF));
        data.head().subtype(ST_CHECK.ordinal());
        data.head().handler(checkhandler);
        data.label(label);
        data.option(option);
        return item;
    }

    // simple logic for a slider
    private int slider(ByteBuffer label, FloatBuffer progress) {
        // create new ui item
        int item = uiItem();
        // set size of wiget; horizontal size is dynamic, vertical is fixed
        uiSetSize(item, 0, BND_WIDGET_HEIGHT);
        // attach our slider event handler and capture two classes of events
        uiSetEvents(item, UI_BUTTON0_DOWN | UI_BUTTON0_CAPTURE);
        // store some custom data with the button that we use for styling
        // and logic, e.g. the pointer to the data we want to alter.
        UISliderData data = UISliderData.create(nuiAllocHandle(item, UISliderData.SIZEOF));
        data.head().subtype(ST_SLIDER.ordinal());
        data.head().handler(sliderhandler);
        data.label(label);
        data.progress(progress);
        return item;
    }

    private int textbox(ByteBuffer text, int maxsize) {
        int item = uiItem();
        uiSetSize(item, 0, BND_WIDGET_HEIGHT);
        uiSetEvents(item, UI_BUTTON0_DOWN | UI_KEY_DOWN | UI_CHAR);
        // store some custom data with the button that we use for styling
        // and logic, e.g. the pointer to the data we want to alter.
        UITextData data = UITextData.create(nuiAllocHandle(item, UITextData.SIZEOF));
        data.head().subtype(ST_TEXT.ordinal());
        data.head().handler(textboxhandler);
        data.text(text);
        data.maxsize(maxsize);
        return item;
    }

    private int radio(int iconid, @Nullable ByteBuffer label, IntBuffer value) {
        int item = uiItem();
        uiSetSize(item, label != null ? 0 : BND_TOOL_WIDTH, BND_WIDGET_HEIGHT);
        UIRadioData data = UIRadioData.create(nuiAllocHandle(item, UIRadioData.SIZEOF));
        data.head().subtype(ST_RADIO.ordinal());
        data.head().handler(radiohandler);
        data.iconid(iconid);
        data.label(label);
        data.value(value);
        uiSetEvents(item, UI_BUTTON0_DOWN);
        return item;
    }

    private static int panel() {
        int    item = uiItem();
        UIData data = UIData.create(nuiAllocHandle(item, UIData.SIZEOF));
        data.subtype(ST_PANEL.ordinal());
        data.handler(null);
        return item;
    }

    private static int hbox() {
        int    item = uiItem();
        UIData data = UIData.create(nuiAllocHandle(item, UIData.SIZEOF));
        data.subtype(ST_HBOX.ordinal());
        data.handler(null);
        uiSetBox(item, UI_ROW);
        return item;
    }

    private static int vbox() {
        int    item = uiItem();
        UIData data = UIData.create(nuiAllocHandle(item, UIData.SIZEOF));
        data.subtype(ST_VBOX.ordinal());
        data.handler(null);
        uiSetBox(item, UI_COLUMN);
        return item;
    }

    private static int column_append(int parent, int item) {
        uiInsert(parent, item);
        // fill parent horizontally, anchor to previous item vertically
        uiSetLayout(item, UI_HFILL);
        uiSetMargins(item, 0, 1, 0, 0);
        return item;
    }

    private static int column() {
        int item = uiItem();
        uiSetBox(item, UI_COLUMN);
        return item;
    }

    private static int vgroup_append(int parent, int item) {
        uiInsert(parent, item);
        // fill parent horizontally, anchor to previous item vertically
        uiSetLayout(item, UI_HFILL);
        return item;
    }

    private static int vgroup() {
        int item = uiItem();
        uiSetBox(item, UI_COLUMN);
        return item;
    }

    private static int hgroup_append(int parent, int item) {
        uiInsert(parent, item);
        uiSetLayout(item, UI_HFILL);
        return item;
    }

    private static int hgroup_append_fixed(int parent, int item) {
        uiInsert(parent, item);
        return item;
    }

    private static int hgroup() {
        int item = uiItem();
        uiSetBox(item, UI_ROW);
        return item;
    }

    private static int row_append(int parent, int item) {
        uiInsert(parent, item);
        uiSetLayout(item, UI_HFILL);
        return item;
    }

    private static int row() {
        int item = uiItem();
        uiSetBox(item, UI_ROW);
        return item;
    }

    private static void draw_noodles(long vg, int x, int y) {
        int w = 200;
        int s = 70;

        try (MemoryStack stack = stackPush()) {
            NVGColor c = nvgRGBf(0.392f, 0.392f, 0.392f, NVGColor.malloc(stack));

            bndNodeBackground(vg, x + w, y - 50, 100, 200, BND_DEFAULT, BND_ICONID(0, 25), "Default", c);
            bndNodeBackground(vg, x + w + 120, y - 50, 100, 200, BND_HOVER, BND_ICONID(1, 25), "Hover", c);
            bndNodeBackground(vg, x + w + 240, y - 50, 100, 200, BND_ACTIVE, BND_ICONID(2, 25), "Active", c);
        }

        for (int i = 0; i < 9; ++i) {
            int a = i % 3;
            int b = i / 3;
            bndNodeWire(vg, x, y + s * a, x + w, y + s * b, a, b);
        }

        try (MemoryStack stack = stackPush()) {
            NVGColor c = nvgRGBf(0.5f, 0.5f, 0.5f, NVGColor.malloc(stack));

            bndNodePort(vg, x, y, BND_DEFAULT, c);
            bndNodePort(vg, x + w, y, BND_DEFAULT, c);
            bndNodePort(vg, x, y + s, BND_HOVER, c);
            bndNodePort(vg, x + w, y + s, BND_HOVER, c);
            bndNodePort(vg, x, y + 2 * s, BND_ACTIVE, c);
            bndNodePort(vg, x + w, y + 2 * s, BND_ACTIVE, c);
        }
    }

    private static void draw_demostuff(long vg, int x, int y, float w, float h) {
        nvgSave(vg);
        nvgTranslate(vg, x, y);

        bndSplitterWidgets(vg, 0, 0, w, h);

        x = 10;
        y = 10;

        bndToolButton(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_DEFAULT, BND_ICONID(0, 26), "Default");
        y += 25;
        bndToolButton(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_HOVER, BND_ICONID(1, 26), "Hovered");
        y += 25;
        bndToolButton(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_ACTIVE, BND_ICONID(2, 26), "Active");

        y += 40;
        bndRadioButton(vg, x, y, 80, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_DEFAULT, -1, "Default");
        y += 25;
        bndRadioButton(vg, x, y, 80, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_HOVER, -1, "Hovered");
        y += 25;
        bndRadioButton(vg, x, y, 80, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_ACTIVE, -1, "Active");

        y += 25;
        bndLabel(vg, x, y, 120, BND_WIDGET_HEIGHT, -1, "Label:");
        y += BND_WIDGET_HEIGHT;
        bndChoiceButton(vg, x, y, 80, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_DEFAULT, -1, "Default");
        y += 25;
        bndChoiceButton(vg, x, y, 80, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_HOVER, -1, "Hovered");
        y += 25;
        bndChoiceButton(vg, x, y, 80, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_ACTIVE, -1, "Active");

        y += 25;
        int ry = y;
        int rx = x;

        y = 10;
        x += 130;
        bndOptionButton(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_DEFAULT, "Default");
        y += 25;
        bndOptionButton(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_HOVER, "Hovered");
        y += 25;
        bndOptionButton(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_ACTIVE, "Active");

        y += 40;
        bndNumberField(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_DOWN, BND_DEFAULT, "Top", "100");
        y += BND_WIDGET_HEIGHT - 2;
        bndNumberField(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, "Center", "100");
        y += BND_WIDGET_HEIGHT - 2;
        bndNumberField(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_TOP, BND_DEFAULT, "Bottom", "100");

        int mx = x - 30;
        int my = y - 12;
        int mw = 120;
        bndMenuBackground(vg, mx, my, mw, 120, BND_CORNER_TOP);
        bndMenuLabel(vg, mx, my, mw, BND_WIDGET_HEIGHT, -1, "Menu Title");
        my += BND_WIDGET_HEIGHT - 2;
        bndMenuItem(vg, mx, my, mw, BND_WIDGET_HEIGHT, BND_DEFAULT, BND_ICONID(17, 3), "Default");
        my += BND_WIDGET_HEIGHT - 2;
        bndMenuItem(vg, mx, my, mw, BND_WIDGET_HEIGHT, BND_HOVER, BND_ICONID(18, 3), "Hovered");
        my += BND_WIDGET_HEIGHT - 2;
        bndMenuItem(vg, mx, my, mw, BND_WIDGET_HEIGHT, BND_ACTIVE, BND_ICONID(19, 3), "Active");

        y = 10;
        x += 130;
        int ox = x;
        bndNumberField(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_DEFAULT, "Default", "100");
        y += 25;
        bndNumberField(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_HOVER, "Hovered", "100");
        y += 25;
        bndNumberField(vg, x, y, 120, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_ACTIVE, "Active", "100");

        y += 40;
        bndRadioButton(vg, x, y, 60, BND_WIDGET_HEIGHT, BND_CORNER_RIGHT, BND_DEFAULT, -1, "One");
        x += 60 - 1;
        bndRadioButton(vg, x, y, 60, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, -1, "Two");
        x += 60 - 1;
        bndRadioButton(vg, x, y, 60, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, -1, "Three");
        x += 60 - 1;
        bndRadioButton(vg, x, y, 60, BND_WIDGET_HEIGHT, BND_CORNER_LEFT, BND_ACTIVE, -1, "Butts");

        x = ox;
        y += 40;
        float  progress_value = (float)(glfwGetTime() / 10.0 % 1.0);
        String progress_label = String.format("%d%%", (int)(progress_value * 100 + 0.5f));
        bndSlider(vg, x, y, 240, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_DEFAULT, progress_value, "Default", progress_label);
        y += 25;
        bndSlider(vg, x, y, 240, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_HOVER, progress_value, "Hovered", progress_label);
        y += 25;
        bndSlider(vg, x, y, 240, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_ACTIVE, progress_value, "Active", progress_label);

        int   rw       = x + 240 - rx;
        float s_offset = (float)(Math.sin(glfwGetTime() / 2.0) * 0.5 + 0.5);
        float s_size   = (float)(Math.cos(glfwGetTime() / 3.11) * 0.5 + 0.5);

        bndScrollBar(vg, rx, ry, rw, BND_SCROLLBAR_HEIGHT, BND_DEFAULT, s_offset, s_size);
        ry += 20;
        bndScrollBar(vg, rx, ry, rw, BND_SCROLLBAR_HEIGHT, BND_HOVER, s_offset, s_size);
        ry += 20;
        bndScrollBar(vg, rx, ry, rw, BND_SCROLLBAR_HEIGHT, BND_ACTIVE, s_offset, s_size);

        String edit_text = "The quick brown fox";
        int    textlen   = edit_text.length() + 1;
        int    t         = (int)(glfwGetTime() * 2);
        int    idx1      = (t / textlen) % textlen;
        int    idx2      = idx1 + (t % (textlen - idx1));

        ry += 25;
        bndTextField(vg, rx, ry, 240, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_DEFAULT, -1, edit_text, idx1, idx2);
        ry += 25;
        bndTextField(vg, rx, ry, 240, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_HOVER, -1, edit_text, idx1, idx2);
        ry += 25;
        bndTextField(vg, rx, ry, 240, BND_WIDGET_HEIGHT, BND_CORNER_NONE, BND_ACTIVE, -1, edit_text, idx1, idx2);

        draw_noodles(vg, 20, ry + 50);

        rx += rw + 20;
        ry = 10;
        bndScrollBar(vg, rx, ry, BND_SCROLLBAR_WIDTH, 240, BND_DEFAULT, s_offset, s_size);
        rx += 20;
        bndScrollBar(vg, rx, ry, BND_SCROLLBAR_WIDTH, 240, BND_HOVER, s_offset, s_size);
        rx += 20;
        bndScrollBar(vg, rx, ry, BND_SCROLLBAR_WIDTH, 240, BND_ACTIVE, s_offset, s_size);

        ByteBuffer NULL = null;

        x = ox;
        y += 40;
        bndToolButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_RIGHT, BND_DEFAULT, BND_ICONID(0, 10), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndToolButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(1, 10), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndToolButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(2, 10), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndToolButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(3, 10), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndToolButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(4, 10), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndToolButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_LEFT, BND_DEFAULT, BND_ICONID(5, 10), NULL);
        x += BND_TOOL_WIDTH - 1;
        x += 5;
        bndRadioButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_RIGHT, BND_DEFAULT, BND_ICONID(0, 11), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndRadioButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(1, 11), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndRadioButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(2, 11), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndRadioButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_DEFAULT, BND_ICONID(3, 11), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndRadioButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_ALL, BND_ACTIVE, BND_ICONID(4, 11), NULL);
        x += BND_TOOL_WIDTH - 1;
        bndRadioButton(vg, x, y, BND_TOOL_WIDTH, BND_WIDGET_HEIGHT, BND_CORNER_LEFT, BND_DEFAULT, BND_ICONID(5, 11), NULL);

        nvgRestore(vg);
    }

    private ByteBuffer LABEL(String text) {
        return TEXT_MAP.computeIfAbsent(text, s -> memUTF8(text));
    }

    @Nullable
    private static ByteBuffer NT(@Nullable ByteBuffer text) {
        return text == null ? null : memByteBuffer(memAddress(text), text.capacity() + 1);
    }

    private void build_democontent(int parent) {
        int col = column();
        uiInsert(parent, col);
        uiSetMargins(col, 10, 10, 10, 10);
        uiSetLayout(col, UI_TOP | UI_HFILL);

        column_append(col, button(BND_ICON_BONE_DATA, LABEL("Item 1"), demohandler));
        if (option3.get(0) != 0) {
            column_append(col, button(BND_ICON_LAMP_SPOT, LABEL("Item 2"), demohandler));
        }

        int h = column_append(col, hbox());
        hgroup_append(h, radio(BND_ICON_EDIT, LABEL("Item 3.0"), enum1));
        if (option2.get(0) != 0) {
            uiSetMargins(hgroup_append_fixed(h, radio(BND_ICON_REC, null, enum1)), -1, 0, 0, 0);
        }
        uiSetMargins(hgroup_append_fixed(h, radio(BND_ICON_PLAY, null, enum1)), -1, 0, 0, 0);
        uiSetMargins(hgroup_append(h, radio(BND_ICON_META_CUBE, LABEL("Item 3.3"), enum1)), -1, 0, 0, 0);

        int rows = column_append(col, row());
        int coll = row_append(rows, vgroup());
        vgroup_append(coll, label(-1, LABEL("Items 4.0:")));
        coll = vgroup_append(coll, vbox());
        vgroup_append(coll, button(BND_ICON_OUTLINER_DATA_LATTICE, LABEL("Item 4.0.0"), demohandler));
        uiSetMargins(vgroup_append(coll, button(BND_ICON_MOD_SMOKE, LABEL("Item 4.0.1"), demohandler)), 0, -2, 0, 0);
        int colr = row_append(rows, vgroup());
        uiSetMargins(colr, 8, 0, 0, 0);
        uiSetFrozen(colr, option1.get(0) != 0);
        vgroup_append(colr, label(-1, LABEL("Items 4.1:")));
        colr = vgroup_append(colr, vbox());
        vgroup_append(colr, slider(LABEL("Item 4.1.0"), progress1));
        uiSetMargins(vgroup_append(colr, slider(LABEL("Item 4.1.1"), progress2)), 0, -2, 0, 0);

        column_append(col, button(BND_ICON_POTATO, LABEL("Item 5"), null));

        column_append(col, textbox(textbuffer, 1024));

        column_append(col, check(LABEL("Frozen"), option1));
        column_append(col, check(LABEL("Item 7"), option2));
        column_append(col, check(LABEL("Item 8"), option3));
    }

    private static int demorect(int parent, ByteBuffer label, float hue, int box, int layout, int w, int h, int m1, int m2, int m3, int m4) {
        try (MemoryStack stack = stackPush()) {
            int item = colorrect(label, nvgHSL(hue, 1.0f, 0.8f, NVGColor.malloc(stack)));
            uiSetLayout(item, layout);
            uiSetBox(item, box);
            uiSetMargins(item, m1, m2, m3, m4);
            uiSetSize(item, w, h);
            uiInsert(parent, item);
            return item;
        }

    }

    private void build_layoutdemo(int parent) {
        int M = 10;
        int S = 150;

        int box = demorect(parent, LABEL("Box( UI_LAYOUT )\nLayout( UI_FILL )"), 0.6f, UI_LAYOUT, UI_FILL, 0, 0, M, M, M, M);
        demorect(box, LABEL("Layout( UI_HFILL | UI_TOP )"), 0.7f, 0, UI_HFILL | UI_TOP, S, S + M, M, M, M, 0);
        demorect(box, LABEL("Layout( UI_HFILL )"), 0.7f, 0, UI_HFILL, S, S + 2 * M, M, 0, M, 0);
        demorect(box, LABEL("Layout( UI_HFILL | UI_DOWN )"), 0.7f, 0, UI_HFILL | UI_DOWN, S, S + M, M, 0, M, M);

        demorect(box, LABEL("Layout( UI_LEFT | UI_VFILL )"), 0.7f, 0, UI_LEFT | UI_VFILL, S + M, S, M, M, 0, M);
        demorect(box, LABEL("Layout( UI_VFILL )"), 0.7f, 0, UI_VFILL, S + 2 * M, S, 0, M, 0, M);
        demorect(box, LABEL("Layout( UI_RIGHT | UI_VFILL )"), 0.7f, 0, UI_RIGHT | UI_VFILL, S + M, S, 0, M, M, M);

        demorect(box, LABEL("Layout( UI_LEFT | UI_TOP )"), 0.55f, 0, UI_LEFT | UI_TOP, S, S, M, M, 0, 0);
        demorect(box, LABEL("Layout( UI_TOP )"), 0.57f, 0, UI_TOP, S, S, 0, M, 0, 0);
        demorect(box, LABEL("Layout( UI_RIGHT | UI_TOP )"), 0.55f, 0, UI_RIGHT | UI_TOP, S, S, 0, M, M, 0);
        demorect(box, LABEL("Layout( UI_LEFT )"), 0.57f, 0, UI_LEFT, S, S, M, 0, 0, 0);
        demorect(box, LABEL("Layout( UI_CENTER )"), 0.59f, 0, UI_CENTER, S, S, 0, 0, 0, 0);
        demorect(box, LABEL("Layout( UI_RIGHT )"), 0.57f, 0, UI_RIGHT, S, S, 0, 0, M, 0);
        demorect(box, LABEL("Layout( UI_LEFT | UI_DOWN )"), 0.55f, 0, UI_LEFT | UI_DOWN, S, S, M, 0, 0, M);
        demorect(box, LABEL("Layout( UI_DOWN)"), 0.57f, 0, UI_DOWN, S, S, 0, 0, 0, M);
        demorect(box, LABEL("Layout( UI_RIGHT | UI_DOWN )"), 0.55f, 0, UI_RIGHT | UI_DOWN, S, S, 0, 0, M, M);
    }

    private void build_rowdemo(int parent) {
        uiSetBox(parent, UI_COLUMN);

        int M = 10;
        int S = 200;
        int T = 100;

        {
            int box = demorect(parent, LABEL("Box( UI_ROW )\nLayout( UI_LEFT | UI_VFILL )"), 0.6f, UI_ROW, UI_LEFT | UI_VFILL, 0, S, M, M, M, M);

            demorect(box, LABEL("Layout( UI_TOP )"), 0.05f, 0, UI_TOP, T, T, M, M, M, 0);
            demorect(box, LABEL("Layout( UI_VCENTER )"), 0.1f, 0, UI_VCENTER, T, T, 0, 0, M, 0);
            demorect(box, LABEL("Layout( UI_VFILL )"), 0.15f, 0, UI_VFILL, T, T, 0, M, M, M);
            demorect(box, LABEL("Layout( UI_DOWN )"), 0.25f, 0, UI_DOWN, T, T, 0, 0, M, M);
        }
        {
            int box = demorect(parent, LABEL("Box( UI_ROW | UI_JUSTIFY )\nLayout( UI_FILL )"), 0.6f, UI_ROW | UI_JUSTIFY, UI_FILL, 0, S, M, 0, M, M);

            demorect(box, LABEL("Layout( UI_TOP )"), 0.05f, 0, UI_TOP, T, T, M, M, M, 0);
            demorect(box, LABEL("Layout( UI_VCENTER )"), 0.1f, 0, UI_VCENTER, T, T, 0, 0, M, 0);
            demorect(box, LABEL("Layout( UI_VFILL )"), 0.15f, 0, UI_VFILL, T, T, 0, M, M, M);
            demorect(box, LABEL("Layout( UI_DOWN )"), 0.25f, 0, UI_DOWN, T, T, 0, 0, M, M);
        }
        int box = demorect(parent, LABEL("Box( UI_ROW )\nLayout( UI_FILL )"), 0.6f, UI_ROW, UI_FILL, 0, S, M, 0, M, M);

        demorect(box, LABEL("Layout( UI_TOP )"), 0.05f, 0, UI_TOP, T, T, M, M, M, 0);
        demorect(box, LABEL("Layout( UI_VCENTER )"), 0.1f, 0, UI_VCENTER, T, T, 0, 0, M, 0);
        demorect(box, LABEL("Layout( UI_VFILL )"), 0.15f, 0, UI_VFILL, T, T, 0, M, M, M);
        demorect(box, LABEL("Layout( UI_HFILL )"), 0.2f, 0, UI_HFILL, T, T, 0, 0, M, 0);
        demorect(box, LABEL("Layout( UI_HFILL )"), 0.2f, 0, UI_HFILL, T, T, 0, 0, M, 0);
        demorect(box, LABEL("Layout( UI_HFILL )"), 0.2f, 0, UI_HFILL, T, T, 0, 0, M, 0);
        demorect(box, LABEL("Layout( UI_DOWN )"), 0.25f, 0, UI_DOWN, T, T, 0, 0, M, M);
    }

    private void build_columndemo(int parent) {
        uiSetBox(parent, UI_ROW);

        int M = 10;
        int S = 200;
        int T = 100;

        {
            int box = demorect(parent, LABEL("Box( UI_COLUMN )\nLayout( UI_TOP | UI_HFILL )"), 0.6f, UI_COLUMN, UI_TOP | UI_HFILL, S, 0, M, M, M, M);

            demorect(box, LABEL("Layout( UI_LEFT )"), 0.05f, 0, UI_LEFT, T, T, M, M, 0, M);
            demorect(box, LABEL("Layout( UI_HCENTER )"), 0.1f, 0, UI_HCENTER, T, T, 0, 0, 0, M);
            demorect(box, LABEL("Layout( UI_HFILL )"), 0.15f, 0, UI_HFILL, T, T, M, 0, M, M);
            demorect(box, LABEL("Layout( UI_RIGHT )"), 0.25f, 0, UI_RIGHT, T, T, 0, 0, M, M);
        }
        {
            int box = demorect(parent, LABEL("Box( UI_COLUMN )\nLayout( UI_FILL )"), 0.6f, UI_COLUMN, UI_FILL, S, 0, 0, M, M, M);

            demorect(box, LABEL("Layout( UI_LEFT )"), 0.05f, 0, UI_LEFT, T, T, M, M, 0, M);
            demorect(box, LABEL("Layout( UI_HCENTER )"), 0.1f, 0, UI_HCENTER, T, T, 0, 0, 0, M);
            demorect(box, LABEL("Layout( UI_HFILL )"), 0.15f, 0, UI_HFILL, T, T, M, 0, M, M);
            demorect(box, LABEL("Layout( UI_RIGHT )"), 0.25f, 0, UI_RIGHT, T, T, 0, 0, M, M);
        }
        int box = demorect(parent, LABEL("Box( UI_COLUMN )\nLayout( UI_FILL )"), 0.6f, UI_COLUMN, UI_FILL, S, 0, 0, M, M, M);

        demorect(box, LABEL("Layout( UI_LEFT )"), 0.05f, 0, UI_LEFT, T, T, M, M, 0, M);
        demorect(box, LABEL("Layout( UI_HCENTER )"), 0.1f, 0, UI_HCENTER, T, T, 0, 0, 0, M);
        demorect(box, LABEL("Layout( UI_HFILL )"), 0.15f, 0, UI_HFILL, T, T, M, 0, M, M);
        demorect(box, LABEL("Layout( UI_VFILL )"), 0.2f, 0, UI_VFILL, T, T, 0, 0, 0, M);
        demorect(box, LABEL("Layout( UI_VFILL )"), 0.2f, 0, UI_VFILL, T, T, 0, 0, 0, M);
        demorect(box, LABEL("Layout( UI_VFILL )"), 0.2f, 0, UI_VFILL, T, T, 0, 0, 0, M);
        demorect(box, LABEL("Layout( UI_RIGHT )"), 0.25f, 0, UI_RIGHT, T, T, 0, 0, M, M);
    }

    private static final Random rand = new Random(303);

    private void fill_wrap_row_box(int box) {
        int M = 5;
        int S = 100;
        int T = 50;

        for (int i = 0; i < 20; ++i) {
            float hue   = rand.nextInt(360) / 360.0f;
            int   width = 10 + rand.nextInt(5) * 10;

            int u = 0;
            switch (rand.nextInt(4)) {
                case 0:
                    u = demorect(box, LABEL("Layout( UI_TOP )"), hue, 0, UI_TOP, width, T, M, M, M, M);
                    break;
                case 1:
                    u = demorect(box, LABEL("Layout( UI_VCENTER )"), hue, 0, UI_VCENTER, width, T / 2, M, M, M, M);
                    break;
                case 2:
                    u = demorect(box, LABEL("Layout( UI_VFILL )"), hue, 0, UI_VFILL, width, T, M, M, M, M);
                    break;
                case 3:
                    u = demorect(box, LABEL("Layout( UI_DOWN )"), hue, 0, UI_DOWN, width, T / 2, M, M, M, M);
                    break;
                default:
                    break;
            }

            if (rand.nextInt(10) == 0) {
                uiSetLayout(u, uiGetLayout(u) | UI_BREAK);
            }

        }

    }

    private void fill_wrap_column_box(int box) {
        int M = 5;
        int S = 100;
        int T = 50;

        for (int i = 0; i < 20; ++i) {
            float hue    = rand.nextInt(360) / 360.0f;
            int   height = 10 + rand.nextInt(5) * 10;

            int u = 0;
            switch (rand.nextInt(4)) {
                case 0:
                    u = demorect(box, LABEL("Layout( UI_LEFT )"), hue, 0, UI_LEFT, T, height, M, M, M, M);
                    break;
                case 1:
                    u = demorect(box, LABEL("Layout( UI_HCENTER )"), hue, 0, UI_HCENTER, T / 2, height, M, M, M, M);
                    break;
                case 2:
                    u = demorect(box, LABEL("Layout( UI_HFILL )"), hue, 0, UI_HFILL, T, height, M, M, M, M);
                    break;
                case 3:
                    u = demorect(box, LABEL("Layout( UI_RIGHT )"), hue, 0, UI_RIGHT, T / 2, height, M, M, M, M);
                    break;
                default:
                    break;
            }

            if (rand.nextInt(10) == 0) {
                uiSetLayout(u, uiGetLayout(u) | UI_BREAK);
            }
        }
    }

    private void build_wrapdemo(int parent) {
        int col = uiItem();
        uiInsert(parent, col);
        uiSetBox(col, UI_COLUMN);
        uiSetLayout(col, UI_FILL);

        int M = 5;
        int S = 100;
        int T = 50;

        int box;
        box = demorect(col, LABEL("Box( UI_ROW | UI_WRAP | UI_START )\nLayout( UI_HFILL | UI_TOP )"),
            0.6f, UI_ROW | UI_WRAP | UI_START, UI_TOP, 0, 0, M, M, M, M);
        fill_wrap_row_box(box);

        box = demorect(col, LABEL("Box( UI_ROW | UI_WRAP | UI_MIDDLE )\nLayout( UI_HFILL | UI_TOP )"),
            0.6f, UI_ROW | UI_WRAP, UI_HFILL | UI_TOP, 0, 0, M, M, M, M);
        fill_wrap_row_box(box);

        box = demorect(col, LABEL("Box( UI_ROW | UI_WRAP | UI_END )\nLayout( UI_HFILL | UI_TOP )"),
            0.6f, UI_ROW | UI_WRAP | UI_END, UI_HFILL | UI_TOP, 0, 0, M, M, M, M);
        fill_wrap_row_box(box);

        box = demorect(col, LABEL("Box( UI_ROW | UI_WRAP | UI_JUSTIFY )\nLayout( UI_HFILL | UI_TOP )"),
            0.6f, UI_ROW | UI_WRAP | UI_JUSTIFY, UI_HFILL | UI_TOP, 0, 0, M, M, M, M);
        fill_wrap_row_box(box);

        box = demorect(col, LABEL("Box( UI_COLUMN | UI_WRAP | UI_START )\nLayout( UI_LEFT | UI_VFILL )"),
            0.6f, UI_COLUMN | UI_WRAP | UI_START, UI_LEFT | UI_VFILL, 0, 0, M, M, M, M);
        fill_wrap_column_box(box);
    }

    private int add_menu_option(int parent, ByteBuffer name, IntBuffer choice) {
        int opt = radio(-1, name, choice);
        uiInsert(parent, opt);
        uiSetLayout(opt, UI_HFILL | UI_TOP);
        uiSetMargins(opt, 1, 1, 1, 1);
        return opt;
    }

    void draw(long vg, float w, float h) {
        bndBackground(vg, 0, 0, w, h);

        // some OUI stuff

        uiBeginLayout();

        int root = panel();
        // position root element
        uiSetSize(0, (int)w, (int)h);
        UIData.create(uiGetHandle(root)).handler(roothandler);
        uiSetEvents(root, UI_SCROLL | UI_BUTTON0_DOWN);
        uiSetBox(root, UI_COLUMN);

        int menu = uiItem();
        uiSetLayout(menu, UI_HFILL | UI_TOP);
        uiSetBox(menu, UI_ROW);
        uiInsert(root, menu);

        int opt_blendish_demo = add_menu_option(menu, LABEL("Blendish Demo"), choice);
        int opt_oui_demo      = add_menu_option(menu, LABEL("OUI Demo"), choice);
        int opt_layouts       = add_menu_option(menu, LABEL("UI_LAYOUT"), choice);
        int opt_row           = add_menu_option(menu, LABEL("UI_ROW"), choice);
        int opt_column        = add_menu_option(menu, LABEL("UI_COLUMN"), choice);
        int opt_wrap          = add_menu_option(menu, LABEL("UI_WRAP"), choice);
        if (choice.get(0) < 0) {
            choice.put(0, opt_blendish_demo);
        }

        int content = uiItem();
        uiSetLayout(content, UI_FILL);
        uiInsert(root, content);

        if (choice.get(0) == opt_blendish_demo) {
            int democontent = uiItem();
            uiSetLayout(democontent, UI_FILL);
            uiInsert(content, democontent);

            UIData data = UIData.create(nuiAllocHandle(democontent, UIData.SIZEOF));
            data.handler(null);
            data.subtype(ST_DEMOSTUFF.ordinal());
        } else if (choice.get(0) == opt_oui_demo) {
            int democontent = uiItem();
            uiSetLayout(democontent, UI_TOP);
            uiSetSize(democontent, 250, 0);
            uiInsert(content, democontent);

            build_democontent(democontent);
        } else if (choice.get(0) == opt_layouts) {
            build_layoutdemo(content);
        } else if (choice.get(0) == opt_row) {
            build_rowdemo(content);
        } else if (choice.get(0) == opt_column) {
            build_columndemo(content);
        } else if (choice.get(0) == opt_wrap) {
            build_wrapdemo(content);
        }

        uiEndLayout();

        drawUI(vg, 0, BND_CORNER_NONE);

        if (choice.get(0) == opt_blendish_demo) {
            try (MemoryStack stack = stackPush()) {
                UIVec2 cursor = uiGetCursor(UIVec2.malloc(stack));
                cursor.x(cursor.x() - round(w / 2));
                cursor.y(cursor.y() - round(h / 2));
                if (abs(cursor.x()) > (w / 3)) {
                    bndJoinAreaOverlay(vg, 0, 0, w, h, false, (cursor.x() > 0));
                } else if (abs(cursor.y()) > (h / 3)) {
                    bndJoinAreaOverlay(vg, 0, 0, w, h, true, (cursor.y() > 0));
                }
            }
        }

        uiProcess((int)(glfwGetTime() * 1000.0));

        peak_items = (peak_items > uiGetItemCount()) ? peak_items : uiGetItemCount();
        peak_alloc = (peak_alloc > uiGetAllocSize()) ? peak_alloc : uiGetAllocSize();
    }
}

enum SubType {
    // label
    ST_LABEL,
    // button
    ST_BUTTON,
    // radio button
    ST_RADIO,
    // progress slider
    ST_SLIDER,
    // column
    ST_COLUMN,
    // row
    ST_ROW,
    // check button
    ST_CHECK,
    // panel
    ST_PANEL,
    // text
    ST_TEXT,
    //
    ST_IGNORE,

    ST_DEMOSTUFF,
    // colored rectangle
    ST_RECT,

    ST_HBOX,
    ST_VBOX,
}

// The classes below were generated using the LWJGL generator, then cleaned-up.

class UIData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        SUBTYPE,
        HANDLER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBTYPE = layout.offsetof(0);
        HANDLER = layout.offsetof(1);
    }

    UIData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public int subtype() { return nsubtype(address()); }
    @Nullable
    @NativeType("UIhandler")
    public UIHandler handler() { return nhandler(address()); }

    public UIData subtype(int value) {
        nsubtype(address(), value);
        return this;
    }
    public UIData handler(@Nullable @NativeType("UIhandler") UIHandlerI value) {
        nhandler(address(), value);
        return this;
    }

    public static UIData create(long address) {
        return wrap(UIData.class, address);
    }

    @Nullable
    public static UIData createSafe(long address) {
        return address == NULL ? null : wrap(UIData.class, address);
    }

    public static int nsubtype(long struct)                              { return UNSAFE.getInt(null, struct + UIData.SUBTYPE); }
    @Nullable public static UIHandler nhandler(long struct)              { return UIHandler.createSafe(memGetAddress(struct + UIData.HANDLER)); }

    public static void nsubtype(long struct, int value)                  { UNSAFE.putInt(null, struct + UIData.SUBTYPE, value); }
    public static void nhandler(long struct, @Nullable UIHandlerI value) { memPutAddress(struct + UIData.HANDLER, memAddressSafe(value)); }

}

class UIRectData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        HEAD,
        LABEL,
        COLOR;

    static {
        Layout layout = __struct(
            __member(UIData.SIZEOF, UIData.ALIGNOF),
            __member(POINTER_SIZE),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        LABEL = layout.offsetof(1);
        COLOR = layout.offsetof(2);
    }

    UIRectData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public UIData head() { return nhead(address()); }
    public UIRectData head(java.util.function.Consumer<UIData> consumer) {
        consumer.accept(head());
        return this;
    }
    @Nullable
    @NativeType("char const *")
    public ByteBuffer label() { return nlabel(address()); }
    @Nullable
    @NativeType("char const *")
    public String labelString() { return nlabelString(address()); }
    @NativeType("NVGcolor")
    public NVGColor color() { return ncolor(address()); }
    public UIRectData color(java.util.function.Consumer<NVGColor> consumer) {
        consumer.accept(color());
        return this;
    }

    public UIRectData head(UIData value) {
        nhead(address(), value);
        return this;
    }
    public UIRectData label(@Nullable @NativeType("char const *") ByteBuffer value) {
        nlabel(address(), value);
        return this;
    }
    public UIRectData color(@NativeType("NVGcolor") NVGColor value) {
        ncolor(address(), value);
        return this;
    }

    public static UIRectData create(long address) {
        return wrap(UIRectData.class, address);
    }

    public static UIData nhead(long struct)                  { return UIData.create(struct + UIRectData.HEAD); }
    @Nullable public static ByteBuffer nlabel(long struct)   { return memByteBufferNT1Safe(memGetAddress(struct + UIRectData.LABEL)); }
    @Nullable public static String nlabelString(long struct) { return memUTF8Safe(memGetAddress(struct + UIRectData.LABEL)); }
    public static NVGColor ncolor(long struct)               { return NVGColor.create(struct + UIRectData.COLOR); }

    public static void nhead(long struct, UIData value)      { memCopy(value.address(), struct + UIRectData.HEAD, UIData.SIZEOF); }
    public static void nlabel(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1Safe(value);
        }
        memPutAddress(struct + UIRectData.LABEL, memAddressSafe(value));
    }
    public static void ncolor(long struct, NVGColor value) { memCopy(value.address(), struct + UIRectData.COLOR, NVGColor.SIZEOF); }

}

class UIButtonData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        HEAD,
        ICONID,
        LABEL;

    static {
        Layout layout = __struct(
            __member(UIData.SIZEOF, UIData.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        ICONID = layout.offsetof(1);
        LABEL = layout.offsetof(2);
    }

    UIButtonData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public UIData head() { return nhead(address()); }
    public UIButtonData head(java.util.function.Consumer<UIData> consumer) {
        consumer.accept(head());
        return this;
    }
    public int iconid() { return niconid(address()); }
    @Nullable
    @NativeType("char const *")
    public ByteBuffer label() { return nlabel(address()); }
    @Nullable
    @NativeType("char const *")
    public String labelString() { return nlabelString(address()); }

    public UIButtonData head(UIData value) {
        nhead(address(), value);
        return this;
    }
    public UIButtonData iconid(int value) {
        niconid(address(), value);
        return this;
    }
    public UIButtonData label(@Nullable @NativeType("char const *") ByteBuffer value) {
        nlabel(address(), value);
        return this;
    }

    public static UIButtonData create(long address) {
        return wrap(UIButtonData.class, address);
    }

    public static UIData nhead(long struct)                  { return UIData.create(struct + UIButtonData.HEAD); }
    public static int niconid(long struct)                   { return UNSAFE.getInt(null, struct + UIButtonData.ICONID); }
    @Nullable public static ByteBuffer nlabel(long struct)   { return memByteBufferNT1Safe(memGetAddress(struct + UIButtonData.LABEL)); }
    @Nullable public static String nlabelString(long struct) { return memUTF8Safe(memGetAddress(struct + UIButtonData.LABEL)); }

    public static void nhead(long struct, UIData value)      { memCopy(value.address(), struct + UIButtonData.HEAD, UIData.SIZEOF); }
    public static void niconid(long struct, int value)       { UNSAFE.putInt(null, struct + UIButtonData.ICONID, value); }
    public static void nlabel(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1Safe(value);
        }
        memPutAddress(struct + UIButtonData.LABEL, memAddressSafe(value));
    }

}

class UICheckData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        HEAD,
        LABEL,
        OPTION;

    static {
        Layout layout = __struct(
            __member(UIData.SIZEOF, UIData.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        LABEL = layout.offsetof(1);
        OPTION = layout.offsetof(2);
    }

    UICheckData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public UIData head() { return nhead(address()); }
    public UICheckData head(java.util.function.Consumer<UIData> consumer) {
        consumer.accept(head());
        return this;
    }
    @Nullable
    @NativeType("char const *")
    public ByteBuffer label() { return nlabel(address()); }
    @Nullable
    @NativeType("char const *")
    public String labelString() { return nlabelString(address()); }
    @NativeType("int *")
    public IntBuffer option(int capacity) { return noption(address(), capacity); }

    public UICheckData head(UIData value) {
        nhead(address(), value);
        return this;
    }
    public UICheckData label(@Nullable @NativeType("char const *") ByteBuffer value) {
        nlabel(address(), value);
        return this;
    }
    public UICheckData option(@NativeType("int *") IntBuffer value) {
        noption(address(), value);
        return this;
    }

    public static UICheckData create(long address) {
        return wrap(UICheckData.class, address);
    }

    public static UIData nhead(long struct)                    { return UIData.create(struct + UICheckData.HEAD); }
    @Nullable public static ByteBuffer nlabel(long struct)     { return memByteBufferNT1Safe(memGetAddress(struct + UICheckData.LABEL)); }
    @Nullable public static String nlabelString(long struct)   { return memUTF8Safe(memGetAddress(struct + UICheckData.LABEL)); }
    public static IntBuffer noption(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + UICheckData.OPTION), capacity); }

    public static void nhead(long struct, UIData value)        { memCopy(value.address(), struct + UICheckData.HEAD, UIData.SIZEOF); }
    public static void nlabel(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1Safe(value);
        }
        memPutAddress(struct + UICheckData.LABEL, memAddressSafe(value));
    }
    public static void noption(long struct, IntBuffer value) { memPutAddress(struct + UICheckData.OPTION, memAddress(value)); }

}

class UIRadioData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        HEAD,
        ICONID,
        LABEL,
        VALUE;

    static {
        Layout layout = __struct(
            __member(UIData.SIZEOF, UIData.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        ICONID = layout.offsetof(1);
        LABEL = layout.offsetof(2);
        VALUE = layout.offsetof(3);
    }

    UIRadioData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public UIData head() { return nhead(address()); }
    public UIRadioData head(java.util.function.Consumer<UIData> consumer) {
        consumer.accept(head());
        return this;
    }
    public int iconid() { return niconid(address()); }
    @Nullable
    @NativeType("char const *")
    public ByteBuffer label() { return nlabel(address()); }
    @Nullable
    @NativeType("char const *")
    public String labelString() { return nlabelString(address()); }
    @NativeType("int *")
    public IntBuffer value(int capacity) { return nvalue(address(), capacity); }

    public UIRadioData head(UIData value) {
        nhead(address(), value);
        return this;
    }
    public UIRadioData iconid(int value) {
        niconid(address(), value);
        return this;
    }
    public UIRadioData label(@Nullable @NativeType("char const *") ByteBuffer value) {
        nlabel(address(), value);
        return this;
    }
    public UIRadioData value(@NativeType("int *") IntBuffer value) {
        nvalue(address(), value);
        return this;
    }

    public static UIRadioData create(long address) {
        return wrap(UIRadioData.class, address);
    }

    public static UIData nhead(long struct)                   { return UIData.create(struct + UIRadioData.HEAD); }
    public static int niconid(long struct)                    { return UNSAFE.getInt(null, struct + UIRadioData.ICONID); }
    @Nullable public static ByteBuffer nlabel(long struct)    { return memByteBufferNT1Safe(memGetAddress(struct + UIRadioData.LABEL)); }
    @Nullable public static String nlabelString(long struct)  { return memUTF8Safe(memGetAddress(struct + UIRadioData.LABEL)); }
    public static IntBuffer nvalue(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + UIRadioData.VALUE), capacity); }

    public static void nhead(long struct, UIData value)       { memCopy(value.address(), struct + UIRadioData.HEAD, UIData.SIZEOF); }
    public static void niconid(long struct, int value)        { UNSAFE.putInt(null, struct + UIRadioData.ICONID, value); }
    public static void nlabel(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1Safe(value);
        }
        memPutAddress(struct + UIRadioData.LABEL, memAddressSafe(value));
    }
    public static void nvalue(long struct, IntBuffer value) { memPutAddress(struct + UIRadioData.VALUE, memAddress(value)); }

}

class UISliderData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        HEAD,
        LABEL,
        PROGRESS;

    static {
        Layout layout = __struct(
            __member(UIData.SIZEOF, UIData.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        LABEL = layout.offsetof(1);
        PROGRESS = layout.offsetof(2);
    }

    UISliderData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public UIData head() { return nhead(address()); }
    public UISliderData head(java.util.function.Consumer<UIData> consumer) {
        consumer.accept(head());
        return this;
    }
    @Nullable
    @NativeType("char const *")
    public ByteBuffer label() { return nlabel(address()); }
    @Nullable
    @NativeType("char const *")
    public String labelString() { return nlabelString(address()); }
    @NativeType("float *")
    public FloatBuffer progress(int capacity) { return nprogress(address(), capacity); }

    public UISliderData head(UIData value) {
        nhead(address(), value);
        return this;
    }
    public UISliderData label(@Nullable @NativeType("char const *") ByteBuffer value) {
        nlabel(address(), value);
        return this;
    }
    public UISliderData progress(@NativeType("float *") FloatBuffer value) {
        nprogress(address(), value);
        return this;
    }

    public static UISliderData create(long address) {
        return wrap(UISliderData.class, address);
    }

    public static UIData nhead(long struct)                        { return UIData.create(struct + UISliderData.HEAD); }
    @Nullable public static ByteBuffer nlabel(long struct)         { return memByteBufferNT1Safe(memGetAddress(struct + UISliderData.LABEL)); }
    @Nullable public static String nlabelString(long struct)       { return memUTF8Safe(memGetAddress(struct + UISliderData.LABEL)); }
    public static FloatBuffer nprogress(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + UISliderData.PROGRESS), capacity); }

    public static void nhead(long struct, UIData value)            { memCopy(value.address(), struct + UISliderData.HEAD, UIData.SIZEOF); }
    public static void nlabel(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1Safe(value);
        }
        memPutAddress(struct + UISliderData.LABEL, memAddressSafe(value));
    }
    public static void nprogress(long struct, FloatBuffer value) { memPutAddress(struct + UISliderData.PROGRESS, memAddress(value)); }

}

class UITextData extends Struct implements NativeResource {

    public static final int SIZEOF;
    public static final int ALIGNOF;

    public static final int
        HEAD,
        TEXT,
        MAXSIZE;

    static {
        Layout layout = __struct(
            __member(UIData.SIZEOF, UIData.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEAD = layout.offsetof(0);
        TEXT = layout.offsetof(1);
        MAXSIZE = layout.offsetof(2);
    }

    UITextData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    public UIData head() { return nhead(address()); }
    public UITextData head(java.util.function.Consumer<UIData> consumer) {
        consumer.accept(head());
        return this;
    }
    @Nullable
    @NativeType("char *")
    public ByteBuffer text() { return ntext(address()); }
    @Nullable
    @NativeType("char *")
    public String textString() { return ntextString(address()); }
    public int maxsize() { return nmaxsize(address()); }

    public UITextData head(UIData value) {
        nhead(address(), value);
        return this;
    }
    public UITextData text(@Nullable @NativeType("char *") ByteBuffer value) {
        ntext(address(), value);
        return this;
    }
    public UITextData maxsize(int value) {
        nmaxsize(address(), value);
        return this;
    }

    public static UITextData create(long address) {
        return wrap(UITextData.class, address);
    }

    public static UIData nhead(long struct)                 { return UIData.create(struct + UITextData.HEAD); }
    @Nullable public static ByteBuffer ntext(long struct)   { return memByteBufferNT1Safe(memGetAddress(struct + UITextData.TEXT)); }
    @Nullable public static String ntextString(long struct) { return memUTF8Safe(memGetAddress(struct + UITextData.TEXT)); }
    public static int nmaxsize(long struct)                 { return UNSAFE.getInt(null, struct + UITextData.MAXSIZE); }

    public static void nhead(long struct, UIData value)     { memCopy(value.address(), struct + UITextData.HEAD, UIData.SIZEOF); }
    public static void ntext(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) {
            checkNT1Safe(value);
        }
        memPutAddress(struct + UITextData.TEXT, memAddressSafe(value));
    }
    public static void nmaxsize(long struct, int value) { UNSAFE.putInt(null, struct + UITextData.MAXSIZE, value); }

}