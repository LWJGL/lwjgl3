/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_convert_config {
 *     float {@link #global_alpha};
 *     enum nk_anti_aliasing {@link #line_AA};
 *     enum nk_anti_aliasing {@link #shape_AA};
 *     unsigned int {@link #circle_segment_count};
 *     unsigned int {@link #arc_segment_count};
 *     unsigned int {@link #curve_segment_count};
 *     {@link NkDrawNullTexture struct nk_draw_null_texture} {@link #tex_null};
 *     {@link NkDrawVertexLayoutElement struct nk_draw_vertex_layout_element} * {@link #vertex_layout};
 *     nk_size {@link #vertex_size};
 *     nk_size {@link #vertex_alignment};
 * }</code></pre>
 */
@NativeType("struct nk_convert_config")
public class NkConvertConfig extends Struct<NkConvertConfig> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GLOBAL_ALPHA,
        LINE_AA,
        SHAPE_AA,
        CIRCLE_SEGMENT_COUNT,
        ARC_SEGMENT_COUNT,
        CURVE_SEGMENT_COUNT,
        TEX_NULL,
        VERTEX_LAYOUT,
        VERTEX_SIZE,
        VERTEX_ALIGNMENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkDrawNullTexture.SIZEOF, NkDrawNullTexture.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GLOBAL_ALPHA = layout.offsetof(0);
        LINE_AA = layout.offsetof(1);
        SHAPE_AA = layout.offsetof(2);
        CIRCLE_SEGMENT_COUNT = layout.offsetof(3);
        ARC_SEGMENT_COUNT = layout.offsetof(4);
        CURVE_SEGMENT_COUNT = layout.offsetof(5);
        TEX_NULL = layout.offsetof(6);
        VERTEX_LAYOUT = layout.offsetof(7);
        VERTEX_SIZE = layout.offsetof(8);
        VERTEX_ALIGNMENT = layout.offsetof(9);
    }

    protected NkConvertConfig(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkConvertConfig create(long address, @Nullable ByteBuffer container) {
        return new NkConvertConfig(address, container);
    }

    /**
     * Creates a {@code NkConvertConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkConvertConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** global alpha value */
    public float global_alpha() { return nglobal_alpha(address()); }
    /** line anti-aliasing flag can be turned off if you are tight on memory. One of:<br><table><tr><td>{@link Nuklear#NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link Nuklear#NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table> */
    @NativeType("enum nk_anti_aliasing")
    public int line_AA() { return nline_AA(address()); }
    /** shape anti-aliasing flag can be turned off if you are tight on memory. One of:<br><table><tr><td>{@link Nuklear#NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link Nuklear#NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table> */
    @NativeType("enum nk_anti_aliasing")
    public int shape_AA() { return nshape_AA(address()); }
    /** number of segments used for circles: default to 22 */
    @NativeType("unsigned int")
    public int circle_segment_count() { return ncircle_segment_count(address()); }
    /** number of segments used for arcs: default to 22 */
    @NativeType("unsigned int")
    public int arc_segment_count() { return narc_segment_count(address()); }
    /** number of segments used for curves: default to 22 */
    @NativeType("unsigned int")
    public int curve_segment_count() { return ncurve_segment_count(address()); }
    /** handle to texture with a white pixel for shape drawing */
    @NativeType("struct nk_draw_null_texture")
    public NkDrawNullTexture tex_null() { return ntex_null(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return describes the vertex output format and packing
     */
    @NativeType("struct nk_draw_vertex_layout_element *")
    public NkDrawVertexLayoutElement.Buffer vertex_layout(int capacity) { return nvertex_layout(address(), capacity); }
    /** sizeof one vertex for vertex packing */
    @NativeType("nk_size")
    public long vertex_size() { return nvertex_size(address()); }
    /** vertex alignment: Can be optained by NK_ALIGNOF */
    @NativeType("nk_size")
    public long vertex_alignment() { return nvertex_alignment(address()); }

    /** Sets the specified value to the {@link #global_alpha} field. */
    public NkConvertConfig global_alpha(float value) { nglobal_alpha(address(), value); return this; }
    /** Sets the specified value to the {@link #line_AA} field. */
    public NkConvertConfig line_AA(@NativeType("enum nk_anti_aliasing") int value) { nline_AA(address(), value); return this; }
    /** Sets the specified value to the {@link #shape_AA} field. */
    public NkConvertConfig shape_AA(@NativeType("enum nk_anti_aliasing") int value) { nshape_AA(address(), value); return this; }
    /** Sets the specified value to the {@link #circle_segment_count} field. */
    public NkConvertConfig circle_segment_count(@NativeType("unsigned int") int value) { ncircle_segment_count(address(), value); return this; }
    /** Sets the specified value to the {@link #arc_segment_count} field. */
    public NkConvertConfig arc_segment_count(@NativeType("unsigned int") int value) { narc_segment_count(address(), value); return this; }
    /** Sets the specified value to the {@link #curve_segment_count} field. */
    public NkConvertConfig curve_segment_count(@NativeType("unsigned int") int value) { ncurve_segment_count(address(), value); return this; }
    /** Copies the specified {@link NkDrawNullTexture} to the {@link #tex_null} field. */
    public NkConvertConfig tex_null(@NativeType("struct nk_draw_null_texture") NkDrawNullTexture value) { ntex_null(address(), value); return this; }
    /** Passes the {@link #tex_null} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkConvertConfig tex_null(java.util.function.Consumer<NkDrawNullTexture> consumer) { consumer.accept(tex_null()); return this; }
    /** Sets the address of the specified {@link NkDrawVertexLayoutElement.Buffer} to the {@link #vertex_layout} field. */
    public NkConvertConfig vertex_layout(@NativeType("struct nk_draw_vertex_layout_element *") NkDrawVertexLayoutElement.Buffer value) { nvertex_layout(address(), value); return this; }
    /** Sets the specified value to the {@link #vertex_size} field. */
    public NkConvertConfig vertex_size(@NativeType("nk_size") long value) { nvertex_size(address(), value); return this; }
    /** Sets the specified value to the {@link #vertex_alignment} field. */
    public NkConvertConfig vertex_alignment(@NativeType("nk_size") long value) { nvertex_alignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkConvertConfig set(
        float global_alpha,
        int line_AA,
        int shape_AA,
        int circle_segment_count,
        int arc_segment_count,
        int curve_segment_count,
        NkDrawNullTexture tex_null,
        NkDrawVertexLayoutElement.Buffer vertex_layout,
        long vertex_size,
        long vertex_alignment
    ) {
        global_alpha(global_alpha);
        line_AA(line_AA);
        shape_AA(shape_AA);
        circle_segment_count(circle_segment_count);
        arc_segment_count(arc_segment_count);
        curve_segment_count(curve_segment_count);
        tex_null(tex_null);
        vertex_layout(vertex_layout);
        vertex_size(vertex_size);
        vertex_alignment(vertex_alignment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkConvertConfig set(NkConvertConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkConvertConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkConvertConfig malloc() {
        return new NkConvertConfig(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkConvertConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkConvertConfig calloc() {
        return new NkConvertConfig(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkConvertConfig} instance allocated with {@link BufferUtils}. */
    public static NkConvertConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkConvertConfig(memAddress(container), container);
    }

    /** Returns a new {@code NkConvertConfig} instance for the specified memory address. */
    public static NkConvertConfig create(long address) {
        return new NkConvertConfig(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConvertConfig createSafe(long address) {
        return address == NULL ? null : new NkConvertConfig(address, null);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkConvertConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConvertConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkConvertConfig.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkConvertConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkConvertConfig malloc(MemoryStack stack) {
        return new NkConvertConfig(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkConvertConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkConvertConfig calloc(MemoryStack stack) {
        return new NkConvertConfig(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #global_alpha}. */
    public static float nglobal_alpha(long struct) { return UNSAFE.getFloat(null, struct + NkConvertConfig.GLOBAL_ALPHA); }
    /** Unsafe version of {@link #line_AA}. */
    public static int nline_AA(long struct) { return UNSAFE.getInt(null, struct + NkConvertConfig.LINE_AA); }
    /** Unsafe version of {@link #shape_AA}. */
    public static int nshape_AA(long struct) { return UNSAFE.getInt(null, struct + NkConvertConfig.SHAPE_AA); }
    /** Unsafe version of {@link #circle_segment_count}. */
    public static int ncircle_segment_count(long struct) { return UNSAFE.getInt(null, struct + NkConvertConfig.CIRCLE_SEGMENT_COUNT); }
    /** Unsafe version of {@link #arc_segment_count}. */
    public static int narc_segment_count(long struct) { return UNSAFE.getInt(null, struct + NkConvertConfig.ARC_SEGMENT_COUNT); }
    /** Unsafe version of {@link #curve_segment_count}. */
    public static int ncurve_segment_count(long struct) { return UNSAFE.getInt(null, struct + NkConvertConfig.CURVE_SEGMENT_COUNT); }
    /** Unsafe version of {@link #tex_null}. */
    public static NkDrawNullTexture ntex_null(long struct) { return NkDrawNullTexture.create(struct + NkConvertConfig.TEX_NULL); }
    /** Unsafe version of {@link #vertex_layout}. */
    public static NkDrawVertexLayoutElement.Buffer nvertex_layout(long struct, int capacity) { return NkDrawVertexLayoutElement.create(memGetAddress(struct + NkConvertConfig.VERTEX_LAYOUT), capacity); }
    /** Unsafe version of {@link #vertex_size}. */
    public static long nvertex_size(long struct) { return memGetAddress(struct + NkConvertConfig.VERTEX_SIZE); }
    /** Unsafe version of {@link #vertex_alignment}. */
    public static long nvertex_alignment(long struct) { return memGetAddress(struct + NkConvertConfig.VERTEX_ALIGNMENT); }

    /** Unsafe version of {@link #global_alpha(float) global_alpha}. */
    public static void nglobal_alpha(long struct, float value) { UNSAFE.putFloat(null, struct + NkConvertConfig.GLOBAL_ALPHA, value); }
    /** Unsafe version of {@link #line_AA(int) line_AA}. */
    public static void nline_AA(long struct, int value) { UNSAFE.putInt(null, struct + NkConvertConfig.LINE_AA, value); }
    /** Unsafe version of {@link #shape_AA(int) shape_AA}. */
    public static void nshape_AA(long struct, int value) { UNSAFE.putInt(null, struct + NkConvertConfig.SHAPE_AA, value); }
    /** Unsafe version of {@link #circle_segment_count(int) circle_segment_count}. */
    public static void ncircle_segment_count(long struct, int value) { UNSAFE.putInt(null, struct + NkConvertConfig.CIRCLE_SEGMENT_COUNT, value); }
    /** Unsafe version of {@link #arc_segment_count(int) arc_segment_count}. */
    public static void narc_segment_count(long struct, int value) { UNSAFE.putInt(null, struct + NkConvertConfig.ARC_SEGMENT_COUNT, value); }
    /** Unsafe version of {@link #curve_segment_count(int) curve_segment_count}. */
    public static void ncurve_segment_count(long struct, int value) { UNSAFE.putInt(null, struct + NkConvertConfig.CURVE_SEGMENT_COUNT, value); }
    /** Unsafe version of {@link #tex_null(NkDrawNullTexture) tex_null}. */
    public static void ntex_null(long struct, NkDrawNullTexture value) { memCopy(value.address(), struct + NkConvertConfig.TEX_NULL, NkDrawNullTexture.SIZEOF); }
    /** Unsafe version of {@link #vertex_layout(NkDrawVertexLayoutElement.Buffer) vertex_layout}. */
    public static void nvertex_layout(long struct, NkDrawVertexLayoutElement.Buffer value) { memPutAddress(struct + NkConvertConfig.VERTEX_LAYOUT, value.address()); }
    /** Unsafe version of {@link #vertex_size(long) vertex_size}. */
    public static void nvertex_size(long struct, long value) { memPutAddress(struct + NkConvertConfig.VERTEX_SIZE, value); }
    /** Unsafe version of {@link #vertex_alignment(long) vertex_alignment}. */
    public static void nvertex_alignment(long struct, long value) { memPutAddress(struct + NkConvertConfig.VERTEX_ALIGNMENT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + NkConvertConfig.VERTEX_LAYOUT));
    }

    // -----------------------------------

    /** An array of {@link NkConvertConfig} structs. */
    public static class Buffer extends StructBuffer<NkConvertConfig, Buffer> implements NativeResource {

        private static final NkConvertConfig ELEMENT_FACTORY = NkConvertConfig.create(-1L);

        /**
         * Creates a new {@code NkConvertConfig.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConvertConfig#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkConvertConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link NkConvertConfig#global_alpha} field. */
        public float global_alpha() { return NkConvertConfig.nglobal_alpha(address()); }
        /** @return the value of the {@link NkConvertConfig#line_AA} field. */
        @NativeType("enum nk_anti_aliasing")
        public int line_AA() { return NkConvertConfig.nline_AA(address()); }
        /** @return the value of the {@link NkConvertConfig#shape_AA} field. */
        @NativeType("enum nk_anti_aliasing")
        public int shape_AA() { return NkConvertConfig.nshape_AA(address()); }
        /** @return the value of the {@link NkConvertConfig#circle_segment_count} field. */
        @NativeType("unsigned int")
        public int circle_segment_count() { return NkConvertConfig.ncircle_segment_count(address()); }
        /** @return the value of the {@link NkConvertConfig#arc_segment_count} field. */
        @NativeType("unsigned int")
        public int arc_segment_count() { return NkConvertConfig.narc_segment_count(address()); }
        /** @return the value of the {@link NkConvertConfig#curve_segment_count} field. */
        @NativeType("unsigned int")
        public int curve_segment_count() { return NkConvertConfig.ncurve_segment_count(address()); }
        /** @return a {@link NkDrawNullTexture} view of the {@link NkConvertConfig#tex_null} field. */
        @NativeType("struct nk_draw_null_texture")
        public NkDrawNullTexture tex_null() { return NkConvertConfig.ntex_null(address()); }
        /**
         * @return a {@link NkDrawVertexLayoutElement.Buffer} view of the struct array pointed to by the {@link NkConvertConfig#vertex_layout} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("struct nk_draw_vertex_layout_element *")
        public NkDrawVertexLayoutElement.Buffer vertex_layout(int capacity) { return NkConvertConfig.nvertex_layout(address(), capacity); }
        /** @return the value of the {@link NkConvertConfig#vertex_size} field. */
        @NativeType("nk_size")
        public long vertex_size() { return NkConvertConfig.nvertex_size(address()); }
        /** @return the value of the {@link NkConvertConfig#vertex_alignment} field. */
        @NativeType("nk_size")
        public long vertex_alignment() { return NkConvertConfig.nvertex_alignment(address()); }

        /** Sets the specified value to the {@link NkConvertConfig#global_alpha} field. */
        public NkConvertConfig.Buffer global_alpha(float value) { NkConvertConfig.nglobal_alpha(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#line_AA} field. */
        public NkConvertConfig.Buffer line_AA(@NativeType("enum nk_anti_aliasing") int value) { NkConvertConfig.nline_AA(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#shape_AA} field. */
        public NkConvertConfig.Buffer shape_AA(@NativeType("enum nk_anti_aliasing") int value) { NkConvertConfig.nshape_AA(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#circle_segment_count} field. */
        public NkConvertConfig.Buffer circle_segment_count(@NativeType("unsigned int") int value) { NkConvertConfig.ncircle_segment_count(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#arc_segment_count} field. */
        public NkConvertConfig.Buffer arc_segment_count(@NativeType("unsigned int") int value) { NkConvertConfig.narc_segment_count(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#curve_segment_count} field. */
        public NkConvertConfig.Buffer curve_segment_count(@NativeType("unsigned int") int value) { NkConvertConfig.ncurve_segment_count(address(), value); return this; }
        /** Copies the specified {@link NkDrawNullTexture} to the {@link NkConvertConfig#tex_null} field. */
        public NkConvertConfig.Buffer tex_null(@NativeType("struct nk_draw_null_texture") NkDrawNullTexture value) { NkConvertConfig.ntex_null(address(), value); return this; }
        /** Passes the {@link NkConvertConfig#tex_null} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkConvertConfig.Buffer tex_null(java.util.function.Consumer<NkDrawNullTexture> consumer) { consumer.accept(tex_null()); return this; }
        /** Sets the address of the specified {@link NkDrawVertexLayoutElement.Buffer} to the {@link NkConvertConfig#vertex_layout} field. */
        public NkConvertConfig.Buffer vertex_layout(@NativeType("struct nk_draw_vertex_layout_element *") NkDrawVertexLayoutElement.Buffer value) { NkConvertConfig.nvertex_layout(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#vertex_size} field. */
        public NkConvertConfig.Buffer vertex_size(@NativeType("nk_size") long value) { NkConvertConfig.nvertex_size(address(), value); return this; }
        /** Sets the specified value to the {@link NkConvertConfig#vertex_alignment} field. */
        public NkConvertConfig.Buffer vertex_alignment(@NativeType("nk_size") long value) { NkConvertConfig.nvertex_alignment(address(), value); return this; }

    }

}