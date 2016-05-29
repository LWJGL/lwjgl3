/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.nuklear

import org.lwjgl.generator.*

val NUKLEAR_PACKAGE = "org.lwjgl.nuklear"

fun config() {
	packageInfo(
		NUKLEAR_PACKAGE,
		"""
		Bindings to the <a href="https://github.com/vurtun/nuklear">Nuklear</a> library.

		A minimal state immediate mode graphical user interface single header toolkit written in ANSI C and licensed under public domain. It was designed as a
		simple embeddable user interface for application and does not have any dependencies, a default renderbackend or OS window and input handling but
		instead provides a very modular library approach by using simple input state for input and draw commands describing primitive shapes as output. So
		instead of providing a layered library that tries to abstract over a number of platform and render backends it only focuses on the actual UI.

		Developed by Micha Mettke.
		"""
	)
}

val nk_short = typedef(int16_t, "nk_short")
val nk_ushort = typedef(uint16_t, "nk_ushort")
val nk_int = typedef(int32_t, "nk_int")
val nk_uint = typedef(uint32_t, "nk_uint")
val nk_hash = typedef(uint32_t, "nk_hash")
val nk_size = typedef(uintptr_t, "nk_size")
val nk_ptr = typedef(uintptr_t, "nk_ptr")
val nk_flags = typedef(uint32_t, "nk_flags")
val nk_rune = typedef(uint32_t, "nk_rune")
val nk_byte = typedef(uint8_t, "nk_byte")

val nk_byte_p = nk_byte.p
val nk_rune_p = nk_rune.p

val nk_handle = union(NUKLEAR_PACKAGE, "NkHandle", nativeName = "nk_handle") {
	voidptr.member("ptr", "")
	int.member("id", "")
}.nativeType

val NK_UTF_SIZE = 4
val nk_glyph = char_p

val nk_anti_aliasing = "nk_anti_aliasing".enumType
val nk_allocation_type = "nk_allocation_type".enumType
val nk_command_type = "nk_command_type".enumType
val nk_style_item_type = "nk_style_item_type".enumType
val nk_symbol_type = "nk_symbol_type".enumType
val nk_style_header_align = "nk_style_header_align".enumType
val nk_chart_type = "nk_chart_type".enumType
val nk_window_flags = "nk_window_flags".enumType
val nk_collapse_states = "nk_collapse_states".enumType
val nk_show_states = "nk_show_states".enumType
val nk_layout_format = "nk_layout_format".enumType
val nk_tree_type = "nk_tree_type".enumType
val nk_button_behavior = "nk_button_behavior".enumType
val nk_color_format = "nk_color_format".enumType
val nk_popup_type = "nk_popup_type".enumType
val nk_keys = "nk_keys".enumType
val nk_buttons = "nk_buttons".enumType
val nk_style_colors = "nk_style_colors".enumType
val nk_widget_layout_states = "nk_widget_layout_states".enumType
val nk_heading = "nk_heading".enumType
val nk_buffer_allocation_type = "nk_buffer_allocation_type".enumType
val nk_draw_list_stroke = "nk_draw_list_stroke".enumType

val nk_draw_vertex_color = typedef(nk_uint, "nk_draw_vertex_color")

// API

val nk_color = struct(NUKLEAR_PACKAGE, "NkColor", nativeName = "struct nk_color") {
	nk_byte.member("r", "")
	nk_byte.member("g", "")
	nk_byte.member("b", "")
	nk_byte.member("a", "")
}.nativeType

val nk_vec2 = struct(NUKLEAR_PACKAGE, "NkVec2", nativeName = "struct nk_vec2") {
	float.member("x", "")
	float.member("y", "")
}.nativeType

/*val nk_vec2i = struct(NUKLEAR_PACKAGE, "NkVec2i", nativeName = "struct nk_vec2i") {
	short.member("x", "")
	short.member("y", "")
}.nativeType*/

val nk_rect = struct(NUKLEAR_PACKAGE, "NkRect", nativeName = "struct nk_rect") {
	float.member("x", "")
	float.member("y", "")
	float.member("w", "")
	float.member("h", "")
}.nativeType

/*val nk_recti = struct(NUKLEAR_PACKAGE, "NkRecti", nativeName = "struct nk_recti") {
	short.member("x", "")
	short.member("y", "")
	short.member("w", "")
	short.member("h", "")
}.nativeType*/

