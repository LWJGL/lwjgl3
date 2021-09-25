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
 * Specify a dedicated memory allocation resource.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>At least one of {@code image} and {@code buffer} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the image <b>must</b> have been created with {@link VkDedicatedAllocationImageCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the buffer <b>must</b> have been created with {@link VkDedicatedAllocationBufferCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@link VkMemoryAllocateInfo}{@code ::allocationSize} <b>must</b> equal the {@link VkMemoryRequirements}{@code ::size} of the image</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@link VkMemoryAllocateInfo}{@code ::allocationSize} <b>must</b> equal the {@link VkMemoryRequirements}{@code ::size} of the buffer</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@link VkMemoryAllocateInfo} defines a memory import operation, the memory being imported <b>must</b> also be a dedicated image allocation and {@code image} <b>must</b> be identical to the image associated with the imported memory</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@link VkMemoryAllocateInfo} defines a memory import operation, the memory being imported <b>must</b> also be a dedicated buffer allocation and {@code buffer} <b>must</b> be identical to the buffer associated with the imported memory</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV}</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>Both of {@code buffer}, and {@code image} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDedicatedAllocationMemoryAllocateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 *     VkBuffer {@link #buffer};
 * }</code></pre>
 */
public class VkDedicatedAllocationMemoryAllocateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        BUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDedicatedAllocationMemoryAllocateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a handle of an image which this memory will be bound to. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** {@link VK10#VK_NULL_HANDLE NULL_HANDLE} or a handle of a buffer which this memory will be bound to. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDedicatedAllocationMemoryAllocateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV} value to the {@link #sType} field. */
    public VkDedicatedAllocationMemoryAllocateInfoNV sType$Default() { return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDedicatedAllocationMemoryAllocateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkDedicatedAllocationMemoryAllocateInfoNV image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkDedicatedAllocationMemoryAllocateInfoNV buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDedicatedAllocationMemoryAllocateInfoNV set(
        int sType,
        long pNext,
        long image,
        long buffer
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        buffer(buffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDedicatedAllocationMemoryAllocateInfoNV set(VkDedicatedAllocationMemoryAllocateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationMemoryAllocateInfoNV malloc() {
        return wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDedicatedAllocationMemoryAllocateInfoNV calloc() {
        return wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkDedicatedAllocationMemoryAllocateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance for the specified memory address. */
    public static VkDedicatedAllocationMemoryAllocateInfoNV create(long address) {
        return wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDedicatedAllocationMemoryAllocateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV malloc(MemoryStack stack) {
        return wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDedicatedAllocationMemoryAllocateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV calloc(MemoryStack stack) {
        return wrap(VkDedicatedAllocationMemoryAllocateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDedicatedAllocationMemoryAllocateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDedicatedAllocationMemoryAllocateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDedicatedAllocationMemoryAllocateInfoNV.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkDedicatedAllocationMemoryAllocateInfoNV.IMAGE); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkDedicatedAllocationMemoryAllocateInfoNV.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDedicatedAllocationMemoryAllocateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDedicatedAllocationMemoryAllocateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkDedicatedAllocationMemoryAllocateInfoNV.IMAGE, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkDedicatedAllocationMemoryAllocateInfoNV.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkDedicatedAllocationMemoryAllocateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkDedicatedAllocationMemoryAllocateInfoNV, Buffer> implements NativeResource {

        private static final VkDedicatedAllocationMemoryAllocateInfoNV ELEMENT_FACTORY = VkDedicatedAllocationMemoryAllocateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkDedicatedAllocationMemoryAllocateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDedicatedAllocationMemoryAllocateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkDedicatedAllocationMemoryAllocateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDedicatedAllocationMemoryAllocateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDedicatedAllocationMemoryAllocateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkDedicatedAllocationMemoryAllocateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDedicatedAllocationMemoryAllocateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkDedicatedAllocationMemoryAllocateInfoNV#image} field. */
        @NativeType("VkImage")
        public long image() { return VkDedicatedAllocationMemoryAllocateInfoNV.nimage(address()); }
        /** @return the value of the {@link VkDedicatedAllocationMemoryAllocateInfoNV#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkDedicatedAllocationMemoryAllocateInfoNV.nbuffer(address()); }

        /** Sets the specified value to the {@link VkDedicatedAllocationMemoryAllocateInfoNV#sType} field. */
        public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkDedicatedAllocationMemoryAllocateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDedicatedAllocation#VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV} value to the {@link VkDedicatedAllocationMemoryAllocateInfoNV#sType} field. */
        public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer sType$Default() { return sType(NVDedicatedAllocation.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV); }
        /** Sets the specified value to the {@link VkDedicatedAllocationMemoryAllocateInfoNV#pNext} field. */
        public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkDedicatedAllocationMemoryAllocateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDedicatedAllocationMemoryAllocateInfoNV#image} field. */
        public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer image(@NativeType("VkImage") long value) { VkDedicatedAllocationMemoryAllocateInfoNV.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkDedicatedAllocationMemoryAllocateInfoNV#buffer} field. */
        public VkDedicatedAllocationMemoryAllocateInfoNV.Buffer buffer(@NativeType("VkBuffer") long value) { VkDedicatedAllocationMemoryAllocateInfoNV.nbuffer(address(), value); return this; }

    }

}