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
 * Structure describing the frame boundary features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFrameBoundaryFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #frameBoundary};
 * }</code></pre>
 */
public class VkPhysicalDeviceFrameBoundaryFeaturesEXT extends Struct<VkPhysicalDeviceFrameBoundaryFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAMEBOUNDARY;

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
        FRAMEBOUNDARY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceFrameBoundaryFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFrameBoundaryFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT(ByteBuffer container) {
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
    /** indicates whether the implementation supports frame boundary information. */
    @NativeType("VkBool32")
    public boolean frameBoundary() { return nframeBoundary(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT sType$Default() { return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #frameBoundary} field. */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT frameBoundary(@NativeType("VkBool32") boolean value) { nframeBoundary(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT set(
        int sType,
        long pNext,
        boolean frameBoundary
    ) {
        sType(sType);
        pNext(pNext);
        frameBoundary(frameBoundary);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFrameBoundaryFeaturesEXT set(VkPhysicalDeviceFrameBoundaryFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT malloc() {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT calloc() {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT create(long address) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFrameBoundaryFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFrameBoundaryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFrameBoundaryFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFrameBoundaryFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #frameBoundary}. */
    public static int nframeBoundary(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFrameBoundaryFeaturesEXT.FRAMEBOUNDARY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFrameBoundaryFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFrameBoundaryFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #frameBoundary(boolean) frameBoundary}. */
    public static void nframeBoundary(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFrameBoundaryFeaturesEXT.FRAMEBOUNDARY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFrameBoundaryFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFrameBoundaryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceFrameBoundaryFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceFrameBoundaryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFrameBoundaryFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFrameBoundaryFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#frameBoundary} field. */
        @NativeType("VkBool32")
        public boolean frameBoundary() { return VkPhysicalDeviceFrameBoundaryFeaturesEXT.nframeBoundary(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#sType} field. */
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFrameBoundaryFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT} value to the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#sType} field. */
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer sType$Default() { return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAME_BOUNDARY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFrameBoundaryFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFrameBoundaryFeaturesEXT#frameBoundary} field. */
        public VkPhysicalDeviceFrameBoundaryFeaturesEXT.Buffer frameBoundary(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFrameBoundaryFeaturesEXT.nframeBoundary(address(), value ? 1 : 0); return this; }

    }

}