val nk_image = struct(NUKLEAR_PACKAGE, "NkImage", nativeName = "struct nk_image") {
	nk_handle.member("handle", "")
	unsigned_short.member("w", "")
	unsigned_short.member("h", "")
	unsigned_short.array("region", "", size = 4)
}.nativeType

val nk_scroll = struct(NUKLEAR_PACKAGE, "NkScroll", nativeName = "struct nk_scroll") {
	unsigned_short.member("x", "")
	unsigned_short.member("y", "")
}.nativeType

val nk_malloc = "nk_malloc".callback(
	NUKLEAR_PACKAGE, voidptr, "NkMalloc",
	"",

	nk_handle.IN("handle", ""),
	voidptr.IN("old", ""),
	nk_size.IN("size", "")
) {
	documentation = "Instances of this interface may be set to the ##NkAllocator struct."
}

val nk_mfree = "nk_mfree".callback(
	NUKLEAR_PACKAGE, void, "NkMFree",
	"",

	nk_handle.IN("handle", ""),
	voidptr.IN("ptr", "")
) {
	documentation = "Instances of this interface may be set to the ##NkAllocator struct."
}

val nk_allocator = struct(NUKLEAR_PACKAGE, "NkAllocator", nativeName = "struct nk_allocator") {
	nk_handle.member("userdata", "")
	nullable..nk_malloc.member("alloc", "")
	nullable..nk_mfree.member("mfree", "")
}.nativeType
val nk_allocator_p = nk_allocator.p

val nk_draw_null_texture = struct(NUKLEAR_PACKAGE, "NkDrawNullTexture", nativeName = "struct nk_draw_null_texture") {
	nk_handle.member("texture", "texture handle to a texture with a white pixel")
	nk_vec2.member("uv", "coordinates to a white pixel in the texture")
}.nativeType

val nk_convert_config = struct(NUKLEAR_PACKAGE, "NkConvertConfig", nativeName = "struct nk_convert_config") {
	float.member("global_alpha", "global alpha value")
	nk_anti_aliasing.member("line_AA", "line anti-aliasing flag can be turned off if you are tight on memory").links("ANTI_ALIASING_\\w+")
	nk_anti_aliasing.member("shape_AA", "shape anti-aliasing flag can be turned off if you are tight on memory").links("ANTI_ALIASING_\\w+")
	unsigned_int.member("circle_segment_count", "number of segments used for circles: default to 22")
	unsigned_int.member("arc_segment_count", "number of segments used for arcs: default to 22")
	unsigned_int.member("curve_segment_count", "number of segments used for curves: default to 22")
	nk_draw_null_texture.member("null_texture", "handle to texture with a white pixel for shape drawing")
}.nativeType

// MEMORY BUFFER

val nk_memory_status = struct(NUKLEAR_PACKAGE, "NkMemoryStatus", nativeName = "struct nk_memory_status") {
	void_p.member("memory", "")
	unsigned_int.member("type", "")
	AutoSize("memory")..nk_size.member("size", "")
	nk_size.member("allocated", "")
	nk_size.member("needed", "")
	nk_size.member("calls", "")
}.nativeType

val nk_buffer_marker = struct(NUKLEAR_PACKAGE, "NkBufferMarker", nativeName = "struct nk_buffer_marker") {
	int.member("active", "")
	nk_size.member("offset", "")
}.nativeType

val nk_memory = struct(NUKLEAR_PACKAGE, "NkMemory", nativeName = "struct nk_memory") {
	nullable..void_p.member("ptr", "")
	AutoSize("ptr")..nk_size.member("size", "")
}.nativeType

val nk_buffer = struct(NUKLEAR_PACKAGE, "NkBuffer", nativeName = "struct nk_buffer") {
	nk_buffer_marker.array("marker", "buffer marker to free a buffer to a certain offset", size = 2)
	nk_allocator.member("pool", "allocator callback for dynamic buffers")
	nk_allocation_type.member("type", "memory management type")
	nk_memory.member("memory", "memory and size of the current memory block")
	float.member("grow_factor", "growing factor for dynamic memory management")
	nk_size.member("allocated", "total amount of memory allocated")
	nk_size.member("needed", "totally consumed memory given that enough memory is present")
	nk_size.member("calls", "number of allocation calls")
	nk_size.member("size", "current size of the buffer")
}.nativeType
val nk_buffer_p = nk_buffer.p

