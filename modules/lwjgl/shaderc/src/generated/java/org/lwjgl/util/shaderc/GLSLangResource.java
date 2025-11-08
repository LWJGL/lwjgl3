/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct glslang_resource_t {
 *     int max_lights;
 *     int max_clip_planes;
 *     int max_texture_units;
 *     int max_texture_coords;
 *     int max_vertex_attribs;
 *     int max_vertex_uniform_components;
 *     int max_varying_floats;
 *     int max_vertex_texture_image_units;
 *     int max_combined_texture_image_units;
 *     int max_texture_image_units;
 *     int max_fragment_uniform_components;
 *     int max_draw_buffers;
 *     int max_vertex_uniform_vectors;
 *     int max_varying_vectors;
 *     int max_fragment_uniform_vectors;
 *     int max_vertex_output_vectors;
 *     int max_fragment_input_vectors;
 *     int min_program_texel_offset;
 *     int max_program_texel_offset;
 *     int max_clip_distances;
 *     int max_compute_work_group_count_x;
 *     int max_compute_work_group_count_y;
 *     int max_compute_work_group_count_z;
 *     int max_compute_work_group_size_x;
 *     int max_compute_work_group_size_y;
 *     int max_compute_work_group_size_z;
 *     int max_compute_uniform_components;
 *     int max_compute_texture_image_units;
 *     int max_compute_image_uniforms;
 *     int max_compute_atomic_counters;
 *     int max_compute_atomic_counter_buffers;
 *     int max_varying_components;
 *     int max_vertex_output_components;
 *     int max_geometry_input_components;
 *     int max_geometry_output_components;
 *     int max_fragment_input_components;
 *     int max_image_units;
 *     int max_combined_image_units_and_fragment_outputs;
 *     int max_combined_shader_output_resources;
 *     int max_image_samples;
 *     int max_vertex_image_uniforms;
 *     int max_tess_control_image_uniforms;
 *     int max_tess_evaluation_image_uniforms;
 *     int max_geometry_image_uniforms;
 *     int max_fragment_image_uniforms;
 *     int max_combined_image_uniforms;
 *     int max_geometry_texture_image_units;
 *     int max_geometry_output_vertices;
 *     int max_geometry_total_output_components;
 *     int max_geometry_uniform_components;
 *     int max_geometry_varying_components;
 *     int max_tess_control_input_components;
 *     int max_tess_control_output_components;
 *     int max_tess_control_texture_image_units;
 *     int max_tess_control_uniform_components;
 *     int max_tess_control_total_output_components;
 *     int max_tess_evaluation_input_components;
 *     int max_tess_evaluation_output_components;
 *     int max_tess_evaluation_texture_image_units;
 *     int max_tess_evaluation_uniform_components;
 *     int max_tess_patch_components;
 *     int max_patch_vertices;
 *     int max_tess_gen_level;
 *     int max_viewports;
 *     int max_vertex_atomic_counters;
 *     int max_tess_control_atomic_counters;
 *     int max_tess_evaluation_atomic_counters;
 *     int max_geometry_atomic_counters;
 *     int max_fragment_atomic_counters;
 *     int max_combined_atomic_counters;
 *     int max_atomic_counter_bindings;
 *     int max_vertex_atomic_counter_buffers;
 *     int max_tess_control_atomic_counter_buffers;
 *     int max_tess_evaluation_atomic_counter_buffers;
 *     int max_geometry_atomic_counter_buffers;
 *     int max_fragment_atomic_counter_buffers;
 *     int max_combined_atomic_counter_buffers;
 *     int max_atomic_counter_buffer_size;
 *     int max_transform_feedback_buffers;
 *     int max_transform_feedback_interleaved_components;
 *     int max_cull_distances;
 *     int max_combined_clip_and_cull_distances;
 *     int max_samples;
 *     int max_mesh_output_vertices_nv;
 *     int max_mesh_output_primitives_nv;
 *     int max_mesh_work_group_size_x_nv;
 *     int max_mesh_work_group_size_y_nv;
 *     int max_mesh_work_group_size_z_nv;
 *     int max_task_work_group_size_x_nv;
 *     int max_task_work_group_size_y_nv;
 *     int max_task_work_group_size_z_nv;
 *     int max_mesh_view_count_nv;
 *     int max_mesh_output_vertices_ext;
 *     int max_mesh_output_primitives_ext;
 *     int max_mesh_work_group_size_x_ext;
 *     int max_mesh_work_group_size_y_ext;
 *     int max_mesh_work_group_size_z_ext;
 *     int max_task_work_group_size_x_ext;
 *     int max_task_work_group_size_y_ext;
 *     int max_task_work_group_size_z_ext;
 *     int max_mesh_view_count_ext;
 *     int max_dual_source_draw_buffers_ext;
 *     {@link GLSLangLimits glslang_limits_t} limits;
 * }</code></pre>
 */
