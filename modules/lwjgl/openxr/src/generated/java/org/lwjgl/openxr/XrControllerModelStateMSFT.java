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
 * struct XrControllerModelStateMSFT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t nodeCapacityInput;
 *     uint32_t nodeCountOutput;
 *     {@link XrControllerModelNodeStateMSFT XrControllerModelNodeStateMSFT} * nodeStates;
 * }}</pre>
 */
public class XrControllerModelStateMSFT extends Struct<XrControllerModelStateMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        NODECAPACITYINPUT,
        NODECOUNTOUTPUT,
        NODESTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        NODECAPACITYINPUT = layout.offsetof(2);
        NODECOUNTOUTPUT = layout.offsetof(3);
        NODESTATES = layout.offsetof(4);
    }

    protected XrControllerModelStateMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrControllerModelStateMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrControllerModelStateMSFT(address, container);
    }

    /**
     * Creates a {@code XrControllerModelStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelStateMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code nodeCapacityInput} field. */
    @NativeType("uint32_t")
    public int nodeCapacityInput() { return nnodeCapacityInput(address()); }
    /** @return the value of the {@code nodeCountOutput} field. */
    @NativeType("uint32_t")
    public int nodeCountOutput() { return nnodeCountOutput(address()); }
    /** @return a {@link XrControllerModelNodeStateMSFT.Buffer} view of the struct array pointed to by the {@code nodeStates} field. */
    @NativeType("XrControllerModelNodeStateMSFT *")
    public XrControllerModelNodeStateMSFT.@Nullable Buffer nodeStates() { return nnodeStates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrControllerModelStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT} value to the {@code type} field. */
    public XrControllerModelStateMSFT type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_STATE_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrControllerModelStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code nodeCapacityInput} field. */
    public XrControllerModelStateMSFT nodeCapacityInput(@NativeType("uint32_t") int value) { nnodeCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code nodeCountOutput} field. */
    public XrControllerModelStateMSFT nodeCountOutput(@NativeType("uint32_t") int value) { nnodeCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrControllerModelNodeStateMSFT.Buffer} to the {@code nodeStates} field. */
    public XrControllerModelStateMSFT nodeStates(@NativeType("XrControllerModelNodeStateMSFT *") XrControllerModelNodeStateMSFT.@Nullable Buffer value) { nnodeStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelStateMSFT set(
        int type,
        long next,
        int nodeCapacityInput,
        int nodeCountOutput,
        XrControllerModelNodeStateMSFT.@Nullable Buffer nodeStates
    ) {
        type(type);
        next(next);
        nodeCapacityInput(nodeCapacityInput);
        nodeCountOutput(nodeCountOutput);
        nodeStates(nodeStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelStateMSFT set(XrControllerModelStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelStateMSFT malloc() {
        return new XrControllerModelStateMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrControllerModelStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelStateMSFT calloc() {
        return new XrControllerModelStateMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrControllerModelStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrControllerModelStateMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelStateMSFT} instance for the specified memory address. */
    public static XrControllerModelStateMSFT create(long address) {
        return new XrControllerModelStateMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrControllerModelStateMSFT createSafe(long address) {
        return address == NULL ? null : new XrControllerModelStateMSFT(address, null);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrControllerModelStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrControllerModelStateMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrControllerModelStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelStateMSFT malloc(MemoryStack stack) {
        return new XrControllerModelStateMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrControllerModelStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelStateMSFT calloc(MemoryStack stack) {
        return new XrControllerModelStateMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrControllerModelStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelStateMSFT.NEXT); }
    /** Unsafe version of {@link #nodeCapacityInput}. */
    public static int nnodeCapacityInput(long struct) { return memGetInt(struct + XrControllerModelStateMSFT.NODECAPACITYINPUT); }
    /** Unsafe version of {@link #nodeCountOutput}. */
    public static int nnodeCountOutput(long struct) { return memGetInt(struct + XrControllerModelStateMSFT.NODECOUNTOUTPUT); }
    /** Unsafe version of {@link #nodeStates}. */
    public static XrControllerModelNodeStateMSFT.@Nullable Buffer nnodeStates(long struct) { return XrControllerModelNodeStateMSFT.createSafe(memGetAddress(struct + XrControllerModelStateMSFT.NODESTATES), nnodeCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrControllerModelStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelStateMSFT.NEXT, value); }
    /** Sets the specified value to the {@code nodeCapacityInput} field of the specified {@code struct}. */
    public static void nnodeCapacityInput(long struct, int value) { memPutInt(struct + XrControllerModelStateMSFT.NODECAPACITYINPUT, value); }
    /** Unsafe version of {@link #nodeCountOutput(int) nodeCountOutput}. */
    public static void nnodeCountOutput(long struct, int value) { memPutInt(struct + XrControllerModelStateMSFT.NODECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #nodeStates(XrControllerModelNodeStateMSFT.Buffer) nodeStates}. */
    public static void nnodeStates(long struct, XrControllerModelNodeStateMSFT.@Nullable Buffer value) { memPutAddress(struct + XrControllerModelStateMSFT.NODESTATES, memAddressSafe(value)); if (value != null) { nnodeCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrControllerModelStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelStateMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelStateMSFT ELEMENT_FACTORY = XrControllerModelStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelStateMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelStateMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrControllerModelStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelStateMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelStateMSFT.nnext(address()); }
        /** @return the value of the {@code nodeCapacityInput} field. */
        @NativeType("uint32_t")
        public int nodeCapacityInput() { return XrControllerModelStateMSFT.nnodeCapacityInput(address()); }
        /** @return the value of the {@code nodeCountOutput} field. */
        @NativeType("uint32_t")
        public int nodeCountOutput() { return XrControllerModelStateMSFT.nnodeCountOutput(address()); }
        /** @return a {@link XrControllerModelNodeStateMSFT.Buffer} view of the struct array pointed to by the {@code nodeStates} field. */
        @NativeType("XrControllerModelNodeStateMSFT *")
        public XrControllerModelNodeStateMSFT.@Nullable Buffer nodeStates() { return XrControllerModelStateMSFT.nnodeStates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrControllerModelStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_STATE_MSFT TYPE_CONTROLLER_MODEL_STATE_MSFT} value to the {@code type} field. */
        public XrControllerModelStateMSFT.Buffer type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_STATE_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrControllerModelStateMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelStateMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code nodeCapacityInput} field. */
        public XrControllerModelStateMSFT.Buffer nodeCapacityInput(@NativeType("uint32_t") int value) { XrControllerModelStateMSFT.nnodeCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code nodeCountOutput} field. */
        public XrControllerModelStateMSFT.Buffer nodeCountOutput(@NativeType("uint32_t") int value) { XrControllerModelStateMSFT.nnodeCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrControllerModelNodeStateMSFT.Buffer} to the {@code nodeStates} field. */
        public XrControllerModelStateMSFT.Buffer nodeStates(@NativeType("XrControllerModelNodeStateMSFT *") XrControllerModelNodeStateMSFT.@Nullable Buffer value) { XrControllerModelStateMSFT.nnodeStates(address(), value); return this; }

    }

}