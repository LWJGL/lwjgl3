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
 * Structure specifying the micromap format and data for a triangle.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code VkMicromapTypeEXT} of the micromap is {@link EXTOpacityMicromap#VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT MICROMAP_TYPE_OPACITY_MICROMAP_EXT} then {@code format} <b>must</b> be {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT OPACITY_MICROMAP_FORMAT_2_STATE_EXT} or {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT OPACITY_MICROMAP_FORMAT_4_STATE_EXT}</li>
 * <li>If the {@code VkMicromapTypeEXT} of the micromap is {@link EXTOpacityMicromap#VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT MICROMAP_TYPE_OPACITY_MICROMAP_EXT} and {@code format} is {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_2_STATE_EXT OPACITY_MICROMAP_FORMAT_2_STATE_EXT} then {@code subdivisionLevel} <b>must</b> be less than or equal to {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT}{@code ::maxOpacity2StateSubdivisionLevel}</li>
 * <li>If the {@code VkMicromapTypeEXT} of the micromap is {@link EXTOpacityMicromap#VK_MICROMAP_TYPE_OPACITY_MICROMAP_EXT MICROMAP_TYPE_OPACITY_MICROMAP_EXT} and {@code format} is {@link EXTOpacityMicromap#VK_OPACITY_MICROMAP_FORMAT_4_STATE_EXT OPACITY_MICROMAP_FORMAT_4_STATE_EXT} then {@code subdivisionLevel} <b>must</b> be less than or equal to {@link VkPhysicalDeviceOpacityMicromapPropertiesEXT}{@code ::maxOpacity4StateSubdivisionLevel}</li>
 * <li>If the {@code VkMicromapTypeEXT} of the micromap is {@link NVDisplacementMicromap#VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV} then {@code format} <b>must</b> be {@link NVDisplacementMicromap#VK_DISPLACEMENT_MICROMAP_FORMAT_64_TRIANGLES_64_BYTES_NV DISPLACEMENT_MICROMAP_FORMAT_64_TRIANGLES_64_BYTES_NV}, {@link NVDisplacementMicromap#VK_DISPLACEMENT_MICROMAP_FORMAT_256_TRIANGLES_128_BYTES_NV DISPLACEMENT_MICROMAP_FORMAT_256_TRIANGLES_128_BYTES_NV} or {@link NVDisplacementMicromap#VK_DISPLACEMENT_MICROMAP_FORMAT_1024_TRIANGLES_128_BYTES_NV DISPLACEMENT_MICROMAP_FORMAT_1024_TRIANGLES_128_BYTES_NV}</li>
 * <li>If the {@code VkMicromapTypeEXT} of the micromap is {@link NVDisplacementMicromap#VK_MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV} then {@code subdivisionLevel} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDisplacementMicromapPropertiesNV}{@code ::maxDisplacementMicromapSubdivisionLevel}</li>
 * </ul>
 * 
 * <p>The {@code format} is interpreted based on the {@code type} of the micromap using it.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMicromapTriangleEXT {
 *     uint32_t {@link #dataOffset};
 *     uint16_t {@link #subdivisionLevel};
 *     uint16_t {@link #format};
 * }</code></pre>
 */
public class VkMicromapTriangleEXT extends Struct<VkMicromapTriangleEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATAOFFSET,
        SUBDIVISIONLEVEL,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATAOFFSET = layout.offsetof(0);
        SUBDIVISIONLEVEL = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
    }

    protected VkMicromapTriangleEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapTriangleEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapTriangleEXT(address, container);
    }

    /**
     * Creates a {@code VkMicromapTriangleEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapTriangleEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the offset in bytes of the start of the data for this triangle. This is a byte aligned value. */
    @NativeType("uint32_t")
    public int dataOffset() { return ndataOffset(address()); }
    /** the subdivision level of this triangle */
    @NativeType("uint16_t")
    public short subdivisionLevel() { return nsubdivisionLevel(address()); }
    /** the format of this triangle */
    @NativeType("uint16_t")
    public short format() { return nformat(address()); }

    /** Sets the specified value to the {@link #dataOffset} field. */
    public VkMicromapTriangleEXT dataOffset(@NativeType("uint32_t") int value) { ndataOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #subdivisionLevel} field. */
    public VkMicromapTriangleEXT subdivisionLevel(@NativeType("uint16_t") short value) { nsubdivisionLevel(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public VkMicromapTriangleEXT format(@NativeType("uint16_t") short value) { nformat(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapTriangleEXT set(
        int dataOffset,
        short subdivisionLevel,
        short format
    ) {
        dataOffset(dataOffset);
        subdivisionLevel(subdivisionLevel);
        format(format);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMicromapTriangleEXT set(VkMicromapTriangleEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapTriangleEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapTriangleEXT malloc() {
        return new VkMicromapTriangleEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapTriangleEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapTriangleEXT calloc() {
        return new VkMicromapTriangleEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapTriangleEXT} instance allocated with {@link BufferUtils}. */
    public static VkMicromapTriangleEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapTriangleEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapTriangleEXT} instance for the specified memory address. */
    public static VkMicromapTriangleEXT create(long address) {
        return new VkMicromapTriangleEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapTriangleEXT createSafe(long address) {
        return address == NULL ? null : new VkMicromapTriangleEXT(address, null);
    }

    /**
     * Returns a new {@link VkMicromapTriangleEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapTriangleEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapTriangleEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapTriangleEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapTriangleEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapTriangleEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapTriangleEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapTriangleEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapTriangleEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapTriangleEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapTriangleEXT malloc(MemoryStack stack) {
        return new VkMicromapTriangleEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapTriangleEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapTriangleEXT calloc(MemoryStack stack) {
        return new VkMicromapTriangleEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapTriangleEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapTriangleEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapTriangleEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapTriangleEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #dataOffset}. */
    public static int ndataOffset(long struct) { return UNSAFE.getInt(null, struct + VkMicromapTriangleEXT.DATAOFFSET); }
    /** Unsafe version of {@link #subdivisionLevel}. */
    public static short nsubdivisionLevel(long struct) { return UNSAFE.getShort(null, struct + VkMicromapTriangleEXT.SUBDIVISIONLEVEL); }
    /** Unsafe version of {@link #format}. */
    public static short nformat(long struct) { return UNSAFE.getShort(null, struct + VkMicromapTriangleEXT.FORMAT); }

    /** Unsafe version of {@link #dataOffset(int) dataOffset}. */
    public static void ndataOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapTriangleEXT.DATAOFFSET, value); }
    /** Unsafe version of {@link #subdivisionLevel(short) subdivisionLevel}. */
    public static void nsubdivisionLevel(long struct, short value) { UNSAFE.putShort(null, struct + VkMicromapTriangleEXT.SUBDIVISIONLEVEL, value); }
    /** Unsafe version of {@link #format(short) format}. */
    public static void nformat(long struct, short value) { UNSAFE.putShort(null, struct + VkMicromapTriangleEXT.FORMAT, value); }

    // -----------------------------------

    /** An array of {@link VkMicromapTriangleEXT} structs. */
    public static class Buffer extends StructBuffer<VkMicromapTriangleEXT, Buffer> implements NativeResource {

        private static final VkMicromapTriangleEXT ELEMENT_FACTORY = VkMicromapTriangleEXT.create(-1L);

        /**
         * Creates a new {@code VkMicromapTriangleEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapTriangleEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapTriangleEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMicromapTriangleEXT#dataOffset} field. */
        @NativeType("uint32_t")
        public int dataOffset() { return VkMicromapTriangleEXT.ndataOffset(address()); }
        /** @return the value of the {@link VkMicromapTriangleEXT#subdivisionLevel} field. */
        @NativeType("uint16_t")
        public short subdivisionLevel() { return VkMicromapTriangleEXT.nsubdivisionLevel(address()); }
        /** @return the value of the {@link VkMicromapTriangleEXT#format} field. */
        @NativeType("uint16_t")
        public short format() { return VkMicromapTriangleEXT.nformat(address()); }

        /** Sets the specified value to the {@link VkMicromapTriangleEXT#dataOffset} field. */
        public VkMicromapTriangleEXT.Buffer dataOffset(@NativeType("uint32_t") int value) { VkMicromapTriangleEXT.ndataOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapTriangleEXT#subdivisionLevel} field. */
        public VkMicromapTriangleEXT.Buffer subdivisionLevel(@NativeType("uint16_t") short value) { VkMicromapTriangleEXT.nsubdivisionLevel(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapTriangleEXT#format} field. */
        public VkMicromapTriangleEXT.Buffer format(@NativeType("uint16_t") short value) { VkMicromapTriangleEXT.nformat(address(), value); return this; }

    }

}