// STRING

val nk_str = struct(NUKLEAR_PACKAGE, "NkStr", nativeName = "struct nk_str") {
	nk_buffer.member("buffer", "")
	int.member("len", "in codepoints/runes/glyphs")
}.nativeType
val nk_str_p = nk_str.p

// TEXT EDITOR

val nk_text_edit_p = struct_p(NUKLEAR_PACKAGE, "NkTextEdit", nativeName = "struct nk_text_edit")

val nk_filter = "nk_filter".callback(
	NUKLEAR_PACKAGE, int, "NkFilterCallback",
	"",

	const..nk_text_edit_p.IN("edit", ""),
	nk_rune.IN("unicode", "")
) {
	documentation = "Instances of this interface may be set to the ##NkTextEdit struct."
}

val nk_paste_f = "nk_paste_f".callback(
	NUKLEAR_PACKAGE, void, "NkPasteCallback",
	"",

	nk_handle.IN("handle", ""),
	nk_text_edit_p.IN("edit", "")
) {
	documentation = "Instances of this interface may be set to the ##NkClipboard struct."
}

val nk_copy_f = "nk_copy_f".callback(
	NUKLEAR_PACKAGE, void, "NkCopyCallback",
	"",

	nk_handle.IN("handle", ""),
	const..charUTF8_p.IN("text", ""),
	int.IN("len", "")
) {
	documentation = "Instances of this interface may be set to the ##NkClipboard struct."
}

val nk_clipboard = struct(NUKLEAR_PACKAGE, "NkClipboard", nativeName = "struct nk_clipboard") {
	nk_handle.member("userdata", "")
	nullable..nk_paste_f.member("paste", "")
	nullable..nk_copy_f.member("copy", "")
}.nativeType

val nk_text_undo_record = struct(NUKLEAR_PACKAGE, "NkTextUndoRecord", nativeName = "struct nk_text_undo_record") {
   int.member("where", "")
   short.member("insert_length", "")
   short.member("delete_length", "")
   short.member("char_storage", "")
}.nativeType

val NK_TEXTEDIT_UNDOSTATECOUNT = 99
val NK_TEXTEDIT_UNDOCHARCOUNT = 999
val nk_text_undo_state = struct(NUKLEAR_PACKAGE, "NkTextUndoState", nativeName = "struct nk_text_undo_state") {
   nk_text_undo_record.array("undo_rec", "", size = NK_TEXTEDIT_UNDOSTATECOUNT)
   nk_rune.array("undo_char", "", size = NK_TEXTEDIT_UNDOCHARCOUNT)
   short.member("undo_point", "")
   short.member("redo_point", "")
   short.member("undo_char_point", "")
   short.member("redo_char_point", "")
}.nativeType

val nk_text_edit = struct(NUKLEAR_PACKAGE, "NkTextEdit", nativeName = "struct nk_text_edit") {
	nk_clipboard.member("clip", "")
	nk_str.member("string", "")
	nullable..nk_filter.member("filter", "")
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
}.nativeType

// FONT

val nk_user_font_glyph = struct(NUKLEAR_PACKAGE, "NkUserFontGlyph", nativeName = "struct nk_user_font_glyph") {
	nk_vec2.array("uv", "texture coordinates", size = 2)
	nk_vec2.member("offset", "offset between top left and glyph")
	float.member("width", "width of the glyph")
	float.member("height", "height of the glyph")
	float.member("xadvance", "offset to the next glyph")
}.nativeType

val nk_text_width_f = "nk_text_width_f".callback(
	NUKLEAR_PACKAGE, float, "NkTextWidthCallback",
	"",

	nk_handle.IN("handle", ""),
	float.IN("h", ""),
	const..charUTF8_p.IN("text", ""),
	int.IN("len", "")
) {
	documentation = "Instances of this interface may be set to the ##NkUserFont struct."
}

val nk_query_font_glyph_f = "nk_query_font_glyph_f".callback(
	NUKLEAR_PACKAGE, void, "NkQueryFontGlyphCallback",
	"",

	nk_handle.IN("handle", ""),
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
	nullable..nk_handle.member("texture", "texture handle to the used font atlas or texture")
}.nativeType
val nk_user_font_p = nk_user_font.p

