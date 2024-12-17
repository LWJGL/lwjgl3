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
 * struct VkPhysicalDeviceImageProcessing2FeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 textureBlockMatch2;
 * }}</pre>
 */
public class VkPhysicalDeviceImageProcessing2FeaturesQCOM extends Struct<VkPhysicalDeviceImageProcessing2FeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TEXTUREBLOCKMATCH2;

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
        TEXTUREBLOCKMATCH2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceImageProcessing2FeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageProcessing2FeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code textureBlockMatch2} field. */
    @NativeType("VkBool32")
    public boolean textureBlockMatch2() { return ntextureBlockMatch2(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM sType$Default() { return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code textureBlockMatch2} field. */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM textureBlockMatch2(@NativeType("VkBool32") boolean value) { ntextureBlockMatch2(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM set(
        int sType,
        long pNext,
        boolean textureBlockMatch2
    ) {
        sType(sType);
        pNext(pNext);
        textureBlockMatch2(textureBlockMatch2);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageProcessing2FeaturesQCOM set(VkPhysicalDeviceImageProcessing2FeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceImageProcessing2FeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageProcessing2FeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing2FeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageProcessing2FeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #textureBlockMatch2}. */
    public static int ntextureBlockMatch2(long struct) { return memGetInt(struct + VkPhysicalDeviceImageProcessing2FeaturesQCOM.TEXTUREBLOCKMATCH2); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing2FeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageProcessing2FeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #textureBlockMatch2(boolean) textureBlockMatch2}. */
    public static void ntextureBlockMatch2(long struct, int value) { memPutInt(struct + VkPhysicalDeviceImageProcessing2FeaturesQCOM.TEXTUREBLOCKMATCH2, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessing2FeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageProcessing2FeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessing2FeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageProcessing2FeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageProcessing2FeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageProcessing2FeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageProcessing2FeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code textureBlockMatch2} field. */
        @NativeType("VkBool32")
        public boolean textureBlockMatch2() { return VkPhysicalDeviceImageProcessing2FeaturesQCOM.ntextureBlockMatch2(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageProcessing2FeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageProcessing2FeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code textureBlockMatch2} field. */
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM.Buffer textureBlockMatch2(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessing2FeaturesQCOM.ntextureBlockMatch2(address(), value ? 1 : 0); return this; }

    }

}