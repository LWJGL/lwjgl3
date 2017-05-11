/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.nuklear

import org.lwjgl.generator.*

val NUKLEAR_PACKAGE = "org.lwjgl.nuklear"

fun config() {
    packageInfo(
        NUKLEAR_PACKAGE,
        """
        Bindings to the ${url("https://github.com/vurtun/nuklear", "Nuklear")} library.

        A minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was designed as a
        simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input handling but
        instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as output. So
        instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual UI.

        Developed by Micha Mettke.
        """
    )
}

val Int.NK_FLAG: String
    get() = "1 << $this"

val nk_ushort = typedef(uint16_t, "nk_ushort")
val nk_int = typedef(int32_t, "nk_int")
val nk_uint = typedef(uint32_t, "nk_uint")
val nk_hash = typedef(nk_uint, "nk_hash")
val nk_size = typedef(uintptr_t, "nk_size")
val nk_flags = typedef(uint32_t, "nk_flags")
val nk_rune = typedef(uint32_t, "nk_rune")
val nk_byte = typedef(uint8_t, "nk_byte")

val nk_byte_p = nk_byte.p
val nk_ushort_p = nk_ushort.p
val nk_uint_p = nk_uint.p
val nk_rune_p = nk_rune.p

val nk_handle = union(NUKLEAR_PACKAGE, "NkHandle", nativeName = "nk_handle") {
    nullable..opaque_p.member("ptr", "")
    int.member("id", "")
}
// Struct values are currently not supported in callbacks
val nk_handle_in_callback = "nk_handle".opaque_p

val NK_UTF_SIZE = 4
val nk_glyph = char_p

val nk_anti_aliasing = "enum nk_anti_aliasing".enumType
val nk_allocation_type = "enum nk_allocation_type".enumType
val nk_command_type = "enum nk_command_type".enumType
val nk_style_item_type = "enum nk_style_item_type".enumType
val nk_symbol_type = "enum nk_symbol_type".enumType
val nk_style_header_align = "enum nk_style_header_align".enumType
val nk_chart_type = "enum nk_chart_type".enumType
val nk_panel_type = "enum nk_panel_type".enumType
val nk_panel_row_layout_type = "enum nk_panel_row_layout_type".enumType
val nk_collapse_states = "enum nk_collapse_states".enumType
val nk_show_states = "enum nk_show_states".enumType
val nk_layout_format = "enum nk_layout_format".enumType
val nk_tree_type = "enum nk_tree_type".enumType
val nk_button_behavior = "enum nk_button_behavior".enumType
val nk_color_format = "enum nk_color_format".enumType
val nk_popup_type = "enum nk_popup_type".enumType
val nk_keys = "enum nk_keys".enumType
val nk_buttons = "enum nk_buttons".enumType
val nk_style_colors = "enum nk_style_colors".enumType
val nk_style_cursor = "enum nk_style_cursor".enumType
val nk_widget_layout_states = "enum nk_widget_layout_states".enumType
val nk_heading = "enum nk_heading".enumType
val nk_buffer_allocation_type = "enum nk_buffer_allocation_type".enumType
val nk_draw_list_stroke = "enum nk_draw_list_stroke".enumType
val nk_draw_vertex_layout_attribute = "enum nk_draw_vertex_layout_attribute".enumType
val nk_draw_vertex_layout_format = "enum nk_draw_vertex_layout_format".enumType

// API

val nk_color = struct(NUKLEAR_PACKAGE, "NkColor", nativeName = "struct nk_color") {
    nk_byte.member("r", "")
    nk_byte.member("g", "")
    nk_byte.member("b", "")
    nk_byte.member("a", "")
}

val nk_vec2 = struct(NUKLEAR_PACKAGE, "NkVec2", nativeName = "struct nk_vec2") {
    float.member("x", "")
    float.member("y", "")
}

val nk_rect = struct(NUKLEAR_PACKAGE, "NkRect", nativeName = "struct nk_rect") {
    float.member("x", "")
    float.member("y", "")
    float.member("w", "")
    float.member("h", "")
}

