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
 * struct XrSystemHapticParametricPropertiesEXT {
 *     XrStructureType type;
 *     void * next;
 *     XrBool32 supportsParametricHaptics;
 * }}</pre>
 */
public class XrSystemHapticParametricPropertiesEXT extends Struct<XrSystemHapticParametricPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSPARAMETRICHAPTICS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSPARAMETRICHAPTICS = layout.offsetof(2);
    }

    protected XrSystemHapticParametricPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemHapticParametricPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemHapticParametricPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrSystemHapticParametricPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemHapticParametricPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code supportsParametricHaptics} field. */
    @NativeType("XrBool32")
    public boolean supportsParametricHaptics() { return nsupportsParametricHaptics(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSystemHapticParametricPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTHapticParametric#XR_TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT} value to the {@code type} field. */
    public XrSystemHapticParametricPropertiesEXT type$Default() { return type(EXTHapticParametric.XR_TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSystemHapticParametricPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemHapticParametricPropertiesEXT set(
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
    public XrSystemHapticParametricPropertiesEXT set(XrSystemHapticParametricPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemHapticParametricPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemHapticParametricPropertiesEXT malloc() {
        return new XrSystemHapticParametricPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHapticParametricPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemHapticParametricPropertiesEXT calloc() {
        return new XrSystemHapticParametricPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemHapticParametricPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrSystemHapticParametricPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemHapticParametricPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemHapticParametricPropertiesEXT} instance for the specified memory address. */
    public static XrSystemHapticParametricPropertiesEXT create(long address) {
        return new XrSystemHapticParametricPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSystemHapticParametricPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrSystemHapticParametricPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrSystemHapticParametricPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHapticParametricPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemHapticParametricPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHapticParametricPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHapticParametricPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemHapticParametricPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemHapticParametricPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemHapticParametricPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSystemHapticParametricPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemHapticParametricPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHapticParametricPropertiesEXT malloc(MemoryStack stack) {
        return new XrSystemHapticParametricPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemHapticParametricPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemHapticParametricPropertiesEXT calloc(MemoryStack stack) {
        return new XrSystemHapticParametricPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemHapticParametricPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHapticParametricPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemHapticParametricPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemHapticParametricPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSystemHapticParametricPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemHapticParametricPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #supportsParametricHaptics}. */
    public static int nsupportsParametricHaptics(long struct) { return memGetInt(struct + XrSystemHapticParametricPropertiesEXT.SUPPORTSPARAMETRICHAPTICS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSystemHapticParametricPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemHapticParametricPropertiesEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemHapticParametricPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrSystemHapticParametricPropertiesEXT, Buffer> implements NativeResource {

        private static final XrSystemHapticParametricPropertiesEXT ELEMENT_FACTORY = XrSystemHapticParametricPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrSystemHapticParametricPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemHapticParametricPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemHapticParametricPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemHapticParametricPropertiesEXT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSystemHapticParametricPropertiesEXT.nnext(address()); }
        /** @return the value of the {@code supportsParametricHaptics} field. */
        @NativeType("XrBool32")
        public boolean supportsParametricHaptics() { return XrSystemHapticParametricPropertiesEXT.nsupportsParametricHaptics(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSystemHapticParametricPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemHapticParametricPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTHapticParametric#XR_TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT} value to the {@code type} field. */
        public XrSystemHapticParametricPropertiesEXT.Buffer type$Default() { return type(EXTHapticParametric.XR_TYPE_SYSTEM_HAPTIC_PARAMETRIC_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSystemHapticParametricPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrSystemHapticParametricPropertiesEXT.nnext(address(), value); return this; }

    }

}