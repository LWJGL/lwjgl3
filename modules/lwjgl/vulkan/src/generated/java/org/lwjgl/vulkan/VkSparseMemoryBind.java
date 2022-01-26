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
 * Structure specifying a sparse memory bind operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>The <em>binding range</em> <code>[resourceOffset, resourceOffset + size)</code> has different constraints based on {@code flags}. If {@code flags} contains {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range <b>must</b> be within the mip tail region of the metadata aspect. This metadata region is defined by:</p>
 * 
 * <dl>
 * <dd><code>metadataRegion = [base, base + imageMipTailSize)</code></dd>
 * <dd><code>base = imageMipTailOffset + imageMipTailStride × n</code></dd>
 * </dl>
 * 
 * <p>and {@code imageMipTailOffset}, {@code imageMipTailSize}, and {@code imageMipTailStride} values are from the {@link VkSparseImageMemoryRequirements} corresponding to the metadata aspect of the image, and <code>n</code> is a valid array layer index for the image,</p>
 * 
 * <p>{@code imageMipTailStride} is considered to be zero for aspects where {@link VkSparseImageMemoryRequirements}{@code ::formatProperties.flags} contains {@link VK10#VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT}.</p>
 * 
 * <p>If {@code flags} does not contain {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range <b>must</b> be within the range <code>[0,{@link VkMemoryRequirements}::size)</code>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} and {@code memoryOffset} <b>must</b> match the memory requirements of the resource, as described in section <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-association">Resource Memory Association</a></li>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> not have been created with a memory type that reports {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT} bit set</li>
 * <li>{@code size} <b>must</b> be greater than 0</li>
 * <li>{@code resourceOffset} <b>must</b> be less than the size of the resource</li>
 * <li>{@code size} <b>must</b> be less than or equal to the size of the resource minus {@code resourceOffset}</li>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>{@code size} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
 * <li>If {@code memory} was created with {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} not equal to 0, at least one handle type it contained <b>must</b> also have been set in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes} or {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes} when the resource was created</li>
 * <li>If {@code memory} was created by a memory import operation, the external handle type of the imported memory <b>must</b> also have been set in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes} or {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes} when the resource was created</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>If {@code memory} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSparseMemoryBindFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSparseMemoryBind {
 *     VkDeviceSize {@link #resourceOffset};
 *     VkDeviceSize {@link #size};
 *     VkDeviceMemory {@link #memory};
 *     VkDeviceSize {@link #memoryOffset};
 *     VkSparseMemoryBindFlags {@link #flags};
 * }</code></pre>
 */
public class VkSparseMemoryBind extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESOURCEOFFSET,
        SIZE,
        MEMORY,
        MEMORYOFFSET,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESOURCEOFFSET = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
        MEMORYOFFSET = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkSparseMemoryBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSparseMemoryBind(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the offset into the resource. */
    @NativeType("VkDeviceSize")
    public long resourceOffset() { return nresourceOffset(address()); }
    /** the size of the memory region to be bound. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** the {@code VkDeviceMemory} object that the range of the resource is bound to. If {@code memory} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the range is unbound. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the offset into the {@code VkDeviceMemory} object to bind the resource range to. If {@code memory} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, this value is ignored. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** a bitmask of {@code VkSparseMemoryBindFlagBits} specifying usage of the binding operation. */
    @NativeType("VkSparseMemoryBindFlags")
    public int flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #resourceOffset} field. */
    public VkSparseMemoryBind resourceOffset(@NativeType("VkDeviceSize") long value) { nresourceOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkSparseMemoryBind size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkSparseMemoryBind memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryOffset} field. */
    public VkSparseMemoryBind memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSparseMemoryBind flags(@NativeType("VkSparseMemoryBindFlags") int value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSparseMemoryBind set(
        long resourceOffset,
        long size,
        long memory,
        long memoryOffset,
        int flags
    ) {
        resourceOffset(resourceOffset);
        size(size);
        memory(memory);
        memoryOffset(memoryOffset);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSparseMemoryBind set(VkSparseMemoryBind src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSparseMemoryBind malloc() {
        return wrap(VkSparseMemoryBind.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSparseMemoryBind} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSparseMemoryBind calloc() {
        return wrap(VkSparseMemoryBind.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSparseMemoryBind} instance allocated with {@link BufferUtils}. */
    public static VkSparseMemoryBind create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSparseMemoryBind.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSparseMemoryBind} instance for the specified memory address. */
    public static VkSparseMemoryBind create(long address) {
        return wrap(VkSparseMemoryBind.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseMemoryBind createSafe(long address) {
        return address == NULL ? null : wrap(VkSparseMemoryBind.class, address);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSparseMemoryBind.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSparseMemoryBind.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSparseMemoryBind.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSparseMemoryBind} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseMemoryBind malloc(MemoryStack stack) {
        return wrap(VkSparseMemoryBind.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSparseMemoryBind} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSparseMemoryBind calloc(MemoryStack stack) {
        return wrap(VkSparseMemoryBind.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSparseMemoryBind.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSparseMemoryBind.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #resourceOffset}. */
    public static long nresourceOffset(long struct) { return UNSAFE.getLong(null, struct + VkSparseMemoryBind.RESOURCEOFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkSparseMemoryBind.SIZE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkSparseMemoryBind.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return UNSAFE.getLong(null, struct + VkSparseMemoryBind.MEMORYOFFSET); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSparseMemoryBind.FLAGS); }

    /** Unsafe version of {@link #resourceOffset(long) resourceOffset}. */
    public static void nresourceOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkSparseMemoryBind.RESOURCEOFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkSparseMemoryBind.SIZE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkSparseMemoryBind.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkSparseMemoryBind.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSparseMemoryBind.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkSparseMemoryBind} structs. */
    public static class Buffer extends StructBuffer<VkSparseMemoryBind, Buffer> implements NativeResource {

        private static final VkSparseMemoryBind ELEMENT_FACTORY = VkSparseMemoryBind.create(-1L);

        /**
         * Creates a new {@code VkSparseMemoryBind.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSparseMemoryBind#SIZEOF}, and its mark will be undefined.
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
        protected VkSparseMemoryBind getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSparseMemoryBind#resourceOffset} field. */
        @NativeType("VkDeviceSize")
        public long resourceOffset() { return VkSparseMemoryBind.nresourceOffset(address()); }
        /** @return the value of the {@link VkSparseMemoryBind#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkSparseMemoryBind.nsize(address()); }
        /** @return the value of the {@link VkSparseMemoryBind#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkSparseMemoryBind.nmemory(address()); }
        /** @return the value of the {@link VkSparseMemoryBind#memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkSparseMemoryBind.nmemoryOffset(address()); }
        /** @return the value of the {@link VkSparseMemoryBind#flags} field. */
        @NativeType("VkSparseMemoryBindFlags")
        public int flags() { return VkSparseMemoryBind.nflags(address()); }

        /** Sets the specified value to the {@link VkSparseMemoryBind#resourceOffset} field. */
        public VkSparseMemoryBind.Buffer resourceOffset(@NativeType("VkDeviceSize") long value) { VkSparseMemoryBind.nresourceOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkSparseMemoryBind#size} field. */
        public VkSparseMemoryBind.Buffer size(@NativeType("VkDeviceSize") long value) { VkSparseMemoryBind.nsize(address(), value); return this; }
        /** Sets the specified value to the {@link VkSparseMemoryBind#memory} field. */
        public VkSparseMemoryBind.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkSparseMemoryBind.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkSparseMemoryBind#memoryOffset} field. */
        public VkSparseMemoryBind.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkSparseMemoryBind.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkSparseMemoryBind#flags} field. */
        public VkSparseMemoryBind.Buffer flags(@NativeType("VkSparseMemoryBindFlags") int value) { VkSparseMemoryBind.nflags(address(), value); return this; }

    }

}