val nk_image = struct(NUKLEAR_PACKAGE, "NkImage", nativeName = "struct nk_image") {
    nk_handle.member("handle", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    unsigned_short.array("region", "", size = 4)
}

val nk_cursor = struct(NUKLEAR_PACKAGE, "NkCursor", nativeName = "struct nk_cursor") {
    nk_image.member("img", "")
    nk_vec2.member("size", "")
    nk_vec2.member("offset", "")
}
val nk_cursor_p = nk_cursor.p

val nk_scroll = struct(NUKLEAR_PACKAGE, "NkScroll", nativeName = "struct nk_scroll", mutable = false) {
    nk_uint.member("x", "")
    nk_uint.member("y", "")
}
val nk_scroll_p = nk_scroll.p

val nk_plugin_alloc = "nk_plugin_alloc".callback(
    NUKLEAR_PACKAGE, void_p, "NkPluginAlloc",
    "",

    nk_handle_in_callback.IN("handle", ""),
    opaque_p.IN("old", ""),
    nk_size.IN("size", "")
)

val nk_plugin_free = "nk_plugin_free".callback(
    NUKLEAR_PACKAGE, void, "NkPluginFree",
    "",

    nk_handle_in_callback.IN("handle", ""),
    opaque_p.IN("old", "")
)

val nk_allocator = struct(NUKLEAR_PACKAGE, "NkAllocator", nativeName = "struct nk_allocator") {
    nk_handle.member("userdata", "")
    nullable..nk_plugin_alloc.member("alloc", "")
    nullable..nk_plugin_free.member("mfree", "")
}
val nk_allocator_p = nk_allocator.p

val nk_draw_null_texture = struct(NUKLEAR_PACKAGE, "NkDrawNullTexture", nativeName = "struct nk_draw_null_texture") {
    nk_handle.member("texture", "texture handle to a texture with a white pixel")
    nk_vec2.member("uv", "coordinates to a white pixel in the texture")
}

val nk_draw_vertex_layout_element_p = struct(NUKLEAR_PACKAGE, "NkDrawVertexLayoutElement", nativeName = "struct nk_draw_vertex_layout_element") {
    nk_draw_vertex_layout_attribute.member("attribute", "the vertex attribute").links("VERTEX_\\w+")
    nk_draw_vertex_layout_format.member("format", "the vertex attribute format").links("FORMAT_(?!COUNT)\\w+")
    nk_size.member("offset", "the vertex attribute offset")
}.p

val nk_convert_config = struct(NUKLEAR_PACKAGE, "NkConvertConfig", nativeName = "struct nk_convert_config") {
    float.member("global_alpha", "global alpha value")
    nk_anti_aliasing.member("line_AA", "line anti-aliasing flag can be turned off if you are tight on memory").links("ANTI_ALIASING_\\w+")
    nk_anti_aliasing.member("shape_AA", "shape anti-aliasing flag can be turned off if you are tight on memory").links("ANTI_ALIASING_\\w+")
    unsigned_int.member("circle_segment_count", "number of segments used for circles: default to 22")
    unsigned_int.member("arc_segment_count", "number of segments used for arcs: default to 22")
    unsigned_int.member("curve_segment_count", "number of segments used for curves: default to 22")
    nk_draw_null_texture.member("null_texture", "handle to texture with a white pixel for shape drawing")
    nk_draw_vertex_layout_element_p.buffer("vertex_layout", "describes the vertex output format and packing")
    nk_size.member("vertex_size", "sizeof one vertex for vertex packing")
    nk_size.member("vertex_alignment", "vertex alignment: Can be optained by NK_ALIGNOF")
}

val nk_list_view_p = struct(NUKLEAR_PACKAGE, "NkListView", nativeName = "struct nk_list_view", mutable = false) {
    int.member("begin", "")
    int.member("end", "")
    int.member("count", "")

    int.member("total_height", "").public = false
    struct(NUKLEAR_PACKAGE, "NkContext", nativeName = "struct nk_context").p.member("ctx", "").public = false
    nk_uint_p.member("scroll_pointer", "").public = false
    nk_uint.member("scroll_value", "").public = false
}.p

// MEMORY BUFFER

val nk_memory_status = struct(NUKLEAR_PACKAGE, "NkMemoryStatus", nativeName = "struct nk_memory_status", mutable = false) {
    void_p.member("memory", "")
    unsigned_int.member("type", "")
    AutoSize("memory")..nk_size.member("size", "")
    nk_size.member("allocated", "")
    nk_size.member("needed", "")
    nk_size.member("calls", "")
}

val nk_buffer_marker = struct(NUKLEAR_PACKAGE, "NkBufferMarker", nativeName = "struct nk_buffer_marker", mutable = false) {
    int.member("active", "")
    nk_size.member("offset", "")
}

val nk_memory = struct(NUKLEAR_PACKAGE, "NkMemory", nativeName = "struct nk_memory", mutable = false) {
    nullable..void_p.member("ptr", "")
    AutoSize("ptr")..nk_size.member("size", "")
}

val nk_buffer = struct(NUKLEAR_PACKAGE, "NkBuffer", nativeName = "struct nk_buffer", mutable = false) {
    nk_buffer_marker.array("marker", "buffer marker to free a buffer to a certain offset", size = 2)
    nk_allocator.member("pool", "allocator callback for dynamic buffers")
    nk_allocation_type.member("type", "memory management type")
    nk_memory.member("memory", "memory and size of the current memory block")
    float.member("grow_factor", "growing factor for dynamic memory management")
    nk_size.member("allocated", "total amount of memory allocated")
    nk_size.member("needed", "totally consumed memory given that enough memory is present")
    nk_size.member("calls", "number of allocation calls")
    nk_size.member("size", "current size of the buffer")
}
val nk_buffer_p = nk_buffer.p

// STRING

val nk_str = struct(NUKLEAR_PACKAGE, "NkStr", nativeName = "struct nk_str", mutable = false) {
    documentation =
        """
        Basic string buffer which is only used in context with the text editor to manage and manipulate dynamic or
        fixed size string content. This is <em>NOT</em> the default string handling method. The only instance you
        should have any contact with this API is if you interact with an ##NkTextEdit object inside one of the copy and
        paste functions and even there only for more advanced cases.
        """
    nk_buffer.member("buffer", "")
    int.member("len", "in codepoints/runes/glyphs")
}
val nk_str_p = nk_str.p

// TEXT EDITOR

val nk_text_edit_p = struct(NUKLEAR_PACKAGE, "NkTextEdit", nativeName = "struct nk_text_edit").p

val nk_plugin_filter = "nk_plugin_filter".callback(
    NUKLEAR_PACKAGE, int, "NkPluginFilter",
    "",

    const..nk_text_edit_p.IN("edit", ""),
    nk_rune.IN("unicode", "")
) {
    documentation = "Instances of this interface may be set to the ##NkTextEdit struct."
}

val nk_plugin_paste = "nk_plugin_paste".callback(
    NUKLEAR_PACKAGE, void, "NkPluginPaste",
    "",

    nk_handle_in_callback.IN("handle", ""),
    nk_text_edit_p.IN("edit", "")
) {
    documentation = "Instances of this interface may be set to the ##NkClipboard struct."
}

val nk_plugin_copy = "nk_plugin_copy".callback(
    NUKLEAR_PACKAGE, void, "NkPluginCopy",
    "",

    nk_handle_in_callback.IN("handle", ""),
    const..charUTF8_p.IN("text", ""),
    int.IN("len", "")
) {
    documentation = "Instances of this interface may be set to the ##NkClipboard struct."
}

val nk_clipboard = struct(NUKLEAR_PACKAGE, "NkClipboard", nativeName = "struct nk_clipboard") {
    nk_handle.member("userdata", "")
    nullable..nk_plugin_paste.member("paste", "")
    nullable..nk_plugin_copy.member("copy", "")
}

val nk_text_undo_record = struct(NUKLEAR_PACKAGE, "NkTextUndoRecord", nativeName = "struct nk_text_undo_record", mutable = false) {
    access = Access.INTERNAL

    int.member("where", "")
    short.member("insert_length", "")
    short.member("delete_length", "")
    short.member("char_storage", "")
}

val NK_TEXTEDIT_UNDOSTATECOUNT = 99
val NK_TEXTEDIT_UNDOCHARCOUNT = 999
val nk_text_undo_state = struct(NUKLEAR_PACKAGE, "NkTextUndoState", nativeName = "struct nk_text_undo_state", mutable = false) {
    access = Access.INTERNAL

    nk_text_undo_record.array("undo_rec", "", size = NK_TEXTEDIT_UNDOSTATECOUNT)
    nk_rune.array("undo_char", "", size = NK_TEXTEDIT_UNDOCHARCOUNT)
    short.member("undo_point", "")
    short.member("redo_point", "")
    short.member("undo_char_point", "")
    short.member("redo_char_point", "")
}

val nk_text_edit = struct(NUKLEAR_PACKAGE, "NkTextEdit", nativeName = "struct nk_text_edit", mutable = false) {
    access = Access.INTERNAL

    nk_clipboard.member("clip", "")
    nk_str.member("string", "")
    nullable..nk_plugin_filter.member("filter", "")
    nk_vec2.member("scrollbar", "")

    int.member("cursor", "")
    int.member("select_start", "")
    int.member("select_end", "")
    unsigned_char.member("mode", "")
    bool.member("cursor_at_end_of_line", "")
    bool.member("initialized", "")
    bool.member("has_preferred_x", "")
    bool.member("single_line", "")
    bool.member("active", "")
    padding(1)
    float.member("preferred_x", "")
    nk_text_undo_state.member("undo", "")
}

// FONT

val nk_user_font_glyph = struct(NUKLEAR_PACKAGE, "NkUserFontGlyph", nativeName = "struct nk_user_font_glyph") {
    nk_vec2.array("uv", "texture coordinates", size = 2)
    nk_vec2.member("offset", "offset between top left and glyph")
    float.member("width", "width of the glyph")
    float.member("height", "height of the glyph")
    float.member("xadvance", "offset to the next glyph")
}

val nk_text_width_f = "nk_text_width_f".callback(
    NUKLEAR_PACKAGE, float, "NkTextWidthCallback",
    "",

    nk_handle_in_callback.IN("handle", ""),
    float.IN("h", ""),
    const..charUTF8_p.IN("text", ""),
    int.IN("len", "")
) {
    documentation = "Instances of this interface may be set to the ##NkUserFont struct."
}

val nk_query_font_glyph_f = "nk_query_font_glyph_f".callback(
    NUKLEAR_PACKAGE, void, "NkQueryFontGlyphCallback",
    "",

    nk_handle_in_callback.IN("handle", ""),
    float.IN("font_height", ""),
    nk_user_font_glyph.p.IN("glyph", ""),
    nk_rune.IN("codepoint", ""),
    nk_rune.IN("next_codepoint", "")
) {
    documentation = "Instances of this interface may be set to the ##NkUserFont struct."
}

val nk_user_font = struct(NUKLEAR_PACKAGE, "NkUserFont", nativeName = "struct nk_user_font") {
    nk_handle.member("userdata", "user provided font handle")
    float.member("height", "max height of the font")
    nullable..nk_text_width_f.member("width", "font string width in pixel callback")
    nullable..nk_query_font_glyph_f.member("query", "font glyph callback to query drawing info")
    nk_handle.member("texture", "texture handle to the used font atlas or texture")
}
val nk_user_font_p = nk_user_font.p

// DRAWING
val nk_command = struct(NUKLEAR_PACKAGE, "NkCommand", nativeName = "struct nk_command", mutable = false) {
    nk_command_type.member("type", "")
    nk_size.member("next", "")
    nk_handle.member("userdata", "")
}

/*val nk_command_scissor = struct(NUKLEAR_PACKAGE, "NkCommandScissor", nativeName = "struct nk_command_scissor") {
    nk_command.member("header", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
}

val nk_command_line = struct(NUKLEAR_PACKAGE, "NkCommandLine", nativeName = "struct nk_command_line") {
    nk_command.member("header", "")
    unsigned_short.member("line_thickness", "")
    nk_vec2i.member("begin", "")
    nk_vec2i.member("end", "")
    nk_color.member("color", "")
}

val nk_command_curve = struct(NUKLEAR_PACKAGE, "NkCommandCurve", nativeName = "struct nk_command_curve") {
    nk_command.member("header", "")
    unsigned_short.member("line_thickness", "")
    nk_vec2i.member("begin", "")
    nk_vec2i.member("end", "")
    nk_vec2i.array("ctrl", "", size = 2)
    nk_color.member("color", "")
}

val nk_command_rect = struct(NUKLEAR_PACKAGE, "NkCommandRect", nativeName = "struct nk_command_rect") {
    nk_command.member("header", "")
    unsigned_short.member("rounding", "")
    unsigned_short.member("line_thickness", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_color.member("color", "")
}

val nk_command_rect_filled = struct(NUKLEAR_PACKAGE, "NkCmmandRectFilled", nativeName = "struct nk_command_rect_filled") {
    nk_command.member("header", "")
    unsigned_short.member("rounding", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_color.member("color", "")
}

val nk_command_rect_multi_color = struct(NUKLEAR_PACKAGE, "NkCommandRectMultiColor", nativeName = "struct nk_command_rect_multi_color") {
    nk_command.member("header", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_color.member("left", "")
    nk_color.member("top", "")
    nk_color.member("bottom", "")
    nk_color.member("right", "")
}

val nk_command_triangle = struct(NUKLEAR_PACKAGE, "NkCommandTriangle", nativeName = "struct nk_command_triangle") {
    nk_command.member("header", "")
    unsigned_short.member("line_thickness", "")
    nk_vec2i.member("a", "")
    nk_vec2i.member("b", "")
    nk_vec2i.member("c", "")
    nk_color.member("color", "")
}

val nk_command_triangle_filled = struct(NUKLEAR_PACKAGE, "NkCommandTriangleFilled", nativeName = "struct nk_command_triangle_filled") {
    nk_command.member("header", "")
    nk_vec2i.member("a", "")
    nk_vec2i.member("b", "")
    nk_vec2i.member("c", "")
    nk_color.member("color", "")
}

val nk_command_circle = struct(NUKLEAR_PACKAGE, "NkCommandCircle", nativeName = "struct nk_command_circle") {
    nk_command.member("header", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("line_thickness", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_color.member("color", "")
}

val nk_command_circle_filled = struct(NUKLEAR_PACKAGE, "NkCommandCircleFilled", nativeName = "struct nk_command_circle_filled") {
    nk_command.member("header", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_color.member("color", "")
}

val nk_command_arc = struct(NUKLEAR_PACKAGE, "NkCommandArc", nativeName = "struct nk_command_arc") {
    nk_command.member("header", "")
    short.member("cx", "")
    short.member("cy", "")
    unsigned_short.member("r", "")
    unsigned_short.member("line_thickness", "")
    float.array("a", "", size = 2)
    nk_color.member("color", "")
}

val nk_command_arc_filled = struct(NUKLEAR_PACKAGE, "NkCommandArcFilled", nativeName = "struct nk_command_arc_filled") {
    nk_command.member("header", "")
    short.member("cx", "")
    short.member("cy", "")
    unsigned_short.member("r", "")
    float.array("a", "", size = 2)
    nk_color.member("color", "")
}

val nk_command_polygon = struct(NUKLEAR_PACKAGE, "NkCommandPolygon", nativeName = "struct nk_command_polygon") {
    nk_command.member("header", "")
    nk_color.member("color", "")
    unsigned_short.member("line_thickness", "")
    unsigned_short.member("point_count", "")
    nk_vec2i.array("points", "", size = 1)
}

val nk_command_polygon_filled = struct(NUKLEAR_PACKAGE, "NkCommandPolygonFilled", nativeName = "struct nk_command_polygon_filled") {
    nk_command.member("header", "")
    nk_color.member("color", "")
    unsigned_short.member("point_count", "")
    nk_vec2i.array("points", "", size = 1)
}

val nk_command_polyline = struct(NUKLEAR_PACKAGE, "NkCommandPolyline", nativeName = "struct nk_command_polyline") {
    nk_command.member("header", "")
    nk_color.member("color", "")
    unsigned_short.member("line_thickness", "")
    unsigned_short.member("point_count", "")
    nk_vec2i.array("points", "", size = 1)
}

val nk_command_image = struct(NUKLEAR_PACKAGE, "NkCommandImage", nativeName = "struct nk_command_image") {
    nk_command.member("header", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_image.member("img", "")
    nk_color.member("col", "")
}

val nk_command_text = struct(NUKLEAR_PACKAGE, "NkCommandText", nativeName = "struct nk_command_text") {
    nk_command.member("header", "")
    const..nk_user_font.p.member("font", "")
    nk_color.member("background", "")
    nk_color.member("foreground", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    float.member("height", "")
    int.member("length", "")
    char.array("string", "", size = 1)
}*/

val nk_command_custom_callback = "nk_command_custom_callback".callback(
    NUKLEAR_PACKAGE, void_p, "NkCommandCustomCallback",
    "",

    opaque_p.IN("canvas", ""),
    short.IN("x", ""),
    short.IN("y", ""),
    unsigned_short.IN("w", ""),
    unsigned_short.IN("h", ""),
    nk_handle_in_callback.IN("callback_data", "")
)

/*val nk_command_custom = struct(NUKLEAR_PACKAGE, "NkCommandCustom", nativeName = "struct nk_command_custom") {
    nk_command.member("header", "")
    short.member("x", "")
    short.member("y", "")
    unsigned_short.member("w", "")
    unsigned_short.member("h", "")
    nk_handle.member("callback_data", "")
    nk_command_custom_callback.member("callback", "")
}*/

val nk_command_buffer = struct(NUKLEAR_PACKAGE, "NkCommandBuffer", nativeName = "struct nk_command_buffer", mutable = false) {
    nullable..nk_buffer_p.member("base", "")
    nk_rect.member("clip", "")
    int.member("use_clipping", "")
    nk_handle.member("userdata", "")
    nk_size.member("begin", "")
    nk_size.member("end", "")
    nk_size.member("last", "")
}
val nk_command_buffer_p = nk_command_buffer.p

// INPUT

val nk_mouse_button = struct(NUKLEAR_PACKAGE, "NkMouseButton", nativeName = "struct nk_mouse_button", mutable = false) {
    int.member("down", "")
    unsigned_int.member("clicked", "")
    nk_vec2.member("clicked_pos", "")
}

val nk_mouse = struct(NUKLEAR_PACKAGE, "NkMouse", nativeName = "struct nk_mouse", mutable = false) {
    javaImport("static org.lwjgl.nuklear.Nuklear.NK_BUTTON_MAX")

    nk_mouse_button.array("buttons", "", size = "NK_BUTTON_MAX")
    nk_vec2.member("pos", "")
    nk_vec2.member("prev", "")
    nk_vec2.member("delta", "")
    nk_vec2.member("scroll_delta", "")
    bool.member("grab", "")
    bool.member("grabbed", "")
    bool.member("ungrab", "")
}

val nk_key = struct(NUKLEAR_PACKAGE, "NkKey", nativeName = "struct nk_key", mutable = false) {
    int.member("down", "")
    unsigned_int.member("clicked", "")
}

val nk_keyboard = struct(NUKLEAR_PACKAGE, "NkKeyboard", nativeName = "struct nk_keyboard", mutable = false) {
    javaImport("static org.lwjgl.nuklear.Nuklear.*")

    nk_key.array("keys", "", size = "NK_KEY_MAX")
    char.array("text", "", size = "NK_INPUT_MAX")
    int.member("text_len", "")
}

val nk_input = struct(NUKLEAR_PACKAGE, "NkInput", nativeName = "struct nk_input", mutable = false) {
    nk_keyboard.member("keyboard", "")
    nk_mouse.member("mouse", "")
}
val nk_input_p = nk_input.p

// DRAW LIST

val nk_draw_command_p = struct(NUKLEAR_PACKAGE, "NkDrawCommand", nativeName = "struct nk_draw_command", mutable = false) {
    unsigned_int.member("elem_count", "")
    /* number of elements in the current draw batch */
    nk_rect.member("clip_rect", "")
    /* current screen clipping rectangle */
    nk_handle.member("texture", "")
    /* current texture to set */
    nk_handle.member("userdata", "")
}.p

val nk_draw_list = struct(NUKLEAR_PACKAGE, "NkDrawList", nativeName = "struct nk_draw_list", mutable = false) {
    nk_rect.member("clip_rect", "")
    nk_vec2.array("circle_vtx", "", size = 12)
    nk_convert_config.member("config", "")
    nullable..nk_buffer_p.member("buffer", "")
    nullable..nk_buffer_p.member("vertices", "")
    nullable..nk_buffer_p.member("elements", "")
    unsigned_int.member("element_count", "")
    unsigned_int.member("vertex_count", "")
    unsigned_int.member("cmd_count", "")
    nk_size.member("cmd_offset", "")
    unsigned_int.member("path_count", "")
    unsigned_int.member("path_offset", "")
    nk_handle.member("userdata", "")
}
val nk_draw_list_p = nk_draw_list.p

// GUI

val nk_style_item_data = union(NUKLEAR_PACKAGE, "NkStyleItemData", nativeName = "union nk_style_item_data") {
    nk_image.member("image", "")
    nk_color.member("color", "")
}

val nk_style_item = struct(NUKLEAR_PACKAGE, "NkStyleItem", nativeName = "struct nk_style_item") {
    nk_style_item_type.member("type", "the style type").links("STYLE_ITEM_\\w+")
    nk_style_item_data.member("data", "the style data")
}

val nk_style_text = struct(NUKLEAR_PACKAGE, "NkStyleText", nativeName = "struct nk_style_text") {
    nk_color.member("color", "")
    nk_vec2.member("padding", "")
}

val nk_draw_begin = "nk_draw_begin".callback(
    NUKLEAR_PACKAGE, float, "NkDrawBeginCallback",
    "",

    nk_command_buffer_p.IN("buffer", ""),
    nk_handle_in_callback.IN("userdata", "")
) {
    documentation = "Instances of this interface may be set to the {@code nk_style_*} structs."
}

val nk_draw_end = "nk_draw_end".callback(
    NUKLEAR_PACKAGE, float, "NkDrawEndCallback",
    "",

    nk_command_buffer_p.IN("buffer", ""),
    nk_handle_in_callback.IN("userdata", "")
) {
    documentation = "Instances of this interface may be set to the {@code nk_style_*} structs."
}

val nk_style_button = struct(NUKLEAR_PACKAGE, "NkStyleButton", nativeName = "struct nk_style_button") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* text */
    nk_color.member("text_background", "")
    nk_color.member("text_normal", "")
    nk_color.member("text_hover", "")
    nk_color.member("text_active", "")
    nk_flags.member("text_alignment", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    nk_vec2.member("padding", "")
    nk_vec2.member("image_padding", "")
    nk_vec2.member("touch_padding", "")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}
val nk_style_button_p = nk_style_button.p

val nk_style_toggle = struct(NUKLEAR_PACKAGE, "NkStyleToggle", nativeName = "struct nk_style_toggle") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* cursor */
    nk_style_item.member("cursor_normal", "")
    nk_style_item.member("cursor_hover", "")

    /* text */
    nk_color.member("text_normal", "")
    nk_color.member("text_hover", "")
    nk_color.member("text_active", "")
    nk_color.member("text_background", "")
    nk_flags.member("text_alignment", "")

    /* properties */
    nk_vec2.member("padding", "")
    nk_vec2.member("touch_padding", "")
    float.member("spacing", "")
    float.member("border", "")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}

