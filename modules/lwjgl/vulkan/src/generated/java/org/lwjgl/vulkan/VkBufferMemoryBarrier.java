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
 * Structure specifying a buffer memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified buffer range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}. If {@code srcAccessMask} includes {@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT}, memory writes performed by that access type are also made visible, as that access type is not performed through a resource.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified buffer range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}. If {@code dstAccessMask} includes {@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT} or {@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}, available memory writes are also made visible to accesses of those types, as those access types are not performed through a resource.</p>
 * 
 * <p>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, and {@code srcQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> for the specified buffer range, and the second access scope includes no access, as if {@code dstAccessMask} was 0.</p>
 * 
 * <p>If {@code dstQueueFamilyIndex} is not equal to {@code srcQueueFamilyIndex}, and {@code dstQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified buffer range, and the first access scope includes no access, as if {@code srcAccessMask} was 0.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code offset} <b>must</b> be less than the size of {@code buffer}</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be greater than 0</li>
 * <li>If {@code size} is not equal to {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE}, {@code size} <b>must</b> be less than or equal to than the size of {@code buffer} minus {@code offset}</li>
 * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, at least one <b>must</b> not be a special queue family reserved for external memory ownership transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
 * <li>If {@code buffer} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is one of the special queue family values reserved for external memory transfers, the other <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * <li>If {@code buffer} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not equal, {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> both be valid queue families, or one of the special queue family values reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a></li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-synchronization2">{@code synchronization2} feature</a> is not enabled, and {@code buffer} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, at least one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier}, {@link VK10#vkCmdWaitEvents CmdWaitEvents}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferMemoryBarrier {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkAccessFlags {@link #srcAccessMask};
 *     VkAccessFlags {@link #dstAccessMask};
 *     uint32_t {@link #srcQueueFamilyIndex};
 *     uint32_t {@link #dstQueueFamilyIndex};
 *     VkBuffer {@link #buffer};
 *     VkDeviceSize {@link #offset};
 *     VkDeviceSize {@link #size};
 * }</code></pre>
 */
public class VkBufferMemoryBarrier extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCACCESSMASK,
        DSTACCESSMASK,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        BUFFER,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
        SRCQUEUEFAMILYINDEX = layout.offsetof(4);
        DSTQUEUEFAMILYINDEX = layout.offsetof(5);
        BUFFER = layout.offsetof(6);
        OFFSET = layout.offsetof(7);
        SIZE = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkBufferMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferMemoryBarrier(ByteBuffer container) {
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
    /** a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a>. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a>. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
    /** the source queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** the destination queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** a handle to the buffer whose backing memory is affected by the barrier. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** an offset in bytes into the backing memory for {@code buffer}; this is relative to the base offset as bound to the buffer (see {@link VK10#vkBindBufferMemory BindBufferMemory}). */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** a size in bytes of the affected area of backing memory for {@code buffer}, or {@link VK10#VK_WHOLE_SIZE WHOLE_SIZE} to use the range from {@code offset} to the end of the buffer. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferMemoryBarrier sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER} value to the {@link #sType} field. */
    public VkBufferMemoryBarrier sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferMemoryBarrier pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcAccessMask} field. */
    public VkBufferMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #dstAccessMask} field. */
    public VkBufferMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@link #srcQueueFamilyIndex} field. */
    public VkBufferMemoryBarrier srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #dstQueueFamilyIndex} field. */
    public VkBufferMemoryBarrier dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkBufferMemoryBarrier buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkBufferMemoryBarrier offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkBufferMemoryBarrier size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferMemoryBarrier set(
        int sType,
        long pNext,
        int srcAccessMask,
        int dstAccessMask,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long buffer,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        buffer(buffer);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferMemoryBarrier set(VkBufferMemoryBarrier src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryBarrier malloc() {
        return wrap(VkBufferMemoryBarrier.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryBarrier calloc() {
        return wrap(VkBufferMemoryBarrier.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferMemoryBarrier} instance allocated with {@link BufferUtils}. */
    public static VkBufferMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferMemoryBarrier.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferMemoryBarrier} instance for the specified memory address. */
    public static VkBufferMemoryBarrier create(long address) {
        return wrap(VkBufferMemoryBarrier.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferMemoryBarrier createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferMemoryBarrier.class, address);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferMemoryBarrier.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferMemoryBarrier.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBufferMemoryBarrier.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBufferMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryBarrier malloc(MemoryStack stack) {
        return wrap(VkBufferMemoryBarrier.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryBarrier calloc(MemoryStack stack) {
        return wrap(VkBufferMemoryBarrier.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferMemoryBarrier.PNEXT); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier.DSTACCESSMASK); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkBufferMemoryBarrier.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkBufferMemoryBarrier.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferMemoryBarrier.PNEXT, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferMemoryBarrier.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferMemoryBarrier} structs. */
    public static class Buffer extends StructBuffer<VkBufferMemoryBarrier, Buffer> implements NativeResource {

        private static final VkBufferMemoryBarrier ELEMENT_FACTORY = VkBufferMemoryBarrier.create(-1L);

        /**
         * Creates a new {@code VkBufferMemoryBarrier.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferMemoryBarrier#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferMemoryBarrier.nsType(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferMemoryBarrier.npNext(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkBufferMemoryBarrier.nsrcAccessMask(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkBufferMemoryBarrier.ndstAccessMask(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkBufferMemoryBarrier.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkBufferMemoryBarrier.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferMemoryBarrier.nbuffer(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkBufferMemoryBarrier.noffset(address()); }
        /** @return the value of the {@link VkBufferMemoryBarrier#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferMemoryBarrier.nsize(address()); }

        /** Sets the specified value to the {@link VkBufferMemoryBarrier#sType} field. */
        public VkBufferMemoryBarrier.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferMemoryBarrier.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER} value to the {@link VkBufferMemoryBarrier#sType} field. */
        public VkBufferMemoryBarrier.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER); }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#pNext} field. */
        public VkBufferMemoryBarrier.Buffer pNext(@NativeType("void const *") long value) { VkBufferMemoryBarrier.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#srcAccessMask} field. */
        public VkBufferMemoryBarrier.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkBufferMemoryBarrier.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#dstAccessMask} field. */
        public VkBufferMemoryBarrier.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkBufferMemoryBarrier.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#srcQueueFamilyIndex} field. */
        public VkBufferMemoryBarrier.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkBufferMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#dstQueueFamilyIndex} field. */
        public VkBufferMemoryBarrier.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkBufferMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#buffer} field. */
        public VkBufferMemoryBarrier.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferMemoryBarrier.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#offset} field. */
        public VkBufferMemoryBarrier.Buffer offset(@NativeType("VkDeviceSize") long value) { VkBufferMemoryBarrier.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferMemoryBarrier#size} field. */
        public VkBufferMemoryBarrier.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferMemoryBarrier.nsize(address(), value); return this; }

    }

}