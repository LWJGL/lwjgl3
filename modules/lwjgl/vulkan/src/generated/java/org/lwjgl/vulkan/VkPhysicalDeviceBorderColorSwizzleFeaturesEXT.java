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
 * struct VkPhysicalDeviceBorderColorSwizzleFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 borderColorSwizzle;
 *     VkBool32 borderColorSwizzleFromImage;
 * }}</pre>
 */
public class VkPhysicalDeviceBorderColorSwizzleFeaturesEXT extends Struct<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BORDERCOLORSWIZZLE,
        BORDERCOLORSWIZZLEFROMIMAGE;

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
        BORDERCOLORSWIZZLE = layout.offsetof(2);
        BORDERCOLORSWIZZLEFROMIMAGE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code borderColorSwizzle} field. */
    @NativeType("VkBool32")
    public boolean borderColorSwizzle() { return nborderColorSwizzle(address()) != 0; }
    /** @return the value of the {@code borderColorSwizzleFromImage} field. */
    @NativeType("VkBool32")
    public boolean borderColorSwizzleFromImage() { return nborderColorSwizzleFromImage(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT sType$Default() { return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code borderColorSwizzle} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzle(@NativeType("VkBool32") boolean value) { nborderColorSwizzle(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code borderColorSwizzleFromImage} field. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT borderColorSwizzleFromImage(@NativeType("VkBool32") boolean value) { nborderColorSwizzleFromImage(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT set(
        int sType,
        long pNext,
        boolean borderColorSwizzle,
        boolean borderColorSwizzleFromImage
    ) {
        sType(sType);
        pNext(pNext);
        borderColorSwizzle(borderColorSwizzle);
        borderColorSwizzleFromImage(borderColorSwizzleFromImage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT set(VkPhysicalDeviceBorderColorSwizzleFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT malloc() {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT calloc() {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT create(long address) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceBorderColorSwizzleFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBorderColorSwizzleFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #borderColorSwizzle}. */
    public static int nborderColorSwizzle(long struct) { return memGetInt(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLE); }
    /** Unsafe version of {@link #borderColorSwizzleFromImage}. */
    public static int nborderColorSwizzleFromImage(long struct) { return memGetInt(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLEFROMIMAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #borderColorSwizzle(boolean) borderColorSwizzle}. */
    public static void nborderColorSwizzle(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLE, value); }
    /** Unsafe version of {@link #borderColorSwizzleFromImage(boolean) borderColorSwizzleFromImage}. */
    public static void nborderColorSwizzleFromImage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.BORDERCOLORSWIZZLEFROMIMAGE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBorderColorSwizzleFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceBorderColorSwizzleFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceBorderColorSwizzleFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceBorderColorSwizzleFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code borderColorSwizzle} field. */
        @NativeType("VkBool32")
        public boolean borderColorSwizzle() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzle(address()) != 0; }
        /** @return the value of the {@code borderColorSwizzleFromImage} field. */
        @NativeType("VkBool32")
        public boolean borderColorSwizzleFromImage() { return VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzleFromImage(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBorderColorSwizzle#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer sType$Default() { return sType(EXTBorderColorSwizzle.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BORDER_COLOR_SWIZZLE_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code borderColorSwizzle} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer borderColorSwizzle(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzle(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code borderColorSwizzleFromImage} field. */
        public VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.Buffer borderColorSwizzleFromImage(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceBorderColorSwizzleFeaturesEXT.nborderColorSwizzleFromImage(address(), value ? 1 : 0); return this; }

    }

}