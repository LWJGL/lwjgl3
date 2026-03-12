/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package harfbuzz.templates

import org.lwjgl.generator.*
import harfbuzz.*

val hb_vector = "HarfBuzzVector".nativeClass(Module.HARFBUZZ, prefix = "HB", prefixMethod = "hb_", binding = HARFBUZZ_VECTOR_BINDING) {
	javaImport("static org.lwjgl.util.harfbuzz.HarfBuzz.*")

	EnumConstant(
		"VECTOR_FORMAT_INVALID".enum("HB_TAG_NONE"),
		"VECTOR_FORMAT_SVG".enum("HB_TAG ('s','v','g',' ')")
	)

	EnumConstant(
		"VECTOR_EXTENTS_MODE_NONE".enum("0"),
		"VECTOR_EXTENTS_MODE_EXPAND".enum
	)

	hb_vector_draw_t.p(
		"vector_draw_create_or_fail",

		hb_vector_format_t("format")
	)

	hb_vector_draw_t.p(
		"vector_draw_reference",

		hb_vector_draw_t.p("draw")
	)

	void(
		"vector_draw_destroy",

		hb_vector_draw_t.p("draw")
	)

	hb_bool_t(
		"vector_draw_set_user_data",

		hb_vector_draw_t.p("draw"),
		hb_user_data_key_t.p("key"),
		nullable..opaque_p("data"),
		nullable..hb_destroy_func_t("destroy"),
		hb_bool_t("replace")
	)

	opaque_p(
		"vector_draw_get_user_data",

		hb_vector_draw_t.p("draw"),
		hb_user_data_key_t.p("key")
	)

	void(
		"vector_draw_set_transform",

		hb_vector_draw_t.p("draw"),
		float("xx"), float("yx"),
		float("xy"), float("yy"),
		float("dx"), float("dy")
	)

	void(
		"vector_draw_get_transform",

		hb_vector_draw_t.p("draw"),
		Check(1)..nullable..float.p("xx"), Check(1)..nullable..float.p("yx"),
		Check(1)..nullable..float.p("xy"), Check(1)..nullable..float.p("yy"),
		Check(1)..nullable..float.p("dx"), Check(1)..nullable..float.p("dy")
	)

	void(
		"vector_draw_set_scale_factor",

		hb_vector_draw_t.p("draw"),
		float("x_scale_factor"),
		float("y_scale_factor")
	)

	void(
		"vector_draw_get_scale_factor",

		hb_vector_draw_t.p("draw"),
		Check(1)..nullable..float.p("x_scale_factor"),
		Check(1)..nullable..float.p("y_scale_factor")
	)

	void(
		"vector_draw_set_extents",

		hb_vector_draw_t.p("draw"),
		hb_vector_extents_t.const.p("extents")
	)

	hb_bool_t(
		"vector_draw_get_extents",

		hb_vector_draw_t.p("draw"),
		hb_vector_extents_t.p("extents")
	)

	hb_bool_t(
		"vector_draw_set_glyph_extents",

		hb_vector_draw_t.p("draw"),
		hb_glyph_extents_t.const.p("glyph_extents")
	)

	hb_draw_funcs_t.p(
		"vector_draw_get_funcs",

		void()
	)

	hb_bool_t(
		"vector_draw_glyph",

		hb_vector_draw_t.p("draw"),
		hb_font_t.p("font"),
		hb_codepoint_t("glyph"),
		float("pen_x"),
		float("pen_y"),
		hb_vector_extents_mode_t("extents_mode")
	)

	void(
		"vector_svg_set_flat",

		hb_vector_draw_t.p("draw"),
		hb_bool_t("flat")
	)

	void(
		"vector_svg_set_precision",

		hb_vector_draw_t.p("draw"),
		unsigned_int("precision")
	)

	hb_blob_t.p(
		"vector_draw_render",

		hb_vector_draw_t.p("draw")
	)

	void(
		"vector_draw_reset",

		hb_vector_draw_t.p("draw")
	)

	void(
		"vector_draw_recycle_blob",

		hb_vector_draw_t.p("draw"),
		hb_blob_t.p("blob")
	)

	hb_vector_paint_t.p(
		"vector_paint_create_or_fail",

		hb_vector_format_t("format")
	)

	hb_vector_paint_t.p(
		"vector_paint_reference",

		hb_vector_paint_t.p("paint")
	)

	void(
		"vector_paint_destroy",

		hb_vector_paint_t.p("paint")
	)

	hb_bool_t(
		"vector_paint_set_user_data",

		hb_vector_paint_t.p("paint"),
		hb_user_data_key_t.p("key"),
		nullable..opaque_p("data"),
		nullable..hb_destroy_func_t("destroy"),
		hb_bool_t("replace")
	)

	opaque_p(
		"vector_paint_get_user_data",

		hb_vector_paint_t.p("paint"),
		hb_user_data_key_t.p("key")
	)

	void(
		"vector_paint_set_transform",

		hb_vector_paint_t.p("paint"),
		float("xx"), float("yx"),
		float("xy"), float("yy"),
		float("dx"), float("dy")
	)

	void(
		"vector_paint_get_transform",

		hb_vector_paint_t.p("paint"),
		Check(1)..nullable..float.p("xx"), Check(1)..nullable..float.p("yx"),
		Check(1)..nullable..float.p("xy"), Check(1)..nullable..float.p("yy"),
		Check(1)..nullable..float.p("dx"), Check(1)..nullable..float.p("dy")
	)

	void(
		"vector_paint_set_scale_factor",

		hb_vector_paint_t.p("paint"),
		float("x_scale_factor"),
		float("y_scale_factor")
	)

	void(
		"vector_paint_get_scale_factor",

		hb_vector_paint_t.p("paint"),
		Check(1)..nullable..float.p("x_scale_factor"),
		Check(1)..nullable..float.p("y_scale_factor")
	)

	void(
		"vector_paint_set_extents",

		hb_vector_paint_t.p("paint"),
		hb_vector_extents_t.const.p("extents")
	)

	hb_bool_t(
		"vector_paint_get_extents",

		hb_vector_paint_t.p("paint"),
		hb_vector_extents_t.p("extents")
	)

	hb_bool_t(
		"vector_paint_set_glyph_extents",

		hb_vector_paint_t.p("paint"),
		hb_glyph_extents_t.const.p("glyph_extents")
	)

	void(
		"vector_paint_set_foreground",

		hb_vector_paint_t.p("paint"),
		hb_color_t("foreground")
	)

	void(
		"vector_paint_set_palette",

		hb_vector_paint_t.p("paint"),
		int("palette")
	)

	void(
		"vector_paint_set_custom_palette_color",

		hb_vector_paint_t.p("paint"),
		unsigned_int("color_index"),
		hb_color_t("color")
	)

	void(
		"vector_paint_clear_custom_palette_colors",

		hb_vector_paint_t.p("paint")
	)

	hb_paint_funcs_t.p(
		"vector_paint_get_funcs",

		void()
	)

	hb_bool_t(
		"vector_paint_glyph",

		hb_vector_paint_t.p("paint"),
		hb_font_t.p("font"),
		hb_codepoint_t("glyph"),
		float("pen_x"),
		float("pen_y"),
		hb_vector_extents_mode_t("extents_mode")
	)

	void(
		"vector_svg_paint_set_flat",

		hb_vector_paint_t.p("paint"),
		hb_bool_t("flat")
	)

	void(
		"vector_svg_paint_set_precision",

		hb_vector_paint_t.p("paint"),
		unsigned_int("precision")
	)

	hb_blob_t.p(
		"vector_paint_render",

		hb_vector_paint_t.p("paint")
	)

	void(
		"vector_paint_reset",

		hb_vector_paint_t.p("paint")
	)

	void(
		"vector_paint_recycle_blob",

		hb_vector_paint_t.p("paint"),
		hb_blob_t.p("blob")
	)
}