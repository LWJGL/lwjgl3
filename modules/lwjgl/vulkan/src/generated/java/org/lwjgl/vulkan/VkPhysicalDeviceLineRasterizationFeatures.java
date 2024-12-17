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
 * struct VkPhysicalDeviceLineRasterizationFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 rectangularLines;
 *     VkBool32 bresenhamLines;
 *     VkBool32 smoothLines;
 *     VkBool32 stippledRectangularLines;
 *     VkBool32 stippledBresenhamLines;
 *     VkBool32 stippledSmoothLines;
 * }}</pre>
 */
public class VkPhysicalDeviceLineRasterizationFeatures extends Struct<VkPhysicalDeviceLineRasterizationFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RECTANGULARLINES,
        BRESENHAMLINES,
        SMOOTHLINES,
        STIPPLEDRECTANGULARLINES,
        STIPPLEDBRESENHAMLINES,
        STIPPLEDSMOOTHLINES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RECTANGULARLINES = layout.offsetof(2);
        BRESENHAMLINES = layout.offsetof(3);
        SMOOTHLINES = layout.offsetof(4);
        STIPPLEDRECTANGULARLINES = layout.offsetof(5);
        STIPPLEDBRESENHAMLINES = layout.offsetof(6);
        STIPPLEDSMOOTHLINES = layout.offsetof(7);
    }

    protected VkPhysicalDeviceLineRasterizationFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLineRasterizationFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLineRasterizationFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLineRasterizationFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code rectangularLines} field. */
    @NativeType("VkBool32")
    public boolean rectangularLines() { return nrectangularLines(address()) != 0; }
    /** @return the value of the {@code bresenhamLines} field. */
    @NativeType("VkBool32")
    public boolean bresenhamLines() { return nbresenhamLines(address()) != 0; }
    /** @return the value of the {@code smoothLines} field. */
    @NativeType("VkBool32")
    public boolean smoothLines() { return nsmoothLines(address()) != 0; }
    /** @return the value of the {@code stippledRectangularLines} field. */
    @NativeType("VkBool32")
    public boolean stippledRectangularLines() { return nstippledRectangularLines(address()) != 0; }
    /** @return the value of the {@code stippledBresenhamLines} field. */
    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() { return nstippledBresenhamLines(address()) != 0; }
    /** @return the value of the {@code stippledSmoothLines} field. */
    @NativeType("VkBool32")
    public boolean stippledSmoothLines() { return nstippledSmoothLines(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceLineRasterizationFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceLineRasterizationFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceLineRasterizationFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code rectangularLines} field. */
    public VkPhysicalDeviceLineRasterizationFeatures rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code bresenhamLines} field. */
    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code smoothLines} field. */
    public VkPhysicalDeviceLineRasterizationFeatures smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledRectangularLines} field. */
    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledBresenhamLines} field. */
    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code stippledSmoothLines} field. */
    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLineRasterizationFeatures set(
        int sType,
        long pNext,
        boolean rectangularLines,
        boolean bresenhamLines,
        boolean smoothLines,
        boolean stippledRectangularLines,
        boolean stippledBresenhamLines,
        boolean stippledSmoothLines
    ) {
        sType(sType);
        pNext(pNext);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceLineRasterizationFeatures set(VkPhysicalDeviceLineRasterizationFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeatures malloc() {
        return new VkPhysicalDeviceLineRasterizationFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeatures calloc() {
        return new VkPhysicalDeviceLineRasterizationFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLineRasterizationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceLineRasterizationFeatures create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLineRasterizationFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLineRasterizationFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLineRasterizationFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLineRasterizationFeatures.PNEXT); }
    /** Unsafe version of {@link #rectangularLines}. */
    public static int nrectangularLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.RECTANGULARLINES); }
    /** Unsafe version of {@link #bresenhamLines}. */
    public static int nbresenhamLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.BRESENHAMLINES); }
    /** Unsafe version of {@link #smoothLines}. */
    public static int nsmoothLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.SMOOTHLINES); }
    /** Unsafe version of {@link #stippledRectangularLines}. */
    public static int nstippledRectangularLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDRECTANGULARLINES); }
    /** Unsafe version of {@link #stippledBresenhamLines}. */
    public static int nstippledBresenhamLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDBRESENHAMLINES); }
    /** Unsafe version of {@link #stippledSmoothLines}. */
    public static int nstippledSmoothLines(long struct) { return memGetInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDSMOOTHLINES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLineRasterizationFeatures.PNEXT, value); }
    /** Unsafe version of {@link #rectangularLines(boolean) rectangularLines}. */
    public static void nrectangularLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.RECTANGULARLINES, value); }
    /** Unsafe version of {@link #bresenhamLines(boolean) bresenhamLines}. */
    public static void nbresenhamLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.BRESENHAMLINES, value); }
    /** Unsafe version of {@link #smoothLines(boolean) smoothLines}. */
    public static void nsmoothLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.SMOOTHLINES, value); }
    /** Unsafe version of {@link #stippledRectangularLines(boolean) stippledRectangularLines}. */
    public static void nstippledRectangularLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDRECTANGULARLINES, value); }
    /** Unsafe version of {@link #stippledBresenhamLines(boolean) stippledBresenhamLines}. */
    public static void nstippledBresenhamLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDBRESENHAMLINES, value); }
    /** Unsafe version of {@link #stippledSmoothLines(boolean) stippledSmoothLines}. */
    public static void nstippledSmoothLines(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLineRasterizationFeatures.STIPPLEDSMOOTHLINES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLineRasterizationFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLineRasterizationFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLineRasterizationFeatures ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLineRasterizationFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLineRasterizationFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLineRasterizationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLineRasterizationFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLineRasterizationFeatures.npNext(address()); }
        /** @return the value of the {@code rectangularLines} field. */
        @NativeType("VkBool32")
        public boolean rectangularLines() { return VkPhysicalDeviceLineRasterizationFeatures.nrectangularLines(address()) != 0; }
        /** @return the value of the {@code bresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean bresenhamLines() { return VkPhysicalDeviceLineRasterizationFeatures.nbresenhamLines(address()) != 0; }
        /** @return the value of the {@code smoothLines} field. */
        @NativeType("VkBool32")
        public boolean smoothLines() { return VkPhysicalDeviceLineRasterizationFeatures.nsmoothLines(address()) != 0; }
        /** @return the value of the {@code stippledRectangularLines} field. */
        @NativeType("VkBool32")
        public boolean stippledRectangularLines() { return VkPhysicalDeviceLineRasterizationFeatures.nstippledRectangularLines(address()) != 0; }
        /** @return the value of the {@code stippledBresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() { return VkPhysicalDeviceLineRasterizationFeatures.nstippledBresenhamLines(address()) != 0; }
        /** @return the value of the {@code stippledSmoothLines} field. */
        @NativeType("VkBool32")
        public boolean stippledSmoothLines() { return VkPhysicalDeviceLineRasterizationFeatures.nstippledSmoothLines(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLineRasterizationFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code rectangularLines} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeatures.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code bresenhamLines} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeatures.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code smoothLines} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeatures.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledRectangularLines} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeatures.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledBresenhamLines} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeatures.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code stippledSmoothLines} field. */
        public VkPhysicalDeviceLineRasterizationFeatures.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeatures.nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    }

}