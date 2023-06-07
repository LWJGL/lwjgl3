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
 * Structure describing whether slice-based views of 3D images can be used in storage image descriptors.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageSlicedViewOf3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #imageSlicedViewOf3D};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT extends Struct<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGESLICEDVIEWOF3D;

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
        IMAGESLICEDVIEWOF3D = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports using a sliced view of a 3D image in a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} by using a {@link VkImageViewSlicedCreateInfoEXT} structure when creating the view. */
    @NativeType("VkBool32")
    public boolean imageSlicedViewOf3D() { return nimageSlicedViewOf3D(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageSlicedViewOf3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType$Default() { return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #imageSlicedViewOf3D} field. */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3D(@NativeType("VkBool32") boolean value) { nimageSlicedViewOf3D(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT set(
        int sType,
        long pNext,
        boolean imageSlicedViewOf3D
    ) {
        sType(sType);
        pNext(pNext);
        imageSlicedViewOf3D(imageSlicedViewOf3D);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT set(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #imageSlicedViewOf3D}. */
    public static int nimageSlicedViewOf3D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.IMAGESLICEDVIEWOF3D); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageSlicedViewOf3D(boolean) imageSlicedViewOf3D}. */
    public static void nimageSlicedViewOf3D(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.IMAGESLICEDVIEWOF3D, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT#imageSlicedViewOf3D} field. */
        @NativeType("VkBool32")
        public boolean imageSlicedViewOf3D() { return VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nimageSlicedViewOf3D(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageSlicedViewOf3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer sType$Default() { return sType(EXTImageSlicedViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_SLICED_VIEW_OF_3D_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT#imageSlicedViewOf3D} field. */
        public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.Buffer imageSlicedViewOf3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT.nimageSlicedViewOf3D(address(), value ? 1 : 0); return this; }

    }

}