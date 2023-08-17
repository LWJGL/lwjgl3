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
 * Compression properties of an image.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageCompressionPropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkImageCompressionFlagsEXT {@link #imageCompressionFlags};
 *     VkImageCompressionFixedRateFlagsEXT {@link #imageCompressionFixedRateFlags};
 * }</code></pre>
 */
public class VkImageCompressionPropertiesEXT extends Struct<VkImageCompressionPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGECOMPRESSIONFLAGS,
        IMAGECOMPRESSIONFIXEDRATEFLAGS;

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
        IMAGECOMPRESSIONFLAGS = layout.offsetof(2);
        IMAGECOMPRESSIONFIXEDRATEFLAGS = layout.offsetof(3);
    }

    protected VkImageCompressionPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageCompressionPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageCompressionPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkImageCompressionPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCompressionPropertiesEXT(ByteBuffer container) {
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
    /** returns a value describing the compression controls that apply to the image. The value will be either {@link EXTImageCompressionControl#VK_IMAGE_COMPRESSION_DEFAULT_EXT IMAGE_COMPRESSION_DEFAULT_EXT} to indicate no fixed-rate compression, {@link EXTImageCompressionControl#VK_IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT IMAGE_COMPRESSION_FIXED_RATE_EXPLICIT_EXT} to indicate fixed-rate compression, or {@link EXTImageCompressionControl#VK_IMAGE_COMPRESSION_DISABLED_EXT IMAGE_COMPRESSION_DISABLED_EXT} to indicate no compression. */
    @NativeType("VkImageCompressionFlagsEXT")
    public int imageCompressionFlags() { return nimageCompressionFlags(address()); }
    /** returns a {@code VkImageCompressionFixedRateFlagsEXT} value describing the compression rates that apply to the specified aspect of the image. */
    @NativeType("VkImageCompressionFixedRateFlagsEXT")
    public int imageCompressionFixedRateFlags() { return nimageCompressionFixedRateFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageCompressionPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkImageCompressionPropertiesEXT sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageCompressionPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCompressionPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCompressionPropertiesEXT set(VkImageCompressionPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCompressionPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCompressionPropertiesEXT malloc() {
        return new VkImageCompressionPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageCompressionPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCompressionPropertiesEXT calloc() {
        return new VkImageCompressionPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageCompressionPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageCompressionPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCompressionPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageCompressionPropertiesEXT} instance for the specified memory address. */
    public static VkImageCompressionPropertiesEXT create(long address) {
        return new VkImageCompressionPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageCompressionPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkImageCompressionPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageCompressionPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCompressionPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCompressionPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageCompressionPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageCompressionPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageCompressionPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCompressionPropertiesEXT malloc(MemoryStack stack) {
        return new VkImageCompressionPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageCompressionPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCompressionPropertiesEXT calloc(MemoryStack stack) {
        return new VkImageCompressionPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageCompressionPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCompressionPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageCompressionPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageCompressionPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #imageCompressionFlags}. */
    public static int nimageCompressionFlags(long struct) { return UNSAFE.getInt(null, struct + VkImageCompressionPropertiesEXT.IMAGECOMPRESSIONFLAGS); }
    /** Unsafe version of {@link #imageCompressionFixedRateFlags}. */
    public static int nimageCompressionFixedRateFlags(long struct) { return UNSAFE.getInt(null, struct + VkImageCompressionPropertiesEXT.IMAGECOMPRESSIONFIXEDRATEFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageCompressionPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCompressionPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkImageCompressionPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageCompressionPropertiesEXT, Buffer> implements NativeResource {

        private static final VkImageCompressionPropertiesEXT ELEMENT_FACTORY = VkImageCompressionPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkImageCompressionPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCompressionPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageCompressionPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageCompressionPropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCompressionPropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkImageCompressionPropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkImageCompressionPropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkImageCompressionPropertiesEXT#imageCompressionFlags} field. */
        @NativeType("VkImageCompressionFlagsEXT")
        public int imageCompressionFlags() { return VkImageCompressionPropertiesEXT.nimageCompressionFlags(address()); }
        /** @return the value of the {@link VkImageCompressionPropertiesEXT#imageCompressionFixedRateFlags} field. */
        @NativeType("VkImageCompressionFixedRateFlagsEXT")
        public int imageCompressionFixedRateFlags() { return VkImageCompressionPropertiesEXT.nimageCompressionFixedRateFlags(address()); }

        /** Sets the specified value to the {@link VkImageCompressionPropertiesEXT#sType} field. */
        public VkImageCompressionPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCompressionPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT} value to the {@link VkImageCompressionPropertiesEXT#sType} field. */
        public VkImageCompressionPropertiesEXT.Buffer sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkImageCompressionPropertiesEXT#pNext} field. */
        public VkImageCompressionPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkImageCompressionPropertiesEXT.npNext(address(), value); return this; }

    }

}