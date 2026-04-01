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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEnvironmentRaycasterCreateCompletionMETA {
 *     XrStructureType type;
 *     void * next;
 *     XrResult futureResult;
 *     XrEnvironmentRaycasterMETA environmentRaycaster;
 * }}</pre>
 */
public class XrEnvironmentRaycasterCreateCompletionMETA extends Struct<XrEnvironmentRaycasterCreateCompletionMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FUTURERESULT,
        ENVIRONMENTRAYCASTER;

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
        ENVIRONMENTRAYCASTER = layout.offsetof(3);
    }

    protected XrEnvironmentRaycasterCreateCompletionMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEnvironmentRaycasterCreateCompletionMETA create(long address, @Nullable ByteBuffer container) {
        return new XrEnvironmentRaycasterCreateCompletionMETA(address, container);
    }

    /**
     * Creates a {@code XrEnvironmentRaycasterCreateCompletionMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEnvironmentRaycasterCreateCompletionMETA(ByteBuffer container) {
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
    /** @return the value of the {@code environmentRaycaster} field. */
    @NativeType("XrEnvironmentRaycasterMETA")
    public long environmentRaycaster() { return nenvironmentRaycaster(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEnvironmentRaycasterCreateCompletionMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META} value to the {@code type} field. */
    public XrEnvironmentRaycasterCreateCompletionMETA type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrEnvironmentRaycasterCreateCompletionMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code futureResult} field. */
    public XrEnvironmentRaycasterCreateCompletionMETA futureResult(@NativeType("XrResult") int value) { nfutureResult(address(), value); return this; }
    /** Sets the specified value to the {@code environmentRaycaster} field. */
    public XrEnvironmentRaycasterCreateCompletionMETA environmentRaycaster(XrEnvironmentRaycasterMETA value) { nenvironmentRaycaster(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEnvironmentRaycasterCreateCompletionMETA set(
        int type,
        long next,
        int futureResult,
        XrEnvironmentRaycasterMETA environmentRaycaster
    ) {
        type(type);
        next(next);
        futureResult(futureResult);
        environmentRaycaster(environmentRaycaster);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEnvironmentRaycasterCreateCompletionMETA set(XrEnvironmentRaycasterCreateCompletionMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEnvironmentRaycasterCreateCompletionMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycasterCreateCompletionMETA malloc() {
        return new XrEnvironmentRaycasterCreateCompletionMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycasterCreateCompletionMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEnvironmentRaycasterCreateCompletionMETA calloc() {
        return new XrEnvironmentRaycasterCreateCompletionMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEnvironmentRaycasterCreateCompletionMETA} instance allocated with {@link BufferUtils}. */
    public static XrEnvironmentRaycasterCreateCompletionMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEnvironmentRaycasterCreateCompletionMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrEnvironmentRaycasterCreateCompletionMETA} instance for the specified memory address. */
    public static XrEnvironmentRaycasterCreateCompletionMETA create(long address) {
        return new XrEnvironmentRaycasterCreateCompletionMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEnvironmentRaycasterCreateCompletionMETA createSafe(long address) {
        return address == NULL ? null : new XrEnvironmentRaycasterCreateCompletionMETA(address, null);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT} instance to {@code XrEnvironmentRaycasterCreateCompletionMETA}. */
    public static XrEnvironmentRaycasterCreateCompletionMETA create(XrFutureCompletionBaseHeaderEXT value) {
        return new XrEnvironmentRaycasterCreateCompletionMETA(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEnvironmentRaycasterCreateCompletionMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrFutureCompletionBaseHeaderEXT.Buffer} instance to {@code XrEnvironmentRaycasterCreateCompletionMETA.Buffer}. */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer create(XrFutureCompletionBaseHeaderEXT.Buffer value) {
        return new XrEnvironmentRaycasterCreateCompletionMETA.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEnvironmentRaycasterCreateCompletionMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA malloc(MemoryStack stack) {
        return new XrEnvironmentRaycasterCreateCompletionMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEnvironmentRaycasterCreateCompletionMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA calloc(MemoryStack stack) {
        return new XrEnvironmentRaycasterCreateCompletionMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEnvironmentRaycasterCreateCompletionMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEnvironmentRaycasterCreateCompletionMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEnvironmentRaycasterCreateCompletionMETA.NEXT); }
    /** Unsafe version of {@link #futureResult}. */
    public static int nfutureResult(long struct) { return memGetInt(struct + XrEnvironmentRaycasterCreateCompletionMETA.FUTURERESULT); }
    /** Unsafe version of {@link #environmentRaycaster}. */
    public static long nenvironmentRaycaster(long struct) { return memGetAddress(struct + XrEnvironmentRaycasterCreateCompletionMETA.ENVIRONMENTRAYCASTER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEnvironmentRaycasterCreateCompletionMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEnvironmentRaycasterCreateCompletionMETA.NEXT, value); }
    /** Unsafe version of {@link #futureResult(int) futureResult}. */
    public static void nfutureResult(long struct, int value) { memPutInt(struct + XrEnvironmentRaycasterCreateCompletionMETA.FUTURERESULT, value); }
    /** Unsafe version of {@link #environmentRaycaster(XrEnvironmentRaycasterMETA) environmentRaycaster}. */
    public static void nenvironmentRaycaster(long struct, XrEnvironmentRaycasterMETA value) { memPutAddress(struct + XrEnvironmentRaycasterCreateCompletionMETA.ENVIRONMENTRAYCASTER, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEnvironmentRaycasterCreateCompletionMETA.ENVIRONMENTRAYCASTER));
    }

    // -----------------------------------

    /** An array of {@link XrEnvironmentRaycasterCreateCompletionMETA} structs. */
    public static class Buffer extends StructBuffer<XrEnvironmentRaycasterCreateCompletionMETA, Buffer> implements NativeResource {

        private static final XrEnvironmentRaycasterCreateCompletionMETA ELEMENT_FACTORY = XrEnvironmentRaycasterCreateCompletionMETA.create(-1L);

        /**
         * Creates a new {@code XrEnvironmentRaycasterCreateCompletionMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEnvironmentRaycasterCreateCompletionMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEnvironmentRaycasterCreateCompletionMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEnvironmentRaycasterCreateCompletionMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrEnvironmentRaycasterCreateCompletionMETA.nnext(address()); }
        /** @return the value of the {@code futureResult} field. */
        @NativeType("XrResult")
        public int futureResult() { return XrEnvironmentRaycasterCreateCompletionMETA.nfutureResult(address()); }
        /** @return the value of the {@code environmentRaycaster} field. */
        @NativeType("XrEnvironmentRaycasterMETA")
        public long environmentRaycaster() { return XrEnvironmentRaycasterCreateCompletionMETA.nenvironmentRaycaster(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEnvironmentRaycasterCreateCompletionMETA.Buffer type(@NativeType("XrStructureType") int value) { XrEnvironmentRaycasterCreateCompletionMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAEnvironmentRaycast#XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META} value to the {@code type} field. */
        public XrEnvironmentRaycasterCreateCompletionMETA.Buffer type$Default() { return type(METAEnvironmentRaycast.XR_TYPE_ENVIRONMENT_RAYCASTER_CREATE_COMPLETION_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrEnvironmentRaycasterCreateCompletionMETA.Buffer next(@NativeType("void *") long value) { XrEnvironmentRaycasterCreateCompletionMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code futureResult} field. */
        public XrEnvironmentRaycasterCreateCompletionMETA.Buffer futureResult(@NativeType("XrResult") int value) { XrEnvironmentRaycasterCreateCompletionMETA.nfutureResult(address(), value); return this; }
        /** Sets the specified value to the {@code environmentRaycaster} field. */
        public XrEnvironmentRaycasterCreateCompletionMETA.Buffer environmentRaycaster(XrEnvironmentRaycasterMETA value) { XrEnvironmentRaycasterCreateCompletionMETA.nenvironmentRaycaster(address(), value); return this; }

    }

}