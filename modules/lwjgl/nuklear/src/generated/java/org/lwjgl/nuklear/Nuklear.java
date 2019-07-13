/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This is a minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was
 * designed as a simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input
 * handling but instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as
 * output. So instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual
 * UI.
 * 
 * <h3>VALUES</h3>
 * 
 * <ul>
 * <li>Immediate mode graphical user interface toolkit</li>
 * <li>Single header library</li>
 * <li>Written in C89 (ANSI C)</li>
 * <li>Small codebase (~15kLOC)</li>
 * <li>Focus on portability, efficiency and simplicity</li>
 * <li>No dependencies (not even the standard library if not wanted)</li>
 * <li>Fully skinnable and customizable</li>
 * <li>Low memory footprint with total memory control if needed or wanted</li>
 * <li>UTF-8 support</li>
 * <li>No global or hidden state</li>
 * <li>Customizable library modules (you can compile and use only what you need)</li>
 * <li>Optional font baker and vertex buffer output</li>
 * </ul>
 * 
 * <h3>FEATURES</h3>
 * 
 * <ul>
 * <li>Absolutely no platform dependent code</li>
 * <li>Memory management control ranging from/to</li>
 * <li>Ease of use by allocating everything from the standard library</li>
 * <li>Control every byte of memory inside the library</li>
 * <li>Font handling control ranging from/to</li>
 * <li>Use your own font implementation for everything</li>
 * <li>Use this libraries internal font baking and handling API</li>
 * <li>Drawing output control ranging from/to</li>
 * <li>Simple shapes for more high level APIs which already having drawing capabilities</li>
 * <li>Hardware accessible anti-aliased vertex buffer output</li>
 * <li>Customizable colors and properties ranging from/to</li>
 * <li>Simple changes to color by filling a simple color table</li>
 * <li>Complete control with ability to use skinning to decorate widgets</li>
 * <li>Bendable UI library with widget ranging from/to</li>
 * <li>Basic widgets like buttons, checkboxes, slider, ...</li>
 * <li>Advanced widget like abstract comboboxes, contextual menus,...</li>
 * <li>Compile time configuration to only compile what you need</li>
 * <li>Subset which can be used if you do not want to link or use the standard library</li>
 * <li>Can be easily modified to only update on user input instead of frame updates</li>
 * </ul>
 * 
 * <h3>FONT</h3>
 * 
 * <p>Font handling in this library was designed to be quite customizable and lets you decide what you want to use and what you want to provide. There are
 * three different ways to use the font atlas. The first two will use your font handling scheme and only requires essential data to run nuklear. The next
 * slightly more advanced features is font handling with vertex buffer output.</p>
 * 
 * <ol>
 * <li>Using your own implementation without vertex buffer output
 * <hr>
 * So first of the easiest way to do font handling is by just providing a {@link NkUserFont} struct which only requires the height in pixel of the used font
 * and a callback to calculate the width of a string. This way of handling fonts is best fitted for using the normal draw shape command API where you
 * do all the text drawing yourself and the library does not require any kind of deeper knowledge about which font handling mechanism you use.
 * IMPORTANT: the {@link NkUserFont} pointer provided to nuklear has to persist over the complete life time! I know this sucks but it is currently the only
 * way to switch between fonts.
 * 
 * <pre><code>
 * float your_text_width_calculation(nk_handle handle, float height, const char *text, int len)
 * {
 *     your_font_type *type = handle.ptr;
 *     float text_width = ...;
 *     return text_width;
 * }
 * 
 * struct nk_user_font font;
 * font.userdata.ptr = &amp;your_font_class_or_struct;
 * font.height = your_font_height;
 * font.width = your_text_width_calculation;
 * 
 * struct nk_context ctx;
 * nk_init_default(&amp;ctx, &amp;font);</code></pre></li>
 * <li>Using your own implementation with vertex buffer output
 * <hr>
 * While the first approach works fine if you don't want to use the optional vertex buffer output it is not enough if you do. To get font handling
 * working for these cases you have to provide two additional parameters inside the `nk_user_font`. First a texture atlas handle used to draw text as
 * subimages of a bigger font atlas texture and a callback to query a character's glyph information (offset, size, ...). So it is still possible to
 * provide your own font and use the vertex buffer output.
 * 
 * <pre><code>
 * float your_text_width_calculation(nk_handle handle, float height, const char *text, int len)
 * {
 *     your_font_type *type = handle.ptr;
 *     float text_width = ...;
 *     return text_width;
 * }
 * void query_your_font_glyph(nk_handle handle, float font_height, struct nk_user_font_glyph *glyph, nk_rune codepoint, nk_rune next_codepoint)
 * {
 *     your_font_type *type = handle.ptr;
 *     glyph.width = ...;
 *     glyph.height = ...;
 *     glyph.xadvance = ...;
 *     glyph.uv[0].x = ...;
 *     glyph.uv[0].y = ...;
 *     glyph.uv[1].x = ...;
 *     glyph.uv[1].y = ...;
 *     glyph.offset.x = ...;
 *     glyph.offset.y = ...;
 * }
 * 
 * struct nk_user_font font;
 * font.userdata.ptr = &amp;your_font_class_or_struct;
 * font.height = your_font_height;
 * font.width = your_text_width_calculation;
 * font.query = query_your_font_glyph;
 * font.texture.id = your_font_texture;
 * 
 * struct nk_context ctx;
 * nk_init_default(&amp;ctx, &amp;font);</code></pre></li>
 * </ol>
 * 
 * <h3>MEMORY BUFFER</h3>
 * 
 * <p>A basic (double)-buffer with linear allocation and resetting as only freeing policy. The buffer's main purpose is to control all memory management
 * inside the GUI toolkit and still leave memory control as much as possible in the hand of the user while also making sure the library is easy to use if
 * not as much control is needed. In general all memory inside this library can be provided from the user in three different ways.</p>
 * 
 * <p>The first way and the one providing most control is by just passing a fixed size memory block. In this case all control lies in the hand of the user
 * since he can exactly control where the memory comes from and how much memory the library should consume. Of course using the fixed size API removes the
 * ability to automatically resize a buffer if not enough memory is provided so you have to take over the resizing. While being a fixed sized buffer
 * sounds quite limiting, it is very effective in this library since the actual memory consumption is quite stable and has a fixed upper bound for a lot
 * of cases.</p>
 * 
 * <p>If you don't want to think about how much memory the library should allocate at all time or have a very dynamic UI with unpredictable memory
 * consumption habits but still want control over memory allocation you can use the dynamic allocator based API. The allocator consists of two callbacks
 * for allocating and freeing memory and optional userdata so you can plugin your own allocator.</p>
 * 
 * <h3>TEXT EDITOR</h3>
 * 
 * <p>Editing text in this library is handled by either {@link #nk_edit_string edit_string} or {@link #nk_edit_buffer edit_buffer}. But like almost everything in this library there are multiple
 * ways of doing it and a balance between control and ease of use with memory as well as functionality controlled by flags.</p>
 * 
 * <p>This library generally allows three different levels of memory control: First of is the most basic way of just providing a simple char array with
 * string length. This method is probably the easiest way of handling simple user text input. Main upside is complete control over memory while the
 * biggest downside in comparsion with the other two approaches is missing undo/redo.</p>
 * 
 * <p>For UIs that require undo/redo the second way was created. It is based on a fixed size {@link NkTextEdit} struct, which has an internal undo/redo stack. This
 * is mainly useful if you want something more like a text editor but don't want to have a dynamically growing buffer.</p>
 * 
 * <p>The final way is using a dynamically growing nk_text_edit struct, which has both a default version if you don't care where memory comes from and an
 * allocator version if you do. While the text editor is quite powerful for its complexity I would not recommend editing gigabytes of data with it. It is
 * rather designed for uses cases which make sense for a GUI library not for an full blown text editor.</p>
 * 
 * <h3>DRAWING</h3>
 * 
 * <p>This library was designed to be render backend agnostic so it does not draw anything to screen. Instead all drawn shapes, widgets are made of, are
 * buffered into memory and make up a command queue. Each frame therefore fills the command buffer with draw commands that then need to be executed by the
 * user and his own render backend. After that the command buffer needs to be cleared and a new frame can be started. It is probably important to note
 * that the command buffer is the main drawing API and the optional vertex buffer API only takes this format and converts it into a hardware accessible
 * format.</p>
 * 
 * <p>To use the command queue to draw your own widgets you can access the command buffer of each window by calling {@link #nk_window_get_canvas window_get_canvas} after previously
 * having called {@link #nk_begin begin}:</p>
 * 
 * <pre><code>
 * void draw_red_rectangle_widget(struct nk_context *ctx)
 * {
 *     struct nk_command_buffer *canvas;
 *     struct nk_input *input = &amp;ctx-&gt;input;
 *     canvas = nk_window_get_canvas(ctx);
 * 
 *     struct nk_rect space;
 *     enum nk_widget_layout_states state;
 *     state = nk_widget(&amp;space, ctx);
 *     if (!state) return;
 * 
 *     if (state != NK_WIDGET_ROM)
 *         update_your_widget_by_user_input(...);
 *     nk_fill_rect(canvas, space, 0, nk_rgb(255,0,0));
 * }
 * 
 * if (nk_begin(...)) {
 *     nk_layout_row_dynamic(ctx, 25, 1);
 *     draw_red_rectangle_widget(ctx);
 * }
 * nk_end(..)</code></pre>
 * 
 * <p>Important to know if you want to create your own widgets is the {@link #nk_widget widget} call. It allocates space on the panel reserved for this widget to be used,
 * but also returns the state of the widget space. If your widget is not seen and does not have to be updated it is '0' and you can just return. If it
 * only has to be drawn the state will be {@link #NK_WIDGET_ROM WIDGET_ROM} otherwise you can do both update and draw your widget. The reason for separating is to only draw and
 * update what is actually neccessary which is crucial for performance.</p>
 * 
 * <h3>STACK</h3>
 * 
 * <p>The style modifier stack can be used to temporarily change a property inside `nk_style`. For example if you want a special red button you can
 * temporarily push the old button color onto a stack draw the button with a red color and then you just pop the old color back from the stack:</p>
 * 
 * <pre><code>
 * nk_style_push_style_item(ctx, &amp;ctx-&gt;style.button.normal, nk_style_item_color(nk_rgb(255,0,0)));
 * nk_style_push_style_item(ctx, &amp;ctx-&gt;style.button.hover, nk_style_item_color(nk_rgb(255,0,0)));
 * nk_style_push_style_item(ctx, &amp;ctx-&gt;style.button.active, nk_style_item_color(nk_rgb(255,0,0)));
 * nk_style_push_vec2(ctx, &amp;cx-&gt;style.button.padding, nk_vec2(2,2));
 *  
 * nk_button(...);
 *  
 * nk_style_pop_style_item(ctx);
 * nk_style_pop_style_item(ctx);
 * nk_style_pop_style_item(ctx);
 * nk_style_pop_vec2(ctx);</code></pre>
 * 
 * <p>Nuklear has a stack for style_items, float properties, vector properties, flags, colors, fonts and for button_behavior. Each has it's own fixed size
 * stack which can be changed in compile time.</p>
 */
public class Nuklear {

    /** Constants. */
    public static final int
        NK_UTF_INVALID       = 0xFFFD,
        NK_UTF_SIZE          = 4,
        NK_INPUT_MAX         = 16,
        NK_MAX_NUMBER_BUFFER = 64;

    /** Constants. */
    public static final float
        NK_UNDEFINED                = -1.0f,
        NK_SCROLLBAR_HIDING_TIMEOUT = 4.0f;

    /**
     * Boolean values.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #nk_false nk_false}</li>
     * <li>{@link #nk_true nk_true}</li>
     * </ul>
     */
    public static final int
        nk_false = 0,
        nk_true  = 1;

    /**
     * nk_heading
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_UP UP}</li>
     * <li>{@link #NK_RIGHT RIGHT}</li>
     * <li>{@link #NK_DOWN DOWN}</li>
     * <li>{@link #NK_LEFT LEFT}</li>
     * </ul>
     */
    public static final int
        NK_UP    = 0,
        NK_RIGHT = 1,
        NK_DOWN  = 2,
        NK_LEFT  = 3;

    /**
     * nk_button_behavior
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_BUTTON_DEFAULT BUTTON_DEFAULT}</li>
     * <li>{@link #NK_BUTTON_REPEATER BUTTON_REPEATER}</li>
     * </ul>
     */
    public static final int
        NK_BUTTON_DEFAULT  = 0,
        NK_BUTTON_REPEATER = 1;

    /**
     * nk_modify
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_FIXED FIXED}</li>
     * <li>{@link #NK_MODIFIABLE MODIFIABLE}</li>
     * </ul>
     */
    public static final int
        NK_FIXED      = nk_false,
        NK_MODIFIABLE = nk_true;

    /**
     * nk_orientation
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_VERTICAL VERTICAL}</li>
     * <li>{@link #NK_HORIZONTAL HORIZONTAL}</li>
     * </ul>
     */
    public static final int
        NK_VERTICAL   = 0,
        NK_HORIZONTAL = 1;

    /**
     * nk_collapse_states
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_MINIMIZED MINIMIZED}</li>
     * <li>{@link #NK_MAXIMIZED MAXIMIZED}</li>
     * </ul>
     */
    public static final int
        NK_MINIMIZED = nk_false,
        NK_MAXIMIZED = nk_true;

    /**
     * nk_show_states
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_HIDDEN HIDDEN}</li>
     * <li>{@link #NK_SHOWN SHOWN}</li>
     * </ul>
     */
    public static final int
        NK_HIDDEN = nk_false,
        NK_SHOWN  = nk_true;

    /**
     * nk_chart_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_CHART_LINES CHART_LINES}</li>
     * <li>{@link #NK_CHART_COLUMN CHART_COLUMN}</li>
     * <li>{@link #NK_CHART_MAX CHART_MAX}</li>
     * </ul>
     */
    public static final int
        NK_CHART_LINES  = 0,
        NK_CHART_COLUMN = 1,
        NK_CHART_MAX    = 2;

    /**
     * nk_chart_event
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_CHART_HOVERING CHART_HOVERING}</li>
     * <li>{@link #NK_CHART_CLICKED CHART_CLICKED}</li>
     * </ul>
     */
    public static final int
        NK_CHART_HOVERING = 0x1,
        NK_CHART_CLICKED  = 0x2;

    /**
     * nk_color_format
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_RGB RGB}</li>
     * <li>{@link #NK_RGBA RGBA}</li>
     * </ul>
     */
    public static final int
        NK_RGB  = 0,
        NK_RGBA = 1;

    /**
     * nk_popup_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_POPUP_STATIC POPUP_STATIC}</li>
     * <li>{@link #NK_POPUP_DYNAMIC POPUP_DYNAMIC}</li>
     * </ul>
     */
    public static final int
        NK_POPUP_STATIC  = 0,
        NK_POPUP_DYNAMIC = 1;

    /**
     * nk_layout_format
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_DYNAMIC DYNAMIC}</li>
     * <li>{@link #NK_STATIC STATIC}</li>
     * </ul>
     */
    public static final int
        NK_DYNAMIC = 0,
        NK_STATIC  = 1;

    /**
     * nk_tree_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_TREE_NODE TREE_NODE}</li>
     * <li>{@link #NK_TREE_TAB TREE_TAB}</li>
     * </ul>
     */
    public static final int
        NK_TREE_NODE = 0,
        NK_TREE_TAB  = 1;

    /**
     * nk_anti_aliasing
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</li>
     * <li>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</li>
     * </ul>
     */
    public static final int
        NK_ANTI_ALIASING_OFF = 0,
        NK_ANTI_ALIASING_ON  = 1;

    /**
     * nk_convert_result
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_CONVERT_SUCCESS CONVERT_SUCCESS}</li>
     * <li>{@link #NK_CONVERT_INVALID_PARAM CONVERT_INVALID_PARAM}</li>
     * <li>{@link #NK_CONVERT_COMMAND_BUFFER_FULL CONVERT_COMMAND_BUFFER_FULL}</li>
     * <li>{@link #NK_CONVERT_VERTEX_BUFFER_FULL CONVERT_VERTEX_BUFFER_FULL}</li>
     * <li>{@link #NK_CONVERT_ELEMENT_BUFFER_FULL CONVERT_ELEMENT_BUFFER_FULL}</li>
     * </ul>
     */
    public static final int
        NK_CONVERT_SUCCESS             = 0x0,
        NK_CONVERT_INVALID_PARAM       = 0x1,
        NK_CONVERT_COMMAND_BUFFER_FULL = 1 << 1,
        NK_CONVERT_VERTEX_BUFFER_FULL  = 1 << 2,
        NK_CONVERT_ELEMENT_BUFFER_FULL = 1 << 3;

    /**
     * nk_symbol_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</li>
     * <li>{@link #NK_SYMBOL_X SYMBOL_X}</li>
     * <li>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</li>
     * <li>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</li>
     * <li>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</li>
     * <li>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</li>
     * <li>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</li>
     * <li>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</li>
     * <li>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</li>
     * <li>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</li>
     * <li>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</li>
     * <li>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</li>
     * <li>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</li>
     * <li>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</li>
     * </ul>
     */
    public static final int
        NK_SYMBOL_NONE           = 0,
        NK_SYMBOL_X              = 1,
        NK_SYMBOL_UNDERSCORE     = 2,
        NK_SYMBOL_CIRCLE_SOLID   = 3,
        NK_SYMBOL_CIRCLE_OUTLINE = 4,
        NK_SYMBOL_RECT_SOLID     = 5,
        NK_SYMBOL_RECT_OUTLINE   = 6,
        NK_SYMBOL_TRIANGLE_UP    = 7,
        NK_SYMBOL_TRIANGLE_DOWN  = 8,
        NK_SYMBOL_TRIANGLE_LEFT  = 9,
        NK_SYMBOL_TRIANGLE_RIGHT = 10,
        NK_SYMBOL_PLUS           = 11,
        NK_SYMBOL_MINUS          = 12,
        NK_SYMBOL_MAX            = 13;

    /**
     * nk_keys
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_KEY_NONE KEY_NONE}</li>
     * <li>{@link #NK_KEY_SHIFT KEY_SHIFT}</li>
     * <li>{@link #NK_KEY_CTRL KEY_CTRL}</li>
     * <li>{@link #NK_KEY_DEL KEY_DEL}</li>
     * <li>{@link #NK_KEY_ENTER KEY_ENTER}</li>
     * <li>{@link #NK_KEY_TAB KEY_TAB}</li>
     * <li>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</li>
     * <li>{@link #NK_KEY_COPY KEY_COPY}</li>
     * <li>{@link #NK_KEY_CUT KEY_CUT}</li>
     * <li>{@link #NK_KEY_PASTE KEY_PASTE}</li>
     * <li>{@link #NK_KEY_UP KEY_UP}</li>
     * <li>{@link #NK_KEY_DOWN KEY_DOWN}</li>
     * <li>{@link #NK_KEY_LEFT KEY_LEFT}</li>
     * <li>{@link #NK_KEY_RIGHT KEY_RIGHT}</li>
     * <li>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</li>
     * <li>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</li>
     * <li>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</li>
     * <li>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</li>
     * <li>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</li>
     * <li>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</li>
     * <li>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</li>
     * <li>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</li>
     * <li>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</li>
     * <li>{@link #NK_KEY_TEXT_SELECT_ALL KEY_TEXT_SELECT_ALL}</li>
     * <li>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</li>
     * <li>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</li>
     * <li>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</li>
     * <li>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</li>
     * <li>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</li>
     * <li>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</li>
     * <li>{@link #NK_KEY_MAX KEY_MAX}</li>
     * </ul>
     */
    public static final int
        NK_KEY_NONE              = 0,
        NK_KEY_SHIFT             = 1,
        NK_KEY_CTRL              = 2,
        NK_KEY_DEL               = 3,
        NK_KEY_ENTER             = 4,
        NK_KEY_TAB               = 5,
        NK_KEY_BACKSPACE         = 6,
        NK_KEY_COPY              = 7,
        NK_KEY_CUT               = 8,
        NK_KEY_PASTE             = 9,
        NK_KEY_UP                = 10,
        NK_KEY_DOWN              = 11,
        NK_KEY_LEFT              = 12,
        NK_KEY_RIGHT             = 13,
        NK_KEY_TEXT_INSERT_MODE  = 14,
        NK_KEY_TEXT_REPLACE_MODE = 15,
        NK_KEY_TEXT_RESET_MODE   = 16,
        NK_KEY_TEXT_LINE_START   = 17,
        NK_KEY_TEXT_LINE_END     = 18,
        NK_KEY_TEXT_START        = 19,
        NK_KEY_TEXT_END          = 20,
        NK_KEY_TEXT_UNDO         = 21,
        NK_KEY_TEXT_REDO         = 22,
        NK_KEY_TEXT_SELECT_ALL   = 23,
        NK_KEY_TEXT_WORD_LEFT    = 24,
        NK_KEY_TEXT_WORD_RIGHT   = 25,
        NK_KEY_SCROLL_START      = 26,
        NK_KEY_SCROLL_END        = 27,
        NK_KEY_SCROLL_DOWN       = 28,
        NK_KEY_SCROLL_UP         = 29,
        NK_KEY_MAX               = 30;

    /**
     * nk_buttons
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</li>
     * <li>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</li>
     * <li>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</li>
     * <li>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</li>
     * <li>{@link #NK_BUTTON_MAX BUTTON_MAX}</li>
     * </ul>
     */
    public static final int
        NK_BUTTON_LEFT   = 0,
        NK_BUTTON_MIDDLE = 1,
        NK_BUTTON_RIGHT  = 2,
        NK_BUTTON_DOUBLE = 3,
        NK_BUTTON_MAX    = 4;

    /**
     * nk_style_colors
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_COLOR_TEXT COLOR_TEXT}</li>
     * <li>{@link #NK_COLOR_WINDOW COLOR_WINDOW}</li>
     * <li>{@link #NK_COLOR_HEADER COLOR_HEADER}</li>
     * <li>{@link #NK_COLOR_BORDER COLOR_BORDER}</li>
     * <li>{@link #NK_COLOR_BUTTON COLOR_BUTTON}</li>
     * <li>{@link #NK_COLOR_BUTTON_HOVER COLOR_BUTTON_HOVER}</li>
     * <li>{@link #NK_COLOR_BUTTON_ACTIVE COLOR_BUTTON_ACTIVE}</li>
     * <li>{@link #NK_COLOR_TOGGLE COLOR_TOGGLE}</li>
     * <li>{@link #NK_COLOR_TOGGLE_HOVER COLOR_TOGGLE_HOVER}</li>
     * <li>{@link #NK_COLOR_TOGGLE_CURSOR COLOR_TOGGLE_CURSOR}</li>
     * <li>{@link #NK_COLOR_SELECT COLOR_SELECT}</li>
     * <li>{@link #NK_COLOR_SELECT_ACTIVE COLOR_SELECT_ACTIVE}</li>
     * <li>{@link #NK_COLOR_SLIDER COLOR_SLIDER}</li>
     * <li>{@link #NK_COLOR_SLIDER_CURSOR COLOR_SLIDER_CURSOR}</li>
     * <li>{@link #NK_COLOR_SLIDER_CURSOR_HOVER COLOR_SLIDER_CURSOR_HOVER}</li>
     * <li>{@link #NK_COLOR_SLIDER_CURSOR_ACTIVE COLOR_SLIDER_CURSOR_ACTIVE}</li>
     * <li>{@link #NK_COLOR_PROPERTY COLOR_PROPERTY}</li>
     * <li>{@link #NK_COLOR_EDIT COLOR_EDIT}</li>
     * <li>{@link #NK_COLOR_EDIT_CURSOR COLOR_EDIT_CURSOR}</li>
     * <li>{@link #NK_COLOR_COMBO COLOR_COMBO}</li>
     * <li>{@link #NK_COLOR_CHART COLOR_CHART}</li>
     * <li>{@link #NK_COLOR_CHART_COLOR COLOR_CHART_COLOR}</li>
     * <li>{@link #NK_COLOR_CHART_COLOR_HIGHLIGHT COLOR_CHART_COLOR_HIGHLIGHT}</li>
     * <li>{@link #NK_COLOR_SCROLLBAR COLOR_SCROLLBAR}</li>
     * <li>{@link #NK_COLOR_SCROLLBAR_CURSOR COLOR_SCROLLBAR_CURSOR}</li>
     * <li>{@link #NK_COLOR_SCROLLBAR_CURSOR_HOVER COLOR_SCROLLBAR_CURSOR_HOVER}</li>
     * <li>{@link #NK_COLOR_SCROLLBAR_CURSOR_ACTIVE COLOR_SCROLLBAR_CURSOR_ACTIVE}</li>
     * <li>{@link #NK_COLOR_TAB_HEADER COLOR_TAB_HEADER}</li>
     * <li>{@link #NK_COLOR_COUNT COLOR_COUNT}</li>
     * </ul>
     */
    public static final int
        NK_COLOR_TEXT                    = 0,
        NK_COLOR_WINDOW                  = 1,
        NK_COLOR_HEADER                  = 2,
        NK_COLOR_BORDER                  = 3,
        NK_COLOR_BUTTON                  = 4,
        NK_COLOR_BUTTON_HOVER            = 5,
        NK_COLOR_BUTTON_ACTIVE           = 6,
        NK_COLOR_TOGGLE                  = 7,
        NK_COLOR_TOGGLE_HOVER            = 8,
        NK_COLOR_TOGGLE_CURSOR           = 9,
        NK_COLOR_SELECT                  = 10,
        NK_COLOR_SELECT_ACTIVE           = 11,
        NK_COLOR_SLIDER                  = 12,
        NK_COLOR_SLIDER_CURSOR           = 13,
        NK_COLOR_SLIDER_CURSOR_HOVER     = 14,
        NK_COLOR_SLIDER_CURSOR_ACTIVE    = 15,
        NK_COLOR_PROPERTY                = 16,
        NK_COLOR_EDIT                    = 17,
        NK_COLOR_EDIT_CURSOR             = 18,
        NK_COLOR_COMBO                   = 19,
        NK_COLOR_CHART                   = 20,
        NK_COLOR_CHART_COLOR             = 21,
        NK_COLOR_CHART_COLOR_HIGHLIGHT   = 22,
        NK_COLOR_SCROLLBAR               = 23,
        NK_COLOR_SCROLLBAR_CURSOR        = 24,
        NK_COLOR_SCROLLBAR_CURSOR_HOVER  = 25,
        NK_COLOR_SCROLLBAR_CURSOR_ACTIVE = 26,
        NK_COLOR_TAB_HEADER              = 27,
        NK_COLOR_COUNT                   = 28;

    /**
     * nk_style_cursor
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</li>
     * <li>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</li>
     * <li>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</li>
     * <li>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</li>
     * <li>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</li>
     * <li>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</li>
     * <li>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</li>
     * <li>{@link #NK_CURSOR_COUNT CURSOR_COUNT}</li>
     * </ul>
     */
    public static final int
        NK_CURSOR_ARROW                      = 0,
        NK_CURSOR_TEXT                       = 1,
        NK_CURSOR_MOVE                       = 2,
        NK_CURSOR_RESIZE_VERTICAL            = 3,
        NK_CURSOR_RESIZE_HORIZONTAL          = 4,
        NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT = 5,
        NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT = 6,
        NK_CURSOR_COUNT                      = 7;

    /**
     * nk_widget_layout_states
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_WIDGET_INVALID WIDGET_INVALID} - The widget cannot be seen and is completely out of view</li>
     * <li>{@link #NK_WIDGET_VALID WIDGET_VALID} - The widget is completely inside the window and can be updated and drawn</li>
     * <li>{@link #NK_WIDGET_ROM WIDGET_ROM} - The widget is partially visible and cannot be updated</li>
     * </ul>
     */
    public static final int
        NK_WIDGET_INVALID = 0,
        NK_WIDGET_VALID   = 1,
        NK_WIDGET_ROM     = 2;

    /**
     * nk_widget_states
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_WIDGET_STATE_MODIFIED WIDGET_STATE_MODIFIED}</li>
     * <li>{@link #NK_WIDGET_STATE_INACTIVE WIDGET_STATE_INACTIVE} - widget is neither active nor hovered</li>
     * <li>{@link #NK_WIDGET_STATE_ENTERED WIDGET_STATE_ENTERED} - widget has been hovered on the current frame</li>
     * <li>{@link #NK_WIDGET_STATE_HOVER WIDGET_STATE_HOVER} - widget is being hovered</li>
     * <li>{@link #NK_WIDGET_STATE_ACTIVED WIDGET_STATE_ACTIVED} - widget is currently activated</li>
     * <li>{@link #NK_WIDGET_STATE_LEFT WIDGET_STATE_LEFT} - widget is from this frame on not hovered anymore</li>
     * <li>{@link #NK_WIDGET_STATE_HOVERED WIDGET_STATE_HOVERED} - widget is being hovered</li>
     * <li>{@link #NK_WIDGET_STATE_ACTIVE WIDGET_STATE_ACTIVE} - widget is currently activated</li>
     * </ul>
     */
    public static final int
        NK_WIDGET_STATE_MODIFIED = 1 << 1,
        NK_WIDGET_STATE_INACTIVE = 1 << 2,
        NK_WIDGET_STATE_ENTERED  = 1 << 3,
        NK_WIDGET_STATE_HOVER    = 1 << 4,
        NK_WIDGET_STATE_ACTIVED  = 1 << 5,
        NK_WIDGET_STATE_LEFT     = 1 << 6,
        NK_WIDGET_STATE_HOVERED  = NK_WIDGET_STATE_HOVER|NK_WIDGET_STATE_MODIFIED,
        NK_WIDGET_STATE_ACTIVE   = NK_WIDGET_STATE_ACTIVED|NK_WIDGET_STATE_MODIFIED;

    /**
     * nk_text_align
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_TEXT_ALIGN_LEFT TEXT_ALIGN_LEFT}</li>
     * <li>{@link #NK_TEXT_ALIGN_CENTERED TEXT_ALIGN_CENTERED}</li>
     * <li>{@link #NK_TEXT_ALIGN_RIGHT TEXT_ALIGN_RIGHT}</li>
     * <li>{@link #NK_TEXT_ALIGN_TOP TEXT_ALIGN_TOP}</li>
     * <li>{@link #NK_TEXT_ALIGN_MIDDLE TEXT_ALIGN_MIDDLE}</li>
     * <li>{@link #NK_TEXT_ALIGN_BOTTOM TEXT_ALIGN_BOTTOM}</li>
     * </ul>
     */
    public static final int
        NK_TEXT_ALIGN_LEFT     = 0x1,
        NK_TEXT_ALIGN_CENTERED = 0x2,
        NK_TEXT_ALIGN_RIGHT    = 0x4,
        NK_TEXT_ALIGN_TOP      = 0x8,
        NK_TEXT_ALIGN_MIDDLE   = 0x10,
        NK_TEXT_ALIGN_BOTTOM   = 0x20;

    /**
     * nk_text_alignment
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_TEXT_LEFT TEXT_LEFT}</li>
     * <li>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</li>
     * <li>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</li>
     * </ul>
     */
    public static final int
        NK_TEXT_LEFT     = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_LEFT,
        NK_TEXT_CENTERED = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_CENTERED,
        NK_TEXT_RIGHT    = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_RIGHT;

    /**
     * nk_edit_flags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</li>
     * <li>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</li>
     * <li>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</li>
     * <li>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</li>
     * <li>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</li>
     * <li>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</li>
     * <li>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</li>
     * <li>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</li>
     * <li>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</li>
     * <li>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</li>
     * <li>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</li>
     * <li>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</li>
     * <li>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</li>
     * </ul>
     */
    public static final int
        NK_EDIT_DEFAULT              = 0x0,
        NK_EDIT_READ_ONLY            = 1 << 0,
        NK_EDIT_AUTO_SELECT          = 1 << 1,
        NK_EDIT_SIG_ENTER            = 1 << 2,
        NK_EDIT_ALLOW_TAB            = 1 << 3,
        NK_EDIT_NO_CURSOR            = 1 << 4,
        NK_EDIT_SELECTABLE           = 1 << 5,
        NK_EDIT_CLIPBOARD            = 1 << 6,
        NK_EDIT_CTRL_ENTER_NEWLINE   = 1 << 7,
        NK_EDIT_NO_HORIZONTAL_SCROLL = 1 << 8,
        NK_EDIT_ALWAYS_INSERT_MODE   = 1 << 9,
        NK_EDIT_MULTILINE            = 1 << 10,
        NK_EDIT_GOTO_END_ON_ACTIVATE = 1 << 11;

    /**
     * nk_edit_types
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_EDIT_SIMPLE EDIT_SIMPLE}</li>
     * <li>{@link #NK_EDIT_FIELD EDIT_FIELD}</li>
     * <li>{@link #NK_EDIT_BOX EDIT_BOX}</li>
     * <li>{@link #NK_EDIT_EDITOR EDIT_EDITOR}</li>
     * </ul>
     */
    public static final int
        NK_EDIT_SIMPLE = NK_EDIT_ALWAYS_INSERT_MODE,
        NK_EDIT_FIELD  = NK_EDIT_SIMPLE|NK_EDIT_SELECTABLE|NK_EDIT_CLIPBOARD,
        NK_EDIT_BOX    = NK_EDIT_ALWAYS_INSERT_MODE|NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD,
        NK_EDIT_EDITOR = NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD;

    /**
     * nk_edit_events
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_EDIT_ACTIVE EDIT_ACTIVE} - edit widget is currently being modified</li>
     * <li>{@link #NK_EDIT_INACTIVE EDIT_INACTIVE} - edit widget is not active and is not being modified</li>
     * <li>{@link #NK_EDIT_ACTIVATED EDIT_ACTIVATED} - edit widget went from state inactive to state active</li>
     * <li>{@link #NK_EDIT_DEACTIVATED EDIT_DEACTIVATED} - edit widget went from state active to state inactive</li>
     * <li>{@link #NK_EDIT_COMMITED EDIT_COMMITED} - edit widget has received an enter and lost focus</li>
     * </ul>
     */
    public static final int
        NK_EDIT_ACTIVE      = 1 << 0,
        NK_EDIT_INACTIVE    = 1 << 1,
        NK_EDIT_ACTIVATED   = 1 << 2,
        NK_EDIT_DEACTIVATED = 1 << 3,
        NK_EDIT_COMMITED    = 1 << 4;

    /**
     * nk_panel_flags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_WINDOW_BORDER WINDOW_BORDER} - Draws a border around the window to visually separate the window from the background</li>
     * <li>{@link #NK_WINDOW_MOVABLE WINDOW_MOVABLE} - The movable flag indicates that a window can be moved by user input or by dragging the window header</li>
     * <li>{@link #NK_WINDOW_SCALABLE WINDOW_SCALABLE} - The scalable flag indicates that a window can be scaled by user input by dragging a scaler icon at the button of the window</li>
     * <li>{@link #NK_WINDOW_CLOSABLE WINDOW_CLOSABLE} - adds a closable icon into the header</li>
     * <li>{@link #NK_WINDOW_MINIMIZABLE WINDOW_MINIMIZABLE} - adds a minimize icon into the header</li>
     * <li>{@link #NK_WINDOW_NO_SCROLLBAR WINDOW_NO_SCROLLBAR} - Removes the scrollbar from the window</li>
     * <li>{@link #NK_WINDOW_TITLE WINDOW_TITLE} - Forces a header at the top at the window showing the title</li>
     * <li>{@link #NK_WINDOW_SCROLL_AUTO_HIDE WINDOW_SCROLL_AUTO_HIDE} - Automatically hides the window scrollbar if no user interaction: also requires delta time in {@code nk_context} to be set each frame</li>
     * <li>{@link #NK_WINDOW_BACKGROUND WINDOW_BACKGROUND} - Always keep window in the background</li>
     * <li>{@link #NK_WINDOW_SCALE_LEFT WINDOW_SCALE_LEFT} - Puts window scaler in the left-bottom corner instead right-bottom</li>
     * <li>{@link #NK_WINDOW_NO_INPUT WINDOW_NO_INPUT} - Prevents window of scaling, moving or getting focus</li>
     * </ul>
     */
    public static final int
        NK_WINDOW_BORDER           = 1 << 0,
        NK_WINDOW_MOVABLE          = 1 << 1,
        NK_WINDOW_SCALABLE         = 1 << 2,
        NK_WINDOW_CLOSABLE         = 1 << 3,
        NK_WINDOW_MINIMIZABLE      = 1 << 4,
        NK_WINDOW_NO_SCROLLBAR     = 1 << 5,
        NK_WINDOW_TITLE            = 1 << 6,
        NK_WINDOW_SCROLL_AUTO_HIDE = 1 << 7,
        NK_WINDOW_BACKGROUND       = 1 << 8,
        NK_WINDOW_SCALE_LEFT       = 1 << 9,
        NK_WINDOW_NO_INPUT         = 1 << 10;

    /**
     * nk_allocation_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_BUFFER_FIXED BUFFER_FIXED}</li>
     * <li>{@link #NK_BUFFER_DYNAMIC BUFFER_DYNAMIC}</li>
     * </ul>
     */
    public static final int
        NK_BUFFER_FIXED   = 0,
        NK_BUFFER_DYNAMIC = 1;

    /**
     * nk_buffer_allocation_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</li>
     * <li>{@link #NK_BUFFER_BACK BUFFER_BACK}</li>
     * <li>{@link #NK_BUFFER_MAX BUFFER_MAX}</li>
     * </ul>
     */
    public static final int
        NK_BUFFER_FRONT = 0,
        NK_BUFFER_BACK  = 1,
        NK_BUFFER_MAX   = 2;

    /**
     * nk_text_edit_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_TEXT_EDIT_SINGLE_LINE TEXT_EDIT_SINGLE_LINE}</li>
     * <li>{@link #NK_TEXT_EDIT_MULTI_LINE TEXT_EDIT_MULTI_LINE}</li>
     * </ul>
     */
    public static final int
        NK_TEXT_EDIT_SINGLE_LINE = 0,
        NK_TEXT_EDIT_MULTI_LINE  = 1;

    /**
     * nk_text_edit_mode
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_TEXT_EDIT_MODE_VIEW TEXT_EDIT_MODE_VIEW}</li>
     * <li>{@link #NK_TEXT_EDIT_MODE_INSERT TEXT_EDIT_MODE_INSERT}</li>
     * <li>{@link #NK_TEXT_EDIT_MODE_REPLACE TEXT_EDIT_MODE_REPLACE}</li>
     * </ul>
     */
    public static final int
        NK_TEXT_EDIT_MODE_VIEW    = 0,
        NK_TEXT_EDIT_MODE_INSERT  = 1,
        NK_TEXT_EDIT_MODE_REPLACE = 2;

    /**
     * nk_font_atlas_format
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_FONT_ATLAS_ALPHA8 FONT_ATLAS_ALPHA8}</li>
     * <li>{@link #NK_FONT_ATLAS_RGBA32 FONT_ATLAS_RGBA32}</li>
     * </ul>
     */
    public static final int
        NK_FONT_ATLAS_ALPHA8 = 0,
        NK_FONT_ATLAS_RGBA32 = 1;

    /**
     * nk_command_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_COMMAND_NOP COMMAND_NOP}</li>
     * <li>{@link #NK_COMMAND_SCISSOR COMMAND_SCISSOR}</li>
     * <li>{@link #NK_COMMAND_LINE COMMAND_LINE}</li>
     * <li>{@link #NK_COMMAND_CURVE COMMAND_CURVE}</li>
     * <li>{@link #NK_COMMAND_RECT COMMAND_RECT}</li>
     * <li>{@link #NK_COMMAND_RECT_FILLED COMMAND_RECT_FILLED}</li>
     * <li>{@link #NK_COMMAND_RECT_MULTI_COLOR COMMAND_RECT_MULTI_COLOR}</li>
     * <li>{@link #NK_COMMAND_CIRCLE COMMAND_CIRCLE}</li>
     * <li>{@link #NK_COMMAND_CIRCLE_FILLED COMMAND_CIRCLE_FILLED}</li>
     * <li>{@link #NK_COMMAND_ARC COMMAND_ARC}</li>
     * <li>{@link #NK_COMMAND_ARC_FILLED COMMAND_ARC_FILLED}</li>
     * <li>{@link #NK_COMMAND_TRIANGLE COMMAND_TRIANGLE}</li>
     * <li>{@link #NK_COMMAND_TRIANGLE_FILLED COMMAND_TRIANGLE_FILLED}</li>
     * <li>{@link #NK_COMMAND_POLYGON COMMAND_POLYGON}</li>
     * <li>{@link #NK_COMMAND_POLYGON_FILLED COMMAND_POLYGON_FILLED}</li>
     * <li>{@link #NK_COMMAND_POLYLINE COMMAND_POLYLINE}</li>
     * <li>{@link #NK_COMMAND_TEXT COMMAND_TEXT}</li>
     * <li>{@link #NK_COMMAND_IMAGE COMMAND_IMAGE}</li>
     * <li>{@link #NK_COMMAND_CUSTOM COMMAND_CUSTOM}</li>
     * </ul>
     */
    public static final int
        NK_COMMAND_NOP              = 0,
        NK_COMMAND_SCISSOR          = 1,
        NK_COMMAND_LINE             = 2,
        NK_COMMAND_CURVE            = 3,
        NK_COMMAND_RECT             = 4,
        NK_COMMAND_RECT_FILLED      = 5,
        NK_COMMAND_RECT_MULTI_COLOR = 6,
        NK_COMMAND_CIRCLE           = 7,
        NK_COMMAND_CIRCLE_FILLED    = 8,
        NK_COMMAND_ARC              = 9,
        NK_COMMAND_ARC_FILLED       = 10,
        NK_COMMAND_TRIANGLE         = 11,
        NK_COMMAND_TRIANGLE_FILLED  = 12,
        NK_COMMAND_POLYGON          = 13,
        NK_COMMAND_POLYGON_FILLED   = 14,
        NK_COMMAND_POLYLINE         = 15,
        NK_COMMAND_TEXT             = 16,
        NK_COMMAND_IMAGE            = 17,
        NK_COMMAND_CUSTOM           = 18;

    /**
     * nk_command_clipping
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_CLIPPING_OFF CLIPPING_OFF}</li>
     * <li>{@link #NK_CLIPPING_ON CLIPPING_ON}</li>
     * </ul>
     */
    public static final int
        NK_CLIPPING_OFF = nk_false,
        NK_CLIPPING_ON  = nk_true;

    /**
     * nk_draw_list_stroke
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_STROKE_OPEN STROKE_OPEN} - build up path has no connection back to the beginning</li>
     * <li>{@link #NK_STROKE_CLOSED STROKE_CLOSED} - build up path has a connection back to the beginning</li>
     * </ul>
     */
    public static final int
        NK_STROKE_OPEN   = nk_false,
        NK_STROKE_CLOSED = nk_true;

    /**
     * nk_draw_vertex_layout_attribute
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_VERTEX_POSITION VERTEX_POSITION}</li>
     * <li>{@link #NK_VERTEX_COLOR VERTEX_COLOR}</li>
     * <li>{@link #NK_VERTEX_TEXCOORD VERTEX_TEXCOORD}</li>
     * <li>{@link #NK_VERTEX_ATTRIBUTE_COUNT VERTEX_ATTRIBUTE_COUNT}</li>
     * </ul>
     */
    public static final int
        NK_VERTEX_POSITION        = 0,
        NK_VERTEX_COLOR           = 1,
        NK_VERTEX_TEXCOORD        = 2,
        NK_VERTEX_ATTRIBUTE_COUNT = 3;

    /**
     * nk_draw_vertex_layout_format
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_FORMAT_SCHAR FORMAT_SCHAR}</li>
     * <li>{@link #NK_FORMAT_SSHORT FORMAT_SSHORT}</li>
     * <li>{@link #NK_FORMAT_SINT FORMAT_SINT}</li>
     * <li>{@link #NK_FORMAT_UCHAR FORMAT_UCHAR}</li>
     * <li>{@link #NK_FORMAT_USHORT FORMAT_USHORT}</li>
     * <li>{@link #NK_FORMAT_UINT FORMAT_UINT}</li>
     * <li>{@link #NK_FORMAT_FLOAT FORMAT_FLOAT}</li>
     * <li>{@link #NK_FORMAT_DOUBLE FORMAT_DOUBLE}</li>
     * <li>{@link #NK_FORMAT_R8G8B8 FORMAT_R8G8B8}</li>
     * <li>{@link #NK_FORMAT_R16G15B16 FORMAT_R16G15B16}</li>
     * <li>{@link #NK_FORMAT_R32G32B32 FORMAT_R32G32B32}</li>
     * <li>{@link #NK_FORMAT_R8G8B8A8 FORMAT_R8G8B8A8}</li>
     * <li>{@link #NK_FORMAT_B8G8R8A8 FORMAT_B8G8R8A8}</li>
     * <li>{@link #NK_FORMAT_R16G15B16A16 FORMAT_R16G15B16A16}</li>
     * <li>{@link #NK_FORMAT_R32G32B32A32 FORMAT_R32G32B32A32}</li>
     * <li>{@link #NK_FORMAT_R32G32B32A32_FLOAT FORMAT_R32G32B32A32_FLOAT}</li>
     * <li>{@link #NK_FORMAT_R32G32B32A32_DOUBLE FORMAT_R32G32B32A32_DOUBLE}</li>
     * <li>{@link #NK_FORMAT_RGB32 FORMAT_RGB32}</li>
     * <li>{@link #NK_FORMAT_RGBA32 FORMAT_RGBA32}</li>
     * <li>{@link #NK_FORMAT_COUNT FORMAT_COUNT}</li>
     * </ul>
     */
    public static final int
        NK_FORMAT_SCHAR               = 0,
        NK_FORMAT_SSHORT              = 1,
        NK_FORMAT_SINT                = 2,
        NK_FORMAT_UCHAR               = 3,
        NK_FORMAT_USHORT              = 4,
        NK_FORMAT_UINT                = 5,
        NK_FORMAT_FLOAT               = 6,
        NK_FORMAT_DOUBLE              = 7,
        NK_FORMAT_R8G8B8              = 8,
        NK_FORMAT_R16G15B16           = 9,
        NK_FORMAT_R32G32B32           = 10,
        NK_FORMAT_R8G8B8A8            = 11,
        NK_FORMAT_B8G8R8A8            = 12,
        NK_FORMAT_R16G15B16A16        = 13,
        NK_FORMAT_R32G32B32A32        = 14,
        NK_FORMAT_R32G32B32A32_FLOAT  = 15,
        NK_FORMAT_R32G32B32A32_DOUBLE = 16,
        NK_FORMAT_RGB32               = 17,
        NK_FORMAT_RGBA32              = 18,
        NK_FORMAT_COUNT               = 19;

    /**
     * nk_style_item_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_STYLE_ITEM_COLOR STYLE_ITEM_COLOR}</li>
     * <li>{@link #NK_STYLE_ITEM_IMAGE STYLE_ITEM_IMAGE}</li>
     * </ul>
     */
    public static final int
        NK_STYLE_ITEM_COLOR = 0,
        NK_STYLE_ITEM_IMAGE = 1;

    /**
     * nk_style_header_align
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_HEADER_LEFT HEADER_LEFT}</li>
     * <li>{@link #NK_HEADER_RIGHT HEADER_RIGHT}</li>
     * </ul>
     */
    public static final int
        NK_HEADER_LEFT  = 0,
        NK_HEADER_RIGHT = 1;

    /**
     * nk_panel_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_PANEL_NONE PANEL_NONE}</li>
     * <li>{@link #NK_PANEL_WINDOW PANEL_WINDOW}</li>
     * <li>{@link #NK_PANEL_GROUP PANEL_GROUP}</li>
     * <li>{@link #NK_PANEL_POPUP PANEL_POPUP}</li>
     * <li>{@link #NK_PANEL_CONTEXTUAL PANEL_CONTEXTUAL}</li>
     * <li>{@link #NK_PANEL_COMBO PANEL_COMBO}</li>
     * <li>{@link #NK_PANEL_MENU PANEL_MENU}</li>
     * <li>{@link #NK_PANEL_TOOLTIP PANEL_TOOLTIP}</li>
     * </ul>
     */
    public static final int
        NK_PANEL_NONE       = 0,
        NK_PANEL_WINDOW     = 1 << 0,
        NK_PANEL_GROUP      = 1 << 1,
        NK_PANEL_POPUP      = 1 << 2,
        NK_PANEL_CONTEXTUAL = 1 << 4,
        NK_PANEL_COMBO      = 1 << 5,
        NK_PANEL_MENU       = 1 << 6,
        NK_PANEL_TOOLTIP    = 1 << 7;

    /**
     * nk_panel_set
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_PANEL_SET_NONBLOCK PANEL_SET_NONBLOCK}</li>
     * <li>{@link #NK_PANEL_SET_POPUP PANEL_SET_POPUP}</li>
     * <li>{@link #NK_PANEL_SET_SUB PANEL_SET_SUB}</li>
     * </ul>
     */
    public static final int
        NK_PANEL_SET_NONBLOCK = NK_PANEL_CONTEXTUAL|NK_PANEL_COMBO|NK_PANEL_MENU|NK_PANEL_TOOLTIP,
        NK_PANEL_SET_POPUP    = NK_PANEL_SET_NONBLOCK|NK_PANEL_POPUP,
        NK_PANEL_SET_SUB      = NK_PANEL_SET_POPUP|NK_PANEL_GROUP;

    /**
     * nk_panel_row_layout_type
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_LAYOUT_DYNAMIC_FIXED LAYOUT_DYNAMIC_FIXED}</li>
     * <li>{@link #NK_LAYOUT_DYNAMIC_ROW LAYOUT_DYNAMIC_ROW}</li>
     * <li>{@link #NK_LAYOUT_DYNAMIC_FREE LAYOUT_DYNAMIC_FREE}</li>
     * <li>{@link #NK_LAYOUT_DYNAMIC LAYOUT_DYNAMIC}</li>
     * <li>{@link #NK_LAYOUT_STATIC_FIXED LAYOUT_STATIC_FIXED}</li>
     * <li>{@link #NK_LAYOUT_STATIC_ROW LAYOUT_STATIC_ROW}</li>
     * <li>{@link #NK_LAYOUT_STATIC_FREE LAYOUT_STATIC_FREE}</li>
     * <li>{@link #NK_LAYOUT_STATIC LAYOUT_STATIC}</li>
     * <li>{@link #NK_LAYOUT_TEMPLATE LAYOUT_TEMPLATE}</li>
     * <li>{@link #NK_LAYOUT_COUNT LAYOUT_COUNT}</li>
     * </ul>
     */
    public static final int
        NK_LAYOUT_DYNAMIC_FIXED = 0,
        NK_LAYOUT_DYNAMIC_ROW   = 1,
        NK_LAYOUT_DYNAMIC_FREE  = 2,
        NK_LAYOUT_DYNAMIC       = 3,
        NK_LAYOUT_STATIC_FIXED  = 4,
        NK_LAYOUT_STATIC_ROW    = 5,
        NK_LAYOUT_STATIC_FREE   = 6,
        NK_LAYOUT_STATIC        = 7,
        NK_LAYOUT_TEMPLATE      = 8,
        NK_LAYOUT_COUNT         = 9;

    /**
     * nk_window_flags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</li>
     * <li>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC} - special window type growing up in height while being filled to a certain maximum height</li>
     * <li>{@link #NK_WINDOW_ROM WINDOW_ROM} - sets the window into a read only mode and does not allow input changes</li>
     * <li>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN} - Hides the window and stops any window interaction and drawing can be set by user input or by closing the window</li>
     * <li>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED} - Directly closes and frees the window at the end of the frame</li>
     * <li>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED} - marks the window as minimized</li>
     * <li>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM} - Removes the read only mode at the end of the window</li>
     * </ul>
     */
    public static final int
        NK_WINDOW_PRIVATE    = 1 << 11,
        NK_WINDOW_DYNAMIC    = NK_WINDOW_PRIVATE,
        NK_WINDOW_ROM        = 1 << 12,
        NK_WINDOW_HIDDEN     = 1 << 13,
        NK_WINDOW_CLOSED     = 1 << 14,
        NK_WINDOW_MINIMIZED  = 1 << 15,
        NK_WINDOW_REMOVE_ROM = 1 << 16;

    static { Library.loadSystem(System::load, System::loadLibrary, Nuklear.class, "org.lwjgl.nuklear", Platform.mapLibraryNameBundled("lwjgl_nuklear")); }

    protected Nuklear() {
        throw new UnsupportedOperationException();
    }

    // --- [ nk_init_fixed ] ---

    /**
     * Unsafe version of: {@link #nk_init_fixed init_fixed}
     *
     * @param size must contain the total size of {@code memory}
     */
    public static native int nnk_init_fixed(long ctx, long memory, long size, long font);

    /**
     * Initializes context from single fixed size memory block.
     * 
     * <p>Should be used if you want complete control over nuklears memory management. Especially recommended for system with little memory or systems with
     * virtual memory. For the later case you can just allocate for example 16MB of virtual memory and only the required amount of memory will actually be
     * committed.</p>
     * 
     * <p>IMPORTANT: make sure the passed memory block is aligned correctly for {@link NkDrawCommand}.</p>
     *
     * @param ctx    the nuklear context
     * @param memory must point to a previously allocated memory block
     * @param font   must point to a previously initialized font handle
     */
    @NativeType("int")
    public static boolean nk_init_fixed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("void *") ByteBuffer memory, @Nullable @NativeType("struct nk_user_font const *") NkUserFont font) {
        return nnk_init_fixed(ctx.address(), memAddress(memory), memory.remaining(), memAddressSafe(font)) != 0;
    }

    // --- [ nk_init ] ---

    /** Unsafe version of: {@link #nk_init init} */
    public static native int nnk_init(long ctx, long allocator, long font);

    /**
     * Initializes context with memory allocator callbacks for alloc and free.
     * 
     * <p>Used internally for {@code nk_init_default} and provides a kitchen sink allocation interface to nuklear. Can be useful for cases like monitoring
     * memory consumption.</p>
     *
     * @param ctx       the nuklear context
     * @param allocator must point to a previously allocated memory allocator
     * @param font      must point to a previously initialized font handle
     */
    @NativeType("int")
    public static boolean nk_init(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_allocator *") NkAllocator allocator, @Nullable @NativeType("struct nk_user_font const *") NkUserFont font) {
        return nnk_init(ctx.address(), allocator.address(), memAddressSafe(font)) != 0;
    }

    // --- [ nk_init_custom ] ---

    /** Unsafe version of: {@link #nk_init_custom init_custom} */
    public static native int nnk_init_custom(long ctx, long cmds, long pool, long font);

    /**
     * Initializes context from two buffers. One for draw commands the other for window/panel/table allocations.
     *
     * @param ctx  the nuklear context
     * @param cmds must point to a previously initialized memory buffer either fixed or dynamic to store draw commands into
     * @param pool must point to a previously initialized memory buffer either fixed or dynamic to store windows, panels and tables
     * @param font must point to a previously initialized font handle
     */
    @NativeType("int")
    public static boolean nk_init_custom(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_buffer *") NkBuffer cmds, @NativeType("struct nk_buffer *") NkBuffer pool, @Nullable @NativeType("struct nk_user_font const *") NkUserFont font) {
        return nnk_init_custom(ctx.address(), cmds.address(), pool.address(), memAddressSafe(font)) != 0;
    }

    // --- [ nk_clear ] ---

    /** Unsafe version of: {@link #nk_clear clear} */
    public static native void nnk_clear(long ctx);

    /**
     * Called at the end of the frame to reset and prepare the context for the next frame.
     * 
     * <p>Resets the context state at the end of the frame. This includes mostly garbage collector tasks like removing windows or table not called and
     * therefore used anymore.</p>
     *
     * @param ctx the nuklear context
     */
    public static void nk_clear(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_clear(ctx.address());
    }

    // --- [ nk_free ] ---

    /** Unsafe version of: {@link #nk_free free} */
    public static native void nnk_free(long ctx);

    /**
     * Shutdown and free all memory allocated inside the context.
     * 
     * <p>Frees all memory allocated by nuklear. Not needed if context was initialized with {@link #nk_init_fixed init_fixed}.</p>
     *
     * @param ctx the nuklear context
     */
    public static void nk_free(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_free(ctx.address());
    }

    // --- [ nk_set_user_data ] ---

    /** Unsafe version of: {@link #nk_set_user_data set_user_data} */
    public static native void nnk_set_user_data(long ctx, long handle);

    /**
     * Utility function to pass user data to draw command.
     *
     * @param ctx    the nuklear context
     * @param handle handle with either pointer or index to be passed into every draw commands
     */
    public static void nk_set_user_data(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_handle") NkHandle handle) {
        nnk_set_user_data(ctx.address(), handle.address());
    }

    // --- [ nk_begin ] ---

    /** Unsafe version of: {@link #nk_begin begin} */
    public static native int nnk_begin(long ctx, long title, long bounds, int flags);

    /**
     * Starts a new window; needs to be called every frame for every window (unless hidden) or otherwise the window gets removed.
     *
     * @param ctx   the nuklear context
     * @param flags one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_begin(ctx.address(), memAddress(title), bounds.address(), flags) != 0;
    }

    /**
     * Starts a new window; needs to be called every frame for every window (unless hidden) or otherwise the window gets removed.
     *
     * @param ctx   the nuklear context
     * @param flags one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_begin(ctx.address(), titleEncoded, bounds.address(), flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_begin_titled ] ---

    /** Unsafe version of: {@link #nk_begin_titled begin_titled} */
    public static native int nnk_begin_titled(long ctx, long name, long title, long bounds, int flags);

    /**
     * Extended window start with separated title and identifier to allow multiple windows with same title but not name.
     *
     * @param ctx   the nuklear context
     * @param flags one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(title);
        }
        return nnk_begin_titled(ctx.address(), memAddress(name), memAddress(title), bounds.address(), flags) != 0;
    }

    /**
     * Extended window start with separated title and identifier to allow multiple windows with same title but not name.
     *
     * @param ctx   the nuklear context
     * @param flags one or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_begin_titled(ctx.address(), nameEncoded, titleEncoded, bounds.address(), flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_end ] ---

    /** Unsafe version of: {@link #nk_end end} */
    public static native void nnk_end(long ctx);

    /**
     * Needs to be called at the end of the window building process to process scaling, scrollbars and general cleanup.
     *
     * @param ctx the nuklear context
     */
    public static void nk_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_end(ctx.address());
    }

    // --- [ nk_window_find ] ---

    /** Unsafe version of: {@link #nk_window_find window_find} */
    public static native long nnk_window_find(long ctx, long name);

    /**
     * Finds and returns a window from passed name.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_window *")
    public static NkWindow nk_window_find(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nnk_window_find(ctx.address(), memAddress(name));
        return NkWindow.createSafe(__result);
    }

    /**
     * Finds and returns a window from passed name.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_window *")
    public static NkWindow nk_window_find(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nnk_window_find(ctx.address(), nameEncoded);
            return NkWindow.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_get_bounds ] ---

    /** Unsafe version of: {@link #nk_window_get_bounds window_get_bounds} */
    public static native void nnk_window_get_bounds(long ctx, long __result);

    /**
     * Returns a rectangle with screen position and size of the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_rect")
    public static NkRect nk_window_get_bounds(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_window_get_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_position ] ---

    /** Unsafe version of: {@link #nk_window_get_position window_get_position} */
    public static native void nnk_window_get_position(long ctx, long __result);

    /**
     * Returns the position of the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_position(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_position(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_size ] ---

    /** Unsafe version of: {@link #nk_window_get_size window_get_size} */
    public static native void nnk_window_get_size(long ctx, long __result);

    /**
     * Returns the size with width and height of the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_size(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_size(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_width ] ---

    /** Unsafe version of: {@link #nk_window_get_width window_get_width} */
    public static native float nnk_window_get_width(long ctx);

    /**
     * Returns the width of the currently processed window.
     *
     * @param ctx the nuklear context
     */
    public static float nk_window_get_width(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_get_width(ctx.address());
    }

    // --- [ nk_window_get_height ] ---

    /** Unsafe version of: {@link #nk_window_get_height window_get_height} */
    public static native float nnk_window_get_height(long ctx);

    /**
     * Returns the height of the currently processed window.
     *
     * @param ctx the nuklear context
     */
    public static float nk_window_get_height(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_get_height(ctx.address());
    }

    // --- [ nk_window_get_panel ] ---

    /** Unsafe version of: {@link #nk_window_get_panel window_get_panel} */
    public static native long nnk_window_get_panel(long ctx);

    /**
     * Returns the underlying panel which contains all processing state of the current window.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_panel *")
    public static NkPanel nk_window_get_panel(@NativeType("struct nk_context *") NkContext ctx) {
        long __result = nnk_window_get_panel(ctx.address());
        return NkPanel.createSafe(__result);
    }

    // --- [ nk_window_get_content_region ] ---

    /** Unsafe version of: {@link #nk_window_get_content_region window_get_content_region} */
    public static native void nnk_window_get_content_region(long ctx, long __result);

    /**
     * Returns the position and size of the currently visible and non-clipped space inside the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_rect")
    public static NkRect nk_window_get_content_region(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_window_get_content_region(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_content_region_min ] ---

    /** Unsafe version of: {@link #nk_window_get_content_region_min window_get_content_region_min} */
    public static native void nnk_window_get_content_region_min(long ctx, long __result);

    /**
     * Returns the upper rectangle position of the currently visible and non-clipped space inside the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_content_region_min(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_content_region_min(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_content_region_max ] ---

    /** Unsafe version of: {@link #nk_window_get_content_region_max window_get_content_region_max} */
    public static native void nnk_window_get_content_region_max(long ctx, long __result);

    /**
     * Returns the upper rectangle position of the currently visible and non-clipped space inside the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_content_region_max(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_content_region_max(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_content_region_size ] ---

    /** Unsafe version of: {@link #nk_window_get_content_region_size window_get_content_region_size} */
    public static native void nnk_window_get_content_region_size(long ctx, long __result);

    /**
     * Returns the size of the currently visible and non-clipped space inside the currently processed window.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_content_region_size(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_content_region_size(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_canvas ] ---

    /** Unsafe version of: {@link #nk_window_get_canvas window_get_canvas} */
    public static native long nnk_window_get_canvas(long ctx);

    /**
     * Returns the draw command buffer. Can be used to draw custom widgets.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_command_buffer *")
    public static NkCommandBuffer nk_window_get_canvas(@NativeType("struct nk_context *") NkContext ctx) {
        long __result = nnk_window_get_canvas(ctx.address());
        return NkCommandBuffer.createSafe(__result);
    }

    // --- [ nk_window_has_focus ] ---

    /** Unsafe version of: {@link #nk_window_has_focus window_has_focus} */
    public static native int nnk_window_has_focus(long ctx);

    /**
     * Returns if the currently processed window is currently active.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_has_focus(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_has_focus(ctx.address()) != 0;
    }

    // --- [ nk_window_is_collapsed ] ---

    /** Unsafe version of: {@link #nk_window_is_collapsed window_is_collapsed} */
    public static native int nnk_window_is_collapsed(long ctx, long name);

    /**
     * Returns if the window with given name is currently minimized/collapsed.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_collapsed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_collapsed(ctx.address(), memAddress(name)) != 0;
    }

    /**
     * Returns if the window with given name is currently minimized/collapsed.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_collapsed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_collapsed(ctx.address(), nameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_closed ] ---

    /** Unsafe version of: {@link #nk_window_is_closed window_is_closed} */
    public static native int nnk_window_is_closed(long ctx, long name);

    /**
     * Returns if the currently processed window was closed.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_closed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_closed(ctx.address(), memAddress(name)) != 0;
    }

    /**
     * Returns if the currently processed window was closed.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_closed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_closed(ctx.address(), nameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_hidden ] ---

    /** Unsafe version of: {@link #nk_window_is_hidden window_is_hidden} */
    public static native int nnk_window_is_hidden(long ctx, long name);

    /**
     * Returns if the currently processed window was hidden.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_hidden(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_hidden(ctx.address(), memAddress(name)) != 0;
    }

    /**
     * Returns if the currently processed window was hidden.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_hidden(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_hidden(ctx.address(), nameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_active ] ---

    /** Unsafe version of: {@link #nk_window_is_active window_is_active} */
    public static native int nnk_window_is_active(long ctx, long name);

    /**
     * Same as {@link #nk_window_has_focus window_has_focus} for some reason.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_active(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_active(ctx.address(), memAddress(name)) != 0;
    }

    /**
     * Same as {@link #nk_window_has_focus window_has_focus} for some reason.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_active(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_active(ctx.address(), nameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_hovered ] ---

    /** Unsafe version of: {@link #nk_window_is_hovered window_is_hovered} */
    public static native int nnk_window_is_hovered(long ctx);

    /**
     * Returns if the currently processed window is currently being hovered by mouse.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_hovered(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_window_is_hovered(ctx.address()) != 0;
    }

    // --- [ nk_window_is_any_hovered ] ---

    /** Unsafe version of: {@link #nk_window_is_any_hovered window_is_any_hovered} */
    public static native int nnk_window_is_any_hovered(long ctx);

    /**
     * Return if any window currently hovered.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_window_is_any_hovered(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_window_is_any_hovered(ctx.address()) != 0;
    }

    // --- [ nk_item_is_any_active ] ---

    /** Unsafe version of: {@link #nk_item_is_any_active item_is_any_active} */
    public static native int nnk_item_is_any_active(long ctx);

    /**
     * Returns if any window or widgets is currently hovered or active.
     *
     * @param ctx the nuklear context
     */
    @NativeType("int")
    public static boolean nk_item_is_any_active(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_item_is_any_active(ctx.address()) != 0;
    }

    // --- [ nk_window_set_bounds ] ---

    /** Unsafe version of: {@link #nk_window_set_bounds window_set_bounds} */
    public static native void nnk_window_set_bounds(long ctx, long name, long bounds);

    /**
     * Updates position and size of the specified window.
     *
     * @param ctx    the nuklear context
     * @param name   name of the window to modify both position and size
     * @param bounds points to a {@code nk_rect} struct with the new position and size of the specified window
     */
    public static void nk_window_set_bounds(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("struct nk_rect") NkRect bounds) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_bounds(ctx.address(), memAddress(name), bounds.address());
    }

    /**
     * Updates position and size of the specified window.
     *
     * @param ctx    the nuklear context
     * @param name   name of the window to modify both position and size
     * @param bounds points to a {@code nk_rect} struct with the new position and size of the specified window
     */
    public static void nk_window_set_bounds(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("struct nk_rect") NkRect bounds) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_set_bounds(ctx.address(), nameEncoded, bounds.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_set_position ] ---

    /** Unsafe version of: {@link #nk_window_set_position window_set_position} */
    public static native void nnk_window_set_position(long ctx, long name, long position);

    /**
     * Updates position of the currently process window.
     *
     * @param ctx      the nuklear context
     * @param name     name of the window to modify position of
     * @param position points to a {@code nk_vec2} struct with the new position of currently active window
     */
    public static void nk_window_set_position(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("struct nk_vec2") NkVec2 position) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_position(ctx.address(), memAddress(name), position.address());
    }

    /**
     * Updates position of the currently process window.
     *
     * @param ctx      the nuklear context
     * @param name     name of the window to modify position of
     * @param position points to a {@code nk_vec2} struct with the new position of currently active window
     */
    public static void nk_window_set_position(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("struct nk_vec2") NkVec2 position) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_set_position(ctx.address(), nameEncoded, position.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_set_size ] ---

    /** Unsafe version of: {@link #nk_window_set_size window_set_size} */
    public static native void nnk_window_set_size(long ctx, long name, long size);

    /**
     * Updates the size of the specified window.
     *
     * @param ctx  the nuklear context
     * @param name name of the window to modify size of
     * @param size points to a {@code nk_vec2} struct with the new size of currently active window
     */
    public static void nk_window_set_size(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_size(ctx.address(), memAddress(name), size.address());
    }

    /**
     * Updates the size of the specified window.
     *
     * @param ctx  the nuklear context
     * @param name name of the window to modify size of
     * @param size points to a {@code nk_vec2} struct with the new size of currently active window
     */
    public static void nk_window_set_size(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_set_size(ctx.address(), nameEncoded, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_set_focus ] ---

    /** Unsafe version of: {@link #nk_window_set_focus window_set_focus} */
    public static native void nnk_window_set_focus(long ctx, long name);

    /**
     * Sets the specified window as active window.
     *
     * @param ctx  the nuklear context
     * @param name name of the window to be set active
     */
    public static void nk_window_set_focus(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_focus(ctx.address(), memAddress(name));
    }

    /**
     * Sets the specified window as active window.
     *
     * @param ctx  the nuklear context
     * @param name name of the window to be set active
     */
    public static void nk_window_set_focus(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_set_focus(ctx.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_close ] ---

    /** Unsafe version of: {@link #nk_window_close window_close} */
    public static native void nnk_window_close(long ctx, long name);

    /**
     * Closes the window with given window name which deletes the window at the end of the frame.
     *
     * @param ctx the nuklear context
     */
    public static void nk_window_close(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_close(ctx.address(), memAddress(name));
    }

    /**
     * Closes the window with given window name which deletes the window at the end of the frame.
     *
     * @param ctx the nuklear context
     */
    public static void nk_window_close(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_close(ctx.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_collapse ] ---

    /** Unsafe version of: {@link #nk_window_collapse window_collapse} */
    public static native void nnk_window_collapse(long ctx, long name, int c);

    /**
     * Collapses the window with given window name.
     *
     * @param ctx the nuklear context
     * @param c   one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     */
    public static void nk_window_collapse(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_collapse_states") int c) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_collapse(ctx.address(), memAddress(name), c);
    }

    /**
     * Collapses the window with given window name.
     *
     * @param ctx the nuklear context
     * @param c   one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     */
    public static void nk_window_collapse(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("enum nk_collapse_states") int c) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_collapse(ctx.address(), nameEncoded, c);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_collapse_if ] ---

    /** Unsafe version of: {@link #nk_window_collapse_if window_collapse_if} */
    public static native void nnk_window_collapse_if(long ctx, long name, int c, int cond);

    /**
     * Collapses the window with given window name if the given condition was met.
     *
     * @param ctx the nuklear context
     * @param c   one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     */
    public static void nk_window_collapse_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_collapse_states") int c, @NativeType("int") boolean cond) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_collapse_if(ctx.address(), memAddress(name), c, cond ? 1 : 0);
    }

    /**
     * Collapses the window with given window name if the given condition was met.
     *
     * @param ctx the nuklear context
     * @param c   one of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     */
    public static void nk_window_collapse_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("enum nk_collapse_states") int c, @NativeType("int") boolean cond) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_collapse_if(ctx.address(), nameEncoded, c, cond ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_show ] ---

    /** Unsafe version of: {@link #nk_window_show window_show} */
    public static native void nnk_window_show(long ctx, long name, int s);

    /**
     * Hides a visible or reshows a hidden window.
     *
     * @param ctx the nuklear context
     * @param s   one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
     */
    public static void nk_window_show(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_show_states") int s) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_show(ctx.address(), memAddress(name), s);
    }

    /**
     * Hides a visible or reshows a hidden window.
     *
     * @param ctx the nuklear context
     * @param s   one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
     */
    public static void nk_window_show(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("enum nk_show_states") int s) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_show(ctx.address(), nameEncoded, s);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_show_if ] ---

    /** Unsafe version of: {@link #nk_window_show_if window_show_if} */
    public static native void nnk_window_show_if(long ctx, long name, int s, int cond);

    /**
     * Hides/shows a window depending on condition.
     *
     * @param ctx the nuklear context
     * @param s   one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
     */
    public static void nk_window_show_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_show_states") int s, @NativeType("int") boolean cond) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_show_if(ctx.address(), memAddress(name), s, cond ? 1 : 0);
    }

    /**
     * Hides/shows a window depending on condition.
     *
     * @param ctx the nuklear context
     * @param s   one of:<br><table><tr><td>{@link #NK_HIDDEN HIDDEN}</td><td>{@link #NK_SHOWN SHOWN}</td></tr></table>
     */
    public static void nk_window_show_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("enum nk_show_states") int s, @NativeType("int") boolean cond) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_show_if(ctx.address(), nameEncoded, s, cond ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_layout_set_min_row_height ] ---

    /** Unsafe version of: {@link #nk_layout_set_min_row_height layout_set_min_row_height} */
    public static native void nnk_layout_set_min_row_height(long ctx, float height);

    /**
     * Sets the currently used minimum row height.
     * 
     * <p>IMPORTANT: The passed height needs to include both your preferred row height as well as padding. No internal padding is added.</p>
     *
     * @param ctx    the nuklear context
     * @param height new minimum row height to be used for auto generating the row height
     */
    public static void nk_layout_set_min_row_height(@NativeType("struct nk_context *") NkContext ctx, float height) {
        nnk_layout_set_min_row_height(ctx.address(), height);
    }

    // --- [ nk_layout_reset_min_row_height ] ---

    /** Unsafe version of: {@link #nk_layout_reset_min_row_height layout_reset_min_row_height} */
    public static native void nnk_layout_reset_min_row_height(long ctx);

    /**
     * Resets the currently used minimum row height back to font height + text padding + additional padding
     * ({@code style_window.min_row_height_padding}).
     *
     * @param ctx the nuklear context
     */
    public static void nk_layout_reset_min_row_height(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_reset_min_row_height(ctx.address());
    }

    // --- [ nk_layout_widget_bounds ] ---

    /** Unsafe version of: {@link #nk_layout_widget_bounds layout_widget_bounds} */
    public static native void nnk_layout_widget_bounds(long ctx, long __result);

    /**
     * Returns the width of the next row allocate by one of the layouting functions.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_widget_bounds(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_layout_widget_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_layout_ratio_from_pixel ] ---

    /** Unsafe version of: {@link #nk_layout_ratio_from_pixel layout_ratio_from_pixel} */
    public static native float nnk_layout_ratio_from_pixel(long ctx, float pixel_width);

    /**
     * Utility function to calculate window ratio from pixel size.
     *
     * @param ctx         the nuklear context
     * @param pixel_width pixel width to convert to window ratio
     */
    public static float nk_layout_ratio_from_pixel(@NativeType("struct nk_context *") NkContext ctx, float pixel_width) {
        return nnk_layout_ratio_from_pixel(ctx.address(), pixel_width);
    }

    // --- [ nk_layout_row_dynamic ] ---

    /** Unsafe version of: {@link #nk_layout_row_dynamic layout_row_dynamic} */
    public static native void nnk_layout_row_dynamic(long ctx, float height, int cols);

    /**
     * Sets current row layout to share horizontal space between {@code cols} number of widgets evenly. Once called all subsequent widget calls greater
     * than {@code cols} will allocate a new row with same layout.
     *
     * @param ctx    the nuklear context
     * @param height holds height of each widget in row or zero for auto layouting
     * @param cols   number of widgets inside row
     */
    public static void nk_layout_row_dynamic(@NativeType("struct nk_context *") NkContext ctx, float height, @NativeType("nk_int") int cols) {
        nnk_layout_row_dynamic(ctx.address(), height, cols);
    }

    // --- [ nk_layout_row_static ] ---

    /** Unsafe version of: {@link #nk_layout_row_static layout_row_static} */
    public static native void nnk_layout_row_static(long ctx, float height, int item_width, int cols);

    /**
     * Sets current row layout to fill {@code cols} number of widgets in row with same {@code item_width} horizontal size. Once called all subsequent
     * widget calls greater than {@code cols} will allocate a new row with same layout.
     *
     * @param ctx        the nuklear context
     * @param height     holds row height to allocate from panel for widget height
     * @param item_width holds width of each widget in row
     * @param cols       number of widgets inside row
     */
    public static void nk_layout_row_static(@NativeType("struct nk_context *") NkContext ctx, float height, @NativeType("nk_int") int item_width, @NativeType("nk_int") int cols) {
        nnk_layout_row_static(ctx.address(), height, item_width, cols);
    }

    // --- [ nk_layout_row_begin ] ---

    /** Unsafe version of: {@link #nk_layout_row_begin layout_row_begin} */
    public static native void nnk_layout_row_begin(long ctx, int fmt, float row_height, int cols);

    /**
     * Starts a new dynamic or fixed row with given height and columns.
     *
     * @param ctx        the nuklear context
     * @param fmt        either {@link #NK_DYNAMIC DYNAMIC} for window ratio or {@link #NK_STATIC STATIC} for fixed size columns. One of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
     * @param row_height holds height of each widget in row or zero for auto layouting
     * @param cols       number of widgets inside row
     */
    public static void nk_layout_row_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float row_height, @NativeType("nk_int") int cols) {
        nnk_layout_row_begin(ctx.address(), fmt, row_height, cols);
    }

    // --- [ nk_layout_row_push ] ---

    /** Unsafe version of: {@link #nk_layout_row_push layout_row_push} */
    public static native void nnk_layout_row_push(long ctx, float value);

    /**
     * Specifies either window ratio or width of a single column.
     *
     * @param ctx   the nuklear context
     * @param value either a window ratio or fixed width depending on {@code fmt} in previous {@link #nk_layout_row_begin layout_row_begin} call
     */
    public static void nk_layout_row_push(@NativeType("struct nk_context *") NkContext ctx, float value) {
        nnk_layout_row_push(ctx.address(), value);
    }

    // --- [ nk_layout_row_end ] ---

    /** Unsafe version of: {@link #nk_layout_row_end layout_row_end} */
    public static native void nnk_layout_row_end(long ctx);

    /**
     * Finishes previously started row
     *
     * @param ctx the nuklear context
     */
    public static void nk_layout_row_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_row_end(ctx.address());
    }

    // --- [ nk_layout_row ] ---

    /**
     * Unsafe version of: {@link #nk_layout_row layout_row}
     *
     * @param cols number of widgets inside row
     */
    public static native void nnk_layout_row(long ctx, int fmt, float height, int cols, long ratio);

    /**
     * Specifies row columns in array as either window ratio or size.
     *
     * @param ctx    the nuklear context
     * @param fmt    either {@link #NK_DYNAMIC DYNAMIC} for window ratio or {@link #NK_STATIC STATIC} for fixed size columns. One of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
     * @param height holds height of each widget in row or zero for auto layouting
     */
    public static void nk_layout_row(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float height, @NativeType("float const *") FloatBuffer ratio) {
        nnk_layout_row(ctx.address(), fmt, height, ratio.remaining(), memAddress(ratio));
    }

    // --- [ nk_layout_row_template_begin ] ---

    /** Unsafe version of: {@link #nk_layout_row_template_begin layout_row_template_begin} */
    public static native void nnk_layout_row_template_begin(long ctx, float height);

    /**
     * Begins the row template declaration.
     *
     * @param ctx    the nuklear context
     * @param height holds height of each widget in row or zero for auto layouting
     */
    public static void nk_layout_row_template_begin(@NativeType("struct nk_context *") NkContext ctx, float height) {
        nnk_layout_row_template_begin(ctx.address(), height);
    }

    // --- [ nk_layout_row_template_push_dynamic ] ---

    /** Unsafe version of: {@link #nk_layout_row_template_push_dynamic layout_row_template_push_dynamic} */
    public static native void nnk_layout_row_template_push_dynamic(long ctx);

    /**
     * Adds a dynamic column that dynamically grows and can go to zero if not enough space.
     *
     * @param ctx the nuklear context
     */
    public static void nk_layout_row_template_push_dynamic(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_row_template_push_dynamic(ctx.address());
    }

    // --- [ nk_layout_row_template_push_variable ] ---

    /** Unsafe version of: {@link #nk_layout_row_template_push_variable layout_row_template_push_variable} */
    public static native void nnk_layout_row_template_push_variable(long ctx, float min_width);

    /**
     * Adds a variable column that dynamically grows but does not shrink below specified pixel width.
     *
     * @param ctx       the nuklear context
     * @param min_width holds the minimum pixel width the next column must be
     */
    public static void nk_layout_row_template_push_variable(@NativeType("struct nk_context *") NkContext ctx, float min_width) {
        nnk_layout_row_template_push_variable(ctx.address(), min_width);
    }

    // --- [ nk_layout_row_template_push_static ] ---

    /** Unsafe version of: {@link #nk_layout_row_template_push_static layout_row_template_push_static} */
    public static native void nnk_layout_row_template_push_static(long ctx, float width);

    /**
     * Adds a static column that does not grow and will always have the same size.
     *
     * @param ctx   the nuklear context
     * @param width holds the absolute pixel width value the next column must be
     */
    public static void nk_layout_row_template_push_static(@NativeType("struct nk_context *") NkContext ctx, float width) {
        nnk_layout_row_template_push_static(ctx.address(), width);
    }

    // --- [ nk_layout_row_template_end ] ---

    /** Unsafe version of: {@link #nk_layout_row_template_end layout_row_template_end} */
    public static native void nnk_layout_row_template_end(long ctx);

    /**
     * Marks the end of the row template.
     *
     * @param ctx the nuklear context
     */
    public static void nk_layout_row_template_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_row_template_end(ctx.address());
    }

    // --- [ nk_layout_space_begin ] ---

    /** Unsafe version of: {@link #nk_layout_space_begin layout_space_begin} */
    public static native void nnk_layout_space_begin(long ctx, int fmt, float height, int widget_count);

    /**
     * Begins a new layouting space that allows to specify each widgets position and size.
     *
     * @param ctx          the nuklear context
     * @param fmt          either {@link #NK_DYNAMIC DYNAMIC} for window ratio or {@link #NK_STATIC STATIC} for fixed size columns. One of:<br><table><tr><td>{@link #NK_DYNAMIC DYNAMIC}</td><td>{@link #NK_STATIC STATIC}</td></tr></table>
     * @param height       holds height of each widget in row or zero for auto layouting
     * @param widget_count number of widgets inside row
     */
    public static void nk_layout_space_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float height, @NativeType("nk_int") int widget_count) {
        nnk_layout_space_begin(ctx.address(), fmt, height, widget_count);
    }

    // --- [ nk_layout_space_push ] ---

    /** Unsafe version of: {@link #nk_layout_space_push layout_space_push} */
    public static native void nnk_layout_space_push(long ctx, long rect);

    /**
     * Pushes position and size of the next widget in own coordiante space either as pixel or ratio.
     *
     * @param ctx  the nuklear context
     * @param rect position and size in layout space local coordinates
     */
    public static void nk_layout_space_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect rect) {
        nnk_layout_space_push(ctx.address(), rect.address());
    }

    // --- [ nk_layout_space_end ] ---

    /** Unsafe version of: {@link #nk_layout_space_end layout_space_end} */
    public static native void nnk_layout_space_end(long ctx);

    /**
     * Marks the end of the layout space.
     *
     * @param ctx the nuklear context
     */
    public static void nk_layout_space_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_space_end(ctx.address());
    }

    // --- [ nk_layout_space_bounds ] ---

    /** Unsafe version of: {@link #nk_layout_space_bounds layout_space_bounds} */
    public static native void nnk_layout_space_bounds(long ctx, long __result);

    /**
     * Returns total space allocated for {@code nk_layout_space}.
     *
     * @param ctx the nuklear context
     */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_space_bounds(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_layout_space_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_layout_space_to_screen ] ---

    /** Unsafe version of: {@link #nk_layout_space_to_screen layout_space_to_screen} */
    public static native void nnk_layout_space_to_screen(long ctx, long ret);

    /**
     * Converts vector from {@code nk_layout_space} coordinate space into screen space.
     *
     * @param ctx the nuklear context
     * @param ret position to convert from layout space into screen coordinate space
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_layout_space_to_screen(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 ret) {
        nnk_layout_space_to_screen(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_layout_space_to_local ] ---

    /** Unsafe version of: {@link #nk_layout_space_to_local layout_space_to_local} */
    public static native void nnk_layout_space_to_local(long ctx, long ret);

    /**
     * Converts vector from layout space into screen space.
     *
     * @param ctx the nuklear context
     * @param ret position to convert from screen space into layout coordinate space
     */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_layout_space_to_local(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 ret) {
        nnk_layout_space_to_local(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_layout_space_rect_to_screen ] ---

    /** Unsafe version of: {@link #nk_layout_space_rect_to_screen layout_space_rect_to_screen} */
    public static native void nnk_layout_space_rect_to_screen(long ctx, long ret);

    /**
     * Converts rectangle from screen space into layout space.
     *
     * @param ctx the nuklear context
     * @param ret rectangle to convert from layout space into screen space
     */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_space_rect_to_screen(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect ret) {
        nnk_layout_space_rect_to_screen(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_layout_space_rect_to_local ] ---

    /** Unsafe version of: {@link #nk_layout_space_rect_to_local layout_space_rect_to_local} */
    public static native void nnk_layout_space_rect_to_local(long ctx, long ret);

    /**
     * Converts rectangle from layout space into screen space.
     *
     * @param ctx the nuklear context
     * @param ret rectangle to convert from screen space into layout space
     */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_space_rect_to_local(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect ret) {
        nnk_layout_space_rect_to_local(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_group_begin ] ---

    /** Unsafe version of: {@link #nk_group_begin group_begin} */
    public static native int nnk_group_begin(long ctx, long title, int flags);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_group_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_group_begin(ctx.address(), memAddress(title), flags) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_group_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_begin(ctx.address(), titleEncoded, flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_begin_titled ] ---

    /** Unsafe version of: {@link #nk_group_begin_titled group_begin_titled} */
    public static native int nnk_group_begin_titled(long ctx, long name, long title, int flags);

    /**
     * @param ctx   the nuklear context
     * @param name  must be an unique identifier for this group
     * @param title group header title
     * @param flags window flags defined in the nk_panel_flags section with a number of different group behaviors. One or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     *
     * @return {@code true} if visible and fillable with widgets or {@code false} otherwise
     */
    @NativeType("int")
    public static boolean nk_group_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(title);
        }
        return nnk_group_begin_titled(ctx.address(), memAddress(name), memAddress(title), flags) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param name  must be an unique identifier for this group
     * @param title group header title
     * @param flags window flags defined in the nk_panel_flags section with a number of different group behaviors. One or more of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     *
     * @return {@code true} if visible and fillable with widgets or {@code false} otherwise
     */
    @NativeType("int")
    public static boolean nk_group_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_begin_titled(ctx.address(), nameEncoded, titleEncoded, flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_scrolled_offset_begin ] ---

    /** Unsafe version of: {@link #nk_group_scrolled_offset_begin group_scrolled_offset_begin} */
    public static native int nnk_group_scrolled_offset_begin(long ctx, long x_offset, long y_offset, long title, int flags);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") IntBuffer x_offset, @NativeType("nk_uint *") IntBuffer y_offset, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
            checkNT1(title);
        }
        return nnk_group_scrolled_offset_begin(ctx.address(), memAddress(x_offset), memAddress(y_offset), memAddress(title), flags) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") IntBuffer x_offset, @NativeType("nk_uint *") IntBuffer y_offset, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_scrolled_offset_begin(ctx.address(), memAddress(x_offset), memAddress(y_offset), titleEncoded, flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_scrolled_begin ] ---

    /** Unsafe version of: {@link #nk_group_scrolled_begin group_scrolled_begin} */
    public static native int nnk_group_scrolled_begin(long ctx, long scroll, long title, int flags);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_group_scrolled_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_scroll *") NkScroll scroll, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_group_scrolled_begin(ctx.address(), scroll.address(), memAddress(title), flags) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_group_scrolled_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_scroll *") NkScroll scroll, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_scrolled_begin(ctx.address(), scroll.address(), titleEncoded, flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_scrolled_end ] ---

    /** Unsafe version of: {@link #nk_group_scrolled_end group_scrolled_end} */
    public static native void nnk_group_scrolled_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_group_scrolled_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_group_scrolled_end(ctx.address());
    }

    // --- [ nk_group_end ] ---

    /** Unsafe version of: {@link #nk_group_end group_end} */
    public static native void nnk_group_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_group_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_group_end(ctx.address());
    }

    // --- [ nk_list_view_begin ] ---

    /** Unsafe version of: {@link #nk_list_view_begin list_view_begin} */
    public static native int nnk_list_view_begin(long ctx, long view, long title, int flags, int row_height, int row_count);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_list_view_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_list_view *") NkListView view, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags, int row_height, int row_count) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_list_view_begin(ctx.address(), view.address(), memAddress(title), flags, row_height, row_count) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_list_view_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_list_view *") NkListView view, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags, int row_height, int row_count) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_list_view_begin(ctx.address(), view.address(), titleEncoded, flags, row_height, row_count) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_list_view_end ] ---

    public static native void nnk_list_view_end(long view);

    public static void nk_list_view_end(@NativeType("struct nk_list_view *") NkListView view) {
        nnk_list_view_end(view.address());
    }

    // --- [ nk_tree_push_hashed ] ---

    /**
     * Unsafe version of: {@link #nk_tree_push_hashed tree_push_hashed}
     *
     * @param len size of passed memory block or string in {@code hash}
     */
    public static native int nnk_tree_push_hashed(long ctx, int type, long title, int initial_state, long hash, int len, int seed);

    /**
     * Start a collapsable UI section with internal state management with full control over internal unique ID used to store state.
     *
     * @param ctx           the nuklear context
     * @param type          value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title         label printed in the tree header
     * @param initial_state initial tree state value out of {@code nk_collapse_states}. One of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     * @param hash          memory block or string to generate the ID from
     * @param seed          seeding value if this function is called in a loop or default to 0
     */
    @NativeType("int")
    public static boolean nk_tree_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_tree_push_hashed(ctx.address(), type, memAddress(title), initial_state, memAddress(hash), hash.remaining(), seed) != 0;
    }

    /**
     * Start a collapsable UI section with internal state management with full control over internal unique ID used to store state.
     *
     * @param ctx           the nuklear context
     * @param type          value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title         label printed in the tree header
     * @param initial_state initial tree state value out of {@code nk_collapse_states}. One of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     * @param hash          memory block or string to generate the ID from
     * @param seed          seeding value if this function is called in a loop or default to 0
     */
    @NativeType("int")
    public static boolean nk_tree_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_push_hashed(ctx.address(), type, titleEncoded, initial_state, memAddress(hash), hash.remaining(), seed) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_image_push_hashed ] ---

    /**
     * Unsafe version of: {@link #nk_tree_image_push_hashed tree_image_push_hashed}
     *
     * @param len size of passed memory block or string in {@code hash}
     */
    public static native int nnk_tree_image_push_hashed(long ctx, int type, long img, long title, int initial_state, long hash, int len, int seed);

    /**
     * Start a collapsable UI section with internal state management with full control over internal unique ID used to store state.
     *
     * @param ctx           the nuklear context
     * @param type          value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param img           image to display inside the header on the left of the label
     * @param title         label printed in the tree header
     * @param initial_state initial tree state value out of {@code nk_collapse_states}. One of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     * @param hash          memory block or string to generate the ID from
     * @param seed          seeding value if this function is called in a loop or default to 0
     */
    @NativeType("int")
    public static boolean nk_tree_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_tree_image_push_hashed(ctx.address(), type, img.address(), memAddress(title), initial_state, memAddress(hash), hash.remaining(), seed) != 0;
    }

    /**
     * Start a collapsable UI section with internal state management with full control over internal unique ID used to store state.
     *
     * @param ctx           the nuklear context
     * @param type          value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param img           image to display inside the header on the left of the label
     * @param title         label printed in the tree header
     * @param initial_state initial tree state value out of {@code nk_collapse_states}. One of:<br><table><tr><td>{@link #NK_MINIMIZED MINIMIZED}</td><td>{@link #NK_MAXIMIZED MAXIMIZED}</td></tr></table>
     * @param hash          memory block or string to generate the ID from
     * @param seed          seeding value if this function is called in a loop or default to 0
     */
    @NativeType("int")
    public static boolean nk_tree_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_image_push_hashed(ctx.address(), type, img.address(), titleEncoded, initial_state, memAddress(hash), hash.remaining(), seed) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_pop ] ---

    /** Unsafe version of: {@link #nk_tree_pop tree_pop} */
    public static native void nnk_tree_pop(long ctx);

    /**
     * Ends a collapsable UI section
     *
     * @param ctx the nuklear context
     */
    public static void nk_tree_pop(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tree_pop(ctx.address());
    }

    // --- [ nk_tree_state_push ] ---

    /** Unsafe version of: {@link #nk_tree_state_push tree_state_push} */
    public static native int nnk_tree_state_push(long ctx, int type, long title, long state);

    /**
     * Start a collapsable UI section with external state management.
     *
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title label printed in the tree header
     * @param state persistent state to update
     */
    @NativeType("int")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_push(ctx.address(), type, memAddress(title), memAddress(state)) != 0;
    }

    /**
     * Start a collapsable UI section with external state management.
     *
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title label printed in the tree header
     * @param state persistent state to update
     */
    @NativeType("int")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_push(ctx.address(), type, titleEncoded, memAddress(state)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_state_image_push ] ---

    /** Unsafe version of: {@link #nk_tree_state_image_push tree_state_image_push} */
    public static native int nnk_tree_state_image_push(long ctx, int type, long image, long title, long state);

    /**
     * Start a collapsable UI section with image and label header and external state management.
     *
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param image image to display inside the header on the left of the label
     * @param title label printed in the tree header
     */
    @NativeType("int")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_image_push(ctx.address(), type, image.address(), memAddress(title), memAddress(state)) != 0;
    }

    /**
     * Start a collapsable UI section with image and label header and external state management.
     *
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param image image to display inside the header on the left of the label
     * @param title label printed in the tree header
     */
    @NativeType("int")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_image_push(ctx.address(), type, image.address(), titleEncoded, memAddress(state)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_state_pop ] ---

    /** Unsafe version of: {@link #nk_tree_state_pop tree_state_pop} */
    public static native void nnk_tree_state_pop(long ctx);

    /**
     * Ends a collapsable UI section.
     *
     * @param ctx the nuklear context
     */
    public static void nk_tree_state_pop(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tree_state_pop(ctx.address());
    }

    // --- [ nk_tree_element_push_hashed ] ---

    /** Unsafe version of: {@link #nk_tree_element_push_hashed tree_element_push_hashed} */
    public static native int nnk_tree_element_push_hashed(long ctx, int type, long title, int initial_state, long selected, long hash, int len, int seed);

    /**
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title label printed in the tree header
     */
    @NativeType("int")
    public static boolean nk_tree_element_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") IntBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            checkNT1(title);
            check(selected, 1);
        }
        return nnk_tree_element_push_hashed(ctx.address(), type, memAddress(title), initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title label printed in the tree header
     */
    @NativeType("int")
    public static boolean nk_tree_element_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") IntBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_element_push_hashed(ctx.address(), type, titleEncoded, initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_element_image_push_hashed ] ---

    /** Unsafe version of: {@link #nk_tree_element_image_push_hashed tree_element_image_push_hashed} */
    public static native int nnk_tree_element_image_push_hashed(long ctx, int type, long img, long title, int initial_state, long selected, long hash, int len, int seed);

    /**
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title label printed in the tree header
     */
    @NativeType("int")
    public static boolean nk_tree_element_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") IntBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            checkNT1(title);
            check(selected, 1);
        }
        return nnk_tree_element_image_push_hashed(ctx.address(), type, img.address(), memAddress(title), initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param type  value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node. One of:<br><table><tr><td>{@link #NK_TREE_NODE TREE_NODE}</td><td>{@link #NK_TREE_TAB TREE_TAB}</td></tr></table>
     * @param title label printed in the tree header
     */
    @NativeType("int")
    public static boolean nk_tree_element_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") IntBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_element_image_push_hashed(ctx.address(), type, img.address(), titleEncoded, initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_element_pop ] ---

    /** Unsafe version of: {@link #nk_tree_element_pop tree_element_pop} */
    public static native void nnk_tree_element_pop(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_tree_element_pop(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tree_element_pop(ctx.address());
    }

    // --- [ nk_text ] ---

    /** Unsafe version of: {@link #nk_text text} */
    public static native void nnk_text(long ctx, long str, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int alignment) {
        nnk_text(ctx.address(), memAddress(str), str.remaining(), alignment);
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            nnk_text(ctx.address(), strEncoded, strEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_text_colored ] ---

    /** Unsafe version of: {@link #nk_text_colored text_colored} */
    public static native void nnk_text_colored(long ctx, long str, int len, int alignment, long color);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_text_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int alignment, @NativeType("struct nk_color") NkColor color) {
        nnk_text_colored(ctx.address(), memAddress(str), str.remaining(), alignment, color.address());
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_text_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int alignment, @NativeType("struct nk_color") NkColor color) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            nnk_text_colored(ctx.address(), strEncoded, strEncodedLength, alignment, color.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_text_wrap ] ---

    /** Unsafe version of: {@link #nk_text_wrap text_wrap} */
    public static native void nnk_text_wrap(long ctx, long str, int len);

    /** @param ctx the nuklear context */
    public static void nk_text_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str) {
        nnk_text_wrap(ctx.address(), memAddress(str), str.remaining());
    }

    /** @param ctx the nuklear context */
    public static void nk_text_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            nnk_text_wrap(ctx.address(), strEncoded, strEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_text_wrap_colored ] ---

    /** Unsafe version of: {@link #nk_text_wrap_colored text_wrap_colored} */
    public static native void nnk_text_wrap_colored(long ctx, long str, int len, long color);

    /** @param ctx the nuklear context */
    public static void nk_text_wrap_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("struct nk_color") NkColor color) {
        nnk_text_wrap_colored(ctx.address(), memAddress(str), str.remaining(), color.address());
    }

    /** @param ctx the nuklear context */
    public static void nk_text_wrap_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("struct nk_color") NkColor color) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            nnk_text_wrap_colored(ctx.address(), strEncoded, strEncodedLength, color.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_label ] ---

    /** Unsafe version of: {@link #nk_label label} */
    public static native void nnk_label(long ctx, long str, int align);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label(ctx.address(), memAddress(str), align);
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            nnk_label(ctx.address(), strEncoded, align);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_label_colored ] ---

    /** Unsafe version of: {@link #nk_label_colored label_colored} */
    public static native void nnk_label_colored(long ctx, long str, int align, long color);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_label_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label_colored(ctx.address(), memAddress(str), align, color.address());
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    public static void nk_label_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("struct nk_color") NkColor color) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            nnk_label_colored(ctx.address(), strEncoded, align, color.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_label_wrap ] ---

    /** Unsafe version of: {@link #nk_label_wrap label_wrap} */
    public static native void nnk_label_wrap(long ctx, long str);

    /** @param ctx the nuklear context */
    public static void nk_label_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label_wrap(ctx.address(), memAddress(str));
    }

    /** @param ctx the nuklear context */
    public static void nk_label_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            nnk_label_wrap(ctx.address(), strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_label_colored_wrap ] ---

    /** Unsafe version of: {@link #nk_label_colored_wrap label_colored_wrap} */
    public static native void nnk_label_colored_wrap(long ctx, long str, long color);

    /** @param ctx the nuklear context */
    public static void nk_label_colored_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label_colored_wrap(ctx.address(), memAddress(str), color.address());
    }

    /** @param ctx the nuklear context */
    public static void nk_label_colored_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("struct nk_color") NkColor color) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            nnk_label_colored_wrap(ctx.address(), strEncoded, color.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_image ] ---

    /** Unsafe version of: {@link #nk_image image} */
    public static native void nnk_image(long ctx, long img);

    /** @param ctx the nuklear context */
    public static void nk_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img) {
        nnk_image(ctx.address(), img.address());
    }

    // --- [ nk_image_color ] ---

    /** Unsafe version of: {@link #nk_image_color image_color} */
    public static native void nnk_image_color(long ctx, long img, long color);

    /** @param ctx the nuklear context */
    public static void nk_image_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_color") NkColor color) {
        nnk_image_color(ctx.address(), img.address(), color.address());
    }

    // --- [ nk_button_set_behavior ] ---

    /** Unsafe version of: {@link #nk_button_set_behavior button_set_behavior} */
    public static native void nnk_button_set_behavior(long ctx, int behavior);

    /**
     * @param ctx      the nuklear context
     * @param behavior one of:<br><table><tr><td>{@link #NK_BUTTON_DEFAULT BUTTON_DEFAULT}</td><td>{@link #NK_BUTTON_REPEATER BUTTON_REPEATER}</td></tr></table>
     */
    public static void nk_button_set_behavior(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_button_behavior") int behavior) {
        nnk_button_set_behavior(ctx.address(), behavior);
    }

    // --- [ nk_button_push_behavior ] ---

    /** Unsafe version of: {@link #nk_button_push_behavior button_push_behavior} */
    public static native int nnk_button_push_behavior(long ctx, int behavior);

    /**
     * @param ctx      the nuklear context
     * @param behavior one of:<br><table><tr><td>{@link #NK_BUTTON_DEFAULT BUTTON_DEFAULT}</td><td>{@link #NK_BUTTON_REPEATER BUTTON_REPEATER}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_push_behavior(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_button_behavior") int behavior) {
        return nnk_button_push_behavior(ctx.address(), behavior) != 0;
    }

    // --- [ nk_button_pop_behavior ] ---

    /** Unsafe version of: {@link #nk_button_pop_behavior button_pop_behavior} */
    public static native int nnk_button_pop_behavior(long ctx);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_pop_behavior(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_button_pop_behavior(ctx.address()) != 0;
    }

    // --- [ nk_button_text ] ---

    /** Unsafe version of: {@link #nk_button_text button_text} */
    public static native int nnk_button_text(long ctx, long title, int len);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title) {
        return nnk_button_text(ctx.address(), memAddress(title), title.remaining()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int titleEncodedLength = stack.nUTF8(title, false);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_text(ctx.address(), titleEncoded, titleEncodedLength) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_label ] ---

    /** Unsafe version of: {@link #nk_button_label button_label} */
    public static native int nnk_button_label(long ctx, long title);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_label(ctx.address(), memAddress(title)) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_label(ctx.address(), titleEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_color ] ---

    /** Unsafe version of: {@link #nk_button_color button_color} */
    public static native int nnk_button_color(long ctx, long color);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color") NkColor color) {
        return nnk_button_color(ctx.address(), color.address()) != 0;
    }

    // --- [ nk_button_symbol ] ---

    /** Unsafe version of: {@link #nk_button_symbol button_symbol} */
    public static native int nnk_button_symbol(long ctx, int symbol);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol) {
        return nnk_button_symbol(ctx.address(), symbol) != 0;
    }

    // --- [ nk_button_image ] ---

    /** Unsafe version of: {@link #nk_button_image button_image} */
    public static native int nnk_button_image(long ctx, long img);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img) {
        return nnk_button_image(ctx.address(), img.address()) != 0;
    }

    // --- [ nk_button_symbol_label ] ---

    /** Unsafe version of: {@link #nk_button_symbol_label button_symbol_label} */
    public static native int nnk_button_symbol_label(long ctx, int symbol, long text, int text_alignment);

    /**
     * @param ctx            the nuklear context
     * @param symbol         one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_button_symbol_label(ctx.address(), symbol, memAddress(text), text_alignment) != 0;
    }

    /**
     * @param ctx            the nuklear context
     * @param symbol         one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_symbol_label(ctx.address(), symbol, textEncoded, text_alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_symbol_text ] ---

    /** Unsafe version of: {@link #nk_button_symbol_text button_symbol_text} */
    public static native int nnk_button_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_button_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_label ] ---

    /** Unsafe version of: {@link #nk_button_image_label button_image_label} */
    public static native int nnk_button_image_label(long ctx, long img, long text, int text_alignment);

    /**
     * @param ctx            the nuklear context
     * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_button_image_label(ctx.address(), img.address(), memAddress(text), text_alignment) != 0;
    }

    /**
     * @param ctx            the nuklear context
     * @param text_alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_image_label(ctx.address(), img.address(), textEncoded, text_alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_text ] ---

    /** Unsafe version of: {@link #nk_button_image_text button_image_text} */
    public static native int nnk_button_image_text(long ctx, long img, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_button_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_button_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_text_styled ] ---

    /** Unsafe version of: {@link #nk_button_text_styled button_text_styled} */
    public static native int nnk_button_text_styled(long ctx, long style, long title, int len);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") ByteBuffer title, int len) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_text_styled(ctx.address(), style.address(), memAddress(title), len) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") CharSequence title, int len) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_text_styled(ctx.address(), style.address(), titleEncoded, len) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_label_styled ] ---

    /** Unsafe version of: {@link #nk_button_label_styled button_label_styled} */
    public static native int nnk_button_label_styled(long ctx, long style, long title);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_label_styled(ctx.address(), style.address(), memAddress(title)) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_label_styled(ctx.address(), style.address(), titleEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_symbol_styled ] ---

    /** Unsafe version of: {@link #nk_button_symbol_styled button_symbol_styled} */
    public static native int nnk_button_symbol_styled(long ctx, long style, int symbol);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_symbol_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol) {
        return nnk_button_symbol_styled(ctx.address(), style.address(), symbol) != 0;
    }

    // --- [ nk_button_image_styled ] ---

    /** Unsafe version of: {@link #nk_button_image_styled button_image_styled} */
    public static native int nnk_button_image_styled(long ctx, long style, long img);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_image_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img) {
        return nnk_button_image_styled(ctx.address(), style.address(), img.address()) != 0;
    }

    // --- [ nk_button_symbol_text_styled ] ---

    /** Unsafe version of: {@link #nk_button_symbol_text_styled button_symbol_text_styled} */
    public static native int nnk_button_symbol_text_styled(long ctx, long style, int symbol, long title, int len, int alignment);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_symbol_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer title, int len, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_symbol_text_styled(ctx.address(), style.address(), symbol, memAddress(title), len, alignment) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_symbol_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence title, int len, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_symbol_text_styled(ctx.address(), style.address(), symbol, titleEncoded, len, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_symbol_label_styled ] ---

    /** Unsafe version of: {@link #nk_button_symbol_label_styled button_symbol_label_styled} */
    public static native int nnk_button_symbol_label_styled(long ctx, long style, int symbol, long title, int text_alignment);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_symbol_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_symbol_label_styled(ctx.address(), style.address(), symbol, memAddress(title), text_alignment) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_symbol_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_symbol_label_styled(ctx.address(), style.address(), symbol, titleEncoded, text_alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_label_styled ] ---

    /** Unsafe version of: {@link #nk_button_image_label_styled button_image_label_styled} */
    public static native int nnk_button_image_label_styled(long ctx, long style, long img, long title, int text_alignment);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_image_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_image_label_styled(ctx.address(), style.address(), img.address(), memAddress(title), text_alignment) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_image_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_image_label_styled(ctx.address(), style.address(), img.address(), titleEncoded, text_alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_text_styled ] ---

    /** Unsafe version of: {@link #nk_button_image_text_styled button_image_text_styled} */
    public static native int nnk_button_image_text_styled(long ctx, long style, long img, long title, int len, int alignment);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_image_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, int len, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_image_text_styled(ctx.address(), style.address(), img.address(), memAddress(title), len, alignment) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_button_image_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, int len, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_image_text_styled(ctx.address(), style.address(), img.address(), titleEncoded, len, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_label ] ---

    /** Unsafe version of: {@link #nk_check_label check_label} */
    public static native int nnk_check_label(long ctx, long str, int active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_check_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int") boolean active) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_check_label(ctx.address(), memAddress(str), active ? 1 : 0) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_check_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_label(ctx.address(), strEncoded, active ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_text ] ---

    /** Unsafe version of: {@link #nk_check_text check_text} */
    public static native int nnk_check_text(long ctx, long str, int len, int active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_check_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int") boolean active) {
        return nnk_check_text(ctx.address(), memAddress(str), str.remaining(), active ? 1 : 0) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_check_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_text(ctx.address(), strEncoded, strEncodedLength, active ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_flags_label ] ---

    /** Unsafe version of: {@link #nk_check_flags_label check_flags_label} */
    public static native int nnk_check_flags_label(long ctx, long str, int flags, int value);

    /** @param ctx the nuklear context */
    @NativeType("unsigned int")
    public static int nk_check_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_check_flags_label(ctx.address(), memAddress(str), flags, value);
    }

    /** @param ctx the nuklear context */
    @NativeType("unsigned int")
    public static int nk_check_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_flags_label(ctx.address(), strEncoded, flags, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_flags_text ] ---

    /** Unsafe version of: {@link #nk_check_flags_text check_flags_text} */
    public static native int nnk_check_flags_text(long ctx, long str, int len, int flags, int value);

    /** @param ctx the nuklear context */
    @NativeType("unsigned int")
    public static int nk_check_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int value) {
        return nnk_check_flags_text(ctx.address(), memAddress(str), str.remaining(), flags, value);
    }

    /** @param ctx the nuklear context */
    @NativeType("unsigned int")
    public static int nk_check_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_flags_text(ctx.address(), strEncoded, strEncodedLength, flags, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_label ] ---

    /** Unsafe version of: {@link #nk_checkbox_label checkbox_label} */
    public static native int nnk_checkbox_label(long ctx, long str, long active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_checkbox_label(ctx.address(), memAddress(str), memAddress(active)) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_label(ctx.address(), strEncoded, memAddress(active)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_text ] ---

    /** Unsafe version of: {@link #nk_checkbox_text checkbox_text} */
    public static native int nnk_checkbox_text(long ctx, long str, int len, long active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_checkbox_text(ctx.address(), memAddress(str), str.remaining(), memAddress(active)) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_text(ctx.address(), strEncoded, strEncodedLength, memAddress(active)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_flags_label ] ---

    /** Unsafe version of: {@link #nk_checkbox_flags_label checkbox_flags_label} */
    public static native int nnk_checkbox_flags_label(long ctx, long str, long flags, int value);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            checkNT1(str);
            check(flags, 1);
        }
        return nnk_checkbox_flags_label(ctx.address(), memAddress(str), memAddress(flags), value) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_label(ctx.address(), strEncoded, memAddress(flags), value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_flags_text ] ---

    /** Unsafe version of: {@link #nk_checkbox_flags_text checkbox_flags_text} */
    public static native int nnk_checkbox_flags_text(long ctx, long str, int len, long flags, int value);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nnk_checkbox_flags_text(ctx.address(), memAddress(str), str.remaining(), memAddress(flags), value) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_text(ctx.address(), strEncoded, strEncodedLength, memAddress(flags), value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_radio_label ] ---

    /** Unsafe version of: {@link #nk_radio_label radio_label} */
    public static native int nnk_radio_label(long ctx, long str, long active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_radio_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_radio_label(ctx.address(), memAddress(str), memAddress(active)) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_radio_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_label(ctx.address(), strEncoded, memAddress(active)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_radio_text ] ---

    /** Unsafe version of: {@link #nk_radio_text radio_text} */
    public static native int nnk_radio_text(long ctx, long str, int len, long active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_radio_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_radio_text(ctx.address(), memAddress(str), str.remaining(), memAddress(active)) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_radio_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") IntBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_text(ctx.address(), strEncoded, strEncodedLength, memAddress(active)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_option_label ] ---

    /** Unsafe version of: {@link #nk_option_label option_label} */
    public static native int nnk_option_label(long ctx, long str, int active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_option_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int") boolean active) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_option_label(ctx.address(), memAddress(str), active ? 1 : 0) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_option_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_option_label(ctx.address(), strEncoded, active ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_option_text ] ---

    /** Unsafe version of: {@link #nk_option_text option_text} */
    public static native int nnk_option_text(long ctx, long str, int len, int active);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_option_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int") boolean active) {
        return nnk_option_text(ctx.address(), memAddress(str), str.remaining(), active ? 1 : 0) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_option_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_option_text(ctx.address(), strEncoded, strEncodedLength, active ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_label ] ---

    /** Unsafe version of: {@link #nk_selectable_label selectable_label} */
    public static native int nnk_selectable_label(long ctx, long str, int align, long value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_label(ctx.address(), memAddress(str), align, memAddress(value)) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_label(ctx.address(), strEncoded, align, memAddress(value)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_text ] ---

    /** Unsafe version of: {@link #nk_selectable_text selectable_text} */
    public static native int nnk_selectable_text(long ctx, long str, int len, int align, long value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_text(ctx.address(), memAddress(str), str.remaining(), align, memAddress(value)) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_text(ctx.address(), strEncoded, strEncodedLength, align, memAddress(value)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_image_label ] ---

    /** Unsafe version of: {@link #nk_selectable_image_label selectable_image_label} */
    public static native int nnk_selectable_image_label(long ctx, long img, long str, int align, long value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_image_label(ctx.address(), img.address(), memAddress(str), align, memAddress(value)) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_image_label(ctx.address(), img.address(), strEncoded, align, memAddress(value)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_image_text ] ---

    /** Unsafe version of: {@link #nk_selectable_image_text selectable_image_text} */
    public static native int nnk_selectable_image_text(long ctx, long img, long str, int len, int align, long value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_image_text(ctx.address(), img.address(), memAddress(str), str.remaining(), align, memAddress(value)) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_image_text(ctx.address(), img.address(), strEncoded, strEncodedLength, align, memAddress(value)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_symbol_label ] ---

    /** Unsafe version of: {@link #nk_selectable_symbol_label selectable_symbol_label} */
    public static native int nnk_selectable_symbol_label(long ctx, int symbol, long str, int align, long value);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_symbol_label(ctx.address(), symbol, memAddress(str), align, memAddress(value)) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_symbol_label(ctx.address(), symbol, strEncoded, align, memAddress(value)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_symbol_text ] ---

    /** Unsafe version of: {@link #nk_selectable_symbol_text selectable_symbol_text} */
    public static native int nnk_selectable_symbol_text(long ctx, int symbol, long str, int len, int align, long value);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_symbol_text(ctx.address(), symbol, memAddress(str), str.remaining(), align, memAddress(value)) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_selectable_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_symbol_text(ctx.address(), symbol, strEncoded, strEncodedLength, align, memAddress(value)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_label ] ---

    /** Unsafe version of: {@link #nk_select_label select_label} */
    public static native int nnk_select_label(long ctx, long str, int align, int value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_select_label(ctx.address(), memAddress(str), align, value ? 1 : 0) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_label(ctx.address(), strEncoded, align, value ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_text ] ---

    /** Unsafe version of: {@link #nk_select_text select_text} */
    public static native int nnk_select_text(long ctx, long str, int len, int align, int value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        return nnk_select_text(ctx.address(), memAddress(str), str.remaining(), align, value ? 1 : 0) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_text(ctx.address(), strEncoded, strEncodedLength, align, value ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_image_label ] ---

    /** Unsafe version of: {@link #nk_select_image_label select_image_label} */
    public static native int nnk_select_image_label(long ctx, long img, long str, int align, int value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_select_image_label(ctx.address(), img.address(), memAddress(str), align, value ? 1 : 0) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_image_label(ctx.address(), img.address(), strEncoded, align, value ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_image_text ] ---

    /** Unsafe version of: {@link #nk_select_image_text select_image_text} */
    public static native int nnk_select_image_text(long ctx, long img, long str, int len, int align, int value);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        return nnk_select_image_text(ctx.address(), img.address(), memAddress(str), str.remaining(), align, value ? 1 : 0) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_image_text(ctx.address(), img.address(), strEncoded, strEncodedLength, align, value ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_symbol_label ] ---

    /** Unsafe version of: {@link #nk_select_symbol_label select_symbol_label} */
    public static native int nnk_select_symbol_label(long ctx, int symbol, long str, int align, int value);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_select_symbol_label(ctx.address(), symbol, memAddress(str), align, value ? 1 : 0) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_symbol_label(ctx.address(), symbol, strEncoded, align, value ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_symbol_text ] ---

    /** Unsafe version of: {@link #nk_select_symbol_text select_symbol_text} */
    public static native int nnk_select_symbol_text(long ctx, int symbol, long str, int len, int align, int value);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        return nnk_select_symbol_text(ctx.address(), symbol, memAddress(str), str.remaining(), align, value ? 1 : 0) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_select_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_symbol_text(ctx.address(), symbol, strEncoded, strEncodedLength, align, value ? 1 : 0) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_slide_float ] ---

    /** Unsafe version of: {@link #nk_slide_float slide_float} */
    public static native float nnk_slide_float(long ctx, float min, float val, float max, float step);

    /** @param ctx the nuklear context */
    public static float nk_slide_float(@NativeType("struct nk_context *") NkContext ctx, float min, float val, float max, float step) {
        return nnk_slide_float(ctx.address(), min, val, max, step);
    }

    // --- [ nk_slide_int ] ---

    /** Unsafe version of: {@link #nk_slide_int slide_int} */
    public static native int nnk_slide_int(long ctx, int min, int val, int max, int step);

    /** @param ctx the nuklear context */
    public static int nk_slide_int(@NativeType("struct nk_context *") NkContext ctx, int min, int val, int max, int step) {
        return nnk_slide_int(ctx.address(), min, val, max, step);
    }

    // --- [ nk_slider_float ] ---

    /** Unsafe version of: {@link #nk_slider_float slider_float} */
    public static native int nnk_slider_float(long ctx, float min, long val, float max, float step);

    /** @param ctx the nuklear context */
    public static int nk_slider_float(@NativeType("struct nk_context *") NkContext ctx, float min, @NativeType("float *") FloatBuffer val, float max, float step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_float(ctx.address(), min, memAddress(val), max, step);
    }

    // --- [ nk_slider_int ] ---

    /** Unsafe version of: {@link #nk_slider_int slider_int} */
    public static native int nnk_slider_int(long ctx, int min, long val, int max, int step);

    /** @param ctx the nuklear context */
    public static int nk_slider_int(@NativeType("struct nk_context *") NkContext ctx, int min, @NativeType("int *") IntBuffer val, int max, int step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_int(ctx.address(), min, memAddress(val), max, step);
    }

    // --- [ nk_progress ] ---

    /** Unsafe version of: {@link #nk_progress progress} */
    public static native int nnk_progress(long ctx, long cur, long max, int modifyable);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_progress(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_size *") PointerBuffer cur, @NativeType("nk_size") long max, @NativeType("int") boolean modifyable) {
        if (CHECKS) {
            check(cur, 1);
        }
        return nnk_progress(ctx.address(), memAddress(cur), max, modifyable ? 1 : 0) != 0;
    }

    // --- [ nk_prog ] ---

    /** Unsafe version of: {@link #nk_prog prog} */
    public static native long nnk_prog(long ctx, long cur, long max, int modifyable);

    /** @param ctx the nuklear context */
    @NativeType("nk_size")
    public static long nk_prog(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_size") long cur, @NativeType("nk_size") long max, @NativeType("int") boolean modifyable) {
        return nnk_prog(ctx.address(), cur, max, modifyable ? 1 : 0);
    }

    // --- [ nk_color_picker ] ---

    /** Unsafe version of: {@link #nk_color_picker color_picker} */
    public static native void nnk_color_picker(long ctx, long color, int fmt);

    /**
     * @param ctx the nuklear context
     * @param fmt one of:<br><table><tr><td>{@link #NK_RGB RGB}</td><td>{@link #NK_RGBA RGBA}</td></tr></table>
     */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_color_picker(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_colorf") NkColorf color, @NativeType("enum nk_color_format") int fmt) {
        nnk_color_picker(ctx.address(), color.address(), fmt);
        return color;
    }

    // --- [ nk_color_pick ] ---

    /** Unsafe version of: {@link #nk_color_pick color_pick} */
    public static native int nnk_color_pick(long ctx, long color, int fmt);

    /**
     * @param ctx the nuklear context
     * @param fmt one of:<br><table><tr><td>{@link #NK_RGB RGB}</td><td>{@link #NK_RGBA RGBA}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_color_pick(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_colorf *") NkColorf color, @NativeType("enum nk_color_format") int fmt) {
        return nnk_color_pick(ctx.address(), color.address(), fmt) != 0;
    }

    // --- [ nk_property_int ] ---

    /** Unsafe version of: {@link #nk_property_int property_int} */
    public static native void nnk_property_int(long ctx, long name, int min, long val, int max, int step, float inc_per_pixel);

    /** @param ctx the nuklear context */
    public static void nk_property_int(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, int min, @NativeType("int *") IntBuffer val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_int(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
    }

    /** @param ctx the nuklear context */
    public static void nk_property_int(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, int min, @NativeType("int *") IntBuffer val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            check(val, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_property_int(ctx.address(), nameEncoded, min, memAddress(val), max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_property_float ] ---

    /** Unsafe version of: {@link #nk_property_float property_float} */
    public static native void nnk_property_float(long ctx, long name, float min, long val, float max, float step, float inc_per_pixel);

    /** @param ctx the nuklear context */
    public static void nk_property_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, float min, @NativeType("float *") FloatBuffer val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_float(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
    }

    /** @param ctx the nuklear context */
    public static void nk_property_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, float min, @NativeType("float *") FloatBuffer val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            check(val, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_property_float(ctx.address(), nameEncoded, min, memAddress(val), max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_property_double ] ---

    /** Unsafe version of: {@link #nk_property_double property_double} */
    public static native void nnk_property_double(long ctx, long name, double min, long val, double max, double step, float inc_per_pixel);

    /** @param ctx the nuklear context */
    public static void nk_property_double(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, double min, @NativeType("double *") DoubleBuffer val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_double(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
    }

    /** @param ctx the nuklear context */
    public static void nk_property_double(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, double min, @NativeType("double *") DoubleBuffer val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            check(val, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_property_double(ctx.address(), nameEncoded, min, memAddress(val), max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_propertyi ] ---

    /** Unsafe version of: {@link #nk_propertyi propertyi} */
    public static native int nnk_propertyi(long ctx, long name, int min, int val, int max, int step, float inc_per_pixel);

    /** @param ctx the nuklear context */
    public static int nk_propertyi(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, int min, int val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_propertyi(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** @param ctx the nuklear context */
    public static int nk_propertyi(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, int min, int val, int max, int step, float inc_per_pixel) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_propertyi(ctx.address(), nameEncoded, min, val, max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_propertyf ] ---

    /** Unsafe version of: {@link #nk_propertyf propertyf} */
    public static native float nnk_propertyf(long ctx, long name, float min, float val, float max, float step, float inc_per_pixel);

    /** @param ctx the nuklear context */
    public static float nk_propertyf(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, float min, float val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_propertyf(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** @param ctx the nuklear context */
    public static float nk_propertyf(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, float min, float val, float max, float step, float inc_per_pixel) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_propertyf(ctx.address(), nameEncoded, min, val, max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_propertyd ] ---

    /** Unsafe version of: {@link #nk_propertyd propertyd} */
    public static native double nnk_propertyd(long ctx, long name, double min, double val, double max, double step, float inc_per_pixel);

    /** @param ctx the nuklear context */
    public static double nk_propertyd(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, double min, double val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_propertyd(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** @param ctx the nuklear context */
    public static double nk_propertyd(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, double min, double val, double max, double step, float inc_per_pixel) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_propertyd(ctx.address(), nameEncoded, min, val, max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_edit_focus ] ---

    /** Unsafe version of: {@link #nk_edit_focus edit_focus} */
    public static native void nnk_edit_focus(long ctx, int flags);

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr><tr><td>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</td></tr></table>
     */
    public static void nk_edit_focus(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags) {
        nnk_edit_focus(ctx.address(), flags);
    }

    // --- [ nk_edit_unfocus ] ---

    /** Unsafe version of: {@link #nk_edit_unfocus edit_unfocus} */
    public static native void nnk_edit_unfocus(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_edit_unfocus(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_edit_unfocus(ctx.address());
    }

    // --- [ nk_edit_string ] ---

    /** Unsafe version of: {@link #nk_edit_string edit_string} */
    public static native int nnk_edit_string(long ctx, int flags, long memory, long len, int max, long filter);

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr><tr><td>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</td></tr></table>
     */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") ByteBuffer memory, @NativeType("int *") IntBuffer len, int max, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        if (CHECKS) {
            checkNT1(memory);
            check(len, 1);
        }
        return nnk_edit_string(ctx.address(), flags, memAddress(memory), memAddress(len), max, memAddressSafe(filter));
    }

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr><tr><td>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</td></tr></table>
     */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") CharSequence memory, @NativeType("int *") IntBuffer len, int max, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        if (CHECKS) {
            check(len, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(memory, true);
            long memoryEncoded = stack.getPointerAddress();
            return nnk_edit_string(ctx.address(), flags, memoryEncoded, memAddress(len), max, memAddressSafe(filter));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_edit_buffer ] ---

    /** Unsafe version of: {@link #nk_edit_buffer edit_buffer} */
    public static native int nnk_edit_buffer(long ctx, int flags, long edit, long filter);

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr><tr><td>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</td></tr></table>
     */
    @NativeType("nk_flags")
    public static int nk_edit_buffer(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("struct nk_text_edit *") NkTextEdit edit, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        return nnk_edit_buffer(ctx.address(), flags, edit.address(), memAddressSafe(filter));
    }

    // --- [ nk_edit_string_zero_terminated ] ---

    /** Unsafe version of: {@link #nk_edit_string_zero_terminated edit_string_zero_terminated} */
    public static native int nnk_edit_string_zero_terminated(long ctx, int flags, long buffer, int max, long filter);

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr><tr><td>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</td></tr></table>
     */
    @NativeType("nk_flags")
    public static int nk_edit_string_zero_terminated(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") ByteBuffer buffer, int max, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        if (CHECKS) {
            checkNT1(buffer);
        }
        return nnk_edit_string_zero_terminated(ctx.address(), flags, memAddress(buffer), max, memAddressSafe(filter));
    }

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_EDIT_DEFAULT EDIT_DEFAULT}</td><td>{@link #NK_EDIT_READ_ONLY EDIT_READ_ONLY}</td><td>{@link #NK_EDIT_AUTO_SELECT EDIT_AUTO_SELECT}</td><td>{@link #NK_EDIT_SIG_ENTER EDIT_SIG_ENTER}</td></tr><tr><td>{@link #NK_EDIT_ALLOW_TAB EDIT_ALLOW_TAB}</td><td>{@link #NK_EDIT_NO_CURSOR EDIT_NO_CURSOR}</td><td>{@link #NK_EDIT_SELECTABLE EDIT_SELECTABLE}</td><td>{@link #NK_EDIT_CLIPBOARD EDIT_CLIPBOARD}</td></tr><tr><td>{@link #NK_EDIT_CTRL_ENTER_NEWLINE EDIT_CTRL_ENTER_NEWLINE}</td><td>{@link #NK_EDIT_NO_HORIZONTAL_SCROLL EDIT_NO_HORIZONTAL_SCROLL}</td><td>{@link #NK_EDIT_ALWAYS_INSERT_MODE EDIT_ALWAYS_INSERT_MODE}</td><td>{@link #NK_EDIT_MULTILINE EDIT_MULTILINE}</td></tr><tr><td>{@link #NK_EDIT_GOTO_END_ON_ACTIVATE EDIT_GOTO_END_ON_ACTIVATE}</td></tr></table>
     */
    @NativeType("nk_flags")
    public static int nk_edit_string_zero_terminated(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") CharSequence buffer, int max, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(buffer, true);
            long bufferEncoded = stack.getPointerAddress();
            return nnk_edit_string_zero_terminated(ctx.address(), flags, bufferEncoded, max, memAddressSafe(filter));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_chart_begin ] ---

    /** Unsafe version of: {@link #nk_chart_begin chart_begin} */
    public static native int nnk_chart_begin(long ctx, int type, int num, float min, float max);

    /**
     * @param ctx  the nuklear context
     * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_chart_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, int num, float min, float max) {
        return nnk_chart_begin(ctx.address(), type, num, min, max) != 0;
    }

    // --- [ nk_chart_begin_colored ] ---

    /** Unsafe version of: {@link #nk_chart_begin_colored chart_begin_colored} */
    public static native int nnk_chart_begin_colored(long ctx, int type, long color, long active, int num, float min, float max);

    /**
     * @param ctx  the nuklear context
     * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_chart_begin_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("struct nk_color") NkColor color, @NativeType("struct nk_color") NkColor active, int num, float min, float max) {
        return nnk_chart_begin_colored(ctx.address(), type, color.address(), active.address(), num, min, max) != 0;
    }

    // --- [ nk_chart_add_slot ] ---

    /** Unsafe version of: {@link #nk_chart_add_slot chart_add_slot} */
    public static native void nnk_chart_add_slot(long ctx, int type, int count, float min_value, float max_value);

    /**
     * @param ctx  the nuklear context
     * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
     */
    public static void nk_chart_add_slot(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, int count, float min_value, float max_value) {
        nnk_chart_add_slot(ctx.address(), type, count, min_value, max_value);
    }

    // --- [ nk_chart_add_slot_colored ] ---

    /** Unsafe version of: {@link #nk_chart_add_slot_colored chart_add_slot_colored} */
    public static native void nnk_chart_add_slot_colored(long ctx, int type, long color, long active, int count, float min_value, float max_value);

    /**
     * @param ctx  the nuklear context
     * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
     */
    public static void nk_chart_add_slot_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("struct nk_color") NkColor color, @NativeType("struct nk_color") NkColor active, int count, float min_value, float max_value) {
        nnk_chart_add_slot_colored(ctx.address(), type, color.address(), active.address(), count, min_value, max_value);
    }

    // --- [ nk_chart_push ] ---

    /** Unsafe version of: {@link #nk_chart_push chart_push} */
    public static native int nnk_chart_push(long ctx, float value);

    /** @param ctx the nuklear context */
    @NativeType("nk_flags")
    public static int nk_chart_push(@NativeType("struct nk_context *") NkContext ctx, float value) {
        return nnk_chart_push(ctx.address(), value);
    }

    // --- [ nk_chart_push_slot ] ---

    /** Unsafe version of: {@link #nk_chart_push_slot chart_push_slot} */
    public static native int nnk_chart_push_slot(long ctx, float value, int slot);

    /** @param ctx the nuklear context */
    @NativeType("nk_flags")
    public static int nk_chart_push_slot(@NativeType("struct nk_context *") NkContext ctx, float value, int slot) {
        return nnk_chart_push_slot(ctx.address(), value, slot);
    }

    // --- [ nk_chart_end ] ---

    /** Unsafe version of: {@link #nk_chart_end chart_end} */
    public static native void nnk_chart_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_chart_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_chart_end(ctx.address());
    }

    // --- [ nk_plot ] ---

    /** Unsafe version of: {@link #nk_plot plot} */
    public static native void nnk_plot(long ctx, int type, long values, int count, int offset);

    /**
     * @param ctx  the nuklear context
     * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
     */
    public static void nk_plot(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("float const *") FloatBuffer values, int count, int offset) {
        if (CHECKS) {
            check(values, offset + count);
        }
        nnk_plot(ctx.address(), type, memAddress(values), count, offset);
    }

    // --- [ nk_plot_function ] ---

    /** Unsafe version of: {@link #nk_plot_function plot_function} */
    public static native void nnk_plot_function(long ctx, int type, long userdata, long value_getter, int count, int offset);

    /**
     * @param ctx  the nuklear context
     * @param type one of:<br><table><tr><td>{@link #NK_CHART_LINES CHART_LINES}</td><td>{@link #NK_CHART_COLUMN CHART_COLUMN}</td><td>{@link #NK_CHART_MAX CHART_MAX}</td></tr></table>
     */
    public static void nk_plot_function(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("void *") long userdata, @NativeType("nk_value_getter") NkValueGetterI value_getter, int count, int offset) {
        if (CHECKS) {
            check(userdata);
        }
        nnk_plot_function(ctx.address(), type, userdata, value_getter.address(), count, offset);
    }

    // --- [ nk_popup_begin ] ---

    /** Unsafe version of: {@link #nk_popup_begin popup_begin} */
    public static native int nnk_popup_begin(long ctx, int type, long title, int flags, long rect);

    /**
     * @param ctx   the nuklear context
     * @param type  one of:<br><table><tr><td>{@link #NK_POPUP_STATIC POPUP_STATIC}</td><td>{@link #NK_POPUP_DYNAMIC POPUP_DYNAMIC}</td></tr></table>
     * @param flags one of:<br><table><tr><td>{@link #NK_WINDOW_BORDER WINDOW_BORDER}</td><td>{@link #NK_WINDOW_MOVABLE WINDOW_MOVABLE}</td><td>{@link #NK_WINDOW_SCALABLE WINDOW_SCALABLE}</td><td>{@link #NK_WINDOW_CLOSABLE WINDOW_CLOSABLE}</td><td>{@link #NK_WINDOW_MINIMIZABLE WINDOW_MINIMIZABLE}</td></tr><tr><td>{@link #NK_WINDOW_NO_SCROLLBAR WINDOW_NO_SCROLLBAR}</td><td>{@link #NK_WINDOW_TITLE WINDOW_TITLE}</td><td>{@link #NK_WINDOW_SCROLL_AUTO_HIDE WINDOW_SCROLL_AUTO_HIDE}</td><td>{@link #NK_WINDOW_BACKGROUND WINDOW_BACKGROUND}</td><td>{@link #NK_WINDOW_SCALE_LEFT WINDOW_SCALE_LEFT}</td></tr><tr><td>{@link #NK_WINDOW_NO_INPUT WINDOW_NO_INPUT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_popup_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_popup_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags, @NativeType("struct nk_rect") NkRect rect) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_popup_begin(ctx.address(), type, memAddress(title), flags, rect.address()) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param type  one of:<br><table><tr><td>{@link #NK_POPUP_STATIC POPUP_STATIC}</td><td>{@link #NK_POPUP_DYNAMIC POPUP_DYNAMIC}</td></tr></table>
     * @param flags one of:<br><table><tr><td>{@link #NK_WINDOW_BORDER WINDOW_BORDER}</td><td>{@link #NK_WINDOW_MOVABLE WINDOW_MOVABLE}</td><td>{@link #NK_WINDOW_SCALABLE WINDOW_SCALABLE}</td><td>{@link #NK_WINDOW_CLOSABLE WINDOW_CLOSABLE}</td><td>{@link #NK_WINDOW_MINIMIZABLE WINDOW_MINIMIZABLE}</td></tr><tr><td>{@link #NK_WINDOW_NO_SCROLLBAR WINDOW_NO_SCROLLBAR}</td><td>{@link #NK_WINDOW_TITLE WINDOW_TITLE}</td><td>{@link #NK_WINDOW_SCROLL_AUTO_HIDE WINDOW_SCROLL_AUTO_HIDE}</td><td>{@link #NK_WINDOW_BACKGROUND WINDOW_BACKGROUND}</td><td>{@link #NK_WINDOW_SCALE_LEFT WINDOW_SCALE_LEFT}</td></tr><tr><td>{@link #NK_WINDOW_NO_INPUT WINDOW_NO_INPUT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_popup_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_popup_type") int type, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags, @NativeType("struct nk_rect") NkRect rect) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_popup_begin(ctx.address(), type, titleEncoded, flags, rect.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_popup_close ] ---

    /** Unsafe version of: {@link #nk_popup_close popup_close} */
    public static native void nnk_popup_close(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_popup_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_popup_close(ctx.address());
    }

    // --- [ nk_popup_end ] ---

    /** Unsafe version of: {@link #nk_popup_end popup_end} */
    public static native void nnk_popup_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_popup_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_popup_end(ctx.address());
    }

    // --- [ nk_combo ] ---

    /** Unsafe version of: {@link #nk_combo combo} */
    public static native int nnk_combo(long ctx, long items, int count, int selected, int item_height, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const **") PointerBuffer items, @NativeType("int") boolean selected, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo(ctx.address(), memAddress(items), items.remaining(), selected ? 1 : 0, item_height, size.address()) != 0;
    }

    // --- [ nk_combo_separator ] ---

    /** Unsafe version of: {@link #nk_combo_separator combo_separator} */
    public static native int nnk_combo_separator(long ctx, long items_separated_by_separator, int separator, int selected, int count, int item_height, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_separator, int separator, @NativeType("int") boolean selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_separator);
        }
        return nnk_combo_separator(ctx.address(), memAddress(items_separated_by_separator), separator, selected ? 1 : 0, count, item_height, size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_separator, int separator, @NativeType("int") boolean selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_separator, true);
            long items_separated_by_separatorEncoded = stack.getPointerAddress();
            return nnk_combo_separator(ctx.address(), items_separated_by_separatorEncoded, separator, selected ? 1 : 0, count, item_height, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_string ] ---

    /** Unsafe version of: {@link #nk_combo_string combo_string} */
    public static native int nnk_combo_string(long ctx, long items_separated_by_zeros, int selected, int count, int item_height, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_zeros, @NativeType("int") boolean selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_zeros);
        }
        return nnk_combo_string(ctx.address(), memAddress(items_separated_by_zeros), selected ? 1 : 0, count, item_height, size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_zeros, @NativeType("int") boolean selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_zeros, true);
            long items_separated_by_zerosEncoded = stack.getPointerAddress();
            return nnk_combo_string(ctx.address(), items_separated_by_zerosEncoded, selected ? 1 : 0, count, item_height, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_callback ] ---

    /** Unsafe version of: {@link #nk_combo_callback combo_callback} */
    public static native int nnk_combo_callback(long ctx, long item_getter, long userdata, int selected, int count, int item_height, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_callback(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_item_getter") NkItemGetterI item_getter, @NativeType("void *") long userdata, @NativeType("int") boolean selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(userdata);
        }
        return nnk_combo_callback(ctx.address(), item_getter.address(), userdata, selected ? 1 : 0, count, item_height, size.address()) != 0;
    }

    // --- [ nk_combobox ] ---

    /** Unsafe version of: {@link #nk_combobox combobox} */
    public static native void nnk_combobox(long ctx, long items, int count, long selected, int item_height, long size);

    /** @param ctx the nuklear context */
    public static void nk_combobox(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const **") PointerBuffer items, @NativeType("int *") IntBuffer selected, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        nnk_combobox(ctx.address(), memAddress(items), items.remaining(), memAddress(selected), item_height, size.address());
    }

    // --- [ nk_combobox_string ] ---

    /** Unsafe version of: {@link #nk_combobox_string combobox_string} */
    public static native void nnk_combobox_string(long ctx, long items_separated_by_zeros, long selected, int count, int item_height, long size);

    /** @param ctx the nuklear context */
    public static void nk_combobox_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_zeros, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_zeros);
            check(selected, 1);
        }
        nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zeros), memAddress(selected), count, item_height, size.address());
    }

    /** @param ctx the nuklear context */
    public static void nk_combobox_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_zeros, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_zeros, true);
            long items_separated_by_zerosEncoded = stack.getPointerAddress();
            nnk_combobox_string(ctx.address(), items_separated_by_zerosEncoded, memAddress(selected), count, item_height, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combobox_separator ] ---

    /** Unsafe version of: {@link #nk_combobox_separator combobox_separator} */
    public static native void nnk_combobox_separator(long ctx, long items_separated_by_separator, int separator, long selected, int count, int item_height, long size);

    /** @param ctx the nuklear context */
    public static void nk_combobox_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_separator, int separator, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_separator);
            check(selected, 1);
        }
        nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separator), separator, memAddress(selected), count, item_height, size.address());
    }

    /** @param ctx the nuklear context */
    public static void nk_combobox_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_separator, int separator, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_separator, true);
            long items_separated_by_separatorEncoded = stack.getPointerAddress();
            nnk_combobox_separator(ctx.address(), items_separated_by_separatorEncoded, separator, memAddress(selected), count, item_height, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combobox_callback ] ---

    /** Unsafe version of: {@link #nk_combobox_callback combobox_callback} */
    public static native void nnk_combobox_callback(long ctx, long item_getter, long userdata, long selected, int count, int item_height, long size);

    /** @param ctx the nuklear context */
    public static void nk_combobox_callback(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_item_getter") NkItemGetterI item_getter, @NativeType("void *") long userdata, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(userdata);
            check(selected, 1);
        }
        nnk_combobox_callback(ctx.address(), item_getter.address(), userdata, memAddress(selected), count, item_height, size.address());
    }

    // --- [ nk_combo_begin_text ] ---

    /** Unsafe version of: {@link #nk_combo_begin_text combo_begin_text} */
    public static native int nnk_combo_begin_text(long ctx, long selected, int len, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_text(ctx.address(), memAddress(selected), selected.remaining(), size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int selectedEncodedLength = stack.nUTF8(selected, false);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_text(ctx.address(), selectedEncoded, selectedEncodedLength, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_label ] ---

    /** Unsafe version of: {@link #nk_combo_begin_label combo_begin_label} */
    public static native int nnk_combo_begin_label(long ctx, long selected, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(selected);
        }
        return nnk_combo_begin_label(ctx.address(), memAddress(selected), size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(selected, true);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_label(ctx.address(), selectedEncoded, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_color ] ---

    /** Unsafe version of: {@link #nk_combo_begin_color combo_begin_color} */
    public static native int nnk_combo_begin_color(long ctx, long color, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color") NkColor color, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_color(ctx.address(), color.address(), size.address()) != 0;
    }

    // --- [ nk_combo_begin_symbol ] ---

    /** Unsafe version of: {@link #nk_combo_begin_symbol combo_begin_symbol} */
    public static native int nnk_combo_begin_symbol(long ctx, int symbol, long size);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_begin_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_symbol(ctx.address(), symbol, size.address()) != 0;
    }

    // --- [ nk_combo_begin_symbol_label ] ---

    /** Unsafe version of: {@link #nk_combo_begin_symbol_label combo_begin_symbol_label} */
    public static native int nnk_combo_begin_symbol_label(long ctx, long selected, int symbol, long size);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(selected);
        }
        return nnk_combo_begin_symbol_label(ctx.address(), memAddress(selected), symbol, size.address()) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(selected, true);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_symbol_label(ctx.address(), selectedEncoded, symbol, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_symbol_text ] ---

    /** Unsafe version of: {@link #nk_combo_begin_symbol_text combo_begin_symbol_text} */
    public static native int nnk_combo_begin_symbol_text(long ctx, long selected, int len, int symbol, long size);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_symbol_text(ctx.address(), memAddress(selected), selected.remaining(), symbol, size.address()) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int selectedEncodedLength = stack.nUTF8(selected, false);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_symbol_text(ctx.address(), selectedEncoded, selectedEncodedLength, symbol, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_image ] ---

    /** Unsafe version of: {@link #nk_combo_begin_image combo_begin_image} */
    public static native int nnk_combo_begin_image(long ctx, long img, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_image(ctx.address(), img.address(), size.address()) != 0;
    }

    // --- [ nk_combo_begin_image_label ] ---

    /** Unsafe version of: {@link #nk_combo_begin_image_label combo_begin_image_label} */
    public static native int nnk_combo_begin_image_label(long ctx, long selected, long img, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(selected);
        }
        return nnk_combo_begin_image_label(ctx.address(), memAddress(selected), img.address(), size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(selected, true);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_image_label(ctx.address(), selectedEncoded, img.address(), size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_image_text ] ---

    /** Unsafe version of: {@link #nk_combo_begin_image_text combo_begin_image_text} */
    public static native int nnk_combo_begin_image_text(long ctx, long selected, int len, long img, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_image_text(ctx.address(), memAddress(selected), selected.remaining(), img.address(), size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_combo_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int selectedEncodedLength = stack.nUTF8(selected, false);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_image_text(ctx.address(), selectedEncoded, selectedEncodedLength, img.address(), size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_label ] ---

    /** Unsafe version of: {@link #nk_combo_item_label combo_item_label} */
    public static native int nnk_combo_item_label(long ctx, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_combo_item_label(ctx.address(), memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_label(ctx.address(), textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_text ] ---

    /** Unsafe version of: {@link #nk_combo_item_text combo_item_text} */
    public static native int nnk_combo_item_text(long ctx, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_combo_item_text(ctx.address(), memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_text(ctx.address(), textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_image_label ] ---

    /** Unsafe version of: {@link #nk_combo_item_image_label combo_item_image_label} */
    public static native int nnk_combo_item_image_label(long ctx, long img, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_combo_item_image_label(ctx.address(), img.address(), memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_image_label(ctx.address(), img.address(), textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_image_text ] ---

    /** Unsafe version of: {@link #nk_combo_item_image_text combo_item_image_text} */
    public static native int nnk_combo_item_image_text(long ctx, long img, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_combo_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_symbol_label ] ---

    /** Unsafe version of: {@link #nk_combo_item_symbol_label combo_item_symbol_label} */
    public static native int nnk_combo_item_symbol_label(long ctx, int symbol, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_combo_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_symbol_label(ctx.address(), symbol, textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_symbol_text ] ---

    /** Unsafe version of: {@link #nk_combo_item_symbol_text combo_item_symbol_text} */
    public static native int nnk_combo_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_combo_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_combo_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_close ] ---

    /** Unsafe version of: {@link #nk_combo_close combo_close} */
    public static native void nnk_combo_close(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_combo_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_combo_close(ctx.address());
    }

    // --- [ nk_combo_end ] ---

    /** Unsafe version of: {@link #nk_combo_end combo_end} */
    public static native void nnk_combo_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_combo_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_combo_end(ctx.address());
    }

    // --- [ nk_contextual_begin ] ---

    /** Unsafe version of: {@link #nk_contextual_begin contextual_begin} */
    public static native int nnk_contextual_begin(long ctx, int flags, long size, long trigger_bounds);

    /**
     * @param ctx   the nuklear context
     * @param flags one of:<br><table><tr><td>{@link #NK_WINDOW_PRIVATE WINDOW_PRIVATE}</td><td>{@link #NK_WINDOW_DYNAMIC WINDOW_DYNAMIC}</td><td>{@link #NK_WINDOW_ROM WINDOW_ROM}</td><td>{@link #NK_WINDOW_HIDDEN WINDOW_HIDDEN}</td><td>{@link #NK_WINDOW_CLOSED WINDOW_CLOSED}</td></tr><tr><td>{@link #NK_WINDOW_MINIMIZED WINDOW_MINIMIZED}</td><td>{@link #NK_WINDOW_REMOVE_ROM WINDOW_REMOVE_ROM}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("struct nk_vec2") NkVec2 size, @NativeType("struct nk_rect") NkRect trigger_bounds) {
        return nnk_contextual_begin(ctx.address(), flags, size.address(), trigger_bounds.address()) != 0;
    }

    // --- [ nk_contextual_item_text ] ---

    /** Unsafe version of: {@link #nk_contextual_item_text contextual_item_text} */
    public static native int nnk_contextual_item_text(long ctx, long text, int len, int align);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align) {
        return nnk_contextual_item_text(ctx.address(), memAddress(text), text.remaining(), align) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_text(ctx.address(), textEncoded, textEncodedLength, align) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_label ] ---

    /** Unsafe version of: {@link #nk_contextual_item_label contextual_item_label} */
    public static native int nnk_contextual_item_label(long ctx, long text, int align);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_contextual_item_label(ctx.address(), memAddress(text), align) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_label(ctx.address(), textEncoded, align) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_image_label ] ---

    /** Unsafe version of: {@link #nk_contextual_item_image_label contextual_item_image_label} */
    public static native int nnk_contextual_item_image_label(long ctx, long img, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_contextual_item_image_label(ctx.address(), img.address(), memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_image_label(ctx.address(), img.address(), textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_image_text ] ---

    /** Unsafe version of: {@link #nk_contextual_item_image_text contextual_item_image_text} */
    public static native int nnk_contextual_item_image_text(long ctx, long img, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_contextual_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_symbol_label ] ---

    /** Unsafe version of: {@link #nk_contextual_item_symbol_label contextual_item_symbol_label} */
    public static native int nnk_contextual_item_symbol_label(long ctx, int symbol, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_contextual_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_symbol_label(ctx.address(), symbol, textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_symbol_text ] ---

    /** Unsafe version of: {@link #nk_contextual_item_symbol_text contextual_item_symbol_text} */
    public static native int nnk_contextual_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_contextual_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_contextual_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_close ] ---

    /** Unsafe version of: {@link #nk_contextual_close contextual_close} */
    public static native void nnk_contextual_close(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_contextual_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_contextual_close(ctx.address());
    }

    // --- [ nk_contextual_end ] ---

    /** Unsafe version of: {@link #nk_contextual_end contextual_end} */
    public static native void nnk_contextual_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_contextual_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_contextual_end(ctx.address());
    }

    // --- [ nk_tooltip ] ---

    /** Unsafe version of: {@link #nk_tooltip tooltip} */
    public static native void nnk_tooltip(long ctx, long text);

    /** @param ctx the nuklear context */
    public static void nk_tooltip(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nnk_tooltip(ctx.address(), memAddress(text));
    }

    /** @param ctx the nuklear context */
    public static void nk_tooltip(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            nnk_tooltip(ctx.address(), textEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tooltip_begin ] ---

    /** Unsafe version of: {@link #nk_tooltip_begin tooltip_begin} */
    public static native int nnk_tooltip_begin(long ctx, float width);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_tooltip_begin(@NativeType("struct nk_context *") NkContext ctx, float width) {
        return nnk_tooltip_begin(ctx.address(), width) != 0;
    }

    // --- [ nk_tooltip_end ] ---

    /** Unsafe version of: {@link #nk_tooltip_end tooltip_end} */
    public static native void nnk_tooltip_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_tooltip_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tooltip_end(ctx.address());
    }

    // --- [ nk_menubar_begin ] ---

    /** Unsafe version of: {@link #nk_menubar_begin menubar_begin} */
    public static native void nnk_menubar_begin(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_menubar_begin(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menubar_begin(ctx.address());
    }

    // --- [ nk_menubar_end ] ---

    /** Unsafe version of: {@link #nk_menubar_end menubar_end} */
    public static native void nnk_menubar_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_menubar_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menubar_end(ctx.address());
    }

    // --- [ nk_menu_begin_text ] ---

    /** Unsafe version of: {@link #nk_menu_begin_text menu_begin_text} */
    public static native int nnk_menu_begin_text(long ctx, long text, int len, int align, long size);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_menu_begin_text(ctx.address(), memAddress(text), text.remaining(), align, size.address()) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_text(ctx.address(), textEncoded, textEncodedLength, align, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_label ] ---

    /** Unsafe version of: {@link #nk_menu_begin_label menu_begin_label} */
    public static native int nnk_menu_begin_label(long ctx, long text, int align, long size);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_label(ctx.address(), memAddress(text), align, size.address()) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_label(ctx.address(), textEncoded, align, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_image ] ---

    /** Unsafe version of: {@link #nk_menu_begin_image menu_begin_image} */
    public static native int nnk_menu_begin_image(long ctx, long text, long img, long size);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_menu_begin_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_image(ctx.address(), memAddress(text), img.address(), size.address()) != 0;
    }

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_menu_begin_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_image(ctx.address(), textEncoded, img.address(), size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_image_text ] ---

    /** Unsafe version of: {@link #nk_menu_begin_image_text menu_begin_image_text} */
    public static native int nnk_menu_begin_image_text(long ctx, long text, int len, int align, long img, long size);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_menu_begin_image_text(ctx.address(), memAddress(text), text.remaining(), align, img.address(), size.address()) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_image_text(ctx.address(), textEncoded, textEncodedLength, align, img.address(), size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_image_label ] ---

    /** Unsafe version of: {@link #nk_menu_begin_image_label menu_begin_image_label} */
    public static native int nnk_menu_begin_image_label(long ctx, long text, int align, long img, long size);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_image_label(ctx.address(), memAddress(text), align, img.address(), size.address()) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_image_label(ctx.address(), textEncoded, align, img.address(), size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_symbol ] ---

    /** Unsafe version of: {@link #nk_menu_begin_symbol menu_begin_symbol} */
    public static native int nnk_menu_begin_symbol(long ctx, long text, int symbol, long size);

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_symbol(ctx.address(), memAddress(text), symbol, size.address()) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_symbol(ctx.address(), textEncoded, symbol, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_symbol_text ] ---

    /** Unsafe version of: {@link #nk_menu_begin_symbol_text menu_begin_symbol_text} */
    public static native int nnk_menu_begin_symbol_text(long ctx, long text, int len, int align, int symbol, long size);

    /**
     * @param ctx    the nuklear context
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_menu_begin_symbol_text(ctx.address(), memAddress(text), text.remaining(), align, symbol, size.address()) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_symbol_text(ctx.address(), textEncoded, textEncodedLength, align, symbol, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_symbol_label ] ---

    /** Unsafe version of: {@link #nk_menu_begin_symbol_label menu_begin_symbol_label} */
    public static native int nnk_menu_begin_symbol_label(long ctx, long text, int align, int symbol, long size);

    /**
     * @param ctx    the nuklear context
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_symbol_label(ctx.address(), memAddress(text), align, symbol, size.address()) != 0;
    }

    /**
     * @param ctx    the nuklear context
     * @param align  one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     * @param symbol one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_symbol_label(ctx.address(), textEncoded, align, symbol, size.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_text ] ---

    /** Unsafe version of: {@link #nk_menu_item_text menu_item_text} */
    public static native int nnk_menu_item_text(long ctx, long text, int len, int align);

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align) {
        return nnk_menu_item_text(ctx.address(), memAddress(text), text.remaining(), align) != 0;
    }

    /**
     * @param ctx   the nuklear context
     * @param align one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_text(ctx.address(), textEncoded, textEncodedLength, align) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_label ] ---

    /** Unsafe version of: {@link #nk_menu_item_label menu_item_label} */
    public static native int nnk_menu_item_label(long ctx, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_item_label(ctx.address(), memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_label(ctx.address(), textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_image_label ] ---

    /** Unsafe version of: {@link #nk_menu_item_image_label menu_item_image_label} */
    public static native int nnk_menu_item_image_label(long ctx, long img, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_item_image_label(ctx.address(), img.address(), memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_image_label(ctx.address(), img.address(), textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_image_text ] ---

    /** Unsafe version of: {@link #nk_menu_item_image_text menu_item_image_text} */
    public static native int nnk_menu_item_image_text(long ctx, long img, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_menu_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_symbol_text ] ---

    /** Unsafe version of: {@link #nk_menu_item_symbol_text menu_item_symbol_text} */
    public static native int nnk_menu_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_menu_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_symbol_label ] ---

    /** Unsafe version of: {@link #nk_menu_item_symbol_label menu_item_symbol_label} */
    public static native int nnk_menu_item_symbol_label(long ctx, int symbol, long text, int alignment);

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment) != 0;
    }

    /**
     * @param ctx       the nuklear context
     * @param symbol    one of:<br><table><tr><td>{@link #NK_SYMBOL_NONE SYMBOL_NONE}</td><td>{@link #NK_SYMBOL_X SYMBOL_X}</td><td>{@link #NK_SYMBOL_UNDERSCORE SYMBOL_UNDERSCORE}</td><td>{@link #NK_SYMBOL_CIRCLE_SOLID SYMBOL_CIRCLE_SOLID}</td><td>{@link #NK_SYMBOL_CIRCLE_OUTLINE SYMBOL_CIRCLE_OUTLINE}</td></tr><tr><td>{@link #NK_SYMBOL_RECT_SOLID SYMBOL_RECT_SOLID}</td><td>{@link #NK_SYMBOL_RECT_OUTLINE SYMBOL_RECT_OUTLINE}</td><td>{@link #NK_SYMBOL_TRIANGLE_UP SYMBOL_TRIANGLE_UP}</td><td>{@link #NK_SYMBOL_TRIANGLE_DOWN SYMBOL_TRIANGLE_DOWN}</td><td>{@link #NK_SYMBOL_TRIANGLE_LEFT SYMBOL_TRIANGLE_LEFT}</td></tr><tr><td>{@link #NK_SYMBOL_TRIANGLE_RIGHT SYMBOL_TRIANGLE_RIGHT}</td><td>{@link #NK_SYMBOL_PLUS SYMBOL_PLUS}</td><td>{@link #NK_SYMBOL_MINUS SYMBOL_MINUS}</td><td>{@link #NK_SYMBOL_MAX SYMBOL_MAX}</td></tr></table>
     * @param alignment one of:<br><table><tr><td>{@link #NK_TEXT_LEFT TEXT_LEFT}</td><td>{@link #NK_TEXT_CENTERED TEXT_CENTERED}</td><td>{@link #NK_TEXT_RIGHT TEXT_RIGHT}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_menu_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_symbol_label(ctx.address(), symbol, textEncoded, alignment) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_close ] ---

    /** Unsafe version of: {@link #nk_menu_close menu_close} */
    public static native void nnk_menu_close(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_menu_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menu_close(ctx.address());
    }

    // --- [ nk_menu_end ] ---

    /** Unsafe version of: {@link #nk_menu_end menu_end} */
    public static native void nnk_menu_end(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_menu_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menu_end(ctx.address());
    }

    // --- [ nk_convert ] ---

    /** Unsafe version of: {@link #nk_convert convert} */
    public static native int nnk_convert(long ctx, long cmds, long vertices, long elements, long config);

    /**
     * Converts from the abstract draw commands list into a hardware accessable vertex format.
     *
     * @param ctx the nuklear context
     */
    @NativeType("nk_flags")
    public static int nk_convert(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_buffer *") NkBuffer cmds, @NativeType("struct nk_buffer *") NkBuffer vertices, @NativeType("struct nk_buffer *") NkBuffer elements, @NativeType("struct nk_convert_config const *") NkConvertConfig config) {
        if (CHECKS) {
            NkConvertConfig.validate(config.address());
        }
        return nnk_convert(ctx.address(), cmds.address(), vertices.address(), elements.address(), config.address());
    }

    // --- [ nk_input_begin ] ---

    /** Unsafe version of: {@link #nk_input_begin input_begin} */
    public static native void nnk_input_begin(long ctx);

    /**
     * Begins the input mirroring process by resetting text, scroll, mouse, previous mouse position and movement as well as key state transitions.
     *
     * @param ctx the nuklear context
     */
    public static void nk_input_begin(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_input_begin(ctx.address());
    }

    // --- [ nk_input_motion ] ---

    /** Unsafe version of: {@link #nk_input_motion input_motion} */
    public static native void nnk_input_motion(long ctx, int x, int y);

    /**
     * Mirrors current mouse position to nuklear.
     *
     * @param ctx the nuklear context
     */
    public static void nk_input_motion(@NativeType("struct nk_context *") NkContext ctx, int x, int y) {
        nnk_input_motion(ctx.address(), x, y);
    }

    // --- [ nk_input_key ] ---

    /** Unsafe version of: {@link #nk_input_key input_key} */
    public static native void nnk_input_key(long ctx, int key, int down);

    /**
     * Mirrors the state of a specific key to nuklear.
     *
     * @param ctx the nuklear context
     * @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_SELECT_ALL KEY_TEXT_SELECT_ALL}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td></tr></table>
     */
    public static void nk_input_key(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_keys") int key, @NativeType("int") boolean down) {
        nnk_input_key(ctx.address(), key, down ? 1 : 0);
    }

    // --- [ nk_input_button ] ---

    /** Unsafe version of: {@link #nk_input_button input_button} */
    public static native void nnk_input_button(long ctx, int id, int x, int y, int down);

    /**
     * Mirrors the state of a specific mouse button to nuklear.
     *
     * @param ctx the nuklear context
     * @param id  one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table>
     */
    public static void nk_input_button(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_buttons") int id, int x, int y, @NativeType("int") boolean down) {
        nnk_input_button(ctx.address(), id, x, y, down ? 1 : 0);
    }

    // --- [ nk_input_scroll ] ---

    /** Unsafe version of: {@link #nk_input_scroll input_scroll} */
    public static native void nnk_input_scroll(long ctx, long val);

    /**
     * Copies the last mouse scroll value to nuklear. Is generally a  scroll value. So does not have to come from mouse and could also originate from
     * touch for example.
     *
     * @param ctx the nuklear context
     * @param val vector with both X- as well as Y-scroll value
     */
    public static void nk_input_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 val) {
        nnk_input_scroll(ctx.address(), val.address());
    }

    // --- [ nk_input_char ] ---

    /** Unsafe version of: {@link #nk_input_char input_char} */
    public static native void nnk_input_char(long ctx, byte c);

    /**
     * Adds a single ASCII text character into an internal text buffer.
     *
     * @param ctx the nuklear context
     */
    public static void nk_input_char(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char") byte c) {
        nnk_input_char(ctx.address(), c);
    }

    // --- [ nk_input_glyph ] ---

    /** Unsafe version of: {@link #nk_input_glyph input_glyph} */
    public static native void nnk_input_glyph(long ctx, long glyph);

    /**
     * Adds a single multi-byte UTF-8 character into an internal text buffer.
     *
     * @param ctx the nuklear context
     */
    public static void nk_input_glyph(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char *") ByteBuffer glyph) {
        if (CHECKS) {
            check(glyph, 4);
        }
        nnk_input_glyph(ctx.address(), memAddress(glyph));
    }

    // --- [ nk_input_unicode ] ---

    /** Unsafe version of: {@link #nk_input_unicode input_unicode} */
    public static native void nnk_input_unicode(long ctx, int unicode);

    /**
     * Adds a single unicode rune into an internal text buffer.
     *
     * @param ctx the nuklear context
     */
    public static void nk_input_unicode(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_rune") int unicode) {
        nnk_input_unicode(ctx.address(), unicode);
    }

    // --- [ nk_input_end ] ---

    /** Unsafe version of: {@link #nk_input_end input_end} */
    public static native void nnk_input_end(long ctx);

    /**
     * Ends the input mirroring process by calculating state changes. Don't call any {@code nk_input_xxx} function referenced above after this call.
     *
     * @param ctx the nuklear context
     */
    public static void nk_input_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_input_end(ctx.address());
    }

    // --- [ nk_style_default ] ---

    /** Unsafe version of: {@link #nk_style_default style_default} */
    public static native void nnk_style_default(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_style_default(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_style_default(ctx.address());
    }

    // --- [ nk_style_from_table ] ---

    /** Unsafe version of: {@link #nk_style_from_table style_from_table} */
    public static native void nnk_style_from_table(long ctx, long table);

    /** @param ctx the nuklear context */
    public static void nk_style_from_table(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color const *") NkColor.Buffer table) {
        if (CHECKS) {
            check(table, NK_COLOR_COUNT);
        }
        nnk_style_from_table(ctx.address(), table.address());
    }

    // --- [ nk_style_load_cursor ] ---

    /** Unsafe version of: {@link #nk_style_load_cursor style_load_cursor} */
    public static native void nnk_style_load_cursor(long ctx, int style, long cursor);

    /**
     * @param ctx   the nuklear context
     * @param style one of:<br><table><tr><td>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</td><td>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</td><td>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</td><td>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</td><td>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</td></tr></table>
     */
    public static void nk_style_load_cursor(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_style_cursor") int style, @NativeType("struct nk_cursor *") NkCursor cursor) {
        nnk_style_load_cursor(ctx.address(), style, cursor.address());
    }

    // --- [ nk_style_load_all_cursors ] ---

    /** Unsafe version of: {@link #nk_style_load_all_cursors style_load_all_cursors} */
    public static native void nnk_style_load_all_cursors(long ctx, long cursors);

    /** @param ctx the nuklear context */
    public static void nk_style_load_all_cursors(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_cursor *") NkCursor.Buffer cursors) {
        if (CHECKS) {
            check(cursors, NK_CURSOR_COUNT);
        }
        nnk_style_load_all_cursors(ctx.address(), cursors.address());
    }

    // --- [ nk_style_get_color_by_name ] ---

    /** Unsafe version of: {@link #nk_style_get_color_by_name style_get_color_by_name} */
    public static native long nnk_style_get_color_by_name(int c);

    /** @param c one of:<br><table><tr><td>{@link #NK_COLOR_TEXT COLOR_TEXT}</td><td>{@link #NK_COLOR_WINDOW COLOR_WINDOW}</td><td>{@link #NK_COLOR_HEADER COLOR_HEADER}</td><td>{@link #NK_COLOR_BORDER COLOR_BORDER}</td></tr><tr><td>{@link #NK_COLOR_BUTTON COLOR_BUTTON}</td><td>{@link #NK_COLOR_BUTTON_HOVER COLOR_BUTTON_HOVER}</td><td>{@link #NK_COLOR_BUTTON_ACTIVE COLOR_BUTTON_ACTIVE}</td><td>{@link #NK_COLOR_TOGGLE COLOR_TOGGLE}</td></tr><tr><td>{@link #NK_COLOR_TOGGLE_HOVER COLOR_TOGGLE_HOVER}</td><td>{@link #NK_COLOR_TOGGLE_CURSOR COLOR_TOGGLE_CURSOR}</td><td>{@link #NK_COLOR_SELECT COLOR_SELECT}</td><td>{@link #NK_COLOR_SELECT_ACTIVE COLOR_SELECT_ACTIVE}</td></tr><tr><td>{@link #NK_COLOR_SLIDER COLOR_SLIDER}</td><td>{@link #NK_COLOR_SLIDER_CURSOR COLOR_SLIDER_CURSOR}</td><td>{@link #NK_COLOR_SLIDER_CURSOR_HOVER COLOR_SLIDER_CURSOR_HOVER}</td><td>{@link #NK_COLOR_SLIDER_CURSOR_ACTIVE COLOR_SLIDER_CURSOR_ACTIVE}</td></tr><tr><td>{@link #NK_COLOR_PROPERTY COLOR_PROPERTY}</td><td>{@link #NK_COLOR_EDIT COLOR_EDIT}</td><td>{@link #NK_COLOR_EDIT_CURSOR COLOR_EDIT_CURSOR}</td><td>{@link #NK_COLOR_COMBO COLOR_COMBO}</td></tr><tr><td>{@link #NK_COLOR_CHART COLOR_CHART}</td><td>{@link #NK_COLOR_CHART_COLOR COLOR_CHART_COLOR}</td><td>{@link #NK_COLOR_CHART_COLOR_HIGHLIGHT COLOR_CHART_COLOR_HIGHLIGHT}</td><td>{@link #NK_COLOR_SCROLLBAR COLOR_SCROLLBAR}</td></tr><tr><td>{@link #NK_COLOR_SCROLLBAR_CURSOR COLOR_SCROLLBAR_CURSOR}</td><td>{@link #NK_COLOR_SCROLLBAR_CURSOR_HOVER COLOR_SCROLLBAR_CURSOR_HOVER}</td><td>{@link #NK_COLOR_SCROLLBAR_CURSOR_ACTIVE COLOR_SCROLLBAR_CURSOR_ACTIVE}</td><td>{@link #NK_COLOR_TAB_HEADER COLOR_TAB_HEADER}</td></tr></table> */
    @Nullable
    @NativeType("char const *")
    public static String nk_style_get_color_by_name(@NativeType("enum nk_style_colors") int c) {
        long __result = nnk_style_get_color_by_name(c);
        return memUTF8Safe(__result);
    }

    // --- [ nk_style_set_font ] ---

    /** Unsafe version of: {@link #nk_style_set_font style_set_font} */
    public static native void nnk_style_set_font(long ctx, long font);

    /** @param ctx the nuklear context */
    public static void nk_style_set_font(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_user_font const *") NkUserFont font) {
        nnk_style_set_font(ctx.address(), font.address());
    }

    // --- [ nk_style_set_cursor ] ---

    /** Unsafe version of: {@link #nk_style_set_cursor style_set_cursor} */
    public static native int nnk_style_set_cursor(long ctx, int style);

    /**
     * @param ctx   the nuklear context
     * @param style one of:<br><table><tr><td>{@link #NK_CURSOR_ARROW CURSOR_ARROW}</td><td>{@link #NK_CURSOR_TEXT CURSOR_TEXT}</td><td>{@link #NK_CURSOR_MOVE CURSOR_MOVE}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_VERTICAL CURSOR_RESIZE_VERTICAL}</td><td>{@link #NK_CURSOR_RESIZE_HORIZONTAL CURSOR_RESIZE_HORIZONTAL}</td><td>{@link #NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT}</td></tr><tr><td>{@link #NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT}</td></tr></table>
     */
    public static int nk_style_set_cursor(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_style_cursor") int style) {
        return nnk_style_set_cursor(ctx.address(), style);
    }

    // --- [ nk_style_show_cursor ] ---

    /** Unsafe version of: {@link #nk_style_show_cursor style_show_cursor} */
    public static native void nnk_style_show_cursor(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_style_show_cursor(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_style_show_cursor(ctx.address());
    }

    // --- [ nk_style_hide_cursor ] ---

    /** Unsafe version of: {@link #nk_style_hide_cursor style_hide_cursor} */
    public static native void nnk_style_hide_cursor(long ctx);

    /** @param ctx the nuklear context */
    public static void nk_style_hide_cursor(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_style_hide_cursor(ctx.address());
    }

    // --- [ nk_style_push_font ] ---

    /** Unsafe version of: {@link #nk_style_push_font style_push_font} */
    public static native int nnk_style_push_font(long ctx, long font);

    /** @param ctx the nuklear context */
    public static int nk_style_push_font(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_user_font const *") NkUserFont font) {
        return nnk_style_push_font(ctx.address(), font.address());
    }

    // --- [ nk_style_push_float ] ---

    /** Unsafe version of: {@link #nk_style_push_float style_push_float} */
    public static native int nnk_style_push_float(long ctx, long address, float value);

    /** @param ctx the nuklear context */
    public static int nk_style_push_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("float *") FloatBuffer address, float value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_float(ctx.address(), memAddress(address), value);
    }

    // --- [ nk_style_push_vec2 ] ---

    /** Unsafe version of: {@link #nk_style_push_vec2 style_push_vec2} */
    public static native int nnk_style_push_vec2(long ctx, long address, long value);

    /** @param ctx the nuklear context */
    public static int nk_style_push_vec2(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2 *") NkVec2 address, @NativeType("struct nk_vec2") NkVec2 value) {
        return nnk_style_push_vec2(ctx.address(), address.address(), value.address());
    }

    // --- [ nk_style_push_style_item ] ---

    /** Unsafe version of: {@link #nk_style_push_style_item style_push_style_item} */
    public static native int nnk_style_push_style_item(long ctx, long address, long value);

    /** @param ctx the nuklear context */
    public static int nk_style_push_style_item(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_item *") NkStyleItem address, @NativeType("struct nk_style_item") NkStyleItem value) {
        return nnk_style_push_style_item(ctx.address(), address.address(), value.address());
    }

    // --- [ nk_style_push_flags ] ---

    /** Unsafe version of: {@link #nk_style_push_flags style_push_flags} */
    public static native int nnk_style_push_flags(long ctx, long address, int value);

    /** @param ctx the nuklear context */
    public static int nk_style_push_flags(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags *") IntBuffer address, @NativeType("nk_flags") int value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_flags(ctx.address(), memAddress(address), value);
    }

    // --- [ nk_style_push_color ] ---

    /** Unsafe version of: {@link #nk_style_push_color style_push_color} */
    public static native int nnk_style_push_color(long ctx, long address, long value);

    /** @param ctx the nuklear context */
    public static int nk_style_push_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color *") NkColor address, @NativeType("struct nk_color") NkColor value) {
        return nnk_style_push_color(ctx.address(), address.address(), value.address());
    }

    // --- [ nk_style_pop_font ] ---

    /** Unsafe version of: {@link #nk_style_pop_font style_pop_font} */
    public static native int nnk_style_pop_font(long ctx);

    /** @param ctx the nuklear context */
    public static int nk_style_pop_font(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_font(ctx.address());
    }

    // --- [ nk_style_pop_float ] ---

    /** Unsafe version of: {@link #nk_style_pop_float style_pop_float} */
    public static native int nnk_style_pop_float(long ctx);

    /** @param ctx the nuklear context */
    public static int nk_style_pop_float(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_float(ctx.address());
    }

    // --- [ nk_style_pop_vec2 ] ---

    /** Unsafe version of: {@link #nk_style_pop_vec2 style_pop_vec2} */
    public static native int nnk_style_pop_vec2(long ctx);

    /** @param ctx the nuklear context */
    public static int nk_style_pop_vec2(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_vec2(ctx.address());
    }

    // --- [ nk_style_pop_style_item ] ---

    /** Unsafe version of: {@link #nk_style_pop_style_item style_pop_style_item} */
    public static native int nnk_style_pop_style_item(long ctx);

    /** @param ctx the nuklear context */
    public static int nk_style_pop_style_item(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_style_item(ctx.address());
    }

    // --- [ nk_style_pop_flags ] ---

    /** Unsafe version of: {@link #nk_style_pop_flags style_pop_flags} */
    public static native int nnk_style_pop_flags(long ctx);

    /** @param ctx the nuklear context */
    public static int nk_style_pop_flags(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_flags(ctx.address());
    }

    // --- [ nk_style_pop_color ] ---

    /** Unsafe version of: {@link #nk_style_pop_color style_pop_color} */
    public static native int nnk_style_pop_color(long ctx);

    /** @param ctx the nuklear context */
    public static int nk_style_pop_color(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_color(ctx.address());
    }

    // --- [ nk_widget_bounds ] ---

    /** Unsafe version of: {@link #nk_widget_bounds widget_bounds} */
    public static native void nnk_widget_bounds(long ctx, long __result);

    /** @param ctx the nuklear context */
    @NativeType("struct nk_rect")
    public static NkRect nk_widget_bounds(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_widget_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_widget_position ] ---

    /** Unsafe version of: {@link #nk_widget_position widget_position} */
    public static native void nnk_widget_position(long ctx, long __result);

    /** @param ctx the nuklear context */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_widget_position(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_widget_position(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_widget_size ] ---

    /** Unsafe version of: {@link #nk_widget_size widget_size} */
    public static native void nnk_widget_size(long ctx, long __result);

    /** @param ctx the nuklear context */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_widget_size(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_widget_size(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_widget_width ] ---

    /** Unsafe version of: {@link #nk_widget_width widget_width} */
    public static native float nnk_widget_width(long ctx);

    /** @param ctx the nuklear context */
    public static float nk_widget_width(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_widget_width(ctx.address());
    }

    // --- [ nk_widget_height ] ---

    /** Unsafe version of: {@link #nk_widget_height widget_height} */
    public static native float nnk_widget_height(long ctx);

    /** @param ctx the nuklear context */
    public static float nk_widget_height(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_widget_height(ctx.address());
    }

    // --- [ nk_widget_is_hovered ] ---

    /** Unsafe version of: {@link #nk_widget_is_hovered widget_is_hovered} */
    public static native int nnk_widget_is_hovered(long ctx);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_widget_is_hovered(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_widget_is_hovered(ctx.address()) != 0;
    }

    // --- [ nk_widget_is_mouse_clicked ] ---

    /** Unsafe version of: {@link #nk_widget_is_mouse_clicked widget_is_mouse_clicked} */
    public static native int nnk_widget_is_mouse_clicked(long ctx, int btn);

    /** @param ctx the nuklear context */
    @NativeType("int")
    public static boolean nk_widget_is_mouse_clicked(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_buttons") int btn) {
        return nnk_widget_is_mouse_clicked(ctx.address(), btn) != 0;
    }

    // --- [ nk_widget_has_mouse_click_down ] ---

    /** Unsafe version of: {@link #nk_widget_has_mouse_click_down widget_has_mouse_click_down} */
    public static native int nnk_widget_has_mouse_click_down(long ctx, int btn, int down);

    /**
     * @param ctx the nuklear context
     * @param btn one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table>
     */
    @NativeType("int")
    public static boolean nk_widget_has_mouse_click_down(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_buttons") int btn, @NativeType("int") boolean down) {
        return nnk_widget_has_mouse_click_down(ctx.address(), btn, down ? 1 : 0) != 0;
    }

    // --- [ nk_spacing ] ---

    /** Unsafe version of: {@link #nk_spacing spacing} */
    public static native void nnk_spacing(long ctx, int cols);

    /** @param ctx the nuklear context */
    public static void nk_spacing(@NativeType("struct nk_context *") NkContext ctx, int cols) {
        nnk_spacing(ctx.address(), cols);
    }

    // --- [ nk_widget ] ---

    /** Unsafe version of: {@link #nk_widget widget} */
    public static native int nnk_widget(long bounds, long ctx);

    /** @param ctx the nuklear context */
    @NativeType("enum nk_widget_layout_states")
    public static int nk_widget(@NativeType("struct nk_rect *") NkRect bounds, @NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_widget(bounds.address(), ctx.address());
    }

    // --- [ nk_widget_fitting ] ---

    /** Unsafe version of: {@link #nk_widget_fitting widget_fitting} */
    public static native int nnk_widget_fitting(long bounds, long ctx, long item_padding);

    /** @param ctx the nuklear context */
    @NativeType("enum nk_widget_layout_states")
    public static int nk_widget_fitting(@NativeType("struct nk_rect *") NkRect bounds, @NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 item_padding) {
        return nnk_widget_fitting(bounds.address(), ctx.address(), item_padding.address());
    }

    // --- [ nk_rgb ] ---

    public static native void nnk_rgb(int r, int g, int b, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb(int r, int g, int b, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb(r, g, b, __result.address());
        return __result;
    }

    // --- [ nk_rgb_iv ] ---

    public static native void nnk_rgb_iv(long rgb, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_iv(@NativeType("int const *") IntBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_iv(memAddress(rgb), __result.address());
        return __result;
    }

    // --- [ nk_rgb_bv ] ---

    public static native void nnk_rgb_bv(long rgb, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_bv(@NativeType("nk_byte const *") ByteBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_bv(memAddress(rgb), __result.address());
        return __result;
    }

    // --- [ nk_rgb_f ] ---

    public static native void nnk_rgb_f(float r, float g, float b, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_f(float r, float g, float b, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb_f(r, g, b, __result.address());
        return __result;
    }

    // --- [ nk_rgb_fv ] ---

    public static native void nnk_rgb_fv(long rgb, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_fv(@NativeType("float const *") FloatBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_fv(memAddress(rgb), __result.address());
        return __result;
    }

    // --- [ nk_rgb_cf ] ---

    public static native void nnk_rgb_cf(long c, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_cf(@NativeType("struct nk_colorf") NkColorf c, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb_cf(c.address(), __result.address());
        return __result;
    }

    // --- [ nk_rgb_hex ] ---

    public static native void nnk_rgb_hex(long rgb, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_hex(@NativeType("char const *") ByteBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 6);
        }
        nnk_rgb_hex(memAddress(rgb), __result.address());
        return __result;
    }

    @NativeType("struct nk_color")
    public static NkColor nk_rgb_hex(@NativeType("char const *") CharSequence rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 6);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(rgb, true);
            long rgbEncoded = stack.getPointerAddress();
            nnk_rgb_hex(rgbEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_rgba ] ---

    public static native void nnk_rgba(int r, int g, int b, int a, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba(int r, int g, int b, int a, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nk_rgba_u32 ] ---

    public static native void nnk_rgba_u32(int in, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_u32(@NativeType("nk_uint") int in, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba_u32(in, __result.address());
        return __result;
    }

    // --- [ nk_rgba_iv ] ---

    public static native void nnk_rgba_iv(long rgba, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_iv(@NativeType("int const *") IntBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_iv(memAddress(rgba), __result.address());
        return __result;
    }

    // --- [ nk_rgba_bv ] ---

    public static native void nnk_rgba_bv(long rgba, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_bv(@NativeType("nk_byte const *") ByteBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_bv(memAddress(rgba), __result.address());
        return __result;
    }

    // --- [ nk_rgba_f ] ---

    public static native void nnk_rgba_f(float r, float g, float b, float a, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_f(float r, float g, float b, float a, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba_f(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nk_rgba_fv ] ---

    public static native void nnk_rgba_fv(long rgba, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_fv(@NativeType("float const *") FloatBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_fv(memAddress(rgba), __result.address());
        return __result;
    }

    // --- [ nk_rgba_cf ] ---

    public static native void nnk_rgba_cf(long c, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_cf(@NativeType("struct nk_colorf") NkColorf c, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba_cf(c.address(), __result.address());
        return __result;
    }

    // --- [ nk_rgba_hex ] ---

    public static native void nnk_rgba_hex(long rgba, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_hex(@NativeType("char const *") ByteBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 8);
        }
        nnk_rgba_hex(memAddress(rgba), __result.address());
        return __result;
    }

    @NativeType("struct nk_color")
    public static NkColor nk_rgba_hex(@NativeType("char const *") CharSequence rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 8);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(rgba, true);
            long rgbaEncoded = stack.getPointerAddress();
            nnk_rgba_hex(rgbaEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_hsva_colorf ] ---

    public static native void nnk_hsva_colorf(float h, float s, float v, float a, long __result);

    @NativeType("struct nk_colorf")
    public static NkColorf nk_hsva_colorf(float h, float s, float v, float a, @NativeType("struct nk_colorf") NkColorf __result) {
        nnk_hsva_colorf(h, s, v, a, __result.address());
        return __result;
    }

    // --- [ nk_hsva_colorfv ] ---

    public static native void nnk_hsva_colorfv(long c, long __result);

    @NativeType("struct nk_colorf")
    public static NkColorf nk_hsva_colorfv(@NativeType("float *") FloatBuffer c, @NativeType("struct nk_colorf") NkColorf __result) {
        if (CHECKS) {
            check(c, 4);
        }
        nnk_hsva_colorfv(memAddress(c), __result.address());
        return __result;
    }

    // --- [ nk_colorf_hsva_f ] ---

    public static native void nnk_colorf_hsva_f(long out_h, long out_s, long out_v, long out_a, long in);

    public static void nk_colorf_hsva_f(@NativeType("float *") FloatBuffer out_h, @NativeType("float *") FloatBuffer out_s, @NativeType("float *") FloatBuffer out_v, @NativeType("float *") FloatBuffer out_a, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
            check(out_a, 1);
        }
        nnk_colorf_hsva_f(memAddress(out_h), memAddress(out_s), memAddress(out_v), memAddress(out_a), in.address());
    }

    // --- [ nk_colorf_hsva_fv ] ---

    public static native void nnk_colorf_hsva_fv(long hsva, long in);

    public static void nk_colorf_hsva_fv(@NativeType("float *") FloatBuffer hsva, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_colorf_hsva_fv(memAddress(hsva), in.address());
    }

    // --- [ nk_hsv ] ---

    public static native void nnk_hsv(int h, int s, int v, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsv(int h, int s, int v, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsv(h, s, v, __result.address());
        return __result;
    }

    // --- [ nk_hsv_iv ] ---

    public static native void nnk_hsv_iv(long hsv, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsv_iv(@NativeType("int const *") IntBuffer hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_iv(memAddress(hsv), __result.address());
        return __result;
    }

    // --- [ nk_hsv_bv ] ---

    public static native void nnk_hsv_bv(long hsv, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsv_bv(@NativeType("nk_byte const *") ByteBuffer hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_bv(memAddress(hsv), __result.address());
        return __result;
    }

    // --- [ nk_hsv_f ] ---

    public static native void nnk_hsv_f(float h, float s, float v, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsv_f(float h, float s, float v, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsv_f(h, s, v, __result.address());
        return __result;
    }

    // --- [ nk_hsv_fv ] ---

    public static native void nnk_hsv_fv(long hsv, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsv_fv(@NativeType("float const *") FloatBuffer hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_fv(memAddress(hsv), __result.address());
        return __result;
    }

    // --- [ nk_hsva ] ---

    public static native void nnk_hsva(int h, int s, int v, int a, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsva(int h, int s, int v, int a, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsva(h, s, v, a, __result.address());
        return __result;
    }

    // --- [ nk_hsva_iv ] ---

    public static native void nnk_hsva_iv(long hsva, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsva_iv(@NativeType("int const *") IntBuffer hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_iv(memAddress(hsva), __result.address());
        return __result;
    }

    // --- [ nk_hsva_bv ] ---

    public static native void nnk_hsva_bv(long hsva, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsva_bv(@NativeType("nk_byte const *") ByteBuffer hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_bv(memAddress(hsva), __result.address());
        return __result;
    }

    // --- [ nk_hsva_f ] ---

    public static native void nnk_hsva_f(float h, float s, float v, float a, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsva_f(float h, float s, float v, float a, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsva_f(h, s, v, a, __result.address());
        return __result;
    }

    // --- [ nk_hsva_fv ] ---

    public static native void nnk_hsva_fv(long hsva, long __result);

    @NativeType("struct nk_color")
    public static NkColor nk_hsva_fv(@NativeType("float const *") FloatBuffer hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_fv(memAddress(hsva), __result.address());
        return __result;
    }

    // --- [ nk_color_f ] ---

    public static native void nnk_color_f(long r, long g, long b, long a, long color);

    public static void nk_color_f(@NativeType("float *") FloatBuffer r, @NativeType("float *") FloatBuffer g, @NativeType("float *") FloatBuffer b, @NativeType("float *") FloatBuffer a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        nnk_color_f(memAddress(r), memAddress(g), memAddress(b), memAddress(a), color.address());
    }

    // --- [ nk_color_fv ] ---

    public static native void nnk_color_fv(long rgba_out, long color);

    public static void nk_color_fv(@NativeType("float *") FloatBuffer rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_fv(memAddress(rgba_out), color.address());
    }

    // --- [ nk_color_cf ] ---

    public static native void nnk_color_cf(long color, long __result);

    @NativeType("struct nk_colorf")
    public static NkColorf nk_color_cf(@NativeType("struct nk_color") NkColor color, @NativeType("struct nk_colorf") NkColorf __result) {
        nnk_color_cf(color.address(), __result.address());
        return __result;
    }

    // --- [ nk_color_d ] ---

    public static native void nnk_color_d(long r, long g, long b, long a, long color);

    public static void nk_color_d(@NativeType("double *") DoubleBuffer r, @NativeType("double *") DoubleBuffer g, @NativeType("double *") DoubleBuffer b, @NativeType("double *") DoubleBuffer a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        nnk_color_d(memAddress(r), memAddress(g), memAddress(b), memAddress(a), color.address());
    }

    // --- [ nk_color_dv ] ---

    public static native void nnk_color_dv(long rgba_out, long color);

    public static void nk_color_dv(@NativeType("double *") DoubleBuffer rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_dv(memAddress(rgba_out), color.address());
    }

    // --- [ nk_color_u32 ] ---

    public static native int nnk_color_u32(long color);

    @NativeType("nk_uint")
    public static int nk_color_u32(@NativeType("struct nk_color") NkColor color) {
        return nnk_color_u32(color.address());
    }

    // --- [ nk_color_hex_rgba ] ---

    public static native void nnk_color_hex_rgba(long output, long color);

    public static void nk_color_hex_rgba(@NativeType("char *") ByteBuffer output, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(output, 8);
        }
        nnk_color_hex_rgba(memAddress(output), color.address());
    }

    // --- [ nk_color_hex_rgb ] ---

    public static native void nnk_color_hex_rgb(long output, long color);

    public static void nk_color_hex_rgb(@NativeType("char *") ByteBuffer output, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(output, 6);
        }
        nnk_color_hex_rgb(memAddress(output), color.address());
    }

    // --- [ nk_color_hsv_i ] ---

    public static native void nnk_color_hsv_i(long out_h, long out_s, long out_v, long color);

    public static void nk_color_hsv_i(@NativeType("int *") IntBuffer out_h, @NativeType("int *") IntBuffer out_s, @NativeType("int *") IntBuffer out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_i(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
    }

    // --- [ nk_color_hsv_b ] ---

    public static native void nnk_color_hsv_b(long out_h, long out_s, long out_v, long color);

    public static void nk_color_hsv_b(@NativeType("nk_byte *") ByteBuffer out_h, @NativeType("nk_byte *") ByteBuffer out_s, @NativeType("nk_byte *") ByteBuffer out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_b(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
    }

    // --- [ nk_color_hsv_iv ] ---

    public static native void nnk_color_hsv_iv(long hsv_out, long color);

    public static void nk_color_hsv_iv(@NativeType("int *") IntBuffer hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_iv(memAddress(hsv_out), color.address());
    }

    // --- [ nk_color_hsv_bv ] ---

    public static native void nnk_color_hsv_bv(long hsv_out, long color);

    public static void nk_color_hsv_bv(@NativeType("nk_byte *") ByteBuffer hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_bv(memAddress(hsv_out), color.address());
    }

    // --- [ nk_color_hsv_f ] ---

    public static native void nnk_color_hsv_f(long out_h, long out_s, long out_v, long color);

    public static void nk_color_hsv_f(@NativeType("float *") FloatBuffer out_h, @NativeType("float *") FloatBuffer out_s, @NativeType("float *") FloatBuffer out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_f(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
    }

    // --- [ nk_color_hsv_fv ] ---

    public static native void nnk_color_hsv_fv(long hsv_out, long color);

    public static void nk_color_hsv_fv(@NativeType("float *") FloatBuffer hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_fv(memAddress(hsv_out), color.address());
    }

    // --- [ nk_color_hsva_i ] ---

    public static native void nnk_color_hsva_i(long h, long s, long v, long a, long color);

    public static void nk_color_hsva_i(@NativeType("int *") IntBuffer h, @NativeType("int *") IntBuffer s, @NativeType("int *") IntBuffer v, @NativeType("int *") IntBuffer a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(h, 1);
            check(s, 1);
            check(v, 1);
            check(a, 1);
        }
        nnk_color_hsva_i(memAddress(h), memAddress(s), memAddress(v), memAddress(a), color.address());
    }

    // --- [ nk_color_hsva_b ] ---

    public static native void nnk_color_hsva_b(long h, long s, long v, long a, long color);

    public static void nk_color_hsva_b(@NativeType("nk_byte *") ByteBuffer h, @NativeType("nk_byte *") ByteBuffer s, @NativeType("nk_byte *") ByteBuffer v, @NativeType("nk_byte *") ByteBuffer a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(h, 1);
            check(s, 1);
            check(v, 1);
            check(a, 1);
        }
        nnk_color_hsva_b(memAddress(h), memAddress(s), memAddress(v), memAddress(a), color.address());
    }

    // --- [ nk_color_hsva_iv ] ---

    public static native void nnk_color_hsva_iv(long hsva_out, long color);

    public static void nk_color_hsva_iv(@NativeType("int *") IntBuffer hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_iv(memAddress(hsva_out), color.address());
    }

    // --- [ nk_color_hsva_bv ] ---

    public static native void nnk_color_hsva_bv(long hsva_out, long color);

    public static void nk_color_hsva_bv(@NativeType("nk_byte *") ByteBuffer hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_bv(memAddress(hsva_out), color.address());
    }

    // --- [ nk_color_hsva_f ] ---

    public static native void nnk_color_hsva_f(long out_h, long out_s, long out_v, long out_a, long color);

    public static void nk_color_hsva_f(@NativeType("float *") FloatBuffer out_h, @NativeType("float *") FloatBuffer out_s, @NativeType("float *") FloatBuffer out_v, @NativeType("float *") FloatBuffer out_a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
            check(out_a, 1);
        }
        nnk_color_hsva_f(memAddress(out_h), memAddress(out_s), memAddress(out_v), memAddress(out_a), color.address());
    }

    // --- [ nk_color_hsva_fv ] ---

    public static native void nnk_color_hsva_fv(long hsva_out, long color);

    public static void nk_color_hsva_fv(@NativeType("float *") FloatBuffer hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_fv(memAddress(hsva_out), color.address());
    }

    // --- [ nk_handle_ptr ] ---

    public static native void nnk_handle_ptr(long ptr, long __result);

    @NativeType("nk_handle")
    public static NkHandle nk_handle_ptr(@NativeType("void *") long ptr, @NativeType("nk_handle") NkHandle __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_handle_ptr(ptr, __result.address());
        return __result;
    }

    // --- [ nk_handle_id ] ---

    public static native void nnk_handle_id(int id, long __result);

    @NativeType("nk_handle")
    public static NkHandle nk_handle_id(int id, @NativeType("nk_handle") NkHandle __result) {
        nnk_handle_id(id, __result.address());
        return __result;
    }

    // --- [ nk_image_handle ] ---

    public static native void nnk_image_handle(long handle, long __result);

    @NativeType("struct nk_image")
    public static NkImage nk_image_handle(@NativeType("nk_handle") NkHandle handle, @NativeType("struct nk_image") NkImage __result) {
        nnk_image_handle(handle.address(), __result.address());
        return __result;
    }

    // --- [ nk_image_ptr ] ---

    public static native void nnk_image_ptr(long ptr, long __result);

    @NativeType("struct nk_image")
    public static NkImage nk_image_ptr(@NativeType("void *") long ptr, @NativeType("struct nk_image") NkImage __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_image_ptr(ptr, __result.address());
        return __result;
    }

    // --- [ nk_image_id ] ---

    public static native void nnk_image_id(int id, long __result);

    @NativeType("struct nk_image")
    public static NkImage nk_image_id(int id, @NativeType("struct nk_image") NkImage __result) {
        nnk_image_id(id, __result.address());
        return __result;
    }

    // --- [ nk_image_is_subimage ] ---

    public static native int nnk_image_is_subimage(long img);

    @NativeType("int")
    public static boolean nk_image_is_subimage(@NativeType("struct nk_image const *") NkImage img) {
        return nnk_image_is_subimage(img.address()) != 0;
    }

    // --- [ nk_subimage_ptr ] ---

    public static native void nnk_subimage_ptr(long ptr, short w, short h, long sub_region, long __result);

    @NativeType("struct nk_image")
    public static NkImage nk_subimage_ptr(@NativeType("void *") long ptr, @NativeType("unsigned short") short w, @NativeType("unsigned short") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("struct nk_image") NkImage __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_subimage_ptr(ptr, w, h, sub_region.address(), __result.address());
        return __result;
    }

    // --- [ nk_subimage_id ] ---

    public static native void nnk_subimage_id(int id, short w, short h, long sub_region, long __result);

    @NativeType("struct nk_image")
    public static NkImage nk_subimage_id(int id, @NativeType("unsigned short") short w, @NativeType("unsigned short") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("struct nk_image") NkImage __result) {
        nnk_subimage_id(id, w, h, sub_region.address(), __result.address());
        return __result;
    }

    // --- [ nk_subimage_handle ] ---

    public static native void nnk_subimage_handle(long handle, short w, short h, long sub_region, long __result);

    @NativeType("struct nk_image")
    public static NkImage nk_subimage_handle(@NativeType("nk_handle") NkHandle handle, @NativeType("unsigned short") short w, @NativeType("unsigned short") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("struct nk_image") NkImage __result) {
        nnk_subimage_handle(handle.address(), w, h, sub_region.address(), __result.address());
        return __result;
    }

    // --- [ nk_murmur_hash ] ---

    public static native int nnk_murmur_hash(long key, int len, int seed);

    @NativeType("nk_hash")
    public static int nk_murmur_hash(@NativeType("void const *") ByteBuffer key, @NativeType("nk_hash") int seed) {
        return nnk_murmur_hash(memAddress(key), key.remaining(), seed);
    }

    // --- [ nk_triangle_from_direction ] ---

    /** Unsafe version of: {@link #nk_triangle_from_direction triangle_from_direction} */
    public static native void nnk_triangle_from_direction(long result, long r, float pad_x, float pad_y, int direction);

    /** @param direction one of:<br><table><tr><td>{@link #NK_UP UP}</td><td>{@link #NK_RIGHT RIGHT}</td><td>{@link #NK_DOWN DOWN}</td><td>{@link #NK_LEFT LEFT}</td></tr></table> */
    public static void nk_triangle_from_direction(@NativeType("struct nk_vec2 *") NkVec2 result, @NativeType("struct nk_rect") NkRect r, float pad_x, float pad_y, @NativeType("enum nk_heading") int direction) {
        nnk_triangle_from_direction(result.address(), r.address(), pad_x, pad_y, direction);
    }

    // --- [ nk_vec2 ] ---

    public static native void nnk_vec2(float x, float y, long __result);

    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2(float x, float y, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_vec2(x, y, __result.address());
        return __result;
    }

    // --- [ nk_vec2i ] ---

    public static native void nnk_vec2i(int x, int y, long __result);

    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2i(int x, int y, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_vec2i(x, y, __result.address());
        return __result;
    }

    // --- [ nk_vec2v ] ---

    public static native void nnk_vec2v(long xy, long __result);

    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2v(@NativeType("float const *") FloatBuffer xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2v(memAddress(xy), __result.address());
        return __result;
    }

    // --- [ nk_vec2iv ] ---

    public static native void nnk_vec2iv(long xy, long __result);

    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2iv(@NativeType("int const *") IntBuffer xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2iv(memAddress(xy), __result.address());
        return __result;
    }

    // --- [ nk_get_null_rect ] ---

    public static native void nnk_get_null_rect(long __result);

    @NativeType("struct nk_rect")
    public static NkRect nk_get_null_rect(@NativeType("struct nk_rect") NkRect __result) {
        nnk_get_null_rect(__result.address());
        return __result;
    }

    // --- [ nk_rect ] ---

    public static native void nnk_rect(float x, float y, float w, float h, long __result);

    @NativeType("struct nk_rect")
    public static NkRect nk_rect(float x, float y, float w, float h, @NativeType("struct nk_rect") NkRect __result) {
        nnk_rect(x, y, w, h, __result.address());
        return __result;
    }

    // --- [ nk_recti ] ---

    public static native void nnk_recti(int x, int y, int w, int h, long __result);

    @NativeType("struct nk_rect")
    public static NkRect nk_recti(int x, int y, int w, int h, @NativeType("struct nk_rect") NkRect __result) {
        nnk_recti(x, y, w, h, __result.address());
        return __result;
    }

    // --- [ nk_recta ] ---

    public static native void nnk_recta(long pos, long size, long __result);

    @NativeType("struct nk_rect")
    public static NkRect nk_recta(@NativeType("struct nk_vec2") NkVec2 pos, @NativeType("struct nk_vec2") NkVec2 size, @NativeType("struct nk_rect") NkRect __result) {
        nnk_recta(pos.address(), size.address(), __result.address());
        return __result;
    }

    // --- [ nk_rectv ] ---

    public static native void nnk_rectv(long xywh, long __result);

    @NativeType("struct nk_rect")
    public static NkRect nk_rectv(@NativeType("float const *") FloatBuffer xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectv(memAddress(xywh), __result.address());
        return __result;
    }

    // --- [ nk_rectiv ] ---

    public static native void nnk_rectiv(long xywh, long __result);

    @NativeType("struct nk_rect")
    public static NkRect nk_rectiv(@NativeType("int const *") IntBuffer xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectiv(memAddress(xywh), __result.address());
        return __result;
    }

    // --- [ nk_rect_pos ] ---

    public static native void nnk_rect_pos(long r, long __result);

    @NativeType("struct nk_vec2")
    public static NkVec2 nk_rect_pos(@NativeType("struct nk_rect") NkRect r, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_rect_pos(r.address(), __result.address());
        return __result;
    }

    // --- [ nk_rect_size ] ---

    public static native void nnk_rect_size(long r, long __result);

    @NativeType("struct nk_vec2")
    public static NkVec2 nk_rect_size(@NativeType("struct nk_rect") NkRect r, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_rect_size(r.address(), __result.address());
        return __result;
    }

    // --- [ nk_strlen ] ---

    public static native int nnk_strlen(long str);

    public static int nk_strlen(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_strlen(memAddress(str));
    }

    public static int nk_strlen(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_strlen(strEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_stricmp ] ---

    public static native int nnk_stricmp(long s1, long s2);

    public static int nk_stricmp(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2) {
        if (CHECKS) {
            checkNT1(s1);
            checkNT1(s2);
        }
        return nnk_stricmp(memAddress(s1), memAddress(s2));
    }

    public static int nk_stricmp(@NativeType("char const *") CharSequence s1, @NativeType("char const *") CharSequence s2) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s1, true);
            long s1Encoded = stack.getPointerAddress();
            stack.nUTF8(s2, true);
            long s2Encoded = stack.getPointerAddress();
            return nnk_stricmp(s1Encoded, s2Encoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_stricmpn ] ---

    public static native int nnk_stricmpn(long s1, long s2, int n);

    public static int nk_stricmpn(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2, int n) {
        if (CHECKS) {
            checkNT1(s1);
            checkNT1(s2);
        }
        return nnk_stricmpn(memAddress(s1), memAddress(s2), n);
    }

    public static int nk_stricmpn(@NativeType("char const *") CharSequence s1, @NativeType("char const *") CharSequence s2, int n) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(s1, true);
            long s1Encoded = stack.getPointerAddress();
            stack.nUTF8(s2, true);
            long s2Encoded = stack.getPointerAddress();
            return nnk_stricmpn(s1Encoded, s2Encoded, n);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strtoi ] ---

    public static native int nnk_strtoi(long str, long endptr);

    public static int nk_strtoi(@NativeType("char const *") ByteBuffer str, @NativeType("char const **") PointerBuffer endptr) {
        if (CHECKS) {
            checkNT1(str);
            check(endptr, 1);
        }
        return nnk_strtoi(memAddress(str), memAddress(endptr));
    }

    public static int nk_strtoi(@NativeType("char const *") CharSequence str, @NativeType("char const **") PointerBuffer endptr) {
        if (CHECKS) {
            check(endptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_strtoi(strEncoded, memAddress(endptr));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strtof ] ---

    public static native float nnk_strtof(long str, long endptr);

    public static float nk_strtof(@NativeType("char const *") ByteBuffer str, @NativeType("char const **") PointerBuffer endptr) {
        if (CHECKS) {
            checkNT1(str);
            check(endptr, 1);
        }
        return nnk_strtof(memAddress(str), memAddress(endptr));
    }

    public static float nk_strtof(@NativeType("char const *") CharSequence str, @NativeType("char const **") PointerBuffer endptr) {
        if (CHECKS) {
            check(endptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_strtof(strEncoded, memAddress(endptr));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strtod ] ---

    public static native double nnk_strtod(long str, long endptr);

    public static double nk_strtod(@NativeType("char const *") ByteBuffer str, @NativeType("char const **") PointerBuffer endptr) {
        if (CHECKS) {
            checkNT1(str);
            check(endptr, 1);
        }
        return nnk_strtod(memAddress(str), memAddress(endptr));
    }

    public static double nk_strtod(@NativeType("char const *") CharSequence str, @NativeType("char const **") PointerBuffer endptr) {
        if (CHECKS) {
            check(endptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_strtod(strEncoded, memAddress(endptr));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strfilter ] ---

    /** Unsafe version of: {@link #nk_strfilter strfilter} */
    public static native int nnk_strfilter(long str, long regexp);

    /**
     * <ul>
     * <li>c - matches any literal character c</li>
     * <li>. - matches any single character</li>
     * <li>^ - matches the beginning of the input string</li>
     * <li>$ - matches the end of the input string</li>
     * <li>* - matches zero or more occurrences of the previous character</li>
     * </ul>
     */
    @NativeType("int")
    public static boolean nk_strfilter(@NativeType("char const *") ByteBuffer str, @NativeType("char const *") ByteBuffer regexp) {
        if (CHECKS) {
            checkNT1(str);
            checkNT1(regexp);
        }
        return nnk_strfilter(memAddress(str), memAddress(regexp)) != 0;
    }

    /**
     * <ul>
     * <li>c - matches any literal character c</li>
     * <li>. - matches any single character</li>
     * <li>^ - matches the beginning of the input string</li>
     * <li>$ - matches the end of the input string</li>
     * <li>* - matches zero or more occurrences of the previous character</li>
     * </ul>
     */
    @NativeType("int")
    public static boolean nk_strfilter(@NativeType("char const *") CharSequence str, @NativeType("char const *") CharSequence regexp) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            stack.nUTF8(regexp, true);
            long regexpEncoded = stack.getPointerAddress();
            return nnk_strfilter(strEncoded, regexpEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strmatch_fuzzy_string ] ---

    /** Unsafe version of: {@link #nk_strmatch_fuzzy_string strmatch_fuzzy_string} */
    public static native int nnk_strmatch_fuzzy_string(long str, long pattern, long out_score);

    /**
     * Returns true if each character in {@code pattern} is found sequentially within {@code str} if found then {@code out_score} is also set. Score value
     * has no intrinsic meaning. Range varies with {@code pattern}. Can only compare scores with same search pattern.
     */
    @NativeType("int")
    public static boolean nk_strmatch_fuzzy_string(@NativeType("char const *") ByteBuffer str, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") IntBuffer out_score) {
        if (CHECKS) {
            checkNT1(str);
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_string(memAddress(str), memAddress(pattern), memAddress(out_score)) != 0;
    }

    /**
     * Returns true if each character in {@code pattern} is found sequentially within {@code str} if found then {@code out_score} is also set. Score value
     * has no intrinsic meaning. Range varies with {@code pattern}. Can only compare scores with same search pattern.
     */
    @NativeType("int")
    public static boolean nk_strmatch_fuzzy_string(@NativeType("char const *") CharSequence str, @NativeType("char const *") CharSequence pattern, @NativeType("int *") IntBuffer out_score) {
        if (CHECKS) {
            check(out_score, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            stack.nUTF8(pattern, true);
            long patternEncoded = stack.getPointerAddress();
            return nnk_strmatch_fuzzy_string(strEncoded, patternEncoded, memAddress(out_score)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strmatch_fuzzy_text ] ---

    public static native int nnk_strmatch_fuzzy_text(long txt, int txt_len, long pattern, long out_score);

    public static int nk_strmatch_fuzzy_text(@NativeType("char const *") ByteBuffer txt, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") IntBuffer out_score) {
        if (CHECKS) {
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_text(memAddress(txt), txt.remaining(), memAddress(pattern), memAddress(out_score));
    }

    public static int nk_strmatch_fuzzy_text(@NativeType("char const *") CharSequence txt, @NativeType("char const *") CharSequence pattern, @NativeType("int *") IntBuffer out_score) {
        if (CHECKS) {
            check(out_score, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int txtEncodedLength = stack.nUTF8(txt, false);
            long txtEncoded = stack.getPointerAddress();
            stack.nUTF8(pattern, true);
            long patternEncoded = stack.getPointerAddress();
            return nnk_strmatch_fuzzy_text(txtEncoded, txtEncodedLength, patternEncoded, memAddress(out_score));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_utf_decode ] ---

    public static native int nnk_utf_decode(long c, long u, int clen);

    public static int nk_utf_decode(@NativeType("char const *") ByteBuffer c, @NativeType("nk_rune *") IntBuffer u) {
        if (CHECKS) {
            check(u, 1);
        }
        return nnk_utf_decode(memAddress(c), memAddress(u), c.remaining());
    }

    // --- [ nk_utf_encode ] ---

    public static native int nnk_utf_encode(int u, long c, int clen);

    public static int nk_utf_encode(@NativeType("nk_rune") int u, @NativeType("char *") ByteBuffer c) {
        return nnk_utf_encode(u, memAddress(c), c.remaining());
    }

    // --- [ nk_utf_len ] ---

    public static native int nnk_utf_len(long str, int byte_len);

    public static int nk_utf_len(@NativeType("char const *") ByteBuffer str) {
        return nnk_utf_len(memAddress(str), str.remaining());
    }

    // --- [ nk_utf_at ] ---

    public static native long nnk_utf_at(long buffer, int length, int index, long unicode, long len);

    @Nullable
    @NativeType("char const *")
    public static ByteBuffer nk_utf_at(@NativeType("char const *") ByteBuffer buffer, int index, @NativeType("nk_rune *") IntBuffer unicode) {
        if (CHECKS) {
            check(unicode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer len = stack.callocInt(1);
            long __result = nnk_utf_at(memAddress(buffer), buffer.remaining(), index, memAddress(unicode), memAddress(len));
            return memByteBufferSafe(__result, len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_buffer_init ] ---

    public static native void nnk_buffer_init(long buffer, long allocator, long size);

    public static void nk_buffer_init(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("struct nk_allocator const *") NkAllocator allocator, @NativeType("nk_size") long size) {
        nnk_buffer_init(buffer.address(), allocator.address(), size);
    }

    // --- [ nk_buffer_init_fixed ] ---

    public static native void nnk_buffer_init_fixed(long buffer, long memory, long size);

    public static void nk_buffer_init_fixed(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("void *") ByteBuffer memory) {
        nnk_buffer_init_fixed(buffer.address(), memAddress(memory), memory.remaining());
    }

    // --- [ nk_buffer_info ] ---

    public static native void nnk_buffer_info(long status, long buffer);

    public static void nk_buffer_info(@NativeType("struct nk_memory_status *") NkMemoryStatus status, @NativeType("struct nk_buffer *") NkBuffer buffer) {
        nnk_buffer_info(status.address(), buffer.address());
    }

    // --- [ nk_buffer_push ] ---

    /** Unsafe version of: {@link #nk_buffer_push buffer_push} */
    public static native void nnk_buffer_push(long buffer, int type, long memory, long size, long align);

    /** @param type one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table> */
    public static void nk_buffer_push(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("enum nk_buffer_allocation_type") int type, @NativeType("void const *") ByteBuffer memory, @NativeType("nk_size") long align) {
        nnk_buffer_push(buffer.address(), type, memAddress(memory), memory.remaining(), align);
    }

    // --- [ nk_buffer_mark ] ---

    /** Unsafe version of: {@link #nk_buffer_mark buffer_mark} */
    public static native void nnk_buffer_mark(long buffer, int type);

    /** @param type one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table> */
    public static void nk_buffer_mark(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("enum nk_buffer_allocation_type") int type) {
        nnk_buffer_mark(buffer.address(), type);
    }

    // --- [ nk_buffer_reset ] ---

    /** Unsafe version of: {@link #nk_buffer_reset buffer_reset} */
    public static native void nnk_buffer_reset(long buffer, int type);

    /** @param type one of:<br><table><tr><td>{@link #NK_BUFFER_FRONT BUFFER_FRONT}</td><td>{@link #NK_BUFFER_BACK BUFFER_BACK}</td><td>{@link #NK_BUFFER_MAX BUFFER_MAX}</td></tr></table> */
    public static void nk_buffer_reset(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("enum nk_buffer_allocation_type") int type) {
        nnk_buffer_reset(buffer.address(), type);
    }

    // --- [ nk_buffer_clear ] ---

    public static native void nnk_buffer_clear(long buffer);

    public static void nk_buffer_clear(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        nnk_buffer_clear(buffer.address());
    }

    // --- [ nk_buffer_free ] ---

    public static native void nnk_buffer_free(long buffer);

    public static void nk_buffer_free(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        nnk_buffer_free(buffer.address());
    }

    // --- [ nk_buffer_memory ] ---

    public static native long nnk_buffer_memory(long buffer);

    @NativeType("void *")
    public static long nk_buffer_memory(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        return nnk_buffer_memory(buffer.address());
    }

    // --- [ nk_buffer_memory_const ] ---

    public static native long nnk_buffer_memory_const(long buffer);

    @NativeType("void const *")
    public static long nk_buffer_memory_const(@NativeType("struct nk_buffer const *") NkBuffer buffer) {
        return nnk_buffer_memory_const(buffer.address());
    }

    // --- [ nk_buffer_total ] ---

    public static native long nnk_buffer_total(long buffer);

    @NativeType("nk_size")
    public static long nk_buffer_total(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        return nnk_buffer_total(buffer.address());
    }

    // --- [ nk_str_init ] ---

    public static native void nnk_str_init(long str, long allocator, long size);

    public static void nk_str_init(@NativeType("struct nk_str *") NkStr str, @NativeType("struct nk_allocator const *") NkAllocator allocator, @NativeType("nk_size") long size) {
        nnk_str_init(str.address(), allocator.address(), size);
    }

    // --- [ nk_str_init_fixed ] ---

    public static native void nnk_str_init_fixed(long str, long memory, long size);

    public static void nk_str_init_fixed(@NativeType("struct nk_str *") NkStr str, @NativeType("void *") ByteBuffer memory) {
        nnk_str_init_fixed(str.address(), memAddress(memory), memory.remaining());
    }

    // --- [ nk_str_clear ] ---

    public static native void nnk_str_clear(long str);

    public static void nk_str_clear(@NativeType("struct nk_str *") NkStr str) {
        nnk_str_clear(str.address());
    }

    // --- [ nk_str_free ] ---

    public static native void nnk_str_free(long str);

    public static void nk_str_free(@NativeType("struct nk_str *") NkStr str) {
        nnk_str_free(str.address());
    }

    // --- [ nk_str_append_text_char ] ---

    public static native int nnk_str_append_text_char(long s, long str, int len);

    public static int nk_str_append_text_char(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_append_text_char(s.address(), memAddress(str), str.remaining());
    }

    // --- [ nk_str_append_str_char ] ---

    public static native int nnk_str_append_str_char(long s, long str);

    public static int nk_str_append_str_char(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_append_str_char(s.address(), memAddress(str));
    }

    // --- [ nk_str_append_text_utf8 ] ---

    public static native int nnk_str_append_text_utf8(long s, long str, int len);

    public static int nk_str_append_text_utf8(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_append_text_utf8(s.address(), memAddress(str), str.remaining());
    }

    // --- [ nk_str_append_str_utf8 ] ---

    public static native int nnk_str_append_str_utf8(long s, long str);

    public static int nk_str_append_str_utf8(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_append_str_utf8(s.address(), memAddress(str));
    }

    // --- [ nk_str_append_text_runes ] ---

    public static native int nnk_str_append_text_runes(long s, long runes, int len);

    public static int nk_str_append_text_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") IntBuffer runes) {
        return nnk_str_append_text_runes(s.address(), memAddress(runes), runes.remaining());
    }

    // --- [ nk_str_append_str_runes ] ---

    public static native int nnk_str_append_str_runes(long s, long runes);

    public static int nk_str_append_str_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") IntBuffer runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_append_str_runes(s.address(), memAddress(runes));
    }

    // --- [ nk_str_insert_at_char ] ---

    public static native int nnk_str_insert_at_char(long s, int pos, long str, int len);

    public static int nk_str_insert_at_char(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_at_char(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_at_rune ] ---

    public static native int nnk_str_insert_at_rune(long s, int pos, long str, int len);

    public static int nk_str_insert_at_rune(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_at_rune(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_text_char ] ---

    public static native int nnk_str_insert_text_char(long s, int pos, long str, int len);

    public static int nk_str_insert_text_char(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_text_char(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_str_char ] ---

    public static native int nnk_str_insert_str_char(long s, int pos, long str);

    public static int nk_str_insert_str_char(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_insert_str_char(s.address(), pos, memAddress(str));
    }

    // --- [ nk_str_insert_text_utf8 ] ---

    public static native int nnk_str_insert_text_utf8(long s, int pos, long str, int len);

    public static int nk_str_insert_text_utf8(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_text_utf8(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_str_utf8 ] ---

    public static native int nnk_str_insert_str_utf8(long s, int pos, long str);

    public static int nk_str_insert_str_utf8(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_insert_str_utf8(s.address(), pos, memAddress(str));
    }

    // --- [ nk_str_insert_text_runes ] ---

    public static native int nnk_str_insert_text_runes(long s, int pos, long runes, int len);

    public static int nk_str_insert_text_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") IntBuffer runes) {
        return nnk_str_insert_text_runes(s.address(), pos, memAddress(runes), runes.remaining());
    }

    // --- [ nk_str_insert_str_runes ] ---

    public static native int nnk_str_insert_str_runes(long s, int pos, long runes);

    public static int nk_str_insert_str_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") IntBuffer runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_insert_str_runes(s.address(), pos, memAddress(runes));
    }

    // --- [ nk_str_remove_chars ] ---

    public static native void nnk_str_remove_chars(long s, int len);

    public static void nk_str_remove_chars(@NativeType("struct nk_str *") NkStr s, int len) {
        nnk_str_remove_chars(s.address(), len);
    }

    // --- [ nk_str_remove_runes ] ---

    public static native void nnk_str_remove_runes(long str, int len);

    public static void nk_str_remove_runes(@NativeType("struct nk_str *") NkStr str, int len) {
        nnk_str_remove_runes(str.address(), len);
    }

    // --- [ nk_str_delete_chars ] ---

    public static native void nnk_str_delete_chars(long s, int pos, int len);

    public static void nk_str_delete_chars(@NativeType("struct nk_str *") NkStr s, int pos, int len) {
        nnk_str_delete_chars(s.address(), pos, len);
    }

    // --- [ nk_str_delete_runes ] ---

    public static native void nnk_str_delete_runes(long s, int pos, int len);

    public static void nk_str_delete_runes(@NativeType("struct nk_str *") NkStr s, int pos, int len) {
        nnk_str_delete_runes(s.address(), pos, len);
    }

    // --- [ nk_str_at_char ] ---

    public static native long nnk_str_at_char(long s, int pos);

    @Nullable
    @NativeType("char *")
    public static String nk_str_at_char(@NativeType("struct nk_str *") NkStr s, int pos) {
        long __result = nnk_str_at_char(s.address(), pos);
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_at_rune ] ---

    public static native long nnk_str_at_rune(long s, int pos, long unicode, long len);

    @Nullable
    @NativeType("char *")
    public static ByteBuffer nk_str_at_rune(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune *") IntBuffer unicode) {
        if (CHECKS) {
            check(unicode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer len = stack.callocInt(1);
        try {
            long __result = nnk_str_at_rune(s.address(), pos, memAddress(unicode), memAddress(len));
            return memByteBufferSafe(__result, len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_str_rune_at ] ---

    public static native int nnk_str_rune_at(long s, int pos);

    @NativeType("nk_rune")
    public static int nk_str_rune_at(@NativeType("struct nk_str const *") NkStr s, int pos) {
        return nnk_str_rune_at(s.address(), pos);
    }

    // --- [ nk_str_at_char_const ] ---

    public static native long nnk_str_at_char_const(long s, int pos);

    @Nullable
    @NativeType("char const *")
    public static String nk_str_at_char_const(@NativeType("struct nk_str const *") NkStr s, int pos) {
        long __result = nnk_str_at_char_const(s.address(), pos);
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_at_const ] ---

    public static native long nnk_str_at_const(long s, int pos, long unicode, long len);

    @Nullable
    @NativeType("char const *")
    public static ByteBuffer nk_str_at_const(@NativeType("struct nk_str const *") NkStr s, int pos, @NativeType("nk_rune *") IntBuffer unicode) {
        if (CHECKS) {
            check(unicode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer len = stack.callocInt(1);
        try {
            long __result = nnk_str_at_const(s.address(), pos, memAddress(unicode), memAddress(len));
            return memByteBufferSafe(__result, len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_str_get ] ---

    public static native long nnk_str_get(long s);

    @Nullable
    @NativeType("char *")
    public static String nk_str_get(@NativeType("struct nk_str *") NkStr s) {
        long __result = nnk_str_get(s.address());
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_get_const ] ---

    public static native long nnk_str_get_const(long s);

    @Nullable
    @NativeType("char const *")
    public static String nk_str_get_const(@NativeType("struct nk_str const *") NkStr s) {
        long __result = nnk_str_get_const(s.address());
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_len ] ---

    public static native int nnk_str_len(long s);

    public static int nk_str_len(@NativeType("struct nk_str *") NkStr s) {
        return nnk_str_len(s.address());
    }

    // --- [ nk_str_len_char ] ---

    public static native int nnk_str_len_char(long s);

    public static int nk_str_len_char(@NativeType("struct nk_str *") NkStr s) {
        return nnk_str_len_char(s.address());
    }

    // --- [ nk_filter_default ] ---

    public static native int nnk_filter_default(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_default(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_default(edit.address(), unicode) != 0;
    }

    // --- [ nk_filter_ascii ] ---

    public static native int nnk_filter_ascii(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_ascii(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_ascii(edit.address(), unicode) != 0;
    }

    // --- [ nk_filter_float ] ---

    public static native int nnk_filter_float(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_float(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_float(edit.address(), unicode) != 0;
    }

    // --- [ nk_filter_decimal ] ---

    public static native int nnk_filter_decimal(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_decimal(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_decimal(edit.address(), unicode) != 0;
    }

    // --- [ nk_filter_hex ] ---

    public static native int nnk_filter_hex(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_hex(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_hex(edit.address(), unicode) != 0;
    }

    // --- [ nk_filter_oct ] ---

    public static native int nnk_filter_oct(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_oct(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_oct(edit.address(), unicode) != 0;
    }

    // --- [ nk_filter_binary ] ---

    public static native int nnk_filter_binary(long edit, int unicode);

    @NativeType("int")
    public static boolean nk_filter_binary(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_binary(edit.address(), unicode) != 0;
    }

    // --- [ nk_textedit_init ] ---

    public static native void nnk_textedit_init(long box, long allocator, long size);

    public static void nk_textedit_init(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("struct nk_allocator *") NkAllocator allocator, @NativeType("nk_size") long size) {
        nnk_textedit_init(box.address(), allocator.address(), size);
    }

    // --- [ nk_textedit_init_fixed ] ---

    public static native void nnk_textedit_init_fixed(long box, long memory, long size);

    public static void nk_textedit_init_fixed(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("void *") ByteBuffer memory) {
        nnk_textedit_init_fixed(box.address(), memAddress(memory), memory.remaining());
    }

    // --- [ nk_textedit_free ] ---

    public static native void nnk_textedit_free(long box);

    public static void nk_textedit_free(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_free(box.address());
    }

    // --- [ nk_textedit_text ] ---

    public static native void nnk_textedit_text(long box, long text, int total_len);

    public static void nk_textedit_text(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") ByteBuffer text) {
        nnk_textedit_text(box.address(), memAddress(text), text.remaining());
    }

    public static void nk_textedit_text(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") CharSequence text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            nnk_textedit_text(box.address(), textEncoded, textEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_textedit_delete ] ---

    public static native void nnk_textedit_delete(long box, int where, int len);

    public static void nk_textedit_delete(@NativeType("struct nk_text_edit *") NkTextEdit box, int where, int len) {
        nnk_textedit_delete(box.address(), where, len);
    }

    // --- [ nk_textedit_delete_selection ] ---

    public static native void nnk_textedit_delete_selection(long box);

    public static void nk_textedit_delete_selection(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_delete_selection(box.address());
    }

    // --- [ nk_textedit_select_all ] ---

    public static native void nnk_textedit_select_all(long box);

    public static void nk_textedit_select_all(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_select_all(box.address());
    }

    // --- [ nk_textedit_cut ] ---

    public static native int nnk_textedit_cut(long box);

    @NativeType("int")
    public static boolean nk_textedit_cut(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        return nnk_textedit_cut(box.address()) != 0;
    }

    // --- [ nk_textedit_paste ] ---

    public static native int nnk_textedit_paste(long box, long ctext, int len);

    @NativeType("int")
    public static boolean nk_textedit_paste(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") ByteBuffer ctext) {
        return nnk_textedit_paste(box.address(), memAddress(ctext), ctext.remaining()) != 0;
    }

    @NativeType("int")
    public static boolean nk_textedit_paste(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") CharSequence ctext) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int ctextEncodedLength = stack.nUTF8(ctext, false);
            long ctextEncoded = stack.getPointerAddress();
            return nnk_textedit_paste(box.address(), ctextEncoded, ctextEncodedLength) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_textedit_undo ] ---

    public static native void nnk_textedit_undo(long box);

    public static void nk_textedit_undo(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_undo(box.address());
    }

    // --- [ nk_textedit_redo ] ---

    public static native void nnk_textedit_redo(long box);

    public static void nk_textedit_redo(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_redo(box.address());
    }

    // --- [ nk_stroke_line ] ---

    public static native void nnk_stroke_line(long b, float x0, float y0, float x1, float y1, float line_thickness, long color);

    public static void nk_stroke_line(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float x0, float y0, float x1, float y1, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_line(b.address(), x0, y0, x1, y1, line_thickness, color.address());
    }

    // --- [ nk_stroke_curve ] ---

    public static native void nnk_stroke_curve(long b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, long color);

    public static void nk_stroke_curve(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_curve(b.address(), ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, color.address());
    }

    // --- [ nk_stroke_rect ] ---

    public static native void nnk_stroke_rect(long b, long rect, float rounding, float line_thickness, long color);

    public static void nk_stroke_rect(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, float rounding, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_rect(b.address(), rect.address(), rounding, line_thickness, color.address());
    }

    // --- [ nk_stroke_circle ] ---

    public static native void nnk_stroke_circle(long b, long rect, float line_thickness, long color);

    public static void nk_stroke_circle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_circle(b.address(), rect.address(), line_thickness, color.address());
    }

    // --- [ nk_stroke_arc ] ---

    public static native void nnk_stroke_arc(long b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, long color);

    public static void nk_stroke_arc(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_arc(b.address(), cx, cy, radius, a_min, a_max, line_thickness, color.address());
    }

    // --- [ nk_stroke_triangle ] ---

    public static native void nnk_stroke_triangle(long b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, long color);

    public static void nk_stroke_triangle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_triangle(b.address(), x0, y0, x1, y1, x2, y2, line_thichness, color.address());
    }

    // --- [ nk_stroke_polyline ] ---

    public static native void nnk_stroke_polyline(long b, long points, int point_count, float line_thickness, long col);

    public static void nk_stroke_polyline(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float *") FloatBuffer points, float line_thickness, @NativeType("struct nk_color") NkColor col) {
        nnk_stroke_polyline(b.address(), memAddress(points), points.remaining(), line_thickness, col.address());
    }

    // --- [ nk_stroke_polygon ] ---

    public static native void nnk_stroke_polygon(long b, long points, int point_count, float line_thickness, long color);

    public static void nk_stroke_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float *") FloatBuffer points, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_polygon(b.address(), memAddress(points), points.remaining(), line_thickness, color.address());
    }

    // --- [ nk_fill_rect ] ---

    public static native void nnk_fill_rect(long b, long rect, float rounding, long color);

    public static void nk_fill_rect(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, float rounding, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_rect(b.address(), rect.address(), rounding, color.address());
    }

    // --- [ nk_fill_rect_multi_color ] ---

    public static native void nnk_fill_rect_multi_color(long b, long rect, long left, long top, long right, long bottom);

    public static void nk_fill_rect_multi_color(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor left, @NativeType("struct nk_color") NkColor top, @NativeType("struct nk_color") NkColor right, @NativeType("struct nk_color") NkColor bottom) {
        nnk_fill_rect_multi_color(b.address(), rect.address(), left.address(), top.address(), right.address(), bottom.address());
    }

    // --- [ nk_fill_circle ] ---

    public static native void nnk_fill_circle(long b, long rect, long color);

    public static void nk_fill_circle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_circle(b.address(), rect.address(), color.address());
    }

    // --- [ nk_fill_arc ] ---

    public static native void nnk_fill_arc(long b, float cx, float cy, float radius, float a_min, float a_max, long color);

    public static void nk_fill_arc(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float cx, float cy, float radius, float a_min, float a_max, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_arc(b.address(), cx, cy, radius, a_min, a_max, color.address());
    }

    // --- [ nk_fill_triangle ] ---

    public static native void nnk_fill_triangle(long b, float x0, float y0, float x1, float y1, float x2, float y2, long color);

    public static void nk_fill_triangle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float x0, float y0, float x1, float y1, float x2, float y2, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_triangle(b.address(), x0, y0, x1, y1, x2, y2, color.address());
    }

    // --- [ nk_fill_polygon ] ---

    public static native void nnk_fill_polygon(long b, long points, int point_count, long color);

    public static void nk_fill_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float *") FloatBuffer points, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_polygon(b.address(), memAddress(points), points.remaining(), color.address());
    }

    // --- [ nk_draw_image ] ---

    public static native void nnk_draw_image(long b, long rect, long img, long color);

    public static void nk_draw_image(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_image const *") NkImage img, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_image(b.address(), rect.address(), img.address(), color.address());
    }

    // --- [ nk_draw_text ] ---

    public static native void nnk_draw_text(long b, long rect, long string, int length, long font, long bg, long fg);

    public static void nk_draw_text(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("char const *") ByteBuffer string, @NativeType("struct nk_user_font const *") NkUserFont font, @NativeType("struct nk_color") NkColor bg, @NativeType("struct nk_color") NkColor fg) {
        nnk_draw_text(b.address(), rect.address(), memAddress(string), string.remaining(), font.address(), bg.address(), fg.address());
    }

    public static void nk_draw_text(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("char const *") CharSequence string, @NativeType("struct nk_user_font const *") NkUserFont font, @NativeType("struct nk_color") NkColor bg, @NativeType("struct nk_color") NkColor fg) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nnk_draw_text(b.address(), rect.address(), stringEncoded, stringEncodedLength, font.address(), bg.address(), fg.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_push_scissor ] ---

    public static native void nnk_push_scissor(long b, long rect);

    public static void nk_push_scissor(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect) {
        nnk_push_scissor(b.address(), rect.address());
    }

    // --- [ nk_push_custom ] ---

    public static native void nnk_push_custom(long b, long rect, long callback, long usr);

    public static void nk_push_custom(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("nk_command_custom_callback") NkCommandCustomCallbackI callback, @NativeType("nk_handle") NkHandle usr) {
        nnk_push_custom(b.address(), rect.address(), callback.address(), usr.address());
    }

    // --- [ nk__next ] ---

    /** Unsafe version of: {@link #nk__next _next} */
    public static native long nnk__next(long ctx, long cmd);

    /**
     * Increments the draw command iterator to the next command inside the context draw command list.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_command const *")
    public static NkCommand nk__next(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_command const *") NkCommand cmd) {
        long __result = nnk__next(ctx.address(), cmd.address());
        return NkCommand.createSafe(__result);
    }

    // --- [ nk__begin ] ---

    /** Unsafe version of: {@link #nk__begin _begin} */
    public static native long nnk__begin(long ctx);

    /**
     * Returns draw command pointer pointing to the next command inside the draw command list.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_command const *")
    public static NkCommand nk__begin(@NativeType("struct nk_context *") NkContext ctx) {
        long __result = nnk__begin(ctx.address());
        return NkCommand.createSafe(__result);
    }

    // --- [ nk_input_has_mouse_click ] ---

    /** Unsafe version of: {@link #nk_input_has_mouse_click input_has_mouse_click} */
    public static native int nnk_input_has_mouse_click(long i, int id);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_has_mouse_click(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_has_mouse_click(i.address(), id) != 0;
    }

    // --- [ nk_input_has_mouse_click_in_rect ] ---

    /** Unsafe version of: {@link #nk_input_has_mouse_click_in_rect input_has_mouse_click_in_rect} */
    public static native int nnk_input_has_mouse_click_in_rect(long i, int id, long rect);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_has_mouse_click_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_has_mouse_click_in_rect(i.address(), id, rect.address()) != 0;
    }

    // --- [ nk_input_has_mouse_click_down_in_rect ] ---

    /** Unsafe version of: {@link #nk_input_has_mouse_click_down_in_rect input_has_mouse_click_down_in_rect} */
    public static native int nnk_input_has_mouse_click_down_in_rect(long i, int id, long rect, int down);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_has_mouse_click_down_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect, int down) {
        return nnk_input_has_mouse_click_down_in_rect(i.address(), id, rect.address(), down) != 0;
    }

    // --- [ nk_input_is_mouse_click_in_rect ] ---

    /** Unsafe version of: {@link #nk_input_is_mouse_click_in_rect input_is_mouse_click_in_rect} */
    public static native int nnk_input_is_mouse_click_in_rect(long i, int id, long rect);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_mouse_click_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_is_mouse_click_in_rect(i.address(), id, rect.address()) != 0;
    }

    // --- [ nk_input_is_mouse_click_down_in_rect ] ---

    /** Unsafe version of: {@link #nk_input_is_mouse_click_down_in_rect input_is_mouse_click_down_in_rect} */
    public static native int nnk_input_is_mouse_click_down_in_rect(long i, int id, long b, int down);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_mouse_click_down_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect b, int down) {
        return nnk_input_is_mouse_click_down_in_rect(i.address(), id, b.address(), down) != 0;
    }

    // --- [ nk_input_any_mouse_click_in_rect ] ---

    public static native int nnk_input_any_mouse_click_in_rect(long i, long rect);

    @NativeType("int")
    public static boolean nk_input_any_mouse_click_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_any_mouse_click_in_rect(i.address(), rect.address()) != 0;
    }

    // --- [ nk_input_is_mouse_prev_hovering_rect ] ---

    public static native int nnk_input_is_mouse_prev_hovering_rect(long i, long rect);

    @NativeType("int")
    public static boolean nk_input_is_mouse_prev_hovering_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_is_mouse_prev_hovering_rect(i.address(), rect.address()) != 0;
    }

    // --- [ nk_input_is_mouse_hovering_rect ] ---

    public static native int nnk_input_is_mouse_hovering_rect(long i, long rect);

    @NativeType("int")
    public static boolean nk_input_is_mouse_hovering_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_is_mouse_hovering_rect(i.address(), rect.address()) != 0;
    }

    // --- [ nk_input_mouse_clicked ] ---

    /** Unsafe version of: {@link #nk_input_mouse_clicked input_mouse_clicked} */
    public static native int nnk_input_mouse_clicked(long i, int id, long rect);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_mouse_clicked(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_mouse_clicked(i.address(), id, rect.address()) != 0;
    }

    // --- [ nk_input_is_mouse_down ] ---

    /** Unsafe version of: {@link #nk_input_is_mouse_down input_is_mouse_down} */
    public static native int nnk_input_is_mouse_down(long i, int id);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_mouse_down(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_is_mouse_down(i.address(), id) != 0;
    }

    // --- [ nk_input_is_mouse_pressed ] ---

    /** Unsafe version of: {@link #nk_input_is_mouse_pressed input_is_mouse_pressed} */
    public static native int nnk_input_is_mouse_pressed(long i, int id);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_mouse_pressed(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_is_mouse_pressed(i.address(), id) != 0;
    }

    // --- [ nk_input_is_mouse_released ] ---

    /** Unsafe version of: {@link #nk_input_is_mouse_released input_is_mouse_released} */
    public static native int nnk_input_is_mouse_released(long i, int id);

    /** @param id one of:<br><table><tr><td>{@link #NK_BUTTON_LEFT BUTTON_LEFT}</td><td>{@link #NK_BUTTON_MIDDLE BUTTON_MIDDLE}</td><td>{@link #NK_BUTTON_RIGHT BUTTON_RIGHT}</td><td>{@link #NK_BUTTON_DOUBLE BUTTON_DOUBLE}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_mouse_released(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_is_mouse_released(i.address(), id) != 0;
    }

    // --- [ nk_input_is_key_pressed ] ---

    /** Unsafe version of: {@link #nk_input_is_key_pressed input_is_key_pressed} */
    public static native int nnk_input_is_key_pressed(long i, int key);

    /** @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_SELECT_ALL KEY_TEXT_SELECT_ALL}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_key_pressed(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_keys") int key) {
        return nnk_input_is_key_pressed(i.address(), key) != 0;
    }

    // --- [ nk_input_is_key_released ] ---

    /** Unsafe version of: {@link #nk_input_is_key_released input_is_key_released} */
    public static native int nnk_input_is_key_released(long i, int key);

    /** @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_SELECT_ALL KEY_TEXT_SELECT_ALL}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_key_released(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_keys") int key) {
        return nnk_input_is_key_released(i.address(), key) != 0;
    }

    // --- [ nk_input_is_key_down ] ---

    /** Unsafe version of: {@link #nk_input_is_key_down input_is_key_down} */
    public static native int nnk_input_is_key_down(long i, int key);

    /** @param key one of:<br><table><tr><td>{@link #NK_KEY_NONE KEY_NONE}</td><td>{@link #NK_KEY_SHIFT KEY_SHIFT}</td><td>{@link #NK_KEY_CTRL KEY_CTRL}</td><td>{@link #NK_KEY_DEL KEY_DEL}</td><td>{@link #NK_KEY_ENTER KEY_ENTER}</td><td>{@link #NK_KEY_TAB KEY_TAB}</td></tr><tr><td>{@link #NK_KEY_BACKSPACE KEY_BACKSPACE}</td><td>{@link #NK_KEY_COPY KEY_COPY}</td><td>{@link #NK_KEY_CUT KEY_CUT}</td><td>{@link #NK_KEY_PASTE KEY_PASTE}</td><td>{@link #NK_KEY_UP KEY_UP}</td><td>{@link #NK_KEY_DOWN KEY_DOWN}</td></tr><tr><td>{@link #NK_KEY_LEFT KEY_LEFT}</td><td>{@link #NK_KEY_RIGHT KEY_RIGHT}</td><td>{@link #NK_KEY_TEXT_INSERT_MODE KEY_TEXT_INSERT_MODE}</td><td>{@link #NK_KEY_TEXT_REPLACE_MODE KEY_TEXT_REPLACE_MODE}</td><td>{@link #NK_KEY_TEXT_RESET_MODE KEY_TEXT_RESET_MODE}</td><td>{@link #NK_KEY_TEXT_LINE_START KEY_TEXT_LINE_START}</td></tr><tr><td>{@link #NK_KEY_TEXT_LINE_END KEY_TEXT_LINE_END}</td><td>{@link #NK_KEY_TEXT_START KEY_TEXT_START}</td><td>{@link #NK_KEY_TEXT_END KEY_TEXT_END}</td><td>{@link #NK_KEY_TEXT_UNDO KEY_TEXT_UNDO}</td><td>{@link #NK_KEY_TEXT_REDO KEY_TEXT_REDO}</td><td>{@link #NK_KEY_TEXT_SELECT_ALL KEY_TEXT_SELECT_ALL}</td></tr><tr><td>{@link #NK_KEY_TEXT_WORD_LEFT KEY_TEXT_WORD_LEFT}</td><td>{@link #NK_KEY_TEXT_WORD_RIGHT KEY_TEXT_WORD_RIGHT}</td><td>{@link #NK_KEY_SCROLL_START KEY_SCROLL_START}</td><td>{@link #NK_KEY_SCROLL_END KEY_SCROLL_END}</td><td>{@link #NK_KEY_SCROLL_DOWN KEY_SCROLL_DOWN}</td><td>{@link #NK_KEY_SCROLL_UP KEY_SCROLL_UP}</td></tr></table> */
    @NativeType("int")
    public static boolean nk_input_is_key_down(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_keys") int key) {
        return nnk_input_is_key_down(i.address(), key) != 0;
    }

    // --- [ nk_draw_list_init ] ---

    public static native void nnk_draw_list_init(long list);

    public static void nk_draw_list_init(@NativeType("struct nk_draw_list *") NkDrawList list) {
        nnk_draw_list_init(list.address());
    }

    // --- [ nk_draw_list_setup ] ---

    public static native void nnk_draw_list_setup(long canvas, long config, long cmds, long vertices, long elements, int line_aa, int shape_aa);

    public static void nk_draw_list_setup(@NativeType("struct nk_draw_list *") NkDrawList canvas, @NativeType("struct nk_convert_config const *") NkConvertConfig config, @NativeType("struct nk_buffer *") NkBuffer cmds, @NativeType("struct nk_buffer *") NkBuffer vertices, @NativeType("struct nk_buffer *") NkBuffer elements, @NativeType("enum nk_anti_aliasing") int line_aa, @NativeType("enum nk_anti_aliasing") int shape_aa) {
        if (CHECKS) {
            NkConvertConfig.validate(config.address());
        }
        nnk_draw_list_setup(canvas.address(), config.address(), cmds.address(), vertices.address(), elements.address(), line_aa, shape_aa);
    }

    // --- [ nk__draw_list_begin ] ---

    public static native long nnk__draw_list_begin(long list, long buffer);

    @Nullable
    @NativeType("struct nk_draw_command const *")
    public static NkDrawCommand nk__draw_list_begin(@NativeType("struct nk_draw_list const *") NkDrawList list, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        long __result = nnk__draw_list_begin(list.address(), buffer.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_list_next ] ---

    public static native long nnk__draw_list_next(long cmd, long buffer, long list);

    @Nullable
    @NativeType("struct nk_draw_command const *")
    public static NkDrawCommand nk__draw_list_next(@NativeType("struct nk_draw_command const *") NkDrawCommand cmd, @NativeType("struct nk_buffer const *") NkBuffer buffer, @NativeType("struct nk_draw_list const *") NkDrawList list) {
        long __result = nnk__draw_list_next(cmd.address(), buffer.address(), list.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_begin ] ---

    /** Unsafe version of: {@link #nk__draw_begin _draw_begin} */
    public static native long nnk__draw_begin(long ctx, long buffer);

    /**
     * Returns a draw vertex command buffer iterator to iterate over the vertex draw command buffer.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_draw_command const *")
    public static NkDrawCommand nk__draw_begin(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        long __result = nnk__draw_begin(ctx.address(), buffer.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_end ] ---

    /** Unsafe version of: {@link #nk__draw_end _draw_end} */
    public static native long nnk__draw_end(long ctx, long buffer);

    /**
     * Returns the end of the vertex draw list.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_draw_command const *")
    public static NkDrawCommand nk__draw_end(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        long __result = nnk__draw_end(ctx.address(), buffer.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_next ] ---

    /** Unsafe version of: {@link #nk__draw_next _draw_next} */
    public static native long nnk__draw_next(long cmd, long buffer, long ctx);

    /**
     * Increments the vertex command iterator to the next command inside the context vertex command list.
     *
     * @param ctx the nuklear context
     */
    @Nullable
    @NativeType("struct nk_draw_command const *")
    public static NkDrawCommand nk__draw_next(@NativeType("struct nk_draw_command const *") NkDrawCommand cmd, @NativeType("struct nk_buffer const *") NkBuffer buffer, @NativeType("struct nk_context const *") NkContext ctx) {
        long __result = nnk__draw_next(cmd.address(), buffer.address(), ctx.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk_draw_list_path_clear ] ---

    public static native void nnk_draw_list_path_clear(long list);

    public static void nk_draw_list_path_clear(@NativeType("struct nk_draw_list *") NkDrawList list) {
        nnk_draw_list_path_clear(list.address());
    }

    // --- [ nk_draw_list_path_line_to ] ---

    public static native void nnk_draw_list_path_line_to(long list, long pos);

    public static void nk_draw_list_path_line_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 pos) {
        nnk_draw_list_path_line_to(list.address(), pos.address());
    }

    // --- [ nk_draw_list_path_arc_to_fast ] ---

    public static native void nnk_draw_list_path_arc_to_fast(long list, long center, float radius, int a_min, int a_max);

    public static void nk_draw_list_path_arc_to_fast(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, int a_min, int a_max) {
        nnk_draw_list_path_arc_to_fast(list.address(), center.address(), radius, a_min, a_max);
    }

    // --- [ nk_draw_list_path_arc_to ] ---

    public static native void nnk_draw_list_path_arc_to(long list, long center, float radius, float a_min, float a_max, int segments);

    public static void nk_draw_list_path_arc_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, float a_min, float a_max, @NativeType("unsigned int") int segments) {
        nnk_draw_list_path_arc_to(list.address(), center.address(), radius, a_min, a_max, segments);
    }

    // --- [ nk_draw_list_path_rect_to ] ---

    public static native void nnk_draw_list_path_rect_to(long list, long a, long b, float rounding);

    public static void nk_draw_list_path_rect_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, float rounding) {
        nnk_draw_list_path_rect_to(list.address(), a.address(), b.address(), rounding);
    }

    // --- [ nk_draw_list_path_curve_to ] ---

    public static native void nnk_draw_list_path_curve_to(long list, long p2, long p3, long p4, int num_segments);

    public static void nk_draw_list_path_curve_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 p2, @NativeType("struct nk_vec2") NkVec2 p3, @NativeType("struct nk_vec2") NkVec2 p4, @NativeType("unsigned int") int num_segments) {
        nnk_draw_list_path_curve_to(list.address(), p2.address(), p3.address(), p4.address(), num_segments);
    }

    // --- [ nk_draw_list_path_fill ] ---

    public static native void nnk_draw_list_path_fill(long list, long color);

    public static void nk_draw_list_path_fill(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_path_fill(list.address(), color.address());
    }

    // --- [ nk_draw_list_path_stroke ] ---

    /** Unsafe version of: {@link #nk_draw_list_path_stroke draw_list_path_stroke} */
    public static native void nnk_draw_list_path_stroke(long list, long color, int closed, float thickness);

    /** @param closed one of:<br><table><tr><td>{@link #NK_STROKE_OPEN STROKE_OPEN}</td><td>{@link #NK_STROKE_CLOSED STROKE_CLOSED}</td></tr></table> */
    public static void nk_draw_list_path_stroke(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_color") NkColor color, @NativeType("enum nk_draw_list_stroke") int closed, float thickness) {
        nnk_draw_list_path_stroke(list.address(), color.address(), closed, thickness);
    }

    // --- [ nk_draw_list_stroke_line ] ---

    public static native void nnk_draw_list_stroke_line(long list, long a, long b, long color, float thickness);

    public static void nk_draw_list_stroke_line(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, @NativeType("struct nk_color") NkColor color, float thickness) {
        nnk_draw_list_stroke_line(list.address(), a.address(), b.address(), color.address(), thickness);
    }

    // --- [ nk_draw_list_stroke_rect ] ---

    public static native void nnk_draw_list_stroke_rect(long list, long rect, long color, float rounding, float thickness);

    public static void nk_draw_list_stroke_rect(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color, float rounding, float thickness) {
        nnk_draw_list_stroke_rect(list.address(), rect.address(), color.address(), rounding, thickness);
    }

    // --- [ nk_draw_list_stroke_triangle ] ---

    public static native void nnk_draw_list_stroke_triangle(long list, long a, long b, long c, long color, float thickness);

    public static void nk_draw_list_stroke_triangle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, @NativeType("struct nk_vec2") NkVec2 c, @NativeType("struct nk_color") NkColor color, float thickness) {
        nnk_draw_list_stroke_triangle(list.address(), a.address(), b.address(), c.address(), color.address(), thickness);
    }

    // --- [ nk_draw_list_stroke_circle ] ---

    public static native void nnk_draw_list_stroke_circle(long list, long center, float radius, long color, int segs, float thickness);

    public static void nk_draw_list_stroke_circle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, @NativeType("struct nk_color") NkColor color, @NativeType("unsigned int") int segs, float thickness) {
        nnk_draw_list_stroke_circle(list.address(), center.address(), radius, color.address(), segs, thickness);
    }

    // --- [ nk_draw_list_stroke_curve ] ---

    public static native void nnk_draw_list_stroke_curve(long list, long p0, long cp0, long cp1, long p1, long color, int segments, float thickness);

    public static void nk_draw_list_stroke_curve(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 p0, @NativeType("struct nk_vec2") NkVec2 cp0, @NativeType("struct nk_vec2") NkVec2 cp1, @NativeType("struct nk_vec2") NkVec2 p1, @NativeType("struct nk_color") NkColor color, @NativeType("unsigned int") int segments, float thickness) {
        nnk_draw_list_stroke_curve(list.address(), p0.address(), cp0.address(), cp1.address(), p1.address(), color.address(), segments, thickness);
    }

    // --- [ nk_draw_list_stroke_poly_line ] ---

    /** Unsafe version of: {@link #nk_draw_list_stroke_poly_line draw_list_stroke_poly_line} */
    public static native void nnk_draw_list_stroke_poly_line(long list, long pnts, int cnt, long color, int closed, float thickness, int aliasing);

    /**
     * @param closed   one of:<br><table><tr><td>{@link #NK_STROKE_OPEN STROKE_OPEN}</td><td>{@link #NK_STROKE_CLOSED STROKE_CLOSED}</td></tr></table>
     * @param aliasing one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table>
     */
    public static void nk_draw_list_stroke_poly_line(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2 const *") NkVec2 pnts, @NativeType("unsigned int") int cnt, @NativeType("struct nk_color") NkColor color, @NativeType("enum nk_draw_list_stroke") int closed, float thickness, @NativeType("enum nk_anti_aliasing") int aliasing) {
        nnk_draw_list_stroke_poly_line(list.address(), pnts.address(), cnt, color.address(), closed, thickness, aliasing);
    }

    // --- [ nk_draw_list_fill_rect ] ---

    public static native void nnk_draw_list_fill_rect(long list, long rect, long color, float rounding);

    public static void nk_draw_list_fill_rect(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color, float rounding) {
        nnk_draw_list_fill_rect(list.address(), rect.address(), color.address(), rounding);
    }

    // --- [ nk_draw_list_fill_rect_multi_color ] ---

    public static native void nnk_draw_list_fill_rect_multi_color(long list, long rect, long left, long top, long right, long bottom);

    public static void nk_draw_list_fill_rect_multi_color(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor left, @NativeType("struct nk_color") NkColor top, @NativeType("struct nk_color") NkColor right, @NativeType("struct nk_color") NkColor bottom) {
        nnk_draw_list_fill_rect_multi_color(list.address(), rect.address(), left.address(), top.address(), right.address(), bottom.address());
    }

    // --- [ nk_draw_list_fill_triangle ] ---

    public static native void nnk_draw_list_fill_triangle(long list, long a, long b, long c, long color);

    public static void nk_draw_list_fill_triangle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, @NativeType("struct nk_vec2") NkVec2 c, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_fill_triangle(list.address(), a.address(), b.address(), c.address(), color.address());
    }

    // --- [ nk_draw_list_fill_circle ] ---

    public static native void nnk_draw_list_fill_circle(long list, long center, float radius, long col, int segs);

    public static void nk_draw_list_fill_circle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, @NativeType("struct nk_color") NkColor col, @NativeType("unsigned int") int segs) {
        nnk_draw_list_fill_circle(list.address(), center.address(), radius, col.address(), segs);
    }

    // --- [ nk_draw_list_fill_poly_convex ] ---

    /** Unsafe version of: {@link #nk_draw_list_fill_poly_convex draw_list_fill_poly_convex} */
    public static native void nnk_draw_list_fill_poly_convex(long list, long points, int count, long color, int aliasing);

    /** @param aliasing one of:<br><table><tr><td>{@link #NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link #NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table> */
    public static void nk_draw_list_fill_poly_convex(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2 const *") NkVec2.Buffer points, @NativeType("struct nk_color") NkColor color, @NativeType("enum nk_anti_aliasing") int aliasing) {
        nnk_draw_list_fill_poly_convex(list.address(), points.address(), points.remaining(), color.address(), aliasing);
    }

    // --- [ nk_draw_list_add_image ] ---

    public static native void nnk_draw_list_add_image(long list, long texture, long rect, long color);

    public static void nk_draw_list_add_image(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_image") NkImage texture, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_add_image(list.address(), texture.address(), rect.address(), color.address());
    }

    // --- [ nk_draw_list_add_text ] ---

    public static native void nnk_draw_list_add_text(long list, long font, long rect, long text, int len, float font_height, long color);

    public static void nk_draw_list_add_text(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_user_font const *") NkUserFont font, @NativeType("struct nk_rect") NkRect rect, @NativeType("char const *") ByteBuffer text, float font_height, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_add_text(list.address(), font.address(), rect.address(), memAddress(text), text.remaining(), font_height, color.address());
    }

    public static void nk_draw_list_add_text(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_user_font const *") NkUserFont font, @NativeType("struct nk_rect") NkRect rect, @NativeType("char const *") CharSequence text, float font_height, @NativeType("struct nk_color") NkColor color) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            nnk_draw_list_add_text(list.address(), font.address(), rect.address(), textEncoded, textEncodedLength, font_height, color.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_draw_list_push_userdata ] ---

    public static native void nnk_draw_list_push_userdata(long list, long userdata);

    public static void nk_draw_list_push_userdata(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("nk_handle") NkHandle userdata) {
        nnk_draw_list_push_userdata(list.address(), userdata.address());
    }

    // --- [ nk_style_item_image ] ---

    public static native void nnk_style_item_image(long img, long __result);

    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_image(@NativeType("struct nk_image") NkImage img, @NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_image(img.address(), __result.address());
        return __result;
    }

    // --- [ nk_style_item_color ] ---

    public static native void nnk_style_item_color(long color, long __result);

    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_color(@NativeType("struct nk_color") NkColor color, @NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_color(color.address(), __result.address());
        return __result;
    }

    // --- [ nk_style_item_hide ] ---

    public static native void nnk_style_item_hide(long __result);

    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_hide(@NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_hide(__result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_layout_row} */
    public static native void nnk_layout_row(long ctx, int fmt, float height, int cols, float[] ratio);

    /** Array version of: {@link #nk_layout_row layout_row} */
    public static void nk_layout_row(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float height, @NativeType("float const *") float[] ratio) {
        nnk_layout_row(ctx.address(), fmt, height, ratio.length, ratio);
    }

    /** Array version of: {@link #nnk_group_scrolled_offset_begin} */
    public static native int nnk_group_scrolled_offset_begin(long ctx, int[] x_offset, int[] y_offset, long title, int flags);

    /** Array version of: {@link #nk_group_scrolled_offset_begin group_scrolled_offset_begin} */
    @NativeType("int")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") int[] x_offset, @NativeType("nk_uint *") int[] y_offset, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
            checkNT1(title);
        }
        return nnk_group_scrolled_offset_begin(ctx.address(), x_offset, y_offset, memAddress(title), flags) != 0;
    }

    /** Array version of: {@link #nk_group_scrolled_offset_begin group_scrolled_offset_begin} */
    @NativeType("int")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") int[] x_offset, @NativeType("nk_uint *") int[] y_offset, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_scrolled_offset_begin(ctx.address(), x_offset, y_offset, titleEncoded, flags) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_tree_state_push} */
    public static native int nnk_tree_state_push(long ctx, int type, long title, int[] state);

    /** Array version of: {@link #nk_tree_state_push tree_state_push} */
    @NativeType("int")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_push(ctx.address(), type, memAddress(title), state) != 0;
    }

    /** Array version of: {@link #nk_tree_state_push tree_state_push} */
    @NativeType("int")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_push(ctx.address(), type, titleEncoded, state) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_tree_state_image_push} */
    public static native int nnk_tree_state_image_push(long ctx, int type, long image, long title, int[] state);

    /** Array version of: {@link #nk_tree_state_image_push tree_state_image_push} */
    @NativeType("int")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_image_push(ctx.address(), type, image.address(), memAddress(title), state) != 0;
    }

    /** Array version of: {@link #nk_tree_state_image_push tree_state_image_push} */
    @NativeType("int")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_image_push(ctx.address(), type, image.address(), titleEncoded, state) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_tree_element_push_hashed} */
    public static native int nnk_tree_element_push_hashed(long ctx, int type, long title, int initial_state, int[] selected, long hash, int len, int seed);

    /** Array version of: {@link #nk_tree_element_push_hashed tree_element_push_hashed} */
    @NativeType("int")
    public static boolean nk_tree_element_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") int[] selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            checkNT1(title);
            check(selected, 1);
        }
        return nnk_tree_element_push_hashed(ctx.address(), type, memAddress(title), initial_state, selected, memAddress(hash), hash.remaining(), seed) != 0;
    }

    /** Array version of: {@link #nk_tree_element_push_hashed tree_element_push_hashed} */
    @NativeType("int")
    public static boolean nk_tree_element_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") int[] selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_element_push_hashed(ctx.address(), type, titleEncoded, initial_state, selected, memAddress(hash), hash.remaining(), seed) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_tree_element_image_push_hashed} */
    public static native int nnk_tree_element_image_push_hashed(long ctx, int type, long img, long title, int initial_state, int[] selected, long hash, int len, int seed);

    /** Array version of: {@link #nk_tree_element_image_push_hashed tree_element_image_push_hashed} */
    @NativeType("int")
    public static boolean nk_tree_element_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") int[] selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            checkNT1(title);
            check(selected, 1);
        }
        return nnk_tree_element_image_push_hashed(ctx.address(), type, img.address(), memAddress(title), initial_state, selected, memAddress(hash), hash.remaining(), seed) != 0;
    }

    /** Array version of: {@link #nk_tree_element_image_push_hashed tree_element_image_push_hashed} */
    @NativeType("int")
    public static boolean nk_tree_element_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("int *") int[] selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_element_image_push_hashed(ctx.address(), type, img.address(), titleEncoded, initial_state, selected, memAddress(hash), hash.remaining(), seed) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_checkbox_label} */
    public static native int nnk_checkbox_label(long ctx, long str, int[] active);

    /** Array version of: {@link #nk_checkbox_label checkbox_label} */
    @NativeType("int")
    public static boolean nk_checkbox_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_checkbox_label(ctx.address(), memAddress(str), active) != 0;
    }

    /** Array version of: {@link #nk_checkbox_label checkbox_label} */
    @NativeType("int")
    public static boolean nk_checkbox_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_label(ctx.address(), strEncoded, active) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_checkbox_text} */
    public static native int nnk_checkbox_text(long ctx, long str, int len, int[] active);

    /** Array version of: {@link #nk_checkbox_text checkbox_text} */
    @NativeType("int")
    public static boolean nk_checkbox_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_checkbox_text(ctx.address(), memAddress(str), str.remaining(), active) != 0;
    }

    /** Array version of: {@link #nk_checkbox_text checkbox_text} */
    @NativeType("int")
    public static boolean nk_checkbox_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_text(ctx.address(), strEncoded, strEncodedLength, active) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_checkbox_flags_label} */
    public static native int nnk_checkbox_flags_label(long ctx, long str, int[] flags, int value);

    /** Array version of: {@link #nk_checkbox_flags_label checkbox_flags_label} */
    @NativeType("int")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            checkNT1(str);
            check(flags, 1);
        }
        return nnk_checkbox_flags_label(ctx.address(), memAddress(str), flags, value) != 0;
    }

    /** Array version of: {@link #nk_checkbox_flags_label checkbox_flags_label} */
    @NativeType("int")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_label(ctx.address(), strEncoded, flags, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_checkbox_flags_text} */
    public static native int nnk_checkbox_flags_text(long ctx, long str, int len, int[] flags, int value);

    /** Array version of: {@link #nk_checkbox_flags_text checkbox_flags_text} */
    @NativeType("int")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nnk_checkbox_flags_text(ctx.address(), memAddress(str), str.remaining(), flags, value) != 0;
    }

    /** Array version of: {@link #nk_checkbox_flags_text checkbox_flags_text} */
    @NativeType("int")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_text(ctx.address(), strEncoded, strEncodedLength, flags, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_radio_label} */
    public static native int nnk_radio_label(long ctx, long str, int[] active);

    /** Array version of: {@link #nk_radio_label radio_label} */
    @NativeType("int")
    public static boolean nk_radio_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_radio_label(ctx.address(), memAddress(str), active) != 0;
    }

    /** Array version of: {@link #nk_radio_label radio_label} */
    @NativeType("int")
    public static boolean nk_radio_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_label(ctx.address(), strEncoded, active) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_radio_text} */
    public static native int nnk_radio_text(long ctx, long str, int len, int[] active);

    /** Array version of: {@link #nk_radio_text radio_text} */
    @NativeType("int")
    public static boolean nk_radio_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_radio_text(ctx.address(), memAddress(str), str.remaining(), active) != 0;
    }

    /** Array version of: {@link #nk_radio_text radio_text} */
    @NativeType("int")
    public static boolean nk_radio_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("int *") int[] active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_text(ctx.address(), strEncoded, strEncodedLength, active) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_selectable_label} */
    public static native int nnk_selectable_label(long ctx, long str, int align, int[] value);

    /** Array version of: {@link #nk_selectable_label selectable_label} */
    @NativeType("int")
    public static boolean nk_selectable_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_label(ctx.address(), memAddress(str), align, value) != 0;
    }

    /** Array version of: {@link #nk_selectable_label selectable_label} */
    @NativeType("int")
    public static boolean nk_selectable_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_label(ctx.address(), strEncoded, align, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_selectable_text} */
    public static native int nnk_selectable_text(long ctx, long str, int len, int align, int[] value);

    /** Array version of: {@link #nk_selectable_text selectable_text} */
    @NativeType("int")
    public static boolean nk_selectable_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_text(ctx.address(), memAddress(str), str.remaining(), align, value) != 0;
    }

    /** Array version of: {@link #nk_selectable_text selectable_text} */
    @NativeType("int")
    public static boolean nk_selectable_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_text(ctx.address(), strEncoded, strEncodedLength, align, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_selectable_image_label} */
    public static native int nnk_selectable_image_label(long ctx, long img, long str, int align, int[] value);

    /** Array version of: {@link #nk_selectable_image_label selectable_image_label} */
    @NativeType("int")
    public static boolean nk_selectable_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_image_label(ctx.address(), img.address(), memAddress(str), align, value) != 0;
    }

    /** Array version of: {@link #nk_selectable_image_label selectable_image_label} */
    @NativeType("int")
    public static boolean nk_selectable_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_image_label(ctx.address(), img.address(), strEncoded, align, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_selectable_image_text} */
    public static native int nnk_selectable_image_text(long ctx, long img, long str, int len, int align, int[] value);

    /** Array version of: {@link #nk_selectable_image_text selectable_image_text} */
    @NativeType("int")
    public static boolean nk_selectable_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_image_text(ctx.address(), img.address(), memAddress(str), str.remaining(), align, value) != 0;
    }

    /** Array version of: {@link #nk_selectable_image_text selectable_image_text} */
    @NativeType("int")
    public static boolean nk_selectable_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_image_text(ctx.address(), img.address(), strEncoded, strEncodedLength, align, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_selectable_symbol_label} */
    public static native int nnk_selectable_symbol_label(long ctx, int symbol, long str, int align, int[] value);

    /** Array version of: {@link #nk_selectable_symbol_label selectable_symbol_label} */
    @NativeType("int")
    public static boolean nk_selectable_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_symbol_label(ctx.address(), symbol, memAddress(str), align, value) != 0;
    }

    /** Array version of: {@link #nk_selectable_symbol_label selectable_symbol_label} */
    @NativeType("int")
    public static boolean nk_selectable_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_symbol_label(ctx.address(), symbol, strEncoded, align, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_selectable_symbol_text} */
    public static native int nnk_selectable_symbol_text(long ctx, int symbol, long str, int len, int align, int[] value);

    /** Array version of: {@link #nk_selectable_symbol_text selectable_symbol_text} */
    @NativeType("int")
    public static boolean nk_selectable_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_symbol_text(ctx.address(), symbol, memAddress(str), str.remaining(), align, value) != 0;
    }

    /** Array version of: {@link #nk_selectable_symbol_text selectable_symbol_text} */
    @NativeType("int")
    public static boolean nk_selectable_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("int *") int[] value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_symbol_text(ctx.address(), symbol, strEncoded, strEncodedLength, align, value) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_slider_float} */
    public static native int nnk_slider_float(long ctx, float min, float[] val, float max, float step);

    /** Array version of: {@link #nk_slider_float slider_float} */
    public static int nk_slider_float(@NativeType("struct nk_context *") NkContext ctx, float min, @NativeType("float *") float[] val, float max, float step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_float(ctx.address(), min, val, max, step);
    }

    /** Array version of: {@link #nnk_slider_int} */
    public static native int nnk_slider_int(long ctx, int min, int[] val, int max, int step);

    /** Array version of: {@link #nk_slider_int slider_int} */
    public static int nk_slider_int(@NativeType("struct nk_context *") NkContext ctx, int min, @NativeType("int *") int[] val, int max, int step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_int(ctx.address(), min, val, max, step);
    }

    /** Array version of: {@link #nnk_property_int} */
    public static native void nnk_property_int(long ctx, long name, int min, int[] val, int max, int step, float inc_per_pixel);

    /** Array version of: {@link #nk_property_int property_int} */
    public static void nk_property_int(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, int min, @NativeType("int *") int[] val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_int(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** Array version of: {@link #nk_property_int property_int} */
    public static void nk_property_int(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, int min, @NativeType("int *") int[] val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            check(val, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_property_int(ctx.address(), nameEncoded, min, val, max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_property_float} */
    public static native void nnk_property_float(long ctx, long name, float min, float[] val, float max, float step, float inc_per_pixel);

    /** Array version of: {@link #nk_property_float property_float} */
    public static void nk_property_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, float min, @NativeType("float *") float[] val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_float(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** Array version of: {@link #nk_property_float property_float} */
    public static void nk_property_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, float min, @NativeType("float *") float[] val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            check(val, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_property_float(ctx.address(), nameEncoded, min, val, max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_property_double} */
    public static native void nnk_property_double(long ctx, long name, double min, double[] val, double max, double step, float inc_per_pixel);

    /** Array version of: {@link #nk_property_double property_double} */
    public static void nk_property_double(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, double min, @NativeType("double *") double[] val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_double(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** Array version of: {@link #nk_property_double property_double} */
    public static void nk_property_double(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, double min, @NativeType("double *") double[] val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            check(val, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_property_double(ctx.address(), nameEncoded, min, val, max, step, inc_per_pixel);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_edit_string} */
    public static native int nnk_edit_string(long ctx, int flags, long memory, int[] len, int max, long filter);

    /** Array version of: {@link #nk_edit_string edit_string} */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") ByteBuffer memory, @NativeType("int *") int[] len, int max, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        if (CHECKS) {
            checkNT1(memory);
            check(len, 1);
        }
        return nnk_edit_string(ctx.address(), flags, memAddress(memory), len, max, memAddressSafe(filter));
    }

    /** Array version of: {@link #nk_edit_string edit_string} */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") CharSequence memory, @NativeType("int *") int[] len, int max, @Nullable @NativeType("nk_plugin_filter") NkPluginFilterI filter) {
        if (CHECKS) {
            check(len, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(memory, true);
            long memoryEncoded = stack.getPointerAddress();
            return nnk_edit_string(ctx.address(), flags, memoryEncoded, len, max, memAddressSafe(filter));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_plot} */
    public static native void nnk_plot(long ctx, int type, float[] values, int count, int offset);

    /** Array version of: {@link #nk_plot plot} */
    public static void nk_plot(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("float const *") float[] values, int count, int offset) {
        if (CHECKS) {
            check(values, offset + count);
        }
        nnk_plot(ctx.address(), type, values, count, offset);
    }

    /** Array version of: {@link #nnk_combobox} */
    public static native void nnk_combobox(long ctx, long items, int count, int[] selected, int item_height, long size);

    /** Array version of: {@link #nk_combobox combobox} */
    public static void nk_combobox(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const **") PointerBuffer items, @NativeType("int *") int[] selected, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        nnk_combobox(ctx.address(), memAddress(items), items.remaining(), selected, item_height, size.address());
    }

    /** Array version of: {@link #nnk_combobox_string} */
    public static native void nnk_combobox_string(long ctx, long items_separated_by_zeros, int[] selected, int count, int item_height, long size);

    /** Array version of: {@link #nk_combobox_string combobox_string} */
    public static void nk_combobox_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_zeros, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_zeros);
            check(selected, 1);
        }
        nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zeros), selected, count, item_height, size.address());
    }

    /** Array version of: {@link #nk_combobox_string combobox_string} */
    public static void nk_combobox_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_zeros, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_zeros, true);
            long items_separated_by_zerosEncoded = stack.getPointerAddress();
            nnk_combobox_string(ctx.address(), items_separated_by_zerosEncoded, selected, count, item_height, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_combobox_separator} */
    public static native void nnk_combobox_separator(long ctx, long items_separated_by_separator, int separator, int[] selected, int count, int item_height, long size);

    /** Array version of: {@link #nk_combobox_separator combobox_separator} */
    public static void nk_combobox_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_separator, int separator, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_separator);
            check(selected, 1);
        }
        nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separator), separator, selected, count, item_height, size.address());
    }

    /** Array version of: {@link #nk_combobox_separator combobox_separator} */
    public static void nk_combobox_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_separator, int separator, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_separator, true);
            long items_separated_by_separatorEncoded = stack.getPointerAddress();
            nnk_combobox_separator(ctx.address(), items_separated_by_separatorEncoded, separator, selected, count, item_height, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_combobox_callback} */
    public static native void nnk_combobox_callback(long ctx, long item_getter, long userdata, int[] selected, int count, int item_height, long size);

    /** Array version of: {@link #nk_combobox_callback combobox_callback} */
    public static void nk_combobox_callback(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_item_getter") NkItemGetterI item_getter, @NativeType("void *") long userdata, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(userdata);
            check(selected, 1);
        }
        nnk_combobox_callback(ctx.address(), item_getter.address(), userdata, selected, count, item_height, size.address());
    }

    /** Array version of: {@link #nnk_style_push_float} */
    public static native int nnk_style_push_float(long ctx, float[] address, float value);

    /** Array version of: {@link #nk_style_push_float style_push_float} */
    public static int nk_style_push_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("float *") float[] address, float value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_float(ctx.address(), address, value);
    }

    /** Array version of: {@link #nnk_style_push_flags} */
    public static native int nnk_style_push_flags(long ctx, int[] address, int value);

    /** Array version of: {@link #nk_style_push_flags style_push_flags} */
    public static int nk_style_push_flags(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags *") int[] address, @NativeType("nk_flags") int value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_flags(ctx.address(), address, value);
    }

    /** Array version of: {@link #nnk_rgb_iv} */
    public static native void nnk_rgb_iv(int[] rgb, long __result);

    /** Array version of: {@link #nk_rgb_iv rgb_iv} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_iv(@NativeType("int const *") int[] rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_iv(rgb, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_rgb_fv} */
    public static native void nnk_rgb_fv(float[] rgb, long __result);

    /** Array version of: {@link #nk_rgb_fv rgb_fv} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_fv(@NativeType("float const *") float[] rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_fv(rgb, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_rgba_iv} */
    public static native void nnk_rgba_iv(int[] rgba, long __result);

    /** Array version of: {@link #nk_rgba_iv rgba_iv} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_iv(@NativeType("int const *") int[] rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_iv(rgba, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_rgba_fv} */
    public static native void nnk_rgba_fv(float[] rgba, long __result);

    /** Array version of: {@link #nk_rgba_fv rgba_fv} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_fv(@NativeType("float const *") float[] rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_fv(rgba, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_hsva_colorfv} */
    public static native void nnk_hsva_colorfv(float[] c, long __result);

    /** Array version of: {@link #nk_hsva_colorfv hsva_colorfv} */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_hsva_colorfv(@NativeType("float *") float[] c, @NativeType("struct nk_colorf") NkColorf __result) {
        if (CHECKS) {
            check(c, 4);
        }
        nnk_hsva_colorfv(c, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_colorf_hsva_f} */
    public static native void nnk_colorf_hsva_f(float[] out_h, float[] out_s, float[] out_v, float[] out_a, long in);

    /** Array version of: {@link #nk_colorf_hsva_f colorf_hsva_f} */
    public static void nk_colorf_hsva_f(@NativeType("float *") float[] out_h, @NativeType("float *") float[] out_s, @NativeType("float *") float[] out_v, @NativeType("float *") float[] out_a, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
            check(out_a, 1);
        }
        nnk_colorf_hsva_f(out_h, out_s, out_v, out_a, in.address());
    }

    /** Array version of: {@link #nnk_colorf_hsva_fv} */
    public static native void nnk_colorf_hsva_fv(float[] hsva, long in);

    /** Array version of: {@link #nk_colorf_hsva_fv colorf_hsva_fv} */
    public static void nk_colorf_hsva_fv(@NativeType("float *") float[] hsva, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_colorf_hsva_fv(hsva, in.address());
    }

    /** Array version of: {@link #nnk_hsv_iv} */
    public static native void nnk_hsv_iv(int[] hsv, long __result);

    /** Array version of: {@link #nk_hsv_iv hsv_iv} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_iv(@NativeType("int const *") int[] hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_iv(hsv, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_hsv_fv} */
    public static native void nnk_hsv_fv(float[] hsv, long __result);

    /** Array version of: {@link #nk_hsv_fv hsv_fv} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_fv(@NativeType("float const *") float[] hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_fv(hsv, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_hsva_iv} */
    public static native void nnk_hsva_iv(int[] hsva, long __result);

    /** Array version of: {@link #nk_hsva_iv hsva_iv} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_iv(@NativeType("int const *") int[] hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_iv(hsva, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_hsva_fv} */
    public static native void nnk_hsva_fv(float[] hsva, long __result);

    /** Array version of: {@link #nk_hsva_fv hsva_fv} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_fv(@NativeType("float const *") float[] hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_fv(hsva, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_color_f} */
    public static native void nnk_color_f(float[] r, float[] g, float[] b, float[] a, long color);

    /** Array version of: {@link #nk_color_f color_f} */
    public static void nk_color_f(@NativeType("float *") float[] r, @NativeType("float *") float[] g, @NativeType("float *") float[] b, @NativeType("float *") float[] a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        nnk_color_f(r, g, b, a, color.address());
    }

    /** Array version of: {@link #nnk_color_fv} */
    public static native void nnk_color_fv(float[] rgba_out, long color);

    /** Array version of: {@link #nk_color_fv color_fv} */
    public static void nk_color_fv(@NativeType("float *") float[] rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_fv(rgba_out, color.address());
    }

    /** Array version of: {@link #nnk_color_d} */
    public static native void nnk_color_d(double[] r, double[] g, double[] b, double[] a, long color);

    /** Array version of: {@link #nk_color_d color_d} */
    public static void nk_color_d(@NativeType("double *") double[] r, @NativeType("double *") double[] g, @NativeType("double *") double[] b, @NativeType("double *") double[] a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        nnk_color_d(r, g, b, a, color.address());
    }

    /** Array version of: {@link #nnk_color_dv} */
    public static native void nnk_color_dv(double[] rgba_out, long color);

    /** Array version of: {@link #nk_color_dv color_dv} */
    public static void nk_color_dv(@NativeType("double *") double[] rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_dv(rgba_out, color.address());
    }

    /** Array version of: {@link #nnk_color_hsv_i} */
    public static native void nnk_color_hsv_i(int[] out_h, int[] out_s, int[] out_v, long color);

    /** Array version of: {@link #nk_color_hsv_i color_hsv_i} */
    public static void nk_color_hsv_i(@NativeType("int *") int[] out_h, @NativeType("int *") int[] out_s, @NativeType("int *") int[] out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_i(out_h, out_s, out_v, color.address());
    }

    /** Array version of: {@link #nnk_color_hsv_iv} */
    public static native void nnk_color_hsv_iv(int[] hsv_out, long color);

    /** Array version of: {@link #nk_color_hsv_iv color_hsv_iv} */
    public static void nk_color_hsv_iv(@NativeType("int *") int[] hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_iv(hsv_out, color.address());
    }

    /** Array version of: {@link #nnk_color_hsv_f} */
    public static native void nnk_color_hsv_f(float[] out_h, float[] out_s, float[] out_v, long color);

    /** Array version of: {@link #nk_color_hsv_f color_hsv_f} */
    public static void nk_color_hsv_f(@NativeType("float *") float[] out_h, @NativeType("float *") float[] out_s, @NativeType("float *") float[] out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_f(out_h, out_s, out_v, color.address());
    }

    /** Array version of: {@link #nnk_color_hsv_fv} */
    public static native void nnk_color_hsv_fv(float[] hsv_out, long color);

    /** Array version of: {@link #nk_color_hsv_fv color_hsv_fv} */
    public static void nk_color_hsv_fv(@NativeType("float *") float[] hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_fv(hsv_out, color.address());
    }

    /** Array version of: {@link #nnk_color_hsva_i} */
    public static native void nnk_color_hsva_i(int[] h, int[] s, int[] v, int[] a, long color);

    /** Array version of: {@link #nk_color_hsva_i color_hsva_i} */
    public static void nk_color_hsva_i(@NativeType("int *") int[] h, @NativeType("int *") int[] s, @NativeType("int *") int[] v, @NativeType("int *") int[] a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(h, 1);
            check(s, 1);
            check(v, 1);
            check(a, 1);
        }
        nnk_color_hsva_i(h, s, v, a, color.address());
    }

    /** Array version of: {@link #nnk_color_hsva_iv} */
    public static native void nnk_color_hsva_iv(int[] hsva_out, long color);

    /** Array version of: {@link #nk_color_hsva_iv color_hsva_iv} */
    public static void nk_color_hsva_iv(@NativeType("int *") int[] hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_iv(hsva_out, color.address());
    }

    /** Array version of: {@link #nnk_color_hsva_f} */
    public static native void nnk_color_hsva_f(float[] out_h, float[] out_s, float[] out_v, float[] out_a, long color);

    /** Array version of: {@link #nk_color_hsva_f color_hsva_f} */
    public static void nk_color_hsva_f(@NativeType("float *") float[] out_h, @NativeType("float *") float[] out_s, @NativeType("float *") float[] out_v, @NativeType("float *") float[] out_a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
            check(out_a, 1);
        }
        nnk_color_hsva_f(out_h, out_s, out_v, out_a, color.address());
    }

    /** Array version of: {@link #nnk_color_hsva_fv} */
    public static native void nnk_color_hsva_fv(float[] hsva_out, long color);

    /** Array version of: {@link #nk_color_hsva_fv color_hsva_fv} */
    public static void nk_color_hsva_fv(@NativeType("float *") float[] hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_fv(hsva_out, color.address());
    }

    /** Array version of: {@link #nnk_vec2v} */
    public static native void nnk_vec2v(float[] xy, long __result);

    /** Array version of: {@link #nk_vec2v vec2v} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2v(@NativeType("float const *") float[] xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2v(xy, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_vec2iv} */
    public static native void nnk_vec2iv(int[] xy, long __result);

    /** Array version of: {@link #nk_vec2iv vec2iv} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2iv(@NativeType("int const *") int[] xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2iv(xy, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_rectv} */
    public static native void nnk_rectv(float[] xywh, long __result);

    /** Array version of: {@link #nk_rectv rectv} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rectv(@NativeType("float const *") float[] xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectv(xywh, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_rectiv} */
    public static native void nnk_rectiv(int[] xywh, long __result);

    /** Array version of: {@link #nk_rectiv rectiv} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rectiv(@NativeType("int const *") int[] xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectiv(xywh, __result.address());
        return __result;
    }

    /** Array version of: {@link #nnk_strmatch_fuzzy_string} */
    public static native int nnk_strmatch_fuzzy_string(long str, long pattern, int[] out_score);

    /** Array version of: {@link #nk_strmatch_fuzzy_string strmatch_fuzzy_string} */
    @NativeType("int")
    public static boolean nk_strmatch_fuzzy_string(@NativeType("char const *") ByteBuffer str, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") int[] out_score) {
        if (CHECKS) {
            checkNT1(str);
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_string(memAddress(str), memAddress(pattern), out_score) != 0;
    }

    /** Array version of: {@link #nk_strmatch_fuzzy_string strmatch_fuzzy_string} */
    @NativeType("int")
    public static boolean nk_strmatch_fuzzy_string(@NativeType("char const *") CharSequence str, @NativeType("char const *") CharSequence pattern, @NativeType("int *") int[] out_score) {
        if (CHECKS) {
            check(out_score, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            stack.nUTF8(pattern, true);
            long patternEncoded = stack.getPointerAddress();
            return nnk_strmatch_fuzzy_string(strEncoded, patternEncoded, out_score) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_strmatch_fuzzy_text} */
    public static native int nnk_strmatch_fuzzy_text(long txt, int txt_len, long pattern, int[] out_score);

    /** Array version of: {@link #nk_strmatch_fuzzy_text strmatch_fuzzy_text} */
    public static int nk_strmatch_fuzzy_text(@NativeType("char const *") ByteBuffer txt, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") int[] out_score) {
        if (CHECKS) {
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_text(memAddress(txt), txt.remaining(), memAddress(pattern), out_score);
    }

    /** Array version of: {@link #nk_strmatch_fuzzy_text strmatch_fuzzy_text} */
    public static int nk_strmatch_fuzzy_text(@NativeType("char const *") CharSequence txt, @NativeType("char const *") CharSequence pattern, @NativeType("int *") int[] out_score) {
        if (CHECKS) {
            check(out_score, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int txtEncodedLength = stack.nUTF8(txt, false);
            long txtEncoded = stack.getPointerAddress();
            stack.nUTF8(pattern, true);
            long patternEncoded = stack.getPointerAddress();
            return nnk_strmatch_fuzzy_text(txtEncoded, txtEncodedLength, patternEncoded, out_score);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_utf_decode} */
    public static native int nnk_utf_decode(long c, int[] u, int clen);

    /** Array version of: {@link #nk_utf_decode utf_decode} */
    public static int nk_utf_decode(@NativeType("char const *") ByteBuffer c, @NativeType("nk_rune *") int[] u) {
        if (CHECKS) {
            check(u, 1);
        }
        return nnk_utf_decode(memAddress(c), u, c.remaining());
    }

    /** Array version of: {@link #nnk_utf_at} */
    public static native long nnk_utf_at(long buffer, int length, int index, int[] unicode, long len);

    /** Array version of: {@link #nk_utf_at utf_at} */
    @Nullable
    @NativeType("char const *")
    public static ByteBuffer nk_utf_at(@NativeType("char const *") ByteBuffer buffer, int index, @NativeType("nk_rune *") int[] unicode) {
        if (CHECKS) {
            check(unicode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer len = stack.callocInt(1);
            long __result = nnk_utf_at(memAddress(buffer), buffer.remaining(), index, unicode, memAddress(len));
            return memByteBufferSafe(__result, len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_str_append_text_runes} */
    public static native int nnk_str_append_text_runes(long s, int[] runes, int len);

    /** Array version of: {@link #nk_str_append_text_runes str_append_text_runes} */
    public static int nk_str_append_text_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") int[] runes) {
        return nnk_str_append_text_runes(s.address(), runes, runes.length);
    }

    /** Array version of: {@link #nnk_str_append_str_runes} */
    public static native int nnk_str_append_str_runes(long s, int[] runes);

    /** Array version of: {@link #nk_str_append_str_runes str_append_str_runes} */
    public static int nk_str_append_str_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") int[] runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_append_str_runes(s.address(), runes);
    }

    /** Array version of: {@link #nnk_str_insert_text_runes} */
    public static native int nnk_str_insert_text_runes(long s, int pos, int[] runes, int len);

    /** Array version of: {@link #nk_str_insert_text_runes str_insert_text_runes} */
    public static int nk_str_insert_text_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") int[] runes) {
        return nnk_str_insert_text_runes(s.address(), pos, runes, runes.length);
    }

    /** Array version of: {@link #nnk_str_insert_str_runes} */
    public static native int nnk_str_insert_str_runes(long s, int pos, int[] runes);

    /** Array version of: {@link #nk_str_insert_str_runes str_insert_str_runes} */
    public static int nk_str_insert_str_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") int[] runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_insert_str_runes(s.address(), pos, runes);
    }

    /** Array version of: {@link #nnk_str_at_rune} */
    public static native long nnk_str_at_rune(long s, int pos, int[] unicode, long len);

    /** Array version of: {@link #nk_str_at_rune str_at_rune} */
    @Nullable
    @NativeType("char *")
    public static ByteBuffer nk_str_at_rune(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune *") int[] unicode) {
        if (CHECKS) {
            check(unicode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer len = stack.callocInt(1);
        try {
            long __result = nnk_str_at_rune(s.address(), pos, unicode, memAddress(len));
            return memByteBufferSafe(__result, len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_str_at_const} */
    public static native long nnk_str_at_const(long s, int pos, int[] unicode, long len);

    /** Array version of: {@link #nk_str_at_const str_at_const} */
    @Nullable
    @NativeType("char const *")
    public static ByteBuffer nk_str_at_const(@NativeType("struct nk_str const *") NkStr s, int pos, @NativeType("nk_rune *") int[] unicode) {
        if (CHECKS) {
            check(unicode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer len = stack.callocInt(1);
        try {
            long __result = nnk_str_at_const(s.address(), pos, unicode, memAddress(len));
            return memByteBufferSafe(__result, len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nnk_stroke_polyline} */
    public static native void nnk_stroke_polyline(long b, float[] points, int point_count, float line_thickness, long col);

    /** Array version of: {@link #nk_stroke_polyline stroke_polyline} */
    public static void nk_stroke_polyline(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float *") float[] points, float line_thickness, @NativeType("struct nk_color") NkColor col) {
        nnk_stroke_polyline(b.address(), points, points.length, line_thickness, col.address());
    }

    /** Array version of: {@link #nnk_stroke_polygon} */
    public static native void nnk_stroke_polygon(long b, float[] points, int point_count, float line_thickness, long color);

    /** Array version of: {@link #nk_stroke_polygon stroke_polygon} */
    public static void nk_stroke_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float *") float[] points, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_polygon(b.address(), points, points.length, line_thickness, color.address());
    }

    /** Array version of: {@link #nnk_fill_polygon} */
    public static native void nnk_fill_polygon(long b, float[] points, int point_count, long color);

    /** Array version of: {@link #nk_fill_polygon fill_polygon} */
    public static void nk_fill_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float *") float[] points, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_polygon(b.address(), points, points.length, color.address());
    }

}