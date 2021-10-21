/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package nuklear

import org.lwjgl.generator.*

val Int.NK_FLAG: String
    get() = "1 << $this"

val nk_byte = typedef(uint8_t, "nk_byte")
val nk_ushort = typedef(uint16_t, "nk_ushort")
val nk_int = typedef(int32_t, "nk_int")
val nk_uint = typedef(uint32_t, "nk_uint")
val nk_size = typedef(uintptr_t, "nk_size")
val nk_bool = typedef(bool, "nk_bool")

val nk_hash = typedef(nk_uint, "nk_hash")
val nk_flags = typedef(uint32_t, "nk_flags")
val nk_rune = typedef(uint32_t, "nk_rune")

val nk_handle = union(Module.NUKLEAR, "NkHandle", nativeName = "nk_handle") {
    nullable..opaque_p("ptr", "")
    int("id", "")
}
// Struct values are currently not supported in callbacks
val nk_handle_in_callback = "nk_handle".handle

const val NK_UTF_SIZE = 4
val nk_glyph = char.p

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

val nk_color = struct(Module.NUKLEAR, "NkColor", nativeName = "struct nk_color") {
    nk_byte("r", "")
    nk_byte("g", "")
    nk_byte("b", "")
    nk_byte("a", "")
}

val nk_colorf = struct(Module.NUKLEAR, "NkColorf", nativeName = "struct nk_colorf") {
    float("r", "")
    float("g", "")
    float("b", "")
    float("a", "")
}

val nk_vec2 = struct(Module.NUKLEAR, "NkVec2", nativeName = "struct nk_vec2") {
    float("x", "")
    float("y", "")
}

val nk_rect = struct(Module.NUKLEAR, "NkRect", nativeName = "struct nk_rect") {
    float("x", "")
    float("y", "")
    float("w", "")
    float("h", "")
}

val nk_image = struct(Module.NUKLEAR, "NkImage", nativeName = "struct nk_image") {
    nk_handle("handle", "")
    nk_ushort("w", "")
    nk_ushort("h", "")
    nk_ushort("region", "")[4]
}

val nk_nine_slice = struct(Module.NUKLEAR, "NkNineSlice", nativeName = "struct nk_nine_slice") {
    nk_image("img", "")
    nk_ushort("l", "")
    nk_ushort("t", "")
    nk_ushort("r", "")
    nk_ushort("b", "")
}

val nk_cursor = struct(Module.NUKLEAR, "NkCursor", nativeName = "struct nk_cursor") {
    nk_image("img", "")
    nk_vec2("size", "")
    nk_vec2("offset", "")
}

val nk_scroll = struct(Module.NUKLEAR, "NkScroll", nativeName = "struct nk_scroll", mutable = false) {
    nk_uint("x", "")
    nk_uint("y", "")
}

val nk_plugin_alloc = Module.NUKLEAR.callback {
    void.p(
        "NkPluginAlloc",
        "",

        nk_handle_in_callback("handle", ""),
        opaque_p("old", ""),
        nk_size("size", ""),

        nativeType = "nk_plugin_alloc"
    )
}

val nk_plugin_free = Module.NUKLEAR.callback {
    void(
        "NkPluginFree",
        "",

        nk_handle_in_callback("handle", ""),
        opaque_p("old", ""),

        nativeType = "nk_plugin_free"
    )
}

val nk_allocator = struct(Module.NUKLEAR, "NkAllocator", nativeName = "struct nk_allocator") {
    nk_handle("userdata", "")
    nullable..nk_plugin_alloc("alloc", "")
    nullable..nk_plugin_free("mfree", "")
}

val nk_draw_null_texture = struct(Module.NUKLEAR, "NkDrawNullTexture", nativeName = "struct nk_draw_null_texture") {
    nk_handle("texture", "texture handle to a texture with a white pixel")
    nk_vec2("uv", "coordinates to a white pixel in the texture")
}

val nk_draw_vertex_layout_element = struct(Module.NUKLEAR, "NkDrawVertexLayoutElement", nativeName = "struct nk_draw_vertex_layout_element") {
    nk_draw_vertex_layout_attribute("attribute", "the vertex attribute").links("VERTEX_\\w+")
    nk_draw_vertex_layout_format("format", "the vertex attribute format").links("FORMAT_(?!COUNT)\\w+")
    nk_size("offset", "the vertex attribute offset")
}

val nk_convert_config = struct(Module.NUKLEAR, "NkConvertConfig", nativeName = "struct nk_convert_config") {
    float("global_alpha", "global alpha value")
    nk_anti_aliasing("line_AA", "line anti-aliasing flag can be turned off if you are tight on memory").links("ANTI_ALIASING_\\w+")
    nk_anti_aliasing("shape_AA", "shape anti-aliasing flag can be turned off if you are tight on memory").links("ANTI_ALIASING_\\w+")
    unsigned_int("circle_segment_count", "number of segments used for circles: default to 22")
    unsigned_int("arc_segment_count", "number of segments used for arcs: default to 22")
    unsigned_int("curve_segment_count", "number of segments used for curves: default to 22")
    nk_draw_null_texture("null_texture", "handle to texture with a white pixel for shape drawing")
    Unsafe..nk_draw_vertex_layout_element.p("vertex_layout", "describes the vertex output format and packing")
    nk_size("vertex_size", "sizeof one vertex for vertex packing")
    nk_size("vertex_alignment", "vertex alignment: Can be optained by NK_ALIGNOF")
}

