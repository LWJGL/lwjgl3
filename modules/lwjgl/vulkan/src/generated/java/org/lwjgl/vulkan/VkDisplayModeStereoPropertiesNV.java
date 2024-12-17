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
 * struct VkDisplayModeStereoPropertiesNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 hdmi3DSupported;
 * }}</pre>
 */
public class VkDisplayModeStereoPropertiesNV extends Struct<VkDisplayModeStereoPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HDMI3DSUPPORTED;

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
        HDMI3DSUPPORTED = layout.offsetof(2);
    }

    protected VkDisplayModeStereoPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayModeStereoPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayModeStereoPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkDisplayModeStereoPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayModeStereoPropertiesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code hdmi3DSupported} field. */
    @NativeType("VkBool32")
    public boolean hdmi3DSupported() { return nhdmi3DSupported(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkDisplayModeStereoPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDisplayStereo#VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV} value to the {@code sType} field. */
    public VkDisplayModeStereoPropertiesNV sType$Default() { return sType(NVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDisplayModeStereoPropertiesNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDisplayModeStereoPropertiesNV set(
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
    public VkDisplayModeStereoPropertiesNV set(VkDisplayModeStereoPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDisplayModeStereoPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayModeStereoPropertiesNV malloc() {
        return new VkDisplayModeStereoPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayModeStereoPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayModeStereoPropertiesNV calloc() {
        return new VkDisplayModeStereoPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayModeStereoPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkDisplayModeStereoPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayModeStereoPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayModeStereoPropertiesNV} instance for the specified memory address. */
    public static VkDisplayModeStereoPropertiesNV create(long address) {
        return new VkDisplayModeStereoPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayModeStereoPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkDisplayModeStereoPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkDisplayModeStereoPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeStereoPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeStereoPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeStereoPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeStereoPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeStereoPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayModeStereoPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeStereoPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayModeStereoPropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDisplayModeStereoPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeStereoPropertiesNV malloc(MemoryStack stack) {
        return new VkDisplayModeStereoPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayModeStereoPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayModeStereoPropertiesNV calloc(MemoryStack stack) {
        return new VkDisplayModeStereoPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayModeStereoPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeStereoPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayModeStereoPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayModeStereoPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDisplayModeStereoPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDisplayModeStereoPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #hdmi3DSupported}. */
    public static int nhdmi3DSupported(long struct) { return memGetInt(struct + VkDisplayModeStereoPropertiesNV.HDMI3DSUPPORTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDisplayModeStereoPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDisplayModeStereoPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkDisplayModeStereoPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkDisplayModeStereoPropertiesNV, Buffer> implements NativeResource {

        private static final VkDisplayModeStereoPropertiesNV ELEMENT_FACTORY = VkDisplayModeStereoPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkDisplayModeStereoPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayModeStereoPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDisplayModeStereoPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDisplayModeStereoPropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDisplayModeStereoPropertiesNV.npNext(address()); }
        /** @return the value of the {@code hdmi3DSupported} field. */
        @NativeType("VkBool32")
        public boolean hdmi3DSupported() { return VkDisplayModeStereoPropertiesNV.nhdmi3DSupported(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkDisplayModeStereoPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkDisplayModeStereoPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDisplayStereo#VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV} value to the {@code sType} field. */
        public VkDisplayModeStereoPropertiesNV.Buffer sType$Default() { return sType(NVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDisplayModeStereoPropertiesNV.Buffer pNext(@NativeType("void const *") long value) { VkDisplayModeStereoPropertiesNV.npNext(address(), value); return this; }

    }

}