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
 * Structure describing cooperative matrix features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCooperativeMatrixFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #cooperativeMatrix};
 *     VkBool32 {@link #cooperativeMatrixRobustBufferAccess};
 * }</code></pre>
 */
public class VkPhysicalDeviceCooperativeMatrixFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIX,
        COOPERATIVEMATRIXROBUSTBUFFERACCESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIX = layout.offsetof(2);
        COOPERATIVEMATRIXROBUSTBUFFERACCESS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports the {@code CooperativeMatrixNV} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrix() { return ncooperativeMatrix(address()) != 0; }
    /** indicates that the implementation supports robust buffer access for SPIR-V {@code OpCooperativeMatrixLoadNV} and {@code OpCooperativeMatrixStoreNV} instructions. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixRobustBufferAccess() { return ncooperativeMatrixRobustBufferAccess(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV sType$Default() { return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #cooperativeMatrix} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrix(@NativeType("VkBool32") boolean value) { ncooperativeMatrix(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #cooperativeMatrixRobustBufferAccess} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV cooperativeMatrixRobustBufferAccess(@NativeType("VkBool32") boolean value) { ncooperativeMatrixRobustBufferAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV set(
        int sType,
        long pNext,
        boolean cooperativeMatrix,
        boolean cooperativeMatrixRobustBufferAccess
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrix(cooperativeMatrix);
        cooperativeMatrixRobustBufferAccess(cooperativeMatrixRobustBufferAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixFeaturesNV set(VkPhysicalDeviceCooperativeMatrixFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceCooperativeMatrixFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrix}. */
    public static int ncooperativeMatrix(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.COOPERATIVEMATRIX); }
    /** Unsafe version of {@link #cooperativeMatrixRobustBufferAccess}. */
    public static int ncooperativeMatrixRobustBufferAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.COOPERATIVEMATRIXROBUSTBUFFERACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeMatrix(boolean) cooperativeMatrix}. */
    public static void ncooperativeMatrix(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.COOPERATIVEMATRIX, value); }
    /** Unsafe version of {@link #cooperativeMatrixRobustBufferAccess(boolean) cooperativeMatrixRobustBufferAccess}. */
    public static void ncooperativeMatrixRobustBufferAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCooperativeMatrixFeaturesNV.COOPERATIVEMATRIXROBUSTBUFFERACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceCooperativeMatrixFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#cooperativeMatrix} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrix() { return VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrix(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#cooperativeMatrixRobustBufferAccess} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixRobustBufferAccess() { return VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrixRobustBufferAccess(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#sType} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV} value to the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#sType} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer sType$Default() { return sType(NVCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#cooperativeMatrix} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer cooperativeMatrix(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrix(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCooperativeMatrixFeaturesNV#cooperativeMatrixRobustBufferAccess} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesNV.Buffer cooperativeMatrixRobustBufferAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixFeaturesNV.ncooperativeMatrixRobustBufferAccess(address(), value ? 1 : 0); return this; }

    }

}