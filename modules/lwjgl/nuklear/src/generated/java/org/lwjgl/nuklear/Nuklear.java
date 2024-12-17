/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Nuklear {

    static { Library.loadSystem(System::load, System::loadLibrary, Nuklear.class, "org.lwjgl.nuklear", Platform.mapLibraryNameBundled("lwjgl_nuklear")); }

    public static final int
        NK_UTF_INVALID       = 0xFFFD,
        NK_UTF_SIZE          = 4,
        NK_INPUT_MAX         = 16,
        NK_MAX_NUMBER_BUFFER = 64;

    public static final float
        NK_UNDEFINED                = -1.0f,
        NK_SCROLLBAR_HIDING_TIMEOUT = 4.0f,
        NK_WIDGET_DISABLED_FACTOR   = 0.5f;

    public static final int
        NK_TEXTEDIT_UNDOSTATECOUNT         = 99,
        NK_TEXTEDIT_UNDOCHARCOUNT          = 999,
        NK_MAX_LAYOUT_ROW_TEMPLATE_COLUMNS = 16,
        NK_CHART_MAX_SLOT                  = 4,
        NK_WINDOW_MAX_NAME                 = 64,
        NK_BUTTON_BEHAVIOR_STACK_SIZE      = 8,
        NK_FONT_STACK_SIZE                 = 8,
        NK_STYLE_ITEM_STACK_SIZE           = 16,
        NK_FLOAT_STACK_SIZE                = 32,
        NK_VECTOR_STACK_SIZE               = 16,
        NK_FLAGS_STACK_SIZE                = 32,
        NK_COLOR_STACK_SIZE                = 32;

    public static final int
        nk_false = 0,
        nk_true  = 1;

    public static final int
        NK_UP    = 0,
        NK_RIGHT = 1,
        NK_DOWN  = 2,
        NK_LEFT  = 3;

    public static final int
        NK_BUTTON_DEFAULT  = 0,
        NK_BUTTON_REPEATER = 1;

    public static final int
        NK_FIXED      = nk_false,
        NK_MODIFIABLE = nk_true;

    public static final int
        NK_VERTICAL   = 0,
        NK_HORIZONTAL = 1;

    public static final int
        NK_MINIMIZED = nk_false,
        NK_MAXIMIZED = nk_true;

    public static final int
        NK_HIDDEN = nk_false,
        NK_SHOWN  = nk_true;

    public static final int
        NK_CHART_LINES  = 0,
        NK_CHART_COLUMN = 1,
        NK_CHART_MAX    = 2;

    public static final int
        NK_CHART_HOVERING = 0x1,
        NK_CHART_CLICKED  = 0x2;

    public static final int
        NK_RGB  = 0,
        NK_RGBA = 1;

    public static final int
        NK_POPUP_STATIC  = 0,
        NK_POPUP_DYNAMIC = 1;

    public static final int
        NK_DYNAMIC = 0,
        NK_STATIC  = 1;

    public static final int
        NK_TREE_NODE = 0,
        NK_TREE_TAB  = 1;

    public static final int
        NK_ANTI_ALIASING_OFF = 0,
        NK_ANTI_ALIASING_ON  = 1;

    public static final int
        NK_CONVERT_SUCCESS             = 0x0,
        NK_CONVERT_INVALID_PARAM       = 0x1,
        NK_CONVERT_COMMAND_BUFFER_FULL = 1 << 1,
        NK_CONVERT_VERTEX_BUFFER_FULL  = 1 << 2,
        NK_CONVERT_ELEMENT_BUFFER_FULL = 1 << 3;

    public static final int
        NK_SYMBOL_NONE                   = 0,
        NK_SYMBOL_X                      = 1,
        NK_SYMBOL_UNDERSCORE             = 2,
        NK_SYMBOL_CIRCLE_SOLID           = 3,
        NK_SYMBOL_CIRCLE_OUTLINE         = 4,
        NK_SYMBOL_RECT_SOLID             = 5,
        NK_SYMBOL_RECT_OUTLINE           = 6,
        NK_SYMBOL_TRIANGLE_UP            = 7,
        NK_SYMBOL_TRIANGLE_DOWN          = 8,
        NK_SYMBOL_TRIANGLE_LEFT          = 9,
        NK_SYMBOL_TRIANGLE_RIGHT         = 10,
        NK_SYMBOL_PLUS                   = 11,
        NK_SYMBOL_MINUS                  = 12,
        NK_SYMBOL_TRIANGLE_UP_OUTLINE    = 13,
        NK_SYMBOL_TRIANGLE_DOWN_OUTLINE  = 14,
        NK_SYMBOL_TRIANGLE_LEFT_OUTLINE  = 15,
        NK_SYMBOL_TRIANGLE_RIGHT_OUTLINE = 16,
        NK_SYMBOL_MAX                    = 17;

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

    public static final int
        NK_BUTTON_LEFT   = 0,
        NK_BUTTON_MIDDLE = 1,
        NK_BUTTON_RIGHT  = 2,
        NK_BUTTON_DOUBLE = 3,
        NK_BUTTON_MAX    = 4;

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
        NK_COLOR_KNOB                    = 28,
        NK_COLOR_KNOB_CURSOR             = 29,
        NK_COLOR_KNOB_CURSOR_HOVER       = 30,
        NK_COLOR_KNOB_CURSOR_ACTIVE      = 31,
        NK_COLOR_COUNT                   = 32;

    public static final int
        NK_CURSOR_ARROW                      = 0,
        NK_CURSOR_TEXT                       = 1,
        NK_CURSOR_MOVE                       = 2,
        NK_CURSOR_RESIZE_VERTICAL            = 3,
        NK_CURSOR_RESIZE_HORIZONTAL          = 4,
        NK_CURSOR_RESIZE_TOP_LEFT_DOWN_RIGHT = 5,
        NK_CURSOR_RESIZE_TOP_RIGHT_DOWN_LEFT = 6,
        NK_CURSOR_COUNT                      = 7;

    public static final int
        NK_WIDGET_INVALID  = 0,
        NK_WIDGET_VALID    = 1,
        NK_WIDGET_ROM      = 2,
        NK_WIDGET_DISABLED = 3;

    public static final int
        NK_WIDGET_STATE_MODIFIED = 1 << 1,
        NK_WIDGET_STATE_INACTIVE = 1 << 2,
        NK_WIDGET_STATE_ENTERED  = 1 << 3,
        NK_WIDGET_STATE_HOVER    = 1 << 4,
        NK_WIDGET_STATE_ACTIVED  = 1 << 5,
        NK_WIDGET_STATE_LEFT     = 1 << 6,
        NK_WIDGET_STATE_HOVERED  = NK_WIDGET_STATE_HOVER|NK_WIDGET_STATE_MODIFIED,
        NK_WIDGET_STATE_ACTIVE   = NK_WIDGET_STATE_ACTIVED|NK_WIDGET_STATE_MODIFIED;

    public static final int
        NK_TEXT_ALIGN_LEFT     = 0x1,
        NK_TEXT_ALIGN_CENTERED = 0x2,
        NK_TEXT_ALIGN_RIGHT    = 0x4,
        NK_TEXT_ALIGN_TOP      = 0x8,
        NK_TEXT_ALIGN_MIDDLE   = 0x10,
        NK_TEXT_ALIGN_BOTTOM   = 0x20;

    public static final int
        NK_TEXT_LEFT     = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_LEFT,
        NK_TEXT_CENTERED = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_CENTERED,
        NK_TEXT_RIGHT    = NK_TEXT_ALIGN_MIDDLE|NK_TEXT_ALIGN_RIGHT;

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

    public static final int
        NK_EDIT_SIMPLE = NK_EDIT_ALWAYS_INSERT_MODE,
        NK_EDIT_FIELD  = NK_EDIT_SIMPLE|NK_EDIT_SELECTABLE|NK_EDIT_CLIPBOARD,
        NK_EDIT_BOX    = NK_EDIT_ALWAYS_INSERT_MODE|NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD,
        NK_EDIT_EDITOR = NK_EDIT_SELECTABLE|NK_EDIT_MULTILINE|NK_EDIT_ALLOW_TAB|NK_EDIT_CLIPBOARD;

    public static final int
        NK_EDIT_ACTIVE      = 1 << 0,
        NK_EDIT_INACTIVE    = 1 << 1,
        NK_EDIT_ACTIVATED   = 1 << 2,
        NK_EDIT_DEACTIVATED = 1 << 3,
        NK_EDIT_COMMITED    = 1 << 4;

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

    public static final int
        NK_WIDGET_ALIGN_LEFT     = 0x01,
        NK_WIDGET_ALIGN_CENTERED = 0x02,
        NK_WIDGET_ALIGN_RIGHT    = 0x04,
        NK_WIDGET_ALIGN_TOP      = 0x08,
        NK_WIDGET_ALIGN_MIDDLE   = 0x10,
        NK_WIDGET_ALIGN_BOTTOM   = 0x20;

    public static final int
        NK_WIDGET_LEFT     = NK_WIDGET_ALIGN_MIDDLE|NK_WIDGET_ALIGN_LEFT,
        NK_WIDGET_CENTERED = NK_WIDGET_ALIGN_MIDDLE|NK_WIDGET_ALIGN_CENTERED,
        NK_WIDGET_RIGHT    = NK_WIDGET_ALIGN_MIDDLE|NK_WIDGET_ALIGN_RIGHT;

    public static final int
        NK_BUFFER_FIXED   = 0,
        NK_BUFFER_DYNAMIC = 1;

    public static final int
        NK_BUFFER_FRONT = 0,
        NK_BUFFER_BACK  = 1,
        NK_BUFFER_MAX   = 2;

    public static final int
        NK_TEXT_EDIT_SINGLE_LINE = 0,
        NK_TEXT_EDIT_MULTI_LINE  = 1;

    public static final int
        NK_TEXT_EDIT_MODE_VIEW    = 0,
        NK_TEXT_EDIT_MODE_INSERT  = 1,
        NK_TEXT_EDIT_MODE_REPLACE = 2;

    public static final int
        NK_FONT_ATLAS_ALPHA8 = 0,
        NK_FONT_ATLAS_RGBA32 = 1;

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

    public static final int
        NK_CLIPPING_OFF = nk_false,
        NK_CLIPPING_ON  = nk_true;

    public static final int
        NK_STROKE_OPEN   = nk_false,
        NK_STROKE_CLOSED = nk_true;

    public static final int
        NK_VERTEX_POSITION        = 0,
        NK_VERTEX_COLOR           = 1,
        NK_VERTEX_TEXCOORD        = 2,
        NK_VERTEX_ATTRIBUTE_COUNT = 3;

    public static final int
        NK_FORMAT_SCHAR               = 0,
        NK_FORMAT_SSHORT              = 1,
        NK_FORMAT_SINT                = 2,
        NK_FORMAT_UCHAR               = 3,
        NK_FORMAT_USHORT              = 4,
        NK_FORMAT_UINT                = 5,
        NK_FORMAT_FLOAT               = 6,
        NK_FORMAT_DOUBLE              = 7,
        NK_FORMAT_COLOR_BEGIN         = 8,
        NK_FORMAT_R8G8B8              = NK_FORMAT_COLOR_BEGIN,
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
        NK_FORMAT_COLOR_END           = NK_FORMAT_RGBA32,
        NK_FORMAT_COUNT               = 19;

    public static final int
        NK_STYLE_ITEM_COLOR      = 0,
        NK_STYLE_ITEM_IMAGE      = 1,
        NK_STYLE_ITEM_NINE_SLICE = 2;

    public static final int
        NK_HEADER_LEFT  = 0,
        NK_HEADER_RIGHT = 1;

    public static final int
        NK_PANEL_NONE       = 0,
        NK_PANEL_WINDOW     = 1 << 0,
        NK_PANEL_GROUP      = 1 << 1,
        NK_PANEL_POPUP      = 1 << 2,
        NK_PANEL_CONTEXTUAL = 1 << 4,
        NK_PANEL_COMBO      = 1 << 5,
        NK_PANEL_MENU       = 1 << 6,
        NK_PANEL_TOOLTIP    = 1 << 7;

    public static final int
        NK_PANEL_SET_NONBLOCK = NK_PANEL_CONTEXTUAL|NK_PANEL_COMBO|NK_PANEL_MENU|NK_PANEL_TOOLTIP,
        NK_PANEL_SET_POPUP    = NK_PANEL_SET_NONBLOCK|NK_PANEL_POPUP,
        NK_PANEL_SET_SUB      = NK_PANEL_SET_POPUP|NK_PANEL_GROUP;

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

    public static final int
        NK_WINDOW_PRIVATE    = 1 << 11,
        NK_WINDOW_DYNAMIC    = NK_WINDOW_PRIVATE,
        NK_WINDOW_ROM        = 1 << 12,
        NK_WINDOW_HIDDEN     = 1 << 13,
        NK_WINDOW_CLOSED     = 1 << 14,
        NK_WINDOW_MINIMIZED  = 1 << 15,
        NK_WINDOW_REMOVE_ROM = 1 << 16;

    public static final int
        NK_COORD_UV    = 0,
        NK_COORD_PIXEL = 1;

    protected Nuklear() {
        throw new UnsupportedOperationException();
    }

    // --- [ nk_init_fixed ] ---

    /** {@code nk_bool nk_init_fixed(struct nk_context * ctx, void * memory, nk_size size, struct nk_user_font const * font)} */
    public static native boolean nnk_init_fixed(long ctx, long memory, long size, long font);

    /** {@code nk_bool nk_init_fixed(struct nk_context * ctx, void * memory, nk_size size, struct nk_user_font const * font)} */
    @NativeType("nk_bool")
    public static boolean nk_init_fixed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("void *") ByteBuffer memory, @NativeType("struct nk_user_font const *") @Nullable NkUserFont font) {
        return nnk_init_fixed(ctx.address(), memAddress(memory), memory.remaining(), memAddressSafe(font));
    }

    // --- [ nk_init ] ---

    /** {@code nk_bool nk_init(struct nk_context * ctx, struct nk_allocator const * allocator, struct nk_user_font const * font)} */
    public static native boolean nnk_init(long ctx, long allocator, long font);

    /** {@code nk_bool nk_init(struct nk_context * ctx, struct nk_allocator const * allocator, struct nk_user_font const * font)} */
    @NativeType("nk_bool")
    public static boolean nk_init(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_allocator const *") NkAllocator allocator, @NativeType("struct nk_user_font const *") @Nullable NkUserFont font) {
        return nnk_init(ctx.address(), allocator.address(), memAddressSafe(font));
    }

    // --- [ nk_init_custom ] ---

    /** {@code nk_bool nk_init_custom(struct nk_context * ctx, struct nk_buffer * cmds, struct nk_buffer * pool, struct nk_user_font const * font)} */
    public static native boolean nnk_init_custom(long ctx, long cmds, long pool, long font);

    /** {@code nk_bool nk_init_custom(struct nk_context * ctx, struct nk_buffer * cmds, struct nk_buffer * pool, struct nk_user_font const * font)} */
    @NativeType("nk_bool")
    public static boolean nk_init_custom(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_buffer *") NkBuffer cmds, @NativeType("struct nk_buffer *") NkBuffer pool, @NativeType("struct nk_user_font const *") @Nullable NkUserFont font) {
        return nnk_init_custom(ctx.address(), cmds.address(), pool.address(), memAddressSafe(font));
    }

    // --- [ nk_clear ] ---

    /** {@code void nk_clear(struct nk_context * ctx)} */
    public static native void nnk_clear(long ctx);

    /** {@code void nk_clear(struct nk_context * ctx)} */
    public static void nk_clear(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_clear(ctx.address());
    }

    // --- [ nk_free ] ---

    /** {@code void nk_free(struct nk_context * ctx)} */
    public static native void nnk_free(long ctx);

    /** {@code void nk_free(struct nk_context * ctx)} */
    public static void nk_free(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_free(ctx.address());
    }

    // --- [ nk_set_user_data ] ---

    /** {@code void nk_set_user_data(struct nk_context * ctx, nk_handle handle)} */
    public static native void nnk_set_user_data(long ctx, long handle);

    /** {@code void nk_set_user_data(struct nk_context * ctx, nk_handle handle)} */
    public static void nk_set_user_data(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_handle") NkHandle handle) {
        nnk_set_user_data(ctx.address(), handle.address());
    }

    // --- [ nk_begin ] ---

    /** {@code nk_bool nk_begin(struct nk_context * ctx, char const * title, struct nk_rect bounds, nk_flags flags)} */
    public static native boolean nnk_begin(long ctx, long title, long bounds, int flags);

    /** {@code nk_bool nk_begin(struct nk_context * ctx, char const * title, struct nk_rect bounds, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_begin(ctx.address(), memAddress(title), bounds.address(), flags);
    }

    /** {@code nk_bool nk_begin(struct nk_context * ctx, char const * title, struct nk_rect bounds, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_begin(ctx.address(), titleEncoded, bounds.address(), flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_begin_titled ] ---

    /** {@code nk_bool nk_begin_titled(struct nk_context * ctx, char const * name, char const * title, struct nk_rect bounds, nk_flags flags)} */
    public static native boolean nnk_begin_titled(long ctx, long name, long title, long bounds, int flags);

    /** {@code nk_bool nk_begin_titled(struct nk_context * ctx, char const * name, char const * title, struct nk_rect bounds, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(title);
        }
        return nnk_begin_titled(ctx.address(), memAddress(name), memAddress(title), bounds.address(), flags);
    }

    /** {@code nk_bool nk_begin_titled(struct nk_context * ctx, char const * name, char const * title, struct nk_rect bounds, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence title, @NativeType("struct nk_rect") NkRect bounds, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_begin_titled(ctx.address(), nameEncoded, titleEncoded, bounds.address(), flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_end ] ---

    /** {@code void nk_end(struct nk_context * ctx)} */
    public static native void nnk_end(long ctx);

    /** {@code void nk_end(struct nk_context * ctx)} */
    public static void nk_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_end(ctx.address());
    }

    // --- [ nk_window_find ] ---

    /** {@code struct nk_window * nk_window_find(struct nk_context const * ctx, char const * name)} */
    public static native long nnk_window_find(long ctx, long name);

    /** {@code struct nk_window * nk_window_find(struct nk_context const * ctx, char const * name)} */
    @NativeType("struct nk_window *")
    public static @Nullable NkWindow nk_window_find(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nnk_window_find(ctx.address(), memAddress(name));
        return NkWindow.createSafe(__result);
    }

    /** {@code struct nk_window * nk_window_find(struct nk_context const * ctx, char const * name)} */
    @NativeType("struct nk_window *")
    public static @Nullable NkWindow nk_window_find(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") CharSequence name) {
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

    /** {@code struct nk_rect nk_window_get_bounds(struct nk_context const * ctx)} */
    public static native void nnk_window_get_bounds(long ctx, long __result);

    /** {@code struct nk_rect nk_window_get_bounds(struct nk_context const * ctx)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_window_get_bounds(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_window_get_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_position ] ---

    /** {@code struct nk_vec2 nk_window_get_position(struct nk_context const * ctx)} */
    public static native void nnk_window_get_position(long ctx, long __result);

    /** {@code struct nk_vec2 nk_window_get_position(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_position(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_position(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_size ] ---

    /** {@code struct nk_vec2 nk_window_get_size(struct nk_context const * ctx)} */
    public static native void nnk_window_get_size(long ctx, long __result);

    /** {@code struct nk_vec2 nk_window_get_size(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_size(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_size(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_width ] ---

    /** {@code float nk_window_get_width(struct nk_context const * ctx)} */
    public static native float nnk_window_get_width(long ctx);

    /** {@code float nk_window_get_width(struct nk_context const * ctx)} */
    public static float nk_window_get_width(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_get_width(ctx.address());
    }

    // --- [ nk_window_get_height ] ---

    /** {@code float nk_window_get_height(struct nk_context const * ctx)} */
    public static native float nnk_window_get_height(long ctx);

    /** {@code float nk_window_get_height(struct nk_context const * ctx)} */
    public static float nk_window_get_height(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_get_height(ctx.address());
    }

    // --- [ nk_window_get_panel ] ---

    /** {@code struct nk_panel * nk_window_get_panel(struct nk_context const * ctx)} */
    public static native long nnk_window_get_panel(long ctx);

    /** {@code struct nk_panel * nk_window_get_panel(struct nk_context const * ctx)} */
    @NativeType("struct nk_panel *")
    public static @Nullable NkPanel nk_window_get_panel(@NativeType("struct nk_context const *") NkContext ctx) {
        long __result = nnk_window_get_panel(ctx.address());
        return NkPanel.createSafe(__result);
    }

    // --- [ nk_window_get_content_region ] ---

    /** {@code struct nk_rect nk_window_get_content_region(struct nk_context const * ctx)} */
    public static native void nnk_window_get_content_region(long ctx, long __result);

    /** {@code struct nk_rect nk_window_get_content_region(struct nk_context const * ctx)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_window_get_content_region(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_window_get_content_region(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_content_region_min ] ---

    /** {@code struct nk_vec2 nk_window_get_content_region_min(struct nk_context const * ctx)} */
    public static native void nnk_window_get_content_region_min(long ctx, long __result);

    /** {@code struct nk_vec2 nk_window_get_content_region_min(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_content_region_min(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_content_region_min(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_content_region_max ] ---

    /** {@code struct nk_vec2 nk_window_get_content_region_max(struct nk_context const * ctx)} */
    public static native void nnk_window_get_content_region_max(long ctx, long __result);

    /** {@code struct nk_vec2 nk_window_get_content_region_max(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_content_region_max(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_content_region_max(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_content_region_size ] ---

    /** {@code struct nk_vec2 nk_window_get_content_region_size(struct nk_context const * ctx)} */
    public static native void nnk_window_get_content_region_size(long ctx, long __result);

    /** {@code struct nk_vec2 nk_window_get_content_region_size(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_window_get_content_region_size(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_window_get_content_region_size(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_window_get_canvas ] ---

    /** {@code struct nk_command_buffer * nk_window_get_canvas(struct nk_context const * ctx)} */
    public static native long nnk_window_get_canvas(long ctx);

    /** {@code struct nk_command_buffer * nk_window_get_canvas(struct nk_context const * ctx)} */
    @NativeType("struct nk_command_buffer *")
    public static @Nullable NkCommandBuffer nk_window_get_canvas(@NativeType("struct nk_context const *") NkContext ctx) {
        long __result = nnk_window_get_canvas(ctx.address());
        return NkCommandBuffer.createSafe(__result);
    }

    // --- [ nk_window_get_scroll ] ---

    /** {@code void nk_window_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static native void nnk_window_get_scroll(long ctx, long offset_x, long offset_y);

    /** {@code void nk_window_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static void nk_window_get_scroll(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("nk_uint *") @Nullable IntBuffer offset_x, @NativeType("nk_uint *") @Nullable IntBuffer offset_y) {
        if (CHECKS) {
            checkSafe(offset_x, 1);
            checkSafe(offset_y, 1);
        }
        nnk_window_get_scroll(ctx.address(), memAddressSafe(offset_x), memAddressSafe(offset_y));
    }

    // --- [ nk_window_has_focus ] ---

    /** {@code nk_bool nk_window_has_focus(struct nk_context const * ctx)} */
    public static native boolean nnk_window_has_focus(long ctx);

    /** {@code nk_bool nk_window_has_focus(struct nk_context const * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_window_has_focus(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_has_focus(ctx.address());
    }

    // --- [ nk_window_is_collapsed ] ---

    /** {@code nk_bool nk_window_is_collapsed(struct nk_context const * ctx, char const * name)} */
    public static native boolean nnk_window_is_collapsed(long ctx, long name);

    /** {@code nk_bool nk_window_is_collapsed(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_collapsed(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_collapsed(ctx.address(), memAddress(name));
    }

    /** {@code nk_bool nk_window_is_collapsed(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_collapsed(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_collapsed(ctx.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_closed ] ---

    /** {@code nk_bool nk_window_is_closed(struct nk_context const * ctx, char const * name)} */
    public static native boolean nnk_window_is_closed(long ctx, long name);

    /** {@code nk_bool nk_window_is_closed(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_closed(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_closed(ctx.address(), memAddress(name));
    }

    /** {@code nk_bool nk_window_is_closed(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_closed(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_closed(ctx.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_hidden ] ---

    /** {@code nk_bool nk_window_is_hidden(struct nk_context const * ctx, char const * name)} */
    public static native boolean nnk_window_is_hidden(long ctx, long name);

    /** {@code nk_bool nk_window_is_hidden(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_hidden(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_hidden(ctx.address(), memAddress(name));
    }

    /** {@code nk_bool nk_window_is_hidden(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_hidden(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_hidden(ctx.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_active ] ---

    /** {@code nk_bool nk_window_is_active(struct nk_context const * ctx, char const * name)} */
    public static native boolean nnk_window_is_active(long ctx, long name);

    /** {@code nk_bool nk_window_is_active(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_active(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_window_is_active(ctx.address(), memAddress(name));
    }

    /** {@code nk_bool nk_window_is_active(struct nk_context const * ctx, char const * name)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_active(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nnk_window_is_active(ctx.address(), nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_is_hovered ] ---

    /** {@code nk_bool nk_window_is_hovered(struct nk_context const * ctx)} */
    public static native boolean nnk_window_is_hovered(long ctx);

    /** {@code nk_bool nk_window_is_hovered(struct nk_context const * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_hovered(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_is_hovered(ctx.address());
    }

    // --- [ nk_window_is_any_hovered ] ---

    /** {@code nk_bool nk_window_is_any_hovered(struct nk_context const * ctx)} */
    public static native boolean nnk_window_is_any_hovered(long ctx);

    /** {@code nk_bool nk_window_is_any_hovered(struct nk_context const * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_window_is_any_hovered(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_window_is_any_hovered(ctx.address());
    }

    // --- [ nk_item_is_any_active ] ---

    /** {@code nk_bool nk_item_is_any_active(struct nk_context const * ctx)} */
    public static native boolean nnk_item_is_any_active(long ctx);

    /** {@code nk_bool nk_item_is_any_active(struct nk_context const * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_item_is_any_active(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_item_is_any_active(ctx.address());
    }

    // --- [ nk_window_set_bounds ] ---

    /** {@code void nk_window_set_bounds(struct nk_context * ctx, char const * name, struct nk_rect bounds)} */
    public static native void nnk_window_set_bounds(long ctx, long name, long bounds);

    /** {@code void nk_window_set_bounds(struct nk_context * ctx, char const * name, struct nk_rect bounds)} */
    public static void nk_window_set_bounds(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("struct nk_rect") NkRect bounds) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_bounds(ctx.address(), memAddress(name), bounds.address());
    }

    /** {@code void nk_window_set_bounds(struct nk_context * ctx, char const * name, struct nk_rect bounds)} */
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

    /** {@code void nk_window_set_position(struct nk_context * ctx, char const * name, struct nk_vec2 position)} */
    public static native void nnk_window_set_position(long ctx, long name, long position);

    /** {@code void nk_window_set_position(struct nk_context * ctx, char const * name, struct nk_vec2 position)} */
    public static void nk_window_set_position(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("struct nk_vec2") NkVec2 position) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_position(ctx.address(), memAddress(name), position.address());
    }

    /** {@code void nk_window_set_position(struct nk_context * ctx, char const * name, struct nk_vec2 position)} */
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

    /** {@code void nk_window_set_size(struct nk_context * ctx, char const * name, struct nk_vec2 size)} */
    public static native void nnk_window_set_size(long ctx, long name, long size);

    /** {@code void nk_window_set_size(struct nk_context * ctx, char const * name, struct nk_vec2 size)} */
    public static void nk_window_set_size(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_size(ctx.address(), memAddress(name), size.address());
    }

    /** {@code void nk_window_set_size(struct nk_context * ctx, char const * name, struct nk_vec2 size)} */
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

    /** {@code void nk_window_set_focus(struct nk_context * ctx, char const * name)} */
    public static native void nnk_window_set_focus(long ctx, long name);

    /** {@code void nk_window_set_focus(struct nk_context * ctx, char const * name)} */
    public static void nk_window_set_focus(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_set_focus(ctx.address(), memAddress(name));
    }

    /** {@code void nk_window_set_focus(struct nk_context * ctx, char const * name)} */
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

    // --- [ nk_window_set_scroll ] ---

    /** {@code void nk_window_set_scroll(struct nk_context * ctx, nk_uint offset_x, nk_uint offset_y)} */
    public static native void nnk_window_set_scroll(long ctx, int offset_x, int offset_y);

    /** {@code void nk_window_set_scroll(struct nk_context * ctx, nk_uint offset_x, nk_uint offset_y)} */
    public static void nk_window_set_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint") int offset_x, @NativeType("nk_uint") int offset_y) {
        nnk_window_set_scroll(ctx.address(), offset_x, offset_y);
    }

    // --- [ nk_window_close ] ---

    /** {@code void nk_window_close(struct nk_context * ctx, char const * name)} */
    public static native void nnk_window_close(long ctx, long name);

    /** {@code void nk_window_close(struct nk_context * ctx, char const * name)} */
    public static void nk_window_close(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_close(ctx.address(), memAddress(name));
    }

    /** {@code void nk_window_close(struct nk_context * ctx, char const * name)} */
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

    /** {@code void nk_window_collapse(struct nk_context * ctx, char const * name, enum nk_collapse_states c)} */
    public static native void nnk_window_collapse(long ctx, long name, int c);

    /** {@code void nk_window_collapse(struct nk_context * ctx, char const * name, enum nk_collapse_states c)} */
    public static void nk_window_collapse(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_collapse_states") int c) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_collapse(ctx.address(), memAddress(name), c);
    }

    /** {@code void nk_window_collapse(struct nk_context * ctx, char const * name, enum nk_collapse_states c)} */
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

    /** {@code void nk_window_collapse_if(struct nk_context * ctx, char const * name, enum nk_collapse_states c, nk_bool cond)} */
    public static native void nnk_window_collapse_if(long ctx, long name, int c, boolean cond);

    /** {@code void nk_window_collapse_if(struct nk_context * ctx, char const * name, enum nk_collapse_states c, nk_bool cond)} */
    public static void nk_window_collapse_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_collapse_states") int c, @NativeType("nk_bool") boolean cond) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_collapse_if(ctx.address(), memAddress(name), c, cond);
    }

    /** {@code void nk_window_collapse_if(struct nk_context * ctx, char const * name, enum nk_collapse_states c, nk_bool cond)} */
    public static void nk_window_collapse_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("enum nk_collapse_states") int c, @NativeType("nk_bool") boolean cond) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_collapse_if(ctx.address(), nameEncoded, c, cond);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_window_show ] ---

    /** {@code void nk_window_show(struct nk_context * ctx, char const * name, enum nk_show_states s)} */
    public static native void nnk_window_show(long ctx, long name, int s);

    /** {@code void nk_window_show(struct nk_context * ctx, char const * name, enum nk_show_states s)} */
    public static void nk_window_show(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_show_states") int s) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_show(ctx.address(), memAddress(name), s);
    }

    /** {@code void nk_window_show(struct nk_context * ctx, char const * name, enum nk_show_states s)} */
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

    /** {@code void nk_window_show_if(struct nk_context * ctx, char const * name, enum nk_show_states s, nk_bool cond)} */
    public static native void nnk_window_show_if(long ctx, long name, int s, boolean cond);

    /** {@code void nk_window_show_if(struct nk_context * ctx, char const * name, enum nk_show_states s, nk_bool cond)} */
    public static void nk_window_show_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("enum nk_show_states") int s, @NativeType("nk_bool") boolean cond) {
        if (CHECKS) {
            checkNT1(name);
        }
        nnk_window_show_if(ctx.address(), memAddress(name), s, cond);
    }

    /** {@code void nk_window_show_if(struct nk_context * ctx, char const * name, enum nk_show_states s, nk_bool cond)} */
    public static void nk_window_show_if(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("enum nk_show_states") int s, @NativeType("nk_bool") boolean cond) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nnk_window_show_if(ctx.address(), nameEncoded, s, cond);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_rule_horizontal ] ---

    /** {@code void nk_rule_horizontal(struct nk_context * ctx, struct nk_color color, nk_bool rounding)} */
    public static native void nnk_rule_horizontal(long ctx, long color, boolean rounding);

    /** {@code void nk_rule_horizontal(struct nk_context * ctx, struct nk_color color, nk_bool rounding)} */
    public static void nk_rule_horizontal(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color") NkColor color, @NativeType("nk_bool") boolean rounding) {
        nnk_rule_horizontal(ctx.address(), color.address(), rounding);
    }

    // --- [ nk_layout_set_min_row_height ] ---

    /** {@code void nk_layout_set_min_row_height(struct nk_context * ctx, float height)} */
    public static native void nnk_layout_set_min_row_height(long ctx, float height);

    /** {@code void nk_layout_set_min_row_height(struct nk_context * ctx, float height)} */
    public static void nk_layout_set_min_row_height(@NativeType("struct nk_context *") NkContext ctx, float height) {
        nnk_layout_set_min_row_height(ctx.address(), height);
    }

    // --- [ nk_layout_reset_min_row_height ] ---

    /** {@code void nk_layout_reset_min_row_height(struct nk_context * ctx)} */
    public static native void nnk_layout_reset_min_row_height(long ctx);

    /** {@code void nk_layout_reset_min_row_height(struct nk_context * ctx)} */
    public static void nk_layout_reset_min_row_height(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_reset_min_row_height(ctx.address());
    }

    // --- [ nk_layout_widget_bounds ] ---

    /** {@code struct nk_rect nk_layout_widget_bounds(struct nk_context const * ctx)} */
    public static native void nnk_layout_widget_bounds(long ctx, long __result);

    /** {@code struct nk_rect nk_layout_widget_bounds(struct nk_context const * ctx)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_widget_bounds(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_layout_widget_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_layout_ratio_from_pixel ] ---

    /** {@code float nk_layout_ratio_from_pixel(struct nk_context const * ctx, float pixel_width)} */
    public static native float nnk_layout_ratio_from_pixel(long ctx, float pixel_width);

    /** {@code float nk_layout_ratio_from_pixel(struct nk_context const * ctx, float pixel_width)} */
    public static float nk_layout_ratio_from_pixel(@NativeType("struct nk_context const *") NkContext ctx, float pixel_width) {
        return nnk_layout_ratio_from_pixel(ctx.address(), pixel_width);
    }

    // --- [ nk_layout_row_dynamic ] ---

    /** {@code void nk_layout_row_dynamic(struct nk_context * ctx, float height, nk_int cols)} */
    public static native void nnk_layout_row_dynamic(long ctx, float height, int cols);

    /** {@code void nk_layout_row_dynamic(struct nk_context * ctx, float height, nk_int cols)} */
    public static void nk_layout_row_dynamic(@NativeType("struct nk_context *") NkContext ctx, float height, @NativeType("nk_int") int cols) {
        nnk_layout_row_dynamic(ctx.address(), height, cols);
    }

    // --- [ nk_layout_row_static ] ---

    /** {@code void nk_layout_row_static(struct nk_context * ctx, float height, nk_int item_width, nk_int cols)} */
    public static native void nnk_layout_row_static(long ctx, float height, int item_width, int cols);

    /** {@code void nk_layout_row_static(struct nk_context * ctx, float height, nk_int item_width, nk_int cols)} */
    public static void nk_layout_row_static(@NativeType("struct nk_context *") NkContext ctx, float height, @NativeType("nk_int") int item_width, @NativeType("nk_int") int cols) {
        nnk_layout_row_static(ctx.address(), height, item_width, cols);
    }

    // --- [ nk_layout_row_begin ] ---

    /** {@code void nk_layout_row_begin(struct nk_context * ctx, enum nk_layout_format fmt, float row_height, nk_int cols)} */
    public static native void nnk_layout_row_begin(long ctx, int fmt, float row_height, int cols);

    /** {@code void nk_layout_row_begin(struct nk_context * ctx, enum nk_layout_format fmt, float row_height, nk_int cols)} */
    public static void nk_layout_row_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float row_height, @NativeType("nk_int") int cols) {
        nnk_layout_row_begin(ctx.address(), fmt, row_height, cols);
    }

    // --- [ nk_layout_row_push ] ---

    /** {@code void nk_layout_row_push(struct nk_context * ctx, float value)} */
    public static native void nnk_layout_row_push(long ctx, float value);

    /** {@code void nk_layout_row_push(struct nk_context * ctx, float value)} */
    public static void nk_layout_row_push(@NativeType("struct nk_context *") NkContext ctx, float value) {
        nnk_layout_row_push(ctx.address(), value);
    }

    // --- [ nk_layout_row_end ] ---

    /** {@code void nk_layout_row_end(struct nk_context * ctx)} */
    public static native void nnk_layout_row_end(long ctx);

    /** {@code void nk_layout_row_end(struct nk_context * ctx)} */
    public static void nk_layout_row_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_row_end(ctx.address());
    }

    // --- [ nk_layout_row ] ---

    /** {@code void nk_layout_row(struct nk_context * ctx, enum nk_layout_format fmt, float height, nk_int cols, float const * ratio)} */
    public static native void nnk_layout_row(long ctx, int fmt, float height, int cols, long ratio);

    /** {@code void nk_layout_row(struct nk_context * ctx, enum nk_layout_format fmt, float height, nk_int cols, float const * ratio)} */
    public static void nk_layout_row(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float height, @NativeType("float const *") FloatBuffer ratio) {
        nnk_layout_row(ctx.address(), fmt, height, ratio.remaining(), memAddress(ratio));
    }

    // --- [ nk_layout_row_template_begin ] ---

    /** {@code void nk_layout_row_template_begin(struct nk_context * ctx, float height)} */
    public static native void nnk_layout_row_template_begin(long ctx, float height);

    /** {@code void nk_layout_row_template_begin(struct nk_context * ctx, float height)} */
    public static void nk_layout_row_template_begin(@NativeType("struct nk_context *") NkContext ctx, float height) {
        nnk_layout_row_template_begin(ctx.address(), height);
    }

    // --- [ nk_layout_row_template_push_dynamic ] ---

    /** {@code void nk_layout_row_template_push_dynamic(struct nk_context * ctx)} */
    public static native void nnk_layout_row_template_push_dynamic(long ctx);

    /** {@code void nk_layout_row_template_push_dynamic(struct nk_context * ctx)} */
    public static void nk_layout_row_template_push_dynamic(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_row_template_push_dynamic(ctx.address());
    }

    // --- [ nk_layout_row_template_push_variable ] ---

    /** {@code void nk_layout_row_template_push_variable(struct nk_context * ctx, float min_width)} */
    public static native void nnk_layout_row_template_push_variable(long ctx, float min_width);

    /** {@code void nk_layout_row_template_push_variable(struct nk_context * ctx, float min_width)} */
    public static void nk_layout_row_template_push_variable(@NativeType("struct nk_context *") NkContext ctx, float min_width) {
        nnk_layout_row_template_push_variable(ctx.address(), min_width);
    }

    // --- [ nk_layout_row_template_push_static ] ---

    /** {@code void nk_layout_row_template_push_static(struct nk_context * ctx, float width)} */
    public static native void nnk_layout_row_template_push_static(long ctx, float width);

    /** {@code void nk_layout_row_template_push_static(struct nk_context * ctx, float width)} */
    public static void nk_layout_row_template_push_static(@NativeType("struct nk_context *") NkContext ctx, float width) {
        nnk_layout_row_template_push_static(ctx.address(), width);
    }

    // --- [ nk_layout_row_template_end ] ---

    /** {@code void nk_layout_row_template_end(struct nk_context * ctx)} */
    public static native void nnk_layout_row_template_end(long ctx);

    /** {@code void nk_layout_row_template_end(struct nk_context * ctx)} */
    public static void nk_layout_row_template_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_row_template_end(ctx.address());
    }

    // --- [ nk_layout_space_begin ] ---

    /** {@code void nk_layout_space_begin(struct nk_context * ctx, enum nk_layout_format fmt, float height, nk_int widget_count)} */
    public static native void nnk_layout_space_begin(long ctx, int fmt, float height, int widget_count);

    /** {@code void nk_layout_space_begin(struct nk_context * ctx, enum nk_layout_format fmt, float height, nk_int widget_count)} */
    public static void nk_layout_space_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float height, @NativeType("nk_int") int widget_count) {
        nnk_layout_space_begin(ctx.address(), fmt, height, widget_count);
    }

    // --- [ nk_layout_space_push ] ---

    /** {@code void nk_layout_space_push(struct nk_context * ctx, struct nk_rect rect)} */
    public static native void nnk_layout_space_push(long ctx, long rect);

    /** {@code void nk_layout_space_push(struct nk_context * ctx, struct nk_rect rect)} */
    public static void nk_layout_space_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_rect") NkRect rect) {
        nnk_layout_space_push(ctx.address(), rect.address());
    }

    // --- [ nk_layout_space_end ] ---

    /** {@code void nk_layout_space_end(struct nk_context * ctx)} */
    public static native void nnk_layout_space_end(long ctx);

    /** {@code void nk_layout_space_end(struct nk_context * ctx)} */
    public static void nk_layout_space_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_layout_space_end(ctx.address());
    }

    // --- [ nk_layout_space_bounds ] ---

    /** {@code struct nk_rect nk_layout_space_bounds(struct nk_context const * ctx)} */
    public static native void nnk_layout_space_bounds(long ctx, long __result);

    /** {@code struct nk_rect nk_layout_space_bounds(struct nk_context const * ctx)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_space_bounds(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_layout_space_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_layout_space_to_screen ] ---

    /** {@code struct nk_vec2 nk_layout_space_to_screen(struct nk_context const * ctx, struct nk_vec2 ret)} */
    public static native void nnk_layout_space_to_screen(long ctx, long ret);

    /** {@code struct nk_vec2 nk_layout_space_to_screen(struct nk_context const * ctx, struct nk_vec2 ret)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_layout_space_to_screen(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 ret) {
        nnk_layout_space_to_screen(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_layout_space_to_local ] ---

    /** {@code struct nk_vec2 nk_layout_space_to_local(struct nk_context const * ctx, struct nk_vec2 ret)} */
    public static native void nnk_layout_space_to_local(long ctx, long ret);

    /** {@code struct nk_vec2 nk_layout_space_to_local(struct nk_context const * ctx, struct nk_vec2 ret)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_layout_space_to_local(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 ret) {
        nnk_layout_space_to_local(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_layout_space_rect_to_screen ] ---

    /** {@code struct nk_rect nk_layout_space_rect_to_screen(struct nk_context const * ctx, struct nk_rect ret)} */
    public static native void nnk_layout_space_rect_to_screen(long ctx, long ret);

    /** {@code struct nk_rect nk_layout_space_rect_to_screen(struct nk_context const * ctx, struct nk_rect ret)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_space_rect_to_screen(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect ret) {
        nnk_layout_space_rect_to_screen(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_layout_space_rect_to_local ] ---

    /** {@code struct nk_rect nk_layout_space_rect_to_local(struct nk_context const * ctx, struct nk_rect ret)} */
    public static native void nnk_layout_space_rect_to_local(long ctx, long ret);

    /** {@code struct nk_rect nk_layout_space_rect_to_local(struct nk_context const * ctx, struct nk_rect ret)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_layout_space_rect_to_local(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect ret) {
        nnk_layout_space_rect_to_local(ctx.address(), ret.address());
        return ret;
    }

    // --- [ nk_spacer ] ---

    /** {@code void nk_spacer(struct nk_context * ctx)} */
    public static native void nnk_spacer(long ctx);

    /** {@code void nk_spacer(struct nk_context * ctx)} */
    public static void nk_spacer(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_spacer(ctx.address());
    }

    // --- [ nk_group_begin ] ---

    /** {@code nk_bool nk_group_begin(struct nk_context * ctx, char const * title, nk_flags flags)} */
    public static native boolean nnk_group_begin(long ctx, long title, int flags);

    /** {@code nk_bool nk_group_begin(struct nk_context * ctx, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_group_begin(ctx.address(), memAddress(title), flags);
    }

    /** {@code nk_bool nk_group_begin(struct nk_context * ctx, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_begin(ctx.address(), titleEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_begin_titled ] ---

    /** {@code nk_bool nk_group_begin_titled(struct nk_context * ctx, char const * name, char const * title, nk_flags flags)} */
    public static native boolean nnk_group_begin_titled(long ctx, long name, long title, int flags);

    /** {@code nk_bool nk_group_begin_titled(struct nk_context * ctx, char const * name, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(title);
        }
        return nnk_group_begin_titled(ctx.address(), memAddress(name), memAddress(title), flags);
    }

    /** {@code nk_bool nk_group_begin_titled(struct nk_context * ctx, char const * name, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_begin_titled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_begin_titled(ctx.address(), nameEncoded, titleEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_end ] ---

    /** {@code void nk_group_end(struct nk_context * ctx)} */
    public static native void nnk_group_end(long ctx);

    /** {@code void nk_group_end(struct nk_context * ctx)} */
    public static void nk_group_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_group_end(ctx.address());
    }

    // --- [ nk_group_scrolled_offset_begin ] ---

    /** {@code nk_bool nk_group_scrolled_offset_begin(struct nk_context * ctx, nk_uint * x_offset, nk_uint * y_offset, char const * title, nk_flags flags)} */
    public static native boolean nnk_group_scrolled_offset_begin(long ctx, long x_offset, long y_offset, long title, int flags);

    /** {@code nk_bool nk_group_scrolled_offset_begin(struct nk_context * ctx, nk_uint * x_offset, nk_uint * y_offset, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") IntBuffer x_offset, @NativeType("nk_uint *") IntBuffer y_offset, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
            checkNT1(title);
        }
        return nnk_group_scrolled_offset_begin(ctx.address(), memAddress(x_offset), memAddress(y_offset), memAddress(title), flags);
    }

    /** {@code nk_bool nk_group_scrolled_offset_begin(struct nk_context * ctx, nk_uint * x_offset, nk_uint * y_offset, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") IntBuffer x_offset, @NativeType("nk_uint *") IntBuffer y_offset, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_scrolled_offset_begin(ctx.address(), memAddress(x_offset), memAddress(y_offset), titleEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_scrolled_begin ] ---

    /** {@code nk_bool nk_group_scrolled_begin(struct nk_context * ctx, struct nk_scroll * scroll, char const * title, nk_flags flags)} */
    public static native boolean nnk_group_scrolled_begin(long ctx, long scroll, long title, int flags);

    /** {@code nk_bool nk_group_scrolled_begin(struct nk_context * ctx, struct nk_scroll * scroll, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_scrolled_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_scroll *") NkScroll scroll, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_group_scrolled_begin(ctx.address(), scroll.address(), memAddress(title), flags);
    }

    /** {@code nk_bool nk_group_scrolled_begin(struct nk_context * ctx, struct nk_scroll * scroll, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_scrolled_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_scroll *") NkScroll scroll, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_scrolled_begin(ctx.address(), scroll.address(), titleEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_scrolled_end ] ---

    /** {@code void nk_group_scrolled_end(struct nk_context * ctx)} */
    public static native void nnk_group_scrolled_end(long ctx);

    /** {@code void nk_group_scrolled_end(struct nk_context * ctx)} */
    public static void nk_group_scrolled_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_group_scrolled_end(ctx.address());
    }

    // --- [ nk_group_get_scroll ] ---

    /** {@code void nk_group_get_scroll(struct nk_context * ctx, char const * id, nk_uint * x_offset, nk_uint * y_offset)} */
    public static native void nnk_group_get_scroll(long ctx, long id, long x_offset, long y_offset);

    /** {@code void nk_group_get_scroll(struct nk_context * ctx, char const * id, nk_uint * x_offset, nk_uint * y_offset)} */
    public static void nk_group_get_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer id, @NativeType("nk_uint *") @Nullable IntBuffer x_offset, @NativeType("nk_uint *") @Nullable IntBuffer y_offset) {
        if (CHECKS) {
            checkNT1(id);
            checkSafe(x_offset, 1);
            checkSafe(y_offset, 1);
        }
        nnk_group_get_scroll(ctx.address(), memAddress(id), memAddressSafe(x_offset), memAddressSafe(y_offset));
    }

    /** {@code void nk_group_get_scroll(struct nk_context * ctx, char const * id, nk_uint * x_offset, nk_uint * y_offset)} */
    public static void nk_group_get_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence id, @NativeType("nk_uint *") @Nullable IntBuffer x_offset, @NativeType("nk_uint *") @Nullable IntBuffer y_offset) {
        if (CHECKS) {
            checkSafe(x_offset, 1);
            checkSafe(y_offset, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(id, true);
            long idEncoded = stack.getPointerAddress();
            nnk_group_get_scroll(ctx.address(), idEncoded, memAddressSafe(x_offset), memAddressSafe(y_offset));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_group_set_scroll ] ---

    /** {@code void nk_group_set_scroll(struct nk_context * ctx, char const * id, nk_uint x_offset, nk_uint y_offset)} */
    public static native void nnk_group_set_scroll(long ctx, long id, int x_offset, int y_offset);

    /** {@code void nk_group_set_scroll(struct nk_context * ctx, char const * id, nk_uint x_offset, nk_uint y_offset)} */
    public static void nk_group_set_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer id, @NativeType("nk_uint") int x_offset, @NativeType("nk_uint") int y_offset) {
        if (CHECKS) {
            checkNT1(id);
        }
        nnk_group_set_scroll(ctx.address(), memAddress(id), x_offset, y_offset);
    }

    /** {@code void nk_group_set_scroll(struct nk_context * ctx, char const * id, nk_uint x_offset, nk_uint y_offset)} */
    public static void nk_group_set_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence id, @NativeType("nk_uint") int x_offset, @NativeType("nk_uint") int y_offset) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(id, true);
            long idEncoded = stack.getPointerAddress();
            nnk_group_set_scroll(ctx.address(), idEncoded, x_offset, y_offset);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_list_view_begin ] ---

    /** {@code nk_bool nk_list_view_begin(struct nk_context * ctx, struct nk_list_view * view, char const * title, nk_flags flags, int row_height, int row_count)} */
    public static native boolean nnk_list_view_begin(long ctx, long view, long title, int flags, int row_height, int row_count);

    /** {@code nk_bool nk_list_view_begin(struct nk_context * ctx, struct nk_list_view * view, char const * title, nk_flags flags, int row_height, int row_count)} */
    @NativeType("nk_bool")
    public static boolean nk_list_view_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_list_view *") NkListView view, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags, int row_height, int row_count) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_list_view_begin(ctx.address(), view.address(), memAddress(title), flags, row_height, row_count);
    }

    /** {@code nk_bool nk_list_view_begin(struct nk_context * ctx, struct nk_list_view * view, char const * title, nk_flags flags, int row_height, int row_count)} */
    @NativeType("nk_bool")
    public static boolean nk_list_view_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_list_view *") NkListView view, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags, int row_height, int row_count) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_list_view_begin(ctx.address(), view.address(), titleEncoded, flags, row_height, row_count);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_list_view_end ] ---

    /** {@code void nk_list_view_end(struct nk_list_view * view)} */
    public static native void nnk_list_view_end(long view);

    /** {@code void nk_list_view_end(struct nk_list_view * view)} */
    public static void nk_list_view_end(@NativeType("struct nk_list_view *") NkListView view) {
        nnk_list_view_end(view.address());
    }

    // --- [ nk_tree_push_hashed ] ---

    /** {@code nk_bool nk_tree_push_hashed(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states initial_state, char const * hash, nk_int len, nk_int seed)} */
    public static native boolean nnk_tree_push_hashed(long ctx, int type, long title, int initial_state, long hash, int len, int seed);

    /** {@code nk_bool nk_tree_push_hashed(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states initial_state, char const * hash, nk_int len, nk_int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_tree_push_hashed(ctx.address(), type, memAddress(title), initial_state, memAddress(hash), hash.remaining(), seed);
    }

    /** {@code nk_bool nk_tree_push_hashed(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states initial_state, char const * hash, nk_int len, nk_int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_push_hashed(ctx.address(), type, titleEncoded, initial_state, memAddress(hash), hash.remaining(), seed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_image_push_hashed ] ---

    /** {@code nk_bool nk_tree_image_push_hashed(struct nk_context * ctx, enum nk_tree_type type, struct nk_image img, char const * title, enum nk_collapse_states initial_state, char const * hash, nk_int len, nk_int seed)} */
    public static native boolean nnk_tree_image_push_hashed(long ctx, int type, long img, long title, int initial_state, long hash, int len, int seed);

    /** {@code nk_bool nk_tree_image_push_hashed(struct nk_context * ctx, enum nk_tree_type type, struct nk_image img, char const * title, enum nk_collapse_states initial_state, char const * hash, nk_int len, nk_int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_tree_image_push_hashed(ctx.address(), type, img.address(), memAddress(title), initial_state, memAddress(hash), hash.remaining(), seed);
    }

    /** {@code nk_bool nk_tree_image_push_hashed(struct nk_context * ctx, enum nk_tree_type type, struct nk_image img, char const * title, enum nk_collapse_states initial_state, char const * hash, nk_int len, nk_int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("char const *") ByteBuffer hash, @NativeType("nk_int") int seed) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_image_push_hashed(ctx.address(), type, img.address(), titleEncoded, initial_state, memAddress(hash), hash.remaining(), seed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_pop ] ---

    /** {@code void nk_tree_pop(struct nk_context * ctx)} */
    public static native void nnk_tree_pop(long ctx);

    /** {@code void nk_tree_pop(struct nk_context * ctx)} */
    public static void nk_tree_pop(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tree_pop(ctx.address());
    }

    // --- [ nk_tree_state_push ] ---

    /** {@code nk_bool nk_tree_state_push(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states * state)} */
    public static native boolean nnk_tree_state_push(long ctx, int type, long title, long state);

    /** {@code nk_bool nk_tree_state_push(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_push(ctx.address(), type, memAddress(title), memAddress(state));
    }

    /** {@code nk_bool nk_tree_state_push(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_push(ctx.address(), type, titleEncoded, memAddress(state));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_state_image_push ] ---

    /** {@code nk_bool nk_tree_state_image_push(struct nk_context * ctx, enum nk_tree_type type, struct nk_image image, char const * title, enum nk_collapse_states * state)} */
    public static native boolean nnk_tree_state_image_push(long ctx, int type, long image, long title, long state);

    /** {@code nk_bool nk_tree_state_image_push(struct nk_context * ctx, enum nk_tree_type type, struct nk_image image, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_image_push(ctx.address(), type, image.address(), memAddress(title), memAddress(state));
    }

    /** {@code nk_bool nk_tree_state_image_push(struct nk_context * ctx, enum nk_tree_type type, struct nk_image image, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") IntBuffer state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_image_push(ctx.address(), type, image.address(), titleEncoded, memAddress(state));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_state_pop ] ---

    /** {@code void nk_tree_state_pop(struct nk_context * ctx)} */
    public static native void nnk_tree_state_pop(long ctx);

    /** {@code void nk_tree_state_pop(struct nk_context * ctx)} */
    public static void nk_tree_state_pop(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tree_state_pop(ctx.address());
    }

    // --- [ nk_tree_element_push_hashed ] ---

    /** {@code nk_bool nk_tree_element_push_hashed(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states initial_state, nk_bool * selected, char const * hash, int len, int seed)} */
    public static native boolean nnk_tree_element_push_hashed(long ctx, int type, long title, int initial_state, long selected, long hash, int len, int seed);

    /** {@code nk_bool nk_tree_element_push_hashed(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states initial_state, nk_bool * selected, char const * hash, int len, int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_element_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("nk_bool *") ByteBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            checkNT1(title);
            check(selected, 1);
        }
        return nnk_tree_element_push_hashed(ctx.address(), type, memAddress(title), initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed);
    }

    /** {@code nk_bool nk_tree_element_push_hashed(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states initial_state, nk_bool * selected, char const * hash, int len, int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_element_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("nk_bool *") ByteBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_element_push_hashed(ctx.address(), type, titleEncoded, initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_element_image_push_hashed ] ---

    /** {@code nk_bool nk_tree_element_image_push_hashed(struct nk_context * ctx, enum nk_tree_type type, struct nk_image img, char const * title, enum nk_collapse_states initial_state, nk_bool * selected, char const * hash, int len, int seed)} */
    public static native boolean nnk_tree_element_image_push_hashed(long ctx, int type, long img, long title, int initial_state, long selected, long hash, int len, int seed);

    /** {@code nk_bool nk_tree_element_image_push_hashed(struct nk_context * ctx, enum nk_tree_type type, struct nk_image img, char const * title, enum nk_collapse_states initial_state, nk_bool * selected, char const * hash, int len, int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_element_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("nk_bool *") ByteBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            checkNT1(title);
            check(selected, 1);
        }
        return nnk_tree_element_image_push_hashed(ctx.address(), type, img.address(), memAddress(title), initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed);
    }

    /** {@code nk_bool nk_tree_element_image_push_hashed(struct nk_context * ctx, enum nk_tree_type type, struct nk_image img, char const * title, enum nk_collapse_states initial_state, nk_bool * selected, char const * hash, int len, int seed)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_element_image_push_hashed(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states") int initial_state, @NativeType("nk_bool *") ByteBuffer selected, @NativeType("char const *") ByteBuffer hash, int seed) {
        if (CHECKS) {
            check(selected, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_element_image_push_hashed(ctx.address(), type, img.address(), titleEncoded, initial_state, memAddress(selected), memAddress(hash), hash.remaining(), seed);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_tree_element_pop ] ---

    /** {@code void nk_tree_element_pop(struct nk_context * ctx)} */
    public static native void nnk_tree_element_pop(long ctx);

    /** {@code void nk_tree_element_pop(struct nk_context * ctx)} */
    public static void nk_tree_element_pop(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tree_element_pop(ctx.address());
    }

    // --- [ nk_text ] ---

    /** {@code void nk_text(struct nk_context * ctx, char const * str, nk_int len, nk_flags alignment)} */
    public static native void nnk_text(long ctx, long str, int len, int alignment);

    /** {@code void nk_text(struct nk_context * ctx, char const * str, nk_int len, nk_flags alignment)} */
    public static void nk_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int alignment) {
        nnk_text(ctx.address(), memAddress(str), str.remaining(), alignment);
    }

    /** {@code void nk_text(struct nk_context * ctx, char const * str, nk_int len, nk_flags alignment)} */
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

    /** {@code void nk_text_colored(struct nk_context * ctx, char const * str, nk_int len, nk_flags alignment, struct nk_color color)} */
    public static native void nnk_text_colored(long ctx, long str, int len, int alignment, long color);

    /** {@code void nk_text_colored(struct nk_context * ctx, char const * str, nk_int len, nk_flags alignment, struct nk_color color)} */
    public static void nk_text_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int alignment, @NativeType("struct nk_color") NkColor color) {
        nnk_text_colored(ctx.address(), memAddress(str), str.remaining(), alignment, color.address());
    }

    /** {@code void nk_text_colored(struct nk_context * ctx, char const * str, nk_int len, nk_flags alignment, struct nk_color color)} */
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

    /** {@code void nk_text_wrap(struct nk_context * ctx, char const * str, nk_int len)} */
    public static native void nnk_text_wrap(long ctx, long str, int len);

    /** {@code void nk_text_wrap(struct nk_context * ctx, char const * str, nk_int len)} */
    public static void nk_text_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str) {
        nnk_text_wrap(ctx.address(), memAddress(str), str.remaining());
    }

    /** {@code void nk_text_wrap(struct nk_context * ctx, char const * str, nk_int len)} */
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

    /** {@code void nk_text_wrap_colored(struct nk_context * ctx, char const * str, nk_int len, struct nk_color color)} */
    public static native void nnk_text_wrap_colored(long ctx, long str, int len, long color);

    /** {@code void nk_text_wrap_colored(struct nk_context * ctx, char const * str, nk_int len, struct nk_color color)} */
    public static void nk_text_wrap_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("struct nk_color") NkColor color) {
        nnk_text_wrap_colored(ctx.address(), memAddress(str), str.remaining(), color.address());
    }

    /** {@code void nk_text_wrap_colored(struct nk_context * ctx, char const * str, nk_int len, struct nk_color color)} */
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

    /** {@code void nk_label(struct nk_context * ctx, char const * str, nk_flags align)} */
    public static native void nnk_label(long ctx, long str, int align);

    /** {@code void nk_label(struct nk_context * ctx, char const * str, nk_flags align)} */
    public static void nk_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label(ctx.address(), memAddress(str), align);
    }

    /** {@code void nk_label(struct nk_context * ctx, char const * str, nk_flags align)} */
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

    /** {@code void nk_label_colored(struct nk_context * ctx, char const * str, nk_flags align, struct nk_color color)} */
    public static native void nnk_label_colored(long ctx, long str, int align, long color);

    /** {@code void nk_label_colored(struct nk_context * ctx, char const * str, nk_flags align, struct nk_color color)} */
    public static void nk_label_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label_colored(ctx.address(), memAddress(str), align, color.address());
    }

    /** {@code void nk_label_colored(struct nk_context * ctx, char const * str, nk_flags align, struct nk_color color)} */
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

    /** {@code void nk_label_wrap(struct nk_context * ctx, char const * str)} */
    public static native void nnk_label_wrap(long ctx, long str);

    /** {@code void nk_label_wrap(struct nk_context * ctx, char const * str)} */
    public static void nk_label_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label_wrap(ctx.address(), memAddress(str));
    }

    /** {@code void nk_label_wrap(struct nk_context * ctx, char const * str)} */
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

    /** {@code void nk_label_colored_wrap(struct nk_context * ctx, char const * str, struct nk_color color)} */
    public static native void nnk_label_colored_wrap(long ctx, long str, long color);

    /** {@code void nk_label_colored_wrap(struct nk_context * ctx, char const * str, struct nk_color color)} */
    public static void nk_label_colored_wrap(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            checkNT1(str);
        }
        nnk_label_colored_wrap(ctx.address(), memAddress(str), color.address());
    }

    /** {@code void nk_label_colored_wrap(struct nk_context * ctx, char const * str, struct nk_color color)} */
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

    /** {@code void nk_image(struct nk_context * ctx, struct nk_image img)} */
    public static native void nnk_image(long ctx, long img);

    /** {@code void nk_image(struct nk_context * ctx, struct nk_image img)} */
    public static void nk_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img) {
        nnk_image(ctx.address(), img.address());
    }

    // --- [ nk_image_color ] ---

    /** {@code void nk_image_color(struct nk_context * ctx, struct nk_image img, struct nk_color color)} */
    public static native void nnk_image_color(long ctx, long img, long color);

    /** {@code void nk_image_color(struct nk_context * ctx, struct nk_image img, struct nk_color color)} */
    public static void nk_image_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_color") NkColor color) {
        nnk_image_color(ctx.address(), img.address(), color.address());
    }

    // --- [ nk_button_set_behavior ] ---

    /** {@code void nk_button_set_behavior(struct nk_context * ctx, enum nk_button_behavior behavior)} */
    public static native void nnk_button_set_behavior(long ctx, int behavior);

    /** {@code void nk_button_set_behavior(struct nk_context * ctx, enum nk_button_behavior behavior)} */
    public static void nk_button_set_behavior(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_button_behavior") int behavior) {
        nnk_button_set_behavior(ctx.address(), behavior);
    }

    // --- [ nk_button_push_behavior ] ---

    /** {@code nk_bool nk_button_push_behavior(struct nk_context * ctx, enum nk_button_behavior behavior)} */
    public static native boolean nnk_button_push_behavior(long ctx, int behavior);

    /** {@code nk_bool nk_button_push_behavior(struct nk_context * ctx, enum nk_button_behavior behavior)} */
    @NativeType("nk_bool")
    public static boolean nk_button_push_behavior(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_button_behavior") int behavior) {
        return nnk_button_push_behavior(ctx.address(), behavior);
    }

    // --- [ nk_button_pop_behavior ] ---

    /** {@code nk_bool nk_button_pop_behavior(struct nk_context * ctx)} */
    public static native boolean nnk_button_pop_behavior(long ctx);

    /** {@code nk_bool nk_button_pop_behavior(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_button_pop_behavior(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_button_pop_behavior(ctx.address());
    }

    // --- [ nk_button_text ] ---

    /** {@code nk_bool nk_button_text(struct nk_context * ctx, char const * title, nk_int len)} */
    public static native boolean nnk_button_text(long ctx, long title, int len);

    /** {@code nk_bool nk_button_text(struct nk_context * ctx, char const * title, nk_int len)} */
    @NativeType("nk_bool")
    public static boolean nk_button_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title) {
        return nnk_button_text(ctx.address(), memAddress(title), title.remaining());
    }

    /** {@code nk_bool nk_button_text(struct nk_context * ctx, char const * title, nk_int len)} */
    @NativeType("nk_bool")
    public static boolean nk_button_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int titleEncodedLength = stack.nUTF8(title, false);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_text(ctx.address(), titleEncoded, titleEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_label ] ---

    /** {@code nk_bool nk_button_label(struct nk_context * ctx, char const * title)} */
    public static native boolean nnk_button_label(long ctx, long title);

    /** {@code nk_bool nk_button_label(struct nk_context * ctx, char const * title)} */
    @NativeType("nk_bool")
    public static boolean nk_button_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_label(ctx.address(), memAddress(title));
    }

    /** {@code nk_bool nk_button_label(struct nk_context * ctx, char const * title)} */
    @NativeType("nk_bool")
    public static boolean nk_button_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_label(ctx.address(), titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_color ] ---

    /** {@code nk_bool nk_button_color(struct nk_context * ctx, struct nk_color color)} */
    public static native boolean nnk_button_color(long ctx, long color);

    /** {@code nk_bool nk_button_color(struct nk_context * ctx, struct nk_color color)} */
    @NativeType("nk_bool")
    public static boolean nk_button_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color") NkColor color) {
        return nnk_button_color(ctx.address(), color.address());
    }

    // --- [ nk_button_symbol ] ---

    /** {@code nk_bool nk_button_symbol(struct nk_context * ctx, enum nk_symbol_type symbol)} */
    public static native boolean nnk_button_symbol(long ctx, int symbol);

    /** {@code nk_bool nk_button_symbol(struct nk_context * ctx, enum nk_symbol_type symbol)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol) {
        return nnk_button_symbol(ctx.address(), symbol);
    }

    // --- [ nk_button_image ] ---

    /** {@code nk_bool nk_button_image(struct nk_context * ctx, struct nk_image img)} */
    public static native boolean nnk_button_image(long ctx, long img);

    /** {@code nk_bool nk_button_image(struct nk_context * ctx, struct nk_image img)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img) {
        return nnk_button_image(ctx.address(), img.address());
    }

    // --- [ nk_button_symbol_label ] ---

    /** {@code nk_bool nk_button_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags text_alignment)} */
    public static native boolean nnk_button_symbol_label(long ctx, int symbol, long text, int text_alignment);

    /** {@code nk_bool nk_button_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_button_symbol_label(ctx.address(), symbol, memAddress(text), text_alignment);
    }

    /** {@code nk_bool nk_button_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_symbol_label(ctx.address(), symbol, textEncoded, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_symbol_text ] ---

    /** {@code nk_bool nk_button_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_int len, nk_flags alignment)} */
    public static native boolean nnk_button_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /** {@code nk_bool nk_button_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_button_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_button_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_label ] ---

    /** {@code nk_bool nk_button_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags text_alignment)} */
    public static native boolean nnk_button_image_label(long ctx, long img, long text, int text_alignment);

    /** {@code nk_bool nk_button_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_button_image_label(ctx.address(), img.address(), memAddress(text), text_alignment);
    }

    /** {@code nk_bool nk_button_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_image_label(ctx.address(), img.address(), textEncoded, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_text ] ---

    /** {@code nk_bool nk_button_image_text(struct nk_context * ctx, struct nk_image img, char const * text, nk_int len, nk_flags alignment)} */
    public static native boolean nnk_button_image_text(long ctx, long img, long text, int len, int alignment);

    /** {@code nk_bool nk_button_image_text(struct nk_context * ctx, struct nk_image img, char const * text, nk_int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_button_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_button_image_text(struct nk_context * ctx, struct nk_image img, char const * text, nk_int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_button_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_text_styled ] ---

    /** {@code nk_bool nk_button_text_styled(struct nk_context * ctx, struct nk_style_button const * style, char const * title, int len)} */
    public static native boolean nnk_button_text_styled(long ctx, long style, long title, int len);

    /** {@code nk_bool nk_button_text_styled(struct nk_context * ctx, struct nk_style_button const * style, char const * title, int len)} */
    @NativeType("nk_bool")
    public static boolean nk_button_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") ByteBuffer title, int len) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_text_styled(ctx.address(), style.address(), memAddress(title), len);
    }

    /** {@code nk_bool nk_button_text_styled(struct nk_context * ctx, struct nk_style_button const * style, char const * title, int len)} */
    @NativeType("nk_bool")
    public static boolean nk_button_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") CharSequence title, int len) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_text_styled(ctx.address(), style.address(), titleEncoded, len);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_label_styled ] ---

    /** {@code nk_bool nk_button_label_styled(struct nk_context * ctx, struct nk_style_button const * style, char const * title)} */
    public static native boolean nnk_button_label_styled(long ctx, long style, long title);

    /** {@code nk_bool nk_button_label_styled(struct nk_context * ctx, struct nk_style_button const * style, char const * title)} */
    @NativeType("nk_bool")
    public static boolean nk_button_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") ByteBuffer title) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_label_styled(ctx.address(), style.address(), memAddress(title));
    }

    /** {@code nk_bool nk_button_label_styled(struct nk_context * ctx, struct nk_style_button const * style, char const * title)} */
    @NativeType("nk_bool")
    public static boolean nk_button_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("char const *") CharSequence title) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_label_styled(ctx.address(), style.address(), titleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_symbol_styled ] ---

    /** {@code nk_bool nk_button_symbol_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol)} */
    public static native boolean nnk_button_symbol_styled(long ctx, long style, int symbol);

    /** {@code nk_bool nk_button_symbol_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol) {
        return nnk_button_symbol_styled(ctx.address(), style.address(), symbol);
    }

    // --- [ nk_button_image_styled ] ---

    /** {@code nk_bool nk_button_image_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img)} */
    public static native boolean nnk_button_image_styled(long ctx, long style, long img);

    /** {@code nk_bool nk_button_image_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img) {
        return nnk_button_image_styled(ctx.address(), style.address(), img.address());
    }

    // --- [ nk_button_symbol_text_styled ] ---

    /** {@code nk_bool nk_button_symbol_text_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol, char const * title, int len, nk_flags alignment)} */
    public static native boolean nnk_button_symbol_text_styled(long ctx, long style, int symbol, long title, int len, int alignment);

    /** {@code nk_bool nk_button_symbol_text_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol, char const * title, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer title, int len, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_symbol_text_styled(ctx.address(), style.address(), symbol, memAddress(title), len, alignment);
    }

    /** {@code nk_bool nk_button_symbol_text_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol, char const * title, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence title, int len, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_symbol_text_styled(ctx.address(), style.address(), symbol, titleEncoded, len, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_symbol_label_styled ] ---

    /** {@code nk_bool nk_button_symbol_label_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol, char const * title, nk_flags text_alignment)} */
    public static native boolean nnk_button_symbol_label_styled(long ctx, long style, int symbol, long title, int text_alignment);

    /** {@code nk_bool nk_button_symbol_label_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol, char const * title, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_symbol_label_styled(ctx.address(), style.address(), symbol, memAddress(title), text_alignment);
    }

    /** {@code nk_bool nk_button_symbol_label_styled(struct nk_context * ctx, struct nk_style_button const * style, enum nk_symbol_type symbol, char const * title, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_symbol_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_symbol_label_styled(ctx.address(), style.address(), symbol, titleEncoded, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_label_styled ] ---

    /** {@code nk_bool nk_button_image_label_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img, char const * title, nk_flags text_alignment)} */
    public static native boolean nnk_button_image_label_styled(long ctx, long style, long img, long title, int text_alignment);

    /** {@code nk_bool nk_button_image_label_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img, char const * title, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_image_label_styled(ctx.address(), style.address(), img.address(), memAddress(title), text_alignment);
    }

    /** {@code nk_bool nk_button_image_label_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img, char const * title, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_label_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_image_label_styled(ctx.address(), style.address(), img.address(), titleEncoded, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_button_image_text_styled ] ---

    /** {@code nk_bool nk_button_image_text_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img, char const * title, int len, nk_flags alignment)} */
    public static native boolean nnk_button_image_text_styled(long ctx, long style, long img, long title, int len, int alignment);

    /** {@code nk_bool nk_button_image_text_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img, char const * title, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer title, int len, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_button_image_text_styled(ctx.address(), style.address(), img.address(), memAddress(title), len, alignment);
    }

    /** {@code nk_bool nk_button_image_text_styled(struct nk_context * ctx, struct nk_style_button const * style, struct nk_image img, char const * title, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_button_image_text_styled(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_button const *") NkStyleButton style, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence title, int len, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_button_image_text_styled(ctx.address(), style.address(), img.address(), titleEncoded, len, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_label ] ---

    /** {@code nk_bool nk_check_label(struct nk_context * ctx, char const * str, nk_bool active)} */
    public static native boolean nnk_check_label(long ctx, long str, boolean active);

    /** {@code nk_bool nk_check_label(struct nk_context * ctx, char const * str, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_check_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_check_label(ctx.address(), memAddress(str), active);
    }

    /** {@code nk_bool nk_check_label(struct nk_context * ctx, char const * str, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_check_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_label(ctx.address(), strEncoded, active);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_text ] ---

    /** {@code nk_bool nk_check_text(struct nk_context * ctx, char const * str, int len, nk_bool active)} */
    public static native boolean nnk_check_text(long ctx, long str, int len, boolean active);

    /** {@code nk_bool nk_check_text(struct nk_context * ctx, char const * str, int len, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_check_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active) {
        return nnk_check_text(ctx.address(), memAddress(str), str.remaining(), active);
    }

    /** {@code nk_bool nk_check_text(struct nk_context * ctx, char const * str, int len, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_check_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_text(ctx.address(), strEncoded, strEncodedLength, active);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_text_align ] ---

    /** {@code nk_bool nk_check_text_align(struct nk_context * ctx, char const * str, int len, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_check_text_align(long ctx, long str, int len, boolean active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_check_text_align(struct nk_context * ctx, char const * str, int len, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_check_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        return nnk_check_text_align(ctx.address(), memAddress(str), str.remaining(), active, widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_check_text_align(struct nk_context * ctx, char const * str, int len, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_check_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_check_text_align(ctx.address(), strEncoded, strEncodedLength, active, widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_check_flags_label ] ---

    /** {@code unsigned int nk_check_flags_label(struct nk_context * ctx, char const * str, unsigned int flags, unsigned int value)} */
    public static native int nnk_check_flags_label(long ctx, long str, int flags, int value);

    /** {@code unsigned int nk_check_flags_label(struct nk_context * ctx, char const * str, unsigned int flags, unsigned int value)} */
    @NativeType("unsigned int")
    public static int nk_check_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_check_flags_label(ctx.address(), memAddress(str), flags, value);
    }

    /** {@code unsigned int nk_check_flags_label(struct nk_context * ctx, char const * str, unsigned int flags, unsigned int value)} */
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

    /** {@code unsigned int nk_check_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int flags, unsigned int value)} */
    public static native int nnk_check_flags_text(long ctx, long str, int len, int flags, int value);

    /** {@code unsigned int nk_check_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int flags, unsigned int value)} */
    @NativeType("unsigned int")
    public static int nk_check_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int value) {
        return nnk_check_flags_text(ctx.address(), memAddress(str), str.remaining(), flags, value);
    }

    /** {@code unsigned int nk_check_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int flags, unsigned int value)} */
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

    /** {@code nk_bool nk_checkbox_label(struct nk_context * ctx, char const * str, nk_bool * active)} */
    public static native boolean nnk_checkbox_label(long ctx, long str, long active);

    /** {@code nk_bool nk_checkbox_label(struct nk_context * ctx, char const * str, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_checkbox_label(ctx.address(), memAddress(str), memAddress(active));
    }

    /** {@code nk_bool nk_checkbox_label(struct nk_context * ctx, char const * str, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_label(ctx.address(), strEncoded, memAddress(active));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_label_align ] ---

    /** {@code nk_bool nk_checkbox_label_align(struct nk_context * ctx, char const * str, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_checkbox_label_align(long ctx, long str, long active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_checkbox_label_align(struct nk_context * ctx, char const * str, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_label_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_checkbox_label_align(ctx.address(), memAddress(str), memAddress(active), widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_checkbox_label_align(struct nk_context * ctx, char const * str, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_label_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_label_align(ctx.address(), strEncoded, memAddress(active), widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_text ] ---

    /** {@code nk_bool nk_checkbox_text(struct nk_context * ctx, char const * str, int len, nk_bool * active)} */
    public static native boolean nnk_checkbox_text(long ctx, long str, int len, long active);

    /** {@code nk_bool nk_checkbox_text(struct nk_context * ctx, char const * str, int len, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_checkbox_text(ctx.address(), memAddress(str), str.remaining(), memAddress(active));
    }

    /** {@code nk_bool nk_checkbox_text(struct nk_context * ctx, char const * str, int len, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_text(ctx.address(), strEncoded, strEncodedLength, memAddress(active));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_text_align ] ---

    /** {@code nk_bool nk_checkbox_text_align(struct nk_context * ctx, char const * str, int len, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_checkbox_text_align(long ctx, long str, int len, long active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_checkbox_text_align(struct nk_context * ctx, char const * str, int len, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_checkbox_text_align(ctx.address(), memAddress(str), str.remaining(), memAddress(active), widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_checkbox_text_align(struct nk_context * ctx, char const * str, int len, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_text_align(ctx.address(), strEncoded, strEncodedLength, memAddress(active), widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_flags_label ] ---

    /** {@code nk_bool nk_checkbox_flags_label(struct nk_context * ctx, char const * str, unsigned int * flags, unsigned int value)} */
    public static native boolean nnk_checkbox_flags_label(long ctx, long str, long flags, int value);

    /** {@code nk_bool nk_checkbox_flags_label(struct nk_context * ctx, char const * str, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            checkNT1(str);
            check(flags, 1);
        }
        return nnk_checkbox_flags_label(ctx.address(), memAddress(str), memAddress(flags), value);
    }

    /** {@code nk_bool nk_checkbox_flags_label(struct nk_context * ctx, char const * str, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_label(ctx.address(), strEncoded, memAddress(flags), value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_checkbox_flags_text ] ---

    /** {@code nk_bool nk_checkbox_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int * flags, unsigned int value)} */
    public static native boolean nnk_checkbox_flags_text(long ctx, long str, int len, long flags, int value);

    /** {@code nk_bool nk_checkbox_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nnk_checkbox_flags_text(ctx.address(), memAddress(str), str.remaining(), memAddress(flags), value);
    }

    /** {@code nk_bool nk_checkbox_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") IntBuffer flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_text(ctx.address(), strEncoded, strEncodedLength, memAddress(flags), value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_radio_label ] ---

    /** {@code nk_bool nk_radio_label(struct nk_context * ctx, char const * str, nk_bool * active)} */
    public static native boolean nnk_radio_label(long ctx, long str, long active);

    /** {@code nk_bool nk_radio_label(struct nk_context * ctx, char const * str, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_radio_label(ctx.address(), memAddress(str), memAddress(active));
    }

    /** {@code nk_bool nk_radio_label(struct nk_context * ctx, char const * str, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_label(ctx.address(), strEncoded, memAddress(active));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_radio_label_align ] ---

    /** {@code nk_bool nk_radio_label_align(struct nk_context * ctx, char const * str, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_radio_label_align(long ctx, long str, long active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_radio_label_align(struct nk_context * ctx, char const * str, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_label_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(str);
            check(active, 1);
        }
        return nnk_radio_label_align(ctx.address(), memAddress(str), memAddress(active), widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_radio_label_align(struct nk_context * ctx, char const * str, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_label_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_label_align(ctx.address(), strEncoded, memAddress(active), widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_radio_text ] ---

    /** {@code nk_bool nk_radio_text(struct nk_context * ctx, char const * str, int len, nk_bool * active)} */
    public static native boolean nnk_radio_text(long ctx, long str, int len, long active);

    /** {@code nk_bool nk_radio_text(struct nk_context * ctx, char const * str, int len, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_radio_text(ctx.address(), memAddress(str), str.remaining(), memAddress(active));
    }

    /** {@code nk_bool nk_radio_text(struct nk_context * ctx, char const * str, int len, nk_bool * active)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_text(ctx.address(), strEncoded, strEncodedLength, memAddress(active));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_radio_text_align ] ---

    /** {@code nk_bool nk_radio_text_align(struct nk_context * ctx, char const * str, int len, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_radio_text_align(long ctx, long str, int len, long active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_radio_text_align(struct nk_context * ctx, char const * str, int len, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            check(active, 1);
        }
        return nnk_radio_text_align(ctx.address(), memAddress(str), str.remaining(), memAddress(active), widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_radio_text_align(struct nk_context * ctx, char const * str, int len, nk_bool * active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_radio_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool *") ByteBuffer active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            check(active, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_radio_text_align(ctx.address(), strEncoded, strEncodedLength, memAddress(active), widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_option_label ] ---

    /** {@code nk_bool nk_option_label(struct nk_context * ctx, char const * str, nk_bool active)} */
    public static native boolean nnk_option_label(long ctx, long str, boolean active);

    /** {@code nk_bool nk_option_label(struct nk_context * ctx, char const * str, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_option_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_option_label(ctx.address(), memAddress(str), active);
    }

    /** {@code nk_bool nk_option_label(struct nk_context * ctx, char const * str, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_option_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_option_label(ctx.address(), strEncoded, active);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_option_label_align ] ---

    /** {@code nk_bool nk_option_label_align(struct nk_context * ctx, char const * str, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_option_label_align(long ctx, long str, boolean active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_option_label_align(struct nk_context * ctx, char const * str, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_option_label_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_option_label_align(ctx.address(), memAddress(str), active, widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_option_label_align(struct nk_context * ctx, char const * str, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_option_label_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_option_label_align(ctx.address(), strEncoded, active, widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_option_text ] ---

    /** {@code nk_bool nk_option_text(struct nk_context * ctx, char const * str, int len, nk_bool active)} */
    public static native boolean nnk_option_text(long ctx, long str, int len, boolean active);

    /** {@code nk_bool nk_option_text(struct nk_context * ctx, char const * str, int len, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_option_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active) {
        return nnk_option_text(ctx.address(), memAddress(str), str.remaining(), active);
    }

    /** {@code nk_bool nk_option_text(struct nk_context * ctx, char const * str, int len, nk_bool active)} */
    @NativeType("nk_bool")
    public static boolean nk_option_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_option_text(ctx.address(), strEncoded, strEncodedLength, active);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_option_text_align ] ---

    /** {@code nk_bool nk_option_text_align(struct nk_context * ctx, char const * str, int len, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    public static native boolean nnk_option_text_align(long ctx, long str, int len, boolean active, int widget_alignment, int text_alignment);

    /** {@code nk_bool nk_option_text_align(struct nk_context * ctx, char const * str, int len, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_option_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_bool") boolean active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        return nnk_option_text_align(ctx.address(), memAddress(str), str.remaining(), active, widget_alignment, text_alignment);
    }

    /** {@code nk_bool nk_option_text_align(struct nk_context * ctx, char const * str, int len, nk_bool active, nk_flags widget_alignment, nk_flags text_alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_option_text_align(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_bool") boolean active, @NativeType("nk_flags") int widget_alignment, @NativeType("nk_flags") int text_alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_option_text_align(ctx.address(), strEncoded, strEncodedLength, active, widget_alignment, text_alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_label ] ---

    /** {@code nk_bool nk_selectable_label(struct nk_context * ctx, char const * str, nk_flags align, nk_bool * value)} */
    public static native boolean nnk_selectable_label(long ctx, long str, int align, long value);

    /** {@code nk_bool nk_selectable_label(struct nk_context * ctx, char const * str, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_label(ctx.address(), memAddress(str), align, memAddress(value));
    }

    /** {@code nk_bool nk_selectable_label(struct nk_context * ctx, char const * str, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_label(ctx.address(), strEncoded, align, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_text ] ---

    /** {@code nk_bool nk_selectable_text(struct nk_context * ctx, char const * str, int len, nk_flags align, nk_bool * value)} */
    public static native boolean nnk_selectable_text(long ctx, long str, int len, int align, long value);

    /** {@code nk_bool nk_selectable_text(struct nk_context * ctx, char const * str, int len, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_text(ctx.address(), memAddress(str), str.remaining(), align, memAddress(value));
    }

    /** {@code nk_bool nk_selectable_text(struct nk_context * ctx, char const * str, int len, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_text(ctx.address(), strEncoded, strEncodedLength, align, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_image_label ] ---

    /** {@code nk_bool nk_selectable_image_label(struct nk_context * ctx, struct nk_image img, char const * str, nk_flags align, nk_bool * value)} */
    public static native boolean nnk_selectable_image_label(long ctx, long img, long str, int align, long value);

    /** {@code nk_bool nk_selectable_image_label(struct nk_context * ctx, struct nk_image img, char const * str, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_image_label(ctx.address(), img.address(), memAddress(str), align, memAddress(value));
    }

    /** {@code nk_bool nk_selectable_image_label(struct nk_context * ctx, struct nk_image img, char const * str, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_image_label(ctx.address(), img.address(), strEncoded, align, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_image_text ] ---

    /** {@code nk_bool nk_selectable_image_text(struct nk_context * ctx, struct nk_image img, char const * str, int len, nk_flags align, nk_bool * value)} */
    public static native boolean nnk_selectable_image_text(long ctx, long img, long str, int len, int align, long value);

    /** {@code nk_bool nk_selectable_image_text(struct nk_context * ctx, struct nk_image img, char const * str, int len, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_image_text(ctx.address(), img.address(), memAddress(str), str.remaining(), align, memAddress(value));
    }

    /** {@code nk_bool nk_selectable_image_text(struct nk_context * ctx, struct nk_image img, char const * str, int len, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_image_text(ctx.address(), img.address(), strEncoded, strEncodedLength, align, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_symbol_label ] ---

    /** {@code nk_bool nk_selectable_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, nk_flags align, nk_bool * value)} */
    public static native boolean nnk_selectable_symbol_label(long ctx, int symbol, long str, int align, long value);

    /** {@code nk_bool nk_selectable_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(str);
            check(value, 1);
        }
        return nnk_selectable_symbol_label(ctx.address(), symbol, memAddress(str), align, memAddress(value));
    }

    /** {@code nk_bool nk_selectable_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_symbol_label(ctx.address(), symbol, strEncoded, align, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_selectable_symbol_text ] ---

    /** {@code nk_bool nk_selectable_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, int len, nk_flags align, nk_bool * value)} */
    public static native boolean nnk_selectable_symbol_text(long ctx, int symbol, long str, int len, int align, long value);

    /** {@code nk_bool nk_selectable_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, int len, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nnk_selectable_symbol_text(ctx.address(), symbol, memAddress(str), str.remaining(), align, memAddress(value));
    }

    /** {@code nk_bool nk_selectable_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, int len, nk_flags align, nk_bool * value)} */
    @NativeType("nk_bool")
    public static boolean nk_selectable_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool *") ByteBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_selectable_symbol_text(ctx.address(), symbol, strEncoded, strEncodedLength, align, memAddress(value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_label ] ---

    /** {@code nk_bool nk_select_label(struct nk_context * ctx, char const * str, nk_flags align, nk_bool value)} */
    public static native boolean nnk_select_label(long ctx, long str, int align, boolean value);

    /** {@code nk_bool nk_select_label(struct nk_context * ctx, char const * str, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_select_label(ctx.address(), memAddress(str), align, value);
    }

    /** {@code nk_bool nk_select_label(struct nk_context * ctx, char const * str, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_label(ctx.address(), strEncoded, align, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_text ] ---

    /** {@code nk_bool nk_select_text(struct nk_context * ctx, char const * str, int len, nk_flags align, nk_bool value)} */
    public static native boolean nnk_select_text(long ctx, long str, int len, int align, boolean value);

    /** {@code nk_bool nk_select_text(struct nk_context * ctx, char const * str, int len, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        return nnk_select_text(ctx.address(), memAddress(str), str.remaining(), align, value);
    }

    /** {@code nk_bool nk_select_text(struct nk_context * ctx, char const * str, int len, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_text(ctx.address(), strEncoded, strEncodedLength, align, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_image_label ] ---

    /** {@code nk_bool nk_select_image_label(struct nk_context * ctx, struct nk_image img, char const * str, nk_flags align, nk_bool value)} */
    public static native boolean nnk_select_image_label(long ctx, long img, long str, int align, boolean value);

    /** {@code nk_bool nk_select_image_label(struct nk_context * ctx, struct nk_image img, char const * str, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_select_image_label(ctx.address(), img.address(), memAddress(str), align, value);
    }

    /** {@code nk_bool nk_select_image_label(struct nk_context * ctx, struct nk_image img, char const * str, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_image_label(ctx.address(), img.address(), strEncoded, align, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_image_text ] ---

    /** {@code nk_bool nk_select_image_text(struct nk_context * ctx, struct nk_image img, char const * str, int len, nk_flags align, nk_bool value)} */
    public static native boolean nnk_select_image_text(long ctx, long img, long str, int len, int align, boolean value);

    /** {@code nk_bool nk_select_image_text(struct nk_context * ctx, struct nk_image img, char const * str, int len, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        return nnk_select_image_text(ctx.address(), img.address(), memAddress(str), str.remaining(), align, value);
    }

    /** {@code nk_bool nk_select_image_text(struct nk_context * ctx, struct nk_image img, char const * str, int len, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_image_text(ctx.address(), img.address(), strEncoded, strEncodedLength, align, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_symbol_label ] ---

    /** {@code nk_bool nk_select_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, nk_flags align, nk_bool value)} */
    public static native boolean nnk_select_symbol_label(long ctx, int symbol, long str, int align, boolean value);

    /** {@code nk_bool nk_select_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_select_symbol_label(ctx.address(), symbol, memAddress(str), align, value);
    }

    /** {@code nk_bool nk_select_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_symbol_label(ctx.address(), symbol, strEncoded, align, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_select_symbol_text ] ---

    /** {@code nk_bool nk_select_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, int len, nk_flags align, nk_bool value)} */
    public static native boolean nnk_select_symbol_text(long ctx, int symbol, long str, int len, int align, boolean value);

    /** {@code nk_bool nk_select_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, int len, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        return nnk_select_symbol_text(ctx.address(), symbol, memAddress(str), str.remaining(), align, value);
    }

    /** {@code nk_bool nk_select_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * str, int len, nk_flags align, nk_bool value)} */
    @NativeType("nk_bool")
    public static boolean nk_select_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence str, @NativeType("nk_flags") int align, @NativeType("nk_bool") boolean value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_select_symbol_text(ctx.address(), symbol, strEncoded, strEncodedLength, align, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_slide_float ] ---

    /** {@code float nk_slide_float(struct nk_context * ctx, float min, float val, float max, float step)} */
    public static native float nnk_slide_float(long ctx, float min, float val, float max, float step);

    /** {@code float nk_slide_float(struct nk_context * ctx, float min, float val, float max, float step)} */
    public static float nk_slide_float(@NativeType("struct nk_context *") NkContext ctx, float min, float val, float max, float step) {
        return nnk_slide_float(ctx.address(), min, val, max, step);
    }

    // --- [ nk_slide_int ] ---

    /** {@code int nk_slide_int(struct nk_context * ctx, int min, int val, int max, int step)} */
    public static native int nnk_slide_int(long ctx, int min, int val, int max, int step);

    /** {@code int nk_slide_int(struct nk_context * ctx, int min, int val, int max, int step)} */
    public static int nk_slide_int(@NativeType("struct nk_context *") NkContext ctx, int min, int val, int max, int step) {
        return nnk_slide_int(ctx.address(), min, val, max, step);
    }

    // --- [ nk_slider_float ] ---

    /** {@code nk_bool nk_slider_float(struct nk_context * ctx, float min, float * val, float max, float step)} */
    public static native boolean nnk_slider_float(long ctx, float min, long val, float max, float step);

    /** {@code nk_bool nk_slider_float(struct nk_context * ctx, float min, float * val, float max, float step)} */
    @NativeType("nk_bool")
    public static boolean nk_slider_float(@NativeType("struct nk_context *") NkContext ctx, float min, @NativeType("float *") FloatBuffer val, float max, float step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_float(ctx.address(), min, memAddress(val), max, step);
    }

    // --- [ nk_slider_int ] ---

    /** {@code nk_bool nk_slider_int(struct nk_context * ctx, int min, int * val, int max, int step)} */
    public static native boolean nnk_slider_int(long ctx, int min, long val, int max, int step);

    /** {@code nk_bool nk_slider_int(struct nk_context * ctx, int min, int * val, int max, int step)} */
    @NativeType("nk_bool")
    public static boolean nk_slider_int(@NativeType("struct nk_context *") NkContext ctx, int min, @NativeType("int *") IntBuffer val, int max, int step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_int(ctx.address(), min, memAddress(val), max, step);
    }

    // --- [ nk_knob_float ] ---

    /** {@code nk_bool nk_knob_float(struct nk_context * ctx, float min, float * val, float max, float step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    public static native boolean nnk_knob_float(long ctx, float min, long val, float max, float step, int zero_direction, float dead_zone_degrees);

    /** {@code nk_bool nk_knob_float(struct nk_context * ctx, float min, float * val, float max, float step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    @NativeType("nk_bool")
    public static boolean nk_knob_float(@NativeType("struct nk_context *") NkContext ctx, float min, @NativeType("float *") FloatBuffer val, float max, float step, @NativeType("enum nk_heading") int zero_direction, float dead_zone_degrees) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_knob_float(ctx.address(), min, memAddress(val), max, step, zero_direction, dead_zone_degrees);
    }

    // --- [ nk_knob_int ] ---

    /** {@code nk_bool nk_knob_int(struct nk_context * ctx, int min, int * val, int max, int step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    public static native boolean nnk_knob_int(long ctx, int min, long val, int max, int step, int zero_direction, float dead_zone_degrees);

    /** {@code nk_bool nk_knob_int(struct nk_context * ctx, int min, int * val, int max, int step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    @NativeType("nk_bool")
    public static boolean nk_knob_int(@NativeType("struct nk_context *") NkContext ctx, int min, @NativeType("int *") IntBuffer val, int max, int step, @NativeType("enum nk_heading") int zero_direction, float dead_zone_degrees) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_knob_int(ctx.address(), min, memAddress(val), max, step, zero_direction, dead_zone_degrees);
    }

    // --- [ nk_progress ] ---

    /** {@code nk_bool nk_progress(struct nk_context * ctx, nk_size * cur, nk_size max, nk_bool modifyable)} */
    public static native boolean nnk_progress(long ctx, long cur, long max, boolean modifyable);

    /** {@code nk_bool nk_progress(struct nk_context * ctx, nk_size * cur, nk_size max, nk_bool modifyable)} */
    @NativeType("nk_bool")
    public static boolean nk_progress(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_size *") PointerBuffer cur, @NativeType("nk_size") long max, @NativeType("nk_bool") boolean modifyable) {
        if (CHECKS) {
            check(cur, 1);
        }
        return nnk_progress(ctx.address(), memAddress(cur), max, modifyable);
    }

    // --- [ nk_prog ] ---

    /** {@code nk_size nk_prog(struct nk_context * ctx, nk_size cur, nk_size max, nk_bool modifyable)} */
    public static native long nnk_prog(long ctx, long cur, long max, boolean modifyable);

    /** {@code nk_size nk_prog(struct nk_context * ctx, nk_size cur, nk_size max, nk_bool modifyable)} */
    @NativeType("nk_size")
    public static long nk_prog(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_size") long cur, @NativeType("nk_size") long max, @NativeType("nk_bool") boolean modifyable) {
        return nnk_prog(ctx.address(), cur, max, modifyable);
    }

    // --- [ nk_color_picker ] ---

    /** {@code struct nk_colorf nk_color_picker(struct nk_context * ctx, struct nk_colorf color, enum nk_color_format fmt)} */
    public static native void nnk_color_picker(long ctx, long color, int fmt);

    /** {@code struct nk_colorf nk_color_picker(struct nk_context * ctx, struct nk_colorf color, enum nk_color_format fmt)} */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_color_picker(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_colorf") NkColorf color, @NativeType("enum nk_color_format") int fmt) {
        nnk_color_picker(ctx.address(), color.address(), fmt);
        return color;
    }

    // --- [ nk_color_pick ] ---

    /** {@code nk_bool nk_color_pick(struct nk_context * ctx, struct nk_colorf * color, enum nk_color_format fmt)} */
    public static native boolean nnk_color_pick(long ctx, long color, int fmt);

    /** {@code nk_bool nk_color_pick(struct nk_context * ctx, struct nk_colorf * color, enum nk_color_format fmt)} */
    @NativeType("nk_bool")
    public static boolean nk_color_pick(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_colorf *") NkColorf color, @NativeType("enum nk_color_format") int fmt) {
        return nnk_color_pick(ctx.address(), color.address(), fmt);
    }

    // --- [ nk_property_int ] ---

    /** {@code void nk_property_int(struct nk_context * ctx, char const * name, int min, int * val, int max, int step, float inc_per_pixel)} */
    public static native void nnk_property_int(long ctx, long name, int min, long val, int max, int step, float inc_per_pixel);

    /** {@code void nk_property_int(struct nk_context * ctx, char const * name, int min, int * val, int max, int step, float inc_per_pixel)} */
    public static void nk_property_int(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, int min, @NativeType("int *") IntBuffer val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_int(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
    }

    /** {@code void nk_property_int(struct nk_context * ctx, char const * name, int min, int * val, int max, int step, float inc_per_pixel)} */
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

    /** {@code void nk_property_float(struct nk_context * ctx, char const * name, float min, float * val, float max, float step, float inc_per_pixel)} */
    public static native void nnk_property_float(long ctx, long name, float min, long val, float max, float step, float inc_per_pixel);

    /** {@code void nk_property_float(struct nk_context * ctx, char const * name, float min, float * val, float max, float step, float inc_per_pixel)} */
    public static void nk_property_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, float min, @NativeType("float *") FloatBuffer val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_float(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
    }

    /** {@code void nk_property_float(struct nk_context * ctx, char const * name, float min, float * val, float max, float step, float inc_per_pixel)} */
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

    /** {@code void nk_property_double(struct nk_context * ctx, char const * name, double min, double * val, double max, double step, float inc_per_pixel)} */
    public static native void nnk_property_double(long ctx, long name, double min, long val, double max, double step, float inc_per_pixel);

    /** {@code void nk_property_double(struct nk_context * ctx, char const * name, double min, double * val, double max, double step, float inc_per_pixel)} */
    public static void nk_property_double(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, double min, @NativeType("double *") DoubleBuffer val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_double(ctx.address(), memAddress(name), min, memAddress(val), max, step, inc_per_pixel);
    }

    /** {@code void nk_property_double(struct nk_context * ctx, char const * name, double min, double * val, double max, double step, float inc_per_pixel)} */
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

    /** {@code int nk_propertyi(struct nk_context * ctx, char const * name, int min, int val, int max, int step, float inc_per_pixel)} */
    public static native int nnk_propertyi(long ctx, long name, int min, int val, int max, int step, float inc_per_pixel);

    /** {@code int nk_propertyi(struct nk_context * ctx, char const * name, int min, int val, int max, int step, float inc_per_pixel)} */
    public static int nk_propertyi(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, int min, int val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_propertyi(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** {@code int nk_propertyi(struct nk_context * ctx, char const * name, int min, int val, int max, int step, float inc_per_pixel)} */
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

    /** {@code float nk_propertyf(struct nk_context * ctx, char const * name, float min, float val, float max, float step, float inc_per_pixel)} */
    public static native float nnk_propertyf(long ctx, long name, float min, float val, float max, float step, float inc_per_pixel);

    /** {@code float nk_propertyf(struct nk_context * ctx, char const * name, float min, float val, float max, float step, float inc_per_pixel)} */
    public static float nk_propertyf(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, float min, float val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_propertyf(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** {@code float nk_propertyf(struct nk_context * ctx, char const * name, float min, float val, float max, float step, float inc_per_pixel)} */
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

    /** {@code double nk_propertyd(struct nk_context * ctx, char const * name, double min, double val, double max, double step, float inc_per_pixel)} */
    public static native double nnk_propertyd(long ctx, long name, double min, double val, double max, double step, float inc_per_pixel);

    /** {@code double nk_propertyd(struct nk_context * ctx, char const * name, double min, double val, double max, double step, float inc_per_pixel)} */
    public static double nk_propertyd(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, double min, double val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nnk_propertyd(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** {@code double nk_propertyd(struct nk_context * ctx, char const * name, double min, double val, double max, double step, float inc_per_pixel)} */
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

    /** {@code void nk_edit_focus(struct nk_context * ctx, nk_flags flags)} */
    public static native void nnk_edit_focus(long ctx, int flags);

    /** {@code void nk_edit_focus(struct nk_context * ctx, nk_flags flags)} */
    public static void nk_edit_focus(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags) {
        nnk_edit_focus(ctx.address(), flags);
    }

    // --- [ nk_edit_unfocus ] ---

    /** {@code void nk_edit_unfocus(struct nk_context * ctx)} */
    public static native void nnk_edit_unfocus(long ctx);

    /** {@code void nk_edit_unfocus(struct nk_context * ctx)} */
    public static void nk_edit_unfocus(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_edit_unfocus(ctx.address());
    }

    // --- [ nk_edit_string ] ---

    /** {@code nk_flags nk_edit_string(struct nk_context * ctx, nk_flags flags, char * memory, int * len, int max, nk_plugin_filter filter)} */
    public static native int nnk_edit_string(long ctx, int flags, long memory, long len, int max, long filter);

    /** {@code nk_flags nk_edit_string(struct nk_context * ctx, nk_flags flags, char * memory, int * len, int max, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") ByteBuffer memory, @NativeType("int *") IntBuffer len, int max, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
        if (CHECKS) {
            checkNT1(memory);
            check(len, 1);
        }
        return nnk_edit_string(ctx.address(), flags, memAddress(memory), memAddress(len), max, memAddressSafe(filter));
    }

    /** {@code nk_flags nk_edit_string(struct nk_context * ctx, nk_flags flags, char * memory, int * len, int max, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") CharSequence memory, @NativeType("int *") IntBuffer len, int max, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
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

    /** {@code nk_flags nk_edit_buffer(struct nk_context * ctx, nk_flags flags, struct nk_text_edit * edit, nk_plugin_filter filter)} */
    public static native int nnk_edit_buffer(long ctx, int flags, long edit, long filter);

    /** {@code nk_flags nk_edit_buffer(struct nk_context * ctx, nk_flags flags, struct nk_text_edit * edit, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_buffer(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("struct nk_text_edit *") NkTextEdit edit, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
        return nnk_edit_buffer(ctx.address(), flags, edit.address(), memAddressSafe(filter));
    }

    // --- [ nk_edit_string_zero_terminated ] ---

    /** {@code nk_flags nk_edit_string_zero_terminated(struct nk_context * ctx, nk_flags flags, char * buffer, int max, nk_plugin_filter filter)} */
    public static native int nnk_edit_string_zero_terminated(long ctx, int flags, long buffer, int max, long filter);

    /** {@code nk_flags nk_edit_string_zero_terminated(struct nk_context * ctx, nk_flags flags, char * buffer, int max, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_string_zero_terminated(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") ByteBuffer buffer, int max, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
        if (CHECKS) {
            checkNT1(buffer);
        }
        return nnk_edit_string_zero_terminated(ctx.address(), flags, memAddress(buffer), max, memAddressSafe(filter));
    }

    /** {@code nk_flags nk_edit_string_zero_terminated(struct nk_context * ctx, nk_flags flags, char * buffer, int max, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_string_zero_terminated(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") CharSequence buffer, int max, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
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

    /** {@code nk_bool nk_chart_begin(struct nk_context * ctx, enum nk_chart_type type, int num, float min, float max)} */
    public static native boolean nnk_chart_begin(long ctx, int type, int num, float min, float max);

    /** {@code nk_bool nk_chart_begin(struct nk_context * ctx, enum nk_chart_type type, int num, float min, float max)} */
    @NativeType("nk_bool")
    public static boolean nk_chart_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, int num, float min, float max) {
        return nnk_chart_begin(ctx.address(), type, num, min, max);
    }

    // --- [ nk_chart_begin_colored ] ---

    /** {@code nk_bool nk_chart_begin_colored(struct nk_context * ctx, enum nk_chart_type type, struct nk_color color, struct nk_color active, int num, float min, float max)} */
    public static native boolean nnk_chart_begin_colored(long ctx, int type, long color, long active, int num, float min, float max);

    /** {@code nk_bool nk_chart_begin_colored(struct nk_context * ctx, enum nk_chart_type type, struct nk_color color, struct nk_color active, int num, float min, float max)} */
    @NativeType("nk_bool")
    public static boolean nk_chart_begin_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("struct nk_color") NkColor color, @NativeType("struct nk_color") NkColor active, int num, float min, float max) {
        return nnk_chart_begin_colored(ctx.address(), type, color.address(), active.address(), num, min, max);
    }

    // --- [ nk_chart_add_slot ] ---

    /** {@code void nk_chart_add_slot(struct nk_context * ctx, enum nk_chart_type type, int count, float min_value, float max_value)} */
    public static native void nnk_chart_add_slot(long ctx, int type, int count, float min_value, float max_value);

    /** {@code void nk_chart_add_slot(struct nk_context * ctx, enum nk_chart_type type, int count, float min_value, float max_value)} */
    public static void nk_chart_add_slot(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, int count, float min_value, float max_value) {
        nnk_chart_add_slot(ctx.address(), type, count, min_value, max_value);
    }

    // --- [ nk_chart_add_slot_colored ] ---

    /** {@code void nk_chart_add_slot_colored(struct nk_context * ctx, enum nk_chart_type type, struct nk_color color, struct nk_color active, int count, float min_value, float max_value)} */
    public static native void nnk_chart_add_slot_colored(long ctx, int type, long color, long active, int count, float min_value, float max_value);

    /** {@code void nk_chart_add_slot_colored(struct nk_context * ctx, enum nk_chart_type type, struct nk_color color, struct nk_color active, int count, float min_value, float max_value)} */
    public static void nk_chart_add_slot_colored(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("struct nk_color") NkColor color, @NativeType("struct nk_color") NkColor active, int count, float min_value, float max_value) {
        nnk_chart_add_slot_colored(ctx.address(), type, color.address(), active.address(), count, min_value, max_value);
    }

    // --- [ nk_chart_push ] ---

    /** {@code nk_flags nk_chart_push(struct nk_context * ctx, float value)} */
    public static native int nnk_chart_push(long ctx, float value);

    /** {@code nk_flags nk_chart_push(struct nk_context * ctx, float value)} */
    @NativeType("nk_flags")
    public static int nk_chart_push(@NativeType("struct nk_context *") NkContext ctx, float value) {
        return nnk_chart_push(ctx.address(), value);
    }

    // --- [ nk_chart_push_slot ] ---

    /** {@code nk_flags nk_chart_push_slot(struct nk_context * ctx, float value, int slot)} */
    public static native int nnk_chart_push_slot(long ctx, float value, int slot);

    /** {@code nk_flags nk_chart_push_slot(struct nk_context * ctx, float value, int slot)} */
    @NativeType("nk_flags")
    public static int nk_chart_push_slot(@NativeType("struct nk_context *") NkContext ctx, float value, int slot) {
        return nnk_chart_push_slot(ctx.address(), value, slot);
    }

    // --- [ nk_chart_end ] ---

    /** {@code void nk_chart_end(struct nk_context * ctx)} */
    public static native void nnk_chart_end(long ctx);

    /** {@code void nk_chart_end(struct nk_context * ctx)} */
    public static void nk_chart_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_chart_end(ctx.address());
    }

    // --- [ nk_plot ] ---

    /** {@code void nk_plot(struct nk_context * ctx, enum nk_chart_type type, float const * values, int count, int offset)} */
    public static native void nnk_plot(long ctx, int type, long values, int count, int offset);

    /** {@code void nk_plot(struct nk_context * ctx, enum nk_chart_type type, float const * values, int count, int offset)} */
    public static void nk_plot(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("float const *") FloatBuffer values, int count, int offset) {
        if (CHECKS) {
            check(values, offset + count);
        }
        nnk_plot(ctx.address(), type, memAddress(values), count, offset);
    }

    // --- [ nk_plot_function ] ---

    /** {@code void nk_plot_function(struct nk_context * ctx, enum nk_chart_type type, void * userdata, nk_value_getter value_getter, int count, int offset)} */
    public static native void nnk_plot_function(long ctx, int type, long userdata, long value_getter, int count, int offset);

    /** {@code void nk_plot_function(struct nk_context * ctx, enum nk_chart_type type, void * userdata, nk_value_getter value_getter, int count, int offset)} */
    public static void nk_plot_function(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("void *") long userdata, @NativeType("nk_value_getter") NkValueGetterI value_getter, int count, int offset) {
        if (CHECKS) {
            check(userdata);
        }
        nnk_plot_function(ctx.address(), type, userdata, value_getter.address(), count, offset);
    }

    // --- [ nk_popup_begin ] ---

    /** {@code nk_bool nk_popup_begin(struct nk_context * ctx, enum nk_popup_type type, char const * title, nk_flags flags, struct nk_rect rect)} */
    public static native boolean nnk_popup_begin(long ctx, int type, long title, int flags, long rect);

    /** {@code nk_bool nk_popup_begin(struct nk_context * ctx, enum nk_popup_type type, char const * title, nk_flags flags, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_popup_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_popup_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags, @NativeType("struct nk_rect") NkRect rect) {
        if (CHECKS) {
            checkNT1(title);
        }
        return nnk_popup_begin(ctx.address(), type, memAddress(title), flags, rect.address());
    }

    /** {@code nk_bool nk_popup_begin(struct nk_context * ctx, enum nk_popup_type type, char const * title, nk_flags flags, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_popup_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_popup_type") int type, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags, @NativeType("struct nk_rect") NkRect rect) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_popup_begin(ctx.address(), type, titleEncoded, flags, rect.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_popup_close ] ---

    /** {@code void nk_popup_close(struct nk_context * ctx)} */
    public static native void nnk_popup_close(long ctx);

    /** {@code void nk_popup_close(struct nk_context * ctx)} */
    public static void nk_popup_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_popup_close(ctx.address());
    }

    // --- [ nk_popup_end ] ---

    /** {@code void nk_popup_end(struct nk_context * ctx)} */
    public static native void nnk_popup_end(long ctx);

    /** {@code void nk_popup_end(struct nk_context * ctx)} */
    public static void nk_popup_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_popup_end(ctx.address());
    }

    // --- [ nk_popup_get_scroll ] ---

    /** {@code void nk_popup_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static native void nnk_popup_get_scroll(long ctx, long offset_x, long offset_y);

    /** {@code void nk_popup_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static void nk_popup_get_scroll(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("nk_uint *") @Nullable IntBuffer offset_x, @NativeType("nk_uint *") @Nullable IntBuffer offset_y) {
        if (CHECKS) {
            checkSafe(offset_x, 1);
            checkSafe(offset_y, 1);
        }
        nnk_popup_get_scroll(ctx.address(), memAddressSafe(offset_x), memAddressSafe(offset_y));
    }

    // --- [ nk_popup_set_scroll ] ---

    /** {@code void nk_popup_set_scroll(struct nk_context * ctx, nk_uint offset_x, nk_uint offset_y)} */
    public static native void nnk_popup_set_scroll(long ctx, int offset_x, int offset_y);

    /** {@code void nk_popup_set_scroll(struct nk_context * ctx, nk_uint offset_x, nk_uint offset_y)} */
    public static void nk_popup_set_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint") int offset_x, @NativeType("nk_uint") int offset_y) {
        nnk_popup_set_scroll(ctx.address(), offset_x, offset_y);
    }

    // --- [ nk_combo ] ---

    /** {@code int nk_combo(struct nk_context * ctx, char const * const * items, int count, int selected, int item_height, struct nk_vec2 size)} */
    public static native int nnk_combo(long ctx, long items, int count, int selected, int item_height, long size);

    /** {@code int nk_combo(struct nk_context * ctx, char const * const * items, int count, int selected, int item_height, struct nk_vec2 size)} */
    public static int nk_combo(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const * const *") PointerBuffer items, int selected, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo(ctx.address(), memAddress(items), items.remaining(), selected, item_height, size.address());
    }

    // --- [ nk_combo_separator ] ---

    /** {@code int nk_combo_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static native int nnk_combo_separator(long ctx, long items_separated_by_separator, int separator, int selected, int count, int item_height, long size);

    /** {@code int nk_combo_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static int nk_combo_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_separator, int separator, int selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_separator);
        }
        return nnk_combo_separator(ctx.address(), memAddress(items_separated_by_separator), separator, selected, count, item_height, size.address());
    }

    /** {@code int nk_combo_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static int nk_combo_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_separator, int separator, int selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_separator, true);
            long items_separated_by_separatorEncoded = stack.getPointerAddress();
            return nnk_combo_separator(ctx.address(), items_separated_by_separatorEncoded, separator, selected, count, item_height, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_string ] ---

    /** {@code int nk_combo_string(struct nk_context * ctx, char const * items_separated_by_zeros, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static native int nnk_combo_string(long ctx, long items_separated_by_zeros, int selected, int count, int item_height, long size);

    /** {@code int nk_combo_string(struct nk_context * ctx, char const * items_separated_by_zeros, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static int nk_combo_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_zeros, int selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_zeros);
        }
        return nnk_combo_string(ctx.address(), memAddress(items_separated_by_zeros), selected, count, item_height, size.address());
    }

    /** {@code int nk_combo_string(struct nk_context * ctx, char const * items_separated_by_zeros, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static int nk_combo_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence items_separated_by_zeros, int selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(items_separated_by_zeros, true);
            long items_separated_by_zerosEncoded = stack.getPointerAddress();
            return nnk_combo_string(ctx.address(), items_separated_by_zerosEncoded, selected, count, item_height, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_callback ] ---

    /** {@code int nk_combo_callback(struct nk_context * ctx, nk_item_getter item_getter, void * userdata, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static native int nnk_combo_callback(long ctx, long item_getter, long userdata, int selected, int count, int item_height, long size);

    /** {@code int nk_combo_callback(struct nk_context * ctx, nk_item_getter item_getter, void * userdata, int selected, int count, int item_height, struct nk_vec2 size)} */
    public static int nk_combo_callback(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_item_getter") NkItemGetterI item_getter, @NativeType("void *") long userdata, int selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(userdata);
        }
        return nnk_combo_callback(ctx.address(), item_getter.address(), userdata, selected, count, item_height, size.address());
    }

    // --- [ nk_combobox ] ---

    /** {@code void nk_combobox(struct nk_context * ctx, char const * const * items, int count, int * selected, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox(long ctx, long items, int count, long selected, int item_height, long size);

    /** {@code void nk_combobox(struct nk_context * ctx, char const * const * items, int count, int * selected, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const * const *") PointerBuffer items, @NativeType("int *") IntBuffer selected, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        nnk_combobox(ctx.address(), memAddress(items), items.remaining(), memAddress(selected), item_height, size.address());
    }

    // --- [ nk_combobox_string ] ---

    /** {@code void nk_combobox_string(struct nk_context * ctx, char const * items_separated_by_zeros, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox_string(long ctx, long items_separated_by_zeros, long selected, int count, int item_height, long size);

    /** {@code void nk_combobox_string(struct nk_context * ctx, char const * items_separated_by_zeros, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_zeros, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_zeros);
            check(selected, 1);
        }
        nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zeros), memAddress(selected), count, item_height, size.address());
    }

    /** {@code void nk_combobox_string(struct nk_context * ctx, char const * items_separated_by_zeros, int * selected, int count, int item_height, struct nk_vec2 size)} */
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

    /** {@code void nk_combobox_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox_separator(long ctx, long items_separated_by_separator, int separator, long selected, int count, int item_height, long size);

    /** {@code void nk_combobox_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_separator, int separator, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_separator);
            check(selected, 1);
        }
        nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separator), separator, memAddress(selected), count, item_height, size.address());
    }

    /** {@code void nk_combobox_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int * selected, int count, int item_height, struct nk_vec2 size)} */
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

    /** {@code void nk_combobox_callback(struct nk_context * ctx, nk_item_getter item_getter, void * userdata, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox_callback(long ctx, long item_getter, long userdata, long selected, int count, int item_height, long size);

    /** {@code void nk_combobox_callback(struct nk_context * ctx, nk_item_getter item_getter, void * userdata, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox_callback(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_item_getter") NkItemGetterI item_getter, @NativeType("void *") long userdata, @NativeType("int *") IntBuffer selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(userdata);
            check(selected, 1);
        }
        nnk_combobox_callback(ctx.address(), item_getter.address(), userdata, memAddress(selected), count, item_height, size.address());
    }

    // --- [ nk_combo_begin_text ] ---

    /** {@code nk_bool nk_combo_begin_text(struct nk_context * ctx, char const * selected, int len, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_text(long ctx, long selected, int len, long size);

    /** {@code nk_bool nk_combo_begin_text(struct nk_context * ctx, char const * selected, int len, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_text(ctx.address(), memAddress(selected), selected.remaining(), size.address());
    }

    /** {@code nk_bool nk_combo_begin_text(struct nk_context * ctx, char const * selected, int len, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int selectedEncodedLength = stack.nUTF8(selected, false);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_text(ctx.address(), selectedEncoded, selectedEncodedLength, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_label ] ---

    /** {@code nk_bool nk_combo_begin_label(struct nk_context * ctx, char const * selected, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_label(long ctx, long selected, long size);

    /** {@code nk_bool nk_combo_begin_label(struct nk_context * ctx, char const * selected, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(selected);
        }
        return nnk_combo_begin_label(ctx.address(), memAddress(selected), size.address());
    }

    /** {@code nk_bool nk_combo_begin_label(struct nk_context * ctx, char const * selected, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(selected, true);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_label(ctx.address(), selectedEncoded, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_color ] ---

    /** {@code nk_bool nk_combo_begin_color(struct nk_context * ctx, struct nk_color color, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_color(long ctx, long color, long size);

    /** {@code nk_bool nk_combo_begin_color(struct nk_context * ctx, struct nk_color color, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color") NkColor color, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_color(ctx.address(), color.address(), size.address());
    }

    // --- [ nk_combo_begin_symbol ] ---

    /** {@code nk_bool nk_combo_begin_symbol(struct nk_context * ctx, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_symbol(long ctx, int symbol, long size);

    /** {@code nk_bool nk_combo_begin_symbol(struct nk_context * ctx, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_symbol(ctx.address(), symbol, size.address());
    }

    // --- [ nk_combo_begin_symbol_label ] ---

    /** {@code nk_bool nk_combo_begin_symbol_label(struct nk_context * ctx, char const * selected, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_symbol_label(long ctx, long selected, int symbol, long size);

    /** {@code nk_bool nk_combo_begin_symbol_label(struct nk_context * ctx, char const * selected, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(selected);
        }
        return nnk_combo_begin_symbol_label(ctx.address(), memAddress(selected), symbol, size.address());
    }

    /** {@code nk_bool nk_combo_begin_symbol_label(struct nk_context * ctx, char const * selected, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(selected, true);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_symbol_label(ctx.address(), selectedEncoded, symbol, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_symbol_text ] ---

    /** {@code nk_bool nk_combo_begin_symbol_text(struct nk_context * ctx, char const * selected, int len, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_symbol_text(long ctx, long selected, int len, int symbol, long size);

    /** {@code nk_bool nk_combo_begin_symbol_text(struct nk_context * ctx, char const * selected, int len, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_symbol_text(ctx.address(), memAddress(selected), selected.remaining(), symbol, size.address());
    }

    /** {@code nk_bool nk_combo_begin_symbol_text(struct nk_context * ctx, char const * selected, int len, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int selectedEncodedLength = stack.nUTF8(selected, false);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_symbol_text(ctx.address(), selectedEncoded, selectedEncodedLength, symbol, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_image ] ---

    /** {@code nk_bool nk_combo_begin_image(struct nk_context * ctx, struct nk_image img, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_image(long ctx, long img, long size);

    /** {@code nk_bool nk_combo_begin_image(struct nk_context * ctx, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_image(ctx.address(), img.address(), size.address());
    }

    // --- [ nk_combo_begin_image_label ] ---

    /** {@code nk_bool nk_combo_begin_image_label(struct nk_context * ctx, char const * selected, struct nk_image img, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_image_label(long ctx, long selected, long img, long size);

    /** {@code nk_bool nk_combo_begin_image_label(struct nk_context * ctx, char const * selected, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(selected);
        }
        return nnk_combo_begin_image_label(ctx.address(), memAddress(selected), img.address(), size.address());
    }

    /** {@code nk_bool nk_combo_begin_image_label(struct nk_context * ctx, char const * selected, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(selected, true);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_image_label(ctx.address(), selectedEncoded, img.address(), size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_begin_image_text ] ---

    /** {@code nk_bool nk_combo_begin_image_text(struct nk_context * ctx, char const * selected, int len, struct nk_image img, struct nk_vec2 size)} */
    public static native boolean nnk_combo_begin_image_text(long ctx, long selected, int len, long img, long size);

    /** {@code nk_bool nk_combo_begin_image_text(struct nk_context * ctx, char const * selected, int len, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_combo_begin_image_text(ctx.address(), memAddress(selected), selected.remaining(), img.address(), size.address());
    }

    /** {@code nk_bool nk_combo_begin_image_text(struct nk_context * ctx, char const * selected, int len, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence selected, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int selectedEncodedLength = stack.nUTF8(selected, false);
            long selectedEncoded = stack.getPointerAddress();
            return nnk_combo_begin_image_text(ctx.address(), selectedEncoded, selectedEncodedLength, img.address(), size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_label ] ---

    /** {@code nk_bool nk_combo_item_label(struct nk_context * ctx, char const * text, nk_flags alignment)} */
    public static native boolean nnk_combo_item_label(long ctx, long text, int alignment);

    /** {@code nk_bool nk_combo_item_label(struct nk_context * ctx, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_combo_item_label(ctx.address(), memAddress(text), alignment);
    }

    /** {@code nk_bool nk_combo_item_label(struct nk_context * ctx, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_label(ctx.address(), textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_text ] ---

    /** {@code nk_bool nk_combo_item_text(struct nk_context * ctx, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_combo_item_text(long ctx, long text, int len, int alignment);

    /** {@code nk_bool nk_combo_item_text(struct nk_context * ctx, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_combo_item_text(ctx.address(), memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_combo_item_text(struct nk_context * ctx, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_text(ctx.address(), textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_image_label ] ---

    /** {@code nk_bool nk_combo_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    public static native boolean nnk_combo_item_image_label(long ctx, long img, long text, int alignment);

    /** {@code nk_bool nk_combo_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_combo_item_image_label(ctx.address(), img.address(), memAddress(text), alignment);
    }

    /** {@code nk_bool nk_combo_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_image_label(ctx.address(), img.address(), textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_image_text ] ---

    /** {@code nk_bool nk_combo_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_combo_item_image_text(long ctx, long img, long text, int len, int alignment);

    /** {@code nk_bool nk_combo_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_combo_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_combo_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_symbol_label ] ---

    /** {@code nk_bool nk_combo_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    public static native boolean nnk_combo_item_symbol_label(long ctx, int symbol, long text, int alignment);

    /** {@code nk_bool nk_combo_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_combo_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment);
    }

    /** {@code nk_bool nk_combo_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_symbol_label(ctx.address(), symbol, textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_item_symbol_text ] ---

    /** {@code nk_bool nk_combo_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_combo_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /** {@code nk_bool nk_combo_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_combo_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_combo_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_combo_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_combo_item_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_combo_close ] ---

    /** {@code void nk_combo_close(struct nk_context * ctx)} */
    public static native void nnk_combo_close(long ctx);

    /** {@code void nk_combo_close(struct nk_context * ctx)} */
    public static void nk_combo_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_combo_close(ctx.address());
    }

    // --- [ nk_combo_end ] ---

    /** {@code void nk_combo_end(struct nk_context * ctx)} */
    public static native void nnk_combo_end(long ctx);

    /** {@code void nk_combo_end(struct nk_context * ctx)} */
    public static void nk_combo_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_combo_end(ctx.address());
    }

    // --- [ nk_contextual_begin ] ---

    /** {@code nk_bool nk_contextual_begin(struct nk_context * ctx, nk_flags flags, struct nk_vec2 size, struct nk_rect trigger_bounds)} */
    public static native boolean nnk_contextual_begin(long ctx, int flags, long size, long trigger_bounds);

    /** {@code nk_bool nk_contextual_begin(struct nk_context * ctx, nk_flags flags, struct nk_vec2 size, struct nk_rect trigger_bounds)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("struct nk_vec2") NkVec2 size, @NativeType("struct nk_rect") NkRect trigger_bounds) {
        return nnk_contextual_begin(ctx.address(), flags, size.address(), trigger_bounds.address());
    }

    // --- [ nk_contextual_item_text ] ---

    /** {@code nk_bool nk_contextual_item_text(struct nk_context * ctx, char const * text, int len, nk_flags align)} */
    public static native boolean nnk_contextual_item_text(long ctx, long text, int len, int align);

    /** {@code nk_bool nk_contextual_item_text(struct nk_context * ctx, char const * text, int len, nk_flags align)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align) {
        return nnk_contextual_item_text(ctx.address(), memAddress(text), text.remaining(), align);
    }

    /** {@code nk_bool nk_contextual_item_text(struct nk_context * ctx, char const * text, int len, nk_flags align)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_text(ctx.address(), textEncoded, textEncodedLength, align);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_label ] ---

    /** {@code nk_bool nk_contextual_item_label(struct nk_context * ctx, char const * text, nk_flags align)} */
    public static native boolean nnk_contextual_item_label(long ctx, long text, int align);

    /** {@code nk_bool nk_contextual_item_label(struct nk_context * ctx, char const * text, nk_flags align)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_contextual_item_label(ctx.address(), memAddress(text), align);
    }

    /** {@code nk_bool nk_contextual_item_label(struct nk_context * ctx, char const * text, nk_flags align)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_label(ctx.address(), textEncoded, align);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_image_label ] ---

    /** {@code nk_bool nk_contextual_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    public static native boolean nnk_contextual_item_image_label(long ctx, long img, long text, int alignment);

    /** {@code nk_bool nk_contextual_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_contextual_item_image_label(ctx.address(), img.address(), memAddress(text), alignment);
    }

    /** {@code nk_bool nk_contextual_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_image_label(ctx.address(), img.address(), textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_image_text ] ---

    /** {@code nk_bool nk_contextual_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_contextual_item_image_text(long ctx, long img, long text, int len, int alignment);

    /** {@code nk_bool nk_contextual_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_contextual_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_contextual_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_symbol_label ] ---

    /** {@code nk_bool nk_contextual_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    public static native boolean nnk_contextual_item_symbol_label(long ctx, int symbol, long text, int alignment);

    /** {@code nk_bool nk_contextual_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_contextual_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment);
    }

    /** {@code nk_bool nk_contextual_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_symbol_label(ctx.address(), symbol, textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_item_symbol_text ] ---

    /** {@code nk_bool nk_contextual_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_contextual_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /** {@code nk_bool nk_contextual_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_contextual_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_contextual_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_contextual_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_contextual_item_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_contextual_close ] ---

    /** {@code void nk_contextual_close(struct nk_context * ctx)} */
    public static native void nnk_contextual_close(long ctx);

    /** {@code void nk_contextual_close(struct nk_context * ctx)} */
    public static void nk_contextual_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_contextual_close(ctx.address());
    }

    // --- [ nk_contextual_end ] ---

    /** {@code void nk_contextual_end(struct nk_context * ctx)} */
    public static native void nnk_contextual_end(long ctx);

    /** {@code void nk_contextual_end(struct nk_context * ctx)} */
    public static void nk_contextual_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_contextual_end(ctx.address());
    }

    // --- [ nk_tooltip ] ---

    /** {@code void nk_tooltip(struct nk_context * ctx, char const * text)} */
    public static native void nnk_tooltip(long ctx, long text);

    /** {@code void nk_tooltip(struct nk_context * ctx, char const * text)} */
    public static void nk_tooltip(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text) {
        if (CHECKS) {
            checkNT1(text);
        }
        nnk_tooltip(ctx.address(), memAddress(text));
    }

    /** {@code void nk_tooltip(struct nk_context * ctx, char const * text)} */
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

    /** {@code nk_bool nk_tooltip_begin(struct nk_context * ctx, float width)} */
    public static native boolean nnk_tooltip_begin(long ctx, float width);

    /** {@code nk_bool nk_tooltip_begin(struct nk_context * ctx, float width)} */
    @NativeType("nk_bool")
    public static boolean nk_tooltip_begin(@NativeType("struct nk_context *") NkContext ctx, float width) {
        return nnk_tooltip_begin(ctx.address(), width);
    }

    // --- [ nk_tooltip_end ] ---

    /** {@code void nk_tooltip_end(struct nk_context * ctx)} */
    public static native void nnk_tooltip_end(long ctx);

    /** {@code void nk_tooltip_end(struct nk_context * ctx)} */
    public static void nk_tooltip_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_tooltip_end(ctx.address());
    }

    // --- [ nk_menubar_begin ] ---

    /** {@code void nk_menubar_begin(struct nk_context * ctx)} */
    public static native void nnk_menubar_begin(long ctx);

    /** {@code void nk_menubar_begin(struct nk_context * ctx)} */
    public static void nk_menubar_begin(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menubar_begin(ctx.address());
    }

    // --- [ nk_menubar_end ] ---

    /** {@code void nk_menubar_end(struct nk_context * ctx)} */
    public static native void nnk_menubar_end(long ctx);

    /** {@code void nk_menubar_end(struct nk_context * ctx)} */
    public static void nk_menubar_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menubar_end(ctx.address());
    }

    // --- [ nk_menu_begin_text ] ---

    /** {@code nk_bool nk_menu_begin_text(struct nk_context * ctx, char const * text, int len, nk_flags align, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_text(long ctx, long text, int len, int align, long size);

    /** {@code nk_bool nk_menu_begin_text(struct nk_context * ctx, char const * text, int len, nk_flags align, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_menu_begin_text(ctx.address(), memAddress(text), text.remaining(), align, size.address());
    }

    /** {@code nk_bool nk_menu_begin_text(struct nk_context * ctx, char const * text, int len, nk_flags align, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_text(ctx.address(), textEncoded, textEncodedLength, align, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_label ] ---

    /** {@code nk_bool nk_menu_begin_label(struct nk_context * ctx, char const * text, nk_flags align, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_label(long ctx, long text, int align, long size);

    /** {@code nk_bool nk_menu_begin_label(struct nk_context * ctx, char const * text, nk_flags align, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_label(ctx.address(), memAddress(text), align, size.address());
    }

    /** {@code nk_bool nk_menu_begin_label(struct nk_context * ctx, char const * text, nk_flags align, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_label(ctx.address(), textEncoded, align, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_image ] ---

    /** {@code nk_bool nk_menu_begin_image(struct nk_context * ctx, char const * text, struct nk_image img, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_image(long ctx, long text, long img, long size);

    /** {@code nk_bool nk_menu_begin_image(struct nk_context * ctx, char const * text, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_image(ctx.address(), memAddress(text), img.address(), size.address());
    }

    /** {@code nk_bool nk_menu_begin_image(struct nk_context * ctx, char const * text, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_image(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_image(ctx.address(), textEncoded, img.address(), size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_image_text ] ---

    /** {@code nk_bool nk_menu_begin_image_text(struct nk_context * ctx, char const * text, int len, nk_flags align, struct nk_image img, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_image_text(long ctx, long text, int len, int align, long img, long size);

    /** {@code nk_bool nk_menu_begin_image_text(struct nk_context * ctx, char const * text, int len, nk_flags align, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_menu_begin_image_text(ctx.address(), memAddress(text), text.remaining(), align, img.address(), size.address());
    }

    /** {@code nk_bool nk_menu_begin_image_text(struct nk_context * ctx, char const * text, int len, nk_flags align, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_image_text(ctx.address(), textEncoded, textEncodedLength, align, img.address(), size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_image_label ] ---

    /** {@code nk_bool nk_menu_begin_image_label(struct nk_context * ctx, char const * text, nk_flags align, struct nk_image img, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_image_label(long ctx, long text, int align, long img, long size);

    /** {@code nk_bool nk_menu_begin_image_label(struct nk_context * ctx, char const * text, nk_flags align, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_image_label(ctx.address(), memAddress(text), align, img.address(), size.address());
    }

    /** {@code nk_bool nk_menu_begin_image_label(struct nk_context * ctx, char const * text, nk_flags align, struct nk_image img, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("struct nk_image") NkImage img, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_image_label(ctx.address(), textEncoded, align, img.address(), size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_symbol ] ---

    /** {@code nk_bool nk_menu_begin_symbol(struct nk_context * ctx, char const * text, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_symbol(long ctx, long text, int symbol, long size);

    /** {@code nk_bool nk_menu_begin_symbol(struct nk_context * ctx, char const * text, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_symbol(ctx.address(), memAddress(text), symbol, size.address());
    }

    /** {@code nk_bool nk_menu_begin_symbol(struct nk_context * ctx, char const * text, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_symbol(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_symbol(ctx.address(), textEncoded, symbol, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_symbol_text ] ---

    /** {@code nk_bool nk_menu_begin_symbol_text(struct nk_context * ctx, char const * text, int len, nk_flags align, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_symbol_text(long ctx, long text, int len, int align, int symbol, long size);

    /** {@code nk_bool nk_menu_begin_symbol_text(struct nk_context * ctx, char const * text, int len, nk_flags align, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        return nnk_menu_begin_symbol_text(ctx.address(), memAddress(text), text.remaining(), align, symbol, size.address());
    }

    /** {@code nk_bool nk_menu_begin_symbol_text(struct nk_context * ctx, char const * text, int len, nk_flags align, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_symbol_text(ctx.address(), textEncoded, textEncodedLength, align, symbol, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_begin_symbol_label ] ---

    /** {@code nk_bool nk_menu_begin_symbol_label(struct nk_context * ctx, char const * text, nk_flags align, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    public static native boolean nnk_menu_begin_symbol_label(long ctx, long text, int align, int symbol, long size);

    /** {@code nk_bool nk_menu_begin_symbol_label(struct nk_context * ctx, char const * text, nk_flags align, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_begin_symbol_label(ctx.address(), memAddress(text), align, symbol, size.address());
    }

    /** {@code nk_bool nk_menu_begin_symbol_label(struct nk_context * ctx, char const * text, nk_flags align, enum nk_symbol_type symbol, struct nk_vec2 size)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_begin_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align, @NativeType("enum nk_symbol_type") int symbol, @NativeType("struct nk_vec2") NkVec2 size) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_begin_symbol_label(ctx.address(), textEncoded, align, symbol, size.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_text ] ---

    /** {@code nk_bool nk_menu_item_text(struct nk_context * ctx, char const * text, int len, nk_flags align)} */
    public static native boolean nnk_menu_item_text(long ctx, long text, int len, int align);

    /** {@code nk_bool nk_menu_item_text(struct nk_context * ctx, char const * text, int len, nk_flags align)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int align) {
        return nnk_menu_item_text(ctx.address(), memAddress(text), text.remaining(), align);
    }

    /** {@code nk_bool nk_menu_item_text(struct nk_context * ctx, char const * text, int len, nk_flags align)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int align) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_text(ctx.address(), textEncoded, textEncodedLength, align);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_label ] ---

    /** {@code nk_bool nk_menu_item_label(struct nk_context * ctx, char const * text, nk_flags alignment)} */
    public static native boolean nnk_menu_item_label(long ctx, long text, int alignment);

    /** {@code nk_bool nk_menu_item_label(struct nk_context * ctx, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_item_label(ctx.address(), memAddress(text), alignment);
    }

    /** {@code nk_bool nk_menu_item_label(struct nk_context * ctx, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_label(ctx.address(), textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_image_label ] ---

    /** {@code nk_bool nk_menu_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    public static native boolean nnk_menu_item_image_label(long ctx, long img, long text, int alignment);

    /** {@code nk_bool nk_menu_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_item_image_label(ctx.address(), img.address(), memAddress(text), alignment);
    }

    /** {@code nk_bool nk_menu_item_image_label(struct nk_context * ctx, struct nk_image img, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_image_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_image_label(ctx.address(), img.address(), textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_image_text ] ---

    /** {@code nk_bool nk_menu_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_menu_item_image_text(long ctx, long img, long text, int len, int alignment);

    /** {@code nk_bool nk_menu_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_menu_item_image_text(ctx.address(), img.address(), memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_menu_item_image_text(struct nk_context * ctx, struct nk_image img, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_image_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_image") NkImage img, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_image_text(ctx.address(), img.address(), textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_symbol_text ] ---

    /** {@code nk_bool nk_menu_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    public static native boolean nnk_menu_item_symbol_text(long ctx, int symbol, long text, int len, int alignment);

    /** {@code nk_bool nk_menu_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        return nnk_menu_item_symbol_text(ctx.address(), symbol, memAddress(text), text.remaining(), alignment);
    }

    /** {@code nk_bool nk_menu_item_symbol_text(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, int len, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_symbol_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_symbol_text(ctx.address(), symbol, textEncoded, textEncodedLength, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_item_symbol_label ] ---

    /** {@code nk_bool nk_menu_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    public static native boolean nnk_menu_item_symbol_label(long ctx, int symbol, long text, int alignment);

    /** {@code nk_bool nk_menu_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") ByteBuffer text, @NativeType("nk_flags") int alignment) {
        if (CHECKS) {
            checkNT1(text);
        }
        return nnk_menu_item_symbol_label(ctx.address(), symbol, memAddress(text), alignment);
    }

    /** {@code nk_bool nk_menu_item_symbol_label(struct nk_context * ctx, enum nk_symbol_type symbol, char const * text, nk_flags alignment)} */
    @NativeType("nk_bool")
    public static boolean nk_menu_item_symbol_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_symbol_type") int symbol, @NativeType("char const *") CharSequence text, @NativeType("nk_flags") int alignment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(text, true);
            long textEncoded = stack.getPointerAddress();
            return nnk_menu_item_symbol_label(ctx.address(), symbol, textEncoded, alignment);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_menu_close ] ---

    /** {@code void nk_menu_close(struct nk_context * ctx)} */
    public static native void nnk_menu_close(long ctx);

    /** {@code void nk_menu_close(struct nk_context * ctx)} */
    public static void nk_menu_close(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menu_close(ctx.address());
    }

    // --- [ nk_menu_end ] ---

    /** {@code void nk_menu_end(struct nk_context * ctx)} */
    public static native void nnk_menu_end(long ctx);

    /** {@code void nk_menu_end(struct nk_context * ctx)} */
    public static void nk_menu_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_menu_end(ctx.address());
    }

    // --- [ nk_convert ] ---

    /** {@code nk_flags nk_convert(struct nk_context * ctx, struct nk_buffer * cmds, struct nk_buffer * vertices, struct nk_buffer * elements, struct nk_convert_config const * config)} */
    public static native int nnk_convert(long ctx, long cmds, long vertices, long elements, long config);

    /** {@code nk_flags nk_convert(struct nk_context * ctx, struct nk_buffer * cmds, struct nk_buffer * vertices, struct nk_buffer * elements, struct nk_convert_config const * config)} */
    @NativeType("nk_flags")
    public static int nk_convert(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_buffer *") NkBuffer cmds, @NativeType("struct nk_buffer *") NkBuffer vertices, @NativeType("struct nk_buffer *") NkBuffer elements, @NativeType("struct nk_convert_config const *") NkConvertConfig config) {
        if (CHECKS) {
            NkConvertConfig.validate(config.address());
        }
        return nnk_convert(ctx.address(), cmds.address(), vertices.address(), elements.address(), config.address());
    }

    // --- [ nk_input_begin ] ---

    /** {@code void nk_input_begin(struct nk_context * ctx)} */
    public static native void nnk_input_begin(long ctx);

    /** {@code void nk_input_begin(struct nk_context * ctx)} */
    public static void nk_input_begin(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_input_begin(ctx.address());
    }

    // --- [ nk_input_motion ] ---

    /** {@code void nk_input_motion(struct nk_context * ctx, int x, int y)} */
    public static native void nnk_input_motion(long ctx, int x, int y);

    /** {@code void nk_input_motion(struct nk_context * ctx, int x, int y)} */
    public static void nk_input_motion(@NativeType("struct nk_context *") NkContext ctx, int x, int y) {
        nnk_input_motion(ctx.address(), x, y);
    }

    // --- [ nk_input_key ] ---

    /** {@code void nk_input_key(struct nk_context * ctx, enum nk_keys key, nk_bool down)} */
    public static native void nnk_input_key(long ctx, int key, boolean down);

    /** {@code void nk_input_key(struct nk_context * ctx, enum nk_keys key, nk_bool down)} */
    public static void nk_input_key(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_keys") int key, @NativeType("nk_bool") boolean down) {
        nnk_input_key(ctx.address(), key, down);
    }

    // --- [ nk_input_button ] ---

    /** {@code void nk_input_button(struct nk_context * ctx, enum nk_buttons id, int x, int y, nk_bool down)} */
    public static native void nnk_input_button(long ctx, int id, int x, int y, boolean down);

    /** {@code void nk_input_button(struct nk_context * ctx, enum nk_buttons id, int x, int y, nk_bool down)} */
    public static void nk_input_button(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_buttons") int id, int x, int y, @NativeType("nk_bool") boolean down) {
        nnk_input_button(ctx.address(), id, x, y, down);
    }

    // --- [ nk_input_scroll ] ---

    /** {@code void nk_input_scroll(struct nk_context * ctx, struct nk_vec2 val)} */
    public static native void nnk_input_scroll(long ctx, long val);

    /** {@code void nk_input_scroll(struct nk_context * ctx, struct nk_vec2 val)} */
    public static void nk_input_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 val) {
        nnk_input_scroll(ctx.address(), val.address());
    }

    // --- [ nk_input_char ] ---

    /** {@code void nk_input_char(struct nk_context * ctx, char c)} */
    public static native void nnk_input_char(long ctx, byte c);

    /** {@code void nk_input_char(struct nk_context * ctx, char c)} */
    public static void nk_input_char(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char") byte c) {
        nnk_input_char(ctx.address(), c);
    }

    // --- [ nk_input_glyph ] ---

    /** {@code void nk_input_glyph(struct nk_context * ctx, char * glyph)} */
    public static native void nnk_input_glyph(long ctx, long glyph);

    /** {@code void nk_input_glyph(struct nk_context * ctx, char * glyph)} */
    public static void nk_input_glyph(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char *") ByteBuffer glyph) {
        if (CHECKS) {
            check(glyph, 4);
        }
        nnk_input_glyph(ctx.address(), memAddress(glyph));
    }

    // --- [ nk_input_unicode ] ---

    /** {@code void nk_input_unicode(struct nk_context * ctx, nk_rune unicode)} */
    public static native void nnk_input_unicode(long ctx, int unicode);

    /** {@code void nk_input_unicode(struct nk_context * ctx, nk_rune unicode)} */
    public static void nk_input_unicode(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_rune") int unicode) {
        nnk_input_unicode(ctx.address(), unicode);
    }

    // --- [ nk_input_end ] ---

    /** {@code void nk_input_end(struct nk_context * ctx)} */
    public static native void nnk_input_end(long ctx);

    /** {@code void nk_input_end(struct nk_context * ctx)} */
    public static void nk_input_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_input_end(ctx.address());
    }

    // --- [ nk_style_default ] ---

    /** {@code void nk_style_default(struct nk_context * ctx)} */
    public static native void nnk_style_default(long ctx);

    /** {@code void nk_style_default(struct nk_context * ctx)} */
    public static void nk_style_default(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_style_default(ctx.address());
    }

    // --- [ nk_style_from_table ] ---

    /** {@code void nk_style_from_table(struct nk_context * ctx, struct nk_color const * table)} */
    public static native void nnk_style_from_table(long ctx, long table);

    /** {@code void nk_style_from_table(struct nk_context * ctx, struct nk_color const * table)} */
    public static void nk_style_from_table(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color const *") NkColor.Buffer table) {
        if (CHECKS) {
            check(table, NK_COLOR_COUNT);
        }
        nnk_style_from_table(ctx.address(), table.address());
    }

    // --- [ nk_style_load_cursor ] ---

    /** {@code void nk_style_load_cursor(struct nk_context * ctx, enum nk_style_cursor style, struct nk_cursor * cursor)} */
    public static native void nnk_style_load_cursor(long ctx, int style, long cursor);

    /** {@code void nk_style_load_cursor(struct nk_context * ctx, enum nk_style_cursor style, struct nk_cursor * cursor)} */
    public static void nk_style_load_cursor(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_style_cursor") int style, @NativeType("struct nk_cursor *") NkCursor cursor) {
        nnk_style_load_cursor(ctx.address(), style, cursor.address());
    }

    // --- [ nk_style_load_all_cursors ] ---

    /** {@code void nk_style_load_all_cursors(struct nk_context * ctx, struct nk_cursor const * cursors)} */
    public static native void nnk_style_load_all_cursors(long ctx, long cursors);

    /** {@code void nk_style_load_all_cursors(struct nk_context * ctx, struct nk_cursor const * cursors)} */
    public static void nk_style_load_all_cursors(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_cursor const *") NkCursor.Buffer cursors) {
        if (CHECKS) {
            check(cursors, NK_CURSOR_COUNT);
        }
        nnk_style_load_all_cursors(ctx.address(), cursors.address());
    }

    // --- [ nk_style_get_color_by_name ] ---

    /** {@code char const * nk_style_get_color_by_name(enum nk_style_colors c)} */
    public static native long nnk_style_get_color_by_name(int c);

    /** {@code char const * nk_style_get_color_by_name(enum nk_style_colors c)} */
    @NativeType("char const *")
    public static @Nullable String nk_style_get_color_by_name(@NativeType("enum nk_style_colors") int c) {
        long __result = nnk_style_get_color_by_name(c);
        return memUTF8Safe(__result);
    }

    // --- [ nk_style_set_font ] ---

    /** {@code void nk_style_set_font(struct nk_context * ctx, struct nk_user_font const * font)} */
    public static native void nnk_style_set_font(long ctx, long font);

    /** {@code void nk_style_set_font(struct nk_context * ctx, struct nk_user_font const * font)} */
    public static void nk_style_set_font(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_user_font const *") NkUserFont font) {
        nnk_style_set_font(ctx.address(), font.address());
    }

    // --- [ nk_style_set_cursor ] ---

    /** {@code nk_bool nk_style_set_cursor(struct nk_context * ctx, enum nk_style_cursor style)} */
    public static native boolean nnk_style_set_cursor(long ctx, int style);

    /** {@code nk_bool nk_style_set_cursor(struct nk_context * ctx, enum nk_style_cursor style)} */
    @NativeType("nk_bool")
    public static boolean nk_style_set_cursor(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_style_cursor") int style) {
        return nnk_style_set_cursor(ctx.address(), style);
    }

    // --- [ nk_style_show_cursor ] ---

    /** {@code void nk_style_show_cursor(struct nk_context * ctx)} */
    public static native void nnk_style_show_cursor(long ctx);

    /** {@code void nk_style_show_cursor(struct nk_context * ctx)} */
    public static void nk_style_show_cursor(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_style_show_cursor(ctx.address());
    }

    // --- [ nk_style_hide_cursor ] ---

    /** {@code void nk_style_hide_cursor(struct nk_context * ctx)} */
    public static native void nnk_style_hide_cursor(long ctx);

    /** {@code void nk_style_hide_cursor(struct nk_context * ctx)} */
    public static void nk_style_hide_cursor(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_style_hide_cursor(ctx.address());
    }

    // --- [ nk_style_push_font ] ---

    /** {@code nk_bool nk_style_push_font(struct nk_context * ctx, struct nk_user_font const * font)} */
    public static native boolean nnk_style_push_font(long ctx, long font);

    /** {@code nk_bool nk_style_push_font(struct nk_context * ctx, struct nk_user_font const * font)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_font(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_user_font const *") NkUserFont font) {
        return nnk_style_push_font(ctx.address(), font.address());
    }

    // --- [ nk_style_push_float ] ---

    /** {@code nk_bool nk_style_push_float(struct nk_context * ctx, float * address, float value)} */
    public static native boolean nnk_style_push_float(long ctx, long address, float value);

    /** {@code nk_bool nk_style_push_float(struct nk_context * ctx, float * address, float value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("float *") FloatBuffer address, float value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_float(ctx.address(), memAddress(address), value);
    }

    // --- [ nk_style_push_vec2 ] ---

    /** {@code nk_bool nk_style_push_vec2(struct nk_context * ctx, struct nk_vec2 * address, struct nk_vec2 value)} */
    public static native boolean nnk_style_push_vec2(long ctx, long address, long value);

    /** {@code nk_bool nk_style_push_vec2(struct nk_context * ctx, struct nk_vec2 * address, struct nk_vec2 value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_vec2(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2 *") NkVec2 address, @NativeType("struct nk_vec2") NkVec2 value) {
        return nnk_style_push_vec2(ctx.address(), address.address(), value.address());
    }

    // --- [ nk_style_push_style_item ] ---

    /** {@code nk_bool nk_style_push_style_item(struct nk_context * ctx, struct nk_style_item * address, struct nk_style_item value)} */
    public static native boolean nnk_style_push_style_item(long ctx, long address, long value);

    /** {@code nk_bool nk_style_push_style_item(struct nk_context * ctx, struct nk_style_item * address, struct nk_style_item value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_style_item(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_style_item *") NkStyleItem address, @NativeType("struct nk_style_item") NkStyleItem value) {
        return nnk_style_push_style_item(ctx.address(), address.address(), value.address());
    }

    // --- [ nk_style_push_flags ] ---

    /** {@code nk_bool nk_style_push_flags(struct nk_context * ctx, nk_flags * address, nk_flags value)} */
    public static native boolean nnk_style_push_flags(long ctx, long address, int value);

    /** {@code nk_bool nk_style_push_flags(struct nk_context * ctx, nk_flags * address, nk_flags value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_flags(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags *") IntBuffer address, @NativeType("nk_flags") int value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_flags(ctx.address(), memAddress(address), value);
    }

    // --- [ nk_style_push_color ] ---

    /** {@code nk_bool nk_style_push_color(struct nk_context * ctx, struct nk_color * address, struct nk_color value)} */
    public static native boolean nnk_style_push_color(long ctx, long address, long value);

    /** {@code nk_bool nk_style_push_color(struct nk_context * ctx, struct nk_color * address, struct nk_color value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_color(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_color *") NkColor address, @NativeType("struct nk_color") NkColor value) {
        return nnk_style_push_color(ctx.address(), address.address(), value.address());
    }

    // --- [ nk_style_pop_font ] ---

    /** {@code nk_bool nk_style_pop_font(struct nk_context * ctx)} */
    public static native boolean nnk_style_pop_font(long ctx);

    /** {@code nk_bool nk_style_pop_font(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_style_pop_font(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_font(ctx.address());
    }

    // --- [ nk_style_pop_float ] ---

    /** {@code nk_bool nk_style_pop_float(struct nk_context * ctx)} */
    public static native boolean nnk_style_pop_float(long ctx);

    /** {@code nk_bool nk_style_pop_float(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_style_pop_float(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_float(ctx.address());
    }

    // --- [ nk_style_pop_vec2 ] ---

    /** {@code nk_bool nk_style_pop_vec2(struct nk_context * ctx)} */
    public static native boolean nnk_style_pop_vec2(long ctx);

    /** {@code nk_bool nk_style_pop_vec2(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_style_pop_vec2(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_vec2(ctx.address());
    }

    // --- [ nk_style_pop_style_item ] ---

    /** {@code nk_bool nk_style_pop_style_item(struct nk_context * ctx)} */
    public static native boolean nnk_style_pop_style_item(long ctx);

    /** {@code nk_bool nk_style_pop_style_item(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_style_pop_style_item(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_style_item(ctx.address());
    }

    // --- [ nk_style_pop_flags ] ---

    /** {@code nk_bool nk_style_pop_flags(struct nk_context * ctx)} */
    public static native boolean nnk_style_pop_flags(long ctx);

    /** {@code nk_bool nk_style_pop_flags(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_style_pop_flags(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_flags(ctx.address());
    }

    // --- [ nk_style_pop_color ] ---

    /** {@code nk_bool nk_style_pop_color(struct nk_context * ctx)} */
    public static native boolean nnk_style_pop_color(long ctx);

    /** {@code nk_bool nk_style_pop_color(struct nk_context * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_style_pop_color(@NativeType("struct nk_context *") NkContext ctx) {
        return nnk_style_pop_color(ctx.address());
    }

    // --- [ nk_widget_bounds ] ---

    /** {@code struct nk_rect nk_widget_bounds(struct nk_context const * ctx)} */
    public static native void nnk_widget_bounds(long ctx, long __result);

    /** {@code struct nk_rect nk_widget_bounds(struct nk_context const * ctx)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_widget_bounds(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_rect") NkRect __result) {
        nnk_widget_bounds(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_widget_position ] ---

    /** {@code struct nk_vec2 nk_widget_position(struct nk_context const * ctx)} */
    public static native void nnk_widget_position(long ctx, long __result);

    /** {@code struct nk_vec2 nk_widget_position(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_widget_position(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_widget_position(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_widget_size ] ---

    /** {@code struct nk_vec2 nk_widget_size(struct nk_context const * ctx)} */
    public static native void nnk_widget_size(long ctx, long __result);

    /** {@code struct nk_vec2 nk_widget_size(struct nk_context const * ctx)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_widget_size(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_widget_size(ctx.address(), __result.address());
        return __result;
    }

    // --- [ nk_widget_width ] ---

    /** {@code float nk_widget_width(struct nk_context const * ctx)} */
    public static native float nnk_widget_width(long ctx);

    /** {@code float nk_widget_width(struct nk_context const * ctx)} */
    public static float nk_widget_width(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_widget_width(ctx.address());
    }

    // --- [ nk_widget_height ] ---

    /** {@code float nk_widget_height(struct nk_context const * ctx)} */
    public static native float nnk_widget_height(long ctx);

    /** {@code float nk_widget_height(struct nk_context const * ctx)} */
    public static float nk_widget_height(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_widget_height(ctx.address());
    }

    // --- [ nk_widget_is_hovered ] ---

    /** {@code nk_bool nk_widget_is_hovered(struct nk_context const * ctx)} */
    public static native boolean nnk_widget_is_hovered(long ctx);

    /** {@code nk_bool nk_widget_is_hovered(struct nk_context const * ctx)} */
    @NativeType("nk_bool")
    public static boolean nk_widget_is_hovered(@NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_widget_is_hovered(ctx.address());
    }

    // --- [ nk_widget_is_mouse_clicked ] ---

    /** {@code nk_bool nk_widget_is_mouse_clicked(struct nk_context const * ctx, enum nk_buttons btn)} */
    public static native boolean nnk_widget_is_mouse_clicked(long ctx, int btn);

    /** {@code nk_bool nk_widget_is_mouse_clicked(struct nk_context const * ctx, enum nk_buttons btn)} */
    @NativeType("nk_bool")
    public static boolean nk_widget_is_mouse_clicked(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("enum nk_buttons") int btn) {
        return nnk_widget_is_mouse_clicked(ctx.address(), btn);
    }

    // --- [ nk_widget_has_mouse_click_down ] ---

    /** {@code nk_bool nk_widget_has_mouse_click_down(struct nk_context const * ctx, enum nk_buttons btn, nk_bool down)} */
    public static native boolean nnk_widget_has_mouse_click_down(long ctx, int btn, boolean down);

    /** {@code nk_bool nk_widget_has_mouse_click_down(struct nk_context const * ctx, enum nk_buttons btn, nk_bool down)} */
    @NativeType("nk_bool")
    public static boolean nk_widget_has_mouse_click_down(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("enum nk_buttons") int btn, @NativeType("nk_bool") boolean down) {
        return nnk_widget_has_mouse_click_down(ctx.address(), btn, down);
    }

    // --- [ nk_spacing ] ---

    /** {@code void nk_spacing(struct nk_context * ctx, int cols)} */
    public static native void nnk_spacing(long ctx, int cols);

    /** {@code void nk_spacing(struct nk_context * ctx, int cols)} */
    public static void nk_spacing(@NativeType("struct nk_context *") NkContext ctx, int cols) {
        nnk_spacing(ctx.address(), cols);
    }

    // --- [ nk_widget_disable_begin ] ---

    /** {@code void nk_widget_disable_begin(struct nk_context * ctx)} */
    public static native void nnk_widget_disable_begin(long ctx);

    /** {@code void nk_widget_disable_begin(struct nk_context * ctx)} */
    public static void nk_widget_disable_begin(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_widget_disable_begin(ctx.address());
    }

    // --- [ nk_widget_disable_end ] ---

    /** {@code void nk_widget_disable_end(struct nk_context * ctx)} */
    public static native void nnk_widget_disable_end(long ctx);

    /** {@code void nk_widget_disable_end(struct nk_context * ctx)} */
    public static void nk_widget_disable_end(@NativeType("struct nk_context *") NkContext ctx) {
        nnk_widget_disable_end(ctx.address());
    }

    // --- [ nk_widget ] ---

    /** {@code enum nk_widget_layout_states nk_widget(struct nk_rect * bounds, struct nk_context const * ctx)} */
    public static native int nnk_widget(long bounds, long ctx);

    /** {@code enum nk_widget_layout_states nk_widget(struct nk_rect * bounds, struct nk_context const * ctx)} */
    @NativeType("enum nk_widget_layout_states")
    public static int nk_widget(@NativeType("struct nk_rect *") NkRect bounds, @NativeType("struct nk_context const *") NkContext ctx) {
        return nnk_widget(bounds.address(), ctx.address());
    }

    // --- [ nk_widget_fitting ] ---

    /** {@code enum nk_widget_layout_states nk_widget_fitting(struct nk_rect * bounds, struct nk_context * ctx, struct nk_vec2 item_padding)} */
    public static native int nnk_widget_fitting(long bounds, long ctx, long item_padding);

    /** {@code enum nk_widget_layout_states nk_widget_fitting(struct nk_rect * bounds, struct nk_context * ctx, struct nk_vec2 item_padding)} */
    @NativeType("enum nk_widget_layout_states")
    public static int nk_widget_fitting(@NativeType("struct nk_rect *") NkRect bounds, @NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_vec2") NkVec2 item_padding) {
        return nnk_widget_fitting(bounds.address(), ctx.address(), item_padding.address());
    }

    // --- [ nk_rgb ] ---

    /** {@code struct nk_color nk_rgb(int r, int g, int b)} */
    public static native void nnk_rgb(int r, int g, int b, long __result);

    /** {@code struct nk_color nk_rgb(int r, int g, int b)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb(int r, int g, int b, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb(r, g, b, __result.address());
        return __result;
    }

    // --- [ nk_rgb_iv ] ---

    /** {@code struct nk_color nk_rgb_iv(int const * rgb)} */
    public static native void nnk_rgb_iv(long rgb, long __result);

    /** {@code struct nk_color nk_rgb_iv(int const * rgb)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_iv(@NativeType("int const *") IntBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_iv(memAddress(rgb), __result.address());
        return __result;
    }

    // --- [ nk_rgb_bv ] ---

    /** {@code struct nk_color nk_rgb_bv(nk_byte const * rgb)} */
    public static native void nnk_rgb_bv(long rgb, long __result);

    /** {@code struct nk_color nk_rgb_bv(nk_byte const * rgb)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_bv(@NativeType("nk_byte const *") ByteBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_bv(memAddress(rgb), __result.address());
        return __result;
    }

    // --- [ nk_rgb_f ] ---

    /** {@code struct nk_color nk_rgb_f(float r, float g, float b)} */
    public static native void nnk_rgb_f(float r, float g, float b, long __result);

    /** {@code struct nk_color nk_rgb_f(float r, float g, float b)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_f(float r, float g, float b, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb_f(r, g, b, __result.address());
        return __result;
    }

    // --- [ nk_rgb_fv ] ---

    /** {@code struct nk_color nk_rgb_fv(float const * rgb)} */
    public static native void nnk_rgb_fv(long rgb, long __result);

    /** {@code struct nk_color nk_rgb_fv(float const * rgb)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_fv(@NativeType("float const *") FloatBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_fv(memAddress(rgb), __result.address());
        return __result;
    }

    // --- [ nk_rgb_cf ] ---

    /** {@code struct nk_color nk_rgb_cf(struct nk_colorf c)} */
    public static native void nnk_rgb_cf(long c, long __result);

    /** {@code struct nk_color nk_rgb_cf(struct nk_colorf c)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_cf(@NativeType("struct nk_colorf") NkColorf c, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb_cf(c.address(), __result.address());
        return __result;
    }

    // --- [ nk_rgb_hex ] ---

    /** {@code struct nk_color nk_rgb_hex(char const * rgb)} */
    public static native void nnk_rgb_hex(long rgb, long __result);

    /** {@code struct nk_color nk_rgb_hex(char const * rgb)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_hex(@NativeType("char const *") ByteBuffer rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 6);
        }
        nnk_rgb_hex(memAddress(rgb), __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_rgb_hex(char const * rgb)} */
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

    // --- [ nk_rgb_factor ] ---

    /** {@code struct nk_color nk_rgb_factor(struct nk_color col, float factor)} */
    public static native void nnk_rgb_factor(long col, float factor, long __result);

    /** {@code struct nk_color nk_rgb_factor(struct nk_color col, float factor)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_factor(@NativeType("struct nk_color") NkColor col, float factor, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgb_factor(col.address(), factor, __result.address());
        return __result;
    }

    // --- [ nk_rgba ] ---

    /** {@code struct nk_color nk_rgba(int r, int g, int b, int a)} */
    public static native void nnk_rgba(int r, int g, int b, int a, long __result);

    /** {@code struct nk_color nk_rgba(int r, int g, int b, int a)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba(int r, int g, int b, int a, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nk_rgba_u32 ] ---

    /** {@code struct nk_color nk_rgba_u32(nk_uint in)} */
    public static native void nnk_rgba_u32(int in, long __result);

    /** {@code struct nk_color nk_rgba_u32(nk_uint in)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_u32(@NativeType("nk_uint") int in, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba_u32(in, __result.address());
        return __result;
    }

    // --- [ nk_rgba_iv ] ---

    /** {@code struct nk_color nk_rgba_iv(int const * rgba)} */
    public static native void nnk_rgba_iv(long rgba, long __result);

    /** {@code struct nk_color nk_rgba_iv(int const * rgba)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_iv(@NativeType("int const *") IntBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_iv(memAddress(rgba), __result.address());
        return __result;
    }

    // --- [ nk_rgba_bv ] ---

    /** {@code struct nk_color nk_rgba_bv(nk_byte const * rgba)} */
    public static native void nnk_rgba_bv(long rgba, long __result);

    /** {@code struct nk_color nk_rgba_bv(nk_byte const * rgba)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_bv(@NativeType("nk_byte const *") ByteBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_bv(memAddress(rgba), __result.address());
        return __result;
    }

    // --- [ nk_rgba_f ] ---

    /** {@code struct nk_color nk_rgba_f(float r, float g, float b, float a)} */
    public static native void nnk_rgba_f(float r, float g, float b, float a, long __result);

    /** {@code struct nk_color nk_rgba_f(float r, float g, float b, float a)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_f(float r, float g, float b, float a, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba_f(r, g, b, a, __result.address());
        return __result;
    }

    // --- [ nk_rgba_fv ] ---

    /** {@code struct nk_color nk_rgba_fv(float const * rgba)} */
    public static native void nnk_rgba_fv(long rgba, long __result);

    /** {@code struct nk_color nk_rgba_fv(float const * rgba)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_fv(@NativeType("float const *") FloatBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_fv(memAddress(rgba), __result.address());
        return __result;
    }

    // --- [ nk_rgba_cf ] ---

    /** {@code struct nk_color nk_rgba_cf(struct nk_colorf c)} */
    public static native void nnk_rgba_cf(long c, long __result);

    /** {@code struct nk_color nk_rgba_cf(struct nk_colorf c)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_cf(@NativeType("struct nk_colorf") NkColorf c, @NativeType("struct nk_color") NkColor __result) {
        nnk_rgba_cf(c.address(), __result.address());
        return __result;
    }

    // --- [ nk_rgba_hex ] ---

    /** {@code struct nk_color nk_rgba_hex(char const * rgba)} */
    public static native void nnk_rgba_hex(long rgba, long __result);

    /** {@code struct nk_color nk_rgba_hex(char const * rgba)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_hex(@NativeType("char const *") ByteBuffer rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 8);
        }
        nnk_rgba_hex(memAddress(rgba), __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_rgba_hex(char const * rgba)} */
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

    /** {@code struct nk_colorf nk_hsva_colorf(float h, float s, float v, float a)} */
    public static native void nnk_hsva_colorf(float h, float s, float v, float a, long __result);

    /** {@code struct nk_colorf nk_hsva_colorf(float h, float s, float v, float a)} */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_hsva_colorf(float h, float s, float v, float a, @NativeType("struct nk_colorf") NkColorf __result) {
        nnk_hsva_colorf(h, s, v, a, __result.address());
        return __result;
    }

    // --- [ nk_hsva_colorfv ] ---

    /** {@code struct nk_colorf nk_hsva_colorfv(float const * c)} */
    public static native void nnk_hsva_colorfv(long c, long __result);

    /** {@code struct nk_colorf nk_hsva_colorfv(float const * c)} */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_hsva_colorfv(@NativeType("float const *") FloatBuffer c, @NativeType("struct nk_colorf") NkColorf __result) {
        if (CHECKS) {
            check(c, 4);
        }
        nnk_hsva_colorfv(memAddress(c), __result.address());
        return __result;
    }

    // --- [ nk_colorf_hsva_f ] ---

    /** {@code void nk_colorf_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_colorf in)} */
    public static native void nnk_colorf_hsva_f(long out_h, long out_s, long out_v, long out_a, long in);

    /** {@code void nk_colorf_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_colorf in)} */
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

    /** {@code void nk_colorf_hsva_fv(float * hsva, struct nk_colorf in)} */
    public static native void nnk_colorf_hsva_fv(long hsva, long in);

    /** {@code void nk_colorf_hsva_fv(float * hsva, struct nk_colorf in)} */
    public static void nk_colorf_hsva_fv(@NativeType("float *") FloatBuffer hsva, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_colorf_hsva_fv(memAddress(hsva), in.address());
    }

    // --- [ nk_hsv ] ---

    /** {@code struct nk_color nk_hsv(int h, int s, int v)} */
    public static native void nnk_hsv(int h, int s, int v, long __result);

    /** {@code struct nk_color nk_hsv(int h, int s, int v)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv(int h, int s, int v, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsv(h, s, v, __result.address());
        return __result;
    }

    // --- [ nk_hsv_iv ] ---

    /** {@code struct nk_color nk_hsv_iv(int const * hsv)} */
    public static native void nnk_hsv_iv(long hsv, long __result);

    /** {@code struct nk_color nk_hsv_iv(int const * hsv)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_iv(@NativeType("int const *") IntBuffer hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_iv(memAddress(hsv), __result.address());
        return __result;
    }

    // --- [ nk_hsv_bv ] ---

    /** {@code struct nk_color nk_hsv_bv(nk_byte const * hsv)} */
    public static native void nnk_hsv_bv(long hsv, long __result);

    /** {@code struct nk_color nk_hsv_bv(nk_byte const * hsv)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_bv(@NativeType("nk_byte const *") ByteBuffer hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_bv(memAddress(hsv), __result.address());
        return __result;
    }

    // --- [ nk_hsv_f ] ---

    /** {@code struct nk_color nk_hsv_f(float h, float s, float v)} */
    public static native void nnk_hsv_f(float h, float s, float v, long __result);

    /** {@code struct nk_color nk_hsv_f(float h, float s, float v)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_f(float h, float s, float v, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsv_f(h, s, v, __result.address());
        return __result;
    }

    // --- [ nk_hsv_fv ] ---

    /** {@code struct nk_color nk_hsv_fv(float const * hsv)} */
    public static native void nnk_hsv_fv(long hsv, long __result);

    /** {@code struct nk_color nk_hsv_fv(float const * hsv)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_fv(@NativeType("float const *") FloatBuffer hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_fv(memAddress(hsv), __result.address());
        return __result;
    }

    // --- [ nk_hsva ] ---

    /** {@code struct nk_color nk_hsva(int h, int s, int v, int a)} */
    public static native void nnk_hsva(int h, int s, int v, int a, long __result);

    /** {@code struct nk_color nk_hsva(int h, int s, int v, int a)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva(int h, int s, int v, int a, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsva(h, s, v, a, __result.address());
        return __result;
    }

    // --- [ nk_hsva_iv ] ---

    /** {@code struct nk_color nk_hsva_iv(int const * hsva)} */
    public static native void nnk_hsva_iv(long hsva, long __result);

    /** {@code struct nk_color nk_hsva_iv(int const * hsva)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_iv(@NativeType("int const *") IntBuffer hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_iv(memAddress(hsva), __result.address());
        return __result;
    }

    // --- [ nk_hsva_bv ] ---

    /** {@code struct nk_color nk_hsva_bv(nk_byte const * hsva)} */
    public static native void nnk_hsva_bv(long hsva, long __result);

    /** {@code struct nk_color nk_hsva_bv(nk_byte const * hsva)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_bv(@NativeType("nk_byte const *") ByteBuffer hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_bv(memAddress(hsva), __result.address());
        return __result;
    }

    // --- [ nk_hsva_f ] ---

    /** {@code struct nk_color nk_hsva_f(float h, float s, float v, float a)} */
    public static native void nnk_hsva_f(float h, float s, float v, float a, long __result);

    /** {@code struct nk_color nk_hsva_f(float h, float s, float v, float a)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_f(float h, float s, float v, float a, @NativeType("struct nk_color") NkColor __result) {
        nnk_hsva_f(h, s, v, a, __result.address());
        return __result;
    }

    // --- [ nk_hsva_fv ] ---

    /** {@code struct nk_color nk_hsva_fv(float const * hsva)} */
    public static native void nnk_hsva_fv(long hsva, long __result);

    /** {@code struct nk_color nk_hsva_fv(float const * hsva)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_fv(@NativeType("float const *") FloatBuffer hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_fv(memAddress(hsva), __result.address());
        return __result;
    }

    // --- [ nk_color_f ] ---

    /** {@code void nk_color_f(float * r, float * g, float * b, float * a, struct nk_color color)} */
    public static native void nnk_color_f(long r, long g, long b, long a, long color);

    /** {@code void nk_color_f(float * r, float * g, float * b, float * a, struct nk_color color)} */
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

    /** {@code void nk_color_fv(float * rgba_out, struct nk_color color)} */
    public static native void nnk_color_fv(long rgba_out, long color);

    /** {@code void nk_color_fv(float * rgba_out, struct nk_color color)} */
    public static void nk_color_fv(@NativeType("float *") FloatBuffer rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_fv(memAddress(rgba_out), color.address());
    }

    // --- [ nk_color_cf ] ---

    /** {@code struct nk_colorf nk_color_cf(struct nk_color color)} */
    public static native void nnk_color_cf(long color, long __result);

    /** {@code struct nk_colorf nk_color_cf(struct nk_color color)} */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_color_cf(@NativeType("struct nk_color") NkColor color, @NativeType("struct nk_colorf") NkColorf __result) {
        nnk_color_cf(color.address(), __result.address());
        return __result;
    }

    // --- [ nk_color_d ] ---

    /** {@code void nk_color_d(double * r, double * g, double * b, double * a, struct nk_color color)} */
    public static native void nnk_color_d(long r, long g, long b, long a, long color);

    /** {@code void nk_color_d(double * r, double * g, double * b, double * a, struct nk_color color)} */
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

    /** {@code void nk_color_dv(double * rgba_out, struct nk_color color)} */
    public static native void nnk_color_dv(long rgba_out, long color);

    /** {@code void nk_color_dv(double * rgba_out, struct nk_color color)} */
    public static void nk_color_dv(@NativeType("double *") DoubleBuffer rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_dv(memAddress(rgba_out), color.address());
    }

    // --- [ nk_color_u32 ] ---

    /** {@code nk_uint nk_color_u32(struct nk_color color)} */
    public static native int nnk_color_u32(long color);

    /** {@code nk_uint nk_color_u32(struct nk_color color)} */
    @NativeType("nk_uint")
    public static int nk_color_u32(@NativeType("struct nk_color") NkColor color) {
        return nnk_color_u32(color.address());
    }

    // --- [ nk_color_hex_rgba ] ---

    /** {@code void nk_color_hex_rgba(char * output, struct nk_color color)} */
    public static native void nnk_color_hex_rgba(long output, long color);

    /** {@code void nk_color_hex_rgba(char * output, struct nk_color color)} */
    public static void nk_color_hex_rgba(@NativeType("char *") ByteBuffer output, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(output, 8);
        }
        nnk_color_hex_rgba(memAddress(output), color.address());
    }

    // --- [ nk_color_hex_rgb ] ---

    /** {@code void nk_color_hex_rgb(char * output, struct nk_color color)} */
    public static native void nnk_color_hex_rgb(long output, long color);

    /** {@code void nk_color_hex_rgb(char * output, struct nk_color color)} */
    public static void nk_color_hex_rgb(@NativeType("char *") ByteBuffer output, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(output, 6);
        }
        nnk_color_hex_rgb(memAddress(output), color.address());
    }

    // --- [ nk_color_hsv_i ] ---

    /** {@code void nk_color_hsv_i(int * out_h, int * out_s, int * out_v, struct nk_color color)} */
    public static native void nnk_color_hsv_i(long out_h, long out_s, long out_v, long color);

    /** {@code void nk_color_hsv_i(int * out_h, int * out_s, int * out_v, struct nk_color color)} */
    public static void nk_color_hsv_i(@NativeType("int *") IntBuffer out_h, @NativeType("int *") IntBuffer out_s, @NativeType("int *") IntBuffer out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_i(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
    }

    // --- [ nk_color_hsv_b ] ---

    /** {@code void nk_color_hsv_b(nk_byte * out_h, nk_byte * out_s, nk_byte * out_v, struct nk_color color)} */
    public static native void nnk_color_hsv_b(long out_h, long out_s, long out_v, long color);

    /** {@code void nk_color_hsv_b(nk_byte * out_h, nk_byte * out_s, nk_byte * out_v, struct nk_color color)} */
    public static void nk_color_hsv_b(@NativeType("nk_byte *") ByteBuffer out_h, @NativeType("nk_byte *") ByteBuffer out_s, @NativeType("nk_byte *") ByteBuffer out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_b(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
    }

    // --- [ nk_color_hsv_iv ] ---

    /** {@code void nk_color_hsv_iv(int * hsv_out, struct nk_color color)} */
    public static native void nnk_color_hsv_iv(long hsv_out, long color);

    /** {@code void nk_color_hsv_iv(int * hsv_out, struct nk_color color)} */
    public static void nk_color_hsv_iv(@NativeType("int *") IntBuffer hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_iv(memAddress(hsv_out), color.address());
    }

    // --- [ nk_color_hsv_bv ] ---

    /** {@code void nk_color_hsv_bv(nk_byte * hsv_out, struct nk_color color)} */
    public static native void nnk_color_hsv_bv(long hsv_out, long color);

    /** {@code void nk_color_hsv_bv(nk_byte * hsv_out, struct nk_color color)} */
    public static void nk_color_hsv_bv(@NativeType("nk_byte *") ByteBuffer hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_bv(memAddress(hsv_out), color.address());
    }

    // --- [ nk_color_hsv_f ] ---

    /** {@code void nk_color_hsv_f(float * out_h, float * out_s, float * out_v, struct nk_color color)} */
    public static native void nnk_color_hsv_f(long out_h, long out_s, long out_v, long color);

    /** {@code void nk_color_hsv_f(float * out_h, float * out_s, float * out_v, struct nk_color color)} */
    public static void nk_color_hsv_f(@NativeType("float *") FloatBuffer out_h, @NativeType("float *") FloatBuffer out_s, @NativeType("float *") FloatBuffer out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_f(memAddress(out_h), memAddress(out_s), memAddress(out_v), color.address());
    }

    // --- [ nk_color_hsv_fv ] ---

    /** {@code void nk_color_hsv_fv(float * hsv_out, struct nk_color color)} */
    public static native void nnk_color_hsv_fv(long hsv_out, long color);

    /** {@code void nk_color_hsv_fv(float * hsv_out, struct nk_color color)} */
    public static void nk_color_hsv_fv(@NativeType("float *") FloatBuffer hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_fv(memAddress(hsv_out), color.address());
    }

    // --- [ nk_color_hsva_i ] ---

    /** {@code void nk_color_hsva_i(int * h, int * s, int * v, int * a, struct nk_color color)} */
    public static native void nnk_color_hsva_i(long h, long s, long v, long a, long color);

    /** {@code void nk_color_hsva_i(int * h, int * s, int * v, int * a, struct nk_color color)} */
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

    /** {@code void nk_color_hsva_b(nk_byte * h, nk_byte * s, nk_byte * v, nk_byte * a, struct nk_color color)} */
    public static native void nnk_color_hsva_b(long h, long s, long v, long a, long color);

    /** {@code void nk_color_hsva_b(nk_byte * h, nk_byte * s, nk_byte * v, nk_byte * a, struct nk_color color)} */
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

    /** {@code void nk_color_hsva_iv(int * hsva_out, struct nk_color color)} */
    public static native void nnk_color_hsva_iv(long hsva_out, long color);

    /** {@code void nk_color_hsva_iv(int * hsva_out, struct nk_color color)} */
    public static void nk_color_hsva_iv(@NativeType("int *") IntBuffer hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_iv(memAddress(hsva_out), color.address());
    }

    // --- [ nk_color_hsva_bv ] ---

    /** {@code void nk_color_hsva_bv(nk_byte * hsva_out, struct nk_color color)} */
    public static native void nnk_color_hsva_bv(long hsva_out, long color);

    /** {@code void nk_color_hsva_bv(nk_byte * hsva_out, struct nk_color color)} */
    public static void nk_color_hsva_bv(@NativeType("nk_byte *") ByteBuffer hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_bv(memAddress(hsva_out), color.address());
    }

    // --- [ nk_color_hsva_f ] ---

    /** {@code void nk_color_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_color color)} */
    public static native void nnk_color_hsva_f(long out_h, long out_s, long out_v, long out_a, long color);

    /** {@code void nk_color_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_color color)} */
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

    /** {@code void nk_color_hsva_fv(float * hsva_out, struct nk_color color)} */
    public static native void nnk_color_hsva_fv(long hsva_out, long color);

    /** {@code void nk_color_hsva_fv(float * hsva_out, struct nk_color color)} */
    public static void nk_color_hsva_fv(@NativeType("float *") FloatBuffer hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_fv(memAddress(hsva_out), color.address());
    }

    // --- [ nk_handle_ptr ] ---

    /** {@code nk_handle nk_handle_ptr(void * ptr)} */
    public static native void nnk_handle_ptr(long ptr, long __result);

    /** {@code nk_handle nk_handle_ptr(void * ptr)} */
    @NativeType("nk_handle")
    public static NkHandle nk_handle_ptr(@NativeType("void *") long ptr, @NativeType("nk_handle") NkHandle __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_handle_ptr(ptr, __result.address());
        return __result;
    }

    // --- [ nk_handle_id ] ---

    /** {@code nk_handle nk_handle_id(int id)} */
    public static native void nnk_handle_id(int id, long __result);

    /** {@code nk_handle nk_handle_id(int id)} */
    @NativeType("nk_handle")
    public static NkHandle nk_handle_id(int id, @NativeType("nk_handle") NkHandle __result) {
        nnk_handle_id(id, __result.address());
        return __result;
    }

    // --- [ nk_image_handle ] ---

    /** {@code struct nk_image nk_image_handle(nk_handle handle)} */
    public static native void nnk_image_handle(long handle, long __result);

    /** {@code struct nk_image nk_image_handle(nk_handle handle)} */
    @NativeType("struct nk_image")
    public static NkImage nk_image_handle(@NativeType("nk_handle") NkHandle handle, @NativeType("struct nk_image") NkImage __result) {
        nnk_image_handle(handle.address(), __result.address());
        return __result;
    }

    // --- [ nk_image_ptr ] ---

    /** {@code struct nk_image nk_image_ptr(void * ptr)} */
    public static native void nnk_image_ptr(long ptr, long __result);

    /** {@code struct nk_image nk_image_ptr(void * ptr)} */
    @NativeType("struct nk_image")
    public static NkImage nk_image_ptr(@NativeType("void *") long ptr, @NativeType("struct nk_image") NkImage __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_image_ptr(ptr, __result.address());
        return __result;
    }

    // --- [ nk_image_id ] ---

    /** {@code struct nk_image nk_image_id(int id)} */
    public static native void nnk_image_id(int id, long __result);

    /** {@code struct nk_image nk_image_id(int id)} */
    @NativeType("struct nk_image")
    public static NkImage nk_image_id(int id, @NativeType("struct nk_image") NkImage __result) {
        nnk_image_id(id, __result.address());
        return __result;
    }

    // --- [ nk_image_is_subimage ] ---

    /** {@code nk_bool nk_image_is_subimage(struct nk_image const * img)} */
    public static native boolean nnk_image_is_subimage(long img);

    /** {@code nk_bool nk_image_is_subimage(struct nk_image const * img)} */
    @NativeType("nk_bool")
    public static boolean nk_image_is_subimage(@NativeType("struct nk_image const *") NkImage img) {
        return nnk_image_is_subimage(img.address());
    }

    // --- [ nk_subimage_ptr ] ---

    /** {@code struct nk_image nk_subimage_ptr(void * ptr, nk_ushort w, nk_ushort h, struct nk_rect sub_region)} */
    public static native void nnk_subimage_ptr(long ptr, short w, short h, long sub_region, long __result);

    /** {@code struct nk_image nk_subimage_ptr(void * ptr, nk_ushort w, nk_ushort h, struct nk_rect sub_region)} */
    @NativeType("struct nk_image")
    public static NkImage nk_subimage_ptr(@NativeType("void *") long ptr, @NativeType("nk_ushort") short w, @NativeType("nk_ushort") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("struct nk_image") NkImage __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_subimage_ptr(ptr, w, h, sub_region.address(), __result.address());
        return __result;
    }

    // --- [ nk_subimage_id ] ---

    /** {@code struct nk_image nk_subimage_id(int id, nk_ushort w, nk_ushort h, struct nk_rect sub_region)} */
    public static native void nnk_subimage_id(int id, short w, short h, long sub_region, long __result);

    /** {@code struct nk_image nk_subimage_id(int id, nk_ushort w, nk_ushort h, struct nk_rect sub_region)} */
    @NativeType("struct nk_image")
    public static NkImage nk_subimage_id(int id, @NativeType("nk_ushort") short w, @NativeType("nk_ushort") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("struct nk_image") NkImage __result) {
        nnk_subimage_id(id, w, h, sub_region.address(), __result.address());
        return __result;
    }

    // --- [ nk_subimage_handle ] ---

    /** {@code struct nk_image nk_subimage_handle(nk_handle handle, nk_ushort w, nk_ushort h, struct nk_rect sub_region)} */
    public static native void nnk_subimage_handle(long handle, short w, short h, long sub_region, long __result);

    /** {@code struct nk_image nk_subimage_handle(nk_handle handle, nk_ushort w, nk_ushort h, struct nk_rect sub_region)} */
    @NativeType("struct nk_image")
    public static NkImage nk_subimage_handle(@NativeType("nk_handle") NkHandle handle, @NativeType("nk_ushort") short w, @NativeType("nk_ushort") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("struct nk_image") NkImage __result) {
        nnk_subimage_handle(handle.address(), w, h, sub_region.address(), __result.address());
        return __result;
    }

    // --- [ nk_nine_slice_handle ] ---

    /** {@code struct nk_nine_slice nk_nine_slice_handle(nk_handle handle, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    public static native void nnk_nine_slice_handle(long handle, short l, short t, short r, short b, long __result);

    /** {@code struct nk_nine_slice nk_nine_slice_handle(nk_handle handle, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    @NativeType("struct nk_nine_slice")
    public static NkNineSlice nk_nine_slice_handle(@NativeType("nk_handle") NkHandle handle, @NativeType("nk_ushort") short l, @NativeType("nk_ushort") short t, @NativeType("nk_ushort") short r, @NativeType("nk_ushort") short b, @NativeType("struct nk_nine_slice") NkNineSlice __result) {
        nnk_nine_slice_handle(handle.address(), l, t, r, b, __result.address());
        return __result;
    }

    // --- [ nk_nine_slice_ptr ] ---

    /** {@code struct nk_nine_slice nk_nine_slice_ptr(void * ptr, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    public static native void nnk_nine_slice_ptr(long ptr, short l, short t, short r, short b, long __result);

    /** {@code struct nk_nine_slice nk_nine_slice_ptr(void * ptr, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    @NativeType("struct nk_nine_slice")
    public static NkNineSlice nk_nine_slice_ptr(@NativeType("void *") long ptr, @NativeType("nk_ushort") short l, @NativeType("nk_ushort") short t, @NativeType("nk_ushort") short r, @NativeType("nk_ushort") short b, @NativeType("struct nk_nine_slice") NkNineSlice __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_nine_slice_ptr(ptr, l, t, r, b, __result.address());
        return __result;
    }

    // --- [ nk_nine_slice_id ] ---

    /** {@code struct nk_nine_slice nk_nine_slice_id(int id, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    public static native void nnk_nine_slice_id(int id, short l, short t, short r, short b, long __result);

    /** {@code struct nk_nine_slice nk_nine_slice_id(int id, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    @NativeType("struct nk_nine_slice")
    public static NkNineSlice nk_nine_slice_id(int id, @NativeType("nk_ushort") short l, @NativeType("nk_ushort") short t, @NativeType("nk_ushort") short r, @NativeType("nk_ushort") short b, @NativeType("struct nk_nine_slice") NkNineSlice __result) {
        nnk_nine_slice_id(id, l, t, r, b, __result.address());
        return __result;
    }

    // --- [ nk_nine_slice_is_sub9slice ] ---

    /** {@code int nk_nine_slice_is_sub9slice(struct nk_nine_slice const * img)} */
    public static native int nnk_nine_slice_is_sub9slice(long img);

    /** {@code int nk_nine_slice_is_sub9slice(struct nk_nine_slice const * img)} */
    @NativeType("int")
    public static boolean nk_nine_slice_is_sub9slice(@NativeType("struct nk_nine_slice const *") NkNineSlice img) {
        return nnk_nine_slice_is_sub9slice(img.address()) != 0;
    }

    // --- [ nk_sub9slice_ptr ] ---

    /** {@code struct nk_nine_slice nk_sub9slice_ptr(void * ptr, nk_ushort w, nk_ushort h, struct nk_rect sub_region, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    public static native void nnk_sub9slice_ptr(long ptr, short w, short h, long sub_region, short l, short t, short r, short b, long __result);

    /** {@code struct nk_nine_slice nk_sub9slice_ptr(void * ptr, nk_ushort w, nk_ushort h, struct nk_rect sub_region, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    @NativeType("struct nk_nine_slice")
    public static NkNineSlice nk_sub9slice_ptr(@NativeType("void *") long ptr, @NativeType("nk_ushort") short w, @NativeType("nk_ushort") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("nk_ushort") short l, @NativeType("nk_ushort") short t, @NativeType("nk_ushort") short r, @NativeType("nk_ushort") short b, @NativeType("struct nk_nine_slice") NkNineSlice __result) {
        if (CHECKS) {
            check(ptr);
        }
        nnk_sub9slice_ptr(ptr, w, h, sub_region.address(), l, t, r, b, __result.address());
        return __result;
    }

    // --- [ nk_sub9slice_id ] ---

    /** {@code struct nk_nine_slice nk_sub9slice_id(int id, nk_ushort w, nk_ushort h, struct nk_rect sub_region, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    public static native void nnk_sub9slice_id(int id, short w, short h, long sub_region, short l, short t, short r, short b, long __result);

    /** {@code struct nk_nine_slice nk_sub9slice_id(int id, nk_ushort w, nk_ushort h, struct nk_rect sub_region, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    @NativeType("struct nk_nine_slice")
    public static NkNineSlice nk_sub9slice_id(int id, @NativeType("nk_ushort") short w, @NativeType("nk_ushort") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("nk_ushort") short l, @NativeType("nk_ushort") short t, @NativeType("nk_ushort") short r, @NativeType("nk_ushort") short b, @NativeType("struct nk_nine_slice") NkNineSlice __result) {
        nnk_sub9slice_id(id, w, h, sub_region.address(), l, t, r, b, __result.address());
        return __result;
    }

    // --- [ nk_sub9slice_handle ] ---

    /** {@code struct nk_nine_slice nk_sub9slice_handle(nk_handle handle, nk_ushort w, nk_ushort h, struct nk_rect sub_region, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    public static native void nnk_sub9slice_handle(long handle, short w, short h, long sub_region, short l, short t, short r, short b, long __result);

    /** {@code struct nk_nine_slice nk_sub9slice_handle(nk_handle handle, nk_ushort w, nk_ushort h, struct nk_rect sub_region, nk_ushort l, nk_ushort t, nk_ushort r, nk_ushort b)} */
    @NativeType("struct nk_nine_slice")
    public static NkNineSlice nk_sub9slice_handle(@NativeType("nk_handle") NkHandle handle, @NativeType("nk_ushort") short w, @NativeType("nk_ushort") short h, @NativeType("struct nk_rect") NkRect sub_region, @NativeType("nk_ushort") short l, @NativeType("nk_ushort") short t, @NativeType("nk_ushort") short r, @NativeType("nk_ushort") short b, @NativeType("struct nk_nine_slice") NkNineSlice __result) {
        nnk_sub9slice_handle(handle.address(), w, h, sub_region.address(), l, t, r, b, __result.address());
        return __result;
    }

    // --- [ nk_murmur_hash ] ---

    /** {@code nk_hash nk_murmur_hash(void const * key, int len, nk_hash seed)} */
    public static native int nnk_murmur_hash(long key, int len, int seed);

    /** {@code nk_hash nk_murmur_hash(void const * key, int len, nk_hash seed)} */
    @NativeType("nk_hash")
    public static int nk_murmur_hash(@NativeType("void const *") ByteBuffer key, @NativeType("nk_hash") int seed) {
        return nnk_murmur_hash(memAddress(key), key.remaining(), seed);
    }

    // --- [ nk_triangle_from_direction ] ---

    /** {@code void nk_triangle_from_direction(struct nk_vec2 * result, struct nk_rect r, float pad_x, float pad_y, enum nk_heading direction)} */
    public static native void nnk_triangle_from_direction(long result, long r, float pad_x, float pad_y, int direction);

    /** {@code void nk_triangle_from_direction(struct nk_vec2 * result, struct nk_rect r, float pad_x, float pad_y, enum nk_heading direction)} */
    public static void nk_triangle_from_direction(@NativeType("struct nk_vec2 *") NkVec2 result, @NativeType("struct nk_rect") NkRect r, float pad_x, float pad_y, @NativeType("enum nk_heading") int direction) {
        nnk_triangle_from_direction(result.address(), r.address(), pad_x, pad_y, direction);
    }

    // --- [ nk_vec2 ] ---

    /** {@code struct nk_vec2 nk_vec2(float x, float y)} */
    public static native void nnk_vec2(float x, float y, long __result);

    /** {@code struct nk_vec2 nk_vec2(float x, float y)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2(float x, float y, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_vec2(x, y, __result.address());
        return __result;
    }

    // --- [ nk_vec2i ] ---

    /** {@code struct nk_vec2 nk_vec2i(int x, int y)} */
    public static native void nnk_vec2i(int x, int y, long __result);

    /** {@code struct nk_vec2 nk_vec2i(int x, int y)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2i(int x, int y, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_vec2i(x, y, __result.address());
        return __result;
    }

    // --- [ nk_vec2v ] ---

    /** {@code struct nk_vec2 nk_vec2v(float const * xy)} */
    public static native void nnk_vec2v(long xy, long __result);

    /** {@code struct nk_vec2 nk_vec2v(float const * xy)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2v(@NativeType("float const *") FloatBuffer xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2v(memAddress(xy), __result.address());
        return __result;
    }

    // --- [ nk_vec2iv ] ---

    /** {@code struct nk_vec2 nk_vec2iv(int const * xy)} */
    public static native void nnk_vec2iv(long xy, long __result);

    /** {@code struct nk_vec2 nk_vec2iv(int const * xy)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2iv(@NativeType("int const *") IntBuffer xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2iv(memAddress(xy), __result.address());
        return __result;
    }

    // --- [ nk_get_null_rect ] ---

    /** {@code struct nk_rect nk_get_null_rect(void)} */
    public static native void nnk_get_null_rect(long __result);

    /** {@code struct nk_rect nk_get_null_rect(void)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_get_null_rect(@NativeType("struct nk_rect") NkRect __result) {
        nnk_get_null_rect(__result.address());
        return __result;
    }

    // --- [ nk_rect ] ---

    /** {@code struct nk_rect nk_rect(float x, float y, float w, float h)} */
    public static native void nnk_rect(float x, float y, float w, float h, long __result);

    /** {@code struct nk_rect nk_rect(float x, float y, float w, float h)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rect(float x, float y, float w, float h, @NativeType("struct nk_rect") NkRect __result) {
        nnk_rect(x, y, w, h, __result.address());
        return __result;
    }

    // --- [ nk_recti ] ---

    /** {@code struct nk_rect nk_recti(int x, int y, int w, int h)} */
    public static native void nnk_recti(int x, int y, int w, int h, long __result);

    /** {@code struct nk_rect nk_recti(int x, int y, int w, int h)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_recti(int x, int y, int w, int h, @NativeType("struct nk_rect") NkRect __result) {
        nnk_recti(x, y, w, h, __result.address());
        return __result;
    }

    // --- [ nk_recta ] ---

    /** {@code struct nk_rect nk_recta(struct nk_vec2 pos, struct nk_vec2 size)} */
    public static native void nnk_recta(long pos, long size, long __result);

    /** {@code struct nk_rect nk_recta(struct nk_vec2 pos, struct nk_vec2 size)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_recta(@NativeType("struct nk_vec2") NkVec2 pos, @NativeType("struct nk_vec2") NkVec2 size, @NativeType("struct nk_rect") NkRect __result) {
        nnk_recta(pos.address(), size.address(), __result.address());
        return __result;
    }

    // --- [ nk_rectv ] ---

    /** {@code struct nk_rect nk_rectv(float const * xywh)} */
    public static native void nnk_rectv(long xywh, long __result);

    /** {@code struct nk_rect nk_rectv(float const * xywh)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rectv(@NativeType("float const *") FloatBuffer xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectv(memAddress(xywh), __result.address());
        return __result;
    }

    // --- [ nk_rectiv ] ---

    /** {@code struct nk_rect nk_rectiv(int const * xywh)} */
    public static native void nnk_rectiv(long xywh, long __result);

    /** {@code struct nk_rect nk_rectiv(int const * xywh)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rectiv(@NativeType("int const *") IntBuffer xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectiv(memAddress(xywh), __result.address());
        return __result;
    }

    // --- [ nk_rect_pos ] ---

    /** {@code struct nk_vec2 nk_rect_pos(struct nk_rect r)} */
    public static native void nnk_rect_pos(long r, long __result);

    /** {@code struct nk_vec2 nk_rect_pos(struct nk_rect r)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_rect_pos(@NativeType("struct nk_rect") NkRect r, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_rect_pos(r.address(), __result.address());
        return __result;
    }

    // --- [ nk_rect_size ] ---

    /** {@code struct nk_vec2 nk_rect_size(struct nk_rect r)} */
    public static native void nnk_rect_size(long r, long __result);

    /** {@code struct nk_vec2 nk_rect_size(struct nk_rect r)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_rect_size(@NativeType("struct nk_rect") NkRect r, @NativeType("struct nk_vec2") NkVec2 __result) {
        nnk_rect_size(r.address(), __result.address());
        return __result;
    }

    // --- [ nk_strlen ] ---

    /** {@code int nk_strlen(char const * str)} */
    public static native int nnk_strlen(long str);

    /** {@code int nk_strlen(char const * str)} */
    public static int nk_strlen(@NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_strlen(memAddress(str));
    }

    /** {@code int nk_strlen(char const * str)} */
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

    /** {@code int nk_stricmp(char const * s1, char const * s2)} */
    public static native int nnk_stricmp(long s1, long s2);

    /** {@code int nk_stricmp(char const * s1, char const * s2)} */
    public static int nk_stricmp(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2) {
        if (CHECKS) {
            checkNT1(s1);
            checkNT1(s2);
        }
        return nnk_stricmp(memAddress(s1), memAddress(s2));
    }

    /** {@code int nk_stricmp(char const * s1, char const * s2)} */
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

    /** {@code int nk_stricmpn(char const * s1, char const * s2, int n)} */
    public static native int nnk_stricmpn(long s1, long s2, int n);

    /** {@code int nk_stricmpn(char const * s1, char const * s2, int n)} */
    public static int nk_stricmpn(@NativeType("char const *") ByteBuffer s1, @NativeType("char const *") ByteBuffer s2, int n) {
        if (CHECKS) {
            checkNT1(s1);
            checkNT1(s2);
        }
        return nnk_stricmpn(memAddress(s1), memAddress(s2), n);
    }

    /** {@code int nk_stricmpn(char const * s1, char const * s2, int n)} */
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

    /** {@code int nk_strtoi(char const * str, char ** endptr)} */
    public static native int nnk_strtoi(long str, long endptr);

    /** {@code int nk_strtoi(char const * str, char ** endptr)} */
    public static int nk_strtoi(@NativeType("char const *") ByteBuffer str, @NativeType("char **") PointerBuffer endptr) {
        if (CHECKS) {
            checkNT1(str);
            check(endptr, 1);
        }
        return nnk_strtoi(memAddress(str), memAddress(endptr));
    }

    /** {@code int nk_strtoi(char const * str, char ** endptr)} */
    public static int nk_strtoi(@NativeType("char const *") CharSequence str, @NativeType("char **") PointerBuffer endptr) {
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

    /** {@code float nk_strtof(char const * str, char ** endptr)} */
    public static native float nnk_strtof(long str, long endptr);

    /** {@code float nk_strtof(char const * str, char ** endptr)} */
    public static float nk_strtof(@NativeType("char const *") ByteBuffer str, @NativeType("char **") PointerBuffer endptr) {
        if (CHECKS) {
            checkNT1(str);
            check(endptr, 1);
        }
        return nnk_strtof(memAddress(str), memAddress(endptr));
    }

    /** {@code float nk_strtof(char const * str, char ** endptr)} */
    public static float nk_strtof(@NativeType("char const *") CharSequence str, @NativeType("char **") PointerBuffer endptr) {
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

    /** {@code double nk_strtod(char const * str, char ** endptr)} */
    public static native double nnk_strtod(long str, long endptr);

    /** {@code double nk_strtod(char const * str, char ** endptr)} */
    public static double nk_strtod(@NativeType("char const *") ByteBuffer str, @NativeType("char **") PointerBuffer endptr) {
        if (CHECKS) {
            checkNT1(str);
            check(endptr, 1);
        }
        return nnk_strtod(memAddress(str), memAddress(endptr));
    }

    /** {@code double nk_strtod(char const * str, char ** endptr)} */
    public static double nk_strtod(@NativeType("char const *") CharSequence str, @NativeType("char **") PointerBuffer endptr) {
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

    /** {@code nk_bool nk_strfilter(char const * str, char const * regexp)} */
    public static native boolean nnk_strfilter(long str, long regexp);

    /** {@code nk_bool nk_strfilter(char const * str, char const * regexp)} */
    @NativeType("nk_bool")
    public static boolean nk_strfilter(@NativeType("char const *") ByteBuffer str, @NativeType("char const *") ByteBuffer regexp) {
        if (CHECKS) {
            checkNT1(str);
            checkNT1(regexp);
        }
        return nnk_strfilter(memAddress(str), memAddress(regexp));
    }

    /** {@code nk_bool nk_strfilter(char const * str, char const * regexp)} */
    @NativeType("nk_bool")
    public static boolean nk_strfilter(@NativeType("char const *") CharSequence str, @NativeType("char const *") CharSequence regexp) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            stack.nUTF8(regexp, true);
            long regexpEncoded = stack.getPointerAddress();
            return nnk_strfilter(strEncoded, regexpEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strmatch_fuzzy_string ] ---

    /** {@code nk_bool nk_strmatch_fuzzy_string(char const * str, char const * pattern, int * out_score)} */
    public static native boolean nnk_strmatch_fuzzy_string(long str, long pattern, long out_score);

    /** {@code nk_bool nk_strmatch_fuzzy_string(char const * str, char const * pattern, int * out_score)} */
    @NativeType("nk_bool")
    public static boolean nk_strmatch_fuzzy_string(@NativeType("char const *") ByteBuffer str, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") IntBuffer out_score) {
        if (CHECKS) {
            checkNT1(str);
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_string(memAddress(str), memAddress(pattern), memAddress(out_score));
    }

    /** {@code nk_bool nk_strmatch_fuzzy_string(char const * str, char const * pattern, int * out_score)} */
    @NativeType("nk_bool")
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
            return nnk_strmatch_fuzzy_string(strEncoded, patternEncoded, memAddress(out_score));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_strmatch_fuzzy_text ] ---

    /** {@code int nk_strmatch_fuzzy_text(char const * txt, int txt_len, char const * pattern, int * out_score)} */
    public static native int nnk_strmatch_fuzzy_text(long txt, int txt_len, long pattern, long out_score);

    /** {@code int nk_strmatch_fuzzy_text(char const * txt, int txt_len, char const * pattern, int * out_score)} */
    public static int nk_strmatch_fuzzy_text(@NativeType("char const *") ByteBuffer txt, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") IntBuffer out_score) {
        if (CHECKS) {
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_text(memAddress(txt), txt.remaining(), memAddress(pattern), memAddress(out_score));
    }

    /** {@code int nk_strmatch_fuzzy_text(char const * txt, int txt_len, char const * pattern, int * out_score)} */
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

    /** {@code int nk_utf_decode(char const * c, nk_rune * u, int clen)} */
    public static native int nnk_utf_decode(long c, long u, int clen);

    /** {@code int nk_utf_decode(char const * c, nk_rune * u, int clen)} */
    public static int nk_utf_decode(@NativeType("char const *") ByteBuffer c, @NativeType("nk_rune *") IntBuffer u) {
        if (CHECKS) {
            check(u, 1);
        }
        return nnk_utf_decode(memAddress(c), memAddress(u), c.remaining());
    }

    // --- [ nk_utf_encode ] ---

    /** {@code int nk_utf_encode(nk_rune u, char * c, int clen)} */
    public static native int nnk_utf_encode(int u, long c, int clen);

    /** {@code int nk_utf_encode(nk_rune u, char * c, int clen)} */
    public static int nk_utf_encode(@NativeType("nk_rune") int u, @NativeType("char *") ByteBuffer c) {
        return nnk_utf_encode(u, memAddress(c), c.remaining());
    }

    // --- [ nk_utf_len ] ---

    /** {@code int nk_utf_len(char const * str, int byte_len)} */
    public static native int nnk_utf_len(long str, int byte_len);

    /** {@code int nk_utf_len(char const * str, int byte_len)} */
    public static int nk_utf_len(@NativeType("char const *") ByteBuffer str) {
        return nnk_utf_len(memAddress(str), str.remaining());
    }

    // --- [ nk_utf_at ] ---

    /** {@code char const * nk_utf_at(char const * buffer, int length, int index, nk_rune * unicode, int * len)} */
    public static native long nnk_utf_at(long buffer, int length, int index, long unicode, long len);

    /** {@code char const * nk_utf_at(char const * buffer, int length, int index, nk_rune * unicode, int * len)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer nk_utf_at(@NativeType("char const *") ByteBuffer buffer, int index, @NativeType("nk_rune *") IntBuffer unicode) {
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

    /** {@code void nk_buffer_init(struct nk_buffer * buffer, struct nk_allocator const * allocator, nk_size size)} */
    public static native void nnk_buffer_init(long buffer, long allocator, long size);

    /** {@code void nk_buffer_init(struct nk_buffer * buffer, struct nk_allocator const * allocator, nk_size size)} */
    public static void nk_buffer_init(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("struct nk_allocator const *") NkAllocator allocator, @NativeType("nk_size") long size) {
        nnk_buffer_init(buffer.address(), allocator.address(), size);
    }

    // --- [ nk_buffer_init_fixed ] ---

    /** {@code void nk_buffer_init_fixed(struct nk_buffer * buffer, void * memory, nk_size size)} */
    public static native void nnk_buffer_init_fixed(long buffer, long memory, long size);

    /** {@code void nk_buffer_init_fixed(struct nk_buffer * buffer, void * memory, nk_size size)} */
    public static void nk_buffer_init_fixed(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("void *") ByteBuffer memory) {
        nnk_buffer_init_fixed(buffer.address(), memAddress(memory), memory.remaining());
    }

    // --- [ nk_buffer_info ] ---

    /** {@code void nk_buffer_info(struct nk_memory_status * status, struct nk_buffer const * buffer)} */
    public static native void nnk_buffer_info(long status, long buffer);

    /** {@code void nk_buffer_info(struct nk_memory_status * status, struct nk_buffer const * buffer)} */
    public static void nk_buffer_info(@NativeType("struct nk_memory_status *") NkMemoryStatus status, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        nnk_buffer_info(status.address(), buffer.address());
    }

    // --- [ nk_buffer_push ] ---

    /** {@code void nk_buffer_push(struct nk_buffer * buffer, enum nk_buffer_allocation_type type, void const * memory, nk_size size, nk_size align)} */
    public static native void nnk_buffer_push(long buffer, int type, long memory, long size, long align);

    /** {@code void nk_buffer_push(struct nk_buffer * buffer, enum nk_buffer_allocation_type type, void const * memory, nk_size size, nk_size align)} */
    public static void nk_buffer_push(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("enum nk_buffer_allocation_type") int type, @NativeType("void const *") ByteBuffer memory, @NativeType("nk_size") long align) {
        nnk_buffer_push(buffer.address(), type, memAddress(memory), memory.remaining(), align);
    }

    // --- [ nk_buffer_mark ] ---

    /** {@code void nk_buffer_mark(struct nk_buffer * buffer, enum nk_buffer_allocation_type type)} */
    public static native void nnk_buffer_mark(long buffer, int type);

    /** {@code void nk_buffer_mark(struct nk_buffer * buffer, enum nk_buffer_allocation_type type)} */
    public static void nk_buffer_mark(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("enum nk_buffer_allocation_type") int type) {
        nnk_buffer_mark(buffer.address(), type);
    }

    // --- [ nk_buffer_reset ] ---

    /** {@code void nk_buffer_reset(struct nk_buffer * buffer, enum nk_buffer_allocation_type type)} */
    public static native void nnk_buffer_reset(long buffer, int type);

    /** {@code void nk_buffer_reset(struct nk_buffer * buffer, enum nk_buffer_allocation_type type)} */
    public static void nk_buffer_reset(@NativeType("struct nk_buffer *") NkBuffer buffer, @NativeType("enum nk_buffer_allocation_type") int type) {
        nnk_buffer_reset(buffer.address(), type);
    }

    // --- [ nk_buffer_clear ] ---

    /** {@code void nk_buffer_clear(struct nk_buffer * buffer)} */
    public static native void nnk_buffer_clear(long buffer);

    /** {@code void nk_buffer_clear(struct nk_buffer * buffer)} */
    public static void nk_buffer_clear(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        nnk_buffer_clear(buffer.address());
    }

    // --- [ nk_buffer_free ] ---

    /** {@code void nk_buffer_free(struct nk_buffer * buffer)} */
    public static native void nnk_buffer_free(long buffer);

    /** {@code void nk_buffer_free(struct nk_buffer * buffer)} */
    public static void nk_buffer_free(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        nnk_buffer_free(buffer.address());
    }

    // --- [ nk_buffer_memory ] ---

    /** {@code void * nk_buffer_memory(struct nk_buffer * buffer)} */
    public static native long nnk_buffer_memory(long buffer);

    /** {@code void * nk_buffer_memory(struct nk_buffer * buffer)} */
    @NativeType("void *")
    public static long nk_buffer_memory(@NativeType("struct nk_buffer *") NkBuffer buffer) {
        return nnk_buffer_memory(buffer.address());
    }

    // --- [ nk_buffer_memory_const ] ---

    /** {@code void const * nk_buffer_memory_const(struct nk_buffer const * buffer)} */
    public static native long nnk_buffer_memory_const(long buffer);

    /** {@code void const * nk_buffer_memory_const(struct nk_buffer const * buffer)} */
    @NativeType("void const *")
    public static long nk_buffer_memory_const(@NativeType("struct nk_buffer const *") NkBuffer buffer) {
        return nnk_buffer_memory_const(buffer.address());
    }

    // --- [ nk_buffer_total ] ---

    /** {@code nk_size nk_buffer_total(struct nk_buffer const * buffer)} */
    public static native long nnk_buffer_total(long buffer);

    /** {@code nk_size nk_buffer_total(struct nk_buffer const * buffer)} */
    @NativeType("nk_size")
    public static long nk_buffer_total(@NativeType("struct nk_buffer const *") NkBuffer buffer) {
        return nnk_buffer_total(buffer.address());
    }

    // --- [ nk_str_init ] ---

    /** {@code void nk_str_init(struct nk_str * str, struct nk_allocator const * allocator, nk_size size)} */
    public static native void nnk_str_init(long str, long allocator, long size);

    /** {@code void nk_str_init(struct nk_str * str, struct nk_allocator const * allocator, nk_size size)} */
    public static void nk_str_init(@NativeType("struct nk_str *") NkStr str, @NativeType("struct nk_allocator const *") NkAllocator allocator, @NativeType("nk_size") long size) {
        nnk_str_init(str.address(), allocator.address(), size);
    }

    // --- [ nk_str_init_fixed ] ---

    /** {@code void nk_str_init_fixed(struct nk_str * str, void * memory, nk_size size)} */
    public static native void nnk_str_init_fixed(long str, long memory, long size);

    /** {@code void nk_str_init_fixed(struct nk_str * str, void * memory, nk_size size)} */
    public static void nk_str_init_fixed(@NativeType("struct nk_str *") NkStr str, @NativeType("void *") ByteBuffer memory) {
        nnk_str_init_fixed(str.address(), memAddress(memory), memory.remaining());
    }

    // --- [ nk_str_clear ] ---

    /** {@code void nk_str_clear(struct nk_str * str)} */
    public static native void nnk_str_clear(long str);

    /** {@code void nk_str_clear(struct nk_str * str)} */
    public static void nk_str_clear(@NativeType("struct nk_str *") NkStr str) {
        nnk_str_clear(str.address());
    }

    // --- [ nk_str_free ] ---

    /** {@code void nk_str_free(struct nk_str * str)} */
    public static native void nnk_str_free(long str);

    /** {@code void nk_str_free(struct nk_str * str)} */
    public static void nk_str_free(@NativeType("struct nk_str *") NkStr str) {
        nnk_str_free(str.address());
    }

    // --- [ nk_str_append_text_char ] ---

    /** {@code int nk_str_append_text_char(struct nk_str * s, char const * str, int len)} */
    public static native int nnk_str_append_text_char(long s, long str, int len);

    /** {@code int nk_str_append_text_char(struct nk_str * s, char const * str, int len)} */
    public static int nk_str_append_text_char(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_append_text_char(s.address(), memAddress(str), str.remaining());
    }

    // --- [ nk_str_append_str_char ] ---

    /** {@code int nk_str_append_str_char(struct nk_str * s, char const * str)} */
    public static native int nnk_str_append_str_char(long s, long str);

    /** {@code int nk_str_append_str_char(struct nk_str * s, char const * str)} */
    public static int nk_str_append_str_char(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_append_str_char(s.address(), memAddress(str));
    }

    // --- [ nk_str_append_text_utf8 ] ---

    /** {@code int nk_str_append_text_utf8(struct nk_str * s, char const * str, int len)} */
    public static native int nnk_str_append_text_utf8(long s, long str, int len);

    /** {@code int nk_str_append_text_utf8(struct nk_str * s, char const * str, int len)} */
    public static int nk_str_append_text_utf8(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_append_text_utf8(s.address(), memAddress(str), str.remaining());
    }

    // --- [ nk_str_append_str_utf8 ] ---

    /** {@code int nk_str_append_str_utf8(struct nk_str * s, char const * str)} */
    public static native int nnk_str_append_str_utf8(long s, long str);

    /** {@code int nk_str_append_str_utf8(struct nk_str * s, char const * str)} */
    public static int nk_str_append_str_utf8(@NativeType("struct nk_str *") NkStr s, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_append_str_utf8(s.address(), memAddress(str));
    }

    // --- [ nk_str_append_text_runes ] ---

    /** {@code int nk_str_append_text_runes(struct nk_str * s, nk_rune const * runes, int len)} */
    public static native int nnk_str_append_text_runes(long s, long runes, int len);

    /** {@code int nk_str_append_text_runes(struct nk_str * s, nk_rune const * runes, int len)} */
    public static int nk_str_append_text_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") IntBuffer runes) {
        return nnk_str_append_text_runes(s.address(), memAddress(runes), runes.remaining());
    }

    // --- [ nk_str_append_str_runes ] ---

    /** {@code int nk_str_append_str_runes(struct nk_str * s, nk_rune const * runes)} */
    public static native int nnk_str_append_str_runes(long s, long runes);

    /** {@code int nk_str_append_str_runes(struct nk_str * s, nk_rune const * runes)} */
    public static int nk_str_append_str_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") IntBuffer runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_append_str_runes(s.address(), memAddress(runes));
    }

    // --- [ nk_str_insert_at_char ] ---

    /** {@code int nk_str_insert_at_char(struct nk_str * s, int pos, char const * str, int len)} */
    public static native int nnk_str_insert_at_char(long s, int pos, long str, int len);

    /** {@code int nk_str_insert_at_char(struct nk_str * s, int pos, char const * str, int len)} */
    public static int nk_str_insert_at_char(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_at_char(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_at_rune ] ---

    /** {@code int nk_str_insert_at_rune(struct nk_str * s, int pos, char const * str, int len)} */
    public static native int nnk_str_insert_at_rune(long s, int pos, long str, int len);

    /** {@code int nk_str_insert_at_rune(struct nk_str * s, int pos, char const * str, int len)} */
    public static int nk_str_insert_at_rune(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_at_rune(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_text_char ] ---

    /** {@code int nk_str_insert_text_char(struct nk_str * s, int pos, char const * str, int len)} */
    public static native int nnk_str_insert_text_char(long s, int pos, long str, int len);

    /** {@code int nk_str_insert_text_char(struct nk_str * s, int pos, char const * str, int len)} */
    public static int nk_str_insert_text_char(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_text_char(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_str_char ] ---

    /** {@code int nk_str_insert_str_char(struct nk_str * s, int pos, char const * str)} */
    public static native int nnk_str_insert_str_char(long s, int pos, long str);

    /** {@code int nk_str_insert_str_char(struct nk_str * s, int pos, char const * str)} */
    public static int nk_str_insert_str_char(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_insert_str_char(s.address(), pos, memAddress(str));
    }

    // --- [ nk_str_insert_text_utf8 ] ---

    /** {@code int nk_str_insert_text_utf8(struct nk_str * s, int pos, char const * str, int len)} */
    public static native int nnk_str_insert_text_utf8(long s, int pos, long str, int len);

    /** {@code int nk_str_insert_text_utf8(struct nk_str * s, int pos, char const * str, int len)} */
    public static int nk_str_insert_text_utf8(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        return nnk_str_insert_text_utf8(s.address(), pos, memAddress(str), str.remaining());
    }

    // --- [ nk_str_insert_str_utf8 ] ---

    /** {@code int nk_str_insert_str_utf8(struct nk_str * s, int pos, char const * str)} */
    public static native int nnk_str_insert_str_utf8(long s, int pos, long str);

    /** {@code int nk_str_insert_str_utf8(struct nk_str * s, int pos, char const * str)} */
    public static int nk_str_insert_str_utf8(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("char const *") ByteBuffer str) {
        if (CHECKS) {
            checkNT1(str);
        }
        return nnk_str_insert_str_utf8(s.address(), pos, memAddress(str));
    }

    // --- [ nk_str_insert_text_runes ] ---

    /** {@code int nk_str_insert_text_runes(struct nk_str * s, int pos, nk_rune const * runes, int len)} */
    public static native int nnk_str_insert_text_runes(long s, int pos, long runes, int len);

    /** {@code int nk_str_insert_text_runes(struct nk_str * s, int pos, nk_rune const * runes, int len)} */
    public static int nk_str_insert_text_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") IntBuffer runes) {
        return nnk_str_insert_text_runes(s.address(), pos, memAddress(runes), runes.remaining());
    }

    // --- [ nk_str_insert_str_runes ] ---

    /** {@code int nk_str_insert_str_runes(struct nk_str * s, int pos, nk_rune const * runes)} */
    public static native int nnk_str_insert_str_runes(long s, int pos, long runes);

    /** {@code int nk_str_insert_str_runes(struct nk_str * s, int pos, nk_rune const * runes)} */
    public static int nk_str_insert_str_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") IntBuffer runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_insert_str_runes(s.address(), pos, memAddress(runes));
    }

    // --- [ nk_str_remove_chars ] ---

    /** {@code void nk_str_remove_chars(struct nk_str * s, int len)} */
    public static native void nnk_str_remove_chars(long s, int len);

    /** {@code void nk_str_remove_chars(struct nk_str * s, int len)} */
    public static void nk_str_remove_chars(@NativeType("struct nk_str *") NkStr s, int len) {
        nnk_str_remove_chars(s.address(), len);
    }

    // --- [ nk_str_remove_runes ] ---

    /** {@code void nk_str_remove_runes(struct nk_str * str, int len)} */
    public static native void nnk_str_remove_runes(long str, int len);

    /** {@code void nk_str_remove_runes(struct nk_str * str, int len)} */
    public static void nk_str_remove_runes(@NativeType("struct nk_str *") NkStr str, int len) {
        nnk_str_remove_runes(str.address(), len);
    }

    // --- [ nk_str_delete_chars ] ---

    /** {@code void nk_str_delete_chars(struct nk_str * s, int pos, int len)} */
    public static native void nnk_str_delete_chars(long s, int pos, int len);

    /** {@code void nk_str_delete_chars(struct nk_str * s, int pos, int len)} */
    public static void nk_str_delete_chars(@NativeType("struct nk_str *") NkStr s, int pos, int len) {
        nnk_str_delete_chars(s.address(), pos, len);
    }

    // --- [ nk_str_delete_runes ] ---

    /** {@code void nk_str_delete_runes(struct nk_str * s, int pos, int len)} */
    public static native void nnk_str_delete_runes(long s, int pos, int len);

    /** {@code void nk_str_delete_runes(struct nk_str * s, int pos, int len)} */
    public static void nk_str_delete_runes(@NativeType("struct nk_str *") NkStr s, int pos, int len) {
        nnk_str_delete_runes(s.address(), pos, len);
    }

    // --- [ nk_str_at_char ] ---

    /** {@code char * nk_str_at_char(struct nk_str * s, int pos)} */
    public static native long nnk_str_at_char(long s, int pos);

    /** {@code char * nk_str_at_char(struct nk_str * s, int pos)} */
    @NativeType("char *")
    public static @Nullable String nk_str_at_char(@NativeType("struct nk_str *") NkStr s, int pos) {
        long __result = nnk_str_at_char(s.address(), pos);
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_at_rune ] ---

    /** {@code char * nk_str_at_rune(struct nk_str * s, int pos, nk_rune * unicode, int * len)} */
    public static native long nnk_str_at_rune(long s, int pos, long unicode, long len);

    /** {@code char * nk_str_at_rune(struct nk_str * s, int pos, nk_rune * unicode, int * len)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer nk_str_at_rune(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune *") IntBuffer unicode) {
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

    /** {@code nk_rune nk_str_rune_at(struct nk_str const * s, int pos)} */
    public static native int nnk_str_rune_at(long s, int pos);

    /** {@code nk_rune nk_str_rune_at(struct nk_str const * s, int pos)} */
    @NativeType("nk_rune")
    public static int nk_str_rune_at(@NativeType("struct nk_str const *") NkStr s, int pos) {
        return nnk_str_rune_at(s.address(), pos);
    }

    // --- [ nk_str_at_char_const ] ---

    /** {@code char const * nk_str_at_char_const(struct nk_str const * s, int pos)} */
    public static native long nnk_str_at_char_const(long s, int pos);

    /** {@code char const * nk_str_at_char_const(struct nk_str const * s, int pos)} */
    @NativeType("char const *")
    public static @Nullable String nk_str_at_char_const(@NativeType("struct nk_str const *") NkStr s, int pos) {
        long __result = nnk_str_at_char_const(s.address(), pos);
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_at_const ] ---

    /** {@code char const * nk_str_at_const(struct nk_str const * s, int pos, nk_rune * unicode, int * len)} */
    public static native long nnk_str_at_const(long s, int pos, long unicode, long len);

    /** {@code char const * nk_str_at_const(struct nk_str const * s, int pos, nk_rune * unicode, int * len)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer nk_str_at_const(@NativeType("struct nk_str const *") NkStr s, int pos, @NativeType("nk_rune *") IntBuffer unicode) {
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

    /** {@code char * nk_str_get(struct nk_str * s)} */
    public static native long nnk_str_get(long s);

    /** {@code char * nk_str_get(struct nk_str * s)} */
    @NativeType("char *")
    public static @Nullable String nk_str_get(@NativeType("struct nk_str *") NkStr s) {
        long __result = nnk_str_get(s.address());
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_get_const ] ---

    /** {@code char const * nk_str_get_const(struct nk_str const * s)} */
    public static native long nnk_str_get_const(long s);

    /** {@code char const * nk_str_get_const(struct nk_str const * s)} */
    @NativeType("char const *")
    public static @Nullable String nk_str_get_const(@NativeType("struct nk_str const *") NkStr s) {
        long __result = nnk_str_get_const(s.address());
        return memUTF8Safe(__result);
    }

    // --- [ nk_str_len ] ---

    /** {@code int nk_str_len(struct nk_str const * s)} */
    public static native int nnk_str_len(long s);

    /** {@code int nk_str_len(struct nk_str const * s)} */
    public static int nk_str_len(@NativeType("struct nk_str const *") NkStr s) {
        return nnk_str_len(s.address());
    }

    // --- [ nk_str_len_char ] ---

    /** {@code int nk_str_len_char(struct nk_str const * s)} */
    public static native int nnk_str_len_char(long s);

    /** {@code int nk_str_len_char(struct nk_str const * s)} */
    public static int nk_str_len_char(@NativeType("struct nk_str const *") NkStr s) {
        return nnk_str_len_char(s.address());
    }

    // --- [ nk_filter_default ] ---

    /** {@code nk_bool nk_filter_default(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_default(long edit, int unicode);

    /** {@code nk_bool nk_filter_default(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_default(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_default(edit.address(), unicode);
    }

    // --- [ nk_filter_ascii ] ---

    /** {@code nk_bool nk_filter_ascii(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_ascii(long edit, int unicode);

    /** {@code nk_bool nk_filter_ascii(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_ascii(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_ascii(edit.address(), unicode);
    }

    // --- [ nk_filter_float ] ---

    /** {@code nk_bool nk_filter_float(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_float(long edit, int unicode);

    /** {@code nk_bool nk_filter_float(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_float(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_float(edit.address(), unicode);
    }

    // --- [ nk_filter_decimal ] ---

    /** {@code nk_bool nk_filter_decimal(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_decimal(long edit, int unicode);

    /** {@code nk_bool nk_filter_decimal(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_decimal(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_decimal(edit.address(), unicode);
    }

    // --- [ nk_filter_hex ] ---

    /** {@code nk_bool nk_filter_hex(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_hex(long edit, int unicode);

    /** {@code nk_bool nk_filter_hex(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_hex(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_hex(edit.address(), unicode);
    }

    // --- [ nk_filter_oct ] ---

    /** {@code nk_bool nk_filter_oct(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_oct(long edit, int unicode);

    /** {@code nk_bool nk_filter_oct(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_oct(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_oct(edit.address(), unicode);
    }

    // --- [ nk_filter_binary ] ---

    /** {@code nk_bool nk_filter_binary(struct nk_text_edit const * edit, nk_rune unicode)} */
    public static native boolean nnk_filter_binary(long edit, int unicode);

    /** {@code nk_bool nk_filter_binary(struct nk_text_edit const * edit, nk_rune unicode)} */
    @NativeType("nk_bool")
    public static boolean nk_filter_binary(@NativeType("struct nk_text_edit const *") NkTextEdit edit, @NativeType("nk_rune") int unicode) {
        return nnk_filter_binary(edit.address(), unicode);
    }

    // --- [ nk_textedit_init ] ---

    /** {@code void nk_textedit_init(struct nk_text_edit * box, struct nk_allocator const * allocator, nk_size size)} */
    public static native void nnk_textedit_init(long box, long allocator, long size);

    /** {@code void nk_textedit_init(struct nk_text_edit * box, struct nk_allocator const * allocator, nk_size size)} */
    public static void nk_textedit_init(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("struct nk_allocator const *") NkAllocator allocator, @NativeType("nk_size") long size) {
        nnk_textedit_init(box.address(), allocator.address(), size);
    }

    // --- [ nk_textedit_init_fixed ] ---

    /** {@code void nk_textedit_init_fixed(struct nk_text_edit * box, void * memory, nk_size size)} */
    public static native void nnk_textedit_init_fixed(long box, long memory, long size);

    /** {@code void nk_textedit_init_fixed(struct nk_text_edit * box, void * memory, nk_size size)} */
    public static void nk_textedit_init_fixed(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("void *") ByteBuffer memory) {
        nnk_textedit_init_fixed(box.address(), memAddress(memory), memory.remaining());
    }

    // --- [ nk_textedit_free ] ---

    /** {@code void nk_textedit_free(struct nk_text_edit * box)} */
    public static native void nnk_textedit_free(long box);

    /** {@code void nk_textedit_free(struct nk_text_edit * box)} */
    public static void nk_textedit_free(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_free(box.address());
    }

    // --- [ nk_textedit_text ] ---

    /** {@code void nk_textedit_text(struct nk_text_edit * box, char const * text, int total_len)} */
    public static native void nnk_textedit_text(long box, long text, int total_len);

    /** {@code void nk_textedit_text(struct nk_text_edit * box, char const * text, int total_len)} */
    public static void nk_textedit_text(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") ByteBuffer text) {
        nnk_textedit_text(box.address(), memAddress(text), text.remaining());
    }

    /** {@code void nk_textedit_text(struct nk_text_edit * box, char const * text, int total_len)} */
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

    /** {@code void nk_textedit_delete(struct nk_text_edit * box, int where, int len)} */
    public static native void nnk_textedit_delete(long box, int where, int len);

    /** {@code void nk_textedit_delete(struct nk_text_edit * box, int where, int len)} */
    public static void nk_textedit_delete(@NativeType("struct nk_text_edit *") NkTextEdit box, int where, int len) {
        nnk_textedit_delete(box.address(), where, len);
    }

    // --- [ nk_textedit_delete_selection ] ---

    /** {@code void nk_textedit_delete_selection(struct nk_text_edit * box)} */
    public static native void nnk_textedit_delete_selection(long box);

    /** {@code void nk_textedit_delete_selection(struct nk_text_edit * box)} */
    public static void nk_textedit_delete_selection(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_delete_selection(box.address());
    }

    // --- [ nk_textedit_select_all ] ---

    /** {@code void nk_textedit_select_all(struct nk_text_edit * box)} */
    public static native void nnk_textedit_select_all(long box);

    /** {@code void nk_textedit_select_all(struct nk_text_edit * box)} */
    public static void nk_textedit_select_all(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_select_all(box.address());
    }

    // --- [ nk_textedit_cut ] ---

    /** {@code nk_bool nk_textedit_cut(struct nk_text_edit * box)} */
    public static native boolean nnk_textedit_cut(long box);

    /** {@code nk_bool nk_textedit_cut(struct nk_text_edit * box)} */
    @NativeType("nk_bool")
    public static boolean nk_textedit_cut(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        return nnk_textedit_cut(box.address());
    }

    // --- [ nk_textedit_paste ] ---

    /** {@code nk_bool nk_textedit_paste(struct nk_text_edit * box, char const * ctext, int len)} */
    public static native boolean nnk_textedit_paste(long box, long ctext, int len);

    /** {@code nk_bool nk_textedit_paste(struct nk_text_edit * box, char const * ctext, int len)} */
    @NativeType("nk_bool")
    public static boolean nk_textedit_paste(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") ByteBuffer ctext) {
        return nnk_textedit_paste(box.address(), memAddress(ctext), ctext.remaining());
    }

    /** {@code nk_bool nk_textedit_paste(struct nk_text_edit * box, char const * ctext, int len)} */
    @NativeType("nk_bool")
    public static boolean nk_textedit_paste(@NativeType("struct nk_text_edit *") NkTextEdit box, @NativeType("char const *") CharSequence ctext) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int ctextEncodedLength = stack.nUTF8(ctext, false);
            long ctextEncoded = stack.getPointerAddress();
            return nnk_textedit_paste(box.address(), ctextEncoded, ctextEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_textedit_undo ] ---

    /** {@code void nk_textedit_undo(struct nk_text_edit * box)} */
    public static native void nnk_textedit_undo(long box);

    /** {@code void nk_textedit_undo(struct nk_text_edit * box)} */
    public static void nk_textedit_undo(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_undo(box.address());
    }

    // --- [ nk_textedit_redo ] ---

    /** {@code void nk_textedit_redo(struct nk_text_edit * box)} */
    public static native void nnk_textedit_redo(long box);

    /** {@code void nk_textedit_redo(struct nk_text_edit * box)} */
    public static void nk_textedit_redo(@NativeType("struct nk_text_edit *") NkTextEdit box) {
        nnk_textedit_redo(box.address());
    }

    // --- [ nk_stroke_line ] ---

    /** {@code void nk_stroke_line(struct nk_command_buffer * b, float x0, float y0, float x1, float y1, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_line(long b, float x0, float y0, float x1, float y1, float line_thickness, long color);

    /** {@code void nk_stroke_line(struct nk_command_buffer * b, float x0, float y0, float x1, float y1, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_line(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float x0, float y0, float x1, float y1, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_line(b.address(), x0, y0, x1, y1, line_thickness, color.address());
    }

    // --- [ nk_stroke_curve ] ---

    /** {@code void nk_stroke_curve(struct nk_command_buffer * b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_curve(long b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, long color);

    /** {@code void nk_stroke_curve(struct nk_command_buffer * b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_curve(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float ax, float ay, float ctrl0x, float ctrl0y, float ctrl1x, float ctrl1y, float bx, float by, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_curve(b.address(), ax, ay, ctrl0x, ctrl0y, ctrl1x, ctrl1y, bx, by, line_thickness, color.address());
    }

    // --- [ nk_stroke_rect ] ---

    /** {@code void nk_stroke_rect(struct nk_command_buffer * b, struct nk_rect rect, float rounding, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_rect(long b, long rect, float rounding, float line_thickness, long color);

    /** {@code void nk_stroke_rect(struct nk_command_buffer * b, struct nk_rect rect, float rounding, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_rect(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, float rounding, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_rect(b.address(), rect.address(), rounding, line_thickness, color.address());
    }

    // --- [ nk_stroke_circle ] ---

    /** {@code void nk_stroke_circle(struct nk_command_buffer * b, struct nk_rect rect, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_circle(long b, long rect, float line_thickness, long color);

    /** {@code void nk_stroke_circle(struct nk_command_buffer * b, struct nk_rect rect, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_circle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_circle(b.address(), rect.address(), line_thickness, color.address());
    }

    // --- [ nk_stroke_arc ] ---

    /** {@code void nk_stroke_arc(struct nk_command_buffer * b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_arc(long b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, long color);

    /** {@code void nk_stroke_arc(struct nk_command_buffer * b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_arc(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float cx, float cy, float radius, float a_min, float a_max, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_arc(b.address(), cx, cy, radius, a_min, a_max, line_thickness, color.address());
    }

    // --- [ nk_stroke_triangle ] ---

    /** {@code void nk_stroke_triangle(struct nk_command_buffer * b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, struct nk_color color)} */
    public static native void nnk_stroke_triangle(long b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, long color);

    /** {@code void nk_stroke_triangle(struct nk_command_buffer * b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, struct nk_color color)} */
    public static void nk_stroke_triangle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float x0, float y0, float x1, float y1, float x2, float y2, float line_thichness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_triangle(b.address(), x0, y0, x1, y1, x2, y2, line_thichness, color.address());
    }

    // --- [ nk_stroke_polyline ] ---

    /** {@code void nk_stroke_polyline(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color col)} */
    public static native void nnk_stroke_polyline(long b, long points, int point_count, float line_thickness, long col);

    /** {@code void nk_stroke_polyline(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color col)} */
    public static void nk_stroke_polyline(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float const *") FloatBuffer points, float line_thickness, @NativeType("struct nk_color") NkColor col) {
        nnk_stroke_polyline(b.address(), memAddress(points), points.remaining() >> 1, line_thickness, col.address());
    }

    // --- [ nk_stroke_polygon ] ---

    /** {@code void nk_stroke_polygon(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_polygon(long b, long points, int point_count, float line_thickness, long color);

    /** {@code void nk_stroke_polygon(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float const *") FloatBuffer points, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_polygon(b.address(), memAddress(points), points.remaining() >> 1, line_thickness, color.address());
    }

    // --- [ nk_fill_rect ] ---

    /** {@code void nk_fill_rect(struct nk_command_buffer * b, struct nk_rect rect, float rounding, struct nk_color color)} */
    public static native void nnk_fill_rect(long b, long rect, float rounding, long color);

    /** {@code void nk_fill_rect(struct nk_command_buffer * b, struct nk_rect rect, float rounding, struct nk_color color)} */
    public static void nk_fill_rect(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, float rounding, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_rect(b.address(), rect.address(), rounding, color.address());
    }

    // --- [ nk_fill_rect_multi_color ] ---

    /** {@code void nk_fill_rect_multi_color(struct nk_command_buffer * b, struct nk_rect rect, struct nk_color left, struct nk_color top, struct nk_color right, struct nk_color bottom)} */
    public static native void nnk_fill_rect_multi_color(long b, long rect, long left, long top, long right, long bottom);

    /** {@code void nk_fill_rect_multi_color(struct nk_command_buffer * b, struct nk_rect rect, struct nk_color left, struct nk_color top, struct nk_color right, struct nk_color bottom)} */
    public static void nk_fill_rect_multi_color(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor left, @NativeType("struct nk_color") NkColor top, @NativeType("struct nk_color") NkColor right, @NativeType("struct nk_color") NkColor bottom) {
        nnk_fill_rect_multi_color(b.address(), rect.address(), left.address(), top.address(), right.address(), bottom.address());
    }

    // --- [ nk_fill_circle ] ---

    /** {@code void nk_fill_circle(struct nk_command_buffer * b, struct nk_rect rect, struct nk_color color)} */
    public static native void nnk_fill_circle(long b, long rect, long color);

    /** {@code void nk_fill_circle(struct nk_command_buffer * b, struct nk_rect rect, struct nk_color color)} */
    public static void nk_fill_circle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_circle(b.address(), rect.address(), color.address());
    }

    // --- [ nk_fill_arc ] ---

    /** {@code void nk_fill_arc(struct nk_command_buffer * b, float cx, float cy, float radius, float a_min, float a_max, struct nk_color color)} */
    public static native void nnk_fill_arc(long b, float cx, float cy, float radius, float a_min, float a_max, long color);

    /** {@code void nk_fill_arc(struct nk_command_buffer * b, float cx, float cy, float radius, float a_min, float a_max, struct nk_color color)} */
    public static void nk_fill_arc(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float cx, float cy, float radius, float a_min, float a_max, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_arc(b.address(), cx, cy, radius, a_min, a_max, color.address());
    }

    // --- [ nk_fill_triangle ] ---

    /** {@code void nk_fill_triangle(struct nk_command_buffer * b, float x0, float y0, float x1, float y1, float x2, float y2, struct nk_color color)} */
    public static native void nnk_fill_triangle(long b, float x0, float y0, float x1, float y1, float x2, float y2, long color);

    /** {@code void nk_fill_triangle(struct nk_command_buffer * b, float x0, float y0, float x1, float y1, float x2, float y2, struct nk_color color)} */
    public static void nk_fill_triangle(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, float x0, float y0, float x1, float y1, float x2, float y2, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_triangle(b.address(), x0, y0, x1, y1, x2, y2, color.address());
    }

    // --- [ nk_fill_polygon ] ---

    /** {@code void nk_fill_polygon(struct nk_command_buffer * b, float const * points, int point_count, struct nk_color color)} */
    public static native void nnk_fill_polygon(long b, long points, int point_count, long color);

    /** {@code void nk_fill_polygon(struct nk_command_buffer * b, float const * points, int point_count, struct nk_color color)} */
    public static void nk_fill_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float const *") FloatBuffer points, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_polygon(b.address(), memAddress(points), points.remaining() >> 1, color.address());
    }

    // --- [ nk_draw_image ] ---

    /** {@code void nk_draw_image(struct nk_command_buffer * b, struct nk_rect rect, struct nk_image const * img, struct nk_color color)} */
    public static native void nnk_draw_image(long b, long rect, long img, long color);

    /** {@code void nk_draw_image(struct nk_command_buffer * b, struct nk_rect rect, struct nk_image const * img, struct nk_color color)} */
    public static void nk_draw_image(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_image const *") NkImage img, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_image(b.address(), rect.address(), img.address(), color.address());
    }

    // --- [ nk_draw_nine_slice ] ---

    /** {@code void nk_draw_nine_slice(struct nk_command_buffer * b, struct nk_rect rect, struct nk_nine_slice const * slc, struct nk_color color)} */
    public static native void nnk_draw_nine_slice(long b, long rect, long slc, long color);

    /** {@code void nk_draw_nine_slice(struct nk_command_buffer * b, struct nk_rect rect, struct nk_nine_slice const * slc, struct nk_color color)} */
    public static void nk_draw_nine_slice(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_nine_slice const *") NkNineSlice slc, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_nine_slice(b.address(), rect.address(), slc.address(), color.address());
    }

    // --- [ nk_draw_text ] ---

    /** {@code void nk_draw_text(struct nk_command_buffer * b, struct nk_rect rect, char const * string, int length, struct nk_user_font const * font, struct nk_color bg, struct nk_color fg)} */
    public static native void nnk_draw_text(long b, long rect, long string, int length, long font, long bg, long fg);

    /** {@code void nk_draw_text(struct nk_command_buffer * b, struct nk_rect rect, char const * string, int length, struct nk_user_font const * font, struct nk_color bg, struct nk_color fg)} */
    public static void nk_draw_text(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("char const *") ByteBuffer string, @NativeType("struct nk_user_font const *") NkUserFont font, @NativeType("struct nk_color") NkColor bg, @NativeType("struct nk_color") NkColor fg) {
        nnk_draw_text(b.address(), rect.address(), memAddress(string), string.remaining(), font.address(), bg.address(), fg.address());
    }

    /** {@code void nk_draw_text(struct nk_command_buffer * b, struct nk_rect rect, char const * string, int length, struct nk_user_font const * font, struct nk_color bg, struct nk_color fg)} */
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

    /** {@code void nk_push_scissor(struct nk_command_buffer * b, struct nk_rect rect)} */
    public static native void nnk_push_scissor(long b, long rect);

    /** {@code void nk_push_scissor(struct nk_command_buffer * b, struct nk_rect rect)} */
    public static void nk_push_scissor(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect) {
        nnk_push_scissor(b.address(), rect.address());
    }

    // --- [ nk_push_custom ] ---

    /** {@code void nk_push_custom(struct nk_command_buffer * b, struct nk_rect rect, nk_command_custom_callback callback, nk_handle usr)} */
    public static native void nnk_push_custom(long b, long rect, long callback, long usr);

    /** {@code void nk_push_custom(struct nk_command_buffer * b, struct nk_rect rect, nk_command_custom_callback callback, nk_handle usr)} */
    public static void nk_push_custom(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("struct nk_rect") NkRect rect, @NativeType("nk_command_custom_callback") NkCommandCustomCallbackI callback, @NativeType("nk_handle") NkHandle usr) {
        nnk_push_custom(b.address(), rect.address(), callback.address(), usr.address());
    }

    // --- [ nk__next ] ---

    /** {@code struct nk_command const * nk__next(struct nk_context * ctx, struct nk_command const * cmd)} */
    public static native long nnk__next(long ctx, long cmd);

    /** {@code struct nk_command const * nk__next(struct nk_context * ctx, struct nk_command const * cmd)} */
    @NativeType("struct nk_command const *")
    public static @Nullable NkCommand nk__next(@NativeType("struct nk_context *") NkContext ctx, @NativeType("struct nk_command const *") NkCommand cmd) {
        long __result = nnk__next(ctx.address(), cmd.address());
        return NkCommand.createSafe(__result);
    }

    // --- [ nk__begin ] ---

    /** {@code struct nk_command const * nk__begin(struct nk_context * ctx)} */
    public static native long nnk__begin(long ctx);

    /** {@code struct nk_command const * nk__begin(struct nk_context * ctx)} */
    @NativeType("struct nk_command const *")
    public static @Nullable NkCommand nk__begin(@NativeType("struct nk_context *") NkContext ctx) {
        long __result = nnk__begin(ctx.address());
        return NkCommand.createSafe(__result);
    }

    // --- [ nk_input_has_mouse_click ] ---

    /** {@code nk_bool nk_input_has_mouse_click(struct nk_input const * i, enum nk_buttons id)} */
    public static native boolean nnk_input_has_mouse_click(long i, int id);

    /** {@code nk_bool nk_input_has_mouse_click(struct nk_input const * i, enum nk_buttons id)} */
    @NativeType("nk_bool")
    public static boolean nk_input_has_mouse_click(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_has_mouse_click(i.address(), id);
    }

    // --- [ nk_input_has_mouse_click_in_rect ] ---

    /** {@code nk_bool nk_input_has_mouse_click_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    public static native boolean nnk_input_has_mouse_click_in_rect(long i, int id, long rect);

    /** {@code nk_bool nk_input_has_mouse_click_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_has_mouse_click_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_has_mouse_click_in_rect(i.address(), id, rect.address());
    }

    // --- [ nk_input_has_mouse_click_in_button_rect ] ---

    /** {@code nk_bool nk_input_has_mouse_click_in_button_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    public static native boolean nnk_input_has_mouse_click_in_button_rect(long i, int id, long rect);

    /** {@code nk_bool nk_input_has_mouse_click_in_button_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_has_mouse_click_in_button_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_has_mouse_click_in_button_rect(i.address(), id, rect.address());
    }

    // --- [ nk_input_has_mouse_click_down_in_rect ] ---

    /** {@code nk_bool nk_input_has_mouse_click_down_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect, nk_bool down)} */
    public static native boolean nnk_input_has_mouse_click_down_in_rect(long i, int id, long rect, boolean down);

    /** {@code nk_bool nk_input_has_mouse_click_down_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect, nk_bool down)} */
    @NativeType("nk_bool")
    public static boolean nk_input_has_mouse_click_down_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect, @NativeType("nk_bool") boolean down) {
        return nnk_input_has_mouse_click_down_in_rect(i.address(), id, rect.address(), down);
    }

    // --- [ nk_input_is_mouse_click_in_rect ] ---

    /** {@code nk_bool nk_input_is_mouse_click_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    public static native boolean nnk_input_is_mouse_click_in_rect(long i, int id, long rect);

    /** {@code nk_bool nk_input_is_mouse_click_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_click_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_is_mouse_click_in_rect(i.address(), id, rect.address());
    }

    // --- [ nk_input_is_mouse_click_down_in_rect ] ---

    /** {@code nk_bool nk_input_is_mouse_click_down_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect b, nk_bool down)} */
    public static native boolean nnk_input_is_mouse_click_down_in_rect(long i, int id, long b, boolean down);

    /** {@code nk_bool nk_input_is_mouse_click_down_in_rect(struct nk_input const * i, enum nk_buttons id, struct nk_rect b, nk_bool down)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_click_down_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect b, @NativeType("nk_bool") boolean down) {
        return nnk_input_is_mouse_click_down_in_rect(i.address(), id, b.address(), down);
    }

    // --- [ nk_input_any_mouse_click_in_rect ] ---

    /** {@code nk_bool nk_input_any_mouse_click_in_rect(struct nk_input const * i, struct nk_rect rect)} */
    public static native boolean nnk_input_any_mouse_click_in_rect(long i, long rect);

    /** {@code nk_bool nk_input_any_mouse_click_in_rect(struct nk_input const * i, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_any_mouse_click_in_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_any_mouse_click_in_rect(i.address(), rect.address());
    }

    // --- [ nk_input_is_mouse_prev_hovering_rect ] ---

    /** {@code nk_bool nk_input_is_mouse_prev_hovering_rect(struct nk_input const * i, struct nk_rect rect)} */
    public static native boolean nnk_input_is_mouse_prev_hovering_rect(long i, long rect);

    /** {@code nk_bool nk_input_is_mouse_prev_hovering_rect(struct nk_input const * i, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_prev_hovering_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_is_mouse_prev_hovering_rect(i.address(), rect.address());
    }

    // --- [ nk_input_is_mouse_hovering_rect ] ---

    /** {@code nk_bool nk_input_is_mouse_hovering_rect(struct nk_input const * i, struct nk_rect rect)} */
    public static native boolean nnk_input_is_mouse_hovering_rect(long i, long rect);

    /** {@code nk_bool nk_input_is_mouse_hovering_rect(struct nk_input const * i, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_hovering_rect(@NativeType("struct nk_input const *") NkInput i, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_is_mouse_hovering_rect(i.address(), rect.address());
    }

    // --- [ nk_input_mouse_clicked ] ---

    /** {@code nk_bool nk_input_mouse_clicked(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    public static native boolean nnk_input_mouse_clicked(long i, int id, long rect);

    /** {@code nk_bool nk_input_mouse_clicked(struct nk_input const * i, enum nk_buttons id, struct nk_rect rect)} */
    @NativeType("nk_bool")
    public static boolean nk_input_mouse_clicked(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id, @NativeType("struct nk_rect") NkRect rect) {
        return nnk_input_mouse_clicked(i.address(), id, rect.address());
    }

    // --- [ nk_input_is_mouse_down ] ---

    /** {@code nk_bool nk_input_is_mouse_down(struct nk_input const * i, enum nk_buttons id)} */
    public static native boolean nnk_input_is_mouse_down(long i, int id);

    /** {@code nk_bool nk_input_is_mouse_down(struct nk_input const * i, enum nk_buttons id)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_down(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_is_mouse_down(i.address(), id);
    }

    // --- [ nk_input_is_mouse_pressed ] ---

    /** {@code nk_bool nk_input_is_mouse_pressed(struct nk_input const * i, enum nk_buttons id)} */
    public static native boolean nnk_input_is_mouse_pressed(long i, int id);

    /** {@code nk_bool nk_input_is_mouse_pressed(struct nk_input const * i, enum nk_buttons id)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_pressed(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_is_mouse_pressed(i.address(), id);
    }

    // --- [ nk_input_is_mouse_released ] ---

    /** {@code nk_bool nk_input_is_mouse_released(struct nk_input const * i, enum nk_buttons id)} */
    public static native boolean nnk_input_is_mouse_released(long i, int id);

    /** {@code nk_bool nk_input_is_mouse_released(struct nk_input const * i, enum nk_buttons id)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_mouse_released(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_buttons") int id) {
        return nnk_input_is_mouse_released(i.address(), id);
    }

    // --- [ nk_input_is_key_pressed ] ---

    /** {@code nk_bool nk_input_is_key_pressed(struct nk_input const * i, enum nk_keys key)} */
    public static native boolean nnk_input_is_key_pressed(long i, int key);

    /** {@code nk_bool nk_input_is_key_pressed(struct nk_input const * i, enum nk_keys key)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_key_pressed(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_keys") int key) {
        return nnk_input_is_key_pressed(i.address(), key);
    }

    // --- [ nk_input_is_key_released ] ---

    /** {@code nk_bool nk_input_is_key_released(struct nk_input const * i, enum nk_keys key)} */
    public static native boolean nnk_input_is_key_released(long i, int key);

    /** {@code nk_bool nk_input_is_key_released(struct nk_input const * i, enum nk_keys key)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_key_released(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_keys") int key) {
        return nnk_input_is_key_released(i.address(), key);
    }

    // --- [ nk_input_is_key_down ] ---

    /** {@code nk_bool nk_input_is_key_down(struct nk_input const * i, enum nk_keys key)} */
    public static native boolean nnk_input_is_key_down(long i, int key);

    /** {@code nk_bool nk_input_is_key_down(struct nk_input const * i, enum nk_keys key)} */
    @NativeType("nk_bool")
    public static boolean nk_input_is_key_down(@NativeType("struct nk_input const *") NkInput i, @NativeType("enum nk_keys") int key) {
        return nnk_input_is_key_down(i.address(), key);
    }

    // --- [ nk_draw_list_init ] ---

    /** {@code void nk_draw_list_init(struct nk_draw_list * list)} */
    public static native void nnk_draw_list_init(long list);

    /** {@code void nk_draw_list_init(struct nk_draw_list * list)} */
    public static void nk_draw_list_init(@NativeType("struct nk_draw_list *") NkDrawList list) {
        nnk_draw_list_init(list.address());
    }

    // --- [ nk_draw_list_setup ] ---

    /** {@code void nk_draw_list_setup(struct nk_draw_list * canvas, struct nk_convert_config const * config, struct nk_buffer * cmds, struct nk_buffer * vertices, struct nk_buffer * elements, enum nk_anti_aliasing line_aa, enum nk_anti_aliasing shape_aa)} */
    public static native void nnk_draw_list_setup(long canvas, long config, long cmds, long vertices, long elements, int line_aa, int shape_aa);

    /** {@code void nk_draw_list_setup(struct nk_draw_list * canvas, struct nk_convert_config const * config, struct nk_buffer * cmds, struct nk_buffer * vertices, struct nk_buffer * elements, enum nk_anti_aliasing line_aa, enum nk_anti_aliasing shape_aa)} */
    public static void nk_draw_list_setup(@NativeType("struct nk_draw_list *") NkDrawList canvas, @NativeType("struct nk_convert_config const *") NkConvertConfig config, @NativeType("struct nk_buffer *") NkBuffer cmds, @NativeType("struct nk_buffer *") NkBuffer vertices, @NativeType("struct nk_buffer *") NkBuffer elements, @NativeType("enum nk_anti_aliasing") int line_aa, @NativeType("enum nk_anti_aliasing") int shape_aa) {
        if (CHECKS) {
            NkConvertConfig.validate(config.address());
        }
        nnk_draw_list_setup(canvas.address(), config.address(), cmds.address(), vertices.address(), elements.address(), line_aa, shape_aa);
    }

    // --- [ nk__draw_list_begin ] ---

    /** {@code struct nk_draw_command const * nk__draw_list_begin(struct nk_draw_list const * list, struct nk_buffer const * buffer)} */
    public static native long nnk__draw_list_begin(long list, long buffer);

    /** {@code struct nk_draw_command const * nk__draw_list_begin(struct nk_draw_list const * list, struct nk_buffer const * buffer)} */
    @NativeType("struct nk_draw_command const *")
    public static @Nullable NkDrawCommand nk__draw_list_begin(@NativeType("struct nk_draw_list const *") NkDrawList list, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        long __result = nnk__draw_list_begin(list.address(), buffer.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_list_next ] ---

    /** {@code struct nk_draw_command const * nk__draw_list_next(struct nk_draw_command const * cmd, struct nk_buffer const * buffer, struct nk_draw_list const * list)} */
    public static native long nnk__draw_list_next(long cmd, long buffer, long list);

    /** {@code struct nk_draw_command const * nk__draw_list_next(struct nk_draw_command const * cmd, struct nk_buffer const * buffer, struct nk_draw_list const * list)} */
    @NativeType("struct nk_draw_command const *")
    public static @Nullable NkDrawCommand nk__draw_list_next(@NativeType("struct nk_draw_command const *") NkDrawCommand cmd, @NativeType("struct nk_buffer const *") NkBuffer buffer, @NativeType("struct nk_draw_list const *") NkDrawList list) {
        long __result = nnk__draw_list_next(cmd.address(), buffer.address(), list.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_begin ] ---

    /** {@code struct nk_draw_command const * nk__draw_begin(struct nk_context const * ctx, struct nk_buffer const * buffer)} */
    public static native long nnk__draw_begin(long ctx, long buffer);

    /** {@code struct nk_draw_command const * nk__draw_begin(struct nk_context const * ctx, struct nk_buffer const * buffer)} */
    @NativeType("struct nk_draw_command const *")
    public static @Nullable NkDrawCommand nk__draw_begin(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        long __result = nnk__draw_begin(ctx.address(), buffer.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_end ] ---

    /** {@code struct nk_draw_command const * nk__draw_end(struct nk_context const * ctx, struct nk_buffer const * buffer)} */
    public static native long nnk__draw_end(long ctx, long buffer);

    /** {@code struct nk_draw_command const * nk__draw_end(struct nk_context const * ctx, struct nk_buffer const * buffer)} */
    @NativeType("struct nk_draw_command const *")
    public static @Nullable NkDrawCommand nk__draw_end(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("struct nk_buffer const *") NkBuffer buffer) {
        long __result = nnk__draw_end(ctx.address(), buffer.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk__draw_next ] ---

    /** {@code struct nk_draw_command const * nk__draw_next(struct nk_draw_command const * cmd, struct nk_buffer const * buffer, struct nk_context const * ctx)} */
    public static native long nnk__draw_next(long cmd, long buffer, long ctx);

    /** {@code struct nk_draw_command const * nk__draw_next(struct nk_draw_command const * cmd, struct nk_buffer const * buffer, struct nk_context const * ctx)} */
    @NativeType("struct nk_draw_command const *")
    public static @Nullable NkDrawCommand nk__draw_next(@NativeType("struct nk_draw_command const *") NkDrawCommand cmd, @NativeType("struct nk_buffer const *") NkBuffer buffer, @NativeType("struct nk_context const *") NkContext ctx) {
        long __result = nnk__draw_next(cmd.address(), buffer.address(), ctx.address());
        return NkDrawCommand.createSafe(__result);
    }

    // --- [ nk_draw_list_path_clear ] ---

    /** {@code void nk_draw_list_path_clear(struct nk_draw_list * list)} */
    public static native void nnk_draw_list_path_clear(long list);

    /** {@code void nk_draw_list_path_clear(struct nk_draw_list * list)} */
    public static void nk_draw_list_path_clear(@NativeType("struct nk_draw_list *") NkDrawList list) {
        nnk_draw_list_path_clear(list.address());
    }

    // --- [ nk_draw_list_path_line_to ] ---

    /** {@code void nk_draw_list_path_line_to(struct nk_draw_list * list, struct nk_vec2 pos)} */
    public static native void nnk_draw_list_path_line_to(long list, long pos);

    /** {@code void nk_draw_list_path_line_to(struct nk_draw_list * list, struct nk_vec2 pos)} */
    public static void nk_draw_list_path_line_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 pos) {
        nnk_draw_list_path_line_to(list.address(), pos.address());
    }

    // --- [ nk_draw_list_path_arc_to_fast ] ---

    /** {@code void nk_draw_list_path_arc_to_fast(struct nk_draw_list * list, struct nk_vec2 center, float radius, int a_min, int a_max)} */
    public static native void nnk_draw_list_path_arc_to_fast(long list, long center, float radius, int a_min, int a_max);

    /** {@code void nk_draw_list_path_arc_to_fast(struct nk_draw_list * list, struct nk_vec2 center, float radius, int a_min, int a_max)} */
    public static void nk_draw_list_path_arc_to_fast(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, int a_min, int a_max) {
        nnk_draw_list_path_arc_to_fast(list.address(), center.address(), radius, a_min, a_max);
    }

    // --- [ nk_draw_list_path_arc_to ] ---

    /** {@code void nk_draw_list_path_arc_to(struct nk_draw_list * list, struct nk_vec2 center, float radius, float a_min, float a_max, unsigned int segments)} */
    public static native void nnk_draw_list_path_arc_to(long list, long center, float radius, float a_min, float a_max, int segments);

    /** {@code void nk_draw_list_path_arc_to(struct nk_draw_list * list, struct nk_vec2 center, float radius, float a_min, float a_max, unsigned int segments)} */
    public static void nk_draw_list_path_arc_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, float a_min, float a_max, @NativeType("unsigned int") int segments) {
        nnk_draw_list_path_arc_to(list.address(), center.address(), radius, a_min, a_max, segments);
    }

    // --- [ nk_draw_list_path_rect_to ] ---

    /** {@code void nk_draw_list_path_rect_to(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, float rounding)} */
    public static native void nnk_draw_list_path_rect_to(long list, long a, long b, float rounding);

    /** {@code void nk_draw_list_path_rect_to(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, float rounding)} */
    public static void nk_draw_list_path_rect_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, float rounding) {
        nnk_draw_list_path_rect_to(list.address(), a.address(), b.address(), rounding);
    }

    // --- [ nk_draw_list_path_curve_to ] ---

    /** {@code void nk_draw_list_path_curve_to(struct nk_draw_list * list, struct nk_vec2 p2, struct nk_vec2 p3, struct nk_vec2 p4, unsigned int num_segments)} */
    public static native void nnk_draw_list_path_curve_to(long list, long p2, long p3, long p4, int num_segments);

    /** {@code void nk_draw_list_path_curve_to(struct nk_draw_list * list, struct nk_vec2 p2, struct nk_vec2 p3, struct nk_vec2 p4, unsigned int num_segments)} */
    public static void nk_draw_list_path_curve_to(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 p2, @NativeType("struct nk_vec2") NkVec2 p3, @NativeType("struct nk_vec2") NkVec2 p4, @NativeType("unsigned int") int num_segments) {
        nnk_draw_list_path_curve_to(list.address(), p2.address(), p3.address(), p4.address(), num_segments);
    }

    // --- [ nk_draw_list_path_fill ] ---

    /** {@code void nk_draw_list_path_fill(struct nk_draw_list * list, struct nk_color color)} */
    public static native void nnk_draw_list_path_fill(long list, long color);

    /** {@code void nk_draw_list_path_fill(struct nk_draw_list * list, struct nk_color color)} */
    public static void nk_draw_list_path_fill(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_path_fill(list.address(), color.address());
    }

    // --- [ nk_draw_list_path_stroke ] ---

    /** {@code void nk_draw_list_path_stroke(struct nk_draw_list * list, struct nk_color color, enum nk_draw_list_stroke closed, float thickness)} */
    public static native void nnk_draw_list_path_stroke(long list, long color, int closed, float thickness);

    /** {@code void nk_draw_list_path_stroke(struct nk_draw_list * list, struct nk_color color, enum nk_draw_list_stroke closed, float thickness)} */
    public static void nk_draw_list_path_stroke(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_color") NkColor color, @NativeType("enum nk_draw_list_stroke") int closed, float thickness) {
        nnk_draw_list_path_stroke(list.address(), color.address(), closed, thickness);
    }

    // --- [ nk_draw_list_stroke_line ] ---

    /** {@code void nk_draw_list_stroke_line(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, struct nk_color color, float thickness)} */
    public static native void nnk_draw_list_stroke_line(long list, long a, long b, long color, float thickness);

    /** {@code void nk_draw_list_stroke_line(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, struct nk_color color, float thickness)} */
    public static void nk_draw_list_stroke_line(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, @NativeType("struct nk_color") NkColor color, float thickness) {
        nnk_draw_list_stroke_line(list.address(), a.address(), b.address(), color.address(), thickness);
    }

    // --- [ nk_draw_list_stroke_rect ] ---

    /** {@code void nk_draw_list_stroke_rect(struct nk_draw_list * list, struct nk_rect rect, struct nk_color color, float rounding, float thickness)} */
    public static native void nnk_draw_list_stroke_rect(long list, long rect, long color, float rounding, float thickness);

    /** {@code void nk_draw_list_stroke_rect(struct nk_draw_list * list, struct nk_rect rect, struct nk_color color, float rounding, float thickness)} */
    public static void nk_draw_list_stroke_rect(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color, float rounding, float thickness) {
        nnk_draw_list_stroke_rect(list.address(), rect.address(), color.address(), rounding, thickness);
    }

    // --- [ nk_draw_list_stroke_triangle ] ---

    /** {@code void nk_draw_list_stroke_triangle(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, struct nk_vec2 c, struct nk_color color, float thickness)} */
    public static native void nnk_draw_list_stroke_triangle(long list, long a, long b, long c, long color, float thickness);

    /** {@code void nk_draw_list_stroke_triangle(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, struct nk_vec2 c, struct nk_color color, float thickness)} */
    public static void nk_draw_list_stroke_triangle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, @NativeType("struct nk_vec2") NkVec2 c, @NativeType("struct nk_color") NkColor color, float thickness) {
        nnk_draw_list_stroke_triangle(list.address(), a.address(), b.address(), c.address(), color.address(), thickness);
    }

    // --- [ nk_draw_list_stroke_circle ] ---

    /** {@code void nk_draw_list_stroke_circle(struct nk_draw_list * list, struct nk_vec2 center, float radius, struct nk_color color, unsigned int segs, float thickness)} */
    public static native void nnk_draw_list_stroke_circle(long list, long center, float radius, long color, int segs, float thickness);

    /** {@code void nk_draw_list_stroke_circle(struct nk_draw_list * list, struct nk_vec2 center, float radius, struct nk_color color, unsigned int segs, float thickness)} */
    public static void nk_draw_list_stroke_circle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, @NativeType("struct nk_color") NkColor color, @NativeType("unsigned int") int segs, float thickness) {
        nnk_draw_list_stroke_circle(list.address(), center.address(), radius, color.address(), segs, thickness);
    }

    // --- [ nk_draw_list_stroke_curve ] ---

    /** {@code void nk_draw_list_stroke_curve(struct nk_draw_list * list, struct nk_vec2 p0, struct nk_vec2 cp0, struct nk_vec2 cp1, struct nk_vec2 p1, struct nk_color color, unsigned int segments, float thickness)} */
    public static native void nnk_draw_list_stroke_curve(long list, long p0, long cp0, long cp1, long p1, long color, int segments, float thickness);

    /** {@code void nk_draw_list_stroke_curve(struct nk_draw_list * list, struct nk_vec2 p0, struct nk_vec2 cp0, struct nk_vec2 cp1, struct nk_vec2 p1, struct nk_color color, unsigned int segments, float thickness)} */
    public static void nk_draw_list_stroke_curve(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 p0, @NativeType("struct nk_vec2") NkVec2 cp0, @NativeType("struct nk_vec2") NkVec2 cp1, @NativeType("struct nk_vec2") NkVec2 p1, @NativeType("struct nk_color") NkColor color, @NativeType("unsigned int") int segments, float thickness) {
        nnk_draw_list_stroke_curve(list.address(), p0.address(), cp0.address(), cp1.address(), p1.address(), color.address(), segments, thickness);
    }

    // --- [ nk_draw_list_stroke_poly_line ] ---

    /** {@code void nk_draw_list_stroke_poly_line(struct nk_draw_list * list, struct nk_vec2 const * pnts, unsigned int cnt, struct nk_color color, enum nk_draw_list_stroke closed, float thickness, enum nk_anti_aliasing aliasing)} */
    public static native void nnk_draw_list_stroke_poly_line(long list, long pnts, int cnt, long color, int closed, float thickness, int aliasing);

    /** {@code void nk_draw_list_stroke_poly_line(struct nk_draw_list * list, struct nk_vec2 const * pnts, unsigned int cnt, struct nk_color color, enum nk_draw_list_stroke closed, float thickness, enum nk_anti_aliasing aliasing)} */
    public static void nk_draw_list_stroke_poly_line(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2 const *") NkVec2 pnts, @NativeType("unsigned int") int cnt, @NativeType("struct nk_color") NkColor color, @NativeType("enum nk_draw_list_stroke") int closed, float thickness, @NativeType("enum nk_anti_aliasing") int aliasing) {
        nnk_draw_list_stroke_poly_line(list.address(), pnts.address(), cnt, color.address(), closed, thickness, aliasing);
    }

    // --- [ nk_draw_list_fill_rect ] ---

    /** {@code void nk_draw_list_fill_rect(struct nk_draw_list * list, struct nk_rect rect, struct nk_color color, float rounding)} */
    public static native void nnk_draw_list_fill_rect(long list, long rect, long color, float rounding);

    /** {@code void nk_draw_list_fill_rect(struct nk_draw_list * list, struct nk_rect rect, struct nk_color color, float rounding)} */
    public static void nk_draw_list_fill_rect(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color, float rounding) {
        nnk_draw_list_fill_rect(list.address(), rect.address(), color.address(), rounding);
    }

    // --- [ nk_draw_list_fill_rect_multi_color ] ---

    /** {@code void nk_draw_list_fill_rect_multi_color(struct nk_draw_list * list, struct nk_rect rect, struct nk_color left, struct nk_color top, struct nk_color right, struct nk_color bottom)} */
    public static native void nnk_draw_list_fill_rect_multi_color(long list, long rect, long left, long top, long right, long bottom);

    /** {@code void nk_draw_list_fill_rect_multi_color(struct nk_draw_list * list, struct nk_rect rect, struct nk_color left, struct nk_color top, struct nk_color right, struct nk_color bottom)} */
    public static void nk_draw_list_fill_rect_multi_color(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor left, @NativeType("struct nk_color") NkColor top, @NativeType("struct nk_color") NkColor right, @NativeType("struct nk_color") NkColor bottom) {
        nnk_draw_list_fill_rect_multi_color(list.address(), rect.address(), left.address(), top.address(), right.address(), bottom.address());
    }

    // --- [ nk_draw_list_fill_triangle ] ---

    /** {@code void nk_draw_list_fill_triangle(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, struct nk_vec2 c, struct nk_color color)} */
    public static native void nnk_draw_list_fill_triangle(long list, long a, long b, long c, long color);

    /** {@code void nk_draw_list_fill_triangle(struct nk_draw_list * list, struct nk_vec2 a, struct nk_vec2 b, struct nk_vec2 c, struct nk_color color)} */
    public static void nk_draw_list_fill_triangle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 a, @NativeType("struct nk_vec2") NkVec2 b, @NativeType("struct nk_vec2") NkVec2 c, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_fill_triangle(list.address(), a.address(), b.address(), c.address(), color.address());
    }

    // --- [ nk_draw_list_fill_circle ] ---

    /** {@code void nk_draw_list_fill_circle(struct nk_draw_list * list, struct nk_vec2 center, float radius, struct nk_color col, unsigned int segs)} */
    public static native void nnk_draw_list_fill_circle(long list, long center, float radius, long col, int segs);

    /** {@code void nk_draw_list_fill_circle(struct nk_draw_list * list, struct nk_vec2 center, float radius, struct nk_color col, unsigned int segs)} */
    public static void nk_draw_list_fill_circle(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2") NkVec2 center, float radius, @NativeType("struct nk_color") NkColor col, @NativeType("unsigned int") int segs) {
        nnk_draw_list_fill_circle(list.address(), center.address(), radius, col.address(), segs);
    }

    // --- [ nk_draw_list_fill_poly_convex ] ---

    /** {@code void nk_draw_list_fill_poly_convex(struct nk_draw_list * list, struct nk_vec2 const * points, unsigned int count, struct nk_color color, enum nk_anti_aliasing aliasing)} */
    public static native void nnk_draw_list_fill_poly_convex(long list, long points, int count, long color, int aliasing);

    /** {@code void nk_draw_list_fill_poly_convex(struct nk_draw_list * list, struct nk_vec2 const * points, unsigned int count, struct nk_color color, enum nk_anti_aliasing aliasing)} */
    public static void nk_draw_list_fill_poly_convex(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_vec2 const *") NkVec2.Buffer points, @NativeType("struct nk_color") NkColor color, @NativeType("enum nk_anti_aliasing") int aliasing) {
        nnk_draw_list_fill_poly_convex(list.address(), points.address(), points.remaining(), color.address(), aliasing);
    }

    // --- [ nk_draw_list_add_image ] ---

    /** {@code void nk_draw_list_add_image(struct nk_draw_list * list, struct nk_image texture, struct nk_rect rect, struct nk_color color)} */
    public static native void nnk_draw_list_add_image(long list, long texture, long rect, long color);

    /** {@code void nk_draw_list_add_image(struct nk_draw_list * list, struct nk_image texture, struct nk_rect rect, struct nk_color color)} */
    public static void nk_draw_list_add_image(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_image") NkImage texture, @NativeType("struct nk_rect") NkRect rect, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_add_image(list.address(), texture.address(), rect.address(), color.address());
    }

    // --- [ nk_draw_list_add_text ] ---

    /** {@code void nk_draw_list_add_text(struct nk_draw_list * list, struct nk_user_font const * font, struct nk_rect rect, char const * text, int len, float font_height, struct nk_color color)} */
    public static native void nnk_draw_list_add_text(long list, long font, long rect, long text, int len, float font_height, long color);

    /** {@code void nk_draw_list_add_text(struct nk_draw_list * list, struct nk_user_font const * font, struct nk_rect rect, char const * text, int len, float font_height, struct nk_color color)} */
    public static void nk_draw_list_add_text(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("struct nk_user_font const *") NkUserFont font, @NativeType("struct nk_rect") NkRect rect, @NativeType("char const *") ByteBuffer text, float font_height, @NativeType("struct nk_color") NkColor color) {
        nnk_draw_list_add_text(list.address(), font.address(), rect.address(), memAddress(text), text.remaining(), font_height, color.address());
    }

    /** {@code void nk_draw_list_add_text(struct nk_draw_list * list, struct nk_user_font const * font, struct nk_rect rect, char const * text, int len, float font_height, struct nk_color color)} */
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

    /** {@code void nk_draw_list_push_userdata(struct nk_draw_list * list, nk_handle userdata)} */
    public static native void nnk_draw_list_push_userdata(long list, long userdata);

    /** {@code void nk_draw_list_push_userdata(struct nk_draw_list * list, nk_handle userdata)} */
    public static void nk_draw_list_push_userdata(@NativeType("struct nk_draw_list *") NkDrawList list, @NativeType("nk_handle") NkHandle userdata) {
        nnk_draw_list_push_userdata(list.address(), userdata.address());
    }

    // --- [ nk_style_item_color ] ---

    /** {@code struct nk_style_item nk_style_item_color(struct nk_color color)} */
    public static native void nnk_style_item_color(long color, long __result);

    /** {@code struct nk_style_item nk_style_item_color(struct nk_color color)} */
    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_color(@NativeType("struct nk_color") NkColor color, @NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_color(color.address(), __result.address());
        return __result;
    }

    // --- [ nk_style_item_image ] ---

    /** {@code struct nk_style_item nk_style_item_image(struct nk_image img)} */
    public static native void nnk_style_item_image(long img, long __result);

    /** {@code struct nk_style_item nk_style_item_image(struct nk_image img)} */
    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_image(@NativeType("struct nk_image") NkImage img, @NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_image(img.address(), __result.address());
        return __result;
    }

    // --- [ nk_style_item_nine_slice ] ---

    /** {@code struct nk_style_item nk_style_item_nine_slice(struct nk_nine_slice slice)} */
    public static native void nnk_style_item_nine_slice(long slice, long __result);

    /** {@code struct nk_style_item nk_style_item_nine_slice(struct nk_nine_slice slice)} */
    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_nine_slice(@NativeType("struct nk_nine_slice") NkNineSlice slice, @NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_nine_slice(slice.address(), __result.address());
        return __result;
    }

    // --- [ nk_style_item_hide ] ---

    /** {@code struct nk_style_item nk_style_item_hide(void)} */
    public static native void nnk_style_item_hide(long __result);

    /** {@code struct nk_style_item nk_style_item_hide(void)} */
    @NativeType("struct nk_style_item")
    public static NkStyleItem nk_style_item_hide(@NativeType("struct nk_style_item") NkStyleItem __result) {
        nnk_style_item_hide(__result.address());
        return __result;
    }

    // --- [ nk_font_default_glyph_ranges ] ---

    /** {@code nk_rune const * nk_font_default_glyph_ranges(void)} */
    public static native long nnk_font_default_glyph_ranges();

    /** {@code nk_rune const * nk_font_default_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_default_glyph_ranges() {
        long __result = nnk_font_default_glyph_ranges();
        return memIntBufferSafe(__result, 2);
    }

    /** {@code nk_rune const * nk_font_default_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_default_glyph_ranges(long length) {
        long __result = nnk_font_default_glyph_ranges();
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ nk_font_chinese_glyph_ranges ] ---

    /** {@code nk_rune const * nk_font_chinese_glyph_ranges(void)} */
    public static native long nnk_font_chinese_glyph_ranges();

    /** {@code nk_rune const * nk_font_chinese_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_chinese_glyph_ranges() {
        long __result = nnk_font_chinese_glyph_ranges();
        return memIntBufferSafe(__result, 10);
    }

    /** {@code nk_rune const * nk_font_chinese_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_chinese_glyph_ranges(long length) {
        long __result = nnk_font_chinese_glyph_ranges();
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ nk_font_cyrillic_glyph_ranges ] ---

    /** {@code nk_rune const * nk_font_cyrillic_glyph_ranges(void)} */
    public static native long nnk_font_cyrillic_glyph_ranges();

    /** {@code nk_rune const * nk_font_cyrillic_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_cyrillic_glyph_ranges() {
        long __result = nnk_font_cyrillic_glyph_ranges();
        return memIntBufferSafe(__result, 8);
    }

    /** {@code nk_rune const * nk_font_cyrillic_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_cyrillic_glyph_ranges(long length) {
        long __result = nnk_font_cyrillic_glyph_ranges();
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ nk_font_korean_glyph_ranges ] ---

    /** {@code nk_rune const * nk_font_korean_glyph_ranges(void)} */
    public static native long nnk_font_korean_glyph_ranges();

    /** {@code nk_rune const * nk_font_korean_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_korean_glyph_ranges() {
        long __result = nnk_font_korean_glyph_ranges();
        return memIntBufferSafe(__result, 6);
    }

    /** {@code nk_rune const * nk_font_korean_glyph_ranges(void)} */
    @NativeType("nk_rune const *")
    public static @Nullable IntBuffer nk_font_korean_glyph_ranges(long length) {
        long __result = nnk_font_korean_glyph_ranges();
        return memIntBufferSafe(__result, (int)length);
    }

    // --- [ nk_font_atlas_init ] ---

    /** {@code void nk_font_atlas_init(struct nk_font_atlas * atlas, struct nk_allocator const * alloc)} */
    public static native void nnk_font_atlas_init(long atlas, long alloc);

    /** {@code void nk_font_atlas_init(struct nk_font_atlas * atlas, struct nk_allocator const * alloc)} */
    public static void nk_font_atlas_init(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("struct nk_allocator const *") NkAllocator alloc) {
        nnk_font_atlas_init(atlas.address(), alloc.address());
    }

    // --- [ nk_font_atlas_init_custom ] ---

    /** {@code void nk_font_atlas_init_custom(struct nk_font_atlas * atlas, struct nk_allocator const * persistent, struct nk_allocator const * transient_)} */
    public static native void nnk_font_atlas_init_custom(long atlas, long persistent, long transient_);

    /** {@code void nk_font_atlas_init_custom(struct nk_font_atlas * atlas, struct nk_allocator const * persistent, struct nk_allocator const * transient_)} */
    public static void nk_font_atlas_init_custom(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("struct nk_allocator const *") NkAllocator persistent, @NativeType("struct nk_allocator const *") NkAllocator transient_) {
        nnk_font_atlas_init_custom(atlas.address(), persistent.address(), transient_.address());
    }

    // --- [ nk_font_atlas_begin ] ---

    /** {@code void nk_font_atlas_begin(struct nk_font_atlas * atlas)} */
    public static native void nnk_font_atlas_begin(long atlas);

    /** {@code void nk_font_atlas_begin(struct nk_font_atlas * atlas)} */
    public static void nk_font_atlas_begin(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas) {
        nnk_font_atlas_begin(atlas.address());
    }

    // --- [ nk_font_config ] ---

    /** {@code struct nk_font_config nk_font_config(float pixel_height)} */
    public static native void nnk_font_config(float pixel_height, long __result);

    /** {@code struct nk_font_config nk_font_config(float pixel_height)} */
    @NativeType("struct nk_font_config")
    public static NkFontConfig nk_font_config(float pixel_height, @NativeType("struct nk_font_config") NkFontConfig __result) {
        nnk_font_config(pixel_height, __result.address());
        return __result;
    }

    // --- [ nk_font_atlas_add ] ---

    /** {@code struct nk_font * nk_font_atlas_add(struct nk_font_atlas * atlas, struct nk_font_config const * config)} */
    public static native long nnk_font_atlas_add(long atlas, long config);

    /** {@code struct nk_font * nk_font_atlas_add(struct nk_font_atlas * atlas, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("struct nk_font_config const *") NkFontConfig config) {
        long __result = nnk_font_atlas_add(atlas.address(), config.address());
        return NkFont.createSafe(__result);
    }

    // --- [ nk_font_atlas_add_default ] ---

    /** {@code struct nk_font * nk_font_atlas_add_default(struct nk_font_atlas * atlas, float height, struct nk_font_config const * config)} */
    public static native long nnk_font_atlas_add_default(long atlas, float height, long config);

    /** {@code struct nk_font * nk_font_atlas_add_default(struct nk_font_atlas * atlas, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_default(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        long __result = nnk_font_atlas_add_default(atlas.address(), height, memAddressSafe(config));
        return NkFont.createSafe(__result);
    }

    // --- [ nk_font_atlas_add_from_memory ] ---

    /** {@code struct nk_font * nk_font_atlas_add_from_memory(struct nk_font_atlas * atlas, void * memory, nk_size size, float height, struct nk_font_config const * config)} */
    public static native long nnk_font_atlas_add_from_memory(long atlas, long memory, long size, float height, long config);

    /** {@code struct nk_font * nk_font_atlas_add_from_memory(struct nk_font_atlas * atlas, void * memory, nk_size size, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_from_memory(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("void *") ByteBuffer memory, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        long __result = nnk_font_atlas_add_from_memory(atlas.address(), memAddress(memory), memory.remaining(), height, memAddressSafe(config));
        return NkFont.createSafe(__result);
    }

    // --- [ nk_font_atlas_add_from_file ] ---

    /** {@code struct nk_font * nk_font_atlas_add_from_file(struct nk_font_atlas * atlas, char const * file_path, float height, struct nk_font_config const * config)} */
    public static native long nnk_font_atlas_add_from_file(long atlas, long file_path, float height, long config);

    /** {@code struct nk_font * nk_font_atlas_add_from_file(struct nk_font_atlas * atlas, char const * file_path, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_from_file(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("char const *") ByteBuffer file_path, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        if (CHECKS) {
            checkNT1(file_path);
        }
        long __result = nnk_font_atlas_add_from_file(atlas.address(), memAddress(file_path), height, memAddressSafe(config));
        return NkFont.createSafe(__result);
    }

    /** {@code struct nk_font * nk_font_atlas_add_from_file(struct nk_font_atlas * atlas, char const * file_path, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_from_file(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("char const *") CharSequence file_path, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_path, true);
            long file_pathEncoded = stack.getPointerAddress();
            long __result = nnk_font_atlas_add_from_file(atlas.address(), file_pathEncoded, height, memAddressSafe(config));
            return NkFont.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_font_atlas_add_compressed ] ---

    /** {@code struct nk_font * nk_font_atlas_add_compressed(struct nk_font_atlas * atlas, void * memory, nk_size size, float height, struct nk_font_config const * config)} */
    public static native long nnk_font_atlas_add_compressed(long atlas, long memory, long size, float height, long config);

    /** {@code struct nk_font * nk_font_atlas_add_compressed(struct nk_font_atlas * atlas, void * memory, nk_size size, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_compressed(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("void *") ByteBuffer memory, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        long __result = nnk_font_atlas_add_compressed(atlas.address(), memAddress(memory), memory.remaining(), height, memAddressSafe(config));
        return NkFont.createSafe(__result);
    }

    // --- [ nk_font_atlas_add_compressed_base85 ] ---

    /** {@code struct nk_font * nk_font_atlas_add_compressed_base85(struct nk_font_atlas * atlas, char const * data, float height, struct nk_font_config const * config)} */
    public static native long nnk_font_atlas_add_compressed_base85(long atlas, long data, float height, long config);

    /** {@code struct nk_font * nk_font_atlas_add_compressed_base85(struct nk_font_atlas * atlas, char const * data, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_compressed_base85(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("char const *") ByteBuffer data, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        if (CHECKS) {
            checkNT1(data);
        }
        long __result = nnk_font_atlas_add_compressed_base85(atlas.address(), memAddress(data), height, memAddressSafe(config));
        return NkFont.createSafe(__result);
    }

    /** {@code struct nk_font * nk_font_atlas_add_compressed_base85(struct nk_font_atlas * atlas, char const * data, float height, struct nk_font_config const * config)} */
    @NativeType("struct nk_font *")
    public static @Nullable NkFont nk_font_atlas_add_compressed_base85(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("char const *") CharSequence data, float height, @NativeType("struct nk_font_config const *") @Nullable NkFontConfig config) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(data, true);
            long dataEncoded = stack.getPointerAddress();
            long __result = nnk_font_atlas_add_compressed_base85(atlas.address(), dataEncoded, height, memAddressSafe(config));
            return NkFont.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ nk_font_atlas_bake ] ---

    /** {@code void const * nk_font_atlas_bake(struct nk_font_atlas * atlas, int * width, int * height, enum nk_font_atlas_format fmt)} */
    public static native long nnk_font_atlas_bake(long atlas, long width, long height, int fmt);

    /** {@code void const * nk_font_atlas_bake(struct nk_font_atlas * atlas, int * width, int * height, enum nk_font_atlas_format fmt)} */
    @NativeType("void const *")
    public static @Nullable ByteBuffer nk_font_atlas_bake(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("int *") IntBuffer width, @NativeType("int *") IntBuffer height, @NativeType("enum nk_font_atlas_format") int fmt) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
        }
        long __result = nnk_font_atlas_bake(atlas.address(), memAddress(width), memAddress(height), fmt);
        return memByteBufferSafe(__result, width.get(width.position()) * height.get(height.position()) * (fmt == NK_FONT_ATLAS_RGBA32 ? 4 : 1));
    }

    // --- [ nk_font_atlas_end ] ---

    /** {@code void nk_font_atlas_end(struct nk_font_atlas * atlas, nk_handle tex, struct nk_draw_null_texture * tex_null)} */
    public static native void nnk_font_atlas_end(long atlas, long tex, long tex_null);

    /** {@code void nk_font_atlas_end(struct nk_font_atlas * atlas, nk_handle tex, struct nk_draw_null_texture * tex_null)} */
    public static void nk_font_atlas_end(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("nk_handle") NkHandle tex, @NativeType("struct nk_draw_null_texture *") @Nullable NkDrawNullTexture tex_null) {
        nnk_font_atlas_end(atlas.address(), tex.address(), memAddressSafe(tex_null));
    }

    // --- [ nk_font_find_glyph ] ---

    /** {@code struct nk_font_glyph const * nk_font_find_glyph(struct nk_font const * font, nk_rune unicode)} */
    public static native long nnk_font_find_glyph(long font, int unicode);

    /** {@code struct nk_font_glyph const * nk_font_find_glyph(struct nk_font const * font, nk_rune unicode)} */
    @NativeType("struct nk_font_glyph const *")
    public static @Nullable NkFontGlyph nk_font_find_glyph(@NativeType("struct nk_font const *") NkFont font, @NativeType("nk_rune") int unicode) {
        long __result = nnk_font_find_glyph(font.address(), unicode);
        return NkFontGlyph.createSafe(__result);
    }

    // --- [ nk_font_atlas_cleanup ] ---

    /** {@code void nk_font_atlas_cleanup(struct nk_font_atlas * atlas)} */
    public static native void nnk_font_atlas_cleanup(long atlas);

    /** {@code void nk_font_atlas_cleanup(struct nk_font_atlas * atlas)} */
    public static void nk_font_atlas_cleanup(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas) {
        nnk_font_atlas_cleanup(atlas.address());
    }

    // --- [ nk_font_atlas_clear ] ---

    /** {@code void nk_font_atlas_clear(struct nk_font_atlas * atlas)} */
    public static native void nnk_font_atlas_clear(long atlas);

    /** {@code void nk_font_atlas_clear(struct nk_font_atlas * atlas)} */
    public static void nk_font_atlas_clear(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas) {
        nnk_font_atlas_clear(atlas.address());
    }

    /** {@code void nk_window_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static native void nnk_window_get_scroll(long ctx, int[] offset_x, int[] offset_y);

    /** {@code void nk_window_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static void nk_window_get_scroll(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("nk_uint *") int @Nullable [] offset_x, @NativeType("nk_uint *") int @Nullable [] offset_y) {
        if (CHECKS) {
            checkSafe(offset_x, 1);
            checkSafe(offset_y, 1);
        }
        nnk_window_get_scroll(ctx.address(), offset_x, offset_y);
    }

    /** {@code void nk_layout_row(struct nk_context * ctx, enum nk_layout_format fmt, float height, nk_int cols, float const * ratio)} */
    public static native void nnk_layout_row(long ctx, int fmt, float height, int cols, float[] ratio);

    /** {@code void nk_layout_row(struct nk_context * ctx, enum nk_layout_format fmt, float height, nk_int cols, float const * ratio)} */
    public static void nk_layout_row(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_layout_format") int fmt, float height, @NativeType("float const *") float[] ratio) {
        nnk_layout_row(ctx.address(), fmt, height, ratio.length, ratio);
    }

    /** {@code nk_bool nk_group_scrolled_offset_begin(struct nk_context * ctx, nk_uint * x_offset, nk_uint * y_offset, char const * title, nk_flags flags)} */
    public static native boolean nnk_group_scrolled_offset_begin(long ctx, int[] x_offset, int[] y_offset, long title, int flags);

    /** {@code nk_bool nk_group_scrolled_offset_begin(struct nk_context * ctx, nk_uint * x_offset, nk_uint * y_offset, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") int[] x_offset, @NativeType("nk_uint *") int[] y_offset, @NativeType("char const *") ByteBuffer title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
            checkNT1(title);
        }
        return nnk_group_scrolled_offset_begin(ctx.address(), x_offset, y_offset, memAddress(title), flags);
    }

    /** {@code nk_bool nk_group_scrolled_offset_begin(struct nk_context * ctx, nk_uint * x_offset, nk_uint * y_offset, char const * title, nk_flags flags)} */
    @NativeType("nk_bool")
    public static boolean nk_group_scrolled_offset_begin(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_uint *") int[] x_offset, @NativeType("nk_uint *") int[] y_offset, @NativeType("char const *") CharSequence title, @NativeType("nk_flags") int flags) {
        if (CHECKS) {
            check(x_offset, 1);
            check(y_offset, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_group_scrolled_offset_begin(ctx.address(), x_offset, y_offset, titleEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void nk_group_get_scroll(struct nk_context * ctx, char const * id, nk_uint * x_offset, nk_uint * y_offset)} */
    public static native void nnk_group_get_scroll(long ctx, long id, int[] x_offset, int[] y_offset);

    /** {@code void nk_group_get_scroll(struct nk_context * ctx, char const * id, nk_uint * x_offset, nk_uint * y_offset)} */
    public static void nk_group_get_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer id, @NativeType("nk_uint *") int @Nullable [] x_offset, @NativeType("nk_uint *") int @Nullable [] y_offset) {
        if (CHECKS) {
            checkNT1(id);
            checkSafe(x_offset, 1);
            checkSafe(y_offset, 1);
        }
        nnk_group_get_scroll(ctx.address(), memAddress(id), x_offset, y_offset);
    }

    /** {@code void nk_group_get_scroll(struct nk_context * ctx, char const * id, nk_uint * x_offset, nk_uint * y_offset)} */
    public static void nk_group_get_scroll(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence id, @NativeType("nk_uint *") int @Nullable [] x_offset, @NativeType("nk_uint *") int @Nullable [] y_offset) {
        if (CHECKS) {
            checkSafe(x_offset, 1);
            checkSafe(y_offset, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(id, true);
            long idEncoded = stack.getPointerAddress();
            nnk_group_get_scroll(ctx.address(), idEncoded, x_offset, y_offset);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code nk_bool nk_tree_state_push(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states * state)} */
    public static native boolean nnk_tree_state_push(long ctx, int type, long title, int[] state);

    /** {@code nk_bool nk_tree_state_push(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_push(ctx.address(), type, memAddress(title), state);
    }

    /** {@code nk_bool nk_tree_state_push(struct nk_context * ctx, enum nk_tree_type type, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_push(ctx.address(), type, titleEncoded, state);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code nk_bool nk_tree_state_image_push(struct nk_context * ctx, enum nk_tree_type type, struct nk_image image, char const * title, enum nk_collapse_states * state)} */
    public static native boolean nnk_tree_state_image_push(long ctx, int type, long image, long title, int[] state);

    /** {@code nk_bool nk_tree_state_image_push(struct nk_context * ctx, enum nk_tree_type type, struct nk_image image, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") ByteBuffer title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            checkNT1(title);
            check(state, 1);
        }
        return nnk_tree_state_image_push(ctx.address(), type, image.address(), memAddress(title), state);
    }

    /** {@code nk_bool nk_tree_state_image_push(struct nk_context * ctx, enum nk_tree_type type, struct nk_image image, char const * title, enum nk_collapse_states * state)} */
    @NativeType("nk_bool")
    public static boolean nk_tree_state_image_push(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_tree_type") int type, @NativeType("struct nk_image") NkImage image, @NativeType("char const *") CharSequence title, @NativeType("enum nk_collapse_states *") int[] state) {
        if (CHECKS) {
            check(state, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(title, true);
            long titleEncoded = stack.getPointerAddress();
            return nnk_tree_state_image_push(ctx.address(), type, image.address(), titleEncoded, state);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code nk_bool nk_checkbox_flags_label(struct nk_context * ctx, char const * str, unsigned int * flags, unsigned int value)} */
    public static native boolean nnk_checkbox_flags_label(long ctx, long str, int[] flags, int value);

    /** {@code nk_bool nk_checkbox_flags_label(struct nk_context * ctx, char const * str, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            checkNT1(str);
            check(flags, 1);
        }
        return nnk_checkbox_flags_label(ctx.address(), memAddress(str), flags, value);
    }

    /** {@code nk_bool nk_checkbox_flags_label(struct nk_context * ctx, char const * str, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_label(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(str, true);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_label(ctx.address(), strEncoded, flags, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code nk_bool nk_checkbox_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int * flags, unsigned int value)} */
    public static native boolean nnk_checkbox_flags_text(long ctx, long str, int len, int[] flags, int value);

    /** {@code nk_bool nk_checkbox_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nnk_checkbox_flags_text(ctx.address(), memAddress(str), str.remaining(), flags, value);
    }

    /** {@code nk_bool nk_checkbox_flags_text(struct nk_context * ctx, char const * str, int len, unsigned int * flags, unsigned int value)} */
    @NativeType("nk_bool")
    public static boolean nk_checkbox_flags_text(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") CharSequence str, @NativeType("unsigned int *") int[] flags, @NativeType("unsigned int") int value) {
        if (CHECKS) {
            check(flags, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nUTF8(str, false);
            long strEncoded = stack.getPointerAddress();
            return nnk_checkbox_flags_text(ctx.address(), strEncoded, strEncodedLength, flags, value);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code nk_bool nk_slider_float(struct nk_context * ctx, float min, float * val, float max, float step)} */
    public static native boolean nnk_slider_float(long ctx, float min, float[] val, float max, float step);

    /** {@code nk_bool nk_slider_float(struct nk_context * ctx, float min, float * val, float max, float step)} */
    @NativeType("nk_bool")
    public static boolean nk_slider_float(@NativeType("struct nk_context *") NkContext ctx, float min, @NativeType("float *") float[] val, float max, float step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_float(ctx.address(), min, val, max, step);
    }

    /** {@code nk_bool nk_slider_int(struct nk_context * ctx, int min, int * val, int max, int step)} */
    public static native boolean nnk_slider_int(long ctx, int min, int[] val, int max, int step);

    /** {@code nk_bool nk_slider_int(struct nk_context * ctx, int min, int * val, int max, int step)} */
    @NativeType("nk_bool")
    public static boolean nk_slider_int(@NativeType("struct nk_context *") NkContext ctx, int min, @NativeType("int *") int[] val, int max, int step) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_slider_int(ctx.address(), min, val, max, step);
    }

    /** {@code nk_bool nk_knob_float(struct nk_context * ctx, float min, float * val, float max, float step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    public static native boolean nnk_knob_float(long ctx, float min, float[] val, float max, float step, int zero_direction, float dead_zone_degrees);

    /** {@code nk_bool nk_knob_float(struct nk_context * ctx, float min, float * val, float max, float step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    @NativeType("nk_bool")
    public static boolean nk_knob_float(@NativeType("struct nk_context *") NkContext ctx, float min, @NativeType("float *") float[] val, float max, float step, @NativeType("enum nk_heading") int zero_direction, float dead_zone_degrees) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_knob_float(ctx.address(), min, val, max, step, zero_direction, dead_zone_degrees);
    }

    /** {@code nk_bool nk_knob_int(struct nk_context * ctx, int min, int * val, int max, int step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    public static native boolean nnk_knob_int(long ctx, int min, int[] val, int max, int step, int zero_direction, float dead_zone_degrees);

    /** {@code nk_bool nk_knob_int(struct nk_context * ctx, int min, int * val, int max, int step, enum nk_heading zero_direction, float dead_zone_degrees)} */
    @NativeType("nk_bool")
    public static boolean nk_knob_int(@NativeType("struct nk_context *") NkContext ctx, int min, @NativeType("int *") int[] val, int max, int step, @NativeType("enum nk_heading") int zero_direction, float dead_zone_degrees) {
        if (CHECKS) {
            check(val, 1);
        }
        return nnk_knob_int(ctx.address(), min, val, max, step, zero_direction, dead_zone_degrees);
    }

    /** {@code void nk_property_int(struct nk_context * ctx, char const * name, int min, int * val, int max, int step, float inc_per_pixel)} */
    public static native void nnk_property_int(long ctx, long name, int min, int[] val, int max, int step, float inc_per_pixel);

    /** {@code void nk_property_int(struct nk_context * ctx, char const * name, int min, int * val, int max, int step, float inc_per_pixel)} */
    public static void nk_property_int(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, int min, @NativeType("int *") int[] val, int max, int step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_int(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** {@code void nk_property_int(struct nk_context * ctx, char const * name, int min, int * val, int max, int step, float inc_per_pixel)} */
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

    /** {@code void nk_property_float(struct nk_context * ctx, char const * name, float min, float * val, float max, float step, float inc_per_pixel)} */
    public static native void nnk_property_float(long ctx, long name, float min, float[] val, float max, float step, float inc_per_pixel);

    /** {@code void nk_property_float(struct nk_context * ctx, char const * name, float min, float * val, float max, float step, float inc_per_pixel)} */
    public static void nk_property_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, float min, @NativeType("float *") float[] val, float max, float step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_float(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** {@code void nk_property_float(struct nk_context * ctx, char const * name, float min, float * val, float max, float step, float inc_per_pixel)} */
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

    /** {@code void nk_property_double(struct nk_context * ctx, char const * name, double min, double * val, double max, double step, float inc_per_pixel)} */
    public static native void nnk_property_double(long ctx, long name, double min, double[] val, double max, double step, float inc_per_pixel);

    /** {@code void nk_property_double(struct nk_context * ctx, char const * name, double min, double * val, double max, double step, float inc_per_pixel)} */
    public static void nk_property_double(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer name, double min, @NativeType("double *") double[] val, double max, double step, float inc_per_pixel) {
        if (CHECKS) {
            checkNT1(name);
            check(val, 1);
        }
        nnk_property_double(ctx.address(), memAddress(name), min, val, max, step, inc_per_pixel);
    }

    /** {@code void nk_property_double(struct nk_context * ctx, char const * name, double min, double * val, double max, double step, float inc_per_pixel)} */
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

    /** {@code nk_flags nk_edit_string(struct nk_context * ctx, nk_flags flags, char * memory, int * len, int max, nk_plugin_filter filter)} */
    public static native int nnk_edit_string(long ctx, int flags, long memory, int[] len, int max, long filter);

    /** {@code nk_flags nk_edit_string(struct nk_context * ctx, nk_flags flags, char * memory, int * len, int max, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") ByteBuffer memory, @NativeType("int *") int[] len, int max, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
        if (CHECKS) {
            checkNT1(memory);
            check(len, 1);
        }
        return nnk_edit_string(ctx.address(), flags, memAddress(memory), len, max, memAddressSafe(filter));
    }

    /** {@code nk_flags nk_edit_string(struct nk_context * ctx, nk_flags flags, char * memory, int * len, int max, nk_plugin_filter filter)} */
    @NativeType("nk_flags")
    public static int nk_edit_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags") int flags, @NativeType("char *") CharSequence memory, @NativeType("int *") int[] len, int max, @NativeType("nk_plugin_filter") @Nullable NkPluginFilterI filter) {
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

    /** {@code void nk_plot(struct nk_context * ctx, enum nk_chart_type type, float const * values, int count, int offset)} */
    public static native void nnk_plot(long ctx, int type, float[] values, int count, int offset);

    /** {@code void nk_plot(struct nk_context * ctx, enum nk_chart_type type, float const * values, int count, int offset)} */
    public static void nk_plot(@NativeType("struct nk_context *") NkContext ctx, @NativeType("enum nk_chart_type") int type, @NativeType("float const *") float[] values, int count, int offset) {
        if (CHECKS) {
            check(values, offset + count);
        }
        nnk_plot(ctx.address(), type, values, count, offset);
    }

    /** {@code void nk_popup_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static native void nnk_popup_get_scroll(long ctx, int[] offset_x, int[] offset_y);

    /** {@code void nk_popup_get_scroll(struct nk_context const * ctx, nk_uint * offset_x, nk_uint * offset_y)} */
    public static void nk_popup_get_scroll(@NativeType("struct nk_context const *") NkContext ctx, @NativeType("nk_uint *") int @Nullable [] offset_x, @NativeType("nk_uint *") int @Nullable [] offset_y) {
        if (CHECKS) {
            checkSafe(offset_x, 1);
            checkSafe(offset_y, 1);
        }
        nnk_popup_get_scroll(ctx.address(), offset_x, offset_y);
    }

    /** {@code void nk_combobox(struct nk_context * ctx, char const * const * items, int count, int * selected, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox(long ctx, long items, int count, int[] selected, int item_height, long size);

    /** {@code void nk_combobox(struct nk_context * ctx, char const * const * items, int count, int * selected, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const * const *") PointerBuffer items, @NativeType("int *") int[] selected, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(selected, 1);
        }
        nnk_combobox(ctx.address(), memAddress(items), items.remaining(), selected, item_height, size.address());
    }

    /** {@code void nk_combobox_string(struct nk_context * ctx, char const * items_separated_by_zeros, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox_string(long ctx, long items_separated_by_zeros, int[] selected, int count, int item_height, long size);

    /** {@code void nk_combobox_string(struct nk_context * ctx, char const * items_separated_by_zeros, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox_string(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_zeros, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_zeros);
            check(selected, 1);
        }
        nnk_combobox_string(ctx.address(), memAddress(items_separated_by_zeros), selected, count, item_height, size.address());
    }

    /** {@code void nk_combobox_string(struct nk_context * ctx, char const * items_separated_by_zeros, int * selected, int count, int item_height, struct nk_vec2 size)} */
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

    /** {@code void nk_combobox_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox_separator(long ctx, long items_separated_by_separator, int separator, int[] selected, int count, int item_height, long size);

    /** {@code void nk_combobox_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox_separator(@NativeType("struct nk_context *") NkContext ctx, @NativeType("char const *") ByteBuffer items_separated_by_separator, int separator, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            checkNT1(items_separated_by_separator);
            check(selected, 1);
        }
        nnk_combobox_separator(ctx.address(), memAddress(items_separated_by_separator), separator, selected, count, item_height, size.address());
    }

    /** {@code void nk_combobox_separator(struct nk_context * ctx, char const * items_separated_by_separator, int separator, int * selected, int count, int item_height, struct nk_vec2 size)} */
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

    /** {@code void nk_combobox_callback(struct nk_context * ctx, nk_item_getter item_getter, void * userdata, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static native void nnk_combobox_callback(long ctx, long item_getter, long userdata, int[] selected, int count, int item_height, long size);

    /** {@code void nk_combobox_callback(struct nk_context * ctx, nk_item_getter item_getter, void * userdata, int * selected, int count, int item_height, struct nk_vec2 size)} */
    public static void nk_combobox_callback(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_item_getter") NkItemGetterI item_getter, @NativeType("void *") long userdata, @NativeType("int *") int[] selected, int count, int item_height, @NativeType("struct nk_vec2") NkVec2 size) {
        if (CHECKS) {
            check(userdata);
            check(selected, 1);
        }
        nnk_combobox_callback(ctx.address(), item_getter.address(), userdata, selected, count, item_height, size.address());
    }

    /** {@code nk_bool nk_style_push_float(struct nk_context * ctx, float * address, float value)} */
    public static native boolean nnk_style_push_float(long ctx, float[] address, float value);

    /** {@code nk_bool nk_style_push_float(struct nk_context * ctx, float * address, float value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_float(@NativeType("struct nk_context *") NkContext ctx, @NativeType("float *") float[] address, float value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_float(ctx.address(), address, value);
    }

    /** {@code nk_bool nk_style_push_flags(struct nk_context * ctx, nk_flags * address, nk_flags value)} */
    public static native boolean nnk_style_push_flags(long ctx, int[] address, int value);

    /** {@code nk_bool nk_style_push_flags(struct nk_context * ctx, nk_flags * address, nk_flags value)} */
    @NativeType("nk_bool")
    public static boolean nk_style_push_flags(@NativeType("struct nk_context *") NkContext ctx, @NativeType("nk_flags *") int[] address, @NativeType("nk_flags") int value) {
        if (CHECKS) {
            check(address, 1);
        }
        return nnk_style_push_flags(ctx.address(), address, value);
    }

    /** {@code struct nk_color nk_rgb_iv(int const * rgb)} */
    public static native void nnk_rgb_iv(int[] rgb, long __result);

    /** {@code struct nk_color nk_rgb_iv(int const * rgb)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_iv(@NativeType("int const *") int[] rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_iv(rgb, __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_rgb_fv(float const * rgb)} */
    public static native void nnk_rgb_fv(float[] rgb, long __result);

    /** {@code struct nk_color nk_rgb_fv(float const * rgb)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgb_fv(@NativeType("float const *") float[] rgb, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgb, 3);
        }
        nnk_rgb_fv(rgb, __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_rgba_iv(int const * rgba)} */
    public static native void nnk_rgba_iv(int[] rgba, long __result);

    /** {@code struct nk_color nk_rgba_iv(int const * rgba)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_iv(@NativeType("int const *") int[] rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_iv(rgba, __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_rgba_fv(float const * rgba)} */
    public static native void nnk_rgba_fv(float[] rgba, long __result);

    /** {@code struct nk_color nk_rgba_fv(float const * rgba)} */
    @NativeType("struct nk_color")
    public static NkColor nk_rgba_fv(@NativeType("float const *") float[] rgba, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(rgba, 4);
        }
        nnk_rgba_fv(rgba, __result.address());
        return __result;
    }

    /** {@code struct nk_colorf nk_hsva_colorfv(float const * c)} */
    public static native void nnk_hsva_colorfv(float[] c, long __result);

    /** {@code struct nk_colorf nk_hsva_colorfv(float const * c)} */
    @NativeType("struct nk_colorf")
    public static NkColorf nk_hsva_colorfv(@NativeType("float const *") float[] c, @NativeType("struct nk_colorf") NkColorf __result) {
        if (CHECKS) {
            check(c, 4);
        }
        nnk_hsva_colorfv(c, __result.address());
        return __result;
    }

    /** {@code void nk_colorf_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_colorf in)} */
    public static native void nnk_colorf_hsva_f(float[] out_h, float[] out_s, float[] out_v, float[] out_a, long in);

    /** {@code void nk_colorf_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_colorf in)} */
    public static void nk_colorf_hsva_f(@NativeType("float *") float[] out_h, @NativeType("float *") float[] out_s, @NativeType("float *") float[] out_v, @NativeType("float *") float[] out_a, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
            check(out_a, 1);
        }
        nnk_colorf_hsva_f(out_h, out_s, out_v, out_a, in.address());
    }

    /** {@code void nk_colorf_hsva_fv(float * hsva, struct nk_colorf in)} */
    public static native void nnk_colorf_hsva_fv(float[] hsva, long in);

    /** {@code void nk_colorf_hsva_fv(float * hsva, struct nk_colorf in)} */
    public static void nk_colorf_hsva_fv(@NativeType("float *") float[] hsva, @NativeType("struct nk_colorf") NkColorf in) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_colorf_hsva_fv(hsva, in.address());
    }

    /** {@code struct nk_color nk_hsv_iv(int const * hsv)} */
    public static native void nnk_hsv_iv(int[] hsv, long __result);

    /** {@code struct nk_color nk_hsv_iv(int const * hsv)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_iv(@NativeType("int const *") int[] hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_iv(hsv, __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_hsv_fv(float const * hsv)} */
    public static native void nnk_hsv_fv(float[] hsv, long __result);

    /** {@code struct nk_color nk_hsv_fv(float const * hsv)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsv_fv(@NativeType("float const *") float[] hsv, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsv, 3);
        }
        nnk_hsv_fv(hsv, __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_hsva_iv(int const * hsva)} */
    public static native void nnk_hsva_iv(int[] hsva, long __result);

    /** {@code struct nk_color nk_hsva_iv(int const * hsva)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_iv(@NativeType("int const *") int[] hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_iv(hsva, __result.address());
        return __result;
    }

    /** {@code struct nk_color nk_hsva_fv(float const * hsva)} */
    public static native void nnk_hsva_fv(float[] hsva, long __result);

    /** {@code struct nk_color nk_hsva_fv(float const * hsva)} */
    @NativeType("struct nk_color")
    public static NkColor nk_hsva_fv(@NativeType("float const *") float[] hsva, @NativeType("struct nk_color") NkColor __result) {
        if (CHECKS) {
            check(hsva, 4);
        }
        nnk_hsva_fv(hsva, __result.address());
        return __result;
    }

    /** {@code void nk_color_f(float * r, float * g, float * b, float * a, struct nk_color color)} */
    public static native void nnk_color_f(float[] r, float[] g, float[] b, float[] a, long color);

    /** {@code void nk_color_f(float * r, float * g, float * b, float * a, struct nk_color color)} */
    public static void nk_color_f(@NativeType("float *") float[] r, @NativeType("float *") float[] g, @NativeType("float *") float[] b, @NativeType("float *") float[] a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        nnk_color_f(r, g, b, a, color.address());
    }

    /** {@code void nk_color_fv(float * rgba_out, struct nk_color color)} */
    public static native void nnk_color_fv(float[] rgba_out, long color);

    /** {@code void nk_color_fv(float * rgba_out, struct nk_color color)} */
    public static void nk_color_fv(@NativeType("float *") float[] rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_fv(rgba_out, color.address());
    }

    /** {@code void nk_color_d(double * r, double * g, double * b, double * a, struct nk_color color)} */
    public static native void nnk_color_d(double[] r, double[] g, double[] b, double[] a, long color);

    /** {@code void nk_color_d(double * r, double * g, double * b, double * a, struct nk_color color)} */
    public static void nk_color_d(@NativeType("double *") double[] r, @NativeType("double *") double[] g, @NativeType("double *") double[] b, @NativeType("double *") double[] a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(r, 1);
            check(g, 1);
            check(b, 1);
            check(a, 1);
        }
        nnk_color_d(r, g, b, a, color.address());
    }

    /** {@code void nk_color_dv(double * rgba_out, struct nk_color color)} */
    public static native void nnk_color_dv(double[] rgba_out, long color);

    /** {@code void nk_color_dv(double * rgba_out, struct nk_color color)} */
    public static void nk_color_dv(@NativeType("double *") double[] rgba_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(rgba_out, 4);
        }
        nnk_color_dv(rgba_out, color.address());
    }

    /** {@code void nk_color_hsv_i(int * out_h, int * out_s, int * out_v, struct nk_color color)} */
    public static native void nnk_color_hsv_i(int[] out_h, int[] out_s, int[] out_v, long color);

    /** {@code void nk_color_hsv_i(int * out_h, int * out_s, int * out_v, struct nk_color color)} */
    public static void nk_color_hsv_i(@NativeType("int *") int[] out_h, @NativeType("int *") int[] out_s, @NativeType("int *") int[] out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_i(out_h, out_s, out_v, color.address());
    }

    /** {@code void nk_color_hsv_iv(int * hsv_out, struct nk_color color)} */
    public static native void nnk_color_hsv_iv(int[] hsv_out, long color);

    /** {@code void nk_color_hsv_iv(int * hsv_out, struct nk_color color)} */
    public static void nk_color_hsv_iv(@NativeType("int *") int[] hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_iv(hsv_out, color.address());
    }

    /** {@code void nk_color_hsv_f(float * out_h, float * out_s, float * out_v, struct nk_color color)} */
    public static native void nnk_color_hsv_f(float[] out_h, float[] out_s, float[] out_v, long color);

    /** {@code void nk_color_hsv_f(float * out_h, float * out_s, float * out_v, struct nk_color color)} */
    public static void nk_color_hsv_f(@NativeType("float *") float[] out_h, @NativeType("float *") float[] out_s, @NativeType("float *") float[] out_v, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
        }
        nnk_color_hsv_f(out_h, out_s, out_v, color.address());
    }

    /** {@code void nk_color_hsv_fv(float * hsv_out, struct nk_color color)} */
    public static native void nnk_color_hsv_fv(float[] hsv_out, long color);

    /** {@code void nk_color_hsv_fv(float * hsv_out, struct nk_color color)} */
    public static void nk_color_hsv_fv(@NativeType("float *") float[] hsv_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsv_out, 3);
        }
        nnk_color_hsv_fv(hsv_out, color.address());
    }

    /** {@code void nk_color_hsva_i(int * h, int * s, int * v, int * a, struct nk_color color)} */
    public static native void nnk_color_hsva_i(int[] h, int[] s, int[] v, int[] a, long color);

    /** {@code void nk_color_hsva_i(int * h, int * s, int * v, int * a, struct nk_color color)} */
    public static void nk_color_hsva_i(@NativeType("int *") int[] h, @NativeType("int *") int[] s, @NativeType("int *") int[] v, @NativeType("int *") int[] a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(h, 1);
            check(s, 1);
            check(v, 1);
            check(a, 1);
        }
        nnk_color_hsva_i(h, s, v, a, color.address());
    }

    /** {@code void nk_color_hsva_iv(int * hsva_out, struct nk_color color)} */
    public static native void nnk_color_hsva_iv(int[] hsva_out, long color);

    /** {@code void nk_color_hsva_iv(int * hsva_out, struct nk_color color)} */
    public static void nk_color_hsva_iv(@NativeType("int *") int[] hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_iv(hsva_out, color.address());
    }

    /** {@code void nk_color_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_color color)} */
    public static native void nnk_color_hsva_f(float[] out_h, float[] out_s, float[] out_v, float[] out_a, long color);

    /** {@code void nk_color_hsva_f(float * out_h, float * out_s, float * out_v, float * out_a, struct nk_color color)} */
    public static void nk_color_hsva_f(@NativeType("float *") float[] out_h, @NativeType("float *") float[] out_s, @NativeType("float *") float[] out_v, @NativeType("float *") float[] out_a, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(out_h, 1);
            check(out_s, 1);
            check(out_v, 1);
            check(out_a, 1);
        }
        nnk_color_hsva_f(out_h, out_s, out_v, out_a, color.address());
    }

    /** {@code void nk_color_hsva_fv(float * hsva_out, struct nk_color color)} */
    public static native void nnk_color_hsva_fv(float[] hsva_out, long color);

    /** {@code void nk_color_hsva_fv(float * hsva_out, struct nk_color color)} */
    public static void nk_color_hsva_fv(@NativeType("float *") float[] hsva_out, @NativeType("struct nk_color") NkColor color) {
        if (CHECKS) {
            check(hsva_out, 4);
        }
        nnk_color_hsva_fv(hsva_out, color.address());
    }

    /** {@code struct nk_vec2 nk_vec2v(float const * xy)} */
    public static native void nnk_vec2v(float[] xy, long __result);

    /** {@code struct nk_vec2 nk_vec2v(float const * xy)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2v(@NativeType("float const *") float[] xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2v(xy, __result.address());
        return __result;
    }

    /** {@code struct nk_vec2 nk_vec2iv(int const * xy)} */
    public static native void nnk_vec2iv(int[] xy, long __result);

    /** {@code struct nk_vec2 nk_vec2iv(int const * xy)} */
    @NativeType("struct nk_vec2")
    public static NkVec2 nk_vec2iv(@NativeType("int const *") int[] xy, @NativeType("struct nk_vec2") NkVec2 __result) {
        if (CHECKS) {
            check(xy, 2);
        }
        nnk_vec2iv(xy, __result.address());
        return __result;
    }

    /** {@code struct nk_rect nk_rectv(float const * xywh)} */
    public static native void nnk_rectv(float[] xywh, long __result);

    /** {@code struct nk_rect nk_rectv(float const * xywh)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rectv(@NativeType("float const *") float[] xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectv(xywh, __result.address());
        return __result;
    }

    /** {@code struct nk_rect nk_rectiv(int const * xywh)} */
    public static native void nnk_rectiv(int[] xywh, long __result);

    /** {@code struct nk_rect nk_rectiv(int const * xywh)} */
    @NativeType("struct nk_rect")
    public static NkRect nk_rectiv(@NativeType("int const *") int[] xywh, @NativeType("struct nk_rect") NkRect __result) {
        if (CHECKS) {
            check(xywh, 4);
        }
        nnk_rectiv(xywh, __result.address());
        return __result;
    }

    /** {@code nk_bool nk_strmatch_fuzzy_string(char const * str, char const * pattern, int * out_score)} */
    public static native boolean nnk_strmatch_fuzzy_string(long str, long pattern, int[] out_score);

    /** {@code nk_bool nk_strmatch_fuzzy_string(char const * str, char const * pattern, int * out_score)} */
    @NativeType("nk_bool")
    public static boolean nk_strmatch_fuzzy_string(@NativeType("char const *") ByteBuffer str, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") int[] out_score) {
        if (CHECKS) {
            checkNT1(str);
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_string(memAddress(str), memAddress(pattern), out_score);
    }

    /** {@code nk_bool nk_strmatch_fuzzy_string(char const * str, char const * pattern, int * out_score)} */
    @NativeType("nk_bool")
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
            return nnk_strmatch_fuzzy_string(strEncoded, patternEncoded, out_score);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code int nk_strmatch_fuzzy_text(char const * txt, int txt_len, char const * pattern, int * out_score)} */
    public static native int nnk_strmatch_fuzzy_text(long txt, int txt_len, long pattern, int[] out_score);

    /** {@code int nk_strmatch_fuzzy_text(char const * txt, int txt_len, char const * pattern, int * out_score)} */
    public static int nk_strmatch_fuzzy_text(@NativeType("char const *") ByteBuffer txt, @NativeType("char const *") ByteBuffer pattern, @NativeType("int *") int[] out_score) {
        if (CHECKS) {
            checkNT1(pattern);
            check(out_score, 1);
        }
        return nnk_strmatch_fuzzy_text(memAddress(txt), txt.remaining(), memAddress(pattern), out_score);
    }

    /** {@code int nk_strmatch_fuzzy_text(char const * txt, int txt_len, char const * pattern, int * out_score)} */
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

    /** {@code int nk_utf_decode(char const * c, nk_rune * u, int clen)} */
    public static native int nnk_utf_decode(long c, int[] u, int clen);

    /** {@code int nk_utf_decode(char const * c, nk_rune * u, int clen)} */
    public static int nk_utf_decode(@NativeType("char const *") ByteBuffer c, @NativeType("nk_rune *") int[] u) {
        if (CHECKS) {
            check(u, 1);
        }
        return nnk_utf_decode(memAddress(c), u, c.remaining());
    }

    /** {@code char const * nk_utf_at(char const * buffer, int length, int index, nk_rune * unicode, int * len)} */
    public static native long nnk_utf_at(long buffer, int length, int index, int[] unicode, long len);

    /** {@code char const * nk_utf_at(char const * buffer, int length, int index, nk_rune * unicode, int * len)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer nk_utf_at(@NativeType("char const *") ByteBuffer buffer, int index, @NativeType("nk_rune *") int[] unicode) {
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

    /** {@code int nk_str_append_text_runes(struct nk_str * s, nk_rune const * runes, int len)} */
    public static native int nnk_str_append_text_runes(long s, int[] runes, int len);

    /** {@code int nk_str_append_text_runes(struct nk_str * s, nk_rune const * runes, int len)} */
    public static int nk_str_append_text_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") int[] runes) {
        return nnk_str_append_text_runes(s.address(), runes, runes.length);
    }

    /** {@code int nk_str_append_str_runes(struct nk_str * s, nk_rune const * runes)} */
    public static native int nnk_str_append_str_runes(long s, int[] runes);

    /** {@code int nk_str_append_str_runes(struct nk_str * s, nk_rune const * runes)} */
    public static int nk_str_append_str_runes(@NativeType("struct nk_str *") NkStr s, @NativeType("nk_rune const *") int[] runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_append_str_runes(s.address(), runes);
    }

    /** {@code int nk_str_insert_text_runes(struct nk_str * s, int pos, nk_rune const * runes, int len)} */
    public static native int nnk_str_insert_text_runes(long s, int pos, int[] runes, int len);

    /** {@code int nk_str_insert_text_runes(struct nk_str * s, int pos, nk_rune const * runes, int len)} */
    public static int nk_str_insert_text_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") int[] runes) {
        return nnk_str_insert_text_runes(s.address(), pos, runes, runes.length);
    }

    /** {@code int nk_str_insert_str_runes(struct nk_str * s, int pos, nk_rune const * runes)} */
    public static native int nnk_str_insert_str_runes(long s, int pos, int[] runes);

    /** {@code int nk_str_insert_str_runes(struct nk_str * s, int pos, nk_rune const * runes)} */
    public static int nk_str_insert_str_runes(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune const *") int[] runes) {
        if (CHECKS) {
            checkNT(runes);
        }
        return nnk_str_insert_str_runes(s.address(), pos, runes);
    }

    /** {@code char * nk_str_at_rune(struct nk_str * s, int pos, nk_rune * unicode, int * len)} */
    public static native long nnk_str_at_rune(long s, int pos, int[] unicode, long len);

    /** {@code char * nk_str_at_rune(struct nk_str * s, int pos, nk_rune * unicode, int * len)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer nk_str_at_rune(@NativeType("struct nk_str *") NkStr s, int pos, @NativeType("nk_rune *") int[] unicode) {
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

    /** {@code char const * nk_str_at_const(struct nk_str const * s, int pos, nk_rune * unicode, int * len)} */
    public static native long nnk_str_at_const(long s, int pos, int[] unicode, long len);

    /** {@code char const * nk_str_at_const(struct nk_str const * s, int pos, nk_rune * unicode, int * len)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer nk_str_at_const(@NativeType("struct nk_str const *") NkStr s, int pos, @NativeType("nk_rune *") int[] unicode) {
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

    /** {@code void nk_stroke_polyline(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color col)} */
    public static native void nnk_stroke_polyline(long b, float[] points, int point_count, float line_thickness, long col);

    /** {@code void nk_stroke_polyline(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color col)} */
    public static void nk_stroke_polyline(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float const *") float[] points, float line_thickness, @NativeType("struct nk_color") NkColor col) {
        nnk_stroke_polyline(b.address(), points, points.length >> 1, line_thickness, col.address());
    }

    /** {@code void nk_stroke_polygon(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color color)} */
    public static native void nnk_stroke_polygon(long b, float[] points, int point_count, float line_thickness, long color);

    /** {@code void nk_stroke_polygon(struct nk_command_buffer * b, float const * points, int point_count, float line_thickness, struct nk_color color)} */
    public static void nk_stroke_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float const *") float[] points, float line_thickness, @NativeType("struct nk_color") NkColor color) {
        nnk_stroke_polygon(b.address(), points, points.length >> 1, line_thickness, color.address());
    }

    /** {@code void nk_fill_polygon(struct nk_command_buffer * b, float const * points, int point_count, struct nk_color color)} */
    public static native void nnk_fill_polygon(long b, float[] points, int point_count, long color);

    /** {@code void nk_fill_polygon(struct nk_command_buffer * b, float const * points, int point_count, struct nk_color color)} */
    public static void nk_fill_polygon(@NativeType("struct nk_command_buffer *") NkCommandBuffer b, @NativeType("float const *") float[] points, @NativeType("struct nk_color") NkColor color) {
        nnk_fill_polygon(b.address(), points, points.length >> 1, color.address());
    }

    /** {@code void const * nk_font_atlas_bake(struct nk_font_atlas * atlas, int * width, int * height, enum nk_font_atlas_format fmt)} */
    public static native long nnk_font_atlas_bake(long atlas, int[] width, int[] height, int fmt);

    /** {@code void const * nk_font_atlas_bake(struct nk_font_atlas * atlas, int * width, int * height, enum nk_font_atlas_format fmt)} */
    @NativeType("void const *")
    public static @Nullable ByteBuffer nk_font_atlas_bake(@NativeType("struct nk_font_atlas *") NkFontAtlas atlas, @NativeType("int *") int[] width, @NativeType("int *") int[] height, @NativeType("enum nk_font_atlas_format") int fmt) {
        if (CHECKS) {
            check(width, 1);
            check(height, 1);
        }
        long __result = nnk_font_atlas_bake(atlas.address(), width, height, fmt);
        return memByteBufferSafe(__result, width[0] * height[0] * (fmt == NK_FONT_ATLAS_RGBA32 ? 4 : 1));
    }

}