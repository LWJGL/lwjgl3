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
 * Structure specifying how to bind a buffer to memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code buffer} <b>must</b> not already be backed by a memory object</li>
 * <li>{@code buffer} <b>must</b> not have been created with any sparse memory binding flags</li>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@code vkGetBufferMemoryRequirements} with {@code buffer}</li>
 * <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@code vkGetBufferMemoryRequirements} with {@code buffer}</li>
 * <li>The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@code vkGetBufferMemoryRequirements} with {@code buffer} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
 * <li>If {@code buffer} requires a dedicated allocation (as reported by {@link VK11#vkGetBufferMemoryRequirements2 GetBufferMemoryRequirements2} in {@link VkMemoryDedicatedRequirements}{@code ::requiresDedicatedAllocation} for {@code buffer}), {@code memory} <b>must</b> have been allocated with {@link VkMemoryDedicatedAllocateInfo}{@code ::buffer} equal to {@code buffer}</li>
 * <li>If the {@link VkMemoryAllocateInfo} provided when {@code memory} was allocated included a {@link VkMemoryDedicatedAllocateInfo} structure in its {@code pNext} chain, and {@link VkMemoryDedicatedAllocateInfo}{@code ::buffer} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code buffer} <b>must</b> equal {@link VkMemoryDedicatedAllocateInfo}{@code ::buffer}, and {@code memoryOffset} <b>must</b> be zero</li>
 * <li>If {@code buffer} was created with the {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT} bit set, the buffer <b>must</b> be bound to a memory object allocated with a memory type that reports {@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT}</li>
 * <li>If {@code buffer} was created with the {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT} bit not set, the buffer <b>must</b> not be bound to a memory object allocated with a memory type that reports {@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT}</li>
 * <li>If {@code buffer} was created with {@link VkDedicatedAllocationBufferCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}, {@code memory} <b>must</b> have been allocated with {@link VkDedicatedAllocationMemoryAllocateInfoNV}{@code ::buffer} equal to a buffer handle created with identical creation parameters to {@code buffer} and {@code memoryOffset} <b>must</b> be zero</li>
 * <li>If the value of {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} used to allocate {@code memory} is not 0, it <b>must</b> include at least one of the handles set in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes} when {@code buffer} was created</li>
 * <li>If {@code memory} was allocated by a memory import operation, the external handle type of the imported memory <b>must</b> also have been set in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes} when {@code buffer} was created</li>
 * <li>If the {@link VkPhysicalDeviceBufferDeviceAddressFeatures}{@code ::bufferDeviceAddress} feature is enabled and {@code buffer} was created with the {@link VK12#VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT} bit set, {@code memory} <b>must</b> have been allocated with the {@link VK12#VK_MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT MEMORY_ALLOCATE_DEVICE_ADDRESS_BIT} bit set</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindBufferMemoryDeviceGroupInfo} structure, all instances of {@code memory} specified by {@link VkBindBufferMemoryDeviceGroupInfo}{@code ::pDeviceIndices} <b>must</b> have been allocated</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkBindBufferMemoryDeviceGroupInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>Both of {@code buffer}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkBindBufferMemory2 BindBufferMemory2}, {@link KHRBindMemory2#vkBindBufferMemory2KHR BindBufferMemory2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindBufferMemoryInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBuffer {@link #buffer};
 *     VkDeviceMemory {@link #memory};
 *     VkDeviceSize {@link #memoryOffset};
 * }</code></pre>
 */
public class VkBindBufferMemoryInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFER,
        MEMORY,
        MEMORYOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkBindBufferMemoryInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindBufferMemoryInfo(ByteBuffer container) {
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
    /** the buffer to be attached to memory. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** a {@code VkDeviceMemory} object describing the device memory to attach. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the start offset of the region of {@code memory} which is to be bound to the buffer. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified buffer. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBindBufferMemoryInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO} value to the {@link #sType} field. */
    public VkBindBufferMemoryInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBindBufferMemoryInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkBindBufferMemoryDeviceGroupInfo} value to the {@code pNext} chain. */
    public VkBindBufferMemoryInfo pNext(VkBindBufferMemoryDeviceGroupInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBindBufferMemoryDeviceGroupInfoKHR} value to the {@code pNext} chain. */
    public VkBindBufferMemoryInfo pNext(VkBindBufferMemoryDeviceGroupInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #buffer} field. */
    public VkBindBufferMemoryInfo buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkBindBufferMemoryInfo memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryOffset} field. */
    public VkBindBufferMemoryInfo memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindBufferMemoryInfo set(
        int sType,
        long pNext,
        long buffer,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        memory(memory);
        memoryOffset(memoryOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindBufferMemoryInfo set(VkBindBufferMemoryInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindBufferMemoryInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryInfo malloc() {
        return wrap(VkBindBufferMemoryInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindBufferMemoryInfo calloc() {
        return wrap(VkBindBufferMemoryInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindBufferMemoryInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindBufferMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindBufferMemoryInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindBufferMemoryInfo} instance for the specified memory address. */
    public static VkBindBufferMemoryInfo create(long address) {
        return wrap(VkBindBufferMemoryInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindBufferMemoryInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindBufferMemoryInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindBufferMemoryInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindBufferMemoryInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindBufferMemoryInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryInfo malloc(MemoryStack stack) {
        return wrap(VkBindBufferMemoryInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindBufferMemoryInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindBufferMemoryInfo calloc(MemoryStack stack) {
        return wrap(VkBindBufferMemoryInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindBufferMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindBufferMemoryInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindBufferMemoryInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindBufferMemoryInfo.PNEXT); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return UNSAFE.getLong(null, struct + VkBindBufferMemoryInfo.BUFFER); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkBindBufferMemoryInfo.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return UNSAFE.getLong(null, struct + VkBindBufferMemoryInfo.MEMORYOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindBufferMemoryInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindBufferMemoryInfo.PNEXT, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkBindBufferMemoryInfo.BUFFER, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkBindBufferMemoryInfo.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBindBufferMemoryInfo.MEMORYOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkBindBufferMemoryInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindBufferMemoryInfo, Buffer> implements NativeResource {

        private static final VkBindBufferMemoryInfo ELEMENT_FACTORY = VkBindBufferMemoryInfo.create(-1L);

        /**
         * Creates a new {@code VkBindBufferMemoryInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindBufferMemoryInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBindBufferMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindBufferMemoryInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindBufferMemoryInfo.nsType(address()); }
        /** @return the value of the {@link VkBindBufferMemoryInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindBufferMemoryInfo.npNext(address()); }
        /** @return the value of the {@link VkBindBufferMemoryInfo#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBindBufferMemoryInfo.nbuffer(address()); }
        /** @return the value of the {@link VkBindBufferMemoryInfo#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindBufferMemoryInfo.nmemory(address()); }
        /** @return the value of the {@link VkBindBufferMemoryInfo#memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindBufferMemoryInfo.nmemoryOffset(address()); }

        /** Sets the specified value to the {@link VkBindBufferMemoryInfo#sType} field. */
        public VkBindBufferMemoryInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindBufferMemoryInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO} value to the {@link VkBindBufferMemoryInfo#sType} field. */
        public VkBindBufferMemoryInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO); }
        /** Sets the specified value to the {@link VkBindBufferMemoryInfo#pNext} field. */
        public VkBindBufferMemoryInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindBufferMemoryInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkBindBufferMemoryDeviceGroupInfo} value to the {@code pNext} chain. */
        public VkBindBufferMemoryInfo.Buffer pNext(VkBindBufferMemoryDeviceGroupInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBindBufferMemoryDeviceGroupInfoKHR} value to the {@code pNext} chain. */
        public VkBindBufferMemoryInfo.Buffer pNext(VkBindBufferMemoryDeviceGroupInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkBindBufferMemoryInfo#buffer} field. */
        public VkBindBufferMemoryInfo.Buffer buffer(@NativeType("VkBuffer") long value) { VkBindBufferMemoryInfo.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindBufferMemoryInfo#memory} field. */
        public VkBindBufferMemoryInfo.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindBufferMemoryInfo.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindBufferMemoryInfo#memoryOffset} field. */
        public VkBindBufferMemoryInfo.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindBufferMemoryInfo.nmemoryOffset(address(), value); return this; }

    }

}