// DRAWING
val nk_command = struct(NUKLEAR_PACKAGE, "NkCommand", nativeName = "struct nk_command") {
	nk_command_type.member("type", "")
	nk_size.member("next", "")
	nk_handle.member("userdata", "")
}.nativeType

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
}

val nk_command_text = struct(NUKLEAR_PACKAGE, "NkCommandText", nativeName = "struct nk_command_text") {
	nk_command.member("header", "")
	nk_user_font.const_p.member("font", "")
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

val nk_command_buffer = struct(NUKLEAR_PACKAGE, "NkCommandBuffer", nativeName = "struct nk_command_buffer") {
	nk_buffer_p.member("base", "")
	nk_rect.member("clip", "")
	int.member("use_clipping", "")
	nk_handle.member("userdata", "")
	nk_size.member("begin", "")
	nk_size.member("end", "")
	nk_size.member("last", "")
}.nativeType
val nk_command_buffer_p = nk_command_buffer.p

// INPUT

val nk_mouse_button = struct(NUKLEAR_PACKAGE, "NkMouseButton", nativeName = "struct nk_mouse_button") {
	int.member("down", "")
	unsigned_int.member("clicked", "")
	nk_vec2.member("clicked_pos", "")
}.nativeType

val NK_BUTTON_MAX = 3
val nk_mouse = struct(NUKLEAR_PACKAGE, "NkMouse", nativeName = "struct nk_mouse") {
	nk_mouse_button.array("buttons", "", size = NK_BUTTON_MAX)
	nk_vec2.member("pos", "")
	nk_vec2.member("prev", "")
	nk_vec2.member("delta", "")
	float.member("scroll_delta", "")
	bool.member("grab", "")
	bool.member("grabbed", "")
	bool.member("ungrab", "")
}.nativeType

val nk_key = struct(NUKLEAR_PACKAGE, "NkKey", nativeName = "struct nk_key") {
	int.member("down", "")
	unsigned_int.member("clicked", "")
}.nativeType

val NK_KEY_MAX = 25 // TODO: last value of nk_keys enum
val NK_INPUT_MAX = 16
val nk_keyboard = struct(NUKLEAR_PACKAGE, "NkKeyboard", nativeName = "struct nk_keyboard") {
	nk_key.array("keys", "", size = NK_KEY_MAX)
	char.array("text", "", size = NK_INPUT_MAX)
	int.member("text_len", "")
}.nativeType

val nk_input = struct(NUKLEAR_PACKAGE, "NkInput", nativeName = "struct nk_input") {
	nk_keyboard.member("keyboard", "")
	nk_mouse.member("mouse", "")
}.nativeType
val nk_input_p = nk_input.p

// DRAW LIST

val nk_draw_vertex = struct(NUKLEAR_PACKAGE, "NkDrawVertex", nativeName = "struct nk_draw_vertex") {
	nk_vec2.member("pos", "")
	nk_vec2.member("uv", "")
	nk_draw_vertex_color.member("col", "")
}

val nk_draw_command_p = struct_p(NUKLEAR_PACKAGE, "NkDrawCommand", nativeName = "struct nk_draw_command") {
	unsigned_int.member("elem_count", "")
	/* number of elements in the current draw batch */
	nk_rect.member("clip_rect", "")
	/* current screen clipping rectangle */
	nk_handle.member("texture", "")
	/* current texture to set */
	nk_handle.member("userdata", "")
}

val nk_draw_list = struct(NUKLEAR_PACKAGE, "NkDrawList", nativeName = "struct nk_draw_list") {
	float.member("global_alpha", "")
	nk_anti_aliasing.member("shape_AA", "")
	nk_anti_aliasing.member("line_AA", "")
	nk_draw_null_texture.member("null_texture", "")
	nk_rect.member("clip_rect", "")
	nullable..nk_buffer_p.member("buffer", "")
	nullable..nk_buffer_p.member("vertices", "")
	nullable..nk_buffer_p.member("elements", "")
	unsigned_int.member("element_count", "")
	unsigned_int.member("vertex_count", "")
	nk_size.member("cmd_offset", "")
	unsigned_int.member("cmd_count", "")
	unsigned_int.member("path_count", "")
	unsigned_int.member("path_offset", "")
	nk_vec2.array("circle_vtx", "", size = 12)
	nk_handle.member("userdata", "")
}.nativeType
val nk_draw_list_p = nk_draw_list.p

// GUI

val nk_style_item_data = union(NUKLEAR_PACKAGE, "NkStyleItemData", nativeName = "struct nk_style_item_data") {
	nk_image.member("image", "")
	nk_color.member("color", "")
}.nativeType

val nk_style_item = struct(NUKLEAR_PACKAGE, "NkStyleItem", nativeName = "struct nk_style_item") {
	nk_style_item_type.member("type", "")
	nk_style_item_data.member("data", "")
}.nativeType

val nk_style_text = struct(NUKLEAR_PACKAGE, "NkStyleText", nativeName = "struct nk_style_text") {
	nk_color.member("color", "")
	nk_vec2.member("padding", "")
}.nativeType

val nk_draw_begin = "nk_draw_begin".callback(
	NUKLEAR_PACKAGE, float, "NkDrawBeginCallback",
	"",

	nk_command_buffer_p.IN("buffer", ""),
	nk_handle.IN("userdata", "")
) {
	documentation = "Instances of this interface may be set to the {@code nk_style_*} structs."
}

val nk_draw_end = "nk_draw_end".callback(
	NUKLEAR_PACKAGE, float, "NkDrawEndCallback",
	"",

	nk_command_buffer_p.IN("buffer", ""),
	nk_handle.IN("userdata", "")
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
}.nativeType

val nk_style_toggle = struct(NUKLEAR_PACKAGE, "NkStyleToggle", nativeName = "struct nk_style_toggle") {
	/* background */
	nk_style_item.member("normal", "")
	nk_style_item.member("hover", "")
	nk_style_item.member("active", "")

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

	/* optional user callbacks */
	nk_handle.member("userdata", "")
	nullable..nk_draw_begin.member("draw_begin", "")
	nullable..nk_draw_end.member("draw_end", "")
}.nativeType

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
}.nativeType

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
	nk_symbol_type.member("inc_symbol", "")
	nk_symbol_type.member("dec_symbol", "")

	/* optional user callbacks */
	nk_handle.member("userdata", "")
	nullable..nk_draw_begin.member("draw_begin", "")
	nullable..nk_draw_end.member("draw_end", "")
}.nativeType

