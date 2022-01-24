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
 * Structure describing features supported by VK_KHR_shader_clock.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderClockFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderClockFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderClock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderClockFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderSubgroupClock};
 *     VkBool32 {@link #shaderDeviceClock};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderClockFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSUBGROUPCLOCK,
        SHADERDEVICECLOCK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSUBGROUPCLOCK = layout.offsetof(2);
        SHADERDEVICECLOCK = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderClockFeaturesKHR(ByteBuffer container) {
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
    /** indicates whether shaders <b>can</b> perform {@code Subgroup} scoped clock reads. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupClock() { return nshaderSubgroupClock(address()) != 0; }
    /** indicates whether shaders <b>can</b> perform {@code Device} scoped clock reads. */
    @NativeType("VkBool32")
    public boolean shaderDeviceClock() { return nshaderDeviceClock(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRShaderClock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR sType$Default() { return sType(KHRShaderClock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderSubgroupClock} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClock(@NativeType("VkBool32") boolean value) { nshaderSubgroupClock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderDeviceClock} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderDeviceClock(@NativeType("VkBool32") boolean value) { nshaderDeviceClock(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderClockFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderSubgroupClock,
        boolean shaderDeviceClock
    ) {
        sType(sType);
        pNext(pNext);
        shaderSubgroupClock(shaderSubgroupClock);
        shaderDeviceClock(shaderDeviceClock);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderClockFeaturesKHR set(VkPhysicalDeviceShaderClockFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderClockFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderClockFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderClockFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderClockFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderClockFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderClockFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderClockFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderSubgroupClock}. */
    public static int nshaderSubgroupClock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderClockFeaturesKHR.SHADERSUBGROUPCLOCK); }
    /** Unsafe version of {@link #shaderDeviceClock}. */
    public static int nshaderDeviceClock(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderClockFeaturesKHR.SHADERDEVICECLOCK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderClockFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderClockFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderSubgroupClock(boolean) shaderSubgroupClock}. */
    public static void nshaderSubgroupClock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderClockFeaturesKHR.SHADERSUBGROUPCLOCK, value); }
    /** Unsafe version of {@link #shaderDeviceClock(boolean) shaderDeviceClock}. */
    public static void nshaderDeviceClock(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderClockFeaturesKHR.SHADERDEVICECLOCK, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderClockFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderClockFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderClockFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceShaderClockFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderClockFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceShaderClockFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderClockFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderClockFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderClockFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderClockFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderClockFeaturesKHR#shaderSubgroupClock} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupClock() { return VkPhysicalDeviceShaderClockFeaturesKHR.nshaderSubgroupClock(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderClockFeaturesKHR#shaderDeviceClock} field. */
        @NativeType("VkBool32")
        public boolean shaderDeviceClock() { return VkPhysicalDeviceShaderClockFeaturesKHR.nshaderDeviceClock(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderClockFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRShaderClock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR} value to the {@link VkPhysicalDeviceShaderClockFeaturesKHR#sType} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer sType$Default() { return sType(KHRShaderClock.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderClockFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderClockFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderClockFeaturesKHR#shaderSubgroupClock} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer shaderSubgroupClock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderClockFeaturesKHR.nshaderSubgroupClock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderClockFeaturesKHR#shaderDeviceClock} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer shaderDeviceClock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderClockFeaturesKHR.nshaderDeviceClock(address(), value ? 1 : 0); return this; }

    }

}