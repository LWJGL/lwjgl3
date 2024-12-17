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
 * struct VkPhysicalDeviceMultiDrawFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 multiDraw;
 * }}</pre>
 */
public class VkPhysicalDeviceMultiDrawFeaturesEXT extends Struct<VkPhysicalDeviceMultiDrawFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTIDRAW;

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
        MULTIDRAW = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultiDrawFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultiDrawFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultiDrawFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code multiDraw} field. */
    @NativeType("VkBool32")
    public boolean multiDraw() { return nmultiDraw(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultiDrawFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMultiDraw#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceMultiDrawFeaturesEXT sType$Default() { return sType(EXTMultiDraw.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultiDrawFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code multiDraw} field. */
    public VkPhysicalDeviceMultiDrawFeaturesEXT multiDraw(@NativeType("VkBool32") boolean value) { nmultiDraw(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultiDrawFeaturesEXT set(
        int sType,
        long pNext,
        boolean multiDraw
    ) {
        sType(sType);
        pNext(pNext);
        multiDraw(multiDraw);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultiDrawFeaturesEXT set(VkPhysicalDeviceMultiDrawFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT malloc() {
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT calloc() {
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMultiDrawFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultiDrawFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultiDrawFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiDrawFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultiDrawFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #multiDraw}. */
    public static int nmultiDraw(long struct) { return memGetInt(struct + VkPhysicalDeviceMultiDrawFeaturesEXT.MULTIDRAW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiDrawFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultiDrawFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #multiDraw(boolean) multiDraw}. */
    public static void nmultiDraw(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultiDrawFeaturesEXT.MULTIDRAW, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultiDrawFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultiDrawFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultiDrawFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMultiDrawFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultiDrawFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultiDrawFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultiDrawFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultiDrawFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code multiDraw} field. */
        @NativeType("VkBool32")
        public boolean multiDraw() { return VkPhysicalDeviceMultiDrawFeaturesEXT.nmultiDraw(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultiDrawFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMultiDraw#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer sType$Default() { return sType(EXTMultiDraw.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTI_DRAW_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultiDrawFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code multiDraw} field. */
        public VkPhysicalDeviceMultiDrawFeaturesEXT.Buffer multiDraw(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultiDrawFeaturesEXT.nmultiDraw(address(), value ? 1 : 0); return this; }

    }

}