val nk_list_view = struct(Module.NUKLEAR, "NkListView", nativeName = "struct nk_list_view", mutable = false) {
    int("begin", "")
    int("end", "")
    int("count", "")

    int("total_height", "").private()
    struct(Module.NUKLEAR, "NkContext", nativeName = "struct nk_context").p("ctx", "").private()
    nk_uint.p("scroll_pointer", "").private()
    nk_uint("scroll_value", "").private()
}

// MEMORY BUFFER

val nk_memory_status = struct(Module.NUKLEAR, "NkMemoryStatus", nativeName = "struct nk_memory_status", mutable = false) {
    void.p("memory", "")
    unsigned_int("type", "")
    AutoSize("memory")..nk_size("size", "")
    nk_size("allocated", "")
    nk_size("needed", "")
    nk_size("calls", "")
}

val nk_buffer_marker = struct(Module.NUKLEAR, "NkBufferMarker", nativeName = "struct nk_buffer_marker", mutable = false) {
    nk_bool("active", "")
    nk_size("offset", "")
}

val nk_memory = struct(Module.NUKLEAR, "NkMemory", nativeName = "struct nk_memory", mutable = false) {
    nullable..void.p("ptr", "")
    AutoSize("ptr")..nk_size("size", "")
}

val nk_buffer = struct(Module.NUKLEAR, "NkBuffer", nativeName = "struct nk_buffer", mutable = false) {
    nk_buffer_marker("marker", "buffer marker to free a buffer to a certain offset")[2]
    nk_allocator("pool", "allocator callback for dynamic buffers")
    nk_allocation_type("type", "memory management type")
    nk_memory("memory", "memory and size of the current memory block")
    float("grow_factor", "growing factor for dynamic memory management")
    nk_size("allocated", "total amount of memory allocated")
    nk_size("needed", "totally consumed memory given that enough memory is present")
    nk_size("calls", "number of allocation calls")
    nk_size("size", "current size of the buffer")
}
val nk_buffer_p = nk_buffer.p

// STRING

val nk_str = struct(Module.NUKLEAR, "NkStr", nativeName = "struct nk_str", mutable = false) {
    documentation =
        """
        Basic string buffer which is only used in context with the text editor to manage and manipulate dynamic or
        fixed size string content. This is <em>NOT</em> the default string handling method. The only instance you
        should have any contact with this API is if you interact with an ##NkTextEdit object inside one of the copy and
        paste functions and even there only for more advanced cases.
        """
    nk_buffer("buffer", "")
    int("len", "in codepoints/runes/glyphs")
}

// TEXT EDITOR

private val _nk_text_edit = struct(Module.NUKLEAR, "NkTextEdit", nativeName = "struct nk_text_edit")
val nk_plugin_filter = Module.NUKLEAR.callback {
    nk_bool(
        "NkPluginFilter",
        "",

        _nk_text_edit.const.p("edit", ""),
        nk_rune("unicode", ""),

        nativeType = "nk_plugin_filter"
    ) {
        documentation = "Instances of this interface may be set to the ##NkTextEdit struct."
    }
}

val nk_plugin_paste = Module.NUKLEAR.callback {
    void(
        "NkPluginPaste",
        "",

        nk_handle_in_callback("handle", ""),
        _nk_text_edit.p("edit", ""),

        nativeType = "nk_plugin_paste"
    ) {
        documentation = "Instances of this interface may be set to the ##NkClipboard struct."
    }
}

val nk_plugin_copy = Module.NUKLEAR.callback {
    void(
        "NkPluginCopy",
        "",

        nk_handle_in_callback("handle", ""),
        charUTF8.const.p("text", ""),
        int("len", ""),

        nativeType = "nk_plugin_copy"
    ) {
        documentation = "Instances of this interface may be set to the ##NkClipboard struct."
    }
}

val nk_clipboard = struct(Module.NUKLEAR, "NkClipboard", nativeName = "struct nk_clipboard") {
    nk_handle("userdata", "")
    nullable..nk_plugin_paste("paste", "")
    nullable..nk_plugin_copy("copy", "")
}

val nk_text_undo_record = struct(Module.NUKLEAR, "NkTextUndoRecord", nativeName = "struct nk_text_undo_record", mutable = false) {
    int("where", "")
    short("insert_length", "")
    short("delete_length", "")
    short("char_storage", "")
}

const val NK_TEXTEDIT_UNDOSTATECOUNT = 99
const val NK_TEXTEDIT_UNDOCHARCOUNT = 999
val nk_text_undo_state = struct(Module.NUKLEAR, "NkTextUndoState", nativeName = "struct nk_text_undo_state", mutable = false) {
    nk_text_undo_record("undo_rec", "")[NK_TEXTEDIT_UNDOSTATECOUNT]
    nk_rune("undo_char", "")[NK_TEXTEDIT_UNDOCHARCOUNT]
    short("undo_point", "")
    short("redo_point", "")
    short("undo_char_point", "")
    short("redo_char_point", "")
}

val nk_text_edit = struct(Module.NUKLEAR, "NkTextEdit", nativeName = "struct nk_text_edit", mutable = false) {
    nk_clipboard("clip", "")
    nk_str("string", "")
    nullable..nk_plugin_filter("filter", "")
    nk_vec2("scrollbar", "")

    int("cursor", "")
    int("select_start", "")
    int("select_end", "")
    unsigned_char("mode", "")
    bool("cursor_at_end_of_line", "")
    bool("initialized", "")
    bool("has_preferred_x", "")
    bool("single_line", "")
    bool("active", "")
    padding(1)
    float("preferred_x", "")
    nk_text_undo_state("undo", "")
}

