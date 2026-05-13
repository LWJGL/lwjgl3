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
 * <pre><code>
 * struct XrEyeANDROID {
 *     XrEyeStateANDROID eyeState;
 *     {@link XrPosef XrPosef} eyePose;
 * }</code></pre>
 */
public class XrEyeANDROID extends Struct<XrEyeANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EYESTATE,
        EYEPOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EYESTATE = layout.offsetof(0);
        EYEPOSE = layout.offsetof(1);
    }

    protected XrEyeANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyeANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrEyeANDROID(address, container);
    }

    /**
     * Creates a {@code XrEyeANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code eyeState} field. */
    @NativeType("XrEyeStateANDROID")
    public int eyeState() { return neyeState(address()); }
    /** @return a {@link XrPosef} view of the {@code eyePose} field. */
    public XrPosef eyePose() { return neyePose(address()); }

    /** Sets the specified value to the {@code eyeState} field. */
    public XrEyeANDROID eyeState(@NativeType("XrEyeStateANDROID") int value) { neyeState(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code eyePose} field. */
    public XrEyeANDROID eyePose(XrPosef value) { neyePose(address(), value); return this; }
    /** Passes the {@code eyePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyeANDROID eyePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(eyePose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeANDROID set(
        int eyeState,
        XrPosef eyePose
    ) {
        eyeState(eyeState);
        eyePose(eyePose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyeANDROID set(XrEyeANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeANDROID malloc() {
        return new XrEyeANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyeANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeANDROID calloc() {
        return new XrEyeANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyeANDROID} instance allocated with {@link BufferUtils}. */
    public static XrEyeANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyeANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrEyeANDROID} instance for the specified memory address. */
    public static XrEyeANDROID create(long address) {
        return new XrEyeANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEyeANDROID createSafe(long address) {
        return address == NULL ? null : new XrEyeANDROID(address, null);
    }

    /**
     * Returns a new {@link XrEyeANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyeANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEyeANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyeANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeANDROID malloc(MemoryStack stack) {
        return new XrEyeANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyeANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeANDROID calloc(MemoryStack stack) {
        return new XrEyeANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyeANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #eyeState}. */
    public static int neyeState(long struct) { return memGetInt(struct + XrEyeANDROID.EYESTATE); }
    /** Unsafe version of {@link #eyePose}. */
    public static XrPosef neyePose(long struct) { return XrPosef.create(struct + XrEyeANDROID.EYEPOSE); }

    /** Unsafe version of {@link #eyeState(int) eyeState}. */
    public static void neyeState(long struct, int value) { memPutInt(struct + XrEyeANDROID.EYESTATE, value); }
    /** Unsafe version of {@link #eyePose(XrPosef) eyePose}. */
    public static void neyePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrEyeANDROID.EYEPOSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrEyeANDROID} structs. */
    public static class Buffer extends StructBuffer<XrEyeANDROID, Buffer> implements NativeResource {

        private static final XrEyeANDROID ELEMENT_FACTORY = XrEyeANDROID.create(-1L);

        /**
         * Creates a new {@code XrEyeANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyeANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code eyeState} field. */
        @NativeType("XrEyeStateANDROID")
        public int eyeState() { return XrEyeANDROID.neyeState(address()); }
        /** @return a {@link XrPosef} view of the {@code eyePose} field. */
        public XrPosef eyePose() { return XrEyeANDROID.neyePose(address()); }

        /** Sets the specified value to the {@code eyeState} field. */
        public XrEyeANDROID.Buffer eyeState(@NativeType("XrEyeStateANDROID") int value) { XrEyeANDROID.neyeState(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code eyePose} field. */
        public XrEyeANDROID.Buffer eyePose(XrPosef value) { XrEyeANDROID.neyePose(address(), value); return this; }
        /** Passes the {@code eyePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyeANDROID.Buffer eyePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(eyePose()); return this; }

    }

}