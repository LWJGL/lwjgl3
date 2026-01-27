/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.harfbuzz;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class HarfBuzz {

    private static final SharedLibrary HARFBUZZ;
    static {
        SharedLibrary library;

        Object value = Configuration.HARFBUZZ_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("harfbuzz"));
        if (value instanceof SharedLibrary) {
            library = (SharedLibrary)value;
        } else {
            String name = (String)value;
            if ("freetype".equals(name)) {
                try {
                    library = (SharedLibrary)Class
                        .forName("org.lwjgl.util.freetype.FreeType")
                        .getMethod("getLibrary")
                        .invoke(null, (Object[])null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                library = Library.loadNative(HarfBuzz.class, "org.lwjgl.harfbuzz", name, true);
            }
        }

        HARFBUZZ = library;
    }

    /** Contains the function pointers loaded from the harfbuzz {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            tag_from_string                               = apiGetFunctionAddress(HARFBUZZ, "hb_tag_from_string"),
            tag_to_string                                 = apiGetFunctionAddress(HARFBUZZ, "hb_tag_to_string"),
            direction_from_string                         = apiGetFunctionAddress(HARFBUZZ, "hb_direction_from_string"),
            direction_to_string                           = apiGetFunctionAddress(HARFBUZZ, "hb_direction_to_string"),
            language_from_string                          = apiGetFunctionAddress(HARFBUZZ, "hb_language_from_string"),
            language_to_string                            = apiGetFunctionAddress(HARFBUZZ, "hb_language_to_string"),
            language_get_default                          = apiGetFunctionAddress(HARFBUZZ, "hb_language_get_default"),
            language_matches                              = apiGetFunctionAddress(HARFBUZZ, "hb_language_matches"),
            script_from_iso15924_tag                      = apiGetFunctionAddress(HARFBUZZ, "hb_script_from_iso15924_tag"),
            script_from_string                            = apiGetFunctionAddress(HARFBUZZ, "hb_script_from_string"),
            script_to_iso15924_tag                        = apiGetFunctionAddress(HARFBUZZ, "hb_script_to_iso15924_tag"),
            script_get_horizontal_direction               = apiGetFunctionAddress(HARFBUZZ, "hb_script_get_horizontal_direction"),
            feature_from_string                           = apiGetFunctionAddress(HARFBUZZ, "hb_feature_from_string"),
            feature_to_string                             = apiGetFunctionAddress(HARFBUZZ, "hb_feature_to_string"),
            variation_from_string                         = apiGetFunctionAddress(HARFBUZZ, "hb_variation_from_string"),
            variation_to_string                           = apiGetFunctionAddress(HARFBUZZ, "hb_variation_to_string"),
            color_get_alpha                               = apiGetFunctionAddress(HARFBUZZ, "hb_color_get_alpha"),
            color_get_red                                 = apiGetFunctionAddress(HARFBUZZ, "hb_color_get_red"),
            color_get_green                               = apiGetFunctionAddress(HARFBUZZ, "hb_color_get_green"),
            color_get_blue                                = apiGetFunctionAddress(HARFBUZZ, "hb_color_get_blue"),
            blob_create                                   = apiGetFunctionAddress(HARFBUZZ, "hb_blob_create"),
            blob_create_or_fail                           = apiGetFunctionAddress(HARFBUZZ, "hb_blob_create_or_fail"),
            blob_create_from_file                         = apiGetFunctionAddress(HARFBUZZ, "hb_blob_create_from_file"),
            blob_create_from_file_or_fail                 = apiGetFunctionAddress(HARFBUZZ, "hb_blob_create_from_file_or_fail"),
            blob_create_sub_blob                          = apiGetFunctionAddress(HARFBUZZ, "hb_blob_create_sub_blob"),
            blob_copy_writable_or_fail                    = apiGetFunctionAddress(HARFBUZZ, "hb_blob_copy_writable_or_fail"),
            blob_get_empty                                = apiGetFunctionAddress(HARFBUZZ, "hb_blob_get_empty"),
            blob_reference                                = apiGetFunctionAddress(HARFBUZZ, "hb_blob_reference"),
            blob_destroy                                  = apiGetFunctionAddress(HARFBUZZ, "hb_blob_destroy"),
            blob_set_user_data                            = apiGetFunctionAddress(HARFBUZZ, "hb_blob_set_user_data"),
            blob_get_user_data                            = apiGetFunctionAddress(HARFBUZZ, "hb_blob_get_user_data"),
            blob_make_immutable                           = apiGetFunctionAddress(HARFBUZZ, "hb_blob_make_immutable"),
            blob_is_immutable                             = apiGetFunctionAddress(HARFBUZZ, "hb_blob_is_immutable"),
            blob_get_length                               = apiGetFunctionAddress(HARFBUZZ, "hb_blob_get_length"),
            blob_get_data                                 = apiGetFunctionAddress(HARFBUZZ, "hb_blob_get_data"),
            blob_get_data_writable                        = apiGetFunctionAddress(HARFBUZZ, "hb_blob_get_data_writable"),
            segment_properties_equal                      = apiGetFunctionAddress(HARFBUZZ, "hb_segment_properties_equal"),
            segment_properties_hash                       = apiGetFunctionAddress(HARFBUZZ, "hb_segment_properties_hash"),
            segment_properties_overlay                    = apiGetFunctionAddress(HARFBUZZ, "hb_segment_properties_overlay"),
            buffer_create                                 = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_create"),
            buffer_create_similar                         = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_create_similar"),
            buffer_reset                                  = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_reset"),
            buffer_get_empty                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_empty"),
            buffer_reference                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_reference"),
            buffer_destroy                                = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_destroy"),
            buffer_set_user_data                          = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_user_data"),
            buffer_get_user_data                          = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_user_data"),
            buffer_set_content_type                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_content_type"),
            buffer_get_content_type                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_content_type"),
            buffer_set_unicode_funcs                      = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_unicode_funcs"),
            buffer_get_unicode_funcs                      = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_unicode_funcs"),
            buffer_set_direction                          = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_direction"),
            buffer_get_direction                          = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_direction"),
            buffer_set_script                             = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_script"),
            buffer_get_script                             = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_script"),
            buffer_set_language                           = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_language"),
            buffer_get_language                           = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_language"),
            buffer_set_segment_properties                 = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_segment_properties"),
            buffer_get_segment_properties                 = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_segment_properties"),
            buffer_guess_segment_properties               = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_guess_segment_properties"),
            buffer_set_flags                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_flags"),
            buffer_get_flags                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_flags"),
            buffer_set_cluster_level                      = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_cluster_level"),
            buffer_get_cluster_level                      = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_cluster_level"),
            buffer_set_replacement_codepoint              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_replacement_codepoint"),
            buffer_get_replacement_codepoint              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_replacement_codepoint"),
            buffer_set_invisible_glyph                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_invisible_glyph"),
            buffer_get_invisible_glyph                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_invisible_glyph"),
            buffer_set_not_found_glyph                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_not_found_glyph"),
            buffer_get_not_found_glyph                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_not_found_glyph"),
            buffer_set_not_found_variation_selector_glyph = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_not_found_variation_selector_glyph"),
            buffer_get_not_found_variation_selector_glyph = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_not_found_variation_selector_glyph"),
            buffer_set_random_state                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_random_state"),
            buffer_get_random_state                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_random_state"),
            buffer_clear_contents                         = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_clear_contents"),
            buffer_pre_allocate                           = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_pre_allocate"),
            buffer_allocation_successful                  = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_allocation_successful"),
            buffer_reverse                                = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_reverse"),
            buffer_reverse_range                          = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_reverse_range"),
            buffer_reverse_clusters                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_reverse_clusters"),
            buffer_add                                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_add"),
            buffer_add_utf8                               = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_add_utf8"),
            buffer_add_utf16                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_add_utf16"),
            buffer_add_utf32                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_add_utf32"),
            buffer_add_latin1                             = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_add_latin1"),
            buffer_add_codepoints                         = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_add_codepoints"),
            buffer_append                                 = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_append"),
            buffer_set_length                             = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_length"),
            buffer_get_length                             = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_length"),
            buffer_get_glyph_infos                        = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_glyph_infos"),
            buffer_get_glyph_positions                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_get_glyph_positions"),
            buffer_has_positions                          = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_has_positions"),
            buffer_normalize_glyphs                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_normalize_glyphs"),
            buffer_serialize_format_from_string           = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_serialize_format_from_string"),
            buffer_serialize_format_to_string             = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_serialize_format_to_string"),
            buffer_serialize_list_formats                 = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_serialize_list_formats"),
            buffer_serialize_glyphs                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_serialize_glyphs"),
            buffer_serialize_unicode                      = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_serialize_unicode"),
            buffer_serialize                              = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_serialize"),
            buffer_deserialize_glyphs                     = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_deserialize_glyphs"),
            buffer_deserialize_unicode                    = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_deserialize_unicode"),
            buffer_diff                                   = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_diff"),
            buffer_set_message_func                       = apiGetFunctionAddress(HARFBUZZ, "hb_buffer_set_message_func"),
            draw_funcs_set_move_to_func                   = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_set_move_to_func"),
            draw_funcs_set_line_to_func                   = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_set_line_to_func"),
            draw_funcs_set_quadratic_to_func              = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_set_quadratic_to_func"),
            draw_funcs_set_cubic_to_func                  = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_set_cubic_to_func"),
            draw_funcs_set_close_path_func                = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_set_close_path_func"),
            draw_funcs_create                             = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_create"),
            draw_funcs_get_empty                          = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_get_empty"),
            draw_funcs_reference                          = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_reference"),
            draw_funcs_destroy                            = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_destroy"),
            draw_funcs_set_user_data                      = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_set_user_data"),
            draw_funcs_get_user_data                      = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_get_user_data"),
            draw_funcs_make_immutable                     = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_make_immutable"),
            draw_funcs_is_immutable                       = apiGetFunctionAddress(HARFBUZZ, "hb_draw_funcs_is_immutable"),
            draw_move_to                                  = apiGetFunctionAddress(HARFBUZZ, "hb_draw_move_to"),
            draw_line_to                                  = apiGetFunctionAddress(HARFBUZZ, "hb_draw_line_to"),
            draw_quadratic_to                             = apiGetFunctionAddress(HARFBUZZ, "hb_draw_quadratic_to"),
            draw_cubic_to                                 = apiGetFunctionAddress(HARFBUZZ, "hb_draw_cubic_to"),
            draw_close_path                               = apiGetFunctionAddress(HARFBUZZ, "hb_draw_close_path"),
            face_count                                    = apiGetFunctionAddress(HARFBUZZ, "hb_face_count"),
            face_create                                   = apiGetFunctionAddress(HARFBUZZ, "hb_face_create"),
            face_create_or_fail                           = apiGetFunctionAddress(HARFBUZZ, "hb_face_create_or_fail"),
            face_create_or_fail_using                     = apiGetFunctionAddress(HARFBUZZ, "hb_face_create_or_fail_using"),
            face_create_from_file_or_fail                 = apiGetFunctionAddress(HARFBUZZ, "hb_face_create_from_file_or_fail"),
            face_create_from_file_or_fail_using           = apiGetFunctionAddress(HARFBUZZ, "hb_face_create_from_file_or_fail_using"),
            face_list_loaders                             = apiGetFunctionAddress(HARFBUZZ, "hb_face_list_loaders"),
            face_create_for_tables                        = apiGetFunctionAddress(HARFBUZZ, "hb_face_create_for_tables"),
            face_get_empty                                = apiGetFunctionAddress(HARFBUZZ, "hb_face_get_empty"),
            face_reference                                = apiGetFunctionAddress(HARFBUZZ, "hb_face_reference"),
            face_destroy                                  = apiGetFunctionAddress(HARFBUZZ, "hb_face_destroy"),
            face_set_user_data                            = apiGetFunctionAddress(HARFBUZZ, "hb_face_set_user_data"),
            face_get_user_data                            = apiGetFunctionAddress(HARFBUZZ, "hb_face_get_user_data"),
            face_make_immutable                           = apiGetFunctionAddress(HARFBUZZ, "hb_face_make_immutable"),
            face_is_immutable                             = apiGetFunctionAddress(HARFBUZZ, "hb_face_is_immutable"),
            face_reference_table                          = apiGetFunctionAddress(HARFBUZZ, "hb_face_reference_table"),
            face_reference_blob                           = apiGetFunctionAddress(HARFBUZZ, "hb_face_reference_blob"),
            face_set_index                                = apiGetFunctionAddress(HARFBUZZ, "hb_face_set_index"),
            face_get_index                                = apiGetFunctionAddress(HARFBUZZ, "hb_face_get_index"),
            face_set_upem                                 = apiGetFunctionAddress(HARFBUZZ, "hb_face_set_upem"),
            face_get_upem                                 = apiGetFunctionAddress(HARFBUZZ, "hb_face_get_upem"),
            face_set_glyph_count                          = apiGetFunctionAddress(HARFBUZZ, "hb_face_set_glyph_count"),
            face_get_glyph_count                          = apiGetFunctionAddress(HARFBUZZ, "hb_face_get_glyph_count"),
            face_set_get_table_tags_func                  = apiGetFunctionAddress(HARFBUZZ, "hb_face_set_get_table_tags_func"),
            face_get_table_tags                           = apiGetFunctionAddress(HARFBUZZ, "hb_face_get_table_tags"),
            face_collect_unicodes                         = apiGetFunctionAddress(HARFBUZZ, "hb_face_collect_unicodes"),
            face_collect_nominal_glyph_mapping            = apiGetFunctionAddress(HARFBUZZ, "hb_face_collect_nominal_glyph_mapping"),
            face_collect_variation_selectors              = apiGetFunctionAddress(HARFBUZZ, "hb_face_collect_variation_selectors"),
            face_collect_variation_unicodes               = apiGetFunctionAddress(HARFBUZZ, "hb_face_collect_variation_unicodes"),
            face_builder_create                           = apiGetFunctionAddress(HARFBUZZ, "hb_face_builder_create"),
            face_builder_add_table                        = apiGetFunctionAddress(HARFBUZZ, "hb_face_builder_add_table"),
            face_builder_sort_tables                      = apiGetFunctionAddress(HARFBUZZ, "hb_face_builder_sort_tables"),
            font_funcs_create                             = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_create"),
            font_funcs_get_empty                          = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_get_empty"),
            font_funcs_reference                          = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_reference"),
            font_funcs_destroy                            = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_destroy"),
            font_funcs_set_user_data                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_user_data"),
            font_funcs_get_user_data                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_get_user_data"),
            font_funcs_make_immutable                     = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_make_immutable"),
            font_funcs_is_immutable                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_is_immutable"),
            font_funcs_set_font_h_extents_func            = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_font_h_extents_func"),
            font_funcs_set_font_v_extents_func            = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_font_v_extents_func"),
            font_funcs_set_nominal_glyph_func             = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_nominal_glyph_func"),
            font_funcs_set_nominal_glyphs_func            = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_nominal_glyphs_func"),
            font_funcs_set_variation_glyph_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_variation_glyph_func"),
            font_funcs_set_glyph_h_advance_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_h_advance_func"),
            font_funcs_set_glyph_v_advance_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_v_advance_func"),
            font_funcs_set_glyph_h_advances_func          = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_h_advances_func"),
            font_funcs_set_glyph_v_advances_func          = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_v_advances_func"),
            font_funcs_set_glyph_h_origin_func            = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_h_origin_func"),
            font_funcs_set_glyph_v_origin_func            = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_v_origin_func"),
            font_funcs_set_glyph_h_origins_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_h_origins_func"),
            font_funcs_set_glyph_v_origins_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_v_origins_func"),
            font_funcs_set_glyph_h_kerning_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_h_kerning_func"),
            font_funcs_set_glyph_extents_func             = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_extents_func"),
            font_funcs_set_glyph_contour_point_func       = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_contour_point_func"),
            font_funcs_set_glyph_name_func                = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_name_func"),
            font_funcs_set_glyph_from_name_func           = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_glyph_from_name_func"),
            font_funcs_set_draw_glyph_func                = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_draw_glyph_func"),
            font_funcs_set_draw_glyph_or_fail_func        = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_draw_glyph_or_fail_func"),
            font_funcs_set_paint_glyph_func               = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_paint_glyph_func"),
            font_funcs_set_paint_glyph_or_fail_func       = apiGetFunctionAddress(HARFBUZZ, "hb_font_funcs_set_paint_glyph_or_fail_func"),
            font_get_h_extents                            = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_h_extents"),
            font_get_v_extents                            = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_v_extents"),
            font_get_nominal_glyph                        = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_nominal_glyph"),
            font_get_variation_glyph                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_variation_glyph"),
            font_get_nominal_glyphs                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_nominal_glyphs"),
            font_get_glyph_h_advance                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_h_advance"),
            font_get_glyph_v_advance                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_v_advance"),
            font_get_glyph_h_advances                     = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_h_advances"),
            font_get_glyph_v_advances                     = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_v_advances"),
            font_get_glyph_h_origin                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_h_origin"),
            font_get_glyph_v_origin                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_v_origin"),
            font_get_glyph_h_origins                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_h_origins"),
            font_get_glyph_v_origins                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_v_origins"),
            font_get_glyph_h_kerning                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_h_kerning"),
            font_get_glyph_extents                        = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_extents"),
            font_get_glyph_contour_point                  = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_contour_point"),
            font_get_glyph_name                           = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_name"),
            font_get_glyph_from_name                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_from_name"),
            font_draw_glyph                               = apiGetFunctionAddress(HARFBUZZ, "hb_font_draw_glyph"),
            font_draw_glyph_or_fail                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_draw_glyph_or_fail"),
            font_paint_glyph                              = apiGetFunctionAddress(HARFBUZZ, "hb_font_paint_glyph"),
            font_paint_glyph_or_fail                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_paint_glyph_or_fail"),
            font_get_glyph                                = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph"),
            font_get_extents_for_direction                = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_extents_for_direction"),
            font_get_glyph_advance_for_direction          = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_advance_for_direction"),
            font_get_glyph_advances_for_direction         = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_advances_for_direction"),
            font_get_glyph_origin_for_direction           = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_origin_for_direction"),
            font_add_glyph_origin_for_direction           = apiGetFunctionAddress(HARFBUZZ, "hb_font_add_glyph_origin_for_direction"),
            font_subtract_glyph_origin_for_direction      = apiGetFunctionAddress(HARFBUZZ, "hb_font_subtract_glyph_origin_for_direction"),
            font_get_glyph_kerning_for_direction          = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_kerning_for_direction"),
            font_get_glyph_extents_for_origin             = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_extents_for_origin"),
            font_get_glyph_contour_point_for_origin       = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_glyph_contour_point_for_origin"),
            font_glyph_to_string                          = apiGetFunctionAddress(HARFBUZZ, "hb_font_glyph_to_string"),
            font_glyph_from_string                        = apiGetFunctionAddress(HARFBUZZ, "hb_font_glyph_from_string"),
            font_create                                   = apiGetFunctionAddress(HARFBUZZ, "hb_font_create"),
            font_create_sub_font                          = apiGetFunctionAddress(HARFBUZZ, "hb_font_create_sub_font"),
            font_get_empty                                = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_empty"),
            font_reference                                = apiGetFunctionAddress(HARFBUZZ, "hb_font_reference"),
            font_destroy                                  = apiGetFunctionAddress(HARFBUZZ, "hb_font_destroy"),
            font_set_user_data                            = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_user_data"),
            font_get_user_data                            = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_user_data"),
            font_make_immutable                           = apiGetFunctionAddress(HARFBUZZ, "hb_font_make_immutable"),
            font_is_immutable                             = apiGetFunctionAddress(HARFBUZZ, "hb_font_is_immutable"),
            font_get_serial                               = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_serial"),
            font_changed                                  = apiGetFunctionAddress(HARFBUZZ, "hb_font_changed"),
            font_set_parent                               = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_parent"),
            font_get_parent                               = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_parent"),
            font_set_face                                 = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_face"),
            font_get_face                                 = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_face"),
            font_set_funcs                                = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_funcs"),
            font_set_funcs_data                           = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_funcs_data"),
            font_set_funcs_using                          = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_funcs_using"),
            font_list_funcs                               = apiGetFunctionAddress(HARFBUZZ, "hb_font_list_funcs"),
            font_set_scale                                = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_scale"),
            font_get_scale                                = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_scale"),
            font_set_ppem                                 = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_ppem"),
            font_get_ppem                                 = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_ppem"),
            font_set_ptem                                 = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_ptem"),
            font_get_ptem                                 = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_ptem"),
            font_is_synthetic                             = apiGetFunctionAddress(HARFBUZZ, "hb_font_is_synthetic"),
            font_set_synthetic_bold                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_synthetic_bold"),
            font_get_synthetic_bold                       = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_synthetic_bold"),
            font_set_synthetic_slant                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_synthetic_slant"),
            font_get_synthetic_slant                      = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_synthetic_slant"),
            font_set_variations                           = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_variations"),
            font_set_variation                            = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_variation"),
            font_set_var_coords_design                    = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_var_coords_design"),
            font_get_var_coords_design                    = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_var_coords_design"),
            font_set_var_coords_normalized                = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_var_coords_normalized"),
            font_get_var_coords_normalized                = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_var_coords_normalized"),
            font_set_var_named_instance                   = apiGetFunctionAddress(HARFBUZZ, "hb_font_set_var_named_instance"),
            font_get_var_named_instance                   = apiGetFunctionAddress(HARFBUZZ, "hb_font_get_var_named_instance"),
            ft_face_create                                = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_face_create"),
            ft_face_create_cached                         = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_face_create_cached"),
            ft_face_create_referenced                     = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_face_create_referenced"),
            ft_face_create_from_file_or_fail              = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_face_create_from_file_or_fail"),
            ft_face_create_from_blob_or_fail              = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_face_create_from_blob_or_fail"),
            ft_font_create                                = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_create"),
            ft_font_create_referenced                     = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_create_referenced"),
            ft_font_get_ft_face                           = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_get_ft_face"),
            ft_font_lock_face                             = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_lock_face"),
            ft_font_unlock_face                           = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_unlock_face"),
            ft_font_set_load_flags                        = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_set_load_flags"),
            ft_font_get_load_flags                        = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_get_load_flags"),
            ft_font_changed                               = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_changed"),
            ft_hb_font_changed                            = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_hb_font_changed"),
            ft_font_set_funcs                             = apiGetFunctionAddressOptional(HARFBUZZ, "hb_ft_font_set_funcs"),
            map_create                                    = apiGetFunctionAddress(HARFBUZZ, "hb_map_create"),
            map_get_empty                                 = apiGetFunctionAddress(HARFBUZZ, "hb_map_get_empty"),
            map_reference                                 = apiGetFunctionAddress(HARFBUZZ, "hb_map_reference"),
            map_destroy                                   = apiGetFunctionAddress(HARFBUZZ, "hb_map_destroy"),
            map_set_user_data                             = apiGetFunctionAddress(HARFBUZZ, "hb_map_set_user_data"),
            map_get_user_data                             = apiGetFunctionAddress(HARFBUZZ, "hb_map_get_user_data"),
            map_allocation_successful                     = apiGetFunctionAddress(HARFBUZZ, "hb_map_allocation_successful"),
            map_copy                                      = apiGetFunctionAddress(HARFBUZZ, "hb_map_copy"),
            map_clear                                     = apiGetFunctionAddress(HARFBUZZ, "hb_map_clear"),
            map_is_empty                                  = apiGetFunctionAddress(HARFBUZZ, "hb_map_is_empty"),
            map_get_population                            = apiGetFunctionAddress(HARFBUZZ, "hb_map_get_population"),
            map_is_equal                                  = apiGetFunctionAddress(HARFBUZZ, "hb_map_is_equal"),
            map_hash                                      = apiGetFunctionAddress(HARFBUZZ, "hb_map_hash"),
            map_set                                       = apiGetFunctionAddress(HARFBUZZ, "hb_map_set"),
            map_get                                       = apiGetFunctionAddress(HARFBUZZ, "hb_map_get"),
            map_del                                       = apiGetFunctionAddress(HARFBUZZ, "hb_map_del"),
            map_has                                       = apiGetFunctionAddress(HARFBUZZ, "hb_map_has"),
            map_update                                    = apiGetFunctionAddress(HARFBUZZ, "hb_map_update"),
            map_next                                      = apiGetFunctionAddress(HARFBUZZ, "hb_map_next"),
            map_keys                                      = apiGetFunctionAddress(HARFBUZZ, "hb_map_keys"),
            map_values                                    = apiGetFunctionAddress(HARFBUZZ, "hb_map_values"),
            paint_funcs_create                            = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_create"),
            paint_funcs_get_empty                         = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_get_empty"),
            paint_funcs_reference                         = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_reference"),
            paint_funcs_destroy                           = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_destroy"),
            paint_funcs_set_user_data                     = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_user_data"),
            paint_funcs_get_user_data                     = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_get_user_data"),
            paint_funcs_make_immutable                    = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_make_immutable"),
            paint_funcs_is_immutable                      = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_is_immutable"),
            color_line_get_color_stops                    = apiGetFunctionAddress(HARFBUZZ, "hb_color_line_get_color_stops"),
            color_line_get_extend                         = apiGetFunctionAddress(HARFBUZZ, "hb_color_line_get_extend"),
            paint_funcs_set_push_transform_func           = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_push_transform_func"),
            paint_funcs_set_pop_transform_func            = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_pop_transform_func"),
            paint_funcs_set_color_glyph_func              = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_color_glyph_func"),
            paint_funcs_set_push_clip_glyph_func          = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_push_clip_glyph_func"),
            paint_funcs_set_push_clip_rectangle_func      = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_push_clip_rectangle_func"),
            paint_funcs_set_pop_clip_func                 = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_pop_clip_func"),
            paint_funcs_set_color_func                    = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_color_func"),
            paint_funcs_set_image_func                    = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_image_func"),
            paint_funcs_set_linear_gradient_func          = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_linear_gradient_func"),
            paint_funcs_set_radial_gradient_func          = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_radial_gradient_func"),
            paint_funcs_set_sweep_gradient_func           = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_sweep_gradient_func"),
            paint_funcs_set_push_group_func               = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_push_group_func"),
            paint_funcs_set_pop_group_func                = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_pop_group_func"),
            paint_funcs_set_custom_palette_color_func     = apiGetFunctionAddress(HARFBUZZ, "hb_paint_funcs_set_custom_palette_color_func"),
            paint_push_transform                          = apiGetFunctionAddress(HARFBUZZ, "hb_paint_push_transform"),
            paint_push_font_transform                     = apiGetFunctionAddress(HARFBUZZ, "hb_paint_push_font_transform"),
            paint_push_inverse_font_transform             = apiGetFunctionAddress(HARFBUZZ, "hb_paint_push_inverse_font_transform"),
            paint_pop_transform                           = apiGetFunctionAddress(HARFBUZZ, "hb_paint_pop_transform"),
            paint_color_glyph                             = apiGetFunctionAddress(HARFBUZZ, "hb_paint_color_glyph"),
            paint_push_clip_glyph                         = apiGetFunctionAddress(HARFBUZZ, "hb_paint_push_clip_glyph"),
            paint_push_clip_rectangle                     = apiGetFunctionAddress(HARFBUZZ, "hb_paint_push_clip_rectangle"),
            paint_pop_clip                                = apiGetFunctionAddress(HARFBUZZ, "hb_paint_pop_clip"),
            paint_color                                   = apiGetFunctionAddress(HARFBUZZ, "hb_paint_color"),
            paint_image                                   = apiGetFunctionAddress(HARFBUZZ, "hb_paint_image"),
            paint_linear_gradient                         = apiGetFunctionAddress(HARFBUZZ, "hb_paint_linear_gradient"),
            paint_radial_gradient                         = apiGetFunctionAddress(HARFBUZZ, "hb_paint_radial_gradient"),
            paint_sweep_gradient                          = apiGetFunctionAddress(HARFBUZZ, "hb_paint_sweep_gradient"),
            paint_push_group                              = apiGetFunctionAddress(HARFBUZZ, "hb_paint_push_group"),
            paint_pop_group                               = apiGetFunctionAddress(HARFBUZZ, "hb_paint_pop_group"),
            paint_custom_palette_color                    = apiGetFunctionAddress(HARFBUZZ, "hb_paint_custom_palette_color"),
            set_create                                    = apiGetFunctionAddress(HARFBUZZ, "hb_set_create"),
            set_get_empty                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_get_empty"),
            set_reference                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_reference"),
            set_destroy                                   = apiGetFunctionAddress(HARFBUZZ, "hb_set_destroy"),
            set_set_user_data                             = apiGetFunctionAddress(HARFBUZZ, "hb_set_set_user_data"),
            set_get_user_data                             = apiGetFunctionAddress(HARFBUZZ, "hb_set_get_user_data"),
            set_allocation_successful                     = apiGetFunctionAddress(HARFBUZZ, "hb_set_allocation_successful"),
            set_copy                                      = apiGetFunctionAddress(HARFBUZZ, "hb_set_copy"),
            set_clear                                     = apiGetFunctionAddress(HARFBUZZ, "hb_set_clear"),
            set_is_empty                                  = apiGetFunctionAddress(HARFBUZZ, "hb_set_is_empty"),
            set_invert                                    = apiGetFunctionAddress(HARFBUZZ, "hb_set_invert"),
            set_is_inverted                               = apiGetFunctionAddress(HARFBUZZ, "hb_set_is_inverted"),
            set_has                                       = apiGetFunctionAddress(HARFBUZZ, "hb_set_has"),
            set_add                                       = apiGetFunctionAddress(HARFBUZZ, "hb_set_add"),
            set_add_range                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_add_range"),
            set_add_sorted_array                          = apiGetFunctionAddress(HARFBUZZ, "hb_set_add_sorted_array"),
            set_del                                       = apiGetFunctionAddress(HARFBUZZ, "hb_set_del"),
            set_del_range                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_del_range"),
            set_is_equal                                  = apiGetFunctionAddress(HARFBUZZ, "hb_set_is_equal"),
            set_hash                                      = apiGetFunctionAddress(HARFBUZZ, "hb_set_hash"),
            set_is_subset                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_is_subset"),
            set_set                                       = apiGetFunctionAddress(HARFBUZZ, "hb_set_set"),
            set_union                                     = apiGetFunctionAddress(HARFBUZZ, "hb_set_union"),
            set_intersect                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_intersect"),
            set_subtract                                  = apiGetFunctionAddress(HARFBUZZ, "hb_set_subtract"),
            set_symmetric_difference                      = apiGetFunctionAddress(HARFBUZZ, "hb_set_symmetric_difference"),
            set_get_population                            = apiGetFunctionAddress(HARFBUZZ, "hb_set_get_population"),
            set_get_min                                   = apiGetFunctionAddress(HARFBUZZ, "hb_set_get_min"),
            set_get_max                                   = apiGetFunctionAddress(HARFBUZZ, "hb_set_get_max"),
            set_next                                      = apiGetFunctionAddress(HARFBUZZ, "hb_set_next"),
            set_previous                                  = apiGetFunctionAddress(HARFBUZZ, "hb_set_previous"),
            set_next_range                                = apiGetFunctionAddress(HARFBUZZ, "hb_set_next_range"),
            set_previous_range                            = apiGetFunctionAddress(HARFBUZZ, "hb_set_previous_range"),
            set_next_many                                 = apiGetFunctionAddress(HARFBUZZ, "hb_set_next_many"),
            shape                                         = apiGetFunctionAddress(HARFBUZZ, "hb_shape"),
            shape_full                                    = apiGetFunctionAddress(HARFBUZZ, "hb_shape_full"),
            shape_justify                                 = apiGetFunctionAddress(HARFBUZZ, "hb_shape_justify"),
            shape_list_shapers                            = apiGetFunctionAddress(HARFBUZZ, "hb_shape_list_shapers"),
            shape_plan_create                             = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_create"),
            shape_plan_create_cached                      = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_create_cached"),
            shape_plan_create2                            = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_create2"),
            shape_plan_create_cached2                     = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_create_cached2"),
            shape_plan_get_empty                          = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_get_empty"),
            shape_plan_reference                          = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_reference"),
            shape_plan_destroy                            = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_destroy"),
            shape_plan_set_user_data                      = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_set_user_data"),
            shape_plan_get_user_data                      = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_get_user_data"),
            shape_plan_execute                            = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_execute"),
            shape_plan_get_shaper                         = apiGetFunctionAddress(HARFBUZZ, "hb_shape_plan_get_shaper"),
            style_get_value                               = apiGetFunctionAddress(HARFBUZZ, "hb_style_get_value"),
            unicode_funcs_get_default                     = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_get_default"),
            unicode_funcs_create                          = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_create"),
            unicode_funcs_get_empty                       = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_get_empty"),
            unicode_funcs_reference                       = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_reference"),
            unicode_funcs_destroy                         = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_destroy"),
            unicode_funcs_set_user_data                   = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_user_data"),
            unicode_funcs_get_user_data                   = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_get_user_data"),
            unicode_funcs_make_immutable                  = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_make_immutable"),
            unicode_funcs_is_immutable                    = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_is_immutable"),
            unicode_funcs_get_parent                      = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_get_parent"),
            unicode_funcs_set_combining_class_func        = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_combining_class_func"),
            unicode_funcs_set_general_category_func       = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_general_category_func"),
            unicode_funcs_set_mirroring_func              = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_mirroring_func"),
            unicode_funcs_set_script_func                 = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_script_func"),
            unicode_funcs_set_compose_func                = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_compose_func"),
            unicode_funcs_set_decompose_func              = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_funcs_set_decompose_func"),
            unicode_combining_class                       = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_combining_class"),
            unicode_general_category                      = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_general_category"),
            unicode_mirroring                             = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_mirroring"),
            unicode_script                                = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_script"),
            unicode_compose                               = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_compose"),
            unicode_decompose                             = apiGetFunctionAddress(HARFBUZZ, "hb_unicode_decompose"),
            version                                       = apiGetFunctionAddress(HARFBUZZ, "hb_version"),
            version_string                                = apiGetFunctionAddress(HARFBUZZ, "hb_version_string"),
            version_atleast                               = apiGetFunctionAddress(HARFBUZZ, "hb_version_atleast");

    }

    /** Returns the harfbuzz {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HARFBUZZ;
    }

    public static final int HB_CODEPOINT_INVALID = -1;

    public static final int
        HB_FEATURE_GLOBAL_START = 0,
        HB_FEATURE_GLOBAL_END   = -1;

    public static final int HB_TAG_NONE = HB_TAG('\u0000', '\u0000', '\u0000', '\u0000');

    public static final int HB_TAG_MAX = HB_TAG('\u00FF', '\u00FF', '\u00FF', '\u00FF');

    public static final int HB_TAG_MAX_SIGNED = HB_TAG('\u007F', '\u00FF', '\u00FF', '\u00FF');

    public static final int
        HB_DIRECTION_INVALID = 0,
        HB_DIRECTION_LTR     = 4,
        HB_DIRECTION_RTL     = 5,
        HB_DIRECTION_TTB     = 6,
        HB_DIRECTION_BTT     = 7;

    public static final int
        HB_SCRIPT_COMMON                 = HB_TAG ('Z','y','y','y'),
        HB_SCRIPT_INHERITED              = HB_TAG ('Z','i','n','h'),
        HB_SCRIPT_UNKNOWN                = HB_TAG ('Z','z','z','z'),
        HB_SCRIPT_ARABIC                 = HB_TAG ('A','r','a','b'),
        HB_SCRIPT_ARMENIAN               = HB_TAG ('A','r','m','n'),
        HB_SCRIPT_BENGALI                = HB_TAG ('B','e','n','g'),
        HB_SCRIPT_CYRILLIC               = HB_TAG ('C','y','r','l'),
        HB_SCRIPT_DEVANAGARI             = HB_TAG ('D','e','v','a'),
        HB_SCRIPT_GEORGIAN               = HB_TAG ('G','e','o','r'),
        HB_SCRIPT_GREEK                  = HB_TAG ('G','r','e','k'),
        HB_SCRIPT_GUJARATI               = HB_TAG ('G','u','j','r'),
        HB_SCRIPT_GURMUKHI               = HB_TAG ('G','u','r','u'),
        HB_SCRIPT_HANGUL                 = HB_TAG ('H','a','n','g'),
        HB_SCRIPT_HAN                    = HB_TAG ('H','a','n','i'),
        HB_SCRIPT_HEBREW                 = HB_TAG ('H','e','b','r'),
        HB_SCRIPT_HIRAGANA               = HB_TAG ('H','i','r','a'),
        HB_SCRIPT_KANNADA                = HB_TAG ('K','n','d','a'),
        HB_SCRIPT_KATAKANA               = HB_TAG ('K','a','n','a'),
        HB_SCRIPT_LAO                    = HB_TAG ('L','a','o','o'),
        HB_SCRIPT_LATIN                  = HB_TAG ('L','a','t','n'),
        HB_SCRIPT_MALAYALAM              = HB_TAG ('M','l','y','m'),
        HB_SCRIPT_ORIYA                  = HB_TAG ('O','r','y','a'),
        HB_SCRIPT_TAMIL                  = HB_TAG ('T','a','m','l'),
        HB_SCRIPT_TELUGU                 = HB_TAG ('T','e','l','u'),
        HB_SCRIPT_THAI                   = HB_TAG ('T','h','a','i'),
        HB_SCRIPT_TIBETAN                = HB_TAG ('T','i','b','t'),
        HB_SCRIPT_BOPOMOFO               = HB_TAG ('B','o','p','o'),
        HB_SCRIPT_BRAILLE                = HB_TAG ('B','r','a','i'),
        HB_SCRIPT_CANADIAN_SYLLABICS     = HB_TAG ('C','a','n','s'),
        HB_SCRIPT_CHEROKEE               = HB_TAG ('C','h','e','r'),
        HB_SCRIPT_ETHIOPIC               = HB_TAG ('E','t','h','i'),
        HB_SCRIPT_KHMER                  = HB_TAG ('K','h','m','r'),
        HB_SCRIPT_MONGOLIAN              = HB_TAG ('M','o','n','g'),
        HB_SCRIPT_MYANMAR                = HB_TAG ('M','y','m','r'),
        HB_SCRIPT_OGHAM                  = HB_TAG ('O','g','a','m'),
        HB_SCRIPT_RUNIC                  = HB_TAG ('R','u','n','r'),
        HB_SCRIPT_SINHALA                = HB_TAG ('S','i','n','h'),
        HB_SCRIPT_SYRIAC                 = HB_TAG ('S','y','r','c'),
        HB_SCRIPT_THAANA                 = HB_TAG ('T','h','a','a'),
        HB_SCRIPT_YI                     = HB_TAG ('Y','i','i','i'),
        HB_SCRIPT_DESERET                = HB_TAG ('D','s','r','t'),
        HB_SCRIPT_GOTHIC                 = HB_TAG ('G','o','t','h'),
        HB_SCRIPT_OLD_ITALIC             = HB_TAG ('I','t','a','l'),
        HB_SCRIPT_BUHID                  = HB_TAG ('B','u','h','d'),
        HB_SCRIPT_HANUNOO                = HB_TAG ('H','a','n','o'),
        HB_SCRIPT_TAGALOG                = HB_TAG ('T','g','l','g'),
        HB_SCRIPT_TAGBANWA               = HB_TAG ('T','a','g','b'),
        HB_SCRIPT_CYPRIOT                = HB_TAG ('C','p','r','t'),
        HB_SCRIPT_LIMBU                  = HB_TAG ('L','i','m','b'),
        HB_SCRIPT_LINEAR_B               = HB_TAG ('L','i','n','b'),
        HB_SCRIPT_OSMANYA                = HB_TAG ('O','s','m','a'),
        HB_SCRIPT_SHAVIAN                = HB_TAG ('S','h','a','w'),
        HB_SCRIPT_TAI_LE                 = HB_TAG ('T','a','l','e'),
        HB_SCRIPT_UGARITIC               = HB_TAG ('U','g','a','r'),
        HB_SCRIPT_BUGINESE               = HB_TAG ('B','u','g','i'),
        HB_SCRIPT_COPTIC                 = HB_TAG ('C','o','p','t'),
        HB_SCRIPT_GLAGOLITIC             = HB_TAG ('G','l','a','g'),
        HB_SCRIPT_KHAROSHTHI             = HB_TAG ('K','h','a','r'),
        HB_SCRIPT_NEW_TAI_LUE            = HB_TAG ('T','a','l','u'),
        HB_SCRIPT_OLD_PERSIAN            = HB_TAG ('X','p','e','o'),
        HB_SCRIPT_SYLOTI_NAGRI           = HB_TAG ('S','y','l','o'),
        HB_SCRIPT_TIFINAGH               = HB_TAG ('T','f','n','g'),
        HB_SCRIPT_BALINESE               = HB_TAG ('B','a','l','i'),
        HB_SCRIPT_CUNEIFORM              = HB_TAG ('X','s','u','x'),
        HB_SCRIPT_NKO                    = HB_TAG ('N','k','o','o'),
        HB_SCRIPT_PHAGS_PA               = HB_TAG ('P','h','a','g'),
        HB_SCRIPT_PHOENICIAN             = HB_TAG ('P','h','n','x'),
        HB_SCRIPT_CARIAN                 = HB_TAG ('C','a','r','i'),
        HB_SCRIPT_CHAM                   = HB_TAG ('C','h','a','m'),
        HB_SCRIPT_KAYAH_LI               = HB_TAG ('K','a','l','i'),
        HB_SCRIPT_LEPCHA                 = HB_TAG ('L','e','p','c'),
        HB_SCRIPT_LYCIAN                 = HB_TAG ('L','y','c','i'),
        HB_SCRIPT_LYDIAN                 = HB_TAG ('L','y','d','i'),
        HB_SCRIPT_OL_CHIKI               = HB_TAG ('O','l','c','k'),
        HB_SCRIPT_REJANG                 = HB_TAG ('R','j','n','g'),
        HB_SCRIPT_SAURASHTRA             = HB_TAG ('S','a','u','r'),
        HB_SCRIPT_SUNDANESE              = HB_TAG ('S','u','n','d'),
        HB_SCRIPT_VAI                    = HB_TAG ('V','a','i','i'),
        HB_SCRIPT_AVESTAN                = HB_TAG ('A','v','s','t'),
        HB_SCRIPT_BAMUM                  = HB_TAG ('B','a','m','u'),
        HB_SCRIPT_EGYPTIAN_HIEROGLYPHS   = HB_TAG ('E','g','y','p'),
        HB_SCRIPT_IMPERIAL_ARAMAIC       = HB_TAG ('A','r','m','i'),
        HB_SCRIPT_INSCRIPTIONAL_PAHLAVI  = HB_TAG ('P','h','l','i'),
        HB_SCRIPT_INSCRIPTIONAL_PARTHIAN = HB_TAG ('P','r','t','i'),
        HB_SCRIPT_JAVANESE               = HB_TAG ('J','a','v','a'),
        HB_SCRIPT_KAITHI                 = HB_TAG ('K','t','h','i'),
        HB_SCRIPT_LISU                   = HB_TAG ('L','i','s','u'),
        HB_SCRIPT_MEETEI_MAYEK           = HB_TAG ('M','t','e','i'),
        HB_SCRIPT_OLD_SOUTH_ARABIAN      = HB_TAG ('S','a','r','b'),
        HB_SCRIPT_OLD_TURKIC             = HB_TAG ('O','r','k','h'),
        HB_SCRIPT_SAMARITAN              = HB_TAG ('S','a','m','r'),
        HB_SCRIPT_TAI_THAM               = HB_TAG ('L','a','n','a'),
        HB_SCRIPT_TAI_VIET               = HB_TAG ('T','a','v','t'),
        HB_SCRIPT_BATAK                  = HB_TAG ('B','a','t','k'),
        HB_SCRIPT_BRAHMI                 = HB_TAG ('B','r','a','h'),
        HB_SCRIPT_MANDAIC                = HB_TAG ('M','a','n','d'),
        HB_SCRIPT_CHAKMA                 = HB_TAG ('C','a','k','m'),
        HB_SCRIPT_MEROITIC_CURSIVE       = HB_TAG ('M','e','r','c'),
        HB_SCRIPT_MEROITIC_HIEROGLYPHS   = HB_TAG ('M','e','r','o'),
        HB_SCRIPT_MIAO                   = HB_TAG ('P','l','r','d'),
        HB_SCRIPT_SHARADA                = HB_TAG ('S','h','r','d'),
        HB_SCRIPT_SORA_SOMPENG           = HB_TAG ('S','o','r','a'),
        HB_SCRIPT_TAKRI                  = HB_TAG ('T','a','k','r'),
        HB_SCRIPT_BASSA_VAH              = HB_TAG ('B','a','s','s'),
        HB_SCRIPT_CAUCASIAN_ALBANIAN     = HB_TAG ('A','g','h','b'),
        HB_SCRIPT_DUPLOYAN               = HB_TAG ('D','u','p','l'),
        HB_SCRIPT_ELBASAN                = HB_TAG ('E','l','b','a'),
        HB_SCRIPT_GRANTHA                = HB_TAG ('G','r','a','n'),
        HB_SCRIPT_KHOJKI                 = HB_TAG ('K','h','o','j'),
        HB_SCRIPT_KHUDAWADI              = HB_TAG ('S','i','n','d'),
        HB_SCRIPT_LINEAR_A               = HB_TAG ('L','i','n','a'),
        HB_SCRIPT_MAHAJANI               = HB_TAG ('M','a','h','j'),
        HB_SCRIPT_MANICHAEAN             = HB_TAG ('M','a','n','i'),
        HB_SCRIPT_MENDE_KIKAKUI          = HB_TAG ('M','e','n','d'),
        HB_SCRIPT_MODI                   = HB_TAG ('M','o','d','i'),
        HB_SCRIPT_MRO                    = HB_TAG ('M','r','o','o'),
        HB_SCRIPT_NABATAEAN              = HB_TAG ('N','b','a','t'),
        HB_SCRIPT_OLD_NORTH_ARABIAN      = HB_TAG ('N','a','r','b'),
        HB_SCRIPT_OLD_PERMIC             = HB_TAG ('P','e','r','m'),
        HB_SCRIPT_PAHAWH_HMONG           = HB_TAG ('H','m','n','g'),
        HB_SCRIPT_PALMYRENE              = HB_TAG ('P','a','l','m'),
        HB_SCRIPT_PAU_CIN_HAU            = HB_TAG ('P','a','u','c'),
        HB_SCRIPT_PSALTER_PAHLAVI        = HB_TAG ('P','h','l','p'),
        HB_SCRIPT_SIDDHAM                = HB_TAG ('S','i','d','d'),
        HB_SCRIPT_TIRHUTA                = HB_TAG ('T','i','r','h'),
        HB_SCRIPT_WARANG_CITI            = HB_TAG ('W','a','r','a'),
        HB_SCRIPT_AHOM                   = HB_TAG ('A','h','o','m'),
        HB_SCRIPT_ANATOLIAN_HIEROGLYPHS  = HB_TAG ('H','l','u','w'),
        HB_SCRIPT_HATRAN                 = HB_TAG ('H','a','t','r'),
        HB_SCRIPT_MULTANI                = HB_TAG ('M','u','l','t'),
        HB_SCRIPT_OLD_HUNGARIAN          = HB_TAG ('H','u','n','g'),
        HB_SCRIPT_SIGNWRITING            = HB_TAG ('S','g','n','w'),
        HB_SCRIPT_ADLAM                  = HB_TAG ('A','d','l','m'),
        HB_SCRIPT_BHAIKSUKI              = HB_TAG ('B','h','k','s'),
        HB_SCRIPT_MARCHEN                = HB_TAG ('M','a','r','c'),
        HB_SCRIPT_OSAGE                  = HB_TAG ('O','s','g','e'),
        HB_SCRIPT_TANGUT                 = HB_TAG ('T','a','n','g'),
        HB_SCRIPT_NEWA                   = HB_TAG ('N','e','w','a'),
        HB_SCRIPT_MASARAM_GONDI          = HB_TAG ('G','o','n','m'),
        HB_SCRIPT_NUSHU                  = HB_TAG ('N','s','h','u'),
        HB_SCRIPT_SOYOMBO                = HB_TAG ('S','o','y','o'),
        HB_SCRIPT_ZANABAZAR_SQUARE       = HB_TAG ('Z','a','n','b'),
        HB_SCRIPT_DOGRA                  = HB_TAG ('D','o','g','r'),
        HB_SCRIPT_GUNJALA_GONDI          = HB_TAG ('G','o','n','g'),
        HB_SCRIPT_HANIFI_ROHINGYA        = HB_TAG ('R','o','h','g'),
        HB_SCRIPT_MAKASAR                = HB_TAG ('M','a','k','a'),
        HB_SCRIPT_MEDEFAIDRIN            = HB_TAG ('M','e','d','f'),
        HB_SCRIPT_OLD_SOGDIAN            = HB_TAG ('S','o','g','o'),
        HB_SCRIPT_SOGDIAN                = HB_TAG ('S','o','g','d'),
        HB_SCRIPT_ELYMAIC                = HB_TAG ('E','l','y','m'),
        HB_SCRIPT_NANDINAGARI            = HB_TAG ('N','a','n','d'),
        HB_SCRIPT_NYIAKENG_PUACHUE_HMONG = HB_TAG ('H','m','n','p'),
        HB_SCRIPT_WANCHO                 = HB_TAG ('W','c','h','o'),
        HB_SCRIPT_CHORASMIAN             = HB_TAG ('C','h','r','s'),
        HB_SCRIPT_DIVES_AKURU            = HB_TAG ('D','i','a','k'),
        HB_SCRIPT_KHITAN_SMALL_SCRIPT    = HB_TAG ('K','i','t','s'),
        HB_SCRIPT_YEZIDI                 = HB_TAG ('Y','e','z','i'),
        HB_SCRIPT_CYPRO_MINOAN           = HB_TAG ('C','p','m','n'),
        HB_SCRIPT_OLD_UYGHUR             = HB_TAG ('O','u','g','r'),
        HB_SCRIPT_TANGSA                 = HB_TAG ('T','n','s','a'),
        HB_SCRIPT_TOTO                   = HB_TAG ('T','o','t','o'),
        HB_SCRIPT_VITHKUQI               = HB_TAG ('V','i','t','h'),
        HB_SCRIPT_MATH                   = HB_TAG ('Z','m','t','h'),
        HB_SCRIPT_KAWI                   = HB_TAG ('K','a','w','i'),
        HB_SCRIPT_NAG_MUNDARI            = HB_TAG ('N','a','g','m'),
        HB_SCRIPT_GARAY                  = HB_TAG ('G','a','r','a'),
        HB_SCRIPT_GURUNG_KHEMA           = HB_TAG ('G','u','k','h'),
        HB_SCRIPT_KIRAT_RAI              = HB_TAG ('K','r','a','i'),
        HB_SCRIPT_OL_ONAL                = HB_TAG ('O','n','a','o'),
        HB_SCRIPT_SUNUWAR                = HB_TAG ('S','u','n','u'),
        HB_SCRIPT_TODHRI                 = HB_TAG ('T','o','d','r'),
        HB_SCRIPT_TULU_TIGALARI          = HB_TAG ('T','u','t','g'),
        HB_SCRIPT_BERIA_ERFE             = HB_TAG('B','e','r','f'),
        HB_SCRIPT_SIDETIC                = HB_TAG ('S','i','d','t'),
        HB_SCRIPT_TAI_YO                 = HB_TAG ('T','a','y','o'),
        HB_SCRIPT_TOLONG_SIKI            = HB_TAG ('T','o','l','s'),
        HB_SCRIPT_INVALID                = HB_TAG_NONE;

    public static final int HB_LANGUAGE_INVALID = 0;

    public static final int
        HB_MEMORY_MODE_DUPLICATE                  = 0,
        HB_MEMORY_MODE_READONLY                   = 1,
        HB_MEMORY_MODE_WRITABLE                   = 2,
        HB_MEMORY_MODE_READONLY_MAY_MAKE_WRITABLE = 3;

    public static final int
        HB_GLYPH_FLAG_UNSAFE_TO_BREAK        = 0x1,
        HB_GLYPH_FLAG_UNSAFE_TO_CONCAT       = 0x2,
        HB_GLYPH_FLAG_SAFE_TO_INSERT_TATWEEL = 0x4,
        HB_GLYPH_FLAG_DEFINED                = 0x00000007;

    public static final int
        HB_BUFFER_CONTENT_TYPE_INVALID = 0,
        HB_BUFFER_CONTENT_TYPE_UNICODE = 1,
        HB_BUFFER_CONTENT_TYPE_GLYPHS  = 2;

    public static final int
        HB_BUFFER_FLAG_DEFAULT                        = 0x0,
        HB_BUFFER_FLAG_BOT                            = 0x1,
        HB_BUFFER_FLAG_EOT                            = 0x2,
        HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES    = 0x4,
        HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES      = 0x8,
        HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE    = 0x10,
        HB_BUFFER_FLAG_VERIFY                         = 0x20,
        HB_BUFFER_FLAG_PRODUCE_UNSAFE_TO_CONCAT       = 0x40,
        HB_BUFFER_FLAG_PRODUCE_SAFE_TO_INSERT_TATWEEL = 0x80,
        HB_BUFFER_FLAG_DEFINED                        = 0xFF;

    public static final int
        HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES  = 0,
        HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS = 1,
        HB_BUFFER_CLUSTER_LEVEL_CHARACTERS          = 2,
        HB_BUFFER_CLUSTER_LEVEL_GRAPHEMES           = 3,
        HB_BUFFER_CLUSTER_LEVEL_DEFAULT             = HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES;

    public static final int HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT = 0xFFFD;

    public static final int
        HB_BUFFER_SERIALIZE_FLAG_DEFAULT        = 0x0,
        HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS    = 0x1,
        HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS   = 0x2,
        HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES = 0x4,
        HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS  = 0x8,
        HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS    = 0x10,
        HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES    = 0x20,
        HB_BUFFER_SERIALIZE_FLAG_DEFINED        = 0x3F;

    public static final int
        HB_BUFFER_SERIALIZE_FORMAT_TEXT    = HB_TAG('T','E','X','T'),
        HB_BUFFER_SERIALIZE_FORMAT_JSON    = HB_TAG('J','S','O','N'),
        HB_BUFFER_SERIALIZE_FORMAT_INVALID = HB_TAG_NONE;

    public static final int
        HB_BUFFER_DIFF_FLAG_EQUAL                 = 0x0,
        HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH = 0x1,
        HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH       = 0x2,
        HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT        = 0x4,
        HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT = 0x8,
        HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH    = 0x10,
        HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH      = 0x20,
        HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH  = 0x40,
        HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH     = 0x80;

    public static final int HB_FONT_NO_VAR_NAMED_INSTANCE = 0xFFFFFFFF;

    public static final int HB_MAP_VALUE_INVALID = HB_CODEPOINT_INVALID;

    public static final int
        HB_PAINT_IMAGE_FORMAT_PNG  = HB_TAG('p', 'n', 'g', ' '),
        HB_PAINT_IMAGE_FORMAT_SVG  = HB_TAG('s', 'v', 'g', ' '),
        HB_PAINT_IMAGE_FORMAT_BGRA = HB_TAG('B', 'G', 'R', 'A');

    public static final int
        HB_PAINT_EXTEND_PAD     = 0,
        HB_PAINT_EXTEND_REPEAT  = 1,
        HB_PAINT_EXTEND_REFLECT = 2;

    public static final int
        HB_PAINT_COMPOSITE_MODE_CLEAR          = 0,
        HB_PAINT_COMPOSITE_MODE_SRC            = 1,
        HB_PAINT_COMPOSITE_MODE_DEST           = 2,
        HB_PAINT_COMPOSITE_MODE_SRC_OVER       = 3,
        HB_PAINT_COMPOSITE_MODE_DEST_OVER      = 4,
        HB_PAINT_COMPOSITE_MODE_SRC_IN         = 5,
        HB_PAINT_COMPOSITE_MODE_DEST_IN        = 6,
        HB_PAINT_COMPOSITE_MODE_SRC_OUT        = 7,
        HB_PAINT_COMPOSITE_MODE_DEST_OUT       = 8,
        HB_PAINT_COMPOSITE_MODE_SRC_ATOP       = 9,
        HB_PAINT_COMPOSITE_MODE_DEST_ATOP      = 10,
        HB_PAINT_COMPOSITE_MODE_XOR            = 11,
        HB_PAINT_COMPOSITE_MODE_PLUS           = 12,
        HB_PAINT_COMPOSITE_MODE_SCREEN         = 13,
        HB_PAINT_COMPOSITE_MODE_OVERLAY        = 14,
        HB_PAINT_COMPOSITE_MODE_DARKEN         = 15,
        HB_PAINT_COMPOSITE_MODE_LIGHTEN        = 16,
        HB_PAINT_COMPOSITE_MODE_COLOR_DODGE    = 17,
        HB_PAINT_COMPOSITE_MODE_COLOR_BURN     = 18,
        HB_PAINT_COMPOSITE_MODE_HARD_LIGHT     = 19,
        HB_PAINT_COMPOSITE_MODE_SOFT_LIGHT     = 20,
        HB_PAINT_COMPOSITE_MODE_DIFFERENCE     = 21,
        HB_PAINT_COMPOSITE_MODE_EXCLUSION      = 22,
        HB_PAINT_COMPOSITE_MODE_MULTIPLY       = 23,
        HB_PAINT_COMPOSITE_MODE_HSL_HUE        = 24,
        HB_PAINT_COMPOSITE_MODE_HSL_SATURATION = 25,
        HB_PAINT_COMPOSITE_MODE_HSL_COLOR      = 26,
        HB_PAINT_COMPOSITE_MODE_HSL_LUMINOSITY = 27;

    public static final int HB_SET_VALUE_INVALID = HB_CODEPOINT_INVALID;

    public static final int
        STYLE_TAG_ITALIC       = HB_TAG ('i','t','a','l'),
        STYLE_TAG_OPTICAL_SIZE = HB_TAG ('o','p','s','z'),
        STYLE_TAG_SLANT_ANGLE  = HB_TAG ('s','l','n','t'),
        STYLE_TAG_SLANT_RATIO  = HB_TAG ('S','l','n','t'),
        STYLE_TAG_WIDTH        = HB_TAG ('w','d','t','h'),
        STYLE_TAG_WEIGHT       = HB_TAG ('w','g','h','t');

    public static final int HB_UNICODE_MAX = 0x10FFFF;

    public static final int
        HB_UNICODE_GENERAL_CATEGORY_CONTROL             = 0,
        HB_UNICODE_GENERAL_CATEGORY_FORMAT              = 1,
        HB_UNICODE_GENERAL_CATEGORY_UNASSIGNED          = 2,
        HB_UNICODE_GENERAL_CATEGORY_PRIVATE_USE         = 3,
        HB_UNICODE_GENERAL_CATEGORY_SURROGATE           = 4,
        HB_UNICODE_GENERAL_CATEGORY_LOWERCASE_LETTER    = 5,
        HB_UNICODE_GENERAL_CATEGORY_MODIFIER_LETTER     = 6,
        HB_UNICODE_GENERAL_CATEGORY_OTHER_LETTER        = 7,
        HB_UNICODE_GENERAL_CATEGORY_TITLECASE_LETTER    = 8,
        HB_UNICODE_GENERAL_CATEGORY_UPPERCASE_LETTER    = 9,
        HB_UNICODE_GENERAL_CATEGORY_SPACING_MARK        = 10,
        HB_UNICODE_GENERAL_CATEGORY_ENCLOSING_MARK      = 11,
        HB_UNICODE_GENERAL_CATEGORY_NON_SPACING_MARK    = 12,
        HB_UNICODE_GENERAL_CATEGORY_DECIMAL_NUMBER      = 13,
        HB_UNICODE_GENERAL_CATEGORY_LETTER_NUMBER       = 14,
        HB_UNICODE_GENERAL_CATEGORY_OTHER_NUMBER        = 15,
        HB_UNICODE_GENERAL_CATEGORY_CONNECT_PUNCTUATION = 16,
        HB_UNICODE_GENERAL_CATEGORY_DASH_PUNCTUATION    = 17,
        HB_UNICODE_GENERAL_CATEGORY_CLOSE_PUNCTUATION   = 18,
        HB_UNICODE_GENERAL_CATEGORY_FINAL_PUNCTUATION   = 19,
        HB_UNICODE_GENERAL_CATEGORY_INITIAL_PUNCTUATION = 20,
        HB_UNICODE_GENERAL_CATEGORY_OTHER_PUNCTUATION   = 21,
        HB_UNICODE_GENERAL_CATEGORY_OPEN_PUNCTUATION    = 22,
        HB_UNICODE_GENERAL_CATEGORY_CURRENCY_SYMBOL     = 23,
        HB_UNICODE_GENERAL_CATEGORY_MODIFIER_SYMBOL     = 24,
        HB_UNICODE_GENERAL_CATEGORY_MATH_SYMBOL         = 25,
        HB_UNICODE_GENERAL_CATEGORY_OTHER_SYMBOL        = 26,
        HB_UNICODE_GENERAL_CATEGORY_LINE_SEPARATOR      = 27,
        HB_UNICODE_GENERAL_CATEGORY_PARAGRAPH_SEPARATOR = 28,
        HB_UNICODE_GENERAL_CATEGORY_SPACE_SEPARATOR     = 29;

    public static final int
        HB_UNICODE_COMBINING_CLASS_NOT_REORDERED        = 0,
        HB_UNICODE_COMBINING_CLASS_OVERLAY              = 1,
        HB_UNICODE_COMBINING_CLASS_NUKTA                = 7,
        HB_UNICODE_COMBINING_CLASS_KANA_VOICING         = 8,
        HB_UNICODE_COMBINING_CLASS_VIRAMA               = 9,
        HB_UNICODE_COMBINING_CLASS_CCC10                = 10,
        HB_UNICODE_COMBINING_CLASS_CCC11                = 11,
        HB_UNICODE_COMBINING_CLASS_CCC12                = 12,
        HB_UNICODE_COMBINING_CLASS_CCC13                = 13,
        HB_UNICODE_COMBINING_CLASS_CCC14                = 14,
        HB_UNICODE_COMBINING_CLASS_CCC15                = 15,
        HB_UNICODE_COMBINING_CLASS_CCC16                = 16,
        HB_UNICODE_COMBINING_CLASS_CCC17                = 17,
        HB_UNICODE_COMBINING_CLASS_CCC18                = 18,
        HB_UNICODE_COMBINING_CLASS_CCC19                = 19,
        HB_UNICODE_COMBINING_CLASS_CCC20                = 20,
        HB_UNICODE_COMBINING_CLASS_CCC21                = 21,
        HB_UNICODE_COMBINING_CLASS_CCC22                = 22,
        HB_UNICODE_COMBINING_CLASS_CCC23                = 23,
        HB_UNICODE_COMBINING_CLASS_CCC24                = 24,
        HB_UNICODE_COMBINING_CLASS_CCC25                = 25,
        HB_UNICODE_COMBINING_CLASS_CCC26                = 26,
        HB_UNICODE_COMBINING_CLASS_CCC27                = 27,
        HB_UNICODE_COMBINING_CLASS_CCC28                = 28,
        HB_UNICODE_COMBINING_CLASS_CCC29                = 29,
        HB_UNICODE_COMBINING_CLASS_CCC30                = 30,
        HB_UNICODE_COMBINING_CLASS_CCC31                = 31,
        HB_UNICODE_COMBINING_CLASS_CCC32                = 32,
        HB_UNICODE_COMBINING_CLASS_CCC33                = 33,
        HB_UNICODE_COMBINING_CLASS_CCC34                = 34,
        HB_UNICODE_COMBINING_CLASS_CCC35                = 35,
        HB_UNICODE_COMBINING_CLASS_CCC36                = 36,
        HB_UNICODE_COMBINING_CLASS_CCC84                = 84,
        HB_UNICODE_COMBINING_CLASS_CCC91                = 91,
        HB_UNICODE_COMBINING_CLASS_CCC103               = 103,
        HB_UNICODE_COMBINING_CLASS_CCC107               = 107,
        HB_UNICODE_COMBINING_CLASS_CCC118               = 118,
        HB_UNICODE_COMBINING_CLASS_CCC122               = 122,
        HB_UNICODE_COMBINING_CLASS_CCC129               = 129,
        HB_UNICODE_COMBINING_CLASS_CCC130               = 130,
        HB_UNICODE_COMBINING_CLASS_CCC132               = 132,
        HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW_LEFT  = 200,
        HB_UNICODE_COMBINING_CLASS_ATTACHED_BELOW       = 202,
        HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE       = 214,
        HB_UNICODE_COMBINING_CLASS_ATTACHED_ABOVE_RIGHT = 216,
        HB_UNICODE_COMBINING_CLASS_BELOW_LEFT           = 218,
        HB_UNICODE_COMBINING_CLASS_BELOW                = 220,
        HB_UNICODE_COMBINING_CLASS_BELOW_RIGHT          = 222,
        HB_UNICODE_COMBINING_CLASS_LEFT                 = 224,
        HB_UNICODE_COMBINING_CLASS_RIGHT                = 226,
        HB_UNICODE_COMBINING_CLASS_ABOVE_LEFT           = 228,
        HB_UNICODE_COMBINING_CLASS_ABOVE                = 230,
        HB_UNICODE_COMBINING_CLASS_ABOVE_RIGHT          = 232,
        HB_UNICODE_COMBINING_CLASS_DOUBLE_BELOW         = 233,
        HB_UNICODE_COMBINING_CLASS_DOUBLE_ABOVE         = 234,
        HB_UNICODE_COMBINING_CLASS_IOTA_SUBSCRIPT       = 240,
        HB_UNICODE_COMBINING_CLASS_INVALID              = 255;

    public static final int HB_VERSION_MAJOR = 12;

    public static final int HB_VERSION_MINOR = 3;

    public static final int HB_VERSION_MICRO = 2;

    public static final String HB_VERSION_STRING = "12.3.2";

    protected HarfBuzz() {
        throw new UnsupportedOperationException();
    }

    // --- [ hb_tag_from_string ] ---

    /** {@code hb_tag_t hb_tag_from_string(char const * str, int len)} */
    public static int nhb_tag_from_string(long str, int len) {
        long __functionAddress = Functions.tag_from_string;
        return invokePI(str, len, __functionAddress);
    }

    /** {@code hb_tag_t hb_tag_from_string(char const * str, int len)} */
    @NativeType("hb_tag_t")
    public static int hb_tag_from_string(@NativeType("char const *") ByteBuffer str) {
        return nhb_tag_from_string(memAddress(str), str.remaining());
    }

    /** {@code hb_tag_t hb_tag_from_string(char const * str, int len)} */
    @NativeType("hb_tag_t")
    public static int hb_tag_from_string(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_tag_from_string(strEncoded, strEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_tag_to_string ] ---

    /** {@code void hb_tag_to_string(hb_tag_t tag, char * buf)} */
    public static void nhb_tag_to_string(int tag, long buf) {
        long __functionAddress = Functions.tag_to_string;
        invokePV(tag, buf, __functionAddress);
    }

    /** {@code void hb_tag_to_string(hb_tag_t tag, char * buf)} */
    public static void hb_tag_to_string(@NativeType("hb_tag_t") int tag, @NativeType("char *") ByteBuffer buf) {
        if (CHECKS) {
            check(buf, 4);
        }
        nhb_tag_to_string(tag, memAddress(buf));
    }

    // --- [ hb_direction_from_string ] ---

    /** {@code hb_direction_t hb_direction_from_string(char const * str, int len)} */
    public static int nhb_direction_from_string(long str, int len) {
        long __functionAddress = Functions.direction_from_string;
        return invokePI(str, len, __functionAddress);
    }

    /** {@code hb_direction_t hb_direction_from_string(char const * str, int len)} */
    @NativeType("hb_direction_t")
    public static int hb_direction_from_string(@NativeType("char const *") ByteBuffer str) {
        return nhb_direction_from_string(memAddress(str), str.remaining());
    }

    /** {@code hb_direction_t hb_direction_from_string(char const * str, int len)} */
    @NativeType("hb_direction_t")
    public static int hb_direction_from_string(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_direction_from_string(strEncoded, strEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_direction_to_string ] ---

    /** {@code char const * hb_direction_to_string(hb_direction_t direction)} */
    public static long nhb_direction_to_string(int direction) {
        long __functionAddress = Functions.direction_to_string;
        return invokeP(direction, __functionAddress);
    }

    /** {@code char const * hb_direction_to_string(hb_direction_t direction)} */
    @NativeType("char const *")
    public static @Nullable String hb_direction_to_string(@NativeType("hb_direction_t") int direction) {
        long __result = nhb_direction_to_string(direction);
        return memASCIISafe(__result);
    }

    // --- [ hb_language_from_string ] ---

    /** {@code hb_language_t hb_language_from_string(char const * str, int len)} */
    public static long nhb_language_from_string(long str, int len) {
        long __functionAddress = Functions.language_from_string;
        return invokePP(str, len, __functionAddress);
    }

    /** {@code hb_language_t hb_language_from_string(char const * str, int len)} */
    @NativeType("hb_language_t")
    public static long hb_language_from_string(@NativeType("char const *") ByteBuffer str) {
        return nhb_language_from_string(memAddress(str), str.remaining());
    }

    /** {@code hb_language_t hb_language_from_string(char const * str, int len)} */
    @NativeType("hb_language_t")
    public static long hb_language_from_string(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_language_from_string(strEncoded, strEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_language_to_string ] ---

    /** {@code char const * hb_language_to_string(hb_language_t language)} */
    public static long nhb_language_to_string(long language) {
        long __functionAddress = Functions.language_to_string;
        if (CHECKS) {
            check(language);
        }
        return invokePP(language, __functionAddress);
    }

    /** {@code char const * hb_language_to_string(hb_language_t language)} */
    @NativeType("char const *")
    public static @Nullable String hb_language_to_string(@NativeType("hb_language_t") long language) {
        long __result = nhb_language_to_string(language);
        return memASCIISafe(__result);
    }

    // --- [ hb_language_get_default ] ---

    /** {@code hb_language_t hb_language_get_default(void)} */
    @NativeType("hb_language_t")
    public static long hb_language_get_default() {
        long __functionAddress = Functions.language_get_default;
        return invokeP(__functionAddress);
    }

    // --- [ hb_language_matches ] ---

    /** {@code hb_bool_t hb_language_matches(hb_language_t language, hb_language_t specific)} */
    @NativeType("hb_bool_t")
    public static boolean hb_language_matches(@NativeType("hb_language_t") long language, @NativeType("hb_language_t") long specific) {
        long __functionAddress = Functions.language_matches;
        if (CHECKS) {
            check(language);
            check(specific);
        }
        return invokePPI(language, specific, __functionAddress) != 0;
    }

    // --- [ hb_script_from_iso15924_tag ] ---

    /** {@code hb_script_t hb_script_from_iso15924_tag(hb_tag_t tag)} */
    @NativeType("hb_script_t")
    public static int hb_script_from_iso15924_tag(@NativeType("hb_tag_t") int tag) {
        long __functionAddress = Functions.script_from_iso15924_tag;
        return invokeI(tag, __functionAddress);
    }

    // --- [ hb_script_from_string ] ---

    /** {@code hb_script_t hb_script_from_string(char const * str, int len)} */
    public static int nhb_script_from_string(long str, int len) {
        long __functionAddress = Functions.script_from_string;
        return invokePI(str, len, __functionAddress);
    }

    /** {@code hb_script_t hb_script_from_string(char const * str, int len)} */
    @NativeType("hb_script_t")
    public static int hb_script_from_string(@NativeType("char const *") ByteBuffer str) {
        return nhb_script_from_string(memAddress(str), str.remaining());
    }

    /** {@code hb_script_t hb_script_from_string(char const * str, int len)} */
    @NativeType("hb_script_t")
    public static int hb_script_from_string(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_script_from_string(strEncoded, strEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_script_to_iso15924_tag ] ---

    /** {@code hb_tag_t hb_script_to_iso15924_tag(hb_script_t script)} */
    @NativeType("hb_tag_t")
    public static int hb_script_to_iso15924_tag(@NativeType("hb_script_t") int script) {
        long __functionAddress = Functions.script_to_iso15924_tag;
        return invokeI(script, __functionAddress);
    }

    // --- [ hb_script_get_horizontal_direction ] ---

    /** {@code hb_direction_t hb_script_get_horizontal_direction(hb_script_t script)} */
    @NativeType("hb_direction_t")
    public static int hb_script_get_horizontal_direction(@NativeType("hb_script_t") int script) {
        long __functionAddress = Functions.script_get_horizontal_direction;
        return invokeI(script, __functionAddress);
    }

    // --- [ hb_feature_from_string ] ---

    /** {@code hb_bool_t hb_feature_from_string(char const * str, int len, hb_feature_t * feature)} */
    public static int nhb_feature_from_string(long str, int len, long feature) {
        long __functionAddress = Functions.feature_from_string;
        return invokePPI(str, len, feature, __functionAddress);
    }

    /** {@code hb_bool_t hb_feature_from_string(char const * str, int len, hb_feature_t * feature)} */
    @NativeType("hb_bool_t")
    public static boolean hb_feature_from_string(@NativeType("char const *") ByteBuffer str, @NativeType("hb_feature_t *") hb_feature_t feature) {
        return nhb_feature_from_string(memAddress(str), str.remaining(), feature.address()) != 0;
    }

    /** {@code hb_bool_t hb_feature_from_string(char const * str, int len, hb_feature_t * feature)} */
    @NativeType("hb_bool_t")
    public static boolean hb_feature_from_string(@NativeType("char const *") CharSequence str, @NativeType("hb_feature_t *") hb_feature_t feature) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_feature_from_string(strEncoded, strEncodedLength, feature.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_feature_to_string ] ---

    /** {@code void hb_feature_to_string(hb_feature_t * feature, char * buf, unsigned int size)} */
    public static void nhb_feature_to_string(long feature, long buf, int size) {
        long __functionAddress = Functions.feature_to_string;
        invokePPV(feature, buf, size, __functionAddress);
    }

    /** {@code void hb_feature_to_string(hb_feature_t * feature, char * buf, unsigned int size)} */
    public static void hb_feature_to_string(@NativeType("hb_feature_t *") hb_feature_t feature, @NativeType("char *") ByteBuffer buf) {
        nhb_feature_to_string(feature.address(), memAddress(buf), buf.remaining());
    }

    // --- [ hb_variation_from_string ] ---

    /** {@code hb_bool_t hb_variation_from_string(char const * str, int len, hb_variation_t * variation)} */
    public static int nhb_variation_from_string(long str, int len, long variation) {
        long __functionAddress = Functions.variation_from_string;
        return invokePPI(str, len, variation, __functionAddress);
    }

    /** {@code hb_bool_t hb_variation_from_string(char const * str, int len, hb_variation_t * variation)} */
    @NativeType("hb_bool_t")
    public static boolean hb_variation_from_string(@NativeType("char const *") ByteBuffer str, @NativeType("hb_variation_t *") hb_variation_t variation) {
        return nhb_variation_from_string(memAddress(str), str.remaining(), variation.address()) != 0;
    }

    /** {@code hb_bool_t hb_variation_from_string(char const * str, int len, hb_variation_t * variation)} */
    @NativeType("hb_bool_t")
    public static boolean hb_variation_from_string(@NativeType("char const *") CharSequence str, @NativeType("hb_variation_t *") hb_variation_t variation) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_variation_from_string(strEncoded, strEncodedLength, variation.address()) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_variation_to_string ] ---

    /** {@code void hb_variation_to_string(hb_variation_t * variation, char * buf, unsigned int size)} */
    public static void nhb_variation_to_string(long variation, long buf, int size) {
        long __functionAddress = Functions.variation_to_string;
        invokePPV(variation, buf, size, __functionAddress);
    }

    /** {@code void hb_variation_to_string(hb_variation_t * variation, char * buf, unsigned int size)} */
    public static void hb_variation_to_string(@NativeType("hb_variation_t *") hb_variation_t variation, @NativeType("char *") ByteBuffer buf) {
        nhb_variation_to_string(variation.address(), memAddress(buf), buf.remaining());
    }

    // --- [ hb_color_get_alpha ] ---

    /** {@code uint8_t hb_color_get_alpha(hb_color_t color)} */
    @NativeType("uint8_t")
    public static byte hb_color_get_alpha(@NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.color_get_alpha;
        return invokeU(color, __functionAddress);
    }

    // --- [ hb_color_get_red ] ---

    /** {@code uint8_t hb_color_get_red(hb_color_t color)} */
    @NativeType("uint8_t")
    public static byte hb_color_get_red(@NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.color_get_red;
        return invokeU(color, __functionAddress);
    }

    // --- [ hb_color_get_green ] ---

    /** {@code uint8_t hb_color_get_green(hb_color_t color)} */
    @NativeType("uint8_t")
    public static byte hb_color_get_green(@NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.color_get_green;
        return invokeU(color, __functionAddress);
    }

    // --- [ hb_color_get_blue ] ---

    /** {@code uint8_t hb_color_get_blue(hb_color_t color)} */
    @NativeType("uint8_t")
    public static byte hb_color_get_blue(@NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.color_get_blue;
        return invokeU(color, __functionAddress);
    }

    // --- [ hb_blob_create ] ---

    /** {@code hb_blob_t * hb_blob_create(char const * data, unsigned int length, hb_memory_mode_t mode, void * user_data, hb_destroy_func_t destroy)} */
    public static long nhb_blob_create(long data, int length, int mode, long user_data, long destroy) {
        long __functionAddress = Functions.blob_create;
        return invokePPPP(data, length, mode, user_data, destroy, __functionAddress);
    }

    /** {@code hb_blob_t * hb_blob_create(char const * data, unsigned int length, hb_memory_mode_t mode, void * user_data, hb_destroy_func_t destroy)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create(@NativeType("char const *") ByteBuffer data, @NativeType("hb_memory_mode_t") int mode, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        return nhb_blob_create(memAddress(data), data.remaining(), mode, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_blob_create_or_fail ] ---

    /** {@code hb_blob_t * hb_blob_create_or_fail(char const * data, unsigned int length, hb_memory_mode_t mode, void * user_data, hb_destroy_func_t destroy)} */
    public static long nhb_blob_create_or_fail(long data, int length, int mode, long user_data, long destroy) {
        long __functionAddress = Functions.blob_create_or_fail;
        return invokePPPP(data, length, mode, user_data, destroy, __functionAddress);
    }

    /** {@code hb_blob_t * hb_blob_create_or_fail(char const * data, unsigned int length, hb_memory_mode_t mode, void * user_data, hb_destroy_func_t destroy)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create_or_fail(@NativeType("char const *") ByteBuffer data, @NativeType("hb_memory_mode_t") int mode, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        return nhb_blob_create_or_fail(memAddress(data), data.remaining(), mode, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_blob_create_from_file ] ---

    /** {@code hb_blob_t * hb_blob_create_from_file(char const * file_name)} */
    public static long nhb_blob_create_from_file(long file_name) {
        long __functionAddress = Functions.blob_create_from_file;
        return invokePP(file_name, __functionAddress);
    }

    /** {@code hb_blob_t * hb_blob_create_from_file(char const * file_name)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create_from_file(@NativeType("char const *") ByteBuffer file_name) {
        if (CHECKS) {
            checkNT1(file_name);
        }
        return nhb_blob_create_from_file(memAddress(file_name));
    }

    /** {@code hb_blob_t * hb_blob_create_from_file(char const * file_name)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create_from_file(@NativeType("char const *") CharSequence file_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            return nhb_blob_create_from_file(file_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_blob_create_from_file_or_fail ] ---

    /** {@code hb_blob_t * hb_blob_create_from_file_or_fail(char const * file_name)} */
    public static long nhb_blob_create_from_file_or_fail(long file_name) {
        long __functionAddress = Functions.blob_create_from_file_or_fail;
        return invokePP(file_name, __functionAddress);
    }

    /** {@code hb_blob_t * hb_blob_create_from_file_or_fail(char const * file_name)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create_from_file_or_fail(@NativeType("char const *") ByteBuffer file_name) {
        if (CHECKS) {
            checkNT1(file_name);
        }
        return nhb_blob_create_from_file_or_fail(memAddress(file_name));
    }

    /** {@code hb_blob_t * hb_blob_create_from_file_or_fail(char const * file_name)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create_from_file_or_fail(@NativeType("char const *") CharSequence file_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            return nhb_blob_create_from_file_or_fail(file_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_blob_create_sub_blob ] ---

    /** {@code hb_blob_t * hb_blob_create_sub_blob(hb_blob_t * parent, unsigned int offset, unsigned int length)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_create_sub_blob(@NativeType("hb_blob_t *") long parent, @NativeType("unsigned int") int offset, @NativeType("unsigned int") int length) {
        long __functionAddress = Functions.blob_create_sub_blob;
        if (CHECKS) {
            check(parent);
        }
        return invokePP(parent, offset, length, __functionAddress);
    }

    // --- [ hb_blob_copy_writable_or_fail ] ---

    /** {@code hb_blob_t * hb_blob_copy_writable_or_fail(hb_blob_t * blob)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_copy_writable_or_fail(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.blob_copy_writable_or_fail;
        if (CHECKS) {
            check(blob);
        }
        return invokePP(blob, __functionAddress);
    }

    // --- [ hb_blob_get_empty ] ---

    /** {@code hb_blob_t * hb_blob_get_empty(void)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_get_empty() {
        long __functionAddress = Functions.blob_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_blob_reference ] ---

    /** {@code hb_blob_t * hb_blob_reference(hb_blob_t * blob)} */
    @NativeType("hb_blob_t *")
    public static long hb_blob_reference(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.blob_reference;
        if (CHECKS) {
            check(blob);
        }
        return invokePP(blob, __functionAddress);
    }

    // --- [ hb_blob_destroy ] ---

    /** {@code void hb_blob_destroy(hb_blob_t * blob)} */
    public static void hb_blob_destroy(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.blob_destroy;
        if (CHECKS) {
            check(blob);
        }
        invokePV(blob, __functionAddress);
    }

    // --- [ hb_blob_set_user_data ] ---

    /** {@code hb_bool_t hb_blob_set_user_data(hb_blob_t * blob, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_blob_set_user_data(long blob, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.blob_set_user_data;
        if (CHECKS) {
            check(blob);
        }
        return invokePPPPI(blob, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_blob_set_user_data(hb_blob_t * blob, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_blob_set_user_data(@NativeType("hb_blob_t *") long blob, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_blob_set_user_data(blob, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_blob_get_user_data ] ---

    /** {@code void * hb_blob_get_user_data(hb_blob_t const * blob, hb_user_data_key_t * key)} */
    public static long nhb_blob_get_user_data(long blob, long key) {
        long __functionAddress = Functions.blob_get_user_data;
        if (CHECKS) {
            check(blob);
        }
        return invokePPP(blob, key, __functionAddress);
    }

    /** {@code void * hb_blob_get_user_data(hb_blob_t const * blob, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_blob_get_user_data(@NativeType("hb_blob_t const *") long blob, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_blob_get_user_data(blob, key.address());
    }

    // --- [ hb_blob_make_immutable ] ---

    /** {@code void hb_blob_make_immutable(hb_blob_t * blob)} */
    public static void hb_blob_make_immutable(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.blob_make_immutable;
        if (CHECKS) {
            check(blob);
        }
        invokePV(blob, __functionAddress);
    }

    // --- [ hb_blob_is_immutable ] ---

    /** {@code hb_bool_t hb_blob_is_immutable(hb_blob_t * blob)} */
    @NativeType("hb_bool_t")
    public static boolean hb_blob_is_immutable(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.blob_is_immutable;
        if (CHECKS) {
            check(blob);
        }
        return invokePI(blob, __functionAddress) != 0;
    }

    // --- [ hb_blob_get_length ] ---

    /** {@code unsigned int hb_blob_get_length(hb_blob_t * blob)} */
    @NativeType("unsigned int")
    public static int hb_blob_get_length(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.blob_get_length;
        if (CHECKS) {
            check(blob);
        }
        return invokePI(blob, __functionAddress);
    }

    // --- [ hb_blob_get_data ] ---

    /** {@code char const * hb_blob_get_data(hb_blob_t * blob, unsigned int * length)} */
    public static long nhb_blob_get_data(long blob, long length) {
        long __functionAddress = Functions.blob_get_data;
        if (CHECKS) {
            check(blob);
        }
        return invokePPP(blob, length, __functionAddress);
    }

    /** {@code char const * hb_blob_get_data(hb_blob_t * blob, unsigned int * length)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer hb_blob_get_data(@NativeType("hb_blob_t *") long blob) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nhb_blob_get_data(blob, memAddress(length));
            return memByteBufferSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_blob_get_data_writable ] ---

    /** {@code char * hb_blob_get_data_writable(hb_blob_t * blob, unsigned int * length)} */
    public static long nhb_blob_get_data_writable(long blob, long length) {
        long __functionAddress = Functions.blob_get_data_writable;
        if (CHECKS) {
            check(blob);
        }
        return invokePPP(blob, length, __functionAddress);
    }

    /** {@code char * hb_blob_get_data_writable(hb_blob_t * blob, unsigned int * length)} */
    @NativeType("char *")
    public static @Nullable ByteBuffer hb_blob_get_data_writable(@NativeType("hb_blob_t *") long blob) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nhb_blob_get_data_writable(blob, memAddress(length));
            return memByteBufferSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_segment_properties_equal ] ---

    /** {@code hb_bool_t hb_segment_properties_equal(hb_segment_properties_t const * a, hb_segment_properties_t const * b)} */
    public static int nhb_segment_properties_equal(long a, long b) {
        long __functionAddress = Functions.segment_properties_equal;
        return invokePPI(a, b, __functionAddress);
    }

    /** {@code hb_bool_t hb_segment_properties_equal(hb_segment_properties_t const * a, hb_segment_properties_t const * b)} */
    @NativeType("hb_bool_t")
    public static boolean hb_segment_properties_equal(@NativeType("hb_segment_properties_t const *") hb_segment_properties_t a, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t b) {
        return nhb_segment_properties_equal(a.address(), b.address()) != 0;
    }

    // --- [ hb_segment_properties_hash ] ---

    /** {@code unsigned int hb_segment_properties_hash(hb_segment_properties_t const * p)} */
    public static int nhb_segment_properties_hash(long p) {
        long __functionAddress = Functions.segment_properties_hash;
        return invokePI(p, __functionAddress);
    }

    /** {@code unsigned int hb_segment_properties_hash(hb_segment_properties_t const * p)} */
    @NativeType("unsigned int")
    public static int hb_segment_properties_hash(@NativeType("hb_segment_properties_t const *") hb_segment_properties_t p) {
        return nhb_segment_properties_hash(p.address());
    }

    // --- [ hb_segment_properties_overlay ] ---

    /** {@code void hb_segment_properties_overlay(hb_segment_properties_t * p, hb_segment_properties_t const * src)} */
    public static void nhb_segment_properties_overlay(long p, long src) {
        long __functionAddress = Functions.segment_properties_overlay;
        invokePPV(p, src, __functionAddress);
    }

    /** {@code void hb_segment_properties_overlay(hb_segment_properties_t * p, hb_segment_properties_t const * src)} */
    public static void hb_segment_properties_overlay(@NativeType("hb_segment_properties_t *") hb_segment_properties_t p, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t src) {
        nhb_segment_properties_overlay(p.address(), src.address());
    }

    // --- [ hb_buffer_create ] ---

    /** {@code hb_buffer_t * hb_buffer_create(void)} */
    @NativeType("hb_buffer_t *")
    public static long hb_buffer_create() {
        long __functionAddress = Functions.buffer_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_buffer_create_similar ] ---

    /** {@code hb_buffer_t * hb_buffer_create_similar(hb_buffer_t const * src)} */
    @NativeType("hb_buffer_t *")
    public static long hb_buffer_create_similar(@NativeType("hb_buffer_t const *") long src) {
        long __functionAddress = Functions.buffer_create_similar;
        if (CHECKS) {
            check(src);
        }
        return invokePP(src, __functionAddress);
    }

    // --- [ hb_buffer_reset ] ---

    /** {@code void hb_buffer_reset(hb_buffer_t * buffer)} */
    public static void hb_buffer_reset(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_reset;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_get_empty ] ---

    /** {@code hb_buffer_t * hb_buffer_get_empty(void)} */
    @NativeType("hb_buffer_t *")
    public static long hb_buffer_get_empty() {
        long __functionAddress = Functions.buffer_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_buffer_reference ] ---

    /** {@code hb_buffer_t * hb_buffer_reference(hb_buffer_t * buffer)} */
    @NativeType("hb_buffer_t *")
    public static long hb_buffer_reference(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_reference;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ hb_buffer_destroy ] ---

    /** {@code void hb_buffer_destroy(hb_buffer_t * buffer)} */
    public static void hb_buffer_destroy(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_destroy;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_user_data ] ---

    /** {@code hb_bool_t hb_buffer_set_user_data(hb_buffer_t * buffer, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_buffer_set_user_data(long buffer, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.buffer_set_user_data;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPPPI(buffer, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_buffer_set_user_data(hb_buffer_t * buffer, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_set_user_data(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_buffer_set_user_data(buffer, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_buffer_get_user_data ] ---

    /** {@code void * hb_buffer_get_user_data(hb_buffer_t const * buffer, hb_user_data_key_t * key)} */
    public static long nhb_buffer_get_user_data(long buffer, long key) {
        long __functionAddress = Functions.buffer_get_user_data;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPP(buffer, key, __functionAddress);
    }

    /** {@code void * hb_buffer_get_user_data(hb_buffer_t const * buffer, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_buffer_get_user_data(@NativeType("hb_buffer_t const *") long buffer, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_buffer_get_user_data(buffer, key.address());
    }

    // --- [ hb_buffer_set_content_type ] ---

    /** {@code void hb_buffer_set_content_type(hb_buffer_t * buffer, hb_buffer_content_type_t content_type)} */
    public static void hb_buffer_set_content_type(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_buffer_content_type_t") int content_type) {
        long __functionAddress = Functions.buffer_set_content_type;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, content_type, __functionAddress);
    }

    // --- [ hb_buffer_get_content_type ] ---

    /** {@code hb_buffer_content_type_t hb_buffer_get_content_type(hb_buffer_t const * buffer)} */
    @NativeType("hb_buffer_content_type_t")
    public static int hb_buffer_get_content_type(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_content_type;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_unicode_funcs ] ---

    /** {@code void hb_buffer_set_unicode_funcs(hb_buffer_t * buffer, hb_unicode_funcs_t * unicode_funcs)} */
    public static void hb_buffer_set_unicode_funcs(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_unicode_funcs_t *") long unicode_funcs) {
        long __functionAddress = Functions.buffer_set_unicode_funcs;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, unicode_funcs, __functionAddress);
    }

    // --- [ hb_buffer_get_unicode_funcs ] ---

    /** {@code hb_unicode_funcs_t * hb_buffer_get_unicode_funcs(hb_buffer_t const * buffer)} */
    @NativeType("hb_unicode_funcs_t *")
    public static long hb_buffer_get_unicode_funcs(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_unicode_funcs;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_direction ] ---

    /** {@code void hb_buffer_set_direction(hb_buffer_t * buffer, hb_direction_t direction)} */
    public static void hb_buffer_set_direction(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_direction_t") int direction) {
        long __functionAddress = Functions.buffer_set_direction;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, direction, __functionAddress);
    }

    // --- [ hb_buffer_get_direction ] ---

    /** {@code hb_direction_t hb_buffer_get_direction(hb_buffer_t const * buffer)} */
    @NativeType("hb_direction_t")
    public static int hb_buffer_get_direction(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_direction;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_script ] ---

    /** {@code void hb_buffer_set_script(hb_buffer_t * buffer, hb_script_t script)} */
    public static void hb_buffer_set_script(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_script_t") int script) {
        long __functionAddress = Functions.buffer_set_script;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, script, __functionAddress);
    }

    // --- [ hb_buffer_get_script ] ---

    /** {@code hb_script_t hb_buffer_get_script(hb_buffer_t const * buffer)} */
    @NativeType("hb_script_t")
    public static int hb_buffer_get_script(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_script;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_language ] ---

    /** {@code void hb_buffer_set_language(hb_buffer_t * buffer, hb_language_t language)} */
    public static void hb_buffer_set_language(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_language_t") long language) {
        long __functionAddress = Functions.buffer_set_language;
        if (CHECKS) {
            check(buffer);
            check(language);
        }
        invokePPV(buffer, language, __functionAddress);
    }

    // --- [ hb_buffer_get_language ] ---

    /** {@code hb_language_t hb_buffer_get_language(hb_buffer_t const * buffer)} */
    @NativeType("hb_language_t")
    public static long hb_buffer_get_language(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_language;
        if (CHECKS) {
            check(buffer);
        }
        return invokePP(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_segment_properties ] ---

    /** {@code void hb_buffer_set_segment_properties(hb_buffer_t * buffer, hb_segment_properties_t const * props)} */
    public static void nhb_buffer_set_segment_properties(long buffer, long props) {
        long __functionAddress = Functions.buffer_set_segment_properties;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, props, __functionAddress);
    }

    /** {@code void hb_buffer_set_segment_properties(hb_buffer_t * buffer, hb_segment_properties_t const * props)} */
    public static void hb_buffer_set_segment_properties(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t props) {
        nhb_buffer_set_segment_properties(buffer, props.address());
    }

    // --- [ hb_buffer_get_segment_properties ] ---

    /** {@code void hb_buffer_get_segment_properties(hb_buffer_t const * buffer, hb_segment_properties_t * props)} */
    public static void nhb_buffer_get_segment_properties(long buffer, long props) {
        long __functionAddress = Functions.buffer_get_segment_properties;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, props, __functionAddress);
    }

    /** {@code void hb_buffer_get_segment_properties(hb_buffer_t const * buffer, hb_segment_properties_t * props)} */
    public static void hb_buffer_get_segment_properties(@NativeType("hb_buffer_t const *") long buffer, @NativeType("hb_segment_properties_t *") hb_segment_properties_t props) {
        nhb_buffer_get_segment_properties(buffer, props.address());
    }

    // --- [ hb_buffer_guess_segment_properties ] ---

    /** {@code void hb_buffer_guess_segment_properties(hb_buffer_t * buffer)} */
    public static void hb_buffer_guess_segment_properties(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_guess_segment_properties;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_flags ] ---

    /** {@code void hb_buffer_set_flags(hb_buffer_t * buffer, hb_buffer_flags_t flags)} */
    public static void hb_buffer_set_flags(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_buffer_flags_t") int flags) {
        long __functionAddress = Functions.buffer_set_flags;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, flags, __functionAddress);
    }

    // --- [ hb_buffer_get_flags ] ---

    /** {@code hb_buffer_flags_t hb_buffer_get_flags(hb_buffer_t const * buffer)} */
    @NativeType("hb_buffer_flags_t")
    public static int hb_buffer_get_flags(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_flags;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_cluster_level ] ---

    /** {@code void hb_buffer_set_cluster_level(hb_buffer_t * buffer, hb_buffer_cluster_level_t cluster_level)} */
    public static void hb_buffer_set_cluster_level(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_buffer_cluster_level_t") int cluster_level) {
        long __functionAddress = Functions.buffer_set_cluster_level;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, cluster_level, __functionAddress);
    }

    // --- [ hb_buffer_get_cluster_level ] ---

    /** {@code hb_buffer_cluster_level_t hb_buffer_get_cluster_level(hb_buffer_t const * buffer)} */
    @NativeType("hb_buffer_cluster_level_t")
    public static int hb_buffer_get_cluster_level(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_cluster_level;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_replacement_codepoint ] ---

    /** {@code void hb_buffer_set_replacement_codepoint(hb_buffer_t * buffer, hb_codepoint_t replacement)} */
    public static void hb_buffer_set_replacement_codepoint(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_codepoint_t") int replacement) {
        long __functionAddress = Functions.buffer_set_replacement_codepoint;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, replacement, __functionAddress);
    }

    // --- [ hb_buffer_get_replacement_codepoint ] ---

    /** {@code hb_codepoint_t hb_buffer_get_replacement_codepoint(hb_buffer_t const * buffer)} */
    @NativeType("hb_codepoint_t")
    public static int hb_buffer_get_replacement_codepoint(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_replacement_codepoint;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_invisible_glyph ] ---

    /** {@code void hb_buffer_set_invisible_glyph(hb_buffer_t * buffer, hb_codepoint_t invisible)} */
    public static void hb_buffer_set_invisible_glyph(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_codepoint_t") int invisible) {
        long __functionAddress = Functions.buffer_set_invisible_glyph;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, invisible, __functionAddress);
    }

    // --- [ hb_buffer_get_invisible_glyph ] ---

    /** {@code hb_codepoint_t hb_buffer_get_invisible_glyph(hb_buffer_t const * buffer)} */
    @NativeType("hb_codepoint_t")
    public static int hb_buffer_get_invisible_glyph(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_invisible_glyph;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_not_found_glyph ] ---

    /** {@code void hb_buffer_set_not_found_glyph(hb_buffer_t * buffer, hb_codepoint_t not_found)} */
    public static void hb_buffer_set_not_found_glyph(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_codepoint_t") int not_found) {
        long __functionAddress = Functions.buffer_set_not_found_glyph;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, not_found, __functionAddress);
    }

    // --- [ hb_buffer_get_not_found_glyph ] ---

    /** {@code hb_codepoint_t hb_buffer_get_not_found_glyph(hb_buffer_t const * buffer)} */
    @NativeType("hb_codepoint_t")
    public static int hb_buffer_get_not_found_glyph(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_not_found_glyph;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_not_found_variation_selector_glyph ] ---

    /** {@code void hb_buffer_set_not_found_variation_selector_glyph(hb_buffer_t * buffer, hb_codepoint_t not_found_variation_selector)} */
    public static void hb_buffer_set_not_found_variation_selector_glyph(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_codepoint_t") int not_found_variation_selector) {
        long __functionAddress = Functions.buffer_set_not_found_variation_selector_glyph;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, not_found_variation_selector, __functionAddress);
    }

    // --- [ hb_buffer_get_not_found_variation_selector_glyph ] ---

    /** {@code hb_codepoint_t hb_buffer_get_not_found_variation_selector_glyph(hb_buffer_t const * buffer)} */
    @NativeType("hb_codepoint_t")
    public static int hb_buffer_get_not_found_variation_selector_glyph(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_not_found_variation_selector_glyph;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_set_random_state ] ---

    /** {@code void hb_buffer_set_random_state(hb_buffer_t * buffer, unsigned state)} */
    public static void hb_buffer_set_random_state(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned") int state) {
        long __functionAddress = Functions.buffer_set_random_state;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, state, __functionAddress);
    }

    // --- [ hb_buffer_get_random_state ] ---

    /** {@code unsigned hb_buffer_get_random_state(hb_buffer_t const * buffer)} */
    @NativeType("unsigned")
    public static int hb_buffer_get_random_state(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_random_state;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_clear_contents ] ---

    /** {@code void hb_buffer_clear_contents(hb_buffer_t * buffer)} */
    public static void hb_buffer_clear_contents(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_clear_contents;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_pre_allocate ] ---

    /** {@code hb_bool_t hb_buffer_pre_allocate(hb_buffer_t * buffer, unsigned int size)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_pre_allocate(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned int") int size) {
        long __functionAddress = Functions.buffer_pre_allocate;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, size, __functionAddress) != 0;
    }

    // --- [ hb_buffer_allocation_successful ] ---

    /** {@code hb_bool_t hb_buffer_allocation_successful(hb_buffer_t * buffer)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_allocation_successful(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_allocation_successful;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress) != 0;
    }

    // --- [ hb_buffer_reverse ] ---

    /** {@code void hb_buffer_reverse(hb_buffer_t * buffer)} */
    public static void hb_buffer_reverse(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_reverse;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_reverse_range ] ---

    /** {@code void hb_buffer_reverse_range(hb_buffer_t * buffer, unsigned int start, unsigned int end)} */
    public static void hb_buffer_reverse_range(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned int") int start, @NativeType("unsigned int") int end) {
        long __functionAddress = Functions.buffer_reverse_range;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, start, end, __functionAddress);
    }

    // --- [ hb_buffer_reverse_clusters ] ---

    /** {@code void hb_buffer_reverse_clusters(hb_buffer_t * buffer)} */
    public static void hb_buffer_reverse_clusters(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_reverse_clusters;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_add ] ---

    /** {@code void hb_buffer_add(hb_buffer_t * buffer, hb_codepoint_t codepoint, unsigned int cluster)} */
    public static void hb_buffer_add(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_codepoint_t") int codepoint, @NativeType("unsigned int") int cluster) {
        long __functionAddress = Functions.buffer_add;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, codepoint, cluster, __functionAddress);
    }

    // --- [ hb_buffer_add_utf8 ] ---

    /** {@code void hb_buffer_add_utf8(hb_buffer_t * buffer, char const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void nhb_buffer_add_utf8(long buffer, long text, int text_length, int item_offset, int item_length) {
        long __functionAddress = Functions.buffer_add_utf8;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, text, text_length, item_offset, item_length, __functionAddress);
    }

    /** {@code void hb_buffer_add_utf8(hb_buffer_t * buffer, char const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_utf8(@NativeType("hb_buffer_t *") long buffer, @NativeType("char const *") ByteBuffer text, @NativeType("unsigned int") int item_offset, int item_length) {
        nhb_buffer_add_utf8(buffer, memAddress(text), text.remaining(), item_offset, item_length);
    }

    /** {@code void hb_buffer_add_utf8(hb_buffer_t * buffer, char const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_utf8(@NativeType("hb_buffer_t *") long buffer, @NativeType("char const *") CharSequence text, @NativeType("unsigned int") int item_offset, int item_length) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF8(text, false);
            long textEncoded = stack.getPointerAddress();
            nhb_buffer_add_utf8(buffer, textEncoded, textEncodedLength, item_offset, item_length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_buffer_add_utf16 ] ---

    /** {@code void hb_buffer_add_utf16(hb_buffer_t * buffer, uint16_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void nhb_buffer_add_utf16(long buffer, long text, int text_length, int item_offset, int item_length) {
        long __functionAddress = Functions.buffer_add_utf16;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, text, text_length, item_offset, item_length, __functionAddress);
    }

    /** {@code void hb_buffer_add_utf16(hb_buffer_t * buffer, uint16_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_utf16(@NativeType("hb_buffer_t *") long buffer, @NativeType("uint16_t const *") ByteBuffer text, @NativeType("unsigned int") int item_offset, int item_length) {
        nhb_buffer_add_utf16(buffer, memAddress(text), text.remaining() >> 1, item_offset, item_length);
    }

    /** {@code void hb_buffer_add_utf16(hb_buffer_t * buffer, uint16_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_utf16(@NativeType("hb_buffer_t *") long buffer, @NativeType("uint16_t const *") CharSequence text, @NativeType("unsigned int") int item_offset, int item_length) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int textEncodedLength = stack.nUTF16(text, false);
            long textEncoded = stack.getPointerAddress();
            nhb_buffer_add_utf16(buffer, textEncoded, textEncodedLength >> 1, item_offset, item_length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_buffer_add_utf32 ] ---

    /** {@code void hb_buffer_add_utf32(hb_buffer_t * buffer, uint32_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void nhb_buffer_add_utf32(long buffer, long text, int text_length, int item_offset, int item_length) {
        long __functionAddress = Functions.buffer_add_utf32;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, text, text_length, item_offset, item_length, __functionAddress);
    }

    /** {@code void hb_buffer_add_utf32(hb_buffer_t * buffer, uint32_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_utf32(@NativeType("hb_buffer_t *") long buffer, @NativeType("uint32_t const *") IntBuffer text, @NativeType("unsigned int") int item_offset, int item_length) {
        nhb_buffer_add_utf32(buffer, memAddress(text), text.remaining(), item_offset, item_length);
    }

    // --- [ hb_buffer_add_latin1 ] ---

    /** {@code void hb_buffer_add_latin1(hb_buffer_t * buffer, uint8_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void nhb_buffer_add_latin1(long buffer, long text, int text_length, int item_offset, int item_length) {
        long __functionAddress = Functions.buffer_add_latin1;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, text, text_length, item_offset, item_length, __functionAddress);
    }

    /** {@code void hb_buffer_add_latin1(hb_buffer_t * buffer, uint8_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_latin1(@NativeType("hb_buffer_t *") long buffer, @NativeType("uint8_t const *") ByteBuffer text, @NativeType("unsigned int") int item_offset, int item_length) {
        nhb_buffer_add_latin1(buffer, memAddress(text), text.remaining(), item_offset, item_length);
    }

    // --- [ hb_buffer_add_codepoints ] ---

    /** {@code void hb_buffer_add_codepoints(hb_buffer_t * buffer, hb_codepoint_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void nhb_buffer_add_codepoints(long buffer, long text, int text_length, int item_offset, int item_length) {
        long __functionAddress = Functions.buffer_add_codepoints;
        if (CHECKS) {
            check(buffer);
        }
        invokePPV(buffer, text, text_length, item_offset, item_length, __functionAddress);
    }

    /** {@code void hb_buffer_add_codepoints(hb_buffer_t * buffer, hb_codepoint_t const * text, int text_length, unsigned int item_offset, int item_length)} */
    public static void hb_buffer_add_codepoints(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_codepoint_t const *") IntBuffer text, @NativeType("unsigned int") int item_offset, int item_length) {
        nhb_buffer_add_codepoints(buffer, memAddress(text), text.remaining(), item_offset, item_length);
    }

    // --- [ hb_buffer_append ] ---

    /** {@code void hb_buffer_append(hb_buffer_t * buffer, hb_buffer_t const * source, unsigned int start, unsigned int end)} */
    public static void hb_buffer_append(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_buffer_t const *") long source, @NativeType("unsigned int") int start, @NativeType("unsigned int") int end) {
        long __functionAddress = Functions.buffer_append;
        if (CHECKS) {
            check(buffer);
            check(source);
        }
        invokePPV(buffer, source, start, end, __functionAddress);
    }

    // --- [ hb_buffer_set_length ] ---

    /** {@code hb_bool_t hb_buffer_set_length(hb_buffer_t * buffer, unsigned int length)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_set_length(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned int") int length) {
        long __functionAddress = Functions.buffer_set_length;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, length, __functionAddress) != 0;
    }

    // --- [ hb_buffer_get_length ] ---

    /** {@code unsigned int hb_buffer_get_length(hb_buffer_t const * buffer)} */
    @NativeType("unsigned int")
    public static int hb_buffer_get_length(@NativeType("hb_buffer_t const *") long buffer) {
        long __functionAddress = Functions.buffer_get_length;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress);
    }

    // --- [ hb_buffer_get_glyph_infos ] ---

    /** {@code hb_glyph_info_t * hb_buffer_get_glyph_infos(hb_buffer_t * buffer, unsigned int * length)} */
    public static long nhb_buffer_get_glyph_infos(long buffer, long length) {
        long __functionAddress = Functions.buffer_get_glyph_infos;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPP(buffer, length, __functionAddress);
    }

    /** {@code hb_glyph_info_t * hb_buffer_get_glyph_infos(hb_buffer_t * buffer, unsigned int * length)} */
    @NativeType("hb_glyph_info_t *")
    public static hb_glyph_info_t.@Nullable Buffer hb_buffer_get_glyph_infos(@NativeType("hb_buffer_t *") long buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nhb_buffer_get_glyph_infos(buffer, memAddress(length));
            return hb_glyph_info_t.createSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_buffer_get_glyph_positions ] ---

    /** {@code hb_glyph_position_t * hb_buffer_get_glyph_positions(hb_buffer_t * buffer, unsigned int * length)} */
    public static long nhb_buffer_get_glyph_positions(long buffer, long length) {
        long __functionAddress = Functions.buffer_get_glyph_positions;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPP(buffer, length, __functionAddress);
    }

    /** {@code hb_glyph_position_t * hb_buffer_get_glyph_positions(hb_buffer_t * buffer, unsigned int * length)} */
    @NativeType("hb_glyph_position_t *")
    public static hb_glyph_position_t.@Nullable Buffer hb_buffer_get_glyph_positions(@NativeType("hb_buffer_t *") long buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nhb_buffer_get_glyph_positions(buffer, memAddress(length));
            return hb_glyph_position_t.createSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_buffer_has_positions ] ---

    /** {@code hb_bool_t hb_buffer_has_positions(hb_buffer_t * buffer)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_has_positions(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_has_positions;
        if (CHECKS) {
            check(buffer);
        }
        return invokePI(buffer, __functionAddress) != 0;
    }

    // --- [ hb_buffer_normalize_glyphs ] ---

    /** {@code void hb_buffer_normalize_glyphs(hb_buffer_t * buffer)} */
    public static void hb_buffer_normalize_glyphs(@NativeType("hb_buffer_t *") long buffer) {
        long __functionAddress = Functions.buffer_normalize_glyphs;
        if (CHECKS) {
            check(buffer);
        }
        invokePV(buffer, __functionAddress);
    }

    // --- [ hb_buffer_serialize_format_from_string ] ---

    /** {@code hb_buffer_serialize_format_t hb_buffer_serialize_format_from_string(char const * str, int len)} */
    public static int nhb_buffer_serialize_format_from_string(long str, int len) {
        long __functionAddress = Functions.buffer_serialize_format_from_string;
        return invokePI(str, len, __functionAddress);
    }

    /** {@code hb_buffer_serialize_format_t hb_buffer_serialize_format_from_string(char const * str, int len)} */
    @NativeType("hb_buffer_serialize_format_t")
    public static int hb_buffer_serialize_format_from_string(@NativeType("char const *") ByteBuffer str) {
        return nhb_buffer_serialize_format_from_string(memAddress(str), str.remaining());
    }

    /** {@code hb_buffer_serialize_format_t hb_buffer_serialize_format_from_string(char const * str, int len)} */
    @NativeType("hb_buffer_serialize_format_t")
    public static int hb_buffer_serialize_format_from_string(@NativeType("char const *") CharSequence str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int strEncodedLength = stack.nASCII(str, false);
            long strEncoded = stack.getPointerAddress();
            return nhb_buffer_serialize_format_from_string(strEncoded, strEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_buffer_serialize_format_to_string ] ---

    /** {@code char const * hb_buffer_serialize_format_to_string(hb_buffer_serialize_format_t format)} */
    public static long nhb_buffer_serialize_format_to_string(int format) {
        long __functionAddress = Functions.buffer_serialize_format_to_string;
        return invokeP(format, __functionAddress);
    }

    /** {@code char const * hb_buffer_serialize_format_to_string(hb_buffer_serialize_format_t format)} */
    @NativeType("char const *")
    public static @Nullable String hb_buffer_serialize_format_to_string(@NativeType("hb_buffer_serialize_format_t") int format) {
        long __result = nhb_buffer_serialize_format_to_string(format);
        return memASCIISafe(__result);
    }

    // --- [ hb_buffer_serialize_list_formats ] ---

    /** {@code char const ** hb_buffer_serialize_list_formats(void)} */
    public static long nhb_buffer_serialize_list_formats() {
        long __functionAddress = Functions.buffer_serialize_list_formats;
        return invokeP(__functionAddress);
    }

    /** {@code char const ** hb_buffer_serialize_list_formats(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_buffer_serialize_list_formats() {
        long __result = nhb_buffer_serialize_list_formats();
        return memPointerBufferSafe(__result, buffer_serialize_list_formats_COUNT);
    }

    /** {@code char const ** hb_buffer_serialize_list_formats(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_buffer_serialize_list_formats(long length) {
        long __result = nhb_buffer_serialize_list_formats();
        return memPointerBufferSafe(__result, (int)length);
    }

    // --- [ hb_buffer_serialize_glyphs ] ---

    /** {@code unsigned int hb_buffer_serialize_glyphs(hb_buffer_t * buffer, unsigned int start, unsigned int end, char * buf, unsigned int buf_size, unsigned int * buf_consumed, hb_font_t * font, hb_buffer_serialize_format_t format, hb_buffer_serialize_flags_t flags)} */
    public static int nhb_buffer_serialize_glyphs(long buffer, int start, int end, long buf, int buf_size, long buf_consumed, long font, int format, int flags) {
        long __functionAddress = Functions.buffer_serialize_glyphs;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPPPI(buffer, start, end, buf, buf_size, buf_consumed, font, format, flags, __functionAddress);
    }

    /** {@code unsigned int hb_buffer_serialize_glyphs(hb_buffer_t * buffer, unsigned int start, unsigned int end, char * buf, unsigned int buf_size, unsigned int * buf_consumed, hb_font_t * font, hb_buffer_serialize_format_t format, hb_buffer_serialize_flags_t flags)} */
    @NativeType("unsigned int")
    public static int hb_buffer_serialize_glyphs(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned int") int start, @NativeType("unsigned int") int end, @NativeType("char *") ByteBuffer buf, @NativeType("unsigned int *") @Nullable IntBuffer buf_consumed, @NativeType("hb_font_t *") long font, @NativeType("hb_buffer_serialize_format_t") int format, @NativeType("hb_buffer_serialize_flags_t") int flags) {
        if (CHECKS) {
            checkSafe(buf_consumed, 1);
        }
        return nhb_buffer_serialize_glyphs(buffer, start, end, memAddress(buf), buf.remaining(), memAddressSafe(buf_consumed), font, format, flags);
    }

    // --- [ hb_buffer_serialize_unicode ] ---

    /** {@code unsigned int hb_buffer_serialize_unicode(hb_buffer_t * buffer, unsigned int start, unsigned int end, char * buf, unsigned int buf_size, unsigned int * buf_consumed, hb_buffer_serialize_format_t format, hb_buffer_serialize_flags_t flags)} */
    public static int nhb_buffer_serialize_unicode(long buffer, int start, int end, long buf, int buf_size, long buf_consumed, int format, int flags) {
        long __functionAddress = Functions.buffer_serialize_unicode;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPPI(buffer, start, end, buf, buf_size, buf_consumed, format, flags, __functionAddress);
    }

    /** {@code unsigned int hb_buffer_serialize_unicode(hb_buffer_t * buffer, unsigned int start, unsigned int end, char * buf, unsigned int buf_size, unsigned int * buf_consumed, hb_buffer_serialize_format_t format, hb_buffer_serialize_flags_t flags)} */
    @NativeType("unsigned int")
    public static int hb_buffer_serialize_unicode(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned int") int start, @NativeType("unsigned int") int end, @NativeType("char *") ByteBuffer buf, @NativeType("unsigned int *") @Nullable IntBuffer buf_consumed, @NativeType("hb_buffer_serialize_format_t") int format, @NativeType("hb_buffer_serialize_flags_t") int flags) {
        if (CHECKS) {
            checkSafe(buf_consumed, 1);
        }
        return nhb_buffer_serialize_unicode(buffer, start, end, memAddress(buf), buf.remaining(), memAddressSafe(buf_consumed), format, flags);
    }

    // --- [ hb_buffer_serialize ] ---

    /** {@code unsigned int hb_buffer_serialize(hb_buffer_t * buffer, unsigned int start, unsigned int end, char * buf, unsigned int buf_size, unsigned int * buf_consumed, hb_font_t * font, hb_buffer_serialize_format_t format, hb_buffer_serialize_flags_t flags)} */
    public static int nhb_buffer_serialize(long buffer, int start, int end, long buf, int buf_size, long buf_consumed, long font, int format, int flags) {
        long __functionAddress = Functions.buffer_serialize;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPPPI(buffer, start, end, buf, buf_size, buf_consumed, font, format, flags, __functionAddress);
    }

    /** {@code unsigned int hb_buffer_serialize(hb_buffer_t * buffer, unsigned int start, unsigned int end, char * buf, unsigned int buf_size, unsigned int * buf_consumed, hb_font_t * font, hb_buffer_serialize_format_t format, hb_buffer_serialize_flags_t flags)} */
    @NativeType("unsigned int")
    public static int hb_buffer_serialize(@NativeType("hb_buffer_t *") long buffer, @NativeType("unsigned int") int start, @NativeType("unsigned int") int end, @NativeType("char *") ByteBuffer buf, @NativeType("unsigned int *") @Nullable IntBuffer buf_consumed, @NativeType("hb_font_t *") long font, @NativeType("hb_buffer_serialize_format_t") int format, @NativeType("hb_buffer_serialize_flags_t") int flags) {
        if (CHECKS) {
            checkSafe(buf_consumed, 1);
        }
        return nhb_buffer_serialize(buffer, start, end, memAddress(buf), buf.remaining(), memAddressSafe(buf_consumed), font, format, flags);
    }

    // --- [ hb_buffer_deserialize_glyphs ] ---

    /** {@code hb_bool_t hb_buffer_deserialize_glyphs(hb_buffer_t * buffer, char const * buf, int buf_len, char const ** end_ptr, hb_font_t * font, hb_buffer_serialize_format_t format)} */
    public static int nhb_buffer_deserialize_glyphs(long buffer, long buf, int buf_len, long end_ptr, long font, int format) {
        long __functionAddress = Functions.buffer_deserialize_glyphs;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPPPI(buffer, buf, buf_len, end_ptr, font, format, __functionAddress);
    }

    /** {@code hb_bool_t hb_buffer_deserialize_glyphs(hb_buffer_t * buffer, char const * buf, int buf_len, char const ** end_ptr, hb_font_t * font, hb_buffer_serialize_format_t format)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_deserialize_glyphs(@NativeType("hb_buffer_t *") long buffer, @NativeType("char const *") ByteBuffer buf, @NativeType("char const **") @Nullable PointerBuffer end_ptr, @NativeType("hb_font_t *") long font, @NativeType("hb_buffer_serialize_format_t") int format) {
        if (CHECKS) {
            checkSafe(end_ptr, 1);
        }
        return nhb_buffer_deserialize_glyphs(buffer, memAddress(buf), buf.remaining(), memAddressSafe(end_ptr), font, format) != 0;
    }

    // --- [ hb_buffer_deserialize_unicode ] ---

    /** {@code hb_bool_t hb_buffer_deserialize_unicode(hb_buffer_t * buffer, char const * buf, int buf_len, char const ** end_ptr, hb_buffer_serialize_format_t format)} */
    public static int nhb_buffer_deserialize_unicode(long buffer, long buf, int buf_len, long end_ptr, int format) {
        long __functionAddress = Functions.buffer_deserialize_unicode;
        if (CHECKS) {
            check(buffer);
        }
        return invokePPPI(buffer, buf, buf_len, end_ptr, format, __functionAddress);
    }

    /** {@code hb_bool_t hb_buffer_deserialize_unicode(hb_buffer_t * buffer, char const * buf, int buf_len, char const ** end_ptr, hb_buffer_serialize_format_t format)} */
    @NativeType("hb_bool_t")
    public static boolean hb_buffer_deserialize_unicode(@NativeType("hb_buffer_t *") long buffer, @NativeType("char const *") ByteBuffer buf, @NativeType("char const **") @Nullable PointerBuffer end_ptr, @NativeType("hb_buffer_serialize_format_t") int format) {
        if (CHECKS) {
            checkSafe(end_ptr, 1);
        }
        return nhb_buffer_deserialize_unicode(buffer, memAddress(buf), buf.remaining(), memAddressSafe(end_ptr), format) != 0;
    }

    // --- [ hb_buffer_diff ] ---

    /** {@code hb_buffer_diff_flags_t hb_buffer_diff(hb_buffer_t * buffer, hb_buffer_t * reference, hb_codepoint_t dottedcircle_glyph, unsigned int position_fuzz)} */
    @NativeType("hb_buffer_diff_flags_t")
    public static int hb_buffer_diff(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_buffer_t *") long reference, @NativeType("hb_codepoint_t") int dottedcircle_glyph, @NativeType("unsigned int") int position_fuzz) {
        long __functionAddress = Functions.buffer_diff;
        if (CHECKS) {
            check(buffer);
            check(reference);
        }
        return invokePPI(buffer, reference, dottedcircle_glyph, position_fuzz, __functionAddress);
    }

    // --- [ hb_buffer_set_message_func ] ---

    /** {@code void hb_buffer_set_message_func(hb_buffer_t * buffer, hb_buffer_message_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_buffer_set_message_func(long buffer, long func, long user_data, long destroy) {
        long __functionAddress = Functions.buffer_set_message_func;
        if (CHECKS) {
            check(buffer);
        }
        invokePPPPV(buffer, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_buffer_set_message_func(hb_buffer_t * buffer, hb_buffer_message_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_buffer_set_message_func(@NativeType("hb_buffer_t *") long buffer, @NativeType("hb_buffer_message_func_t") hb_buffer_message_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_buffer_set_message_func(buffer, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_draw_funcs_set_move_to_func ] ---

    /** {@code void hb_draw_funcs_set_move_to_func(hb_draw_funcs_t * dfuncs, hb_draw_move_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_draw_funcs_set_move_to_func(long dfuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.draw_funcs_set_move_to_func;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPPV(dfuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_draw_funcs_set_move_to_func(hb_draw_funcs_t * dfuncs, hb_draw_move_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_draw_funcs_set_move_to_func(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("hb_draw_move_to_func_t") hb_draw_move_to_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_draw_funcs_set_move_to_func(dfuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_draw_funcs_set_line_to_func ] ---

    /** {@code void hb_draw_funcs_set_line_to_func(hb_draw_funcs_t * dfuncs, hb_draw_line_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_draw_funcs_set_line_to_func(long dfuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.draw_funcs_set_line_to_func;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPPV(dfuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_draw_funcs_set_line_to_func(hb_draw_funcs_t * dfuncs, hb_draw_line_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_draw_funcs_set_line_to_func(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("hb_draw_line_to_func_t") hb_draw_line_to_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_draw_funcs_set_line_to_func(dfuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_draw_funcs_set_quadratic_to_func ] ---

    /** {@code void hb_draw_funcs_set_quadratic_to_func(hb_draw_funcs_t * dfuncs, hb_draw_quadratic_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_draw_funcs_set_quadratic_to_func(long dfuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.draw_funcs_set_quadratic_to_func;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPPV(dfuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_draw_funcs_set_quadratic_to_func(hb_draw_funcs_t * dfuncs, hb_draw_quadratic_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_draw_funcs_set_quadratic_to_func(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("hb_draw_quadratic_to_func_t") hb_draw_quadratic_to_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_draw_funcs_set_quadratic_to_func(dfuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_draw_funcs_set_cubic_to_func ] ---

    /** {@code void hb_draw_funcs_set_cubic_to_func(hb_draw_funcs_t * dfuncs, hb_draw_cubic_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_draw_funcs_set_cubic_to_func(long dfuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.draw_funcs_set_cubic_to_func;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPPV(dfuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_draw_funcs_set_cubic_to_func(hb_draw_funcs_t * dfuncs, hb_draw_cubic_to_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_draw_funcs_set_cubic_to_func(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("hb_draw_cubic_to_func_t") hb_draw_cubic_to_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_draw_funcs_set_cubic_to_func(dfuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_draw_funcs_set_close_path_func ] ---

    /** {@code void hb_draw_funcs_set_close_path_func(hb_draw_funcs_t * dfuncs, hb_draw_close_path_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_draw_funcs_set_close_path_func(long dfuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.draw_funcs_set_close_path_func;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPPV(dfuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_draw_funcs_set_close_path_func(hb_draw_funcs_t * dfuncs, hb_draw_close_path_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_draw_funcs_set_close_path_func(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("hb_draw_close_path_func_t") hb_draw_close_path_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_draw_funcs_set_close_path_func(dfuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_draw_funcs_create ] ---

    /** {@code hb_draw_funcs_t * hb_draw_funcs_create(void)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_draw_funcs_create() {
        long __functionAddress = Functions.draw_funcs_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_draw_funcs_get_empty ] ---

    /** {@code hb_draw_funcs_t * hb_draw_funcs_get_empty(void)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_draw_funcs_get_empty() {
        long __functionAddress = Functions.draw_funcs_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_draw_funcs_reference ] ---

    /** {@code hb_draw_funcs_t * hb_draw_funcs_reference(hb_draw_funcs_t * dfuncs)} */
    @NativeType("hb_draw_funcs_t *")
    public static long hb_draw_funcs_reference(@NativeType("hb_draw_funcs_t *") long dfuncs) {
        long __functionAddress = Functions.draw_funcs_reference;
        if (CHECKS) {
            check(dfuncs);
        }
        return invokePP(dfuncs, __functionAddress);
    }

    // --- [ hb_draw_funcs_destroy ] ---

    /** {@code void hb_draw_funcs_destroy(hb_draw_funcs_t * dfuncs)} */
    public static void hb_draw_funcs_destroy(@NativeType("hb_draw_funcs_t *") long dfuncs) {
        long __functionAddress = Functions.draw_funcs_destroy;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePV(dfuncs, __functionAddress);
    }

    // --- [ hb_draw_funcs_set_user_data ] ---

    /** {@code hb_bool_t hb_draw_funcs_set_user_data(hb_draw_funcs_t * dfuncs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_draw_funcs_set_user_data(long dfuncs, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.draw_funcs_set_user_data;
        if (CHECKS) {
            check(dfuncs);
        }
        return invokePPPPI(dfuncs, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_draw_funcs_set_user_data(hb_draw_funcs_t * dfuncs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_draw_funcs_set_user_data(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_draw_funcs_set_user_data(dfuncs, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_draw_funcs_get_user_data ] ---

    /** {@code void * hb_draw_funcs_get_user_data(hb_draw_funcs_t const * dfuncs, hb_user_data_key_t * key)} */
    public static long nhb_draw_funcs_get_user_data(long dfuncs, long key) {
        long __functionAddress = Functions.draw_funcs_get_user_data;
        if (CHECKS) {
            check(dfuncs);
        }
        return invokePPP(dfuncs, key, __functionAddress);
    }

    /** {@code void * hb_draw_funcs_get_user_data(hb_draw_funcs_t const * dfuncs, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_draw_funcs_get_user_data(@NativeType("hb_draw_funcs_t const *") long dfuncs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_draw_funcs_get_user_data(dfuncs, key.address());
    }

    // --- [ hb_draw_funcs_make_immutable ] ---

    /** {@code void hb_draw_funcs_make_immutable(hb_draw_funcs_t * dfuncs)} */
    public static void hb_draw_funcs_make_immutable(@NativeType("hb_draw_funcs_t *") long dfuncs) {
        long __functionAddress = Functions.draw_funcs_make_immutable;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePV(dfuncs, __functionAddress);
    }

    // --- [ hb_draw_funcs_is_immutable ] ---

    /** {@code hb_bool_t hb_draw_funcs_is_immutable(hb_draw_funcs_t * dfuncs)} */
    @NativeType("hb_bool_t")
    public static boolean hb_draw_funcs_is_immutable(@NativeType("hb_draw_funcs_t *") long dfuncs) {
        long __functionAddress = Functions.draw_funcs_is_immutable;
        if (CHECKS) {
            check(dfuncs);
        }
        return invokePI(dfuncs, __functionAddress) != 0;
    }

    // --- [ hb_draw_move_to ] ---

    /** {@code void hb_draw_move_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float to_x, float to_y)} */
    public static void nhb_draw_move_to(long dfuncs, long draw_data, long st, float to_x, float to_y) {
        long __functionAddress = Functions.draw_move_to;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPV(dfuncs, draw_data, st, to_x, to_y, __functionAddress);
    }

    /** {@code void hb_draw_move_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float to_x, float to_y)} */
    public static void hb_draw_move_to(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") ByteBuffer draw_data, @NativeType("hb_draw_state_t *") hb_draw_state_t st, float to_x, float to_y) {
        nhb_draw_move_to(dfuncs, memAddress(draw_data), st.address(), to_x, to_y);
    }

    // --- [ hb_draw_line_to ] ---

    /** {@code void hb_draw_line_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float to_x, float to_y)} */
    public static void nhb_draw_line_to(long dfuncs, long draw_data, long st, float to_x, float to_y) {
        long __functionAddress = Functions.draw_line_to;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPV(dfuncs, draw_data, st, to_x, to_y, __functionAddress);
    }

    /** {@code void hb_draw_line_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float to_x, float to_y)} */
    public static void hb_draw_line_to(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") ByteBuffer draw_data, @NativeType("hb_draw_state_t *") hb_draw_state_t st, float to_x, float to_y) {
        nhb_draw_line_to(dfuncs, memAddress(draw_data), st.address(), to_x, to_y);
    }

    // --- [ hb_draw_quadratic_to ] ---

    /** {@code void hb_draw_quadratic_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float control_x, float control_y, float to_x, float to_y)} */
    public static void nhb_draw_quadratic_to(long dfuncs, long draw_data, long st, float control_x, float control_y, float to_x, float to_y) {
        long __functionAddress = Functions.draw_quadratic_to;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPV(dfuncs, draw_data, st, control_x, control_y, to_x, to_y, __functionAddress);
    }

    /** {@code void hb_draw_quadratic_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float control_x, float control_y, float to_x, float to_y)} */
    public static void hb_draw_quadratic_to(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") ByteBuffer draw_data, @NativeType("hb_draw_state_t *") hb_draw_state_t st, float control_x, float control_y, float to_x, float to_y) {
        nhb_draw_quadratic_to(dfuncs, memAddress(draw_data), st.address(), control_x, control_y, to_x, to_y);
    }

    // --- [ hb_draw_cubic_to ] ---

    /** {@code void hb_draw_cubic_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y)} */
    public static void nhb_draw_cubic_to(long dfuncs, long draw_data, long st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y) {
        long __functionAddress = Functions.draw_cubic_to;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPV(dfuncs, draw_data, st, control1_x, control1_y, control2_x, control2_y, to_x, to_y, __functionAddress);
    }

    /** {@code void hb_draw_cubic_to(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y)} */
    public static void hb_draw_cubic_to(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") ByteBuffer draw_data, @NativeType("hb_draw_state_t *") hb_draw_state_t st, float control1_x, float control1_y, float control2_x, float control2_y, float to_x, float to_y) {
        nhb_draw_cubic_to(dfuncs, memAddress(draw_data), st.address(), control1_x, control1_y, control2_x, control2_y, to_x, to_y);
    }

    // --- [ hb_draw_close_path ] ---

    /** {@code void hb_draw_close_path(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st)} */
    public static void nhb_draw_close_path(long dfuncs, long draw_data, long st) {
        long __functionAddress = Functions.draw_close_path;
        if (CHECKS) {
            check(dfuncs);
        }
        invokePPPV(dfuncs, draw_data, st, __functionAddress);
    }

    /** {@code void hb_draw_close_path(hb_draw_funcs_t * dfuncs, void * draw_data, hb_draw_state_t * st)} */
    public static void hb_draw_close_path(@NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") ByteBuffer draw_data, @NativeType("hb_draw_state_t *") hb_draw_state_t st) {
        nhb_draw_close_path(dfuncs, memAddress(draw_data), st.address());
    }

    // --- [ hb_face_count ] ---

    /** {@code unsigned int hb_face_count(hb_blob_t * blob)} */
    @NativeType("unsigned int")
    public static int hb_face_count(@NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.face_count;
        if (CHECKS) {
            check(blob);
        }
        return invokePI(blob, __functionAddress);
    }

    // --- [ hb_face_create ] ---

    /** {@code hb_face_t * hb_face_create(hb_blob_t * blob, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create(@NativeType("hb_blob_t *") long blob, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.face_create;
        if (CHECKS) {
            check(blob);
        }
        return invokePP(blob, index, __functionAddress);
    }

    // --- [ hb_face_create_or_fail ] ---

    /** {@code hb_face_t * hb_face_create_or_fail(hb_blob_t * blob, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_or_fail(@NativeType("hb_blob_t *") long blob, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.face_create_or_fail;
        if (CHECKS) {
            check(blob);
        }
        return invokePP(blob, index, __functionAddress);
    }

    // --- [ hb_face_create_or_fail_using ] ---

    /** {@code hb_face_t * hb_face_create_or_fail_using(hb_blob_t * blob, unsigned int index, char const * loader_name)} */
    public static long nhb_face_create_or_fail_using(long blob, int index, long loader_name) {
        long __functionAddress = Functions.face_create_or_fail_using;
        if (CHECKS) {
            check(blob);
        }
        return invokePPP(blob, index, loader_name, __functionAddress);
    }

    /** {@code hb_face_t * hb_face_create_or_fail_using(hb_blob_t * blob, unsigned int index, char const * loader_name)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_or_fail_using(@NativeType("hb_blob_t *") long blob, @NativeType("unsigned int") int index, @NativeType("char const *") @Nullable ByteBuffer loader_name) {
        if (CHECKS) {
            checkNT1Safe(loader_name);
        }
        return nhb_face_create_or_fail_using(blob, index, memAddressSafe(loader_name));
    }

    /** {@code hb_face_t * hb_face_create_or_fail_using(hb_blob_t * blob, unsigned int index, char const * loader_name)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_or_fail_using(@NativeType("hb_blob_t *") long blob, @NativeType("unsigned int") int index, @NativeType("char const *") @Nullable CharSequence loader_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(loader_name, true);
            long loader_nameEncoded = loader_name == null ? NULL : stack.getPointerAddress();
            return nhb_face_create_or_fail_using(blob, index, loader_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_face_create_from_file_or_fail ] ---

    /** {@code hb_face_t * hb_face_create_from_file_or_fail(char const * file_name, unsigned int index)} */
    public static long nhb_face_create_from_file_or_fail(long file_name, int index) {
        long __functionAddress = Functions.face_create_from_file_or_fail;
        return invokePP(file_name, index, __functionAddress);
    }

    /** {@code hb_face_t * hb_face_create_from_file_or_fail(char const * file_name, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_from_file_or_fail(@NativeType("char const *") ByteBuffer file_name, @NativeType("unsigned int") int index) {
        if (CHECKS) {
            checkNT1(file_name);
        }
        return nhb_face_create_from_file_or_fail(memAddress(file_name), index);
    }

    /** {@code hb_face_t * hb_face_create_from_file_or_fail(char const * file_name, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_from_file_or_fail(@NativeType("char const *") CharSequence file_name, @NativeType("unsigned int") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            return nhb_face_create_from_file_or_fail(file_nameEncoded, index);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_face_create_from_file_or_fail_using ] ---

    /** {@code hb_face_t * hb_face_create_from_file_or_fail_using(char const * file_name, unsigned int index, char const * loader_name)} */
    public static long nhb_face_create_from_file_or_fail_using(long file_name, int index, long loader_name) {
        long __functionAddress = Functions.face_create_from_file_or_fail_using;
        return invokePPP(file_name, index, loader_name, __functionAddress);
    }

    /** {@code hb_face_t * hb_face_create_from_file_or_fail_using(char const * file_name, unsigned int index, char const * loader_name)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_from_file_or_fail_using(@NativeType("char const *") ByteBuffer file_name, @NativeType("unsigned int") int index, @NativeType("char const *") @Nullable ByteBuffer loader_name) {
        if (CHECKS) {
            checkNT1(file_name);
            checkNT1Safe(loader_name);
        }
        return nhb_face_create_from_file_or_fail_using(memAddress(file_name), index, memAddressSafe(loader_name));
    }

    /** {@code hb_face_t * hb_face_create_from_file_or_fail_using(char const * file_name, unsigned int index, char const * loader_name)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_from_file_or_fail_using(@NativeType("char const *") CharSequence file_name, @NativeType("unsigned int") int index, @NativeType("char const *") @Nullable CharSequence loader_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(loader_name, true);
            long loader_nameEncoded = loader_name == null ? NULL : stack.getPointerAddress();
            return nhb_face_create_from_file_or_fail_using(file_nameEncoded, index, loader_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_face_list_loaders ] ---

    /** {@code char const ** hb_face_list_loaders(void)} */
    public static long nhb_face_list_loaders() {
        long __functionAddress = Functions.face_list_loaders;
        return invokeP(__functionAddress);
    }

    /** {@code char const ** hb_face_list_loaders(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_face_list_loaders() {
        long __result = nhb_face_list_loaders();
        return memPointerBufferSafe(__result, face_list_loaders_COUNT);
    }

    /** {@code char const ** hb_face_list_loaders(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_face_list_loaders(long length) {
        long __result = nhb_face_list_loaders();
        return memPointerBufferSafe(__result, (int)length);
    }

    // --- [ hb_face_create_for_tables ] ---

    /** {@code hb_face_t * hb_face_create_for_tables(hb_reference_table_func_t reference_table_func, void * user_data, hb_destroy_func_t destroy)} */
    public static long nhb_face_create_for_tables(long reference_table_func, long user_data, long destroy) {
        long __functionAddress = Functions.face_create_for_tables;
        return invokePPPP(reference_table_func, user_data, destroy, __functionAddress);
    }

    /** {@code hb_face_t * hb_face_create_for_tables(hb_reference_table_func_t reference_table_func, void * user_data, hb_destroy_func_t destroy)} */
    @NativeType("hb_face_t *")
    public static long hb_face_create_for_tables(@NativeType("hb_reference_table_func_t") hb_reference_table_func_tI reference_table_func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        return nhb_face_create_for_tables(reference_table_func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_face_get_empty ] ---

    /** {@code hb_face_t * hb_face_get_empty(void)} */
    @NativeType("hb_face_t *")
    public static long hb_face_get_empty() {
        long __functionAddress = Functions.face_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_face_reference ] ---

    /** {@code hb_face_t * hb_face_reference(hb_face_t * face)} */
    @NativeType("hb_face_t *")
    public static long hb_face_reference(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.face_reference;
        if (CHECKS) {
            check(face);
        }
        return invokePP(face, __functionAddress);
    }

    // --- [ hb_face_destroy ] ---

    /** {@code void hb_face_destroy(hb_face_t * face)} */
    public static void hb_face_destroy(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.face_destroy;
        if (CHECKS) {
            check(face);
        }
        invokePV(face, __functionAddress);
    }

    // --- [ hb_face_set_user_data ] ---

    /** {@code hb_bool_t hb_face_set_user_data(hb_face_t * face, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_face_set_user_data(long face, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.face_set_user_data;
        if (CHECKS) {
            check(face);
        }
        return invokePPPPI(face, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_face_set_user_data(hb_face_t * face, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_face_set_user_data(@NativeType("hb_face_t *") long face, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_face_set_user_data(face, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_face_get_user_data ] ---

    /** {@code void * hb_face_get_user_data(hb_face_t const * face, hb_user_data_key_t * key)} */
    public static long nhb_face_get_user_data(long face, long key) {
        long __functionAddress = Functions.face_get_user_data;
        if (CHECKS) {
            check(face);
        }
        return invokePPP(face, key, __functionAddress);
    }

    /** {@code void * hb_face_get_user_data(hb_face_t const * face, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_face_get_user_data(@NativeType("hb_face_t const *") long face, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_face_get_user_data(face, key.address());
    }

    // --- [ hb_face_make_immutable ] ---

    /** {@code void hb_face_make_immutable(hb_face_t * face)} */
    public static void hb_face_make_immutable(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.face_make_immutable;
        if (CHECKS) {
            check(face);
        }
        invokePV(face, __functionAddress);
    }

    // --- [ hb_face_is_immutable ] ---

    /** {@code hb_bool_t hb_face_is_immutable(hb_face_t * face)} */
    @NativeType("hb_bool_t")
    public static boolean hb_face_is_immutable(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.face_is_immutable;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress) != 0;
    }

    // --- [ hb_face_reference_table ] ---

    /** {@code hb_blob_t * hb_face_reference_table(hb_face_t const * face, hb_tag_t tag)} */
    @NativeType("hb_blob_t *")
    public static long hb_face_reference_table(@NativeType("hb_face_t const *") long face, @NativeType("hb_tag_t") int tag) {
        long __functionAddress = Functions.face_reference_table;
        if (CHECKS) {
            check(face);
        }
        return invokePP(face, tag, __functionAddress);
    }

    // --- [ hb_face_reference_blob ] ---

    /** {@code hb_blob_t * hb_face_reference_blob(hb_face_t * face)} */
    @NativeType("hb_blob_t *")
    public static long hb_face_reference_blob(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.face_reference_blob;
        if (CHECKS) {
            check(face);
        }
        return invokePP(face, __functionAddress);
    }

    // --- [ hb_face_set_index ] ---

    /** {@code void hb_face_set_index(hb_face_t * face, unsigned int index)} */
    public static void hb_face_set_index(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.face_set_index;
        if (CHECKS) {
            check(face);
        }
        invokePV(face, index, __functionAddress);
    }

    // --- [ hb_face_get_index ] ---

    /** {@code unsigned int hb_face_get_index(hb_face_t const * face)} */
    @NativeType("unsigned int")
    public static int hb_face_get_index(@NativeType("hb_face_t const *") long face) {
        long __functionAddress = Functions.face_get_index;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress);
    }

    // --- [ hb_face_set_upem ] ---

    /** {@code void hb_face_set_upem(hb_face_t * face, unsigned int upem)} */
    public static void hb_face_set_upem(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int upem) {
        long __functionAddress = Functions.face_set_upem;
        if (CHECKS) {
            check(face);
        }
        invokePV(face, upem, __functionAddress);
    }

    // --- [ hb_face_get_upem ] ---

    /** {@code unsigned int hb_face_get_upem(hb_face_t const * face)} */
    @NativeType("unsigned int")
    public static int hb_face_get_upem(@NativeType("hb_face_t const *") long face) {
        long __functionAddress = Functions.face_get_upem;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress);
    }

    // --- [ hb_face_set_glyph_count ] ---

    /** {@code void hb_face_set_glyph_count(hb_face_t * face, unsigned int glyph_count)} */
    public static void hb_face_set_glyph_count(@NativeType("hb_face_t *") long face, @NativeType("unsigned int") int glyph_count) {
        long __functionAddress = Functions.face_set_glyph_count;
        if (CHECKS) {
            check(face);
        }
        invokePV(face, glyph_count, __functionAddress);
    }

    // --- [ hb_face_get_glyph_count ] ---

    /** {@code unsigned int hb_face_get_glyph_count(hb_face_t const * face)} */
    @NativeType("unsigned int")
    public static int hb_face_get_glyph_count(@NativeType("hb_face_t const *") long face) {
        long __functionAddress = Functions.face_get_glyph_count;
        if (CHECKS) {
            check(face);
        }
        return invokePI(face, __functionAddress);
    }

    // --- [ hb_face_set_get_table_tags_func ] ---

    /** {@code void hb_face_set_get_table_tags_func(hb_face_t * face, hb_get_table_tags_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_face_set_get_table_tags_func(long face, long func, long user_data, long destroy) {
        long __functionAddress = Functions.face_set_get_table_tags_func;
        if (CHECKS) {
            check(face);
        }
        invokePPPPV(face, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_face_set_get_table_tags_func(hb_face_t * face, hb_get_table_tags_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_face_set_get_table_tags_func(@NativeType("hb_face_t *") long face, @NativeType("hb_get_table_tags_func_t") hb_get_table_tags_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_face_set_get_table_tags_func(face, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_face_get_table_tags ] ---

    /** {@code unsigned int hb_face_get_table_tags(hb_face_t const * face, unsigned int start_offset, unsigned int * table_count, hb_tag_t * table_tags)} */
    public static int nhb_face_get_table_tags(long face, int start_offset, long table_count, long table_tags) {
        long __functionAddress = Functions.face_get_table_tags;
        if (CHECKS) {
            check(face);
        }
        return invokePPPI(face, start_offset, table_count, table_tags, __functionAddress);
    }

    /** {@code unsigned int hb_face_get_table_tags(hb_face_t const * face, unsigned int start_offset, unsigned int * table_count, hb_tag_t * table_tags)} */
    @NativeType("unsigned int")
    public static int hb_face_get_table_tags(@NativeType("hb_face_t const *") long face, @NativeType("unsigned int") int start_offset, @NativeType("unsigned int *") IntBuffer table_count, @NativeType("hb_tag_t *") IntBuffer table_tags) {
        if (CHECKS) {
            check(table_count, 1);
            check(table_tags, table_count.get(table_count.position()));
        }
        return nhb_face_get_table_tags(face, start_offset, memAddress(table_count), memAddress(table_tags));
    }

    // --- [ hb_face_collect_unicodes ] ---

    /** {@code void hb_face_collect_unicodes(hb_face_t * face, hb_set_t * out)} */
    public static void hb_face_collect_unicodes(@NativeType("hb_face_t *") long face, @NativeType("hb_set_t *") long out) {
        long __functionAddress = Functions.face_collect_unicodes;
        if (CHECKS) {
            check(face);
            check(out);
        }
        invokePPV(face, out, __functionAddress);
    }

    // --- [ hb_face_collect_nominal_glyph_mapping ] ---

    /** {@code void hb_face_collect_nominal_glyph_mapping(hb_face_t * face, hb_map_t * mapping, hb_set_t * unicodes)} */
    public static void hb_face_collect_nominal_glyph_mapping(@NativeType("hb_face_t *") long face, @NativeType("hb_map_t *") long mapping, @NativeType("hb_set_t *") long unicodes) {
        long __functionAddress = Functions.face_collect_nominal_glyph_mapping;
        if (CHECKS) {
            check(face);
            check(mapping);
        }
        invokePPPV(face, mapping, unicodes, __functionAddress);
    }

    // --- [ hb_face_collect_variation_selectors ] ---

    /** {@code void hb_face_collect_variation_selectors(hb_face_t * face, hb_set_t * out)} */
    public static void hb_face_collect_variation_selectors(@NativeType("hb_face_t *") long face, @NativeType("hb_set_t *") long out) {
        long __functionAddress = Functions.face_collect_variation_selectors;
        if (CHECKS) {
            check(face);
            check(out);
        }
        invokePPV(face, out, __functionAddress);
    }

    // --- [ hb_face_collect_variation_unicodes ] ---

    /** {@code void hb_face_collect_variation_unicodes(hb_face_t * face, hb_codepoint_t variation_selector, hb_set_t * out)} */
    public static void hb_face_collect_variation_unicodes(@NativeType("hb_face_t *") long face, @NativeType("hb_codepoint_t") int variation_selector, @NativeType("hb_set_t *") long out) {
        long __functionAddress = Functions.face_collect_variation_unicodes;
        if (CHECKS) {
            check(face);
            check(out);
        }
        invokePPV(face, variation_selector, out, __functionAddress);
    }

    // --- [ hb_face_builder_create ] ---

    /** {@code hb_face_t * hb_face_builder_create(void)} */
    @NativeType("hb_face_t *")
    public static long hb_face_builder_create() {
        long __functionAddress = Functions.face_builder_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_face_builder_add_table ] ---

    /** {@code hb_bool_t hb_face_builder_add_table(hb_face_t * face, hb_tag_t tag, hb_blob_t * blob)} */
    @NativeType("hb_bool_t")
    public static boolean hb_face_builder_add_table(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t") int tag, @NativeType("hb_blob_t *") long blob) {
        long __functionAddress = Functions.face_builder_add_table;
        if (CHECKS) {
            check(face);
            check(blob);
        }
        return invokePPI(face, tag, blob, __functionAddress) != 0;
    }

    // --- [ hb_face_builder_sort_tables ] ---

    /** {@code void hb_face_builder_sort_tables(hb_face_t * face, hb_tag_t const * tags)} */
    public static void nhb_face_builder_sort_tables(long face, long tags) {
        long __functionAddress = Functions.face_builder_sort_tables;
        if (CHECKS) {
            check(face);
        }
        invokePPV(face, tags, __functionAddress);
    }

    /** {@code void hb_face_builder_sort_tables(hb_face_t * face, hb_tag_t const * tags)} */
    public static void hb_face_builder_sort_tables(@NativeType("hb_face_t *") long face, @NativeType("hb_tag_t const *") IntBuffer tags) {
        if (CHECKS) {
            checkNT(tags);
        }
        nhb_face_builder_sort_tables(face, memAddress(tags));
    }

    // --- [ hb_font_funcs_create ] ---

    /** {@code hb_font_funcs_t * hb_font_funcs_create(void)} */
    @NativeType("hb_font_funcs_t *")
    public static long hb_font_funcs_create() {
        long __functionAddress = Functions.font_funcs_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_font_funcs_get_empty ] ---

    /** {@code hb_font_funcs_t * hb_font_funcs_get_empty(void)} */
    @NativeType("hb_font_funcs_t *")
    public static long hb_font_funcs_get_empty() {
        long __functionAddress = Functions.font_funcs_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_font_funcs_reference ] ---

    /** {@code hb_font_funcs_t * hb_font_funcs_reference(hb_font_funcs_t * ffuncs)} */
    @NativeType("hb_font_funcs_t *")
    public static long hb_font_funcs_reference(@NativeType("hb_font_funcs_t *") long ffuncs) {
        long __functionAddress = Functions.font_funcs_reference;
        if (CHECKS) {
            check(ffuncs);
        }
        return invokePP(ffuncs, __functionAddress);
    }

    // --- [ hb_font_funcs_destroy ] ---

    /** {@code void hb_font_funcs_destroy(hb_font_funcs_t * ffuncs)} */
    public static void hb_font_funcs_destroy(@NativeType("hb_font_funcs_t *") long ffuncs) {
        long __functionAddress = Functions.font_funcs_destroy;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePV(ffuncs, __functionAddress);
    }

    // --- [ hb_font_funcs_set_user_data ] ---

    /** {@code hb_bool_t hb_font_funcs_set_user_data(hb_font_funcs_t * ffuncs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_font_funcs_set_user_data(long ffuncs, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.font_funcs_set_user_data;
        if (CHECKS) {
            check(ffuncs);
        }
        return invokePPPPI(ffuncs, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_funcs_set_user_data(hb_font_funcs_t * ffuncs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_funcs_set_user_data(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_font_funcs_set_user_data(ffuncs, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_font_funcs_get_user_data ] ---

    /** {@code void * hb_font_funcs_get_user_data(hb_font_funcs_t const * ffuncs, hb_user_data_key_t * key)} */
    public static long nhb_font_funcs_get_user_data(long ffuncs, long key) {
        long __functionAddress = Functions.font_funcs_get_user_data;
        if (CHECKS) {
            check(ffuncs);
        }
        return invokePPP(ffuncs, key, __functionAddress);
    }

    /** {@code void * hb_font_funcs_get_user_data(hb_font_funcs_t const * ffuncs, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_font_funcs_get_user_data(@NativeType("hb_font_funcs_t const *") long ffuncs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_font_funcs_get_user_data(ffuncs, key.address());
    }

    // --- [ hb_font_funcs_make_immutable ] ---

    /** {@code void hb_font_funcs_make_immutable(hb_font_funcs_t * ffuncs)} */
    public static void hb_font_funcs_make_immutable(@NativeType("hb_font_funcs_t *") long ffuncs) {
        long __functionAddress = Functions.font_funcs_make_immutable;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePV(ffuncs, __functionAddress);
    }

    // --- [ hb_font_funcs_is_immutable ] ---

    /** {@code hb_bool_t hb_font_funcs_is_immutable(hb_font_funcs_t * ffuncs)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_funcs_is_immutable(@NativeType("hb_font_funcs_t *") long ffuncs) {
        long __functionAddress = Functions.font_funcs_is_immutable;
        if (CHECKS) {
            check(ffuncs);
        }
        return invokePI(ffuncs, __functionAddress) != 0;
    }

    // --- [ hb_font_funcs_set_font_h_extents_func ] ---

    /** {@code void hb_font_funcs_set_font_h_extents_func(hb_font_funcs_t * ffuncs, hb_font_get_font_h_extents_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_font_h_extents_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_font_h_extents_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_font_h_extents_func(hb_font_funcs_t * ffuncs, hb_font_get_font_h_extents_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_font_h_extents_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_font_h_extents_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_font_h_extents_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_font_v_extents_func ] ---

    /** {@code void hb_font_funcs_set_font_v_extents_func(hb_font_funcs_t * ffuncs, hb_font_get_font_v_extents_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_font_v_extents_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_font_v_extents_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_font_v_extents_func(hb_font_funcs_t * ffuncs, hb_font_get_font_v_extents_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_font_v_extents_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_font_v_extents_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_font_v_extents_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_nominal_glyph_func ] ---

    /** {@code void hb_font_funcs_set_nominal_glyph_func(hb_font_funcs_t * ffuncs, hb_font_get_nominal_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_nominal_glyph_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_nominal_glyph_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_nominal_glyph_func(hb_font_funcs_t * ffuncs, hb_font_get_nominal_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_nominal_glyph_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_nominal_glyph_func_t") hb_font_get_nominal_glyph_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_nominal_glyph_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_nominal_glyphs_func ] ---

    /** {@code void hb_font_funcs_set_nominal_glyphs_func(hb_font_funcs_t * ffuncs, hb_font_get_nominal_glyphs_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_nominal_glyphs_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_nominal_glyphs_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_nominal_glyphs_func(hb_font_funcs_t * ffuncs, hb_font_get_nominal_glyphs_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_nominal_glyphs_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_nominal_glyphs_func_t") hb_font_get_nominal_glyphs_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_nominal_glyphs_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_variation_glyph_func ] ---

    /** {@code void hb_font_funcs_set_variation_glyph_func(hb_font_funcs_t * ffuncs, hb_font_get_variation_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_variation_glyph_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_variation_glyph_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_variation_glyph_func(hb_font_funcs_t * ffuncs, hb_font_get_variation_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_variation_glyph_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_variation_glyph_func_t") hb_font_get_variation_glyph_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_variation_glyph_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_h_advance_func ] ---

    /** {@code void hb_font_funcs_set_glyph_h_advance_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_advance_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_h_advance_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_h_advance_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_h_advance_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_advance_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_h_advance_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_h_advance_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_h_advance_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_v_advance_func ] ---

    /** {@code void hb_font_funcs_set_glyph_v_advance_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_advance_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_v_advance_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_v_advance_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_v_advance_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_advance_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_v_advance_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_v_advance_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_v_advance_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_h_advances_func ] ---

    /** {@code void hb_font_funcs_set_glyph_h_advances_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_advances_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_h_advances_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_h_advances_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_h_advances_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_advances_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_h_advances_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_h_advances_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_h_advances_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_v_advances_func ] ---

    /** {@code void hb_font_funcs_set_glyph_v_advances_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_advances_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_v_advances_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_v_advances_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_v_advances_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_advances_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_v_advances_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_v_advances_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_v_advances_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_h_origin_func ] ---

    /** {@code void hb_font_funcs_set_glyph_h_origin_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_origin_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_h_origin_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_h_origin_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_h_origin_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_origin_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_h_origin_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_h_origin_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_h_origin_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_v_origin_func ] ---

    /** {@code void hb_font_funcs_set_glyph_v_origin_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_origin_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_v_origin_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_v_origin_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_v_origin_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_origin_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_v_origin_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_v_origin_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_v_origin_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_h_origins_func ] ---

    /** {@code void hb_font_funcs_set_glyph_h_origins_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_origins_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_h_origins_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_h_origins_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_h_origins_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_origins_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_h_origins_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_h_origins_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_h_origins_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_v_origins_func ] ---

    /** {@code void hb_font_funcs_set_glyph_v_origins_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_origins_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_v_origins_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_v_origins_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_v_origins_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_v_origins_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_v_origins_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_v_origins_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_v_origins_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_h_kerning_func ] ---

    /** {@code void hb_font_funcs_set_glyph_h_kerning_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_kerning_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_h_kerning_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_h_kerning_func;
        if (CHECKS) {
            check(ffuncs);
            check(func);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_h_kerning_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_h_kerning_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_h_kerning_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_h_kerning_func_t") long func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_h_kerning_func(ffuncs, func, user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_extents_func ] ---

    /** {@code void hb_font_funcs_set_glyph_extents_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_extents_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_extents_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_extents_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_extents_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_extents_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_extents_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_extents_func_t") hb_font_get_glyph_extents_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_extents_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_contour_point_func ] ---

    /** {@code void hb_font_funcs_set_glyph_contour_point_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_contour_point_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_contour_point_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_contour_point_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_contour_point_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_contour_point_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_contour_point_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_contour_point_func_t") hb_font_get_glyph_contour_point_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_contour_point_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_name_func ] ---

    /** {@code void hb_font_funcs_set_glyph_name_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_name_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_name_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_name_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_name_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_name_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_name_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_name_func_t") hb_font_get_glyph_name_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_name_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_glyph_from_name_func ] ---

    /** {@code void hb_font_funcs_set_glyph_from_name_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_from_name_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_glyph_from_name_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_glyph_from_name_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_glyph_from_name_func(hb_font_funcs_t * ffuncs, hb_font_get_glyph_from_name_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_glyph_from_name_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_get_glyph_from_name_func_t") hb_font_get_glyph_from_name_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_glyph_from_name_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_draw_glyph_func ] ---

    /** {@code void hb_font_funcs_set_draw_glyph_func(hb_font_funcs_t * ffuncs, hb_font_draw_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_draw_glyph_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_draw_glyph_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_draw_glyph_func(hb_font_funcs_t * ffuncs, hb_font_draw_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_draw_glyph_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_draw_glyph_func_t") hb_font_draw_glyph_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_draw_glyph_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_draw_glyph_or_fail_func ] ---

    /** {@code void hb_font_funcs_set_draw_glyph_or_fail_func(hb_font_funcs_t * ffuncs, hb_font_draw_glyph_or_fail_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_draw_glyph_or_fail_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_draw_glyph_or_fail_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_draw_glyph_or_fail_func(hb_font_funcs_t * ffuncs, hb_font_draw_glyph_or_fail_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_draw_glyph_or_fail_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_draw_glyph_or_fail_func_t") hb_font_draw_glyph_or_fail_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_draw_glyph_or_fail_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_paint_glyph_func ] ---

    /** {@code void hb_font_funcs_set_paint_glyph_func(hb_font_funcs_t * ffuncs, hb_font_paint_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_paint_glyph_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_paint_glyph_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_paint_glyph_func(hb_font_funcs_t * ffuncs, hb_font_paint_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_paint_glyph_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_paint_glyph_func_t") hb_font_paint_glyph_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_paint_glyph_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_funcs_set_paint_glyph_or_fail_func ] ---

    /** {@code void hb_font_funcs_set_paint_glyph_or_fail_func(hb_font_funcs_t * ffuncs, hb_font_paint_glyph_or_fail_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_funcs_set_paint_glyph_or_fail_func(long ffuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.font_funcs_set_paint_glyph_or_fail_func;
        if (CHECKS) {
            check(ffuncs);
        }
        invokePPPPV(ffuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_funcs_set_paint_glyph_or_fail_func(hb_font_funcs_t * ffuncs, hb_font_paint_glyph_or_fail_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_font_funcs_set_paint_glyph_or_fail_func(@NativeType("hb_font_funcs_t *") long ffuncs, @NativeType("hb_font_paint_glyph_or_fail_func_t") hb_font_paint_glyph_or_fail_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_funcs_set_paint_glyph_or_fail_func(ffuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_get_h_extents ] ---

    /** {@code hb_bool_t hb_font_get_h_extents(hb_font_t * font, hb_font_extents_t * extents)} */
    public static int nhb_font_get_h_extents(long font, long extents) {
        long __functionAddress = Functions.font_get_h_extents;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_h_extents(hb_font_t * font, hb_font_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_h_extents(@NativeType("hb_font_t *") long font, @NativeType("hb_font_extents_t *") hb_font_extents_t extents) {
        return nhb_font_get_h_extents(font, extents.address()) != 0;
    }

    // --- [ hb_font_get_v_extents ] ---

    /** {@code hb_bool_t hb_font_get_v_extents(hb_font_t * font, hb_font_extents_t * extents)} */
    public static int nhb_font_get_v_extents(long font, long extents) {
        long __functionAddress = Functions.font_get_v_extents;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_v_extents(hb_font_t * font, hb_font_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_v_extents(@NativeType("hb_font_t *") long font, @NativeType("hb_font_extents_t *") hb_font_extents_t extents) {
        return nhb_font_get_v_extents(font, extents.address()) != 0;
    }

    // --- [ hb_font_get_nominal_glyph ] ---

    /** {@code hb_bool_t hb_font_get_nominal_glyph(hb_font_t * font, hb_codepoint_t unicode, hb_codepoint_t * glyph)} */
    public static int nhb_font_get_nominal_glyph(long font, int unicode, long glyph) {
        long __functionAddress = Functions.font_get_nominal_glyph;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, unicode, glyph, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_nominal_glyph(hb_font_t * font, hb_codepoint_t unicode, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_nominal_glyph(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int unicode, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        return nhb_font_get_nominal_glyph(font, unicode, memAddress(glyph)) != 0;
    }

    // --- [ hb_font_get_variation_glyph ] ---

    /** {@code hb_bool_t hb_font_get_variation_glyph(hb_font_t * font, hb_codepoint_t unicode, hb_codepoint_t variation_selector, hb_codepoint_t * glyph)} */
    public static int nhb_font_get_variation_glyph(long font, int unicode, int variation_selector, long glyph) {
        long __functionAddress = Functions.font_get_variation_glyph;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, unicode, variation_selector, glyph, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_variation_glyph(hb_font_t * font, hb_codepoint_t unicode, hb_codepoint_t variation_selector, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_variation_glyph(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int unicode, @NativeType("hb_codepoint_t") int variation_selector, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        return nhb_font_get_variation_glyph(font, unicode, variation_selector, memAddress(glyph)) != 0;
    }

    // --- [ hb_font_get_nominal_glyphs ] ---

    /** {@code unsigned int hb_font_get_nominal_glyphs(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_unicode, unsigned int unicode_stride, hb_codepoint_t * first_glyph, unsigned int glyph_stride)} */
    public static int nhb_font_get_nominal_glyphs(long font, int count, long first_unicode, int unicode_stride, long first_glyph, int glyph_stride) {
        long __functionAddress = Functions.font_get_nominal_glyphs;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, count, first_unicode, unicode_stride, first_glyph, glyph_stride, __functionAddress);
    }

    /** {@code unsigned int hb_font_get_nominal_glyphs(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_unicode, unsigned int unicode_stride, hb_codepoint_t * first_glyph, unsigned int glyph_stride)} */
    @NativeType("unsigned int")
    public static int hb_font_get_nominal_glyphs(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") IntBuffer first_unicode, @NativeType("unsigned int") int unicode_stride, @NativeType("hb_codepoint_t *") IntBuffer first_glyph, @NativeType("unsigned int") int glyph_stride) {
        if (CHECKS) {
            check(first_unicode, (count * unicode_stride) >> 2);
            check(first_glyph, (count * glyph_stride) >> 2);
        }
        return nhb_font_get_nominal_glyphs(font, count, memAddress(first_unicode), unicode_stride, memAddress(first_glyph), glyph_stride);
    }

    // --- [ hb_font_get_glyph_h_advance ] ---

    /** {@code hb_position_t hb_font_get_glyph_h_advance(hb_font_t * font, hb_codepoint_t glyph)} */
    @NativeType("hb_position_t")
    public static int hb_font_get_glyph_h_advance(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.font_get_glyph_h_advance;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, glyph, __functionAddress);
    }

    // --- [ hb_font_get_glyph_v_advance ] ---

    /** {@code hb_position_t hb_font_get_glyph_v_advance(hb_font_t * font, hb_codepoint_t glyph)} */
    @NativeType("hb_position_t")
    public static int hb_font_get_glyph_v_advance(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph) {
        long __functionAddress = Functions.font_get_glyph_v_advance;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, glyph, __functionAddress);
    }

    // --- [ hb_font_get_glyph_h_advances ] ---

    /** {@code void hb_font_get_glyph_h_advances(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride)} */
    public static void nhb_font_get_glyph_h_advances(long font, int count, long first_glyph, int glyph_stride, long first_advance, int advance_stride) {
        long __functionAddress = Functions.font_get_glyph_h_advances;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, count, first_glyph, glyph_stride, first_advance, advance_stride, __functionAddress);
    }

    /** {@code void hb_font_get_glyph_h_advances(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride)} */
    public static void hb_font_get_glyph_h_advances(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") IntBuffer first_glyph, @NativeType("unsigned int") int glyph_stride, @NativeType("hb_position_t *") IntBuffer first_advance, @NativeType("unsigned int") int advance_stride) {
        if (CHECKS) {
            check(first_glyph, (count * glyph_stride) >> 2);
            check(first_advance, (count * advance_stride) >> 2);
        }
        nhb_font_get_glyph_h_advances(font, count, memAddress(first_glyph), glyph_stride, memAddress(first_advance), advance_stride);
    }

    // --- [ hb_font_get_glyph_v_advances ] ---

    /** {@code void hb_font_get_glyph_v_advances(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride)} */
    public static void nhb_font_get_glyph_v_advances(long font, int count, long first_glyph, int glyph_stride, long first_advance, int advance_stride) {
        long __functionAddress = Functions.font_get_glyph_v_advances;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, count, first_glyph, glyph_stride, first_advance, advance_stride, __functionAddress);
    }

    /** {@code void hb_font_get_glyph_v_advances(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride)} */
    public static void hb_font_get_glyph_v_advances(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") IntBuffer first_glyph, @NativeType("unsigned int") int glyph_stride, @NativeType("hb_position_t *") IntBuffer first_advance, @NativeType("unsigned int") int advance_stride) {
        if (CHECKS) {
            check(first_glyph, (count * glyph_stride) >> 2);
            check(first_advance, (count * advance_stride) >> 2);
        }
        nhb_font_get_glyph_v_advances(font, count, memAddress(first_glyph), glyph_stride, memAddress(first_advance), advance_stride);
    }

    // --- [ hb_font_get_glyph_h_origin ] ---

    /** {@code hb_bool_t hb_font_get_glyph_h_origin(hb_font_t * font, hb_codepoint_t glyph, hb_position_t * x, hb_position_t * y)} */
    public static int nhb_font_get_glyph_h_origin(long font, int glyph, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_h_origin;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, glyph, x, y, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_h_origin(hb_font_t * font, hb_codepoint_t glyph, hb_position_t * x, hb_position_t * y)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_h_origin(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nhb_font_get_glyph_h_origin(font, glyph, memAddress(x), memAddress(y)) != 0;
    }

    // --- [ hb_font_get_glyph_v_origin ] ---

    /** {@code hb_bool_t hb_font_get_glyph_v_origin(hb_font_t * font, hb_codepoint_t glyph, hb_position_t * x, hb_position_t * y)} */
    public static int nhb_font_get_glyph_v_origin(long font, int glyph, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_v_origin;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, glyph, x, y, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_v_origin(hb_font_t * font, hb_codepoint_t glyph, hb_position_t * x, hb_position_t * y)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_v_origin(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nhb_font_get_glyph_v_origin(font, glyph, memAddress(x), memAddress(y)) != 0;
    }

    // --- [ hb_font_get_glyph_h_origins ] ---

    /** {@code hb_bool_t hb_font_get_glyph_h_origins(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned glyph_stride, hb_position_t * first_x, unsigned x_stride, hb_position_t * first_y, unsigned y_stride)} */
    public static int nhb_font_get_glyph_h_origins(long font, int count, long first_glyph, int glyph_stride, long first_x, int x_stride, long first_y, int y_stride) {
        long __functionAddress = Functions.font_get_glyph_h_origins;
        if (CHECKS) {
            check(font);
        }
        return invokePPPPI(font, count, first_glyph, glyph_stride, first_x, x_stride, first_y, y_stride, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_h_origins(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned glyph_stride, hb_position_t * first_x, unsigned x_stride, hb_position_t * first_y, unsigned y_stride)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_h_origins(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") IntBuffer first_glyph, @NativeType("unsigned") int glyph_stride, @NativeType("hb_position_t *") IntBuffer first_x, @NativeType("unsigned") int x_stride, @NativeType("hb_position_t *") IntBuffer first_y, @NativeType("unsigned") int y_stride) {
        if (CHECKS) {
            check(first_glyph, (count * glyph_stride) >> 2);
            check(first_x, (count * x_stride) >> 2);
            check(first_y, (count * y_stride) >> 2);
        }
        return nhb_font_get_glyph_h_origins(font, count, memAddress(first_glyph), glyph_stride, memAddress(first_x), x_stride, memAddress(first_y), y_stride) != 0;
    }

    // --- [ hb_font_get_glyph_v_origins ] ---

    /** {@code hb_bool_t hb_font_get_glyph_v_origins(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned glyph_stride, hb_position_t * first_x, unsigned x_stride, hb_position_t * first_y, unsigned y_stride)} */
    public static int nhb_font_get_glyph_v_origins(long font, int count, long first_glyph, int glyph_stride, long first_x, int x_stride, long first_y, int y_stride) {
        long __functionAddress = Functions.font_get_glyph_v_origins;
        if (CHECKS) {
            check(font);
        }
        return invokePPPPI(font, count, first_glyph, glyph_stride, first_x, x_stride, first_y, y_stride, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_v_origins(hb_font_t * font, unsigned int count, hb_codepoint_t const * first_glyph, unsigned glyph_stride, hb_position_t * first_x, unsigned x_stride, hb_position_t * first_y, unsigned y_stride)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_v_origins(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") IntBuffer first_glyph, @NativeType("unsigned") int glyph_stride, @NativeType("hb_position_t *") IntBuffer first_x, @NativeType("unsigned") int x_stride, @NativeType("hb_position_t *") IntBuffer first_y, @NativeType("unsigned") int y_stride) {
        if (CHECKS) {
            check(first_glyph, (count * glyph_stride) >> 2);
            check(first_x, (count * x_stride) >> 2);
            check(first_y, (count * y_stride) >> 2);
        }
        return nhb_font_get_glyph_v_origins(font, count, memAddress(first_glyph), glyph_stride, memAddress(first_x), x_stride, memAddress(first_y), y_stride) != 0;
    }

    // --- [ hb_font_get_glyph_h_kerning ] ---

    /** {@code hb_position_t hb_font_get_glyph_h_kerning(hb_font_t * font, hb_codepoint_t left_glyph, hb_codepoint_t right_glyph)} */
    @NativeType("hb_position_t")
    public static int hb_font_get_glyph_h_kerning(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int left_glyph, @NativeType("hb_codepoint_t") int right_glyph) {
        long __functionAddress = Functions.font_get_glyph_h_kerning;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, left_glyph, right_glyph, __functionAddress);
    }

    // --- [ hb_font_get_glyph_extents ] ---

    /** {@code hb_bool_t hb_font_get_glyph_extents(hb_font_t * font, hb_codepoint_t glyph, hb_glyph_extents_t * extents)} */
    public static int nhb_font_get_glyph_extents(long font, int glyph, long extents) {
        long __functionAddress = Functions.font_get_glyph_extents;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, glyph, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_extents(hb_font_t * font, hb_codepoint_t glyph, hb_glyph_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_extents(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_glyph_extents_t *") hb_glyph_extents_t extents) {
        return nhb_font_get_glyph_extents(font, glyph, extents.address()) != 0;
    }

    // --- [ hb_font_get_glyph_contour_point ] ---

    /** {@code hb_bool_t hb_font_get_glyph_contour_point(hb_font_t * font, hb_codepoint_t glyph, unsigned int point_index, hb_position_t * x, hb_position_t * y)} */
    public static int nhb_font_get_glyph_contour_point(long font, int glyph, int point_index, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_contour_point;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, glyph, point_index, x, y, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_contour_point(hb_font_t * font, hb_codepoint_t glyph, unsigned int point_index, hb_position_t * x, hb_position_t * y)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_contour_point(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("unsigned int") int point_index, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nhb_font_get_glyph_contour_point(font, glyph, point_index, memAddress(x), memAddress(y)) != 0;
    }

    // --- [ hb_font_get_glyph_name ] ---

    /** {@code hb_bool_t hb_font_get_glyph_name(hb_font_t * font, hb_codepoint_t glyph, char * name, unsigned int size)} */
    public static int nhb_font_get_glyph_name(long font, int glyph, long name, int size) {
        long __functionAddress = Functions.font_get_glyph_name;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, glyph, name, size, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_name(hb_font_t * font, hb_codepoint_t glyph, char * name, unsigned int size)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_name(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("char *") ByteBuffer name) {
        return nhb_font_get_glyph_name(font, glyph, memAddress(name), name.remaining()) != 0;
    }

    // --- [ hb_font_get_glyph_from_name ] ---

    /** {@code hb_bool_t hb_font_get_glyph_from_name(hb_font_t * font, char const * name, int len, hb_codepoint_t * glyph)} */
    public static int nhb_font_get_glyph_from_name(long font, long name, int len, long glyph) {
        long __functionAddress = Functions.font_get_glyph_from_name;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, name, len, glyph, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_from_name(hb_font_t * font, char const * name, int len, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_from_name(@NativeType("hb_font_t *") long font, @NativeType("char const *") ByteBuffer name, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        return nhb_font_get_glyph_from_name(font, memAddress(name), name.remaining(), memAddress(glyph)) != 0;
    }

    /** {@code hb_bool_t hb_font_get_glyph_from_name(hb_font_t * font, char const * name, int len, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_from_name(@NativeType("hb_font_t *") long font, @NativeType("char const *") CharSequence name, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            return nhb_font_get_glyph_from_name(font, nameEncoded, nameEncodedLength, memAddress(glyph)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_font_draw_glyph ] ---

    /** {@code void hb_font_draw_glyph(hb_font_t * font, hb_codepoint_t glyph, hb_draw_funcs_t * dfuncs, void * draw_data)} */
    public static void hb_font_draw_glyph(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") long draw_data) {
        long __functionAddress = Functions.font_draw_glyph;
        if (CHECKS) {
            check(font);
            check(dfuncs);
        }
        invokePPPV(font, glyph, dfuncs, draw_data, __functionAddress);
    }

    // --- [ hb_font_draw_glyph_or_fail ] ---

    /** {@code hb_bool_t hb_font_draw_glyph_or_fail(hb_font_t * font, hb_codepoint_t glyph, hb_draw_funcs_t * dfuncs, void * draw_data)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_draw_glyph_or_fail(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_draw_funcs_t *") long dfuncs, @NativeType("void *") long draw_data) {
        long __functionAddress = Functions.font_draw_glyph_or_fail;
        if (CHECKS) {
            check(font);
            check(dfuncs);
        }
        return invokePPPI(font, glyph, dfuncs, draw_data, __functionAddress) != 0;
    }

    // --- [ hb_font_paint_glyph ] ---

    /** {@code void hb_font_paint_glyph(hb_font_t * font, hb_codepoint_t glyph, hb_draw_funcs_t * pfuncs, void * paint_data, unsigned int palette_index, hb_color_t foreground)} */
    public static void hb_font_paint_glyph(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_draw_funcs_t *") long pfuncs, @NativeType("void *") long paint_data, @NativeType("unsigned int") int palette_index, @NativeType("hb_color_t") int foreground) {
        long __functionAddress = Functions.font_paint_glyph;
        if (CHECKS) {
            check(font);
            check(pfuncs);
        }
        invokePPPV(font, glyph, pfuncs, paint_data, palette_index, foreground, __functionAddress);
    }

    // --- [ hb_font_paint_glyph_or_fail ] ---

    /** {@code hb_bool_t hb_font_paint_glyph_or_fail(hb_font_t * font, hb_codepoint_t glyph, hb_draw_funcs_t * pfuncs, void * paint_data, unsigned int palette_index, hb_color_t foreground)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_paint_glyph_or_fail(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_draw_funcs_t *") long pfuncs, @NativeType("void *") long paint_data, @NativeType("unsigned int") int palette_index, @NativeType("hb_color_t") int foreground) {
        long __functionAddress = Functions.font_paint_glyph_or_fail;
        if (CHECKS) {
            check(font);
            check(pfuncs);
        }
        return invokePPPI(font, glyph, pfuncs, paint_data, palette_index, foreground, __functionAddress) != 0;
    }

    // --- [ hb_font_get_glyph ] ---

    /** {@code hb_bool_t hb_font_get_glyph(hb_font_t * font, hb_codepoint_t unicode, hb_codepoint_t variation_selector, hb_codepoint_t * glyph)} */
    public static int nhb_font_get_glyph(long font, int unicode, int variation_selector, long glyph) {
        long __functionAddress = Functions.font_get_glyph;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, unicode, variation_selector, glyph, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph(hb_font_t * font, hb_codepoint_t unicode, hb_codepoint_t variation_selector, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int unicode, @NativeType("hb_codepoint_t") int variation_selector, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        return nhb_font_get_glyph(font, unicode, variation_selector, memAddress(glyph)) != 0;
    }

    // --- [ hb_font_get_extents_for_direction ] ---

    /** {@code void hb_font_get_extents_for_direction(hb_font_t * font, hb_direction_t direction, hb_font_extents_t * extents)} */
    public static void nhb_font_get_extents_for_direction(long font, int direction, long extents) {
        long __functionAddress = Functions.font_get_extents_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, direction, extents, __functionAddress);
    }

    /** {@code void hb_font_get_extents_for_direction(hb_font_t * font, hb_direction_t direction, hb_font_extents_t * extents)} */
    public static void hb_font_get_extents_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_direction_t") int direction, @NativeType("hb_font_extents_t *") hb_font_extents_t extents) {
        nhb_font_get_extents_for_direction(font, direction, extents.address());
    }

    // --- [ hb_font_get_glyph_advance_for_direction ] ---

    /** {@code void hb_font_get_glyph_advance_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void nhb_font_get_glyph_advance_for_direction(long font, int glyph, int direction, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_advance_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, glyph, direction, x, y, __functionAddress);
    }

    /** {@code void hb_font_get_glyph_advance_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void hb_font_get_glyph_advance_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        nhb_font_get_glyph_advance_for_direction(font, glyph, direction, memAddress(x), memAddress(y));
    }

    // --- [ hb_font_get_glyph_advances_for_direction ] ---

    /** {@code void hb_font_get_glyph_advances_for_direction(hb_font_t * font, hb_direction_t direction, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride)} */
    public static void nhb_font_get_glyph_advances_for_direction(long font, int direction, int count, long first_glyph, int glyph_stride, long first_advance, int advance_stride) {
        long __functionAddress = Functions.font_get_glyph_advances_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, direction, count, first_glyph, glyph_stride, first_advance, advance_stride, __functionAddress);
    }

    /** {@code void hb_font_get_glyph_advances_for_direction(hb_font_t * font, hb_direction_t direction, unsigned int count, hb_codepoint_t const * first_glyph, unsigned int glyph_stride, hb_position_t * first_advance, unsigned int advance_stride)} */
    public static void hb_font_get_glyph_advances_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_direction_t") int direction, @NativeType("unsigned int") int count, @NativeType("hb_codepoint_t const *") IntBuffer first_glyph, @NativeType("unsigned int") int glyph_stride, @NativeType("hb_position_t *") IntBuffer first_advance, @NativeType("unsigned int") int advance_stride) {
        if (CHECKS) {
            check(first_glyph, (count * glyph_stride) >> 2);
            check(first_advance, (count * advance_stride) >> 2);
        }
        nhb_font_get_glyph_advances_for_direction(font, direction, count, memAddress(first_glyph), glyph_stride, memAddress(first_advance), advance_stride);
    }

    // --- [ hb_font_get_glyph_origin_for_direction ] ---

    /** {@code void hb_font_get_glyph_origin_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void nhb_font_get_glyph_origin_for_direction(long font, int glyph, int direction, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_origin_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, glyph, direction, x, y, __functionAddress);
    }

    /** {@code void hb_font_get_glyph_origin_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void hb_font_get_glyph_origin_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        nhb_font_get_glyph_origin_for_direction(font, glyph, direction, memAddress(x), memAddress(y));
    }

    // --- [ hb_font_add_glyph_origin_for_direction ] ---

    /** {@code void hb_font_add_glyph_origin_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void nhb_font_add_glyph_origin_for_direction(long font, int glyph, int direction, long x, long y) {
        long __functionAddress = Functions.font_add_glyph_origin_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, glyph, direction, x, y, __functionAddress);
    }

    /** {@code void hb_font_add_glyph_origin_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void hb_font_add_glyph_origin_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        nhb_font_add_glyph_origin_for_direction(font, glyph, direction, memAddress(x), memAddress(y));
    }

    // --- [ hb_font_subtract_glyph_origin_for_direction ] ---

    /** {@code void hb_font_subtract_glyph_origin_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void nhb_font_subtract_glyph_origin_for_direction(long font, int glyph, int direction, long x, long y) {
        long __functionAddress = Functions.font_subtract_glyph_origin_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, glyph, direction, x, y, __functionAddress);
    }

    /** {@code void hb_font_subtract_glyph_origin_for_direction(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void hb_font_subtract_glyph_origin_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        nhb_font_subtract_glyph_origin_for_direction(font, glyph, direction, memAddress(x), memAddress(y));
    }

    // --- [ hb_font_get_glyph_kerning_for_direction ] ---

    /** {@code void hb_font_get_glyph_kerning_for_direction(hb_font_t * font, hb_codepoint_t first_glyph, hb_codepoint_t second_glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void nhb_font_get_glyph_kerning_for_direction(long font, int first_glyph, int second_glyph, int direction, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_kerning_for_direction;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, first_glyph, second_glyph, direction, x, y, __functionAddress);
    }

    /** {@code void hb_font_get_glyph_kerning_for_direction(hb_font_t * font, hb_codepoint_t first_glyph, hb_codepoint_t second_glyph, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static void hb_font_get_glyph_kerning_for_direction(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int first_glyph, @NativeType("hb_codepoint_t") int second_glyph, @NativeType("hb_direction_t") int direction, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        nhb_font_get_glyph_kerning_for_direction(font, first_glyph, second_glyph, direction, memAddress(x), memAddress(y));
    }

    // --- [ hb_font_get_glyph_extents_for_origin ] ---

    /** {@code hb_bool_t hb_font_get_glyph_extents_for_origin(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_glyph_extents_t * extents)} */
    public static int nhb_font_get_glyph_extents_for_origin(long font, int glyph, int direction, long extents) {
        long __functionAddress = Functions.font_get_glyph_extents_for_origin;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, glyph, direction, extents, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_extents_for_origin(hb_font_t * font, hb_codepoint_t glyph, hb_direction_t direction, hb_glyph_extents_t * extents)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_extents_for_origin(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_direction_t") int direction, @NativeType("hb_glyph_extents_t *") hb_glyph_extents_t extents) {
        return nhb_font_get_glyph_extents_for_origin(font, glyph, direction, extents.address()) != 0;
    }

    // --- [ hb_font_get_glyph_contour_point_for_origin ] ---

    /** {@code hb_bool_t hb_font_get_glyph_contour_point_for_origin(hb_font_t * font, hb_codepoint_t glyph, unsigned int point_index, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    public static int nhb_font_get_glyph_contour_point_for_origin(long font, int glyph, int point_index, int direction, long x, long y) {
        long __functionAddress = Functions.font_get_glyph_contour_point_for_origin;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, glyph, point_index, direction, x, y, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_get_glyph_contour_point_for_origin(hb_font_t * font, hb_codepoint_t glyph, unsigned int point_index, hb_direction_t direction, hb_position_t * x, hb_position_t * y)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_get_glyph_contour_point_for_origin(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("unsigned int") int point_index, @NativeType("hb_direction_t") int direction, @NativeType("hb_position_t *") IntBuffer x, @NativeType("hb_position_t *") IntBuffer y) {
        if (CHECKS) {
            check(x, 1);
            check(y, 1);
        }
        return nhb_font_get_glyph_contour_point_for_origin(font, glyph, point_index, direction, memAddress(x), memAddress(y)) != 0;
    }

    // --- [ hb_font_glyph_to_string ] ---

    /** {@code void hb_font_glyph_to_string(hb_font_t * font, hb_codepoint_t glyph, char * s, unsigned int size)} */
    public static void nhb_font_glyph_to_string(long font, int glyph, long s, int size) {
        long __functionAddress = Functions.font_glyph_to_string;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, glyph, s, size, __functionAddress);
    }

    /** {@code void hb_font_glyph_to_string(hb_font_t * font, hb_codepoint_t glyph, char * s, unsigned int size)} */
    public static void hb_font_glyph_to_string(@NativeType("hb_font_t *") long font, @NativeType("hb_codepoint_t") int glyph, @NativeType("char *") ByteBuffer s) {
        nhb_font_glyph_to_string(font, glyph, memAddress(s), s.remaining());
    }

    // --- [ hb_font_glyph_from_string ] ---

    /** {@code hb_bool_t hb_font_glyph_from_string(hb_font_t * font, char const * s, int len, hb_codepoint_t * glyph)} */
    public static int nhb_font_glyph_from_string(long font, long s, int len, long glyph) {
        long __functionAddress = Functions.font_glyph_from_string;
        if (CHECKS) {
            check(font);
        }
        return invokePPPI(font, s, len, glyph, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_glyph_from_string(hb_font_t * font, char const * s, int len, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_glyph_from_string(@NativeType("hb_font_t *") long font, @NativeType("char const *") ByteBuffer s, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        return nhb_font_glyph_from_string(font, memAddress(s), s.remaining(), memAddress(glyph)) != 0;
    }

    /** {@code hb_bool_t hb_font_glyph_from_string(hb_font_t * font, char const * s, int len, hb_codepoint_t * glyph)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_glyph_from_string(@NativeType("hb_font_t *") long font, @NativeType("char const *") CharSequence s, @NativeType("hb_codepoint_t *") IntBuffer glyph) {
        if (CHECKS) {
            check(glyph, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int sEncodedLength = stack.nASCII(s, false);
            long sEncoded = stack.getPointerAddress();
            return nhb_font_glyph_from_string(font, sEncoded, sEncodedLength, memAddress(glyph)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_font_create ] ---

    /** {@code hb_font_t * hb_font_create(hb_face_t * face)} */
    @NativeType("hb_font_t *")
    public static long hb_font_create(@NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.font_create;
        if (CHECKS) {
            check(face);
        }
        return invokePP(face, __functionAddress);
    }

    // --- [ hb_font_create_sub_font ] ---

    /** {@code hb_font_t * hb_font_create_sub_font(hb_font_t * parent)} */
    @NativeType("hb_font_t *")
    public static long hb_font_create_sub_font(@NativeType("hb_font_t *") long parent) {
        long __functionAddress = Functions.font_create_sub_font;
        if (CHECKS) {
            check(parent);
        }
        return invokePP(parent, __functionAddress);
    }

    // --- [ hb_font_get_empty ] ---

    /** {@code hb_font_t * hb_font_get_empty(void)} */
    @NativeType("hb_font_t *")
    public static long hb_font_get_empty() {
        long __functionAddress = Functions.font_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_font_reference ] ---

    /** {@code hb_font_t * hb_font_reference(hb_font_t * font)} */
    @NativeType("hb_font_t *")
    public static long hb_font_reference(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_reference;
        if (CHECKS) {
            check(font);
        }
        return invokePP(font, __functionAddress);
    }

    // --- [ hb_font_destroy ] ---

    /** {@code void hb_font_destroy(hb_font_t * font)} */
    public static void hb_font_destroy(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_destroy;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_font_set_user_data ] ---

    /** {@code hb_bool_t hb_font_set_user_data(hb_font_t * font, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_font_set_user_data(long font, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.font_set_user_data;
        if (CHECKS) {
            check(font);
        }
        return invokePPPPI(font, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_set_user_data(hb_font_t * font, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_set_user_data(@NativeType("hb_font_t *") long font, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_font_set_user_data(font, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_font_get_user_data ] ---

    /** {@code void * hb_font_get_user_data(hb_font_t const * font, hb_user_data_key_t * key)} */
    public static long nhb_font_get_user_data(long font, long key) {
        long __functionAddress = Functions.font_get_user_data;
        if (CHECKS) {
            check(font);
        }
        return invokePPP(font, key, __functionAddress);
    }

    /** {@code void * hb_font_get_user_data(hb_font_t const * font, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_font_get_user_data(@NativeType("hb_font_t const *") long font, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_font_get_user_data(font, key.address());
    }

    // --- [ hb_font_make_immutable ] ---

    /** {@code void hb_font_make_immutable(hb_font_t * font)} */
    public static void hb_font_make_immutable(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_make_immutable;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_font_is_immutable ] ---

    /** {@code hb_bool_t hb_font_is_immutable(hb_font_t * font)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_is_immutable(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_is_immutable;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, __functionAddress) != 0;
    }

    // --- [ hb_font_get_serial ] ---

    /** {@code unsigned int hb_font_get_serial(hb_font_t * font)} */
    @NativeType("unsigned int")
    public static int hb_font_get_serial(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_get_serial;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, __functionAddress);
    }

    // --- [ hb_font_changed ] ---

    /** {@code void hb_font_changed(hb_font_t * font)} */
    public static void hb_font_changed(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_changed;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_font_set_parent ] ---

    /** {@code void hb_font_set_parent(hb_font_t * font, hb_font_t * parent)} */
    public static void hb_font_set_parent(@NativeType("hb_font_t *") long font, @NativeType("hb_font_t *") long parent) {
        long __functionAddress = Functions.font_set_parent;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, parent, __functionAddress);
    }

    // --- [ hb_font_get_parent ] ---

    /** {@code hb_font_t * hb_font_get_parent(hb_font_t * font)} */
    @NativeType("hb_font_t *")
    public static long hb_font_get_parent(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_get_parent;
        if (CHECKS) {
            check(font);
        }
        return invokePP(font, __functionAddress);
    }

    // --- [ hb_font_set_face ] ---

    /** {@code void hb_font_set_face(hb_font_t * font, hb_face_t * face)} */
    public static void hb_font_set_face(@NativeType("hb_font_t *") long font, @NativeType("hb_face_t *") long face) {
        long __functionAddress = Functions.font_set_face;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, face, __functionAddress);
    }

    // --- [ hb_font_get_face ] ---

    /** {@code hb_face_t * hb_font_get_face(hb_font_t * font)} */
    @NativeType("hb_face_t *")
    public static long hb_font_get_face(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_get_face;
        if (CHECKS) {
            check(font);
        }
        return invokePP(font, __functionAddress);
    }

    // --- [ hb_font_set_funcs ] ---

    /** {@code void hb_font_set_funcs(hb_font_t * font, hb_font_funcs_t * klass, void * font_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_set_funcs(long font, long klass, long font_data, long destroy) {
        long __functionAddress = Functions.font_set_funcs;
        if (CHECKS) {
            check(font);
        }
        invokePPPPV(font, klass, font_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_set_funcs(hb_font_t * font, hb_font_funcs_t * klass, void * font_data, hb_destroy_func_t destroy)} */
    public static void hb_font_set_funcs(@NativeType("hb_font_t *") long font, @NativeType("hb_font_funcs_t *") long klass, @NativeType("void *") long font_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_set_funcs(font, klass, font_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_set_funcs_data ] ---

    /** {@code void hb_font_set_funcs_data(hb_font_t * font, void * font_data, hb_destroy_func_t destroy)} */
    public static void nhb_font_set_funcs_data(long font, long font_data, long destroy) {
        long __functionAddress = Functions.font_set_funcs_data;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, font_data, destroy, __functionAddress);
    }

    /** {@code void hb_font_set_funcs_data(hb_font_t * font, void * font_data, hb_destroy_func_t destroy)} */
    public static void hb_font_set_funcs_data(@NativeType("hb_font_t *") long font, @NativeType("void *") long font_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_font_set_funcs_data(font, font_data, memAddressSafe(destroy));
    }

    // --- [ hb_font_set_funcs_using ] ---

    /** {@code hb_bool_t hb_font_set_funcs_using(hb_font_t * font, char const * name)} */
    public static int nhb_font_set_funcs_using(long font, long name) {
        long __functionAddress = Functions.font_set_funcs_using;
        if (CHECKS) {
            check(font);
        }
        return invokePPI(font, name, __functionAddress);
    }

    /** {@code hb_bool_t hb_font_set_funcs_using(hb_font_t * font, char const * name)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_set_funcs_using(@NativeType("hb_font_t *") long font, @NativeType("char const *") @Nullable ByteBuffer name) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nhb_font_set_funcs_using(font, memAddressSafe(name)) != 0;
    }

    /** {@code hb_bool_t hb_font_set_funcs_using(hb_font_t * font, char const * name)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_set_funcs_using(@NativeType("hb_font_t *") long font, @NativeType("char const *") @Nullable CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nhb_font_set_funcs_using(font, nameEncoded) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_font_list_funcs ] ---

    /** {@code char const ** hb_font_list_funcs(void)} */
    public static long nhb_font_list_funcs() {
        long __functionAddress = Functions.font_list_funcs;
        return invokeP(__functionAddress);
    }

    /** {@code char const ** hb_font_list_funcs(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_font_list_funcs() {
        long __result = nhb_font_list_funcs();
        return memPointerBufferSafe(__result, font_list_funcs_COUNT);
    }

    /** {@code char const ** hb_font_list_funcs(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_font_list_funcs(long length) {
        long __result = nhb_font_list_funcs();
        return memPointerBufferSafe(__result, (int)length);
    }

    // --- [ hb_font_set_scale ] ---

    /** {@code void hb_font_set_scale(hb_font_t * font, int x_scale, int y_scale)} */
    public static void hb_font_set_scale(@NativeType("hb_font_t *") long font, int x_scale, int y_scale) {
        long __functionAddress = Functions.font_set_scale;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, x_scale, y_scale, __functionAddress);
    }

    // --- [ hb_font_get_scale ] ---

    /** {@code void hb_font_get_scale(hb_font_t * font, int * x_scale, int * y_scale)} */
    public static void nhb_font_get_scale(long font, long x_scale, long y_scale) {
        long __functionAddress = Functions.font_get_scale;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, x_scale, y_scale, __functionAddress);
    }

    /** {@code void hb_font_get_scale(hb_font_t * font, int * x_scale, int * y_scale)} */
    public static void hb_font_get_scale(@NativeType("hb_font_t *") long font, @NativeType("int *") IntBuffer x_scale, @NativeType("int *") IntBuffer y_scale) {
        if (CHECKS) {
            check(x_scale, 1);
            check(y_scale, 1);
        }
        nhb_font_get_scale(font, memAddress(x_scale), memAddress(y_scale));
    }

    // --- [ hb_font_set_ppem ] ---

    /** {@code void hb_font_set_ppem(hb_font_t * font, unsigned int x_ppem, unsigned int y_ppem)} */
    public static void hb_font_set_ppem(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int x_ppem, @NativeType("unsigned int") int y_ppem) {
        long __functionAddress = Functions.font_set_ppem;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, x_ppem, y_ppem, __functionAddress);
    }

    // --- [ hb_font_get_ppem ] ---

    /** {@code void hb_font_get_ppem(hb_font_t * font, unsigned int * x_ppem, unsigned int * y_ppem)} */
    public static void nhb_font_get_ppem(long font, long x_ppem, long y_ppem) {
        long __functionAddress = Functions.font_get_ppem;
        if (CHECKS) {
            check(font);
        }
        invokePPPV(font, x_ppem, y_ppem, __functionAddress);
    }

    /** {@code void hb_font_get_ppem(hb_font_t * font, unsigned int * x_ppem, unsigned int * y_ppem)} */
    public static void hb_font_get_ppem(@NativeType("hb_font_t *") long font, @NativeType("unsigned int *") IntBuffer x_ppem, @NativeType("unsigned int *") IntBuffer y_ppem) {
        if (CHECKS) {
            check(x_ppem, 1);
            check(y_ppem, 1);
        }
        nhb_font_get_ppem(font, memAddress(x_ppem), memAddress(y_ppem));
    }

    // --- [ hb_font_set_ptem ] ---

    /** {@code void hb_font_set_ptem(hb_font_t * font, float ptem)} */
    public static void hb_font_set_ptem(@NativeType("hb_font_t *") long font, float ptem) {
        long __functionAddress = Functions.font_set_ptem;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, ptem, __functionAddress);
    }

    // --- [ hb_font_get_ptem ] ---

    /** {@code float hb_font_get_ptem(hb_font_t * font)} */
    public static float hb_font_get_ptem(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_get_ptem;
        if (CHECKS) {
            check(font);
        }
        return invokePF(font, __functionAddress);
    }

    // --- [ hb_font_is_synthetic ] ---

    /** {@code hb_bool_t hb_font_is_synthetic(hb_font_t * font)} */
    @NativeType("hb_bool_t")
    public static boolean hb_font_is_synthetic(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_is_synthetic;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, __functionAddress) != 0;
    }

    // --- [ hb_font_set_synthetic_bold ] ---

    /** {@code void hb_font_set_synthetic_bold(hb_font_t * font, float x_embolden, float y_embolden, hb_bool_t in_place)} */
    public static void hb_font_set_synthetic_bold(@NativeType("hb_font_t *") long font, float x_embolden, float y_embolden, @NativeType("hb_bool_t") boolean in_place) {
        long __functionAddress = Functions.font_set_synthetic_bold;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, x_embolden, y_embolden, in_place ? 1 : 0, __functionAddress);
    }

    // --- [ hb_font_get_synthetic_bold ] ---

    /** {@code void hb_font_get_synthetic_bold(hb_font_t * font, float * x_embolden, float * y_embolden, hb_bool_t * in_place)} */
    public static void nhb_font_get_synthetic_bold(long font, long x_embolden, long y_embolden, long in_place) {
        long __functionAddress = Functions.font_get_synthetic_bold;
        if (CHECKS) {
            check(font);
        }
        invokePPPPV(font, x_embolden, y_embolden, in_place, __functionAddress);
    }

    /** {@code void hb_font_get_synthetic_bold(hb_font_t * font, float * x_embolden, float * y_embolden, hb_bool_t * in_place)} */
    public static void hb_font_get_synthetic_bold(@NativeType("hb_font_t *") long font, @NativeType("float *") @Nullable FloatBuffer x_embolden, @NativeType("float *") @Nullable FloatBuffer y_embolden, @NativeType("hb_bool_t *") @Nullable IntBuffer in_place) {
        if (CHECKS) {
            checkSafe(x_embolden, 1);
            checkSafe(y_embolden, 1);
            checkSafe(in_place, 1);
        }
        nhb_font_get_synthetic_bold(font, memAddressSafe(x_embolden), memAddressSafe(y_embolden), memAddressSafe(in_place));
    }

    // --- [ hb_font_set_synthetic_slant ] ---

    /** {@code void hb_font_set_synthetic_slant(hb_font_t * font, float slant)} */
    public static void hb_font_set_synthetic_slant(@NativeType("hb_font_t *") long font, float slant) {
        long __functionAddress = Functions.font_set_synthetic_slant;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, slant, __functionAddress);
    }

    // --- [ hb_font_get_synthetic_slant ] ---

    /** {@code float hb_font_get_synthetic_slant(hb_font_t * font)} */
    public static float hb_font_get_synthetic_slant(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_get_synthetic_slant;
        if (CHECKS) {
            check(font);
        }
        return invokePF(font, __functionAddress);
    }

    // --- [ hb_font_set_variations ] ---

    /** {@code void hb_font_set_variations(hb_font_t * font, hb_variation_t const * variations, unsigned int variations_length)} */
    public static void nhb_font_set_variations(long font, long variations, int variations_length) {
        long __functionAddress = Functions.font_set_variations;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, variations, variations_length, __functionAddress);
    }

    /** {@code void hb_font_set_variations(hb_font_t * font, hb_variation_t const * variations, unsigned int variations_length)} */
    public static void hb_font_set_variations(@NativeType("hb_font_t *") long font, @NativeType("hb_variation_t const *") hb_variation_t.Buffer variations) {
        nhb_font_set_variations(font, variations.address(), variations.remaining());
    }

    // --- [ hb_font_set_variation ] ---

    /** {@code void hb_font_set_variation(hb_font_t * font, hb_tag_t tag, float value)} */
    public static void hb_font_set_variation(@NativeType("hb_font_t *") long font, @NativeType("hb_tag_t") int tag, float value) {
        long __functionAddress = Functions.font_set_variation;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, tag, value, __functionAddress);
    }

    // --- [ hb_font_set_var_coords_design ] ---

    /** {@code void hb_font_set_var_coords_design(hb_font_t * font, float const * coords, unsigned int coords_length)} */
    public static void nhb_font_set_var_coords_design(long font, long coords, int coords_length) {
        long __functionAddress = Functions.font_set_var_coords_design;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, coords, coords_length, __functionAddress);
    }

    /** {@code void hb_font_set_var_coords_design(hb_font_t * font, float const * coords, unsigned int coords_length)} */
    public static void hb_font_set_var_coords_design(@NativeType("hb_font_t *") long font, @NativeType("float const *") FloatBuffer coords) {
        nhb_font_set_var_coords_design(font, memAddress(coords), coords.remaining());
    }

    // --- [ hb_font_get_var_coords_design ] ---

    /** {@code float const * hb_font_get_var_coords_design(hb_font_t * font, unsigned int * length)} */
    public static long nhb_font_get_var_coords_design(long font, long length) {
        long __functionAddress = Functions.font_get_var_coords_design;
        if (CHECKS) {
            check(font);
        }
        return invokePPP(font, length, __functionAddress);
    }

    /** {@code float const * hb_font_get_var_coords_design(hb_font_t * font, unsigned int * length)} */
    @NativeType("float const *")
    public static @Nullable FloatBuffer hb_font_get_var_coords_design(@NativeType("hb_font_t *") long font) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nhb_font_get_var_coords_design(font, memAddress(length));
            return memFloatBufferSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_font_set_var_coords_normalized ] ---

    /** {@code void hb_font_set_var_coords_normalized(hb_font_t * font, int const * coords, unsigned int coords_length)} */
    public static void nhb_font_set_var_coords_normalized(long font, long coords, int coords_length) {
        long __functionAddress = Functions.font_set_var_coords_normalized;
        if (CHECKS) {
            check(font);
        }
        invokePPV(font, coords, coords_length, __functionAddress);
    }

    /** {@code void hb_font_set_var_coords_normalized(hb_font_t * font, int const * coords, unsigned int coords_length)} */
    public static void hb_font_set_var_coords_normalized(@NativeType("hb_font_t *") long font, @NativeType("int const *") IntBuffer coords) {
        nhb_font_set_var_coords_normalized(font, memAddress(coords), coords.remaining());
    }

    // --- [ hb_font_get_var_coords_normalized ] ---

    /** {@code int const * hb_font_get_var_coords_normalized(hb_font_t * font, unsigned int * length)} */
    public static long nhb_font_get_var_coords_normalized(long font, long length) {
        long __functionAddress = Functions.font_get_var_coords_normalized;
        if (CHECKS) {
            check(font);
        }
        return invokePPP(font, length, __functionAddress);
    }

    /** {@code int const * hb_font_get_var_coords_normalized(hb_font_t * font, unsigned int * length)} */
    @NativeType("int const *")
    public static @Nullable IntBuffer hb_font_get_var_coords_normalized(@NativeType("hb_font_t *") long font) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer length = stack.callocInt(1);
        try {
            long __result = nhb_font_get_var_coords_normalized(font, memAddress(length));
            return memIntBufferSafe(__result, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_font_set_var_named_instance ] ---

    /** {@code void hb_font_set_var_named_instance(hb_font_t * font, unsigned int instance_index)} */
    public static void hb_font_set_var_named_instance(@NativeType("hb_font_t *") long font, @NativeType("unsigned int") int instance_index) {
        long __functionAddress = Functions.font_set_var_named_instance;
        if (CHECKS) {
            check(font);
        }
        invokePV(font, instance_index, __functionAddress);
    }

    // --- [ hb_font_get_var_named_instance ] ---

    /** {@code unsigned int hb_font_get_var_named_instance(hb_font_t * font)} */
    @NativeType("unsigned int")
    public static int hb_font_get_var_named_instance(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.font_get_var_named_instance;
        if (CHECKS) {
            check(font);
        }
        return invokePI(font, __functionAddress);
    }

    // --- [ hb_ft_face_create ] ---

    /** {@code hb_face_t * hb_ft_face_create(FT_Face ft_face, hb_destroy_func_t destroy)} */
    public static long nhb_ft_face_create(long ft_face, long destroy) {
        long __functionAddress = Functions.ft_face_create;
        if (CHECKS) {
            check(__functionAddress);
            check(ft_face);
        }
        return invokePPP(ft_face, destroy, __functionAddress);
    }

    /** {@code hb_face_t * hb_ft_face_create(FT_Face ft_face, hb_destroy_func_t destroy)} */
    @NativeType("hb_face_t *")
    public static long hb_ft_face_create(@NativeType("FT_Face") long ft_face, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        return nhb_ft_face_create(ft_face, memAddressSafe(destroy));
    }

    // --- [ hb_ft_face_create_cached ] ---

    /** {@code hb_face_t * hb_ft_face_create_cached(FT_Face ft_face)} */
    @NativeType("hb_face_t *")
    public static long hb_ft_face_create_cached(@NativeType("FT_Face") long ft_face) {
        long __functionAddress = Functions.ft_face_create_cached;
        if (CHECKS) {
            check(__functionAddress);
            check(ft_face);
        }
        return invokePP(ft_face, __functionAddress);
    }

    // --- [ hb_ft_face_create_referenced ] ---

    /** {@code hb_face_t * hb_ft_face_create_referenced(FT_Face ft_face)} */
    @NativeType("hb_face_t *")
    public static long hb_ft_face_create_referenced(@NativeType("FT_Face") long ft_face) {
        long __functionAddress = Functions.ft_face_create_referenced;
        if (CHECKS) {
            check(__functionAddress);
            check(ft_face);
        }
        return invokePP(ft_face, __functionAddress);
    }

    // --- [ hb_ft_face_create_from_file_or_fail ] ---

    /** {@code hb_face_t * hb_ft_face_create_from_file_or_fail(char const * file_name, unsigned int index)} */
    public static long nhb_ft_face_create_from_file_or_fail(long file_name, int index) {
        long __functionAddress = Functions.ft_face_create_from_file_or_fail;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(file_name, index, __functionAddress);
    }

    /** {@code hb_face_t * hb_ft_face_create_from_file_or_fail(char const * file_name, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_ft_face_create_from_file_or_fail(@NativeType("char const *") ByteBuffer file_name, @NativeType("unsigned int") int index) {
        if (CHECKS) {
            checkNT1(file_name);
        }
        return nhb_ft_face_create_from_file_or_fail(memAddress(file_name), index);
    }

    /** {@code hb_face_t * hb_ft_face_create_from_file_or_fail(char const * file_name, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_ft_face_create_from_file_or_fail(@NativeType("char const *") CharSequence file_name, @NativeType("unsigned int") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            return nhb_ft_face_create_from_file_or_fail(file_nameEncoded, index);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hb_ft_face_create_from_blob_or_fail ] ---

    /** {@code hb_face_t * hb_ft_face_create_from_blob_or_fail(hb_blob_t * blob, unsigned int index)} */
    @NativeType("hb_face_t *")
    public static long hb_ft_face_create_from_blob_or_fail(@NativeType("hb_blob_t *") long blob, @NativeType("unsigned int") int index) {
        long __functionAddress = Functions.ft_face_create_from_blob_or_fail;
        if (CHECKS) {
            check(__functionAddress);
            check(blob);
        }
        return invokePP(blob, index, __functionAddress);
    }

    // --- [ hb_ft_font_create ] ---

    /** {@code hb_font_t * hb_ft_font_create(FT_Face ft_face, hb_destroy_func_t destroy)} */
    public static long nhb_ft_font_create(long ft_face, long destroy) {
        long __functionAddress = Functions.ft_font_create;
        if (CHECKS) {
            check(__functionAddress);
            check(ft_face);
        }
        return invokePPP(ft_face, destroy, __functionAddress);
    }

    /** {@code hb_font_t * hb_ft_font_create(FT_Face ft_face, hb_destroy_func_t destroy)} */
    @NativeType("hb_font_t *")
    public static long hb_ft_font_create(@NativeType("FT_Face") long ft_face, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        return nhb_ft_font_create(ft_face, memAddressSafe(destroy));
    }

    // --- [ hb_ft_font_create_referenced ] ---

    /** {@code hb_font_t * hb_ft_font_create_referenced(FT_Face ft_face)} */
    @NativeType("hb_font_t *")
    public static long hb_ft_font_create_referenced(@NativeType("FT_Face") long ft_face) {
        long __functionAddress = Functions.ft_font_create_referenced;
        if (CHECKS) {
            check(__functionAddress);
            check(ft_face);
        }
        return invokePP(ft_face, __functionAddress);
    }

    // --- [ hb_ft_font_get_ft_face ] ---

    /** {@code FT_Face hb_ft_font_get_ft_face(hb_font_t * font)} */
    @NativeType("FT_Face")
    public static long hb_ft_font_get_ft_face(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_font_get_ft_face;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        return invokePP(font, __functionAddress);
    }

    // --- [ hb_ft_font_lock_face ] ---

    /** {@code FT_Face hb_ft_font_lock_face(hb_font_t * font)} */
    @NativeType("FT_Face")
    public static long hb_ft_font_lock_face(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_font_lock_face;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        return invokePP(font, __functionAddress);
    }

    // --- [ hb_ft_font_unlock_face ] ---

    /** {@code void hb_ft_font_unlock_face(hb_font_t * font)} */
    public static void hb_ft_font_unlock_face(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_font_unlock_face;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_ft_font_set_load_flags ] ---

    /** {@code void hb_ft_font_set_load_flags(hb_font_t * font, int load_flags)} */
    public static void hb_ft_font_set_load_flags(@NativeType("hb_font_t *") long font, int load_flags) {
        long __functionAddress = Functions.ft_font_set_load_flags;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        invokePV(font, load_flags, __functionAddress);
    }

    // --- [ hb_ft_font_get_load_flags ] ---

    /** {@code int hb_ft_font_get_load_flags(hb_font_t * font)} */
    public static int hb_ft_font_get_load_flags(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_font_get_load_flags;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        return invokePI(font, __functionAddress);
    }

    // --- [ hb_ft_font_changed ] ---

    /** {@code void hb_ft_font_changed(hb_font_t * font)} */
    public static void hb_ft_font_changed(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_font_changed;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_ft_hb_font_changed ] ---

    /** {@code hb_bool_t hb_ft_hb_font_changed(hb_font_t * font)} */
    @NativeType("hb_bool_t")
    public static boolean hb_ft_hb_font_changed(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_hb_font_changed;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        return invokePI(font, __functionAddress) != 0;
    }

    // --- [ hb_ft_font_set_funcs ] ---

    /** {@code void hb_ft_font_set_funcs(hb_font_t * font)} */
    public static void hb_ft_font_set_funcs(@NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.ft_font_set_funcs;
        if (CHECKS) {
            check(__functionAddress);
            check(font);
        }
        invokePV(font, __functionAddress);
    }

    // --- [ hb_map_create ] ---

    /** {@code hb_map_t * hb_map_create(void)} */
    @NativeType("hb_map_t *")
    public static long hb_map_create() {
        long __functionAddress = Functions.map_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_map_get_empty ] ---

    /** {@code hb_map_t * hb_map_get_empty(void)} */
    @NativeType("hb_map_t *")
    public static long hb_map_get_empty() {
        long __functionAddress = Functions.map_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_map_reference ] ---

    /** {@code hb_map_t * hb_map_reference(hb_map_t * map)} */
    @NativeType("hb_map_t *")
    public static long hb_map_reference(@NativeType("hb_map_t *") long map) {
        long __functionAddress = Functions.map_reference;
        if (CHECKS) {
            check(map);
        }
        return invokePP(map, __functionAddress);
    }

    // --- [ hb_map_destroy ] ---

    /** {@code void hb_map_destroy(hb_map_t * map)} */
    public static void hb_map_destroy(@NativeType("hb_map_t *") long map) {
        long __functionAddress = Functions.map_destroy;
        if (CHECKS) {
            check(map);
        }
        invokePV(map, __functionAddress);
    }

    // --- [ hb_map_set_user_data ] ---

    /** {@code hb_bool_t hb_map_set_user_data(hb_map_t * map, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_map_set_user_data(long map, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.map_set_user_data;
        if (CHECKS) {
            check(map);
        }
        return invokePPPPI(map, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_map_set_user_data(hb_map_t * map, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_map_set_user_data(@NativeType("hb_map_t *") long map, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_map_set_user_data(map, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_map_get_user_data ] ---

    /** {@code void * hb_map_get_user_data(hb_map_t const * map, hb_user_data_key_t * key)} */
    public static long nhb_map_get_user_data(long map, long key) {
        long __functionAddress = Functions.map_get_user_data;
        if (CHECKS) {
            check(map);
        }
        return invokePPP(map, key, __functionAddress);
    }

    /** {@code void * hb_map_get_user_data(hb_map_t const * map, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_map_get_user_data(@NativeType("hb_map_t const *") long map, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_map_get_user_data(map, key.address());
    }

    // --- [ hb_map_allocation_successful ] ---

    /** {@code hb_bool_t hb_map_allocation_successful(hb_map_t const * map)} */
    @NativeType("hb_bool_t")
    public static boolean hb_map_allocation_successful(@NativeType("hb_map_t const *") long map) {
        long __functionAddress = Functions.map_allocation_successful;
        if (CHECKS) {
            check(map);
        }
        return invokePI(map, __functionAddress) != 0;
    }

    // --- [ hb_map_copy ] ---

    /** {@code hb_map_t * hb_map_copy(hb_map_t const * map)} */
    @NativeType("hb_map_t *")
    public static long hb_map_copy(@NativeType("hb_map_t const *") long map) {
        long __functionAddress = Functions.map_copy;
        if (CHECKS) {
            check(map);
        }
        return invokePP(map, __functionAddress);
    }

    // --- [ hb_map_clear ] ---

    /** {@code void hb_map_clear(hb_map_t * map)} */
    public static void hb_map_clear(@NativeType("hb_map_t *") long map) {
        long __functionAddress = Functions.map_clear;
        if (CHECKS) {
            check(map);
        }
        invokePV(map, __functionAddress);
    }

    // --- [ hb_map_is_empty ] ---

    /** {@code hb_bool_t hb_map_is_empty(hb_map_t const * map)} */
    @NativeType("hb_bool_t")
    public static boolean hb_map_is_empty(@NativeType("hb_map_t const *") long map) {
        long __functionAddress = Functions.map_is_empty;
        if (CHECKS) {
            check(map);
        }
        return invokePI(map, __functionAddress) != 0;
    }

    // --- [ hb_map_get_population ] ---

    /** {@code unsigned int hb_map_get_population(hb_map_t const * map)} */
    @NativeType("unsigned int")
    public static int hb_map_get_population(@NativeType("hb_map_t const *") long map) {
        long __functionAddress = Functions.map_get_population;
        if (CHECKS) {
            check(map);
        }
        return invokePI(map, __functionAddress);
    }

    // --- [ hb_map_is_equal ] ---

    /** {@code hb_bool_t hb_map_is_equal(hb_map_t const * map, hb_map_t const * other)} */
    @NativeType("hb_bool_t")
    public static boolean hb_map_is_equal(@NativeType("hb_map_t const *") long map, @NativeType("hb_map_t const *") long other) {
        long __functionAddress = Functions.map_is_equal;
        if (CHECKS) {
            check(map);
            check(other);
        }
        return invokePPI(map, other, __functionAddress) != 0;
    }

    // --- [ hb_map_hash ] ---

    /** {@code unsigned int hb_map_hash(hb_map_t const * map)} */
    @NativeType("unsigned int")
    public static int hb_map_hash(@NativeType("hb_map_t const *") long map) {
        long __functionAddress = Functions.map_hash;
        if (CHECKS) {
            check(map);
        }
        return invokePI(map, __functionAddress);
    }

    // --- [ hb_map_set ] ---

    /** {@code void hb_map_set(hb_map_t * map, hb_codepoint_t key, hb_codepoint_t value)} */
    public static void hb_map_set(@NativeType("hb_map_t *") long map, @NativeType("hb_codepoint_t") int key, @NativeType("hb_codepoint_t") int value) {
        long __functionAddress = Functions.map_set;
        if (CHECKS) {
            check(map);
        }
        invokePV(map, key, value, __functionAddress);
    }

    // --- [ hb_map_get ] ---

    /** {@code hb_codepoint_t hb_map_get(hb_map_t const * map, hb_codepoint_t key)} */
    @NativeType("hb_codepoint_t")
    public static int hb_map_get(@NativeType("hb_map_t const *") long map, @NativeType("hb_codepoint_t") int key) {
        long __functionAddress = Functions.map_get;
        if (CHECKS) {
            check(map);
        }
        return invokePI(map, key, __functionAddress);
    }

    // --- [ hb_map_del ] ---

    /** {@code void hb_map_del(hb_map_t * map, hb_codepoint_t key)} */
    public static void hb_map_del(@NativeType("hb_map_t *") long map, @NativeType("hb_codepoint_t") int key) {
        long __functionAddress = Functions.map_del;
        if (CHECKS) {
            check(map);
        }
        invokePV(map, key, __functionAddress);
    }

    // --- [ hb_map_has ] ---

    /** {@code hb_bool_t hb_map_has(hb_map_t const * map, hb_codepoint_t key)} */
    @NativeType("hb_bool_t")
    public static boolean hb_map_has(@NativeType("hb_map_t const *") long map, @NativeType("hb_codepoint_t") int key) {
        long __functionAddress = Functions.map_has;
        if (CHECKS) {
            check(map);
        }
        return invokePI(map, key, __functionAddress) != 0;
    }

    // --- [ hb_map_update ] ---

    /** {@code void hb_map_update(hb_map_t * map, hb_map_t const * other)} */
    public static void hb_map_update(@NativeType("hb_map_t *") long map, @NativeType("hb_map_t const *") long other) {
        long __functionAddress = Functions.map_update;
        if (CHECKS) {
            check(map);
            check(other);
        }
        invokePPV(map, other, __functionAddress);
    }

    // --- [ hb_map_next ] ---

    /** {@code hb_bool_t hb_map_next(hb_map_t const * map, int * idx, hb_codepoint_t * key, hb_codepoint_t * value)} */
    public static int nhb_map_next(long map, long idx, long key, long value) {
        long __functionAddress = Functions.map_next;
        if (CHECKS) {
            check(map);
        }
        return invokePPPPI(map, idx, key, value, __functionAddress);
    }

    /** {@code hb_bool_t hb_map_next(hb_map_t const * map, int * idx, hb_codepoint_t * key, hb_codepoint_t * value)} */
    @NativeType("hb_bool_t")
    public static boolean hb_map_next(@NativeType("hb_map_t const *") long map, @NativeType("int *") IntBuffer idx, @NativeType("hb_codepoint_t *") IntBuffer key, @NativeType("hb_codepoint_t *") IntBuffer value) {
        if (CHECKS) {
            check(idx, 1);
            check(key, 1);
            check(value, 1);
        }
        return nhb_map_next(map, memAddress(idx), memAddress(key), memAddress(value)) != 0;
    }

    // --- [ hb_map_keys ] ---

    /** {@code void hb_map_keys(hb_map_t const * map, hb_set_t * keys)} */
    public static void hb_map_keys(@NativeType("hb_map_t const *") long map, @NativeType("hb_set_t *") long keys) {
        long __functionAddress = Functions.map_keys;
        if (CHECKS) {
            check(map);
            check(keys);
        }
        invokePPV(map, keys, __functionAddress);
    }

    // --- [ hb_map_values ] ---

    /** {@code void hb_map_values(hb_map_t const * map, hb_set_t * values)} */
    public static void hb_map_values(@NativeType("hb_map_t const *") long map, @NativeType("hb_set_t *") long values) {
        long __functionAddress = Functions.map_values;
        if (CHECKS) {
            check(map);
            check(values);
        }
        invokePPV(map, values, __functionAddress);
    }

    // --- [ hb_paint_funcs_create ] ---

    /** {@code hb_paint_funcs_t * hb_paint_funcs_create(void)} */
    @NativeType("hb_paint_funcs_t *")
    public static long hb_paint_funcs_create() {
        long __functionAddress = Functions.paint_funcs_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_paint_funcs_get_empty ] ---

    /** {@code hb_paint_funcs_t * hb_paint_funcs_get_empty(void)} */
    @NativeType("hb_paint_funcs_t *")
    public static long hb_paint_funcs_get_empty() {
        long __functionAddress = Functions.paint_funcs_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_paint_funcs_reference ] ---

    /** {@code hb_paint_funcs_t * hb_paint_funcs_reference(hb_paint_funcs_t * funcs)} */
    @NativeType("hb_paint_funcs_t *")
    public static long hb_paint_funcs_reference(@NativeType("hb_paint_funcs_t *") long funcs) {
        long __functionAddress = Functions.paint_funcs_reference;
        if (CHECKS) {
            check(funcs);
        }
        return invokePP(funcs, __functionAddress);
    }

    // --- [ hb_paint_funcs_destroy ] ---

    /** {@code void hb_paint_funcs_destroy(hb_paint_funcs_t * funcs)} */
    public static void hb_paint_funcs_destroy(@NativeType("hb_paint_funcs_t *") long funcs) {
        long __functionAddress = Functions.paint_funcs_destroy;
        if (CHECKS) {
            check(funcs);
        }
        invokePV(funcs, __functionAddress);
    }

    // --- [ hb_paint_funcs_set_user_data ] ---

    /** {@code hb_bool_t hb_paint_funcs_set_user_data(hb_paint_funcs_t * funcs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_paint_funcs_set_user_data(long funcs, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.paint_funcs_set_user_data;
        if (CHECKS) {
            check(funcs);
        }
        return invokePPPPI(funcs, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_paint_funcs_set_user_data(hb_paint_funcs_t * funcs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_paint_funcs_set_user_data(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_paint_funcs_set_user_data(funcs, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_paint_funcs_get_user_data ] ---

    /** {@code void * hb_paint_funcs_get_user_data(hb_paint_funcs_t const * funcs, hb_user_data_key_t * key)} */
    public static long nhb_paint_funcs_get_user_data(long funcs, long key) {
        long __functionAddress = Functions.paint_funcs_get_user_data;
        if (CHECKS) {
            check(funcs);
        }
        return invokePPP(funcs, key, __functionAddress);
    }

    /** {@code void * hb_paint_funcs_get_user_data(hb_paint_funcs_t const * funcs, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_paint_funcs_get_user_data(@NativeType("hb_paint_funcs_t const *") long funcs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_paint_funcs_get_user_data(funcs, key.address());
    }

    // --- [ hb_paint_funcs_make_immutable ] ---

    /** {@code void hb_paint_funcs_make_immutable(hb_paint_funcs_t * funcs)} */
    public static void hb_paint_funcs_make_immutable(@NativeType("hb_paint_funcs_t *") long funcs) {
        long __functionAddress = Functions.paint_funcs_make_immutable;
        if (CHECKS) {
            check(funcs);
        }
        invokePV(funcs, __functionAddress);
    }

    // --- [ hb_paint_funcs_is_immutable ] ---

    /** {@code hb_bool_t hb_paint_funcs_is_immutable(hb_paint_funcs_t * funcs)} */
    @NativeType("hb_bool_t")
    public static boolean hb_paint_funcs_is_immutable(@NativeType("hb_paint_funcs_t *") long funcs) {
        long __functionAddress = Functions.paint_funcs_is_immutable;
        if (CHECKS) {
            check(funcs);
        }
        return invokePI(funcs, __functionAddress) != 0;
    }

    // --- [ hb_color_line_get_color_stops ] ---

    /** {@code unsigned int hb_color_line_get_color_stops(hb_color_line_t * color_line, unsigned int start, unsigned int * count, hb_color_stop_t * color_stops)} */
    public static int nhb_color_line_get_color_stops(long color_line, int start, long count, long color_stops) {
        long __functionAddress = Functions.color_line_get_color_stops;
        return invokePPPI(color_line, start, count, color_stops, __functionAddress);
    }

    /** {@code unsigned int hb_color_line_get_color_stops(hb_color_line_t * color_line, unsigned int start, unsigned int * count, hb_color_stop_t * color_stops)} */
    @NativeType("unsigned int")
    public static int hb_color_line_get_color_stops(@NativeType("hb_color_line_t *") hb_color_line_t color_line, @NativeType("unsigned int") int start, @NativeType("unsigned int *") IntBuffer count, @NativeType("hb_color_stop_t *") hb_color_stop_t color_stops) {
        if (CHECKS) {
            check(count, 1);
        }
        return nhb_color_line_get_color_stops(color_line.address(), start, memAddress(count), color_stops.address());
    }

    // --- [ hb_color_line_get_extend ] ---

    /** {@code hb_paint_extend_t hb_color_line_get_extend(hb_color_line_t * color_line)} */
    public static int nhb_color_line_get_extend(long color_line) {
        long __functionAddress = Functions.color_line_get_extend;
        return invokePI(color_line, __functionAddress);
    }

    /** {@code hb_paint_extend_t hb_color_line_get_extend(hb_color_line_t * color_line)} */
    @NativeType("hb_paint_extend_t")
    public static int hb_color_line_get_extend(@NativeType("hb_color_line_t *") hb_color_line_t color_line) {
        return nhb_color_line_get_extend(color_line.address());
    }

    // --- [ hb_paint_funcs_set_push_transform_func ] ---

    /** {@code void hb_paint_funcs_set_push_transform_func(hb_paint_funcs_t * funcs, hb_paint_push_transform_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_push_transform_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_push_transform_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_push_transform_func(hb_paint_funcs_t * funcs, hb_paint_push_transform_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_push_transform_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_push_transform_func_t") hb_paint_push_transform_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_push_transform_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_pop_transform_func ] ---

    /** {@code void hb_paint_funcs_set_pop_transform_func(hb_paint_funcs_t * funcs, hb_paint_pop_transform_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_pop_transform_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_pop_transform_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_pop_transform_func(hb_paint_funcs_t * funcs, hb_paint_pop_transform_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_pop_transform_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_pop_transform_func_t") hb_paint_pop_transform_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_pop_transform_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_color_glyph_func ] ---

    /** {@code void hb_paint_funcs_set_color_glyph_func(hb_paint_funcs_t * funcs, hb_paint_color_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_color_glyph_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_color_glyph_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_color_glyph_func(hb_paint_funcs_t * funcs, hb_paint_color_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_color_glyph_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_color_glyph_func_t") hb_paint_color_glyph_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_color_glyph_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_push_clip_glyph_func ] ---

    /** {@code void hb_paint_funcs_set_push_clip_glyph_func(hb_paint_funcs_t * funcs, hb_paint_push_clip_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_push_clip_glyph_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_push_clip_glyph_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_push_clip_glyph_func(hb_paint_funcs_t * funcs, hb_paint_push_clip_glyph_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_push_clip_glyph_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_push_clip_glyph_func_t") hb_paint_push_clip_glyph_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_push_clip_glyph_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_push_clip_rectangle_func ] ---

    /** {@code void hb_paint_funcs_set_push_clip_rectangle_func(hb_paint_funcs_t * funcs, hb_paint_push_clip_rectangle_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_push_clip_rectangle_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_push_clip_rectangle_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_push_clip_rectangle_func(hb_paint_funcs_t * funcs, hb_paint_push_clip_rectangle_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_push_clip_rectangle_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_push_clip_rectangle_func_t") hb_paint_push_clip_rectangle_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_push_clip_rectangle_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_pop_clip_func ] ---

    /** {@code void hb_paint_funcs_set_pop_clip_func(hb_paint_funcs_t * funcs, hb_paint_pop_clip_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_pop_clip_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_pop_clip_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_pop_clip_func(hb_paint_funcs_t * funcs, hb_paint_pop_clip_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_pop_clip_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_pop_clip_func_t") hb_paint_pop_clip_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_pop_clip_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_color_func ] ---

    /** {@code void hb_paint_funcs_set_color_func(hb_paint_funcs_t * funcs, hb_paint_color_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_color_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_color_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_color_func(hb_paint_funcs_t * funcs, hb_paint_color_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_color_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_color_func_t") hb_paint_color_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_color_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_image_func ] ---

    /** {@code void hb_paint_funcs_set_image_func(hb_paint_funcs_t * funcs, hb_paint_image_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_image_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_image_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_image_func(hb_paint_funcs_t * funcs, hb_paint_image_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_image_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_image_func_t") hb_paint_image_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_image_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_linear_gradient_func ] ---

    /** {@code void hb_paint_funcs_set_linear_gradient_func(hb_paint_funcs_t * funcs, hb_paint_linear_gradient_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_linear_gradient_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_linear_gradient_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_linear_gradient_func(hb_paint_funcs_t * funcs, hb_paint_linear_gradient_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_linear_gradient_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_linear_gradient_func_t") hb_paint_linear_gradient_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_linear_gradient_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_radial_gradient_func ] ---

    /** {@code void hb_paint_funcs_set_radial_gradient_func(hb_paint_funcs_t * funcs, hb_paint_radial_gradient_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_radial_gradient_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_radial_gradient_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_radial_gradient_func(hb_paint_funcs_t * funcs, hb_paint_radial_gradient_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_radial_gradient_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_radial_gradient_func_t") hb_paint_radial_gradient_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_radial_gradient_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_sweep_gradient_func ] ---

    /** {@code void hb_paint_funcs_set_sweep_gradient_func(hb_paint_funcs_t * funcs, hb_paint_sweep_gradient_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_sweep_gradient_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_sweep_gradient_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_sweep_gradient_func(hb_paint_funcs_t * funcs, hb_paint_sweep_gradient_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_sweep_gradient_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_sweep_gradient_func_t") hb_paint_sweep_gradient_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_sweep_gradient_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_push_group_func ] ---

    /** {@code void hb_paint_funcs_set_push_group_func(hb_paint_funcs_t * funcs, hb_paint_push_group_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_push_group_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_push_group_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_push_group_func(hb_paint_funcs_t * funcs, hb_paint_push_group_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_push_group_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_push_group_func_t") hb_paint_push_group_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_push_group_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_pop_group_func ] ---

    /** {@code void hb_paint_funcs_set_pop_group_func(hb_paint_funcs_t * funcs, hb_paint_pop_group_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_pop_group_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_pop_group_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_pop_group_func(hb_paint_funcs_t * funcs, hb_paint_pop_group_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_pop_group_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_pop_group_func_t") hb_paint_pop_group_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_pop_group_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_funcs_set_custom_palette_color_func ] ---

    /** {@code void hb_paint_funcs_set_custom_palette_color_func(hb_paint_funcs_t * funcs, hb_paint_custom_palette_color_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_paint_funcs_set_custom_palette_color_func(long funcs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.paint_funcs_set_custom_palette_color_func;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPPV(funcs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_paint_funcs_set_custom_palette_color_func(hb_paint_funcs_t * funcs, hb_paint_custom_palette_color_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_paint_funcs_set_custom_palette_color_func(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("hb_paint_custom_palette_color_func_t") hb_paint_custom_palette_color_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_paint_funcs_set_custom_palette_color_func(funcs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_paint_push_transform ] ---

    /** {@code void hb_paint_push_transform(hb_paint_funcs_t * funcs, void * paint_data, float xx, float yx, float xy, float yy, float dx, float dy)} */
    public static void hb_paint_push_transform(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, float xx, float yx, float xy, float yy, float dx, float dy) {
        long __functionAddress = Functions.paint_push_transform;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, xx, yx, xy, yy, dx, dy, __functionAddress);
    }

    // --- [ hb_paint_push_font_transform ] ---

    /** {@code void hb_paint_push_font_transform(hb_paint_funcs_t * funcs, void * paint_data, hb_font_t const * font)} */
    public static void hb_paint_push_font_transform(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_font_t const *") long font) {
        long __functionAddress = Functions.paint_push_font_transform;
        if (CHECKS) {
            check(funcs);
            check(font);
        }
        invokePPPV(funcs, paint_data, font, __functionAddress);
    }

    // --- [ hb_paint_push_inverse_font_transform ] ---

    /** {@code void hb_paint_push_inverse_font_transform(hb_paint_funcs_t * funcs, void * paint_data, hb_font_t const * font)} */
    public static void hb_paint_push_inverse_font_transform(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_font_t const *") long font) {
        long __functionAddress = Functions.paint_push_inverse_font_transform;
        if (CHECKS) {
            check(funcs);
            check(font);
        }
        invokePPPV(funcs, paint_data, font, __functionAddress);
    }

    // --- [ hb_paint_pop_transform ] ---

    /** {@code void hb_paint_pop_transform(hb_paint_funcs_t * funcs, void * paint_data)} */
    public static void hb_paint_pop_transform(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data) {
        long __functionAddress = Functions.paint_pop_transform;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, __functionAddress);
    }

    // --- [ hb_paint_color_glyph ] ---

    /** {@code void hb_paint_color_glyph(hb_paint_funcs_t * funcs, void * paint_data, hb_codepoint_t glyph, hb_font_t * font)} */
    public static void hb_paint_color_glyph(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.paint_color_glyph;
        if (CHECKS) {
            check(funcs);
            check(font);
        }
        invokePPPV(funcs, paint_data, glyph, font, __functionAddress);
    }

    // --- [ hb_paint_push_clip_glyph ] ---

    /** {@code void hb_paint_push_clip_glyph(hb_paint_funcs_t * funcs, void * paint_data, hb_codepoint_t glyph, hb_font_t * font)} */
    public static void hb_paint_push_clip_glyph(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_codepoint_t") int glyph, @NativeType("hb_font_t *") long font) {
        long __functionAddress = Functions.paint_push_clip_glyph;
        if (CHECKS) {
            check(funcs);
            check(font);
        }
        invokePPPV(funcs, paint_data, glyph, font, __functionAddress);
    }

    // --- [ hb_paint_push_clip_rectangle ] ---

    /** {@code void hb_paint_push_clip_rectangle(hb_paint_funcs_t * funcs, void * paint_data, float xmin, float ymin, float xmax, float ymax)} */
    public static void hb_paint_push_clip_rectangle(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, float xmin, float ymin, float xmax, float ymax) {
        long __functionAddress = Functions.paint_push_clip_rectangle;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, xmin, ymin, xmax, ymax, __functionAddress);
    }

    // --- [ hb_paint_pop_clip ] ---

    /** {@code void hb_paint_pop_clip(hb_paint_funcs_t * funcs, void * paint_data)} */
    public static void hb_paint_pop_clip(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data) {
        long __functionAddress = Functions.paint_pop_clip;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, __functionAddress);
    }

    // --- [ hb_paint_color ] ---

    /** {@code void hb_paint_color(hb_paint_funcs_t * funcs, void * paint_data, hb_bool_t is_foreground, hb_color_t color)} */
    public static void hb_paint_color(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_bool_t") boolean is_foreground, @NativeType("hb_color_t") int color) {
        long __functionAddress = Functions.paint_color;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, is_foreground ? 1 : 0, color, __functionAddress);
    }

    // --- [ hb_paint_image ] ---

    /** {@code void hb_paint_image(hb_paint_funcs_t * funcs, void * paint_data, hb_blob_t * image, unsigned int width, unsigned int height, hb_tag_t format, float slant, hb_glyph_extents_t * extents)} */
    public static void nhb_paint_image(long funcs, long paint_data, long image, int width, int height, int format, float slant, long extents) {
        long __functionAddress = Functions.paint_image;
        if (CHECKS) {
            check(funcs);
            check(image);
        }
        invokePPPPV(funcs, paint_data, image, width, height, format, slant, extents, __functionAddress);
    }

    /** {@code void hb_paint_image(hb_paint_funcs_t * funcs, void * paint_data, hb_blob_t * image, unsigned int width, unsigned int height, hb_tag_t format, float slant, hb_glyph_extents_t * extents)} */
    public static void hb_paint_image(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_blob_t *") long image, @NativeType("unsigned int") int width, @NativeType("unsigned int") int height, @NativeType("hb_tag_t") int format, float slant, @NativeType("hb_glyph_extents_t *") hb_glyph_extents_t extents) {
        nhb_paint_image(funcs, paint_data, image, width, height, format, slant, extents.address());
    }

    // --- [ hb_paint_linear_gradient ] ---

    /** {@code void hb_paint_linear_gradient(hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float yx0, float x1, float y1, float x2, float y2)} */
    public static void nhb_paint_linear_gradient(long funcs, long paint_data, long color_line, float x0, float yx0, float x1, float y1, float x2, float y2) {
        long __functionAddress = Functions.paint_linear_gradient;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPV(funcs, paint_data, color_line, x0, yx0, x1, y1, x2, y2, __functionAddress);
    }

    /** {@code void hb_paint_linear_gradient(hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float yx0, float x1, float y1, float x2, float y2)} */
    public static void hb_paint_linear_gradient(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_color_line_t *") hb_color_line_t color_line, float x0, float yx0, float x1, float y1, float x2, float y2) {
        nhb_paint_linear_gradient(funcs, paint_data, color_line.address(), x0, yx0, x1, y1, x2, y2);
    }

    // --- [ hb_paint_radial_gradient ] ---

    /** {@code void hb_paint_radial_gradient(hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float y0, float r0, float x1, float y1, float r1)} */
    public static void nhb_paint_radial_gradient(long funcs, long paint_data, long color_line, float x0, float y0, float r0, float x1, float y1, float r1) {
        long __functionAddress = Functions.paint_radial_gradient;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPV(funcs, paint_data, color_line, x0, y0, r0, x1, y1, r1, __functionAddress);
    }

    /** {@code void hb_paint_radial_gradient(hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float y0, float r0, float x1, float y1, float r1)} */
    public static void hb_paint_radial_gradient(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_color_line_t *") hb_color_line_t color_line, float x0, float y0, float r0, float x1, float y1, float r1) {
        nhb_paint_radial_gradient(funcs, paint_data, color_line.address(), x0, y0, r0, x1, y1, r1);
    }

    // --- [ hb_paint_sweep_gradient ] ---

    /** {@code void hb_paint_sweep_gradient(hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float y0, float start_angle, float end_angle)} */
    public static void nhb_paint_sweep_gradient(long funcs, long paint_data, long color_line, float x0, float y0, float start_angle, float end_angle) {
        long __functionAddress = Functions.paint_sweep_gradient;
        if (CHECKS) {
            check(funcs);
        }
        invokePPPV(funcs, paint_data, color_line, x0, y0, start_angle, end_angle, __functionAddress);
    }

    /** {@code void hb_paint_sweep_gradient(hb_paint_funcs_t * funcs, void * paint_data, hb_color_line_t * color_line, float x0, float y0, float start_angle, float end_angle)} */
    public static void hb_paint_sweep_gradient(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_color_line_t *") hb_color_line_t color_line, float x0, float y0, float start_angle, float end_angle) {
        nhb_paint_sweep_gradient(funcs, paint_data, color_line.address(), x0, y0, start_angle, end_angle);
    }

    // --- [ hb_paint_push_group ] ---

    /** {@code void hb_paint_push_group(hb_paint_funcs_t * funcs, void * paint_data)} */
    public static void hb_paint_push_group(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data) {
        long __functionAddress = Functions.paint_push_group;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, __functionAddress);
    }

    // --- [ hb_paint_pop_group ] ---

    /** {@code void hb_paint_pop_group(hb_paint_funcs_t * funcs, void * paint_data, hb_paint_composite_mode_t mode)} */
    public static void hb_paint_pop_group(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("hb_paint_composite_mode_t") int mode) {
        long __functionAddress = Functions.paint_pop_group;
        if (CHECKS) {
            check(funcs);
        }
        invokePPV(funcs, paint_data, mode, __functionAddress);
    }

    // --- [ hb_paint_custom_palette_color ] ---

    /** {@code hb_bool_t hb_paint_custom_palette_color(hb_paint_funcs_t * funcs, void * paint_data, unsigned int color_index, hb_color_t * color)} */
    public static int nhb_paint_custom_palette_color(long funcs, long paint_data, int color_index, long color) {
        long __functionAddress = Functions.paint_custom_palette_color;
        if (CHECKS) {
            check(funcs);
        }
        return invokePPPI(funcs, paint_data, color_index, color, __functionAddress);
    }

    /** {@code hb_bool_t hb_paint_custom_palette_color(hb_paint_funcs_t * funcs, void * paint_data, unsigned int color_index, hb_color_t * color)} */
    @NativeType("hb_bool_t")
    public static boolean hb_paint_custom_palette_color(@NativeType("hb_paint_funcs_t *") long funcs, @NativeType("void *") long paint_data, @NativeType("unsigned int") int color_index, @NativeType("hb_color_t *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        return nhb_paint_custom_palette_color(funcs, paint_data, color_index, memAddress(color)) != 0;
    }

    // --- [ hb_set_create ] ---

    /** {@code hb_set_t * hb_set_create(void)} */
    @NativeType("hb_set_t *")
    public static long hb_set_create() {
        long __functionAddress = Functions.set_create;
        return invokeP(__functionAddress);
    }

    // --- [ hb_set_get_empty ] ---

    /** {@code hb_set_t * hb_set_get_empty(void)} */
    @NativeType("hb_set_t *")
    public static long hb_set_get_empty() {
        long __functionAddress = Functions.set_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_set_reference ] ---

    /** {@code hb_set_t * hb_set_reference(hb_set_t * set)} */
    @NativeType("hb_set_t *")
    public static long hb_set_reference(@NativeType("hb_set_t *") long set) {
        long __functionAddress = Functions.set_reference;
        if (CHECKS) {
            check(set);
        }
        return invokePP(set, __functionAddress);
    }

    // --- [ hb_set_destroy ] ---

    /** {@code void hb_set_destroy(hb_set_t * set)} */
    public static void hb_set_destroy(@NativeType("hb_set_t *") long set) {
        long __functionAddress = Functions.set_destroy;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, __functionAddress);
    }

    // --- [ hb_set_set_user_data ] ---

    /** {@code hb_bool_t hb_set_set_user_data(hb_set_t * set, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_set_set_user_data(long set, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.set_set_user_data;
        if (CHECKS) {
            check(set);
        }
        return invokePPPPI(set, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_set_set_user_data(hb_set_t * set, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_set_user_data(@NativeType("hb_set_t *") long set, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_set_set_user_data(set, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_set_get_user_data ] ---

    /** {@code void * hb_set_get_user_data(hb_set_t const * set, hb_user_data_key_t * key)} */
    public static long nhb_set_get_user_data(long set, long key) {
        long __functionAddress = Functions.set_get_user_data;
        if (CHECKS) {
            check(set);
        }
        return invokePPP(set, key, __functionAddress);
    }

    /** {@code void * hb_set_get_user_data(hb_set_t const * set, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_set_get_user_data(@NativeType("hb_set_t const *") long set, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_set_get_user_data(set, key.address());
    }

    // --- [ hb_set_allocation_successful ] ---

    /** {@code hb_bool_t hb_set_allocation_successful(hb_set_t const * set)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_allocation_successful(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_allocation_successful;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress) != 0;
    }

    // --- [ hb_set_copy ] ---

    /** {@code hb_set_t * hb_set_copy(hb_set_t const * set)} */
    @NativeType("hb_set_t *")
    public static long hb_set_copy(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_copy;
        if (CHECKS) {
            check(set);
        }
        return invokePP(set, __functionAddress);
    }

    // --- [ hb_set_clear ] ---

    /** {@code void hb_set_clear(hb_set_t * set)} */
    public static void hb_set_clear(@NativeType("hb_set_t *") long set) {
        long __functionAddress = Functions.set_clear;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, __functionAddress);
    }

    // --- [ hb_set_is_empty ] ---

    /** {@code hb_bool_t hb_set_is_empty(hb_set_t const * set)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_is_empty(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_is_empty;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress) != 0;
    }

    // --- [ hb_set_invert ] ---

    /** {@code void hb_set_invert(hb_set_t * set)} */
    public static void hb_set_invert(@NativeType("hb_set_t *") long set) {
        long __functionAddress = Functions.set_invert;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, __functionAddress);
    }

    // --- [ hb_set_is_inverted ] ---

    /** {@code hb_bool_t hb_set_is_inverted(hb_set_t const * set)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_is_inverted(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_is_inverted;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress) != 0;
    }

    // --- [ hb_set_has ] ---

    /** {@code hb_bool_t hb_set_has(hb_set_t const * set, hb_codepoint_t codepoint)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_has(@NativeType("hb_set_t const *") long set, @NativeType("hb_codepoint_t") int codepoint) {
        long __functionAddress = Functions.set_has;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, codepoint, __functionAddress) != 0;
    }

    // --- [ hb_set_add ] ---

    /** {@code void hb_set_add(hb_set_t * set, hb_codepoint_t codepoint)} */
    public static void hb_set_add(@NativeType("hb_set_t *") long set, @NativeType("hb_codepoint_t") int codepoint) {
        long __functionAddress = Functions.set_add;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, codepoint, __functionAddress);
    }

    // --- [ hb_set_add_range ] ---

    /** {@code void hb_set_add_range(hb_set_t * set, hb_codepoint_t first, hb_codepoint_t last)} */
    public static void hb_set_add_range(@NativeType("hb_set_t *") long set, @NativeType("hb_codepoint_t") int first, @NativeType("hb_codepoint_t") int last) {
        long __functionAddress = Functions.set_add_range;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, first, last, __functionAddress);
    }

    // --- [ hb_set_add_sorted_array ] ---

    /** {@code void hb_set_add_sorted_array(hb_set_t * set, hb_codepoint_t const * sorted_codepoints, unsigned int num_codepoints)} */
    public static void nhb_set_add_sorted_array(long set, long sorted_codepoints, int num_codepoints) {
        long __functionAddress = Functions.set_add_sorted_array;
        if (CHECKS) {
            check(set);
        }
        invokePPV(set, sorted_codepoints, num_codepoints, __functionAddress);
    }

    /** {@code void hb_set_add_sorted_array(hb_set_t * set, hb_codepoint_t const * sorted_codepoints, unsigned int num_codepoints)} */
    public static void hb_set_add_sorted_array(@NativeType("hb_set_t *") long set, @NativeType("hb_codepoint_t const *") IntBuffer sorted_codepoints) {
        nhb_set_add_sorted_array(set, memAddress(sorted_codepoints), sorted_codepoints.remaining());
    }

    // --- [ hb_set_del ] ---

    /** {@code void hb_set_del(hb_set_t * set, hb_codepoint_t codepoint)} */
    public static void hb_set_del(@NativeType("hb_set_t *") long set, @NativeType("hb_codepoint_t") int codepoint) {
        long __functionAddress = Functions.set_del;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, codepoint, __functionAddress);
    }

    // --- [ hb_set_del_range ] ---

    /** {@code void hb_set_del_range(hb_set_t * set, hb_codepoint_t first, hb_codepoint_t last)} */
    public static void hb_set_del_range(@NativeType("hb_set_t *") long set, @NativeType("hb_codepoint_t") int first, @NativeType("hb_codepoint_t") int last) {
        long __functionAddress = Functions.set_del_range;
        if (CHECKS) {
            check(set);
        }
        invokePV(set, first, last, __functionAddress);
    }

    // --- [ hb_set_is_equal ] ---

    /** {@code hb_bool_t hb_set_is_equal(hb_set_t const * set, hb_set_t const * other)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_is_equal(@NativeType("hb_set_t const *") long set, @NativeType("hb_set_t const *") long other) {
        long __functionAddress = Functions.set_is_equal;
        if (CHECKS) {
            check(set);
            check(other);
        }
        return invokePPI(set, other, __functionAddress) != 0;
    }

    // --- [ hb_set_hash ] ---

    /** {@code unsigned int hb_set_hash(hb_set_t const * set)} */
    @NativeType("unsigned int")
    public static int hb_set_hash(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_hash;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress);
    }

    // --- [ hb_set_is_subset ] ---

    /** {@code hb_bool_t hb_set_is_subset(hb_set_t const * set, hb_set_t const * larger_set)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_is_subset(@NativeType("hb_set_t const *") long set, @NativeType("hb_set_t const *") long larger_set) {
        long __functionAddress = Functions.set_is_subset;
        if (CHECKS) {
            check(set);
            check(larger_set);
        }
        return invokePPI(set, larger_set, __functionAddress) != 0;
    }

    // --- [ hb_set_set ] ---

    /** {@code void hb_set_set(hb_set_t * set, hb_set_t const * other)} */
    public static void hb_set_set(@NativeType("hb_set_t *") long set, @NativeType("hb_set_t const *") long other) {
        long __functionAddress = Functions.set_set;
        if (CHECKS) {
            check(set);
            check(other);
        }
        invokePPV(set, other, __functionAddress);
    }

    // --- [ hb_set_union ] ---

    /** {@code void hb_set_union(hb_set_t * set, hb_set_t const * other)} */
    public static void hb_set_union(@NativeType("hb_set_t *") long set, @NativeType("hb_set_t const *") long other) {
        long __functionAddress = Functions.set_union;
        if (CHECKS) {
            check(set);
            check(other);
        }
        invokePPV(set, other, __functionAddress);
    }

    // --- [ hb_set_intersect ] ---

    /** {@code void hb_set_intersect(hb_set_t * set, hb_set_t const * other)} */
    public static void hb_set_intersect(@NativeType("hb_set_t *") long set, @NativeType("hb_set_t const *") long other) {
        long __functionAddress = Functions.set_intersect;
        if (CHECKS) {
            check(set);
            check(other);
        }
        invokePPV(set, other, __functionAddress);
    }

    // --- [ hb_set_subtract ] ---

    /** {@code void hb_set_subtract(hb_set_t * set, hb_set_t const * other)} */
    public static void hb_set_subtract(@NativeType("hb_set_t *") long set, @NativeType("hb_set_t const *") long other) {
        long __functionAddress = Functions.set_subtract;
        if (CHECKS) {
            check(set);
            check(other);
        }
        invokePPV(set, other, __functionAddress);
    }

    // --- [ hb_set_symmetric_difference ] ---

    /** {@code void hb_set_symmetric_difference(hb_set_t * set, hb_set_t const * other)} */
    public static void hb_set_symmetric_difference(@NativeType("hb_set_t *") long set, @NativeType("hb_set_t const *") long other) {
        long __functionAddress = Functions.set_symmetric_difference;
        if (CHECKS) {
            check(set);
            check(other);
        }
        invokePPV(set, other, __functionAddress);
    }

    // --- [ hb_set_get_population ] ---

    /** {@code unsigned int hb_set_get_population(hb_set_t const * set)} */
    @NativeType("unsigned int")
    public static int hb_set_get_population(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_get_population;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress);
    }

    // --- [ hb_set_get_min ] ---

    /** {@code hb_codepoint_t hb_set_get_min(hb_set_t const * set)} */
    @NativeType("hb_codepoint_t")
    public static int hb_set_get_min(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_get_min;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress);
    }

    // --- [ hb_set_get_max ] ---

    /** {@code hb_codepoint_t hb_set_get_max(hb_set_t const * set)} */
    @NativeType("hb_codepoint_t")
    public static int hb_set_get_max(@NativeType("hb_set_t const *") long set) {
        long __functionAddress = Functions.set_get_max;
        if (CHECKS) {
            check(set);
        }
        return invokePI(set, __functionAddress);
    }

    // --- [ hb_set_next ] ---

    /** {@code hb_bool_t hb_set_next(hb_set_t const * set, hb_codepoint_t * codepoint)} */
    public static int nhb_set_next(long set, long codepoint) {
        long __functionAddress = Functions.set_next;
        if (CHECKS) {
            check(set);
        }
        return invokePPI(set, codepoint, __functionAddress);
    }

    /** {@code hb_bool_t hb_set_next(hb_set_t const * set, hb_codepoint_t * codepoint)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_next(@NativeType("hb_set_t const *") long set, @NativeType("hb_codepoint_t *") IntBuffer codepoint) {
        if (CHECKS) {
            check(codepoint, 1);
        }
        return nhb_set_next(set, memAddress(codepoint)) != 0;
    }

    // --- [ hb_set_previous ] ---

    /** {@code hb_bool_t hb_set_previous(hb_set_t const * set, hb_codepoint_t * codepoint)} */
    public static int nhb_set_previous(long set, long codepoint) {
        long __functionAddress = Functions.set_previous;
        if (CHECKS) {
            check(set);
        }
        return invokePPI(set, codepoint, __functionAddress);
    }

    /** {@code hb_bool_t hb_set_previous(hb_set_t const * set, hb_codepoint_t * codepoint)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_previous(@NativeType("hb_set_t const *") long set, @NativeType("hb_codepoint_t *") IntBuffer codepoint) {
        if (CHECKS) {
            check(codepoint, 1);
        }
        return nhb_set_previous(set, memAddress(codepoint)) != 0;
    }

    // --- [ hb_set_next_range ] ---

    /** {@code hb_bool_t hb_set_next_range(hb_set_t const * set, hb_codepoint_t * first, hb_codepoint_t * last)} */
    public static int nhb_set_next_range(long set, long first, long last) {
        long __functionAddress = Functions.set_next_range;
        if (CHECKS) {
            check(set);
        }
        return invokePPPI(set, first, last, __functionAddress);
    }

    /** {@code hb_bool_t hb_set_next_range(hb_set_t const * set, hb_codepoint_t * first, hb_codepoint_t * last)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_next_range(@NativeType("hb_set_t const *") long set, @NativeType("hb_codepoint_t *") IntBuffer first, @NativeType("hb_codepoint_t *") IntBuffer last) {
        if (CHECKS) {
            check(first, 1);
            check(last, 1);
        }
        return nhb_set_next_range(set, memAddress(first), memAddress(last)) != 0;
    }

    // --- [ hb_set_previous_range ] ---

    /** {@code hb_bool_t hb_set_previous_range(hb_set_t const * set, hb_codepoint_t * first, hb_codepoint_t * last)} */
    public static int nhb_set_previous_range(long set, long first, long last) {
        long __functionAddress = Functions.set_previous_range;
        if (CHECKS) {
            check(set);
        }
        return invokePPPI(set, first, last, __functionAddress);
    }

    /** {@code hb_bool_t hb_set_previous_range(hb_set_t const * set, hb_codepoint_t * first, hb_codepoint_t * last)} */
    @NativeType("hb_bool_t")
    public static boolean hb_set_previous_range(@NativeType("hb_set_t const *") long set, @NativeType("hb_codepoint_t *") IntBuffer first, @NativeType("hb_codepoint_t *") IntBuffer last) {
        if (CHECKS) {
            check(first, 1);
            check(last, 1);
        }
        return nhb_set_previous_range(set, memAddress(first), memAddress(last)) != 0;
    }

    // --- [ hb_set_next_many ] ---

    /** {@code unsigned int hb_set_next_many(hb_set_t const * set, hb_codepoint_t codepoint, hb_codepoint_t * out, unsigned int size)} */
    public static int nhb_set_next_many(long set, int codepoint, long out, int size) {
        long __functionAddress = Functions.set_next_many;
        if (CHECKS) {
            check(set);
        }
        return invokePPI(set, codepoint, out, size, __functionAddress);
    }

    /** {@code unsigned int hb_set_next_many(hb_set_t const * set, hb_codepoint_t codepoint, hb_codepoint_t * out, unsigned int size)} */
    @NativeType("unsigned int")
    public static int hb_set_next_many(@NativeType("hb_set_t const *") long set, @NativeType("hb_codepoint_t") int codepoint, @NativeType("hb_codepoint_t *") IntBuffer out) {
        return nhb_set_next_many(set, codepoint, memAddress(out), out.remaining());
    }

    // --- [ hb_shape ] ---

    /** {@code void hb_shape(hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features)} */
    public static void nhb_shape(long font, long buffer, long features, int num_features) {
        long __functionAddress = Functions.shape;
        if (CHECKS) {
            check(font);
            check(buffer);
        }
        invokePPPV(font, buffer, features, num_features, __functionAddress);
    }

    /** {@code void hb_shape(hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features)} */
    public static void hb_shape(@NativeType("hb_font_t *") long font, @NativeType("hb_buffer_t *") long buffer, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer features) {
        nhb_shape(font, buffer, memAddressSafe(features), remainingSafe(features));
    }

    // --- [ hb_shape_full ] ---

    /** {@code hb_bool_t hb_shape_full(hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features, char const * const * shaper_list)} */
    public static int nhb_shape_full(long font, long buffer, long features, int num_features, long shaper_list) {
        long __functionAddress = Functions.shape_full;
        if (CHECKS) {
            check(font);
            check(buffer);
        }
        return invokePPPPI(font, buffer, features, num_features, shaper_list, __functionAddress);
    }

    /** {@code hb_bool_t hb_shape_full(hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features, char const * const * shaper_list)} */
    @NativeType("hb_bool_t")
    public static boolean hb_shape_full(@NativeType("hb_font_t *") long font, @NativeType("hb_buffer_t *") long buffer, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer features, @NativeType("char const * const *") @Nullable PointerBuffer shaper_list) {
        if (CHECKS) {
            checkNTSafe(shaper_list);
        }
        return nhb_shape_full(font, buffer, memAddressSafe(features), remainingSafe(features), memAddressSafe(shaper_list)) != 0;
    }

    // --- [ hb_shape_justify ] ---

    /** {@code hb_bool_t hb_shape_justify(hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features, char const * const * shaper_list, float min_target_advance, float max_target_advance, float * advance, hb_tag_t * var_tag, float * var_value)} */
    public static int nhb_shape_justify(long font, long buffer, long features, int num_features, long shaper_list, float min_target_advance, float max_target_advance, long advance, long var_tag, long var_value) {
        long __functionAddress = Functions.shape_justify;
        if (CHECKS) {
            check(font);
            check(buffer);
        }
        return invokePPPPPPPI(font, buffer, features, num_features, shaper_list, min_target_advance, max_target_advance, advance, var_tag, var_value, __functionAddress);
    }

    /** {@code hb_bool_t hb_shape_justify(hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features, char const * const * shaper_list, float min_target_advance, float max_target_advance, float * advance, hb_tag_t * var_tag, float * var_value)} */
    @NativeType("hb_bool_t")
    public static boolean hb_shape_justify(@NativeType("hb_font_t *") long font, @NativeType("hb_buffer_t *") long buffer, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer features, @NativeType("char const * const *") @Nullable PointerBuffer shaper_list, float min_target_advance, float max_target_advance, @NativeType("float *") FloatBuffer advance, @NativeType("hb_tag_t *") IntBuffer var_tag, @NativeType("float *") FloatBuffer var_value) {
        if (CHECKS) {
            checkNTSafe(shaper_list);
            check(advance, 1);
            check(var_tag, 1);
            check(var_value, 1);
        }
        return nhb_shape_justify(font, buffer, memAddressSafe(features), remainingSafe(features), memAddressSafe(shaper_list), min_target_advance, max_target_advance, memAddress(advance), memAddress(var_tag), memAddress(var_value)) != 0;
    }

    // --- [ hb_shape_list_shapers ] ---

    /** {@code char const ** hb_shape_list_shapers(void)} */
    public static long nhb_shape_list_shapers() {
        long __functionAddress = Functions.shape_list_shapers;
        return invokeP(__functionAddress);
    }

    /** {@code char const ** hb_shape_list_shapers(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_shape_list_shapers() {
        long __result = nhb_shape_list_shapers();
        return memPointerBufferSafe(__result, shape_list_shapers_COUNT);
    }

    /** {@code char const ** hb_shape_list_shapers(void)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer hb_shape_list_shapers(long length) {
        long __result = nhb_shape_list_shapers();
        return memPointerBufferSafe(__result, (int)length);
    }

    // --- [ hb_shape_plan_create ] ---

    /** {@code hb_shape_plan_t * hb_shape_plan_create(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, char const * const * shaper_list)} */
    public static long nhb_shape_plan_create(long face, long props, long user_features, int num_user_features, long shaper_list) {
        long __functionAddress = Functions.shape_plan_create;
        return invokePPPPP(face, props, user_features, num_user_features, shaper_list, __functionAddress);
    }

    /** {@code hb_shape_plan_t * hb_shape_plan_create(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, char const * const * shaper_list)} */
    @NativeType("hb_shape_plan_t *")
    public static long hb_shape_plan_create(@NativeType("hb_face_t *") long face, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t props, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer user_features, @NativeType("char const * const *") @Nullable PointerBuffer shaper_list) {
        if (CHECKS) {
            checkNTSafe(shaper_list);
        }
        return nhb_shape_plan_create(face, props.address(), memAddressSafe(user_features), remainingSafe(user_features), memAddressSafe(shaper_list));
    }

    // --- [ hb_shape_plan_create_cached ] ---

    /** {@code hb_shape_plan_t * hb_shape_plan_create_cached(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, char const * const * shaper_list)} */
    public static long nhb_shape_plan_create_cached(long face, long props, long user_features, int num_user_features, long shaper_list) {
        long __functionAddress = Functions.shape_plan_create_cached;
        return invokePPPPP(face, props, user_features, num_user_features, shaper_list, __functionAddress);
    }

    /** {@code hb_shape_plan_t * hb_shape_plan_create_cached(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, char const * const * shaper_list)} */
    @NativeType("hb_shape_plan_t *")
    public static long hb_shape_plan_create_cached(@NativeType("hb_face_t *") long face, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t props, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer user_features, @NativeType("char const * const *") @Nullable PointerBuffer shaper_list) {
        if (CHECKS) {
            checkNTSafe(shaper_list);
        }
        return nhb_shape_plan_create_cached(face, props.address(), memAddressSafe(user_features), remainingSafe(user_features), memAddressSafe(shaper_list));
    }

    // --- [ hb_shape_plan_create2 ] ---

    /** {@code hb_shape_plan_t * hb_shape_plan_create2(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, int const * coords, unsigned int num_coords, char const * const * shaper_list)} */
    public static long nhb_shape_plan_create2(long face, long props, long user_features, int num_user_features, long coords, int num_coords, long shaper_list) {
        long __functionAddress = Functions.shape_plan_create2;
        return invokePPPPPP(face, props, user_features, num_user_features, coords, num_coords, shaper_list, __functionAddress);
    }

    /** {@code hb_shape_plan_t * hb_shape_plan_create2(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, int const * coords, unsigned int num_coords, char const * const * shaper_list)} */
    @NativeType("hb_shape_plan_t *")
    public static long hb_shape_plan_create2(@NativeType("hb_face_t *") long face, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t props, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer user_features, @NativeType("int const *") @Nullable IntBuffer coords, @NativeType("char const * const *") @Nullable PointerBuffer shaper_list) {
        if (CHECKS) {
            checkNTSafe(shaper_list);
        }
        return nhb_shape_plan_create2(face, props.address(), memAddressSafe(user_features), remainingSafe(user_features), memAddressSafe(coords), remainingSafe(coords), memAddressSafe(shaper_list));
    }

    // --- [ hb_shape_plan_create_cached2 ] ---

    /** {@code hb_shape_plan_t * hb_shape_plan_create_cached2(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, int const * coords, unsigned int num_coords, char const * const * shaper_list)} */
    public static long nhb_shape_plan_create_cached2(long face, long props, long user_features, int num_user_features, long coords, int num_coords, long shaper_list) {
        long __functionAddress = Functions.shape_plan_create_cached2;
        return invokePPPPPP(face, props, user_features, num_user_features, coords, num_coords, shaper_list, __functionAddress);
    }

    /** {@code hb_shape_plan_t * hb_shape_plan_create_cached2(hb_face_t * face, hb_segment_properties_t const * props, hb_feature_t const * user_features, unsigned int num_user_features, int const * coords, unsigned int num_coords, char const * const * shaper_list)} */
    @NativeType("hb_shape_plan_t *")
    public static long hb_shape_plan_create_cached2(@NativeType("hb_face_t *") long face, @NativeType("hb_segment_properties_t const *") hb_segment_properties_t props, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer user_features, @NativeType("int const *") @Nullable IntBuffer coords, @NativeType("char const * const *") @Nullable PointerBuffer shaper_list) {
        if (CHECKS) {
            checkNTSafe(shaper_list);
        }
        return nhb_shape_plan_create_cached2(face, props.address(), memAddressSafe(user_features), remainingSafe(user_features), memAddressSafe(coords), remainingSafe(coords), memAddressSafe(shaper_list));
    }

    // --- [ hb_shape_plan_get_empty ] ---

    /** {@code hb_shape_plan_t * hb_shape_plan_get_empty(void)} */
    @NativeType("hb_shape_plan_t *")
    public static long hb_shape_plan_get_empty() {
        long __functionAddress = Functions.shape_plan_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_shape_plan_reference ] ---

    /** {@code hb_shape_plan_t * hb_shape_plan_reference(hb_shape_plan_t * shape_plan)} */
    @NativeType("hb_shape_plan_t *")
    public static long hb_shape_plan_reference(@NativeType("hb_shape_plan_t *") long shape_plan) {
        long __functionAddress = Functions.shape_plan_reference;
        if (CHECKS) {
            check(shape_plan);
        }
        return invokePP(shape_plan, __functionAddress);
    }

    // --- [ hb_shape_plan_destroy ] ---

    /** {@code void hb_shape_plan_destroy(hb_shape_plan_t * shape_plan)} */
    public static void hb_shape_plan_destroy(@NativeType("hb_shape_plan_t *") long shape_plan) {
        long __functionAddress = Functions.shape_plan_destroy;
        if (CHECKS) {
            check(shape_plan);
        }
        invokePV(shape_plan, __functionAddress);
    }

    // --- [ hb_shape_plan_set_user_data ] ---

    /** {@code hb_bool_t hb_shape_plan_set_user_data(hb_shape_plan_t * shape_plan, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_shape_plan_set_user_data(long shape_plan, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.shape_plan_set_user_data;
        if (CHECKS) {
            check(shape_plan);
        }
        return invokePPPPI(shape_plan, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_shape_plan_set_user_data(hb_shape_plan_t * shape_plan, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_shape_plan_set_user_data(@NativeType("hb_shape_plan_t *") long shape_plan, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_shape_plan_set_user_data(shape_plan, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_shape_plan_get_user_data ] ---

    /** {@code void * hb_shape_plan_get_user_data(hb_shape_plan_t const * shape_plan, hb_user_data_key_t * key)} */
    public static long nhb_shape_plan_get_user_data(long shape_plan, long key) {
        long __functionAddress = Functions.shape_plan_get_user_data;
        if (CHECKS) {
            check(shape_plan);
        }
        return invokePPP(shape_plan, key, __functionAddress);
    }

    /** {@code void * hb_shape_plan_get_user_data(hb_shape_plan_t const * shape_plan, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_shape_plan_get_user_data(@NativeType("hb_shape_plan_t const *") long shape_plan, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_shape_plan_get_user_data(shape_plan, key.address());
    }

    // --- [ hb_shape_plan_execute ] ---

    /** {@code hb_bool_t hb_shape_plan_execute(hb_shape_plan_t * shape_plan, hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features)} */
    public static int nhb_shape_plan_execute(long shape_plan, long font, long buffer, long features, int num_features) {
        long __functionAddress = Functions.shape_plan_execute;
        if (CHECKS) {
            check(shape_plan);
            check(font);
            check(buffer);
        }
        return invokePPPPI(shape_plan, font, buffer, features, num_features, __functionAddress);
    }

    /** {@code hb_bool_t hb_shape_plan_execute(hb_shape_plan_t * shape_plan, hb_font_t * font, hb_buffer_t * buffer, hb_feature_t const * features, unsigned int num_features)} */
    @NativeType("hb_bool_t")
    public static boolean hb_shape_plan_execute(@NativeType("hb_shape_plan_t *") long shape_plan, @NativeType("hb_font_t *") long font, @NativeType("hb_buffer_t *") long buffer, @NativeType("hb_feature_t const *") hb_feature_t.@Nullable Buffer features) {
        return nhb_shape_plan_execute(shape_plan, font, buffer, memAddressSafe(features), remainingSafe(features)) != 0;
    }

    // --- [ hb_shape_plan_get_shaper ] ---

    /** {@code char const * hb_shape_plan_get_shaper(hb_shape_plan_t * shape_plan)} */
    public static long nhb_shape_plan_get_shaper(long shape_plan) {
        long __functionAddress = Functions.shape_plan_get_shaper;
        if (CHECKS) {
            check(shape_plan);
        }
        return invokePP(shape_plan, __functionAddress);
    }

    /** {@code char const * hb_shape_plan_get_shaper(hb_shape_plan_t * shape_plan)} */
    @NativeType("char const *")
    public static @Nullable String hb_shape_plan_get_shaper(@NativeType("hb_shape_plan_t *") long shape_plan) {
        long __result = nhb_shape_plan_get_shaper(shape_plan);
        return memASCIISafe(__result);
    }

    // --- [ hb_style_get_value ] ---

    /** {@code float hb_style_get_value(hb_font_t * font, hb_style_tag_t style_tag)} */
    public static float hb_style_get_value(@NativeType("hb_font_t *") long font, @NativeType("hb_style_tag_t") int style_tag) {
        long __functionAddress = Functions.style_get_value;
        if (CHECKS) {
            check(font);
        }
        return invokePF(font, style_tag, __functionAddress);
    }

    // --- [ hb_unicode_funcs_get_default ] ---

    /** {@code hb_unicode_funcs_t * hb_unicode_funcs_get_default(void)} */
    @NativeType("hb_unicode_funcs_t *")
    public static long hb_unicode_funcs_get_default() {
        long __functionAddress = Functions.unicode_funcs_get_default;
        return invokeP(__functionAddress);
    }

    // --- [ hb_unicode_funcs_create ] ---

    /** {@code hb_unicode_funcs_t * hb_unicode_funcs_create(hb_unicode_funcs_t * parent)} */
    @NativeType("hb_unicode_funcs_t *")
    public static long hb_unicode_funcs_create(@NativeType("hb_unicode_funcs_t *") long parent) {
        long __functionAddress = Functions.unicode_funcs_create;
        if (CHECKS) {
            check(parent);
        }
        return invokePP(parent, __functionAddress);
    }

    // --- [ hb_unicode_funcs_get_empty ] ---

    /** {@code hb_unicode_funcs_t * hb_unicode_funcs_get_empty(void)} */
    @NativeType("hb_unicode_funcs_t *")
    public static long hb_unicode_funcs_get_empty() {
        long __functionAddress = Functions.unicode_funcs_get_empty;
        return invokeP(__functionAddress);
    }

    // --- [ hb_unicode_funcs_reference ] ---

    /** {@code hb_unicode_funcs_t * hb_unicode_funcs_reference(hb_unicode_funcs_t * ufuncs)} */
    @NativeType("hb_unicode_funcs_t *")
    public static long hb_unicode_funcs_reference(@NativeType("hb_unicode_funcs_t *") long ufuncs) {
        long __functionAddress = Functions.unicode_funcs_reference;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePP(ufuncs, __functionAddress);
    }

    // --- [ hb_unicode_funcs_destroy ] ---

    /** {@code void hb_unicode_funcs_destroy(hb_unicode_funcs_t * ufuncs)} */
    public static void hb_unicode_funcs_destroy(@NativeType("hb_unicode_funcs_t *") long ufuncs) {
        long __functionAddress = Functions.unicode_funcs_destroy;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePV(ufuncs, __functionAddress);
    }

    // --- [ hb_unicode_funcs_set_user_data ] ---

    /** {@code hb_bool_t hb_unicode_funcs_set_user_data(hb_unicode_funcs_t * ufuncs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    public static int nhb_unicode_funcs_set_user_data(long ufuncs, long key, long data, long destroy, int replace) {
        long __functionAddress = Functions.unicode_funcs_set_user_data;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePPPPI(ufuncs, key, data, destroy, replace, __functionAddress);
    }

    /** {@code hb_bool_t hb_unicode_funcs_set_user_data(hb_unicode_funcs_t * ufuncs, hb_user_data_key_t * key, void * data, hb_destroy_func_t destroy, hb_bool_t replace)} */
    @NativeType("hb_bool_t")
    public static boolean hb_unicode_funcs_set_user_data(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key, @NativeType("void *") long data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy, @NativeType("hb_bool_t") boolean replace) {
        return nhb_unicode_funcs_set_user_data(ufuncs, key.address(), data, memAddressSafe(destroy), replace ? 1 : 0) != 0;
    }

    // --- [ hb_unicode_funcs_get_user_data ] ---

    /** {@code void * hb_unicode_funcs_get_user_data(hb_unicode_funcs_t const * ufuncs, hb_user_data_key_t * key)} */
    public static long nhb_unicode_funcs_get_user_data(long ufuncs, long key) {
        long __functionAddress = Functions.unicode_funcs_get_user_data;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePPP(ufuncs, key, __functionAddress);
    }

    /** {@code void * hb_unicode_funcs_get_user_data(hb_unicode_funcs_t const * ufuncs, hb_user_data_key_t * key)} */
    @NativeType("void *")
    public static long hb_unicode_funcs_get_user_data(@NativeType("hb_unicode_funcs_t const *") long ufuncs, @NativeType("hb_user_data_key_t *") hb_user_data_key_t key) {
        return nhb_unicode_funcs_get_user_data(ufuncs, key.address());
    }

    // --- [ hb_unicode_funcs_make_immutable ] ---

    /** {@code void hb_unicode_funcs_make_immutable(hb_unicode_funcs_t * ufuncs)} */
    public static void hb_unicode_funcs_make_immutable(@NativeType("hb_unicode_funcs_t *") long ufuncs) {
        long __functionAddress = Functions.unicode_funcs_make_immutable;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePV(ufuncs, __functionAddress);
    }

    // --- [ hb_unicode_funcs_is_immutable ] ---

    /** {@code hb_bool_t hb_unicode_funcs_is_immutable(hb_unicode_funcs_t * ufuncs)} */
    @NativeType("hb_bool_t")
    public static boolean hb_unicode_funcs_is_immutable(@NativeType("hb_unicode_funcs_t *") long ufuncs) {
        long __functionAddress = Functions.unicode_funcs_is_immutable;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePI(ufuncs, __functionAddress) != 0;
    }

    // --- [ hb_unicode_funcs_get_parent ] ---

    /** {@code hb_unicode_funcs_t * hb_unicode_funcs_get_parent(hb_unicode_funcs_t * ufuncs)} */
    @NativeType("hb_unicode_funcs_t *")
    public static long hb_unicode_funcs_get_parent(@NativeType("hb_unicode_funcs_t *") long ufuncs) {
        long __functionAddress = Functions.unicode_funcs_get_parent;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePP(ufuncs, __functionAddress);
    }

    // --- [ hb_unicode_funcs_set_combining_class_func ] ---

    /** {@code void hb_unicode_funcs_set_combining_class_func(hb_unicode_funcs_t * ufuncs, hb_unicode_combining_class_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_unicode_funcs_set_combining_class_func(long ufuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.unicode_funcs_set_combining_class_func;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePPPPV(ufuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_unicode_funcs_set_combining_class_func(hb_unicode_funcs_t * ufuncs, hb_unicode_combining_class_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_unicode_funcs_set_combining_class_func(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_unicode_combining_class_func_t") hb_unicode_combining_class_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_unicode_funcs_set_combining_class_func(ufuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_unicode_funcs_set_general_category_func ] ---

    /** {@code void hb_unicode_funcs_set_general_category_func(hb_unicode_funcs_t * ufuncs, hb_unicode_general_category_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_unicode_funcs_set_general_category_func(long ufuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.unicode_funcs_set_general_category_func;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePPPPV(ufuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_unicode_funcs_set_general_category_func(hb_unicode_funcs_t * ufuncs, hb_unicode_general_category_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_unicode_funcs_set_general_category_func(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_unicode_general_category_func_t") hb_unicode_general_category_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_unicode_funcs_set_general_category_func(ufuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_unicode_funcs_set_mirroring_func ] ---

    /** {@code void hb_unicode_funcs_set_mirroring_func(hb_unicode_funcs_t * ufuncs, hb_unicode_mirroring_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_unicode_funcs_set_mirroring_func(long ufuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.unicode_funcs_set_mirroring_func;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePPPPV(ufuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_unicode_funcs_set_mirroring_func(hb_unicode_funcs_t * ufuncs, hb_unicode_mirroring_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_unicode_funcs_set_mirroring_func(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_unicode_mirroring_func_t") hb_unicode_mirroring_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_unicode_funcs_set_mirroring_func(ufuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_unicode_funcs_set_script_func ] ---

    /** {@code void hb_unicode_funcs_set_script_func(hb_unicode_funcs_t * ufuncs, hb_unicode_script_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_unicode_funcs_set_script_func(long ufuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.unicode_funcs_set_script_func;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePPPPV(ufuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_unicode_funcs_set_script_func(hb_unicode_funcs_t * ufuncs, hb_unicode_script_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_unicode_funcs_set_script_func(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_unicode_script_func_t") hb_unicode_script_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_unicode_funcs_set_script_func(ufuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_unicode_funcs_set_compose_func ] ---

    /** {@code void hb_unicode_funcs_set_compose_func(hb_unicode_funcs_t * ufuncs, hb_unicode_compose_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_unicode_funcs_set_compose_func(long ufuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.unicode_funcs_set_compose_func;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePPPPV(ufuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_unicode_funcs_set_compose_func(hb_unicode_funcs_t * ufuncs, hb_unicode_compose_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_unicode_funcs_set_compose_func(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_unicode_compose_func_t") hb_unicode_compose_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_unicode_funcs_set_compose_func(ufuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_unicode_funcs_set_decompose_func ] ---

    /** {@code void hb_unicode_funcs_set_decompose_func(hb_unicode_funcs_t * ufuncs, hb_unicode_decompose_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void nhb_unicode_funcs_set_decompose_func(long ufuncs, long func, long user_data, long destroy) {
        long __functionAddress = Functions.unicode_funcs_set_decompose_func;
        if (CHECKS) {
            check(ufuncs);
        }
        invokePPPPV(ufuncs, func, user_data, destroy, __functionAddress);
    }

    /** {@code void hb_unicode_funcs_set_decompose_func(hb_unicode_funcs_t * ufuncs, hb_unicode_decompose_func_t func, void * user_data, hb_destroy_func_t destroy)} */
    public static void hb_unicode_funcs_set_decompose_func(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_unicode_decompose_func_t") hb_unicode_decompose_func_tI func, @NativeType("void *") long user_data, @NativeType("hb_destroy_func_t") @Nullable hb_destroy_func_tI destroy) {
        nhb_unicode_funcs_set_decompose_func(ufuncs, func.address(), user_data, memAddressSafe(destroy));
    }

    // --- [ hb_unicode_combining_class ] ---

    /** {@code hb_unicode_combining_class_t hb_unicode_combining_class(hb_unicode_funcs_t * ufuncs, hb_codepoint_t unicode)} */
    @NativeType("hb_unicode_combining_class_t")
    public static int hb_unicode_combining_class(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int unicode) {
        long __functionAddress = Functions.unicode_combining_class;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePI(ufuncs, unicode, __functionAddress);
    }

    // --- [ hb_unicode_general_category ] ---

    /** {@code hb_unicode_general_category_t hb_unicode_general_category(hb_unicode_funcs_t * ufuncs, hb_codepoint_t unicode)} */
    @NativeType("hb_unicode_general_category_t")
    public static int hb_unicode_general_category(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int unicode) {
        long __functionAddress = Functions.unicode_general_category;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePI(ufuncs, unicode, __functionAddress);
    }

    // --- [ hb_unicode_mirroring ] ---

    /** {@code hb_codepoint_t hb_unicode_mirroring(hb_unicode_funcs_t * ufuncs, hb_codepoint_t unicode)} */
    @NativeType("hb_codepoint_t")
    public static int hb_unicode_mirroring(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int unicode) {
        long __functionAddress = Functions.unicode_mirroring;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePI(ufuncs, unicode, __functionAddress);
    }

    // --- [ hb_unicode_script ] ---

    /** {@code hb_script_t hb_unicode_script(hb_unicode_funcs_t * ufuncs, hb_codepoint_t unicode)} */
    @NativeType("hb_script_t")
    public static int hb_unicode_script(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int unicode) {
        long __functionAddress = Functions.unicode_script;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePI(ufuncs, unicode, __functionAddress);
    }

    // --- [ hb_unicode_compose ] ---

    /** {@code hb_bool_t hb_unicode_compose(hb_unicode_funcs_t * ufuncs, hb_codepoint_t a, hb_codepoint_t b, hb_codepoint_t * ab)} */
    public static int nhb_unicode_compose(long ufuncs, int a, int b, long ab) {
        long __functionAddress = Functions.unicode_compose;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePPI(ufuncs, a, b, ab, __functionAddress);
    }

    /** {@code hb_bool_t hb_unicode_compose(hb_unicode_funcs_t * ufuncs, hb_codepoint_t a, hb_codepoint_t b, hb_codepoint_t * ab)} */
    @NativeType("hb_bool_t")
    public static boolean hb_unicode_compose(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int a, @NativeType("hb_codepoint_t") int b, @NativeType("hb_codepoint_t *") IntBuffer ab) {
        if (CHECKS) {
            check(ab, 1);
        }
        return nhb_unicode_compose(ufuncs, a, b, memAddress(ab)) != 0;
    }

    // --- [ hb_unicode_decompose ] ---

    /** {@code hb_bool_t hb_unicode_decompose(hb_unicode_funcs_t * ufuncs, hb_codepoint_t ab, hb_codepoint_t * a, hb_codepoint_t * b)} */
    public static int nhb_unicode_decompose(long ufuncs, int ab, long a, long b) {
        long __functionAddress = Functions.unicode_decompose;
        if (CHECKS) {
            check(ufuncs);
        }
        return invokePPPI(ufuncs, ab, a, b, __functionAddress);
    }

    /** {@code hb_bool_t hb_unicode_decompose(hb_unicode_funcs_t * ufuncs, hb_codepoint_t ab, hb_codepoint_t * a, hb_codepoint_t * b)} */
    @NativeType("hb_bool_t")
    public static boolean hb_unicode_decompose(@NativeType("hb_unicode_funcs_t *") long ufuncs, @NativeType("hb_codepoint_t") int ab, @NativeType("hb_codepoint_t *") IntBuffer a, @NativeType("hb_codepoint_t *") IntBuffer b) {
        if (CHECKS) {
            check(a, 1);
            check(b, 1);
        }
        return nhb_unicode_decompose(ufuncs, ab, memAddress(a), memAddress(b)) != 0;
    }

    // --- [ hb_version ] ---

    /** {@code void hb_version(unsigned int * major, unsigned int * minor, unsigned int * micro)} */
    public static void nhb_version(long major, long minor, long micro) {
        long __functionAddress = Functions.version;
        invokePPPV(major, minor, micro, __functionAddress);
    }

    /** {@code void hb_version(unsigned int * major, unsigned int * minor, unsigned int * micro)} */
    public static void hb_version(@NativeType("unsigned int *") IntBuffer major, @NativeType("unsigned int *") IntBuffer minor, @NativeType("unsigned int *") IntBuffer micro) {
        if (CHECKS) {
            check(major, 1);
            check(minor, 1);
            check(micro, 1);
        }
        nhb_version(memAddress(major), memAddress(minor), memAddress(micro));
    }

    // --- [ hb_version_string ] ---

    /** {@code char const * hb_version_string(void)} */
    public static long nhb_version_string() {
        long __functionAddress = Functions.version_string;
        return invokeP(__functionAddress);
    }

    /** {@code char const * hb_version_string(void)} */
    @NativeType("char const *")
    public static @Nullable String hb_version_string() {
        long __result = nhb_version_string();
        return memASCIISafe(__result);
    }

    // --- [ hb_version_atleast ] ---

    /** {@code hb_bool_t hb_version_atleast(unsigned int major, unsigned int minor, unsigned int micro)} */
    @NativeType("hb_bool_t")
    public static boolean hb_version_atleast(@NativeType("unsigned int") int major, @NativeType("unsigned int") int minor, @NativeType("unsigned int") int micro) {
        long __functionAddress = Functions.version_atleast;
        return invokeI(major, minor, micro, __functionAddress) != 0;
    }

    public static int HB_TAG(int c1, int c2, int c3, int c4) {
        return ((c1 & 0xFF) << 24) | ((c2 & 0xFF)<< 16) | ((c3 & 0xFF) << 8) | (c4 & 0xFF);
    }

    /** Tests whether a text direction is valid. */
    public static boolean HB_DIRECTION_IS_VALID(@NativeType("hb_direction_t") int dir) {
        return (dir & ~3) == 4;
    }

    /** Tests whether a text direction is horizontal. Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_HORIZONTAL(@NativeType("hb_direction_t") int dir) {
        return (dir & ~1) == 4;
    }

    /** Tests whether a text direction is vertical. Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_VERTICAL(@NativeType("hb_direction_t") int dir) {
        return (dir & ~1) == 6;
    }

    /** Tests whether a text direction moves forward (from left to right, or from top to bottom). Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_FORWARD(@NativeType("hb_direction_t") int dir) {
        return (dir & ~2) == 4;
    }

    /** Tests whether a text direction moves backward (from right to left, or from bottom to top). Requires that the direction be valid. */
    public static boolean HB_DIRECTION_IS_BACKWARD(@NativeType("hb_direction_t") int dir)	{
        return (dir & ~2) == 5;
    }

    /** Reverses a text direction. Requires that the direction be valid. */
    @NativeType("hb_direction_t")
    public static int HB_DIRECTION_REVERSE(@NativeType("hb_direction_t") int dir)	{
        return dir ^ 1;
    }

    public static int HB_COLOR(int b, int g, int r, int a) {
        return HB_TAG(b, g, r, a);
    }

    @NativeType("bool")
    public static boolean HB_BUFFER_CLUSTER_LEVEL_IS_MONOTONE(@NativeType("hb_buffer_cluster_level_t") int level) {
        return ((1 << level) & ((1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES) | (1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS))) != 0;
    }

    @NativeType("bool")
    public static boolean HB_BUFFER_CLUSTER_LEVEL_IS_GRAPHEMES(@NativeType("hb_buffer_cluster_level_t") int level) {
        return ((1 << level) & ((1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES) | (1 << HB_BUFFER_CLUSTER_LEVEL_GRAPHEMES))) != 0;
    }

    @NativeType("bool")
    public static boolean HB_BUFFER_CLUSTER_LEVEL_IS_CHARACTERS(@NativeType("hb_buffer_cluster_level_t") int level) {
        return ((1 << level) & ((1 << HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS) | (1 << HB_BUFFER_CLUSTER_LEVEL_CHARACTERS))) != 0;
    }

    @NativeType("hb_glyph_flags_t")
    public static int hb_glyph_info_get_glyph_flags(@NativeType("hb_glyph_info_t const *") hb_glyph_info_t info) {
        return info.mask() & HB_GLYPH_FLAG_DEFINED;
    }

    /** The default {@code hb_segment_properties_t} of of freshly created {@code hb_buffer_t}. */
    public static final hb_segment_properties_t HB_SEGMENT_PROPERTIES_DEFAULT = hb_segment_properties_t.create().set(
        HB_DIRECTION_INVALID,
        HB_SCRIPT_INVALID,
        HB_LANGUAGE_INVALID
    );

    private static final int buffer_serialize_list_formats_COUNT;
    static {
        long formats = nhb_buffer_serialize_list_formats();
        int count = 0;
        while (memGetAddress(formats) != NULL) {
            count++;
            formats += POINTER_SIZE;
        }
        buffer_serialize_list_formats_COUNT = count;
    }

    public static final hb_draw_state_t HB_DRAW_STATE_DEFAULT = hb_draw_state_t.create();

    private static final int face_list_loaders_COUNT;
    static {
        long loaders = nhb_face_list_loaders();
        int count = 0;
        while (memGetAddress(loaders) != NULL) {
            count++;
            loaders += POINTER_SIZE;
        }
        face_list_loaders_COUNT = count;
    }

    private static final int font_list_funcs_COUNT;
    static {
        long funcs = nhb_font_list_funcs();
        int count = 0;
        while (memGetAddress(funcs) != NULL) {
            count++;
            funcs += POINTER_SIZE;
        }
        font_list_funcs_COUNT = count;
    }

    private static final int shape_list_shapers_COUNT;
    static {
        long shapers = nhb_shape_list_shapers();
        int count = 0;
        while (memGetAddress(shapers) != NULL) {
            count++;
            shapers += POINTER_SIZE;
        }
        shape_list_shapers_COUNT = count;
    }

    public static boolean HB_VERSION_ATLEAST(int major, int minor, int micro) {
        return major*10000 + minor*100 + micro <= HB_VERSION_MAJOR*10000 + HB_VERSION_MINOR*100 + HB_VERSION_MICRO;
    }

}