// FONT

val nk_user_font_glyph = struct(Module.NUKLEAR, "NkUserFontGlyph", nativeName = "struct nk_user_font_glyph") {
    nk_vec2("uv", "texture coordinates")[2]
    nk_vec2("offset", "offset between top left and glyph")
    float("width", "width of the glyph")
    float("height", "height of the glyph")
    float("xadvance", "offset to the next glyph")
}

val nk_text_width_f = Module.NUKLEAR.callback {
    float(
        "NkTextWidthCallback",
        "",

        nk_handle_in_callback("handle", ""),
        float("h", ""),
        charUTF8.const.p("text", ""),
        int("len", ""),

        nativeType = "nk_text_width_f"
    ) {
        documentation = "Instances of this interface may be set to the ##NkUserFont struct."
    }
}

val nk_query_font_glyph_f = Module.NUKLEAR.callback {
    void(
        "NkQueryFontGlyphCallback",
        "",

        nk_handle_in_callback("handle", ""),
        float("font_height", ""),
        nk_user_font_glyph.p("glyph", ""),
        nk_rune("codepoint", ""),
        nk_rune("next_codepoint", ""),

        nativeType = "nk_query_font_glyph_f"
    ) {
        documentation = "Instances of this interface may be set to the ##NkUserFont struct."
    }
}

val nk_user_font = struct(Module.NUKLEAR, "NkUserFont", nativeName = "struct nk_user_font") {
    nk_handle("userdata", "user provided font handle")
    float("height", "max height of the font")
    nullable..nk_text_width_f("width", "font string width in pixel callback")
    nullable..nk_query_font_glyph_f("query", "font glyph callback to query drawing info")
    nk_handle("texture", "texture handle to the used font atlas or texture")
}

// DRAWING
val nk_command = struct(Module.NUKLEAR, "NkCommand", nativeName = "struct nk_command", mutable = false) {
    nk_command_type("type", "")
    nk_size("next", "")
    nk_handle("userdata", "")
}

/*val nk_command_scissor = struct(Binding.NUKLEAR, "NkCommandScissor", nativeName = "struct nk_command_scissor") {
    nk_command("header", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
}

val nk_command_line = struct(Binding.NUKLEAR, "NkCommandLine", nativeName = "struct nk_command_line") {
    nk_command("header", "")
    unsigned_short("line_thickness", "")
    nk_vec2i("begin", "")
    nk_vec2i("end", "")
    nk_color("color", "")
}

val nk_command_curve = struct(Binding.NUKLEAR, "NkCommandCurve", nativeName = "struct nk_command_curve") {
    nk_command("header", "")
    unsigned_short("line_thickness", "")
    nk_vec2i("begin", "")
    nk_vec2i("end", "")
    nk_vec2i("ctrl", "")[2]
    nk_color("color", "")
}

val nk_command_rect = struct(Binding.NUKLEAR, "NkCommandRect", nativeName = "struct nk_command_rect") {
    nk_command("header", "")
    unsigned_short("rounding", "")
    unsigned_short("line_thickness", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_color("color", "")
}

val nk_command_rect_filled = struct(Binding.NUKLEAR, "NkCmmandRectFilled", nativeName = "struct nk_command_rect_filled") {
    nk_command("header", "")
    unsigned_short("rounding", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_color("color", "")
}

val nk_command_rect_multi_color = struct(Binding.NUKLEAR, "NkCommandRectMultiColor", nativeName = "struct nk_command_rect_multi_color") {
    nk_command("header", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_color("left", "")
    nk_color("top", "")
    nk_color("bottom", "")
    nk_color("right", "")
}

val nk_command_triangle = struct(Binding.NUKLEAR, "NkCommandTriangle", nativeName = "struct nk_command_triangle") {
    nk_command("header", "")
    unsigned_short("line_thickness", "")
    nk_vec2i("a", "")
    nk_vec2i("b", "")
    nk_vec2i("c", "")
    nk_color("color", "")
}

val nk_command_triangle_filled = struct(Binding.NUKLEAR, "NkCommandTriangleFilled", nativeName = "struct nk_command_triangle_filled") {
    nk_command("header", "")
    nk_vec2i("a", "")
    nk_vec2i("b", "")
    nk_vec2i("c", "")
    nk_color("color", "")
}

val nk_command_circle = struct(Binding.NUKLEAR, "NkCommandCircle", nativeName = "struct nk_command_circle") {
    nk_command("header", "")
    short("x", "")
    short("y", "")
    unsigned_short("line_thickness", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_color("color", "")
}

val nk_command_circle_filled = struct(Binding.NUKLEAR, "NkCommandCircleFilled", nativeName = "struct nk_command_circle_filled") {
    nk_command("header", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_color("color", "")
}

val nk_command_arc = struct(Binding.NUKLEAR, "NkCommandArc", nativeName = "struct nk_command_arc") {
    nk_command("header", "")
    short("cx", "")
    short("cy", "")
    unsigned_short("r", "")
    unsigned_short("line_thickness", "")
    float("a", "")[2]
    nk_color("color", "")
}

val nk_command_arc_filled = struct(Binding.NUKLEAR, "NkCommandArcFilled", nativeName = "struct nk_command_arc_filled") {
    nk_command("header", "")
    short("cx", "")
    short("cy", "")
    unsigned_short("r", "")
    float("a", "")[2]
    nk_color("color", "")
}

val nk_command_polygon = struct(Binding.NUKLEAR, "NkCommandPolygon", nativeName = "struct nk_command_polygon") {
    nk_command("header", "")
    nk_color("color", "")
    unsigned_short("line_thickness", "")
    unsigned_short("point_count", "")
    nk_vec2i("points", "")[1]
}

val nk_command_polygon_filled = struct(Binding.NUKLEAR, "NkCommandPolygonFilled", nativeName = "struct nk_command_polygon_filled") {
    nk_command("header", "")
    nk_color("color", "")
    unsigned_short("point_count", "")
    nk_vec2i("points", "")[1]
}

val nk_command_polyline = struct(Binding.NUKLEAR, "NkCommandPolyline", nativeName = "struct nk_command_polyline") {
    nk_command("header", "")
    nk_color("color", "")
    unsigned_short("line_thickness", "")
    unsigned_short("point_count", "")
    nk_vec2i("points", "")[1]
}

val nk_command_image = struct(Binding.NUKLEAR, "NkCommandImage", nativeName = "struct nk_command_image") {
    nk_command("header", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_image("img", "")
    nk_color("col", "")
}

val nk_command_text = struct(Binding.NUKLEAR, "NkCommandText", nativeName = "struct nk_command_text") {
    nk_command("header", "")
    const..nk_user_font.p("font", "")
    nk_color("background", "")
    nk_color("foreground", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    float("height", "")
    int("length", "")
    char("string", "")[1]
}*/