val nk_style_selectable = struct(NUKLEAR_PACKAGE, "NkStyleSelectable", nativeName = "struct nk_style_selectable") {
    /* background (inactive) */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("pressed", "")

    /* background (active) */
    nk_style_item.member("normal_active", "")
    nk_style_item.member("hover_active", "")
    nk_style_item.member("pressed_active", "")

    /* text color (inactive) */
    nk_color.member("text_normal", "")
    nk_color.member("text_hover", "")
    nk_color.member("text_pressed", "")

    /* text color (active) */
    nk_color.member("text_normal_active", "")
    nk_color.member("text_hover_active", "")
    nk_color.member("text_pressed_active", "")
    nk_color.member("text_background", "")
    nk_flags.member("text_alignment", "")

    /* properties */
    float.member("rounding", "")
    nk_vec2.member("padding", "")
    nk_vec2.member("touch_padding", "")
    nk_vec2.member("image_padding", "")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}

val nk_style_slider = struct(NUKLEAR_PACKAGE, "NkStyleSlider", nativeName = "struct nk_style_slider") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* background bar */
    nk_color.member("bar_normal", "")
    nk_color.member("bar_hover", "")
    nk_color.member("bar_active", "")
    nk_color.member("bar_filled", "")

    /* cursor */
    nk_style_item.member("cursor_normal", "")
    nk_style_item.member("cursor_hover", "")
    nk_style_item.member("cursor_active", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    float.member("bar_height", "")
    nk_vec2.member("padding", "")
    nk_vec2.member("spacing", "")
    nk_vec2.member("cursor_size", "")

    /* optional buttons */
    int.member("show_buttons", "")
    nk_style_button.member("inc_button", "")
    nk_style_button.member("dec_button", "")
    nk_symbol_type.member("inc_symbol", "").links("SYMBOL_\\w+")
    nk_symbol_type.member("dec_symbol", "see {@code inc_symbol}")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}

