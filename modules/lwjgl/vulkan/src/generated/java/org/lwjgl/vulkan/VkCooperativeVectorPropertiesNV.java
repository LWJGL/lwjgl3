/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkCooperativeVectorPropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkComponentTypeNV inputType;
 *     VkComponentTypeNV inputInterpretation;
 *     VkComponentTypeNV matrixInterpretation;
 *     VkComponentTypeNV biasInterpretation;
 *     VkComponentTypeNV resultType;
 *     VkBool32 transpose;
 * }}</pre>
 */
public class VkCooperativeVectorPropertiesNV extends Struct<VkCooperativeVectorPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INPUTTYPE,
        INPUTINTERPRETATION,
        MATRIXINTERPRETATION,
        BIASINTERPRETATION,
        RESULTTYPE,
        TRANSPOSE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INPUTTYPE = layout.offsetof(2);
        INPUTINTERPRETATION = layout.offsetof(3);
        MATRIXINTERPRETATION = layout.offsetof(4);
        BIASINTERPRETATION = layout.offsetof(5);
        RESULTTYPE = layout.offsetof(6);
        TRANSPOSE = layout.offsetof(7);
    }

    protected VkCooperativeVectorPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCooperativeVectorPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkCooperativeVectorPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkCooperativeVectorPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCooperativeVectorPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code inputType} field. */
    @NativeType("VkComponentTypeNV")
    public int inputType() { return ninputType(address()); }
    /** @return the value of the {@code inputInterpretation} field. */
    @NativeType("VkComponentTypeNV")
    public int inputInterpretation() { return ninputInterpretation(address()); }
    /** @return the value of the {@code matrixInterpretation} field. */
    @NativeType("VkComponentTypeNV")
    public int matrixInterpretation() { return nmatrixInterpretation(address()); }
    /** @return the value of the {@code biasInterpretation} field. */
    @NativeType("VkComponentTypeNV")
    public int biasInterpretation() { return nbiasInterpretation(address()); }
    /** @return the value of the {@code resultType} field. */
    @NativeType("VkComponentTypeNV")
    public int resultType() { return nresultType(address()); }
    /** @return the value of the {@code transpose} field. */
    @NativeType("VkBool32")
    public boolean transpose() { return ntranspose(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkCooperativeVectorPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV} value to the {@code sType} field. */
    public VkCooperativeVectorPropertiesNV sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCooperativeVectorPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code inputType} field. */
    public VkCooperativeVectorPropertiesNV inputType(@NativeType("VkComponentTypeNV") int value) { ninputType(address(), value); return this; }
    /** Sets the specified value to the {@code inputInterpretation} field. */
    public VkCooperativeVectorPropertiesNV inputInterpretation(@NativeType("VkComponentTypeNV") int value) { ninputInterpretation(address(), value); return this; }
    /** Sets the specified value to the {@code matrixInterpretation} field. */
    public VkCooperativeVectorPropertiesNV matrixInterpretation(@NativeType("VkComponentTypeNV") int value) { nmatrixInterpretation(address(), value); return this; }
    /** Sets the specified value to the {@code biasInterpretation} field. */
    public VkCooperativeVectorPropertiesNV biasInterpretation(@NativeType("VkComponentTypeNV") int value) { nbiasInterpretation(address(), value); return this; }
    /** Sets the specified value to the {@code resultType} field. */
    public VkCooperativeVectorPropertiesNV resultType(@NativeType("VkComponentTypeNV") int value) { nresultType(address(), value); return this; }
    /** Sets the specified value to the {@code transpose} field. */
    public VkCooperativeVectorPropertiesNV transpose(@NativeType("VkBool32") boolean value) { ntranspose(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkCooperativeVectorPropertiesNV set(
        int sType,
        long pNext,
        int inputType,
        int inputInterpretation,
        int matrixInterpretation,
        int biasInterpretation,
        int resultType,
        boolean transpose
    ) {
        sType(sType);
        pNext(pNext);
        inputType(inputType);
        inputInterpretation(inputInterpretation);
        matrixInterpretation(matrixInterpretation);
        biasInterpretation(biasInterpretation);
        resultType(resultType);
        transpose(transpose);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCooperativeVectorPropertiesNV set(VkCooperativeVectorPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCooperativeVectorPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCooperativeVectorPropertiesNV malloc() {
        return new VkCooperativeVectorPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeVectorPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCooperativeVectorPropertiesNV calloc() {
        return new VkCooperativeVectorPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeVectorPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkCooperativeVectorPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeVectorPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCooperativeVectorPropertiesNV} instance for the specified memory address. */
    public static VkCooperativeVectorPropertiesNV create(long address) {
        return new VkCooperativeVectorPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCooperativeVectorPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkCooperativeVectorPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkCooperativeVectorPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeVectorPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeVectorPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeVectorPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeVectorPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeVectorPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCooperativeVectorPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCooperativeVectorPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCooperativeVectorPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCooperativeVectorPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeVectorPropertiesNV malloc(MemoryStack stack) {
        return new VkCooperativeVectorPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCooperativeVectorPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeVectorPropertiesNV calloc(MemoryStack stack) {
        return new VkCooperativeVectorPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCooperativeVectorPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeVectorPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeVectorPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeVectorPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCooperativeVectorPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #inputType}. */
    public static int ninputType(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.INPUTTYPE); }
    /** Unsafe version of {@link #inputInterpretation}. */
    public static int ninputInterpretation(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.INPUTINTERPRETATION); }
    /** Unsafe version of {@link #matrixInterpretation}. */
    public static int nmatrixInterpretation(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.MATRIXINTERPRETATION); }
    /** Unsafe version of {@link #biasInterpretation}. */
    public static int nbiasInterpretation(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.BIASINTERPRETATION); }
    /** Unsafe version of {@link #resultType}. */
    public static int nresultType(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.RESULTTYPE); }
    /** Unsafe version of {@link #transpose}. */
    public static int ntranspose(long struct) { return memGetInt(struct + VkCooperativeVectorPropertiesNV.TRANSPOSE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCooperativeVectorPropertiesNV.PNEXT, value); }
    /** Unsafe version of {@link #inputType(int) inputType}. */
    public static void ninputType(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.INPUTTYPE, value); }
    /** Unsafe version of {@link #inputInterpretation(int) inputInterpretation}. */
    public static void ninputInterpretation(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.INPUTINTERPRETATION, value); }
    /** Unsafe version of {@link #matrixInterpretation(int) matrixInterpretation}. */
    public static void nmatrixInterpretation(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.MATRIXINTERPRETATION, value); }
    /** Unsafe version of {@link #biasInterpretation(int) biasInterpretation}. */
    public static void nbiasInterpretation(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.BIASINTERPRETATION, value); }
    /** Unsafe version of {@link #resultType(int) resultType}. */
    public static void nresultType(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.RESULTTYPE, value); }
    /** Unsafe version of {@link #transpose(boolean) transpose}. */
    public static void ntranspose(long struct, int value) { memPutInt(struct + VkCooperativeVectorPropertiesNV.TRANSPOSE, value); }

    // -----------------------------------

    /** An array of {@link VkCooperativeVectorPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkCooperativeVectorPropertiesNV, Buffer> implements NativeResource {

        private static final VkCooperativeVectorPropertiesNV ELEMENT_FACTORY = VkCooperativeVectorPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkCooperativeVectorPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCooperativeVectorPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCooperativeVectorPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCooperativeVectorPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCooperativeVectorPropertiesNV.npNext(address()); }
        /** @return the value of the {@code inputType} field. */
        @NativeType("VkComponentTypeNV")
        public int inputType() { return VkCooperativeVectorPropertiesNV.ninputType(address()); }
        /** @return the value of the {@code inputInterpretation} field. */
        @NativeType("VkComponentTypeNV")
        public int inputInterpretation() { return VkCooperativeVectorPropertiesNV.ninputInterpretation(address()); }
        /** @return the value of the {@code matrixInterpretation} field. */
        @NativeType("VkComponentTypeNV")
        public int matrixInterpretation() { return VkCooperativeVectorPropertiesNV.nmatrixInterpretation(address()); }
        /** @return the value of the {@code biasInterpretation} field. */
        @NativeType("VkComponentTypeNV")
        public int biasInterpretation() { return VkCooperativeVectorPropertiesNV.nbiasInterpretation(address()); }
        /** @return the value of the {@code resultType} field. */
        @NativeType("VkComponentTypeNV")
        public int resultType() { return VkCooperativeVectorPropertiesNV.nresultType(address()); }
        /** @return the value of the {@code transpose} field. */
        @NativeType("VkBool32")
        public boolean transpose() { return VkCooperativeVectorPropertiesNV.ntranspose(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkCooperativeVectorPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCooperativeVectorPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV} value to the {@code sType} field. */
        public VkCooperativeVectorPropertiesNV.Buffer sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCooperativeVectorPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkCooperativeVectorPropertiesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code inputType} field. */
        public VkCooperativeVectorPropertiesNV.Buffer inputType(@NativeType("VkComponentTypeNV") int value) { VkCooperativeVectorPropertiesNV.ninputType(address(), value); return this; }
        /** Sets the specified value to the {@code inputInterpretation} field. */
        public VkCooperativeVectorPropertiesNV.Buffer inputInterpretation(@NativeType("VkComponentTypeNV") int value) { VkCooperativeVectorPropertiesNV.ninputInterpretation(address(), value); return this; }
        /** Sets the specified value to the {@code matrixInterpretation} field. */
        public VkCooperativeVectorPropertiesNV.Buffer matrixInterpretation(@NativeType("VkComponentTypeNV") int value) { VkCooperativeVectorPropertiesNV.nmatrixInterpretation(address(), value); return this; }
        /** Sets the specified value to the {@code biasInterpretation} field. */
        public VkCooperativeVectorPropertiesNV.Buffer biasInterpretation(@NativeType("VkComponentTypeNV") int value) { VkCooperativeVectorPropertiesNV.nbiasInterpretation(address(), value); return this; }
        /** Sets the specified value to the {@code resultType} field. */
        public VkCooperativeVectorPropertiesNV.Buffer resultType(@NativeType("VkComponentTypeNV") int value) { VkCooperativeVectorPropertiesNV.nresultType(address(), value); return this; }
        /** Sets the specified value to the {@code transpose} field. */
        public VkCooperativeVectorPropertiesNV.Buffer transpose(@NativeType("VkBool32") boolean value) { VkCooperativeVectorPropertiesNV.ntranspose(address(), value ? 1 : 0); return this; }

    }

}