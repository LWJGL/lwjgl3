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
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@link VkMemoryAllocateInfo}{@code ::allocationSize} <b>must</b> equal the {@link VkMemoryRequirements}{@code ::size} of the image</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> have been created without {@link VK10#VK_IMAGE_CREATE_SPARSE_BINDING_BIT IMAGE_CREATE_SPARSE_BINDING_BIT} set in {@link VkImageCreateInfo}{@code ::flags}</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@link VkMemoryAllocateInfo}{@code ::allocationSize} <b>must</b> equal the {@link VkMemoryRequirements}{@code ::size} of the buffer</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> have been created without {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT} set in {@link VkBufferCreateInfo}{@code ::flags}</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@link VkMemoryAllocateInfo} defines a memory import operation with handle type {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT}, or {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT}, and the external handle was created by the Vulkan API, then the memory being imported <b>must</b> also be a dedicated image allocation and {@code image} must be identical to the image associated with the imported memory</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@link VkMemoryAllocateInfo} defines a memory import operation with handle type {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT}, {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT}, or {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT}, and the external handle was created by the Vulkan API, then the memory being imported <b>must</b> also be a dedicated buffer allocation and {@code buffer} <b>must</b> be identical to the buffer associated with the imported memory</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@link VkMemoryAllocateInfo} defines a memory import operation with handle type {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT}, the memory being imported <b>must</b> also be a dedicated image allocation and {@code image} <b>must</b> be identical to the image associated with the imported memory</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE} and {@link VkMemoryAllocateInfo} defines a memory import operation with handle type {@link VK11#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT}, the memory being imported <b>must</b> also be a dedicated buffer allocation and {@code buffer} <b>must</b> be identical to the buffer associated with the imported memory</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> not have been created with {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} set in {@link VkImageCreateInfo}{@code ::flags}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO}</li>
 * <li>If {@code image} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>If {@code buffer} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>Both of {@code buffer}, and {@code image} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryDedicatedAllocateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 *     VkBuffer {@link #buffer};
 * }</code></pre>
 */
public class VkMemoryDedicatedAllocateInfo extends Struct implements NativeResource {

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
     * Creates a {@code VkMemoryDedicatedAllocateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryDedicatedAllocateInfo(ByteBuffer container) {
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
    public VkMemoryDedicatedAllocateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO} value to the {@link #sType} field. */
    public VkMemoryDedicatedAllocateInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryDedicatedAllocateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #image} field. */
    public VkMemoryDedicatedAllocateInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkMemoryDedicatedAllocateInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryDedicatedAllocateInfo set(
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
    public VkMemoryDedicatedAllocateInfo set(VkMemoryDedicatedAllocateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryDedicatedAllocateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedAllocateInfo malloc() {
        return wrap(VkMemoryDedicatedAllocateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryDedicatedAllocateInfo calloc() {
        return wrap(VkMemoryDedicatedAllocateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfo} instance allocated with {@link BufferUtils}. */
    public static VkMemoryDedicatedAllocateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMemoryDedicatedAllocateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryDedicatedAllocateInfo} instance for the specified memory address. */
    public static VkMemoryDedicatedAllocateInfo create(long address) {
        return wrap(VkMemoryDedicatedAllocateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedAllocateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkMemoryDedicatedAllocateInfo.class, address);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMemoryDedicatedAllocateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryDedicatedAllocateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMemoryDedicatedAllocateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMemoryDedicatedAllocateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedAllocateInfo malloc(MemoryStack stack) {
        return wrap(VkMemoryDedicatedAllocateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMemoryDedicatedAllocateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryDedicatedAllocateInfo calloc(MemoryStack stack) {
        return wrap(VkMemoryDedicatedAllocateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryDedicatedAllocateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryDedicatedAllocateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryDedicatedAllocateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryDedicatedAllocateInfo.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkMemoryDedicatedAllocateInfo.IMAGE); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkMemoryDedicatedAllocateInfo.BUFFER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryDedicatedAllocateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryDedicatedAllocateInfo.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryDedicatedAllocateInfo.IMAGE, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkMemoryDedicatedAllocateInfo.BUFFER, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryDedicatedAllocateInfo} structs. */
    public static class Buffer extends StructBuffer<VkMemoryDedicatedAllocateInfo, Buffer> implements NativeResource {

        private static final VkMemoryDedicatedAllocateInfo ELEMENT_FACTORY = VkMemoryDedicatedAllocateInfo.create(-1L);

        /**
         * Creates a new {@code VkMemoryDedicatedAllocateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryDedicatedAllocateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkMemoryDedicatedAllocateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryDedicatedAllocateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryDedicatedAllocateInfo.nsType(address()); }
        /** @return the value of the {@link VkMemoryDedicatedAllocateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryDedicatedAllocateInfo.npNext(address()); }
        /** @return the value of the {@link VkMemoryDedicatedAllocateInfo#image} field. */
        @NativeType("VkImage")
        public long image() { return VkMemoryDedicatedAllocateInfo.nimage(address()); }
        /** @return the value of the {@link VkMemoryDedicatedAllocateInfo#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkMemoryDedicatedAllocateInfo.nbuffer(address()); }

        /** Sets the specified value to the {@link VkMemoryDedicatedAllocateInfo#sType} field. */
        public VkMemoryDedicatedAllocateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryDedicatedAllocateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO} value to the {@link VkMemoryDedicatedAllocateInfo#sType} field. */
        public VkMemoryDedicatedAllocateInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_MEMORY_DEDICATED_ALLOCATE_INFO); }
        /** Sets the specified value to the {@link VkMemoryDedicatedAllocateInfo#pNext} field. */
        public VkMemoryDedicatedAllocateInfo.Buffer pNext(@NativeType("void const *") long value) { VkMemoryDedicatedAllocateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryDedicatedAllocateInfo#image} field. */
        public VkMemoryDedicatedAllocateInfo.Buffer image(@NativeType("VkImage") long value) { VkMemoryDedicatedAllocateInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryDedicatedAllocateInfo#buffer} field. */
        public VkMemoryDedicatedAllocateInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkMemoryDedicatedAllocateInfo.nbuffer(address(), value); return this; }

    }

}