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
 * struct VkPhysicalDevice4444FormatsFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 formatA4R4G4B4;
 *     VkBool32 formatA4B4G4R4;
 * }}</pre>
 */
public class VkPhysicalDevice4444FormatsFeaturesEXT extends Struct<VkPhysicalDevice4444FormatsFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMATA4R4G4B4,
        FORMATA4B4G4R4;

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
        FORMATA4R4G4B4 = layout.offsetof(2);
        FORMATA4B4G4R4 = layout.offsetof(3);
    }

    protected VkPhysicalDevice4444FormatsFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevice4444FormatsFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice4444FormatsFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code formatA4R4G4B4} field. */
    @NativeType("VkBool32")
    public boolean formatA4R4G4B4() { return nformatA4R4G4B4(address()) != 0; }
    /** @return the value of the {@code formatA4B4G4R4} field. */
    @NativeType("VkBool32")
    public boolean formatA4B4G4R4() { return nformatA4B4G4R4(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXT4444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT sType$Default() { return sType(EXT4444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code formatA4R4G4B4} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(@NativeType("VkBool32") boolean value) { nformatA4R4G4B4(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code formatA4B4G4R4} field. */
    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(@NativeType("VkBool32") boolean value) { nformatA4B4G4R4(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevice4444FormatsFeaturesEXT set(
        int sType,
        long pNext,
        boolean formatA4R4G4B4,
        boolean formatA4B4G4R4
    ) {
        sType(sType);
        pNext(pNext);
        formatA4R4G4B4(formatA4R4G4B4);
        formatA4B4G4R4(formatA4B4G4R4);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice4444FormatsFeaturesEXT set(VkPhysicalDevice4444FormatsFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT malloc() {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT calloc() {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevice4444FormatsFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT create(long address) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevice4444FormatsFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevice4444FormatsFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevice4444FormatsFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice4444FormatsFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevice4444FormatsFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice4444FormatsFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #formatA4R4G4B4}. */
    public static int nformatA4R4G4B4(long struct) { return memGetInt(struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4R4G4B4); }
    /** Unsafe version of {@link #formatA4B4G4R4}. */
    public static int nformatA4B4G4R4(long struct) { return memGetInt(struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4B4G4R4); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevice4444FormatsFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice4444FormatsFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #formatA4R4G4B4(boolean) formatA4R4G4B4}. */
    public static void nformatA4R4G4B4(long struct, int value) { memPutInt(struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4R4G4B4, value); }
    /** Unsafe version of {@link #formatA4B4G4R4(boolean) formatA4B4G4R4}. */
    public static void nformatA4B4G4R4(long struct, int value) { memPutInt(struct + VkPhysicalDevice4444FormatsFeaturesEXT.FORMATA4B4G4R4, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice4444FormatsFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice4444FormatsFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDevice4444FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevice4444FormatsFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevice4444FormatsFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice4444FormatsFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevice4444FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice4444FormatsFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice4444FormatsFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code formatA4R4G4B4} field. */
        @NativeType("VkBool32")
        public boolean formatA4R4G4B4() { return VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4R4G4B4(address()) != 0; }
        /** @return the value of the {@code formatA4B4G4R4} field. */
        @NativeType("VkBool32")
        public boolean formatA4B4G4R4() { return VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4B4G4R4(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice4444FormatsFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXT4444Formats#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer sType$Default() { return sType(EXT4444Formats.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_4444_FORMATS_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice4444FormatsFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code formatA4R4G4B4} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer formatA4R4G4B4(@NativeType("VkBool32") boolean value) { VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4R4G4B4(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code formatA4B4G4R4} field. */
        public VkPhysicalDevice4444FormatsFeaturesEXT.Buffer formatA4B4G4R4(@NativeType("VkBool32") boolean value) { VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4B4G4R4(address(), value ? 1 : 0); return this; }

    }

}