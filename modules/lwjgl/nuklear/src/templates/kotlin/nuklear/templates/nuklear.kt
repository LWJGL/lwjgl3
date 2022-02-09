/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nuklear.templates

import org.lwjgl.generator.*
import nuklear.*

val nuklear = "Nuklear".nativeClass(Module.NUKLEAR, prefix = "NK", prefixMethod = "nk_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#define NK_PRIVATE
#define NK_INCLUDE_FIXED_TYPES
#define NK_INCLUDE_STANDARD_IO
#define NK_INCLUDE_STANDARD_BOOL
#define NK_INCLUDE_VERTEX_BUFFER_OUTPUT
#define NK_INCLUDE_COMMAND_USERDATA
#ifdef LWJGL_WINDOWS
    #define NK_BUTTON_TRIGGER_ON_RELEASE
#endif
#define NK_ZERO_COMMAND_MEMORY
#define NK_ASSERT(expr)
#define NK_IMPLEMENTATION
#define NK_MEMSET memset
#define NK_MEMCPY memcpy
#define NK_INV_SQRT(expr) (1.0f / sqrt(expr))
#define NK_SIN sinf
#define NK_COS cosf
#include <math.h>
#include <string.h>
#include "nuklear.h"
typedef float(*nk_value_getter)(void* user, int index);
typedef void(*nk_item_getter)(void*, int, const char**);
ENABLE_WARNINGS()""")

    documentation =
        """
        This is a minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was
        designed as a simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input
        handling but instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as
        output. So instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual
        UI.

        <h3>VALUES</h3>
        ${ul(
            "Immediate mode graphical user interface toolkit",
            "Single header library",
            "Written in C89 (ANSI C)",
            "Small codebase (~15kLOC)",
            "Focus on portability, efficiency and simplicity",
            "No dependencies (not even the standard library if not wanted)",
            "Fully skinnable and customizable",
            "Low memory footprint with total memory control if needed or wanted",
            "UTF-8 support",
            "No global or hidden state",
            "Customizable library modules (you can compile and use only what you need)",
            "Optional font baker and vertex buffer output"
        )}

        <h3>FEATURES</h3>
        ${ul(
            "Absolutely no platform dependent code",
            "Memory management control ranging from/to",
            "Ease of use by allocating everything from the standard library",
            "Control every byte of memory inside the library",
            "Font handling control ranging from/to",
            "Use your own font implementation for everything",
            "Use this libraries internal font baking and handling API",
            "Drawing output control ranging from/to",
            "Simple shapes for more high level APIs which already having drawing capabilities",
            "Hardware accessible anti-aliased vertex buffer output",
            "Customizable colors and properties ranging from/to",
            "Simple changes to color by filling a simple color table",
            "Complete control with ability to use skinning to decorate widgets",
            "Bendable UI library with widget ranging from/to",
            "Basic widgets like buttons, checkboxes, slider, ...",
            "Advanced widget like abstract comboboxes, contextual menus,...",
            "Compile time configuration to only compile what you need",
            "Subset which can be used if you do not want to link or use the standard library",
            "Can be easily modified to only update on user input instead of frame updates"
        )}

        <h3>FONT</h3>
        Font handling in this library was designed to be quite customizable and lets you decide what you want to use and what you want to provide. There are
        three different ways to use the font atlas. The first two will use your font handling scheme and only requires essential data to run nuklear. The next
        slightly more advanced features is font handling with vertex buffer output.
        ${ol(
            """
            Using your own implementation without vertex buffer output
            <hr>
            So first of the easiest way to do font handling is by just providing a ##NkUserFont struct which only requires the height in pixel of the used font
            and a callback to calculate the width of a string. This way of handling fonts is best fitted for using the normal draw shape command API where you
            do all the text drawing yourself and the library does not require any kind of deeper knowledge about which font handling mechanism you use.
            IMPORTANT: the ##NkUserFont pointer provided to nuklear has to persist over the complete life time! I know this sucks but it is currently the only
            way to switch between fonts.

            ${codeBlock("""
float your_text_width_calculation(nk_handle handle, float height, const char *text, int len)
{
    your_font_type *type = handle.ptr;
    float text_width = ...;
    return text_width;
}

struct nk_user_font font;
font.userdata.ptr = &your_font_class_or_struct;
font.height = your_font_height;
font.width = your_text_width_calculation;

struct nk_context ctx;
nk_init_default(&ctx, &font);""")}
            """,
            """
            Using your own implementation with vertex buffer output
            <hr>
            While the first approach works fine if you don't want to use the optional vertex buffer output it is not enough if you do. To get font handling
            working for these cases you have to provide two additional parameters inside the `nk_user_font`. First a texture atlas handle used to draw text as
            subimages of a bigger font atlas texture and a callback to query a character's glyph information (offset, size, ...). So it is still possible to
            provide your own font and use the vertex buffer output.

            ${codeBlock("""
float your_text_width_calculation(nk_handle handle, float height, const char *text, int len)
{
    your_font_type *type = handle.ptr;
    float text_width = ...;
    return text_width;
}
void query_your_font_glyph(nk_handle handle, float font_height, struct nk_user_font_glyph *glyph, nk_rune codepoint, nk_rune next_codepoint)
{
    your_font_type *type = handle.ptr;
    glyph.width = ...;
    glyph.height = ...;
    glyph.xadvance = ...;
    glyph.uv[0].x = ...;
    glyph.uv[0].y = ...;
    glyph.uv[1].x = ...;
    glyph.uv[1].y = ...;
    glyph.offset.x = ...;
    glyph.offset.y = ...;
}

struct nk_user_font font;
font.userdata.ptr = &your_font_class_or_struct;
font.height = your_font_height;
font.width = your_text_width_calculation;
font.query = query_your_font_glyph;
font.texture.id = your_font_texture;

struct nk_context ctx;
nk_init_default(&ctx, &font);""")}
            """
        )}

        <h3>MEMORY BUFFER</h3>
        A basic (double)-buffer with linear allocation and resetting as only freeing policy. The buffer's main purpose is to control all memory management
        inside the GUI toolkit and still leave memory control as much as possible in the hand of the user while also making sure the library is easy to use if
        not as much control is needed. In general all memory inside this library can be provided from the user in three different ways.

        The first way and the one providing most control is by just passing a fixed size memory block. In this case all control lies in the hand of the user
        since he can exactly control where the memory comes from and how much memory the library should consume. Of course using the fixed size API removes the
        ability to automatically resize a buffer if not enough memory is provided so you have to take over the resizing. While being a fixed sized buffer
        sounds quite limiting, it is very effective in this library since the actual memory consumption is quite stable and has a fixed upper bound for a lot
        of cases.

        If you don't want to think about how much memory the library should allocate at all time or have a very dynamic UI with unpredictable memory
        consumption habits but still want control over memory allocation you can use the dynamic allocator based API. The allocator consists of two callbacks
        for allocating and freeing memory and optional userdata so you can plugin your own allocator.

        <h3>TEXT EDITOR</h3>
        Editing text in this library is handled by either #edit_string() or #edit_buffer(). But like almost everything in this library there are multiple
        ways of doing it and a balance between control and ease of use with memory as well as functionality controlled by flags.

        This library generally allows three different levels of memory control: First of is the most basic way of just providing a simple char array with
        string length. This method is probably the easiest way of handling simple user text input. Main upside is complete control over memory while the
        biggest downside in comparsion with the other two approaches is missing undo/redo.

        For UIs that require undo/redo the second way was created. It is based on a fixed size ##NkTextEdit struct, which has an internal undo/redo stack. This
        is mainly useful if you want something more like a text editor but don't want to have a dynamically growing buffer.

        The final way is using a dynamically growing nk_text_edit struct, which has both a default version if you don't care where memory comes from and an
        allocator version if you do. While the text editor is quite powerful for its complexity I would not recommend editing gigabytes of data with it. It is
        rather designed for uses cases which make sense for a GUI library not for an full blown text editor.

        <h3>DRAWING</h3>
        This library was designed to be render backend agnostic so it does not draw anything to screen. Instead all drawn shapes, widgets are made of, are
        buffered into memory and make up a command queue. Each frame therefore fills the command buffer with draw commands that then need to be executed by the
        user and his own render backend. After that the command buffer needs to be cleared and a new frame can be started. It is probably important to note
        that the command buffer is the main drawing API and the optional vertex buffer API only takes this format and converts it into a hardware accessible
        format.

        To use the command queue to draw your own widgets you can access the command buffer of each window by calling #window_get_canvas() after previously
        having called #begin():
        ${codeBlock("""
void draw_red_rectangle_widget(struct nk_context *ctx)
{
    struct nk_command_buffer *canvas;
    struct nk_input *input = &ctx->input;
    canvas = nk_window_get_canvas(ctx);

    struct nk_rect space;
    enum nk_widget_layout_states state;
    state = nk_widget(&space, ctx);
    if (!state) return;

    if (state != NK_WIDGET_ROM)
        update_your_widget_by_user_input(...);
    nk_fill_rect(canvas, space, 0, nk_rgb(255,0,0));
}

if (nk_begin(...)) {
    nk_layout_row_dynamic(ctx, 25, 1);
    draw_red_rectangle_widget(ctx);
}
nk_end(..)""")}
        Important to know if you want to create your own widgets is the #widget() call. It allocates space on the panel reserved for this widget to be used,
        but also returns the state of the widget space. If your widget is not seen and does not have to be updated it is '0' and you can just return. If it
        only has to be drawn the state will be #WIDGET_ROM otherwise you can do both update and draw your widget. The reason for separating is to only draw and
        update what is actually neccessary which is crucial for performance.

        <h3>STACK</h3>
        The style modifier stack can be used to temporarily change a property inside `nk_style`. For example if you want a special red button you can
        temporarily push the old button color onto a stack draw the button with a red color and then you just pop the old color back from the stack:
        ${codeBlock("""
nk_style_push_style_item(ctx, &ctx->style.button.normal, nk_style_item_color(nk_rgb(255,0,0)));
nk_style_push_style_item(ctx, &ctx->style.button.hover, nk_style_item_color(nk_rgb(255,0,0)));
nk_style_push_style_item(ctx, &ctx->style.button.active, nk_style_item_color(nk_rgb(255,0,0)));
nk_style_push_vec2(ctx, &cx->style.button.padding, nk_vec2(2,2));
 
nk_button(...);
 
nk_style_pop_style_item(ctx);
nk_style_pop_style_item(ctx);
nk_style_pop_style_item(ctx);
nk_style_pop_vec2(ctx);""")}

        Nuklear has a stack for style_items, float properties, vector properties, flags, colors, fonts and for button_behavior. Each has it's own fixed size
        stack which can be changed in compile time.
        """

    IntConstant(
        "Constants.",

        "UTF_INVALID"..0xFFFD,
        "UTF_SIZE".."$NK_UTF_SIZE",
        "INPUT_MAX".."16",
        "MAX_NUMBER_BUFFER".."64"
    )

    FloatConstant(
        "Constants.",

        "UNDEFINED"..-1.0f,
        "SCROLLBAR_HIDING_TIMEOUT"..4.0f
    )

    EnumConstant(
        "Boolean values.",

        "nk_false".enum,
        "nk_true".enum
    ).noPrefix()

    val Headings = EnumConstant(
        "nk_heading",

        "UP".enum,
        "RIGHT".enum,
        "DOWN".enum,
        "LEFT".enum
    ).javaDocLinks

    val ButtonBehaviors = EnumConstant(
        "nk_button_behavior",

        "BUTTON_DEFAULT".enum,
        "BUTTON_REPEATER".enum
    ).javaDocLinks

    EnumConstant(
        "nk_modify",

        "FIXED".enum("", "nk_false"),
        "MODIFIABLE".enum("", "nk_true")
    )

    EnumConstant(
        "nk_orientation",

        "VERTICAL".enum,
        "HORIZONTAL".enum
    )

    val CollapseStates = EnumConstant(
        "nk_collapse_states",

        "MINIMIZED".enum("", "nk_false"),
        "MAXIMIZED".enum("", "nk_true")
    ).javaDocLinks

    val ShowStates = EnumConstant(
        "nk_show_states",

        "HIDDEN".enum("", "nk_false"),
        "SHOWN".enum("", "nk_true")
    ).javaDocLinks

    val ChartTypes = EnumConstant(
        "nk_chart_type",

        "CHART_LINES".enum,
        "CHART_COLUMN".enum,
        "CHART_MAX".enum
    ).javaDocLinks

    EnumConstant(
        "nk_chart_event",

        "CHART_HOVERING".enum(0x01),
        "CHART_CLICKED".enum(0x02)
    )

    val ColorFormats = EnumConstant(
        "nk_color_format",

        "RGB".enum,
        "RGBA".enum
    ).javaDocLinks

    val PopupTypes = EnumConstant(
        "nk_popup_type",

        "POPUP_STATIC".enum,
        "POPUP_DYNAMIC".enum
    ).javaDocLinks

    val LayoutFormats = EnumConstant(
        "nk_layout_format",

        "DYNAMIC".enum,
        "STATIC".enum
    ).javaDocLinks

    val TreeTypes = EnumConstant(
        "nk_tree_type",

        "TREE_NODE".enum,
        "TREE_TAB".enum
    ).javaDocLinks

    val Antialiasing = EnumConstant(
        "nk_anti_aliasing",

        "ANTI_ALIASING_OFF".enum,
        "ANTI_ALIASING_ON".enum
    ).javaDocLinks

    EnumConstant(
        "nk_convert_result",

        "CONVERT_SUCCESS".enum("Signals a successful draw command to vertex buffer conversion.", 0),
        "CONVERT_INVALID_PARAM".enum("An invalid argument was passed in the function call.", 1),
        "CONVERT_COMMAND_BUFFER_FULL".enum("The provided buffer for storing draw commands is full or failed to allocate more memory.", 1.NK_FLAG),
        "CONVERT_VERTEX_BUFFER_FULL".enum("The provided buffer for storing vertices is full or failed to allocate more memory.", 2.NK_FLAG),
        "CONVERT_ELEMENT_BUFFER_FULL".enum("The provided buffer for storing indices is full or failed to allocate more memory.", 3.NK_FLAG)
    )

    val SymbolTypes = EnumConstant(
        "nk_symbol_type",

        "SYMBOL_NONE".enum,
        "SYMBOL_X".enum,
        "SYMBOL_UNDERSCORE".enum,
        "SYMBOL_CIRCLE_SOLID".enum,
        "SYMBOL_CIRCLE_OUTLINE".enum,
        "SYMBOL_RECT_SOLID".enum,
        "SYMBOL_RECT_OUTLINE".enum,
        "SYMBOL_TRIANGLE_UP".enum,
        "SYMBOL_TRIANGLE_DOWN".enum,
        "SYMBOL_TRIANGLE_LEFT".enum,
        "SYMBOL_TRIANGLE_RIGHT".enum,
        "SYMBOL_PLUS".enum,
        "SYMBOL_MINUS".enum,
        "SYMBOL_MAX".enum
    ).javaDocLinks

    val Keys = EnumConstant(
        "nk_keys",

        "KEY_NONE".enum,
        "KEY_SHIFT".enum,
        "KEY_CTRL".enum,
        "KEY_DEL".enum,
        "KEY_ENTER".enum,
        "KEY_TAB".enum,
        "KEY_BACKSPACE".enum,
        "KEY_COPY".enum,
        "KEY_CUT".enum,
        "KEY_PASTE".enum,
        "KEY_UP".enum,
        "KEY_DOWN".enum,
        "KEY_LEFT".enum,
        "KEY_RIGHT".enum,
        "KEY_TEXT_INSERT_MODE".enum,
        "KEY_TEXT_REPLACE_MODE".enum,
        "KEY_TEXT_RESET_MODE".enum,
        "KEY_TEXT_LINE_START".enum,
        "KEY_TEXT_LINE_END".enum,
        "KEY_TEXT_START".enum,
        "KEY_TEXT_END".enum,
        "KEY_TEXT_UNDO".enum,
        "KEY_TEXT_REDO".enum,
        "KEY_TEXT_SELECT_ALL".enum,
        "KEY_TEXT_WORD_LEFT".enum,
        "KEY_TEXT_WORD_RIGHT".enum,
        "KEY_SCROLL_START".enum,
        "KEY_SCROLL_END".enum,
        "KEY_SCROLL_DOWN".enum,
        "KEY_SCROLL_UP".enum,

        "KEY_MAX".enum
    ).javaDocLinks { !it.name.endsWith("MAX") }

    val Buttons = EnumConstant(
        "nk_buttons",

        "BUTTON_LEFT".enum,
        "BUTTON_MIDDLE".enum,
        "BUTTON_RIGHT".enum,
        "BUTTON_DOUBLE".enum,

        "BUTTON_MAX".enum
    ).javaDocLinks { !it.name.endsWith("MAX") }

    val StyleColors = EnumConstant(
        "nk_style_colors",

        "COLOR_TEXT".enum,
        "COLOR_WINDOW".enum,
        "COLOR_HEADER".enum,
        "COLOR_BORDER".enum,
        "COLOR_BUTTON".enum,
        "COLOR_BUTTON_HOVER".enum,
        "COLOR_BUTTON_ACTIVE".enum,
        "COLOR_TOGGLE".enum,
        "COLOR_TOGGLE_HOVER".enum,
        "COLOR_TOGGLE_CURSOR".enum,
        "COLOR_SELECT".enum,
        "COLOR_SELECT_ACTIVE".enum,
        "COLOR_SLIDER".enum,
        "COLOR_SLIDER_CURSOR".enum,
        "COLOR_SLIDER_CURSOR_HOVER".enum,
        "COLOR_SLIDER_CURSOR_ACTIVE".enum,
        "COLOR_PROPERTY".enum,
        "COLOR_EDIT".enum,
        "COLOR_EDIT_CURSOR".enum,
        "COLOR_COMBO".enum,
        "COLOR_CHART".enum,
        "COLOR_CHART_COLOR".enum,
        "COLOR_CHART_COLOR_HIGHLIGHT".enum,
        "COLOR_SCROLLBAR".enum,
        "COLOR_SCROLLBAR_CURSOR".enum,
        "COLOR_SCROLLBAR_CURSOR_HOVER".enum,
        "COLOR_SCROLLBAR_CURSOR_ACTIVE".enum,
        "COLOR_TAB_HEADER".enum,

        "COLOR_COUNT".enum
    ).javaDocLinksSkipCount

    val StyleCursor = EnumConstant(
        "nk_style_cursor",

        "CURSOR_ARROW".enum,
        "CURSOR_TEXT".enum,
        "CURSOR_MOVE".enum,
        "CURSOR_RESIZE_VERTICAL".enum,
        "CURSOR_RESIZE_HORIZONTAL".enum,
        "CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT".enum,
        "CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT".enum,

        "CURSOR_COUNT".enum
    ).javaDocLinksSkipCount

    EnumConstant(
        "nk_widget_layout_states",

        "WIDGET_INVALID".enum("The widget cannot be seen and is completely out of view"),
        "WIDGET_VALID".enum("The widget is completely inside the window and can be updated and drawn"),
        "WIDGET_ROM".enum("The widget is partially visible and cannot be updated")
    )

    EnumConstant(
        "nk_widget_states",

        "WIDGET_STATE_MODIFIED".enum("", 1.NK_FLAG),
        "WIDGET_STATE_INACTIVE".enum("widget is neither active nor hovered", 2.NK_FLAG),
        "WIDGET_STATE_ENTERED".enum("widget has been hovered on the current frame", 3.NK_FLAG),
        "WIDGET_STATE_HOVER".enum("widget is being hovered", 4.NK_FLAG),
        "WIDGET_STATE_ACTIVED".enum("widget is currently activated", 5.NK_FLAG),
        "WIDGET_STATE_LEFT".enum("widget is from this frame on not hovered anymore", 6.NK_FLAG),
        "WIDGET_STATE_HOVERED".enum("widget is being hovered", "NK_WIDGET_STATE_HOVER|NK_WIDGET_STATE_MODIFIED"),
        "WIDGET_STATE_ACTIVE".enum("widget is currently activated", "NK_WIDGET_STATE_ACTIVED|NK_WIDGET_STATE_MODIFIED")
    )

    EnumConstant(
        "nk_text_align",

        "TEXT_ALIGN_LEFT".enum(0x01),
        "TEXT_ALIGN_CENTERED".enum(0x02),
        "TEXT_ALIGN_RIGHT".enum(0x04),
        "TEXT_ALIGN_TOP".enum(0x08),
        "TEXT_ALIGN_MIDDLE".enum(0x10),
        "TEXT_ALIGN_BOTTOM".enum(0x20)
    )

    val TextAlignments = EnumConstant(
        "nk_text_alignment",

        "TEXT_LEFT".enum("", "NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_LEFT"),
        "TEXT_CENTERED".enum("", "NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_CENTERED"),
        "TEXT_RIGHT".enum("", "NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_RIGHT")
    ).javaDocLinks

    val EditFlags = EnumConstant(
        "nk_edit_flags",

        "EDIT_DEFAULT".enum(0),
        "EDIT_READ_ONLY".enum("", 0.NK_FLAG),
        "EDIT_AUTO_SELECT".enum("", 1.NK_FLAG),
        "EDIT_SIG_ENTER".enum("", 2.NK_FLAG),
        "EDIT_ALLOW_TAB".enum("", 3.NK_FLAG),
        "EDIT_NO_CURSOR".enum("", 4.NK_FLAG),
        "EDIT_SELECTABLE".enum("", 5.NK_FLAG),
        "EDIT_CLIPBOARD".enum("", 6.NK_FLAG),
        "EDIT_CTRL_ENTER_NEWLINE".enum("", 7.NK_FLAG),
        "EDIT_NO_HORIZONTAL_SCROLL".enum("", 8.NK_FLAG),
        "EDIT_ALWAYS_INSERT_MODE".enum("", 9.NK_FLAG),
        "EDIT_MULTILINE".enum("", 10.NK_FLAG),
        "EDIT_GOTO_END_ON_ACTIVATE".enum("", 11.NK_FLAG)
    ).javaDocLinks

    EnumConstant(
        "nk_edit_types",

        "EDIT_SIMPLE".enum("", "NK_EDIT_ALWAYS_INSERT_MODE"),
        "EDIT_FIELD".enum("", "NK_EDIT_SIMPLE|NK_EDIT_SELECTABLE|NK_EDIT_CLIPBOARD"),
        "EDIT_BOX".enum("", "NK_EDIT_ALWAYS_INSERT_MODE|NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD"),
        "EDIT_EDITOR".enum("", "NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD")
    )

    EnumConstant(
        "nk_edit_events",

        "EDIT_ACTIVE".enum("edit widget is currently being modified", 0.NK_FLAG),
        "EDIT_INACTIVE".enum("edit widget is not active and is not being modified", 1.NK_FLAG),
        "EDIT_ACTIVATED".enum("edit widget went from state inactive to state active", 2.NK_FLAG),
        "EDIT_DEACTIVATED".enum("edit widget went from state active to state inactive", 3.NK_FLAG),
        "EDIT_COMMITED".enum("edit widget has received an enter and lost focus", 4.NK_FLAG)
    )

    val PanelFlags = EnumConstant(
        "nk_panel_flags",

        "WINDOW_BORDER".enum("Draws a border around the window to visually separate the window from the background", 0.NK_FLAG),
        "WINDOW_MOVABLE".enum("The movable flag indicates that a window can be moved by user input or by dragging the window header", 1.NK_FLAG),
        "WINDOW_SCALABLE".enum("The scalable flag indicates that a window can be scaled by user input by dragging a scaler icon at the button of the window", 2.NK_FLAG),
        "WINDOW_CLOSABLE".enum("adds a closable icon into the header", 3.NK_FLAG),
        "WINDOW_MINIMIZABLE".enum("adds a minimize icon into the header", 4.NK_FLAG),
        "WINDOW_NO_SCROLLBAR".enum("Removes the scrollbar from the window", 5.NK_FLAG),
        "WINDOW_TITLE".enum("Forces a header at the top at the window showing the title", 6.NK_FLAG),
        "WINDOW_SCROLL_AUTO_HIDE".enum("Automatically hides the window scrollbar if no user interaction: also requires delta time in {@code nk_context} to be set each frame", 7.NK_FLAG),
        "WINDOW_BACKGROUND".enum("Always keep window in the background", 8.NK_FLAG),
        "WINDOW_SCALE_LEFT".enum("Puts window scaler in the left-bottom corner instead right-bottom", 9.NK_FLAG),
        "WINDOW_NO_INPUT".enum("Prevents window of scaling, moving or getting focus", 10.NK_FLAG)
    ).javaDocLinks

    EnumConstant(
        "nk_allocation_type",

        "BUFFER_FIXED".enum,
        "BUFFER_DYNAMIC".enum
    )

    val BufferAllocationTypes = EnumConstant(
        "nk_buffer_allocation_type",

        "BUFFER_FRONT".enum,
        "BUFFER_BACK".enum,
        "BUFFER_MAX".enum
    ).javaDocLinks

    EnumConstant(
        "nk_text_edit_type",

        "TEXT_EDIT_SINGLE_LINE".enum,
        "TEXT_EDIT_MULTI_LINE".enum
    )

    EnumConstant(
        "nk_text_edit_mode",

        "TEXT_EDIT_MODE_VIEW".enum,
        "TEXT_EDIT_MODE_INSERT".enum,
        "TEXT_EDIT_MODE_REPLACE".enum
    )

    EnumConstant(
        "nk_font_atlas_format",

        "FONT_ATLAS_ALPHA8".enum,
        "FONT_ATLAS_RGBA32".enum
    )

    EnumConstant(
        "nk_command_type",

        "COMMAND_NOP".enum,
        "COMMAND_SCISSOR".enum,
        "COMMAND_LINE".enum,
        "COMMAND_CURVE".enum,
        "COMMAND_RECT".enum,
        "COMMAND_RECT_FILLED".enum,
        "COMMAND_RECT_MULTI_COLOR".enum,
        "COMMAND_CIRCLE".enum,
        "COMMAND_CIRCLE_FILLED".enum,
        "COMMAND_ARC".enum,
        "COMMAND_ARC_FILLED".enum,
        "COMMAND_TRIANGLE".enum,
        "COMMAND_TRIANGLE_FILLED".enum,
        "COMMAND_POLYGON".enum,
        "COMMAND_POLYGON_FILLED".enum,
        "COMMAND_POLYLINE".enum,
        "COMMAND_TEXT".enum,
        "COMMAND_IMAGE".enum,
        "COMMAND_CUSTOM".enum
    )

    EnumConstant(
        "nk_command_clipping",

        "CLIPPING_OFF".enum("", "nk_false"),
        "CLIPPING_ON".enum("", "nk_true")
    )

    val DrawListStrokes = EnumConstant(
        "nk_draw_list_stroke",

        "STROKE_OPEN".enum("build up path has no connection back to the beginning", "nk_false"),
        "STROKE_CLOSED".enum("build up path has a connection back to the beginning", "nk_true")
    ).javaDocLinks

    EnumConstant(
        "nk_draw_vertex_layout_attribute",

        "VERTEX_POSITION".enum,
        "VERTEX_COLOR".enum,
        "VERTEX_TEXCOORD".enum,

        "VERTEX_ATTRIBUTE_COUNT".enum
    )

    EnumConstant(
        "nk_draw_vertex_layout_format",

        "FORMAT_SCHAR".enum,
        "FORMAT_SSHORT".enum,
        "FORMAT_SINT".enum,
        "FORMAT_UCHAR".enum,
        "FORMAT_USHORT".enum,
        "FORMAT_UINT".enum,
        "FORMAT_FLOAT".enum,
        "FORMAT_DOUBLE".enum,

        "FORMAT_R8G8B8".enum,
        "FORMAT_R16G15B16".enum,
        "FORMAT_R32G32B32".enum,

        "FORMAT_R8G8B8A8".enum,
        "FORMAT_B8G8R8A8".enum,
        "FORMAT_R16G15B16A16".enum,
        "FORMAT_R32G32B32A32".enum,
        "FORMAT_R32G32B32A32_FLOAT".enum,
        "FORMAT_R32G32B32A32_DOUBLE".enum,

        "FORMAT_RGB32".enum,
        "FORMAT_RGBA32".enum,

        "FORMAT_COUNT".enum
    )

    EnumConstant(
        "nk_style_item_type",

        "STYLE_ITEM_COLOR".enum,
        "STYLE_ITEM_IMAGE".enum,
        "STYLE_ITEM_NINE_SLICE".enum
    )

    EnumConstant(
        "nk_style_header_align",

        "HEADER_LEFT".enum,
        "HEADER_RIGHT".enum
    )

    EnumConstant(
        "nk_panel_type",

        "PANEL_NONE".enum("", "0"),
        "PANEL_WINDOW".enum("", 0.NK_FLAG),
        "PANEL_GROUP".enum("", 1.NK_FLAG),
        "PANEL_POPUP".enum("", 2.NK_FLAG),
        "PANEL_CONTEXTUAL".enum("", 4.NK_FLAG),
        "PANEL_COMBO".enum("", 5.NK_FLAG),
        "PANEL_MENU".enum("", 6.NK_FLAG),
        "PANEL_TOOLTIP".enum("", 7.NK_FLAG)
    )

    EnumConstant(
        "nk_panel_set",

        "PANEL_SET_NONBLOCK".enum("", "NK_PANEL_CONTEXTUAL|NK_PANEL_COMBO|NK_PANEL_MENU|NK_PANEL_TOOLTIP"),
        "PANEL_SET_POPUP".enum("", "NK_PANEL_SET_NONBLOCK|NK_PANEL_POPUP"),
        "PANEL_SET_SUB".enum("", "NK_PANEL_SET_POPUP|NK_PANEL_GROUP")
    )

    EnumConstant(
        "nk_panel_row_layout_type",

        "LAYOUT_DYNAMIC_FIXED".enum,
        "LAYOUT_DYNAMIC_ROW".enum,
        "LAYOUT_DYNAMIC_FREE".enum,
        "LAYOUT_DYNAMIC".enum,
        "LAYOUT_STATIC_FIXED".enum,
        "LAYOUT_STATIC_ROW".enum,
        "LAYOUT_STATIC_FREE".enum,
        "LAYOUT_STATIC".enum,
        "LAYOUT_TEMPLATE".enum,
        "LAYOUT_COUNT".enum
    )

    val WindowFlags = EnumConstant(
        "nk_window_flags",

        "WINDOW_PRIVATE".enum("", 11.NK_FLAG),
        "WINDOW_DYNAMIC".enum("special window type growing up in height while being filled to a certain maximum height", "NK_WINDOW_PRIVATE"),
        "WINDOW_ROM".enum("sets the window into a read only mode and does not allow input changes", 12.NK_FLAG),
        "WINDOW_HIDDEN".enum("Hides the window and stops any window interaction and drawing can be set by user input or by closing the window", 13.NK_FLAG),
        "WINDOW_CLOSED".enum("Directly closes and frees the window at the end of the frame", 14.NK_FLAG),
        "WINDOW_MINIMIZED".enum("marks the window as minimized", 15.NK_FLAG),
        "WINDOW_REMOVE_ROM".enum("Removes the read only mode at the end of the window", 16.NK_FLAG)
    ).javaDocLinks

    val ctx = nk_context.p("ctx", "the nuklear context")
    val cctx = nk_context.const.p("ctx", "the nuklear context");

    {
        nk_bool(
            "init_fixed",
            """
            Initializes context from single fixed size memory block.

            Should be used if you want complete control over nuklears memory management. Especially recommended for system with little memory or systems with
            virtual memory. For the later case you can just allocate for example 16MB of virtual memory and only the required amount of memory will actually be
            committed.

            IMPORTANT: make sure the passed memory block is aligned correctly for ##NkDrawCommand.
            """,

            ctx,
            void.p("memory", "must point to a previously allocated memory block"),
            AutoSize("memory")..nk_size("size", "must contain the total size of {@code memory}"),
            nullable..nk_user_font.const.p("font", "must point to a previously initialized font handle")
        )

        nk_bool(
            "init",
            """
            Initializes context with memory allocator callbacks for alloc and free.

            Used internally for {@code nk_init_default} and provides a kitchen sink allocation interface to nuklear. Can be useful for cases like monitoring
            memory consumption.
            """,

            ctx,
            nk_allocator.p("allocator", "must point to a previously allocated memory allocator"),
            nullable..nk_user_font.const.p("font", "must point to a previously initialized font handle")
        )

        nk_bool(
            "init_custom",
            "Initializes context from two buffers. One for draw commands the other for window/panel/table allocations.",

            ctx,
            nk_buffer_p("cmds", "must point to a previously initialized memory buffer either fixed or dynamic to store draw commands into"),
            nk_buffer_p("pool", "must point to a previously initialized memory buffer either fixed or dynamic to store windows, panels and tables"),
            nullable..nk_user_font.const.p("font", "must point to a previously initialized font handle")
        )

        void(
            "clear",
            """
            Called at the end of the frame to reset and prepare the context for the next frame.

            Resets the context state at the end of the frame. This includes mostly garbage collector tasks like removing windows or table not called and
            therefore used anymore.
            """,

            ctx
        )

        void(
            "free",
            """
            Shutdown and free all memory allocated inside the context.

            Frees all memory allocated by nuklear. Not needed if context was initialized with #init_fixed().
            """,

            ctx
        )

        void(
            "set_user_data",
            "Utility function to pass user data to draw command.",

            ctx,
            nk_handle("handle", "handle with either pointer or index to be passed into every draw commands")
        )

        nk_bool(
            "begin",
            "Starts a new window; needs to be called every frame for every window (unless hidden) or otherwise the window gets removed.",

            ctx,
            charUTF8.const.p("title", ""),
            nk_rect("bounds", ""),
            nk_flags("flags", "", WindowFlags, LinkMode.BITFIELD)
        )

        nk_bool(
            "begin_titled",
            "Extended window start with separated title and identifier to allow multiple windows with same title but not name.",

            ctx,
            charUTF8.const.p("name", ""),
            charUTF8.const.p("title", ""),
            nk_rect("bounds", ""),
            nk_flags("flags", "", WindowFlags, LinkMode.BITFIELD)
        )

        void(
            "end",
            "Needs to be called at the end of the window building process to process scaling, scrollbars and general cleanup.",

            ctx
        )

        nk_window.p(
            "window_find",
            "Finds and returns a window from passed name.",

            ctx,
            charUTF8.const.p("name", "")
        )

        nk_rect("window_get_bounds", "Returns a rectangle with screen position and size of the currently processed window.", cctx)
        nk_vec2("window_get_position", "Returns the position of the currently processed window.", cctx)
        nk_vec2("window_get_size", "Returns the size with width and height of the currently processed window.", cctx)

        float("window_get_width", "Returns the width of the currently processed window.", cctx)
        float("window_get_height", "Returns the height of the currently processed window.", cctx)

        nk_panel.p("window_get_panel", "Returns the underlying panel which contains all processing state of the current window.", ctx)

        nk_rect("window_get_content_region", "Returns the position and size of the currently visible and non-clipped space inside the currently processed window.", ctx)
        nk_vec2("window_get_content_region_min", "Returns the upper rectangle position of the currently visible and non-clipped space inside the currently processed window.", ctx)
        nk_vec2("window_get_content_region_max", "Returns the upper rectangle position of the currently visible and non-clipped space inside the currently processed window.", ctx)
        nk_vec2("window_get_content_region_size", "Returns the size of the currently visible and non-clipped space inside the currently processed window.", ctx)

        nk_command_buffer.p("window_get_canvas", "Returns the draw command buffer. Can be used to draw custom widgets.", ctx)

        void(
            "window_get_scroll",
            """
            Gets the scroll offset for the current window.
            
            Warning: Only call this function between calls {@code nk_begin_xxx} and #end().
            """,

            ctx,
            nullable..Check(1)..nk_uint.p("offset_x", "a pointer to the x offset output (or #NULL to ignore)"),
            nullable..Check(1)..nk_uint.p("offset_y", "a pointer to the y offset output (or #NULL to ignore)")
        )

        nk_bool("window_has_focus", "Returns if the currently processed window is currently active.", cctx)

        nk_bool(
            "window_is_collapsed",
            "Returns if the window with given name is currently minimized/collapsed.",

            ctx,
            charUTF8.const.p("name", "")
        )

        nk_bool(
            "window_is_closed",
            "Returns if the currently processed window was closed.",

            ctx,
            charUTF8.const.p("name", "")
        )

        nk_bool(
            "window_is_hidden",
            "Returns if the currently processed window was hidden.",

            ctx,
            charUTF8.const.p("name", "")
        )

        nk_bool(
            "window_is_active",
            "Same as #window_has_focus() for some reason.",

            ctx,
            charUTF8.const.p("name", "")
        )

        nk_bool("window_is_hovered", "Returns if the currently processed window is currently being hovered by mouse.", ctx)

        nk_bool("window_is_any_hovered", "Return if any window currently hovered.", ctx)

        nk_bool("item_is_any_active", "Returns if any window or widgets is currently hovered or active.", ctx)

        void(
            "window_set_bounds",
            "Updates position and size of the specified window.",

            ctx,
            charUTF8.const.p("name", "name of the window to modify both position and size"),
            nk_rect("bounds", "points to a {@code nk_rect} struct with the new position and size of the specified window")
        )

        void(
            "window_set_position",
            "Updates position of the currently process window.",

            ctx,
            charUTF8.const.p("name", "name of the window to modify position of"),
            nk_vec2("position", "points to a {@code nk_vec2} struct with the new position of currently active window")
        )

        void(
            "window_set_size",
            "Updates the size of the specified window.",

            ctx,
            charUTF8.const.p("name", "name of the window to modify size of"),
            nk_vec2("size", "points to a {@code nk_vec2} struct with the new size of currently active window")
        )

        void(
            "window_set_focus",
            "Sets the specified window as active window.",

            ctx,
            charUTF8.const.p("name", "name of the window to be set active")
        )

        void(
            "window_set_scroll",
            """
            Sets the scroll offset for the current window.
            
            Warning: Only call this function between calls {@code nk_begin_xxx} and #end().
            """,

            ctx,
            nk_uint("offset_x", "the x offset to scroll to"),
            nk_uint("offset_y", "the y offset to scroll to")
        )

        void(
            "window_close",
            "Closes the window with given window name which deletes the window at the end of the frame.",

            ctx,
            charUTF8.const.p("name", "")
        )

        void(
            "window_collapse",
            "Collapses the window with given window name.",

            ctx,
            charUTF8.const.p("name", ""),
            nk_collapse_states("c", "", CollapseStates)
        )

        void(
            "window_collapse_if",
            "Collapses the window with given window name if the given condition was met.",

            ctx,
            charUTF8.const.p("name", ""),
            nk_collapse_states("c", "", CollapseStates),
            nk_bool("cond", "")
        )

        void(
            "window_show",
            "Hides a visible or reshows a hidden window.",

            ctx,
            charUTF8.const.p("name", ""),
            nk_show_states("s", "", ShowStates)
        )

        void(
            "window_show_if",
            "Hides/shows a window depending on condition.",

            ctx,
            charUTF8.const.p("name", ""),
            nk_show_states("s", "", ShowStates),
            nk_bool("cond", "")
        )

        void(
            "layout_set_min_row_height",
            """
            Sets the currently used minimum row height.

            IMPORTANT: The passed height needs to include both your preferred row height as well as padding. No internal padding is added.
            """,

            ctx,
            float("height", "new minimum row height to be used for auto generating the row height")
        )

        void(
            "layout_reset_min_row_height",
            """
            Resets the currently used minimum row height back to font height + text padding + additional padding
            ({@code style_window.min_row_height_padding}).
            """,

            ctx
        )

        nk_rect(
            "layout_widget_bounds",
            "Returns the width of the next row allocate by one of the layouting functions.",

            ctx
        )

        float(
            "layout_ratio_from_pixel",
            "Utility function to calculate window ratio from pixel size.",

            ctx,
            float("pixel_width", "pixel width to convert to window ratio")
        )

        void(
            "layout_row_dynamic",
            """
            Sets current row layout to share horizontal space between {@code cols} number of widgets evenly. Once called all subsequent widget calls greater
            than {@code cols} will allocate a new row with same layout.
            """,

            ctx,
            float("height", "holds height of each widget in row or zero for auto layouting"),
            nk_int("cols", "number of widgets inside row")
        )
        void(
            "layout_row_static",
            """
            Sets current row layout to fill {@code cols} number of widgets in row with same {@code item_width} horizontal size. Once called all subsequent
            widget calls greater than {@code cols} will allocate a new row with same layout.
            """,

            ctx,
            float("height", "holds row height to allocate from panel for widget height"),
            nk_int("item_width", "holds width of each widget in row"),
            nk_int("cols", "number of widgets inside row")
        )

        void(
            "layout_row_begin",
            "Starts a new dynamic or fixed row with given height and columns.",

            ctx,
            nk_layout_format("fmt", "either #DYNAMIC for window ratio or #STATIC for fixed size columns", LayoutFormats),
            float("row_height", "holds height of each widget in row or zero for auto layouting"),
            nk_int("cols", "number of widgets inside row")
        )
        void(
            "layout_row_push",
            "Specifies either window ratio or width of a single column.",

            ctx,
            float("value", "either a window ratio or fixed width depending on {@code fmt} in previous #layout_row_begin() call")
        )
        void(
            "layout_row_end",
            "Finishes previously started row",

            ctx
        )
        void(
            "layout_row",
            "Specifies row columns in array as either window ratio or size.",

            ctx,
            nk_layout_format("fmt", "either #DYNAMIC for window ratio or #STATIC for fixed size columns", LayoutFormats),
            float("height", "holds height of each widget in row or zero for auto layouting"),
            AutoSize("ratio")..nk_int("cols", "number of widgets inside row"),
            float.const.p("ratio", "")
        )

        void(
            "layout_row_template_begin",
            "Begins the row template declaration.",

            ctx,
            float("height", "holds height of each widget in row or zero for auto layouting")
        )
        void(
            "layout_row_template_push_dynamic",
            "Adds a dynamic column that dynamically grows and can go to zero if not enough space.",

            ctx
        )
        void(
            "layout_row_template_push_variable",
            "Adds a variable column that dynamically grows but does not shrink below specified pixel width.",

            ctx,
            float("min_width", "holds the minimum pixel width the next column must be")
        )
        void(
            "layout_row_template_push_static",
            "Adds a static column that does not grow and will always have the same size.",

            ctx,
            float("width", "holds the absolute pixel width value the next column must be")
        )

        void(
            "layout_row_template_end",
            "Marks the end of the row template.",

            ctx
        )

        void(
            "layout_space_begin",
            "Begins a new layouting space that allows to specify each widgets position and size.",

            ctx,
            nk_layout_format("fmt", "either #DYNAMIC for window ratio or #STATIC for fixed size columns", LayoutFormats),
            float("height", "holds height of each widget in row or zero for auto layouting"),
            nk_int("widget_count", "number of widgets inside row")
        )
        void(
            "layout_space_push",
            "Pushes position and size of the next widget in own coordiante space either as pixel or ratio.",

            ctx,
            nk_rect("rect", "position and size in layout space local coordinates")
        )
        void(
            "layout_space_end",
            "Marks the end of the layout space.",

            ctx
        )

        nk_rect(
            "layout_space_bounds",
            "Returns total space allocated for {@code nk_layout_space}.",

            ctx
        )

        nk_vec2(
            "layout_space_to_screen",
            "Converts vector from {@code nk_layout_space} coordinate space into screen space.",

            ctx,
            ReturnParam..nk_vec2("ret", "position to convert from layout space into screen coordinate space")
        )

        nk_vec2(
            "layout_space_to_local",
            "Converts vector from layout space into screen space.",

            ctx,
            ReturnParam..nk_vec2("ret", "position to convert from screen space into layout coordinate space")
        )

        nk_rect(
            "layout_space_rect_to_screen",
            "Converts rectangle from screen space into layout space.",

            ctx,
            ReturnParam..nk_rect("ret", "rectangle to convert from layout space into screen space")
        )

        nk_rect(
            "layout_space_rect_to_local",
            "Converts rectangle from layout space into screen space.",

            ctx,
            ReturnParam..nk_rect("ret", "rectangle to convert from screen space into layout space")
        )

        void(
            "spacer",
            "Spacer is a dummy widget that consumes space as usual but doesn't draw anything.",

            ctx
        )

        nk_bool(
            "group_begin",
            "Start a new group with internal scrollbar handling.",

            ctx,
            charUTF8.const.p("title", ""),
            nk_flags("flags", "")
        )
        nk_bool(
            "group_begin_titled",
            "Start a new group with separated name and title and internal scrollbar handling.",

            ctx,
            charUTF8.const.p("name", "must be an unique identifier for this group"),
            charUTF8.const.p("title", "group header title"),
            nk_flags(
                "flags",
                "window flags defined in the nk_panel_flags section with a number of different group behaviors",
                WindowFlags, LinkMode.BITFIELD
            ),

            returnDoc = "{@code true} if visible and fillable with widgets or {@code false} otherwise"
        )
        void("group_end", "Ends a group. Should only be called if #group_begin() returned non-zero.", ctx)
        nk_bool(
            "group_scrolled_offset_begin",
            "Start a new group with manual separated handling of scrollbar x- and y-offset.",

            ctx,
            Check(1)..nk_uint.p("x_offset", ""),
            Check(1)..nk_uint.p("y_offset", ""),
            charUTF8.const.p("title", ""),
            nk_flags("flags", "")
        )
        nk_bool(
            "group_scrolled_begin",
            "Start a new group with manual scrollbar handling.",

            ctx,
            nk_scroll.p("scroll", ""),
            charUTF8.const.p("title", ""),
            nk_flags("flags", "")
        )
        void("group_scrolled_end", "Ends a group with manual scrollbar handling. Should only be called if #group_scrolled_begin() returned non-zero.", ctx)
        void(
            "group_get_scroll",
            "Gets the scroll offset for the given group.",

            ctx,
            charUTF8.const.p("id", "the id of the group to get the scroll position of"),
            nullable..Check(1)..nk_uint.p("x_offset", "a pointer to the x offset output (or #NULL to ignore)"),
            nullable..Check(1)..nk_uint.p("y_offset", "a pointer to the y offset output (or #NULL to ignore)")
        )
        void(
            "group_set_scroll",
            "Sets the scroll offset for the given group.",

            ctx,
            charUTF8.const.p("id", "the id of the group to scroll"),
            nk_uint("x_offset", "the x offset to scroll to"),
            nk_uint("y_offset", "the y offset to scroll to")
        )

        nk_bool(
            "list_view_begin",
            "",

            ctx,
            nk_list_view.p("view", ""),
            charUTF8.const.p("title", ""),
            nk_flags("flags", ""),
            int("row_height", ""),
            int("row_count", "")
        )
        void(
            "list_view_end",
            "",

            nk_list_view.p("view", "")
        )

        val tree_push_hashed = nk_bool(
            "tree_push_hashed",
            "Start a collapsible UI section with internal state management with full control over internal unique ID used to store state.",

            ctx,
            nk_tree_type(
                "type",
                "value from the {@code nk_tree_type} section to visually mark a tree node header as either a collapseable UI section or tree node",
                TreeTypes
            ),
            charUTF8.const.p("title", "label printed in the tree header"),
            nk_collapse_states("initial_state", "initial tree state value out of {@code nk_collapse_states}", CollapseStates),
            char.const.p("hash", "memory block or string to generate the ID from"),
            AutoSize("hash")..nk_int("len", "size of passed memory block or string in {@code hash}"),
            nk_int("seed", "seeding value if this function is called in a loop or default to 0")
        )
        nk_bool(
            "tree_image_push_hashed",
            "Start a collapsible UI section with internal state management with full control over internal unique ID used to store state.",

            ctx,
            tree_push_hashed["type"],
            nk_image("img", "image to display inside the header on the left of the label"),
            tree_push_hashed["title"],
            tree_push_hashed["initial_state"],
            tree_push_hashed["hash"],
            tree_push_hashed["len"],
            tree_push_hashed["seed"]
        )
        void("tree_pop", "Ends a collapsible UI section", ctx)

        nk_bool(
            "tree_state_push",
            "Start a collapsible UI section with external state management.",

            ctx,
            tree_push_hashed["type"],
            tree_push_hashed["title"],
            Check(1)..nk_collapse_states.p("state", "persistent state to update")
        )
        nk_bool(
            "tree_state_image_push",
            "Start a collapsible UI section with image and label header and external state management.",

            ctx,
            tree_push_hashed["type"],
            nk_image("image", "image to display inside the header on the left of the label"),
            tree_push_hashed["title"],
            Check(1)..nk_collapse_states.p("state", "")
        )
        void("tree_state_pop", "Ends a collapsible UI section.", ctx)

        nk_bool(
            "tree_element_push_hashed",
            "",

            ctx,
            tree_push_hashed["type"],
            tree_push_hashed["title"],
            nk_collapse_states("initial_state", ""),
            Check(1)..nk_bool.p("selected", ""),
            char.const.p("hash", ""),
            AutoSize("hash")..int("len", ""),
            int("seed", "")
        )
        nk_bool(
            "tree_element_image_push_hashed",
            "",

            ctx,
            tree_push_hashed["type"],
            nk_image("img", ""),
            tree_push_hashed["title"],
            nk_collapse_states("initial_state", ""),
            Check(1)..nk_bool.p("selected", ""),
            char.const.p("hash", ""),
            AutoSize("hash")..int("len", ""),
            int("seed", "")
        )
        void("tree_element_pop", "", ctx)

        void(
            "text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..nk_int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        void(
            "text_colored",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..nk_int("len", ""),
            nk_flags("alignment", "", TextAlignments),
            nk_color("color", "")
        )

        void(
            "text_wrap",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..nk_int("len", "")
        )

        void(
            "text_wrap_colored",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..nk_int("len", ""),
            nk_color("color", "")
        )

        void(
            "label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments)
        )

        void(
            "label_colored",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            nk_color("color", "")
        )

        void(
            "label_wrap",
            "",

            ctx,
            charUTF8.const.p("str", "")
        )

        void(
            "label_colored_wrap",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_color("color", "")
        )

        void(
            "image",
            "",

            ctx,
            nk_image("img", "")
        )

        void(
            "image_color",
            "",

            ctx,
            nk_image("img", ""),
            nk_color("color", "")
        )

        void(
            "button_set_behavior",
            "",

            ctx,
            nk_button_behavior("behavior", "", ButtonBehaviors)
        )

        nk_bool(
            "button_push_behavior",
            "",

            ctx,
            nk_button_behavior("behavior", "", ButtonBehaviors)
        )

        nk_bool(
            "button_pop_behavior",
            "",

            ctx
        )

        nk_bool(
            "button_text",
            "",

            ctx,
            charUTF8.const.p("title", ""),
            AutoSize("title")..nk_int("len", "")
        )

        nk_bool(
            "button_label",
            "",

            ctx,
            charUTF8.const.p("title", "")
        )

        nk_bool(
            "button_color",
            "",

            ctx,
            nk_color("color", "")
        )

        nk_bool(
            "button_symbol",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes)
        )

        nk_bool(
            "button_image",
            "",

            ctx,
            nk_image("img", "")
        )

        nk_bool(
            "button_symbol_label",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            nk_flags("text_alignment", "", TextAlignments)
        )

        nk_bool(
            "button_symbol_text",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            AutoSize("text")..nk_int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "button_image_label",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            nk_flags("text_alignment", "", TextAlignments)
        )

        nk_bool(
            "button_image_text",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            AutoSize("text")..nk_int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "button_text_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            charUTF8.const.p("title", ""),
            int("len", "")
        )

        nk_bool(
            "button_label_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            charUTF8.const.p("title", "")
        )

        nk_bool(
            "button_symbol_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            nk_symbol_type("symbol", "")
        )

        nk_bool(
            "button_image_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            nk_image("img", "")
        )

        nk_bool(
            "button_symbol_text_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            nk_symbol_type("symbol", ""),
            charUTF8.const.p("title", ""),
            int("len", ""),
            nk_flags("alignment", "")
        )

        nk_bool(
            "button_symbol_label_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            nk_symbol_type("symbol", ""),
            charUTF8.const.p("title", ""),
            nk_flags("text_alignment", "")
        )

        nk_bool(
            "button_image_label_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            nk_image("img", ""),
            charUTF8.const.p("title", ""),
            nk_flags("text_alignment", "")
        )

        nk_bool(
            "button_image_text_styled",
            "",

            ctx,
            nk_style_button.const.p("style", ""),
            nk_image("img", ""),
            charUTF8.const.p("title", ""),
            int("len", ""),
            nk_flags("alignment", "")
        )

        nk_bool(
            "check_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_bool("active", "")
        )

        nk_bool(
            "check_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_bool("active", "")
        )

        unsigned_int(
            "check_flags_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            unsigned_int("flags", ""),
            unsigned_int("value", "")
        )

        unsigned_int(
            "check_flags_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            unsigned_int("flags", ""),
            unsigned_int("value", "")
        )

        nk_bool(
            "checkbox_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            Check(1)..nk_bool.p("active", "")
        )

        nk_bool(
            "checkbox_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            Check(1)..nk_bool.p("active", "")
        )

        nk_bool(
            "checkbox_flags_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            Check(1)..unsigned_int.p("flags", ""),
            unsigned_int("value", "")
        )

        nk_bool(
            "checkbox_flags_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            Check(1)..unsigned_int.p("flags", ""),
            unsigned_int("value", "")
        )

        nk_bool(
            "radio_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            Check(1)..nk_bool.p("active", "")
        )

        nk_bool(
            "radio_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            Check(1)..nk_bool.p("active", "")
        )

        nk_bool(
            "option_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_bool("active", "")
        )

        nk_bool(
            "option_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_bool("active", "")
        )

        nk_bool(
            "selectable_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            Check(1)..nk_bool.p("value", "")
        )

        nk_bool(
            "selectable_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            Check(1)..nk_bool.p("value", "")
        )

        nk_bool(
            "selectable_image_label",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            Check(1)..nk_bool.p("value", "")
        )

        nk_bool(
            "selectable_image_text",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            Check(1)..nk_bool.p("value", "")
        )

        nk_bool(
            "selectable_symbol_label",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            Check(1)..nk_bool.p("value", "")
        )

        nk_bool(
            "selectable_symbol_text",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            Check(1)..nk_bool.p("value", "")
        )

        nk_bool(
            "select_label",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            nk_bool("value", "")
        )

        nk_bool(
            "select_text",
            "",

            ctx,
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            nk_bool("value", "")
        )

        nk_bool(
            "select_image_label",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            nk_bool("value", "")
        )

        nk_bool(
            "select_image_text",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            nk_bool("value", "")
        )

        nk_bool(
            "select_symbol_label",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("str", ""),
            nk_flags("align", "", TextAlignments),
            nk_bool("value", "")
        )

        nk_bool(
            "select_symbol_text",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("str", ""),
            AutoSize("str")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            nk_bool("value", "")
        )

        float(
            "slide_float",
            "",

            ctx,
            float("min", ""),
            float("val", ""),
            float("max", ""),
            float("step", "")
        )

        int(
            "slide_int",
            "",

            ctx,
            int("min", ""),
            int("val", ""),
            int("max", ""),
            int("step", "")
        )

        nk_bool(
            "slider_float",
            "",

            ctx,
            float("min", ""),
            Check(1)..float.p("val", ""),
            float("max", ""),
            float("step", "")
        )

        nk_bool(
            "slider_int",
            "",

            ctx,
            int("min", ""),
            Check(1)..int.p("val", ""),
            int("max", ""),
            int("step", "")
        )

        nk_bool(
            "progress",
            "",

            ctx,
            Check(1)..nk_size.p("cur", ""),
            nk_size("max", ""),
            nk_bool("modifyable", "")
        )

        nk_size(
            "prog",
            "",

            ctx,
            nk_size("cur", ""),
            nk_size("max", ""),
            nk_bool("modifyable", "")
        )

        nk_colorf(
            "color_picker",
            "",

            ctx,
            ReturnParam..nk_colorf("color", ""),
            nk_color_format("fmt", "", ColorFormats)
        )

        nk_bool(
            "color_pick",
            "",

            ctx,
            nk_colorf.p("color", ""),
            nk_color_format("fmt", "", ColorFormats)
        )

        void(
            "property_int",
            "Integer property directly modifying a passed in value.",

            ctx,
            charUTF8.const.p("name", ""),
            int("min", ""),
            Check(1)..int.p("val", ""),
            int("max", ""),
            int("step", ""),
            float("inc_per_pixel", "")
        )

        void(
            "property_float",
            "Float property directly modifying a passed in value.",

            ctx,
            charUTF8.const.p("name", ""),
            float("min", ""),
            Check(1)..float.p("val", ""),
            float("max", ""),
            float("step", ""),
            float("inc_per_pixel", "")
        )

        void(
            "property_double",
            "Double property directly modifying a passed in value.",

            ctx,
            charUTF8.const.p("name", ""),
            double("min", ""),
            Check(1)..double.p("val", ""),
            double("max", ""),
            double("step", ""),
            float("inc_per_pixel", "")
        )

        int(
            "propertyi",
            "Integer property returning the modified int value.",

            ctx,
            charUTF8.const.p("name", ""),
            int("min", ""),
            int("val", ""),
            int("max", ""),
            int("step", ""),
            float("inc_per_pixel", "")
        )

        float(
            "propertyf",
            "Float property returning the modified float value.",

            ctx,
            charUTF8.const.p("name", ""),
            float("min", ""),
            float("val", ""),
            float("max", ""),
            float("step", ""),
            float("inc_per_pixel", "")
        )

        double(
            "propertyd",
            "Double property returning the modified double value.",

            ctx,
            charUTF8.const.p("name", ""),
            double("min", ""),
            double("val", ""),
            double("max", ""),
            double("step", ""),
            float("inc_per_pixel", "")
        )

        void(
            "edit_focus",
            "",

            ctx,
            nk_flags("flags", "", EditFlags)
        )

        void(
            "edit_unfocus",
            "",

            ctx
        )

        nk_flags(
            "edit_string",
            "",

            ctx,
            nk_flags("flags", "", EditFlags),
            Input..charUTF8.p("memory", ""),
            Check(1)..int.p("len", ""),
            int("max", ""),
            nullable..nk_plugin_filter("filter", "")
        )

        nk_flags(
            "edit_buffer",
            "",

            ctx,
            nk_flags("flags", "", EditFlags),
            nk_text_edit.p("edit", ""),
            nullable..nk_plugin_filter("filter", "")
        )

        nk_flags(
            "edit_string_zero_terminated",
            "",

            ctx,
            nk_flags("flags", "", EditFlags),
            Input..charUTF8.p("buffer", ""),
            int("max", ""),
            nullable..nk_plugin_filter("filter", "")
        )
    }();

    {
        nk_bool(
            "chart_begin",
            "",

            ctx,
            nk_chart_type("type", "", ChartTypes),
            int("num", ""),
            float("min", ""),
            float("max", "")
        )

        nk_bool(
            "chart_begin_colored",
            "",

            ctx,
            nk_chart_type("type", "", ChartTypes),
            nk_color("color", ""),
            nk_color("active", ""),
            int("num", ""),
            float("min", ""),
            float("max", "")
        )

        void(
            "chart_add_slot",
            "",

            ctx,
            nk_chart_type("type", "", ChartTypes),
            int("count", ""),
            float("min_value", ""),
            float("max_value", "")
        )

        void(
            "chart_add_slot_colored",
            "",

            ctx,
            nk_chart_type("type", "", ChartTypes),
            nk_color("color", ""),
            nk_color("active", ""),
            int("count", ""),
            float("min_value", ""),
            float("max_value", "")
        )

        nk_flags(
            "chart_push",
            "",

            ctx,
            float("value", "")
        )

        nk_flags(
            "chart_push_slot",
            "",

            ctx,
            float("value", ""),
            int("slot", "")
        )

        void("chart_end", "", ctx)

        void(
            "plot",
            "",

            ctx,
            nk_chart_type("type", "", ChartTypes),
            Check("offset + count")..float.const.p("values", ""),
            int("count", ""),
            int("offset", "")
        )

        void(
            "plot_function",
            "",

            ctx,
            nk_chart_type("type", "", ChartTypes),
            opaque_p("userdata", ""),
            nk_value_getter("value_getter", ""),
            int("count", ""),
            int("offset", "")
        )

        nk_bool(
            "popup_begin",
            "",

            ctx,
            nk_popup_type("type", "", PopupTypes),
            charUTF8.const.p("title", ""),
            nk_flags("flags", "", PanelFlags),
            nk_rect("rect", "")
        )
        void("popup_close", "", ctx)
        void("popup_end", "", ctx)
        void(
            "popup_get_scroll",
            "",

            ctx,
            nullable..Check(1)..nk_uint.p("offset_x", ""),
            nullable..Check(1)..nk_uint.p("offset_y", "")
        )
        void(
            "popup_set_scroll",
            "",

            ctx,
            nk_uint("offset_x", ""),
            nk_uint("offset_y", "")
        )

        int(
            "combo",
            "",

            ctx,
            charUTF8.const.p.p("items", ""),
            AutoSize("items")..int("count", ""),
            int("selected", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        int(
            "combo_separator",
            "",

            ctx,
            charUTF8.const.p("items_separated_by_separator", ""),
            int("separator", ""),
            int("selected", ""),
            int("count", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        int(
            "combo_string",
            "",

            ctx,
            charUTF8.const.p("items_separated_by_zeros", ""),
            int("selected", ""),
            int("count", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        int(
            "combo_callback",
            "",

            ctx,
            nk_item_getter("item_getter", ""),
            opaque_p("userdata", ""),
            int("selected", ""),
            int("count", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        void(
            "combobox",
            "",

            ctx,
            charUTF8.const.p.p("items", ""),
            AutoSize("items")..int("count", ""),
            Check(1)..int.p("selected", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        void(
            "combobox_string",
            "",

            ctx,
            charUTF8.const.p("items_separated_by_zeros", ""),
            Check(1)..int.p("selected", ""),
            int("count", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        void(
            "combobox_separator",
            "",

            ctx,
            charUTF8.const.p("items_separated_by_separator", ""),
            int("separator", ""),
            Check(1)..int.p("selected", ""),
            int("count", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        void(
            "combobox_callback",
            "",

            ctx,
            nk_item_getter("item_getter", ""),
            opaque_p("userdata", ""),
            Check(1)..int.p("selected", ""),
            int("count", ""),
            int("item_height", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_text",
            "",

            ctx,
            charUTF8.const.p("selected", ""),
            AutoSize("selected")..int("len", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_label",
            "",

            ctx,
            charUTF8.const.p("selected", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_color",
            "",

            ctx,
            nk_color("color", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_symbol",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_symbol_label",
            "",

            ctx,
            charUTF8.const.p("selected", ""),
            nk_symbol_type("symbol", "", SymbolTypes),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_symbol_text",
            "",

            ctx,
            charUTF8.const.p("selected", ""),
            AutoSize("selected")..int("len", ""),
            nk_symbol_type("symbol", "", SymbolTypes),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_image",
            "",

            ctx,
            nk_image("img", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_image_label",
            "",

            ctx,
            charUTF8.const.p("selected", ""),
            nk_image("img", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_begin_image_text",
            "",

            ctx,
            charUTF8.const.p("selected", ""),
            AutoSize("selected")..int("len", ""),
            nk_image("img", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "combo_item_label",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "combo_item_text",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "combo_item_image_label",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "combo_item_image_text",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "combo_item_symbol_label",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "combo_item_symbol_text",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        void("combo_close", "", ctx)
        void("combo_end", "", ctx)

        nk_bool(
            "contextual_begin",
            "",

            ctx,
            nk_flags("flags", "", WindowFlags),
            nk_vec2("size", ""),
            nk_rect("trigger_bounds", "")
        )

        nk_bool(
            "contextual_item_text",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("align", "", TextAlignments)
        )

        nk_bool(
            "contextual_item_label",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_flags("align", "", TextAlignments)
        )

        nk_bool(
            "contextual_item_image_label",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "contextual_item_image_text",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "contextual_item_symbol_label",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "contextual_item_symbol_text",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        void("contextual_close", "", ctx)
        void("contextual_end", "", ctx)

        void(
            "tooltip",
            "",

            ctx,
            charUTF8.const.p("text", "")
        )

        nk_bool(
            "tooltip_begin",
            "",

            ctx,
            float("width", "")
        )

        void("tooltip_end", "", ctx)

        void("menubar_begin", "", ctx)
        void("menubar_end", "", ctx)

        nk_bool(
            "menu_begin_text",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_label",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_flags("align", "", TextAlignments),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_image",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_image("img", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_image_text",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            nk_image("img", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_image_label",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_flags("align", "", TextAlignments),
            nk_image("img", ""),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_symbol",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_symbol_type("symbol", "", SymbolTypes),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_symbol_text",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("align", "", TextAlignments),
            nk_symbol_type("symbol", "", SymbolTypes),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_begin_symbol_label",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_flags("align", "", TextAlignments),
            nk_symbol_type("symbol", "", SymbolTypes),
            nk_vec2("size", "")
        )

        nk_bool(
            "menu_item_text",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("align", "", TextAlignments)
        )

        nk_bool(
            "menu_item_label",
            "",

            ctx,
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "menu_item_image_label",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "menu_item_image_text",
            "",

            ctx,
            nk_image("img", ""),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "menu_item_symbol_text",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        nk_bool(
            "menu_item_symbol_label",
            "",

            ctx,
            nk_symbol_type("symbol", "", SymbolTypes),
            charUTF8.const.p("text", ""),
            nk_flags("alignment", "", TextAlignments)
        )

        void("menu_close", "", ctx)
        void("menu_end", "", ctx)
    }();

    {
        nk_flags(
            "convert",
            "Converts from the abstract draw commands list into a hardware accessable vertex format.",

            ctx,
            nk_buffer_p("cmds", ""),
            nk_buffer_p("vertices", ""),
            nk_buffer_p("elements", ""),
            nk_convert_config.const.p("config", "")
        )

        void(
            "input_begin",
            "Begins the input mirroring process by resetting text, scroll, mouse, previous mouse position and movement as well as key state transitions.",

            ctx
        )

        void(
            "input_motion",
            "Mirrors current mouse position to nuklear.",

            ctx,
            int("x", ""),
            int("y", "")
        )

        void(
            "input_key",
            "Mirrors the state of a specific key to nuklear.",

            ctx,
            nk_keys("key", "", Keys),
            nk_bool("down", "")
        )

        void(
            "input_button",
            "Mirrors the state of a specific mouse button to nuklear.",

            ctx,
            nk_buttons("id", "", Buttons),
            int("x", ""),
            int("y", ""),
            nk_bool("down", "")
        )

        void(
            "input_scroll",
            """
            Copies the last mouse scroll value to nuklear. Is generally a  scroll value. So does not have to come from mouse and could also originate from
            touch for example.
            """,

            ctx,
            nk_vec2("val", "vector with both X- as well as Y-scroll value")
        )

        void(
            "input_char",
            "Adds a single ASCII text character into an internal text buffer.",

            ctx,
            char("c", "")
        );

        void(
            "input_glyph",
            "Adds a single multi-byte UTF-8 character into an internal text buffer.",

            ctx,
            Check(NK_UTF_SIZE)..nk_glyph("glyph", "")
        )

        void(
            "input_unicode",
            "Adds a single unicode rune into an internal text buffer.",

            ctx,
            nk_rune("unicode", "")
        )

        void(
            "input_end",
            "Ends the input mirroring process by calculating state changes. Don't call any {@code nk_input_xxx} function referenced above after this call.",

            ctx
        )

        void("style_default", "", ctx)

        void(
            "style_from_table",
            "",

            ctx,
            Check("NK_COLOR_COUNT")..nk_color.const.p("table", "")
        )

        void(
            "style_load_cursor",
            "",

            ctx,
            nk_style_cursor("style", "", StyleCursor),
            nk_cursor.p("cursor", "")
        )

        void(
            "style_load_all_cursors",
            "",

            ctx,
            Check("NK_CURSOR_COUNT")..nk_cursor.p("cursors", "")
        )

        charUTF8.const.p(
            "style_get_color_by_name",
            "",

            nk_style_colors("c", "", StyleColors)
        )

        void(
            "style_set_font",
            "",

            ctx,
            nk_user_font.const.p("font", "")
        )

        nk_bool(
            "style_set_cursor",
            "",

            ctx,
            nk_style_cursor("style", "", StyleCursor)
        )

        void("style_show_cursor", "", ctx)
        void("style_hide_cursor", "", ctx)

        nk_bool(
            "style_push_font",
            "",

            ctx,
            nk_user_font.const.p("font", "")
        )

        nk_bool(
            "style_push_float",
            "",

            ctx,
            Check(1)..float.p("address", ""),
            float("value", "")
        )

        nk_bool(
            "style_push_vec2",
            "",

            ctx,
            nk_vec2.p("address", ""),
            nk_vec2("value", "")
        )

        nk_bool(
            "style_push_style_item",
            "",

            ctx,
            nk_style_item.p("address", ""),
            nk_style_item("value", "")
        )

        nk_bool(
            "style_push_flags",
            "",

            ctx,
            Check(1)..nk_flags.p("address", ""),
            nk_flags("value", "")
        )

        nk_bool(
            "style_push_color",
            "",

            ctx,
            nk_color.p("address", ""),
            nk_color("value", "")
        )

        nk_bool("style_pop_font", "", ctx)
        nk_bool("style_pop_float", "", ctx)
        nk_bool("style_pop_vec2", "", ctx)
        nk_bool("style_pop_style_item", "", ctx)
        nk_bool("style_pop_flags", "", ctx)
        nk_bool("style_pop_color", "", ctx)

        nk_rect("widget_bounds", "", ctx)

        nk_vec2("widget_position", "", ctx)

        nk_vec2("widget_size", "", ctx)

        float("widget_width", "", ctx)
        float("widget_height", "", ctx)

        nk_bool("widget_is_hovered", "", ctx)

        nk_bool(
            "widget_is_mouse_clicked",
            "",

            ctx,
            nk_buttons("btn", "")
        )

        nk_bool(
            "widget_has_mouse_click_down",
            "",

            ctx,
            nk_buttons("btn", "", Buttons),
            nk_bool("down", "")
        )

        void(
            "spacing",
            "",

            ctx,
            int("cols", "")
        )

        nk_widget_layout_states(
            "widget",
            "",

            nk_rect.p("bounds", ""),
            cctx
        )

        nk_widget_layout_states(
            "widget_fitting",
            "",

            nk_rect.p("bounds", ""),
            ctx,
            nk_vec2("item_padding", "")
        )

        nk_color(
            "rgb",
            "",

            int("r", ""),
            int("g", ""),
            int("b", "")
        )

        nk_color(
            "rgb_iv",
            "",

            Check(3)..int.const.p("rgb", "")
        )

        nk_color(
            "rgb_bv",
            "",

            Check(3)..nk_byte.const.p("rgb", "")
        )

        nk_color(
            "rgb_f",
            "",

            float("r", ""),
            float("g", ""),
            float("b", "")
        )

        nk_color(
            "rgb_fv",
            "",

            Check(3)..float.const.p("rgb", "")
        )

        nk_color(
            "rgb_cf",
            "",

            nk_colorf("c", "")
        )

        nk_color(
            "rgb_hex",
            "",

            Check(6)..charASCII.const.p("rgb", "")
        )

        nk_color(
            "rgba",
            "",

            int("r", ""),
            int("g", ""),
            int("b", ""),
            int("a", "")
        )

        nk_color(
            "rgba_u32",
            "",

            nk_uint("in", "")
        )

        nk_color(
            "rgba_iv",
            "",

            Check(4)..int.const.p("rgba", "")
        )

        nk_color(
            "rgba_bv",
            "",

            Check(4)..nk_byte.const.p("rgba", "")
        )

        nk_color(
            "rgba_f",
            "",

            float("r", ""),
            float("g", ""),
            float("b", ""),
            float("a", "")
        )

        nk_color(
            "rgba_fv",
            "",

            Check(4)..float.const.p("rgba", "")
        )

        nk_color(
            "rgba_cf",
            "",

            nk_colorf("c", "")
        )

        nk_color(
            "rgba_hex",
            "",

            Check(8)..charASCII.const.p("rgba", "")
        )

        nk_colorf(
            "hsva_colorf",
            "",

            float("h", ""),
            float("s", ""),
            float("v", ""),
            float("a", "")
        )

        nk_colorf(
            "hsva_colorfv",
            "",

            Check(4)..float.p("c", "")
        )

        void(
            "colorf_hsva_f",
            "",

            Check(1)..float.p("out_h", ""),
            Check(1)..float.p("out_s", ""),
            Check(1)..float.p("out_v", ""),
            Check(1)..float.p("out_a", ""),
            nk_colorf("in", "")
        )

        void(
            "colorf_hsva_fv",
            "",

            Check(4)..float.p("hsva", ""),
            nk_colorf("in", "")
        )

        nk_color(
            "hsv",
            "",

            int("h", ""),
            int("s", ""),
            int("v", "")
        )

        nk_color(
            "hsv_iv",
            "",

            Check(3)..int.const.p("hsv", "")
        )

        nk_color(
            "hsv_bv",
            "",

            Check(3)..nk_byte.const.p("hsv", "")
        )

        nk_color(
            "hsv_f",
            "",

            float("h", ""),
            float("s", ""),
            float("v", "")
        )

        nk_color(
            "hsv_fv",
            "",

            Check(3)..float.const.p("hsv", "")
        )

        nk_color(
            "hsva",
            "",

            int("h", ""),
            int("s", ""),
            int("v", ""),
            int("a", "")
        )

        nk_color(
            "hsva_iv",
            "",

            Check(4)..int.const.p("hsva", "")
        )

        nk_color(
            "hsva_bv",
            "",

            Check(4)..nk_byte.const.p("hsva", "")
        )

        nk_color(
            "hsva_f",
            "",

            float("h", ""),
            float("s", ""),
            float("v", ""),
            float("a", "")
        )

        nk_color(
            "hsva_fv",
            "",

            Check(4)..float.const.p("hsva", "")
        )

        void(
            "color_f",
            "",

            Check(1)..float.p("r", ""),
            Check(1)..float.p("g", ""),
            Check(1)..float.p("b", ""),
            Check(1)..float.p("a", ""),
            nk_color("color", "")
        )

        void(
            "color_fv",
            "",

            Check(4)..float.p("rgba_out", ""),
            nk_color("color", "")
        )

        nk_colorf(
            "color_cf",
            "",

            nk_color("color", "")
        )

        void(
            "color_d",
            "",

            Check(1)..double.p("r", ""),
            Check(1)..double.p("g", ""),
            Check(1)..double.p("b", ""),
            Check(1)..double.p("a", ""),
            nk_color("color", "")
        )

        void(
            "color_dv",
            "",

            Check(4)..double.p("rgba_out", ""),
            nk_color("color", "")
        )

        nk_uint(
            "color_u32",
            "",

            nk_color("color", "")
        )

        void(
            "color_hex_rgba",
            "",

            Check(8)..char.p("output", ""),
            nk_color("color", "")
        )

        void(
            "color_hex_rgb",
            "",

            Check(6)..char.p("output", ""),
            nk_color("color", "")
        )

        void(
            "color_hsv_i",
            "",

            Check(1)..int.p("out_h", ""),
            Check(1)..int.p("out_s", ""),
            Check(1)..int.p("out_v", ""),
            nk_color("color", "")
        )

        void(
            "color_hsv_b",
            "",

            Check(1)..nk_byte.p("out_h", ""),
            Check(1)..nk_byte.p("out_s", ""),
            Check(1)..nk_byte.p("out_v", ""),
            nk_color("color", "")
        )

        void(
            "color_hsv_iv",
            "",

            Check(3)..int.p("hsv_out", ""),
            nk_color("color", "")
        )

        void(
            "color_hsv_bv",
            "",

            Check(3)..nk_byte.p("hsv_out", ""),
            nk_color("color", "")
        )

        void(
            "color_hsv_f",
            "",

            Check(1)..float.p("out_h", ""),
            Check(1)..float.p("out_s", ""),
            Check(1)..float.p("out_v", ""),
            nk_color("color", "")
        )

        void(
            "color_hsv_fv",
            "",

            Check(3)..float.p("hsv_out", ""),
            nk_color("color", "")
        )

        void(
            "color_hsva_i",
            "",

            Check(1)..int.p("h", ""),
            Check(1)..int.p("s", ""),
            Check(1)..int.p("v", ""),
            Check(1)..int.p("a", ""),
            nk_color("color", "")
        )

        void(
            "color_hsva_b",
            "",

            Check(1)..nk_byte.p("h", ""),
            Check(1)..nk_byte.p("s", ""),
            Check(1)..nk_byte.p("v", ""),
            Check(1)..nk_byte.p("a", ""),
            nk_color("color", "")
        )

        void(
            "color_hsva_iv",
            "",

            Check(4)..int.p("hsva_out", ""),
            nk_color("color", "")
        )

        void(
            "color_hsva_bv",
            "",

            Check(4)..nk_byte.p("hsva_out", ""),
            nk_color("color", "")
        )

        void(
            "color_hsva_f",
            "",

            Check(1)..float.p("out_h", ""),
            Check(1)..float.p("out_s", ""),
            Check(1)..float.p("out_v", ""),
            Check(1)..float.p("out_a", ""),
            nk_color("color", "")
        )

        void(
            "color_hsva_fv",
            "",

            Check(4)..float.p("hsva_out", ""),
            nk_color("color", "")
        )

        nk_handle(
            "handle_ptr",
            "",

            opaque_p("ptr", "")
        )

        nk_handle(
            "handle_id",
            "",

            int("id", "")
        )

        nk_image(
            "image_handle",
            "",

            nk_handle("handle", "")
        )

        nk_image(
            "image_ptr",
            "",

            opaque_p("ptr", "")
        )

        nk_image(
            "image_id",
            "",

            int("id", "")
        )

        nk_bool(
            "image_is_subimage",
            "",

            nk_image.const.p("img", "")
        )

        nk_image(
            "subimage_ptr",
            "",

            opaque_p("ptr", ""),
            nk_ushort("w", ""),
            nk_ushort("h", ""),
            nk_rect("sub_region", "")
        )

        nk_image(
            "subimage_id",
            "",

            int("id", ""),
            nk_ushort("w", ""),
            nk_ushort("h", ""),
            nk_rect("sub_region", "")
        )

        nk_image(
            "subimage_handle",
            "",

            nk_handle("handle", ""),
            nk_ushort("w", ""),
            nk_ushort("h", ""),
            nk_rect("sub_region", "")
        )

        nk_nine_slice(
            "nine_slice_handle",
            "",

            nk_handle("handle", ""),
            nk_ushort("l", ""),
            nk_ushort("t", ""),
            nk_ushort("r", ""),
            nk_ushort("b", "")
        )
        nk_nine_slice(
            "nine_slice_ptr",
            "",

            opaque_p("ptr", ""),
            nk_ushort("l", ""),
            nk_ushort("t", ""),
            nk_ushort("r", ""),
            nk_ushort("b", "")
        )
        nk_nine_slice(
            "nine_slice_id",
            "",

            int("id", ""),
            nk_ushort("l", ""),
            nk_ushort("t", ""),
            nk_ushort("r", ""),
            nk_ushort("b", "")
        )
        intb(
            "nine_slice_is_sub9slice",
            "",

            nk_nine_slice.const.p("img", "")
        )
        nk_nine_slice(
            "sub9slice_ptr",
            "",

            opaque_p("ptr", ""),
            nk_ushort("w", ""),
            nk_ushort("h", ""),
            nk_rect("sub_region", ""),
            nk_ushort("l", ""),
            nk_ushort("t", ""),
            nk_ushort("r", ""),
            nk_ushort("b", "")
        )
        nk_nine_slice(
            "sub9slice_id",
            "",

            int("id", ""),
            nk_ushort("w", ""),
            nk_ushort("h", ""),
            nk_rect("sub_region", ""),
            nk_ushort("l", ""),
            nk_ushort("t", ""),
            nk_ushort("r", ""),
            nk_ushort("b", "")
        )
        nk_nine_slice(
            "sub9slice_handle",
            "",

            nk_handle("handle", ""),
            nk_ushort("w", ""),
            nk_ushort("h", ""),
            nk_rect("sub_region", ""),
            nk_ushort("l", ""),
            nk_ushort("t", ""),
            nk_ushort("r", ""),
            nk_ushort("b", "")
        )

        nk_hash(
            "murmur_hash",
            "",

            void.const.p("key", ""),
            AutoSize("key")..int("len", ""),
            nk_hash("seed", "")
        )

        void(
            "triangle_from_direction",
            "",

            nk_vec2.p("result", ""),
            nk_rect("r", ""),
            float("pad_x", ""),
            float("pad_y", ""),
            nk_heading("direction", "", Headings)
        )

        nk_vec2(
            "vec2",
            "",

            float("x", ""),
            float("y", "")
        )

        nk_vec2(
            "vec2i",
            "",

            int("x", ""),
            int("y", "")
        )

        nk_vec2(
            "vec2v",
            "",

            Check(2)..float.const.p("xy", "")
        )

        nk_vec2(
            "vec2iv",
            "",

            Check(2)..int.const.p("xy", "")
        )

        nk_rect("get_null_rect", "", void())

        nk_rect(
            "rect",
            "",

            float("x", ""),
            float("y", ""),
            float("w", ""),
            float("h", "")
        )

        nk_rect(
            "recti",
            "",

            int("x", ""),
            int("y", ""),
            int("w", ""),
            int("h", "")
        )

        nk_rect(
            "recta",
            "",

            nk_vec2("pos", ""),
            nk_vec2("size", "")
        )

        nk_rect(
            "rectv",
            "",

            Check(4)..float.const.p("xywh", "")
        )

        nk_rect(
            "rectiv",
            "",

            Check(4)..int.const.p("xywh", "")
        )

        nk_vec2(
            "rect_pos",
            "",

            nk_rect("r", "")
        )

        nk_vec2(
            "rect_size",
            "",

            nk_rect("r", "")
        )
    }();

    {
        int(
            "strlen",
            "",

            charUTF8.const.p("str", "")
        )

        int(
            "stricmp",
            "",

            charUTF8.const.p("s1", ""),
            charUTF8.const.p("s2", "")
        )

        int(
            "stricmpn",
            "",

            charUTF8.const.p("s1", ""),
            charUTF8.const.p("s2", ""),
            int("n", "")
        )

        int(
            "strtoi",
            "",

            charUTF8.const.p("str", ""),
            Check(1)..charUTF8.const.p.p("endptr", "")
        )

        float(
            "strtof",
            "",

            charUTF8.const.p("str", ""),
            Check(1)..charUTF8.const.p.p("endptr", "")
        )

        double(
            "strtod",
            "",

            charUTF8.const.p("str", ""),
            Check(1)..charUTF8.const.p.p("endptr", "")
        )

        nk_bool(
            "strfilter",
            """
            ${ul(
                "c - matches any literal character c",
                ". - matches any single character",
                "^ - matches the beginning of the input string",
                "$ - matches the end of the input string",
                "* - matches zero or more occurrences of the previous character"
            )}
            """,

            charUTF8.const.p("str", ""),
            charUTF8.const.p("regexp", "")
        )

        nk_bool(
            "strmatch_fuzzy_string",
            """
            Returns true if each character in {@code pattern} is found sequentially within {@code str} if found then {@code out_score} is also set. Score value
            has no intrinsic meaning. Range varies with {@code pattern}. Can only compare scores with same search pattern.

            """,

            charUTF8.const.p("str", ""),
            charUTF8.const.p("pattern", ""),
            Check(1)..int.p("out_score", "")
        )

        int(
            "strmatch_fuzzy_text",
            "",

            charUTF8.const.p("txt", ""),
            AutoSize("txt")..int("txt_len", ""),
            charUTF8.const.p("pattern", ""),
            Check(1)..int.p("out_score", "")
        )

        int(
            "utf_decode",
            "",

            char.const.p("c", ""),
            Check(1)..nk_rune.p("u", ""),
            AutoSize("c")..int("clen", "")
        )

        int(
            "utf_encode",
            "",

            nk_rune("u", ""),
            char.p("c", ""),
            AutoSize("c")..int("clen", "")
        )

        int(
            "utf_len",
            "",

            char.const.p("str", ""),
            AutoSize("str")..int("byte_len", "")
        )

        char.const.p(
            "utf_at",
            "",

            char.const.p("buffer", ""),
            AutoSize("buffer")..int("length", ""),
            int("index", ""),
            Check(1)..nk_rune.p("unicode", ""),
            AutoSizeResult..int.p("len", "")
        )

        void(
            "buffer_init",
            "",

            nk_buffer_p("buffer", ""),
            nk_allocator.const.p("allocator", ""),
            nk_size("size", "")
        )

        void(
            "buffer_init_fixed",
            "",

            nk_buffer_p("buffer", ""),
            void.p("memory", ""),
            AutoSize("memory")..nk_size("size", "")
        )

        void(
            "buffer_info",
            "",

            nk_memory_status.p("status", ""),
            nk_buffer_p("buffer", "")
        )

        void(
            "buffer_push",
            "",

            nk_buffer_p("buffer", ""),
            nk_buffer_allocation_type("type", "", BufferAllocationTypes),
            void.const.p("memory", ""),
            AutoSize("memory")..nk_size("size", ""),
            nk_size("align", "")
        )

        void(
            "buffer_mark",
            "",

            nk_buffer_p("buffer", ""),
            nk_buffer_allocation_type("type", "", BufferAllocationTypes)
        )

        void(
            "buffer_reset",
            "",

            nk_buffer_p("buffer", ""),
            nk_buffer_allocation_type("type", "", BufferAllocationTypes)
        )

        void(
            "buffer_clear",
            "",

            nk_buffer_p("buffer", "")
        )

        void(
            "buffer_free",
            "",

            nk_buffer_p("buffer", "")
        )

        opaque_p(
            "buffer_memory",
            "",

            nk_buffer_p("buffer", "")
        )

        opaque_const_p(
            "buffer_memory_const",
            "",

            nk_buffer.const.p("buffer", "")
        )

        nk_size(
            "buffer_total",
            "",

            nk_buffer_p("buffer", "")
        )

        void(
            "str_init",
            "",

            nk_str.p("str", ""),
            nk_allocator.const.p("allocator", ""),
            nk_size("size", "")
        )

        void(
            "str_init_fixed",
            "",

            nk_str.p("str", ""),
            void.p("memory", ""),
            AutoSize("memory")..nk_size("size", "")
        )

        void(
            "str_clear",
            "",

            nk_str.p("str", "")
        )

        void(
            "str_free",
            "",

            nk_str.p("str", "")
        )

        int(
            "str_append_text_char",
            "",

            nk_str.p("s", ""),
            char.const.p("str", ""),
            AutoSize("str")..int("len", "")
        )

        int(
            "str_append_str_char",
            "",

            nk_str.p("s", ""),
            NullTerminated..char.const.p("str", "")
        )

        int(
            "str_append_text_utf8",
            "",

            nk_str.p("s", ""),
            char.const.p("str", ""),
            AutoSize("str")..int("len", "")
        )

        int(
            "str_append_str_utf8",
            "",

            nk_str.p("s", ""),
            NullTerminated..char.const.p("str", "")
        )

        int(
            "str_append_text_runes",
            "",

            nk_str.p("s", ""),
            nk_rune.const.p("runes", ""),
            AutoSize("runes")..int("len", "")
        )

        int(
            "str_append_str_runes",
            "",

            nk_str.p("s", ""),
            NullTerminated..nk_rune.const.p("runes", "")
        )

        int(
            "str_insert_at_char",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            char.const.p("str", ""),
            AutoSize("str")..int("len", "")
        )

        int(
            "str_insert_at_rune",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            char.const.p("str", ""),
            AutoSize("str")..int("len", "")
        )

        int(
            "str_insert_text_char",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            char.const.p("str", ""),
            AutoSize("str")..int("len", "")
        )

        int(
            "str_insert_str_char",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            NullTerminated..char.const.p("str", "")
        )

        int(
            "str_insert_text_utf8",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            char.const.p("str", ""),
            AutoSize("str")..int("len", "")
        )

        int(
            "str_insert_str_utf8",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            NullTerminated..char.const.p("str", "")
        )

        int(
            "str_insert_text_runes",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            nk_rune.const.p("runes", ""),
            AutoSize("runes")..int("len", "")
        )

        int(
            "str_insert_str_runes",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            NullTerminated..nk_rune.const.p("runes", "")
        )

        void(
            "str_remove_chars",
            "",

            nk_str.p("s", ""),
            int("len", "")
        )

        void(
            "str_remove_runes",
            "",

            nk_str.p("str", ""),
            int("len", "")
        )

        void(
            "str_delete_chars",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            int("len", "")
        )

        void(
            "str_delete_runes",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            int("len", "")
        )

        charUTF8.p(
            "str_at_char",
            "",

            nk_str.p("s", ""),
            int("pos", "")
        )

        char.p(
            "str_at_rune",
            "",

            nk_str.p("s", ""),
            int("pos", ""),
            Check(1)..nk_rune.p("unicode", ""),
            AutoSizeResult..int.p("len", "")
        )

        nk_rune(
            "str_rune_at",
            "",

            nk_str.const.p("s", ""),
            int("pos", "")
        )

        charUTF8.const.p(
            "str_at_char_const",
            "",

            nk_str.const.p("s", ""),
            int("pos", "")
        )

        char.const.p(
            "str_at_const",
            "",

            nk_str.const.p("s", ""),
            int("pos", ""),
            Check(1)..nk_rune.p("unicode", ""),
            AutoSizeResult..int.p("len", "")
        )

        charUTF8.p(
            "str_get",
            "",

            nk_str.p("s", "")
        )

        charUTF8.const.p(
            "str_get_const",
            "",

            nk_str.const.p("s", "")
        )

        int(
            "str_len",
            "",

            nk_str.p("s", "")
        )

        int(
            "str_len_char",
            "",

            nk_str.p("s", "")
        )

        nk_bool(
            "filter_default",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        nk_bool(
            "filter_ascii",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        nk_bool(
            "filter_float",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        nk_bool(
            "filter_decimal",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        nk_bool(
            "filter_hex",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        nk_bool(
            "filter_oct",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        nk_bool(
            "filter_binary",
            "",

            nk_text_edit.const.p("edit", ""),
            nk_rune("unicode", "")
        )

        void(
            "textedit_init",
            "",

            nk_text_edit.p("box", ""),
            nk_allocator.p("allocator", ""),
            nk_size("size", "")
        )

        void(
            "textedit_init_fixed",
            "",

            nk_text_edit.p("box", ""),
            void.p("memory", ""),
            AutoSize("memory")..nk_size("size", "")
        )

        void(
            "textedit_free",
            "",

            nk_text_edit.p("box", "")
        )

        void(
            "textedit_text",
            "",

            nk_text_edit.p("box", ""),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("total_len", "")
        )

        void(
            "textedit_delete",
            "",

            nk_text_edit.p("box", ""),
            int("where", ""),
            int("len", "")
        )

        void(
            "textedit_delete_selection",
            "",

            nk_text_edit.p("box", "")
        )

        void(
            "textedit_select_all",
            "",

            nk_text_edit.p("box", "")
        )

        nk_bool(
            "textedit_cut",
            "",

            nk_text_edit.p("box", "")
        )

        nk_bool(
            "textedit_paste",
            "",

            nk_text_edit.p("box", ""),
            charUTF8.const.p("ctext", ""),
            AutoSize("ctext")..int("len", "")
        )

        void(
            "textedit_undo",
            "",

            nk_text_edit.p("box", "")
        )

        void(
            "textedit_redo",
            "",

            nk_text_edit.p("box", "")
        )
    }();

    {
        val cmd = Input..nk_command_buffer.p("b", "")
        void(
            "stroke_line",
            "",

            cmd,
            float("x0", ""),
            float("y0", ""),
            float("x1", ""),
            float("y1", ""),
            float("line_thickness", ""),
            nk_color("color", "")
        )

        void(
            "stroke_curve",
            "",

            cmd,
            float("ax", ""),
            float("ay", ""),
            float("ctrl0x", ""),
            float("ctrl0y", ""),
            float("ctrl1x", ""),
            float("ctrl1y", ""),
            float("bx", ""),
            float("by", ""),
            float("line_thickness", ""),
            nk_color("color", "")
        )

        void(
            "stroke_rect",
            "",

            cmd,
            nk_rect("rect", ""),
            float("rounding", ""),
            float("line_thickness", ""),
            nk_color("color", "")
        )

        void(
            "stroke_circle",
            "",

            cmd,
            nk_rect("rect", ""),
            float("line_thickness", ""),
            nk_color("color", "")
        )

        void(
            "stroke_arc",
            "",

            cmd,
            float("cx", ""),
            float("cy", ""),
            float("radius", ""),
            float("a_min", ""),
            float("a_max", ""),
            float("line_thickness", ""),
            nk_color("color", "")
        )

        void(
            "stroke_triangle",
            "",

            cmd,
            float("x0", ""),
            float("y0", ""),
            float("x1", ""),
            float("y1", ""),
            float("x2", ""),
            float("y2", ""),
            float("line_thichness", ""),
            nk_color("color", "")
        )

        void(
            "stroke_polyline",
            "",

            cmd,
            float.p("points", ""),
            AutoSize("points")..int("point_count", ""),
            float("line_thickness", ""),
            nk_color("col", "")
        )

        void(
            "stroke_polygon",
            "",

            cmd,
            float.p("points", ""),
            AutoSize("points")..int("point_count", ""),
            float("line_thickness", ""),
            nk_color("color", "")
        )

        void(
            "fill_rect",
            "",

            cmd,
            nk_rect("rect", ""),
            float("rounding", ""),
            nk_color("color", "")
        )

        void(
            "fill_rect_multi_color",
            "",

            cmd,
            nk_rect("rect", ""),
            nk_color("left", ""),
            nk_color("top", ""),
            nk_color("right", ""),
            nk_color("bottom", "")
        )

        void(
            "fill_circle",
            "",

            cmd,
            nk_rect("rect", ""),
            nk_color("color", "")
        )

        void(
            "fill_arc",
            "",

            cmd,
            float("cx", ""),
            float("cy", ""),
            float("radius", ""),
            float("a_min", ""),
            float("a_max", ""),
            nk_color("color", "")
        )

        void(
            "fill_triangle",
            "",

            cmd,
            float("x0", ""),
            float("y0", ""),
            float("x1", ""),
            float("y1", ""),
            float("x2", ""),
            float("y2", ""),
            nk_color("color", "")
        )

        void(
            "fill_polygon",
            "",

            cmd,
            float.p("points", ""),
            AutoSize("points")..int("point_count", ""),
            nk_color("color", "")
        )

        void(
            "draw_image",
            "",

            cmd,
            nk_rect("rect", ""),
            nk_image.const.p("img", ""),
            nk_color("color", "")
        )

        void(
            "draw_nine_slice",
            "",

            cmd,
            nk_rect("rect", ""),
            nk_nine_slice.const.p("slc", ""),
            nk_color("color", "")
        )

        void(
            "draw_text",
            "",

            cmd,
            nk_rect("rect", ""),
            charUTF8.const.p("string", ""),
            AutoSize("string")..int("length", ""),
            nk_user_font.const.p("font", ""),
            nk_color("bg", ""),
            nk_color("fg", "")
        )

        void(
            "push_scissor",
            "",

            cmd,
            nk_rect("rect", "")
        )

        void(
            "push_custom",
            "",

            cmd,
            nk_rect("rect", ""),
            nk_command_custom_callback("callback", ""),
            nk_handle("usr", "")
        )

        nk_command.const.p(
            "_next",
            "Increments the draw command iterator to the next command inside the context draw command list.",

            ctx,
            nk_command.const.p("cmd", "")
        )

        nk_command.const.p(
            "_begin",
            "Returns draw command pointer pointing to the next command inside the draw command list.",

            ctx
        )

        nk_bool(
            "input_has_mouse_click",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons)
        )

        nk_bool(
            "input_has_mouse_click_in_rect",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons),
            nk_rect("rect", "")
        )

        nk_bool(
            "input_has_mouse_click_down_in_rect",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons),
            nk_rect("rect", ""),
            nk_bool("down", "")
        )

        nk_bool(
            "input_is_mouse_click_in_rect",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons),
            nk_rect("rect", "")
        )

        nk_bool(
            "input_is_mouse_click_down_in_rect",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons),
            nk_rect("b", ""),
            nk_bool("down", "")
        )

        nk_bool(
            "input_any_mouse_click_in_rect",
            "",

            nk_input.const.p("i", ""),
            nk_rect("rect", "")
        )

        nk_bool(
            "input_is_mouse_prev_hovering_rect",
            "",

            nk_input.const.p("i", ""),
            nk_rect("rect", "")
        )

        nk_bool(
            "input_is_mouse_hovering_rect",
            "",

            nk_input.const.p("i", ""),
            nk_rect("rect", "")
        )

        nk_bool(
            "input_mouse_clicked",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons),
            nk_rect("rect", "")
        )

        nk_bool(
            "input_is_mouse_down",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons)
        )

        nk_bool(
            "input_is_mouse_pressed",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons)
        )

        nk_bool(
            "input_is_mouse_released",
            "",

            nk_input.const.p("i", ""),
            nk_buttons("id", "", Buttons)
        )

        nk_bool(
            "input_is_key_pressed",
            "",

            nk_input.const.p("i", ""),
            nk_keys("key", "", Keys)
        )

        nk_bool(
            "input_is_key_released",
            "",

            nk_input.const.p("i", ""),
            nk_keys("key", "", Keys)
        )

        nk_bool(
            "input_is_key_down",
            "",

            nk_input.const.p("i", ""),
            nk_keys("key", "", Keys)
        )
    }();

    {
        void(
            "draw_list_init",
            "",

            nk_draw_list.p("list", "")
        )

        void(
            "draw_list_setup",
            "",

            nk_draw_list.p("canvas", ""),
            nk_convert_config.const.p("config", ""),
            nk_buffer_p("cmds", ""),
            nk_buffer_p("vertices", ""),
            nk_buffer_p("elements", ""),
            nk_anti_aliasing("line_aa", ""),
            nk_anti_aliasing("shape_aa", "")
        )

        nk_draw_command.const.p(
            "_draw_list_begin",
            "",

            nk_draw_list.const.p("list", ""),
            nk_buffer.const.p("buffer", "")
        )

        nk_draw_command.const.p(
            "_draw_list_next",
            "",

            nk_draw_command.const.p("cmd", ""),
            nk_buffer.const.p("buffer", ""),
            nk_draw_list.const.p("list", "")
        )

        nk_draw_command.const.p(
            "_draw_begin",
            "Returns a draw vertex command buffer iterator to iterate over the vertex draw command buffer.",

            cctx,
            nk_buffer.const.p("buffer", "")
        )

        nk_draw_command.const.p(
            "_draw_end",
            "Returns the end of the vertex draw list.",

            cctx,
            nk_buffer.const.p("buffer", "")
        )

        nk_draw_command.const.p(
            "_draw_next",
            "Increments the vertex command iterator to the next command inside the context vertex command list.",

            nk_draw_command.const.p("cmd", ""),
            nk_buffer.const.p("buffer", ""),
            cctx
        )

        void(
            "draw_list_path_clear",
            "",

            nk_draw_list.p("list", "")
        )

        void(
            "draw_list_path_line_to",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("pos", "")
        )

        void(
            "draw_list_path_arc_to_fast",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("center", ""),
            float("radius", ""),
            int("a_min", ""),
            int("a_max", "")
        )

        void(
            "draw_list_path_arc_to",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("center", ""),
            float("radius", ""),
            float("a_min", ""),
            float("a_max", ""),
            unsigned_int("segments", "")
        )

        void(
            "draw_list_path_rect_to",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("a", ""),
            nk_vec2("b", ""),
            float("rounding", "")
        )

        void(
            "draw_list_path_curve_to",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("p2", ""),
            nk_vec2("p3", ""),
            nk_vec2("p4", ""),
            unsigned_int("num_segments", "")
        )

        void(
            "draw_list_path_fill",
            "",

            nk_draw_list.p("list", ""),
            nk_color("color", "")
        )

        void(
            "draw_list_path_stroke",
            "",

            nk_draw_list.p("list", ""),
            nk_color("color", ""),
            nk_draw_list_stroke("closed", "", DrawListStrokes),
            float("thickness", "")
        )

        void(
            "draw_list_stroke_line",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("a", ""),
            nk_vec2("b", ""),
            nk_color("color", ""),
            float("thickness", "")
        )

        void(
            "draw_list_stroke_rect",
            "",

            nk_draw_list.p("list", ""),
            nk_rect("rect", ""),
            nk_color("color", ""),
            float("rounding", ""),
            float("thickness", "")
        )

        void(
            "draw_list_stroke_triangle",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("a", ""),
            nk_vec2("b", ""),
            nk_vec2("c", ""),
            nk_color("color", ""),
            float("thickness", "")
        )

        void(
            "draw_list_stroke_circle",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("center", ""),
            float("radius", ""),
            nk_color("color", ""),
            unsigned_int("segs", ""),
            float("thickness", "")
        )

        void(
            "draw_list_stroke_curve",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("p0", ""),
            nk_vec2("cp0", ""),
            nk_vec2("cp1", ""),
            nk_vec2("p1", ""),
            nk_color("color", ""),
            unsigned_int("segments", ""),
            float("thickness", "")
        )

        void(
            "draw_list_stroke_poly_line",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2.const.p("pnts", ""),
            unsigned_int("cnt", ""),
            nk_color("color", ""),
            nk_draw_list_stroke("closed", "", DrawListStrokes),
            float("thickness", ""),
            nk_anti_aliasing("aliasing", "", Antialiasing)
        )

        void(
            "draw_list_fill_rect",
            "",

            nk_draw_list.p("list", ""),
            nk_rect("rect", ""),
            nk_color("color", ""),
            float("rounding", "")
        )

        void(
            "draw_list_fill_rect_multi_color",
            "",

            nk_draw_list.p("list", ""),
            nk_rect("rect", ""),
            nk_color("left", ""),
            nk_color("top", ""),
            nk_color("right", ""),
            nk_color("bottom", "")
        )

        void(
            "draw_list_fill_triangle",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("a", ""),
            nk_vec2("b", ""),
            nk_vec2("c", ""),
            nk_color("color", "")
        )

        void(
            "draw_list_fill_circle",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2("center", ""),
            float("radius", ""),
            nk_color("col", ""),
            unsigned_int("segs", "")
        )

        void(
            "draw_list_fill_poly_convex",
            "",

            nk_draw_list.p("list", ""),
            nk_vec2.const.p("points", ""),
            AutoSize("points")..unsigned_int("count", ""),
            nk_color("color", ""),
            nk_anti_aliasing("aliasing", "", Antialiasing)
        )

        void(
            "draw_list_add_image",
            "",

            nk_draw_list.p("list", ""),
            nk_image("texture", ""),
            nk_rect("rect", ""),
            nk_color("color", "")
        )

        void(
            "draw_list_add_text",
            "",

            nk_draw_list.p("list", ""),
            nk_user_font.const.p("font", ""),
            nk_rect("rect", ""),
            charUTF8.const.p("text", ""),
            AutoSize("text")..int("len", ""),
            float("font_height", ""),
            nk_color("color", "")
        )

        void(
            "draw_list_push_userdata",
            "",

            nk_draw_list.p("list", ""),
            nk_handle("userdata", "")
        )

        nk_style_item(
            "style_item_color",
            "",

            nk_color("color", "")
        )

        nk_style_item(
            "style_item_image",
            "",

            nk_image("img", "")
        )

        nk_style_item(
            "style_item_nine_slice",
            "",

            nk_nine_slice("slice", "")
        )

        nk_style_item(
            "style_item_hide",
            "",
            void()
        )
    }()
}