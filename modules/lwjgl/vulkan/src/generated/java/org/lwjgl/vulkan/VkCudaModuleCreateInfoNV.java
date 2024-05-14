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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters to create a CUDA Module.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code dataSize} <b>must</b> be the total size in bytes of the PTX files or binary cache passed to {@code pData}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pData} <b>must</b> be a valid pointer to an array of {@code dataSize} bytes</li>
 * <li>{@code dataSize} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVCudaKernelLaunch#vkCreateCudaModuleNV CreateCudaModuleNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCudaModuleCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     size_t {@link #dataSize};
 *     void const * {@link #pData};
 * }</code></pre>
 */
public class VkCudaModuleCreateInfoNV extends Struct<VkCudaModuleCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATASIZE,
        PDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    protected VkCudaModuleCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCudaModuleCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkCudaModuleCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkCudaModuleCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCudaModuleCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** <b>may</b> be {@code NULL} or <b>may</b> be a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the length of the {@code pData} array. */
    @NativeType("size_t")
    public long dataSize() { return ndataSize(address()); }
    /** a pointer to CUDA code */
    @NativeType("void const *")
    public ByteBuffer pData() { return npData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCudaModuleCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkCudaModuleCreateInfoNV sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCudaModuleCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #pData} field. */
    public VkCudaModuleCreateInfoNV pData(@NativeType("void const *") ByteBuffer value) { npData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCudaModuleCreateInfoNV set(
        int sType,
        long pNext,
        ByteBuffer pData
    ) {
        sType(sType);
        pNext(pNext);
        pData(pData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCudaModuleCreateInfoNV set(VkCudaModuleCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCudaModuleCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCudaModuleCreateInfoNV malloc() {
        return new VkCudaModuleCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCudaModuleCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCudaModuleCreateInfoNV calloc() {
        return new VkCudaModuleCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCudaModuleCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkCudaModuleCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCudaModuleCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCudaModuleCreateInfoNV} instance for the specified memory address. */
    public static VkCudaModuleCreateInfoNV create(long address) {
        return new VkCudaModuleCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCudaModuleCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkCudaModuleCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkCudaModuleCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaModuleCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCudaModuleCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaModuleCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCudaModuleCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCudaModuleCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCudaModuleCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCudaModuleCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCudaModuleCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCudaModuleCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCudaModuleCreateInfoNV malloc(MemoryStack stack) {
        return new VkCudaModuleCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCudaModuleCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCudaModuleCreateInfoNV calloc(MemoryStack stack) {
        return new VkCudaModuleCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCudaModuleCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCudaModuleCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCudaModuleCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCudaModuleCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCudaModuleCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCudaModuleCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #dataSize}. */
    public static long ndataSize(long struct) { return memGetAddress(struct + VkCudaModuleCreateInfoNV.DATASIZE); }
    /** Unsafe version of {@link #pData() pData}. */
    public static ByteBuffer npData(long struct) { return memByteBuffer(memGetAddress(struct + VkCudaModuleCreateInfoNV.PDATA), (int)ndataSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCudaModuleCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCudaModuleCreateInfoNV.PNEXT, value); }
    /** Sets the specified value to the {@code dataSize} field of the specified {@code struct}. */
    public static void ndataSize(long struct, long value) { memPutAddress(struct + VkCudaModuleCreateInfoNV.DATASIZE, value); }
    /** Unsafe version of {@link #pData(ByteBuffer) pData}. */
    public static void npData(long struct, ByteBuffer value) { memPutAddress(struct + VkCudaModuleCreateInfoNV.PDATA, memAddress(value)); ndataSize(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCudaModuleCreateInfoNV.PDATA));
    }

    // -----------------------------------

    /** An array of {@link VkCudaModuleCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkCudaModuleCreateInfoNV, Buffer> implements NativeResource {

        private static final VkCudaModuleCreateInfoNV ELEMENT_FACTORY = VkCudaModuleCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkCudaModuleCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCudaModuleCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCudaModuleCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCudaModuleCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCudaModuleCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkCudaModuleCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCudaModuleCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkCudaModuleCreateInfoNV#dataSize} field. */
        @NativeType("size_t")
        public long dataSize() { return VkCudaModuleCreateInfoNV.ndataSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link VkCudaModuleCreateInfoNV#pData} field. */
        @NativeType("void const *")
        public ByteBuffer pData() { return VkCudaModuleCreateInfoNV.npData(address()); }

        /** Sets the specified value to the {@link VkCudaModuleCreateInfoNV#sType} field. */
        public VkCudaModuleCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkCudaModuleCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCudaKernelLaunch#VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV} value to the {@link VkCudaModuleCreateInfoNV#sType} field. */
        public VkCudaModuleCreateInfoNV.Buffer sType$Default() { return sType(NVCudaKernelLaunch.VK_STRUCTURE_TYPE_CUDA_MODULE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkCudaModuleCreateInfoNV#pNext} field. */
        public VkCudaModuleCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkCudaModuleCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link VkCudaModuleCreateInfoNV#pData} field. */
        public VkCudaModuleCreateInfoNV.Buffer pData(@NativeType("void const *") ByteBuffer value) { VkCudaModuleCreateInfoNV.npData(address(), value); return this; }

    }

}