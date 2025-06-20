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
 * struct XrCreateSpatialContextCompletionEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrSpatialContextEXT spatialContext;
 * }}</pre>
 */
public class XrCreateSpatialContextCompletionEXT extends Struct<XrCreateSpatialContextCompletionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        SPATIALCONTEXT;

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
        FUTURERESULT = layout.offsetof(2);
        SPATIALCONTEXT = layout.offsetof(3);
    }

    protected XrCreateSpatialContextCompletionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrCreateSpatialContextCompletionEXT create(long address, @Nullable ByteBuffer container) {
        return new XrCreateSpatialContextCompletionEXT(address, container);
    }

    /**
     * Creates a {@code XrCreateSpatialContextCompletionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrCreateSpatialContextCompletionEXT(ByteBuffer container) {
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
    /** @return the value of the {@code futureResult} field. */
    @NativeType("XrResult")
    public int futureResult() { return nfutureResult(address()); }
    /** @return the value of the {@code spatialContext} field. */
    @NativeType("XrSpatialContextEXT")
    public @Nullable long spatialContext() { return nspatialContext(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrCreateSpatialContextCompletionEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTSpatialEntity#XR_TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT} value to the {@code type} field. */
    public XrCreateSpatialContextCompletionEXT type$Default() { return type(EXTSpatialEntity.XR_TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrCreateSpatialContextCompletionEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrCreateSpatialContextCompletionEXT futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code spatialContext} field. */
    public XrCreateSpatialContextCompletionEXT spatialContext(@Nullable XrSpatialContextEXT value) { nspatialContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrCreateSpatialContextCompletionEXT set(
        int type,
        long next,
        int futureResult,
        XrSpatialContextEXT spatialContext
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        spatialContext(spatialContext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrCreateSpatialContextCompletionEXT set(XrCreateSpatialContextCompletionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrCreateSpatialContextCompletionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialContextCompletionEXT malloc() {
        return new XrCreateSpatialContextCompletionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialContextCompletionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrCreateSpatialContextCompletionEXT calloc() {
        return new XrCreateSpatialContextCompletionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrCreateSpatialContextCompletionEXT} instance allocated with {@link BufferUtils}. */
    public static XrCreateSpatialContextCompletionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrCreateSpatialContextCompletionEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrCreateSpatialContextCompletionEXT} instance for the specified memory address. */
    public static XrCreateSpatialContextCompletionEXT create(long address) {
        return new XrCreateSpatialContextCompletionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrCreateSpatialContextCompletionEXT createSafe(long address) {
        return address == NULL ? null : new XrCreateSpatialContextCompletionEXT(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrCreateSpatialContextCompletionEXT}. */
    public static XrCreateSpatialContextCompletionEXT create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrCreateSpatialContextCompletionEXT(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrCreateSpatialContextCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialContextCompletionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialContextCompletionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialContextCompletionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialContextCompletionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialContextCompletionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrCreateSpatialContextCompletionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialContextCompletionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrCreateSpatialContextCompletionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrCreateSpatialContextCompletionEXT.Buffer}. */
    public static XrCreateSpatialContextCompletionEXT.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrCreateSpatialContextCompletionEXT.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrCreateSpatialContextCompletionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialContextCompletionEXT malloc(MemoryStack stack) {
        return new XrCreateSpatialContextCompletionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrCreateSpatialContextCompletionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrCreateSpatialContextCompletionEXT calloc(MemoryStack stack) {
        return new XrCreateSpatialContextCompletionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrCreateSpatialContextCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialContextCompletionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrCreateSpatialContextCompletionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrCreateSpatialContextCompletionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrCreateSpatialContextCompletionEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrCreateSpatialContextCompletionEXT.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrCreateSpatialContextCompletionEXT.FUTURERESULT); }
    /** Unsafe version of {@link #spatialContext}. */
    public static long nspatialContext(long struct) { return memGetAddress(struct + XrCreateSpatialContextCompletionEXT.SPATIALCONTEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrCreateSpatialContextCompletionEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrCreateSpatialContextCompletionEXT.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrCreateSpatialContextCompletionEXT.FUTURERESULT, value); }
    /** Unsafe version of {@link #spatialContext(XrSpatialContextEXT) spatialContext}. */
    public static void nspatialContext(long struct, @Nullable XrSpatialContextEXT value) { memPutAddress(struct + XrCreateSpatialContextCompletionEXT.SPATIALCONTEXT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link XrCreateSpatialContextCompletionEXT} structs. */
    public static class Buffer extends StructBuffer<XrCreateSpatialContextCompletionEXT, Buffer> implements NativeResource {

        private static final XrCreateSpatialContextCompletionEXT ELEMENT_FACTORY = XrCreateSpatialContextCompletionEXT.create(-1L);

        /**
         * Creates a new {@code XrCreateSpatialContextCompletionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrCreateSpatialContextCompletionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrCreateSpatialContextCompletionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrCreateSpatialContextCompletionEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrCreateSpatialContextCompletionEXT.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrCreateSpatialContextCompletionEXT.nfutureResult(address()); }
        /** @return the value of the {@code spatialContext} field. */
        @NativeType("XrSpatialContextEXT")
        public @Nullable long spatialContext() { return XrCreateSpatialContextCompletionEXT.nspatialContext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrCreateSpatialContextCompletionEXT.Buffer type(@NativeType("XrStructureType") int value) { XrCreateSpatialContextCompletionEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTSpatialEntity#XR_TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT} value to the {@code type} field. */
        public XrCreateSpatialContextCompletionEXT.Buffer type$Default() { return type(EXTSpatialEntity.XR_TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrCreateSpatialContextCompletionEXT.Buffer next(@NativeType("void *") long value) { XrCreateSpatialContextCompletionEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrCreateSpatialContextCompletionEXT.Buffer futureResult(@NativeType("XrResult") int value) { XrCreateSpatialContextCompletionEXT.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code spatialContext} field. */
        public XrCreateSpatialContextCompletionEXT.Buffer spatialContext(@Nullable XrSpatialContextEXT value) { XrCreateSpatialContextCompletionEXT.nspatialContext(address(), value); return this; }

    }

}