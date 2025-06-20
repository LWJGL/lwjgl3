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
 * struct XrRenderModelStateGetInfoEXT {
 *     XrStructureType type;
 *     void const * next;
 *     XrTime displayTime;
 * }}</pre>
 */
public class XrRenderModelStateGetInfoEXT extends Struct<XrRenderModelStateGetInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISPLAYTIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISPLAYTIME = layout.offsetof(2);
    }

    protected XrRenderModelStateGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrRenderModelStateGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrRenderModelStateGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrRenderModelStateGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrRenderModelStateGetInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code displayTime} field. */
    @NativeType("XrTime")
    public long displayTime() { return ndisplayTime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrRenderModelStateGetInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_STATE_GET_INFO_EXT TYPE_RENDER_MODEL_STATE_GET_INFO_EXT} value to the {@code type} field. */
    public XrRenderModelStateGetInfoEXT type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_STATE_GET_INFO_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrRenderModelStateGetInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code displayTime} field. */
    public XrRenderModelStateGetInfoEXT displayTime(@NativeType("XrTime") long value) { ndisplayTime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrRenderModelStateGetInfoEXT set(
        int type,
        long next,
        long displayTime
    ) {
        type(type);
        next(next);
        displayTime(displayTime);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrRenderModelStateGetInfoEXT set(XrRenderModelStateGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrRenderModelStateGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrRenderModelStateGetInfoEXT malloc() {
        return new XrRenderModelStateGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelStateGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrRenderModelStateGetInfoEXT calloc() {
        return new XrRenderModelStateGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrRenderModelStateGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrRenderModelStateGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrRenderModelStateGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrRenderModelStateGetInfoEXT} instance for the specified memory address. */
    public static XrRenderModelStateGetInfoEXT create(long address) {
        return new XrRenderModelStateGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrRenderModelStateGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrRenderModelStateGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrRenderModelStateGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelStateGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelStateGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrRenderModelStateGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrRenderModelStateGetInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrRenderModelStateGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelStateGetInfoEXT malloc(MemoryStack stack) {
        return new XrRenderModelStateGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrRenderModelStateGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrRenderModelStateGetInfoEXT calloc(MemoryStack stack) {
        return new XrRenderModelStateGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrRenderModelStateGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrRenderModelStateGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrRenderModelStateGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrRenderModelStateGetInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrRenderModelStateGetInfoEXT.NEXT); }
    /** Unsafe version of {@link #displayTime}. */
    public static long ndisplayTime(long struct) { return memGetLong(struct + XrRenderModelStateGetInfoEXT.DISPLAYTIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrRenderModelStateGetInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrRenderModelStateGetInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #displayTime(long) displayTime}. */
    public static void ndisplayTime(long struct, long value) { memPutLong(struct + XrRenderModelStateGetInfoEXT.DISPLAYTIME, value); }

    // -----------------------------------

    /** An array of {@link XrRenderModelStateGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrRenderModelStateGetInfoEXT, Buffer> implements NativeResource {

        private static final XrRenderModelStateGetInfoEXT ELEMENT_FACTORY = XrRenderModelStateGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrRenderModelStateGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrRenderModelStateGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrRenderModelStateGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrRenderModelStateGetInfoEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrRenderModelStateGetInfoEXT.nnext(address()); }
        /** @return the value of the {@code displayTime} field. */
        @NativeType("XrTime")
        public long displayTime() { return XrRenderModelStateGetInfoEXT.ndisplayTime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrRenderModelStateGetInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrRenderModelStateGetInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTRenderModel#XR_TYPE_RENDER_MODEL_STATE_GET_INFO_EXT TYPE_RENDER_MODEL_STATE_GET_INFO_EXT} value to the {@code type} field. */
        public XrRenderModelStateGetInfoEXT.Buffer type$Default() { return type(EXTRenderModel.XR_TYPE_RENDER_MODEL_STATE_GET_INFO_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrRenderModelStateGetInfoEXT.Buffer next(@NativeType("void const *") long value) { XrRenderModelStateGetInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code displayTime} field. */
        public XrRenderModelStateGetInfoEXT.Buffer displayTime(@NativeType("XrTime") long value) { XrRenderModelStateGetInfoEXT.ndisplayTime(address(), value); return this; }

    }

}