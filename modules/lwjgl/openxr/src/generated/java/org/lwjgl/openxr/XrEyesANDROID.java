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

import static org.lwjgl.openxr.ANDROIDEyeTracking.*;

/**
 * <pre><code>
 * struct XrEyesANDROID {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrEyeANDROID XrEyeANDROID} eyes[XR_EYE_MAX_ANDROID];
 *     XrEyeTrackingModeANDROID mode;
 * }</code></pre>
 */
public class XrEyesANDROID extends Struct<XrEyesANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        EYES,
        MODE;

    static {
        XrEyeANDROID.createSafe(NULL);

        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(XrEyeANDROID.SIZEOF, XrEyeANDROID.ALIGNOF, XR_EYE_MAX_ANDROID),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        EYES = layout.offsetof(2);
        MODE = layout.offsetof(3);
    }

    protected XrEyesANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyesANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrEyesANDROID(address, container);
    }

    /**
     * Creates a {@code XrEyesANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyesANDROID(ByteBuffer container) {
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
    /** @return a {@link XrEyeANDROID}.Buffer view of the {@code eyes} field. */
    @NativeType("XrEyeANDROID[XR_EYE_MAX_ANDROID]")
    public XrEyeANDROID.Buffer eyes() { return neyes(address()); }
    /** @return a {@link XrEyeANDROID} view of the struct at the specified index of the {@code eyes} field. */
    public XrEyeANDROID eyes(int index) { return neyes(address(), index); }
    /** @return the value of the {@code mode} field. */
    @NativeType("XrEyeTrackingModeANDROID")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrEyesANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDEyeTracking#XR_TYPE_EYES_ANDROID TYPE_EYES_ANDROID} value to the {@code type} field. */
    public XrEyesANDROID type$Default() { return type(ANDROIDEyeTracking.XR_TYPE_EYES_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrEyesANDROID next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrEyeANDROID.Buffer} to the {@code eyes} field. */
    public XrEyesANDROID eyes(@NativeType("XrEyeANDROID[XR_EYE_MAX_ANDROID]") XrEyeANDROID.Buffer value) { neyes(address(), value); return this; }
    /** Copies the specified {@link XrEyeANDROID} at the specified index of the {@code eyes} field. */
    public XrEyesANDROID eyes(int index, XrEyeANDROID value) { neyes(address(), index, value); return this; }
    /** Passes the {@code eyes} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyesANDROID eyes(java.util.function.Consumer<XrEyeANDROID.Buffer> consumer) { consumer.accept(eyes()); return this; }
    /** Passes the element at {@code index} of the {@code eyes} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyesANDROID eyes(int index, java.util.function.Consumer<XrEyeANDROID> consumer) { consumer.accept(eyes(index)); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public XrEyesANDROID mode(@NativeType("XrEyeTrackingModeANDROID") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyesANDROID set(
        int type,
        long next,
        XrEyeANDROID.Buffer eyes,
        int mode
    ) {
        type(type);
        next(next);
        eyes(eyes);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyesANDROID set(XrEyesANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyesANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyesANDROID malloc() {
        return new XrEyesANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyesANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyesANDROID calloc() {
        return new XrEyesANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyesANDROID} instance allocated with {@link BufferUtils}. */
    public static XrEyesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyesANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrEyesANDROID} instance for the specified memory address. */
    public static XrEyesANDROID create(long address) {
        return new XrEyesANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEyesANDROID createSafe(long address) {
        return address == NULL ? null : new XrEyesANDROID(address, null);
    }

    /**
     * Returns a new {@link XrEyesANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyesANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyesANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyesANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyesANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyesANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyesANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyesANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEyesANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyesANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyesANDROID malloc(MemoryStack stack) {
        return new XrEyesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyesANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyesANDROID calloc(MemoryStack stack) {
        return new XrEyesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyesANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyesANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyesANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyesANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEyesANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEyesANDROID.NEXT); }
    /** Unsafe version of {@link #eyes}. */
    public static XrEyeANDROID.Buffer neyes(long struct) { return XrEyeANDROID.create(struct + XrEyesANDROID.EYES, XR_EYE_MAX_ANDROID); }
    /** Unsafe version of {@link #eyes(int) eyes}. */
    public static XrEyeANDROID neyes(long struct, int index) {
        return XrEyeANDROID.create(struct + XrEyesANDROID.EYES + check(index, XR_EYE_MAX_ANDROID) * XrEyeANDROID.SIZEOF);
    }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + XrEyesANDROID.MODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEyesANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEyesANDROID.NEXT, value); }
    /** Unsafe version of {@link #eyes(XrEyeANDROID.Buffer) eyes}. */
    public static void neyes(long struct, XrEyeANDROID.Buffer value) {
        if (CHECKS) { checkGT(value, XR_EYE_MAX_ANDROID); }
        memCopy(value.address(), struct + XrEyesANDROID.EYES, value.remaining() * XrEyeANDROID.SIZEOF);
    }
    /** Unsafe version of {@link #eyes(int, XrEyeANDROID) eyes}. */
    public static void neyes(long struct, int index, XrEyeANDROID value) {
        memCopy(value.address(), struct + XrEyesANDROID.EYES + check(index, XR_EYE_MAX_ANDROID) * XrEyeANDROID.SIZEOF, XrEyeANDROID.SIZEOF);
    }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + XrEyesANDROID.MODE, value); }

    // -----------------------------------

    /** An array of {@link XrEyesANDROID} structs. */
    public static class Buffer extends StructBuffer<XrEyesANDROID, Buffer> implements NativeResource {

        private static final XrEyesANDROID ELEMENT_FACTORY = XrEyesANDROID.create(-1L);

        /**
         * Creates a new {@code XrEyesANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyesANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEyesANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrEyesANDROID.nnext(address()); }
        /** @return a {@link XrEyeANDROID}.Buffer view of the {@code eyes} field. */
        @NativeType("XrEyeANDROID[XR_EYE_MAX_ANDROID]")
        public XrEyeANDROID.Buffer eyes() { return XrEyesANDROID.neyes(address()); }
        /** @return a {@link XrEyeANDROID} view of the struct at the specified index of the {@code eyes} field. */
        public XrEyeANDROID eyes(int index) { return XrEyesANDROID.neyes(address(), index); }
        /** @return the value of the {@code mode} field. */
        @NativeType("XrEyeTrackingModeANDROID")
        public int mode() { return XrEyesANDROID.nmode(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrEyesANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrEyesANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDEyeTracking#XR_TYPE_EYES_ANDROID TYPE_EYES_ANDROID} value to the {@code type} field. */
        public XrEyesANDROID.Buffer type$Default() { return type(ANDROIDEyeTracking.XR_TYPE_EYES_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrEyesANDROID.Buffer next(@NativeType("void *") long value) { XrEyesANDROID.nnext(address(), value); return this; }
        /** Copies the specified {@link XrEyeANDROID.Buffer} to the {@code eyes} field. */
        public XrEyesANDROID.Buffer eyes(@NativeType("XrEyeANDROID[XR_EYE_MAX_ANDROID]") XrEyeANDROID.Buffer value) { XrEyesANDROID.neyes(address(), value); return this; }
        /** Copies the specified {@link XrEyeANDROID} at the specified index of the {@code eyes} field. */
        public XrEyesANDROID.Buffer eyes(int index, XrEyeANDROID value) { XrEyesANDROID.neyes(address(), index, value); return this; }
        /** Passes the {@code eyes} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyesANDROID.Buffer eyes(java.util.function.Consumer<XrEyeANDROID.Buffer> consumer) { consumer.accept(eyes()); return this; }
        /** Passes the element at {@code index} of the {@code eyes} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyesANDROID.Buffer eyes(int index, java.util.function.Consumer<XrEyeANDROID> consumer) { consumer.accept(eyes(index)); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public XrEyesANDROID.Buffer mode(@NativeType("XrEyeTrackingModeANDROID") int value) { XrEyesANDROID.nmode(address(), value); return this; }

    }

}