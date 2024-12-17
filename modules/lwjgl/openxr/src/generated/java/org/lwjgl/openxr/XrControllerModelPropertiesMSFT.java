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
 * struct XrControllerModelPropertiesMSFT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t nodeCapacityInput;
 *     uint32_t nodeCountOutput;
 *     {@link XrControllerModelNodePropertiesMSFT XrControllerModelNodePropertiesMSFT} * nodeProperties;
 * }}</pre>
 */
public class XrControllerModelPropertiesMSFT extends Struct<XrControllerModelPropertiesMSFT> implements NativeResource {

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
        NODEPROPERTIES;

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
        NODEPROPERTIES = layout.offsetof(4);
    }

    protected XrControllerModelPropertiesMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrControllerModelPropertiesMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrControllerModelPropertiesMSFT(address, container);
    }

    /**
     * Creates a {@code XrControllerModelPropertiesMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrControllerModelPropertiesMSFT(ByteBuffer container) {
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
    /** @return a {@link XrControllerModelNodePropertiesMSFT.Buffer} view of the struct array pointed to by the {@code nodeProperties} field. */
    @NativeType("XrControllerModelNodePropertiesMSFT *")
    public XrControllerModelNodePropertiesMSFT.@Nullable Buffer nodeProperties() { return nnodeProperties(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrControllerModelPropertiesMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT} value to the {@code type} field. */
    public XrControllerModelPropertiesMSFT type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrControllerModelPropertiesMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code nodeCapacityInput} field. */
    public XrControllerModelPropertiesMSFT nodeCapacityInput(@NativeType("uint32_t") int value) { nnodeCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code nodeCountOutput} field. */
    public XrControllerModelPropertiesMSFT nodeCountOutput(@NativeType("uint32_t") int value) { nnodeCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrControllerModelNodePropertiesMSFT.Buffer} to the {@code nodeProperties} field. */
    public XrControllerModelPropertiesMSFT nodeProperties(@NativeType("XrControllerModelNodePropertiesMSFT *") XrControllerModelNodePropertiesMSFT.@Nullable Buffer value) { nnodeProperties(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrControllerModelPropertiesMSFT set(
        int type,
        long next,
        int nodeCapacityInput,
        int nodeCountOutput,
        XrControllerModelNodePropertiesMSFT.@Nullable Buffer nodeProperties
    ) {
        type(type);
        next(next);
        nodeCapacityInput(nodeCapacityInput);
        nodeCountOutput(nodeCountOutput);
        nodeProperties(nodeProperties);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrControllerModelPropertiesMSFT set(XrControllerModelPropertiesMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrControllerModelPropertiesMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrControllerModelPropertiesMSFT malloc() {
        return new XrControllerModelPropertiesMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrControllerModelPropertiesMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrControllerModelPropertiesMSFT calloc() {
        return new XrControllerModelPropertiesMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrControllerModelPropertiesMSFT} instance allocated with {@link BufferUtils}. */
    public static XrControllerModelPropertiesMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrControllerModelPropertiesMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrControllerModelPropertiesMSFT} instance for the specified memory address. */
    public static XrControllerModelPropertiesMSFT create(long address) {
        return new XrControllerModelPropertiesMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrControllerModelPropertiesMSFT createSafe(long address) {
        return address == NULL ? null : new XrControllerModelPropertiesMSFT(address, null);
    }

    /**
     * Returns a new {@link XrControllerModelPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelPropertiesMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelPropertiesMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelPropertiesMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelPropertiesMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrControllerModelPropertiesMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrControllerModelPropertiesMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrControllerModelPropertiesMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrControllerModelPropertiesMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrControllerModelPropertiesMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelPropertiesMSFT malloc(MemoryStack stack) {
        return new XrControllerModelPropertiesMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrControllerModelPropertiesMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrControllerModelPropertiesMSFT calloc(MemoryStack stack) {
        return new XrControllerModelPropertiesMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrControllerModelPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelPropertiesMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrControllerModelPropertiesMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrControllerModelPropertiesMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrControllerModelPropertiesMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrControllerModelPropertiesMSFT.NEXT); }
    /** Unsafe version of {@link #nodeCapacityInput}. */
    public static int nnodeCapacityInput(long struct) { return memGetInt(struct + XrControllerModelPropertiesMSFT.NODECAPACITYINPUT); }
    /** Unsafe version of {@link #nodeCountOutput}. */
    public static int nnodeCountOutput(long struct) { return memGetInt(struct + XrControllerModelPropertiesMSFT.NODECOUNTOUTPUT); }
    /** Unsafe version of {@link #nodeProperties}. */
    public static XrControllerModelNodePropertiesMSFT.@Nullable Buffer nnodeProperties(long struct) { return XrControllerModelNodePropertiesMSFT.createSafe(memGetAddress(struct + XrControllerModelPropertiesMSFT.NODEPROPERTIES), nnodeCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrControllerModelPropertiesMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrControllerModelPropertiesMSFT.NEXT, value); }
    /** Sets the specified value to the {@code nodeCapacityInput} field of the specified {@code struct}. */
    public static void nnodeCapacityInput(long struct, int value) { memPutInt(struct + XrControllerModelPropertiesMSFT.NODECAPACITYINPUT, value); }
    /** Unsafe version of {@link #nodeCountOutput(int) nodeCountOutput}. */
    public static void nnodeCountOutput(long struct, int value) { memPutInt(struct + XrControllerModelPropertiesMSFT.NODECOUNTOUTPUT, value); }
    /** Unsafe version of {@link #nodeProperties(XrControllerModelNodePropertiesMSFT.Buffer) nodeProperties}. */
    public static void nnodeProperties(long struct, XrControllerModelNodePropertiesMSFT.@Nullable Buffer value) { memPutAddress(struct + XrControllerModelPropertiesMSFT.NODEPROPERTIES, memAddressSafe(value)); if (value != null) { nnodeCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrControllerModelPropertiesMSFT} structs. */
    public static class Buffer extends StructBuffer<XrControllerModelPropertiesMSFT, Buffer> implements NativeResource {

        private static final XrControllerModelPropertiesMSFT ELEMENT_FACTORY = XrControllerModelPropertiesMSFT.create(-1L);

        /**
         * Creates a new {@code XrControllerModelPropertiesMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrControllerModelPropertiesMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrControllerModelPropertiesMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrControllerModelPropertiesMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrControllerModelPropertiesMSFT.nnext(address()); }
        /** @return the value of the {@code nodeCapacityInput} field. */
        @NativeType("uint32_t")
        public int nodeCapacityInput() { return XrControllerModelPropertiesMSFT.nnodeCapacityInput(address()); }
        /** @return the value of the {@code nodeCountOutput} field. */
        @NativeType("uint32_t")
        public int nodeCountOutput() { return XrControllerModelPropertiesMSFT.nnodeCountOutput(address()); }
        /** @return a {@link XrControllerModelNodePropertiesMSFT.Buffer} view of the struct array pointed to by the {@code nodeProperties} field. */
        @NativeType("XrControllerModelNodePropertiesMSFT *")
        public XrControllerModelNodePropertiesMSFT.@Nullable Buffer nodeProperties() { return XrControllerModelPropertiesMSFT.nnodeProperties(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrControllerModelPropertiesMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrControllerModelPropertiesMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTControllerModel#XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT} value to the {@code type} field. */
        public XrControllerModelPropertiesMSFT.Buffer type$Default() { return type(MSFTControllerModel.XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrControllerModelPropertiesMSFT.Buffer next(@NativeType("void *") long value) { XrControllerModelPropertiesMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code nodeCapacityInput} field. */
        public XrControllerModelPropertiesMSFT.Buffer nodeCapacityInput(@NativeType("uint32_t") int value) { XrControllerModelPropertiesMSFT.nnodeCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code nodeCountOutput} field. */
        public XrControllerModelPropertiesMSFT.Buffer nodeCountOutput(@NativeType("uint32_t") int value) { XrControllerModelPropertiesMSFT.nnodeCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrControllerModelNodePropertiesMSFT.Buffer} to the {@code nodeProperties} field. */
        public XrControllerModelPropertiesMSFT.Buffer nodeProperties(@NativeType("XrControllerModelNodePropertiesMSFT *") XrControllerModelNodePropertiesMSFT.@Nullable Buffer value) { XrControllerModelPropertiesMSFT.nnodeProperties(address(), value); return this; }

    }

}