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
 * struct XrDigitalLensControlALMALENCE {
 *     XrStructureType type;
 *     void const * next;
 *     XrDigitalLensControlFlagsALMALENCE flags;
 * }}</pre>
 */
public class XrDigitalLensControlALMALENCE extends Struct<XrDigitalLensControlALMALENCE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    protected XrDigitalLensControlALMALENCE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDigitalLensControlALMALENCE create(long address, @Nullable ByteBuffer container) {
        return new XrDigitalLensControlALMALENCE(address, container);
    }

    /**
     * Creates a {@code XrDigitalLensControlALMALENCE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDigitalLensControlALMALENCE(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("XrDigitalLensControlFlagsALMALENCE")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrDigitalLensControlALMALENCE type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ALMALENCEDigitalLensControl#XR_TYPE_DIGITAL_LENS_CONTROL_ALMALENCE TYPE_DIGITAL_LENS_CONTROL_ALMALENCE} value to the {@code type} field. */
    public XrDigitalLensControlALMALENCE type$Default() { return type(ALMALENCEDigitalLensControl.XR_TYPE_DIGITAL_LENS_CONTROL_ALMALENCE); }
    /** Sets the specified value to the {@code next} field. */
    public XrDigitalLensControlALMALENCE next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrDigitalLensControlALMALENCE flags(@NativeType("XrDigitalLensControlFlagsALMALENCE") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrDigitalLensControlALMALENCE set(
        int type,
        long next,
        long flags
    ) {
        type(type);
        next(next);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDigitalLensControlALMALENCE set(XrDigitalLensControlALMALENCE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDigitalLensControlALMALENCE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDigitalLensControlALMALENCE malloc() {
        return new XrDigitalLensControlALMALENCE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDigitalLensControlALMALENCE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDigitalLensControlALMALENCE calloc() {
        return new XrDigitalLensControlALMALENCE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDigitalLensControlALMALENCE} instance allocated with {@link BufferUtils}. */
    public static XrDigitalLensControlALMALENCE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDigitalLensControlALMALENCE(memAddress(container), container);
    }

    /** Returns a new {@code XrDigitalLensControlALMALENCE} instance for the specified memory address. */
    public static XrDigitalLensControlALMALENCE create(long address) {
        return new XrDigitalLensControlALMALENCE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrDigitalLensControlALMALENCE createSafe(long address) {
        return address == NULL ? null : new XrDigitalLensControlALMALENCE(address, null);
    }

    /**
     * Returns a new {@link XrDigitalLensControlALMALENCE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDigitalLensControlALMALENCE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDigitalLensControlALMALENCE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDigitalLensControlALMALENCE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDigitalLensControlALMALENCE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDigitalLensControlALMALENCE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDigitalLensControlALMALENCE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDigitalLensControlALMALENCE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrDigitalLensControlALMALENCE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDigitalLensControlALMALENCE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDigitalLensControlALMALENCE malloc(MemoryStack stack) {
        return new XrDigitalLensControlALMALENCE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDigitalLensControlALMALENCE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDigitalLensControlALMALENCE calloc(MemoryStack stack) {
        return new XrDigitalLensControlALMALENCE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDigitalLensControlALMALENCE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDigitalLensControlALMALENCE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDigitalLensControlALMALENCE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDigitalLensControlALMALENCE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrDigitalLensControlALMALENCE.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrDigitalLensControlALMALENCE.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrDigitalLensControlALMALENCE.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrDigitalLensControlALMALENCE.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrDigitalLensControlALMALENCE.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrDigitalLensControlALMALENCE.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrDigitalLensControlALMALENCE} structs. */
    public static class Buffer extends StructBuffer<XrDigitalLensControlALMALENCE, Buffer> implements NativeResource {

        private static final XrDigitalLensControlALMALENCE ELEMENT_FACTORY = XrDigitalLensControlALMALENCE.create(-1L);

        /**
         * Creates a new {@code XrDigitalLensControlALMALENCE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDigitalLensControlALMALENCE#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrDigitalLensControlALMALENCE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrDigitalLensControlALMALENCE.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrDigitalLensControlALMALENCE.nnext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrDigitalLensControlFlagsALMALENCE")
        public long flags() { return XrDigitalLensControlALMALENCE.nflags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrDigitalLensControlALMALENCE.Buffer type(@NativeType("XrStructureType") int value) { XrDigitalLensControlALMALENCE.ntype(address(), value); return this; }
        /** Sets the {@link ALMALENCEDigitalLensControl#XR_TYPE_DIGITAL_LENS_CONTROL_ALMALENCE TYPE_DIGITAL_LENS_CONTROL_ALMALENCE} value to the {@code type} field. */
        public XrDigitalLensControlALMALENCE.Buffer type$Default() { return type(ALMALENCEDigitalLensControl.XR_TYPE_DIGITAL_LENS_CONTROL_ALMALENCE); }
        /** Sets the specified value to the {@code next} field. */
        public XrDigitalLensControlALMALENCE.Buffer next(@NativeType("void const *") long value) { XrDigitalLensControlALMALENCE.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrDigitalLensControlALMALENCE.Buffer flags(@NativeType("XrDigitalLensControlFlagsALMALENCE") long value) { XrDigitalLensControlALMALENCE.nflags(address(), value); return this; }

    }

}