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
 * Structure specifying device memory heap entry for video session object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoQueue#vkBindVideoSessionMemoryKHR BindVideoSessionMemoryKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoBindMemoryKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #memoryBindIndex};
 *     VkDeviceMemory {@link #memory};
 *     VkDeviceSize {@link #memoryOffset};
 *     VkDeviceSize {@link #memorySize};
 * }</code></pre>
 */
public class VkVideoBindMemoryKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYBINDINDEX,
        MEMORY,
        MEMORYOFFSET,
        MEMORYSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYBINDINDEX = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        MEMORYSIZE = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkVideoBindMemoryKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoBindMemoryKHR(ByteBuffer container) {
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
    /** the index of the device memory heap returned in {@link VkVideoGetMemoryPropertiesKHR}{@code ::memoryBindIndex} from {@link KHRVideoQueue#vkGetVideoSessionMemoryRequirementsKHR GetVideoSessionMemoryRequirementsKHR}. */
    @NativeType("uint32_t")
    public int memoryBindIndex() { return nmemoryBindIndex(address()); }
    /** the allocated device memory to be bound to the video session’s heap with index {@code memoryBindIndex}. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the start offset of the region of {@code memory} which is to be bound. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** the size in bytes of the region of {@code memory}, starting from {@code memoryOffset} bytes, to be bound. */
    @NativeType("VkDeviceSize")
    public long memorySize() { return nmemorySize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoBindMemoryKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR} value to the {@link #sType} field. */
    public VkVideoBindMemoryKHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoBindMemoryKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryBindIndex} field. */
    public VkVideoBindMemoryKHR memoryBindIndex(@NativeType("uint32_t") int value) { nmemoryBindIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkVideoBindMemoryKHR memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryOffset} field. */
    public VkVideoBindMemoryKHR memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #memorySize} field. */
    public VkVideoBindMemoryKHR memorySize(@NativeType("VkDeviceSize") long value) { nmemorySize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoBindMemoryKHR set(
        int sType,
        long pNext,
        int memoryBindIndex,
        long memory,
        long memoryOffset,
        long memorySize
    ) {
        sType(sType);
        pNext(pNext);
        memoryBindIndex(memoryBindIndex);
        memory(memory);
        memoryOffset(memoryOffset);
        memorySize(memorySize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoBindMemoryKHR set(VkVideoBindMemoryKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoBindMemoryKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoBindMemoryKHR malloc() {
        return wrap(VkVideoBindMemoryKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkVideoBindMemoryKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoBindMemoryKHR calloc() {
        return wrap(VkVideoBindMemoryKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkVideoBindMemoryKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoBindMemoryKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkVideoBindMemoryKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkVideoBindMemoryKHR} instance for the specified memory address. */
    public static VkVideoBindMemoryKHR create(long address) {
        return wrap(VkVideoBindMemoryKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoBindMemoryKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkVideoBindMemoryKHR.class, address);
    }

    /**
     * Returns a new {@link VkVideoBindMemoryKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBindMemoryKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoBindMemoryKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBindMemoryKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoBindMemoryKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoBindMemoryKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkVideoBindMemoryKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoBindMemoryKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoBindMemoryKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkVideoBindMemoryKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoBindMemoryKHR malloc(MemoryStack stack) {
        return wrap(VkVideoBindMemoryKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkVideoBindMemoryKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoBindMemoryKHR calloc(MemoryStack stack) {
        return wrap(VkVideoBindMemoryKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkVideoBindMemoryKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoBindMemoryKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoBindMemoryKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoBindMemoryKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoBindMemoryKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoBindMemoryKHR.PNEXT); }
    /** Unsafe version of {@link #memoryBindIndex}. */
    public static int nmemoryBindIndex(long struct) { return UNSAFE.getInt(null, struct + VkVideoBindMemoryKHR.MEMORYBINDINDEX); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkVideoBindMemoryKHR.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return UNSAFE.getLong(null, struct + VkVideoBindMemoryKHR.MEMORYOFFSET); }
    /** Unsafe version of {@link #memorySize}. */
    public static long nmemorySize(long struct) { return UNSAFE.getLong(null, struct + VkVideoBindMemoryKHR.MEMORYSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBindMemoryKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoBindMemoryKHR.PNEXT, value); }
    /** Unsafe version of {@link #memoryBindIndex(int) memoryBindIndex}. */
    public static void nmemoryBindIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoBindMemoryKHR.MEMORYBINDINDEX, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBindMemoryKHR.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBindMemoryKHR.MEMORYOFFSET, value); }
    /** Unsafe version of {@link #memorySize(long) memorySize}. */
    public static void nmemorySize(long struct, long value) { UNSAFE.putLong(null, struct + VkVideoBindMemoryKHR.MEMORYSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoBindMemoryKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoBindMemoryKHR, Buffer> implements NativeResource {

        private static final VkVideoBindMemoryKHR ELEMENT_FACTORY = VkVideoBindMemoryKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoBindMemoryKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoBindMemoryKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkVideoBindMemoryKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoBindMemoryKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoBindMemoryKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoBindMemoryKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoBindMemoryKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoBindMemoryKHR#memoryBindIndex} field. */
        @NativeType("uint32_t")
        public int memoryBindIndex() { return VkVideoBindMemoryKHR.nmemoryBindIndex(address()); }
        /** @return the value of the {@link VkVideoBindMemoryKHR#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkVideoBindMemoryKHR.nmemory(address()); }
        /** @return the value of the {@link VkVideoBindMemoryKHR#memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkVideoBindMemoryKHR.nmemoryOffset(address()); }
        /** @return the value of the {@link VkVideoBindMemoryKHR#memorySize} field. */
        @NativeType("VkDeviceSize")
        public long memorySize() { return VkVideoBindMemoryKHR.nmemorySize(address()); }

        /** Sets the specified value to the {@link VkVideoBindMemoryKHR#sType} field. */
        public VkVideoBindMemoryKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoBindMemoryKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR} value to the {@link VkVideoBindMemoryKHR#sType} field. */
        public VkVideoBindMemoryKHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_BIND_MEMORY_KHR); }
        /** Sets the specified value to the {@link VkVideoBindMemoryKHR#pNext} field. */
        public VkVideoBindMemoryKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoBindMemoryKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBindMemoryKHR#memoryBindIndex} field. */
        public VkVideoBindMemoryKHR.Buffer memoryBindIndex(@NativeType("uint32_t") int value) { VkVideoBindMemoryKHR.nmemoryBindIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBindMemoryKHR#memory} field. */
        public VkVideoBindMemoryKHR.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkVideoBindMemoryKHR.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBindMemoryKHR#memoryOffset} field. */
        public VkVideoBindMemoryKHR.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkVideoBindMemoryKHR.nmemoryOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoBindMemoryKHR#memorySize} field. */
        public VkVideoBindMemoryKHR.Buffer memorySize(@NativeType("VkDeviceSize") long value) { VkVideoBindMemoryKHR.nmemorySize(address(), value); return this; }

    }

}