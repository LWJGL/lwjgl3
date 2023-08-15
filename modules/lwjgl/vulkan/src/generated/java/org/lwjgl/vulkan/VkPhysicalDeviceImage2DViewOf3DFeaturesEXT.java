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
 * Structure describing whether single-slice 2D views of 3D images can be used in image descriptors.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImage2dViewOf3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImage2DViewOf3DFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #image2DViewOf3D};
 *     VkBool32 {@link #sampler2DViewOf3D};
 * }</code></pre>
 */
public class VkPhysicalDeviceImage2DViewOf3DFeaturesEXT extends Struct<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE2DVIEWOF3D,
        SAMPLER2DVIEWOF3D;

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
        IMAGE2DVIEWOF3D = layout.offsetof(2);
        SAMPLER2DVIEWOF3D = layout.offsetof(3);
    }

    protected VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImage2DViewOf3DFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports using a 2D view of a 3D image in a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} if the image is created using {@link EXTImage2dViewOf3d#VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT}. */
    @NativeType("VkBool32")
    public boolean image2DViewOf3D() { return nimage2DViewOf3D(address()) != 0; }
    /** indicates that the implementation supports using a 2D view of a 3D image in a descriptor of type {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER} if the image is created using {@link EXTImage2dViewOf3d#VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT}. */
    @NativeType("VkBool32")
    public boolean sampler2DViewOf3D() { return nsampler2DViewOf3D(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImage2dViewOf3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sType$Default() { return sType(EXTImage2dViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #image2DViewOf3D} field. */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT image2DViewOf3D(@NativeType("VkBool32") boolean value) { nimage2DViewOf3D(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #sampler2DViewOf3D} field. */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT sampler2DViewOf3D(@NativeType("VkBool32") boolean value) { nsampler2DViewOf3D(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT set(
        int sType,
        long pNext,
        boolean image2DViewOf3D,
        boolean sampler2DViewOf3D
    ) {
        sType(sType);
        pNext(pNext);
        image2DViewOf3D(image2DViewOf3D);
        sampler2DViewOf3D(sampler2DViewOf3D);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT set(VkPhysicalDeviceImage2DViewOf3DFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT malloc() {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT calloc() {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImage2DViewOf3DFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #image2DViewOf3D}. */
    public static int nimage2DViewOf3D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.IMAGE2DVIEWOF3D); }
    /** Unsafe version of {@link #sampler2DViewOf3D}. */
    public static int nsampler2DViewOf3D(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.SAMPLER2DVIEWOF3D); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #image2DViewOf3D(boolean) image2DViewOf3D}. */
    public static void nimage2DViewOf3D(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.IMAGE2DVIEWOF3D, value); }
    /** Unsafe version of {@link #sampler2DViewOf3D(boolean) sampler2DViewOf3D}. */
    public static void nsampler2DViewOf3D(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.SAMPLER2DVIEWOF3D, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImage2DViewOf3DFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImage2DViewOf3DFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImage2DViewOf3DFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#image2DViewOf3D} field. */
        @NativeType("VkBool32")
        public boolean image2DViewOf3D() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nimage2DViewOf3D(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#sampler2DViewOf3D} field. */
        @NativeType("VkBool32")
        public boolean sampler2DViewOf3D() { return VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsampler2DViewOf3D(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#sType} field. */
        public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImage2dViewOf3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT} value to the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#sType} field. */
        public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer sType$Default() { return sType(EXTImage2dViewOf3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_2D_VIEW_OF_3D_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#image2DViewOf3D} field. */
        public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer image2DViewOf3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nimage2DViewOf3D(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImage2DViewOf3DFeaturesEXT#sampler2DViewOf3D} field. */
        public VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.Buffer sampler2DViewOf3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImage2DViewOf3DFeaturesEXT.nsampler2DViewOf3D(address(), value ? 1 : 0); return this; }

    }

}