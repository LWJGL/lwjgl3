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
 * <p>If the {@link VkPhysicalDeviceShaderClockFeaturesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceShaderClockFeaturesKHR} can also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRShaderClock#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code shaderSubgroupClock} &ndash; indicates whether shaders <b>can</b> support {@code Subgroup} scoped clock reads.</li>
 * <li>{@code shaderDeviceClock} &ndash; indicates whether shaders <b>can</b> support {@code Device} scoped clock reads.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderClockFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderSubgroupClock;
 *     VkBool32 shaderDeviceClock;
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code shaderSubgroupClock} field. */
    @NativeType("VkBool32")
    public boolean shaderSubgroupClock() { return nshaderSubgroupClock(address()) != 0; }
    /** Returns the value of the {@code shaderDeviceClock} field. */
    @NativeType("VkBool32")
    public boolean shaderDeviceClock() { return nshaderDeviceClock(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderSubgroupClock} field. */
    public VkPhysicalDeviceShaderClockFeaturesKHR shaderSubgroupClock(@NativeType("VkBool32") boolean value) { nshaderSubgroupClock(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code shaderDeviceClock} field. */
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

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceShaderClockFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceShaderClockFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderClockFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceShaderClockFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderClockFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderClockFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderClockFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderClockFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code shaderSubgroupClock} field. */
        @NativeType("VkBool32")
        public boolean shaderSubgroupClock() { return VkPhysicalDeviceShaderClockFeaturesKHR.nshaderSubgroupClock(address()) != 0; }
        /** Returns the value of the {@code shaderDeviceClock} field. */
        @NativeType("VkBool32")
        public boolean shaderDeviceClock() { return VkPhysicalDeviceShaderClockFeaturesKHR.nshaderDeviceClock(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderClockFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderClockFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderSubgroupClock} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer shaderSubgroupClock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderClockFeaturesKHR.nshaderSubgroupClock(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code shaderDeviceClock} field. */
        public VkPhysicalDeviceShaderClockFeaturesKHR.Buffer shaderDeviceClock(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderClockFeaturesKHR.nshaderDeviceClock(address(), value ? 1 : 0); return this; }

    }

}