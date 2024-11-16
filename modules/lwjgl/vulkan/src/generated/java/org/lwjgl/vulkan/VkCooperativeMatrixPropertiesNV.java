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
 * Structure specifying cooperative matrix properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If some types are preferred over other types (e.g. for performance), they <b>should</b> appear earlier in the list enumerated by {@link NVCooperativeMatrix#vkGetPhysicalDeviceCooperativeMatrixPropertiesNV GetPhysicalDeviceCooperativeMatrixPropertiesNV}.</p>
 * 
 * <p>At least one entry in the list <b>must</b> have power of two values for all of {@code MSize}, {@code KSize}, and {@code NSize}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVCooperativeMatrix#vkGetPhysicalDeviceCooperativeMatrixPropertiesNV GetPhysicalDeviceCooperativeMatrixPropertiesNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCooperativeMatrixPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #MSize};
 *     uint32_t {@link #NSize};
 *     uint32_t {@link #KSize};
 *     VkComponentTypeNV {@link #AType};
 *     VkComponentTypeNV {@link #BType};
 *     VkComponentTypeNV {@link #CType};
 *     VkComponentTypeNV {@link #DType};
 *     VkScopeNV {@link #scope};
 * }</code></pre>
 */
public class VkCooperativeMatrixPropertiesNV extends Struct<VkCooperativeMatrixPropertiesNV> implements NativeResource {

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
        DTYPE,
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
        DTYPE = layout.offsetof(8);
        SCOPE = layout.offsetof(9);
    }

    protected VkCooperativeMatrixPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCooperativeMatrixPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkCooperativeMatrixPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkCooperativeMatrixPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCooperativeMatrixPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the number of rows in matrices A, C, and D. */
    @NativeType("uint32_t")
    public int MSize() { return nMSize(address()); }
    /** the number of columns in matrices B, C, D. */
    @NativeType("uint32_t")
    public int NSize() { return nNSize(address()); }
    /** the number of columns in matrix A and rows in matrix B. */
    @NativeType("uint32_t")
    public int KSize() { return nKSize(address()); }
    /** the component type of matrix A, of type {@code VkComponentTypeNV}. */
    @NativeType("VkComponentTypeNV")
    public int AType() { return nAType(address()); }
    /** the component type of matrix B, of type {@code VkComponentTypeNV}. */
    @NativeType("VkComponentTypeNV")
    public int BType() { return nBType(address()); }
    /** the component type of matrix C, of type {@code VkComponentTypeNV}. */
    @NativeType("VkComponentTypeNV")
    public int CType() { return nCType(address()); }
    /** the component type of matrix D, of type {@code VkComponentTypeNV}. */
    @NativeType("VkComponentTypeNV")
    public int DType() { return nDType(address()); }
    /** the scope of all the matrix types, of type {@code VkScopeNV}. */
    @NativeType("VkScopeNV")
    public int scope() { return nscope(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCooperativeMatrixPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkCooperativeMatrixPropertiesNV sType$Default() { return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCooperativeMatrixPropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCooperativeMatrixPropertiesNV set(
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
    public VkCooperativeMatrixPropertiesNV set(VkCooperativeMatrixPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCooperativeMatrixPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCooperativeMatrixPropertiesNV malloc() {
        return new VkCooperativeMatrixPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeMatrixPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCooperativeMatrixPropertiesNV calloc() {
        return new VkCooperativeMatrixPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCooperativeMatrixPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkCooperativeMatrixPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCooperativeMatrixPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCooperativeMatrixPropertiesNV} instance for the specified memory address. */
    public static VkCooperativeMatrixPropertiesNV create(long address) {
        return new VkCooperativeMatrixPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCooperativeMatrixPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkCooperativeMatrixPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCooperativeMatrixPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCooperativeMatrixPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkCooperativeMatrixPropertiesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkCooperativeMatrixPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeMatrixPropertiesNV malloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCooperativeMatrixPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCooperativeMatrixPropertiesNV calloc(MemoryStack stack) {
        return new VkCooperativeMatrixPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCooperativeMatrixPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCooperativeMatrixPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCooperativeMatrixPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #MSize}. */
    public static int nMSize(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.MSIZE); }
    /** Unsafe version of {@link #NSize}. */
    public static int nNSize(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.NSIZE); }
    /** Unsafe version of {@link #KSize}. */
    public static int nKSize(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.KSIZE); }
    /** Unsafe version of {@link #AType}. */
    public static int nAType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.ATYPE); }
    /** Unsafe version of {@link #BType}. */
    public static int nBType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.BTYPE); }
    /** Unsafe version of {@link #CType}. */
    public static int nCType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.CTYPE); }
    /** Unsafe version of {@link #DType}. */
    public static int nDType(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.DTYPE); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return memGetInt(struct + VkCooperativeMatrixPropertiesNV.SCOPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCooperativeMatrixPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCooperativeMatrixPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkCooperativeMatrixPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkCooperativeMatrixPropertiesNV, Buffer> implements NativeResource {

        private static final VkCooperativeMatrixPropertiesNV ELEMENT_FACTORY = VkCooperativeMatrixPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkCooperativeMatrixPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCooperativeMatrixPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCooperativeMatrixPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCooperativeMatrixPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCooperativeMatrixPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#MSize} field. */
        @NativeType("uint32_t")
        public int MSize() { return VkCooperativeMatrixPropertiesNV.nMSize(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#NSize} field. */
        @NativeType("uint32_t")
        public int NSize() { return VkCooperativeMatrixPropertiesNV.nNSize(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#KSize} field. */
        @NativeType("uint32_t")
        public int KSize() { return VkCooperativeMatrixPropertiesNV.nKSize(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#AType} field. */
        @NativeType("VkComponentTypeNV")
        public int AType() { return VkCooperativeMatrixPropertiesNV.nAType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#BType} field. */
        @NativeType("VkComponentTypeNV")
        public int BType() { return VkCooperativeMatrixPropertiesNV.nBType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#CType} field. */
        @NativeType("VkComponentTypeNV")
        public int CType() { return VkCooperativeMatrixPropertiesNV.nCType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#DType} field. */
        @NativeType("VkComponentTypeNV")
        public int DType() { return VkCooperativeMatrixPropertiesNV.nDType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesNV#scope} field. */
        @NativeType("VkScopeNV")
        public int scope() { return VkCooperativeMatrixPropertiesNV.nscope(address()); }

        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesNV#sType} field. */
        public VkCooperativeMatrixPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCooperativeMatrixPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV} value to the {@link VkCooperativeMatrixPropertiesNV#sType} field. */
        public VkCooperativeMatrixPropertiesNV.Buffer sType$Default() { return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesNV#pNext} field. */
        public VkCooperativeMatrixPropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkCooperativeMatrixPropertiesNV.npNext(address(), value); return this; }

    }

}