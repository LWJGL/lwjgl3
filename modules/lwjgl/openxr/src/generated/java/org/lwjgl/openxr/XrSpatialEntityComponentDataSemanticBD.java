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
 * struct XrSpatialEntityComponentDataSemanticBD {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t labelCapacityInput;
 *     uint32_t labelCountOutput;
 *     XrSemanticLabelBD * labels;
 * }}</pre>
 */
public class XrSpatialEntityComponentDataSemanticBD extends Struct<XrSpatialEntityComponentDataSemanticBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LABELCAPACITYINPUT,
        LABELCOUNTOUTPUT,
        LABELS;

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
        LABELCAPACITYINPUT = layout.offsetof(2);
        LABELCOUNTOUTPUT = layout.offsetof(3);
        LABELS = layout.offsetof(4);
    }

    protected XrSpatialEntityComponentDataSemanticBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSpatialEntityComponentDataSemanticBD create(long address, @Nullable ByteBuffer container) {
        return new XrSpatialEntityComponentDataSemanticBD(address, container);
    }

    /**
     * Creates a {@code XrSpatialEntityComponentDataSemanticBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSpatialEntityComponentDataSemanticBD(ByteBuffer container) {
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
    /** @return the value of the {@code labelCapacityInput} field. */
    @NativeType("uint32_t")
    public int labelCapacityInput() { return nlabelCapacityInput(address()); }
    /** @return the value of the {@code labelCountOutput} field. */
    @NativeType("uint32_t")
    public int labelCountOutput() { return nlabelCountOutput(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code labels} field. */
    @NativeType("XrSemanticLabelBD *")
    public @Nullable IntBuffer labels() { return nlabels(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSpatialEntityComponentDataSemanticBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD} value to the {@code type} field. */
    public XrSpatialEntityComponentDataSemanticBD type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSpatialEntityComponentDataSemanticBD next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code labelCapacityInput} field. */
    public XrSpatialEntityComponentDataSemanticBD labelCapacityInput(@NativeType("uint32_t") int value) { nlabelCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code labelCountOutput} field. */
    public XrSpatialEntityComponentDataSemanticBD labelCountOutput(@NativeType("uint32_t") int value) { nlabelCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code labels} field. */
    public XrSpatialEntityComponentDataSemanticBD labels(@Nullable @NativeType("XrSemanticLabelBD *") IntBuffer value) { nlabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSpatialEntityComponentDataSemanticBD set(
        int type,
        long next,
        int labelCapacityInput,
        int labelCountOutput,
        @Nullable IntBuffer labels
    ) {
        type(type);
        next(next);
        labelCapacityInput(labelCapacityInput);
        labelCountOutput(labelCountOutput);
        labels(labels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSpatialEntityComponentDataSemanticBD set(XrSpatialEntityComponentDataSemanticBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSpatialEntityComponentDataSemanticBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataSemanticBD malloc() {
        return new XrSpatialEntityComponentDataSemanticBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataSemanticBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSpatialEntityComponentDataSemanticBD calloc() {
        return new XrSpatialEntityComponentDataSemanticBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataSemanticBD} instance allocated with {@link BufferUtils}. */
    public static XrSpatialEntityComponentDataSemanticBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSpatialEntityComponentDataSemanticBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSpatialEntityComponentDataSemanticBD} instance for the specified memory address. */
    public static XrSpatialEntityComponentDataSemanticBD create(long address) {
        return new XrSpatialEntityComponentDataSemanticBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSpatialEntityComponentDataSemanticBD createSafe(long address) {
        return address == NULL ? null : new XrSpatialEntityComponentDataSemanticBD(address, null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSemanticBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSemanticBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSemanticBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSemanticBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSemanticBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSemanticBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSpatialEntityComponentDataSemanticBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSemanticBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSpatialEntityComponentDataSemanticBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataSemanticBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataSemanticBD malloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataSemanticBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSpatialEntityComponentDataSemanticBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSpatialEntityComponentDataSemanticBD calloc(MemoryStack stack) {
        return new XrSpatialEntityComponentDataSemanticBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSemanticBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSemanticBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSpatialEntityComponentDataSemanticBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSpatialEntityComponentDataSemanticBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataSemanticBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSpatialEntityComponentDataSemanticBD.NEXT); }
    /** Unsafe version of {@link #labelCapacityInput}. */
    public static int nlabelCapacityInput(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataSemanticBD.LABELCAPACITYINPUT); }
    /** Unsafe version of {@link #labelCountOutput}. */
    public static int nlabelCountOutput(long struct) { return memGetInt(struct + XrSpatialEntityComponentDataSemanticBD.LABELCOUNTOUTPUT); }
    /** Unsafe version of {@link #labels() labels}. */
    public static @Nullable IntBuffer nlabels(long struct) { return memIntBufferSafe(memGetAddress(struct + XrSpatialEntityComponentDataSemanticBD.LABELS), nlabelCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataSemanticBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSpatialEntityComponentDataSemanticBD.NEXT, value); }
    /** Sets the specified value to the {@code labelCapacityInput} field of the specified {@code struct}. */
    public static void nlabelCapacityInput(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataSemanticBD.LABELCAPACITYINPUT, value); }
    /** Unsafe version of {@link #labelCountOutput(int) labelCountOutput}. */
    public static void nlabelCountOutput(long struct, int value) { memPutInt(struct + XrSpatialEntityComponentDataSemanticBD.LABELCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #labels(IntBuffer) labels}. */
    public static void nlabels(long struct, @Nullable IntBuffer value) { memPutAddress(struct + XrSpatialEntityComponentDataSemanticBD.LABELS, memAddressSafe(value)); if (value != null) { nlabelCapacityInput(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link XrSpatialEntityComponentDataSemanticBD} structs. */
    public static class Buffer extends StructBuffer<XrSpatialEntityComponentDataSemanticBD, Buffer> implements NativeResource {

        private static final XrSpatialEntityComponentDataSemanticBD ELEMENT_FACTORY = XrSpatialEntityComponentDataSemanticBD.create(-1L);

        /**
         * Creates a new {@code XrSpatialEntityComponentDataSemanticBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSpatialEntityComponentDataSemanticBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSpatialEntityComponentDataSemanticBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSpatialEntityComponentDataSemanticBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSpatialEntityComponentDataSemanticBD.nnext(address()); }
        /** @return the value of the {@code labelCapacityInput} field. */
        @NativeType("uint32_t")
        public int labelCapacityInput() { return XrSpatialEntityComponentDataSemanticBD.nlabelCapacityInput(address()); }
        /** @return the value of the {@code labelCountOutput} field. */
        @NativeType("uint32_t")
        public int labelCountOutput() { return XrSpatialEntityComponentDataSemanticBD.nlabelCountOutput(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code labels} field. */
        @NativeType("XrSemanticLabelBD *")
        public @Nullable IntBuffer labels() { return XrSpatialEntityComponentDataSemanticBD.nlabels(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSpatialEntityComponentDataSemanticBD.Buffer type(@NativeType("XrStructureType") int value) { XrSpatialEntityComponentDataSemanticBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialSensing#XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD} value to the {@code type} field. */
        public XrSpatialEntityComponentDataSemanticBD.Buffer type$Default() { return type(BDSpatialSensing.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSpatialEntityComponentDataSemanticBD.Buffer next(@NativeType("void *") long value) { XrSpatialEntityComponentDataSemanticBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code labelCapacityInput} field. */
        public XrSpatialEntityComponentDataSemanticBD.Buffer labelCapacityInput(@NativeType("uint32_t") int value) { XrSpatialEntityComponentDataSemanticBD.nlabelCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code labelCountOutput} field. */
        public XrSpatialEntityComponentDataSemanticBD.Buffer labelCountOutput(@NativeType("uint32_t") int value) { XrSpatialEntityComponentDataSemanticBD.nlabelCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code labels} field. */
        public XrSpatialEntityComponentDataSemanticBD.Buffer labels(@Nullable @NativeType("XrSemanticLabelBD *") IntBuffer value) { XrSpatialEntityComponentDataSemanticBD.nlabels(address(), value); return this; }

    }

}