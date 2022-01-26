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
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDevicePrivateDataCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #privateDataSlotRequestCount};
 * }</code></pre>
 */
public class VkDevicePrivateDataCreateInfo extends Struct implements NativeResource {

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
     * Creates a {@code VkDevicePrivateDataCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDevicePrivateDataCreateInfo(ByteBuffer container) {
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
    public VkDevicePrivateDataCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO} value to the {@link #sType} field. */
    public VkDevicePrivateDataCreateInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkDevicePrivateDataCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #privateDataSlotRequestCount} field. */
    public VkDevicePrivateDataCreateInfo privateDataSlotRequestCount(@NativeType("uint32_t") int value) { nprivateDataSlotRequestCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDevicePrivateDataCreateInfo set(
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
    public VkDevicePrivateDataCreateInfo set(VkDevicePrivateDataCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDevicePrivateDataCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfo malloc() {
        return wrap(VkDevicePrivateDataCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDevicePrivateDataCreateInfo calloc() {
        return wrap(VkDevicePrivateDataCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkDevicePrivateDataCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkDevicePrivateDataCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkDevicePrivateDataCreateInfo} instance for the specified memory address. */
    public static VkDevicePrivateDataCreateInfo create(long address) {
        return wrap(VkDevicePrivateDataCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDevicePrivateDataCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkDevicePrivateDataCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkDevicePrivateDataCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDevicePrivateDataCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfo malloc(MemoryStack stack) {
        return wrap(VkDevicePrivateDataCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkDevicePrivateDataCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDevicePrivateDataCreateInfo calloc(MemoryStack stack) {
        return wrap(VkDevicePrivateDataCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDevicePrivateDataCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDevicePrivateDataCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkDevicePrivateDataCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDevicePrivateDataCreateInfo.PNEXT); }
    /** Unsafe version of {@link #privateDataSlotRequestCount}. */
    public static int nprivateDataSlotRequestCount(long struct) { return UNSAFE.getInt(null, struct + VkDevicePrivateDataCreateInfo.PRIVATEDATASLOTREQUESTCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkDevicePrivateDataCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDevicePrivateDataCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #privateDataSlotRequestCount(int) privateDataSlotRequestCount}. */
    public static void nprivateDataSlotRequestCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDevicePrivateDataCreateInfo.PRIVATEDATASLOTREQUESTCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDevicePrivateDataCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkDevicePrivateDataCreateInfo, Buffer> implements NativeResource {

        private static final VkDevicePrivateDataCreateInfo ELEMENT_FACTORY = VkDevicePrivateDataCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkDevicePrivateDataCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDevicePrivateDataCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkDevicePrivateDataCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDevicePrivateDataCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDevicePrivateDataCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkDevicePrivateDataCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDevicePrivateDataCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkDevicePrivateDataCreateInfo#privateDataSlotRequestCount} field. */
        @NativeType("uint32_t")
        public int privateDataSlotRequestCount() { return VkDevicePrivateDataCreateInfo.nprivateDataSlotRequestCount(address()); }

        /** Sets the specified value to the {@link VkDevicePrivateDataCreateInfo#sType} field. */
        public VkDevicePrivateDataCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkDevicePrivateDataCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO} value to the {@link VkDevicePrivateDataCreateInfo#sType} field. */
        public VkDevicePrivateDataCreateInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO); }
        /** Sets the specified value to the {@link VkDevicePrivateDataCreateInfo#pNext} field. */
        public VkDevicePrivateDataCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkDevicePrivateDataCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkDevicePrivateDataCreateInfo#privateDataSlotRequestCount} field. */
        public VkDevicePrivateDataCreateInfo.Buffer privateDataSlotRequestCount(@NativeType("uint32_t") int value) { VkDevicePrivateDataCreateInfo.nprivateDataSlotRequestCount(address(), value); return this; }

    }

}