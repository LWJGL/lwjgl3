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
 * struct XrControllerModelNodeStateMSFT {
 *     XrStructureType type;
 *     void * next;
 *     {@link XrPosef XrPosef} nodePose;
 * }}</pre>
 */
public class XrControllerModelNodeStateMSFT extends Struct<XrControllerModelNodeStateMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODEPOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODEPOSE = layout.offsetof(2);
    }

    protected XrControllerModelNodeStateMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrControllerModelNodeStateMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrControllerModelNodeStateMSFT(address, container);
    }

    /**
     * Creates a {@code XrControllerModelNodeStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelNodeStateMSFT(ByteBuffer container) {
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
    /** @return a {@link XrPosef} view of the {@code nodePose} field. */
    public XrPosef nodePose() { return nnodePose(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrControllerModelNodeStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT} value to the {@code type} field. */
    public XrControllerModelNodeStateMSFT type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrControllerModelNodeStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code nodePose} field. */
    public XrControllerModelNodeStateMSFT nodePose(XrPosef value) { nnodePose(address(), value); return this; }
    /** Passes the {@code nodePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrControllerModelNodeStateMSFT nodePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(nodePose()); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelNodeStateMSFT set(
        int type,
        long next,
        XrPosef nodePose
    ) {
        type(type);
        next(next);
        nodePose(nodePose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelNodeStateMSFT set(XrControllerModelNodeStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelNodeStateMSFT malloc() {
        return new XrControllerModelNodeStateMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelNodeStateMSFT calloc() {
        return new XrControllerModelNodeStateMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelNodeStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrControllerModelNodeStateMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelNodeStateMSFT} instance for the specified memory address. */
    public static XrControllerModelNodeStateMSFT create(long address) {
        return new XrControllerModelNodeStateMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrControllerModelNodeStateMSFT createSafe(long address) {
        return address == NULL ? null : new XrControllerModelNodeStateMSFT(address, null);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrControllerModelNodeStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrControllerModelNodeStateMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodeStateMSFT malloc(MemoryStack stack) {
        return new XrControllerModelNodeStateMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrControllerModelNodeStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelNodeStateMSFT calloc(MemoryStack stack) {
        return new XrControllerModelNodeStateMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelNodeStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelNodeStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrControllerModelNodeStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelNodeStateMSFT.NEXT); }
    /** Unsafe version of {@link #nodePose}. */
    public static XrPosef nnodePose(long struct) { return XrPosef.create(struct + XrControllerModelNodeStateMSFT.NODEPOSE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrControllerModelNodeStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelNodeStateMSFT.NEXT, value); }
    /** Unsafe version of {@link #nodePose(XrPosef) nodePose}. */
    public static void nnodePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrControllerModelNodeStateMSFT.NODEPOSE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrControllerModelNodeStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelNodeStateMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelNodeStateMSFT ELEMENT_FACTORY = XrControllerModelNodeStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelNodeStateMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelNodeStateMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrControllerModelNodeStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelNodeStateMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelNodeStateMSFT.nnext(address()); }
        /** @return a {@link XrPosef} view of the {@code nodePose} field. */
        public XrPosef nodePose() { return XrControllerModelNodeStateMSFT.nnodePose(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrControllerModelNodeStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelNodeStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT} value to the {@code type} field. */
        public XrControllerModelNodeStateMSFT.Buffer type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_NODE_STATE_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrControllerModelNodeStateMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelNodeStateMSFT.nnext(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code nodePose} field. */
        public XrControllerModelNodeStateMSFT.Buffer nodePose(XrPosef value) { XrControllerModelNodeStateMSFT.nnodePose(address(), value); return this; }
        /** Passes the {@code nodePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrControllerModelNodeStateMSFT.Buffer nodePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(nodePose()); return this; }

    }

}