val nk_style_progress = struct(NUKLEAR_PACKAGE, "NkStyleProgress", nativeName = "struct nk_style_progress") {
	/* background */
	nk_style_item.member("normal", "")
	nk_style_item.member("hover", "")
	nk_style_item.member("active", "")

	/* cursor */
	nk_style_item.member("cursor_normal", "")
	nk_style_item.member("cursor_hover", "")
	nk_style_item.member("cursor_active", "")

	/* properties */
	float.member("rounding", "")
	nk_vec2.member("padding", "")

	/* optional user callbacks */
	nk_handle.member("userdata", "")
	nullable..nk_draw_begin.member("draw_begin", "")
	nullable..nk_draw_end.member("draw_end", "")
}.nativeType

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

	/* properties */
	float.member("border", "")
	float.member("rounding", "")
	nk_vec2.member("padding", "")

	/* optional buttons */
	int.member("show_buttons", "")
	nk_style_button.member("inc_button", "")
	nk_style_button.member("dec_button", "")
	nk_symbol_type.member("inc_symbol", "")
	nk_symbol_type.member("dec_symbol", "")

	/* optional user callbacks */
	nk_handle.member("userdata", "")
	nullable..nk_draw_begin.member("draw_begin", "")
	nullable..nk_draw_end.member("draw_end", "")
}.nativeType

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
}.nativeType

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
	nk_symbol_type.member("sym_left", "")
	nk_symbol_type.member("sym_right", "")

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
}.nativeType

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
}.nativeType

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
}.nativeType

val nk_style_tab = struct(NUKLEAR_PACKAGE, "NkStyleTab", nativeName = "struct nk_style_tab") {
	/* background */
	nk_style_item.member("background", "")
	nk_color.member("border_color", "")
	nk_color.member("text", "")

	/* button */
	nk_style_button.member("tab_button", "")
	nk_style_button.member("node_button", "")
	nk_symbol_type.member("sym_minimize", "")
	nk_symbol_type.member("sym_maximize", "")

	/* properties */
	float.member("border", "")
	float.member("rounding", "")
	nk_vec2.member("padding", "")
	nk_vec2.member("spacing", "")
}.nativeType

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
	nk_style_header_align.member("align", "")
	nk_vec2.member("padding", "")
	nk_vec2.member("label_padding", "")
	nk_vec2.member("spacing", "")
}.nativeType