val nk_command_custom_callback = Module.NUKLEAR.callback {
    void.p(
        "NkCommandCustomCallback",
        "",

        opaque_p("canvas", ""),
        short("x", ""),
        short("y", ""),
        unsigned_short("w", ""),
        unsigned_short("h", ""),
        nk_handle_in_callback("callback_data", ""),

        nativeType = "nk_command_custom_callback"
    )
}

/*val nk_command_custom = struct(Binding.NUKLEAR, "NkCommandCustom", nativeName = "struct nk_command_custom") {
    nk_command("header", "")
    short("x", "")
    short("y", "")
    unsigned_short("w", "")
    unsigned_short("h", "")
    nk_handle("callback_data", "")
    nk_command_custom_callback("callback", "")
}*/

val nk_command_buffer = struct(Module.NUKLEAR, "NkCommandBuffer", nativeName = "struct nk_command_buffer", mutable = false) {
    nullable..nk_buffer_p("base", "")
    nk_rect("clip", "")
    int("use_clipping", "")
    nk_handle("userdata", "")
    nk_size("begin", "")
    nk_size("end", "")
    nk_size("last", "")
}

// INPUT

val nk_mouse_button = struct(Module.NUKLEAR, "NkMouseButton", nativeName = "struct nk_mouse_button", mutable = false) {
    nk_bool("down", "")
    unsigned_int("clicked", "")
    nk_vec2("clicked_pos", "")
}

val nk_mouse = struct(Module.NUKLEAR, "NkMouse", nativeName = "struct nk_mouse", mutable = false) {
    javaImport("static org.lwjgl.nuklear.Nuklear.NK_BUTTON_MAX")

    nk_mouse_button("buttons", "")["NK_BUTTON_MAX"]
    nk_vec2("pos", "")
    nk_vec2("prev", "")
    nk_vec2("delta", "")
    nk_vec2("scroll_delta", "")
    bool("grab", "")
    bool("grabbed", "")
    bool("ungrab", "")
}

val nk_key = struct(Module.NUKLEAR, "NkKey", nativeName = "struct nk_key", mutable = false) {
    nk_bool("down", "")
    unsigned_int("clicked", "")
}

val nk_keyboard = struct(Module.NUKLEAR, "NkKeyboard", nativeName = "struct nk_keyboard", mutable = false) {
    javaImport("static org.lwjgl.nuklear.Nuklear.*")

    nk_key("keys", "")["NK_KEY_MAX"]
    char("text", "")["NK_INPUT_MAX"]
    int("text_len", "")
}

val nk_input = struct(Module.NUKLEAR, "NkInput", nativeName = "struct nk_input", mutable = false) {
    nk_keyboard("keyboard", "")
    nk_mouse("mouse", "")
}

// DRAW LIST

val nk_draw_command = struct(Module.NUKLEAR, "NkDrawCommand", nativeName = "struct nk_draw_command", mutable = false) {
    unsigned_int("elem_count", "")
    /* number of elements in the current draw batch */
    nk_rect("clip_rect", "")
    /* current screen clipping rectangle */
    nk_handle("texture", "")
    /* current texture to set */
    nk_handle("userdata", "")
}

val nk_draw_list = struct(Module.NUKLEAR, "NkDrawList", nativeName = "struct nk_draw_list", mutable = false) {
    nk_rect("clip_rect", "")
    nk_vec2("circle_vtx", "")[12]
    nk_convert_config("config", "")

    nullable..nk_buffer_p("buffer", "")
    nullable..nk_buffer_p("vertices", "")
    nullable..nk_buffer_p("elements", "")

    unsigned_int("element_count", "")
    unsigned_int("vertex_count", "")
    unsigned_int("cmd_count", "")
    nk_size("cmd_offset", "")

    unsigned_int("path_count", "")
    unsigned_int("path_offset", "")

    nk_anti_aliasing("line_AA", "")
    nk_anti_aliasing("shape_AA", "")

    nk_handle("userdata", "")
}

// GUI

