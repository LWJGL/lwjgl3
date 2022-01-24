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
 * Structure describing whether queries can be reset from the host.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceHostQueryResetFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceHostQueryResetFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceHostQueryResetFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #hostQueryReset};
 * }</code></pre>
 */
public class VkPhysicalDeviceHostQueryResetFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HOSTQUERYRESET;

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
        HOSTQUERYRESET = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHostQueryResetFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHostQueryResetFeatures(ByteBuffer container) {
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
    /** indicates that the implementation supports resetting queries from the host with {@link VK12#vkResetQueryPool ResetQueryPool}. */
    @NativeType("VkBool32")
    public boolean hostQueryReset() { return nhostQueryReset(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceHostQueryResetFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceHostQueryResetFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceHostQueryResetFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #hostQueryReset} field. */
    public VkPhysicalDeviceHostQueryResetFeatures hostQueryReset(@NativeType("VkBool32") boolean value) { nhostQueryReset(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceHostQueryResetFeatures set(
        int sType,
        long pNext,
        boolean hostQueryReset
    ) {
        sType(sType);
        pNext(pNext);
        hostQueryReset(hostQueryReset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHostQueryResetFeatures set(VkPhysicalDeviceHostQueryResetFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostQueryResetFeatures malloc() {
        return wrap(VkPhysicalDeviceHostQueryResetFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostQueryResetFeatures calloc() {
        return wrap(VkPhysicalDeviceHostQueryResetFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHostQueryResetFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceHostQueryResetFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceHostQueryResetFeatures create(long address) {
        return wrap(VkPhysicalDeviceHostQueryResetFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceHostQueryResetFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceHostQueryResetFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostQueryResetFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceHostQueryResetFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostQueryResetFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceHostQueryResetFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostQueryResetFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceHostQueryResetFeatures.PNEXT); }
    /** Unsafe version of {@link #hostQueryReset}. */
    public static int nhostQueryReset(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostQueryResetFeatures.HOSTQUERYRESET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostQueryResetFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceHostQueryResetFeatures.PNEXT, value); }
    /** Unsafe version of {@link #hostQueryReset(boolean) hostQueryReset}. */
    public static void nhostQueryReset(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostQueryResetFeatures.HOSTQUERYRESET, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHostQueryResetFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostQueryResetFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceHostQueryResetFeatures ELEMENT_FACTORY = VkPhysicalDeviceHostQueryResetFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHostQueryResetFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceHostQueryResetFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceHostQueryResetFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceHostQueryResetFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostQueryResetFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceHostQueryResetFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostQueryResetFeatures#hostQueryReset} field. */
        @NativeType("VkBool32")
        public boolean hostQueryReset() { return VkPhysicalDeviceHostQueryResetFeatures.nhostQueryReset(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceHostQueryResetFeatures#sType} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHostQueryResetFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES} value to the {@link VkPhysicalDeviceHostQueryResetFeatures#sType} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostQueryResetFeatures#pNext} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHostQueryResetFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostQueryResetFeatures#hostQueryReset} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer hostQueryReset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHostQueryResetFeatures.nhostQueryReset(address(), value ? 1 : 0); return this; }

    }

}