@NativeType("struct glslang_resource_t")
public class GLSLangResource extends Struct<GLSLangResource> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAX_LIGHTS,
        MAX_CLIP_PLANES,
        MAX_TEXTURE_UNITS,
        MAX_TEXTURE_COORDS,
        MAX_VERTEX_ATTRIBS,
        MAX_VERTEX_UNIFORM_COMPONENTS,
        MAX_VARYING_FLOATS,
        MAX_VERTEX_TEXTURE_IMAGE_UNITS,
        MAX_COMBINED_TEXTURE_IMAGE_UNITS,
        MAX_TEXTURE_IMAGE_UNITS,
        MAX_FRAGMENT_UNIFORM_COMPONENTS,
        MAX_DRAW_BUFFERS,
        MAX_VERTEX_UNIFORM_VECTORS,
        MAX_VARYING_VECTORS,
        MAX_FRAGMENT_UNIFORM_VECTORS,
        MAX_VERTEX_OUTPUT_VECTORS,
        MAX_FRAGMENT_INPUT_VECTORS,
        MIN_PROGRAM_TEXEL_OFFSET,
        MAX_PROGRAM_TEXEL_OFFSET,
        MAX_CLIP_DISTANCES,
        MAX_COMPUTE_WORK_GROUP_COUNT_X,
        MAX_COMPUTE_WORK_GROUP_COUNT_Y,
        MAX_COMPUTE_WORK_GROUP_COUNT_Z,
        MAX_COMPUTE_WORK_GROUP_SIZE_X,
        MAX_COMPUTE_WORK_GROUP_SIZE_Y,
        MAX_COMPUTE_WORK_GROUP_SIZE_Z,
        MAX_COMPUTE_UNIFORM_COMPONENTS,
        MAX_COMPUTE_TEXTURE_IMAGE_UNITS,
        MAX_COMPUTE_IMAGE_UNIFORMS,
        MAX_COMPUTE_ATOMIC_COUNTERS,
        MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS,
        MAX_VARYING_COMPONENTS,
        MAX_VERTEX_OUTPUT_COMPONENTS,
        MAX_GEOMETRY_INPUT_COMPONENTS,
        MAX_GEOMETRY_OUTPUT_COMPONENTS,
        MAX_FRAGMENT_INPUT_COMPONENTS,
        MAX_IMAGE_UNITS,
        MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS,
        MAX_COMBINED_SHADER_OUTPUT_RESOURCES,
        MAX_IMAGE_SAMPLES,
        MAX_VERTEX_IMAGE_UNIFORMS,
        MAX_TESS_CONTROL_IMAGE_UNIFORMS,
        MAX_TESS_EVALUATION_IMAGE_UNIFORMS,
        MAX_GEOMETRY_IMAGE_UNIFORMS,
        MAX_FRAGMENT_IMAGE_UNIFORMS,
        MAX_COMBINED_IMAGE_UNIFORMS,
        MAX_GEOMETRY_TEXTURE_IMAGE_UNITS,
        MAX_GEOMETRY_OUTPUT_VERTICES,
        MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS,
        MAX_GEOMETRY_UNIFORM_COMPONENTS,
        MAX_GEOMETRY_VARYING_COMPONENTS,
        MAX_TESS_CONTROL_INPUT_COMPONENTS,
        MAX_TESS_CONTROL_OUTPUT_COMPONENTS,
        MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS,
        MAX_TESS_CONTROL_UNIFORM_COMPONENTS,
        MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS,
        MAX_TESS_EVALUATION_INPUT_COMPONENTS,
        MAX_TESS_EVALUATION_OUTPUT_COMPONENTS,
        MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS,
        MAX_TESS_EVALUATION_UNIFORM_COMPONENTS,
        MAX_TESS_PATCH_COMPONENTS,
        MAX_PATCH_VERTICES,
        MAX_TESS_GEN_LEVEL,
        MAX_VIEWPORTS,
        MAX_VERTEX_ATOMIC_COUNTERS,
        MAX_TESS_CONTROL_ATOMIC_COUNTERS,
        MAX_TESS_EVALUATION_ATOMIC_COUNTERS,
        MAX_GEOMETRY_ATOMIC_COUNTERS,
        MAX_FRAGMENT_ATOMIC_COUNTERS,
        MAX_COMBINED_ATOMIC_COUNTERS,
        MAX_ATOMIC_COUNTER_BINDINGS,
        MAX_VERTEX_ATOMIC_COUNTER_BUFFERS,
        MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS,
        MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS,
        MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS,
        MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS,
        MAX_COMBINED_ATOMIC_COUNTER_BUFFERS,
        MAX_ATOMIC_COUNTER_BUFFER_SIZE,
        MAX_TRANSFORM_FEEDBACK_BUFFERS,
        MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS,
        MAX_CULL_DISTANCES,
        MAX_COMBINED_CLIP_AND_CULL_DISTANCES,
        MAX_SAMPLES,
        MAX_MESH_OUTPUT_VERTICES_NV,
        MAX_MESH_OUTPUT_PRIMITIVES_NV,
        MAX_MESH_WORK_GROUP_SIZE_X_NV,
        MAX_MESH_WORK_GROUP_SIZE_Y_NV,
        MAX_MESH_WORK_GROUP_SIZE_Z_NV,
        MAX_TASK_WORK_GROUP_SIZE_X_NV,
        MAX_TASK_WORK_GROUP_SIZE_Y_NV,
        MAX_TASK_WORK_GROUP_SIZE_Z_NV,
        MAX_MESH_VIEW_COUNT_NV,
        MAX_MESH_OUTPUT_VERTICES_EXT,
        MAX_MESH_OUTPUT_PRIMITIVES_EXT,
        MAX_MESH_WORK_GROUP_SIZE_X_EXT,
        MAX_MESH_WORK_GROUP_SIZE_Y_EXT,
        MAX_MESH_WORK_GROUP_SIZE_Z_EXT,
        MAX_TASK_WORK_GROUP_SIZE_X_EXT,
        MAX_TASK_WORK_GROUP_SIZE_Y_EXT,
        MAX_TASK_WORK_GROUP_SIZE_Z_EXT,
        MAX_MESH_VIEW_COUNT_EXT,
        MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT,
        LIMITS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(GLSLangLimits.SIZEOF, GLSLangLimits.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAX_LIGHTS = layout.offsetof(0);
        MAX_CLIP_PLANES = layout.offsetof(1);
        MAX_TEXTURE_UNITS = layout.offsetof(2);
        MAX_TEXTURE_COORDS = layout.offsetof(3);
        MAX_VERTEX_ATTRIBS = layout.offsetof(4);
        MAX_VERTEX_UNIFORM_COMPONENTS = layout.offsetof(5);
        MAX_VARYING_FLOATS = layout.offsetof(6);
        MAX_VERTEX_TEXTURE_IMAGE_UNITS = layout.offsetof(7);
        MAX_COMBINED_TEXTURE_IMAGE_UNITS = layout.offsetof(8);
        MAX_TEXTURE_IMAGE_UNITS = layout.offsetof(9);
        MAX_FRAGMENT_UNIFORM_COMPONENTS = layout.offsetof(10);
        MAX_DRAW_BUFFERS = layout.offsetof(11);
        MAX_VERTEX_UNIFORM_VECTORS = layout.offsetof(12);
        MAX_VARYING_VECTORS = layout.offsetof(13);
        MAX_FRAGMENT_UNIFORM_VECTORS = layout.offsetof(14);
        MAX_VERTEX_OUTPUT_VECTORS = layout.offsetof(15);
        MAX_FRAGMENT_INPUT_VECTORS = layout.offsetof(16);
        MIN_PROGRAM_TEXEL_OFFSET = layout.offsetof(17);
        MAX_PROGRAM_TEXEL_OFFSET = layout.offsetof(18);
        MAX_CLIP_DISTANCES = layout.offsetof(19);
        MAX_COMPUTE_WORK_GROUP_COUNT_X = layout.offsetof(20);
        MAX_COMPUTE_WORK_GROUP_COUNT_Y = layout.offsetof(21);
        MAX_COMPUTE_WORK_GROUP_COUNT_Z = layout.offsetof(22);
        MAX_COMPUTE_WORK_GROUP_SIZE_X = layout.offsetof(23);
        MAX_COMPUTE_WORK_GROUP_SIZE_Y = layout.offsetof(24);
        MAX_COMPUTE_WORK_GROUP_SIZE_Z = layout.offsetof(25);
        MAX_COMPUTE_UNIFORM_COMPONENTS = layout.offsetof(26);
        MAX_COMPUTE_TEXTURE_IMAGE_UNITS = layout.offsetof(27);
        MAX_COMPUTE_IMAGE_UNIFORMS = layout.offsetof(28);
        MAX_COMPUTE_ATOMIC_COUNTERS = layout.offsetof(29);
        MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = layout.offsetof(30);
        MAX_VARYING_COMPONENTS = layout.offsetof(31);
        MAX_VERTEX_OUTPUT_COMPONENTS = layout.offsetof(32);
        MAX_GEOMETRY_INPUT_COMPONENTS = layout.offsetof(33);
        MAX_GEOMETRY_OUTPUT_COMPONENTS = layout.offsetof(34);
        MAX_FRAGMENT_INPUT_COMPONENTS = layout.offsetof(35);
        MAX_IMAGE_UNITS = layout.offsetof(36);
        MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = layout.offsetof(37);
        MAX_COMBINED_SHADER_OUTPUT_RESOURCES = layout.offsetof(38);
        MAX_IMAGE_SAMPLES = layout.offsetof(39);
        MAX_VERTEX_IMAGE_UNIFORMS = layout.offsetof(40);
        MAX_TESS_CONTROL_IMAGE_UNIFORMS = layout.offsetof(41);
        MAX_TESS_EVALUATION_IMAGE_UNIFORMS = layout.offsetof(42);
        MAX_GEOMETRY_IMAGE_UNIFORMS = layout.offsetof(43);
        MAX_FRAGMENT_IMAGE_UNIFORMS = layout.offsetof(44);
        MAX_COMBINED_IMAGE_UNIFORMS = layout.offsetof(45);
        MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = layout.offsetof(46);
        MAX_GEOMETRY_OUTPUT_VERTICES = layout.offsetof(47);
        MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = layout.offsetof(48);
        MAX_GEOMETRY_UNIFORM_COMPONENTS = layout.offsetof(49);
        MAX_GEOMETRY_VARYING_COMPONENTS = layout.offsetof(50);
        MAX_TESS_CONTROL_INPUT_COMPONENTS = layout.offsetof(51);
        MAX_TESS_CONTROL_OUTPUT_COMPONENTS = layout.offsetof(52);
        MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = layout.offsetof(53);
        MAX_TESS_CONTROL_UNIFORM_COMPONENTS = layout.offsetof(54);
        MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = layout.offsetof(55);
        MAX_TESS_EVALUATION_INPUT_COMPONENTS = layout.offsetof(56);
        MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = layout.offsetof(57);
        MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = layout.offsetof(58);
        MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = layout.offsetof(59);
        MAX_TESS_PATCH_COMPONENTS = layout.offsetof(60);
        MAX_PATCH_VERTICES = layout.offsetof(61);
        MAX_TESS_GEN_LEVEL = layout.offsetof(62);
        MAX_VIEWPORTS = layout.offsetof(63);
        MAX_VERTEX_ATOMIC_COUNTERS = layout.offsetof(64);
        MAX_TESS_CONTROL_ATOMIC_COUNTERS = layout.offsetof(65);
        MAX_TESS_EVALUATION_ATOMIC_COUNTERS = layout.offsetof(66);
        MAX_GEOMETRY_ATOMIC_COUNTERS = layout.offsetof(67);
        MAX_FRAGMENT_ATOMIC_COUNTERS = layout.offsetof(68);
        MAX_COMBINED_ATOMIC_COUNTERS = layout.offsetof(69);
        MAX_ATOMIC_COUNTER_BINDINGS = layout.offsetof(70);
        MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = layout.offsetof(71);
        MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = layout.offsetof(72);
        MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = layout.offsetof(73);
        MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = layout.offsetof(74);
        MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = layout.offsetof(75);
        MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = layout.offsetof(76);
        MAX_ATOMIC_COUNTER_BUFFER_SIZE = layout.offsetof(77);
        MAX_TRANSFORM_FEEDBACK_BUFFERS = layout.offsetof(78);
        MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = layout.offsetof(79);
        MAX_CULL_DISTANCES = layout.offsetof(80);
        MAX_COMBINED_CLIP_AND_CULL_DISTANCES = layout.offsetof(81);
        MAX_SAMPLES = layout.offsetof(82);
        MAX_MESH_OUTPUT_VERTICES_NV = layout.offsetof(83);
        MAX_MESH_OUTPUT_PRIMITIVES_NV = layout.offsetof(84);
        MAX_MESH_WORK_GROUP_SIZE_X_NV = layout.offsetof(85);
        MAX_MESH_WORK_GROUP_SIZE_Y_NV = layout.offsetof(86);
        MAX_MESH_WORK_GROUP_SIZE_Z_NV = layout.offsetof(87);
        MAX_TASK_WORK_GROUP_SIZE_X_NV = layout.offsetof(88);
        MAX_TASK_WORK_GROUP_SIZE_Y_NV = layout.offsetof(89);
        MAX_TASK_WORK_GROUP_SIZE_Z_NV = layout.offsetof(90);
        MAX_MESH_VIEW_COUNT_NV = layout.offsetof(91);
        MAX_MESH_OUTPUT_VERTICES_EXT = layout.offsetof(92);
        MAX_MESH_OUTPUT_PRIMITIVES_EXT = layout.offsetof(93);
        MAX_MESH_WORK_GROUP_SIZE_X_EXT = layout.offsetof(94);
        MAX_MESH_WORK_GROUP_SIZE_Y_EXT = layout.offsetof(95);
        MAX_MESH_WORK_GROUP_SIZE_Z_EXT = layout.offsetof(96);
        MAX_TASK_WORK_GROUP_SIZE_X_EXT = layout.offsetof(97);
        MAX_TASK_WORK_GROUP_SIZE_Y_EXT = layout.offsetof(98);
        MAX_TASK_WORK_GROUP_SIZE_Z_EXT = layout.offsetof(99);
        MAX_MESH_VIEW_COUNT_EXT = layout.offsetof(100);
        MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT = layout.offsetof(101);
        LIMITS = layout.offsetof(102);
    }

    protected GLSLangResource(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected GLSLangResource create(long address, @Nullable ByteBuffer container) {
        return new GLSLangResource(address, container);
    }

    /**
     * Creates a {@code GLSLangResource} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public GLSLangResource(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code max_lights} field. */
    public int max_lights() { return nmax_lights(address()); }
    /** @return the value of the {@code max_clip_planes} field. */
    public int max_clip_planes() { return nmax_clip_planes(address()); }
    /** @return the value of the {@code max_texture_units} field. */
    public int max_texture_units() { return nmax_texture_units(address()); }
    /** @return the value of the {@code max_texture_coords} field. */
    public int max_texture_coords() { return nmax_texture_coords(address()); }
    /** @return the value of the {@code max_vertex_attribs} field. */
    public int max_vertex_attribs() { return nmax_vertex_attribs(address()); }
    /** @return the value of the {@code max_vertex_uniform_components} field. */
    public int max_vertex_uniform_components() { return nmax_vertex_uniform_components(address()); }
    /** @return the value of the {@code max_varying_floats} field. */
    public int max_varying_floats() { return nmax_varying_floats(address()); }
    /** @return the value of the {@code max_vertex_texture_image_units} field. */
    public int max_vertex_texture_image_units() { return nmax_vertex_texture_image_units(address()); }
    /** @return the value of the {@code max_combined_texture_image_units} field. */
    public int max_combined_texture_image_units() { return nmax_combined_texture_image_units(address()); }
    /** @return the value of the {@code max_texture_image_units} field. */
    public int max_texture_image_units() { return nmax_texture_image_units(address()); }
    /** @return the value of the {@code max_fragment_uniform_components} field. */
    public int max_fragment_uniform_components() { return nmax_fragment_uniform_components(address()); }
    /** @return the value of the {@code max_draw_buffers} field. */
    public int max_draw_buffers() { return nmax_draw_buffers(address()); }
    /** @return the value of the {@code max_vertex_uniform_vectors} field. */
    public int max_vertex_uniform_vectors() { return nmax_vertex_uniform_vectors(address()); }
    /** @return the value of the {@code max_varying_vectors} field. */
    public int max_varying_vectors() { return nmax_varying_vectors(address()); }
    /** @return the value of the {@code max_fragment_uniform_vectors} field. */
    public int max_fragment_uniform_vectors() { return nmax_fragment_uniform_vectors(address()); }
    /** @return the value of the {@code max_vertex_output_vectors} field. */
    public int max_vertex_output_vectors() { return nmax_vertex_output_vectors(address()); }
    /** @return the value of the {@code max_fragment_input_vectors} field. */
    public int max_fragment_input_vectors() { return nmax_fragment_input_vectors(address()); }
    /** @return the value of the {@code min_program_texel_offset} field. */
    public int min_program_texel_offset() { return nmin_program_texel_offset(address()); }
    /** @return the value of the {@code max_program_texel_offset} field. */
    public int max_program_texel_offset() { return nmax_program_texel_offset(address()); }
    /** @return the value of the {@code max_clip_distances} field. */
    public int max_clip_distances() { return nmax_clip_distances(address()); }
    /** @return the value of the {@code max_compute_work_group_count_x} field. */
    public int max_compute_work_group_count_x() { return nmax_compute_work_group_count_x(address()); }
    /** @return the value of the {@code max_compute_work_group_count_y} field. */
    public int max_compute_work_group_count_y() { return nmax_compute_work_group_count_y(address()); }
    /** @return the value of the {@code max_compute_work_group_count_z} field. */
    public int max_compute_work_group_count_z() { return nmax_compute_work_group_count_z(address()); }
    /** @return the value of the {@code max_compute_work_group_size_x} field. */
    public int max_compute_work_group_size_x() { return nmax_compute_work_group_size_x(address()); }
    /** @return the value of the {@code max_compute_work_group_size_y} field. */
    public int max_compute_work_group_size_y() { return nmax_compute_work_group_size_y(address()); }
    /** @return the value of the {@code max_compute_work_group_size_z} field. */
    public int max_compute_work_group_size_z() { return nmax_compute_work_group_size_z(address()); }
    /** @return the value of the {@code max_compute_uniform_components} field. */
    public int max_compute_uniform_components() { return nmax_compute_uniform_components(address()); }
    /** @return the value of the {@code max_compute_texture_image_units} field. */
    public int max_compute_texture_image_units() { return nmax_compute_texture_image_units(address()); }
    /** @return the value of the {@code max_compute_image_uniforms} field. */
    public int max_compute_image_uniforms() { return nmax_compute_image_uniforms(address()); }
    /** @return the value of the {@code max_compute_atomic_counters} field. */
    public int max_compute_atomic_counters() { return nmax_compute_atomic_counters(address()); }
    /** @return the value of the {@code max_compute_atomic_counter_buffers} field. */
    public int max_compute_atomic_counter_buffers() { return nmax_compute_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_varying_components} field. */
    public int max_varying_components() { return nmax_varying_components(address()); }
    /** @return the value of the {@code max_vertex_output_components} field. */
    public int max_vertex_output_components() { return nmax_vertex_output_components(address()); }
    /** @return the value of the {@code max_geometry_input_components} field. */
    public int max_geometry_input_components() { return nmax_geometry_input_components(address()); }
    /** @return the value of the {@code max_geometry_output_components} field. */
    public int max_geometry_output_components() { return nmax_geometry_output_components(address()); }
    /** @return the value of the {@code max_fragment_input_components} field. */
    public int max_fragment_input_components() { return nmax_fragment_input_components(address()); }
    /** @return the value of the {@code max_image_units} field. */
    public int max_image_units() { return nmax_image_units(address()); }
    /** @return the value of the {@code max_combined_image_units_and_fragment_outputs} field. */
    public int max_combined_image_units_and_fragment_outputs() { return nmax_combined_image_units_and_fragment_outputs(address()); }
    /** @return the value of the {@code max_combined_shader_output_resources} field. */
    public int max_combined_shader_output_resources() { return nmax_combined_shader_output_resources(address()); }
    /** @return the value of the {@code max_image_samples} field. */
    public int max_image_samples() { return nmax_image_samples(address()); }
    /** @return the value of the {@code max_vertex_image_uniforms} field. */
    public int max_vertex_image_uniforms() { return nmax_vertex_image_uniforms(address()); }
    /** @return the value of the {@code max_tess_control_image_uniforms} field. */
    public int max_tess_control_image_uniforms() { return nmax_tess_control_image_uniforms(address()); }
    /** @return the value of the {@code max_tess_evaluation_image_uniforms} field. */
    public int max_tess_evaluation_image_uniforms() { return nmax_tess_evaluation_image_uniforms(address()); }
    /** @return the value of the {@code max_geometry_image_uniforms} field. */
    public int max_geometry_image_uniforms() { return nmax_geometry_image_uniforms(address()); }
    /** @return the value of the {@code max_fragment_image_uniforms} field. */
    public int max_fragment_image_uniforms() { return nmax_fragment_image_uniforms(address()); }
    /** @return the value of the {@code max_combined_image_uniforms} field. */
    public int max_combined_image_uniforms() { return nmax_combined_image_uniforms(address()); }
    /** @return the value of the {@code max_geometry_texture_image_units} field. */
    public int max_geometry_texture_image_units() { return nmax_geometry_texture_image_units(address()); }
    /** @return the value of the {@code max_geometry_output_vertices} field. */
    public int max_geometry_output_vertices() { return nmax_geometry_output_vertices(address()); }
    /** @return the value of the {@code max_geometry_total_output_components} field. */
    public int max_geometry_total_output_components() { return nmax_geometry_total_output_components(address()); }
    /** @return the value of the {@code max_geometry_uniform_components} field. */
    public int max_geometry_uniform_components() { return nmax_geometry_uniform_components(address()); }
    /** @return the value of the {@code max_geometry_varying_components} field. */
    public int max_geometry_varying_components() { return nmax_geometry_varying_components(address()); }
    /** @return the value of the {@code max_tess_control_input_components} field. */
    public int max_tess_control_input_components() { return nmax_tess_control_input_components(address()); }
    /** @return the value of the {@code max_tess_control_output_components} field. */
    public int max_tess_control_output_components() { return nmax_tess_control_output_components(address()); }
    /** @return the value of the {@code max_tess_control_texture_image_units} field. */
    public int max_tess_control_texture_image_units() { return nmax_tess_control_texture_image_units(address()); }
    /** @return the value of the {@code max_tess_control_uniform_components} field. */
    public int max_tess_control_uniform_components() { return nmax_tess_control_uniform_components(address()); }
    /** @return the value of the {@code max_tess_control_total_output_components} field. */
    public int max_tess_control_total_output_components() { return nmax_tess_control_total_output_components(address()); }
    /** @return the value of the {@code max_tess_evaluation_input_components} field. */
    public int max_tess_evaluation_input_components() { return nmax_tess_evaluation_input_components(address()); }
    /** @return the value of the {@code max_tess_evaluation_output_components} field. */
    public int max_tess_evaluation_output_components() { return nmax_tess_evaluation_output_components(address()); }
    /** @return the value of the {@code max_tess_evaluation_texture_image_units} field. */
    public int max_tess_evaluation_texture_image_units() { return nmax_tess_evaluation_texture_image_units(address()); }
    /** @return the value of the {@code max_tess_evaluation_uniform_components} field. */
    public int max_tess_evaluation_uniform_components() { return nmax_tess_evaluation_uniform_components(address()); }
    /** @return the value of the {@code max_tess_patch_components} field. */
    public int max_tess_patch_components() { return nmax_tess_patch_components(address()); }
    /** @return the value of the {@code max_patch_vertices} field. */
    public int max_patch_vertices() { return nmax_patch_vertices(address()); }
    /** @return the value of the {@code max_tess_gen_level} field. */
    public int max_tess_gen_level() { return nmax_tess_gen_level(address()); }
    /** @return the value of the {@code max_viewports} field. */
    public int max_viewports() { return nmax_viewports(address()); }
    /** @return the value of the {@code max_vertex_atomic_counters} field. */
    public int max_vertex_atomic_counters() { return nmax_vertex_atomic_counters(address()); }
    /** @return the value of the {@code max_tess_control_atomic_counters} field. */
    public int max_tess_control_atomic_counters() { return nmax_tess_control_atomic_counters(address()); }
    /** @return the value of the {@code max_tess_evaluation_atomic_counters} field. */
    public int max_tess_evaluation_atomic_counters() { return nmax_tess_evaluation_atomic_counters(address()); }
    /** @return the value of the {@code max_geometry_atomic_counters} field. */
    public int max_geometry_atomic_counters() { return nmax_geometry_atomic_counters(address()); }
    /** @return the value of the {@code max_fragment_atomic_counters} field. */
    public int max_fragment_atomic_counters() { return nmax_fragment_atomic_counters(address()); }
    /** @return the value of the {@code max_combined_atomic_counters} field. */
    public int max_combined_atomic_counters() { return nmax_combined_atomic_counters(address()); }
    /** @return the value of the {@code max_atomic_counter_bindings} field. */
    public int max_atomic_counter_bindings() { return nmax_atomic_counter_bindings(address()); }
    /** @return the value of the {@code max_vertex_atomic_counter_buffers} field. */
    public int max_vertex_atomic_counter_buffers() { return nmax_vertex_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_tess_control_atomic_counter_buffers} field. */
    public int max_tess_control_atomic_counter_buffers() { return nmax_tess_control_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_tess_evaluation_atomic_counter_buffers} field. */
    public int max_tess_evaluation_atomic_counter_buffers() { return nmax_tess_evaluation_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_geometry_atomic_counter_buffers} field. */
    public int max_geometry_atomic_counter_buffers() { return nmax_geometry_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_fragment_atomic_counter_buffers} field. */
    public int max_fragment_atomic_counter_buffers() { return nmax_fragment_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_combined_atomic_counter_buffers} field. */
    public int max_combined_atomic_counter_buffers() { return nmax_combined_atomic_counter_buffers(address()); }
    /** @return the value of the {@code max_atomic_counter_buffer_size} field. */
    public int max_atomic_counter_buffer_size() { return nmax_atomic_counter_buffer_size(address()); }
    /** @return the value of the {@code max_transform_feedback_buffers} field. */
    public int max_transform_feedback_buffers() { return nmax_transform_feedback_buffers(address()); }
    /** @return the value of the {@code max_transform_feedback_interleaved_components} field. */
    public int max_transform_feedback_interleaved_components() { return nmax_transform_feedback_interleaved_components(address()); }
    /** @return the value of the {@code max_cull_distances} field. */
    public int max_cull_distances() { return nmax_cull_distances(address()); }
    /** @return the value of the {@code max_combined_clip_and_cull_distances} field. */
    public int max_combined_clip_and_cull_distances() { return nmax_combined_clip_and_cull_distances(address()); }
    /** @return the value of the {@code max_samples} field. */
    public int max_samples() { return nmax_samples(address()); }
    /** @return the value of the {@code max_mesh_output_vertices_nv} field. */
    public int max_mesh_output_vertices_nv() { return nmax_mesh_output_vertices_nv(address()); }
    /** @return the value of the {@code max_mesh_output_primitives_nv} field. */
    public int max_mesh_output_primitives_nv() { return nmax_mesh_output_primitives_nv(address()); }
    /** @return the value of the {@code max_mesh_work_group_size_x_nv} field. */
    public int max_mesh_work_group_size_x_nv() { return nmax_mesh_work_group_size_x_nv(address()); }
    /** @return the value of the {@code max_mesh_work_group_size_y_nv} field. */
    public int max_mesh_work_group_size_y_nv() { return nmax_mesh_work_group_size_y_nv(address()); }
    /** @return the value of the {@code max_mesh_work_group_size_z_nv} field. */
    public int max_mesh_work_group_size_z_nv() { return nmax_mesh_work_group_size_z_nv(address()); }
    /** @return the value of the {@code max_task_work_group_size_x_nv} field. */
    public int max_task_work_group_size_x_nv() { return nmax_task_work_group_size_x_nv(address()); }
    /** @return the value of the {@code max_task_work_group_size_y_nv} field. */
    public int max_task_work_group_size_y_nv() { return nmax_task_work_group_size_y_nv(address()); }
    /** @return the value of the {@code max_task_work_group_size_z_nv} field. */
    public int max_task_work_group_size_z_nv() { return nmax_task_work_group_size_z_nv(address()); }
    /** @return the value of the {@code max_mesh_view_count_nv} field. */
    public int max_mesh_view_count_nv() { return nmax_mesh_view_count_nv(address()); }
    /** @return the value of the {@code max_mesh_output_vertices_ext} field. */
    public int max_mesh_output_vertices_ext() { return nmax_mesh_output_vertices_ext(address()); }
    /** @return the value of the {@code max_mesh_output_primitives_ext} field. */
    public int max_mesh_output_primitives_ext() { return nmax_mesh_output_primitives_ext(address()); }
    /** @return the value of the {@code max_mesh_work_group_size_x_ext} field. */
    public int max_mesh_work_group_size_x_ext() { return nmax_mesh_work_group_size_x_ext(address()); }
    /** @return the value of the {@code max_mesh_work_group_size_y_ext} field. */
    public int max_mesh_work_group_size_y_ext() { return nmax_mesh_work_group_size_y_ext(address()); }
    /** @return the value of the {@code max_mesh_work_group_size_z_ext} field. */
    public int max_mesh_work_group_size_z_ext() { return nmax_mesh_work_group_size_z_ext(address()); }
    /** @return the value of the {@code max_task_work_group_size_x_ext} field. */
    public int max_task_work_group_size_x_ext() { return nmax_task_work_group_size_x_ext(address()); }
    /** @return the value of the {@code max_task_work_group_size_y_ext} field. */
    public int max_task_work_group_size_y_ext() { return nmax_task_work_group_size_y_ext(address()); }
    /** @return the value of the {@code max_task_work_group_size_z_ext} field. */
    public int max_task_work_group_size_z_ext() { return nmax_task_work_group_size_z_ext(address()); }
    /** @return the value of the {@code max_mesh_view_count_ext} field. */
    public int max_mesh_view_count_ext() { return nmax_mesh_view_count_ext(address()); }
    /** @return the value of the {@code max_dual_source_draw_buffers_ext} field. */
    public int max_dual_source_draw_buffers_ext() { return nmax_dual_source_draw_buffers_ext(address()); }
    /** @return a {@link GLSLangLimits} view of the {@code limits} field. */
    @NativeType("glslang_limits_t")
    public GLSLangLimits limits() { return nlimits(address()); }

    /** Sets the specified value to the {@code max_lights} field. */
    public GLSLangResource max_lights(int value) { nmax_lights(address(), value); return this; }
    /** Sets the specified value to the {@code max_clip_planes} field. */
    public GLSLangResource max_clip_planes(int value) { nmax_clip_planes(address(), value); return this; }
    /** Sets the specified value to the {@code max_texture_units} field. */
    public GLSLangResource max_texture_units(int value) { nmax_texture_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_texture_coords} field. */
    public GLSLangResource max_texture_coords(int value) { nmax_texture_coords(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_attribs} field. */
    public GLSLangResource max_vertex_attribs(int value) { nmax_vertex_attribs(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_uniform_components} field. */
    public GLSLangResource max_vertex_uniform_components(int value) { nmax_vertex_uniform_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_varying_floats} field. */
    public GLSLangResource max_varying_floats(int value) { nmax_varying_floats(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_texture_image_units} field. */
    public GLSLangResource max_vertex_texture_image_units(int value) { nmax_vertex_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_texture_image_units} field. */
    public GLSLangResource max_combined_texture_image_units(int value) { nmax_combined_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_texture_image_units} field. */
    public GLSLangResource max_texture_image_units(int value) { nmax_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_uniform_components} field. */
    public GLSLangResource max_fragment_uniform_components(int value) { nmax_fragment_uniform_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_draw_buffers} field. */
    public GLSLangResource max_draw_buffers(int value) { nmax_draw_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_uniform_vectors} field. */
    public GLSLangResource max_vertex_uniform_vectors(int value) { nmax_vertex_uniform_vectors(address(), value); return this; }
    /** Sets the specified value to the {@code max_varying_vectors} field. */
    public GLSLangResource max_varying_vectors(int value) { nmax_varying_vectors(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_uniform_vectors} field. */
    public GLSLangResource max_fragment_uniform_vectors(int value) { nmax_fragment_uniform_vectors(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_output_vectors} field. */
    public GLSLangResource max_vertex_output_vectors(int value) { nmax_vertex_output_vectors(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_input_vectors} field. */
    public GLSLangResource max_fragment_input_vectors(int value) { nmax_fragment_input_vectors(address(), value); return this; }
    /** Sets the specified value to the {@code min_program_texel_offset} field. */
    public GLSLangResource min_program_texel_offset(int value) { nmin_program_texel_offset(address(), value); return this; }
    /** Sets the specified value to the {@code max_program_texel_offset} field. */
    public GLSLangResource max_program_texel_offset(int value) { nmax_program_texel_offset(address(), value); return this; }
    /** Sets the specified value to the {@code max_clip_distances} field. */
    public GLSLangResource max_clip_distances(int value) { nmax_clip_distances(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_work_group_count_x} field. */
    public GLSLangResource max_compute_work_group_count_x(int value) { nmax_compute_work_group_count_x(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_work_group_count_y} field. */
    public GLSLangResource max_compute_work_group_count_y(int value) { nmax_compute_work_group_count_y(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_work_group_count_z} field. */
    public GLSLangResource max_compute_work_group_count_z(int value) { nmax_compute_work_group_count_z(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_work_group_size_x} field. */
    public GLSLangResource max_compute_work_group_size_x(int value) { nmax_compute_work_group_size_x(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_work_group_size_y} field. */
    public GLSLangResource max_compute_work_group_size_y(int value) { nmax_compute_work_group_size_y(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_work_group_size_z} field. */
    public GLSLangResource max_compute_work_group_size_z(int value) { nmax_compute_work_group_size_z(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_uniform_components} field. */
    public GLSLangResource max_compute_uniform_components(int value) { nmax_compute_uniform_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_texture_image_units} field. */
    public GLSLangResource max_compute_texture_image_units(int value) { nmax_compute_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_image_uniforms} field. */
    public GLSLangResource max_compute_image_uniforms(int value) { nmax_compute_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_atomic_counters} field. */
    public GLSLangResource max_compute_atomic_counters(int value) { nmax_compute_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_compute_atomic_counter_buffers} field. */
    public GLSLangResource max_compute_atomic_counter_buffers(int value) { nmax_compute_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_varying_components} field. */
    public GLSLangResource max_varying_components(int value) { nmax_varying_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_output_components} field. */
    public GLSLangResource max_vertex_output_components(int value) { nmax_vertex_output_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_input_components} field. */
    public GLSLangResource max_geometry_input_components(int value) { nmax_geometry_input_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_output_components} field. */
    public GLSLangResource max_geometry_output_components(int value) { nmax_geometry_output_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_input_components} field. */
    public GLSLangResource max_fragment_input_components(int value) { nmax_fragment_input_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_image_units} field. */
    public GLSLangResource max_image_units(int value) { nmax_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_image_units_and_fragment_outputs} field. */
    public GLSLangResource max_combined_image_units_and_fragment_outputs(int value) { nmax_combined_image_units_and_fragment_outputs(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_shader_output_resources} field. */
    public GLSLangResource max_combined_shader_output_resources(int value) { nmax_combined_shader_output_resources(address(), value); return this; }
    /** Sets the specified value to the {@code max_image_samples} field. */
    public GLSLangResource max_image_samples(int value) { nmax_image_samples(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_image_uniforms} field. */
    public GLSLangResource max_vertex_image_uniforms(int value) { nmax_vertex_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_image_uniforms} field. */
    public GLSLangResource max_tess_control_image_uniforms(int value) { nmax_tess_control_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_image_uniforms} field. */
    public GLSLangResource max_tess_evaluation_image_uniforms(int value) { nmax_tess_evaluation_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_image_uniforms} field. */
    public GLSLangResource max_geometry_image_uniforms(int value) { nmax_geometry_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_image_uniforms} field. */
    public GLSLangResource max_fragment_image_uniforms(int value) { nmax_fragment_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_image_uniforms} field. */
    public GLSLangResource max_combined_image_uniforms(int value) { nmax_combined_image_uniforms(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_texture_image_units} field. */
    public GLSLangResource max_geometry_texture_image_units(int value) { nmax_geometry_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_output_vertices} field. */
    public GLSLangResource max_geometry_output_vertices(int value) { nmax_geometry_output_vertices(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_total_output_components} field. */
    public GLSLangResource max_geometry_total_output_components(int value) { nmax_geometry_total_output_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_uniform_components} field. */
    public GLSLangResource max_geometry_uniform_components(int value) { nmax_geometry_uniform_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_varying_components} field. */
    public GLSLangResource max_geometry_varying_components(int value) { nmax_geometry_varying_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_input_components} field. */
    public GLSLangResource max_tess_control_input_components(int value) { nmax_tess_control_input_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_output_components} field. */
    public GLSLangResource max_tess_control_output_components(int value) { nmax_tess_control_output_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_texture_image_units} field. */
    public GLSLangResource max_tess_control_texture_image_units(int value) { nmax_tess_control_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_uniform_components} field. */
    public GLSLangResource max_tess_control_uniform_components(int value) { nmax_tess_control_uniform_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_total_output_components} field. */
    public GLSLangResource max_tess_control_total_output_components(int value) { nmax_tess_control_total_output_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_input_components} field. */
    public GLSLangResource max_tess_evaluation_input_components(int value) { nmax_tess_evaluation_input_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_output_components} field. */
    public GLSLangResource max_tess_evaluation_output_components(int value) { nmax_tess_evaluation_output_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_texture_image_units} field. */
    public GLSLangResource max_tess_evaluation_texture_image_units(int value) { nmax_tess_evaluation_texture_image_units(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_uniform_components} field. */
    public GLSLangResource max_tess_evaluation_uniform_components(int value) { nmax_tess_evaluation_uniform_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_patch_components} field. */
    public GLSLangResource max_tess_patch_components(int value) { nmax_tess_patch_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_patch_vertices} field. */
    public GLSLangResource max_patch_vertices(int value) { nmax_patch_vertices(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_gen_level} field. */
    public GLSLangResource max_tess_gen_level(int value) { nmax_tess_gen_level(address(), value); return this; }
    /** Sets the specified value to the {@code max_viewports} field. */
    public GLSLangResource max_viewports(int value) { nmax_viewports(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_atomic_counters} field. */
    public GLSLangResource max_vertex_atomic_counters(int value) { nmax_vertex_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_atomic_counters} field. */
    public GLSLangResource max_tess_control_atomic_counters(int value) { nmax_tess_control_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_atomic_counters} field. */
    public GLSLangResource max_tess_evaluation_atomic_counters(int value) { nmax_tess_evaluation_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_atomic_counters} field. */
    public GLSLangResource max_geometry_atomic_counters(int value) { nmax_geometry_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_atomic_counters} field. */
    public GLSLangResource max_fragment_atomic_counters(int value) { nmax_fragment_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_atomic_counters} field. */
    public GLSLangResource max_combined_atomic_counters(int value) { nmax_combined_atomic_counters(address(), value); return this; }
    /** Sets the specified value to the {@code max_atomic_counter_bindings} field. */
    public GLSLangResource max_atomic_counter_bindings(int value) { nmax_atomic_counter_bindings(address(), value); return this; }
    /** Sets the specified value to the {@code max_vertex_atomic_counter_buffers} field. */
    public GLSLangResource max_vertex_atomic_counter_buffers(int value) { nmax_vertex_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_control_atomic_counter_buffers} field. */
    public GLSLangResource max_tess_control_atomic_counter_buffers(int value) { nmax_tess_control_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_tess_evaluation_atomic_counter_buffers} field. */
    public GLSLangResource max_tess_evaluation_atomic_counter_buffers(int value) { nmax_tess_evaluation_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_geometry_atomic_counter_buffers} field. */
    public GLSLangResource max_geometry_atomic_counter_buffers(int value) { nmax_geometry_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_fragment_atomic_counter_buffers} field. */
    public GLSLangResource max_fragment_atomic_counter_buffers(int value) { nmax_fragment_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_atomic_counter_buffers} field. */
    public GLSLangResource max_combined_atomic_counter_buffers(int value) { nmax_combined_atomic_counter_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_atomic_counter_buffer_size} field. */
    public GLSLangResource max_atomic_counter_buffer_size(int value) { nmax_atomic_counter_buffer_size(address(), value); return this; }
    /** Sets the specified value to the {@code max_transform_feedback_buffers} field. */
    public GLSLangResource max_transform_feedback_buffers(int value) { nmax_transform_feedback_buffers(address(), value); return this; }
    /** Sets the specified value to the {@code max_transform_feedback_interleaved_components} field. */
    public GLSLangResource max_transform_feedback_interleaved_components(int value) { nmax_transform_feedback_interleaved_components(address(), value); return this; }
    /** Sets the specified value to the {@code max_cull_distances} field. */
    public GLSLangResource max_cull_distances(int value) { nmax_cull_distances(address(), value); return this; }
    /** Sets the specified value to the {@code max_combined_clip_and_cull_distances} field. */
    public GLSLangResource max_combined_clip_and_cull_distances(int value) { nmax_combined_clip_and_cull_distances(address(), value); return this; }
    /** Sets the specified value to the {@code max_samples} field. */
    public GLSLangResource max_samples(int value) { nmax_samples(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_output_vertices_nv} field. */
    public GLSLangResource max_mesh_output_vertices_nv(int value) { nmax_mesh_output_vertices_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_output_primitives_nv} field. */
    public GLSLangResource max_mesh_output_primitives_nv(int value) { nmax_mesh_output_primitives_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_work_group_size_x_nv} field. */
    public GLSLangResource max_mesh_work_group_size_x_nv(int value) { nmax_mesh_work_group_size_x_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_work_group_size_y_nv} field. */
    public GLSLangResource max_mesh_work_group_size_y_nv(int value) { nmax_mesh_work_group_size_y_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_work_group_size_z_nv} field. */
    public GLSLangResource max_mesh_work_group_size_z_nv(int value) { nmax_mesh_work_group_size_z_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_task_work_group_size_x_nv} field. */
    public GLSLangResource max_task_work_group_size_x_nv(int value) { nmax_task_work_group_size_x_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_task_work_group_size_y_nv} field. */
    public GLSLangResource max_task_work_group_size_y_nv(int value) { nmax_task_work_group_size_y_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_task_work_group_size_z_nv} field. */
    public GLSLangResource max_task_work_group_size_z_nv(int value) { nmax_task_work_group_size_z_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_view_count_nv} field. */
    public GLSLangResource max_mesh_view_count_nv(int value) { nmax_mesh_view_count_nv(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_output_vertices_ext} field. */
    public GLSLangResource max_mesh_output_vertices_ext(int value) { nmax_mesh_output_vertices_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_output_primitives_ext} field. */
    public GLSLangResource max_mesh_output_primitives_ext(int value) { nmax_mesh_output_primitives_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_work_group_size_x_ext} field. */
    public GLSLangResource max_mesh_work_group_size_x_ext(int value) { nmax_mesh_work_group_size_x_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_work_group_size_y_ext} field. */
    public GLSLangResource max_mesh_work_group_size_y_ext(int value) { nmax_mesh_work_group_size_y_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_work_group_size_z_ext} field. */
    public GLSLangResource max_mesh_work_group_size_z_ext(int value) { nmax_mesh_work_group_size_z_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_task_work_group_size_x_ext} field. */
    public GLSLangResource max_task_work_group_size_x_ext(int value) { nmax_task_work_group_size_x_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_task_work_group_size_y_ext} field. */
    public GLSLangResource max_task_work_group_size_y_ext(int value) { nmax_task_work_group_size_y_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_task_work_group_size_z_ext} field. */
    public GLSLangResource max_task_work_group_size_z_ext(int value) { nmax_task_work_group_size_z_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_mesh_view_count_ext} field. */
    public GLSLangResource max_mesh_view_count_ext(int value) { nmax_mesh_view_count_ext(address(), value); return this; }
    /** Sets the specified value to the {@code max_dual_source_draw_buffers_ext} field. */
    public GLSLangResource max_dual_source_draw_buffers_ext(int value) { nmax_dual_source_draw_buffers_ext(address(), value); return this; }
    /** Copies the specified {@link GLSLangLimits} to the {@code limits} field. */
    public GLSLangResource limits(@NativeType("glslang_limits_t") GLSLangLimits value) { nlimits(address(), value); return this; }
    /** Passes the {@code limits} field to the specified {@link java.util.function.Consumer Consumer}. */
    public GLSLangResource limits(java.util.function.Consumer<GLSLangLimits> consumer) { consumer.accept(limits()); return this; }

    /** Initializes this struct with the specified values. */
    public GLSLangResource set(
        int max_lights,
        int max_clip_planes,
        int max_texture_units,
        int max_texture_coords,
        int max_vertex_attribs,
        int max_vertex_uniform_components,
        int max_varying_floats,
        int max_vertex_texture_image_units,
        int max_combined_texture_image_units,
        int max_texture_image_units,
        int max_fragment_uniform_components,
        int max_draw_buffers,
        int max_vertex_uniform_vectors,
        int max_varying_vectors,
        int max_fragment_uniform_vectors,
        int max_vertex_output_vectors,
        int max_fragment_input_vectors,
        int min_program_texel_offset,
        int max_program_texel_offset,
        int max_clip_distances,
        int max_compute_work_group_count_x,
        int max_compute_work_group_count_y,
        int max_compute_work_group_count_z,
        int max_compute_work_group_size_x,
        int max_compute_work_group_size_y,
        int max_compute_work_group_size_z,
        int max_compute_uniform_components,
        int max_compute_texture_image_units,
        int max_compute_image_uniforms,
        int max_compute_atomic_counters,
        int max_compute_atomic_counter_buffers,
        int max_varying_components,
        int max_vertex_output_components,
        int max_geometry_input_components,
        int max_geometry_output_components,
        int max_fragment_input_components,
        int max_image_units,
        int max_combined_image_units_and_fragment_outputs,
        int max_combined_shader_output_resources,
        int max_image_samples,
        int max_vertex_image_uniforms,
        int max_tess_control_image_uniforms,
        int max_tess_evaluation_image_uniforms,
        int max_geometry_image_uniforms,
        int max_fragment_image_uniforms,
        int max_combined_image_uniforms,
        int max_geometry_texture_image_units,
        int max_geometry_output_vertices,
        int max_geometry_total_output_components,
        int max_geometry_uniform_components,
        int max_geometry_varying_components,
        int max_tess_control_input_components,
        int max_tess_control_output_components,
        int max_tess_control_texture_image_units,
        int max_tess_control_uniform_components,
        int max_tess_control_total_output_components,
        int max_tess_evaluation_input_components,
        int max_tess_evaluation_output_components,
        int max_tess_evaluation_texture_image_units,
        int max_tess_evaluation_uniform_components,
        int max_tess_patch_components,
        int max_patch_vertices,
        int max_tess_gen_level,
        int max_viewports,
        int max_vertex_atomic_counters,
        int max_tess_control_atomic_counters,
        int max_tess_evaluation_atomic_counters,
        int max_geometry_atomic_counters,
        int max_fragment_atomic_counters,
        int max_combined_atomic_counters,
        int max_atomic_counter_bindings,
        int max_vertex_atomic_counter_buffers,
        int max_tess_control_atomic_counter_buffers,
        int max_tess_evaluation_atomic_counter_buffers,
        int max_geometry_atomic_counter_buffers,
        int max_fragment_atomic_counter_buffers,
        int max_combined_atomic_counter_buffers,
        int max_atomic_counter_buffer_size,
        int max_transform_feedback_buffers,
        int max_transform_feedback_interleaved_components,
        int max_cull_distances,
        int max_combined_clip_and_cull_distances,
        int max_samples,
        int max_mesh_output_vertices_nv,
        int max_mesh_output_primitives_nv,
        int max_mesh_work_group_size_x_nv,
        int max_mesh_work_group_size_y_nv,
        int max_mesh_work_group_size_z_nv,
        int max_task_work_group_size_x_nv,
        int max_task_work_group_size_y_nv,
        int max_task_work_group_size_z_nv,
        int max_mesh_view_count_nv,
        int max_mesh_output_vertices_ext,
        int max_mesh_output_primitives_ext,
        int max_mesh_work_group_size_x_ext,
        int max_mesh_work_group_size_y_ext,
        int max_mesh_work_group_size_z_ext,
        int max_task_work_group_size_x_ext,
        int max_task_work_group_size_y_ext,
        int max_task_work_group_size_z_ext,
        int max_mesh_view_count_ext,
        int max_dual_source_draw_buffers_ext,
        GLSLangLimits limits
    ) {
        max_lights(max_lights);
        max_clip_planes(max_clip_planes);
        max_texture_units(max_texture_units);
        max_texture_coords(max_texture_coords);
        max_vertex_attribs(max_vertex_attribs);
        max_vertex_uniform_components(max_vertex_uniform_components);
        max_varying_floats(max_varying_floats);
        max_vertex_texture_image_units(max_vertex_texture_image_units);
        max_combined_texture_image_units(max_combined_texture_image_units);
        max_texture_image_units(max_texture_image_units);
        max_fragment_uniform_components(max_fragment_uniform_components);
        max_draw_buffers(max_draw_buffers);
        max_vertex_uniform_vectors(max_vertex_uniform_vectors);
        max_varying_vectors(max_varying_vectors);
        max_fragment_uniform_vectors(max_fragment_uniform_vectors);
        max_vertex_output_vectors(max_vertex_output_vectors);
        max_fragment_input_vectors(max_fragment_input_vectors);
        min_program_texel_offset(min_program_texel_offset);
        max_program_texel_offset(max_program_texel_offset);
        max_clip_distances(max_clip_distances);
        max_compute_work_group_count_x(max_compute_work_group_count_x);
        max_compute_work_group_count_y(max_compute_work_group_count_y);
        max_compute_work_group_count_z(max_compute_work_group_count_z);
        max_compute_work_group_size_x(max_compute_work_group_size_x);
        max_compute_work_group_size_y(max_compute_work_group_size_y);
        max_compute_work_group_size_z(max_compute_work_group_size_z);
        max_compute_uniform_components(max_compute_uniform_components);
        max_compute_texture_image_units(max_compute_texture_image_units);
        max_compute_image_uniforms(max_compute_image_uniforms);
        max_compute_atomic_counters(max_compute_atomic_counters);
        max_compute_atomic_counter_buffers(max_compute_atomic_counter_buffers);
        max_varying_components(max_varying_components);
        max_vertex_output_components(max_vertex_output_components);
        max_geometry_input_components(max_geometry_input_components);
        max_geometry_output_components(max_geometry_output_components);
        max_fragment_input_components(max_fragment_input_components);
        max_image_units(max_image_units);
        max_combined_image_units_and_fragment_outputs(max_combined_image_units_and_fragment_outputs);
        max_combined_shader_output_resources(max_combined_shader_output_resources);
        max_image_samples(max_image_samples);
        max_vertex_image_uniforms(max_vertex_image_uniforms);
        max_tess_control_image_uniforms(max_tess_control_image_uniforms);
        max_tess_evaluation_image_uniforms(max_tess_evaluation_image_uniforms);
        max_geometry_image_uniforms(max_geometry_image_uniforms);
        max_fragment_image_uniforms(max_fragment_image_uniforms);
        max_combined_image_uniforms(max_combined_image_uniforms);
        max_geometry_texture_image_units(max_geometry_texture_image_units);
        max_geometry_output_vertices(max_geometry_output_vertices);
        max_geometry_total_output_components(max_geometry_total_output_components);
        max_geometry_uniform_components(max_geometry_uniform_components);
        max_geometry_varying_components(max_geometry_varying_components);
        max_tess_control_input_components(max_tess_control_input_components);
        max_tess_control_output_components(max_tess_control_output_components);
        max_tess_control_texture_image_units(max_tess_control_texture_image_units);
        max_tess_control_uniform_components(max_tess_control_uniform_components);
        max_tess_control_total_output_components(max_tess_control_total_output_components);
        max_tess_evaluation_input_components(max_tess_evaluation_input_components);
        max_tess_evaluation_output_components(max_tess_evaluation_output_components);
        max_tess_evaluation_texture_image_units(max_tess_evaluation_texture_image_units);
        max_tess_evaluation_uniform_components(max_tess_evaluation_uniform_components);
        max_tess_patch_components(max_tess_patch_components);
        max_patch_vertices(max_patch_vertices);
        max_tess_gen_level(max_tess_gen_level);
        max_viewports(max_viewports);
        max_vertex_atomic_counters(max_vertex_atomic_counters);
        max_tess_control_atomic_counters(max_tess_control_atomic_counters);
        max_tess_evaluation_atomic_counters(max_tess_evaluation_atomic_counters);
        max_geometry_atomic_counters(max_geometry_atomic_counters);
        max_fragment_atomic_counters(max_fragment_atomic_counters);
        max_combined_atomic_counters(max_combined_atomic_counters);
        max_atomic_counter_bindings(max_atomic_counter_bindings);
        max_vertex_atomic_counter_buffers(max_vertex_atomic_counter_buffers);
        max_tess_control_atomic_counter_buffers(max_tess_control_atomic_counter_buffers);
        max_tess_evaluation_atomic_counter_buffers(max_tess_evaluation_atomic_counter_buffers);
        max_geometry_atomic_counter_buffers(max_geometry_atomic_counter_buffers);
        max_fragment_atomic_counter_buffers(max_fragment_atomic_counter_buffers);
        max_combined_atomic_counter_buffers(max_combined_atomic_counter_buffers);
        max_atomic_counter_buffer_size(max_atomic_counter_buffer_size);
        max_transform_feedback_buffers(max_transform_feedback_buffers);
        max_transform_feedback_interleaved_components(max_transform_feedback_interleaved_components);
        max_cull_distances(max_cull_distances);
        max_combined_clip_and_cull_distances(max_combined_clip_and_cull_distances);
        max_samples(max_samples);
        max_mesh_output_vertices_nv(max_mesh_output_vertices_nv);
        max_mesh_output_primitives_nv(max_mesh_output_primitives_nv);
        max_mesh_work_group_size_x_nv(max_mesh_work_group_size_x_nv);
        max_mesh_work_group_size_y_nv(max_mesh_work_group_size_y_nv);
        max_mesh_work_group_size_z_nv(max_mesh_work_group_size_z_nv);
        max_task_work_group_size_x_nv(max_task_work_group_size_x_nv);
        max_task_work_group_size_y_nv(max_task_work_group_size_y_nv);
        max_task_work_group_size_z_nv(max_task_work_group_size_z_nv);
        max_mesh_view_count_nv(max_mesh_view_count_nv);
        max_mesh_output_vertices_ext(max_mesh_output_vertices_ext);
        max_mesh_output_primitives_ext(max_mesh_output_primitives_ext);
        max_mesh_work_group_size_x_ext(max_mesh_work_group_size_x_ext);
        max_mesh_work_group_size_y_ext(max_mesh_work_group_size_y_ext);
        max_mesh_work_group_size_z_ext(max_mesh_work_group_size_z_ext);
        max_task_work_group_size_x_ext(max_task_work_group_size_x_ext);
        max_task_work_group_size_y_ext(max_task_work_group_size_y_ext);
        max_task_work_group_size_z_ext(max_task_work_group_size_z_ext);
        max_mesh_view_count_ext(max_mesh_view_count_ext);
        max_dual_source_draw_buffers_ext(max_dual_source_draw_buffers_ext);
        limits(limits);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public GLSLangResource set(GLSLangResource src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code GLSLangResource} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static GLSLangResource malloc() {
        return new GLSLangResource(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code GLSLangResource} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static GLSLangResource calloc() {
        return new GLSLangResource(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code GLSLangResource} instance allocated with {@link BufferUtils}. */
    public static GLSLangResource create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangResource(memAddress(container), container);
    }

    /** Returns a new {@code GLSLangResource} instance for the specified memory address. */
    public static GLSLangResource create(long address) {
        return new GLSLangResource(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable GLSLangResource createSafe(long address) {
        return address == NULL ? null : new GLSLangResource(address, null);
    }

    /**
     * Returns a new {@link GLSLangResource.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangResource.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link GLSLangResource.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangResource.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangResource.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static GLSLangResource.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link GLSLangResource.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static GLSLangResource.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static GLSLangResource.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code GLSLangResource} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangResource malloc(MemoryStack stack) {
        return new GLSLangResource(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code GLSLangResource} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static GLSLangResource calloc(MemoryStack stack) {
        return new GLSLangResource(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link GLSLangResource.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangResource.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link GLSLangResource.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static GLSLangResource.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #max_lights}. */
    public static int nmax_lights(long struct) { return memGetInt(struct + GLSLangResource.MAX_LIGHTS); }
    /** Unsafe version of {@link #max_clip_planes}. */
    public static int nmax_clip_planes(long struct) { return memGetInt(struct + GLSLangResource.MAX_CLIP_PLANES); }
    /** Unsafe version of {@link #max_texture_units}. */
    public static int nmax_texture_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_TEXTURE_UNITS); }
    /** Unsafe version of {@link #max_texture_coords}. */
    public static int nmax_texture_coords(long struct) { return memGetInt(struct + GLSLangResource.MAX_TEXTURE_COORDS); }
    /** Unsafe version of {@link #max_vertex_attribs}. */
    public static int nmax_vertex_attribs(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_ATTRIBS); }
    /** Unsafe version of {@link #max_vertex_uniform_components}. */
    public static int nmax_vertex_uniform_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_UNIFORM_COMPONENTS); }
    /** Unsafe version of {@link #max_varying_floats}. */
    public static int nmax_varying_floats(long struct) { return memGetInt(struct + GLSLangResource.MAX_VARYING_FLOATS); }
    /** Unsafe version of {@link #max_vertex_texture_image_units}. */
    public static int nmax_vertex_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_combined_texture_image_units}. */
    public static int nmax_combined_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_texture_image_units}. */
    public static int nmax_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_fragment_uniform_components}. */
    public static int nmax_fragment_uniform_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_UNIFORM_COMPONENTS); }
    /** Unsafe version of {@link #max_draw_buffers}. */
    public static int nmax_draw_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_DRAW_BUFFERS); }
    /** Unsafe version of {@link #max_vertex_uniform_vectors}. */
    public static int nmax_vertex_uniform_vectors(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_UNIFORM_VECTORS); }
    /** Unsafe version of {@link #max_varying_vectors}. */
    public static int nmax_varying_vectors(long struct) { return memGetInt(struct + GLSLangResource.MAX_VARYING_VECTORS); }
    /** Unsafe version of {@link #max_fragment_uniform_vectors}. */
    public static int nmax_fragment_uniform_vectors(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_UNIFORM_VECTORS); }
    /** Unsafe version of {@link #max_vertex_output_vectors}. */
    public static int nmax_vertex_output_vectors(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_OUTPUT_VECTORS); }
    /** Unsafe version of {@link #max_fragment_input_vectors}. */
    public static int nmax_fragment_input_vectors(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_INPUT_VECTORS); }
    /** Unsafe version of {@link #min_program_texel_offset}. */
    public static int nmin_program_texel_offset(long struct) { return memGetInt(struct + GLSLangResource.MIN_PROGRAM_TEXEL_OFFSET); }
    /** Unsafe version of {@link #max_program_texel_offset}. */
    public static int nmax_program_texel_offset(long struct) { return memGetInt(struct + GLSLangResource.MAX_PROGRAM_TEXEL_OFFSET); }
    /** Unsafe version of {@link #max_clip_distances}. */
    public static int nmax_clip_distances(long struct) { return memGetInt(struct + GLSLangResource.MAX_CLIP_DISTANCES); }
    /** Unsafe version of {@link #max_compute_work_group_count_x}. */
    public static int nmax_compute_work_group_count_x(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_COUNT_X); }
    /** Unsafe version of {@link #max_compute_work_group_count_y}. */
    public static int nmax_compute_work_group_count_y(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_COUNT_Y); }
    /** Unsafe version of {@link #max_compute_work_group_count_z}. */
    public static int nmax_compute_work_group_count_z(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_COUNT_Z); }
    /** Unsafe version of {@link #max_compute_work_group_size_x}. */
    public static int nmax_compute_work_group_size_x(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_SIZE_X); }
    /** Unsafe version of {@link #max_compute_work_group_size_y}. */
    public static int nmax_compute_work_group_size_y(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_SIZE_Y); }
    /** Unsafe version of {@link #max_compute_work_group_size_z}. */
    public static int nmax_compute_work_group_size_z(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_SIZE_Z); }
    /** Unsafe version of {@link #max_compute_uniform_components}. */
    public static int nmax_compute_uniform_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_UNIFORM_COMPONENTS); }
    /** Unsafe version of {@link #max_compute_texture_image_units}. */
    public static int nmax_compute_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_compute_image_uniforms}. */
    public static int nmax_compute_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_compute_atomic_counters}. */
    public static int nmax_compute_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_compute_atomic_counter_buffers}. */
    public static int nmax_compute_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_varying_components}. */
    public static int nmax_varying_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_VARYING_COMPONENTS); }
    /** Unsafe version of {@link #max_vertex_output_components}. */
    public static int nmax_vertex_output_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_OUTPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_geometry_input_components}. */
    public static int nmax_geometry_input_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_INPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_geometry_output_components}. */
    public static int nmax_geometry_output_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_OUTPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_fragment_input_components}. */
    public static int nmax_fragment_input_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_INPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_image_units}. */
    public static int nmax_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_combined_image_units_and_fragment_outputs}. */
    public static int nmax_combined_image_units_and_fragment_outputs(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS); }
    /** Unsafe version of {@link #max_combined_shader_output_resources}. */
    public static int nmax_combined_shader_output_resources(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_SHADER_OUTPUT_RESOURCES); }
    /** Unsafe version of {@link #max_image_samples}. */
    public static int nmax_image_samples(long struct) { return memGetInt(struct + GLSLangResource.MAX_IMAGE_SAMPLES); }
    /** Unsafe version of {@link #max_vertex_image_uniforms}. */
    public static int nmax_vertex_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_tess_control_image_uniforms}. */
    public static int nmax_tess_control_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_tess_evaluation_image_uniforms}. */
    public static int nmax_tess_evaluation_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_geometry_image_uniforms}. */
    public static int nmax_geometry_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_fragment_image_uniforms}. */
    public static int nmax_fragment_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_combined_image_uniforms}. */
    public static int nmax_combined_image_uniforms(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_IMAGE_UNIFORMS); }
    /** Unsafe version of {@link #max_geometry_texture_image_units}. */
    public static int nmax_geometry_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_geometry_output_vertices}. */
    public static int nmax_geometry_output_vertices(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_OUTPUT_VERTICES); }
    /** Unsafe version of {@link #max_geometry_total_output_components}. */
    public static int nmax_geometry_total_output_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_geometry_uniform_components}. */
    public static int nmax_geometry_uniform_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_UNIFORM_COMPONENTS); }
    /** Unsafe version of {@link #max_geometry_varying_components}. */
    public static int nmax_geometry_varying_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_VARYING_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_control_input_components}. */
    public static int nmax_tess_control_input_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_INPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_control_output_components}. */
    public static int nmax_tess_control_output_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_OUTPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_control_texture_image_units}. */
    public static int nmax_tess_control_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_tess_control_uniform_components}. */
    public static int nmax_tess_control_uniform_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_UNIFORM_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_control_total_output_components}. */
    public static int nmax_tess_control_total_output_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_evaluation_input_components}. */
    public static int nmax_tess_evaluation_input_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_INPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_evaluation_output_components}. */
    public static int nmax_tess_evaluation_output_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_OUTPUT_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_evaluation_texture_image_units}. */
    public static int nmax_tess_evaluation_texture_image_units(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS); }
    /** Unsafe version of {@link #max_tess_evaluation_uniform_components}. */
    public static int nmax_tess_evaluation_uniform_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_UNIFORM_COMPONENTS); }
    /** Unsafe version of {@link #max_tess_patch_components}. */
    public static int nmax_tess_patch_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_PATCH_COMPONENTS); }
    /** Unsafe version of {@link #max_patch_vertices}. */
    public static int nmax_patch_vertices(long struct) { return memGetInt(struct + GLSLangResource.MAX_PATCH_VERTICES); }
    /** Unsafe version of {@link #max_tess_gen_level}. */
    public static int nmax_tess_gen_level(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_GEN_LEVEL); }
    /** Unsafe version of {@link #max_viewports}. */
    public static int nmax_viewports(long struct) { return memGetInt(struct + GLSLangResource.MAX_VIEWPORTS); }
    /** Unsafe version of {@link #max_vertex_atomic_counters}. */
    public static int nmax_vertex_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_tess_control_atomic_counters}. */
    public static int nmax_tess_control_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_tess_evaluation_atomic_counters}. */
    public static int nmax_tess_evaluation_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_geometry_atomic_counters}. */
    public static int nmax_geometry_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_fragment_atomic_counters}. */
    public static int nmax_fragment_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_combined_atomic_counters}. */
    public static int nmax_combined_atomic_counters(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_ATOMIC_COUNTERS); }
    /** Unsafe version of {@link #max_atomic_counter_bindings}. */
    public static int nmax_atomic_counter_bindings(long struct) { return memGetInt(struct + GLSLangResource.MAX_ATOMIC_COUNTER_BINDINGS); }
    /** Unsafe version of {@link #max_vertex_atomic_counter_buffers}. */
    public static int nmax_vertex_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_VERTEX_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_tess_control_atomic_counter_buffers}. */
    public static int nmax_tess_control_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_tess_evaluation_atomic_counter_buffers}. */
    public static int nmax_tess_evaluation_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_geometry_atomic_counter_buffers}. */
    public static int nmax_geometry_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_fragment_atomic_counter_buffers}. */
    public static int nmax_fragment_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_combined_atomic_counter_buffers}. */
    public static int nmax_combined_atomic_counter_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_ATOMIC_COUNTER_BUFFERS); }
    /** Unsafe version of {@link #max_atomic_counter_buffer_size}. */
    public static int nmax_atomic_counter_buffer_size(long struct) { return memGetInt(struct + GLSLangResource.MAX_ATOMIC_COUNTER_BUFFER_SIZE); }
    /** Unsafe version of {@link #max_transform_feedback_buffers}. */
    public static int nmax_transform_feedback_buffers(long struct) { return memGetInt(struct + GLSLangResource.MAX_TRANSFORM_FEEDBACK_BUFFERS); }
    /** Unsafe version of {@link #max_transform_feedback_interleaved_components}. */
    public static int nmax_transform_feedback_interleaved_components(long struct) { return memGetInt(struct + GLSLangResource.MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS); }
    /** Unsafe version of {@link #max_cull_distances}. */
    public static int nmax_cull_distances(long struct) { return memGetInt(struct + GLSLangResource.MAX_CULL_DISTANCES); }
    /** Unsafe version of {@link #max_combined_clip_and_cull_distances}. */
    public static int nmax_combined_clip_and_cull_distances(long struct) { return memGetInt(struct + GLSLangResource.MAX_COMBINED_CLIP_AND_CULL_DISTANCES); }
    /** Unsafe version of {@link #max_samples}. */
    public static int nmax_samples(long struct) { return memGetInt(struct + GLSLangResource.MAX_SAMPLES); }
    /** Unsafe version of {@link #max_mesh_output_vertices_nv}. */
    public static int nmax_mesh_output_vertices_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_OUTPUT_VERTICES_NV); }
    /** Unsafe version of {@link #max_mesh_output_primitives_nv}. */
    public static int nmax_mesh_output_primitives_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_OUTPUT_PRIMITIVES_NV); }
    /** Unsafe version of {@link #max_mesh_work_group_size_x_nv}. */
    public static int nmax_mesh_work_group_size_x_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_X_NV); }
    /** Unsafe version of {@link #max_mesh_work_group_size_y_nv}. */
    public static int nmax_mesh_work_group_size_y_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Y_NV); }
    /** Unsafe version of {@link #max_mesh_work_group_size_z_nv}. */
    public static int nmax_mesh_work_group_size_z_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Z_NV); }
    /** Unsafe version of {@link #max_task_work_group_size_x_nv}. */
    public static int nmax_task_work_group_size_x_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_X_NV); }
    /** Unsafe version of {@link #max_task_work_group_size_y_nv}. */
    public static int nmax_task_work_group_size_y_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Y_NV); }
    /** Unsafe version of {@link #max_task_work_group_size_z_nv}. */
    public static int nmax_task_work_group_size_z_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Z_NV); }
    /** Unsafe version of {@link #max_mesh_view_count_nv}. */
    public static int nmax_mesh_view_count_nv(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_VIEW_COUNT_NV); }
    /** Unsafe version of {@link #max_mesh_output_vertices_ext}. */
    public static int nmax_mesh_output_vertices_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_OUTPUT_VERTICES_EXT); }
    /** Unsafe version of {@link #max_mesh_output_primitives_ext}. */
    public static int nmax_mesh_output_primitives_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_OUTPUT_PRIMITIVES_EXT); }
    /** Unsafe version of {@link #max_mesh_work_group_size_x_ext}. */
    public static int nmax_mesh_work_group_size_x_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_X_EXT); }
    /** Unsafe version of {@link #max_mesh_work_group_size_y_ext}. */
    public static int nmax_mesh_work_group_size_y_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Y_EXT); }
    /** Unsafe version of {@link #max_mesh_work_group_size_z_ext}. */
    public static int nmax_mesh_work_group_size_z_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Z_EXT); }
    /** Unsafe version of {@link #max_task_work_group_size_x_ext}. */
    public static int nmax_task_work_group_size_x_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_X_EXT); }
    /** Unsafe version of {@link #max_task_work_group_size_y_ext}. */
    public static int nmax_task_work_group_size_y_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Y_EXT); }
    /** Unsafe version of {@link #max_task_work_group_size_z_ext}. */
    public static int nmax_task_work_group_size_z_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Z_EXT); }
    /** Unsafe version of {@link #max_mesh_view_count_ext}. */
    public static int nmax_mesh_view_count_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_MESH_VIEW_COUNT_EXT); }
    /** Unsafe version of {@link #max_dual_source_draw_buffers_ext}. */
    public static int nmax_dual_source_draw_buffers_ext(long struct) { return memGetInt(struct + GLSLangResource.MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT); }
    /** Unsafe version of {@link #limits}. */
    public static GLSLangLimits nlimits(long struct) { return GLSLangLimits.create(struct + GLSLangResource.LIMITS); }

    /** Unsafe version of {@link #max_lights(int) max_lights}. */
    public static void nmax_lights(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_LIGHTS, value); }
    /** Unsafe version of {@link #max_clip_planes(int) max_clip_planes}. */
    public static void nmax_clip_planes(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_CLIP_PLANES, value); }
    /** Unsafe version of {@link #max_texture_units(int) max_texture_units}. */
    public static void nmax_texture_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TEXTURE_UNITS, value); }
    /** Unsafe version of {@link #max_texture_coords(int) max_texture_coords}. */
    public static void nmax_texture_coords(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TEXTURE_COORDS, value); }
    /** Unsafe version of {@link #max_vertex_attribs(int) max_vertex_attribs}. */
    public static void nmax_vertex_attribs(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_ATTRIBS, value); }
    /** Unsafe version of {@link #max_vertex_uniform_components(int) max_vertex_uniform_components}. */
    public static void nmax_vertex_uniform_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_UNIFORM_COMPONENTS, value); }
    /** Unsafe version of {@link #max_varying_floats(int) max_varying_floats}. */
    public static void nmax_varying_floats(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VARYING_FLOATS, value); }
    /** Unsafe version of {@link #max_vertex_texture_image_units(int) max_vertex_texture_image_units}. */
    public static void nmax_vertex_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_combined_texture_image_units(int) max_combined_texture_image_units}. */
    public static void nmax_combined_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_texture_image_units(int) max_texture_image_units}. */
    public static void nmax_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_fragment_uniform_components(int) max_fragment_uniform_components}. */
    public static void nmax_fragment_uniform_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_UNIFORM_COMPONENTS, value); }
    /** Unsafe version of {@link #max_draw_buffers(int) max_draw_buffers}. */
    public static void nmax_draw_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_DRAW_BUFFERS, value); }
    /** Unsafe version of {@link #max_vertex_uniform_vectors(int) max_vertex_uniform_vectors}. */
    public static void nmax_vertex_uniform_vectors(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_UNIFORM_VECTORS, value); }
    /** Unsafe version of {@link #max_varying_vectors(int) max_varying_vectors}. */
    public static void nmax_varying_vectors(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VARYING_VECTORS, value); }
    /** Unsafe version of {@link #max_fragment_uniform_vectors(int) max_fragment_uniform_vectors}. */
    public static void nmax_fragment_uniform_vectors(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_UNIFORM_VECTORS, value); }
    /** Unsafe version of {@link #max_vertex_output_vectors(int) max_vertex_output_vectors}. */
    public static void nmax_vertex_output_vectors(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_OUTPUT_VECTORS, value); }
    /** Unsafe version of {@link #max_fragment_input_vectors(int) max_fragment_input_vectors}. */
    public static void nmax_fragment_input_vectors(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_INPUT_VECTORS, value); }
    /** Unsafe version of {@link #min_program_texel_offset(int) min_program_texel_offset}. */
    public static void nmin_program_texel_offset(long struct, int value) { memPutInt(struct + GLSLangResource.MIN_PROGRAM_TEXEL_OFFSET, value); }
    /** Unsafe version of {@link #max_program_texel_offset(int) max_program_texel_offset}. */
    public static void nmax_program_texel_offset(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_PROGRAM_TEXEL_OFFSET, value); }
    /** Unsafe version of {@link #max_clip_distances(int) max_clip_distances}. */
    public static void nmax_clip_distances(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_CLIP_DISTANCES, value); }
    /** Unsafe version of {@link #max_compute_work_group_count_x(int) max_compute_work_group_count_x}. */
    public static void nmax_compute_work_group_count_x(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_COUNT_X, value); }
    /** Unsafe version of {@link #max_compute_work_group_count_y(int) max_compute_work_group_count_y}. */
    public static void nmax_compute_work_group_count_y(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_COUNT_Y, value); }
    /** Unsafe version of {@link #max_compute_work_group_count_z(int) max_compute_work_group_count_z}. */
    public static void nmax_compute_work_group_count_z(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_COUNT_Z, value); }
    /** Unsafe version of {@link #max_compute_work_group_size_x(int) max_compute_work_group_size_x}. */
    public static void nmax_compute_work_group_size_x(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_SIZE_X, value); }
    /** Unsafe version of {@link #max_compute_work_group_size_y(int) max_compute_work_group_size_y}. */
    public static void nmax_compute_work_group_size_y(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_SIZE_Y, value); }
    /** Unsafe version of {@link #max_compute_work_group_size_z(int) max_compute_work_group_size_z}. */
    public static void nmax_compute_work_group_size_z(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_WORK_GROUP_SIZE_Z, value); }
    /** Unsafe version of {@link #max_compute_uniform_components(int) max_compute_uniform_components}. */
    public static void nmax_compute_uniform_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_UNIFORM_COMPONENTS, value); }
    /** Unsafe version of {@link #max_compute_texture_image_units(int) max_compute_texture_image_units}. */
    public static void nmax_compute_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_compute_image_uniforms(int) max_compute_image_uniforms}. */
    public static void nmax_compute_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_compute_atomic_counters(int) max_compute_atomic_counters}. */
    public static void nmax_compute_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_compute_atomic_counter_buffers(int) max_compute_atomic_counter_buffers}. */
    public static void nmax_compute_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_varying_components(int) max_varying_components}. */
    public static void nmax_varying_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VARYING_COMPONENTS, value); }
    /** Unsafe version of {@link #max_vertex_output_components(int) max_vertex_output_components}. */
    public static void nmax_vertex_output_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_OUTPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_geometry_input_components(int) max_geometry_input_components}. */
    public static void nmax_geometry_input_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_INPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_geometry_output_components(int) max_geometry_output_components}. */
    public static void nmax_geometry_output_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_OUTPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_fragment_input_components(int) max_fragment_input_components}. */
    public static void nmax_fragment_input_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_INPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_image_units(int) max_image_units}. */
    public static void nmax_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_combined_image_units_and_fragment_outputs(int) max_combined_image_units_and_fragment_outputs}. */
    public static void nmax_combined_image_units_and_fragment_outputs(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS, value); }
    /** Unsafe version of {@link #max_combined_shader_output_resources(int) max_combined_shader_output_resources}. */
    public static void nmax_combined_shader_output_resources(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_SHADER_OUTPUT_RESOURCES, value); }
    /** Unsafe version of {@link #max_image_samples(int) max_image_samples}. */
    public static void nmax_image_samples(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_IMAGE_SAMPLES, value); }
    /** Unsafe version of {@link #max_vertex_image_uniforms(int) max_vertex_image_uniforms}. */
    public static void nmax_vertex_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_tess_control_image_uniforms(int) max_tess_control_image_uniforms}. */
    public static void nmax_tess_control_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_image_uniforms(int) max_tess_evaluation_image_uniforms}. */
    public static void nmax_tess_evaluation_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_geometry_image_uniforms(int) max_geometry_image_uniforms}. */
    public static void nmax_geometry_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_fragment_image_uniforms(int) max_fragment_image_uniforms}. */
    public static void nmax_fragment_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_combined_image_uniforms(int) max_combined_image_uniforms}. */
    public static void nmax_combined_image_uniforms(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_IMAGE_UNIFORMS, value); }
    /** Unsafe version of {@link #max_geometry_texture_image_units(int) max_geometry_texture_image_units}. */
    public static void nmax_geometry_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_geometry_output_vertices(int) max_geometry_output_vertices}. */
    public static void nmax_geometry_output_vertices(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_OUTPUT_VERTICES, value); }
    /** Unsafe version of {@link #max_geometry_total_output_components(int) max_geometry_total_output_components}. */
    public static void nmax_geometry_total_output_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_geometry_uniform_components(int) max_geometry_uniform_components}. */
    public static void nmax_geometry_uniform_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_UNIFORM_COMPONENTS, value); }
    /** Unsafe version of {@link #max_geometry_varying_components(int) max_geometry_varying_components}. */
    public static void nmax_geometry_varying_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_VARYING_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_control_input_components(int) max_tess_control_input_components}. */
    public static void nmax_tess_control_input_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_INPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_control_output_components(int) max_tess_control_output_components}. */
    public static void nmax_tess_control_output_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_OUTPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_control_texture_image_units(int) max_tess_control_texture_image_units}. */
    public static void nmax_tess_control_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_tess_control_uniform_components(int) max_tess_control_uniform_components}. */
    public static void nmax_tess_control_uniform_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_UNIFORM_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_control_total_output_components(int) max_tess_control_total_output_components}. */
    public static void nmax_tess_control_total_output_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_input_components(int) max_tess_evaluation_input_components}. */
    public static void nmax_tess_evaluation_input_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_INPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_output_components(int) max_tess_evaluation_output_components}. */
    public static void nmax_tess_evaluation_output_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_OUTPUT_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_texture_image_units(int) max_tess_evaluation_texture_image_units}. */
    public static void nmax_tess_evaluation_texture_image_units(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_uniform_components(int) max_tess_evaluation_uniform_components}. */
    public static void nmax_tess_evaluation_uniform_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_UNIFORM_COMPONENTS, value); }
    /** Unsafe version of {@link #max_tess_patch_components(int) max_tess_patch_components}. */
    public static void nmax_tess_patch_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_PATCH_COMPONENTS, value); }
    /** Unsafe version of {@link #max_patch_vertices(int) max_patch_vertices}. */
    public static void nmax_patch_vertices(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_PATCH_VERTICES, value); }
    /** Unsafe version of {@link #max_tess_gen_level(int) max_tess_gen_level}. */
    public static void nmax_tess_gen_level(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_GEN_LEVEL, value); }
    /** Unsafe version of {@link #max_viewports(int) max_viewports}. */
    public static void nmax_viewports(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VIEWPORTS, value); }
    /** Unsafe version of {@link #max_vertex_atomic_counters(int) max_vertex_atomic_counters}. */
    public static void nmax_vertex_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_tess_control_atomic_counters(int) max_tess_control_atomic_counters}. */
    public static void nmax_tess_control_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_atomic_counters(int) max_tess_evaluation_atomic_counters}. */
    public static void nmax_tess_evaluation_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_geometry_atomic_counters(int) max_geometry_atomic_counters}. */
    public static void nmax_geometry_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_fragment_atomic_counters(int) max_fragment_atomic_counters}. */
    public static void nmax_fragment_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_combined_atomic_counters(int) max_combined_atomic_counters}. */
    public static void nmax_combined_atomic_counters(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_ATOMIC_COUNTERS, value); }
    /** Unsafe version of {@link #max_atomic_counter_bindings(int) max_atomic_counter_bindings}. */
    public static void nmax_atomic_counter_bindings(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_ATOMIC_COUNTER_BINDINGS, value); }
    /** Unsafe version of {@link #max_vertex_atomic_counter_buffers(int) max_vertex_atomic_counter_buffers}. */
    public static void nmax_vertex_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_VERTEX_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_tess_control_atomic_counter_buffers(int) max_tess_control_atomic_counter_buffers}. */
    public static void nmax_tess_control_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_tess_evaluation_atomic_counter_buffers(int) max_tess_evaluation_atomic_counter_buffers}. */
    public static void nmax_tess_evaluation_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_geometry_atomic_counter_buffers(int) max_geometry_atomic_counter_buffers}. */
    public static void nmax_geometry_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_fragment_atomic_counter_buffers(int) max_fragment_atomic_counter_buffers}. */
    public static void nmax_fragment_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_combined_atomic_counter_buffers(int) max_combined_atomic_counter_buffers}. */
    public static void nmax_combined_atomic_counter_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_ATOMIC_COUNTER_BUFFERS, value); }
    /** Unsafe version of {@link #max_atomic_counter_buffer_size(int) max_atomic_counter_buffer_size}. */
    public static void nmax_atomic_counter_buffer_size(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_ATOMIC_COUNTER_BUFFER_SIZE, value); }
    /** Unsafe version of {@link #max_transform_feedback_buffers(int) max_transform_feedback_buffers}. */
    public static void nmax_transform_feedback_buffers(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TRANSFORM_FEEDBACK_BUFFERS, value); }
    /** Unsafe version of {@link #max_transform_feedback_interleaved_components(int) max_transform_feedback_interleaved_components}. */
    public static void nmax_transform_feedback_interleaved_components(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS, value); }
    /** Unsafe version of {@link #max_cull_distances(int) max_cull_distances}. */
    public static void nmax_cull_distances(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_CULL_DISTANCES, value); }
    /** Unsafe version of {@link #max_combined_clip_and_cull_distances(int) max_combined_clip_and_cull_distances}. */
    public static void nmax_combined_clip_and_cull_distances(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_COMBINED_CLIP_AND_CULL_DISTANCES, value); }
    /** Unsafe version of {@link #max_samples(int) max_samples}. */
    public static void nmax_samples(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_SAMPLES, value); }
    /** Unsafe version of {@link #max_mesh_output_vertices_nv(int) max_mesh_output_vertices_nv}. */
    public static void nmax_mesh_output_vertices_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_OUTPUT_VERTICES_NV, value); }
    /** Unsafe version of {@link #max_mesh_output_primitives_nv(int) max_mesh_output_primitives_nv}. */
    public static void nmax_mesh_output_primitives_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_OUTPUT_PRIMITIVES_NV, value); }
    /** Unsafe version of {@link #max_mesh_work_group_size_x_nv(int) max_mesh_work_group_size_x_nv}. */
    public static void nmax_mesh_work_group_size_x_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_X_NV, value); }
    /** Unsafe version of {@link #max_mesh_work_group_size_y_nv(int) max_mesh_work_group_size_y_nv}. */
    public static void nmax_mesh_work_group_size_y_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Y_NV, value); }
    /** Unsafe version of {@link #max_mesh_work_group_size_z_nv(int) max_mesh_work_group_size_z_nv}. */
    public static void nmax_mesh_work_group_size_z_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Z_NV, value); }
    /** Unsafe version of {@link #max_task_work_group_size_x_nv(int) max_task_work_group_size_x_nv}. */
    public static void nmax_task_work_group_size_x_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_X_NV, value); }
    /** Unsafe version of {@link #max_task_work_group_size_y_nv(int) max_task_work_group_size_y_nv}. */
    public static void nmax_task_work_group_size_y_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Y_NV, value); }
    /** Unsafe version of {@link #max_task_work_group_size_z_nv(int) max_task_work_group_size_z_nv}. */
    public static void nmax_task_work_group_size_z_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Z_NV, value); }
    /** Unsafe version of {@link #max_mesh_view_count_nv(int) max_mesh_view_count_nv}. */
    public static void nmax_mesh_view_count_nv(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_VIEW_COUNT_NV, value); }
    /** Unsafe version of {@link #max_mesh_output_vertices_ext(int) max_mesh_output_vertices_ext}. */
    public static void nmax_mesh_output_vertices_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_OUTPUT_VERTICES_EXT, value); }
    /** Unsafe version of {@link #max_mesh_output_primitives_ext(int) max_mesh_output_primitives_ext}. */
    public static void nmax_mesh_output_primitives_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_OUTPUT_PRIMITIVES_EXT, value); }
    /** Unsafe version of {@link #max_mesh_work_group_size_x_ext(int) max_mesh_work_group_size_x_ext}. */
    public static void nmax_mesh_work_group_size_x_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_X_EXT, value); }
    /** Unsafe version of {@link #max_mesh_work_group_size_y_ext(int) max_mesh_work_group_size_y_ext}. */
    public static void nmax_mesh_work_group_size_y_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Y_EXT, value); }
    /** Unsafe version of {@link #max_mesh_work_group_size_z_ext(int) max_mesh_work_group_size_z_ext}. */
    public static void nmax_mesh_work_group_size_z_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_WORK_GROUP_SIZE_Z_EXT, value); }
    /** Unsafe version of {@link #max_task_work_group_size_x_ext(int) max_task_work_group_size_x_ext}. */
    public static void nmax_task_work_group_size_x_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_X_EXT, value); }
    /** Unsafe version of {@link #max_task_work_group_size_y_ext(int) max_task_work_group_size_y_ext}. */
    public static void nmax_task_work_group_size_y_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Y_EXT, value); }
    /** Unsafe version of {@link #max_task_work_group_size_z_ext(int) max_task_work_group_size_z_ext}. */
    public static void nmax_task_work_group_size_z_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_TASK_WORK_GROUP_SIZE_Z_EXT, value); }
    /** Unsafe version of {@link #max_mesh_view_count_ext(int) max_mesh_view_count_ext}. */
    public static void nmax_mesh_view_count_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_MESH_VIEW_COUNT_EXT, value); }
    /** Unsafe version of {@link #max_dual_source_draw_buffers_ext(int) max_dual_source_draw_buffers_ext}. */
    public static void nmax_dual_source_draw_buffers_ext(long struct, int value) { memPutInt(struct + GLSLangResource.MAX_DUAL_SOURCE_DRAW_BUFFERS_EXT, value); }
    /** Unsafe version of {@link #limits(GLSLangLimits) limits}. */
    public static void nlimits(long struct, GLSLangLimits value) { memCopy(value.address(), struct + GLSLangResource.LIMITS, GLSLangLimits.SIZEOF); }

    // -----------------------------------

    /** An array of {@link GLSLangResource} structs. */
    public static class Buffer extends StructBuffer<GLSLangResource, Buffer> implements NativeResource {

        private static final GLSLangResource ELEMENT_FACTORY = GLSLangResource.create(-1L);

        /**
         * Creates a new {@code GLSLangResource.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link GLSLangResource#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected GLSLangResource getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code max_lights} field. */
        public int max_lights() { return GLSLangResource.nmax_lights(address()); }
        /** @return the value of the {@code max_clip_planes} field. */
        public int max_clip_planes() { return GLSLangResource.nmax_clip_planes(address()); }
        /** @return the value of the {@code max_texture_units} field. */
        public int max_texture_units() { return GLSLangResource.nmax_texture_units(address()); }
        /** @return the value of the {@code max_texture_coords} field. */
        public int max_texture_coords() { return GLSLangResource.nmax_texture_coords(address()); }
        /** @return the value of the {@code max_vertex_attribs} field. */
        public int max_vertex_attribs() { return GLSLangResource.nmax_vertex_attribs(address()); }
        /** @return the value of the {@code max_vertex_uniform_components} field. */
        public int max_vertex_uniform_components() { return GLSLangResource.nmax_vertex_uniform_components(address()); }
        /** @return the value of the {@code max_varying_floats} field. */
        public int max_varying_floats() { return GLSLangResource.nmax_varying_floats(address()); }
        /** @return the value of the {@code max_vertex_texture_image_units} field. */
        public int max_vertex_texture_image_units() { return GLSLangResource.nmax_vertex_texture_image_units(address()); }
        /** @return the value of the {@code max_combined_texture_image_units} field. */
        public int max_combined_texture_image_units() { return GLSLangResource.nmax_combined_texture_image_units(address()); }
        /** @return the value of the {@code max_texture_image_units} field. */
        public int max_texture_image_units() { return GLSLangResource.nmax_texture_image_units(address()); }
        /** @return the value of the {@code max_fragment_uniform_components} field. */
        public int max_fragment_uniform_components() { return GLSLangResource.nmax_fragment_uniform_components(address()); }
        /** @return the value of the {@code max_draw_buffers} field. */
        public int max_draw_buffers() { return GLSLangResource.nmax_draw_buffers(address()); }
        /** @return the value of the {@code max_vertex_uniform_vectors} field. */
        public int max_vertex_uniform_vectors() { return GLSLangResource.nmax_vertex_uniform_vectors(address()); }
        /** @return the value of the {@code max_varying_vectors} field. */
        public int max_varying_vectors() { return GLSLangResource.nmax_varying_vectors(address()); }
        /** @return the value of the {@code max_fragment_uniform_vectors} field. */
        public int max_fragment_uniform_vectors() { return GLSLangResource.nmax_fragment_uniform_vectors(address()); }
        /** @return the value of the {@code max_vertex_output_vectors} field. */
        public int max_vertex_output_vectors() { return GLSLangResource.nmax_vertex_output_vectors(address()); }
        /** @return the value of the {@code max_fragment_input_vectors} field. */
        public int max_fragment_input_vectors() { return GLSLangResource.nmax_fragment_input_vectors(address()); }
        /** @return the value of the {@code min_program_texel_offset} field. */
        public int min_program_texel_offset() { return GLSLangResource.nmin_program_texel_offset(address()); }
        /** @return the value of the {@code max_program_texel_offset} field. */
        public int max_program_texel_offset() { return GLSLangResource.nmax_program_texel_offset(address()); }
        /** @return the value of the {@code max_clip_distances} field. */
        public int max_clip_distances() { return GLSLangResource.nmax_clip_distances(address()); }
        /** @return the value of the {@code max_compute_work_group_count_x} field. */
        public int max_compute_work_group_count_x() { return GLSLangResource.nmax_compute_work_group_count_x(address()); }
        /** @return the value of the {@code max_compute_work_group_count_y} field. */
        public int max_compute_work_group_count_y() { return GLSLangResource.nmax_compute_work_group_count_y(address()); }
        /** @return the value of the {@code max_compute_work_group_count_z} field. */
        public int max_compute_work_group_count_z() { return GLSLangResource.nmax_compute_work_group_count_z(address()); }
        /** @return the value of the {@code max_compute_work_group_size_x} field. */
        public int max_compute_work_group_size_x() { return GLSLangResource.nmax_compute_work_group_size_x(address()); }
        /** @return the value of the {@code max_compute_work_group_size_y} field. */
        public int max_compute_work_group_size_y() { return GLSLangResource.nmax_compute_work_group_size_y(address()); }
        /** @return the value of the {@code max_compute_work_group_size_z} field. */
        public int max_compute_work_group_size_z() { return GLSLangResource.nmax_compute_work_group_size_z(address()); }
        /** @return the value of the {@code max_compute_uniform_components} field. */
        public int max_compute_uniform_components() { return GLSLangResource.nmax_compute_uniform_components(address()); }
        /** @return the value of the {@code max_compute_texture_image_units} field. */
        public int max_compute_texture_image_units() { return GLSLangResource.nmax_compute_texture_image_units(address()); }
        /** @return the value of the {@code max_compute_image_uniforms} field. */
        public int max_compute_image_uniforms() { return GLSLangResource.nmax_compute_image_uniforms(address()); }
        /** @return the value of the {@code max_compute_atomic_counters} field. */
        public int max_compute_atomic_counters() { return GLSLangResource.nmax_compute_atomic_counters(address()); }
        /** @return the value of the {@code max_compute_atomic_counter_buffers} field. */
        public int max_compute_atomic_counter_buffers() { return GLSLangResource.nmax_compute_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_varying_components} field. */
        public int max_varying_components() { return GLSLangResource.nmax_varying_components(address()); }
        /** @return the value of the {@code max_vertex_output_components} field. */
        public int max_vertex_output_components() { return GLSLangResource.nmax_vertex_output_components(address()); }
        /** @return the value of the {@code max_geometry_input_components} field. */
        public int max_geometry_input_components() { return GLSLangResource.nmax_geometry_input_components(address()); }
        /** @return the value of the {@code max_geometry_output_components} field. */
        public int max_geometry_output_components() { return GLSLangResource.nmax_geometry_output_components(address()); }
        /** @return the value of the {@code max_fragment_input_components} field. */
        public int max_fragment_input_components() { return GLSLangResource.nmax_fragment_input_components(address()); }
        /** @return the value of the {@code max_image_units} field. */
        public int max_image_units() { return GLSLangResource.nmax_image_units(address()); }
        /** @return the value of the {@code max_combined_image_units_and_fragment_outputs} field. */
        public int max_combined_image_units_and_fragment_outputs() { return GLSLangResource.nmax_combined_image_units_and_fragment_outputs(address()); }
        /** @return the value of the {@code max_combined_shader_output_resources} field. */
        public int max_combined_shader_output_resources() { return GLSLangResource.nmax_combined_shader_output_resources(address()); }
        /** @return the value of the {@code max_image_samples} field. */
        public int max_image_samples() { return GLSLangResource.nmax_image_samples(address()); }
        /** @return the value of the {@code max_vertex_image_uniforms} field. */
        public int max_vertex_image_uniforms() { return GLSLangResource.nmax_vertex_image_uniforms(address()); }
        /** @return the value of the {@code max_tess_control_image_uniforms} field. */
        public int max_tess_control_image_uniforms() { return GLSLangResource.nmax_tess_control_image_uniforms(address()); }
        /** @return the value of the {@code max_tess_evaluation_image_uniforms} field. */
        public int max_tess_evaluation_image_uniforms() { return GLSLangResource.nmax_tess_evaluation_image_uniforms(address()); }
        /** @return the value of the {@code max_geometry_image_uniforms} field. */
        public int max_geometry_image_uniforms() { return GLSLangResource.nmax_geometry_image_uniforms(address()); }
        /** @return the value of the {@code max_fragment_image_uniforms} field. */
        public int max_fragment_image_uniforms() { return GLSLangResource.nmax_fragment_image_uniforms(address()); }
        /** @return the value of the {@code max_combined_image_uniforms} field. */
        public int max_combined_image_uniforms() { return GLSLangResource.nmax_combined_image_uniforms(address()); }
        /** @return the value of the {@code max_geometry_texture_image_units} field. */
        public int max_geometry_texture_image_units() { return GLSLangResource.nmax_geometry_texture_image_units(address()); }
        /** @return the value of the {@code max_geometry_output_vertices} field. */
        public int max_geometry_output_vertices() { return GLSLangResource.nmax_geometry_output_vertices(address()); }
        /** @return the value of the {@code max_geometry_total_output_components} field. */
        public int max_geometry_total_output_components() { return GLSLangResource.nmax_geometry_total_output_components(address()); }
        /** @return the value of the {@code max_geometry_uniform_components} field. */
        public int max_geometry_uniform_components() { return GLSLangResource.nmax_geometry_uniform_components(address()); }
        /** @return the value of the {@code max_geometry_varying_components} field. */
        public int max_geometry_varying_components() { return GLSLangResource.nmax_geometry_varying_components(address()); }
        /** @return the value of the {@code max_tess_control_input_components} field. */
        public int max_tess_control_input_components() { return GLSLangResource.nmax_tess_control_input_components(address()); }
        /** @return the value of the {@code max_tess_control_output_components} field. */
        public int max_tess_control_output_components() { return GLSLangResource.nmax_tess_control_output_components(address()); }
        /** @return the value of the {@code max_tess_control_texture_image_units} field. */
        public int max_tess_control_texture_image_units() { return GLSLangResource.nmax_tess_control_texture_image_units(address()); }
        /** @return the value of the {@code max_tess_control_uniform_components} field. */
        public int max_tess_control_uniform_components() { return GLSLangResource.nmax_tess_control_uniform_components(address()); }
        /** @return the value of the {@code max_tess_control_total_output_components} field. */
        public int max_tess_control_total_output_components() { return GLSLangResource.nmax_tess_control_total_output_components(address()); }
        /** @return the value of the {@code max_tess_evaluation_input_components} field. */
        public int max_tess_evaluation_input_components() { return GLSLangResource.nmax_tess_evaluation_input_components(address()); }
        /** @return the value of the {@code max_tess_evaluation_output_components} field. */
        public int max_tess_evaluation_output_components() { return GLSLangResource.nmax_tess_evaluation_output_components(address()); }
        /** @return the value of the {@code max_tess_evaluation_texture_image_units} field. */
        public int max_tess_evaluation_texture_image_units() { return GLSLangResource.nmax_tess_evaluation_texture_image_units(address()); }
        /** @return the value of the {@code max_tess_evaluation_uniform_components} field. */
        public int max_tess_evaluation_uniform_components() { return GLSLangResource.nmax_tess_evaluation_uniform_components(address()); }
        /** @return the value of the {@code max_tess_patch_components} field. */
        public int max_tess_patch_components() { return GLSLangResource.nmax_tess_patch_components(address()); }
        /** @return the value of the {@code max_patch_vertices} field. */
        public int max_patch_vertices() { return GLSLangResource.nmax_patch_vertices(address()); }
        /** @return the value of the {@code max_tess_gen_level} field. */
        public int max_tess_gen_level() { return GLSLangResource.nmax_tess_gen_level(address()); }
        /** @return the value of the {@code max_viewports} field. */
        public int max_viewports() { return GLSLangResource.nmax_viewports(address()); }
        /** @return the value of the {@code max_vertex_atomic_counters} field. */
        public int max_vertex_atomic_counters() { return GLSLangResource.nmax_vertex_atomic_counters(address()); }
        /** @return the value of the {@code max_tess_control_atomic_counters} field. */
        public int max_tess_control_atomic_counters() { return GLSLangResource.nmax_tess_control_atomic_counters(address()); }
        /** @return the value of the {@code max_tess_evaluation_atomic_counters} field. */
        public int max_tess_evaluation_atomic_counters() { return GLSLangResource.nmax_tess_evaluation_atomic_counters(address()); }
        /** @return the value of the {@code max_geometry_atomic_counters} field. */
        public int max_geometry_atomic_counters() { return GLSLangResource.nmax_geometry_atomic_counters(address()); }
        /** @return the value of the {@code max_fragment_atomic_counters} field. */
        public int max_fragment_atomic_counters() { return GLSLangResource.nmax_fragment_atomic_counters(address()); }
        /** @return the value of the {@code max_combined_atomic_counters} field. */
        public int max_combined_atomic_counters() { return GLSLangResource.nmax_combined_atomic_counters(address()); }
        /** @return the value of the {@code max_atomic_counter_bindings} field. */
        public int max_atomic_counter_bindings() { return GLSLangResource.nmax_atomic_counter_bindings(address()); }
        /** @return the value of the {@code max_vertex_atomic_counter_buffers} field. */
        public int max_vertex_atomic_counter_buffers() { return GLSLangResource.nmax_vertex_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_tess_control_atomic_counter_buffers} field. */
        public int max_tess_control_atomic_counter_buffers() { return GLSLangResource.nmax_tess_control_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_tess_evaluation_atomic_counter_buffers} field. */
        public int max_tess_evaluation_atomic_counter_buffers() { return GLSLangResource.nmax_tess_evaluation_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_geometry_atomic_counter_buffers} field. */
        public int max_geometry_atomic_counter_buffers() { return GLSLangResource.nmax_geometry_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_fragment_atomic_counter_buffers} field. */
        public int max_fragment_atomic_counter_buffers() { return GLSLangResource.nmax_fragment_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_combined_atomic_counter_buffers} field. */
        public int max_combined_atomic_counter_buffers() { return GLSLangResource.nmax_combined_atomic_counter_buffers(address()); }
        /** @return the value of the {@code max_atomic_counter_buffer_size} field. */
        public int max_atomic_counter_buffer_size() { return GLSLangResource.nmax_atomic_counter_buffer_size(address()); }
        /** @return the value of the {@code max_transform_feedback_buffers} field. */
        public int max_transform_feedback_buffers() { return GLSLangResource.nmax_transform_feedback_buffers(address()); }
        /** @return the value of the {@code max_transform_feedback_interleaved_components} field. */
        public int max_transform_feedback_interleaved_components() { return GLSLangResource.nmax_transform_feedback_interleaved_components(address()); }
        /** @return the value of the {@code max_cull_distances} field. */
        public int max_cull_distances() { return GLSLangResource.nmax_cull_distances(address()); }
        /** @return the value of the {@code max_combined_clip_and_cull_distances} field. */
        public int max_combined_clip_and_cull_distances() { return GLSLangResource.nmax_combined_clip_and_cull_distances(address()); }
        /** @return the value of the {@code max_samples} field. */
        public int max_samples() { return GLSLangResource.nmax_samples(address()); }
        /** @return the value of the {@code max_mesh_output_vertices_nv} field. */
        public int max_mesh_output_vertices_nv() { return GLSLangResource.nmax_mesh_output_vertices_nv(address()); }
        /** @return the value of the {@code max_mesh_output_primitives_nv} field. */
        public int max_mesh_output_primitives_nv() { return GLSLangResource.nmax_mesh_output_primitives_nv(address()); }
        /** @return the value of the {@code max_mesh_work_group_size_x_nv} field. */
        public int max_mesh_work_group_size_x_nv() { return GLSLangResource.nmax_mesh_work_group_size_x_nv(address()); }
        /** @return the value of the {@code max_mesh_work_group_size_y_nv} field. */
        public int max_mesh_work_group_size_y_nv() { return GLSLangResource.nmax_mesh_work_group_size_y_nv(address()); }
        /** @return the value of the {@code max_mesh_work_group_size_z_nv} field. */
        public int max_mesh_work_group_size_z_nv() { return GLSLangResource.nmax_mesh_work_group_size_z_nv(address()); }
        /** @return the value of the {@code max_task_work_group_size_x_nv} field. */
        public int max_task_work_group_size_x_nv() { return GLSLangResource.nmax_task_work_group_size_x_nv(address()); }
        /** @return the value of the {@code max_task_work_group_size_y_nv} field. */
        public int max_task_work_group_size_y_nv() { return GLSLangResource.nmax_task_work_group_size_y_nv(address()); }
        /** @return the value of the {@code max_task_work_group_size_z_nv} field. */
        public int max_task_work_group_size_z_nv() { return GLSLangResource.nmax_task_work_group_size_z_nv(address()); }
        /** @return the value of the {@code max_mesh_view_count_nv} field. */
        public int max_mesh_view_count_nv() { return GLSLangResource.nmax_mesh_view_count_nv(address()); }
        /** @return the value of the {@code max_mesh_output_vertices_ext} field. */
        public int max_mesh_output_vertices_ext() { return GLSLangResource.nmax_mesh_output_vertices_ext(address()); }
        /** @return the value of the {@code max_mesh_output_primitives_ext} field. */
        public int max_mesh_output_primitives_ext() { return GLSLangResource.nmax_mesh_output_primitives_ext(address()); }
        /** @return the value of the {@code max_mesh_work_group_size_x_ext} field. */
        public int max_mesh_work_group_size_x_ext() { return GLSLangResource.nmax_mesh_work_group_size_x_ext(address()); }
        /** @return the value of the {@code max_mesh_work_group_size_y_ext} field. */
        public int max_mesh_work_group_size_y_ext() { return GLSLangResource.nmax_mesh_work_group_size_y_ext(address()); }
        /** @return the value of the {@code max_mesh_work_group_size_z_ext} field. */
        public int max_mesh_work_group_size_z_ext() { return GLSLangResource.nmax_mesh_work_group_size_z_ext(address()); }
        /** @return the value of the {@code max_task_work_group_size_x_ext} field. */
        public int max_task_work_group_size_x_ext() { return GLSLangResource.nmax_task_work_group_size_x_ext(address()); }
        /** @return the value of the {@code max_task_work_group_size_y_ext} field. */
        public int max_task_work_group_size_y_ext() { return GLSLangResource.nmax_task_work_group_size_y_ext(address()); }
        /** @return the value of the {@code max_task_work_group_size_z_ext} field. */
        public int max_task_work_group_size_z_ext() { return GLSLangResource.nmax_task_work_group_size_z_ext(address()); }
        /** @return the value of the {@code max_mesh_view_count_ext} field. */
        public int max_mesh_view_count_ext() { return GLSLangResource.nmax_mesh_view_count_ext(address()); }
        /** @return the value of the {@code max_dual_source_draw_buffers_ext} field. */
        public int max_dual_source_draw_buffers_ext() { return GLSLangResource.nmax_dual_source_draw_buffers_ext(address()); }
        /** @return a {@link GLSLangLimits} view of the {@code limits} field. */
        @NativeType("glslang_limits_t")
        public GLSLangLimits limits() { return GLSLangResource.nlimits(address()); }

        /** Sets the specified value to the {@code max_lights} field. */
        public GLSLangResource.Buffer max_lights(int value) { GLSLangResource.nmax_lights(address(), value); return this; }
        /** Sets the specified value to the {@code max_clip_planes} field. */
        public GLSLangResource.Buffer max_clip_planes(int value) { GLSLangResource.nmax_clip_planes(address(), value); return this; }
        /** Sets the specified value to the {@code max_texture_units} field. */
        public GLSLangResource.Buffer max_texture_units(int value) { GLSLangResource.nmax_texture_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_texture_coords} field. */
        public GLSLangResource.Buffer max_texture_coords(int value) { GLSLangResource.nmax_texture_coords(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_attribs} field. */
        public GLSLangResource.Buffer max_vertex_attribs(int value) { GLSLangResource.nmax_vertex_attribs(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_uniform_components} field. */
        public GLSLangResource.Buffer max_vertex_uniform_components(int value) { GLSLangResource.nmax_vertex_uniform_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_varying_floats} field. */
        public GLSLangResource.Buffer max_varying_floats(int value) { GLSLangResource.nmax_varying_floats(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_texture_image_units} field. */
        public GLSLangResource.Buffer max_vertex_texture_image_units(int value) { GLSLangResource.nmax_vertex_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_texture_image_units} field. */
        public GLSLangResource.Buffer max_combined_texture_image_units(int value) { GLSLangResource.nmax_combined_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_texture_image_units} field. */
        public GLSLangResource.Buffer max_texture_image_units(int value) { GLSLangResource.nmax_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_uniform_components} field. */
        public GLSLangResource.Buffer max_fragment_uniform_components(int value) { GLSLangResource.nmax_fragment_uniform_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_draw_buffers} field. */
        public GLSLangResource.Buffer max_draw_buffers(int value) { GLSLangResource.nmax_draw_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_uniform_vectors} field. */
        public GLSLangResource.Buffer max_vertex_uniform_vectors(int value) { GLSLangResource.nmax_vertex_uniform_vectors(address(), value); return this; }
        /** Sets the specified value to the {@code max_varying_vectors} field. */
        public GLSLangResource.Buffer max_varying_vectors(int value) { GLSLangResource.nmax_varying_vectors(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_uniform_vectors} field. */
        public GLSLangResource.Buffer max_fragment_uniform_vectors(int value) { GLSLangResource.nmax_fragment_uniform_vectors(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_output_vectors} field. */
        public GLSLangResource.Buffer max_vertex_output_vectors(int value) { GLSLangResource.nmax_vertex_output_vectors(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_input_vectors} field. */
        public GLSLangResource.Buffer max_fragment_input_vectors(int value) { GLSLangResource.nmax_fragment_input_vectors(address(), value); return this; }
        /** Sets the specified value to the {@code min_program_texel_offset} field. */
        public GLSLangResource.Buffer min_program_texel_offset(int value) { GLSLangResource.nmin_program_texel_offset(address(), value); return this; }
        /** Sets the specified value to the {@code max_program_texel_offset} field. */
        public GLSLangResource.Buffer max_program_texel_offset(int value) { GLSLangResource.nmax_program_texel_offset(address(), value); return this; }
        /** Sets the specified value to the {@code max_clip_distances} field. */
        public GLSLangResource.Buffer max_clip_distances(int value) { GLSLangResource.nmax_clip_distances(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_work_group_count_x} field. */
        public GLSLangResource.Buffer max_compute_work_group_count_x(int value) { GLSLangResource.nmax_compute_work_group_count_x(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_work_group_count_y} field. */
        public GLSLangResource.Buffer max_compute_work_group_count_y(int value) { GLSLangResource.nmax_compute_work_group_count_y(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_work_group_count_z} field. */
        public GLSLangResource.Buffer max_compute_work_group_count_z(int value) { GLSLangResource.nmax_compute_work_group_count_z(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_work_group_size_x} field. */
        public GLSLangResource.Buffer max_compute_work_group_size_x(int value) { GLSLangResource.nmax_compute_work_group_size_x(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_work_group_size_y} field. */
        public GLSLangResource.Buffer max_compute_work_group_size_y(int value) { GLSLangResource.nmax_compute_work_group_size_y(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_work_group_size_z} field. */
        public GLSLangResource.Buffer max_compute_work_group_size_z(int value) { GLSLangResource.nmax_compute_work_group_size_z(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_uniform_components} field. */
        public GLSLangResource.Buffer max_compute_uniform_components(int value) { GLSLangResource.nmax_compute_uniform_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_texture_image_units} field. */
        public GLSLangResource.Buffer max_compute_texture_image_units(int value) { GLSLangResource.nmax_compute_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_image_uniforms} field. */
        public GLSLangResource.Buffer max_compute_image_uniforms(int value) { GLSLangResource.nmax_compute_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_atomic_counters} field. */
        public GLSLangResource.Buffer max_compute_atomic_counters(int value) { GLSLangResource.nmax_compute_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_compute_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_compute_atomic_counter_buffers(int value) { GLSLangResource.nmax_compute_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_varying_components} field. */
        public GLSLangResource.Buffer max_varying_components(int value) { GLSLangResource.nmax_varying_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_output_components} field. */
        public GLSLangResource.Buffer max_vertex_output_components(int value) { GLSLangResource.nmax_vertex_output_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_input_components} field. */
        public GLSLangResource.Buffer max_geometry_input_components(int value) { GLSLangResource.nmax_geometry_input_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_output_components} field. */
        public GLSLangResource.Buffer max_geometry_output_components(int value) { GLSLangResource.nmax_geometry_output_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_input_components} field. */
        public GLSLangResource.Buffer max_fragment_input_components(int value) { GLSLangResource.nmax_fragment_input_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_image_units} field. */
        public GLSLangResource.Buffer max_image_units(int value) { GLSLangResource.nmax_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_image_units_and_fragment_outputs} field. */
        public GLSLangResource.Buffer max_combined_image_units_and_fragment_outputs(int value) { GLSLangResource.nmax_combined_image_units_and_fragment_outputs(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_shader_output_resources} field. */
        public GLSLangResource.Buffer max_combined_shader_output_resources(int value) { GLSLangResource.nmax_combined_shader_output_resources(address(), value); return this; }
        /** Sets the specified value to the {@code max_image_samples} field. */
        public GLSLangResource.Buffer max_image_samples(int value) { GLSLangResource.nmax_image_samples(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_image_uniforms} field. */
        public GLSLangResource.Buffer max_vertex_image_uniforms(int value) { GLSLangResource.nmax_vertex_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_image_uniforms} field. */
        public GLSLangResource.Buffer max_tess_control_image_uniforms(int value) { GLSLangResource.nmax_tess_control_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_image_uniforms} field. */
        public GLSLangResource.Buffer max_tess_evaluation_image_uniforms(int value) { GLSLangResource.nmax_tess_evaluation_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_image_uniforms} field. */
        public GLSLangResource.Buffer max_geometry_image_uniforms(int value) { GLSLangResource.nmax_geometry_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_image_uniforms} field. */
        public GLSLangResource.Buffer max_fragment_image_uniforms(int value) { GLSLangResource.nmax_fragment_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_image_uniforms} field. */
        public GLSLangResource.Buffer max_combined_image_uniforms(int value) { GLSLangResource.nmax_combined_image_uniforms(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_texture_image_units} field. */
        public GLSLangResource.Buffer max_geometry_texture_image_units(int value) { GLSLangResource.nmax_geometry_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_output_vertices} field. */
        public GLSLangResource.Buffer max_geometry_output_vertices(int value) { GLSLangResource.nmax_geometry_output_vertices(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_total_output_components} field. */
        public GLSLangResource.Buffer max_geometry_total_output_components(int value) { GLSLangResource.nmax_geometry_total_output_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_uniform_components} field. */
        public GLSLangResource.Buffer max_geometry_uniform_components(int value) { GLSLangResource.nmax_geometry_uniform_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_varying_components} field. */
        public GLSLangResource.Buffer max_geometry_varying_components(int value) { GLSLangResource.nmax_geometry_varying_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_input_components} field. */
        public GLSLangResource.Buffer max_tess_control_input_components(int value) { GLSLangResource.nmax_tess_control_input_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_output_components} field. */
        public GLSLangResource.Buffer max_tess_control_output_components(int value) { GLSLangResource.nmax_tess_control_output_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_texture_image_units} field. */
        public GLSLangResource.Buffer max_tess_control_texture_image_units(int value) { GLSLangResource.nmax_tess_control_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_uniform_components} field. */
        public GLSLangResource.Buffer max_tess_control_uniform_components(int value) { GLSLangResource.nmax_tess_control_uniform_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_total_output_components} field. */
        public GLSLangResource.Buffer max_tess_control_total_output_components(int value) { GLSLangResource.nmax_tess_control_total_output_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_input_components} field. */
        public GLSLangResource.Buffer max_tess_evaluation_input_components(int value) { GLSLangResource.nmax_tess_evaluation_input_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_output_components} field. */
        public GLSLangResource.Buffer max_tess_evaluation_output_components(int value) { GLSLangResource.nmax_tess_evaluation_output_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_texture_image_units} field. */
        public GLSLangResource.Buffer max_tess_evaluation_texture_image_units(int value) { GLSLangResource.nmax_tess_evaluation_texture_image_units(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_uniform_components} field. */
        public GLSLangResource.Buffer max_tess_evaluation_uniform_components(int value) { GLSLangResource.nmax_tess_evaluation_uniform_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_patch_components} field. */
        public GLSLangResource.Buffer max_tess_patch_components(int value) { GLSLangResource.nmax_tess_patch_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_patch_vertices} field. */
        public GLSLangResource.Buffer max_patch_vertices(int value) { GLSLangResource.nmax_patch_vertices(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_gen_level} field. */
        public GLSLangResource.Buffer max_tess_gen_level(int value) { GLSLangResource.nmax_tess_gen_level(address(), value); return this; }
        /** Sets the specified value to the {@code max_viewports} field. */
        public GLSLangResource.Buffer max_viewports(int value) { GLSLangResource.nmax_viewports(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_atomic_counters} field. */
        public GLSLangResource.Buffer max_vertex_atomic_counters(int value) { GLSLangResource.nmax_vertex_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_atomic_counters} field. */
        public GLSLangResource.Buffer max_tess_control_atomic_counters(int value) { GLSLangResource.nmax_tess_control_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_atomic_counters} field. */
        public GLSLangResource.Buffer max_tess_evaluation_atomic_counters(int value) { GLSLangResource.nmax_tess_evaluation_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_atomic_counters} field. */
        public GLSLangResource.Buffer max_geometry_atomic_counters(int value) { GLSLangResource.nmax_geometry_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_atomic_counters} field. */
        public GLSLangResource.Buffer max_fragment_atomic_counters(int value) { GLSLangResource.nmax_fragment_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_atomic_counters} field. */
        public GLSLangResource.Buffer max_combined_atomic_counters(int value) { GLSLangResource.nmax_combined_atomic_counters(address(), value); return this; }
        /** Sets the specified value to the {@code max_atomic_counter_bindings} field. */
        public GLSLangResource.Buffer max_atomic_counter_bindings(int value) { GLSLangResource.nmax_atomic_counter_bindings(address(), value); return this; }
        /** Sets the specified value to the {@code max_vertex_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_vertex_atomic_counter_buffers(int value) { GLSLangResource.nmax_vertex_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_control_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_tess_control_atomic_counter_buffers(int value) { GLSLangResource.nmax_tess_control_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_tess_evaluation_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_tess_evaluation_atomic_counter_buffers(int value) { GLSLangResource.nmax_tess_evaluation_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_geometry_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_geometry_atomic_counter_buffers(int value) { GLSLangResource.nmax_geometry_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_fragment_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_fragment_atomic_counter_buffers(int value) { GLSLangResource.nmax_fragment_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_atomic_counter_buffers} field. */
        public GLSLangResource.Buffer max_combined_atomic_counter_buffers(int value) { GLSLangResource.nmax_combined_atomic_counter_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_atomic_counter_buffer_size} field. */
        public GLSLangResource.Buffer max_atomic_counter_buffer_size(int value) { GLSLangResource.nmax_atomic_counter_buffer_size(address(), value); return this; }
        /** Sets the specified value to the {@code max_transform_feedback_buffers} field. */
        public GLSLangResource.Buffer max_transform_feedback_buffers(int value) { GLSLangResource.nmax_transform_feedback_buffers(address(), value); return this; }
        /** Sets the specified value to the {@code max_transform_feedback_interleaved_components} field. */
        public GLSLangResource.Buffer max_transform_feedback_interleaved_components(int value) { GLSLangResource.nmax_transform_feedback_interleaved_components(address(), value); return this; }
        /** Sets the specified value to the {@code max_cull_distances} field. */
        public GLSLangResource.Buffer max_cull_distances(int value) { GLSLangResource.nmax_cull_distances(address(), value); return this; }
        /** Sets the specified value to the {@code max_combined_clip_and_cull_distances} field. */
        public GLSLangResource.Buffer max_combined_clip_and_cull_distances(int value) { GLSLangResource.nmax_combined_clip_and_cull_distances(address(), value); return this; }
        /** Sets the specified value to the {@code max_samples} field. */
        public GLSLangResource.Buffer max_samples(int value) { GLSLangResource.nmax_samples(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_output_vertices_nv} field. */
        public GLSLangResource.Buffer max_mesh_output_vertices_nv(int value) { GLSLangResource.nmax_mesh_output_vertices_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_output_primitives_nv} field. */
        public GLSLangResource.Buffer max_mesh_output_primitives_nv(int value) { GLSLangResource.nmax_mesh_output_primitives_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_work_group_size_x_nv} field. */
        public GLSLangResource.Buffer max_mesh_work_group_size_x_nv(int value) { GLSLangResource.nmax_mesh_work_group_size_x_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_work_group_size_y_nv} field. */
        public GLSLangResource.Buffer max_mesh_work_group_size_y_nv(int value) { GLSLangResource.nmax_mesh_work_group_size_y_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_work_group_size_z_nv} field. */
        public GLSLangResource.Buffer max_mesh_work_group_size_z_nv(int value) { GLSLangResource.nmax_mesh_work_group_size_z_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_task_work_group_size_x_nv} field. */
        public GLSLangResource.Buffer max_task_work_group_size_x_nv(int value) { GLSLangResource.nmax_task_work_group_size_x_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_task_work_group_size_y_nv} field. */
        public GLSLangResource.Buffer max_task_work_group_size_y_nv(int value) { GLSLangResource.nmax_task_work_group_size_y_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_task_work_group_size_z_nv} field. */
        public GLSLangResource.Buffer max_task_work_group_size_z_nv(int value) { GLSLangResource.nmax_task_work_group_size_z_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_view_count_nv} field. */
        public GLSLangResource.Buffer max_mesh_view_count_nv(int value) { GLSLangResource.nmax_mesh_view_count_nv(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_output_vertices_ext} field. */
        public GLSLangResource.Buffer max_mesh_output_vertices_ext(int value) { GLSLangResource.nmax_mesh_output_vertices_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_output_primitives_ext} field. */
        public GLSLangResource.Buffer max_mesh_output_primitives_ext(int value) { GLSLangResource.nmax_mesh_output_primitives_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_work_group_size_x_ext} field. */
        public GLSLangResource.Buffer max_mesh_work_group_size_x_ext(int value) { GLSLangResource.nmax_mesh_work_group_size_x_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_work_group_size_y_ext} field. */
        public GLSLangResource.Buffer max_mesh_work_group_size_y_ext(int value) { GLSLangResource.nmax_mesh_work_group_size_y_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_work_group_size_z_ext} field. */
        public GLSLangResource.Buffer max_mesh_work_group_size_z_ext(int value) { GLSLangResource.nmax_mesh_work_group_size_z_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_task_work_group_size_x_ext} field. */
        public GLSLangResource.Buffer max_task_work_group_size_x_ext(int value) { GLSLangResource.nmax_task_work_group_size_x_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_task_work_group_size_y_ext} field. */
        public GLSLangResource.Buffer max_task_work_group_size_y_ext(int value) { GLSLangResource.nmax_task_work_group_size_y_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_task_work_group_size_z_ext} field. */
        public GLSLangResource.Buffer max_task_work_group_size_z_ext(int value) { GLSLangResource.nmax_task_work_group_size_z_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_mesh_view_count_ext} field. */
        public GLSLangResource.Buffer max_mesh_view_count_ext(int value) { GLSLangResource.nmax_mesh_view_count_ext(address(), value); return this; }
        /** Sets the specified value to the {@code max_dual_source_draw_buffers_ext} field. */
        public GLSLangResource.Buffer max_dual_source_draw_buffers_ext(int value) { GLSLangResource.nmax_dual_source_draw_buffers_ext(address(), value); return this; }
        /** Copies the specified {@link GLSLangLimits} to the {@code limits} field. */
        public GLSLangResource.Buffer limits(@NativeType("glslang_limits_t") GLSLangLimits value) { GLSLangResource.nlimits(address(), value); return this; }
        /** Passes the {@code limits} field to the specified {@link java.util.function.Consumer Consumer}. */
        public GLSLangResource.Buffer limits(java.util.function.Consumer<GLSLangLimits> consumer) { consumer.accept(limits()); return this; }

    }

}