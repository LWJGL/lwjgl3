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
 * struct VkCooperativeMatrixPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t MSize;
 *     uint32_t NSize;
 *     uint32_t KSize;
 *     VkComponentTypeKHR AType;
 *     VkComponentTypeKHR BType;
 *     VkComponentTypeKHR CType;
 *     VkComponentTypeKHR ResultType;
 *     VkBool32 saturatingAccumulation;
 *     VkScopeKHR scope;
 * }}</pre>
 */
public class VkCooperativeMatrixPropertiesKHR extends Struct<VkCooperativeMatrixPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MSIZE,
        NSIZE,
        KSIZE,
        ATYPE,
        BTYPE,
        CTYPE,
        RESULTTYPE,
        SATURATINGACCUMULATION,
        SCOPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
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
        MSIZE = layout.offsetof(2);
        NSIZE = layout.offsetof(3);
        KSIZE = layout.offsetof(4);
        ATYPE = layout.offsetof(5);
        BTYPE = layout.offsetof(6);
        CTYPE = layout.offsetof(7);
        RESULTTYPE = layout.offsetof(8);
        SATURATINGACCUMULATION = layout.offsetof(9);
        SCOPE = layout.offsetof(10);
    }

    protected VkCooperativeMatrixPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCooperativeMatrixPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkCooperativeMatrixPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkCooperativeMatrixPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCooperativeMatrixPropertiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code MSize} field. */
    @NativeType("uint32_t")
    public int MSize() { return nMSize(address()); }
    /** @return the value of the {@code NSize} field. */
    @NativeType("uint32_t")
    public int NSize() { return nNSize(address()); }
    /** @return the value of the {@code KSize} field. */
    @NativeType("uint32_t")
    public int KSize() { return nKSize(address()); }
    /** @return the value of the {@code AType} field. */
    @NativeType("VkComponentTypeKHR")
    public int AType() { return nAType(address()); }
    /** @return the value of the {@code BType} field. */
    @NativeType("VkComponentTypeKHR")
    public int BType() { return nBType(address()); }
    /** @return the value of the {@code CType} field. */
    @NativeType("VkComponentTypeKHR")
    public int CType() { return nCType(address()); }
    /** @return the value of the {@code ResultType} field. */
    @NativeType("VkComponentTypeKHR")
    public int ResultType() { return nResultType(address()); }
    /** @return the value of the {@code saturatingAccumulation} field. */
    @NativeType("VkBool32")
    public boolean saturatingAccumulation() { return nsaturatingAccumulation(address()) != 0; }
    /** @return the value of the {@code scope} field. */
    @NativeType("VkScopeKHR")
    public int scope() { return nscope(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCooperativeMatrixPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkCooperativeMatrixPropertiesKHR sType$Default() { return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCooperativeMatrixPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCooperativeMatrixPropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCooperativeMatrixPropertiesKHR set(VkCooperativeMatrixPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCooperativeMatrixPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCooperativeMatrixPropertiesKHR malloc() {
        return new VkCooperativeMatrixPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeMatrixPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCooperativeMatrixPropertiesKHR calloc() {
        return new VkCooperativeMatrixPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeMatrixPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkCooperativeMatrixPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeMatrixPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCooperativeMatrixPropertiesKHR} instance for the specified memory address. */
    public static VkCooperativeMatrixPropertiesKHR create(long address) {
        return new VkCooperativeMatrixPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCooperativeMatrixPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkCooperativeMatrixPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCooperativeMatrixPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCooperativeMatrixPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCooperativeMatrixPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeMatrixPropertiesKHR malloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCooperativeMatrixPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeMatrixPropertiesKHR calloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCooperativeMatrixPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #MSize}. */
    public static int nMSize(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.MSIZE); }
    /** Unsafe version of {@link #NSize}. */
    public static int nNSize(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.NSIZE); }
    /** Unsafe version of {@link #KSize}. */
    public static int nKSize(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.KSIZE); }
    /** Unsafe version of {@link #AType}. */
    public static int nAType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.ATYPE); }
    /** Unsafe version of {@link #BType}. */
    public static int nBType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.BTYPE); }
    /** Unsafe version of {@link #CType}. */
    public static int nCType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.CTYPE); }
    /** Unsafe version of {@link #ResultType}. */
    public static int nResultType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.RESULTTYPE); }
    /** Unsafe version of {@link #saturatingAccumulation}. */
    public static int nsaturatingAccumulation(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.SATURATINGACCUMULATION); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesKHR.SCOPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCooperativeMatrixPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCooperativeMatrixPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkCooperativeMatrixPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkCooperativeMatrixPropertiesKHR, Buffer> implements NativeResource {

        private static final VkCooperativeMatrixPropertiesKHR ELEMENT_FACTORY = VkCooperativeMatrixPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkCooperativeMatrixPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCooperativeMatrixPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCooperativeMatrixPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCooperativeMatrixPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCooperativeMatrixPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code MSize} field. */
        @NativeType("uint32_t")
        public int MSize() { return VkCooperativeMatrixPropertiesKHR.nMSize(address()); }
        /** @return the value of the {@code NSize} field. */
        @NativeType("uint32_t")
        public int NSize() { return VkCooperativeMatrixPropertiesKHR.nNSize(address()); }
        /** @return the value of the {@code KSize} field. */
        @NativeType("uint32_t")
        public int KSize() { return VkCooperativeMatrixPropertiesKHR.nKSize(address()); }
        /** @return the value of the {@code AType} field. */
        @NativeType("VkComponentTypeKHR")
        public int AType() { return VkCooperativeMatrixPropertiesKHR.nAType(address()); }
        /** @return the value of the {@code BType} field. */
        @NativeType("VkComponentTypeKHR")
        public int BType() { return VkCooperativeMatrixPropertiesKHR.nBType(address()); }
        /** @return the value of the {@code CType} field. */
        @NativeType("VkComponentTypeKHR")
        public int CType() { return VkCooperativeMatrixPropertiesKHR.nCType(address()); }
        /** @return the value of the {@code ResultType} field. */
        @NativeType("VkComponentTypeKHR")
        public int ResultType() { return VkCooperativeMatrixPropertiesKHR.nResultType(address()); }
        /** @return the value of the {@code saturatingAccumulation} field. */
        @NativeType("VkBool32")
        public boolean saturatingAccumulation() { return VkCooperativeMatrixPropertiesKHR.nsaturatingAccumulation(address()) != 0; }
        /** @return the value of the {@code scope} field. */
        @NativeType("VkScopeKHR")
        public int scope() { return VkCooperativeMatrixPropertiesKHR.nscope(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCooperativeMatrixPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer sType$Default() { return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkCooperativeMatrixPropertiesKHR.npNext(address(), value); return this; }

    }

}