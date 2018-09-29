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
 * Structure specifying acceleration structure memory binding.
 * 
 * <h5>Description</h5>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVXRaytracing#VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NVX STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NVX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNVX} handle</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * <li>Both of {@code accelerationStructure}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVXRaytracing#vkBindAccelerationStructureMemoryNVX BindAccelerationStructureMemoryNVX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code accelerationStructure} &ndash; the acceleration structure to be attached to memory.</li>
 * <li>{@code memory} &ndash; a VkDeviceMemory object describing the device memory to attach.</li>
 * <li>{@code memoryOffset} &ndash; the start offset of the region of memory which is to be bound to the acceleration structure. The number of bytes returned in the {@link VkMemoryRequirements}::size member in memory, starting from {@code memoryOffset} bytes, will be bound to the specified acceleration structure.</li>
 * <li>{@code deviceIndexCount} &ndash; the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} &ndash; a pointer to an array of device indices.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindAccelerationStructureMemoryInfoNVX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureNVX accelerationStructure;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 * }</code></pre>
 */
public class VkBindAccelerationStructureMemoryInfoNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE,
        MEMORY,
        MEMORYOFFSET,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        DEVICEINDEXCOUNT = layout.offsetof(5);
        PDEVICEINDICES = layout.offsetof(6);
    }

    VkBindAccelerationStructureMemoryInfoNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBindAccelerationStructureMemoryInfoNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindAccelerationStructureMemoryInfoNVX(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code accelerationStructure} field. */
    @NativeType("VkAccelerationStructureNVX")
    public long accelerationStructure() { return naccelerationStructure(address()); }
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** Returns the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindAccelerationStructureMemoryInfoNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindAccelerationStructureMemoryInfoNVX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkBindAccelerationStructureMemoryInfoNVX accelerationStructure(@NativeType("VkAccelerationStructureNVX") long value) { naccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindAccelerationStructureMemoryInfoNVX memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindAccelerationStructureMemoryInfoNVX memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindAccelerationStructureMemoryInfoNVX pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindAccelerationStructureMemoryInfoNVX set(
        int sType,
        long pNext,
        long accelerationStructure,
        long memory,
        long memoryOffset,
        @Nullable IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        memory(memory);
        memoryOffset(memoryOffset);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindAccelerationStructureMemoryInfoNVX set(VkBindAccelerationStructureMemoryInfoNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindAccelerationStructureMemoryInfoNVX malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindAccelerationStructureMemoryInfoNVX calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated with {@link BufferUtils}. */
    public static VkBindAccelerationStructureMemoryInfoNVX create() {
        return new VkBindAccelerationStructureMemoryInfoNVX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance for the specified memory address. */
    public static VkBindAccelerationStructureMemoryInfoNVX create(long address) {
        return new VkBindAccelerationStructureMemoryInfoNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindAccelerationStructureMemoryInfoNVX createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindAccelerationStructureMemoryInfoNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindAccelerationStructureMemoryInfoNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindAccelerationStructureMemoryInfoNVX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindAccelerationStructureMemoryInfoNVX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindAccelerationStructureMemoryInfoNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNVX.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkBindAccelerationStructureMemoryInfoNVX.ACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return memGetLong(struct + VkBindAccelerationStructureMemoryInfoNVX.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return memGetLong(struct + VkBindAccelerationStructureMemoryInfoNVX.MEMORYOFFSET); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return memGetInt(struct + VkBindAccelerationStructureMemoryInfoNVX.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    @Nullable public static IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNVX.PDEVICEINDICES), ndeviceIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindAccelerationStructureMemoryInfoNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindAccelerationStructureMemoryInfoNVX.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkBindAccelerationStructureMemoryInfoNVX.ACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { memPutLong(struct + VkBindAccelerationStructureMemoryInfoNVX.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { memPutLong(struct + VkBindAccelerationStructureMemoryInfoNVX.MEMORYOFFSET, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { memPutInt(struct + VkBindAccelerationStructureMemoryInfoNVX.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindAccelerationStructureMemoryInfoNVX.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNVX.PDEVICEINDICES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindAccelerationStructureMemoryInfoNVX} structs. */
    public static class Buffer extends StructBuffer<VkBindAccelerationStructureMemoryInfoNVX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBindAccelerationStructureMemoryInfoNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindAccelerationStructureMemoryInfoNVX#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkBindAccelerationStructureMemoryInfoNVX newInstance(long address) {
            return new VkBindAccelerationStructureMemoryInfoNVX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindAccelerationStructureMemoryInfoNVX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindAccelerationStructureMemoryInfoNVX.npNext(address()); }
        /** Returns the value of the {@code accelerationStructure} field. */
        @NativeType("VkAccelerationStructureNVX")
        public long accelerationStructure() { return VkBindAccelerationStructureMemoryInfoNVX.naccelerationStructure(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindAccelerationStructureMemoryInfoNVX.nmemory(address()); }
        /** Returns the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindAccelerationStructureMemoryInfoNVX.nmemoryOffset(address()); }
        /** Returns the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindAccelerationStructureMemoryInfoNVX.ndeviceIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() { return VkBindAccelerationStructureMemoryInfoNVX.npDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindAccelerationStructureMemoryInfoNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkBindAccelerationStructureMemoryInfoNVX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindAccelerationStructureMemoryInfoNVX.Buffer pNext(@NativeType("void const *") long value) { VkBindAccelerationStructureMemoryInfoNVX.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkBindAccelerationStructureMemoryInfoNVX.Buffer accelerationStructure(@NativeType("VkAccelerationStructureNVX") long value) { VkBindAccelerationStructureMemoryInfoNVX.naccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindAccelerationStructureMemoryInfoNVX.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindAccelerationStructureMemoryInfoNVX.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindAccelerationStructureMemoryInfoNVX.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindAccelerationStructureMemoryInfoNVX.nmemoryOffset(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindAccelerationStructureMemoryInfoNVX.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindAccelerationStructureMemoryInfoNVX.npDeviceIndices(address(), value); return this; }

    }

}