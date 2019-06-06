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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code global_alpha} &ndash; global alpha value</li>
 * <li>{@code line_AA} &ndash; line anti-aliasing flag can be turned off if you are tight on memory. One of:<br><table><tr><td>{@link Nuklear#NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link Nuklear#NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table></li>
 * <li>{@code shape_AA} &ndash; shape anti-aliasing flag can be turned off if you are tight on memory. One of:<br><table><tr><td>{@link Nuklear#NK_ANTI_ALIASING_OFF ANTI_ALIASING_OFF}</td><td>{@link Nuklear#NK_ANTI_ALIASING_ON ANTI_ALIASING_ON}</td></tr></table></li>
 * <li>{@code circle_segment_count} &ndash; number of segments used for circles: default to 22</li>
 * <li>{@code arc_segment_count} &ndash; number of segments used for arcs: default to 22</li>
 * <li>{@code curve_segment_count} &ndash; number of segments used for curves: default to 22</li>
 * <li>{@code null_texture} &ndash; handle to texture with a white pixel for shape drawing</li>
 * <li>{@code vertex_layout} &ndash; describes the vertex output format and packing</li>
 * <li>{@code vertex_size} &ndash; sizeof one vertex for vertex packing</li>
 * <li>{@code vertex_alignment} &ndash; vertex alignment: Can be optained by NK_ALIGNOF</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_convert_config {
 *     float global_alpha;
 *     enum nk_anti_aliasing line_AA;
 *     enum nk_anti_aliasing shape_AA;
 *     unsigned int circle_segment_count;
 *     unsigned int arc_segment_count;
 *     unsigned int curve_segment_count;
 *     {@link NkDrawNullTexture struct nk_draw_null_texture} null_texture;
 *     {@link NkDrawVertexLayoutElement struct nk_draw_vertex_layout_element} * vertex_layout;
 *     nk_size vertex_size;
 *     nk_size vertex_alignment;
 * }</code></pre>
 */
@NativeType("struct nk_convert_config")
public class NkConvertConfig extends Struct implements NativeResource {

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
        NULL_TEXTURE,
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
        NULL_TEXTURE = layout.offsetof(6);
        VERTEX_LAYOUT = layout.offsetof(7);
        VERTEX_SIZE = layout.offsetof(8);
        VERTEX_ALIGNMENT = layout.offsetof(9);
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

    /** Returns the value of the {@code global_alpha} field. */
    public float global_alpha() { return nglobal_alpha(address()); }
    /** Returns the value of the {@code line_AA} field. */
    @NativeType("enum nk_anti_aliasing")
    public int line_AA() { return nline_AA(address()); }
    /** Returns the value of the {@code shape_AA} field. */
    @NativeType("enum nk_anti_aliasing")
    public int shape_AA() { return nshape_AA(address()); }
    /** Returns the value of the {@code circle_segment_count} field. */
    @NativeType("unsigned int")
    public int circle_segment_count() { return ncircle_segment_count(address()); }
    /** Returns the value of the {@code arc_segment_count} field. */
    @NativeType("unsigned int")
    public int arc_segment_count() { return narc_segment_count(address()); }
    /** Returns the value of the {@code curve_segment_count} field. */
    @NativeType("unsigned int")
    public int curve_segment_count() { return ncurve_segment_count(address()); }
    /** Returns a {@link NkDrawNullTexture} view of the {@code null_texture} field. */
    @NativeType("struct nk_draw_null_texture")
    public NkDrawNullTexture null_texture() { return nnull_texture(address()); }
    /**
     * Returns a {@link NkDrawVertexLayoutElement.Buffer} view of the struct array pointed to by the {@code vertex_layout} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("struct nk_draw_vertex_layout_element *")
    public NkDrawVertexLayoutElement.Buffer vertex_layout(int capacity) { return nvertex_layout(address(), capacity); }
    /** Returns the value of the {@code vertex_size} field. */
    @NativeType("nk_size")
    public long vertex_size() { return nvertex_size(address()); }
    /** Returns the value of the {@code vertex_alignment} field. */
    @NativeType("nk_size")
    public long vertex_alignment() { return nvertex_alignment(address()); }

    /** Sets the specified value to the {@code global_alpha} field. */
    public NkConvertConfig global_alpha(float value) { nglobal_alpha(address(), value); return this; }
    /** Sets the specified value to the {@code line_AA} field. */
    public NkConvertConfig line_AA(@NativeType("enum nk_anti_aliasing") int value) { nline_AA(address(), value); return this; }
    /** Sets the specified value to the {@code shape_AA} field. */
    public NkConvertConfig shape_AA(@NativeType("enum nk_anti_aliasing") int value) { nshape_AA(address(), value); return this; }
    /** Sets the specified value to the {@code circle_segment_count} field. */
    public NkConvertConfig circle_segment_count(@NativeType("unsigned int") int value) { ncircle_segment_count(address(), value); return this; }
    /** Sets the specified value to the {@code arc_segment_count} field. */
    public NkConvertConfig arc_segment_count(@NativeType("unsigned int") int value) { narc_segment_count(address(), value); return this; }
    /** Sets the specified value to the {@code curve_segment_count} field. */
    public NkConvertConfig curve_segment_count(@NativeType("unsigned int") int value) { ncurve_segment_count(address(), value); return this; }
    /** Copies the specified {@link NkDrawNullTexture} to the {@code null_texture} field. */
    public NkConvertConfig null_texture(@NativeType("struct nk_draw_null_texture") NkDrawNullTexture value) { nnull_texture(address(), value); return this; }
    /** Passes the {@code null_texture} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkConvertConfig null_texture(java.util.function.Consumer<NkDrawNullTexture> consumer) { consumer.accept(null_texture()); return this; }
    /** Sets the address of the specified {@link NkDrawVertexLayoutElement.Buffer} to the {@code vertex_layout} field. */
    public NkConvertConfig vertex_layout(@NativeType("struct nk_draw_vertex_layout_element *") NkDrawVertexLayoutElement.Buffer value) { nvertex_layout(address(), value); return this; }
    /** Sets the specified value to the {@code vertex_size} field. */
    public NkConvertConfig vertex_size(@NativeType("nk_size") long value) { nvertex_size(address(), value); return this; }
    /** Sets the specified value to the {@code vertex_alignment} field. */
    public NkConvertConfig vertex_alignment(@NativeType("nk_size") long value) { nvertex_alignment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkConvertConfig set(
        float global_alpha,
        int line_AA,
        int shape_AA,
        int circle_segment_count,
        int arc_segment_count,
        int curve_segment_count,
        NkDrawNullTexture null_texture,
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
        null_texture(null_texture);
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
        return wrap(NkConvertConfig.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkConvertConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkConvertConfig calloc() {
        return wrap(NkConvertConfig.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkConvertConfig} instance allocated with {@link BufferUtils}. */
    public static NkConvertConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkConvertConfig.class, memAddress(container), container);
    }

    /** Returns a new {@code NkConvertConfig} instance for the specified memory address. */
    public static NkConvertConfig create(long address) {
        return wrap(NkConvertConfig.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConvertConfig createSafe(long address) {
        return address == NULL ? null : wrap(NkConvertConfig.class, address);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkConvertConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkConvertConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkConvertConfig} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkConvertConfig mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkConvertConfig} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkConvertConfig callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkConvertConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkConvertConfig mallocStack(MemoryStack stack) {
        return wrap(NkConvertConfig.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkConvertConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkConvertConfig callocStack(MemoryStack stack) {
        return wrap(NkConvertConfig.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkConvertConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkConvertConfig.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    /** Unsafe version of {@link #null_texture}. */
    public static NkDrawNullTexture nnull_texture(long struct) { return NkDrawNullTexture.create(struct + NkConvertConfig.NULL_TEXTURE); }
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
    /** Unsafe version of {@link #null_texture(NkDrawNullTexture) null_texture}. */
    public static void nnull_texture(long struct, NkDrawNullTexture value) { memCopy(value.address(), struct + NkConvertConfig.NULL_TEXTURE, NkDrawNullTexture.SIZEOF); }
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

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link NkConvertConfig} structs. */
    public static class Buffer extends StructBuffer<NkConvertConfig, Buffer> implements NativeResource {

        private static final NkConvertConfig ELEMENT_FACTORY = NkConvertConfig.create(-1L);

        /**
         * Creates a new {@code NkConvertConfig.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkConvertConfig#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code global_alpha} field. */
        public float global_alpha() { return NkConvertConfig.nglobal_alpha(address()); }
        /** Returns the value of the {@code line_AA} field. */
        @NativeType("enum nk_anti_aliasing")
        public int line_AA() { return NkConvertConfig.nline_AA(address()); }
        /** Returns the value of the {@code shape_AA} field. */
        @NativeType("enum nk_anti_aliasing")
        public int shape_AA() { return NkConvertConfig.nshape_AA(address()); }
        /** Returns the value of the {@code circle_segment_count} field. */
        @NativeType("unsigned int")
        public int circle_segment_count() { return NkConvertConfig.ncircle_segment_count(address()); }
        /** Returns the value of the {@code arc_segment_count} field. */
        @NativeType("unsigned int")
        public int arc_segment_count() { return NkConvertConfig.narc_segment_count(address()); }
        /** Returns the value of the {@code curve_segment_count} field. */
        @NativeType("unsigned int")
        public int curve_segment_count() { return NkConvertConfig.ncurve_segment_count(address()); }
        /** Returns a {@link NkDrawNullTexture} view of the {@code null_texture} field. */
        @NativeType("struct nk_draw_null_texture")
        public NkDrawNullTexture null_texture() { return NkConvertConfig.nnull_texture(address()); }
        /**
         * Returns a {@link NkDrawVertexLayoutElement.Buffer} view of the struct array pointed to by the {@code vertex_layout} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("struct nk_draw_vertex_layout_element *")
        public NkDrawVertexLayoutElement.Buffer vertex_layout(int capacity) { return NkConvertConfig.nvertex_layout(address(), capacity); }
        /** Returns the value of the {@code vertex_size} field. */
        @NativeType("nk_size")
        public long vertex_size() { return NkConvertConfig.nvertex_size(address()); }
        /** Returns the value of the {@code vertex_alignment} field. */
        @NativeType("nk_size")
        public long vertex_alignment() { return NkConvertConfig.nvertex_alignment(address()); }

        /** Sets the specified value to the {@code global_alpha} field. */
        public NkConvertConfig.Buffer global_alpha(float value) { NkConvertConfig.nglobal_alpha(address(), value); return this; }
        /** Sets the specified value to the {@code line_AA} field. */
        public NkConvertConfig.Buffer line_AA(@NativeType("enum nk_anti_aliasing") int value) { NkConvertConfig.nline_AA(address(), value); return this; }
        /** Sets the specified value to the {@code shape_AA} field. */
        public NkConvertConfig.Buffer shape_AA(@NativeType("enum nk_anti_aliasing") int value) { NkConvertConfig.nshape_AA(address(), value); return this; }
        /** Sets the specified value to the {@code circle_segment_count} field. */
        public NkConvertConfig.Buffer circle_segment_count(@NativeType("unsigned int") int value) { NkConvertConfig.ncircle_segment_count(address(), value); return this; }
        /** Sets the specified value to the {@code arc_segment_count} field. */
        public NkConvertConfig.Buffer arc_segment_count(@NativeType("unsigned int") int value) { NkConvertConfig.narc_segment_count(address(), value); return this; }
        /** Sets the specified value to the {@code curve_segment_count} field. */
        public NkConvertConfig.Buffer curve_segment_count(@NativeType("unsigned int") int value) { NkConvertConfig.ncurve_segment_count(address(), value); return this; }
        /** Copies the specified {@link NkDrawNullTexture} to the {@code null_texture} field. */
        public NkConvertConfig.Buffer null_texture(@NativeType("struct nk_draw_null_texture") NkDrawNullTexture value) { NkConvertConfig.nnull_texture(address(), value); return this; }
        /** Passes the {@code null_texture} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkConvertConfig.Buffer null_texture(java.util.function.Consumer<NkDrawNullTexture> consumer) { consumer.accept(null_texture()); return this; }
        /** Sets the address of the specified {@link NkDrawVertexLayoutElement.Buffer} to the {@code vertex_layout} field. */
        public NkConvertConfig.Buffer vertex_layout(@NativeType("struct nk_draw_vertex_layout_element *") NkDrawVertexLayoutElement.Buffer value) { NkConvertConfig.nvertex_layout(address(), value); return this; }
        /** Sets the specified value to the {@code vertex_size} field. */
        public NkConvertConfig.Buffer vertex_size(@NativeType("nk_size") long value) { NkConvertConfig.nvertex_size(address(), value); return this; }
        /** Sets the specified value to the {@code vertex_alignment} field. */
        public NkConvertConfig.Buffer vertex_alignment(@NativeType("nk_size") long value) { NkConvertConfig.nvertex_alignment(address(), value); return this; }

    }

}