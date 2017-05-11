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

    NkColor background;

    private int op = EASY;

    private IntBuffer compression = BufferUtils.createIntBuffer(1).put(0, 20);

    Demo() {
        background = NkColor.create();
        nk_rgb(28, 48, 62, background);
    }

    void layout(NkContext ctx, int x, int y) {
        try (MemoryStack stack = stackPush()) {
            NkRect rect = NkRect.mallocStack(stack);

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
                if (nk_combo_begin_color(ctx, background, NkVec2.mallocStack(stack).set(nk_widget_width(ctx), 400))) {
                    nk_layout_row_dynamic(ctx, 120, 1);
                    nk_color_picker(ctx, background, NK_RGBA);
                    nk_layout_row_dynamic(ctx, 25, 1);
                    background.r((byte)(nk_propertyi(ctx, "#R:", 0, background.r() & 0xFF, 255, 1, 1) & 0xFF));
                    background.g((byte)(nk_propertyi(ctx, "#G:", 0, background.g() & 0xFF, 255, 1, 1) & 0xFF));
                    background.b((byte)(nk_propertyi(ctx, "#B:", 0, background.b() & 0xFF, 255, 1, 1) & 0xFF));
                    background.a((byte)(nk_propertyi(ctx, "#A:", 0, background.a() & 0xFF, 255, 1, 1) & 0xFF));
                    nk_combo_end(ctx);
                }
            }
            nk_end(ctx);
        }
    }

}