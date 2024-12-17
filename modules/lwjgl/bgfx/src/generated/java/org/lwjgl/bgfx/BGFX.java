/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class BGFX {

    private static final SharedLibrary BGFX = Library.loadNative(BGFX.class, "org.lwjgl.bgfx", Configuration.BGFX_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("bgfx")), true);

    /** Contains the function pointers loaded from the bgfx {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            attachment_init                                      = apiGetFunctionAddress(BGFX, "bgfx_attachment_init"),
            vertex_layout_begin                                  = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_begin"),
            vertex_layout_add                                    = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_add"),
            vertex_layout_decode                                 = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_decode"),
            vertex_layout_has                                    = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_has"),
            vertex_layout_skip                                   = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_skip"),
            vertex_layout_end                                    = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_end"),
            vertex_layout_get_offset                             = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_get_offset"),
            vertex_layout_get_stride                             = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_get_stride"),
            vertex_layout_get_size                               = apiGetFunctionAddress(BGFX, "bgfx_vertex_layout_get_size"),
            vertex_pack                                          = apiGetFunctionAddress(BGFX, "bgfx_vertex_pack"),
            vertex_unpack                                        = apiGetFunctionAddress(BGFX, "bgfx_vertex_unpack"),
            vertex_convert                                       = apiGetFunctionAddress(BGFX, "bgfx_vertex_convert"),
            weld_vertices                                        = apiGetFunctionAddress(BGFX, "bgfx_weld_vertices"),
            topology_convert                                     = apiGetFunctionAddress(BGFX, "bgfx_topology_convert"),
            topology_sort_tri_list                               = apiGetFunctionAddress(BGFX, "bgfx_topology_sort_tri_list"),
            get_supported_renderers                              = apiGetFunctionAddress(BGFX, "bgfx_get_supported_renderers"),
            get_renderer_name                                    = apiGetFunctionAddress(BGFX, "bgfx_get_renderer_name"),
            init_ctor                                            = apiGetFunctionAddress(BGFX, "bgfx_init_ctor"),
            init                                                 = apiGetFunctionAddress(BGFX, "bgfx_init"),
            shutdown                                             = apiGetFunctionAddress(BGFX, "bgfx_shutdown"),
            reset                                                = apiGetFunctionAddress(BGFX, "bgfx_reset"),
            frame                                                = apiGetFunctionAddress(BGFX, "bgfx_frame"),
            get_renderer_type                                    = apiGetFunctionAddress(BGFX, "bgfx_get_renderer_type"),
            get_caps                                             = apiGetFunctionAddress(BGFX, "bgfx_get_caps"),
            get_stats                                            = apiGetFunctionAddress(BGFX, "bgfx_get_stats"),
            alloc                                                = apiGetFunctionAddress(BGFX, "bgfx_alloc"),
            copy                                                 = apiGetFunctionAddress(BGFX, "bgfx_copy"),
            make_ref                                             = apiGetFunctionAddress(BGFX, "bgfx_make_ref"),
            make_ref_release                                     = apiGetFunctionAddress(BGFX, "bgfx_make_ref_release"),
            set_debug                                            = apiGetFunctionAddress(BGFX, "bgfx_set_debug"),
            dbg_text_clear                                       = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_clear"),
            dbg_text_printf                                      = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_printf"),
            dbg_text_vprintf                                     = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_vprintf"),
            dbg_text_image                                       = apiGetFunctionAddress(BGFX, "bgfx_dbg_text_image"),
            create_index_buffer                                  = apiGetFunctionAddress(BGFX, "bgfx_create_index_buffer"),
            set_index_buffer_name                                = apiGetFunctionAddress(BGFX, "bgfx_set_index_buffer_name"),
            destroy_index_buffer                                 = apiGetFunctionAddress(BGFX, "bgfx_destroy_index_buffer"),
            create_vertex_layout                                 = apiGetFunctionAddress(BGFX, "bgfx_create_vertex_layout"),
            destroy_vertex_layout                                = apiGetFunctionAddress(BGFX, "bgfx_destroy_vertex_layout"),
            create_vertex_buffer                                 = apiGetFunctionAddress(BGFX, "bgfx_create_vertex_buffer"),
            set_vertex_buffer_name                               = apiGetFunctionAddress(BGFX, "bgfx_set_vertex_buffer_name"),
            destroy_vertex_buffer                                = apiGetFunctionAddress(BGFX, "bgfx_destroy_vertex_buffer"),
            create_dynamic_index_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_index_buffer"),
            create_dynamic_index_buffer_mem                      = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_index_buffer_mem"),
            update_dynamic_index_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_update_dynamic_index_buffer"),
            destroy_dynamic_index_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_destroy_dynamic_index_buffer"),
            create_dynamic_vertex_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_vertex_buffer"),
            create_dynamic_vertex_buffer_mem                     = apiGetFunctionAddress(BGFX, "bgfx_create_dynamic_vertex_buffer_mem"),
            update_dynamic_vertex_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_update_dynamic_vertex_buffer"),
            destroy_dynamic_vertex_buffer                        = apiGetFunctionAddress(BGFX, "bgfx_destroy_dynamic_vertex_buffer"),
            get_avail_transient_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_get_avail_transient_index_buffer"),
            get_avail_transient_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_get_avail_transient_vertex_buffer"),
            get_avail_instance_data_buffer                       = apiGetFunctionAddress(BGFX, "bgfx_get_avail_instance_data_buffer"),
            alloc_transient_index_buffer                         = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_index_buffer"),
            alloc_transient_vertex_buffer                        = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_vertex_buffer"),
            alloc_transient_buffers                              = apiGetFunctionAddress(BGFX, "bgfx_alloc_transient_buffers"),
            alloc_instance_data_buffer                           = apiGetFunctionAddress(BGFX, "bgfx_alloc_instance_data_buffer"),
            create_indirect_buffer                               = apiGetFunctionAddress(BGFX, "bgfx_create_indirect_buffer"),
            destroy_indirect_buffer                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_indirect_buffer"),
            create_shader                                        = apiGetFunctionAddress(BGFX, "bgfx_create_shader"),
            get_shader_uniforms                                  = apiGetFunctionAddress(BGFX, "bgfx_get_shader_uniforms"),
            set_shader_name                                      = apiGetFunctionAddress(BGFX, "bgfx_set_shader_name"),
            destroy_shader                                       = apiGetFunctionAddress(BGFX, "bgfx_destroy_shader"),
            create_program                                       = apiGetFunctionAddress(BGFX, "bgfx_create_program"),
            create_compute_program                               = apiGetFunctionAddress(BGFX, "bgfx_create_compute_program"),
            destroy_program                                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_program"),
            is_texture_valid                                     = apiGetFunctionAddress(BGFX, "bgfx_is_texture_valid"),
            is_frame_buffer_valid                                = apiGetFunctionAddress(BGFX, "bgfx_is_frame_buffer_valid"),
            calc_texture_size                                    = apiGetFunctionAddress(BGFX, "bgfx_calc_texture_size"),
            create_texture                                       = apiGetFunctionAddress(BGFX, "bgfx_create_texture"),
            create_texture_2d                                    = apiGetFunctionAddress(BGFX, "bgfx_create_texture_2d"),
            create_texture_2d_scaled                             = apiGetFunctionAddress(BGFX, "bgfx_create_texture_2d_scaled"),
            create_texture_3d                                    = apiGetFunctionAddress(BGFX, "bgfx_create_texture_3d"),
            create_texture_cube                                  = apiGetFunctionAddress(BGFX, "bgfx_create_texture_cube"),
            update_texture_2d                                    = apiGetFunctionAddress(BGFX, "bgfx_update_texture_2d"),
            update_texture_3d                                    = apiGetFunctionAddress(BGFX, "bgfx_update_texture_3d"),
            update_texture_cube                                  = apiGetFunctionAddress(BGFX, "bgfx_update_texture_cube"),
            read_texture                                         = apiGetFunctionAddress(BGFX, "bgfx_read_texture"),
            set_texture_name                                     = apiGetFunctionAddress(BGFX, "bgfx_set_texture_name"),
            get_direct_access_ptr                                = apiGetFunctionAddress(BGFX, "bgfx_get_direct_access_ptr"),
            destroy_texture                                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_texture"),
            create_frame_buffer                                  = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer"),
            create_frame_buffer_scaled                           = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_scaled"),
            create_frame_buffer_from_handles                     = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_handles"),
            create_frame_buffer_from_attachment                  = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_attachment"),
            create_frame_buffer_from_nwh                         = apiGetFunctionAddress(BGFX, "bgfx_create_frame_buffer_from_nwh"),
            set_frame_buffer_name                                = apiGetFunctionAddress(BGFX, "bgfx_set_frame_buffer_name"),
            get_texture                                          = apiGetFunctionAddress(BGFX, "bgfx_get_texture"),
            destroy_frame_buffer                                 = apiGetFunctionAddress(BGFX, "bgfx_destroy_frame_buffer"),
            create_uniform                                       = apiGetFunctionAddress(BGFX, "bgfx_create_uniform"),
            get_uniform_info                                     = apiGetFunctionAddress(BGFX, "bgfx_get_uniform_info"),
            destroy_uniform                                      = apiGetFunctionAddress(BGFX, "bgfx_destroy_uniform"),
            create_occlusion_query                               = apiGetFunctionAddress(BGFX, "bgfx_create_occlusion_query"),
            get_result                                           = apiGetFunctionAddress(BGFX, "bgfx_get_result"),
            destroy_occlusion_query                              = apiGetFunctionAddress(BGFX, "bgfx_destroy_occlusion_query"),
            set_palette_color                                    = apiGetFunctionAddress(BGFX, "bgfx_set_palette_color"),
            set_palette_color_rgba32f                            = apiGetFunctionAddress(BGFX, "bgfx_set_palette_color_rgba32f"),
            set_palette_color_rgba8                              = apiGetFunctionAddress(BGFX, "bgfx_set_palette_color_rgba8"),
            set_view_name                                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_name"),
            set_view_rect                                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_rect"),
            set_view_rect_ratio                                  = apiGetFunctionAddress(BGFX, "bgfx_set_view_rect_ratio"),
            set_view_scissor                                     = apiGetFunctionAddress(BGFX, "bgfx_set_view_scissor"),
            set_view_clear                                       = apiGetFunctionAddress(BGFX, "bgfx_set_view_clear"),
            set_view_clear_mrt                                   = apiGetFunctionAddress(BGFX, "bgfx_set_view_clear_mrt"),
            set_view_mode                                        = apiGetFunctionAddress(BGFX, "bgfx_set_view_mode"),
            set_view_frame_buffer                                = apiGetFunctionAddress(BGFX, "bgfx_set_view_frame_buffer"),
            set_view_transform                                   = apiGetFunctionAddress(BGFX, "bgfx_set_view_transform"),
            set_view_order                                       = apiGetFunctionAddress(BGFX, "bgfx_set_view_order"),
            reset_view                                           = apiGetFunctionAddress(BGFX, "bgfx_reset_view"),
            encoder_begin                                        = apiGetFunctionAddress(BGFX, "bgfx_encoder_begin"),
            encoder_end                                          = apiGetFunctionAddress(BGFX, "bgfx_encoder_end"),
            encoder_set_marker                                   = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_marker"),
            encoder_set_state                                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_state"),
            encoder_set_condition                                = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_condition"),
            encoder_set_stencil                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_stencil"),
            encoder_set_scissor                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_scissor"),
            encoder_set_scissor_cached                           = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_scissor_cached"),
            encoder_set_transform                                = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transform"),
            encoder_set_transform_cached                         = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transform_cached"),
            encoder_alloc_transform                              = apiGetFunctionAddress(BGFX, "bgfx_encoder_alloc_transform"),
            encoder_set_uniform                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_uniform"),
            encoder_set_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_index_buffer"),
            encoder_set_dynamic_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_dynamic_index_buffer"),
            encoder_set_transient_index_buffer                   = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transient_index_buffer"),
            encoder_set_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_vertex_buffer"),
            encoder_set_vertex_buffer_with_layout                = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_vertex_buffer_with_layout"),
            encoder_set_dynamic_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_dynamic_vertex_buffer"),
            encoder_set_dynamic_vertex_buffer_with_layout        = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_dynamic_vertex_buffer_with_layout"),
            encoder_set_transient_vertex_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transient_vertex_buffer"),
            encoder_set_transient_vertex_buffer_with_layout      = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_transient_vertex_buffer_with_layout"),
            encoder_set_vertex_count                             = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_vertex_count"),
            encoder_set_instance_data_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_data_buffer"),
            encoder_set_instance_data_from_vertex_buffer         = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_data_from_vertex_buffer"),
            encoder_set_instance_data_from_dynamic_vertex_buffer = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer"),
            encoder_set_instance_count                           = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_instance_count"),
            encoder_set_texture                                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_texture"),
            encoder_touch                                        = apiGetFunctionAddress(BGFX, "bgfx_encoder_touch"),
            encoder_submit                                       = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit"),
            encoder_submit_occlusion_query                       = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit_occlusion_query"),
            encoder_submit_indirect                              = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit_indirect"),
            encoder_submit_indirect_count                        = apiGetFunctionAddress(BGFX, "bgfx_encoder_submit_indirect_count"),
            encoder_set_compute_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_index_buffer"),
            encoder_set_compute_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_vertex_buffer"),
            encoder_set_compute_dynamic_index_buffer             = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_dynamic_index_buffer"),
            encoder_set_compute_dynamic_vertex_buffer            = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_dynamic_vertex_buffer"),
            encoder_set_compute_indirect_buffer                  = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_compute_indirect_buffer"),
            encoder_set_image                                    = apiGetFunctionAddress(BGFX, "bgfx_encoder_set_image"),
            encoder_dispatch                                     = apiGetFunctionAddress(BGFX, "bgfx_encoder_dispatch"),
            encoder_dispatch_indirect                            = apiGetFunctionAddress(BGFX, "bgfx_encoder_dispatch_indirect"),
            encoder_discard                                      = apiGetFunctionAddress(BGFX, "bgfx_encoder_discard"),
            encoder_blit                                         = apiGetFunctionAddress(BGFX, "bgfx_encoder_blit"),
            request_screen_shot                                  = apiGetFunctionAddress(BGFX, "bgfx_request_screen_shot"),
            set_marker                                           = apiGetFunctionAddress(BGFX, "bgfx_set_marker"),
            set_state                                            = apiGetFunctionAddress(BGFX, "bgfx_set_state"),
            set_condition                                        = apiGetFunctionAddress(BGFX, "bgfx_set_condition"),
            set_stencil                                          = apiGetFunctionAddress(BGFX, "bgfx_set_stencil"),
            set_scissor                                          = apiGetFunctionAddress(BGFX, "bgfx_set_scissor"),
            set_scissor_cached                                   = apiGetFunctionAddress(BGFX, "bgfx_set_scissor_cached"),
            set_transform                                        = apiGetFunctionAddress(BGFX, "bgfx_set_transform"),
            set_transform_cached                                 = apiGetFunctionAddress(BGFX, "bgfx_set_transform_cached"),
            alloc_transform                                      = apiGetFunctionAddress(BGFX, "bgfx_alloc_transform"),
            set_uniform                                          = apiGetFunctionAddress(BGFX, "bgfx_set_uniform"),
            set_index_buffer                                     = apiGetFunctionAddress(BGFX, "bgfx_set_index_buffer"),
            set_dynamic_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_index_buffer"),
            set_transient_index_buffer                           = apiGetFunctionAddress(BGFX, "bgfx_set_transient_index_buffer"),
            set_vertex_buffer                                    = apiGetFunctionAddress(BGFX, "bgfx_set_vertex_buffer"),
            set_vertex_buffer_with_layout                        = apiGetFunctionAddress(BGFX, "bgfx_set_vertex_buffer_with_layout"),
            set_dynamic_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_vertex_buffer"),
            set_dynamic_vertex_buffer_with_layout                = apiGetFunctionAddress(BGFX, "bgfx_set_dynamic_vertex_buffer_with_layout"),
            set_transient_vertex_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_set_transient_vertex_buffer"),
            set_transient_vertex_buffer_with_layout              = apiGetFunctionAddress(BGFX, "bgfx_set_transient_vertex_buffer_with_layout"),
            set_vertex_count                                     = apiGetFunctionAddress(BGFX, "bgfx_set_vertex_count"),
            set_instance_data_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_buffer"),
            set_instance_data_from_vertex_buffer                 = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_from_vertex_buffer"),
            set_instance_data_from_dynamic_vertex_buffer         = apiGetFunctionAddress(BGFX, "bgfx_set_instance_data_from_dynamic_vertex_buffer"),
            set_instance_count                                   = apiGetFunctionAddress(BGFX, "bgfx_set_instance_count"),
            set_texture                                          = apiGetFunctionAddress(BGFX, "bgfx_set_texture"),
            touch                                                = apiGetFunctionAddress(BGFX, "bgfx_touch"),
            submit                                               = apiGetFunctionAddress(BGFX, "bgfx_submit"),
            submit_occlusion_query                               = apiGetFunctionAddress(BGFX, "bgfx_submit_occlusion_query"),
            submit_indirect                                      = apiGetFunctionAddress(BGFX, "bgfx_submit_indirect"),
            submit_indirect_count                                = apiGetFunctionAddress(BGFX, "bgfx_submit_indirect_count"),
            set_compute_index_buffer                             = apiGetFunctionAddress(BGFX, "bgfx_set_compute_index_buffer"),
            set_compute_vertex_buffer                            = apiGetFunctionAddress(BGFX, "bgfx_set_compute_vertex_buffer"),
            set_compute_dynamic_index_buffer                     = apiGetFunctionAddress(BGFX, "bgfx_set_compute_dynamic_index_buffer"),
            set_compute_dynamic_vertex_buffer                    = apiGetFunctionAddress(BGFX, "bgfx_set_compute_dynamic_vertex_buffer"),
            set_compute_indirect_buffer                          = apiGetFunctionAddress(BGFX, "bgfx_set_compute_indirect_buffer"),
            set_image                                            = apiGetFunctionAddress(BGFX, "bgfx_set_image"),
            dispatch                                             = apiGetFunctionAddress(BGFX, "bgfx_dispatch"),
            dispatch_indirect                                    = apiGetFunctionAddress(BGFX, "bgfx_dispatch_indirect"),
            discard                                              = apiGetFunctionAddress(BGFX, "bgfx_discard"),
            blit                                                 = apiGetFunctionAddress(BGFX, "bgfx_blit");

    }

    /** Returns the bgfx {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return BGFX;
    }

    public static final int BGFX_API_VERSION = 129;

    public static final short BGFX_INVALID_HANDLE = (short)0xFFFF;

    public static final long
        BGFX_STATE_WRITE_R                 = 0x1L,
        BGFX_STATE_WRITE_G                 = 0x2L,
        BGFX_STATE_WRITE_B                 = 0x4L,
        BGFX_STATE_WRITE_A                 = 0x8L,
        BGFX_STATE_WRITE_Z                 = 0x4000000000L,
        BGFX_STATE_WRITE_RGB               = BGFX_STATE_WRITE_R | BGFX_STATE_WRITE_G | BGFX_STATE_WRITE_B,
        BGFX_STATE_WRITE_MASK              = BGFX_STATE_WRITE_RGB | BGFX_STATE_WRITE_A | BGFX_STATE_WRITE_Z,
        BGFX_STATE_DEPTH_TEST_LESS         = 0x10L,
        BGFX_STATE_DEPTH_TEST_LEQUAL       = 0x20L,
        BGFX_STATE_DEPTH_TEST_EQUAL        = 0x30L,
        BGFX_STATE_DEPTH_TEST_GEQUAL       = 0x40L,
        BGFX_STATE_DEPTH_TEST_GREATER      = 0x50L,
        BGFX_STATE_DEPTH_TEST_NOTEQUAL     = 0x60L,
        BGFX_STATE_DEPTH_TEST_NEVER        = 0x70L,
        BGFX_STATE_DEPTH_TEST_ALWAYS       = 0x80L,
        BGFX_STATE_BLEND_ZERO              = 0x1000L,
        BGFX_STATE_BLEND_ONE               = 0x2000L,
        BGFX_STATE_BLEND_SRC_COLOR         = 0x3000L,
        BGFX_STATE_BLEND_INV_SRC_COLOR     = 0x4000L,
        BGFX_STATE_BLEND_SRC_ALPHA         = 0x5000L,
        BGFX_STATE_BLEND_INV_SRC_ALPHA     = 0x6000L,
        BGFX_STATE_BLEND_DST_ALPHA         = 0x7000L,
        BGFX_STATE_BLEND_INV_DST_ALPHA     = 0x8000L,
        BGFX_STATE_BLEND_DST_COLOR         = 0x9000L,
        BGFX_STATE_BLEND_INV_DST_COLOR     = 0xA000L,
        BGFX_STATE_BLEND_SRC_ALPHA_SAT     = 0xB000L,
        BGFX_STATE_BLEND_FACTOR            = 0xC000L,
        BGFX_STATE_BLEND_INV_FACTOR        = 0xD000L,
        BGFX_STATE_BLEND_EQUATION_ADD      = 0x0L,
        BGFX_STATE_BLEND_EQUATION_SUB      = 0x10000000L,
        BGFX_STATE_BLEND_EQUATION_REVSUB   = 0x20000000L,
        BGFX_STATE_BLEND_EQUATION_MIN      = 0x30000000L,
        BGFX_STATE_BLEND_EQUATION_MAX      = 0x40000000L,
        BGFX_STATE_CULL_CW                 = 0x1000000000L,
        BGFX_STATE_CULL_CCW                = 0x2000000000L,
        BGFX_STATE_PT_TRISTRIP             = 0x1000000000000L,
        BGFX_STATE_PT_LINES                = 0x2000000000000L,
        BGFX_STATE_PT_LINESTRIP            = 0x3000000000000L,
        BGFX_STATE_PT_POINTS               = 0x4000000000000L,
        BGFX_STATE_MSAA                    = 0x100000000000000L,
        BGFX_STATE_LINEAA                  = 0x200000000000000L,
        BGFX_STATE_CONSERVATIVE_RASTER     = 0x400000000000000L,
        BGFX_STATE_NONE                    = 0x0L,
        BGFX_STATE_FRONT_CCW               = 0x8000000000L,
        BGFX_STATE_BLEND_INDEPENDENT       = 0x400000000L,
        BGFX_STATE_BLEND_ALPHA_TO_COVERAGE = 0x800000000L,
        BGFX_STATE_DEFAULT                 = (0L
        | BGFX_STATE_WRITE_RGB
        | BGFX_STATE_WRITE_A
        | BGFX_STATE_WRITE_Z
        | BGFX_STATE_DEPTH_TEST_LESS
        | BGFX_STATE_CULL_CW
        | BGFX_STATE_MSAA)
        ;

    public static final long
        BGFX_STATE_DEPTH_TEST_MASK     = 0xF0L,
        BGFX_STATE_BLEND_MASK          = 0xFFFF000L,
        BGFX_STATE_BLEND_EQUATION_MASK = 0x3F0000000L,
        BGFX_STATE_CULL_MASK           = 0x3000000000L,
        BGFX_STATE_ALPHA_REF_MASK      = 0xFF0000000000L,
        BGFX_STATE_PT_MASK             = 0x7000000000000L,
        BGFX_STATE_POINT_SIZE_MASK     = 0xF0000000000000L,
        BGFX_STATE_RESERVED_MASK       = 0xe000000000000000L,
        BGFX_STATE_MASK                = 0xffffffffffffffffL;

    public static final int
        BGFX_STATE_DEPTH_TEST_SHIFT     = 4,
        BGFX_STATE_BLEND_SHIFT          = 12,
        BGFX_STATE_BLEND_EQUATION_SHIFT = 28,
        BGFX_STATE_CULL_SHIFT           = 36,
        BGFX_STATE_ALPHA_REF_SHIFT      = 40,
        BGFX_STATE_PT_SHIFT             = 48,
        BGFX_STATE_POINT_SIZE_SHIFT     = 52,
        BGFX_STATE_RESERVED_SHIFT       = 61;

    public static final int
        BGFX_STENCIL_TEST_LESS         = 0x10000,
        BGFX_STENCIL_TEST_LEQUAL       = 0x20000,
        BGFX_STENCIL_TEST_EQUAL        = 0x30000,
        BGFX_STENCIL_TEST_GEQUAL       = 0x40000,
        BGFX_STENCIL_TEST_GREATER      = 0x50000,
        BGFX_STENCIL_TEST_NOTEQUAL     = 0x60000,
        BGFX_STENCIL_TEST_NEVER        = 0x70000,
        BGFX_STENCIL_TEST_ALWAYS       = 0x80000,
        BGFX_STENCIL_OP_FAIL_S_ZERO    = 0x0,
        BGFX_STENCIL_OP_FAIL_S_KEEP    = 0x100000,
        BGFX_STENCIL_OP_FAIL_S_REPLACE = 0x200000,
        BGFX_STENCIL_OP_FAIL_S_INCR    = 0x300000,
        BGFX_STENCIL_OP_FAIL_S_INCRSAT = 0x400000,
        BGFX_STENCIL_OP_FAIL_S_DECR    = 0x500000,
        BGFX_STENCIL_OP_FAIL_S_DECRSAT = 0x600000,
        BGFX_STENCIL_OP_FAIL_S_INVERT  = 0x700000,
        BGFX_STENCIL_OP_FAIL_Z_ZERO    = 0x0,
        BGFX_STENCIL_OP_FAIL_Z_KEEP    = 0x1000000,
        BGFX_STENCIL_OP_FAIL_Z_REPLACE = 0x2000000,
        BGFX_STENCIL_OP_FAIL_Z_INCR    = 0x3000000,
        BGFX_STENCIL_OP_FAIL_Z_INCRSAT = 0x4000000,
        BGFX_STENCIL_OP_FAIL_Z_DECR    = 0x5000000,
        BGFX_STENCIL_OP_FAIL_Z_DECRSAT = 0x6000000,
        BGFX_STENCIL_OP_FAIL_Z_INVERT  = 0x7000000,
        BGFX_STENCIL_OP_PASS_Z_ZERO    = 0x0,
        BGFX_STENCIL_OP_PASS_Z_KEEP    = 0x10000000,
        BGFX_STENCIL_OP_PASS_Z_REPLACE = 0x20000000,
        BGFX_STENCIL_OP_PASS_Z_INCR    = 0x30000000,
        BGFX_STENCIL_OP_PASS_Z_INCRSAT = 0x40000000,
        BGFX_STENCIL_OP_PASS_Z_DECR    = 0x50000000,
        BGFX_STENCIL_OP_PASS_Z_DECRSAT = 0x60000000,
        BGFX_STENCIL_OP_PASS_Z_INVERT  = 0x70000000,
        BGFX_STENCIL_NONE              = 0x0,
        BGFX_STENCIL_DEFAULT           = 0x0;

    public static final int
        BGFX_STENCIL_FUNC_REF_SHIFT   = 0,
        BGFX_STENCIL_FUNC_REF_MASK    = 0xFF,
        BGFX_STENCIL_FUNC_RMASK_SHIFT = 8,
        BGFX_STENCIL_FUNC_RMASK_MASK  = 0xFF00,
        BGFX_STENCIL_TEST_SHIFT       = 16,
        BGFX_STENCIL_TEST_MASK        = 0xF0000,
        BGFX_STENCIL_OP_FAIL_S_SHIFT  = 20,
        BGFX_STENCIL_OP_FAIL_S_MASK   = 0xF00000,
        BGFX_STENCIL_OP_FAIL_Z_SHIFT  = 24,
        BGFX_STENCIL_OP_FAIL_Z_MASK   = 0xF000000,
        BGFX_STENCIL_OP_PASS_Z_SHIFT  = 28,
        BGFX_STENCIL_OP_PASS_Z_MASK   = 0xf0000000,
        BGFX_STENCIL_MASK             = 0xffffffff;

    public static final int
        BGFX_CLEAR_NONE               = 0x0,
        BGFX_CLEAR_COLOR              = 0x1,
        BGFX_CLEAR_DEPTH              = 0x2,
        BGFX_CLEAR_STENCIL            = 0x4,
        BGFX_CLEAR_DISCARD_COLOR_0    = 0x8,
        BGFX_CLEAR_DISCARD_COLOR_1    = 0x10,
        BGFX_CLEAR_DISCARD_COLOR_2    = 0x20,
        BGFX_CLEAR_DISCARD_COLOR_3    = 0x40,
        BGFX_CLEAR_DISCARD_COLOR_4    = 0x80,
        BGFX_CLEAR_DISCARD_COLOR_5    = 0x100,
        BGFX_CLEAR_DISCARD_COLOR_6    = 0x200,
        BGFX_CLEAR_DISCARD_COLOR_7    = 0x400,
        BGFX_CLEAR_DISCARD_DEPTH      = 0x800,
        BGFX_CLEAR_DISCARD_STENCIL    = 0x1000,
        BGFX_CLEAR_DISCARD_COLOR_MASK = (0
        | BGFX_CLEAR_DISCARD_COLOR_0
        | BGFX_CLEAR_DISCARD_COLOR_1
        | BGFX_CLEAR_DISCARD_COLOR_2
        | BGFX_CLEAR_DISCARD_COLOR_3
        | BGFX_CLEAR_DISCARD_COLOR_4
        | BGFX_CLEAR_DISCARD_COLOR_5
        | BGFX_CLEAR_DISCARD_COLOR_6
        | BGFX_CLEAR_DISCARD_COLOR_7)
        ,
        BGFX_CLEAR_DISCARD_MASK       = (0
        | BGFX_CLEAR_DISCARD_COLOR_MASK
        | BGFX_CLEAR_DISCARD_DEPTH
        | BGFX_CLEAR_DISCARD_STENCIL)
        ;

    public static final byte
        BGFX_DISCARD_NONE           = 0x0,
        BGFX_DISCARD_BINDINGS       = 0x1,
        BGFX_DISCARD_INDEX_BUFFER   = 0x2,
        BGFX_DISCARD_INSTANCE_DATA  = 0x4,
        BGFX_DISCARD_STATE          = 0x8,
        BGFX_DISCARD_TRANSFORM      = 0x10,
        BGFX_DISCARD_VERTEX_STREAMS = 0x20,
        BGFX_DISCARD_ALL            = (byte)0xFF;

    public static final int
        BGFX_DEBUG_NONE      = 0x0,
        BGFX_DEBUG_WIREFRAME = 0x1,
        BGFX_DEBUG_IFH       = 0x2,
        BGFX_DEBUG_STATS     = 0x4,
        BGFX_DEBUG_TEXT      = 0x8,
        BGFX_DEBUG_PROFILER  = 0x10;

    public static final int
        BGFX_BUFFER_NONE               = 0x0,
        BGFX_BUFFER_COMPUTE_READ       = 0x100,
        BGFX_BUFFER_COMPUTE_WRITE      = 0x200,
        BGFX_BUFFER_DRAW_INDIRECT      = 0x400,
        BGFX_BUFFER_ALLOW_RESIZE       = 0x800,
        BGFX_BUFFER_INDEX32            = 0x1000,
        BGFX_BUFFER_COMPUTE_READ_WRITE = (0
        | BGFX_BUFFER_COMPUTE_READ
        | BGFX_BUFFER_COMPUTE_WRITE)
        ;

    public static final short
        BGFX_BUFFER_COMPUTE_FORMAT_8x1   = 0x1,
        BGFX_BUFFER_COMPUTE_FORMAT_8x2   = 0x2,
        BGFX_BUFFER_COMPUTE_FORMAT_8x4   = 0x3,
        BGFX_BUFFER_COMPUTE_FORMAT_16x1  = 0x4,
        BGFX_BUFFER_COMPUTE_FORMAT_16x2  = 0x5,
        BGFX_BUFFER_COMPUTE_FORMAT_16x4  = 0x6,
        BGFX_BUFFER_COMPUTE_FORMAT_32x1  = 0x7,
        BGFX_BUFFER_COMPUTE_FORMAT_32x2  = 0x8,
        BGFX_BUFFER_COMPUTE_FORMAT_32x4  = 0x9,
        BGFX_BUFFER_COMPUTE_FORMAT_SHIFT = 0,
        BGFX_BUFFER_COMPUTE_FORMAT_MASK  = 0xF,
        BGFX_BUFFER_COMPUTE_TYPE_INT     = 0x10,
        BGFX_BUFFER_COMPUTE_TYPE_UINT    = 0x20,
        BGFX_BUFFER_COMPUTE_TYPE_FLOAT   = 0x30,
        BGFX_BUFFER_COMPUTE_TYPE_SHIFT   = 4,
        BGFX_BUFFER_COMPUTE_TYPE_MASK    = 0x30;

    public static final long
        BGFX_TEXTURE_NONE          = 0x0L,
        BGFX_TEXTURE_MSAA_SAMPLE   = 0x800000000L,
        BGFX_TEXTURE_RT            = 0x1000000000L,
        BGFX_TEXTURE_RT_MSAA_X2    = 0x2000000000L,
        BGFX_TEXTURE_RT_MSAA_X4    = 0x3000000000L,
        BGFX_TEXTURE_RT_MSAA_X8    = 0x4000000000L,
        BGFX_TEXTURE_RT_MSAA_X16   = 0x5000000000L,
        BGFX_TEXTURE_RT_WRITE_ONLY = 0x8000000000L,
        BGFX_TEXTURE_COMPUTE_WRITE = 0x100000000000L,
        BGFX_TEXTURE_SRGB          = 0x200000000000L,
        BGFX_TEXTURE_BLIT_DST      = 0x400000000000L,
        BGFX_TEXTURE_READ_BACK     = 0x800000000000L;

    public static final int BGFX_TEXTURE_RT_MSAA_SHIFT = 36;

    public static final long
        BGFX_TEXTURE_RT_MSAA_MASK = 0x7000000000L,
        BGFX_TEXTURE_RT_MASK      = 0xF000000000L;

    public static final int
        BGFX_SAMPLER_NONE             = 0x0,
        BGFX_SAMPLER_U_MIRROR         = 0x1,
        BGFX_SAMPLER_U_CLAMP          = 0x2,
        BGFX_SAMPLER_U_BORDER         = 0x3,
        BGFX_SAMPLER_V_MIRROR         = 0x4,
        BGFX_SAMPLER_V_CLAMP          = 0x8,
        BGFX_SAMPLER_V_BORDER         = 0xC,
        BGFX_SAMPLER_W_MIRROR         = 0x10,
        BGFX_SAMPLER_W_CLAMP          = 0x20,
        BGFX_SAMPLER_W_BORDER         = 0x30,
        BGFX_SAMPLER_UVW_MIRROR       = (0 | BGFX_SAMPLER_U_MIRROR | BGFX_SAMPLER_V_MIRROR | BGFX_SAMPLER_W_MIRROR),
        BGFX_SAMPLER_UVW_CLAMP        = (0 | BGFX_SAMPLER_U_CLAMP | BGFX_SAMPLER_V_CLAMP | BGFX_SAMPLER_W_CLAMP),
        BGFX_SAMPLER_UVW_BORDER       = (0 | BGFX_SAMPLER_U_BORDER | BGFX_SAMPLER_V_BORDER | BGFX_SAMPLER_W_BORDER),
        BGFX_SAMPLER_MIN_POINT        = 0x40,
        BGFX_SAMPLER_MIN_ANISOTROPIC  = 0x80,
        BGFX_SAMPLER_MAG_POINT        = 0x100,
        BGFX_SAMPLER_MAG_ANISOTROPIC  = 0x200,
        BGFX_SAMPLER_MIP_POINT        = 0x400,
        BGFX_SAMPLER_POINT            = (0 | BGFX_SAMPLER_MIN_POINT | BGFX_SAMPLER_MAG_POINT | BGFX_SAMPLER_MIP_POINT),
        BGFX_SAMPLER_COMPARE_LESS     = 0x10000,
        BGFX_SAMPLER_COMPARE_LEQUAL   = 0x20000,
        BGFX_SAMPLER_COMPARE_EQUAL    = 0x30000,
        BGFX_SAMPLER_COMPARE_GEQUAL   = 0x40000,
        BGFX_SAMPLER_COMPARE_GREATER  = 0x50000,
        BGFX_SAMPLER_COMPARE_NOTEQUAL = 0x60000,
        BGFX_SAMPLER_COMPARE_NEVER    = 0x70000,
        BGFX_SAMPLER_COMPARE_ALWAYS   = 0x80000,
        BGFX_SAMPLER_SAMPLE_STENCIL   = 0x100000;

    public static final int
        BGFX_SAMPLER_U_SHIFT            = 0,
        BGFX_SAMPLER_U_MASK             = 0x3,
        BGFX_SAMPLER_V_SHIFT            = 2,
        BGFX_SAMPLER_V_MASK             = 0xC,
        BGFX_SAMPLER_W_SHIFT            = 4,
        BGFX_SAMPLER_W_MASK             = 0x30,
        BGFX_SAMPLER_MIN_SHIFT          = 6,
        BGFX_SAMPLER_MIN_MASK           = 0xC0,
        BGFX_SAMPLER_MAG_SHIFT          = 8,
        BGFX_SAMPLER_MAG_MASK           = 0x300,
        BGFX_SAMPLER_MIP_SHIFT          = 10,
        BGFX_SAMPLER_MIP_MASK           = 0x400,
        BGFX_SAMPLER_COMPARE_SHIFT      = 16,
        BGFX_SAMPLER_COMPARE_MASK       = 0xF0000,
        BGFX_SAMPLER_BORDER_COLOR_SHIFT = 24,
        BGFX_SAMPLER_BORDER_COLOR_MASK  = 0xF000000,
        BGFX_SAMPLER_RESERVED_SHIFT     = 28,
        BGFX_SAMPLER_RESERVED_MASK      = 0xF0000000,
        BGFX_SAMPLER_SAMPLER_BITS_MASK  = (0
        | BGFX_SAMPLER_U_MASK
        | BGFX_SAMPLER_V_MASK
        | BGFX_SAMPLER_W_MASK
        | BGFX_SAMPLER_MIN_MASK
        | BGFX_SAMPLER_MAG_MASK
        | BGFX_SAMPLER_MIP_MASK
        | BGFX_SAMPLER_COMPARE_MASK)
        ;

    public static final int
        BGFX_RESET_NONE                   = 0x0,
        BGFX_RESET_FULLSCREEN             = 0x1,
        BGFX_RESET_FULLSCREEN_SHIFT       = 0,
        BGFX_RESET_FULLSCREEN_MASK        = 0x1,
        BGFX_RESET_MSAA_X2                = 0x10,
        BGFX_RESET_MSAA_X4                = 0x20,
        BGFX_RESET_MSAA_X8                = 0x30,
        BGFX_RESET_MSAA_X16               = 0x40,
        BGFX_RESET_MSAA_SHIFT             = 4,
        BGFX_RESET_MSAA_MASK              = 0x70,
        BGFX_RESET_VSYNC                  = 0x80,
        BGFX_RESET_MAXANISOTROPY          = 0x100,
        BGFX_RESET_CAPTURE                = 0x200,
        BGFX_RESET_FLUSH_AFTER_RENDER     = 0x2000,
        BGFX_RESET_FLIP_AFTER_RENDER      = 0x4000,
        BGFX_RESET_SRGB_BACKBUFFER        = 0x8000,
        BGFX_RESET_HDR10                  = 0x10000,
        BGFX_RESET_HIDPI                  = 0x20000,
        BGFX_RESET_DEPTH_CLAMP            = 0x40000,
        BGFX_RESET_SUSPEND                = 0x80000,
        BGFX_RESET_TRANSPARENT_BACKBUFFER = 0x100000;

    public static final int
        BGFX_RESET_RESERVED_SHIFT = 31,
        BGFX_RESET_RESERVED_MASK  = 0x80000000;

    public static final long
        BGFX_CAPS_ALPHA_TO_COVERAGE        = 0x1L,
        BGFX_CAPS_BLEND_INDEPENDENT        = 0x2L,
        BGFX_CAPS_COMPUTE                  = 0x4L,
        BGFX_CAPS_CONSERVATIVE_RASTER      = 0x8L,
        BGFX_CAPS_DRAW_INDIRECT            = 0x10L,
        BGFX_CAPS_DRAW_INDIRECT_COUNT      = 0x20L,
        BGFX_CAPS_FRAGMENT_DEPTH           = 0x40L,
        BGFX_CAPS_FRAGMENT_ORDERING        = 0x80L,
        BGFX_CAPS_GRAPHICS_DEBUGGER        = 0x100L,
        BGFX_CAPS_HDR10                    = 0x200L,
        BGFX_CAPS_HIDPI                    = 0x400L,
        BGFX_CAPS_IMAGE_RW                 = 0x800L,
        BGFX_CAPS_INDEX32                  = 0x1000L,
        BGFX_CAPS_INSTANCING               = 0x2000L,
        BGFX_CAPS_OCCLUSION_QUERY          = 0x4000L,
        BGFX_CAPS_PRIMITIVE_ID             = 0x8000L,
        BGFX_CAPS_RENDERER_MULTITHREADED   = 0x10000L,
        BGFX_CAPS_SWAP_CHAIN               = 0x20000L,
        BGFX_CAPS_TEXTURE_BLIT             = 0x40000L,
        BGFX_CAPS_TEXTURE_COMPARE_LEQUAL   = 0x80000L,
        BGFX_CAPS_TEXTURE_COMPARE_RESERVED = 0x100000L,
        BGFX_CAPS_TEXTURE_CUBE_ARRAY       = 0x200000L,
        BGFX_CAPS_TEXTURE_DIRECT_ACCESS    = 0x400000L,
        BGFX_CAPS_TEXTURE_READ_BACK        = 0x800000L,
        BGFX_CAPS_TEXTURE_2D_ARRAY         = 0x1000000L,
        BGFX_CAPS_TEXTURE_3D               = 0x2000000L,
        BGFX_CAPS_TRANSPARENT_BACKBUFFER   = 0x4000000L,
        BGFX_CAPS_VERTEX_ATTRIB_HALF       = 0x8000000L,
        BGFX_CAPS_VERTEX_ATTRIB_UINT10     = 0x10000000L,
        BGFX_CAPS_VERTEX_ID                = 0x20000000L,
        BGFX_CAPS_VIEWPORT_LAYER_ARRAY     = 0x40000000L,
        BGFX_CAPS_TEXTURE_COMPARE_ALL      = BGFX_CAPS_TEXTURE_COMPARE_RESERVED | BGFX_CAPS_TEXTURE_COMPARE_LEQUAL;

    public static final int
        BGFX_CAPS_FORMAT_TEXTURE_NONE             = 0x0,
        BGFX_CAPS_FORMAT_TEXTURE_2D               = 0x1,
        BGFX_CAPS_FORMAT_TEXTURE_2D_SRGB          = 0x2,
        BGFX_CAPS_FORMAT_TEXTURE_2D_EMULATED      = 0x4,
        BGFX_CAPS_FORMAT_TEXTURE_3D               = 0x8,
        BGFX_CAPS_FORMAT_TEXTURE_3D_SRGB          = 0x10,
        BGFX_CAPS_FORMAT_TEXTURE_3D_EMULATED      = 0x20,
        BGFX_CAPS_FORMAT_TEXTURE_CUBE             = 0x40,
        BGFX_CAPS_FORMAT_TEXTURE_CUBE_SRGB        = 0x80,
        BGFX_CAPS_FORMAT_TEXTURE_CUBE_EMULATED    = 0x100,
        BGFX_CAPS_FORMAT_TEXTURE_VERTEX           = 0x200,
        BGFX_CAPS_FORMAT_TEXTURE_IMAGE_READ       = 0x400,
        BGFX_CAPS_FORMAT_TEXTURE_IMAGE_WRITE      = 0x800,
        BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER      = 0x1000,
        BGFX_CAPS_FORMAT_TEXTURE_FRAMEBUFFER_MSAA = 0x2000,
        BGFX_CAPS_FORMAT_TEXTURE_MSAA             = 0x4000,
        BGFX_CAPS_FORMAT_TEXTURE_MIP_AUTOGEN      = 0x8000;

    public static final byte
        BGFX_RESOLVE_NONE          = 0x0,
        BGFX_RESOLVE_AUTO_GEN_MIPS = 0x1;

    public static final short
        BGFX_PCI_ID_NONE                = 0x0,
        BGFX_PCI_ID_SOFTWARE_RASTERIZER = 0x1,
        BGFX_PCI_ID_AMD                 = 0x1002,
        BGFX_PCI_ID_APPLE               = 0x106B,
        BGFX_PCI_ID_INTEL               = (short)0x8086,
        BGFX_PCI_ID_NVIDIA              = 0x10DE,
        BGFX_PCI_ID_MICROSOFT           = 0x1414,
        BGFX_PCI_ID_ARM                 = 0x13B5;

    public static final byte
        BGFX_CUBE_MAP_POSITIVE_X = 0x0,
        BGFX_CUBE_MAP_NEGATIVE_X = 0x1,
        BGFX_CUBE_MAP_POSITIVE_Y = 0x2,
        BGFX_CUBE_MAP_NEGATIVE_Y = 0x3,
        BGFX_CUBE_MAP_POSITIVE_Z = 0x4,
        BGFX_CUBE_MAP_NEGATIVE_Z = 0x5;

    public static final int
        BGFX_FATAL_DEBUG_CHECK              = 0,
        BGFX_FATAL_INVALID_SHADER           = 1,
        BGFX_FATAL_UNABLE_TO_INITIALIZE     = 2,
        BGFX_FATAL_UNABLE_TO_CREATE_TEXTURE = 3,
        BGFX_FATAL_DEVICE_LOST              = 4,
        BGFX_FATAL_COUNT                    = 5;

    public static final int
        BGFX_RENDERER_TYPE_NOOP       = 0,
        BGFX_RENDERER_TYPE_AGC        = 1,
        BGFX_RENDERER_TYPE_DIRECT3D11 = 2,
        BGFX_RENDERER_TYPE_DIRECT3D12 = 3,
        BGFX_RENDERER_TYPE_GNM        = 4,
        BGFX_RENDERER_TYPE_METAL      = 5,
        BGFX_RENDERER_TYPE_NVN        = 6,
        BGFX_RENDERER_TYPE_OPENGLES   = 7,
        BGFX_RENDERER_TYPE_OPENGL     = 8,
        BGFX_RENDERER_TYPE_VULKAN     = 9,
        BGFX_RENDERER_TYPE_COUNT      = 10;

    public static final int
        BGFX_ACCESS_READ      = 0,
        BGFX_ACCESS_WRITE     = 1,
        BGFX_ACCESS_READWRITE = 2,
        BGFX_ACCESS_COUNT     = 3;

    public static final int
        BGFX_ATTRIB_POSITION  = 0,
        BGFX_ATTRIB_NORMAL    = 1,
        BGFX_ATTRIB_TANGENT   = 2,
        BGFX_ATTRIB_BITANGENT = 3,
        BGFX_ATTRIB_COLOR0    = 4,
        BGFX_ATTRIB_COLOR1    = 5,
        BGFX_ATTRIB_COLOR2    = 6,
        BGFX_ATTRIB_COLOR3    = 7,
        BGFX_ATTRIB_INDICES   = 8,
        BGFX_ATTRIB_WEIGHT    = 9,
        BGFX_ATTRIB_TEXCOORD0 = 10,
        BGFX_ATTRIB_TEXCOORD1 = 11,
        BGFX_ATTRIB_TEXCOORD2 = 12,
        BGFX_ATTRIB_TEXCOORD3 = 13,
        BGFX_ATTRIB_TEXCOORD4 = 14,
        BGFX_ATTRIB_TEXCOORD5 = 15,
        BGFX_ATTRIB_TEXCOORD6 = 16,
        BGFX_ATTRIB_TEXCOORD7 = 17,
        BGFX_ATTRIB_COUNT     = BGFX_ATTRIB_TEXCOORD7 + 1;

    public static final int
        BGFX_ATTRIB_TYPE_UINT8  = 0,
        BGFX_ATTRIB_TYPE_UINT10 = 1,
        BGFX_ATTRIB_TYPE_INT16  = 2,
        BGFX_ATTRIB_TYPE_HALF   = 3,
        BGFX_ATTRIB_TYPE_FLOAT  = 4,
        BGFX_ATTRIB_TYPE_COUNT  = BGFX_ATTRIB_TYPE_FLOAT + 1;

    public static final int
        BGFX_TEXTURE_FORMAT_BC1           = 0,
        BGFX_TEXTURE_FORMAT_BC2           = 1,
        BGFX_TEXTURE_FORMAT_BC3           = 2,
        BGFX_TEXTURE_FORMAT_BC4           = 3,
        BGFX_TEXTURE_FORMAT_BC5           = 4,
        BGFX_TEXTURE_FORMAT_BC6H          = 5,
        BGFX_TEXTURE_FORMAT_BC7           = 6,
        BGFX_TEXTURE_FORMAT_ETC1          = 7,
        BGFX_TEXTURE_FORMAT_ETC2          = 8,
        BGFX_TEXTURE_FORMAT_ETC2A         = 9,
        BGFX_TEXTURE_FORMAT_ETC2A1        = 10,
        BGFX_TEXTURE_FORMAT_PTC12         = 11,
        BGFX_TEXTURE_FORMAT_PTC14         = 12,
        BGFX_TEXTURE_FORMAT_PTC12A        = 13,
        BGFX_TEXTURE_FORMAT_PTC14A        = 14,
        BGFX_TEXTURE_FORMAT_PTC22         = 15,
        BGFX_TEXTURE_FORMAT_PTC24         = 16,
        BGFX_TEXTURE_FORMAT_ATC           = 17,
        BGFX_TEXTURE_FORMAT_ATCE          = 18,
        BGFX_TEXTURE_FORMAT_ATCI          = 19,
        BGFX_TEXTURE_FORMAT_ASTC4x4       = 20,
        BGFX_TEXTURE_FORMAT_ASTC5X4       = 21,
        BGFX_TEXTURE_FORMAT_ASTC5x5       = 22,
        BGFX_TEXTURE_FORMAT_ASTC6X5       = 23,
        BGFX_TEXTURE_FORMAT_ASTC6x6       = 24,
        BGFX_TEXTURE_FORMAT_ASTC8x5       = 25,
        BGFX_TEXTURE_FORMAT_ASTC8x6       = 26,
        BGFX_TEXTURE_FORMAT_ASTC8X8       = 27,
        BGFX_TEXTURE_FORMAT_ASTC10x5      = 28,
        BGFX_TEXTURE_FORMAT_ASTC10X6      = 29,
        BGFX_TEXTURE_FORMAT_ASTC10X8      = 30,
        BGFX_TEXTURE_FORMAT_ASTC10X10     = 31,
        BGFX_TEXTURE_FORMAT_ASTC12X10     = 32,
        BGFX_TEXTURE_FORMAT_ASTC12X12     = 33,
        BGFX_TEXTURE_FORMAT_UNKNOWN       = 34,
        BGFX_TEXTURE_FORMAT_R1            = 35,
        BGFX_TEXTURE_FORMAT_A8            = 36,
        BGFX_TEXTURE_FORMAT_R8            = 37,
        BGFX_TEXTURE_FORMAT_R8I           = 38,
        BGFX_TEXTURE_FORMAT_R8U           = 39,
        BGFX_TEXTURE_FORMAT_R8S           = 40,
        BGFX_TEXTURE_FORMAT_R16           = 41,
        BGFX_TEXTURE_FORMAT_R16I          = 42,
        BGFX_TEXTURE_FORMAT_R16U          = 43,
        BGFX_TEXTURE_FORMAT_R16F          = 44,
        BGFX_TEXTURE_FORMAT_R16S          = 45,
        BGFX_TEXTURE_FORMAT_R32I          = 46,
        BGFX_TEXTURE_FORMAT_R32U          = 47,
        BGFX_TEXTURE_FORMAT_R32F          = 48,
        BGFX_TEXTURE_FORMAT_RG8           = 49,
        BGFX_TEXTURE_FORMAT_RG8I          = 50,
        BGFX_TEXTURE_FORMAT_RG8U          = 51,
        BGFX_TEXTURE_FORMAT_RG8S          = 52,
        BGFX_TEXTURE_FORMAT_RG16          = 53,
        BGFX_TEXTURE_FORMAT_RG16I         = 54,
        BGFX_TEXTURE_FORMAT_RG16U         = 55,
        BGFX_TEXTURE_FORMAT_RG16F         = 56,
        BGFX_TEXTURE_FORMAT_RG16S         = 57,
        BGFX_TEXTURE_FORMAT_RG32I         = 58,
        BGFX_TEXTURE_FORMAT_RG32U         = 59,
        BGFX_TEXTURE_FORMAT_RG32F         = 60,
        BGFX_TEXTURE_FORMAT_RGB8          = 61,
        BGFX_TEXTURE_FORMAT_RGB8I         = 62,
        BGFX_TEXTURE_FORMAT_RGB8U         = 63,
        BGFX_TEXTURE_FORMAT_RGB8S         = 64,
        BGFX_TEXTURE_FORMAT_RGB9E5F       = 65,
        BGFX_TEXTURE_FORMAT_BGRA8         = 66,
        BGFX_TEXTURE_FORMAT_RGBA8         = 67,
        BGFX_TEXTURE_FORMAT_RGBA8I        = 68,
        BGFX_TEXTURE_FORMAT_RGBA8U        = 69,
        BGFX_TEXTURE_FORMAT_RGBA8S        = 70,
        BGFX_TEXTURE_FORMAT_RGBA16        = 71,
        BGFX_TEXTURE_FORMAT_RGBA16I       = 72,
        BGFX_TEXTURE_FORMAT_RGBA16U       = 73,
        BGFX_TEXTURE_FORMAT_RGBA16F       = 74,
        BGFX_TEXTURE_FORMAT_RGBA16S       = 75,
        BGFX_TEXTURE_FORMAT_RGBA32I       = 76,
        BGFX_TEXTURE_FORMAT_RGBA32U       = 77,
        BGFX_TEXTURE_FORMAT_RGBA32F       = 78,
        BGFX_TEXTURE_FORMAT_B5G6R5        = 79,
        BGFX_TEXTURE_FORMAT_R5G6B5        = 80,
        BGFX_TEXTURE_FORMAT_BGRA4         = 81,
        BGFX_TEXTURE_FORMAT_RGBA4         = 82,
        BGFX_TEXTURE_FORMAT_BGR5A1        = 83,
        BGFX_TEXTURE_FORMAT_RGB5A1        = 84,
        BGFX_TEXTURE_FORMAT_RGB10A2       = 85,
        BGFX_TEXTURE_FORMAT_RG11B10F      = 86,
        BGFX_TEXTURE_FORMAT_UNKNOWN_DEPTH = 87,
        BGFX_TEXTURE_FORMAT_D16           = 88,
        BGFX_TEXTURE_FORMAT_D24           = 89,
        BGFX_TEXTURE_FORMAT_D24S8         = 90,
        BGFX_TEXTURE_FORMAT_D32           = 91,
        BGFX_TEXTURE_FORMAT_D16F          = 92,
        BGFX_TEXTURE_FORMAT_D24F          = 93,
        BGFX_TEXTURE_FORMAT_D32F          = 94,
        BGFX_TEXTURE_FORMAT_D0S8          = 95,
        BGFX_TEXTURE_FORMAT_COUNT         = BGFX_TEXTURE_FORMAT_D0S8 + 1;

    public static final int
        BGFX_UNIFORM_TYPE_SAMPLER = 0,
        BGFX_UNIFORM_TYPE_END     = 1,
        BGFX_UNIFORM_TYPE_VEC4    = 2,
        BGFX_UNIFORM_TYPE_MAT3    = 3,
        BGFX_UNIFORM_TYPE_MAT4    = 4,
        BGFX_UNIFORM_TYPE_COUNT   = 5;

    public static final int
        BGFX_BACKBUFFER_RATIO_EQUAL     = 0,
        BGFX_BACKBUFFER_RATIO_HALF      = 1,
        BGFX_BACKBUFFER_RATIO_QUARTER   = 2,
        BGFX_BACKBUFFER_RATIO_EIGHTH    = 3,
        BGFX_BACKBUFFER_RATIO_SIXTEENTH = 4,
        BGFX_BACKBUFFER_RATIO_DOUBLE    = 5,
        BGFX_BACKBUFFER_RATIO_COUNT     = 6;

    public static final int
        BGFX_OCCLUSION_QUERY_RESULT_INVISIBLE = 0,
        BGFX_OCCLUSION_QUERY_RESULT_VISIBLE   = 1,
        BGFX_OCCLUSION_QUERY_RESULT_NORESULT  = 2,
        BGFX_OCCLUSION_QUERY_RESULT_COUNT     = 3;

    public static final int
        BGFX_TOPOLOGY_TRI_LIST   = 0,
        BGFX_TOPOLOGY_TRI_STRIP  = 1,
        BGFX_TOPOLOGY_LINE_LIST  = 2,
        BGFX_TOPOLOGY_LINE_STRIP = 3,
        BGFX_TOPOLOGY_POINT_LIST = 4,
        BGFX_TOPOLOGY_COUNT      = 5;

    public static final int
        BGFX_TOPOLOGY_CONVERT_TRI_LIST_FLIP_WINDING   = 0,
        BGFX_TOPOLOGY_CONVERT_TRI_STRIP_FLIP_WINDING  = 1,
        BGFX_TOPOLOGY_CONVERT_TRI_LIST_TO_LINE_LIST   = 2,
        BGFX_TOPOLOGY_CONVERT_TRI_STRIP_TO_TRI_LIST   = 3,
        BGFX_TOPOLOGY_CONVERT_LINE_STRIP_TO_LINE_LIST = 4,
        BGFX_TOPOLOGY_CONVERT_COUNT                   = 5;

    public static final int
        BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MIN = 0,
        BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_AVG = 1,
        BGFX_TOPOLOGY_SORT_DIRECTION_FRONT_TO_BACK_MAX = 2,
        BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MIN = 3,
        BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_AVG = 4,
        BGFX_TOPOLOGY_SORT_DIRECTION_BACK_TO_FRONT_MAX = 5,
        BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MIN  = 6,
        BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_AVG  = 7,
        BGFX_TOPOLOGY_SORT_DISTANCE_FRONT_TO_BACK_MAX  = 8,
        BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MIN  = 9,
        BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_AVG  = 10,
        BGFX_TOPOLOGY_SORT_DISTANCE_BACK_TO_FRONT_MAX  = 11,
        BGFX_TOPOLOGY_SORT_COUNT                       = 12;

    public static final int
        BGFX_VIEW_MODE_DEFAULT          = 0,
        BGFX_VIEW_MODE_SEQUENTIAL       = 1,
        BGFX_VIEW_MODE_DEPTH_ASCENDING  = 2,
        BGFX_VIEW_MODE_DEPTH_DESCENDING = 3,
        BGFX_VIEW_MODE_COUNT            = 4;

    public static final int
        BGFX_NATIVE_WINDOW_HANDLE_TYPE_DEFAULT = 0,
        BGFX_NATIVE_WINDOW_HANDLE_TYPE_WAYLAND = 1,
        BGFX_NATIVE_WINDOW_HANDLE_TYPE_COUNT   = 2;

    public static final long
        BGFX_STATE_BLEND_ADD         = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE),
        BGFX_STATE_BLEND_ALPHA       = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_SRC_ALPHA, BGFX_STATE_BLEND_INV_SRC_ALPHA),
        BGFX_STATE_BLEND_DARKEN      = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MIN),
        BGFX_STATE_BLEND_LIGHTEN     = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_ONE) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_MAX),
        BGFX_STATE_BLEND_MULTIPLY    = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_ZERO),
        BGFX_STATE_BLEND_NORMAL      = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_ALPHA),
        BGFX_STATE_BLEND_SCREEN      = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_ONE, BGFX_STATE_BLEND_INV_SRC_COLOR),
        BGFX_STATE_BLEND_LINEAR_BURN = BGFX_STATE_BLEND_FUNC(BGFX_STATE_BLEND_DST_COLOR, BGFX_STATE_BLEND_INV_DST_COLOR) | BGFX_STATE_BLEND_EQUATION(BGFX_STATE_BLEND_EQUATION_SUB);

    protected BGFX() {
        throw new UnsupportedOperationException();
    }

    // --- [ bgfx_attachment_init ] ---

    /** {@code void bgfx_attachment_init(bgfx_attachment_t * _this, bgfx_texture_handle_t _handle, bgfx_access_t _access, uint16_t _layer, uint16_t _numLayers, uint16_t _mip, uint8_t _resolve)} */
    public static void nbgfx_attachment_init(long _this, short _handle, int _access, short _layer, short _numLayers, short _mip, byte _resolve) {
        long __functionAddress = Functions.attachment_init;
        invokePCCCCUV(_this, _handle, _access, _layer, _numLayers, _mip, _resolve, __functionAddress);
    }

    /** {@code void bgfx_attachment_init(bgfx_attachment_t * _this, bgfx_texture_handle_t _handle, bgfx_access_t _access, uint16_t _layer, uint16_t _numLayers, uint16_t _mip, uint8_t _resolve)} */
    public static void bgfx_attachment_init(@NativeType("bgfx_attachment_t *") BGFXAttachment _this, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("bgfx_access_t") int _access, @NativeType("uint16_t") int _layer, @NativeType("uint16_t") int _numLayers, @NativeType("uint16_t") int _mip, @NativeType("uint8_t") int _resolve) {
        nbgfx_attachment_init(_this.address(), _handle, _access, (short)_layer, (short)_numLayers, (short)_mip, (byte)_resolve);
    }

    // --- [ bgfx_vertex_layout_begin ] ---

    /** {@code bgfx_vertex_layout_t * bgfx_vertex_layout_begin(bgfx_vertex_layout_t * _this, bgfx_renderer_type_t _renderer)} */
    public static long nbgfx_vertex_layout_begin(long _this, int _renderer) {
        long __functionAddress = Functions.vertex_layout_begin;
        return invokePP(_this, _renderer, __functionAddress);
    }

    /** {@code bgfx_vertex_layout_t * bgfx_vertex_layout_begin(bgfx_vertex_layout_t * _this, bgfx_renderer_type_t _renderer)} */
    @NativeType("bgfx_vertex_layout_t *")
    public static @Nullable BGFXVertexLayout bgfx_vertex_layout_begin(@NativeType("bgfx_vertex_layout_t *") BGFXVertexLayout _this, @NativeType("bgfx_renderer_type_t") int _renderer) {
        long __result = nbgfx_vertex_layout_begin(_this.address(), _renderer);
        return BGFXVertexLayout.createSafe(__result);
    }

    // --- [ bgfx_vertex_layout_add ] ---

    /** {@code bgfx_vertex_layout_t * bgfx_vertex_layout_add(bgfx_vertex_layout_t * _this, bgfx_attrib_t _attrib, uint8_t _num, bgfx_attrib_type_t _type, bool _normalized, bool _asInt)} */
    public static long nbgfx_vertex_layout_add(long _this, int _attrib, byte _num, int _type, boolean _normalized, boolean _asInt) {
        long __functionAddress = Functions.vertex_layout_add;
        return invokePUP(_this, _attrib, _num, _type, _normalized, _asInt, __functionAddress);
    }

    /** {@code bgfx_vertex_layout_t * bgfx_vertex_layout_add(bgfx_vertex_layout_t * _this, bgfx_attrib_t _attrib, uint8_t _num, bgfx_attrib_type_t _type, bool _normalized, bool _asInt)} */
    @NativeType("bgfx_vertex_layout_t *")
    public static @Nullable BGFXVertexLayout bgfx_vertex_layout_add(@NativeType("bgfx_vertex_layout_t *") BGFXVertexLayout _this, @NativeType("bgfx_attrib_t") int _attrib, @NativeType("uint8_t") int _num, @NativeType("bgfx_attrib_type_t") int _type, @NativeType("bool") boolean _normalized, @NativeType("bool") boolean _asInt) {
        long __result = nbgfx_vertex_layout_add(_this.address(), _attrib, (byte)_num, _type, _normalized, _asInt);
        return BGFXVertexLayout.createSafe(__result);
    }

    // --- [ bgfx_vertex_layout_decode ] ---

    /** {@code void bgfx_vertex_layout_decode(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attrib, uint8_t * _num, bgfx_attrib_type_t * _type, bool * _normalized, bool * _asInt)} */
    public static void nbgfx_vertex_layout_decode(long _this, int _attrib, long _num, long _type, long _normalized, long _asInt) {
        long __functionAddress = Functions.vertex_layout_decode;
        invokePPPPPV(_this, _attrib, _num, _type, _normalized, _asInt, __functionAddress);
    }

    /** {@code void bgfx_vertex_layout_decode(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attrib, uint8_t * _num, bgfx_attrib_type_t * _type, bool * _normalized, bool * _asInt)} */
    public static void bgfx_vertex_layout_decode(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _this, @NativeType("bgfx_attrib_t") int _attrib, @NativeType("uint8_t *") ByteBuffer _num, @NativeType("bgfx_attrib_type_t *") IntBuffer _type, @NativeType("bool *") ByteBuffer _normalized, @NativeType("bool *") ByteBuffer _asInt) {
        if (CHECKS) {
            check(_num, 1);
            check(_type, 1);
            check(_normalized, 1);
            check(_asInt, 1);
        }
        nbgfx_vertex_layout_decode(_this.address(), _attrib, memAddress(_num), memAddress(_type), memAddress(_normalized), memAddress(_asInt));
    }

    // --- [ bgfx_vertex_layout_has ] ---

    /** {@code bool bgfx_vertex_layout_has(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attr)} */
    public static boolean nbgfx_vertex_layout_has(long _this, int _attr) {
        long __functionAddress = Functions.vertex_layout_has;
        return invokePZ(_this, _attr, __functionAddress);
    }

    /** {@code bool bgfx_vertex_layout_has(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attr)} */
    @NativeType("bool")
    public static boolean bgfx_vertex_layout_has(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _this, @NativeType("bgfx_attrib_t") int _attr) {
        return nbgfx_vertex_layout_has(_this.address(), _attr);
    }

    // --- [ bgfx_vertex_layout_skip ] ---

    /** {@code bgfx_vertex_layout_t * bgfx_vertex_layout_skip(bgfx_vertex_layout_t * _this, uint8_t _num)} */
    public static long nbgfx_vertex_layout_skip(long _this, byte _num) {
        long __functionAddress = Functions.vertex_layout_skip;
        return invokePUP(_this, _num, __functionAddress);
    }

    /** {@code bgfx_vertex_layout_t * bgfx_vertex_layout_skip(bgfx_vertex_layout_t * _this, uint8_t _num)} */
    @NativeType("bgfx_vertex_layout_t *")
    public static @Nullable BGFXVertexLayout bgfx_vertex_layout_skip(@NativeType("bgfx_vertex_layout_t *") BGFXVertexLayout _this, @NativeType("uint8_t") int _num) {
        long __result = nbgfx_vertex_layout_skip(_this.address(), (byte)_num);
        return BGFXVertexLayout.createSafe(__result);
    }

    // --- [ bgfx_vertex_layout_end ] ---

    /** {@code void bgfx_vertex_layout_end(bgfx_vertex_layout_t * _this)} */
    public static void nbgfx_vertex_layout_end(long _this) {
        long __functionAddress = Functions.vertex_layout_end;
        invokePV(_this, __functionAddress);
    }

    /** {@code void bgfx_vertex_layout_end(bgfx_vertex_layout_t * _this)} */
    public static void bgfx_vertex_layout_end(@NativeType("bgfx_vertex_layout_t *") BGFXVertexLayout _this) {
        nbgfx_vertex_layout_end(_this.address());
    }

    // --- [ bgfx_vertex_layout_get_offset ] ---

    /** {@code uint16_t bgfx_vertex_layout_get_offset(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attrib)} */
    public static short nbgfx_vertex_layout_get_offset(long _this, int _attrib) {
        long __functionAddress = Functions.vertex_layout_get_offset;
        return invokePC(_this, _attrib, __functionAddress);
    }

    /** {@code uint16_t bgfx_vertex_layout_get_offset(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attrib)} */
    @NativeType("uint16_t")
    public static short bgfx_vertex_layout_get_offset(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _this, @NativeType("bgfx_attrib_t") int _attrib) {
        return nbgfx_vertex_layout_get_offset(_this.address(), _attrib);
    }

    // --- [ bgfx_vertex_layout_get_stride ] ---

    /** {@code uint16_t bgfx_vertex_layout_get_stride(bgfx_vertex_layout_t const * _this)} */
    public static short nbgfx_vertex_layout_get_stride(long _this) {
        long __functionAddress = Functions.vertex_layout_get_stride;
        return invokePC(_this, __functionAddress);
    }

    /** {@code uint16_t bgfx_vertex_layout_get_stride(bgfx_vertex_layout_t const * _this)} */
    @NativeType("uint16_t")
    public static short bgfx_vertex_layout_get_stride(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _this) {
        return nbgfx_vertex_layout_get_stride(_this.address());
    }

    // --- [ bgfx_vertex_layout_get_size ] ---

    /** {@code uint32_t bgfx_vertex_layout_get_size(bgfx_vertex_layout_t const * _this, uint32_t _num)} */
    public static int nbgfx_vertex_layout_get_size(long _this, int _num) {
        long __functionAddress = Functions.vertex_layout_get_size;
        return invokePI(_this, _num, __functionAddress);
    }

    /** {@code uint32_t bgfx_vertex_layout_get_size(bgfx_vertex_layout_t const * _this, uint32_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_vertex_layout_get_size(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _this, @NativeType("uint32_t") int _num) {
        return nbgfx_vertex_layout_get_size(_this.address(), _num);
    }

    // --- [ bgfx_vertex_pack ] ---

    /** {@code void bgfx_vertex_pack(float const * _input, bool _inputNormalized, bgfx_attrib_t _attr, bgfx_vertex_layout_t const * _layout, void * _data, uint32_t _index)} */
    public static void nbgfx_vertex_pack(long _input, boolean _inputNormalized, int _attr, long _layout, long _data, int _index) {
        long __functionAddress = Functions.vertex_pack;
        invokePPPV(_input, _inputNormalized, _attr, _layout, _data, _index, __functionAddress);
    }

    /** {@code void bgfx_vertex_pack(float const * _input, bool _inputNormalized, bgfx_attrib_t _attr, bgfx_vertex_layout_t const * _layout, void * _data, uint32_t _index)} */
    public static void bgfx_vertex_pack(@NativeType("float const *") FloatBuffer _input, @NativeType("bool") boolean _inputNormalized, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        if (CHECKS) {
            check(_input, 4);
        }
        nbgfx_vertex_pack(memAddress(_input), _inputNormalized, _attr, _layout.address(), memAddress(_data), _index);
    }

    // --- [ bgfx_vertex_unpack ] ---

    /** {@code void bgfx_vertex_unpack(float * _output, bgfx_attrib_t _attr, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _index)} */
    public static void nbgfx_vertex_unpack(long _output, int _attr, long _layout, long _data, int _index) {
        long __functionAddress = Functions.vertex_unpack;
        invokePPPV(_output, _attr, _layout, _data, _index, __functionAddress);
    }

    /** {@code void bgfx_vertex_unpack(float * _output, bgfx_attrib_t _attr, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _index)} */
    public static void bgfx_vertex_unpack(@NativeType("float *") FloatBuffer _output, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        if (CHECKS) {
            check(_output, 4);
        }
        nbgfx_vertex_unpack(memAddress(_output), _attr, _layout.address(), memAddress(_data), _index);
    }

    // --- [ bgfx_vertex_convert ] ---

    /** {@code void bgfx_vertex_convert(bgfx_vertex_layout_t const * _dstLayout, void * _dstData, bgfx_vertex_layout_t const * _srcLayout, void const * _srcData, uint32_t _num)} */
    public static void nbgfx_vertex_convert(long _dstLayout, long _dstData, long _srcLayout, long _srcData, int _num) {
        long __functionAddress = Functions.vertex_convert;
        invokePPPPV(_dstLayout, _dstData, _srcLayout, _srcData, _num, __functionAddress);
    }

    /** {@code void bgfx_vertex_convert(bgfx_vertex_layout_t const * _dstLayout, void * _dstData, bgfx_vertex_layout_t const * _srcLayout, void const * _srcData, uint32_t _num)} */
    public static void bgfx_vertex_convert(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _dstLayout, @NativeType("void *") ByteBuffer _dstData, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _srcLayout, @NativeType("void const *") ByteBuffer _srcData, @NativeType("uint32_t") int _num) {
        nbgfx_vertex_convert(_dstLayout.address(), memAddress(_dstData), _srcLayout.address(), memAddress(_srcData), _num);
    }

    // --- [ bgfx_weld_vertices ] ---

    /** {@code uint32_t bgfx_weld_vertices(void * _output, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _num, bool _index32, float _epsilon)} */
    public static int nbgfx_weld_vertices(long _output, long _layout, long _data, int _num, boolean _index32, float _epsilon) {
        long __functionAddress = Functions.weld_vertices;
        return invokePPPI(_output, _layout, _data, _num, _index32, _epsilon, __functionAddress);
    }

    /** {@code uint32_t bgfx_weld_vertices(void * _output, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _num, bool _index32, float _epsilon)} */
    @NativeType("uint32_t")
    public static int bgfx_weld_vertices(@NativeType("void *") ByteBuffer _output, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("bool") boolean _index32, float _epsilon) {
        return nbgfx_weld_vertices(memAddress(_output), _layout.address(), memAddress(_data), _output.remaining() >> (_index32 ? 2 : 1), _index32, _epsilon);
    }

    /** {@code uint32_t bgfx_weld_vertices(void * _output, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _num, bool _index32, float _epsilon)} */
    @NativeType("uint32_t")
    public static int bgfx_weld_vertices(@NativeType("void *") ShortBuffer _output, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("bool") boolean _index32, float _epsilon) {
        return nbgfx_weld_vertices(memAddress(_output), _layout.address(), memAddress(_data), (int)(((long)_output.remaining() << 1) >> (_index32 ? 2 : 1)), _index32, _epsilon);
    }

    /** {@code uint32_t bgfx_weld_vertices(void * _output, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _num, bool _index32, float _epsilon)} */
    @NativeType("uint32_t")
    public static int bgfx_weld_vertices(@NativeType("void *") IntBuffer _output, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("bool") boolean _index32, float _epsilon) {
        return nbgfx_weld_vertices(memAddress(_output), _layout.address(), memAddress(_data), (int)(((long)_output.remaining() << 2) >> (_index32 ? 2 : 1)), _index32, _epsilon);
    }

    // --- [ bgfx_topology_convert ] ---

    /** {@code uint32_t bgfx_topology_convert(bgfx_topology_convert_t _conversion, void * _dst, uint32_t _dstSize, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static int nbgfx_topology_convert(int _conversion, long _dst, int _dstSize, long _indices, int _numIndices, boolean _index32) {
        long __functionAddress = Functions.topology_convert;
        return invokePPI(_conversion, _dst, _dstSize, _indices, _numIndices, _index32, __functionAddress);
    }

    /** {@code uint32_t bgfx_topology_convert(bgfx_topology_convert_t _conversion, void * _dst, uint32_t _dstSize, void const * _indices, uint32_t _numIndices, bool _index32)} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @NativeType("void *") @Nullable ByteBuffer _dst, @NativeType("void const *") ByteBuffer _indices, @NativeType("bool") boolean _index32) {
        return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), remainingSafe(_dst), memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
    }

    /** {@code uint32_t bgfx_topology_convert(bgfx_topology_convert_t _conversion, void * _dst, uint32_t _dstSize, void const * _indices, uint32_t _numIndices, bool _index32)} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @NativeType("void *") @Nullable ShortBuffer _dst, @NativeType("void const *") ShortBuffer _indices, @NativeType("bool") boolean _index32) {
        return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), remainingSafe(_dst) << 1, memAddress(_indices), (int)(((long)_indices.remaining() << 1) >> (_index32 ? 2 : 1)), _index32);
    }

    /** {@code uint32_t bgfx_topology_convert(bgfx_topology_convert_t _conversion, void * _dst, uint32_t _dstSize, void const * _indices, uint32_t _numIndices, bool _index32)} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @NativeType("void *") @Nullable IntBuffer _dst, @NativeType("void const *") IntBuffer _indices, @NativeType("bool") boolean _index32) {
        return nbgfx_topology_convert(_conversion, memAddressSafe(_dst), remainingSafe(_dst) << 2, memAddress(_indices), (int)(((long)_indices.remaining() << 2) >> (_index32 ? 2 : 1)), _index32);
    }

    // --- [ bgfx_topology_sort_tri_list ] ---

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void nbgfx_topology_sort_tri_list(int _sort, long _dst, int _dstSize, long _dir, long _pos, long _vertices, int _stride, long _indices, int _numIndices, boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        invokePPPPPV(_sort, _dst, _dstSize, _dir, _pos, _vertices, _stride, _indices, _numIndices, _index32, __functionAddress);
    }

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") ByteBuffer _dst, @NativeType("float const *") FloatBuffer _dir, @NativeType("float const *") FloatBuffer _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") ByteBuffer _indices, @NativeType("bool") boolean _index32) {
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining(), memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32);
    }

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") ShortBuffer _dst, @NativeType("float const *") FloatBuffer _dir, @NativeType("float const *") FloatBuffer _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") ShortBuffer _indices, @NativeType("bool") boolean _index32) {
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining() << 1, memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), (int)(((long)_indices.remaining() << 1) >> (_index32 ? 2 : 1)), _index32);
    }

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") IntBuffer _dst, @NativeType("float const *") FloatBuffer _dir, @NativeType("float const *") FloatBuffer _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") IntBuffer _indices, @NativeType("bool") boolean _index32) {
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        nbgfx_topology_sort_tri_list(_sort, memAddress(_dst), _dst.remaining() << 2, memAddress(_dir), memAddress(_pos), memAddress(_vertices), _stride, memAddress(_indices), (int)(((long)_indices.remaining() << 2) >> (_index32 ? 2 : 1)), _index32);
    }

    // --- [ bgfx_get_supported_renderers ] ---

    /** {@code uint8_t bgfx_get_supported_renderers(uint8_t _max, bgfx_renderer_type_t * _enum)} */
    public static byte nbgfx_get_supported_renderers(byte _max, long _enum) {
        long __functionAddress = Functions.get_supported_renderers;
        return invokeUPU(_max, _enum, __functionAddress);
    }

    /** {@code uint8_t bgfx_get_supported_renderers(uint8_t _max, bgfx_renderer_type_t * _enum)} */
    @NativeType("uint8_t")
    public static byte bgfx_get_supported_renderers(@NativeType("bgfx_renderer_type_t *") IntBuffer _enum) {
        return nbgfx_get_supported_renderers((byte)_enum.remaining(), memAddress(_enum));
    }

    // --- [ bgfx_get_renderer_name ] ---

    /** {@code char const * bgfx_get_renderer_name(bgfx_renderer_type_t _type)} */
    public static long nbgfx_get_renderer_name(int _type) {
        long __functionAddress = Functions.get_renderer_name;
        return invokeP(_type, __functionAddress);
    }

    /** {@code char const * bgfx_get_renderer_name(bgfx_renderer_type_t _type)} */
    @NativeType("char const *")
    public static @Nullable String bgfx_get_renderer_name(@NativeType("bgfx_renderer_type_t") int _type) {
        long __result = nbgfx_get_renderer_name(_type);
        return memASCIISafe(__result);
    }

    // --- [ bgfx_init_ctor ] ---

    /** {@code void bgfx_init_ctor(bgfx_init_t * _init)} */
    public static void nbgfx_init_ctor(long _init) {
        long __functionAddress = Functions.init_ctor;
        invokePV(_init, __functionAddress);
    }

    /** {@code void bgfx_init_ctor(bgfx_init_t * _init)} */
    public static void bgfx_init_ctor(@NativeType("bgfx_init_t *") BGFXInit _init) {
        nbgfx_init_ctor(_init.address());
    }

    // --- [ bgfx_init ] ---

    /** {@code bool bgfx_init(bgfx_init_t const * _init)} */
    public static boolean nbgfx_init(long _init) {
        long __functionAddress = Functions.init;
        if (CHECKS) {
            BGFXInit.validate(_init);
        }
        return invokePZ(_init, __functionAddress);
    }

    /** {@code bool bgfx_init(bgfx_init_t const * _init)} */
    @NativeType("bool")
    public static boolean bgfx_init(@NativeType("bgfx_init_t const *") BGFXInit _init) {
        return nbgfx_init(_init.address());
    }

    // --- [ bgfx_shutdown ] ---

    /** {@code void bgfx_shutdown(void)} */
    public static void bgfx_shutdown() {
        long __functionAddress = Functions.shutdown;
        invokeV(__functionAddress);
    }

    // --- [ bgfx_reset ] ---

    /** {@code void bgfx_reset(uint32_t _width, uint32_t _height, uint32_t _flags, bgfx_texture_format_t _format)} */
    public static void bgfx_reset(@NativeType("uint32_t") int _width, @NativeType("uint32_t") int _height, @NativeType("uint32_t") int _flags, @NativeType("bgfx_texture_format_t") int _format) {
        long __functionAddress = Functions.reset;
        invokeV(_width, _height, _flags, _format, __functionAddress);
    }

    // --- [ bgfx_frame ] ---

    /** {@code uint32_t bgfx_frame(bool _capture)} */
    @NativeType("uint32_t")
    public static int bgfx_frame(@NativeType("bool") boolean _capture) {
        long __functionAddress = Functions.frame;
        return invokeI(_capture, __functionAddress);
    }

    // --- [ bgfx_get_renderer_type ] ---

    /** {@code bgfx_renderer_type_t bgfx_get_renderer_type(void)} */
    @NativeType("bgfx_renderer_type_t")
    public static int bgfx_get_renderer_type() {
        long __functionAddress = Functions.get_renderer_type;
        return invokeI(__functionAddress);
    }

    // --- [ bgfx_get_caps ] ---

    /** {@code bgfx_caps_t const * bgfx_get_caps(void)} */
    public static long nbgfx_get_caps() {
        long __functionAddress = Functions.get_caps;
        return invokeP(__functionAddress);
    }

    /** {@code bgfx_caps_t const * bgfx_get_caps(void)} */
    @NativeType("bgfx_caps_t const *")
    public static @Nullable BGFXCaps bgfx_get_caps() {
        long __result = nbgfx_get_caps();
        return BGFXCaps.createSafe(__result);
    }

    // --- [ bgfx_get_stats ] ---

    /** {@code bgfx_stats_t const * bgfx_get_stats(void)} */
    public static long nbgfx_get_stats() {
        long __functionAddress = Functions.get_stats;
        return invokeP(__functionAddress);
    }

    /** {@code bgfx_stats_t const * bgfx_get_stats(void)} */
    @NativeType("bgfx_stats_t const *")
    public static @Nullable BGFXStats bgfx_get_stats() {
        long __result = nbgfx_get_stats();
        return BGFXStats.createSafe(__result);
    }

    // --- [ bgfx_alloc ] ---

    /** {@code bgfx_memory_t const * bgfx_alloc(uint32_t _size)} */
    public static long nbgfx_alloc(int _size) {
        long __functionAddress = Functions.alloc;
        return invokeP(_size, __functionAddress);
    }

    /** {@code bgfx_memory_t const * bgfx_alloc(uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_alloc(@NativeType("uint32_t") int _size) {
        long __result = nbgfx_alloc(_size);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_copy ] ---

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    public static long nbgfx_copy(long _data, int _size) {
        long __functionAddress = Functions.copy;
        return invokePP(_data, _size, __functionAddress);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") ByteBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining());
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") ShortBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 1);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") IntBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") LongBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") FloatBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") DoubleBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") PointerBuffer _data) {
        long __result = nbgfx_copy(memAddress(_data), _data.remaining() << POINTER_SHIFT);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_make_ref ] ---

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    public static long nbgfx_make_ref(long _data, int _size) {
        long __functionAddress = Functions.make_ref;
        return invokePP(_data, _size, __functionAddress);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") ByteBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining());
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") ShortBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 1);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") IntBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") LongBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") FloatBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 2);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") DoubleBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << 3);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref(@NativeType("void const *") PointerBuffer _data) {
        long __result = nbgfx_make_ref(memAddress(_data), _data.remaining() << POINTER_SHIFT);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_make_ref_release ] ---

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    public static long nbgfx_make_ref_release(long _data, int _size, long _releaseFn, long _userData) {
        long __functionAddress = Functions.make_ref_release;
        return invokePPPP(_data, _size, _releaseFn, _userData, __functionAddress);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") ByteBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining(), _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") ShortBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 1, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") IntBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 2, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") LongBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 3, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") FloatBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 2, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") DoubleBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << 3, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_make_ref_release(void const * _data, uint32_t _size, bgfx_release_fn_t _releaseFn, void * _userData)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_make_ref_release(@NativeType("void const *") PointerBuffer _data, @NativeType("bgfx_release_fn_t") BGFXReleaseFunctionCallbackI _releaseFn, @NativeType("void *") long _userData) {
        long __result = nbgfx_make_ref_release(memAddress(_data), _data.remaining() << POINTER_SHIFT, _releaseFn.address(), _userData);
        return BGFXMemory.createSafe(__result);
    }

    // --- [ bgfx_set_debug ] ---

    /** {@code void bgfx_set_debug(uint32_t _debug)} */
    public static void bgfx_set_debug(@NativeType("uint32_t") int _debug) {
        long __functionAddress = Functions.set_debug;
        invokeV(_debug, __functionAddress);
    }

    // --- [ bgfx_dbg_text_clear ] ---

    /** {@code void bgfx_dbg_text_clear(uint8_t _attr, bool _small)} */
    public static void nbgfx_dbg_text_clear(byte _attr, boolean _small) {
        long __functionAddress = Functions.dbg_text_clear;
        invokeUV(_attr, _small, __functionAddress);
    }

    /** {@code void bgfx_dbg_text_clear(uint8_t _attr, bool _small)} */
    public static void bgfx_dbg_text_clear(@NativeType("uint8_t") int _attr, @NativeType("bool") boolean _small) {
        nbgfx_dbg_text_clear((byte)_attr, _small);
    }

    // --- [ bgfx_dbg_text_printf ] ---

    /** {@code void bgfx_dbg_text_printf(uint16_t _x, uint16_t _y, uint8_t _attr, char const * _format)} */
    public static void nbgfx_dbg_text_printf(short _x, short _y, byte _attr, long _format) {
        long __functionAddress = Functions.dbg_text_printf;
        invokeCCUPV(_x, _y, _attr, _format, __functionAddress);
    }

    /** {@code void bgfx_dbg_text_printf(uint16_t _x, uint16_t _y, uint8_t _attr, char const * _format)} */
    public static void bgfx_dbg_text_printf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") ByteBuffer _format) {
        if (CHECKS) {
            checkNT1(_format);
        }
        nbgfx_dbg_text_printf((short)_x, (short)_y, (byte)_attr, memAddress(_format));
    }

    /** {@code void bgfx_dbg_text_printf(uint16_t _x, uint16_t _y, uint8_t _attr, char const * _format)} */
    public static void bgfx_dbg_text_printf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") CharSequence _format) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_format, true);
            long _formatEncoded = stack.getPointerAddress();
            nbgfx_dbg_text_printf((short)_x, (short)_y, (byte)_attr, _formatEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_dbg_text_vprintf ] ---

    /** {@code void bgfx_dbg_text_vprintf(uint16_t _x, uint16_t _y, uint8_t _attr, char const * _format, va_list _argList)} */
    public static void nbgfx_dbg_text_vprintf(short _x, short _y, byte _attr, long _format, long _argList) {
        long __functionAddress = Functions.dbg_text_vprintf;
        if (CHECKS) {
            check(_argList);
        }
        invokeCCUPPV(_x, _y, _attr, _format, _argList, __functionAddress);
    }

    /** {@code void bgfx_dbg_text_vprintf(uint16_t _x, uint16_t _y, uint8_t _attr, char const * _format, va_list _argList)} */
    public static void bgfx_dbg_text_vprintf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") ByteBuffer _format, @NativeType("va_list") long _argList) {
        if (CHECKS) {
            checkNT1(_format);
        }
        nbgfx_dbg_text_vprintf((short)_x, (short)_y, (byte)_attr, memAddress(_format), _argList);
    }

    /** {@code void bgfx_dbg_text_vprintf(uint16_t _x, uint16_t _y, uint8_t _attr, char const * _format, va_list _argList)} */
    public static void bgfx_dbg_text_vprintf(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint8_t") int _attr, @NativeType("char const *") CharSequence _format, @NativeType("va_list") long _argList) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_format, true);
            long _formatEncoded = stack.getPointerAddress();
            nbgfx_dbg_text_vprintf((short)_x, (short)_y, (byte)_attr, _formatEncoded, _argList);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_dbg_text_image ] ---

    /** {@code void bgfx_dbg_text_image(uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height, void const * _data, uint16_t _pitch)} */
    public static void nbgfx_dbg_text_image(short _x, short _y, short _width, short _height, long _data, short _pitch) {
        long __functionAddress = Functions.dbg_text_image;
        invokeCCCCPCV(_x, _y, _width, _height, _data, _pitch, __functionAddress);
    }

    /** {@code void bgfx_dbg_text_image(uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height, void const * _data, uint16_t _pitch)} */
    public static void bgfx_dbg_text_image(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("void const *") ByteBuffer _data, @NativeType("uint16_t") int _pitch) {
        if (CHECKS) {
            check(_data, _height * _pitch);
        }
        nbgfx_dbg_text_image((short)_x, (short)_y, (short)_width, (short)_height, memAddress(_data), (short)_pitch);
    }

    // --- [ bgfx_create_index_buffer ] ---

    /** {@code bgfx_index_buffer_handle_t bgfx_create_index_buffer(bgfx_memory_t const * _mem, uint16_t _flags)} */
    public static short nbgfx_create_index_buffer(long _mem, short _flags) {
        long __functionAddress = Functions.create_index_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePCC(_mem, _flags, __functionAddress);
    }

    /** {@code bgfx_index_buffer_handle_t bgfx_create_index_buffer(bgfx_memory_t const * _mem, uint16_t _flags)} */
    @NativeType("bgfx_index_buffer_handle_t")
    public static short bgfx_create_index_buffer(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_index_buffer(_mem.address(), (short)_flags);
    }

    // --- [ bgfx_set_index_buffer_name ] ---

    /** {@code void bgfx_set_index_buffer_name(bgfx_index_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void nbgfx_set_index_buffer_name(short _handle, long _name, int _len) {
        long __functionAddress = Functions.set_index_buffer_name;
        invokeCPV(_handle, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_index_buffer_name(bgfx_index_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_index_buffer_name(@NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_index_buffer_name(_handle, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_index_buffer_name(bgfx_index_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_index_buffer_name(@NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nASCII(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_index_buffer_name(_handle, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_destroy_index_buffer ] ---

    /** {@code void bgfx_destroy_index_buffer(bgfx_index_buffer_handle_t _handle)} */
    public static void bgfx_destroy_index_buffer(@NativeType("bgfx_index_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_index_buffer;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_vertex_layout ] ---

    /** {@code bgfx_vertex_layout_handle_t bgfx_create_vertex_layout(bgfx_vertex_layout_t const * _layout)} */
    public static short nbgfx_create_vertex_layout(long _layout) {
        long __functionAddress = Functions.create_vertex_layout;
        return invokePC(_layout, __functionAddress);
    }

    /** {@code bgfx_vertex_layout_handle_t bgfx_create_vertex_layout(bgfx_vertex_layout_t const * _layout)} */
    @NativeType("bgfx_vertex_layout_handle_t")
    public static short bgfx_create_vertex_layout(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout) {
        return nbgfx_create_vertex_layout(_layout.address());
    }

    // --- [ bgfx_destroy_vertex_layout ] ---

    /** {@code void bgfx_destroy_vertex_layout(bgfx_vertex_layout_handle_t _handle)} */
    public static void bgfx_destroy_vertex_layout(@NativeType("bgfx_vertex_layout_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_vertex_layout;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_vertex_buffer ] ---

    /** {@code bgfx_vertex_buffer_handle_t bgfx_create_vertex_buffer(bgfx_memory_t const * _mem, bgfx_vertex_layout_t const * _layout, uint16_t _flags)} */
    public static short nbgfx_create_vertex_buffer(long _mem, long _layout, short _flags) {
        long __functionAddress = Functions.create_vertex_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePPCC(_mem, _layout, _flags, __functionAddress);
    }

    /** {@code bgfx_vertex_buffer_handle_t bgfx_create_vertex_buffer(bgfx_memory_t const * _mem, bgfx_vertex_layout_t const * _layout, uint16_t _flags)} */
    @NativeType("bgfx_vertex_buffer_handle_t")
    public static short bgfx_create_vertex_buffer(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_vertex_buffer(_mem.address(), _layout.address(), (short)_flags);
    }

    // --- [ bgfx_set_vertex_buffer_name ] ---

    /** {@code void bgfx_set_vertex_buffer_name(bgfx_vertex_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void nbgfx_set_vertex_buffer_name(short _handle, long _name, int _len) {
        long __functionAddress = Functions.set_vertex_buffer_name;
        invokeCPV(_handle, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_vertex_buffer_name(bgfx_vertex_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_vertex_buffer_name(@NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_vertex_buffer_name(_handle, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_vertex_buffer_name(bgfx_vertex_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_vertex_buffer_name(@NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nASCII(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_vertex_buffer_name(_handle, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_destroy_vertex_buffer ] ---

    /** {@code void bgfx_destroy_vertex_buffer(bgfx_vertex_buffer_handle_t _handle)} */
    public static void bgfx_destroy_vertex_buffer(@NativeType("bgfx_vertex_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_vertex_buffer;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_dynamic_index_buffer ] ---

    /** {@code bgfx_dynamic_index_buffer_handle_t bgfx_create_dynamic_index_buffer(uint32_t _num, uint16_t _flags)} */
    public static short nbgfx_create_dynamic_index_buffer(int _num, short _flags) {
        long __functionAddress = Functions.create_dynamic_index_buffer;
        return invokeCC(_num, _flags, __functionAddress);
    }

    /** {@code bgfx_dynamic_index_buffer_handle_t bgfx_create_dynamic_index_buffer(uint32_t _num, uint16_t _flags)} */
    @NativeType("bgfx_dynamic_index_buffer_handle_t")
    public static short bgfx_create_dynamic_index_buffer(@NativeType("uint32_t") int _num, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_index_buffer(_num, (short)_flags);
    }

    // --- [ bgfx_create_dynamic_index_buffer_mem ] ---

    /** {@code bgfx_dynamic_index_buffer_handle_t bgfx_create_dynamic_index_buffer_mem(bgfx_memory_t const * _mem, uint16_t _flags)} */
    public static short nbgfx_create_dynamic_index_buffer_mem(long _mem, short _flags) {
        long __functionAddress = Functions.create_dynamic_index_buffer_mem;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePCC(_mem, _flags, __functionAddress);
    }

    /** {@code bgfx_dynamic_index_buffer_handle_t bgfx_create_dynamic_index_buffer_mem(bgfx_memory_t const * _mem, uint16_t _flags)} */
    @NativeType("bgfx_dynamic_index_buffer_handle_t")
    public static short bgfx_create_dynamic_index_buffer_mem(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_index_buffer_mem(_mem.address(), (short)_flags);
    }

    // --- [ bgfx_update_dynamic_index_buffer ] ---

    /** {@code void bgfx_update_dynamic_index_buffer(bgfx_dynamic_index_buffer_handle_t _handle, uint32_t _startIndex, bgfx_memory_t const * _mem)} */
    public static void nbgfx_update_dynamic_index_buffer(short _handle, int _startIndex, long _mem) {
        long __functionAddress = Functions.update_dynamic_index_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokeCPV(_handle, _startIndex, _mem, __functionAddress);
    }

    /** {@code void bgfx_update_dynamic_index_buffer(bgfx_dynamic_index_buffer_handle_t _handle, uint32_t _startIndex, bgfx_memory_t const * _mem)} */
    public static void bgfx_update_dynamic_index_buffer(@NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startIndex, @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        nbgfx_update_dynamic_index_buffer(_handle, _startIndex, _mem.address());
    }

    // --- [ bgfx_destroy_dynamic_index_buffer ] ---

    /** {@code void bgfx_destroy_dynamic_index_buffer(bgfx_dynamic_index_buffer_handle_t _handle)} */
    public static void bgfx_destroy_dynamic_index_buffer(@NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_dynamic_index_buffer;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_dynamic_vertex_buffer ] ---

    /** {@code bgfx_dynamic_vertex_buffer_handle_t bgfx_create_dynamic_vertex_buffer(uint32_t _num, bgfx_vertex_layout_t const * _layout, uint16_t _flags)} */
    public static short nbgfx_create_dynamic_vertex_buffer(int _num, long _layout, short _flags) {
        long __functionAddress = Functions.create_dynamic_vertex_buffer;
        return invokePCC(_num, _layout, _flags, __functionAddress);
    }

    /** {@code bgfx_dynamic_vertex_buffer_handle_t bgfx_create_dynamic_vertex_buffer(uint32_t _num, bgfx_vertex_layout_t const * _layout, uint16_t _flags)} */
    @NativeType("bgfx_dynamic_vertex_buffer_handle_t")
    public static short bgfx_create_dynamic_vertex_buffer(@NativeType("uint32_t") int _num, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_vertex_buffer(_num, _layout.address(), (short)_flags);
    }

    // --- [ bgfx_create_dynamic_vertex_buffer_mem ] ---

    /** {@code bgfx_dynamic_vertex_buffer_handle_t bgfx_create_dynamic_vertex_buffer_mem(bgfx_memory_t const * _mem, bgfx_vertex_layout_t const * _layout, uint16_t _flags)} */
    public static short nbgfx_create_dynamic_vertex_buffer_mem(long _mem, long _layout, short _flags) {
        long __functionAddress = Functions.create_dynamic_vertex_buffer_mem;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePPCC(_mem, _layout, _flags, __functionAddress);
    }

    /** {@code bgfx_dynamic_vertex_buffer_handle_t bgfx_create_dynamic_vertex_buffer_mem(bgfx_memory_t const * _mem, bgfx_vertex_layout_t const * _layout, uint16_t _flags)} */
    @NativeType("bgfx_dynamic_vertex_buffer_handle_t")
    public static short bgfx_create_dynamic_vertex_buffer_mem(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("uint16_t") int _flags) {
        return nbgfx_create_dynamic_vertex_buffer_mem(_mem.address(), _layout.address(), (short)_flags);
    }

    // --- [ bgfx_update_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_update_dynamic_vertex_buffer(bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, bgfx_memory_t const * _mem)} */
    public static void nbgfx_update_dynamic_vertex_buffer(short _handle, int _startVertex, long _mem) {
        long __functionAddress = Functions.update_dynamic_vertex_buffer;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokeCPV(_handle, _startVertex, _mem, __functionAddress);
    }

    /** {@code void bgfx_update_dynamic_vertex_buffer(bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, bgfx_memory_t const * _mem)} */
    public static void bgfx_update_dynamic_vertex_buffer(@NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        nbgfx_update_dynamic_vertex_buffer(_handle, _startVertex, _mem.address());
    }

    // --- [ bgfx_destroy_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_destroy_dynamic_vertex_buffer(bgfx_dynamic_vertex_buffer_handle_t _handle)} */
    public static void bgfx_destroy_dynamic_vertex_buffer(@NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_dynamic_vertex_buffer;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_get_avail_transient_index_buffer ] ---

    /** {@code uint32_t bgfx_get_avail_transient_index_buffer(uint32_t _num, bool _index32)} */
    @NativeType("uint32_t")
    public static int bgfx_get_avail_transient_index_buffer(@NativeType("uint32_t") int _num, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.get_avail_transient_index_buffer;
        return invokeI(_num, _index32, __functionAddress);
    }

    // --- [ bgfx_get_avail_transient_vertex_buffer ] ---

    /** {@code uint32_t bgfx_get_avail_transient_vertex_buffer(uint32_t _num, bgfx_vertex_layout_t const * _layout)} */
    public static int nbgfx_get_avail_transient_vertex_buffer(int _num, long _layout) {
        long __functionAddress = Functions.get_avail_transient_vertex_buffer;
        return invokePI(_num, _layout, __functionAddress);
    }

    /** {@code uint32_t bgfx_get_avail_transient_vertex_buffer(uint32_t _num, bgfx_vertex_layout_t const * _layout)} */
    @NativeType("uint32_t")
    public static int bgfx_get_avail_transient_vertex_buffer(@NativeType("uint32_t") int _num, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout) {
        return nbgfx_get_avail_transient_vertex_buffer(_num, _layout.address());
    }

    // --- [ bgfx_get_avail_instance_data_buffer ] ---

    /** {@code uint32_t bgfx_get_avail_instance_data_buffer(uint32_t _num, uint16_t _stride)} */
    public static int nbgfx_get_avail_instance_data_buffer(int _num, short _stride) {
        long __functionAddress = Functions.get_avail_instance_data_buffer;
        return invokeCI(_num, _stride, __functionAddress);
    }

    /** {@code uint32_t bgfx_get_avail_instance_data_buffer(uint32_t _num, uint16_t _stride)} */
    @NativeType("uint32_t")
    public static int bgfx_get_avail_instance_data_buffer(@NativeType("uint32_t") int _num, @NativeType("uint16_t") int _stride) {
        return nbgfx_get_avail_instance_data_buffer(_num, (short)_stride);
    }

    // --- [ bgfx_alloc_transient_index_buffer ] ---

    /** {@code void bgfx_alloc_transient_index_buffer(bgfx_transient_index_buffer_t * _tib, uint32_t _num, bool _index32)} */
    public static void nbgfx_alloc_transient_index_buffer(long _tib, int _num, boolean _index32) {
        long __functionAddress = Functions.alloc_transient_index_buffer;
        invokePV(_tib, _num, _index32, __functionAddress);
    }

    /** {@code void bgfx_alloc_transient_index_buffer(bgfx_transient_index_buffer_t * _tib, uint32_t _num, bool _index32)} */
    public static void bgfx_alloc_transient_index_buffer(@NativeType("bgfx_transient_index_buffer_t *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _num, @NativeType("bool") boolean _index32) {
        nbgfx_alloc_transient_index_buffer(_tib.address(), _num, _index32);
    }

    // --- [ bgfx_alloc_transient_vertex_buffer ] ---

    /** {@code void bgfx_alloc_transient_vertex_buffer(bgfx_transient_vertex_buffer_t * _tvb, uint32_t _num, bgfx_vertex_layout_t const * _layout)} */
    public static void nbgfx_alloc_transient_vertex_buffer(long _tvb, int _num, long _layout) {
        long __functionAddress = Functions.alloc_transient_vertex_buffer;
        invokePPV(_tvb, _num, _layout, __functionAddress);
    }

    /** {@code void bgfx_alloc_transient_vertex_buffer(bgfx_transient_vertex_buffer_t * _tvb, uint32_t _num, bgfx_vertex_layout_t const * _layout)} */
    public static void bgfx_alloc_transient_vertex_buffer(@NativeType("bgfx_transient_vertex_buffer_t *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _num, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout) {
        nbgfx_alloc_transient_vertex_buffer(_tvb.address(), _num, _layout.address());
    }

    // --- [ bgfx_alloc_transient_buffers ] ---

    /** {@code bool bgfx_alloc_transient_buffers(bgfx_transient_vertex_buffer_t * _tvb, bgfx_vertex_layout_t const * _layout, uint32_t _numVertices, bgfx_transient_index_buffer_t * _tib, uint32_t _numIndices, bool _index32)} */
    public static boolean nbgfx_alloc_transient_buffers(long _tvb, long _layout, int _numVertices, long _tib, int _numIndices, boolean _index32) {
        long __functionAddress = Functions.alloc_transient_buffers;
        return invokePPPZ(_tvb, _layout, _numVertices, _tib, _numIndices, _index32, __functionAddress);
    }

    /** {@code bool bgfx_alloc_transient_buffers(bgfx_transient_vertex_buffer_t * _tvb, bgfx_vertex_layout_t const * _layout, uint32_t _numVertices, bgfx_transient_index_buffer_t * _tib, uint32_t _numIndices, bool _index32)} */
    @NativeType("bool")
    public static boolean bgfx_alloc_transient_buffers(@NativeType("bgfx_transient_vertex_buffer_t *") BGFXTransientVertexBuffer _tvb, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_transient_index_buffer_t *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _numIndices, @NativeType("bool") boolean _index32) {
        return nbgfx_alloc_transient_buffers(_tvb.address(), _layout.address(), _numVertices, _tib.address(), _numIndices, _index32);
    }

    // --- [ bgfx_alloc_instance_data_buffer ] ---

    /** {@code void bgfx_alloc_instance_data_buffer(bgfx_instance_data_buffer_t * _idb, uint32_t _num, uint16_t _stride)} */
    public static void nbgfx_alloc_instance_data_buffer(long _idb, int _num, short _stride) {
        long __functionAddress = Functions.alloc_instance_data_buffer;
        invokePCV(_idb, _num, _stride, __functionAddress);
    }

    /** {@code void bgfx_alloc_instance_data_buffer(bgfx_instance_data_buffer_t * _idb, uint32_t _num, uint16_t _stride)} */
    public static void bgfx_alloc_instance_data_buffer(@NativeType("bgfx_instance_data_buffer_t *") BGFXInstanceDataBuffer _idb, @NativeType("uint32_t") int _num, @NativeType("uint16_t") int _stride) {
        nbgfx_alloc_instance_data_buffer(_idb.address(), _num, (short)_stride);
    }

    // --- [ bgfx_create_indirect_buffer ] ---

    /** {@code bgfx_indirect_buffer_handle_t bgfx_create_indirect_buffer(uint32_t _num)} */
    @NativeType("bgfx_indirect_buffer_handle_t")
    public static short bgfx_create_indirect_buffer(@NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.create_indirect_buffer;
        return invokeC(_num, __functionAddress);
    }

    // --- [ bgfx_destroy_indirect_buffer ] ---

    /** {@code void bgfx_destroy_indirect_buffer(bgfx_indirect_buffer_handle_t _handle)} */
    public static void bgfx_destroy_indirect_buffer(@NativeType("bgfx_indirect_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_indirect_buffer;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_shader ] ---

    /** {@code bgfx_shader_handle_t bgfx_create_shader(bgfx_memory_t const * _mem)} */
    public static short nbgfx_create_shader(long _mem) {
        long __functionAddress = Functions.create_shader;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePC(_mem, __functionAddress);
    }

    /** {@code bgfx_shader_handle_t bgfx_create_shader(bgfx_memory_t const * _mem)} */
    @NativeType("bgfx_shader_handle_t")
    public static short bgfx_create_shader(@NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        return nbgfx_create_shader(_mem.address());
    }

    // --- [ bgfx_get_shader_uniforms ] ---

    /** {@code uint16_t bgfx_get_shader_uniforms(bgfx_shader_handle_t _handle, bgfx_uniform_handle_t * _uniforms, uint16_t _max)} */
    public static short nbgfx_get_shader_uniforms(short _handle, long _uniforms, short _max) {
        long __functionAddress = Functions.get_shader_uniforms;
        return invokeCPCC(_handle, _uniforms, _max, __functionAddress);
    }

    /** {@code uint16_t bgfx_get_shader_uniforms(bgfx_shader_handle_t _handle, bgfx_uniform_handle_t * _uniforms, uint16_t _max)} */
    @NativeType("uint16_t")
    public static short bgfx_get_shader_uniforms(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("bgfx_uniform_handle_t *") ShortBuffer _uniforms) {
        return nbgfx_get_shader_uniforms(_handle, memAddress(_uniforms), (short)_uniforms.remaining());
    }

    // --- [ bgfx_set_shader_name ] ---

    /** {@code void bgfx_set_shader_name(bgfx_shader_handle_t _handle, char const * _name, int32_t _len)} */
    public static void nbgfx_set_shader_name(short _handle, long _name, int _len) {
        long __functionAddress = Functions.set_shader_name;
        invokeCPV(_handle, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_shader_name(bgfx_shader_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_shader_name(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_shader_name(_handle, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_shader_name(bgfx_shader_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_shader_name(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nUTF8(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_shader_name(_handle, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_destroy_shader ] ---

    /** {@code void bgfx_destroy_shader(bgfx_shader_handle_t _handle)} */
    public static void bgfx_destroy_shader(@NativeType("bgfx_shader_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_shader;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_program ] ---

    /** {@code bgfx_program_handle_t bgfx_create_program(bgfx_shader_handle_t _vsh, bgfx_shader_handle_t _fsh, bool _destroyShaders)} */
    @NativeType("bgfx_program_handle_t")
    public static short bgfx_create_program(@NativeType("bgfx_shader_handle_t") short _vsh, @NativeType("bgfx_shader_handle_t") short _fsh, @NativeType("bool") boolean _destroyShaders) {
        long __functionAddress = Functions.create_program;
        return invokeCCC(_vsh, _fsh, _destroyShaders, __functionAddress);
    }

    // --- [ bgfx_create_compute_program ] ---

    /** {@code bgfx_program_handle_t bgfx_create_compute_program(bgfx_shader_handle_t _csh, bool _destroyShaders)} */
    @NativeType("bgfx_program_handle_t")
    public static short bgfx_create_compute_program(@NativeType("bgfx_shader_handle_t") short _csh, @NativeType("bool") boolean _destroyShaders) {
        long __functionAddress = Functions.create_compute_program;
        return invokeCC(_csh, _destroyShaders, __functionAddress);
    }

    // --- [ bgfx_destroy_program ] ---

    /** {@code void bgfx_destroy_program(bgfx_program_handle_t _handle)} */
    public static void bgfx_destroy_program(@NativeType("bgfx_program_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_program;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_is_texture_valid ] ---

    /** {@code bool bgfx_is_texture_valid(uint16_t _depth, bool _cubeMap, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags)} */
    public static boolean nbgfx_is_texture_valid(short _depth, boolean _cubeMap, short _numLayers, int _format, long _flags) {
        long __functionAddress = Functions.is_texture_valid;
        return invokeCCJZ(_depth, _cubeMap, _numLayers, _format, _flags, __functionAddress);
    }

    /** {@code bool bgfx_is_texture_valid(uint16_t _depth, bool _cubeMap, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags)} */
    @NativeType("bool")
    public static boolean bgfx_is_texture_valid(@NativeType("uint16_t") int _depth, @NativeType("bool") boolean _cubeMap, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags) {
        return nbgfx_is_texture_valid((short)_depth, _cubeMap, (short)_numLayers, _format, _flags);
    }

    // --- [ bgfx_is_frame_buffer_valid ] ---

    /** {@code bool bgfx_is_frame_buffer_valid(uint8_t _num, bgfx_attachment_t const * _attachment)} */
    public static boolean nbgfx_is_frame_buffer_valid(byte _num, long _attachment) {
        long __functionAddress = Functions.is_frame_buffer_valid;
        return invokeUPZ(_num, _attachment, __functionAddress);
    }

    /** {@code bool bgfx_is_frame_buffer_valid(uint8_t _num, bgfx_attachment_t const * _attachment)} */
    @NativeType("bool")
    public static boolean bgfx_is_frame_buffer_valid(@NativeType("bgfx_attachment_t const *") BGFXAttachment.Buffer _attachment) {
        return nbgfx_is_frame_buffer_valid((byte)_attachment.remaining(), _attachment.address());
    }

    // --- [ bgfx_calc_texture_size ] ---

    /** {@code void bgfx_calc_texture_size(bgfx_texture_info_t * _info, uint16_t _width, uint16_t _height, uint16_t _depth, bool _cubeMap, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format)} */
    public static void nbgfx_calc_texture_size(long _info, short _width, short _height, short _depth, boolean _cubeMap, boolean _hasMips, short _numLayers, int _format) {
        long __functionAddress = Functions.calc_texture_size;
        invokePCCCCV(_info, _width, _height, _depth, _cubeMap, _hasMips, _numLayers, _format, __functionAddress);
    }

    /** {@code void bgfx_calc_texture_size(bgfx_texture_info_t * _info, uint16_t _width, uint16_t _height, uint16_t _depth, bool _cubeMap, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format)} */
    public static void bgfx_calc_texture_size(@NativeType("bgfx_texture_info_t *") BGFXTextureInfo _info, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth, @NativeType("bool") boolean _cubeMap, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format) {
        nbgfx_calc_texture_size(_info.address(), (short)_width, (short)_height, (short)_depth, _cubeMap, _hasMips, (short)_numLayers, _format);
    }

    // --- [ bgfx_create_texture ] ---

    /** {@code bgfx_texture_handle_t bgfx_create_texture(bgfx_memory_t const * _mem, uint64_t _flags, uint8_t _skip, bgfx_texture_info_t * _info)} */
    public static short nbgfx_create_texture(long _mem, long _flags, byte _skip, long _info) {
        long __functionAddress = Functions.create_texture;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        return invokePJUPC(_mem, _flags, _skip, _info, __functionAddress);
    }

    /** {@code bgfx_texture_handle_t bgfx_create_texture(bgfx_memory_t const * _mem, uint64_t _flags, uint8_t _skip, bgfx_texture_info_t * _info)} */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture(@NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint64_t") long _flags, @NativeType("uint8_t") int _skip, @NativeType("bgfx_texture_info_t *") @Nullable BGFXTextureInfo _info) {
        return nbgfx_create_texture(_mem.address(), _flags, (byte)_skip, memAddressSafe(_info));
    }

    // --- [ bgfx_create_texture_2d ] ---

    /** {@code bgfx_texture_handle_t bgfx_create_texture_2d(uint16_t _width, uint16_t _height, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags, bgfx_memory_t const * _mem)} */
    public static short nbgfx_create_texture_2d(short _width, short _height, boolean _hasMips, short _numLayers, int _format, long _flags, long _mem) {
        long __functionAddress = Functions.create_texture_2d;
        if (CHECKS) {
            if (_mem != NULL) { BGFXMemory.validate(_mem); }
        }
        return invokeCCCJPC(_width, _height, _hasMips, _numLayers, _format, _flags, _mem, __functionAddress);
    }

    /** {@code bgfx_texture_handle_t bgfx_create_texture_2d(uint16_t _width, uint16_t _height, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags, bgfx_memory_t const * _mem)} */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_2d(@NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags, @NativeType("bgfx_memory_t const *") @Nullable BGFXMemory _mem) {
        return nbgfx_create_texture_2d((short)_width, (short)_height, _hasMips, (short)_numLayers, _format, _flags, memAddressSafe(_mem));
    }

    // --- [ bgfx_create_texture_2d_scaled ] ---

    /** {@code bgfx_texture_handle_t bgfx_create_texture_2d_scaled(bgfx_backbuffer_ratio_t _ratio, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags)} */
    public static short nbgfx_create_texture_2d_scaled(int _ratio, boolean _hasMips, short _numLayers, int _format, long _flags) {
        long __functionAddress = Functions.create_texture_2d_scaled;
        return invokeCJC(_ratio, _hasMips, _numLayers, _format, _flags, __functionAddress);
    }

    /** {@code bgfx_texture_handle_t bgfx_create_texture_2d_scaled(bgfx_backbuffer_ratio_t _ratio, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags)} */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_2d_scaled(@NativeType("bgfx_backbuffer_ratio_t") int _ratio, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags) {
        return nbgfx_create_texture_2d_scaled(_ratio, _hasMips, (short)_numLayers, _format, _flags);
    }

    // --- [ bgfx_create_texture_3d ] ---

    /** {@code bgfx_texture_handle_t bgfx_create_texture_3d(uint16_t _width, uint16_t _height, uint16_t _depth, bool _hasMips, bgfx_texture_format_t _format, uint64_t _flags, bgfx_memory_t const * _mem)} */
    public static short nbgfx_create_texture_3d(short _width, short _height, short _depth, boolean _hasMips, int _format, long _flags, long _mem) {
        long __functionAddress = Functions.create_texture_3d;
        if (CHECKS) {
            if (_mem != NULL) { BGFXMemory.validate(_mem); }
        }
        return invokeCCCJPC(_width, _height, _depth, _hasMips, _format, _flags, _mem, __functionAddress);
    }

    /** {@code bgfx_texture_handle_t bgfx_create_texture_3d(uint16_t _width, uint16_t _height, uint16_t _depth, bool _hasMips, bgfx_texture_format_t _format, uint64_t _flags, bgfx_memory_t const * _mem)} */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_3d(@NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth, @NativeType("bool") boolean _hasMips, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags, @NativeType("bgfx_memory_t const *") @Nullable BGFXMemory _mem) {
        return nbgfx_create_texture_3d((short)_width, (short)_height, (short)_depth, _hasMips, _format, _flags, memAddressSafe(_mem));
    }

    // --- [ bgfx_create_texture_cube ] ---

    /** {@code bgfx_texture_handle_t bgfx_create_texture_cube(uint16_t _size, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags, bgfx_memory_t const * _mem)} */
    public static short nbgfx_create_texture_cube(short _size, boolean _hasMips, short _numLayers, int _format, long _flags, long _mem) {
        long __functionAddress = Functions.create_texture_cube;
        if (CHECKS) {
            if (_mem != NULL) { BGFXMemory.validate(_mem); }
        }
        return invokeCCJPC(_size, _hasMips, _numLayers, _format, _flags, _mem, __functionAddress);
    }

    /** {@code bgfx_texture_handle_t bgfx_create_texture_cube(uint16_t _size, bool _hasMips, uint16_t _numLayers, bgfx_texture_format_t _format, uint64_t _flags, bgfx_memory_t const * _mem)} */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_create_texture_cube(@NativeType("uint16_t") int _size, @NativeType("bool") boolean _hasMips, @NativeType("uint16_t") int _numLayers, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags, @NativeType("bgfx_memory_t const *") @Nullable BGFXMemory _mem) {
        return nbgfx_create_texture_cube((short)_size, _hasMips, (short)_numLayers, _format, _flags, memAddressSafe(_mem));
    }

    // --- [ bgfx_update_texture_2d ] ---

    /** {@code void bgfx_update_texture_2d(bgfx_texture_handle_t _handle, uint16_t _layer, uint8_t _mip, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height, bgfx_memory_t const * _mem, uint16_t _pitch)} */
    public static void nbgfx_update_texture_2d(short _handle, short _layer, byte _mip, short _x, short _y, short _width, short _height, long _mem, short _pitch) {
        long __functionAddress = Functions.update_texture_2d;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokeCCUCCCCPCV(_handle, _layer, _mip, _x, _y, _width, _height, _mem, _pitch, __functionAddress);
    }

    /** {@code void bgfx_update_texture_2d(bgfx_texture_handle_t _handle, uint16_t _layer, uint8_t _mip, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height, bgfx_memory_t const * _mem, uint16_t _pitch)} */
    public static void bgfx_update_texture_2d(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint16_t") int _layer, @NativeType("uint8_t") int _mip, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _pitch) {
        nbgfx_update_texture_2d(_handle, (short)_layer, (byte)_mip, (short)_x, (short)_y, (short)_width, (short)_height, _mem.address(), (short)_pitch);
    }

    // --- [ bgfx_update_texture_3d ] ---

    /** {@code void bgfx_update_texture_3d(bgfx_texture_handle_t _handle, uint8_t _mip, uint16_t _x, uint16_t _y, uint16_t _z, uint16_t _width, uint16_t _height, uint16_t _depth, bgfx_memory_t const * _mem)} */
    public static void nbgfx_update_texture_3d(short _handle, byte _mip, short _x, short _y, short _z, short _width, short _height, short _depth, long _mem) {
        long __functionAddress = Functions.update_texture_3d;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokeCUCCCCCCPV(_handle, _mip, _x, _y, _z, _width, _height, _depth, _mem, __functionAddress);
    }

    /** {@code void bgfx_update_texture_3d(bgfx_texture_handle_t _handle, uint8_t _mip, uint16_t _x, uint16_t _y, uint16_t _z, uint16_t _width, uint16_t _height, uint16_t _depth, bgfx_memory_t const * _mem)} */
    public static void bgfx_update_texture_3d(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint8_t") int _mip, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _z, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth, @NativeType("bgfx_memory_t const *") BGFXMemory _mem) {
        nbgfx_update_texture_3d(_handle, (byte)_mip, (short)_x, (short)_y, (short)_z, (short)_width, (short)_height, (short)_depth, _mem.address());
    }

    // --- [ bgfx_update_texture_cube ] ---

    /** {@code void bgfx_update_texture_cube(bgfx_texture_handle_t _handle, uint16_t _layer, uint8_t _side, uint8_t _mip, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height, bgfx_memory_t const * _mem, uint16_t _pitch)} */
    public static void nbgfx_update_texture_cube(short _handle, short _layer, byte _side, byte _mip, short _x, short _y, short _width, short _height, long _mem, short _pitch) {
        long __functionAddress = Functions.update_texture_cube;
        if (CHECKS) {
            BGFXMemory.validate(_mem);
        }
        invokeCCUUCCCCPCV(_handle, _layer, _side, _mip, _x, _y, _width, _height, _mem, _pitch, __functionAddress);
    }

    /** {@code void bgfx_update_texture_cube(bgfx_texture_handle_t _handle, uint16_t _layer, uint8_t _side, uint8_t _mip, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height, bgfx_memory_t const * _mem, uint16_t _pitch)} */
    public static void bgfx_update_texture_cube(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint16_t") int _layer, @NativeType("uint8_t") byte _side, @NativeType("uint8_t") int _mip, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_memory_t const *") BGFXMemory _mem, @NativeType("uint16_t") int _pitch) {
        nbgfx_update_texture_cube(_handle, (short)_layer, _side, (byte)_mip, (short)_x, (short)_y, (short)_width, (short)_height, _mem.address(), (short)_pitch);
    }

    // --- [ bgfx_read_texture ] ---

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    public static int nbgfx_read_texture(short _handle, long _data, byte _mip) {
        long __functionAddress = Functions.read_texture;
        return invokeCPUI(_handle, _data, _mip, __functionAddress);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") ByteBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") ShortBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") IntBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") FloatBuffer _data, @NativeType("uint8_t") int _mip) {
        return nbgfx_read_texture(_handle, memAddress(_data), (byte)_mip);
    }

    // --- [ bgfx_set_texture_name ] ---

    /** {@code void bgfx_set_texture_name(bgfx_texture_handle_t _handle, char const * _name, int32_t _len)} */
    public static void nbgfx_set_texture_name(short _handle, long _name, int _len) {
        long __functionAddress = Functions.set_texture_name;
        invokeCPV(_handle, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_texture_name(bgfx_texture_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_texture_name(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_texture_name(_handle, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_texture_name(bgfx_texture_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_texture_name(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nUTF8(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_texture_name(_handle, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_get_direct_access_ptr ] ---

    /** {@code void * bgfx_get_direct_access_ptr(bgfx_texture_handle_t _handle)} */
    @NativeType("void *")
    public static long bgfx_get_direct_access_ptr(@NativeType("bgfx_texture_handle_t") short _handle) {
        long __functionAddress = Functions.get_direct_access_ptr;
        return invokeCP(_handle, __functionAddress);
    }

    // --- [ bgfx_destroy_texture ] ---

    /** {@code void bgfx_destroy_texture(bgfx_texture_handle_t _handle)} */
    public static void bgfx_destroy_texture(@NativeType("bgfx_texture_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_texture;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_frame_buffer ] ---

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer(uint16_t _width, uint16_t _height, bgfx_texture_format_t _format, uint64_t _textureFlags)} */
    public static short nbgfx_create_frame_buffer(short _width, short _height, int _format, long _textureFlags) {
        long __functionAddress = Functions.create_frame_buffer;
        return invokeCCJC(_width, _height, _format, _textureFlags, __functionAddress);
    }

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer(uint16_t _width, uint16_t _height, bgfx_texture_format_t _format, uint64_t _textureFlags)} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer(@NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _textureFlags) {
        return nbgfx_create_frame_buffer((short)_width, (short)_height, _format, _textureFlags);
    }

    // --- [ bgfx_create_frame_buffer_scaled ] ---

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_scaled(bgfx_backbuffer_ratio_t _ratio, bgfx_texture_format_t _format, uint64_t _textureFlags)} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_scaled(@NativeType("bgfx_backbuffer_ratio_t") int _ratio, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _textureFlags) {
        long __functionAddress = Functions.create_frame_buffer_scaled;
        return invokeJC(_ratio, _format, _textureFlags, __functionAddress);
    }

    // --- [ bgfx_create_frame_buffer_from_handles ] ---

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_handles(uint8_t _num, bgfx_texture_handle_t const * _handles, bool _destroyTextures)} */
    public static short nbgfx_create_frame_buffer_from_handles(byte _num, long _handles, boolean _destroyTextures) {
        long __functionAddress = Functions.create_frame_buffer_from_handles;
        return invokeUPC(_num, _handles, _destroyTextures, __functionAddress);
    }

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_handles(uint8_t _num, bgfx_texture_handle_t const * _handles, bool _destroyTextures)} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_handles(@NativeType("bgfx_texture_handle_t const *") ShortBuffer _handles, @NativeType("bool") boolean _destroyTextures) {
        return nbgfx_create_frame_buffer_from_handles((byte)_handles.remaining(), memAddress(_handles), _destroyTextures);
    }

    // --- [ bgfx_create_frame_buffer_from_attachment ] ---

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_attachment(uint8_t _num, bgfx_attachment_t const * _attachment, bool _destroyTextures)} */
    public static short nbgfx_create_frame_buffer_from_attachment(byte _num, long _attachment, boolean _destroyTextures) {
        long __functionAddress = Functions.create_frame_buffer_from_attachment;
        return invokeUPC(_num, _attachment, _destroyTextures, __functionAddress);
    }

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_attachment(uint8_t _num, bgfx_attachment_t const * _attachment, bool _destroyTextures)} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_attachment(@NativeType("bgfx_attachment_t const *") BGFXAttachment.Buffer _attachment, @NativeType("bool") boolean _destroyTextures) {
        return nbgfx_create_frame_buffer_from_attachment((byte)_attachment.remaining(), _attachment.address(), _destroyTextures);
    }

    // --- [ bgfx_create_frame_buffer_from_nwh ] ---

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_nwh(void * _nwh, uint16_t _width, uint16_t _height, bgfx_texture_format_t _format, bgfx_texture_format_t _depthFormat)} */
    public static short nbgfx_create_frame_buffer_from_nwh(long _nwh, short _width, short _height, int _format, int _depthFormat) {
        long __functionAddress = Functions.create_frame_buffer_from_nwh;
        if (CHECKS) {
            check(_nwh);
        }
        return invokePCCC(_nwh, _width, _height, _format, _depthFormat, __functionAddress);
    }

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_nwh(void * _nwh, uint16_t _width, uint16_t _height, bgfx_texture_format_t _format, bgfx_texture_format_t _depthFormat)} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_nwh(@NativeType("void *") long _nwh, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("bgfx_texture_format_t") int _format, @NativeType("bgfx_texture_format_t") int _depthFormat) {
        return nbgfx_create_frame_buffer_from_nwh(_nwh, (short)_width, (short)_height, _format, _depthFormat);
    }

    // --- [ bgfx_set_frame_buffer_name ] ---

    /** {@code void bgfx_set_frame_buffer_name(bgfx_frame_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void nbgfx_set_frame_buffer_name(short _handle, long _name, int _len) {
        long __functionAddress = Functions.set_frame_buffer_name;
        invokeCPV(_handle, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_frame_buffer_name(bgfx_frame_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_frame_buffer_name(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_frame_buffer_name(_handle, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_frame_buffer_name(bgfx_frame_buffer_handle_t _handle, char const * _name, int32_t _len)} */
    public static void bgfx_set_frame_buffer_name(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nASCII(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_frame_buffer_name(_handle, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_get_texture ] ---

    /** {@code bgfx_texture_handle_t bgfx_get_texture(bgfx_frame_buffer_handle_t _handle, uint8_t _attachment)} */
    public static short nbgfx_get_texture(short _handle, byte _attachment) {
        long __functionAddress = Functions.get_texture;
        return invokeCUC(_handle, _attachment, __functionAddress);
    }

    /** {@code bgfx_texture_handle_t bgfx_get_texture(bgfx_frame_buffer_handle_t _handle, uint8_t _attachment)} */
    @NativeType("bgfx_texture_handle_t")
    public static short bgfx_get_texture(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("uint8_t") int _attachment) {
        return nbgfx_get_texture(_handle, (byte)_attachment);
    }

    // --- [ bgfx_destroy_frame_buffer ] ---

    /** {@code void bgfx_destroy_frame_buffer(bgfx_frame_buffer_handle_t _handle)} */
    public static void bgfx_destroy_frame_buffer(@NativeType("bgfx_frame_buffer_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_frame_buffer;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_uniform ] ---

    /** {@code bgfx_uniform_handle_t bgfx_create_uniform(char const * _name, bgfx_uniform_type_t _type, uint16_t _num)} */
    public static short nbgfx_create_uniform(long _name, int _type, short _num) {
        long __functionAddress = Functions.create_uniform;
        return invokePCC(_name, _type, _num, __functionAddress);
    }

    /** {@code bgfx_uniform_handle_t bgfx_create_uniform(char const * _name, bgfx_uniform_type_t _type, uint16_t _num)} */
    @NativeType("bgfx_uniform_handle_t")
    public static short bgfx_create_uniform(@NativeType("char const *") ByteBuffer _name, @NativeType("bgfx_uniform_type_t") int _type, @NativeType("uint16_t") int _num) {
        if (CHECKS) {
            checkNT1(_name);
        }
        return nbgfx_create_uniform(memAddress(_name), _type, (short)_num);
    }

    /** {@code bgfx_uniform_handle_t bgfx_create_uniform(char const * _name, bgfx_uniform_type_t _type, uint16_t _num)} */
    @NativeType("bgfx_uniform_handle_t")
    public static short bgfx_create_uniform(@NativeType("char const *") CharSequence _name, @NativeType("bgfx_uniform_type_t") int _type, @NativeType("uint16_t") int _num) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_name, true);
            long _nameEncoded = stack.getPointerAddress();
            return nbgfx_create_uniform(_nameEncoded, _type, (short)_num);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_get_uniform_info ] ---

    /** {@code void bgfx_get_uniform_info(bgfx_uniform_handle_t _handle, bgfx_uniform_info_t * _info)} */
    public static void nbgfx_get_uniform_info(short _handle, long _info) {
        long __functionAddress = Functions.get_uniform_info;
        invokeCPV(_handle, _info, __functionAddress);
    }

    /** {@code void bgfx_get_uniform_info(bgfx_uniform_handle_t _handle, bgfx_uniform_info_t * _info)} */
    public static void bgfx_get_uniform_info(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("bgfx_uniform_info_t *") BGFXUniformInfo _info) {
        nbgfx_get_uniform_info(_handle, _info.address());
    }

    // --- [ bgfx_destroy_uniform ] ---

    /** {@code void bgfx_destroy_uniform(bgfx_uniform_handle_t _handle)} */
    public static void bgfx_destroy_uniform(@NativeType("bgfx_uniform_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_uniform;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_create_occlusion_query ] ---

    /** {@code bgfx_occlusion_query_handle_t bgfx_create_occlusion_query(void)} */
    @NativeType("bgfx_occlusion_query_handle_t")
    public static short bgfx_create_occlusion_query() {
        long __functionAddress = Functions.create_occlusion_query;
        return invokeC(__functionAddress);
    }

    // --- [ bgfx_get_result ] ---

    /** {@code bgfx_occlusion_query_result_t bgfx_get_result(bgfx_occlusion_query_handle_t _handle, int32_t * _result)} */
    public static int nbgfx_get_result(short _handle, long _result) {
        long __functionAddress = Functions.get_result;
        return invokeCPI(_handle, _result, __functionAddress);
    }

    /** {@code bgfx_occlusion_query_result_t bgfx_get_result(bgfx_occlusion_query_handle_t _handle, int32_t * _result)} */
    @NativeType("bgfx_occlusion_query_result_t")
    public static int bgfx_get_result(@NativeType("bgfx_occlusion_query_handle_t") short _handle, @NativeType("int32_t *") @Nullable IntBuffer _result) {
        if (CHECKS) {
            checkSafe(_result, 1);
        }
        return nbgfx_get_result(_handle, memAddressSafe(_result));
    }

    // --- [ bgfx_destroy_occlusion_query ] ---

    /** {@code void bgfx_destroy_occlusion_query(bgfx_occlusion_query_handle_t _handle)} */
    public static void bgfx_destroy_occlusion_query(@NativeType("bgfx_occlusion_query_handle_t") short _handle) {
        long __functionAddress = Functions.destroy_occlusion_query;
        invokeCV(_handle, __functionAddress);
    }

    // --- [ bgfx_set_palette_color ] ---

    /** {@code void bgfx_set_palette_color(uint8_t _index, float const * _rgba)} */
    public static void nbgfx_set_palette_color(byte _index, long _rgba) {
        long __functionAddress = Functions.set_palette_color;
        invokeUPV(_index, _rgba, __functionAddress);
    }

    /** {@code void bgfx_set_palette_color(uint8_t _index, float const * _rgba)} */
    public static void bgfx_set_palette_color(@NativeType("uint8_t") int _index, @NativeType("float const *") FloatBuffer _rgba) {
        if (CHECKS) {
            check(_rgba, 4);
        }
        nbgfx_set_palette_color((byte)_index, memAddress(_rgba));
    }

    // --- [ bgfx_set_palette_color_rgba32f ] ---

    /** {@code void bgfx_set_palette_color_rgba32f(uint8_t _index, float _r, float _g, float _b, float _a)} */
    public static void nbgfx_set_palette_color_rgba32f(byte _index, float _r, float _g, float _b, float _a) {
        long __functionAddress = Functions.set_palette_color_rgba32f;
        invokeUV(_index, _r, _g, _b, _a, __functionAddress);
    }

    /** {@code void bgfx_set_palette_color_rgba32f(uint8_t _index, float _r, float _g, float _b, float _a)} */
    public static void bgfx_set_palette_color_rgba32f(@NativeType("uint8_t") int _index, float _r, float _g, float _b, float _a) {
        nbgfx_set_palette_color_rgba32f((byte)_index, _r, _g, _b, _a);
    }

    // --- [ bgfx_set_palette_color_rgba8 ] ---

    /** {@code void bgfx_set_palette_color_rgba8(uint8_t _index, uint32_t _rgba)} */
    public static void nbgfx_set_palette_color_rgba8(byte _index, int _rgba) {
        long __functionAddress = Functions.set_palette_color_rgba8;
        invokeUV(_index, _rgba, __functionAddress);
    }

    /** {@code void bgfx_set_palette_color_rgba8(uint8_t _index, uint32_t _rgba)} */
    public static void bgfx_set_palette_color_rgba8(@NativeType("uint8_t") int _index, @NativeType("uint32_t") int _rgba) {
        nbgfx_set_palette_color_rgba8((byte)_index, _rgba);
    }

    // --- [ bgfx_set_view_name ] ---

    /** {@code void bgfx_set_view_name(bgfx_view_id_t _id, char const * _name, int32_t _len)} */
    public static void nbgfx_set_view_name(short _id, long _name, int _len) {
        long __functionAddress = Functions.set_view_name;
        invokeCPV(_id, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_view_name(bgfx_view_id_t _id, char const * _name, int32_t _len)} */
    public static void bgfx_set_view_name(@NativeType("bgfx_view_id_t") int _id, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_view_name((short)_id, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_view_name(bgfx_view_id_t _id, char const * _name, int32_t _len)} */
    public static void bgfx_set_view_name(@NativeType("bgfx_view_id_t") int _id, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nASCII(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_view_name((short)_id, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_set_view_rect ] ---

    /** {@code void bgfx_set_view_rect(bgfx_view_id_t _id, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    public static void nbgfx_set_view_rect(short _id, short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.set_view_rect;
        invokeCCCCCV(_id, _x, _y, _width, _height, __functionAddress);
    }

    /** {@code void bgfx_set_view_rect(bgfx_view_id_t _id, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    public static void bgfx_set_view_rect(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        nbgfx_set_view_rect((short)_id, (short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_set_view_rect_ratio ] ---

    /** {@code void bgfx_set_view_rect_ratio(bgfx_view_id_t _id, uint16_t _x, uint16_t _y, bgfx_backbuffer_ratio_t _ratio)} */
    public static void nbgfx_set_view_rect_ratio(short _id, short _x, short _y, int _ratio) {
        long __functionAddress = Functions.set_view_rect_ratio;
        invokeCCCV(_id, _x, _y, _ratio, __functionAddress);
    }

    /** {@code void bgfx_set_view_rect_ratio(bgfx_view_id_t _id, uint16_t _x, uint16_t _y, bgfx_backbuffer_ratio_t _ratio)} */
    public static void bgfx_set_view_rect_ratio(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("bgfx_backbuffer_ratio_t") int _ratio) {
        nbgfx_set_view_rect_ratio((short)_id, (short)_x, (short)_y, _ratio);
    }

    // --- [ bgfx_set_view_scissor ] ---

    /** {@code void bgfx_set_view_scissor(bgfx_view_id_t _id, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    public static void nbgfx_set_view_scissor(short _id, short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.set_view_scissor;
        invokeCCCCCV(_id, _x, _y, _width, _height, __functionAddress);
    }

    /** {@code void bgfx_set_view_scissor(bgfx_view_id_t _id, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    public static void bgfx_set_view_scissor(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        nbgfx_set_view_scissor((short)_id, (short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_set_view_clear ] ---

    /** {@code void bgfx_set_view_clear(bgfx_view_id_t _id, uint16_t _flags, uint32_t _rgba, float _depth, uint8_t _stencil)} */
    public static void nbgfx_set_view_clear(short _id, short _flags, int _rgba, float _depth, byte _stencil) {
        long __functionAddress = Functions.set_view_clear;
        invokeCCUV(_id, _flags, _rgba, _depth, _stencil, __functionAddress);
    }

    /** {@code void bgfx_set_view_clear(bgfx_view_id_t _id, uint16_t _flags, uint32_t _rgba, float _depth, uint8_t _stencil)} */
    public static void bgfx_set_view_clear(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _flags, @NativeType("uint32_t") int _rgba, float _depth, @NativeType("uint8_t") int _stencil) {
        nbgfx_set_view_clear((short)_id, (short)_flags, _rgba, _depth, (byte)_stencil);
    }

    // --- [ bgfx_set_view_clear_mrt ] ---

    /** {@code void bgfx_set_view_clear_mrt(bgfx_view_id_t _id, uint16_t _flags, float _depth, uint8_t _stencil, uint8_t _0, uint8_t _1, uint8_t _2, uint8_t _3, uint8_t _4, uint8_t _5, uint8_t _6, uint8_t _7)} */
    public static void nbgfx_set_view_clear_mrt(short _id, short _flags, float _depth, byte _stencil, byte _0, byte _1, byte _2, byte _3, byte _4, byte _5, byte _6, byte _7) {
        long __functionAddress = Functions.set_view_clear_mrt;
        invokeCCUUUUUUUUUV(_id, _flags, _depth, _stencil, _0, _1, _2, _3, _4, _5, _6, _7, __functionAddress);
    }

    /** {@code void bgfx_set_view_clear_mrt(bgfx_view_id_t _id, uint16_t _flags, float _depth, uint8_t _stencil, uint8_t _0, uint8_t _1, uint8_t _2, uint8_t _3, uint8_t _4, uint8_t _5, uint8_t _6, uint8_t _7)} */
    public static void bgfx_set_view_clear_mrt(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _flags, float _depth, @NativeType("uint8_t") int _stencil, @NativeType("uint8_t") byte _0, @NativeType("uint8_t") byte _1, @NativeType("uint8_t") byte _2, @NativeType("uint8_t") byte _3, @NativeType("uint8_t") byte _4, @NativeType("uint8_t") byte _5, @NativeType("uint8_t") byte _6, @NativeType("uint8_t") byte _7) {
        nbgfx_set_view_clear_mrt((short)_id, (short)_flags, _depth, (byte)_stencil, _0, _1, _2, _3, _4, _5, _6, _7);
    }

    // --- [ bgfx_set_view_mode ] ---

    /** {@code void bgfx_set_view_mode(bgfx_view_id_t _id, bgfx_view_mode_t _mode)} */
    public static void nbgfx_set_view_mode(short _id, int _mode) {
        long __functionAddress = Functions.set_view_mode;
        invokeCV(_id, _mode, __functionAddress);
    }

    /** {@code void bgfx_set_view_mode(bgfx_view_id_t _id, bgfx_view_mode_t _mode)} */
    public static void bgfx_set_view_mode(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_view_mode_t") int _mode) {
        nbgfx_set_view_mode((short)_id, _mode);
    }

    // --- [ bgfx_set_view_frame_buffer ] ---

    /** {@code void bgfx_set_view_frame_buffer(bgfx_view_id_t _id, bgfx_frame_buffer_handle_t _handle)} */
    public static void nbgfx_set_view_frame_buffer(short _id, short _handle) {
        long __functionAddress = Functions.set_view_frame_buffer;
        invokeCCV(_id, _handle, __functionAddress);
    }

    /** {@code void bgfx_set_view_frame_buffer(bgfx_view_id_t _id, bgfx_frame_buffer_handle_t _handle)} */
    public static void bgfx_set_view_frame_buffer(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_frame_buffer_handle_t") short _handle) {
        nbgfx_set_view_frame_buffer((short)_id, _handle);
    }

    // --- [ bgfx_set_view_transform ] ---

    /** {@code void bgfx_set_view_transform(bgfx_view_id_t _id, void const * _view, void const * _proj)} */
    public static void nbgfx_set_view_transform(short _id, long _view, long _proj) {
        long __functionAddress = Functions.set_view_transform;
        invokeCPPV(_id, _view, _proj, __functionAddress);
    }

    /** {@code void bgfx_set_view_transform(bgfx_view_id_t _id, void const * _view, void const * _proj)} */
    public static void bgfx_set_view_transform(@NativeType("bgfx_view_id_t") int _id, @NativeType("void const *") @Nullable ByteBuffer _view, @NativeType("void const *") @Nullable ByteBuffer _proj) {
        if (CHECKS) {
            checkSafe(_view, 64);
            checkSafe(_proj, 64);
        }
        nbgfx_set_view_transform((short)_id, memAddressSafe(_view), memAddressSafe(_proj));
    }

    /** {@code void bgfx_set_view_transform(bgfx_view_id_t _id, void const * _view, void const * _proj)} */
    public static void bgfx_set_view_transform(@NativeType("bgfx_view_id_t") int _id, @NativeType("void const *") @Nullable FloatBuffer _view, @NativeType("void const *") @Nullable FloatBuffer _proj) {
        if (CHECKS) {
            checkSafe(_view, 64 >> 2);
            checkSafe(_proj, 64 >> 2);
        }
        nbgfx_set_view_transform((short)_id, memAddressSafe(_view), memAddressSafe(_proj));
    }

    // --- [ bgfx_set_view_order ] ---

    /** {@code void bgfx_set_view_order(bgfx_view_id_t _id, uint16_t _num, bgfx_view_id_t const * _order)} */
    public static void nbgfx_set_view_order(short _id, short _num, long _order) {
        long __functionAddress = Functions.set_view_order;
        invokeCCPV(_id, _num, _order, __functionAddress);
    }

    /** {@code void bgfx_set_view_order(bgfx_view_id_t _id, uint16_t _num, bgfx_view_id_t const * _order)} */
    public static void bgfx_set_view_order(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _num, @NativeType("bgfx_view_id_t const *") @Nullable ShortBuffer _order) {
        if (CHECKS) {
            checkSafe(_order, _num);
        }
        nbgfx_set_view_order((short)_id, (short)_num, memAddressSafe(_order));
    }

    // --- [ bgfx_reset_view ] ---

    /** {@code void bgfx_reset_view(bgfx_view_id_t _id)} */
    public static void nbgfx_reset_view(short _id) {
        long __functionAddress = Functions.reset_view;
        invokeCV(_id, __functionAddress);
    }

    /** {@code void bgfx_reset_view(bgfx_view_id_t _id)} */
    public static void bgfx_reset_view(@NativeType("bgfx_view_id_t") int _id) {
        nbgfx_reset_view((short)_id);
    }

    // --- [ bgfx_encoder_begin ] ---

    /** {@code bgfx_encoder_t * bgfx_encoder_begin(bool _forThread)} */
    @NativeType("bgfx_encoder_t *")
    public static long bgfx_encoder_begin(@NativeType("bool") boolean _forThread) {
        long __functionAddress = Functions.encoder_begin;
        return invokeP(_forThread, __functionAddress);
    }

    // --- [ bgfx_encoder_end ] ---

    /** {@code void bgfx_encoder_end(bgfx_encoder_t * _encoder)} */
    public static void bgfx_encoder_end(@NativeType("bgfx_encoder_t *") long _encoder) {
        long __functionAddress = Functions.encoder_end;
        if (CHECKS) {
            check(_encoder);
        }
        invokePV(_encoder, __functionAddress);
    }

    // --- [ bgfx_encoder_set_marker ] ---

    /** {@code void bgfx_encoder_set_marker(bgfx_encoder_t * _this, char const * _name, int32_t _len)} */
    public static void nbgfx_encoder_set_marker(long _this, long _name, int _len) {
        long __functionAddress = Functions.encoder_set_marker;
        if (CHECKS) {
            check(_this);
        }
        invokePPV(_this, _name, _len, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_marker(bgfx_encoder_t * _this, char const * _name, int32_t _len)} */
    public static void bgfx_encoder_set_marker(@NativeType("bgfx_encoder_t *") long _this, @NativeType("char const *") ByteBuffer _name) {
        nbgfx_encoder_set_marker(_this, memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_encoder_set_marker(bgfx_encoder_t * _this, char const * _name, int32_t _len)} */
    public static void bgfx_encoder_set_marker(@NativeType("bgfx_encoder_t *") long _this, @NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nASCII(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_encoder_set_marker(_this, _nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_encoder_set_state ] ---

    /** {@code void bgfx_encoder_set_state(bgfx_encoder_t * _this, uint64_t _state, uint32_t _rgba)} */
    public static void bgfx_encoder_set_state(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint64_t") long _state, @NativeType("uint32_t") int _rgba) {
        long __functionAddress = Functions.encoder_set_state;
        if (CHECKS) {
            check(_this);
        }
        invokePJV(_this, _state, _rgba, __functionAddress);
    }

    // --- [ bgfx_encoder_set_condition ] ---

    /** {@code void bgfx_encoder_set_condition(bgfx_encoder_t * _this, bgfx_occlusion_query_handle_t _handle, bool _visible)} */
    public static void bgfx_encoder_set_condition(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_occlusion_query_handle_t") short _handle, @NativeType("bool") boolean _visible) {
        long __functionAddress = Functions.encoder_set_condition;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _handle, _visible, __functionAddress);
    }

    // --- [ bgfx_encoder_set_stencil ] ---

    /** {@code void bgfx_encoder_set_stencil(bgfx_encoder_t * _this, uint32_t _fstencil, uint32_t _bstencil)} */
    public static void bgfx_encoder_set_stencil(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint32_t") int _fstencil, @NativeType("uint32_t") int _bstencil) {
        long __functionAddress = Functions.encoder_set_stencil;
        if (CHECKS) {
            check(_this);
        }
        invokePV(_this, _fstencil, _bstencil, __functionAddress);
    }

    // --- [ bgfx_encoder_set_scissor ] ---

    /** {@code uint16_t bgfx_encoder_set_scissor(bgfx_encoder_t * _this, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    public static short nbgfx_encoder_set_scissor(long _this, short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.encoder_set_scissor;
        if (CHECKS) {
            check(_this);
        }
        return invokePCCCCC(_this, _x, _y, _width, _height, __functionAddress);
    }

    /** {@code uint16_t bgfx_encoder_set_scissor(bgfx_encoder_t * _this, uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    @NativeType("uint16_t")
    public static short bgfx_encoder_set_scissor(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        return nbgfx_encoder_set_scissor(_this, (short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_encoder_set_scissor_cached ] ---

    /** {@code void bgfx_encoder_set_scissor_cached(bgfx_encoder_t * _this, uint16_t _cache)} */
    public static void nbgfx_encoder_set_scissor_cached(long _this, short _cache) {
        long __functionAddress = Functions.encoder_set_scissor_cached;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _cache, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_scissor_cached(bgfx_encoder_t * _this, uint16_t _cache)} */
    public static void bgfx_encoder_set_scissor_cached(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint16_t") int _cache) {
        nbgfx_encoder_set_scissor_cached(_this, (short)_cache);
    }

    // --- [ bgfx_encoder_set_transform ] ---

    /** {@code uint32_t bgfx_encoder_set_transform(bgfx_encoder_t * _this, void const * _mtx, uint16_t _num)} */
    public static int nbgfx_encoder_set_transform(long _this, long _mtx, short _num) {
        long __functionAddress = Functions.encoder_set_transform;
        if (CHECKS) {
            check(_this);
        }
        return invokePPCI(_this, _mtx, _num, __functionAddress);
    }

    /** {@code uint32_t bgfx_encoder_set_transform(bgfx_encoder_t * _this, void const * _mtx, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_encoder_set_transform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("void const *") ByteBuffer _mtx) {
        return nbgfx_encoder_set_transform(_this, memAddress(_mtx), (short)(_mtx.remaining() >> 6));
    }

    /** {@code uint32_t bgfx_encoder_set_transform(bgfx_encoder_t * _this, void const * _mtx, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_encoder_set_transform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("void const *") FloatBuffer _mtx) {
        return nbgfx_encoder_set_transform(_this, memAddress(_mtx), (short)(_mtx.remaining() >> 4));
    }

    // --- [ bgfx_encoder_set_transform_cached ] ---

    /** {@code void bgfx_encoder_set_transform_cached(bgfx_encoder_t * _this, uint32_t _cache, uint16_t _num)} */
    public static void nbgfx_encoder_set_transform_cached(long _this, int _cache, short _num) {
        long __functionAddress = Functions.encoder_set_transform_cached;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _cache, _num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_transform_cached(bgfx_encoder_t * _this, uint32_t _cache, uint16_t _num)} */
    public static void bgfx_encoder_set_transform_cached(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint32_t") int _cache, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_transform_cached(_this, _cache, (short)_num);
    }

    // --- [ bgfx_encoder_alloc_transform ] ---

    /** {@code uint32_t bgfx_encoder_alloc_transform(bgfx_encoder_t * _this, bgfx_transform_t * _transform, uint16_t _num)} */
    public static int nbgfx_encoder_alloc_transform(long _this, long _transform, short _num) {
        long __functionAddress = Functions.encoder_alloc_transform;
        if (CHECKS) {
            check(_this);
        }
        return invokePPCI(_this, _transform, _num, __functionAddress);
    }

    /** {@code uint32_t bgfx_encoder_alloc_transform(bgfx_encoder_t * _this, bgfx_transform_t * _transform, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_encoder_alloc_transform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_transform_t *") BGFXTransform _transform, @NativeType("uint16_t") int _num) {
        return nbgfx_encoder_alloc_transform(_this, _transform.address(), (short)_num);
    }

    // --- [ bgfx_encoder_set_uniform ] ---

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void nbgfx_encoder_set_uniform(long _this, short _handle, long _value, short _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_this);
        }
        invokePCPCV(_this, _handle, _value, _num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ByteBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_this, _handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ShortBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_this, _handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") IntBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_this, _handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") LongBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_this, _handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") FloatBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_this, _handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") DoubleBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_encoder_set_uniform(_this, _handle, memAddress(_value), (short)_num);
    }

    // --- [ bgfx_encoder_set_index_buffer ] ---

    /** {@code void bgfx_encoder_set_index_buffer(bgfx_encoder_t * _this, bgfx_index_buffer_handle_t _handle, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void bgfx_encoder_set_index_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.encoder_set_index_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _handle, _firstIndex, _numIndices, __functionAddress);
    }

    // --- [ bgfx_encoder_set_dynamic_index_buffer ] ---

    /** {@code void bgfx_encoder_set_dynamic_index_buffer(bgfx_encoder_t * _this, bgfx_dynamic_index_buffer_handle_t _handle, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void bgfx_encoder_set_dynamic_index_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.encoder_set_dynamic_index_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _handle, _firstIndex, _numIndices, __functionAddress);
    }

    // --- [ bgfx_encoder_set_transient_index_buffer ] ---

    /** {@code void bgfx_encoder_set_transient_index_buffer(bgfx_encoder_t * _this, bgfx_transient_index_buffer_t const * _tib, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void nbgfx_encoder_set_transient_index_buffer(long _this, long _tib, int _firstIndex, int _numIndices) {
        long __functionAddress = Functions.encoder_set_transient_index_buffer;
        if (CHECKS) {
            check(_this);
            BGFXTransientIndexBuffer.validate(_tib);
        }
        invokePPV(_this, _tib, _firstIndex, _numIndices, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_transient_index_buffer(bgfx_encoder_t * _this, bgfx_transient_index_buffer_t const * _tib, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void bgfx_encoder_set_transient_index_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_transient_index_buffer_t const *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        nbgfx_encoder_set_transient_index_buffer(_this, _tib.address(), _firstIndex, _numIndices);
    }

    // --- [ bgfx_encoder_set_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void nbgfx_encoder_set_vertex_buffer(long _this, byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.encoder_set_vertex_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stream, _handle, _startVertex, _numVertices, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void bgfx_encoder_set_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stream, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_encoder_set_vertex_buffer(_this, (byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_encoder_set_vertex_buffer_with_layout ] ---

    /** {@code void bgfx_encoder_set_vertex_buffer_with_layout(bgfx_encoder_t * _this, uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void nbgfx_encoder_set_vertex_buffer_with_layout(long _this, byte _stream, short _handle, int _startVertex, int _numVertices, short _layoutHandle) {
        long __functionAddress = Functions.encoder_set_vertex_buffer_with_layout;
        if (CHECKS) {
            check(_this);
        }
        invokePUCCV(_this, _stream, _handle, _startVertex, _numVertices, _layoutHandle, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_vertex_buffer_with_layout(bgfx_encoder_t * _this, uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void bgfx_encoder_set_vertex_buffer_with_layout(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stream, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_vertex_layout_handle_t") short _layoutHandle) {
        nbgfx_encoder_set_vertex_buffer_with_layout(_this, (byte)_stream, _handle, _startVertex, _numVertices, _layoutHandle);
    }

    // --- [ bgfx_encoder_set_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_dynamic_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void nbgfx_encoder_set_dynamic_vertex_buffer(long _this, byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.encoder_set_dynamic_vertex_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stream, _handle, _startVertex, _numVertices, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_dynamic_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void bgfx_encoder_set_dynamic_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stream, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_encoder_set_dynamic_vertex_buffer(_this, (byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_encoder_set_dynamic_vertex_buffer_with_layout ] ---

    /** {@code void bgfx_encoder_set_dynamic_vertex_buffer_with_layout(bgfx_encoder_t * _this, uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void nbgfx_encoder_set_dynamic_vertex_buffer_with_layout(long _this, byte _stream, short _handle, int _startVertex, int _numVertices, short _layoutHandle) {
        long __functionAddress = Functions.encoder_set_dynamic_vertex_buffer_with_layout;
        if (CHECKS) {
            check(_this);
        }
        invokePUCCV(_this, _stream, _handle, _startVertex, _numVertices, _layoutHandle, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_dynamic_vertex_buffer_with_layout(bgfx_encoder_t * _this, uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void bgfx_encoder_set_dynamic_vertex_buffer_with_layout(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stream, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_vertex_layout_handle_t") short _layoutHandle) {
        nbgfx_encoder_set_dynamic_vertex_buffer_with_layout(_this, (byte)_stream, _handle, _startVertex, _numVertices, _layoutHandle);
    }

    // --- [ bgfx_encoder_set_transient_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_transient_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void nbgfx_encoder_set_transient_vertex_buffer(long _this, byte _stream, long _tvb, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.encoder_set_transient_vertex_buffer;
        if (CHECKS) {
            check(_this);
            BGFXTransientVertexBuffer.validate(_tvb);
        }
        invokePUPV(_this, _stream, _tvb, _startVertex, _numVertices, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_transient_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void bgfx_encoder_set_transient_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stream, @NativeType("bgfx_transient_vertex_buffer_t const *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_encoder_set_transient_vertex_buffer(_this, (byte)_stream, _tvb.address(), _startVertex, _numVertices);
    }

    // --- [ bgfx_encoder_set_transient_vertex_buffer_with_layout ] ---

    /** {@code void bgfx_encoder_set_transient_vertex_buffer_with_layout(bgfx_encoder_t * _this, uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void nbgfx_encoder_set_transient_vertex_buffer_with_layout(long _this, byte _stream, long _tvb, int _startVertex, int _numVertices, short _layoutHandle) {
        long __functionAddress = Functions.encoder_set_transient_vertex_buffer_with_layout;
        if (CHECKS) {
            check(_this);
            BGFXTransientVertexBuffer.validate(_tvb);
        }
        invokePUPCV(_this, _stream, _tvb, _startVertex, _numVertices, _layoutHandle, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_transient_vertex_buffer_with_layout(bgfx_encoder_t * _this, uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void bgfx_encoder_set_transient_vertex_buffer_with_layout(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stream, @NativeType("bgfx_transient_vertex_buffer_t const *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_vertex_layout_handle_t") short _layoutHandle) {
        nbgfx_encoder_set_transient_vertex_buffer_with_layout(_this, (byte)_stream, _tvb.address(), _startVertex, _numVertices, _layoutHandle);
    }

    // --- [ bgfx_encoder_set_vertex_count ] ---

    /** {@code void bgfx_encoder_set_vertex_count(bgfx_encoder_t * _this, uint32_t _numVertices)} */
    public static void bgfx_encoder_set_vertex_count(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint32_t") int _numVertices) {
        long __functionAddress = Functions.encoder_set_vertex_count;
        if (CHECKS) {
            check(_this);
        }
        invokePV(_this, _numVertices, __functionAddress);
    }

    // --- [ bgfx_encoder_set_instance_data_buffer ] ---

    /** {@code void bgfx_encoder_set_instance_data_buffer(bgfx_encoder_t * _this, bgfx_instance_data_buffer_t const * _idb, uint32_t _start, uint32_t _num)} */
    public static void nbgfx_encoder_set_instance_data_buffer(long _this, long _idb, int _start, int _num) {
        long __functionAddress = Functions.encoder_set_instance_data_buffer;
        if (CHECKS) {
            check(_this);
            BGFXInstanceDataBuffer.validate(_idb);
        }
        invokePPV(_this, _idb, _start, _num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_instance_data_buffer(bgfx_encoder_t * _this, bgfx_instance_data_buffer_t const * _idb, uint32_t _start, uint32_t _num)} */
    public static void bgfx_encoder_set_instance_data_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_instance_data_buffer_t const *") BGFXInstanceDataBuffer _idb, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        nbgfx_encoder_set_instance_data_buffer(_this, _idb.address(), _start, _num);
    }

    // --- [ bgfx_encoder_set_instance_data_from_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_instance_data_from_vertex_buffer(bgfx_encoder_t * _this, bgfx_vertex_buffer_handle_t _handle, uint32_t _start, uint32_t _num)} */
    public static void bgfx_encoder_set_instance_data_from_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.encoder_set_instance_data_from_vertex_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _handle, _start, _num, __functionAddress);
    }

    // --- [ bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer(bgfx_encoder_t * _this, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _start, uint32_t _num)} */
    public static void bgfx_encoder_set_instance_data_from_dynamic_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.encoder_set_instance_data_from_dynamic_vertex_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _handle, _start, _num, __functionAddress);
    }

    // --- [ bgfx_encoder_set_instance_count ] ---

    /** {@code void bgfx_encoder_set_instance_count(bgfx_encoder_t * _this, uint32_t _numInstances)} */
    public static void bgfx_encoder_set_instance_count(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint32_t") int _numInstances) {
        long __functionAddress = Functions.encoder_set_instance_count;
        if (CHECKS) {
            check(_this);
        }
        invokePV(_this, _numInstances, __functionAddress);
    }

    // --- [ bgfx_encoder_set_texture ] ---

    /** {@code void bgfx_encoder_set_texture(bgfx_encoder_t * _this, uint8_t _stage, bgfx_uniform_handle_t _sampler, bgfx_texture_handle_t _handle, uint32_t _flags)} */
    public static void nbgfx_encoder_set_texture(long _this, byte _stage, short _sampler, short _handle, int _flags) {
        long __functionAddress = Functions.encoder_set_texture;
        if (CHECKS) {
            check(_this);
        }
        invokePUCCV(_this, _stage, _sampler, _handle, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_texture(bgfx_encoder_t * _this, uint8_t _stage, bgfx_uniform_handle_t _sampler, bgfx_texture_handle_t _handle, uint32_t _flags)} */
    public static void bgfx_encoder_set_texture(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_uniform_handle_t") short _sampler, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint32_t") int _flags) {
        nbgfx_encoder_set_texture(_this, (byte)_stage, _sampler, _handle, _flags);
    }

    // --- [ bgfx_encoder_touch ] ---

    /** {@code void bgfx_encoder_touch(bgfx_encoder_t * _this, bgfx_view_id_t _id)} */
    public static void nbgfx_encoder_touch(long _this, short _id) {
        long __functionAddress = Functions.encoder_touch;
        if (CHECKS) {
            check(_this);
        }
        invokePCV(_this, _id, __functionAddress);
    }

    /** {@code void bgfx_encoder_touch(bgfx_encoder_t * _this, bgfx_view_id_t _id)} */
    public static void bgfx_encoder_touch(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id) {
        nbgfx_encoder_touch(_this, (short)_id);
    }

    // --- [ bgfx_encoder_submit ] ---

    /** {@code void bgfx_encoder_submit(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_encoder_submit(long _this, short _id, short _handle, int _depth, byte _flags) {
        long __functionAddress = Functions.encoder_submit;
        if (CHECKS) {
            check(_this);
        }
        invokePCCUV(_this, _id, _handle, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_submit(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_encoder_submit(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_submit(_this, (short)_id, _handle, _depth, (byte)_flags);
    }

    // --- [ bgfx_encoder_submit_occlusion_query ] ---

    /** {@code void bgfx_encoder_submit_occlusion_query(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_occlusion_query_handle_t _occlusionQuery, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_encoder_submit_occlusion_query(long _this, short _id, short _program, short _occlusionQuery, int _depth, byte _flags) {
        long __functionAddress = Functions.encoder_submit_occlusion_query;
        if (CHECKS) {
            check(_this);
        }
        invokePCCCUV(_this, _id, _program, _occlusionQuery, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_submit_occlusion_query(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_occlusion_query_handle_t _occlusionQuery, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_encoder_submit_occlusion_query(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_occlusion_query_handle_t") short _occlusionQuery, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_submit_occlusion_query(_this, (short)_id, _program, _occlusionQuery, _depth, (byte)_flags);
    }

    // --- [ bgfx_encoder_submit_indirect ] ---

    /** {@code void bgfx_encoder_submit_indirect(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_encoder_submit_indirect(long _this, short _id, short _handle, short _indirectHandle, int _start, int _num, int _depth, byte _flags) {
        long __functionAddress = Functions.encoder_submit_indirect;
        if (CHECKS) {
            check(_this);
        }
        invokePCCCUV(_this, _id, _handle, _indirectHandle, _start, _num, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_submit_indirect(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_encoder_submit_indirect(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_submit_indirect(_this, (short)_id, _handle, _indirectHandle, _start, _num, _depth, (byte)_flags);
    }

    // --- [ bgfx_encoder_submit_indirect_count ] ---

    /** {@code void bgfx_encoder_submit_indirect_count(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, bgfx_index_buffer_handle_t _numHandle, uint32_t _numIndex, uint32_t _numMax, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_encoder_submit_indirect_count(long _this, short _id, short _program, short _indirectHandle, int _start, short _numHandle, int _numIndex, int _numMax, int _depth, byte _flags) {
        long __functionAddress = Functions.encoder_submit_indirect_count;
        if (CHECKS) {
            check(_this);
        }
        invokePCCCCUV(_this, _id, _program, _indirectHandle, _start, _numHandle, _numIndex, _numMax, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_submit_indirect_count(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, bgfx_index_buffer_handle_t _numHandle, uint32_t _numIndex, uint32_t _numMax, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_encoder_submit_indirect_count(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint32_t") int _start, @NativeType("bgfx_index_buffer_handle_t") short _numHandle, @NativeType("uint32_t") int _numIndex, @NativeType("uint32_t") int _numMax, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_submit_indirect_count(_this, (short)_id, _program, _indirectHandle, _start, _numHandle, _numIndex, _numMax, _depth, (byte)_flags);
    }

    // --- [ bgfx_encoder_set_compute_index_buffer ] ---

    /** {@code void bgfx_encoder_set_compute_index_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_encoder_set_compute_index_buffer(long _this, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_index_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_compute_index_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_encoder_set_compute_index_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_index_buffer(_this, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_compute_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_encoder_set_compute_vertex_buffer(long _this, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_vertex_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_compute_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_encoder_set_compute_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_vertex_buffer(_this, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_dynamic_index_buffer ] ---

    /** {@code void bgfx_encoder_set_compute_dynamic_index_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_dynamic_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_encoder_set_compute_dynamic_index_buffer(long _this, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_dynamic_index_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_compute_dynamic_index_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_dynamic_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_encoder_set_compute_dynamic_index_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_dynamic_index_buffer(_this, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_encoder_set_compute_dynamic_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_dynamic_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_encoder_set_compute_dynamic_vertex_buffer(long _this, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_dynamic_vertex_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_compute_dynamic_vertex_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_dynamic_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_encoder_set_compute_dynamic_vertex_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_dynamic_vertex_buffer(_this, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_compute_indirect_buffer ] ---

    /** {@code void bgfx_encoder_set_compute_indirect_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_indirect_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_encoder_set_compute_indirect_buffer(long _this, byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.encoder_set_compute_indirect_buffer;
        if (CHECKS) {
            check(_this);
        }
        invokePUCV(_this, _stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_compute_indirect_buffer(bgfx_encoder_t * _this, uint8_t _stage, bgfx_indirect_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_encoder_set_compute_indirect_buffer(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_indirect_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_encoder_set_compute_indirect_buffer(_this, (byte)_stage, _handle, _access);
    }

    // --- [ bgfx_encoder_set_image ] ---

    /** {@code void bgfx_encoder_set_image(bgfx_encoder_t * _this, uint8_t _stage, bgfx_texture_handle_t _handle, uint8_t _mip, bgfx_access_t _access, bgfx_texture_format_t _format)} */
    public static void nbgfx_encoder_set_image(long _this, byte _stage, short _handle, byte _mip, int _access, int _format) {
        long __functionAddress = Functions.encoder_set_image;
        if (CHECKS) {
            check(_this);
        }
        invokePUCUV(_this, _stage, _handle, _mip, _access, _format, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_image(bgfx_encoder_t * _this, uint8_t _stage, bgfx_texture_handle_t _handle, uint8_t _mip, bgfx_access_t _access, bgfx_texture_format_t _format)} */
    public static void bgfx_encoder_set_image(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _stage, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint8_t") int _mip, @NativeType("bgfx_access_t") int _access, @NativeType("bgfx_texture_format_t") int _format) {
        nbgfx_encoder_set_image(_this, (byte)_stage, _handle, (byte)_mip, _access, _format);
    }

    // --- [ bgfx_encoder_dispatch ] ---

    /** {@code void bgfx_encoder_dispatch(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, uint32_t _numX, uint32_t _numY, uint32_t _numZ, uint8_t _flags)} */
    public static void nbgfx_encoder_dispatch(long _this, short _id, short _handle, int _numX, int _numY, int _numZ, byte _flags) {
        long __functionAddress = Functions.encoder_dispatch;
        if (CHECKS) {
            check(_this);
        }
        invokePCCUV(_this, _id, _handle, _numX, _numY, _numZ, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_dispatch(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, uint32_t _numX, uint32_t _numY, uint32_t _numZ, uint8_t _flags)} */
    public static void bgfx_encoder_dispatch(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("uint32_t") int _numX, @NativeType("uint32_t") int _numY, @NativeType("uint32_t") int _numZ, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_dispatch(_this, (short)_id, _handle, _numX, _numY, _numZ, (byte)_flags);
    }

    // --- [ bgfx_encoder_dispatch_indirect ] ---

    /** {@code void bgfx_encoder_dispatch_indirect(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint8_t _flags)} */
    public static void nbgfx_encoder_dispatch_indirect(long _this, short _id, short _handle, short _indirectHandle, int _start, int _num, byte _flags) {
        long __functionAddress = Functions.encoder_dispatch_indirect;
        if (CHECKS) {
            check(_this);
        }
        invokePCCCUV(_this, _id, _handle, _indirectHandle, _start, _num, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_dispatch_indirect(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_program_handle_t _handle, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint8_t _flags)} */
    public static void bgfx_encoder_dispatch_indirect(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _handle, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_dispatch_indirect(_this, (short)_id, _handle, _indirectHandle, _start, _num, (byte)_flags);
    }

    // --- [ bgfx_encoder_discard ] ---

    /** {@code void bgfx_encoder_discard(bgfx_encoder_t * _this, uint8_t _flags)} */
    public static void nbgfx_encoder_discard(long _this, byte _flags) {
        long __functionAddress = Functions.encoder_discard;
        if (CHECKS) {
            check(_this);
        }
        invokePUV(_this, _flags, __functionAddress);
    }

    /** {@code void bgfx_encoder_discard(bgfx_encoder_t * _this, uint8_t _flags)} */
    public static void bgfx_encoder_discard(@NativeType("bgfx_encoder_t *") long _this, @NativeType("uint8_t") int _flags) {
        nbgfx_encoder_discard(_this, (byte)_flags);
    }

    // --- [ bgfx_encoder_blit ] ---

    /** {@code void bgfx_encoder_blit(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_texture_handle_t _dst, uint8_t _dstMip, uint16_t _dstX, uint16_t _dstY, uint16_t _dstZ, bgfx_texture_handle_t _src, uint8_t _srcMip, uint16_t _srcX, uint16_t _srcY, uint16_t _srcZ, uint16_t _width, uint16_t _height, uint16_t _depth)} */
    public static void nbgfx_encoder_blit(long _this, short _id, short _dst, byte _dstMip, short _dstX, short _dstY, short _dstZ, short _src, byte _srcMip, short _srcX, short _srcY, short _srcZ, short _width, short _height, short _depth) {
        long __functionAddress = Functions.encoder_blit;
        if (CHECKS) {
            check(_this);
        }
        invokePCCUCCCCUCCCCCCV(_this, _id, _dst, _dstMip, _dstX, _dstY, _dstZ, _src, _srcMip, _srcX, _srcY, _srcZ, _width, _height, _depth, __functionAddress);
    }

    /** {@code void bgfx_encoder_blit(bgfx_encoder_t * _this, bgfx_view_id_t _id, bgfx_texture_handle_t _dst, uint8_t _dstMip, uint16_t _dstX, uint16_t _dstY, uint16_t _dstZ, bgfx_texture_handle_t _src, uint8_t _srcMip, uint16_t _srcX, uint16_t _srcY, uint16_t _srcZ, uint16_t _width, uint16_t _height, uint16_t _depth)} */
    public static void bgfx_encoder_blit(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_texture_handle_t") short _dst, @NativeType("uint8_t") int _dstMip, @NativeType("uint16_t") int _dstX, @NativeType("uint16_t") int _dstY, @NativeType("uint16_t") int _dstZ, @NativeType("bgfx_texture_handle_t") short _src, @NativeType("uint8_t") int _srcMip, @NativeType("uint16_t") int _srcX, @NativeType("uint16_t") int _srcY, @NativeType("uint16_t") int _srcZ, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth) {
        nbgfx_encoder_blit(_this, (short)_id, _dst, (byte)_dstMip, (short)_dstX, (short)_dstY, (short)_dstZ, _src, (byte)_srcMip, (short)_srcX, (short)_srcY, (short)_srcZ, (short)_width, (short)_height, (short)_depth);
    }

    // --- [ bgfx_request_screen_shot ] ---

    /** {@code void bgfx_request_screen_shot(bgfx_frame_buffer_handle_t _handle, char const * _filePath)} */
    public static void nbgfx_request_screen_shot(short _handle, long _filePath) {
        long __functionAddress = Functions.request_screen_shot;
        invokeCPV(_handle, _filePath, __functionAddress);
    }

    /** {@code void bgfx_request_screen_shot(bgfx_frame_buffer_handle_t _handle, char const * _filePath)} */
    public static void bgfx_request_screen_shot(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("char const *") ByteBuffer _filePath) {
        if (CHECKS) {
            checkNT1(_filePath);
        }
        nbgfx_request_screen_shot(_handle, memAddress(_filePath));
    }

    /** {@code void bgfx_request_screen_shot(bgfx_frame_buffer_handle_t _handle, char const * _filePath)} */
    public static void bgfx_request_screen_shot(@NativeType("bgfx_frame_buffer_handle_t") short _handle, @NativeType("char const *") CharSequence _filePath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_filePath, true);
            long _filePathEncoded = stack.getPointerAddress();
            nbgfx_request_screen_shot(_handle, _filePathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_set_marker ] ---

    /** {@code void bgfx_set_marker(char const * _name, int32_t _len)} */
    public static void nbgfx_set_marker(long _name, int _len) {
        long __functionAddress = Functions.set_marker;
        invokePV(_name, _len, __functionAddress);
    }

    /** {@code void bgfx_set_marker(char const * _name, int32_t _len)} */
    public static void bgfx_set_marker(@NativeType("char const *") ByteBuffer _name) {
        nbgfx_set_marker(memAddress(_name), _name.remaining());
    }

    /** {@code void bgfx_set_marker(char const * _name, int32_t _len)} */
    public static void bgfx_set_marker(@NativeType("char const *") CharSequence _name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _nameEncodedLength = stack.nASCII(_name, false);
            long _nameEncoded = stack.getPointerAddress();
            nbgfx_set_marker(_nameEncoded, _nameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ bgfx_set_state ] ---

    /** {@code void bgfx_set_state(uint64_t _state, uint32_t _rgba)} */
    public static void bgfx_set_state(@NativeType("uint64_t") long _state, @NativeType("uint32_t") int _rgba) {
        long __functionAddress = Functions.set_state;
        invokeJV(_state, _rgba, __functionAddress);
    }

    // --- [ bgfx_set_condition ] ---

    /** {@code void bgfx_set_condition(bgfx_occlusion_query_handle_t _handle, bool _visible)} */
    public static void bgfx_set_condition(@NativeType("bgfx_occlusion_query_handle_t") short _handle, @NativeType("bool") boolean _visible) {
        long __functionAddress = Functions.set_condition;
        invokeCV(_handle, _visible, __functionAddress);
    }

    // --- [ bgfx_set_stencil ] ---

    /** {@code void bgfx_set_stencil(uint32_t _fstencil, uint32_t _bstencil)} */
    public static void bgfx_set_stencil(@NativeType("uint32_t") int _fstencil, @NativeType("uint32_t") int _bstencil) {
        long __functionAddress = Functions.set_stencil;
        invokeV(_fstencil, _bstencil, __functionAddress);
    }

    // --- [ bgfx_set_scissor ] ---

    /** {@code uint16_t bgfx_set_scissor(uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    public static short nbgfx_set_scissor(short _x, short _y, short _width, short _height) {
        long __functionAddress = Functions.set_scissor;
        return invokeCCCCC(_x, _y, _width, _height, __functionAddress);
    }

    /** {@code uint16_t bgfx_set_scissor(uint16_t _x, uint16_t _y, uint16_t _width, uint16_t _height)} */
    @NativeType("uint16_t")
    public static short bgfx_set_scissor(@NativeType("uint16_t") int _x, @NativeType("uint16_t") int _y, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height) {
        return nbgfx_set_scissor((short)_x, (short)_y, (short)_width, (short)_height);
    }

    // --- [ bgfx_set_scissor_cached ] ---

    /** {@code void bgfx_set_scissor_cached(uint16_t _cache)} */
    public static void nbgfx_set_scissor_cached(short _cache) {
        long __functionAddress = Functions.set_scissor_cached;
        invokeCV(_cache, __functionAddress);
    }

    /** {@code void bgfx_set_scissor_cached(uint16_t _cache)} */
    public static void bgfx_set_scissor_cached(@NativeType("uint16_t") int _cache) {
        nbgfx_set_scissor_cached((short)_cache);
    }

    // --- [ bgfx_set_transform ] ---

    /** {@code uint32_t bgfx_set_transform(void const * _mtx, uint16_t _num)} */
    public static int nbgfx_set_transform(long _mtx, short _num) {
        long __functionAddress = Functions.set_transform;
        return invokePCI(_mtx, _num, __functionAddress);
    }

    /** {@code uint32_t bgfx_set_transform(void const * _mtx, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_set_transform(@NativeType("void const *") ByteBuffer _mtx) {
        return nbgfx_set_transform(memAddress(_mtx), (short)(_mtx.remaining() >> 6));
    }

    /** {@code uint32_t bgfx_set_transform(void const * _mtx, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_set_transform(@NativeType("void const *") FloatBuffer _mtx) {
        return nbgfx_set_transform(memAddress(_mtx), (short)(_mtx.remaining() >> 4));
    }

    // --- [ bgfx_set_transform_cached ] ---

    /** {@code void bgfx_set_transform_cached(uint32_t _cache, uint16_t _num)} */
    public static void nbgfx_set_transform_cached(int _cache, short _num) {
        long __functionAddress = Functions.set_transform_cached;
        invokeCV(_cache, _num, __functionAddress);
    }

    /** {@code void bgfx_set_transform_cached(uint32_t _cache, uint16_t _num)} */
    public static void bgfx_set_transform_cached(@NativeType("uint32_t") int _cache, @NativeType("uint16_t") int _num) {
        nbgfx_set_transform_cached(_cache, (short)_num);
    }

    // --- [ bgfx_alloc_transform ] ---

    /** {@code uint32_t bgfx_alloc_transform(bgfx_transform_t * _transform, uint16_t _num)} */
    public static int nbgfx_alloc_transform(long _transform, short _num) {
        long __functionAddress = Functions.alloc_transform;
        return invokePCI(_transform, _num, __functionAddress);
    }

    /** {@code uint32_t bgfx_alloc_transform(bgfx_transform_t * _transform, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_alloc_transform(@NativeType("bgfx_transform_t *") BGFXTransform _transform, @NativeType("uint16_t") int _num) {
        return nbgfx_alloc_transform(_transform.address(), (short)_num);
    }

    // --- [ bgfx_set_uniform ] ---

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void nbgfx_set_uniform(short _handle, long _value, short _num) {
        long __functionAddress = Functions.set_uniform;
        invokeCPCV(_handle, _value, _num, __functionAddress);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ByteBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") ShortBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") IntBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") LongBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") FloatBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") DoubleBuffer _value, @NativeType("uint16_t") int _num) {
        nbgfx_set_uniform(_handle, memAddress(_value), (short)_num);
    }

    // --- [ bgfx_set_index_buffer ] ---

    /** {@code void bgfx_set_index_buffer(bgfx_index_buffer_handle_t _handle, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void bgfx_set_index_buffer(@NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.set_index_buffer;
        invokeCV(_handle, _firstIndex, _numIndices, __functionAddress);
    }

    // --- [ bgfx_set_dynamic_index_buffer ] ---

    /** {@code void bgfx_set_dynamic_index_buffer(bgfx_dynamic_index_buffer_handle_t _handle, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void bgfx_set_dynamic_index_buffer(@NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        long __functionAddress = Functions.set_dynamic_index_buffer;
        invokeCV(_handle, _firstIndex, _numIndices, __functionAddress);
    }

    // --- [ bgfx_set_transient_index_buffer ] ---

    /** {@code void bgfx_set_transient_index_buffer(bgfx_transient_index_buffer_t const * _tib, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void nbgfx_set_transient_index_buffer(long _tib, int _firstIndex, int _numIndices) {
        long __functionAddress = Functions.set_transient_index_buffer;
        if (CHECKS) {
            BGFXTransientIndexBuffer.validate(_tib);
        }
        invokePV(_tib, _firstIndex, _numIndices, __functionAddress);
    }

    /** {@code void bgfx_set_transient_index_buffer(bgfx_transient_index_buffer_t const * _tib, uint32_t _firstIndex, uint32_t _numIndices)} */
    public static void bgfx_set_transient_index_buffer(@NativeType("bgfx_transient_index_buffer_t const *") BGFXTransientIndexBuffer _tib, @NativeType("uint32_t") int _firstIndex, @NativeType("uint32_t") int _numIndices) {
        nbgfx_set_transient_index_buffer(_tib.address(), _firstIndex, _numIndices);
    }

    // --- [ bgfx_set_vertex_buffer ] ---

    /** {@code void bgfx_set_vertex_buffer(uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void nbgfx_set_vertex_buffer(byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.set_vertex_buffer;
        invokeUCV(_stream, _handle, _startVertex, _numVertices, __functionAddress);
    }

    /** {@code void bgfx_set_vertex_buffer(uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void bgfx_set_vertex_buffer(@NativeType("uint8_t") int _stream, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_set_vertex_buffer((byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_set_vertex_buffer_with_layout ] ---

    /** {@code void bgfx_set_vertex_buffer_with_layout(uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void nbgfx_set_vertex_buffer_with_layout(byte _stream, short _handle, int _startVertex, int _numVertices, short _layoutHandle) {
        long __functionAddress = Functions.set_vertex_buffer_with_layout;
        invokeUCCV(_stream, _handle, _startVertex, _numVertices, _layoutHandle, __functionAddress);
    }

    /** {@code void bgfx_set_vertex_buffer_with_layout(uint8_t _stream, bgfx_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void bgfx_set_vertex_buffer_with_layout(@NativeType("uint8_t") int _stream, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_vertex_layout_handle_t") short _layoutHandle) {
        nbgfx_set_vertex_buffer_with_layout((byte)_stream, _handle, _startVertex, _numVertices, _layoutHandle);
    }

    // --- [ bgfx_set_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_set_dynamic_vertex_buffer(uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void nbgfx_set_dynamic_vertex_buffer(byte _stream, short _handle, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.set_dynamic_vertex_buffer;
        invokeUCV(_stream, _handle, _startVertex, _numVertices, __functionAddress);
    }

    /** {@code void bgfx_set_dynamic_vertex_buffer(uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void bgfx_set_dynamic_vertex_buffer(@NativeType("uint8_t") int _stream, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_set_dynamic_vertex_buffer((byte)_stream, _handle, _startVertex, _numVertices);
    }

    // --- [ bgfx_set_dynamic_vertex_buffer_with_layout ] ---

    /** {@code void bgfx_set_dynamic_vertex_buffer_with_layout(uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void nbgfx_set_dynamic_vertex_buffer_with_layout(byte _stream, short _handle, int _startVertex, int _numVertices, short _layoutHandle) {
        long __functionAddress = Functions.set_dynamic_vertex_buffer_with_layout;
        invokeUCCV(_stream, _handle, _startVertex, _numVertices, _layoutHandle, __functionAddress);
    }

    /** {@code void bgfx_set_dynamic_vertex_buffer_with_layout(uint8_t _stream, bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void bgfx_set_dynamic_vertex_buffer_with_layout(@NativeType("uint8_t") int _stream, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_vertex_layout_handle_t") short _layoutHandle) {
        nbgfx_set_dynamic_vertex_buffer_with_layout((byte)_stream, _handle, _startVertex, _numVertices, _layoutHandle);
    }

    // --- [ bgfx_set_transient_vertex_buffer ] ---

    /** {@code void bgfx_set_transient_vertex_buffer(uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void nbgfx_set_transient_vertex_buffer(byte _stream, long _tvb, int _startVertex, int _numVertices) {
        long __functionAddress = Functions.set_transient_vertex_buffer;
        if (CHECKS) {
            BGFXTransientVertexBuffer.validate(_tvb);
        }
        invokeUPV(_stream, _tvb, _startVertex, _numVertices, __functionAddress);
    }

    /** {@code void bgfx_set_transient_vertex_buffer(uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices)} */
    public static void bgfx_set_transient_vertex_buffer(@NativeType("uint8_t") int _stream, @NativeType("bgfx_transient_vertex_buffer_t const *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices) {
        nbgfx_set_transient_vertex_buffer((byte)_stream, _tvb.address(), _startVertex, _numVertices);
    }

    // --- [ bgfx_set_transient_vertex_buffer_with_layout ] ---

    /** {@code void bgfx_set_transient_vertex_buffer_with_layout(uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void nbgfx_set_transient_vertex_buffer_with_layout(byte _stream, long _tvb, int _startVertex, int _numVertices, short _layoutHandle) {
        long __functionAddress = Functions.set_transient_vertex_buffer_with_layout;
        if (CHECKS) {
            BGFXTransientVertexBuffer.validate(_tvb);
        }
        invokeUPCV(_stream, _tvb, _startVertex, _numVertices, _layoutHandle, __functionAddress);
    }

    /** {@code void bgfx_set_transient_vertex_buffer_with_layout(uint8_t _stream, bgfx_transient_vertex_buffer_t const * _tvb, uint32_t _startVertex, uint32_t _numVertices, bgfx_vertex_layout_handle_t _layoutHandle)} */
    public static void bgfx_set_transient_vertex_buffer_with_layout(@NativeType("uint8_t") int _stream, @NativeType("bgfx_transient_vertex_buffer_t const *") BGFXTransientVertexBuffer _tvb, @NativeType("uint32_t") int _startVertex, @NativeType("uint32_t") int _numVertices, @NativeType("bgfx_vertex_layout_handle_t") short _layoutHandle) {
        nbgfx_set_transient_vertex_buffer_with_layout((byte)_stream, _tvb.address(), _startVertex, _numVertices, _layoutHandle);
    }

    // --- [ bgfx_set_vertex_count ] ---

    /** {@code void bgfx_set_vertex_count(uint32_t _numVertices)} */
    public static void bgfx_set_vertex_count(@NativeType("uint32_t") int _numVertices) {
        long __functionAddress = Functions.set_vertex_count;
        invokeV(_numVertices, __functionAddress);
    }

    // --- [ bgfx_set_instance_data_buffer ] ---

    /** {@code void bgfx_set_instance_data_buffer(bgfx_instance_data_buffer_t const * _idb, uint32_t _start, uint32_t _num)} */
    public static void nbgfx_set_instance_data_buffer(long _idb, int _start, int _num) {
        long __functionAddress = Functions.set_instance_data_buffer;
        if (CHECKS) {
            BGFXInstanceDataBuffer.validate(_idb);
        }
        invokePV(_idb, _start, _num, __functionAddress);
    }

    /** {@code void bgfx_set_instance_data_buffer(bgfx_instance_data_buffer_t const * _idb, uint32_t _start, uint32_t _num)} */
    public static void bgfx_set_instance_data_buffer(@NativeType("bgfx_instance_data_buffer_t const *") BGFXInstanceDataBuffer _idb, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        nbgfx_set_instance_data_buffer(_idb.address(), _start, _num);
    }

    // --- [ bgfx_set_instance_data_from_vertex_buffer ] ---

    /** {@code void bgfx_set_instance_data_from_vertex_buffer(bgfx_vertex_buffer_handle_t _handle, uint32_t _start, uint32_t _num)} */
    public static void bgfx_set_instance_data_from_vertex_buffer(@NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.set_instance_data_from_vertex_buffer;
        invokeCV(_handle, _start, _num, __functionAddress);
    }

    // --- [ bgfx_set_instance_data_from_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_set_instance_data_from_dynamic_vertex_buffer(bgfx_dynamic_vertex_buffer_handle_t _handle, uint32_t _start, uint32_t _num)} */
    public static void bgfx_set_instance_data_from_dynamic_vertex_buffer(@NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num) {
        long __functionAddress = Functions.set_instance_data_from_dynamic_vertex_buffer;
        invokeCV(_handle, _start, _num, __functionAddress);
    }

    // --- [ bgfx_set_instance_count ] ---

    /** {@code void bgfx_set_instance_count(uint32_t _numInstances)} */
    public static void bgfx_set_instance_count(@NativeType("uint32_t") int _numInstances) {
        long __functionAddress = Functions.set_instance_count;
        invokeV(_numInstances, __functionAddress);
    }

    // --- [ bgfx_set_texture ] ---

    /** {@code void bgfx_set_texture(uint8_t _stage, bgfx_uniform_handle_t _sampler, bgfx_texture_handle_t _handle, uint32_t _flags)} */
    public static void nbgfx_set_texture(byte _stage, short _sampler, short _handle, int _flags) {
        long __functionAddress = Functions.set_texture;
        invokeUCCV(_stage, _sampler, _handle, _flags, __functionAddress);
    }

    /** {@code void bgfx_set_texture(uint8_t _stage, bgfx_uniform_handle_t _sampler, bgfx_texture_handle_t _handle, uint32_t _flags)} */
    public static void bgfx_set_texture(@NativeType("uint8_t") int _stage, @NativeType("bgfx_uniform_handle_t") short _sampler, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint32_t") int _flags) {
        nbgfx_set_texture((byte)_stage, _sampler, _handle, _flags);
    }

    // --- [ bgfx_touch ] ---

    /** {@code void bgfx_touch(bgfx_view_id_t _id)} */
    public static void nbgfx_touch(short _id) {
        long __functionAddress = Functions.touch;
        invokeCV(_id, __functionAddress);
    }

    /** {@code void bgfx_touch(bgfx_view_id_t _id)} */
    public static void bgfx_touch(@NativeType("bgfx_view_id_t") int _id) {
        nbgfx_touch((short)_id);
    }

    // --- [ bgfx_submit ] ---

    /** {@code void bgfx_submit(bgfx_view_id_t _id, bgfx_program_handle_t _program, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_submit(short _id, short _program, int _depth, byte _flags) {
        long __functionAddress = Functions.submit;
        invokeCCUV(_id, _program, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_submit(bgfx_view_id_t _id, bgfx_program_handle_t _program, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_submit(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_submit((short)_id, _program, _depth, (byte)_flags);
    }

    // --- [ bgfx_submit_occlusion_query ] ---

    /** {@code void bgfx_submit_occlusion_query(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_occlusion_query_handle_t _occlusionQuery, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_submit_occlusion_query(short _id, short _program, short _occlusionQuery, int _depth, byte _flags) {
        long __functionAddress = Functions.submit_occlusion_query;
        invokeCCCUV(_id, _program, _occlusionQuery, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_submit_occlusion_query(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_occlusion_query_handle_t _occlusionQuery, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_submit_occlusion_query(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_occlusion_query_handle_t") short _occlusionQuery, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_submit_occlusion_query((short)_id, _program, _occlusionQuery, _depth, (byte)_flags);
    }

    // --- [ bgfx_submit_indirect ] ---

    /** {@code void bgfx_submit_indirect(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_submit_indirect(short _id, short _program, short _indirectHandle, int _start, int _num, int _depth, byte _flags) {
        long __functionAddress = Functions.submit_indirect;
        invokeCCCUV(_id, _program, _indirectHandle, _start, _num, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_submit_indirect(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_submit_indirect(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_submit_indirect((short)_id, _program, _indirectHandle, _start, _num, _depth, (byte)_flags);
    }

    // --- [ bgfx_submit_indirect_count ] ---

    /** {@code void bgfx_submit_indirect_count(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, bgfx_index_buffer_handle_t _numHandle, uint32_t _numIndex, uint32_t _numMax, uint32_t _depth, uint8_t _flags)} */
    public static void nbgfx_submit_indirect_count(short _id, short _program, short _indirectHandle, int _start, short _numHandle, int _numIndex, int _numMax, int _depth, byte _flags) {
        long __functionAddress = Functions.submit_indirect_count;
        invokeCCCCUV(_id, _program, _indirectHandle, _start, _numHandle, _numIndex, _numMax, _depth, _flags, __functionAddress);
    }

    /** {@code void bgfx_submit_indirect_count(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, bgfx_index_buffer_handle_t _numHandle, uint32_t _numIndex, uint32_t _numMax, uint32_t _depth, uint8_t _flags)} */
    public static void bgfx_submit_indirect_count(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint32_t") int _start, @NativeType("bgfx_index_buffer_handle_t") short _numHandle, @NativeType("uint32_t") int _numIndex, @NativeType("uint32_t") int _numMax, @NativeType("uint32_t") int _depth, @NativeType("uint8_t") int _flags) {
        nbgfx_submit_indirect_count((short)_id, _program, _indirectHandle, _start, _numHandle, _numIndex, _numMax, _depth, (byte)_flags);
    }

    // --- [ bgfx_set_compute_index_buffer ] ---

    /** {@code void bgfx_set_compute_index_buffer(uint8_t _stage, bgfx_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_set_compute_index_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_index_buffer;
        invokeUCV(_stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_set_compute_index_buffer(uint8_t _stage, bgfx_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_set_compute_index_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_index_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_vertex_buffer ] ---

    /** {@code void bgfx_set_compute_vertex_buffer(uint8_t _stage, bgfx_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_set_compute_vertex_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_vertex_buffer;
        invokeUCV(_stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_set_compute_vertex_buffer(uint8_t _stage, bgfx_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_set_compute_vertex_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_vertex_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_dynamic_index_buffer ] ---

    /** {@code void bgfx_set_compute_dynamic_index_buffer(uint8_t _stage, bgfx_dynamic_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_set_compute_dynamic_index_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_dynamic_index_buffer;
        invokeUCV(_stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_set_compute_dynamic_index_buffer(uint8_t _stage, bgfx_dynamic_index_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_set_compute_dynamic_index_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_index_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_dynamic_index_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_dynamic_vertex_buffer ] ---

    /** {@code void bgfx_set_compute_dynamic_vertex_buffer(uint8_t _stage, bgfx_dynamic_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_set_compute_dynamic_vertex_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_dynamic_vertex_buffer;
        invokeUCV(_stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_set_compute_dynamic_vertex_buffer(uint8_t _stage, bgfx_dynamic_vertex_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_set_compute_dynamic_vertex_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_dynamic_vertex_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_dynamic_vertex_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_compute_indirect_buffer ] ---

    /** {@code void bgfx_set_compute_indirect_buffer(uint8_t _stage, bgfx_indirect_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void nbgfx_set_compute_indirect_buffer(byte _stage, short _handle, int _access) {
        long __functionAddress = Functions.set_compute_indirect_buffer;
        invokeUCV(_stage, _handle, _access, __functionAddress);
    }

    /** {@code void bgfx_set_compute_indirect_buffer(uint8_t _stage, bgfx_indirect_buffer_handle_t _handle, bgfx_access_t _access)} */
    public static void bgfx_set_compute_indirect_buffer(@NativeType("uint8_t") int _stage, @NativeType("bgfx_indirect_buffer_handle_t") short _handle, @NativeType("bgfx_access_t") int _access) {
        nbgfx_set_compute_indirect_buffer((byte)_stage, _handle, _access);
    }

    // --- [ bgfx_set_image ] ---

    /** {@code void bgfx_set_image(uint8_t _stage, bgfx_texture_handle_t _handle, uint8_t _mip, bgfx_access_t _access, bgfx_texture_format_t _format)} */
    public static void nbgfx_set_image(byte _stage, short _handle, byte _mip, int _access, int _format) {
        long __functionAddress = Functions.set_image;
        invokeUCUV(_stage, _handle, _mip, _access, _format, __functionAddress);
    }

    /** {@code void bgfx_set_image(uint8_t _stage, bgfx_texture_handle_t _handle, uint8_t _mip, bgfx_access_t _access, bgfx_texture_format_t _format)} */
    public static void bgfx_set_image(@NativeType("uint8_t") int _stage, @NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint8_t") int _mip, @NativeType("bgfx_access_t") int _access, @NativeType("bgfx_texture_format_t") int _format) {
        nbgfx_set_image((byte)_stage, _handle, (byte)_mip, _access, _format);
    }

    // --- [ bgfx_dispatch ] ---

    /** {@code void bgfx_dispatch(bgfx_view_id_t _id, bgfx_program_handle_t _program, uint32_t _numX, uint32_t _numY, uint32_t _numZ, uint8_t _flags)} */
    public static void nbgfx_dispatch(short _id, short _program, int _numX, int _numY, int _numZ, byte _flags) {
        long __functionAddress = Functions.dispatch;
        invokeCCUV(_id, _program, _numX, _numY, _numZ, _flags, __functionAddress);
    }

    /** {@code void bgfx_dispatch(bgfx_view_id_t _id, bgfx_program_handle_t _program, uint32_t _numX, uint32_t _numY, uint32_t _numZ, uint8_t _flags)} */
    public static void bgfx_dispatch(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("uint32_t") int _numX, @NativeType("uint32_t") int _numY, @NativeType("uint32_t") int _numZ, @NativeType("uint8_t") int _flags) {
        nbgfx_dispatch((short)_id, _program, _numX, _numY, _numZ, (byte)_flags);
    }

    // --- [ bgfx_dispatch_indirect ] ---

    /** {@code void bgfx_dispatch_indirect(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint8_t _flags)} */
    public static void nbgfx_dispatch_indirect(short _id, short _program, short _indirectHandle, int _start, int _num, byte _flags) {
        long __functionAddress = Functions.dispatch_indirect;
        invokeCCCUV(_id, _program, _indirectHandle, _start, _num, _flags, __functionAddress);
    }

    /** {@code void bgfx_dispatch_indirect(bgfx_view_id_t _id, bgfx_program_handle_t _program, bgfx_indirect_buffer_handle_t _indirectHandle, uint32_t _start, uint32_t _num, uint8_t _flags)} */
    public static void bgfx_dispatch_indirect(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_program_handle_t") short _program, @NativeType("bgfx_indirect_buffer_handle_t") short _indirectHandle, @NativeType("uint32_t") int _start, @NativeType("uint32_t") int _num, @NativeType("uint8_t") int _flags) {
        nbgfx_dispatch_indirect((short)_id, _program, _indirectHandle, _start, _num, (byte)_flags);
    }

    // --- [ bgfx_discard ] ---

    /** {@code void bgfx_discard(uint8_t _flags)} */
    public static void nbgfx_discard(byte _flags) {
        long __functionAddress = Functions.discard;
        invokeUV(_flags, __functionAddress);
    }

    /** {@code void bgfx_discard(uint8_t _flags)} */
    public static void bgfx_discard(@NativeType("uint8_t") int _flags) {
        nbgfx_discard((byte)_flags);
    }

    // --- [ bgfx_blit ] ---

    /** {@code void bgfx_blit(bgfx_view_id_t _id, bgfx_texture_handle_t _dst, uint8_t _dstMip, uint16_t _dstX, uint16_t _dstY, uint16_t _dstZ, bgfx_texture_handle_t _src, uint8_t _srcMip, uint16_t _srcX, uint16_t _srcY, uint16_t _srcZ, uint16_t _width, uint16_t _height, uint16_t _depth)} */
    public static void nbgfx_blit(short _id, short _dst, byte _dstMip, short _dstX, short _dstY, short _dstZ, short _src, byte _srcMip, short _srcX, short _srcY, short _srcZ, short _width, short _height, short _depth) {
        long __functionAddress = Functions.blit;
        invokeCCUCCCCUCCCCCCV(_id, _dst, _dstMip, _dstX, _dstY, _dstZ, _src, _srcMip, _srcX, _srcY, _srcZ, _width, _height, _depth, __functionAddress);
    }

    /** {@code void bgfx_blit(bgfx_view_id_t _id, bgfx_texture_handle_t _dst, uint8_t _dstMip, uint16_t _dstX, uint16_t _dstY, uint16_t _dstZ, bgfx_texture_handle_t _src, uint8_t _srcMip, uint16_t _srcX, uint16_t _srcY, uint16_t _srcZ, uint16_t _width, uint16_t _height, uint16_t _depth)} */
    public static void bgfx_blit(@NativeType("bgfx_view_id_t") int _id, @NativeType("bgfx_texture_handle_t") short _dst, @NativeType("uint8_t") int _dstMip, @NativeType("uint16_t") int _dstX, @NativeType("uint16_t") int _dstY, @NativeType("uint16_t") int _dstZ, @NativeType("bgfx_texture_handle_t") short _src, @NativeType("uint8_t") int _srcMip, @NativeType("uint16_t") int _srcX, @NativeType("uint16_t") int _srcY, @NativeType("uint16_t") int _srcZ, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint16_t") int _depth) {
        nbgfx_blit((short)_id, _dst, (byte)_dstMip, (short)_dstX, (short)_dstY, (short)_dstZ, _src, (byte)_srcMip, (short)_srcX, (short)_srcY, (short)_srcZ, (short)_width, (short)_height, (short)_depth);
    }

    // --- [ BGFX_STATE_ALPHA_REF ] ---

    /** {@code uint64_t BGFX_STATE_ALPHA_REF(uint64_t _ref)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_ALPHA_REF(@NativeType("uint64_t") long _ref) {
        return (_ref << BGFX_STATE_ALPHA_REF_SHIFT) & BGFX_STATE_ALPHA_REF_MASK;
    }

    // --- [ BGFX_STATE_POINT_SIZE ] ---

    /** {@code uint64_t BGFX_STATE_POINT_SIZE(uint64_t _size)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_POINT_SIZE(@NativeType("uint64_t") long _size) {
        return (_size << BGFX_STATE_POINT_SIZE_SHIFT) & BGFX_STATE_POINT_SIZE_MASK;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_SEPARATE ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_SEPARATE(uint64_t _srcRGB, uint64_t _dstRGB, uint64_t _srcA, uint64_t _dstA)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_SEPARATE(@NativeType("uint64_t") long _srcRGB, @NativeType("uint64_t") long _dstRGB, @NativeType("uint64_t") long _srcA, @NativeType("uint64_t") long _dstA) {
        return ((_srcRGB | (_dstRGB << 4))) | ((_srcA | (_dstA << 4)) << 8);
    }

    // --- [ BGFX_STATE_BLEND_EQUATION_SEPARATE ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_EQUATION_SEPARATE(uint64_t _rgb, uint64_t _a)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_EQUATION_SEPARATE(@NativeType("uint64_t") long _rgb, @NativeType("uint64_t") long _a) {
        return _rgb | (_a << 3);
    }

    // --- [ BGFX_STATE_BLEND_FUNC ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC(uint64_t _src, uint64_t _dst)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_SEPARATE(_src, _dst, _src, _dst);
    }

    // --- [ BGFX_STATE_BLEND_EQUATION ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_EQUATION(uint64_t _equation)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_EQUATION(@NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_EQUATION_SEPARATE(_equation, _equation);
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_x ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_x(uint64_t _src, uint64_t _dst)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_x(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return (_src >> BGFX_STATE_BLEND_SHIFT) | ((_dst >> BGFX_STATE_BLEND_SHIFT) << 4);
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_xE ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_xE(uint64_t _src, uint64_t _dst, uint64_t _equation)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_xE(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) | ((_equation >> BGFX_STATE_BLEND_EQUATION_SHIFT) << 8);
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_1 ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_1(uint64_t _src, uint64_t _dst)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_1(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 0;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_2 ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_2(uint64_t _src, uint64_t _dst)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_2(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 11;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_3 ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_3(uint64_t _src, uint64_t _dst)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_3(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst) {
        return BGFX_STATE_BLEND_FUNC_RT_x(_src, _dst) << 22;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_1E ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_1E(uint64_t _src, uint64_t _dst, uint64_t _equation)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_1E(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 0;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_2E ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_2E(uint64_t _src, uint64_t _dst, uint64_t _equation)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_2E(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 11;
    }

    // --- [ BGFX_STATE_BLEND_FUNC_RT_3E ] ---

    /** {@code uint64_t BGFX_STATE_BLEND_FUNC_RT_3E(uint64_t _src, uint64_t _dst, uint64_t _equation)} */
    @NativeType("uint64_t")
    public static long BGFX_STATE_BLEND_FUNC_RT_3E(@NativeType("uint64_t") long _src, @NativeType("uint64_t") long _dst, @NativeType("uint64_t") long _equation) {
        return BGFX_STATE_BLEND_FUNC_RT_xE(_src, _dst, _equation) << 22;
    }

    // --- [ BGFX_STENCIL_FUNC_REF ] ---

    /** {@code uint32_t BGFX_STENCIL_FUNC_REF(uint32_t _ref)} */
    @NativeType("uint32_t")
    public static int BGFX_STENCIL_FUNC_REF(@NativeType("uint32_t") int _ref) {
        return (_ref << BGFX_STENCIL_FUNC_REF_SHIFT) & BGFX_STENCIL_FUNC_REF_MASK;
    }

    // --- [ BGFX_STENCIL_FUNC_RMASK ] ---

    /** {@code uint32_t BGFX_STENCIL_FUNC_RMASK(uint32_t _mask)} */
    @NativeType("uint32_t")
    public static int BGFX_STENCIL_FUNC_RMASK(@NativeType("uint32_t") int _mask) {
        return (_mask << BGFX_STENCIL_FUNC_RMASK_SHIFT) & BGFX_STENCIL_FUNC_RMASK_MASK;
    }

    // --- [ BGFX_SAMPLER_BORDER_COLOR ] ---

    /** {@code uint32_t BGFX_SAMPLER_BORDER_COLOR(uint32_t _index)} */
    @NativeType("uint32_t")
    public static int BGFX_SAMPLER_BORDER_COLOR(@NativeType("uint32_t") int _index) {
        return (_index << BGFX_SAMPLER_BORDER_COLOR_SHIFT) & BGFX_SAMPLER_BORDER_COLOR_MASK;
    }

    // --- [ BGFX_HANDLE_IS_VALID ] ---

    /** {@code bool BGFX_HANDLE_IS_VALID(uint16_t h)} */
    @NativeType("bool")
    public static boolean BGFX_HANDLE_IS_VALID(@NativeType("uint16_t") short h) {
        return Short.toUnsignedInt(h) != 0xFFFF;
    }

    /** {@code void bgfx_vertex_layout_decode(bgfx_vertex_layout_t const * _this, bgfx_attrib_t _attrib, uint8_t * _num, bgfx_attrib_type_t * _type, bool * _normalized, bool * _asInt)} */
    public static void bgfx_vertex_layout_decode(@NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _this, @NativeType("bgfx_attrib_t") int _attrib, @NativeType("uint8_t *") ByteBuffer _num, @NativeType("bgfx_attrib_type_t *") int[] _type, @NativeType("bool *") ByteBuffer _normalized, @NativeType("bool *") ByteBuffer _asInt) {
        long __functionAddress = Functions.vertex_layout_decode;
        if (CHECKS) {
            check(_num, 1);
            check(_type, 1);
            check(_normalized, 1);
            check(_asInt, 1);
        }
        invokePPPPPV(_this.address(), _attrib, memAddress(_num), _type, memAddress(_normalized), memAddress(_asInt), __functionAddress);
    }

    /** {@code void bgfx_vertex_pack(float const * _input, bool _inputNormalized, bgfx_attrib_t _attr, bgfx_vertex_layout_t const * _layout, void * _data, uint32_t _index)} */
    public static void bgfx_vertex_pack(@NativeType("float const *") float[] _input, @NativeType("bool") boolean _inputNormalized, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        long __functionAddress = Functions.vertex_pack;
        if (CHECKS) {
            check(_input, 4);
        }
        invokePPPV(_input, _inputNormalized, _attr, _layout.address(), memAddress(_data), _index, __functionAddress);
    }

    /** {@code void bgfx_vertex_unpack(float * _output, bgfx_attrib_t _attr, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _index)} */
    public static void bgfx_vertex_unpack(@NativeType("float *") float[] _output, @NativeType("bgfx_attrib_t") int _attr, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("uint32_t") int _index) {
        long __functionAddress = Functions.vertex_unpack;
        if (CHECKS) {
            check(_output, 4);
        }
        invokePPPV(_output, _attr, _layout.address(), memAddress(_data), _index, __functionAddress);
    }

    /** {@code uint32_t bgfx_weld_vertices(void * _output, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _num, bool _index32, float _epsilon)} */
    @NativeType("uint32_t")
    public static int bgfx_weld_vertices(@NativeType("void *") short[] _output, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("bool") boolean _index32, float _epsilon) {
        long __functionAddress = Functions.weld_vertices;
        return invokePPPI(_output, _layout.address(), memAddress(_data), _output.length, _index32, _epsilon, __functionAddress);
    }

    /** {@code uint32_t bgfx_weld_vertices(void * _output, bgfx_vertex_layout_t const * _layout, void const * _data, uint32_t _num, bool _index32, float _epsilon)} */
    @NativeType("uint32_t")
    public static int bgfx_weld_vertices(@NativeType("void *") int[] _output, @NativeType("bgfx_vertex_layout_t const *") BGFXVertexLayout _layout, @NativeType("void const *") ByteBuffer _data, @NativeType("bool") boolean _index32, float _epsilon) {
        long __functionAddress = Functions.weld_vertices;
        return invokePPPI(_output, _layout.address(), memAddress(_data), _output.length, _index32, _epsilon, __functionAddress);
    }

    /** {@code uint32_t bgfx_topology_convert(bgfx_topology_convert_t _conversion, void * _dst, uint32_t _dstSize, void const * _indices, uint32_t _numIndices, bool _index32)} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @NativeType("void *") short @Nullable [] _dst, @NativeType("void const *") short[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_convert;
        return invokePPI(_conversion, _dst, lengthSafe(_dst) << 1, _indices, _indices.length, _index32, __functionAddress);
    }

    /** {@code uint32_t bgfx_topology_convert(bgfx_topology_convert_t _conversion, void * _dst, uint32_t _dstSize, void const * _indices, uint32_t _numIndices, bool _index32)} */
    @NativeType("uint32_t")
    public static int bgfx_topology_convert(@NativeType("bgfx_topology_convert_t") int _conversion, @NativeType("void *") int @Nullable [] _dst, @NativeType("void const *") int[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_convert;
        return invokePPI(_conversion, _dst, lengthSafe(_dst) << 2, _indices, _indices.length, _index32, __functionAddress);
    }

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") ByteBuffer _dst, @NativeType("float const *") float[] _dir, @NativeType("float const *") float[] _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") ByteBuffer _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        invokePPPPPV(_sort, memAddress(_dst), _dst.remaining(), _dir, _pos, memAddress(_vertices), _stride, memAddress(_indices), _indices.remaining() >> (_index32 ? 2 : 1), _index32, __functionAddress);
    }

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") short[] _dst, @NativeType("float const *") float[] _dir, @NativeType("float const *") float[] _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") short[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        invokePPPPPV(_sort, _dst, _dst.length << 1, _dir, _pos, memAddress(_vertices), _stride, _indices, _indices.length, _index32, __functionAddress);
    }

    /** {@code void bgfx_topology_sort_tri_list(bgfx_topology_sort_t _sort, void * _dst, uint32_t _dstSize, float const * _dir, float const * _pos, void const * _vertices, uint32_t _stride, void const * _indices, uint32_t _numIndices, bool _index32)} */
    public static void bgfx_topology_sort_tri_list(@NativeType("bgfx_topology_sort_t") int _sort, @NativeType("void *") int[] _dst, @NativeType("float const *") float[] _dir, @NativeType("float const *") float[] _pos, @NativeType("void const *") ByteBuffer _vertices, @NativeType("uint32_t") int _stride, @NativeType("void const *") int[] _indices, @NativeType("bool") boolean _index32) {
        long __functionAddress = Functions.topology_sort_tri_list;
        if (CHECKS) {
            check(_dir, 3);
            check(_pos, 3);
        }
        invokePPPPPV(_sort, _dst, _dst.length << 2, _dir, _pos, memAddress(_vertices), _stride, _indices, _indices.length, _index32, __functionAddress);
    }

    /** {@code uint8_t bgfx_get_supported_renderers(uint8_t _max, bgfx_renderer_type_t * _enum)} */
    @NativeType("uint8_t")
    public static byte bgfx_get_supported_renderers(@NativeType("bgfx_renderer_type_t *") int[] _enum) {
        long __functionAddress = Functions.get_supported_renderers;
        return invokeUPU((byte)_enum.length, _enum, __functionAddress);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") short[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(_data, _data.length << 1, __functionAddress);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") int[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(_data, _data.length << 2, __functionAddress);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") long[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(_data, _data.length << 3, __functionAddress);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") float[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(_data, _data.length << 2, __functionAddress);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code bgfx_memory_t const * bgfx_copy(void const * _data, uint32_t _size)} */
    @NativeType("bgfx_memory_t const *")
    public static @Nullable BGFXMemory bgfx_copy(@NativeType("void const *") double[] _data) {
        long __functionAddress = Functions.copy;
        long __result = invokePP(_data, _data.length << 3, __functionAddress);
        return BGFXMemory.createSafe(__result);
    }

    /** {@code uint16_t bgfx_get_shader_uniforms(bgfx_shader_handle_t _handle, bgfx_uniform_handle_t * _uniforms, uint16_t _max)} */
    @NativeType("uint16_t")
    public static short bgfx_get_shader_uniforms(@NativeType("bgfx_shader_handle_t") short _handle, @NativeType("bgfx_uniform_handle_t *") short[] _uniforms) {
        long __functionAddress = Functions.get_shader_uniforms;
        return invokeCPCC(_handle, _uniforms, (short)_uniforms.length, __functionAddress);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") short[] _data, @NativeType("uint8_t") int _mip) {
        long __functionAddress = Functions.read_texture;
        return invokeCPUI(_handle, _data, (byte)_mip, __functionAddress);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") int[] _data, @NativeType("uint8_t") int _mip) {
        long __functionAddress = Functions.read_texture;
        return invokeCPUI(_handle, _data, (byte)_mip, __functionAddress);
    }

    /** {@code uint32_t bgfx_read_texture(bgfx_texture_handle_t _handle, void * _data, uint8_t _mip)} */
    @NativeType("uint32_t")
    public static int bgfx_read_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("void *") float[] _data, @NativeType("uint8_t") int _mip) {
        long __functionAddress = Functions.read_texture;
        return invokeCPUI(_handle, _data, (byte)_mip, __functionAddress);
    }

    /** {@code bgfx_frame_buffer_handle_t bgfx_create_frame_buffer_from_handles(uint8_t _num, bgfx_texture_handle_t const * _handles, bool _destroyTextures)} */
    @NativeType("bgfx_frame_buffer_handle_t")
    public static short bgfx_create_frame_buffer_from_handles(@NativeType("bgfx_texture_handle_t const *") short[] _handles, @NativeType("bool") boolean _destroyTextures) {
        long __functionAddress = Functions.create_frame_buffer_from_handles;
        return invokeUPC((byte)_handles.length, _handles, _destroyTextures, __functionAddress);
    }

    /** {@code bgfx_occlusion_query_result_t bgfx_get_result(bgfx_occlusion_query_handle_t _handle, int32_t * _result)} */
    @NativeType("bgfx_occlusion_query_result_t")
    public static int bgfx_get_result(@NativeType("bgfx_occlusion_query_handle_t") short _handle, @NativeType("int32_t *") int @Nullable [] _result) {
        long __functionAddress = Functions.get_result;
        if (CHECKS) {
            checkSafe(_result, 1);
        }
        return invokeCPI(_handle, _result, __functionAddress);
    }

    /** {@code void bgfx_set_palette_color(uint8_t _index, float const * _rgba)} */
    public static void bgfx_set_palette_color(@NativeType("uint8_t") int _index, @NativeType("float const *") float[] _rgba) {
        long __functionAddress = Functions.set_palette_color;
        if (CHECKS) {
            check(_rgba, 4);
        }
        invokeUPV((byte)_index, _rgba, __functionAddress);
    }

    /** {@code void bgfx_set_view_transform(bgfx_view_id_t _id, void const * _view, void const * _proj)} */
    public static void bgfx_set_view_transform(@NativeType("bgfx_view_id_t") int _id, @NativeType("void const *") float @Nullable [] _view, @NativeType("void const *") float @Nullable [] _proj) {
        long __functionAddress = Functions.set_view_transform;
        if (CHECKS) {
            checkSafe(_view, 64 >> 2);
            checkSafe(_proj, 64 >> 2);
        }
        invokeCPPV((short)_id, _view, _proj, __functionAddress);
    }

    /** {@code void bgfx_set_view_order(bgfx_view_id_t _id, uint16_t _num, bgfx_view_id_t const * _order)} */
    public static void bgfx_set_view_order(@NativeType("bgfx_view_id_t") int _id, @NativeType("uint16_t") int _num, @NativeType("bgfx_view_id_t const *") short @Nullable [] _order) {
        long __functionAddress = Functions.set_view_order;
        if (CHECKS) {
            checkSafe(_order, _num);
        }
        invokeCCPV((short)_id, (short)_num, _order, __functionAddress);
    }

    /** {@code uint32_t bgfx_encoder_set_transform(bgfx_encoder_t * _this, void const * _mtx, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_encoder_set_transform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("void const *") float[] _mtx) {
        long __functionAddress = Functions.encoder_set_transform;
        if (CHECKS) {
            check(_this);
        }
        return invokePPCI(_this, _mtx, (short)(_mtx.length >> 4), __functionAddress);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") short[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_this);
        }
        invokePCPCV(_this, _handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") int[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_this);
        }
        invokePCPCV(_this, _handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") long[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_this);
        }
        invokePCPCV(_this, _handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") float[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_this);
        }
        invokePCPCV(_this, _handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_encoder_set_uniform(bgfx_encoder_t * _this, bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_encoder_set_uniform(@NativeType("bgfx_encoder_t *") long _this, @NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") double[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.encoder_set_uniform;
        if (CHECKS) {
            check(_this);
        }
        invokePCPCV(_this, _handle, _value, (short)_num, __functionAddress);
    }

    /** {@code uint32_t bgfx_set_transform(void const * _mtx, uint16_t _num)} */
    @NativeType("uint32_t")
    public static int bgfx_set_transform(@NativeType("void const *") float[] _mtx) {
        long __functionAddress = Functions.set_transform;
        return invokePCI(_mtx, (short)(_mtx.length >> 4), __functionAddress);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") short[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokeCPCV(_handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") int[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokeCPCV(_handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") long[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokeCPCV(_handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") float[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokeCPCV(_handle, _value, (short)_num, __functionAddress);
    }

    /** {@code void bgfx_set_uniform(bgfx_uniform_handle_t _handle, void const * _value, uint16_t _num)} */
    public static void bgfx_set_uniform(@NativeType("bgfx_uniform_handle_t") short _handle, @NativeType("void const *") double[] _value, @NativeType("uint16_t") int _num) {
        long __functionAddress = Functions.set_uniform;
        invokeCPCV(_handle, _value, (short)_num, __functionAddress);
    }

}