val nk_style_item_data = union(Module.NUKLEAR, "NkStyleItemData", nativeName = "union nk_style_item_data") {
    nk_color("color", "")
    nk_image("image", "")
    nk_nine_slice("slice", "")
}

val nk_style_item = struct(Module.NUKLEAR, "NkStyleItem", nativeName = "struct nk_style_item") {
    nk_style_item_type("type", "the style type").links("STYLE_ITEM_\\w+")
    nk_style_item_data("data", "the style data")
}

val nk_style_text = struct(Module.NUKLEAR, "NkStyleText", nativeName = "struct nk_style_text") {
    nk_color("color", "")
    nk_vec2("padding", "")
}

val nk_draw_begin = Module.NUKLEAR.callback {
    float(
        "NkDrawBeginCallback",
        "",

        Input..nk_command_buffer.p("buffer", ""),
        nk_handle_in_callback("userdata", ""),

        nativeType = "nk_draw_begin"
    ) {
        documentation = "Instances of this interface may be set to the {@code nk_style_*} structs."
    }
}

val nk_draw_end = Module.NUKLEAR.callback {
    float(
        "NkDrawEndCallback",
        "",

        Input..nk_command_buffer.p("buffer", ""),
        nk_handle_in_callback("userdata", ""),

        nativeType = "nk_draw_end"
    ) {
        documentation = "Instances of this interface may be set to the {@code nk_style_*} structs."
    }
}

