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
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_draw_list {
 *     {@link NkRect struct nk_rect} clip_rect;
 *     {@link NkVec2 struct nk_vec2} circle_vtx[12];
 *     {@link NkConvertConfig struct nk_convert_config} config;
 *     {@link NkBuffer struct nk_buffer} * buffer;
 *     {@link NkBuffer struct nk_buffer} * vertices;
 *     {@link NkBuffer struct nk_buffer} * elements;
 *     unsigned int element_count;
 *     unsigned int vertex_count;
 *     unsigned int cmd_count;
 *     nk_size cmd_offset;
 *     unsigned int path_count;
 *     unsigned int path_offset;
 *     enum nk_anti_aliasing line_AA;
 *     enum nk_anti_aliasing shape_AA;
 *     {@link NkHandle nk_handle} userdata;
 * }</code></pre>
 */
@NativeType("struct nk_draw_list")
public class NkDrawList extends Struct<NkDrawList> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLIP_RECT,
        CIRCLE_VTX,
        CONFIG,
        BUFFER,
        VERTICES,
        ELEMENTS,
        ELEMENT_COUNT,
        VERTEX_COUNT,
        CMD_COUNT,
        CMD_OFFSET,
        PATH_COUNT,
        PATH_OFFSET,
        LINE_AA,
        SHAPE_AA,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __array(NkVec2.SIZEOF, NkVec2.ALIGNOF, 12),
            __member(NkConvertConfig.SIZEOF, NkConvertConfig.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLIP_RECT = layout.offsetof(0);
        CIRCLE_VTX = layout.offsetof(1);
        CONFIG = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        VERTICES = layout.offsetof(4);
        ELEMENTS = layout.offsetof(5);
        ELEMENT_COUNT = layout.offsetof(6);
        VERTEX_COUNT = layout.offsetof(7);
        CMD_COUNT = layout.offsetof(8);
        CMD_OFFSET = layout.offsetof(9);
        PATH_COUNT = layout.offsetof(10);
        PATH_OFFSET = layout.offsetof(11);
        LINE_AA = layout.offsetof(12);
        SHAPE_AA = layout.offsetof(13);
        USERDATA = layout.offsetof(14);
    }

    protected NkDrawList(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkDrawList create(long address, @Nullable ByteBuffer container) {
        return new NkDrawList(address, container);
    }

    /**
     * Creates a {@code NkDrawList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkDrawList(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkRect} view of the {@code clip_rect} field. */
    @NativeType("struct nk_rect")
    public NkRect clip_rect() { return nclip_rect(address()); }
    /** @return a {@link NkVec2}.Buffer view of the {@code circle_vtx} field. */
    @NativeType("struct nk_vec2[12]")
    public NkVec2.Buffer circle_vtx() { return ncircle_vtx(address()); }
    /** @return a {@link NkVec2} view of the struct at the specified index of the {@code circle_vtx} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 circle_vtx(int index) { return ncircle_vtx(address(), index); }
    /** @return a {@link NkConvertConfig} view of the {@code config} field. */
    @NativeType("struct nk_convert_config")
    public NkConvertConfig config() { return nconfig(address()); }
    /** @return a {@link NkBuffer} view of the struct pointed to by the {@code buffer} field. */
    @NativeType("struct nk_buffer *")
    public @Nullable NkBuffer buffer() { return nbuffer(address()); }
    /** @return a {@link NkBuffer} view of the struct pointed to by the {@code vertices} field. */
    @NativeType("struct nk_buffer *")
    public @Nullable NkBuffer vertices() { return nvertices(address()); }
    /** @return a {@link NkBuffer} view of the struct pointed to by the {@code elements} field. */
    @NativeType("struct nk_buffer *")
    public @Nullable NkBuffer elements() { return nelements(address()); }
    /** @return the value of the {@code element_count} field. */
    @NativeType("unsigned int")
    public int element_count() { return nelement_count(address()); }
    /** @return the value of the {@code vertex_count} field. */
    @NativeType("unsigned int")
    public int vertex_count() { return nvertex_count(address()); }
    /** @return the value of the {@code cmd_count} field. */
    @NativeType("unsigned int")
    public int cmd_count() { return ncmd_count(address()); }
    /** @return the value of the {@code cmd_offset} field. */
    @NativeType("nk_size")
    public long cmd_offset() { return ncmd_offset(address()); }
    /** @return the value of the {@code path_count} field. */
    @NativeType("unsigned int")
    public int path_count() { return npath_count(address()); }
    /** @return the value of the {@code path_offset} field. */
    @NativeType("unsigned int")
    public int path_offset() { return npath_offset(address()); }
    /** @return the value of the {@code line_AA} field. */
    @NativeType("enum nk_anti_aliasing")
    public int line_AA() { return nline_AA(address()); }
    /** @return the value of the {@code shape_AA} field. */
    @NativeType("enum nk_anti_aliasing")
    public int shape_AA() { return nshape_AA(address()); }
    /** @return a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }

    // -----------------------------------

    /** Returns a new {@code NkDrawList} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkDrawList malloc() {
        return new NkDrawList(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkDrawList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkDrawList calloc() {
        return new NkDrawList(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkDrawList} instance allocated with {@link BufferUtils}. */
    public static NkDrawList create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkDrawList(memAddress(container), container);
    }

    /** Returns a new {@code NkDrawList} instance for the specified memory address. */
    public static NkDrawList create(long address) {
        return new NkDrawList(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkDrawList createSafe(long address) {
        return address == NULL ? null : new NkDrawList(address, null);
    }

    /**
     * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawList.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawList.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawList.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkDrawList.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkDrawList.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkDrawList.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawList mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawList callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawList mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawList callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawList.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawList.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawList.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawList.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkDrawList} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawList malloc(MemoryStack stack) {
        return new NkDrawList(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkDrawList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawList calloc(MemoryStack stack) {
        return new NkDrawList(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkDrawList.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawList.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawList.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clip_rect}. */
    public static NkRect nclip_rect(long struct) { return NkRect.create(struct + NkDrawList.CLIP_RECT); }
    /** Unsafe version of {@link #circle_vtx}. */
    public static NkVec2.Buffer ncircle_vtx(long struct) { return NkVec2.create(struct + NkDrawList.CIRCLE_VTX, 12); }
    /** Unsafe version of {@link #circle_vtx(int) circle_vtx}. */
    public static NkVec2 ncircle_vtx(long struct, int index) {
        return NkVec2.create(struct + NkDrawList.CIRCLE_VTX + check(index, 12) * NkVec2.SIZEOF);
    }
    /** Unsafe version of {@link #config}. */
    public static NkConvertConfig nconfig(long struct) { return NkConvertConfig.create(struct + NkDrawList.CONFIG); }
    /** Unsafe version of {@link #buffer}. */
    public static @Nullable NkBuffer nbuffer(long struct) { return NkBuffer.createSafe(memGetAddress(struct + NkDrawList.BUFFER)); }
    /** Unsafe version of {@link #vertices}. */
    public static @Nullable NkBuffer nvertices(long struct) { return NkBuffer.createSafe(memGetAddress(struct + NkDrawList.VERTICES)); }
    /** Unsafe version of {@link #elements}. */
    public static @Nullable NkBuffer nelements(long struct) { return NkBuffer.createSafe(memGetAddress(struct + NkDrawList.ELEMENTS)); }
    /** Unsafe version of {@link #element_count}. */
    public static int nelement_count(long struct) { return memGetInt(struct + NkDrawList.ELEMENT_COUNT); }
    /** Unsafe version of {@link #vertex_count}. */
    public static int nvertex_count(long struct) { return memGetInt(struct + NkDrawList.VERTEX_COUNT); }
    /** Unsafe version of {@link #cmd_count}. */
    public static int ncmd_count(long struct) { return memGetInt(struct + NkDrawList.CMD_COUNT); }
    /** Unsafe version of {@link #cmd_offset}. */
    public static long ncmd_offset(long struct) { return memGetAddress(struct + NkDrawList.CMD_OFFSET); }
    /** Unsafe version of {@link #path_count}. */
    public static int npath_count(long struct) { return memGetInt(struct + NkDrawList.PATH_COUNT); }
    /** Unsafe version of {@link #path_offset}. */
    public static int npath_offset(long struct) { return memGetInt(struct + NkDrawList.PATH_OFFSET); }
    /** Unsafe version of {@link #line_AA}. */
    public static int nline_AA(long struct) { return memGetInt(struct + NkDrawList.LINE_AA); }
    /** Unsafe version of {@link #shape_AA}. */
    public static int nshape_AA(long struct) { return memGetInt(struct + NkDrawList.SHAPE_AA); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkDrawList.USERDATA); }

    // -----------------------------------

    /** An array of {@link NkDrawList} structs. */
    public static class Buffer extends StructBuffer<NkDrawList, Buffer> implements NativeResource {

        private static final NkDrawList ELEMENT_FACTORY = NkDrawList.create(-1L);

        /**
         * Creates a new {@code NkDrawList.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkDrawList#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkDrawList getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkRect} view of the {@code clip_rect} field. */
        @NativeType("struct nk_rect")
        public NkRect clip_rect() { return NkDrawList.nclip_rect(address()); }
        /** @return a {@link NkVec2}.Buffer view of the {@code circle_vtx} field. */
        @NativeType("struct nk_vec2[12]")
        public NkVec2.Buffer circle_vtx() { return NkDrawList.ncircle_vtx(address()); }
        /** @return a {@link NkVec2} view of the struct at the specified index of the {@code circle_vtx} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 circle_vtx(int index) { return NkDrawList.ncircle_vtx(address(), index); }
        /** @return a {@link NkConvertConfig} view of the {@code config} field. */
        @NativeType("struct nk_convert_config")
        public NkConvertConfig config() { return NkDrawList.nconfig(address()); }
        /** @return a {@link NkBuffer} view of the struct pointed to by the {@code buffer} field. */
        @NativeType("struct nk_buffer *")
        public @Nullable NkBuffer buffer() { return NkDrawList.nbuffer(address()); }
        /** @return a {@link NkBuffer} view of the struct pointed to by the {@code vertices} field. */
        @NativeType("struct nk_buffer *")
        public @Nullable NkBuffer vertices() { return NkDrawList.nvertices(address()); }
        /** @return a {@link NkBuffer} view of the struct pointed to by the {@code elements} field. */
        @NativeType("struct nk_buffer *")
        public @Nullable NkBuffer elements() { return NkDrawList.nelements(address()); }
        /** @return the value of the {@code element_count} field. */
        @NativeType("unsigned int")
        public int element_count() { return NkDrawList.nelement_count(address()); }
        /** @return the value of the {@code vertex_count} field. */
        @NativeType("unsigned int")
        public int vertex_count() { return NkDrawList.nvertex_count(address()); }
        /** @return the value of the {@code cmd_count} field. */
        @NativeType("unsigned int")
        public int cmd_count() { return NkDrawList.ncmd_count(address()); }
        /** @return the value of the {@code cmd_offset} field. */
        @NativeType("nk_size")
        public long cmd_offset() { return NkDrawList.ncmd_offset(address()); }
        /** @return the value of the {@code path_count} field. */
        @NativeType("unsigned int")
        public int path_count() { return NkDrawList.npath_count(address()); }
        /** @return the value of the {@code path_offset} field. */
        @NativeType("unsigned int")
        public int path_offset() { return NkDrawList.npath_offset(address()); }
        /** @return the value of the {@code line_AA} field. */
        @NativeType("enum nk_anti_aliasing")
        public int line_AA() { return NkDrawList.nline_AA(address()); }
        /** @return the value of the {@code shape_AA} field. */
        @NativeType("enum nk_anti_aliasing")
        public int shape_AA() { return NkDrawList.nshape_AA(address()); }
        /** @return a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkDrawList.nuserdata(address()); }

    }

}