val nk_style_progress = struct(NUKLEAR_PACKAGE, "NkStyleProgress", nativeName = "struct nk_style_progress") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* cursor */
    nk_style_item.member("cursor_normal", "")
    nk_style_item.member("cursor_hover", "")
    nk_style_item.member("cursor_active", "")
    nk_color.member("cursor_border_color", "")

    /* properties */
    float.member("rounding", "")
    float.member("border", "")
    float.member("cursor_border", "")
    float.member("cursor_rounding", "")
    nk_vec2.member("padding", "")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}

val nk_style_scrollbar = struct(NUKLEAR_PACKAGE, "NkStyleScrollbar", nativeName = "struct nk_style_scrollbar") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* cursor */
    nk_style_item.member("cursor_normal", "")
    nk_style_item.member("cursor_hover", "")
    nk_style_item.member("cursor_active", "")
    nk_color.member("cursor_border_color", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    float.member("border_cursor", "")
    float.member("rounding_cursor", "")
    nk_vec2.member("padding", "")

    /* optional buttons */
    int.member("show_buttons", "")
    nk_style_button.member("inc_button", "")
    nk_style_button.member("dec_button", "")
    nk_symbol_type.member("inc_symbol", "").links("SYMBOL_\\w+")
    nk_symbol_type.member("dec_symbol", "see {@code inc_symbol}")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}

