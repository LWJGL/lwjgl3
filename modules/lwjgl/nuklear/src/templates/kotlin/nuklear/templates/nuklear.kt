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
#define NK_INCLUDE_FONT_BAKING
    #define NK_INCLUDE_DEFAULT_FONT
#define NK_INCLUDE_STANDARD_IO
#define NK_INCLUDE_STANDARD_BOOL
#define NK_INCLUDE_VERTEX_BUFFER_OUTPUT
#define NK_INCLUDE_COMMAND_USERDATA
#define NK_BUTTON_TRIGGER_ON_RELEASE
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

    IntConstant(
        "UTF_INVALID"..0xFFFD,
        "UTF_SIZE".."$NK_UTF_SIZE",
        "INPUT_MAX".."16",
        "MAX_NUMBER_BUFFER".."64"
    )

    FloatConstant(
        "UNDEFINED"..-1.0f,
        "SCROLLBAR_HIDING_TIMEOUT"..4.0f,
        "WIDGET_DISABLED_FACTOR"..0.5f
    )

    IntConstant(
        "TEXTEDIT_UNDOSTATECOUNT".."99",
        "TEXTEDIT_UNDOCHARCOUNT".."999",
        "MAX_LAYOUT_ROW_TEMPLATE_COLUMNS".."16",
        "CHART_MAX_SLOT".."4",
        "WINDOW_MAX_NAME".."64",
        "BUTTON_BEHAVIOR_STACK_SIZE".."8",
        "FONT_STACK_SIZE".."8",
        "STYLE_ITEM_STACK_SIZE".."16",
        "FLOAT_STACK_SIZE".."32",
        "VECTOR_STACK_SIZE".."16",
        "FLAGS_STACK_SIZE".."32",
        "COLOR_STACK_SIZE".."32"
    )

    EnumConstant(
        "nk_false".enum,
        "nk_true".enum
    ).noPrefix()

    EnumConstant(
        "UP".enum,
        "RIGHT".enum,
        "DOWN".enum,
        "LEFT".enum
    )

    EnumConstant(
        "BUTTON_DEFAULT".enum,
        "BUTTON_REPEATER".enum
    )

    EnumConstant(
        "FIXED".enum("nk_false"),
        "MODIFIABLE".enum("nk_true")
    )

    EnumConstant(
        "VERTICAL".enum,
        "HORIZONTAL".enum
    )

    EnumConstant(
        "MINIMIZED".enum("nk_false"),
        "MAXIMIZED".enum("nk_true")
    )

    EnumConstant(
        "HIDDEN".enum("nk_false"),
        "SHOWN".enum("nk_true")
    )

    EnumConstant(
        "CHART_LINES".enum,
        "CHART_COLUMN".enum,
        "CHART_MAX".enum
    )

    EnumConstant(
        "CHART_HOVERING".enum(0x01),
        "CHART_CLICKED".enum(0x02)
    )

    EnumConstant(
        "RGB".enum,
        "RGBA".enum
    )

    EnumConstant(
        "POPUP_STATIC".enum,
        "POPUP_DYNAMIC".enum
    )

    EnumConstant(
        "DYNAMIC".enum,
        "STATIC".enum
    )

    EnumConstant(
        "TREE_NODE".enum,
        "TREE_TAB".enum
    )

    EnumConstant(
        "ANTI_ALIASING_OFF".enum,
        "ANTI_ALIASING_ON".enum
    )

    EnumConstant(
        "CONVERT_SUCCESS".enum(0),
        "CONVERT_INVALID_PARAM".enum(1),
        "CONVERT_COMMAND_BUFFER_FULL".enum(1.NK_FLAG),
        "CONVERT_VERTEX_BUFFER_FULL".enum(2.NK_FLAG),
        "CONVERT_ELEMENT_BUFFER_FULL".enum(3.NK_FLAG)
    )

    EnumConstant(
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
        "SYMBOL_TRIANGLE_UP_OUTLINE".enum,
        "SYMBOL_TRIANGLE_DOWN_OUTLINE".enum,
        "SYMBOL_TRIANGLE_LEFT_OUTLINE".enum,
        "SYMBOL_TRIANGLE_RIGHT_OUTLINE".enum,
        "SYMBOL_MAX".enum
    )

    EnumConstant(
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
    )

    EnumConstant(
        "BUTTON_LEFT".enum,
        "BUTTON_MIDDLE".enum,
        "BUTTON_RIGHT".enum,
        "BUTTON_DOUBLE".enum,

        "BUTTON_MAX".enum
    )

    EnumConstant(
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
        "COLOR_KNOB".enum,
        "COLOR_KNOB_CURSOR".enum,
        "COLOR_KNOB_CURSOR_HOVER".enum,
        "COLOR_KNOB_CURSOR_ACTIVE".enum,

        "COLOR_COUNT".enum
    )

    EnumConstant(
        "CURSOR_ARROW".enum,
        "CURSOR_TEXT".enum,
        "CURSOR_MOVE".enum,
        "CURSOR_RESIZE_VERTICAL".enum,
        "CURSOR_RESIZE_HORIZONTAL".enum,
        "CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT".enum,
        "CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT".enum,

        "CURSOR_COUNT".enum
    )

    EnumConstant(
        "WIDGET_INVALID".enum,
        "WIDGET_VALID".enum,
        "WIDGET_ROM".enum,
        "WIDGET_DISABLED".enum
    )

    EnumConstant(
        "WIDGET_STATE_MODIFIED".enum(1.NK_FLAG),
        "WIDGET_STATE_INACTIVE".enum(2.NK_FLAG),
        "WIDGET_STATE_ENTERED".enum(3.NK_FLAG),
        "WIDGET_STATE_HOVER".enum(4.NK_FLAG),
        "WIDGET_STATE_ACTIVED".enum(5.NK_FLAG),
        "WIDGET_STATE_LEFT".enum(6.NK_FLAG),
        "WIDGET_STATE_HOVERED".enum("NK_WIDGET_STATE_HOVER|NK_WIDGET_STATE_MODIFIED"),
        "WIDGET_STATE_ACTIVE".enum("NK_WIDGET_STATE_ACTIVED|NK_WIDGET_STATE_MODIFIED")
    )

    EnumConstant(
        "TEXT_ALIGN_LEFT".enum(0x01),
        "TEXT_ALIGN_CENTERED".enum(0x02),
        "TEXT_ALIGN_RIGHT".enum(0x04),
        "TEXT_ALIGN_TOP".enum(0x08),
        "TEXT_ALIGN_MIDDLE".enum(0x10),
        "TEXT_ALIGN_BOTTOM".enum(0x20)
    )

    EnumConstant(
        "TEXT_LEFT".enum("NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_LEFT"),
        "TEXT_CENTERED".enum("NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_CENTERED"),
        "TEXT_RIGHT".enum("NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_RIGHT")
    )

    EnumConstant(
        "EDIT_DEFAULT".enum(0),
        "EDIT_READ_ONLY".enum(0.NK_FLAG),
        "EDIT_AUTO_SELECT".enum(1.NK_FLAG),
        "EDIT_SIG_ENTER".enum(2.NK_FLAG),
        "EDIT_ALLOW_TAB".enum(3.NK_FLAG),
        "EDIT_NO_CURSOR".enum(4.NK_FLAG),
        "EDIT_SELECTABLE".enum(5.NK_FLAG),
        "EDIT_CLIPBOARD".enum(6.NK_FLAG),
        "EDIT_CTRL_ENTER_NEWLINE".enum(7.NK_FLAG),
        "EDIT_NO_HORIZONTAL_SCROLL".enum(8.NK_FLAG),
        "EDIT_ALWAYS_INSERT_MODE".enum(9.NK_FLAG),
        "EDIT_MULTILINE".enum(10.NK_FLAG),
        "EDIT_GOTO_END_ON_ACTIVATE".enum(11.NK_FLAG)
    )

    EnumConstant(
        "EDIT_SIMPLE".enum("NK_EDIT_ALWAYS_INSERT_MODE"),
        "EDIT_FIELD".enum("NK_EDIT_SIMPLE|NK_EDIT_SELECTABLE|NK_EDIT_CLIPBOARD"),
        "EDIT_BOX".enum("NK_EDIT_ALWAYS_INSERT_MODE|NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD"),
        "EDIT_EDITOR".enum("NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD")
    )

    EnumConstant(
        "EDIT_ACTIVE".enum(0.NK_FLAG),
        "EDIT_INACTIVE".enum(1.NK_FLAG),
        "EDIT_ACTIVATED".enum(2.NK_FLAG),
        "EDIT_DEACTIVATED".enum(3.NK_FLAG),
        "EDIT_COMMITED".enum(4.NK_FLAG)
    )

    EnumConstant(
        "WINDOW_BORDER".enum( 0.NK_FLAG),
        "WINDOW_MOVABLE".enum(1.NK_FLAG),
        "WINDOW_SCALABLE".enum(2.NK_FLAG),
        "WINDOW_CLOSABLE".enum(3.NK_FLAG),
        "WINDOW_MINIMIZABLE".enum(4.NK_FLAG),
        "WINDOW_NO_SCROLLBAR".enum(5.NK_FLAG),
        "WINDOW_TITLE".enum(6.NK_FLAG),
        "WINDOW_SCROLL_AUTO_HIDE".enum(7.NK_FLAG),
        "WINDOW_BACKGROUND".enum(8.NK_FLAG),
        "WINDOW_SCALE_LEFT".enum(9.NK_FLAG),
        "WINDOW_NO_INPUT".enum(10.NK_FLAG)
    )

    EnumConstant(
        "WIDGET_ALIGN_LEFT".."0x01",
        "WIDGET_ALIGN_CENTERED".."0x02",
        "WIDGET_ALIGN_RIGHT".."0x04",
        "WIDGET_ALIGN_TOP".."0x08",
        "WIDGET_ALIGN_MIDDLE".."0x10",
        "WIDGET_ALIGN_BOTTOM".."0x20"
    )

    EnumConstant(
        "WIDGET_LEFT".."NK_WIDGET_ALIGN_MIDDLE|NK_WIDGET_ALIGN_LEFT",
        "WIDGET_CENTERED".."NK_WIDGET_ALIGN_MIDDLE|NK_WIDGET_ALIGN_CENTERED",
        "WIDGET_RIGHT".."NK_WIDGET_ALIGN_MIDDLE|NK_WIDGET_ALIGN_RIGHT"
    )

    EnumConstant(
        "BUFFER_FIXED".enum,
        "BUFFER_DYNAMIC".enum
    )

    EnumConstant(
        "BUFFER_FRONT".enum,
        "BUFFER_BACK".enum,
        "BUFFER_MAX".enum
    )

    EnumConstant(
        "TEXT_EDIT_SINGLE_LINE".enum,
        "TEXT_EDIT_MULTI_LINE".enum
    )

    EnumConstant(
        "TEXT_EDIT_MODE_VIEW".enum,
        "TEXT_EDIT_MODE_INSERT".enum,
        "TEXT_EDIT_MODE_REPLACE".enum
    )

    EnumConstant(
        "FONT_ATLAS_ALPHA8".enum,
        "FONT_ATLAS_RGBA32".enum
    )

    EnumConstant(
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
        "CLIPPING_OFF".enum("nk_false"),
        "CLIPPING_ON".enum("nk_true")
    )

    EnumConstant(
        "STROKE_OPEN".enum("nk_false"),
        "STROKE_CLOSED".enum("nk_true")
    )

    EnumConstant(
        "VERTEX_POSITION".enum,
        "VERTEX_COLOR".enum,
        "VERTEX_TEXCOORD".enum,

        "VERTEX_ATTRIBUTE_COUNT".enum
    )

    EnumConstant(
        "FORMAT_SCHAR".enum,
        "FORMAT_SSHORT".enum,
        "FORMAT_SINT".enum,
        "FORMAT_UCHAR".enum,
        "FORMAT_USHORT".enum,
        "FORMAT_UINT".enum,
        "FORMAT_FLOAT".enum,
        "FORMAT_DOUBLE".enum,

        "FORMAT_COLOR_BEGIN".enum,
        "FORMAT_R8G8B8".enum("NK_FORMAT_COLOR_BEGIN"),
        "FORMAT_R16G15B16".enum("9"),
        "FORMAT_R32G32B32".enum,

        "FORMAT_R8G8B8A8".enum,
        "FORMAT_B8G8R8A8".enum,
        "FORMAT_R16G15B16A16".enum,
        "FORMAT_R32G32B32A32".enum,
        "FORMAT_R32G32B32A32_FLOAT".enum,
        "FORMAT_R32G32B32A32_DOUBLE".enum,

        "FORMAT_RGB32".enum,
        "FORMAT_RGBA32".enum,
        "FORMAT_COLOR_END".enum("NK_FORMAT_RGBA32"),
        "FORMAT_COUNT".enum("19")
    )

    EnumConstant(
        "STYLE_ITEM_COLOR".enum,
        "STYLE_ITEM_IMAGE".enum,
        "STYLE_ITEM_NINE_SLICE".enum
    )

    EnumConstant(
        "HEADER_LEFT".enum,
        "HEADER_RIGHT".enum
    )

    EnumConstant(
        "PANEL_NONE".enum("0"),
        "PANEL_WINDOW".enum(0.NK_FLAG),
        "PANEL_GROUP".enum(1.NK_FLAG),
        "PANEL_POPUP".enum(2.NK_FLAG),
        "PANEL_CONTEXTUAL".enum(4.NK_FLAG),
        "PANEL_COMBO".enum(5.NK_FLAG),
        "PANEL_MENU".enum(6.NK_FLAG),
        "PANEL_TOOLTIP".enum(7.NK_FLAG)
    )

    EnumConstant(
        "PANEL_SET_NONBLOCK".enum("NK_PANEL_CONTEXTUAL|NK_PANEL_COMBO|NK_PANEL_MENU|NK_PANEL_TOOLTIP"),
        "PANEL_SET_POPUP".enum("NK_PANEL_SET_NONBLOCK|NK_PANEL_POPUP"),
        "PANEL_SET_SUB".enum("NK_PANEL_SET_POPUP|NK_PANEL_GROUP")
    )

    EnumConstant(
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

        EnumConstant(
        "WINDOW_PRIVATE".enum(11.NK_FLAG),
        "WINDOW_DYNAMIC".enum("NK_WINDOW_PRIVATE"),
        "WINDOW_ROM".enum(12.NK_FLAG),
        "WINDOW_HIDDEN".enum(13.NK_FLAG),
        "WINDOW_CLOSED".enum(14.NK_FLAG),
        "WINDOW_MINIMIZED".enum(15.NK_FLAG),
        "WINDOW_REMOVE_ROM".enum(16.NK_FLAG)
    )

    val ctx = nk_context.p("ctx")
    val cctx = nk_context.const.p("ctx");

    {
        nk_bool(
            "init_fixed",

            ctx,
            void.p("memory"),
            AutoSize("memory")..nk_size("size"),
            nullable..nk_user_font.const.p("font")
        )

        nk_bool(
            "init",

            ctx,
            nk_allocator.const.p("allocator"),
            nullable..nk_user_font.const.p("font")
        )

        nk_bool(
            "init_custom",

            ctx,
            nk_buffer.p("cmds"),
            nk_buffer.p("pool"),
            nullable..nk_user_font.const.p("font")
        )

        void(
            "clear",

            ctx
        )

        void(
            "free",

            ctx
        )

        void(
            "set_user_data",

            ctx,
            nk_handle("handle")
        )

        nk_bool(
            "begin",

            ctx,
            charUTF8.const.p("title"),
            nk_rect("bounds"),
            nk_flags("flags")
        )

        nk_bool(
            "begin_titled",

            ctx,
            charUTF8.const.p("name"),
            charUTF8.const.p("title"),
            nk_rect("bounds"),
            nk_flags("flags")
        )

        void(
            "end",

            ctx
        )

        nk_window.p(
            "window_find",

            cctx,
            charUTF8.const.p("name")
        )

        nk_rect("window_get_bounds", cctx)
        nk_vec2("window_get_position", cctx)
        nk_vec2("window_get_size", cctx)

        float("window_get_width", cctx)
        float("window_get_height", cctx)

        nk_panel.p("window_get_panel", cctx)

        nk_rect("window_get_content_region", cctx)
        nk_vec2("window_get_content_region_min", cctx)
        nk_vec2("window_get_content_region_max", cctx)
        nk_vec2("window_get_content_region_size", cctx)

        nk_command_buffer.p("window_get_canvas", cctx)

        void(
            "window_get_scroll",

            cctx,
            nullable..Check(1)..nk_uint.p("offset_x"),
            nullable..Check(1)..nk_uint.p("offset_y")
        )

        nk_bool("window_has_focus", cctx)

        nk_bool(
            "window_is_collapsed",

            cctx,
            charUTF8.const.p("name")
        )

        nk_bool(
            "window_is_closed",

            cctx,
            charUTF8.const.p("name")
        )

        nk_bool(
            "window_is_hidden",

            cctx,
            charUTF8.const.p("name")
        )

        nk_bool(
            "window_is_active",

            cctx,
            charUTF8.const.p("name")
        )

        nk_bool("window_is_hovered", cctx)

        nk_bool("window_is_any_hovered", cctx)

        nk_bool("item_is_any_active", cctx)

        void(
            "window_set_bounds",

            ctx,
            charUTF8.const.p("name"),
            nk_rect("bounds")
        )

        void(
            "window_set_position",

            ctx,
            charUTF8.const.p("name"),
            nk_vec2("position")
        )

        void(
            "window_set_size",

            ctx,
            charUTF8.const.p("name"),
            nk_vec2("size")
        )

        void(
            "window_set_focus",

            ctx,
            charUTF8.const.p("name")
        )

        void(
            "window_set_scroll",

            ctx,
            nk_uint("offset_x"),
            nk_uint("offset_y")
        )

        void(
            "window_close",

            ctx,
            charUTF8.const.p("name")
        )

        void(
            "window_collapse",

            ctx,
            charUTF8.const.p("name"),
            nk_collapse_states("c")
        )

        void(
            "window_collapse_if",

            ctx,
            charUTF8.const.p("name"),
            nk_collapse_states("c"),
            nk_bool("cond")
        )

        void(
            "window_show",

            ctx,
            charUTF8.const.p("name"),
            nk_show_states("s")
        )

        void(
            "window_show_if",

            ctx,
            charUTF8.const.p("name"),
            nk_show_states("s"),
            nk_bool("cond")
        )

        void(
            "rule_horizontal",

            ctx,
            nk_color("color"),
            nk_bool("rounding")
        )

        void(
            "layout_set_min_row_height",

            ctx,
            float("height")
        )

        void(
            "layout_reset_min_row_height",

            ctx
        )

        nk_rect(
            "layout_widget_bounds",

            cctx
        )

        float(
            "layout_ratio_from_pixel",

            cctx,
            float("pixel_width")
        )

        void(
            "layout_row_dynamic",

            ctx,
            float("height"),
            nk_int("cols")
        )
        void(
            "layout_row_static",

            ctx,
            float("height"),
            nk_int("item_width"),
            nk_int("cols")
        )

        void(
            "layout_row_begin",

            ctx,
            nk_layout_format("fmt"),
            float("row_height"),
            nk_int("cols")
        )
        void(
            "layout_row_push",

            ctx,
            float("value")
        )
        void(
            "layout_row_end",

            ctx
        )
        void(
            "layout_row",

            ctx,
            nk_layout_format("fmt"),
            float("height"),
            AutoSize("ratio")..nk_int("cols"),
            float.const.p("ratio")
        )

        void(
            "layout_row_template_begin",

            ctx,
            float("height")
        )
        void(
            "layout_row_template_push_dynamic",

            ctx
        )
        void(
            "layout_row_template_push_variable",

            ctx,
            float("min_width")
        )
        void(
            "layout_row_template_push_static",

            ctx,
            float("width")
        )

        void(
            "layout_row_template_end",

            ctx
        )

        void(
            "layout_space_begin",

            ctx,
            nk_layout_format("fmt"),
            float("height"),
            nk_int("widget_count")
        )
        void(
            "layout_space_push",

            ctx,
            nk_rect("rect")
        )
        void(
            "layout_space_end",

            ctx
        )

        nk_rect(
            "layout_space_bounds",

            cctx
        )

        nk_vec2(
            "layout_space_to_screen",

            cctx,
            ReturnParam..nk_vec2("ret")
        )

        nk_vec2(
            "layout_space_to_local",

            cctx,
            ReturnParam..nk_vec2("ret")
        )

        nk_rect(
            "layout_space_rect_to_screen",

            cctx,
            ReturnParam..nk_rect("ret")
        )

        nk_rect(
            "layout_space_rect_to_local",

            cctx,
            ReturnParam..nk_rect("ret")
        )

        void(
            "spacer",

            ctx
        )

        nk_bool(
            "group_begin",

            ctx,
            charUTF8.const.p("title"),
            nk_flags("flags")
        )
        nk_bool(
            "group_begin_titled",

            ctx,
            charUTF8.const.p("name"),
            charUTF8.const.p("title"),
            nk_flags("flags")
        )
        void("group_end", ctx)
        nk_bool(
            "group_scrolled_offset_begin",

            ctx,
            Check(1)..nk_uint.p("x_offset"),
            Check(1)..nk_uint.p("y_offset"),
            charUTF8.const.p("title"),
            nk_flags("flags")
        )
        nk_bool(
            "group_scrolled_begin",

            ctx,
            nk_scroll.p("scroll"),
            charUTF8.const.p("title"),
            nk_flags("flags")
        )
        void("group_scrolled_end", ctx)
        void(
            "group_get_scroll",

            ctx,
            charUTF8.const.p("id"),
            nullable..Check(1)..nk_uint.p("x_offset"),
            nullable..Check(1)..nk_uint.p("y_offset")
        )
        void(
            "group_set_scroll",

            ctx,
            charUTF8.const.p("id"),
            nk_uint("x_offset"),
            nk_uint("y_offset")
        )

        nk_bool(
            "list_view_begin",

            ctx,
            nk_list_view.p("view"),
            charUTF8.const.p("title"),
            nk_flags("flags"),
            int("row_height"),
            int("row_count")
        )
        void(
            "list_view_end",

            nk_list_view.p("view")
        )

        val tree_push_hashed = nk_bool(
            "tree_push_hashed",

            ctx,
            nk_tree_type("type"),
            charUTF8.const.p("title"),
            nk_collapse_states("initial_state"),
            char.const.p("hash"),
            AutoSize("hash")..nk_int("len"),
            nk_int("seed")
        )
        nk_bool(
            "tree_image_push_hashed",

            ctx,
            tree_push_hashed["type"],
            nk_image("img"),
            tree_push_hashed["title"],
            tree_push_hashed["initial_state"],
            tree_push_hashed["hash"],
            tree_push_hashed["len"],
            tree_push_hashed["seed"]
        )
        void("tree_pop", ctx)

        nk_bool(
            "tree_state_push",

            ctx,
            tree_push_hashed["type"],
            tree_push_hashed["title"],
            Check(1)..nk_collapse_states.p("state")
        )
        nk_bool(
            "tree_state_image_push",

            ctx,
            tree_push_hashed["type"],
            nk_image("image"),
            tree_push_hashed["title"],
            Check(1)..nk_collapse_states.p("state")
        )
        void("tree_state_pop", ctx)

        nk_bool(
            "tree_element_push_hashed",

            ctx,
            tree_push_hashed["type"],
            tree_push_hashed["title"],
            nk_collapse_states("initial_state"),
            Check(1)..nk_bool.p("selected"),
            char.const.p("hash"),
            AutoSize("hash")..int("len"),
            int("seed")
        )
        nk_bool(
            "tree_element_image_push_hashed",

            ctx,
            tree_push_hashed["type"],
            nk_image("img"),
            tree_push_hashed["title"],
            nk_collapse_states("initial_state"),
            Check(1)..nk_bool.p("selected"),
            char.const.p("hash"),
            AutoSize("hash")..int("len"),
            int("seed")
        )
        void("tree_element_pop", ctx)

        void(
            "text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..nk_int("len"),
            nk_flags("alignment")
        )

        void(
            "text_colored",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..nk_int("len"),
            nk_flags("alignment"),
            nk_color("color")
        )

        void(
            "text_wrap",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..nk_int("len")
        )

        void(
            "text_wrap_colored",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..nk_int("len"),
            nk_color("color")
        )

        void(
            "label",

            ctx,
            charUTF8.const.p("str"),
            nk_flags("align")
        )

        void(
            "label_colored",

            ctx,
            charUTF8.const.p("str"),
            nk_flags("align"),
            nk_color("color")
        )

        void(
            "label_wrap",

            ctx,
            charUTF8.const.p("str")
        )

        void(
            "label_colored_wrap",

            ctx,
            charUTF8.const.p("str"),
            nk_color("color")
        )

        void(
            "image",

            ctx,
            nk_image("img")
        )

        void(
            "image_color",

            ctx,
            nk_image("img"),
            nk_color("color")
        )

        void(
            "button_set_behavior",

            ctx,
            nk_button_behavior("behavior")
        )

        nk_bool(
            "button_push_behavior",

            ctx,
            nk_button_behavior("behavior")
        )

        nk_bool(
            "button_pop_behavior",

            ctx
        )

        nk_bool(
            "button_text",

            ctx,
            charUTF8.const.p("title"),
            AutoSize("title")..nk_int("len")
        )

        nk_bool(
            "button_label",

            ctx,
            charUTF8.const.p("title")
        )

        nk_bool(
            "button_color",

            ctx,
            nk_color("color")
        )

        nk_bool(
            "button_symbol",

            ctx,
            nk_symbol_type("symbol")
        )

        nk_bool(
            "button_image",

            ctx,
            nk_image("img")
        )

        nk_bool(
            "button_symbol_label",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "button_symbol_text",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            AutoSize("text")..nk_int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "button_image_label",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "button_image_text",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            AutoSize("text")..nk_int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "button_text_styled",

            ctx,
            nk_style_button.const.p("style"),
            charUTF8.const.p("title"),
            int("len")
        )

        nk_bool(
            "button_label_styled",

            ctx,
            nk_style_button.const.p("style"),
            charUTF8.const.p("title")
        )

        nk_bool(
            "button_symbol_styled",

            ctx,
            nk_style_button.const.p("style"),
            nk_symbol_type("symbol")
        )

        nk_bool(
            "button_image_styled",

            ctx,
            nk_style_button.const.p("style"),
            nk_image("img")
        )

        nk_bool(
            "button_symbol_text_styled",

            ctx,
            nk_style_button.const.p("style"),
            nk_symbol_type("symbol"),
            charUTF8.const.p("title"),
            int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "button_symbol_label_styled",

            ctx,
            nk_style_button.const.p("style"),
            nk_symbol_type("symbol"),
            charUTF8.const.p("title"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "button_image_label_styled",

            ctx,
            nk_style_button.const.p("style"),
            nk_image("img"),
            charUTF8.const.p("title"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "button_image_text_styled",

            ctx,
            nk_style_button.const.p("style"),
            nk_image("img"),
            charUTF8.const.p("title"),
            int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "check_label",

            ctx,
            charUTF8.const.p("str"),
            nk_bool("active")
        )

        nk_bool(
            "check_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_bool("active")
        )

        nk_bool(
            "check_text_align",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_bool("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        unsigned_int(
            "check_flags_label",

            ctx,
            charUTF8.const.p("str"),
            unsigned_int("flags"),
            unsigned_int("value")
        )

        unsigned_int(
            "check_flags_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            unsigned_int("flags"),
            unsigned_int("value")
        )

        nk_bool(
            "checkbox_label",

            ctx,
            charUTF8.const.p("str"),
            Check(1)..nk_bool.p("active")
        )

        nk_bool(
            "checkbox_label_align",

            ctx,
            charUTF8.const.p("str"),
            Check(1)..nk_bool.p("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "checkbox_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            Check(1)..nk_bool.p("active")
        )

        nk_bool(
            "checkbox_text_align",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            Check(1)..nk_bool.p("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "checkbox_flags_label",

            ctx,
            charUTF8.const.p("str"),
            Check(1)..unsigned_int.p("flags"),
            unsigned_int("value")
        )

        nk_bool(
            "checkbox_flags_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            Check(1)..unsigned_int.p("flags"),
            unsigned_int("value")
        )

        nk_bool(
            "radio_label",

            ctx,
            charUTF8.const.p("str"),
            Check(1)..nk_bool.p("active")
        )

        nk_bool(
            "radio_label_align",

            ctx,
            charUTF8.const.p("str"),
            Check(1)..nk_bool.p("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "radio_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            Check(1)..nk_bool.p("active")
        )

        nk_bool(
            "radio_text_align",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            Check(1)..nk_bool.p("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "option_label",

            ctx,
            charUTF8.const.p("str"),
            nk_bool("active")
        )

        nk_bool(
            "option_label_align",

            ctx,
            charUTF8.const.p("str"),
            nk_bool("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "option_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_bool("active")
        )

        nk_bool(
            "option_text_align",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_bool("active"),
            nk_flags("widget_alignment"),
            nk_flags("text_alignment")
        )

        nk_bool(
            "selectable_label",

            ctx,
            charUTF8.const.p("str"),
            nk_flags("align"),
            Check(1)..nk_bool.p("value")
        )

        nk_bool(
            "selectable_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_flags("align"),
            Check(1)..nk_bool.p("value")
        )

        nk_bool(
            "selectable_image_label",

            ctx,
            nk_image("img"),
            charUTF8.const.p("str"),
            nk_flags("align"),
            Check(1)..nk_bool.p("value")
        )

        nk_bool(
            "selectable_image_text",

            ctx,
            nk_image("img"),
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_flags("align"),
            Check(1)..nk_bool.p("value")
        )

        nk_bool(
            "selectable_symbol_label",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("str"),
            nk_flags("align"),
            Check(1)..nk_bool.p("value")
        )

        nk_bool(
            "selectable_symbol_text",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_flags("align"),
            Check(1)..nk_bool.p("value")
        )

        nk_bool(
            "select_label",

            ctx,
            charUTF8.const.p("str"),
            nk_flags("align"),
            nk_bool("value")
        )

        nk_bool(
            "select_text",

            ctx,
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_flags("align"),
            nk_bool("value")
        )

        nk_bool(
            "select_image_label",

            ctx,
            nk_image("img"),
            charUTF8.const.p("str"),
            nk_flags("align"),
            nk_bool("value")
        )

        nk_bool(
            "select_image_text",

            ctx,
            nk_image("img"),
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_flags("align"),
            nk_bool("value")
        )

        nk_bool(
            "select_symbol_label",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("str"),
            nk_flags("align"),
            nk_bool("value")
        )

        nk_bool(
            "select_symbol_text",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("str"),
            AutoSize("str")..int("len"),
            nk_flags("align"),
            nk_bool("value")
        )

        float(
            "slide_float",

            ctx,
            float("min"),
            float("val"),
            float("max"),
            float("step")
        )

        int(
            "slide_int",

            ctx,
            int("min"),
            int("val"),
            int("max"),
            int("step")
        )

        nk_bool(
            "slider_float",

            ctx,
            float("min"),
            Check(1)..float.p("val"),
            float("max"),
            float("step")
        )

        nk_bool(
            "slider_int",

            ctx,
            int("min"),
            Check(1)..int.p("val"),
            int("max"),
            int("step")
        )

        nk_bool(
            "knob_float",

            ctx,
            float("min"),
            Check(1)..float.p("val"),
            float("max"),
            float("step"),
            nk_heading("zero_direction"),
            float("dead_zone_degrees")
        )

        nk_bool(
            "knob_int",

            ctx,
            int("min"),
            Check(1)..int.p("val"),
            int("max"),
            int("step"),
            nk_heading("zero_direction"),
            float("dead_zone_degrees")
        )

        nk_bool(
            "progress",

            ctx,
            Check(1)..nk_size.p("cur"),
            nk_size("max"),
            nk_bool("modifyable")
        )

        nk_size(
            "prog",

            ctx,
            nk_size("cur"),
            nk_size("max"),
            nk_bool("modifyable")
        )

        nk_colorf(
            "color_picker",

            ctx,
            ReturnParam..nk_colorf("color"),
            nk_color_format("fmt")
        )

        nk_bool(
            "color_pick",

            ctx,
            nk_colorf.p("color"),
            nk_color_format("fmt")
        )

        void(
            "property_int",

            ctx,
            charUTF8.const.p("name"),
            int("min"),
            Check(1)..int.p("val"),
            int("max"),
            int("step"),
            float("inc_per_pixel")
        )

        void(
            "property_float",

            ctx,
            charUTF8.const.p("name"),
            float("min"),
            Check(1)..float.p("val"),
            float("max"),
            float("step"),
            float("inc_per_pixel")
        )

        void(
            "property_double",

            ctx,
            charUTF8.const.p("name"),
            double("min"),
            Check(1)..double.p("val"),
            double("max"),
            double("step"),
            float("inc_per_pixel")
        )

        int(
            "propertyi",

            ctx,
            charUTF8.const.p("name"),
            int("min"),
            int("val"),
            int("max"),
            int("step"),
            float("inc_per_pixel")
        )

        float(
            "propertyf",

            ctx,
            charUTF8.const.p("name"),
            float("min"),
            float("val"),
            float("max"),
            float("step"),
            float("inc_per_pixel")
        )

        double(
            "propertyd",

            ctx,
            charUTF8.const.p("name"),
            double("min"),
            double("val"),
            double("max"),
            double("step"),
            float("inc_per_pixel")
        )

        void(
            "edit_focus",

            ctx,
            nk_flags("flags")
        )

        void(
            "edit_unfocus",

            ctx
        )

        nk_flags(
            "edit_string",

            ctx,
            nk_flags("flags"),
            Input..charUTF8.p("memory"),
            Check(1)..int.p("len"),
            int("max"),
            nullable..nk_plugin_filter("filter")
        )

        nk_flags(
            "edit_buffer",

            ctx,
            nk_flags("flags"),
            nk_text_edit.p("edit"),
            nullable..nk_plugin_filter("filter")
        )

        nk_flags(
            "edit_string_zero_terminated",

            ctx,
            nk_flags("flags"),
            Input..charUTF8.p("buffer"),
            int("max"),
            nullable..nk_plugin_filter("filter")
        )
    }();

    {
        nk_bool(
            "chart_begin",

            ctx,
            nk_chart_type("type"),
            int("num"),
            float("min"),
            float("max")
        )

        nk_bool(
            "chart_begin_colored",

            ctx,
            nk_chart_type("type"),
            nk_color("color"),
            nk_color("active"),
            int("num"),
            float("min"),
            float("max")
        )

        void(
            "chart_add_slot",

            ctx,
            nk_chart_type("type"),
            int("count"),
            float("min_value"),
            float("max_value")
        )

        void(
            "chart_add_slot_colored",

            ctx,
            nk_chart_type("type"),
            nk_color("color"),
            nk_color("active"),
            int("count"),
            float("min_value"),
            float("max_value")
        )

        nk_flags(
            "chart_push",

            ctx,
            float("value")
        )

        nk_flags(
            "chart_push_slot",

            ctx,
            float("value"),
            int("slot")
        )

        void("chart_end", ctx)

        void(
            "plot",

            ctx,
            nk_chart_type("type"),
            Check("offset + count")..float.const.p("values"),
            int("count"),
            int("offset")
        )

        void(
            "plot_function",

            ctx,
            nk_chart_type("type"),
            opaque_p("userdata"),
            nk_value_getter("value_getter"),
            int("count"),
            int("offset")
        )

        nk_bool(
            "popup_begin",

            ctx,
            nk_popup_type("type"),
            charUTF8.const.p("title"),
            nk_flags("flags"),
            nk_rect("rect")
        )
        void("popup_close", ctx)
        void("popup_end", ctx)
        void(
            "popup_get_scroll",

            cctx,
            nullable..Check(1)..nk_uint.p("offset_x"),
            nullable..Check(1)..nk_uint.p("offset_y")
        )
        void(
            "popup_set_scroll",

            ctx,
            nk_uint("offset_x"),
            nk_uint("offset_y")
        )

        int(
            "combo",

            ctx,
            charUTF8.const.p.const.p("items"),
            AutoSize("items")..int("count"),
            int("selected"),
            int("item_height"),
            nk_vec2("size")
        )

        int(
            "combo_separator",

            ctx,
            charUTF8.const.p("items_separated_by_separator"),
            int("separator"),
            int("selected"),
            int("count"),
            int("item_height"),
            nk_vec2("size")
        )

        int(
            "combo_string",

            ctx,
            charUTF8.const.p("items_separated_by_zeros"),
            int("selected"),
            int("count"),
            int("item_height"),
            nk_vec2("size")
        )

        int(
            "combo_callback",

            ctx,
            nk_item_getter("item_getter"),
            opaque_p("userdata"),
            int("selected"),
            int("count"),
            int("item_height"),
            nk_vec2("size")
        )

        void(
            "combobox",

            ctx,
            charUTF8.const.p.const.p("items"),
            AutoSize("items")..int("count"),
            Check(1)..int.p("selected"),
            int("item_height"),
            nk_vec2("size")
        )

        void(
            "combobox_string",

            ctx,
            charUTF8.const.p("items_separated_by_zeros"),
            Check(1)..int.p("selected"),
            int("count"),
            int("item_height"),
            nk_vec2("size")
        )

        void(
            "combobox_separator",

            ctx,
            charUTF8.const.p("items_separated_by_separator"),
            int("separator"),
            Check(1)..int.p("selected"),
            int("count"),
            int("item_height"),
            nk_vec2("size")
        )

        void(
            "combobox_callback",

            ctx,
            nk_item_getter("item_getter"),
            opaque_p("userdata"),
            Check(1)..int.p("selected"),
            int("count"),
            int("item_height"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_text",

            ctx,
            charUTF8.const.p("selected"),
            AutoSize("selected")..int("len"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_label",

            ctx,
            charUTF8.const.p("selected"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_color",

            ctx,
            nk_color("color"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_symbol",

            ctx,
            nk_symbol_type("symbol"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_symbol_label",

            ctx,
            charUTF8.const.p("selected"),
            nk_symbol_type("symbol"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_symbol_text",

            ctx,
            charUTF8.const.p("selected"),
            AutoSize("selected")..int("len"),
            nk_symbol_type("symbol"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_image",

            ctx,
            nk_image("img"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_image_label",

            ctx,
            charUTF8.const.p("selected"),
            nk_image("img"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_begin_image_text",

            ctx,
            charUTF8.const.p("selected"),
            AutoSize("selected")..int("len"),
            nk_image("img"),
            nk_vec2("size")
        )

        nk_bool(
            "combo_item_label",

            ctx,
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "combo_item_text",

            ctx,
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "combo_item_image_label",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "combo_item_image_text",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "combo_item_symbol_label",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "combo_item_symbol_text",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        void("combo_close", ctx)
        void("combo_end", ctx)

        nk_bool(
            "contextual_begin",

            ctx,
            nk_flags("flags"),
            nk_vec2("size"),
            nk_rect("trigger_bounds")
        )

        nk_bool(
            "contextual_item_text",

            ctx,
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("align")
        )

        nk_bool(
            "contextual_item_label",

            ctx,
            charUTF8.const.p("text"),
            nk_flags("align")
        )

        nk_bool(
            "contextual_item_image_label",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "contextual_item_image_text",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "contextual_item_symbol_label",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "contextual_item_symbol_text",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        void("contextual_close", ctx)
        void("contextual_end", ctx)

        void(
            "tooltip",

            ctx,
            charUTF8.const.p("text")
        )

        nk_bool(
            "tooltip_begin",

            ctx,
            float("width")
        )

        void("tooltip_end", ctx)

        void("menubar_begin", ctx)
        void("menubar_end", ctx)

        nk_bool(
            "menu_begin_text",

            ctx,
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("align"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_label",

            ctx,
            charUTF8.const.p("text"),
            nk_flags("align"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_image",

            ctx,
            charUTF8.const.p("text"),
            nk_image("img"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_image_text",

            ctx,
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("align"),
            nk_image("img"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_image_label",

            ctx,
            charUTF8.const.p("text"),
            nk_flags("align"),
            nk_image("img"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_symbol",

            ctx,
            charUTF8.const.p("text"),
            nk_symbol_type("symbol"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_symbol_text",

            ctx,
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("align"),
            nk_symbol_type("symbol"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_begin_symbol_label",

            ctx,
            charUTF8.const.p("text"),
            nk_flags("align"),
            nk_symbol_type("symbol"),
            nk_vec2("size")
        )

        nk_bool(
            "menu_item_text",

            ctx,
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("align")
        )

        nk_bool(
            "menu_item_label",

            ctx,
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "menu_item_image_label",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        nk_bool(
            "menu_item_image_text",

            ctx,
            nk_image("img"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "menu_item_symbol_text",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            nk_flags("alignment")
        )

        nk_bool(
            "menu_item_symbol_label",

            ctx,
            nk_symbol_type("symbol"),
            charUTF8.const.p("text"),
            nk_flags("alignment")
        )

        void("menu_close", ctx)
        void("menu_end", ctx)
    }();

    {
        nk_flags(
            "convert",

            ctx,
            nk_buffer.p("cmds"),
            nk_buffer.p("vertices"),
            nk_buffer.p("elements"),
            nk_convert_config.const.p("config")
        )

        void(
            "input_begin",

            ctx
        )

        void(
            "input_motion",

            ctx,
            int("x"),
            int("y")
        )

        void(
            "input_key",

            ctx,
            nk_keys("key"),
            nk_bool("down")
        )

        void(
            "input_button",

            ctx,
            nk_buttons("id"),
            int("x"),
            int("y"),
            nk_bool("down")
        )

        void(
            "input_scroll",

            ctx,
            nk_vec2("val")
        )

        void(
            "input_char",

            ctx,
            char("c")
        );

        void(
            "input_glyph",

            ctx,
            Check(NK_UTF_SIZE)..nk_glyph("glyph")
        )

        void(
            "input_unicode",

            ctx,
            nk_rune("unicode")
        )

        void(
            "input_end",

            ctx
        )

        void("style_default", ctx)

        void(
            "style_from_table",

            ctx,
            Check("NK_COLOR_COUNT")..nk_color.const.p("table")
        )

        void(
            "style_load_cursor",

            ctx,
            nk_style_cursor("style"),
            nk_cursor.p("cursor")
        )

        void(
            "style_load_all_cursors",

            ctx,
            Check("NK_CURSOR_COUNT")..nk_cursor.const.p("cursors")
        )

        charUTF8.const.p(
            "style_get_color_by_name",

            nk_style_colors("c")
        )

        void(
            "style_set_font",

            ctx,
            nk_user_font.const.p("font")
        )

        nk_bool(
            "style_set_cursor",

            ctx,
            nk_style_cursor("style")
        )

        void("style_show_cursor", ctx)
        void("style_hide_cursor", ctx)

        nk_bool(
            "style_push_font",

            ctx,
            nk_user_font.const.p("font")
        )

        nk_bool(
            "style_push_float",

            ctx,
            Check(1)..float.p("address"),
            float("value")
        )

        nk_bool(
            "style_push_vec2",

            ctx,
            nk_vec2.p("address"),
            nk_vec2("value")
        )

        nk_bool(
            "style_push_style_item",

            ctx,
            nk_style_item.p("address"),
            nk_style_item("value")
        )

        nk_bool(
            "style_push_flags",

            ctx,
            Check(1)..nk_flags.p("address"),
            nk_flags("value")
        )

        nk_bool(
            "style_push_color",

            ctx,
            nk_color.p("address"),
            nk_color("value")
        )

        nk_bool("style_pop_font", ctx)
        nk_bool("style_pop_float", ctx)
        nk_bool("style_pop_vec2", ctx)
        nk_bool("style_pop_style_item", ctx)
        nk_bool("style_pop_flags", ctx)
        nk_bool("style_pop_color", ctx)

        nk_rect("widget_bounds", cctx)

        nk_vec2("widget_position", cctx)

        nk_vec2("widget_size", cctx)

        float("widget_width", cctx)
        float("widget_height", cctx)

        nk_bool("widget_is_hovered", cctx)

        nk_bool(
            "widget_is_mouse_clicked",

            cctx,
            nk_buttons("btn")
        )

        nk_bool(
            "widget_has_mouse_click_down",

            cctx,
            nk_buttons("btn"),
            nk_bool("down")
        )

        void(
            "spacing",

            ctx,
            int("cols")
        )

        void(
            "widget_disable_begin",

            ctx
        )

        void(
            "widget_disable_end",

            ctx
        )

        nk_widget_layout_states(
            "widget",

            nk_rect.p("bounds"),
            cctx
        )

        nk_widget_layout_states(
            "widget_fitting",

            nk_rect.p("bounds"),
            ctx,
            nk_vec2("item_padding")
        )

        nk_color(
            "rgb",

            int("r"),
            int("g"),
            int("b")
        )

        nk_color(
            "rgb_iv",

            Check(3)..int.const.p("rgb")
        )

        nk_color(
            "rgb_bv",

            Check(3)..nk_byte.const.p("rgb")
        )

        nk_color(
            "rgb_f",

            float("r"),
            float("g"),
            float("b")
        )

        nk_color(
            "rgb_fv",

            Check(3)..float.const.p("rgb")
        )

        nk_color(
            "rgb_cf",

            nk_colorf("c")
        )

        nk_color(
            "rgb_hex",

            Check(6)..charASCII.const.p("rgb")
        )

        nk_color(
            "rgb_factor",

            nk_color("col"),
            float("factor")
        )

        nk_color(
            "rgba",

            int("r"),
            int("g"),
            int("b"),
            int("a")
        )

        nk_color(
            "rgba_u32",

            nk_uint("in")
        )

        nk_color(
            "rgba_iv",

            Check(4)..int.const.p("rgba")
        )

        nk_color(
            "rgba_bv",

            Check(4)..nk_byte.const.p("rgba")
        )

        nk_color(
            "rgba_f",

            float("r"),
            float("g"),
            float("b"),
            float("a")
        )

        nk_color(
            "rgba_fv",

            Check(4)..float.const.p("rgba")
        )

        nk_color(
            "rgba_cf",

            nk_colorf("c")
        )

        nk_color(
            "rgba_hex",

            Check(8)..charASCII.const.p("rgba")
        )

        nk_colorf(
            "hsva_colorf",

            float("h"),
            float("s"),
            float("v"),
            float("a")
        )

        nk_colorf(
            "hsva_colorfv",

            Check(4)..float.const.p("c")
        )

        void(
            "colorf_hsva_f",

            Check(1)..float.p("out_h"),
            Check(1)..float.p("out_s"),
            Check(1)..float.p("out_v"),
            Check(1)..float.p("out_a"),
            nk_colorf("in")
        )

        void(
            "colorf_hsva_fv",

            Check(4)..float.p("hsva"),
            nk_colorf("in")
        )

        nk_color(
            "hsv",

            int("h"),
            int("s"),
            int("v")
        )

        nk_color(
            "hsv_iv",

            Check(3)..int.const.p("hsv")
        )

        nk_color(
            "hsv_bv",

            Check(3)..nk_byte.const.p("hsv")
        )

        nk_color(
            "hsv_f",

            float("h"),
            float("s"),
            float("v")
        )

        nk_color(
            "hsv_fv",

            Check(3)..float.const.p("hsv")
        )

        nk_color(
            "hsva",

            int("h"),
            int("s"),
            int("v"),
            int("a")
        )

        nk_color(
            "hsva_iv",

            Check(4)..int.const.p("hsva")
        )

        nk_color(
            "hsva_bv",

            Check(4)..nk_byte.const.p("hsva")
        )

        nk_color(
            "hsva_f",

            float("h"),
            float("s"),
            float("v"),
            float("a")
        )

        nk_color(
            "hsva_fv",

            Check(4)..float.const.p("hsva")
        )

        void(
            "color_f",

            Check(1)..float.p("r"),
            Check(1)..float.p("g"),
            Check(1)..float.p("b"),
            Check(1)..float.p("a"),
            nk_color("color")
        )

        void(
            "color_fv",

            Check(4)..float.p("rgba_out"),
            nk_color("color")
        )

        nk_colorf(
            "color_cf",

            nk_color("color")
        )

        void(
            "color_d",

            Check(1)..double.p("r"),
            Check(1)..double.p("g"),
            Check(1)..double.p("b"),
            Check(1)..double.p("a"),
            nk_color("color")
        )

        void(
            "color_dv",

            Check(4)..double.p("rgba_out"),
            nk_color("color")
        )

        nk_uint(
            "color_u32",

            nk_color("color")
        )

        void(
            "color_hex_rgba",

            Check(8)..char.p("output"),
            nk_color("color")
        )

        void(
            "color_hex_rgb",

            Check(6)..char.p("output"),
            nk_color("color")
        )

        void(
            "color_hsv_i",

            Check(1)..int.p("out_h"),
            Check(1)..int.p("out_s"),
            Check(1)..int.p("out_v"),
            nk_color("color")
        )

        void(
            "color_hsv_b",

            Check(1)..nk_byte.p("out_h"),
            Check(1)..nk_byte.p("out_s"),
            Check(1)..nk_byte.p("out_v"),
            nk_color("color")
        )

        void(
            "color_hsv_iv",

            Check(3)..int.p("hsv_out"),
            nk_color("color")
        )

        void(
            "color_hsv_bv",

            Check(3)..nk_byte.p("hsv_out"),
            nk_color("color")
        )

        void(
            "color_hsv_f",

            Check(1)..float.p("out_h"),
            Check(1)..float.p("out_s"),
            Check(1)..float.p("out_v"),
            nk_color("color")
        )

        void(
            "color_hsv_fv",

            Check(3)..float.p("hsv_out"),
            nk_color("color")
        )

        void(
            "color_hsva_i",

            Check(1)..int.p("h"),
            Check(1)..int.p("s"),
            Check(1)..int.p("v"),
            Check(1)..int.p("a"),
            nk_color("color")
        )

        void(
            "color_hsva_b",

            Check(1)..nk_byte.p("h"),
            Check(1)..nk_byte.p("s"),
            Check(1)..nk_byte.p("v"),
            Check(1)..nk_byte.p("a"),
            nk_color("color")
        )

        void(
            "color_hsva_iv",

            Check(4)..int.p("hsva_out"),
            nk_color("color")
        )

        void(
            "color_hsva_bv",

            Check(4)..nk_byte.p("hsva_out"),
            nk_color("color")
        )

        void(
            "color_hsva_f",

            Check(1)..float.p("out_h"),
            Check(1)..float.p("out_s"),
            Check(1)..float.p("out_v"),
            Check(1)..float.p("out_a"),
            nk_color("color")
        )

        void(
            "color_hsva_fv",

            Check(4)..float.p("hsva_out"),
            nk_color("color")
        )

        nk_handle(
            "handle_ptr",

            opaque_p("ptr")
        )

        nk_handle(
            "handle_id",

            int("id")
        )

        nk_image(
            "image_handle",

            nk_handle("handle")
        )

        nk_image(
            "image_ptr",

            opaque_p("ptr")
        )

        nk_image(
            "image_id",

            int("id")
        )

        nk_bool(
            "image_is_subimage",

            nk_image.const.p("img")
        )

        nk_image(
            "subimage_ptr",

            opaque_p("ptr"),
            nk_ushort("w"),
            nk_ushort("h"),
            nk_rect("sub_region")
        )

        nk_image(
            "subimage_id",

            int("id"),
            nk_ushort("w"),
            nk_ushort("h"),
            nk_rect("sub_region")
        )

        nk_image(
            "subimage_handle",

            nk_handle("handle"),
            nk_ushort("w"),
            nk_ushort("h"),
            nk_rect("sub_region")
        )

        nk_nine_slice(
            "nine_slice_handle",

            nk_handle("handle"),
            nk_ushort("l"),
            nk_ushort("t"),
            nk_ushort("r"),
            nk_ushort("b")
        )
        nk_nine_slice(
            "nine_slice_ptr",

            opaque_p("ptr"),
            nk_ushort("l"),
            nk_ushort("t"),
            nk_ushort("r"),
            nk_ushort("b")
        )
        nk_nine_slice(
            "nine_slice_id",

            int("id"),
            nk_ushort("l"),
            nk_ushort("t"),
            nk_ushort("r"),
            nk_ushort("b")
        )
        intb(
            "nine_slice_is_sub9slice",

            nk_nine_slice.const.p("img")
        )
        nk_nine_slice(
            "sub9slice_ptr",

            opaque_p("ptr"),
            nk_ushort("w"),
            nk_ushort("h"),
            nk_rect("sub_region"),
            nk_ushort("l"),
            nk_ushort("t"),
            nk_ushort("r"),
            nk_ushort("b")
        )
        nk_nine_slice(
            "sub9slice_id",

            int("id"),
            nk_ushort("w"),
            nk_ushort("h"),
            nk_rect("sub_region"),
            nk_ushort("l"),
            nk_ushort("t"),
            nk_ushort("r"),
            nk_ushort("b")
        )
        nk_nine_slice(
            "sub9slice_handle",

            nk_handle("handle"),
            nk_ushort("w"),
            nk_ushort("h"),
            nk_rect("sub_region"),
            nk_ushort("l"),
            nk_ushort("t"),
            nk_ushort("r"),
            nk_ushort("b")
        )

        nk_hash(
            "murmur_hash",

            void.const.p("key"),
            AutoSize("key")..int("len"),
            nk_hash("seed")
        )

        void(
            "triangle_from_direction",

            nk_vec2.p("result"),
            nk_rect("r"),
            float("pad_x"),
            float("pad_y"),
            nk_heading("direction")
        )

        nk_vec2(
            "vec2",

            float("x"),
            float("y")
        )

        nk_vec2(
            "vec2i",

            int("x"),
            int("y")
        )

        nk_vec2(
            "vec2v",

            Check(2)..float.const.p("xy")
        )

        nk_vec2(
            "vec2iv",

            Check(2)..int.const.p("xy")
        )

        nk_rect("get_null_rect", void())

        nk_rect(
            "rect",

            float("x"),
            float("y"),
            float("w"),
            float("h")
        )

        nk_rect(
            "recti",

            int("x"),
            int("y"),
            int("w"),
            int("h")
        )

        nk_rect(
            "recta",

            nk_vec2("pos"),
            nk_vec2("size")
        )

        nk_rect(
            "rectv",

            Check(4)..float.const.p("xywh")
        )

        nk_rect(
            "rectiv",

            Check(4)..int.const.p("xywh")
        )

        nk_vec2(
            "rect_pos",

            nk_rect("r")
        )

        nk_vec2(
            "rect_size",

            nk_rect("r")
        )
    }();

    {
        int(
            "strlen",

            charUTF8.const.p("str")
        )

        int(
            "stricmp",

            charUTF8.const.p("s1"),
            charUTF8.const.p("s2")
        )

        int(
            "stricmpn",

            charUTF8.const.p("s1"),
            charUTF8.const.p("s2"),
            int("n")
        )

        int(
            "strtoi",

            charUTF8.const.p("str"),
            Check(1)..charUTF8.p.p("endptr")
        )

        float(
            "strtof",

            charUTF8.const.p("str"),
            Check(1)..charUTF8.p.p("endptr")
        )

        double(
            "strtod",

            charUTF8.const.p("str"),
            Check(1)..charUTF8.p.p("endptr")
        )

        nk_bool(
            "strfilter",

            charUTF8.const.p("str"),
            charUTF8.const.p("regexp")
        )

        nk_bool(
            "strmatch_fuzzy_string",

            charUTF8.const.p("str"),
            charUTF8.const.p("pattern"),
            Check(1)..int.p("out_score")
        )

        int(
            "strmatch_fuzzy_text",

            charUTF8.const.p("txt"),
            AutoSize("txt")..int("txt_len"),
            charUTF8.const.p("pattern"),
            Check(1)..int.p("out_score")
        )

        int(
            "utf_decode",

            char.const.p("c"),
            Check(1)..nk_rune.p("u"),
            AutoSize("c")..int("clen")
        )

        int(
            "utf_encode",

            nk_rune("u"),
            char.p("c"),
            AutoSize("c")..int("clen")
        )

        int(
            "utf_len",

            char.const.p("str"),
            AutoSize("str")..int("byte_len")
        )

        char.const.p(
            "utf_at",

            char.const.p("buffer"),
            AutoSize("buffer")..int("length"),
            int("index"),
            Check(1)..nk_rune.p("unicode"),
            AutoSizeResult..int.p("len")
        )

        void(
            "buffer_init",

            nk_buffer.p("buffer"),
            nk_allocator.const.p("allocator"),
            nk_size("size")
        )

        void(
            "buffer_init_fixed",

            nk_buffer.p("buffer"),
            void.p("memory"),
            AutoSize("memory")..nk_size("size")
        )

        void(
            "buffer_info",

            nk_memory_status.p("status"),
            nk_buffer.const.p("buffer")
        )

        void(
            "buffer_push",

            nk_buffer.p("buffer"),
            nk_buffer_allocation_type("type"),
            void.const.p("memory"),
            AutoSize("memory")..nk_size("size"),
            nk_size("align")
        )

        void(
            "buffer_mark",

            nk_buffer.p("buffer"),
            nk_buffer_allocation_type("type")
        )

        void(
            "buffer_reset",

            nk_buffer.p("buffer"),
            nk_buffer_allocation_type("type")
        )

        void(
            "buffer_clear",

            nk_buffer.p("buffer")
        )

        void(
            "buffer_free",

            nk_buffer.p("buffer")
        )

        opaque_p(
            "buffer_memory",

            nk_buffer.p("buffer")
        )

        opaque_const_p(
            "buffer_memory_const",

            nk_buffer.const.p("buffer")
        )

        nk_size(
            "buffer_total",

            nk_buffer.const.p("buffer")
        )

        void(
            "str_init",

            nk_str.p("str"),
            nk_allocator.const.p("allocator"),
            nk_size("size")
        )

        void(
            "str_init_fixed",

            nk_str.p("str"),
            void.p("memory"),
            AutoSize("memory")..nk_size("size")
        )

        void(
            "str_clear",

            nk_str.p("str")
        )

        void(
            "str_free",

            nk_str.p("str")
        )

        int(
            "str_append_text_char",

            nk_str.p("s"),
            char.const.p("str"),
            AutoSize("str")..int("len")
        )

        int(
            "str_append_str_char",

            nk_str.p("s"),
            NullTerminated..char.const.p("str")
        )

        int(
            "str_append_text_utf8",

            nk_str.p("s"),
            char.const.p("str"),
            AutoSize("str")..int("len")
        )

        int(
            "str_append_str_utf8",

            nk_str.p("s"),
            NullTerminated..char.const.p("str")
        )

        int(
            "str_append_text_runes",

            nk_str.p("s"),
            nk_rune.const.p("runes"),
            AutoSize("runes")..int("len")
        )

        int(
            "str_append_str_runes",

            nk_str.p("s"),
            NullTerminated..nk_rune.const.p("runes")
        )

        int(
            "str_insert_at_char",

            nk_str.p("s"),
            int("pos"),
            char.const.p("str"),
            AutoSize("str")..int("len")
        )

        int(
            "str_insert_at_rune",

            nk_str.p("s"),
            int("pos"),
            char.const.p("str"),
            AutoSize("str")..int("len")
        )

        int(
            "str_insert_text_char",

            nk_str.p("s"),
            int("pos"),
            char.const.p("str"),
            AutoSize("str")..int("len")
        )

        int(
            "str_insert_str_char",

            nk_str.p("s"),
            int("pos"),
            NullTerminated..char.const.p("str")
        )

        int(
            "str_insert_text_utf8",

            nk_str.p("s"),
            int("pos"),
            char.const.p("str"),
            AutoSize("str")..int("len")
        )

        int(
            "str_insert_str_utf8",

            nk_str.p("s"),
            int("pos"),
            NullTerminated..char.const.p("str")
        )

        int(
            "str_insert_text_runes",

            nk_str.p("s"),
            int("pos"),
            nk_rune.const.p("runes"),
            AutoSize("runes")..int("len")
        )

        int(
            "str_insert_str_runes",

            nk_str.p("s"),
            int("pos"),
            NullTerminated..nk_rune.const.p("runes")
        )

        void(
            "str_remove_chars",

            nk_str.p("s"),
            int("len")
        )

        void(
            "str_remove_runes",

            nk_str.p("str"),
            int("len")
        )

        void(
            "str_delete_chars",

            nk_str.p("s"),
            int("pos"),
            int("len")
        )

        void(
            "str_delete_runes",

            nk_str.p("s"),
            int("pos"),
            int("len")
        )

        charUTF8.p(
            "str_at_char",

            nk_str.p("s"),
            int("pos")
        )

        char.p(
            "str_at_rune",

            nk_str.p("s"),
            int("pos"),
            Check(1)..nk_rune.p("unicode"),
            AutoSizeResult..int.p("len")
        )

        nk_rune(
            "str_rune_at",

            nk_str.const.p("s"),
            int("pos")
        )

        charUTF8.const.p(
            "str_at_char_const",

            nk_str.const.p("s"),
            int("pos")
        )

        char.const.p(
            "str_at_const",

            nk_str.const.p("s"),
            int("pos"),
            Check(1)..nk_rune.p("unicode"),
            AutoSizeResult..int.p("len")
        )

        charUTF8.p(
            "str_get",

            nk_str.p("s")
        )

        charUTF8.const.p(
            "str_get_const",

            nk_str.const.p("s")
        )

        int(
            "str_len",

            nk_str.const.p("s")
        )

        int(
            "str_len_char",

            nk_str.const.p("s")
        )

        nk_bool(
            "filter_default",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        nk_bool(
            "filter_ascii",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        nk_bool(
            "filter_float",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        nk_bool(
            "filter_decimal",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        nk_bool(
            "filter_hex",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        nk_bool(
            "filter_oct",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        nk_bool(
            "filter_binary",

            nk_text_edit.const.p("edit"),
            nk_rune("unicode")
        )

        void(
            "textedit_init",

            nk_text_edit.p("box"),
            nk_allocator.const.p("allocator"),
            nk_size("size")
        )

        void(
            "textedit_init_fixed",

            nk_text_edit.p("box"),
            void.p("memory"),
            AutoSize("memory")..nk_size("size")
        )

        void(
            "textedit_free",

            nk_text_edit.p("box")
        )

        void(
            "textedit_text",

            nk_text_edit.p("box"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("total_len")
        )

        void(
            "textedit_delete",

            nk_text_edit.p("box"),
            int("where"),
            int("len")
        )

        void(
            "textedit_delete_selection",

            nk_text_edit.p("box")
        )

        void(
            "textedit_select_all",

            nk_text_edit.p("box")
        )

        nk_bool(
            "textedit_cut",

            nk_text_edit.p("box")
        )

        nk_bool(
            "textedit_paste",

            nk_text_edit.p("box"),
            charUTF8.const.p("ctext"),
            AutoSize("ctext")..int("len")
        )

        void(
            "textedit_undo",

            nk_text_edit.p("box")
        )

        void(
            "textedit_redo",

            nk_text_edit.p("box")
        )
    }();

    {
        val cmd = Input..nk_command_buffer.p("b")
        void(
            "stroke_line",

            cmd,
            float("x0"),
            float("y0"),
            float("x1"),
            float("y1"),
            float("line_thickness"),
            nk_color("color")
        )

        void(
            "stroke_curve",

            cmd,
            float("ax"),
            float("ay"),
            float("ctrl0x"),
            float("ctrl0y"),
            float("ctrl1x"),
            float("ctrl1y"),
            float("bx"),
            float("by"),
            float("line_thickness"),
            nk_color("color")
        )

        void(
            "stroke_rect",

            cmd,
            nk_rect("rect"),
            float("rounding"),
            float("line_thickness"),
            nk_color("color")
        )

        void(
            "stroke_circle",

            cmd,
            nk_rect("rect"),
            float("line_thickness"),
            nk_color("color")
        )

        void(
            "stroke_arc",

            cmd,
            float("cx"),
            float("cy"),
            float("radius"),
            float("a_min"),
            float("a_max"),
            float("line_thickness"),
            nk_color("color")
        )

        void(
            "stroke_triangle",

            cmd,
            float("x0"),
            float("y0"),
            float("x1"),
            float("y1"),
            float("x2"),
            float("y2"),
            float("line_thichness"),
            nk_color("color")
        )

        void(
            "stroke_polyline",

            cmd,
            float.const.p("points"),
            AutoSizeShr("1", "points")..int("point_count"),
            float("line_thickness"),
            nk_color("col")
        )

        void(
            "stroke_polygon",

            cmd,
            float.const.p("points"),
            AutoSizeShr("1", "points")..int("point_count"),
            float("line_thickness"),
            nk_color("color")
        )

        void(
            "fill_rect",

            cmd,
            nk_rect("rect"),
            float("rounding"),
            nk_color("color")
        )

        void(
            "fill_rect_multi_color",

            cmd,
            nk_rect("rect"),
            nk_color("left"),
            nk_color("top"),
            nk_color("right"),
            nk_color("bottom")
        )

        void(
            "fill_circle",

            cmd,
            nk_rect("rect"),
            nk_color("color")
        )

        void(
            "fill_arc",

            cmd,
            float("cx"),
            float("cy"),
            float("radius"),
            float("a_min"),
            float("a_max"),
            nk_color("color")
        )

        void(
            "fill_triangle",

            cmd,
            float("x0"),
            float("y0"),
            float("x1"),
            float("y1"),
            float("x2"),
            float("y2"),
            nk_color("color")
        )

        void(
            "fill_polygon",

            cmd,
            float.const.p("points"),
            AutoSizeShr("1", "points")..int("point_count"),
            nk_color("color")
        )

        void(
            "draw_image",

            cmd,
            nk_rect("rect"),
            nk_image.const.p("img"),
            nk_color("color")
        )

        void(
            "draw_nine_slice",

            cmd,
            nk_rect("rect"),
            nk_nine_slice.const.p("slc"),
            nk_color("color")
        )

        void(
            "draw_text",

            cmd,
            nk_rect("rect"),
            charUTF8.const.p("string"),
            AutoSize("string")..int("length"),
            nk_user_font.const.p("font"),
            nk_color("bg"),
            nk_color("fg")
        )

        void(
            "push_scissor",

            cmd,
            nk_rect("rect")
        )

        void(
            "push_custom",

            cmd,
            nk_rect("rect"),
            nk_command_custom_callback("callback"),
            nk_handle("usr")
        )

        nk_command.const.p(
            "_next",

            ctx,
            nk_command.const.p("cmd")
        )

        nk_command.const.p(
            "_begin",

            ctx
        )

        nk_bool(
            "input_has_mouse_click",

            nk_input.const.p("i"),
            nk_buttons("id")
        )

        nk_bool(
            "input_has_mouse_click_in_rect",

            nk_input.const.p("i"),
            nk_buttons("id"),
            nk_rect("rect")
        )

        nk_bool(
            "input_has_mouse_click_in_button_rect",

            nk_input.const.p("i"),
            nk_buttons("id"),
            nk_rect("rect")
        )

        nk_bool(
            "input_has_mouse_click_down_in_rect",

            nk_input.const.p("i"),
            nk_buttons("id"),
            nk_rect("rect"),
            nk_bool("down")
        )

        nk_bool(
            "input_is_mouse_click_in_rect",

            nk_input.const.p("i"),
            nk_buttons("id"),
            nk_rect("rect")
        )

        nk_bool(
            "input_is_mouse_click_down_in_rect",

            nk_input.const.p("i"),
            nk_buttons("id"),
            nk_rect("b"),
            nk_bool("down")
        )

        nk_bool(
            "input_any_mouse_click_in_rect",

            nk_input.const.p("i"),
            nk_rect("rect")
        )

        nk_bool(
            "input_is_mouse_prev_hovering_rect",

            nk_input.const.p("i"),
            nk_rect("rect")
        )

        nk_bool(
            "input_is_mouse_hovering_rect",

            nk_input.const.p("i"),
            nk_rect("rect")
        )

        nk_bool(
            "input_mouse_clicked",

            nk_input.const.p("i"),
            nk_buttons("id"),
            nk_rect("rect")
        )

        nk_bool(
            "input_is_mouse_down",

            nk_input.const.p("i"),
            nk_buttons("id")
        )

        nk_bool(
            "input_is_mouse_pressed",

            nk_input.const.p("i"),
            nk_buttons("id")
        )

        nk_bool(
            "input_is_mouse_released",

            nk_input.const.p("i"),
            nk_buttons("id")
        )

        nk_bool(
            "input_is_key_pressed",

            nk_input.const.p("i"),
            nk_keys("key")
        )

        nk_bool(
            "input_is_key_released",

            nk_input.const.p("i"),
            nk_keys("key")
        )

        nk_bool(
            "input_is_key_down",

            nk_input.const.p("i"),
            nk_keys("key")
        )
    }();

    {
        void(
            "draw_list_init",

            nk_draw_list.p("list")
        )

        void(
            "draw_list_setup",

            nk_draw_list.p("canvas"),
            nk_convert_config.const.p("config"),
            nk_buffer.p("cmds"),
            nk_buffer.p("vertices"),
            nk_buffer.p("elements"),
            nk_anti_aliasing("line_aa"),
            nk_anti_aliasing("shape_aa")
        )

        nk_draw_command.const.p(
            "_draw_list_begin",

            nk_draw_list.const.p("list"),
            nk_buffer.const.p("buffer")
        )

        nk_draw_command.const.p(
            "_draw_list_next",

            nk_draw_command.const.p("cmd"),
            nk_buffer.const.p("buffer"),
            nk_draw_list.const.p("list")
        )

        nk_draw_command.const.p(
            "_draw_begin",

            cctx,
            nk_buffer.const.p("buffer")
        )

        nk_draw_command.const.p(
            "_draw_end",

            cctx,
            nk_buffer.const.p("buffer")
        )

        nk_draw_command.const.p(
            "_draw_next",

            nk_draw_command.const.p("cmd"),
            nk_buffer.const.p("buffer"),
            cctx
        )

        void(
            "draw_list_path_clear",

            nk_draw_list.p("list")
        )

        void(
            "draw_list_path_line_to",

            nk_draw_list.p("list"),
            nk_vec2("pos")
        )

        void(
            "draw_list_path_arc_to_fast",

            nk_draw_list.p("list"),
            nk_vec2("center"),
            float("radius"),
            int("a_min"),
            int("a_max")
        )

        void(
            "draw_list_path_arc_to",

            nk_draw_list.p("list"),
            nk_vec2("center"),
            float("radius"),
            float("a_min"),
            float("a_max"),
            unsigned_int("segments")
        )

        void(
            "draw_list_path_rect_to",

            nk_draw_list.p("list"),
            nk_vec2("a"),
            nk_vec2("b"),
            float("rounding")
        )

        void(
            "draw_list_path_curve_to",

            nk_draw_list.p("list"),
            nk_vec2("p2"),
            nk_vec2("p3"),
            nk_vec2("p4"),
            unsigned_int("num_segments")
        )

        void(
            "draw_list_path_fill",

            nk_draw_list.p("list"),
            nk_color("color")
        )

        void(
            "draw_list_path_stroke",

            nk_draw_list.p("list"),
            nk_color("color"),
            nk_draw_list_stroke("closed"),
            float("thickness")
        )

        void(
            "draw_list_stroke_line",

            nk_draw_list.p("list"),
            nk_vec2("a"),
            nk_vec2("b"),
            nk_color("color"),
            float("thickness")
        )

        void(
            "draw_list_stroke_rect",

            nk_draw_list.p("list"),
            nk_rect("rect"),
            nk_color("color"),
            float("rounding"),
            float("thickness")
        )

        void(
            "draw_list_stroke_triangle",

            nk_draw_list.p("list"),
            nk_vec2("a"),
            nk_vec2("b"),
            nk_vec2("c"),
            nk_color("color"),
            float("thickness")
        )

        void(
            "draw_list_stroke_circle",

            nk_draw_list.p("list"),
            nk_vec2("center"),
            float("radius"),
            nk_color("color"),
            unsigned_int("segs"),
            float("thickness")
        )

        void(
            "draw_list_stroke_curve",

            nk_draw_list.p("list"),
            nk_vec2("p0"),
            nk_vec2("cp0"),
            nk_vec2("cp1"),
            nk_vec2("p1"),
            nk_color("color"),
            unsigned_int("segments"),
            float("thickness")
        )

        void(
            "draw_list_stroke_poly_line",

            nk_draw_list.p("list"),
            nk_vec2.const.p("pnts"),
            unsigned_int("cnt"),
            nk_color("color"),
            nk_draw_list_stroke("closed"),
            float("thickness"),
            nk_anti_aliasing("aliasing")
        )

        void(
            "draw_list_fill_rect",

            nk_draw_list.p("list"),
            nk_rect("rect"),
            nk_color("color"),
            float("rounding")
        )

        void(
            "draw_list_fill_rect_multi_color",

            nk_draw_list.p("list"),
            nk_rect("rect"),
            nk_color("left"),
            nk_color("top"),
            nk_color("right"),
            nk_color("bottom")
        )

        void(
            "draw_list_fill_triangle",

            nk_draw_list.p("list"),
            nk_vec2("a"),
            nk_vec2("b"),
            nk_vec2("c"),
            nk_color("color")
        )

        void(
            "draw_list_fill_circle",

            nk_draw_list.p("list"),
            nk_vec2("center"),
            float("radius"),
            nk_color("col"),
            unsigned_int("segs")
        )

        void(
            "draw_list_fill_poly_convex",

            nk_draw_list.p("list"),
            nk_vec2.const.p("points"),
            AutoSize("points")..unsigned_int("count"),
            nk_color("color"),
            nk_anti_aliasing("aliasing")
        )

        void(
            "draw_list_add_image",

            nk_draw_list.p("list"),
            nk_image("texture"),
            nk_rect("rect"),
            nk_color("color")
        )

        void(
            "draw_list_add_text",

            nk_draw_list.p("list"),
            nk_user_font.const.p("font"),
            nk_rect("rect"),
            charUTF8.const.p("text"),
            AutoSize("text")..int("len"),
            float("font_height"),
            nk_color("color")
        )

        void(
            "draw_list_push_userdata",

            nk_draw_list.p("list"),
            nk_handle("userdata")
        )

        nk_style_item(
            "style_item_color",

            nk_color("color")
        )

        nk_style_item(
            "style_item_image",

            nk_image("img")
        )

        nk_style_item(
            "style_item_nine_slice",

            nk_nine_slice("slice")
        )

        nk_style_item(
            "style_item_hide",
            void()
        )
    }();

    {
        EnumConstant(
            "COORD_UV".enum("0"),
            "COORD_PIXEL".enum
        )

        MapPointer("2")..nk_rune.const.p(
            "font_default_glyph_ranges",

            void()
        )

        MapPointer("10")..nk_rune.const.p(
            "font_chinese_glyph_ranges",

            void()
        )

        MapPointer("8")..nk_rune.const.p(
            "font_cyrillic_glyph_ranges",

            void()
        )

        MapPointer("6")..nk_rune.const.p(
            "font_korean_glyph_ranges",

            void()
        )

        void(
            "font_atlas_init",

            nk_font_atlas.p("atlas"),
            nk_allocator.const.p("alloc")
        )

        void(
            "font_atlas_init_custom",

            nk_font_atlas.p("atlas"),
            nk_allocator.const.p("persistent"),
            nk_allocator.const.p("transient_")
        )

        void(
            "font_atlas_begin",

            nk_font_atlas.p("atlas")
        )

        nk_font_config(
            "font_config",

            float("pixel_height")
        )

        nk_font.p(
            "font_atlas_add",

            nk_font_atlas.p("atlas"),
            nk_font_config.const.p("config")
        )

        nk_font.p(
            "font_atlas_add_default",

            nk_font_atlas.p("atlas"),
            float("height"),
            nullable..nk_font_config.const.p("config")
        )

        nk_font.p(
            "font_atlas_add_from_memory",

            nk_font_atlas.p("atlas"),
            void.p("memory"),
            AutoSize("memory")..nk_size("size"),
            float("height"),
            nullable..nk_font_config.const.p("config")
        )

        nk_font.p(
            "font_atlas_add_from_file",

            nk_font_atlas.p("atlas"),
            charUTF8.const.p("file_path"),
            float("height"),
            nullable..nk_font_config.const.p("config")
        )

        nk_font.p(
            "font_atlas_add_compressed",

            nk_font_atlas.p("atlas"),
            void.p("memory"),
            AutoSize("memory")..nk_size("size"),
            float("height"),
            nullable..nk_font_config.const.p("config")
        )

        nk_font.p(
            "font_atlas_add_compressed_base85",

            nk_font_atlas.p("atlas"),
            charASCII.const.p("data"),
            float("height"),
            nullable..nk_font_config.const.p("config")
        )

        void.const.p(
            "font_atlas_bake",

            nk_font_atlas.p("atlas"),
            AutoSizeResult..Check(1)..int.p("width"),
            AutoSizeResult..Check(1)..int.p("height"),
            AutoSizeResult("(fmt == NK_FONT_ATLAS_RGBA32 ? 4 : 1)")..nk_font_atlas_format("fmt")
        )

        void(
            "font_atlas_end",

            nk_font_atlas.p("atlas"),
            nk_handle("tex"),
            nullable..nk_draw_null_texture.p("tex_null")
        )

        nk_font_glyph.const.p(
            "font_find_glyph",

            nk_font.const.p("font"),
            nk_rune("unicode")
        )

        void(
            "font_atlas_cleanup",

            nk_font_atlas.p("atlas")
        )

        void(
            "font_atlas_clear",

            nk_font_atlas.p("atlas")
        )
    }()
}