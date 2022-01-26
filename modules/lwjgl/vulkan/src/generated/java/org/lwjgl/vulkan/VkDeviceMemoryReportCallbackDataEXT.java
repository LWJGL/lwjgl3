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
 * Structure specifying parameters returned to the callback.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code memoryObjectId} is used to avoid double-counting on the same memory object.</p>
 * 
 * <p>If an internally-allocated device memory object or a {@code VkDeviceMemory} <b>cannot</b> be exported, {@code memoryObjectId} <b>must</b> be unique in the {@code VkDevice}.</p>
 * 
 * <p>If an internally-allocated device memory object or a {@code VkDeviceMemory} supports being exported, {@code memoryObjectId} <b>must</b> be unique system wide.</p>
 * 
 * <p>If an internal device memory object or a {@code VkDeviceMemory} is backed by an imported external memory object, {@code memoryObjectId} <b>must</b> be unique system wide.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This structure should only be considered valid during the lifetime of the triggered callback.</p>
 * 
 * <p>For {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT} and {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT} events, {@code objectHandle} usually will not yet exist when the application or tool receives the callback. {@code objectHandle} will only exist when the create or allocate call that triggered the event returns, and if the allocation or import ends up failing {@code objectHandle} will not ever exist.</p>
 * </div>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDeviceMemoryReportCallbackDataEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkDeviceMemoryReportFlagsEXT {@link #flags};
 *     VkDeviceMemoryReportEventTypeEXT {@link #type};
 *     uint64_t {@link #memoryObjectId};
 *     VkDeviceSize {@link #size};
 *     VkObjectType {@link #objectType};
 *     uint64_t {@link #objectHandle};
 *     uint32_t {@link #heapIndex};
 * }</code></pre>
 */
public class VkDeviceMemoryReportCallbackDataEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TYPE,
        MEMORYOBJECTID,
        SIZE,
        OBJECTTYPE,
        OBJECTHANDLE,
        HEAPINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TYPE = layout.offsetof(3);
        MEMORYOBJECTID = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        OBJECTTYPE = layout.offsetof(6);
        OBJECTHANDLE = layout.offsetof(7);
        HEAPINDEX = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkDeviceMemoryReportCallbackDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceMemoryReportCallbackDataEXT(ByteBuffer container) {
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
    /** 0 and reserved for future use. */
    @NativeType("VkDeviceMemoryReportFlagsEXT")
    public int flags() { return nflags(address()); }
    /** a {@code VkDeviceMemoryReportEventTypeEXT} type specifying the type of event reported in this {@link VkDeviceMemoryReportCallbackDataEXT} structure. */
    @NativeType("VkDeviceMemoryReportEventTypeEXT")
    public int type() { return ntype(address()); }
    /** the unique id for the underlying memory object as described below. */
    @NativeType("uint64_t")
    public long memoryObjectId() { return nmemoryObjectId(address()); }
    /** the size of the memory object in bytes. If {@code type} is {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT}, {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT} or {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT}, {@code size} is a valid {@code VkDeviceSize} value. Otherwise, {@code size} is undefined. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** a {@code VkObjectType} value specifying the type of the object associated with this device memory report event. If {@code type} is {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT}, {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT}, {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT}, {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT} or {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT}, {@code objectType} is a valid {@code VkObjectType} enum. Otherwise, {@code objectType} is undefined. */
    @NativeType("VkObjectType")
    public int objectType() { return nobjectType(address()); }
    /** the object this device memory report event is attributed to. If {@code type} is {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT}, {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT}, {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT} or {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT}, {@code objectHandle} is a valid Vulkan handle of the type associated with {@code objectType} as defined in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#debugging-object-types">{@code VkObjectType} and Vulkan Handle Relationship</a> table. Otherwise, {@code objectHandle} is undefined. */
    @NativeType("uint64_t")
    public long objectHandle() { return nobjectHandle(address()); }
    /** describes which memory heap this device memory allocation is made from. If {@code type} is {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT} or {@link EXTDeviceMemoryReport#VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT}, {@code heapIndex} corresponds to one of the valid heaps from the {@link VkPhysicalDeviceMemoryProperties} structure. Otherwise, {@code heapIndex} is undefined. */
    @NativeType("uint32_t")
    public int heapIndex() { return nheapIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDeviceMemoryReportCallbackDataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT} value to the {@link #sType} field. */
    public VkDeviceMemoryReportCallbackDataEXT sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDeviceMemoryReportCallbackDataEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceMemoryReportCallbackDataEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceMemoryReportCallbackDataEXT set(VkDeviceMemoryReportCallbackDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryReportCallbackDataEXT malloc() {
        return wrap(VkDeviceMemoryReportCallbackDataEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceMemoryReportCallbackDataEXT calloc() {
        return wrap(VkDeviceMemoryReportCallbackDataEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceMemoryReportCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDeviceMemoryReportCallbackDataEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance for the specified memory address. */
    public static VkDeviceMemoryReportCallbackDataEXT create(long address) {
        return wrap(VkDeviceMemoryReportCallbackDataEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryReportCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDeviceMemoryReportCallbackDataEXT.class, address);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryReportCallbackDataEXT malloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryReportCallbackDataEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDeviceMemoryReportCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceMemoryReportCallbackDataEXT calloc(MemoryStack stack) {
        return wrap(VkDeviceMemoryReportCallbackDataEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceMemoryReportCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceMemoryReportCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryReportCallbackDataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceMemoryReportCallbackDataEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryReportCallbackDataEXT.FLAGS); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryReportCallbackDataEXT.TYPE); }
    /** Unsafe version of {@link #memoryObjectId}. */
    public static long nmemoryObjectId(long struct) { return UNSAFE.getLong(null, struct + VkDeviceMemoryReportCallbackDataEXT.MEMORYOBJECTID); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return UNSAFE.getLong(null, struct + VkDeviceMemoryReportCallbackDataEXT.SIZE); }
    /** Unsafe version of {@link #objectType}. */
    public static int nobjectType(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryReportCallbackDataEXT.OBJECTTYPE); }
    /** Unsafe version of {@link #objectHandle}. */
    public static long nobjectHandle(long struct) { return UNSAFE.getLong(null, struct + VkDeviceMemoryReportCallbackDataEXT.OBJECTHANDLE); }
    /** Unsafe version of {@link #heapIndex}. */
    public static int nheapIndex(long struct) { return UNSAFE.getInt(null, struct + VkDeviceMemoryReportCallbackDataEXT.HEAPINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDeviceMemoryReportCallbackDataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceMemoryReportCallbackDataEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceMemoryReportCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceMemoryReportCallbackDataEXT, Buffer> implements NativeResource {

        private static final VkDeviceMemoryReportCallbackDataEXT ELEMENT_FACTORY = VkDeviceMemoryReportCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceMemoryReportCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceMemoryReportCallbackDataEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDeviceMemoryReportCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceMemoryReportCallbackDataEXT.nsType(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceMemoryReportCallbackDataEXT.npNext(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#flags} field. */
        @NativeType("VkDeviceMemoryReportFlagsEXT")
        public int flags() { return VkDeviceMemoryReportCallbackDataEXT.nflags(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#type} field. */
        @NativeType("VkDeviceMemoryReportEventTypeEXT")
        public int type() { return VkDeviceMemoryReportCallbackDataEXT.ntype(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#memoryObjectId} field. */
        @NativeType("uint64_t")
        public long memoryObjectId() { return VkDeviceMemoryReportCallbackDataEXT.nmemoryObjectId(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkDeviceMemoryReportCallbackDataEXT.nsize(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#objectType} field. */
        @NativeType("VkObjectType")
        public int objectType() { return VkDeviceMemoryReportCallbackDataEXT.nobjectType(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#objectHandle} field. */
        @NativeType("uint64_t")
        public long objectHandle() { return VkDeviceMemoryReportCallbackDataEXT.nobjectHandle(address()); }
        /** @return the value of the {@link VkDeviceMemoryReportCallbackDataEXT#heapIndex} field. */
        @NativeType("uint32_t")
        public int heapIndex() { return VkDeviceMemoryReportCallbackDataEXT.nheapIndex(address()); }

        /** Sets the specified value to the {@link VkDeviceMemoryReportCallbackDataEXT#sType} field. */
        public VkDeviceMemoryReportCallbackDataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceMemoryReportCallbackDataEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceMemoryReport#VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT} value to the {@link VkDeviceMemoryReportCallbackDataEXT#sType} field. */
        public VkDeviceMemoryReportCallbackDataEXT.Buffer sType$Default() { return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@link VkDeviceMemoryReportCallbackDataEXT#pNext} field. */
        public VkDeviceMemoryReportCallbackDataEXT.Buffer pNext(@NativeType("void *") long value) { VkDeviceMemoryReportCallbackDataEXT.npNext(address(), value); return this; }

    }

}