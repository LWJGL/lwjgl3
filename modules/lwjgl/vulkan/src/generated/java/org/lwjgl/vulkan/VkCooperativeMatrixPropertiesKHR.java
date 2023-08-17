/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

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
 * <p>If some types are preferred over other types (e.g. for performance), they <b>should</b> appear earlier in the list enumerated by {@link KHRCooperativeMatrix#vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR GetPhysicalDeviceCooperativeMatrixPropertiesKHR}.</p>
 * 
 * <p>At least one entry in the list <b>must</b> have power of two values for all of {@code MSize}, {@code KSize}, and {@code NSize}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code AType} <b>must</b> be a valid {@code VkComponentTypeKHR} value</li>
 * <li>{@code BType} <b>must</b> be a valid {@code VkComponentTypeKHR} value</li>
 * <li>{@code CType} <b>must</b> be a valid {@code VkComponentTypeKHR} value</li>
 * <li>{@code ResultType} <b>must</b> be a valid {@code VkComponentTypeKHR} value</li>
 * <li>{@code scope} <b>must</b> be a valid {@code VkScopeKHR} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRCooperativeMatrix#vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR GetPhysicalDeviceCooperativeMatrixPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCooperativeMatrixPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #MSize};
 *     uint32_t {@link #NSize};
 *     uint32_t {@link #KSize};
 *     VkComponentTypeKHR {@link #AType};
 *     VkComponentTypeKHR {@link #BType};
 *     VkComponentTypeKHR {@link #CType};
 *     VkComponentTypeKHR {@link #ResultType};
 *     VkBool32 {@link #saturatingAccumulation};
 *     VkScopeKHR {@link #scope};
 * }</code></pre>
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the number of rows in matrices {@code A}, {@code C}, and {@code Result}. */
    @NativeType("uint32_t")
    public int MSize() { return nMSize(address()); }
    /** the number of columns in matrices {@code B}, {@code C}, {@code Result}. */
    @NativeType("uint32_t")
    public int NSize() { return nNSize(address()); }
    /** the number of columns in matrix {@code A} and rows in matrix {@code B}. */
    @NativeType("uint32_t")
    public int KSize() { return nKSize(address()); }
    /** the component type of matrix {@code A}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int AType() { return nAType(address()); }
    /** the component type of matrix {@code B}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int BType() { return nBType(address()); }
    /** the component type of matrix {@code C}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int CType() { return nCType(address()); }
    /** the component type of matrix {@code Result}, of type {@code VkComponentTypeKHR}. */
    @NativeType("VkComponentTypeKHR")
    public int ResultType() { return nResultType(address()); }
    /** indicates whether the {@code SaturatingAccumulation} operand to {@code OpCooperativeMatrixMulAddKHR} <b>must</b> be present. */
    @NativeType("VkBool32")
    public boolean saturatingAccumulation() { return nsaturatingAccumulation(address()) != 0; }
    /** the scope of all the matrix types, of type {@code VkScopeKHR}. */
    @NativeType("VkScopeKHR")
    public int scope() { return nscope(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCooperativeMatrixPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkCooperativeMatrixPropertiesKHR sType$Default() { return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCooperativeMatrixPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #MSize} field. */
    public VkCooperativeMatrixPropertiesKHR MSize(@NativeType("uint32_t") int value) { nMSize(address(), value); return this; }
    /** Sets the specified value to the {@link #NSize} field. */
    public VkCooperativeMatrixPropertiesKHR NSize(@NativeType("uint32_t") int value) { nNSize(address(), value); return this; }
    /** Sets the specified value to the {@link #KSize} field. */
    public VkCooperativeMatrixPropertiesKHR KSize(@NativeType("uint32_t") int value) { nKSize(address(), value); return this; }
    /** Sets the specified value to the {@link #AType} field. */
    public VkCooperativeMatrixPropertiesKHR AType(@NativeType("VkComponentTypeKHR") int value) { nAType(address(), value); return this; }
    /** Sets the specified value to the {@link #BType} field. */
    public VkCooperativeMatrixPropertiesKHR BType(@NativeType("VkComponentTypeKHR") int value) { nBType(address(), value); return this; }
    /** Sets the specified value to the {@link #CType} field. */
    public VkCooperativeMatrixPropertiesKHR CType(@NativeType("VkComponentTypeKHR") int value) { nCType(address(), value); return this; }
    /** Sets the specified value to the {@link #ResultType} field. */
    public VkCooperativeMatrixPropertiesKHR ResultType(@NativeType("VkComponentTypeKHR") int value) { nResultType(address(), value); return this; }
    /** Sets the specified value to the {@link #saturatingAccumulation} field. */
    public VkCooperativeMatrixPropertiesKHR saturatingAccumulation(@NativeType("VkBool32") boolean value) { nsaturatingAccumulation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #scope} field. */
    public VkCooperativeMatrixPropertiesKHR scope(@NativeType("VkScopeKHR") int value) { nscope(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCooperativeMatrixPropertiesKHR set(
        int sType,
        long pNext,
        int MSize,
        int NSize,
        int KSize,
        int AType,
        int BType,
        int CType,
        int ResultType,
        boolean saturatingAccumulation,
        int scope
    ) {
        sType(sType);
        pNext(pNext);
        MSize(MSize);
        NSize(NSize);
        KSize(KSize);
        AType(AType);
        BType(BType);
        CType(CType);
        ResultType(ResultType);
        saturatingAccumulation(saturatingAccumulation);
        scope(scope);

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
    @Nullable
    public static VkCooperativeMatrixPropertiesKHR createSafe(long address) {
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
    @Nullable
    public static VkCooperativeMatrixPropertiesKHR.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCooperativeMatrixPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #MSize}. */
    public static int nMSize(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.MSIZE); }
    /** Unsafe version of {@link #NSize}. */
    public static int nNSize(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.NSIZE); }
    /** Unsafe version of {@link #KSize}. */
    public static int nKSize(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.KSIZE); }
    /** Unsafe version of {@link #AType}. */
    public static int nAType(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.ATYPE); }
    /** Unsafe version of {@link #BType}. */
    public static int nBType(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.BTYPE); }
    /** Unsafe version of {@link #CType}. */
    public static int nCType(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.CTYPE); }
    /** Unsafe version of {@link #ResultType}. */
    public static int nResultType(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.RESULTTYPE); }
    /** Unsafe version of {@link #saturatingAccumulation}. */
    public static int nsaturatingAccumulation(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.SATURATINGACCUMULATION); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return UNSAFE.getInt(null, struct + VkCooperativeMatrixPropertiesKHR.SCOPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCooperativeMatrixPropertiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #MSize(int) MSize}. */
    public static void nMSize(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.MSIZE, value); }
    /** Unsafe version of {@link #NSize(int) NSize}. */
    public static void nNSize(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.NSIZE, value); }
    /** Unsafe version of {@link #KSize(int) KSize}. */
    public static void nKSize(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.KSIZE, value); }
    /** Unsafe version of {@link #AType(int) AType}. */
    public static void nAType(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.ATYPE, value); }
    /** Unsafe version of {@link #BType(int) BType}. */
    public static void nBType(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.BTYPE, value); }
    /** Unsafe version of {@link #CType(int) CType}. */
    public static void nCType(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.CTYPE, value); }
    /** Unsafe version of {@link #ResultType(int) ResultType}. */
    public static void nResultType(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.RESULTTYPE, value); }
    /** Unsafe version of {@link #saturatingAccumulation(boolean) saturatingAccumulation}. */
    public static void nsaturatingAccumulation(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.SATURATINGACCUMULATION, value); }
    /** Unsafe version of {@link #scope(int) scope}. */
    public static void nscope(long struct, int value) { UNSAFE.putInt(null, struct + VkCooperativeMatrixPropertiesKHR.SCOPE, value); }

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
        protected VkCooperativeMatrixPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCooperativeMatrixPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkCooperativeMatrixPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#MSize} field. */
        @NativeType("uint32_t")
        public int MSize() { return VkCooperativeMatrixPropertiesKHR.nMSize(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#NSize} field. */
        @NativeType("uint32_t")
        public int NSize() { return VkCooperativeMatrixPropertiesKHR.nNSize(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#KSize} field. */
        @NativeType("uint32_t")
        public int KSize() { return VkCooperativeMatrixPropertiesKHR.nKSize(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#AType} field. */
        @NativeType("VkComponentTypeKHR")
        public int AType() { return VkCooperativeMatrixPropertiesKHR.nAType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#BType} field. */
        @NativeType("VkComponentTypeKHR")
        public int BType() { return VkCooperativeMatrixPropertiesKHR.nBType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#CType} field. */
        @NativeType("VkComponentTypeKHR")
        public int CType() { return VkCooperativeMatrixPropertiesKHR.nCType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#ResultType} field. */
        @NativeType("VkComponentTypeKHR")
        public int ResultType() { return VkCooperativeMatrixPropertiesKHR.nResultType(address()); }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#saturatingAccumulation} field. */
        @NativeType("VkBool32")
        public boolean saturatingAccumulation() { return VkCooperativeMatrixPropertiesKHR.nsaturatingAccumulation(address()) != 0; }
        /** @return the value of the {@link VkCooperativeMatrixPropertiesKHR#scope} field. */
        @NativeType("VkScopeKHR")
        public int scope() { return VkCooperativeMatrixPropertiesKHR.nscope(address()); }

        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#sType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCooperativeMatrixPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR} value to the {@link VkCooperativeMatrixPropertiesKHR#sType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer sType$Default() { return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_COOPERATIVE_MATRIX_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#pNext} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkCooperativeMatrixPropertiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#MSize} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer MSize(@NativeType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.nMSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#NSize} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer NSize(@NativeType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.nNSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#KSize} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer KSize(@NativeType("uint32_t") int value) { VkCooperativeMatrixPropertiesKHR.nKSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#AType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer AType(@NativeType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.nAType(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#BType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer BType(@NativeType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.nBType(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#CType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer CType(@NativeType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.nCType(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#ResultType} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer ResultType(@NativeType("VkComponentTypeKHR") int value) { VkCooperativeMatrixPropertiesKHR.nResultType(address(), value); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#saturatingAccumulation} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer saturatingAccumulation(@NativeType("VkBool32") boolean value) { VkCooperativeMatrixPropertiesKHR.nsaturatingAccumulation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkCooperativeMatrixPropertiesKHR#scope} field. */
        public VkCooperativeMatrixPropertiesKHR.Buffer scope(@NativeType("VkScopeKHR") int value) { VkCooperativeMatrixPropertiesKHR.nscope(address(), value); return this; }

    }

}