val nk_style_edit = struct(NUKLEAR_PACKAGE, "NkStyleEdit", nativeName = "struct nk_style_edit") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")
    nk_style_scrollbar.member("scrollbar", "")

    /* cursor  */
    nk_color.member("cursor_normal", "")
    nk_color.member("cursor_hover", "")
    nk_color.member("cursor_text_normal", "")
    nk_color.member("cursor_text_hover", "")

    /* text (unselected) */
    nk_color.member("text_normal", "")
    nk_color.member("text_hover", "")
    nk_color.member("text_active", "")

    /* text (selected) */
    nk_color.member("selected_normal", "")
    nk_color.member("selected_hover", "")
    nk_color.member("selected_text_normal", "")
    nk_color.member("selected_text_hover", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    float.member("cursor_size", "")
    nk_vec2.member("scrollbar_size", "")
    nk_vec2.member("padding", "")
    float.member("row_padding", "")
}

val nk_style_property = struct(NUKLEAR_PACKAGE, "NkStyleProperty", nativeName = "struct nk_style_property") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* text */
    nk_color.member("label_normal", "")
    nk_color.member("label_hover", "")
    nk_color.member("label_active", "")

    /* symbols */
    nk_symbol_type.member("sym_left", "").links("SYMBOL_\\w+")
    nk_symbol_type.member("sym_right", "see {@code sym_left}")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    nk_vec2.member("padding", "")

    nk_style_edit.member("edit", "")
    nk_style_button.member("inc_button", "")
    nk_style_button.member("dec_button", "")

    /* optional user callbacks */
    nk_handle.member("userdata", "")
    nullable..nk_draw_begin.member("draw_begin", "")
    nullable..nk_draw_end.member("draw_end", "")
}

