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
 * Structure indicating support for copies to or from images from host memory.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceHostImageCopyFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #hostImageCopy};
 * }</code></pre>
 */
public class VkPhysicalDeviceHostImageCopyFeaturesEXT extends Struct<VkPhysicalDeviceHostImageCopyFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HOSTIMAGECOPY;

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
        HOSTIMAGECOPY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceHostImageCopyFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceHostImageCopyFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports copying from host memory to images using the {@link EXTHostImageCopy#vkCopyMemoryToImageEXT CopyMemoryToImageEXT} command, copying from images to host memory using the {@link EXTHostImageCopy#vkCopyImageToMemoryEXT CopyImageToMemoryEXT} command, and copying between images using the {@link EXTHostImageCopy#vkCopyImageToImageEXT CopyImageToImageEXT} command. */
    @NativeType("VkBool32")
    public boolean hostImageCopy() { return nhostImageCopy(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #hostImageCopy} field. */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT hostImageCopy(@NativeType("VkBool32") boolean value) { nhostImageCopy(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT set(
        int sType,
        long pNext,
        boolean hostImageCopy
    ) {
        sType(sType);
        pNext(pNext);
        hostImageCopy(hostImageCopy);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHostImageCopyFeaturesEXT set(VkPhysicalDeviceHostImageCopyFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT malloc() {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT calloc() {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT create(long address) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceHostImageCopyFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostImageCopyFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceHostImageCopyFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #hostImageCopy}. */
    public static int nhostImageCopy(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceHostImageCopyFeaturesEXT.HOSTIMAGECOPY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostImageCopyFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceHostImageCopyFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #hostImageCopy(boolean) hostImageCopy}. */
    public static void nhostImageCopy(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceHostImageCopyFeaturesEXT.HOSTIMAGECOPY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHostImageCopyFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostImageCopyFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceHostImageCopyFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceHostImageCopyFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceHostImageCopyFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceHostImageCopyFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#hostImageCopy} field. */
        @NativeType("VkBool32")
        public boolean hostImageCopy() { return VkPhysicalDeviceHostImageCopyFeaturesEXT.nhostImageCopy(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#sType} field. */
        public VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHostImageCopyFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT} value to the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#sType} field. */
        public VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHostImageCopyFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceHostImageCopyFeaturesEXT#hostImageCopy} field. */
        public VkPhysicalDeviceHostImageCopyFeaturesEXT.Buffer hostImageCopy(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHostImageCopyFeaturesEXT.nhostImageCopy(address(), value ? 1 : 0); return this; }

    }

}