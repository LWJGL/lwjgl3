/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nuklear;

import org.lwjgl.*;
import org.lwjgl.nuklear.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.nuklear.Nuklear.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Java port of
 * <a href="https://github.com/vurtun/nuklear/blob/master/demo/glfw_opengl3/main.c">https://github.com/vurtun/nuklear/blob/master/demo/glfw_opengl3/main.c</a>.
 */
class Demo {

    private static final int EASY = 0;
    private static final int HARD = 1;

    NkColorf background = NkColorf.create()
        .r(0.10f)
        .g(0.18f)
        .b(0.24f)
        .a(1.0f);

    private int op = EASY;

    private IntBuffer compression = BufferUtils.createIntBuffer(1).put(0, 20);

    Demo() {
    }

    void layout(NkContext ctx, int x, int y) {
        try (MemoryStack stack = stackPush()) {
            NkRect rect = NkRect.malloc(stack);

            if (nk_begin(
                ctx,
                "Demo",
                nk_rect(x, y, 230, 250, rect),
                NK_WINDOW_BORDER | NK_WINDOW_MOVABLE | NK_WINDOW_SCALABLE | NK_WINDOW_MINIMIZABLE | NK_WINDOW_TITLE
            )) {
                nk_layout_row_static(ctx, 30, 80, 1);
                if (nk_button_label(ctx, "button")) {
                    System.out.println("button pressed");
                }

                nk_layout_row_dynamic(ctx, 30, 2);
                if (nk_option_label(ctx, "easy", op == EASY)) {
                    op = EASY;
                }
                if (nk_option_label(ctx, "hard", op == HARD)) {
                    op = HARD;
                }

                nk_layout_row_dynamic(ctx, 25, 1);
                nk_property_int(ctx, "Compression:", 0, compression, 100, 10, 1);

                nk_layout_row_dynamic(ctx, 20, 1);
                nk_label(ctx, "background:", NK_TEXT_LEFT);
                nk_layout_row_dynamic(ctx, 25, 1);
                if (nk_combo_begin_color(ctx, nk_rgb_cf(background, NkColor.malloc(stack)), NkVec2.malloc(stack).set(nk_widget_width(ctx), 400))) {
                    nk_layout_row_dynamic(ctx, 120, 1);
                    nk_color_picker(ctx, background, NK_RGBA);
                    nk_layout_row_dynamic(ctx, 25, 1);
                    background
                        .r(nk_propertyf(ctx, "#R:", 0, background.r(), 1.0f, 0.01f, 0.005f))
                        .g(nk_propertyf(ctx, "#G:", 0, background.g(), 1.0f, 0.01f, 0.005f))
                        .b(nk_propertyf(ctx, "#B:", 0, background.b(), 1.0f, 0.01f, 0.005f))
                        .a(nk_propertyf(ctx, "#A:", 0, background.a(), 1.0f, 0.01f, 0.005f));
                    nk_combo_end(ctx);
                }
            }
            nk_end(ctx);
        }
    }

}