val nk_style_window = struct(NUKLEAR_PACKAGE, "NkStyleWindow", nativeName = "struct nk_style_window") {
	nk_style_window_header.member("header", "")
	nk_style_item.member("fixed_background", "")
	nk_color.member("background", "")

	nk_color.member("border_color", "")
	nk_color.member("combo_border_color", "")
	nk_color.member("contextual_border_color", "")
	nk_color.member("menu_border_color", "")
	nk_color.member("group_border_color", "")
	nk_color.member("tooltip_border_color", "")

	nk_style_item.member("scaler", "")
	nk_vec2.member("footer_padding", "")

	float.member("border", "")
	float.member("combo_border", "")
	float.member("contextual_border", "")
	float.member("menu_border", "")
	float.member("group_border", "")
	float.member("tooltip_border", "")

	float.member("rounding", "")
	nk_vec2.member("scaler_size", "")
	nk_vec2.member("padding", "")
	nk_vec2.member("spacing", "")
	nk_vec2.member("scrollbar_size", "")
	nk_vec2.member("min_size", "")
}.nativeType

val nk_style = struct(NUKLEAR_PACKAGE, "NkStyle", nativeName = "struct nk_style") {
	nk_user_font.member("font", "")
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
}.nativeType

// PANEL

val nk_chart_slot = struct(NUKLEAR_PACKAGE, "NkChartSlot", nativeName = "struct nk_chart_slot") {
	nk_chart_type.member("type", "")
	nk_color.member("color", "")
	nk_color.member("highlight", "")
	float.member("min", "")
	float.member("max", "")
	float.member("range", "")
	int.member("count", "")
	nk_vec2.member("last", "")
	int.member("index", "")
}.nativeType

val NK_CHART_MAX_SLOT = 4
val nk_chart = struct(NUKLEAR_PACKAGE, "NkChart", nativeName = "struct nk_chart") {
	nk_chart_slot.array("slots", "", size = NK_CHART_MAX_SLOT)
	int.member("slot", "")
	float.member("x", "")
	float.member("y", "")
	float.member("w", "")
	float.member("h", "")
}.nativeType

val nk_row_layout = struct(NUKLEAR_PACKAGE, "NkRowLayout", nativeName = "struct nk_row_layout") {
	int.member("type", "")
	int.member("index", "")
	float.member("height", "")
	int.member("columns", "")
	float.const_p.member("ratio", "")
	float.member("item_width", "")
	float.member("item_height", "")
	float.member("item_offset", "")
	float.member("filled", "")
	nk_rect.member("item", "")
	int.member("tree_depth", "")
}.nativeType

val nk_popup_buffer = struct(NUKLEAR_PACKAGE, "NkPopupBuffer", nativeName = "struct nk_popup_buffer") {
	nk_size.member("begin", "")
	nk_size.member("parent", "")
	nk_size.member("last", "")
	nk_size.member("end", "")
	int.member("active", "")
}.nativeType

val nk_menu_state = struct(NUKLEAR_PACKAGE, "NkMenuState", nativeName = "struct nk_menu_state") {
	float.member("x", "")
	float.member("y", "")
	float.member("w", "")
	float.member("h", "")
	nk_scroll.member("offset", "")
}.nativeType

val nk_panel_p = struct_p(NUKLEAR_PACKAGE, "NkPanel", nativeName = "struct nk_panel")
val nk_panel = struct(NUKLEAR_PACKAGE, "NkPanel", nativeName = "struct nk_panel") {
	nk_flags.member("flags", "")
	nk_rect.member("bounds", "")
	nk_scroll.p.member("offset", "")
	float.member("at_x", "")
	float.member("at_y", "")
	float.member("max_x", "")
	float.member("width", "")
	float.member("height", "")
	float.member("footer_h", "")
	float.member("header_h", "")
	float.member("border", "")
	nk_rect.member("clip", "")
	nk_menu_state.member("menu", "")
	nk_row_layout.member("row", "")
	nk_chart.member("chart", "")
	nk_popup_buffer.member("popup_buffer", "")
	nk_command_buffer_p.member("buffer", "")
	nk_panel_p.member("parent", "")
}.nativeType

