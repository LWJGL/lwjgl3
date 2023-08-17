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
 * Structure describing feature to control zero to one depth clamping.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDepthClampZeroOne#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDepthClampZeroOneFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #depthClampZeroOne};
 * }</code></pre>
 */
public class VkPhysicalDeviceDepthClampZeroOneFeaturesEXT extends Struct<VkPhysicalDeviceDepthClampZeroOneFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLAMPZEROONE;

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
        DEPTHCLAMPZEROONE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDepthClampZeroOneFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports clamping the depth to a range of 0 to 1. */
    @NativeType("VkBool32")
    public boolean depthClampZeroOne() { return ndepthClampZeroOne(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClampZeroOne#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT sType$Default() { return sType(EXTDepthClampZeroOne.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #depthClampZeroOne} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT depthClampZeroOne(@NativeType("VkBool32") boolean value) { ndepthClampZeroOne(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT set(
        int sType,
        long pNext,
        boolean depthClampZeroOne
    ) {
        sType(sType);
        pNext(pNext);
        depthClampZeroOne(depthClampZeroOne);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT set(VkPhysicalDeviceDepthClampZeroOneFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT malloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT calloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #depthClampZeroOne}. */
    public static int ndepthClampZeroOne(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.DEPTHCLAMPZEROONE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthClampZeroOne(boolean) depthClampZeroOne}. */
    public static void ndepthClampZeroOne(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.DEPTHCLAMPZEROONE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthClampZeroOneFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthClampZeroOneFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDepthClampZeroOneFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#depthClampZeroOne} field. */
        @NativeType("VkBool32")
        public boolean depthClampZeroOne() { return VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.ndepthClampZeroOne(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClampZeroOne#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT} value to the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#sType} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer sType$Default() { return sType(EXTDepthClampZeroOne.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceDepthClampZeroOneFeaturesEXT#depthClampZeroOne} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.Buffer depthClampZeroOne(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthClampZeroOneFeaturesEXT.ndepthClampZeroOne(address(), value ? 1 : 0); return this; }

    }

}