/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrRenderModelStateEXT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t nodeStateCount;
 *     {@link XrRenderModelNodeStateEXT XrRenderModelNodeStateEXT} * nodeStates;
 * }}</pre>
 */
public class XrRenderModelStateEXT extends Struct<XrRenderModelStateEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODESTATECOUNT,
        NODESTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODESTATECOUNT = layout.offsetof(2);
        NODESTATES = layout.offsetof(3);
    }

    protected XrRenderModelStateEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelStateEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelStateEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelStateEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelStateEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code nodeStateCount} field. */
    @NativeType("uint32_t")
    public int nodeStateCount() { return nnodeStateCount(address()); }
    /** @return a {@link XrRenderModelNodeStateEXT.Buffer} view of the struct array pointed to by the {@code nodeStates} field. */
    @NativeType("XrRenderModelNodeStateEXT *")
    public XrRenderModelNodeStateEXT.@Nullable Buffer nodeStates() { return nnodeStates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelStateEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_STATE_EXT TYPE_RENDER_MODEL_STATE_EXT} value to the {@code type} field. */
    public XrRenderModelStateEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_STATE_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelStateEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code nodeStateCount} field. */
    public XrRenderModelStateEXT nodeStateCount(@NativeType("uint32_t") int value) { nnodeStateCount(address(), value); return this; }
    /** Sets the address of the specified {@link XrRenderModelNodeStateEXT.Buffer} to the {@code nodeStates} field. */
    public XrRenderModelStateEXT nodeStates(@NativeType("XrRenderModelNodeStateEXT *") XrRenderModelNodeStateEXT.@Nullable Buffer value) { nnodeStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelStateEXT set(
        int type,
        long next,
        int nodeStateCount,
        XrRenderModelNodeStateEXT.@Nullable Buffer nodeStates
    ) {
        type(type);
        next(next);
        nodeStateCount(nodeStateCount);
        nodeStates(nodeStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelStateEXT set(XrRenderModelStateEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelStateEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelStateEXT malloc() {
        return new XrRenderModelStateEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelStateEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelStateEXT calloc() {
        return new XrRenderModelStateEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelStateEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelStateEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelStateEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelStateEXT} instance for the specified memory address. */
    public static XrRenderModelStateEXT create(long address) {
        return new XrRenderModelStateEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelStateEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelStateEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelStateEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelStateEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelStateEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelStateEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelStateEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelStateEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelStateEXT malloc(MemoryStack stack) {
        return new XrRenderModelStateEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelStateEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelStateEXT calloc(MemoryStack stack) {
        return new XrRenderModelStateEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelStateEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelStateEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelStateEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelStateEXT.NEXT); }
    /** Unsafe version of {@link #nodeStateCount}. */
    public static int nnodeStateCount(long struct) { return memGetInt(struct + XrRenderModelStateEXT.NODESTATECOUNT); }
    /** Unsafe version of {@link #nodeStates}. */
    public static XrRenderModelNodeStateEXT.@Nullable Buffer nnodeStates(long struct) { return XrRenderModelNodeStateEXT.createSafe(memGetAddress(struct + XrRenderModelStateEXT.NODESTATES), nnodeStateCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelStateEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelStateEXT.NEXT, value); }
    /** Sets the specified value to the {@code nodeStateCount} field of the specified {@code struct}. */
    public static void nnodeStateCount(long struct, int value) { memPutInt(struct + XrRenderModelStateEXT.NODESTATECOUNT, value); }
    /** Unsafe version of {@link #nodeStates(XrRenderModelNodeStateEXT.Buffer) nodeStates}. */
    public static void nnodeStates(long struct, XrRenderModelNodeStateEXT.@Nullable Buffer value) { memPutAddress(struct + XrRenderModelStateEXT.NODESTATES, memAddressSafe(value)); if (value != null) { nnodeStateCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrRenderModelStateEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelStateEXT, Buffer> implements NativeResource {

        private static final XrRenderModelStateEXT ELEMENT_FACTORY = XrRenderModelStateEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelStateEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelStateEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelStateEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelStateEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrRenderModelStateEXT.nnext(address()); }
        /** @return the value of the {@code nodeStateCount} field. */
        @NativeType("uint32_t")
        public int nodeStateCount() { return XrRenderModelStateEXT.nnodeStateCount(address()); }
        /** @return a {@link XrRenderModelNodeStateEXT.Buffer} view of the struct array pointed to by the {@code nodeStates} field. */
        @NativeType("XrRenderModelNodeStateEXT *")
        public XrRenderModelNodeStateEXT.@Nullable Buffer nodeStates() { return XrRenderModelStateEXT.nnodeStates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelStateEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelStateEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_STATE_EXT TYPE_RENDER_MODEL_STATE_EXT} value to the {@code type} field. */
        public XrRenderModelStateEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_STATE_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelStateEXT.Buffer next(@NativeType("void *") long value) { XrRenderModelStateEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code nodeStateCount} field. */
        public XrRenderModelStateEXT.Buffer nodeStateCount(@NativeType("uint32_t") int value) { XrRenderModelStateEXT.nnodeStateCount(address(), value); return this; }
        /** Sets the address of the specified {@link XrRenderModelNodeStateEXT.Buffer} to the {@code nodeStates} field. */
        public XrRenderModelStateEXT.Buffer nodeStates(@NativeType("XrRenderModelNodeStateEXT *") XrRenderModelNodeStateEXT.@Nullable Buffer value) { XrRenderModelStateEXT.nnodeStates(address(), value); return this; }

    }

}