val nk_style_chart = struct(NUKLEAR_PACKAGE, "NkStyleChart", nativeName = "struct nk_style_chart") {
    /* colors */
    nk_style_item.member("background", "")
    nk_color.member("border_color", "")
    nk_color.member("selected_color", "")
    nk_color.member("color", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    nk_vec2.member("padding", "")
}

val nk_style_combo = struct(NUKLEAR_PACKAGE, "NkStyleCombo", nativeName = "struct nk_style_combo") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")
    nk_color.member("border_color", "")

    /* label */
    nk_color.member("label_normal", "")
    nk_color.member("label_hover", "")
    nk_color.member("label_active", "")

    /* symbol */
    nk_color.member("symbol_normal", "")
    nk_color.member("symbol_hover", "")
    nk_color.member("symbol_active", "")

    /* button */
    nk_style_button.member("button", "")
    nk_symbol_type.member("sym_normal", "")
    nk_symbol_type.member("sym_hover", "")
    nk_symbol_type.member("sym_active", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    nk_vec2.member("content_padding", "")
    nk_vec2.member("button_padding", "")
    nk_vec2.member("spacing", "")
}

val nk_style_tab = struct(NUKLEAR_PACKAGE, "NkStyleTab", nativeName = "struct nk_style_tab") {
    /* background */
    nk_style_item.member("background", "")
    nk_color.member("border_color", "")
    nk_color.member("text", "")

    /* button */
    nk_style_button.member("tab_maximize_button", "")
    nk_style_button.member("tab_minimize_button", "")
    nk_style_button.member("node_maximize_button", "")
    nk_style_button.member("node_minimize_button", "")
    nk_symbol_type.member("sym_minimize", "")
    nk_symbol_type.member("sym_maximize", "")

    /* properties */
    float.member("border", "")
    float.member("rounding", "")
    float.member("indent", "")
    nk_vec2.member("padding", "")
    nk_vec2.member("spacing", "")
}

val nk_style_window_header = struct(NUKLEAR_PACKAGE, "NkStyleWindowHeader", nativeName = "struct nk_style_window_header") {
    /* background */
    nk_style_item.member("normal", "")
    nk_style_item.member("hover", "")
    nk_style_item.member("active", "")

    /* button */
    nk_style_button.member("close_button", "")
    nk_style_button.member("minimize_button", "")
    nk_symbol_type.member("close_symbol", "")
    nk_symbol_type.member("minimize_symbol", "")
    nk_symbol_type.member("maximize_symbol", "")

    /* title */
    nk_color.member("label_normal", "")
    nk_color.member("label_hover", "")
    nk_color.member("label_active", "")

    /* properties */
    nk_style_header_align.member("align", "").links("HEADER_\\w+")
    nk_vec2.member("padding", "")
    nk_vec2.member("label_padding", "")
    nk_vec2.member("spacing", "")
}

val nk_style_window = struct(NUKLEAR_PACKAGE, "NkStyleWindow", nativeName = "struct nk_style_window") {
    nk_style_window_header.member("header", "")
    nk_style_item.member("fixed_background", "")
    nk_color.member("background", "")

    nk_color.member("border_color", "")
    nk_color.member("popup_border_color", "")
    nk_color.member("combo_border_color", "")
    nk_color.member("contextual_border_color", "")
    nk_color.member("menu_border_color", "")
    nk_color.member("group_border_color", "")
    nk_color.member("tooltip_border_color", "")
    nk_style_item.member("scaler", "")

    float.member("border", "")
    float.member("combo_border", "")
    float.member("contextual_border", "")
    float.member("menu_border", "")
    float.member("group_border", "")
    float.member("tooltip_border", "")
    float.member("popup_border", "")

    float.member("rounding", "")
    nk_vec2.member("spacing", "")
    nk_vec2.member("scrollbar_size", "")
    nk_vec2.member("min_size", "")

    nk_vec2.member("padding", "")
    nk_vec2.member("group_padding", "")
    nk_vec2.member("popup_padding", "")
    nk_vec2.member("combo_padding", "")
    nk_vec2.member("contextual_padding", "")
    nk_vec2.member("menu_padding", "")
    nk_vec2.member("tooltip_padding", "")
}

val nk_style = struct(NUKLEAR_PACKAGE, "NkStyle", nativeName = "struct nk_style") {
    javaImport("static org.lwjgl.nuklear.Nuklear.NK_CURSOR_COUNT")

    nk_user_font_p.member("font", "")
    nullable..nk_cursor_p.array("cursors", "", size = "NK_CURSOR_COUNT")
    nullable..nk_cursor_p.member("cursor_active", "")
    nullable..nk_cursor_p.member("cursor_last", "")
    intb.member("cursor_visible", "")

    nk_style_text.member("text", "")
    nk_style_button.member("button", "")
    nk_style_button.member("contextual_button", "")
    nk_style_button.member("menu_button", "")
    nk_style_toggle.member("option", "")
    nk_style_toggle.member("checkbox", "")
    nk_style_selectable.member("selectable", "")
    nk_style_slider.member("slider", "")
    nk_style_progress.member("progress", "")
    nk_style_property.member("property", "")
    nk_style_edit.member("edit", "")
    nk_style_chart.member("chart", "")
    nk_style_scrollbar.member("scrollh", "")
    nk_style_scrollbar.member("scrollv", "")
    nk_style_tab.member("tab", "")
    nk_style_combo.member("combo", "")
    nk_style_window.member("window", "")
}

// PANEL

val nk_chart_slot = struct(NUKLEAR_PACKAGE, "NkChartSlot", nativeName = "struct nk_chart_slot", mutable = false) {
    nk_chart_type.member("type", "")
    nk_color.member("color", "")
    nk_color.member("highlight", "")
    float.member("min", "")
    float.member("max", "")
    float.member("range", "")
    int.member("count", "")
    nk_vec2.member("last", "")
    int.member("index", "")
}

val NK_CHART_MAX_SLOT = 4
val nk_chart = struct(NUKLEAR_PACKAGE, "NkChart", nativeName = "struct nk_chart", mutable = false) {
    int.member("slot", "")
    float.member("x", "")
    float.member("y", "")
    float.member("w", "")
    float.member("h", "")
    nk_chart_slot.array("slots", "", size = NK_CHART_MAX_SLOT)
}

val NK_MAX_LAYOUT_ROW_TEMPLATE_COLUMNS = 16
val nk_row_layout = struct(NUKLEAR_PACKAGE, "NkRowLayout", nativeName = "struct nk_row_layout", mutable = false) {
    nk_panel_row_layout_type.member("type", "").links("LAYOUT_\\w+")
    int.member("index", "")
    float.member("height", "")
    int.member("columns", "")
    const..float_p.member("ratio", "")
    float.member("item_width", "")
    float.member("item_height", "")
    float.member("item_offset", "")
    float.member("filled", "")
    nk_rect.member("item", "")
    int.member("tree_depth", "")
    float.array("templates", "", size = NK_MAX_LAYOUT_ROW_TEMPLATE_COLUMNS)
}

val nk_popup_buffer = struct(NUKLEAR_PACKAGE, "NkPopupBuffer", nativeName = "struct nk_popup_buffer", mutable = false) {
    nk_size.member("begin", "")
    nk_size.member("parent", "")
    nk_size.member("last", "")
    nk_size.member("end", "")
    int.member("active", "")
}

val nk_menu_state = struct(NUKLEAR_PACKAGE, "NkMenuState", nativeName = "struct nk_menu_state", mutable = false) {
    float.member("x", "")
    float.member("y", "")
    float.member("w", "")
    float.member("h", "")
    nk_scroll.member("offset", "")
}

val nk_panel_p = struct(NUKLEAR_PACKAGE, "NkPanel", nativeName = "struct nk_panel").p
val nk_panel = struct(NUKLEAR_PACKAGE, "NkPanel", nativeName = "struct nk_panel", mutable = false) {
    nk_panel_type.member("type", "").links("PANEL_\\w+")
    nk_flags.member("flags", "")
    nk_rect.member("bounds", "")
    nk_uint_p.member("offset_x", "")
    nk_uint_p.member("offset_y", "")
    float.member("at_x", "")
    float.member("at_y", "")
    float.member("max_x", "")
    float.member("footer_height", "")
    float.member("header_height", "")
    float.member("border", "")
    unsigned_int.member("has_scrolling", "")
    nk_rect.member("clip", "")
    nk_menu_state.member("menu", "")
    nk_row_layout.member("row", "")
    nk_chart.member("chart", "")
    nk_command_buffer_p.member("buffer", "")
    nk_panel_p.member("parent", "")
}

// WINDOW

val nk_window = struct(NUKLEAR_PACKAGE, "NkWindow", nativeName = "struct nk_window")
val nk_popup_state = struct(NUKLEAR_PACKAGE, "NkPopupState", nativeName = "struct nk_popup_state", mutable = false) {
    nk_window.p.member("win", "")
    nk_panel_type.member("type", "").links("PANEL_\\w+")
    nk_popup_buffer.member("buf", "")
    nk_hash.member("name", "")
    int.member("active", "")
    unsigned.member("combo_count", "")
    unsigned.member("con_count", "")
    unsigned.member("con_old", "")
    unsigned.member("active_con", "")
    nk_rect.member("header", "")
}

val nk_edit_state = struct(NUKLEAR_PACKAGE, "NkEditState", nativeName = "struct nk_edit_state", mutable = false) {
    nk_hash.member("name", "")
    unsigned_int.member("seq", "")
    unsigned_int.member("old", "")
    int.member("active", "")
    int.member("prev", "")
    int.member("cursor", "")
    int.member("sel_start", "")
    int.member("sel_end", "")
    nk_scroll.member("scrollbar", "")
    unsigned_char.member("mode", "")
    bool.member("single_line", "")
}

val nk_property_state = struct(NUKLEAR_PACKAGE, "NkPropertyState", nativeName = "struct nk_property_state", mutable = false) {
    javaImport("static org.lwjgl.nuklear.Nuklear.NK_MAX_NUMBER_BUFFER")

    int.member("active", "")
    int.member("prev", "")
    char.array("buffer", "", size = "NK_MAX_NUMBER_BUFFER")
    int.member("length", "")
    int.member("cursor", "")
    int.member("select_start", "")
    int.member("select_end", "")
    nk_hash.member("name", "")
    unsigned_int.member("seq", "")
    unsigned_int.member("old", "")
    int.member("state", "")
}

val NK_WINDOW_MAX_NAME = 64
val nk_window_p = struct(NUKLEAR_PACKAGE, "NkWindow", nativeName = "struct nk_window", mutable = false) {
    unsigned_int.member("seq", "")
    nk_hash.member("name", "")
    charUTF8.array("name_string", "", size = NK_WINDOW_MAX_NAME)
    nk_flags.member("flags", "")
    nk_rect.member("bounds", "")
    nk_scroll.member("scrollbar", "")
    nk_command_buffer.member("buffer", "")
    nk_panel.p.member("layout", "")
    float.member("scrollbar_hiding_timer", "")

    /* persistent widget state */
    nk_property_state.member("property", "")
    nk_popup_state.member("popup", "")
    nk_edit_state.member("edit", "")
    unsigned_int.member("scrolled", "")

    "nk_table".p.member("tables", "") // TODO: private API?
    unsigned_short.member("table_count", "")
    unsigned_short.member("table_size", "")

    /* window list hooks */
    nk_window.p.member("next", "")
    nk_window.p.member("prev", "")
    nk_window.p.member("parent", "")
}.p

val nk_pool = struct(NUKLEAR_PACKAGE, "NkPool", nativeName = "struct nk_pool", mutable = false) {
    access = Access.INTERNAL

    nk_allocator.member("alloc", "")
    nk_allocation_type.member("type", "")
    unsigned_int.member("page_count", "")
    "nk_page".p.member("pages", "")
    "nk_page_element".p.member("freelist", "")
    unsigned.member("capacity", "")
    nk_size.member("size", "")
    nk_size.member("cap", "")
}

fun NK_CONFIGURATION_STACK(address: PointerType, old_value: NativeType, javaName: String, name: String, size: Int): StructType {
    if (address.elementType != old_value)
        throw IllegalArgumentException()

    val element = struct(NUKLEAR_PACKAGE, "NkConfigStack${javaName}Element", nativeName = "struct nk_config_stack_${name}_element", mutable = false) {
        access = Access.INTERNAL

        address.member("pValues", "") // address
        old_value.member("old_value", "")
    }

    return struct(NUKLEAR_PACKAGE, "NkConfigStack$javaName", nativeName = "struct nk_config_stack_$name", mutable = false) {
        access = Access.INTERNAL

        int.member("head", "")
        element.array("elements", "", size = size)
    }
}

val nk_configuration_stacks = struct(NUKLEAR_PACKAGE, "NkConfigurationStacks", nativeName = "struct nk_configuration_stacks", mutable = false) {
    access = Access.INTERNAL

    NK_CONFIGURATION_STACK(nk_style_item.p, nk_style_item, "StyleItem", "style_item", size = 16).member("style_items", "")
    NK_CONFIGURATION_STACK(float_p, float, "Float", "float", size = 32).member("floats", "")
    NK_CONFIGURATION_STACK(nk_vec2.p, nk_vec2, "Vec2", "vec2", size = 16).member("vectors", "")
    NK_CONFIGURATION_STACK(nk_flags.p, nk_flags, "Flags", "flags", size = 32).member("flags", "")
    NK_CONFIGURATION_STACK(nk_color.p, nk_color, "Color", "color", size = 32).member("colors", "")
    NK_CONFIGURATION_STACK(nk_user_font_p.p, nk_user_font_p, "UserFont", "user_font", size = 8).member("fonts", "")
    NK_CONFIGURATION_STACK(nk_button_behavior.p, nk_button_behavior, "ButtonBehavior", "button_behavior", size = 8).member("button_behaviors", "")
}

val nk_context_p = struct(NUKLEAR_PACKAGE, "NkContext", nativeName = "struct nk_context", mutable = false) {
    documentation = ""

/* public: can be accessed freely */
    nk_input.member("input", "")
    nk_style.member("style", "")
    nk_buffer.member("memory", "")
    nk_clipboard.member("clip", "")
    nk_flags.member("last_widget_state", "")
    nk_button_behavior.member("button_behavior", "")
    nk_configuration_stacks.member("stacks", "")
    float.member("delta_time_seconds", "")

/* private:
    should only be accessed if you
    know what you are doing */
    nk_draw_list.member("draw_list", "").public = false
    nk_handle.member("userdata", "").public = false

    /* text editor objects are quite big because of an internal
     * undo/redo stack. Therefore does not make sense to have one for
     * each window for temporary use cases, so I only provide *one* instance
     * for all windows. This works because the content is cleared anyway */
    nk_text_edit.member("text_edit", "").public = false
    nk_command_buffer.member("overlay", "").public = false

    /* windows */
    int.member("build", "").public = false
    intb.member("use_pool", "").public = false
    nk_pool.member("pool", "").public = false
    (nullable..nk_window_p.member("begin", "")).public = false
    (nullable..nk_window_p.member("end", "")).public = false
    (nullable..nk_window_p.member("active", "")).public = false
    (nullable..nk_window_p.member("current", "")).public = false
    (nullable.."nk_page_element".p.member("freelist", "")).public = false
    unsigned_int.member("count", "").public = false
    unsigned_int.member("seq", "").public = false
}.p

val nk_value_getter = "nk_value_getter".callback(
    NUKLEAR_PACKAGE, float, "NkValueGetter",
    "",

    opaque_p.IN("userdata", ""),
    int.IN("index", "")
) {
    documentation = "Instances of this interface may be passed to the #plot_function() function."
}

val nk_item_getter = "nk_item_getter".callback(
    NUKLEAR_PACKAGE, float, "NkItemGetter",
    "",

    opaque_p.IN("userdata", ""),
    int.IN("selected", ""),
    const..charUTF8_pp.IN("item", "")
) {
    documentation = "Instances of this interface may be passed to the #combo_callback() and #combobox_callback() functions."
}