val nk_style_button = struct(Module.NUKLEAR, "NkStyleButton", nativeName = "struct nk_style_button") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* text */
    nk_color("text_background", "")
    nk_color("text_normal", "")
    nk_color("text_hover", "")
    nk_color("text_active", "")
    nk_flags("text_alignment", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    nk_vec2("padding", "")
    nk_vec2("image_padding", "")
    nk_vec2("touch_padding", "")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_toggle = struct(Module.NUKLEAR, "NkStyleToggle", nativeName = "struct nk_style_toggle") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* cursor */
    nk_style_item("cursor_normal", "")
    nk_style_item("cursor_hover", "")

    /* text */
    nk_color("text_normal", "")
    nk_color("text_hover", "")
    nk_color("text_active", "")
    nk_color("text_background", "")
    nk_flags("text_alignment", "")

    /* properties */
    nk_vec2("padding", "")
    nk_vec2("touch_padding", "")
    float("spacing", "")
    float("border", "")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_selectable = struct(Module.NUKLEAR, "NkStyleSelectable", nativeName = "struct nk_style_selectable") {
    /* background (inactive) */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("pressed", "")

    /* background (active) */
    nk_style_item("normal_active", "")
    nk_style_item("hover_active", "")
    nk_style_item("pressed_active", "")

    /* text color (inactive) */
    nk_color("text_normal", "")
    nk_color("text_hover", "")
    nk_color("text_pressed", "")

    /* text color (active) */
    nk_color("text_normal_active", "")
    nk_color("text_hover_active", "")
    nk_color("text_pressed_active", "")
    nk_color("text_background", "")
    nk_flags("text_alignment", "")

    /* properties */
    float("rounding", "")
    nk_vec2("padding", "")
    nk_vec2("touch_padding", "")
    nk_vec2("image_padding", "")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_slider = struct(Module.NUKLEAR, "NkStyleSlider", nativeName = "struct nk_style_slider") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* background bar */
    nk_color("bar_normal", "")
    nk_color("bar_hover", "")
    nk_color("bar_active", "")
    nk_color("bar_filled", "")

    /* cursor */
    nk_style_item("cursor_normal", "")
    nk_style_item("cursor_hover", "")
    nk_style_item("cursor_active", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    float("bar_height", "")
    nk_vec2("padding", "")
    nk_vec2("spacing", "")
    nk_vec2("cursor_size", "")

    /* optional buttons */
    int("show_buttons", "")
    nk_style_button("inc_button", "")
    nk_style_button("dec_button", "")
    nk_symbol_type("inc_symbol", "").links("SYMBOL_\\w+")
    nk_symbol_type("dec_symbol", "see {@code inc_symbol}")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_progress = struct(Module.NUKLEAR, "NkStyleProgress", nativeName = "struct nk_style_progress") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* cursor */
    nk_style_item("cursor_normal", "")
    nk_style_item("cursor_hover", "")
    nk_style_item("cursor_active", "")
    nk_color("cursor_border_color", "")

    /* properties */
    float("rounding", "")
    float("border", "")
    float("cursor_border", "")
    float("cursor_rounding", "")
    nk_vec2("padding", "")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_scrollbar = struct(Module.NUKLEAR, "NkStyleScrollbar", nativeName = "struct nk_style_scrollbar") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* cursor */
    nk_style_item("cursor_normal", "")
    nk_style_item("cursor_hover", "")
    nk_style_item("cursor_active", "")
    nk_color("cursor_border_color", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    float("border_cursor", "")
    float("rounding_cursor", "")
    nk_vec2("padding", "")

    /* optional buttons */
    int("show_buttons", "")
    nk_style_button("inc_button", "")
    nk_style_button("dec_button", "")
    nk_symbol_type("inc_symbol", "").links("SYMBOL_\\w+")
    nk_symbol_type("dec_symbol", "see {@code inc_symbol}")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_edit = struct(Module.NUKLEAR, "NkStyleEdit", nativeName = "struct nk_style_edit") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")
    nk_style_scrollbar("scrollbar", "")

    /* cursor  */
    nk_color("cursor_normal", "")
    nk_color("cursor_hover", "")
    nk_color("cursor_text_normal", "")
    nk_color("cursor_text_hover", "")

    /* text (unselected) */
    nk_color("text_normal", "")
    nk_color("text_hover", "")
    nk_color("text_active", "")

    /* text (selected) */
    nk_color("selected_normal", "")
    nk_color("selected_hover", "")
    nk_color("selected_text_normal", "")
    nk_color("selected_text_hover", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    float("cursor_size", "")
    nk_vec2("scrollbar_size", "")
    nk_vec2("padding", "")
    float("row_padding", "")
}

val nk_style_property = struct(Module.NUKLEAR, "NkStyleProperty", nativeName = "struct nk_style_property") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* text */
    nk_color("label_normal", "")
    nk_color("label_hover", "")
    nk_color("label_active", "")

    /* symbols */
    nk_symbol_type("sym_left", "").links("SYMBOL_\\w+")
    nk_symbol_type("sym_right", "see {@code sym_left}")

    /* properties */
    float("border", "")
    float("rounding", "")
    nk_vec2("padding", "")

    nk_style_edit("edit", "")
    nk_style_button("inc_button", "")
    nk_style_button("dec_button", "")

    /* optional user callbacks */
    nk_handle("userdata", "")
    nullable..nk_draw_begin("draw_begin", "")
    nullable..nk_draw_end("draw_end", "")
}

val nk_style_chart = struct(Module.NUKLEAR, "NkStyleChart", nativeName = "struct nk_style_chart") {
    /* colors */
    nk_style_item("background", "")
    nk_color("border_color", "")
    nk_color("selected_color", "")
    nk_color("color", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    nk_vec2("padding", "")
}

val nk_style_combo = struct(Module.NUKLEAR, "NkStyleCombo", nativeName = "struct nk_style_combo") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")
    nk_color("border_color", "")

    /* label */
    nk_color("label_normal", "")
    nk_color("label_hover", "")
    nk_color("label_active", "")

    /* symbol */
    nk_color("symbol_normal", "")
    nk_color("symbol_hover", "")
    nk_color("symbol_active", "")

    /* button */
    nk_style_button("button", "")
    nk_symbol_type("sym_normal", "")
    nk_symbol_type("sym_hover", "")
    nk_symbol_type("sym_active", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    nk_vec2("content_padding", "")
    nk_vec2("button_padding", "")
    nk_vec2("spacing", "")
}

val nk_style_tab = struct(Module.NUKLEAR, "NkStyleTab", nativeName = "struct nk_style_tab") {
    /* background */
    nk_style_item("background", "")
    nk_color("border_color", "")
    nk_color("text", "")

    /* button */
    nk_style_button("tab_maximize_button", "")
    nk_style_button("tab_minimize_button", "")
    nk_style_button("node_maximize_button", "")
    nk_style_button("node_minimize_button", "")
    nk_symbol_type("sym_minimize", "")
    nk_symbol_type("sym_maximize", "")

    /* properties */
    float("border", "")
    float("rounding", "")
    float("indent", "")
    nk_vec2("padding", "")
    nk_vec2("spacing", "")
}

val nk_style_window_header = struct(Module.NUKLEAR, "NkStyleWindowHeader", nativeName = "struct nk_style_window_header") {
    /* background */
    nk_style_item("normal", "")
    nk_style_item("hover", "")
    nk_style_item("active", "")

    /* button */
    nk_style_button("close_button", "")
    nk_style_button("minimize_button", "")
    nk_symbol_type("close_symbol", "")
    nk_symbol_type("minimize_symbol", "")
    nk_symbol_type("maximize_symbol", "")

    /* title */
    nk_color("label_normal", "")
    nk_color("label_hover", "")
    nk_color("label_active", "")

    /* properties */
    nk_style_header_align("align", "").links("HEADER_\\w+")
    nk_vec2("padding", "")
    nk_vec2("label_padding", "")
    nk_vec2("spacing", "")
}

val nk_style_window = struct(Module.NUKLEAR, "NkStyleWindow", nativeName = "struct nk_style_window") {
    nk_style_window_header("header", "")
    nk_style_item("fixed_background", "")
    nk_color("background", "")

    nk_color("border_color", "")
    nk_color("popup_border_color", "")
    nk_color("combo_border_color", "")
    nk_color("contextual_border_color", "")
    nk_color("menu_border_color", "")
    nk_color("group_border_color", "")
    nk_color("tooltip_border_color", "")
    nk_style_item("scaler", "")

    float("border", "")
    float("combo_border", "")
    float("contextual_border", "")
    float("menu_border", "")
    float("group_border", "")
    float("tooltip_border", "")
    float("popup_border", "")
    float("min_row_height_padding", "")

    float("rounding", "")
    nk_vec2("spacing", "")
    nk_vec2("scrollbar_size", "")
    nk_vec2("min_size", "")

    nk_vec2("padding", "")
    nk_vec2("group_padding", "")
    nk_vec2("popup_padding", "")
    nk_vec2("combo_padding", "")
    nk_vec2("contextual_padding", "")
    nk_vec2("menu_padding", "")
    nk_vec2("tooltip_padding", "")
}

val nk_style = struct(Module.NUKLEAR, "NkStyle", nativeName = "struct nk_style") {
    javaImport("static org.lwjgl.nuklear.Nuklear.NK_CURSOR_COUNT")

    nullable..nk_user_font.p("font", "")
    nullable..nk_cursor.p("cursors", "")["NK_CURSOR_COUNT"]
    nullable..nk_cursor.p("cursor_active", "")
    nullable..nk_cursor.p("cursor_last", "")
    intb("cursor_visible", "")

    nk_style_text("text", "")
    nk_style_button("button", "")
    nk_style_button("contextual_button", "")
    nk_style_button("menu_button", "")
    nk_style_toggle("option", "")
    nk_style_toggle("checkbox", "")
    nk_style_selectable("selectable", "")
    nk_style_slider("slider", "")
    nk_style_progress("progress", "")
    nk_style_property("property", "")
    nk_style_edit("edit", "")
    nk_style_chart("chart", "")
    nk_style_scrollbar("scrollh", "")
    nk_style_scrollbar("scrollv", "")
    nk_style_tab("tab", "")
    nk_style_combo("combo", "")
    nk_style_window("window", "")
}

// PANEL

val nk_chart_slot = struct(Module.NUKLEAR, "NkChartSlot", nativeName = "struct nk_chart_slot", mutable = false) {
    nk_chart_type("type", "")
    nk_color("color", "")
    nk_color("highlight", "")
    float("min", "")
    float("max", "")
    float("range", "")
    int("count", "")
    nk_vec2("last", "")
    int("index", "")
}

const val NK_CHART_MAX_SLOT = 4
val nk_chart = struct(Module.NUKLEAR, "NkChart", nativeName = "struct nk_chart", mutable = false) {
    int("slot", "")
    float("x", "")
    float("y", "")
    float("w", "")
    float("h", "")
    nk_chart_slot("slots", "")[NK_CHART_MAX_SLOT]
}

const val NK_MAX_LAYOUT_ROW_TEMPLATE_COLUMNS = 16
val nk_row_layout = struct(Module.NUKLEAR, "NkRowLayout", nativeName = "struct nk_row_layout", mutable = false) {
    nk_panel_row_layout_type("type", "").links("LAYOUT_\\w+")
    int("index", "")
    float("height", "")
    float("min_height", "")
    int("columns", "")
    float.const.p("ratio", "")
    float("item_width", "")
    float("item_height", "")
    float("item_offset", "")
    float("filled", "")
    nk_rect("item", "")
    int("tree_depth", "")
    float("templates", "")[NK_MAX_LAYOUT_ROW_TEMPLATE_COLUMNS]
}

val nk_popup_buffer = struct(Module.NUKLEAR, "NkPopupBuffer", nativeName = "struct nk_popup_buffer", mutable = false) {
    nk_size("begin", "")
    nk_size("parent", "")
    nk_size("last", "")
    nk_size("end", "")
    nk_bool("active", "")
}

val nk_menu_state = struct(Module.NUKLEAR, "NkMenuState", nativeName = "struct nk_menu_state", mutable = false) {
    float("x", "")
    float("y", "")
    float("w", "")
    float("h", "")
    nk_scroll("offset", "")
}

private val _nk_panel = struct(Module.NUKLEAR, "NkPanel", nativeName = "struct nk_panel")
val nk_panel = struct(Module.NUKLEAR, "NkPanel", nativeName = "struct nk_panel", mutable = false) {
    nk_panel_type("type", "").links("PANEL_\\w+")
    nk_flags("flags", "")
    nk_rect("bounds", "")
    nk_uint.p("offset_x", "")
    nk_uint.p("offset_y", "")
    float("at_x", "")
    float("at_y", "")
    float("max_x", "")
    float("footer_height", "")
    float("header_height", "")
    float("border", "")
    unsigned_int("has_scrolling", "")
    nk_rect("clip", "")
    nk_menu_state("menu", "")
    nk_row_layout("row", "")
    nk_chart("chart", "")
    nk_command_buffer.p("buffer", "")
    _nk_panel.p("parent", "")
}

// WINDOW

private val _nk_window = struct(Module.NUKLEAR, "NkWindow", nativeName = "struct nk_window")
val nk_popup_state = struct(Module.NUKLEAR, "NkPopupState", nativeName = "struct nk_popup_state", mutable = false) {
    _nk_window.p("win", "")
    nk_panel_type("type", "").links("PANEL_\\w+")
    nk_popup_buffer("buf", "")
    nk_hash("name", "")
    nk_bool("active", "")
    unsigned("combo_count", "")
    unsigned("con_count", "")
    unsigned("con_old", "")
    unsigned("active_con", "")
    nk_rect("header", "")
}

val nk_edit_state = struct(Module.NUKLEAR, "NkEditState", nativeName = "struct nk_edit_state", mutable = false) {
    nk_hash("name", "")
    unsigned_int("seq", "")
    unsigned_int("old", "")
    int("active", "")
    int("prev", "")
    int("cursor", "")
    int("sel_start", "")
    int("sel_end", "")
    nk_scroll("scrollbar", "")
    unsigned_char("mode", "")
    bool("single_line", "")
}

val nk_property_state = struct(Module.NUKLEAR, "NkPropertyState", nativeName = "struct nk_property_state", mutable = false) {
    javaImport("static org.lwjgl.nuklear.Nuklear.NK_MAX_NUMBER_BUFFER")

    int("active", "")
    int("prev", "")
    char("buffer", "")["NK_MAX_NUMBER_BUFFER"]
    int("length", "")
    int("cursor", "")
    int("select_start", "")
    int("select_end", "")
    nk_hash("name", "")
    unsigned_int("seq", "")
    unsigned_int("old", "")
    int("state", "")
}

const val NK_WINDOW_MAX_NAME = 64
val nk_window = struct(Module.NUKLEAR, "NkWindow", nativeName = "struct nk_window", mutable = false) {
    unsigned_int("seq", "")
    nk_hash("name", "")
    charUTF8("name_string", "")[NK_WINDOW_MAX_NAME]
    nk_flags("flags", "")
    nk_rect("bounds", "")
    nk_scroll("scrollbar", "")
    nk_command_buffer("buffer", "")
    nk_panel.p("layout", "")
    float("scrollbar_hiding_timer", "")

    /* persistent widget state */
    nk_property_state("property", "")
    nk_popup_state("popup", "")
    nk_edit_state("edit", "")
    unsigned_int("scrolled", "")

    "struct nk_table".opaque.p("tables", "") // TODO: private API?
    unsigned_int("table_count", "")

    /* window list hooks */
    _nk_window.p("next", "")
    _nk_window.p("prev", "")
    _nk_window.p("parent", "")
}

val nk_pool = struct(Module.NUKLEAR, "NkPool", nativeName = "struct nk_pool", mutable = false) {
    access = Access.INTERNAL

    nk_allocator("alloc", "")
    nk_allocation_type("type", "")
    unsigned_int("page_count", "")
    "struct nk_page".opaque.p("pages", "")
    "struct nk_page_element".opaque.p("freelist", "")
    unsigned("capacity", "")
    nk_size("size", "")
    nk_size("cap", "")
}

fun NK_CONFIGURATION_STACK(address: PointerType<*>, old_value: DataType, javaName: String, name: String, size: Int): StructType {
    if (address.elementType != old_value)
        throw IllegalArgumentException()

    val element = struct(Module.NUKLEAR, "NkConfigStack${javaName}Element", nativeName = "struct nk_config_stack_${name}_element", mutable = false) {
        access = Access.INTERNAL

        address("pValues", "") // address
        old_value("old_value", "")
    }

    return struct(Module.NUKLEAR, "NkConfigStack$javaName", nativeName = "struct nk_config_stack_$name", mutable = false) {
        access = Access.INTERNAL

        int("head", "")
        element("elements", "")[size]
    }
}

val nk_configuration_stacks = struct(Module.NUKLEAR, "NkConfigurationStacks", nativeName = "struct nk_configuration_stacks", mutable = false, skipBuffer = true) {
    access = Access.INTERNAL

    NK_CONFIGURATION_STACK(nk_style_item.p, nk_style_item, "StyleItem", "style_item", size = 16)("style_items", "")
    NK_CONFIGURATION_STACK(float.p, float, "Float", "float", size = 32)("floats", "")
    NK_CONFIGURATION_STACK(nk_vec2.p, nk_vec2, "Vec2", "vec2", size = 16)("vectors", "")
    NK_CONFIGURATION_STACK(nk_flags.p, nk_flags, "Flags", "flags", size = 32)("flags", "")
    NK_CONFIGURATION_STACK(nk_color.p, nk_color, "Color", "color", size = 32)("colors", "")
    NK_CONFIGURATION_STACK(nk_user_font.p.p, nk_user_font.p, "UserFont", "user_font", size = 8)("fonts", "")
    NK_CONFIGURATION_STACK(nk_button_behavior.p, nk_button_behavior, "ButtonBehavior", "button_behavior", size = 8)("button_behaviors", "")
}

val nk_context = struct(Module.NUKLEAR, "NkContext", nativeName = "struct nk_context", mutable = false, skipBuffer = true) {
    documentation = ""

/* public: can be accessed freely */
    nk_input("input", "")
    nk_style("style", "")
    nk_buffer("memory", "")
    nk_clipboard("clip", "")
    nk_flags("last_widget_state", "")
    nk_button_behavior("button_behavior", "")
    nk_configuration_stacks("stacks", "")
    float("delta_time_seconds", "")

/* private:
    should only be accessed if you
    know what you are doing */
    nk_draw_list("draw_list", "").private()
    nk_handle("userdata", "").private()

    /* text editor objects are quite big because of an internal
     * undo/redo stack. Therefore does not make sense to have one for
     * each window for temporary use cases, so I only provide *one* instance
     * for all windows. This works because the content is cleared anyway */
    nk_text_edit("text_edit", "").private()
    nk_command_buffer("overlay", "").private()

    /* windows */
    int("build", "").private()
    intb("use_pool", "").private()
    nk_pool("pool", "").private()
    (nullable..nk_window.p("begin", "")).private()
    (nullable..nk_window.p("end", "")).private()
    (nullable..nk_window.p("active", "")).private()
    (nullable..nk_window.p("current", "")).private()
    (nullable.."struct nk_page_element".opaque.p("freelist", "")).private()
    unsigned_int("count", "").private()
    unsigned_int("seq", "").private()
}

val nk_value_getter = Module.NUKLEAR.callback {
    float(
        "NkValueGetter",
        "",

        opaque_p("userdata", ""),
        int("index", ""),

        nativeType = "nk_value_getter"
    ) {
        documentation = "Instances of this interface may be passed to the #plot_function() function."
    }
}

val nk_item_getter = Module.NUKLEAR.callback {
    float(
        "NkItemGetter",
        "",

        opaque_p("userdata", ""),
        int("selected", ""),
        charUTF8.const.p.p("item", ""),

        nativeType = "nk_item_getter"
    ) {
        documentation = "Instances of this interface may be passed to the #combo_callback() and #combobox_callback() functions."
    }
}