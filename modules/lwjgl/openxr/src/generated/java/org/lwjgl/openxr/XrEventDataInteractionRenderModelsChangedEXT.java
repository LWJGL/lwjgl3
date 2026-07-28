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
 * struct XrEventDataInteractionRenderModelsChangedEXT {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrEventDataInteractionRenderModelsChangedEXT extends Struct<XrEventDataInteractionRenderModelsChangedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrEventDataInteractionRenderModelsChangedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataInteractionRenderModelsChangedEXT create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataInteractionRenderModelsChangedEXT(address, container);
    }

    /**
     * Creates a {@code XrEventDataInteractionRenderModelsChangedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataInteractionRenderModelsChangedEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEventDataInteractionRenderModelsChangedEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTInteractionRenderModel#XR_TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT} value to the {@code type} field. */
    public XrEventDataInteractionRenderModelsChangedEXT type$Default() { return type(EXTInteractionRenderModel.XR_TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrEventDataInteractionRenderModelsChangedEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataInteractionRenderModelsChangedEXT set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataInteractionRenderModelsChangedEXT set(XrEventDataInteractionRenderModelsChangedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataInteractionRenderModelsChangedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataInteractionRenderModelsChangedEXT malloc() {
        return new XrEventDataInteractionRenderModelsChangedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataInteractionRenderModelsChangedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataInteractionRenderModelsChangedEXT calloc() {
        return new XrEventDataInteractionRenderModelsChangedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataInteractionRenderModelsChangedEXT} instance allocated with {@link BufferUtils}. */
    public static XrEventDataInteractionRenderModelsChangedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataInteractionRenderModelsChangedEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataInteractionRenderModelsChangedEXT} instance for the specified memory address. */
    public static XrEventDataInteractionRenderModelsChangedEXT create(long address) {
        return new XrEventDataInteractionRenderModelsChangedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataInteractionRenderModelsChangedEXT createSafe(long address) {
        return address == NULL ? null : new XrEventDataInteractionRenderModelsChangedEXT(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataInteractionRenderModelsChangedEXT}. */
    public static XrEventDataInteractionRenderModelsChangedEXT create(XrEventDataBaseHeader value) {
        return new XrEventDataInteractionRenderModelsChangedEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataInteractionRenderModelsChangedEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataInteractionRenderModelsChangedEXT.Buffer}. */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataInteractionRenderModelsChangedEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataInteractionRenderModelsChangedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataInteractionRenderModelsChangedEXT malloc(MemoryStack stack) {
        return new XrEventDataInteractionRenderModelsChangedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataInteractionRenderModelsChangedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataInteractionRenderModelsChangedEXT calloc(MemoryStack stack) {
        return new XrEventDataInteractionRenderModelsChangedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataInteractionRenderModelsChangedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataInteractionRenderModelsChangedEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataInteractionRenderModelsChangedEXT.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataInteractionRenderModelsChangedEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataInteractionRenderModelsChangedEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataInteractionRenderModelsChangedEXT} structs. */
    public static class Buffer extends StructBuffer<XrEventDataInteractionRenderModelsChangedEXT, Buffer> implements NativeResource {

        private static final XrEventDataInteractionRenderModelsChangedEXT ELEMENT_FACTORY = XrEventDataInteractionRenderModelsChangedEXT.create(-1L);

        /**
         * Creates a new {@code XrEventDataInteractionRenderModelsChangedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataInteractionRenderModelsChangedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEventDataInteractionRenderModelsChangedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataInteractionRenderModelsChangedEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataInteractionRenderModelsChangedEXT.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEventDataInteractionRenderModelsChangedEXT.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataInteractionRenderModelsChangedEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTInteractionRenderModel#XR_TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT} value to the {@code type} field. */
        public XrEventDataInteractionRenderModelsChangedEXT.Buffer type$Default() { return type(EXTInteractionRenderModel.XR_TYPE_EVENT_DATA_INTERACTION_RENDER_MODELS_CHANGED_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrEventDataInteractionRenderModelsChangedEXT.Buffer next(@NativeType("void const *") long value) { XrEventDataInteractionRenderModelsChangedEXT.nnext(address(), value); return this; }

    }

}