// WINDOW

val nk_window_p = struct_p(NUKLEAR_PACKAGE, "NkWindow", nativeName = "struct nk_window")
val nk_popup_state = struct(NUKLEAR_PACKAGE, "NkPopupState", nativeName = "struct nk_popup_state") {
	nk_window_p.member("win", "")
	nk_window_flags.member("type", "")
	nk_hash.member("name", "")
	int.member("active", "")
	unsigned.member("combo_count", "")
	unsigned.member("con_count", "")
	unsigned.member("con_old", "")
	unsigned.member("active_con", "")
}.nativeType

val nk_edit_state = struct(NUKLEAR_PACKAGE, "NkEditState", nativeName = "struct nk_edit_state") {
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
}.nativeType

val NK_MAX_NUMBER_BUFFER = 64
val nk_property_state = struct(NUKLEAR_PACKAGE, "NkPropertyState", nativeName = "struct nk_property_state") {
	int.member("active", "")
	int.member("prev", "")
	char.array("buffer", "", size = NK_MAX_NUMBER_BUFFER)
	int.member("length", "")
	int.member("cursor", "")
	nk_hash.member("name", "")
	unsigned_int.member("seq", "")
	unsigned_int.member("old", "")
	int.member("state", "")
}.nativeType

val nk_scaling_state = struct(NUKLEAR_PACKAGE, "NkScalingState", nativeName = "struct nk_scaling_state") {
	nk_vec2.member("start_size", "")
	int.member("active", "")
}.nativeType

val nk_window = struct(NUKLEAR_PACKAGE, "NkWindow", nativeName = "struct nk_window") {
	unsigned_int.member("seq", "")
	nk_hash.member("name", "")
	nk_flags.member("flags", "")
	nk_rect.member("bounds", "")
	nk_scroll.member("scrollbar", "")
	nk_command_buffer.member("buffer", "")
	nk_panel.p.member("layout", "")

	/* persistent widget state */
	nk_property_state.member("property", "")
	nk_popup_state.member("popup", "")
	nk_edit_state.member("edit", "")
	nk_scaling_state.member("scaling", "")

	"nk_table".p.member("tables", "") // TODO: private API?
	unsigned_short.member("table_count", "")
	unsigned_short.member("table_size", "")

	/* window list hooks */
	nk_window_p.member("next", "")
	nk_window_p.member("prev", "")
	nk_window_p.member("parent", "")
}

val nk_context_p = struct_p(NUKLEAR_PACKAGE, "NkContext", nativeName = "struct nk_context") {
	documentation = ""

/* public: can be accessed freely */
	nk_input.member("input", "")
	nk_style.member("style", "")
	nk_buffer.member("memory", "")
	nk_clipboard.member("clip", "")
	nk_flags.member("last_widget_state", "")

/* private:
	should only be accessed if you
	know what you are doing */
	nk_draw_list.member("draw_list", "")
	nk_handle.member("userdata", "")

	/* text editor objects are quite big because they have a internal
	 * undo/redo stack. It therefore does not make sense to have one for
	 * each window for temporary use cases, so I only provide *one* instance
	 * for all windows. This works because the content is cleared anyway */
	nk_text_edit.member("text_edit", "")

	/* windows */
	int.member("build", "")
	nullable..voidptr.member("pool", "")
	nullable..nk_window_p.member("begin", "")
	nullable..nk_window_p.member("end", "")
	nullable..nk_window_p.member("active", "")
	nullable..nk_window_p.member("current", "")
	nullable.."nk_page_element".p.member("freelist", "")
	unsigned_int.member("count", "")
	unsigned_int.member("seq", "")
}

val nk_value_getter = "nk_value_getter".callback(
	NUKLEAR_PACKAGE, float, "NkValueGetter",
	"",

	voidptr.IN("userdata", ""),
	int.IN("index", "")
) {
	documentation = "Instances of this interface may be passed to the #nk_plot_function() function."
}

val nk_item_getter = "nk_item_getter".callback(
	NUKLEAR_PACKAGE, float, "NkItemGetter",
	"",

	voidptr.IN("userdata", ""),
	int.IN("selected", ""),
	const..charUTF8_pp.IN("item", "")
) {
	documentation = "Instances of this interface may be passed to the #nk_combo_callback() and #nk_combobox_callback() functions."
}