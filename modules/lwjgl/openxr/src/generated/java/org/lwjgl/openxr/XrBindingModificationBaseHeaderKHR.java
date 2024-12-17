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
 * struct XrBindingModificationBaseHeaderKHR {
 *     XrStructureType type;
 *     void const * next;
 * }}</pre>
 */
public class XrBindingModificationBaseHeaderKHR extends Struct<XrBindingModificationBaseHeaderKHR> implements NativeResource {

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

    protected XrBindingModificationBaseHeaderKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrBindingModificationBaseHeaderKHR create(long address, @Nullable ByteBuffer container) {
        return new XrBindingModificationBaseHeaderKHR(address, container);
    }

    /**
     * Creates a {@code XrBindingModificationBaseHeaderKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrBindingModificationBaseHeaderKHR(ByteBuffer container) {
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
    public XrBindingModificationBaseHeaderKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code next} field. */
    public XrBindingModificationBaseHeaderKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrBindingModificationBaseHeaderKHR set(
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
    public XrBindingModificationBaseHeaderKHR set(XrBindingModificationBaseHeaderKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrBindingModificationBaseHeaderKHR malloc() {
        return new XrBindingModificationBaseHeaderKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrBindingModificationBaseHeaderKHR calloc() {
        return new XrBindingModificationBaseHeaderKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated with {@link BufferUtils}. */
    public static XrBindingModificationBaseHeaderKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrBindingModificationBaseHeaderKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrBindingModificationBaseHeaderKHR} instance for the specified memory address. */
    public static XrBindingModificationBaseHeaderKHR create(long address) {
        return new XrBindingModificationBaseHeaderKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrBindingModificationBaseHeaderKHR createSafe(long address) {
        return address == NULL ? null : new XrBindingModificationBaseHeaderKHR(address, null);
    }

    /** Upcasts the specified {@code XrInteractionProfileDpadBindingEXT} instance to {@code XrBindingModificationBaseHeaderKHR}. */
    public static XrBindingModificationBaseHeaderKHR create(XrInteractionProfileDpadBindingEXT value) {
        return new XrBindingModificationBaseHeaderKHR(value.address(), __getContainer(value));
    }

    /** Upcasts the specified {@code XrInteractionProfileAnalogThresholdVALVE} instance to {@code XrBindingModificationBaseHeaderKHR}. */
    public static XrBindingModificationBaseHeaderKHR create(XrInteractionProfileAnalogThresholdVALVE value) {
        return new XrBindingModificationBaseHeaderKHR(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrBindingModificationBaseHeaderKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrBindingModificationBaseHeaderKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Upcasts the specified {@code XrInteractionProfileDpadBindingEXT.Buffer} instance to {@code XrBindingModificationBaseHeaderKHR.Buffer}. */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(XrInteractionProfileDpadBindingEXT.Buffer value) {
        return new XrBindingModificationBaseHeaderKHR.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /** Upcasts the specified {@code XrInteractionProfileAnalogThresholdVALVE.Buffer} instance to {@code XrBindingModificationBaseHeaderKHR.Buffer}. */
    public static XrBindingModificationBaseHeaderKHR.Buffer create(XrInteractionProfileAnalogThresholdVALVE.Buffer value) {
        return new XrBindingModificationBaseHeaderKHR.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationBaseHeaderKHR malloc(MemoryStack stack) {
        return new XrBindingModificationBaseHeaderKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrBindingModificationBaseHeaderKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrBindingModificationBaseHeaderKHR calloc(MemoryStack stack) {
        return new XrBindingModificationBaseHeaderKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrBindingModificationBaseHeaderKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrBindingModificationBaseHeaderKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrBindingModificationBaseHeaderKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrBindingModificationBaseHeaderKHR.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrBindingModificationBaseHeaderKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrBindingModificationBaseHeaderKHR.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrBindingModificationBaseHeaderKHR} structs. */
    public static class Buffer extends StructBuffer<XrBindingModificationBaseHeaderKHR, Buffer> implements NativeResource {

        private static final XrBindingModificationBaseHeaderKHR ELEMENT_FACTORY = XrBindingModificationBaseHeaderKHR.create(-1L);

        /**
         * Creates a new {@code XrBindingModificationBaseHeaderKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrBindingModificationBaseHeaderKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrBindingModificationBaseHeaderKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrBindingModificationBaseHeaderKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrBindingModificationBaseHeaderKHR.nnext(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrBindingModificationBaseHeaderKHR.Buffer type(@NativeType("XrStructureType") int value) { XrBindingModificationBaseHeaderKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code next} field. */
        public XrBindingModificationBaseHeaderKHR.Buffer next(@NativeType("void const *") long value) { XrBindingModificationBaseHeaderKHR.nnext(address(), value); return this; }

    }

}