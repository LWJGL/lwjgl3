/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceImageCompressionControlFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 imageCompressionControl;
 * }}</pre>
 */
public class VkPhysicalDeviceImageCompressionControlFeaturesEXT extends Struct<VkPhysicalDeviceImageCompressionControlFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGECOMPRESSIONCONTROL;

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
        IMAGECOMPRESSIONCONTROL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageCompressionControlFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageCompressionControlFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code imageCompressionControl} field. */
    @NativeType("VkBool32")
    public boolean imageCompressionControl() { return nimageCompressionControl(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageCompressionControl} field. */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT imageCompressionControl(@NativeType("VkBool32") boolean value) { nimageCompressionControl(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT set(
        int sType,
        long pNext,
        boolean imageCompressionControl
    ) {
        sType(sType);
        pNext(pNext);
        imageCompressionControl(imageCompressionControl);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageCompressionControlFeaturesEXT set(VkPhysicalDeviceImageCompressionControlFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageCompressionControlFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageCompressionControlFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageCompressionControlFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageCompressionControlFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #imageCompressionControl}. */
    public static int nimageCompressionControl(long struct) { return memGetInt(struct + VkPhysicalDeviceImageCompressionControlFeaturesEXT.IMAGECOMPRESSIONCONTROL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageCompressionControlFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageCompressionControlFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #imageCompressionControl(boolean) imageCompressionControl}. */
    public static void nimageCompressionControl(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageCompressionControlFeaturesEXT.IMAGECOMPRESSIONCONTROL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageCompressionControlFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageCompressionControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceImageCompressionControlFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageCompressionControlFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceImageCompressionControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageCompressionControlFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageCompressionControlFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code imageCompressionControl} field. */
        @NativeType("VkBool32")
        public boolean imageCompressionControl() { return VkPhysicalDeviceImageCompressionControlFeaturesEXT.nimageCompressionControl(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageCompressionControlFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageCompressionControlFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageCompressionControl} field. */
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT.Buffer imageCompressionControl(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageCompressionControlFeaturesEXT.nimageCompressionControl(address(), value ? 1 : 0); return this; }

    }

}