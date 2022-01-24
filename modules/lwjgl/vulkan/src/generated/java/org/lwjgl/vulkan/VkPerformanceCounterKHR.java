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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure providing information about a counter.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPerformanceQuery#vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceCounterKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkPerformanceCounterUnitKHR {@link #unit};
 *     VkPerformanceCounterScopeKHR {@link #scope};
 *     VkPerformanceCounterStorageKHR {@link #storage};
 *     uint8_t {@link #uuid}[VK_UUID_SIZE];
 * }</code></pre>
 */
public class VkPerformanceCounterKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        UNIT,
        SCOPE,
        STORAGE,
        UUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_UUID_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        UNIT = layout.offsetof(2);
        SCOPE = layout.offsetof(3);
        STORAGE = layout.offsetof(4);
        UUID = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPerformanceCounterKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceCounterKHR(ByteBuffer container) {
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
    /** a {@code VkPerformanceCounterUnitKHR} specifying the unit that the counter data will record. */
    @NativeType("VkPerformanceCounterUnitKHR")
    public int unit() { return nunit(address()); }
    /** a {@code VkPerformanceCounterScopeKHR} specifying the scope that the counter belongs to. */
    @NativeType("VkPerformanceCounterScopeKHR")
    public int scope() { return nscope(address()); }
    /** a {@code VkPerformanceCounterStorageKHR} specifying the storage type that the counter’s data uses. */
    @NativeType("VkPerformanceCounterStorageKHR")
    public int storage() { return nstorage(address()); }
    /** an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the counter of the physical device. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer uuid() { return nuuid(address()); }
    /** an array of size {@link VK10#VK_UUID_SIZE UUID_SIZE}, containing 8-bit values that represent a universally unique identifier for the counter of the physical device. */
    @NativeType("uint8_t")
    public byte uuid(int index) { return nuuid(address(), index); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPerformanceCounterKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR} value to the {@link #sType} field. */
    public VkPerformanceCounterKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPerformanceCounterKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceCounterKHR set(
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
    public VkPerformanceCounterKHR set(VkPerformanceCounterKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceCounterKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterKHR malloc() {
        return wrap(VkPerformanceCounterKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceCounterKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterKHR calloc() {
        return wrap(VkPerformanceCounterKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceCounterKHR} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceCounterKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceCounterKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceCounterKHR} instance for the specified memory address. */
    public static VkPerformanceCounterKHR create(long address) {
        return wrap(VkPerformanceCounterKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceCounterKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceCounterKHR.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceCounterKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceCounterKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceCounterKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPerformanceCounterKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterKHR malloc(MemoryStack stack) {
        return wrap(VkPerformanceCounterKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceCounterKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterKHR calloc(MemoryStack stack) {
        return wrap(VkPerformanceCounterKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceCounterKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceCounterKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceCounterKHR.PNEXT); }
    /** Unsafe version of {@link #unit}. */
    public static int nunit(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceCounterKHR.UNIT); }
    /** Unsafe version of {@link #scope}. */
    public static int nscope(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceCounterKHR.SCOPE); }
    /** Unsafe version of {@link #storage}. */
    public static int nstorage(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceCounterKHR.STORAGE); }
    /** Unsafe version of {@link #uuid}. */
    public static ByteBuffer nuuid(long struct) { return memByteBuffer(struct + VkPerformanceCounterKHR.UUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #uuid(int) uuid}. */
    public static byte nuuid(long struct, int index) {
        return UNSAFE.getByte(null, struct + VkPerformanceCounterKHR.UUID + check(index, VK_UUID_SIZE) * 1);
    }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceCounterKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceCounterKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceCounterKHR} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceCounterKHR, Buffer> implements NativeResource {

        private static final VkPerformanceCounterKHR ELEMENT_FACTORY = VkPerformanceCounterKHR.create(-1L);

        /**
         * Creates a new {@code VkPerformanceCounterKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceCounterKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceCounterKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceCounterKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceCounterKHR.nsType(address()); }
        /** @return the value of the {@link VkPerformanceCounterKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPerformanceCounterKHR.npNext(address()); }
        /** @return the value of the {@link VkPerformanceCounterKHR#unit} field. */
        @NativeType("VkPerformanceCounterUnitKHR")
        public int unit() { return VkPerformanceCounterKHR.nunit(address()); }
        /** @return the value of the {@link VkPerformanceCounterKHR#scope} field. */
        @NativeType("VkPerformanceCounterScopeKHR")
        public int scope() { return VkPerformanceCounterKHR.nscope(address()); }
        /** @return the value of the {@link VkPerformanceCounterKHR#storage} field. */
        @NativeType("VkPerformanceCounterStorageKHR")
        public int storage() { return VkPerformanceCounterKHR.nstorage(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPerformanceCounterKHR#uuid} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer uuid() { return VkPerformanceCounterKHR.nuuid(address()); }
        /** @return the value at the specified index of the {@link VkPerformanceCounterKHR#uuid} field. */
        @NativeType("uint8_t")
        public byte uuid(int index) { return VkPerformanceCounterKHR.nuuid(address(), index); }

        /** Sets the specified value to the {@link VkPerformanceCounterKHR#sType} field. */
        public VkPerformanceCounterKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceCounterKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR} value to the {@link VkPerformanceCounterKHR#sType} field. */
        public VkPerformanceCounterKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR); }
        /** Sets the specified value to the {@link VkPerformanceCounterKHR#pNext} field. */
        public VkPerformanceCounterKHR.Buffer pNext(@NativeType("void *") long value) { VkPerformanceCounterKHR.npNext(address(), value); return this; }

    }

}