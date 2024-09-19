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
 * Structure describing whether VK_AMD_anti_lag can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceAntiLagFeaturesAMD} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceAntiLagFeaturesAMD} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDAntiLag#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceAntiLagFeaturesAMD {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #antiLag};
 * }</code></pre>
 */
public class VkPhysicalDeviceAntiLagFeaturesAMD extends Struct<VkPhysicalDeviceAntiLagFeaturesAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ANTILAG;

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
        ANTILAG = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAntiLagFeaturesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceAntiLagFeaturesAMD create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceAntiLagFeaturesAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports AMD Radeon™ Anti-Lag functionality. The {@code antiLag} feature only supports a single GPU and <b>must</b> not be enabled if {@link VkDeviceGroupDeviceCreateInfo}{@code ::physicalDeviceCount} is greater than 1. */
    @NativeType("VkBool32")
    public boolean antiLag() { return nantiLag(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceAntiLagFeaturesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDAntiLag#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD} value to the {@link #sType} field. */
    public VkPhysicalDeviceAntiLagFeaturesAMD sType$Default() { return sType(AMDAntiLag.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceAntiLagFeaturesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #antiLag} field. */
    public VkPhysicalDeviceAntiLagFeaturesAMD antiLag(@NativeType("VkBool32") boolean value) { nantiLag(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceAntiLagFeaturesAMD set(
        int sType,
        long pNext,
        boolean antiLag
    ) {
        sType(sType);
        pNext(pNext);
        antiLag(antiLag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceAntiLagFeaturesAMD set(VkPhysicalDeviceAntiLagFeaturesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAntiLagFeaturesAMD malloc() {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceAntiLagFeaturesAMD calloc() {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceAntiLagFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAntiLagFeaturesAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance for the specified memory address. */
    public static VkPhysicalDeviceAntiLagFeaturesAMD create(long address) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAntiLagFeaturesAMD createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceAntiLagFeaturesAMD(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceAntiLagFeaturesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAntiLagFeaturesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceAntiLagFeaturesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAntiLagFeaturesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceAntiLagFeaturesAMD.PNEXT); }
    /** Unsafe version of {@link #antiLag}. */
    public static int nantiLag(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceAntiLagFeaturesAMD.ANTILAG); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAntiLagFeaturesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceAntiLagFeaturesAMD.PNEXT, value); }
    /** Unsafe version of {@link #antiLag(boolean) antiLag}. */
    public static void nantiLag(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceAntiLagFeaturesAMD.ANTILAG, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceAntiLagFeaturesAMD} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAntiLagFeaturesAMD, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceAntiLagFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceAntiLagFeaturesAMD.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceAntiLagFeaturesAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceAntiLagFeaturesAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceAntiLagFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceAntiLagFeaturesAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceAntiLagFeaturesAMD.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAntiLagFeaturesAMD#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceAntiLagFeaturesAMD.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceAntiLagFeaturesAMD#antiLag} field. */
        @NativeType("VkBool32")
        public boolean antiLag() { return VkPhysicalDeviceAntiLagFeaturesAMD.nantiLag(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceAntiLagFeaturesAMD#sType} field. */
        public VkPhysicalDeviceAntiLagFeaturesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceAntiLagFeaturesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDAntiLag#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD} value to the {@link VkPhysicalDeviceAntiLagFeaturesAMD#sType} field. */
        public VkPhysicalDeviceAntiLagFeaturesAMD.Buffer sType$Default() { return sType(AMDAntiLag.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ANTI_LAG_FEATURES_AMD); }
        /** Sets the specified value to the {@link VkPhysicalDeviceAntiLagFeaturesAMD#pNext} field. */
        public VkPhysicalDeviceAntiLagFeaturesAMD.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceAntiLagFeaturesAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceAntiLagFeaturesAMD#antiLag} field. */
        public VkPhysicalDeviceAntiLagFeaturesAMD.Buffer antiLag(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceAntiLagFeaturesAMD.nantiLag(address(), value ? 1 : 0); return this; }

    }

}