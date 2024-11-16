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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a single shading rate palette.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code shadingRatePaletteEntryCount} <b>must</b> be between 1 and {@link VkPhysicalDeviceShadingRateImagePropertiesNV}{@code ::shadingRatePaletteSize}, inclusive</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code pShadingRatePaletteEntries} <b>must</b> be a valid pointer to an array of {@code shadingRatePaletteEntryCount} valid {@code VkShadingRatePaletteEntryNV} values</li>
 * <li>{@code shadingRatePaletteEntryCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineViewportShadingRateImageStateCreateInfoNV}, {@link NVShadingRateImage#vkCmdSetViewportShadingRatePaletteNV CmdSetViewportShadingRatePaletteNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkShadingRatePaletteNV {
 *     uint32_t {@link #shadingRatePaletteEntryCount};
 *     VkShadingRatePaletteEntryNV const * {@link #pShadingRatePaletteEntries};
 * }</code></pre>
 */
public class VkShadingRatePaletteNV extends Struct<VkShadingRatePaletteNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHADINGRATEPALETTEENTRYCOUNT,
        PSHADINGRATEPALETTEENTRIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHADINGRATEPALETTEENTRYCOUNT = layout.offsetof(0);
        PSHADINGRATEPALETTEENTRIES = layout.offsetof(1);
    }

    protected VkShadingRatePaletteNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShadingRatePaletteNV create(long address, @Nullable ByteBuffer container) {
        return new VkShadingRatePaletteNV(address, container);
    }

    /**
     * Creates a {@code VkShadingRatePaletteNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShadingRatePaletteNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies the number of entries in the shading rate image palette. */
    @NativeType("uint32_t")
    public int shadingRatePaletteEntryCount() { return nshadingRatePaletteEntryCount(address()); }
    /** a pointer to an array of {@code VkShadingRatePaletteEntryNV} enums defining the shading rate for each palette entry. */
    @NativeType("VkShadingRatePaletteEntryNV const *")
    public IntBuffer pShadingRatePaletteEntries() { return npShadingRatePaletteEntries(address()); }

    /** Sets the address of the specified {@link IntBuffer} to the {@link #pShadingRatePaletteEntries} field. */
    public VkShadingRatePaletteNV pShadingRatePaletteEntries(@NativeType("VkShadingRatePaletteEntryNV const *") IntBuffer value) { npShadingRatePaletteEntries(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkShadingRatePaletteNV set(VkShadingRatePaletteNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShadingRatePaletteNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShadingRatePaletteNV malloc() {
        return new VkShadingRatePaletteNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShadingRatePaletteNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShadingRatePaletteNV calloc() {
        return new VkShadingRatePaletteNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShadingRatePaletteNV} instance allocated with {@link BufferUtils}. */
    public static VkShadingRatePaletteNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShadingRatePaletteNV(memAddress(container), container);
    }

    /** Returns a new {@code VkShadingRatePaletteNV} instance for the specified memory address. */
    public static VkShadingRatePaletteNV create(long address) {
        return new VkShadingRatePaletteNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShadingRatePaletteNV createSafe(long address) {
        return address == NULL ? null : new VkShadingRatePaletteNV(address, null);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShadingRatePaletteNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShadingRatePaletteNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkShadingRatePaletteNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkShadingRatePaletteNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShadingRatePaletteNV malloc(MemoryStack stack) {
        return new VkShadingRatePaletteNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShadingRatePaletteNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShadingRatePaletteNV calloc(MemoryStack stack) {
        return new VkShadingRatePaletteNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShadingRatePaletteNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShadingRatePaletteNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #shadingRatePaletteEntryCount}. */
    public static int nshadingRatePaletteEntryCount(long struct) { return memGetInt(struct + VkShadingRatePaletteNV.SHADINGRATEPALETTEENTRYCOUNT); }
    /** Unsafe version of {@link #pShadingRatePaletteEntries() pShadingRatePaletteEntries}. */
    public static IntBuffer npShadingRatePaletteEntries(long struct) { return memIntBuffer(memGetAddress(struct + VkShadingRatePaletteNV.PSHADINGRATEPALETTEENTRIES), nshadingRatePaletteEntryCount(struct)); }

    /** Sets the specified value to the {@code shadingRatePaletteEntryCount} field of the specified {@code struct}. */
    public static void nshadingRatePaletteEntryCount(long struct, int value) { memPutInt(struct + VkShadingRatePaletteNV.SHADINGRATEPALETTEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pShadingRatePaletteEntries(IntBuffer) pShadingRatePaletteEntries}. */
    public static void npShadingRatePaletteEntries(long struct, IntBuffer value) { memPutAddress(struct + VkShadingRatePaletteNV.PSHADINGRATEPALETTEENTRIES, memAddress(value)); nshadingRatePaletteEntryCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShadingRatePaletteNV.PSHADINGRATEPALETTEENTRIES));
    }

    // -----------------------------------

    /** An array of {@link VkShadingRatePaletteNV} structs. */
    public static class Buffer extends StructBuffer<VkShadingRatePaletteNV, Buffer> implements NativeResource {

        private static final VkShadingRatePaletteNV ELEMENT_FACTORY = VkShadingRatePaletteNV.create(-1L);

        /**
         * Creates a new {@code VkShadingRatePaletteNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShadingRatePaletteNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShadingRatePaletteNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkShadingRatePaletteNV#shadingRatePaletteEntryCount} field. */
        @NativeType("uint32_t")
        public int shadingRatePaletteEntryCount() { return VkShadingRatePaletteNV.nshadingRatePaletteEntryCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkShadingRatePaletteNV#pShadingRatePaletteEntries} field. */
        @NativeType("VkShadingRatePaletteEntryNV const *")
        public IntBuffer pShadingRatePaletteEntries() { return VkShadingRatePaletteNV.npShadingRatePaletteEntries(address()); }

        /** Sets the address of the specified {@link IntBuffer} to the {@link VkShadingRatePaletteNV#pShadingRatePaletteEntries} field. */
        public VkShadingRatePaletteNV.Buffer pShadingRatePaletteEntries(@NativeType("VkShadingRatePaletteEntryNV const *") IntBuffer value) { VkShadingRatePaletteNV.npShadingRatePaletteEntries(address(), value); return this; }

    }

}