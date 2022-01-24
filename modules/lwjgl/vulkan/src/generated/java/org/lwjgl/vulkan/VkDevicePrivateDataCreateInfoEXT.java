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
 * Reserve private data slots.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTPrivateData#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDevicePrivateDataCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #privateDataSlotRequestCount};
 * }</code></pre>
 */
public class VkDevicePrivateDataCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIVATEDATASLOTREQUESTCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIVATEDATASLOTREQUESTCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkDevicePrivateDataCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDevicePrivateDataCreateInfoEXT(ByteBuffer container) {
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
    /** the amount of slots to reserve. */
    @NativeType("uint32_t")
    public int privateDataSlotRequestCount() { return nprivateDataSlotRequestCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkDevicePrivateDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTPrivateData#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkDevicePrivateDataCreateInfoEXT sType$Default() { return sType(EXTPrivateData.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDevicePrivateDataCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #privateDataSlotRequestCount} field. */
    public VkDevicePrivateDataCreateInfoEXT privateDataSlotRequestCount(@NativeType("uint32_t") int value) { nprivateDataSlotRequestCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDevicePrivateDataCreateInfoEXT set(
        int sType,
        long pNext,
        int privateDataSlotRequestCount
    ) {
        sType(sType);
        pNext(pNext);
        privateDataSlotRequestCount(privateDataSlotRequestCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDevicePrivateDataCreateInfoEXT set(VkDevicePrivateDataCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfoEXT malloc() {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfoEXT calloc() {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDevicePrivateDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance for the specified memory address. */
    public static VkDevicePrivateDataCreateInfoEXT create(long address) {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDevicePrivateDataCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkDevicePrivateDataCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDevicePrivateDataCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkDevicePrivateDataCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDevicePrivateDataCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDevicePrivateDataCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #privateDataSlotRequestCount}. */
    public static int nprivateDataSlotRequestCount(long struct) { return UNSAFE.getInt(null, struct + VkDevicePrivateDataCreateInfoEXT.PRIVATEDATASLOTREQUESTCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDevicePrivateDataCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDevicePrivateDataCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #privateDataSlotRequestCount(int) privateDataSlotRequestCount}. */
    public static void nprivateDataSlotRequestCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDevicePrivateDataCreateInfoEXT.PRIVATEDATASLOTREQUESTCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDevicePrivateDataCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDevicePrivateDataCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkDevicePrivateDataCreateInfoEXT ELEMENT_FACTORY = VkDevicePrivateDataCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkDevicePrivateDataCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDevicePrivateDataCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDevicePrivateDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDevicePrivateDataCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDevicePrivateDataCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkDevicePrivateDataCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDevicePrivateDataCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkDevicePrivateDataCreateInfoEXT#privateDataSlotRequestCount} field. */
        @NativeType("uint32_t")
        public int privateDataSlotRequestCount() { return VkDevicePrivateDataCreateInfoEXT.nprivateDataSlotRequestCount(address()); }

        /** Sets the specified value to the {@link VkDevicePrivateDataCreateInfoEXT#sType} field. */
        public VkDevicePrivateDataCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDevicePrivateDataCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTPrivateData#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT} value to the {@link VkDevicePrivateDataCreateInfoEXT#sType} field. */
        public VkDevicePrivateDataCreateInfoEXT.Buffer sType$Default() { return sType(EXTPrivateData.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkDevicePrivateDataCreateInfoEXT#pNext} field. */
        public VkDevicePrivateDataCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDevicePrivateDataCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDevicePrivateDataCreateInfoEXT#privateDataSlotRequestCount} field. */
        public VkDevicePrivateDataCreateInfoEXT.Buffer privateDataSlotRequestCount(@NativeType("uint32_t") int value) { VkDevicePrivateDataCreateInfoEXT.nprivateDataSlotRequestCount(address(), value); return this; }

    }

}