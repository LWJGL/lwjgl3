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
 * struct VkVideoEncodeProfileRgbConversionInfoVALVE {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 performEncodeRgbConversion;
 * }}</pre>
 */
public class VkVideoEncodeProfileRgbConversionInfoVALVE extends Struct<VkVideoEncodeProfileRgbConversionInfoVALVE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERFORMENCODERGBCONVERSION;

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
        PERFORMENCODERGBCONVERSION = layout.offsetof(2);
    }

    protected VkVideoEncodeProfileRgbConversionInfoVALVE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeProfileRgbConversionInfoVALVE create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeProfileRgbConversionInfoVALVE(ByteBuffer container) {
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
    /** @return the value of the {@code performEncodeRgbConversion} field. */
    @NativeType("VkBool32")
    public boolean performEncodeRgbConversion() { return nperformEncodeRgbConversion(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeProfileRgbConversionInfoVALVE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VALVEVideoEncodeRgbConversion#VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE} value to the {@code sType} field. */
    public VkVideoEncodeProfileRgbConversionInfoVALVE sType$Default() { return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeProfileRgbConversionInfoVALVE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code performEncodeRgbConversion} field. */
    public VkVideoEncodeProfileRgbConversionInfoVALVE performEncodeRgbConversion(@NativeType("VkBool32") boolean value) { nperformEncodeRgbConversion(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeProfileRgbConversionInfoVALVE set(
        int sType,
        long pNext,
        boolean performEncodeRgbConversion
    ) {
        sType(sType);
        pNext(pNext);
        performEncodeRgbConversion(performEncodeRgbConversion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeProfileRgbConversionInfoVALVE set(VkVideoEncodeProfileRgbConversionInfoVALVE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE malloc() {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE calloc() {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance for the specified memory address. */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE create(long address) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeProfileRgbConversionInfoVALVE createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeProfileRgbConversionInfoVALVE(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE malloc(MemoryStack stack) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE calloc(MemoryStack stack) {
        return new VkVideoEncodeProfileRgbConversionInfoVALVE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeProfileRgbConversionInfoVALVE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeProfileRgbConversionInfoVALVE.PNEXT); }
    /** Unsafe version of {@link #performEncodeRgbConversion}. */
    public static int nperformEncodeRgbConversion(long struct) { return memGetInt(struct + VkVideoEncodeProfileRgbConversionInfoVALVE.PERFORMENCODERGBCONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeProfileRgbConversionInfoVALVE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeProfileRgbConversionInfoVALVE.PNEXT, value); }
    /** Unsafe version of {@link #performEncodeRgbConversion(boolean) performEncodeRgbConversion}. */
    public static void nperformEncodeRgbConversion(long struct, int value) { memPutInt(struct + VkVideoEncodeProfileRgbConversionInfoVALVE.PERFORMENCODERGBCONVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeProfileRgbConversionInfoVALVE} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeProfileRgbConversionInfoVALVE, Buffer> implements NativeResource {

        private static final VkVideoEncodeProfileRgbConversionInfoVALVE ELEMENT_FACTORY = VkVideoEncodeProfileRgbConversionInfoVALVE.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeProfileRgbConversionInfoVALVE#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeProfileRgbConversionInfoVALVE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeProfileRgbConversionInfoVALVE.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeProfileRgbConversionInfoVALVE.npNext(address()); }
        /** @return the value of the {@code performEncodeRgbConversion} field. */
        @NativeType("VkBool32")
        public boolean performEncodeRgbConversion() { return VkVideoEncodeProfileRgbConversionInfoVALVE.nperformEncodeRgbConversion(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeProfileRgbConversionInfoVALVE.nsType(address(), value); return this; }
        /** Sets the {@link VALVEVideoEncodeRgbConversion#VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE} value to the {@code sType} field. */
        public VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer sType$Default() { return sType(VALVEVideoEncodeRgbConversion.VK_STRUCTURE_TYPE_VIDEO_ENCODE_PROFILE_RGB_CONVERSION_INFO_VALVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeProfileRgbConversionInfoVALVE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code performEncodeRgbConversion} field. */
        public VkVideoEncodeProfileRgbConversionInfoVALVE.Buffer performEncodeRgbConversion(@NativeType("VkBool32") boolean value) { VkVideoEncodeProfileRgbConversionInfoVALVE.nperformEncodeRgbConversion(address(), value ? 1 : 0); return this; }

    }

}