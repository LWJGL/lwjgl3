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
 * Structure describing the line rasterization features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLineRasterizationFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #rectangularLines};
 *     VkBool32 {@link #bresenhamLines};
 *     VkBool32 {@link #smoothLines};
 *     VkBool32 {@link #stippledRectangularLines};
 *     VkBool32 {@link #stippledBresenhamLines};
 *     VkBool32 {@link #stippledSmoothLines};
 * }</code></pre>
 */
public class VkPhysicalDeviceLineRasterizationFeaturesKHR extends Struct<VkPhysicalDeviceLineRasterizationFeaturesKHR> implements NativeResource {

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

    protected VkPhysicalDeviceLineRasterizationFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLineRasterizationFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR(ByteBuffer container) {
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
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines">rectangular line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean rectangularLines() { return nrectangularLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-bresenham">Bresenham-style line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean bresenhamLines() { return nbresenhamLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-smooth">smooth line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean smoothLines() { return nsmoothLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_KHR} lines. */
    @NativeType("VkBool32")
    public boolean stippledRectangularLines() { return nstippledRectangularLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR LINE_RASTERIZATION_MODE_BRESENHAM_KHR} lines. */
    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() { return nstippledBresenhamLines(address()) != 0; }
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR} lines. */
    @NativeType("VkBool32")
    public boolean stippledSmoothLines() { return nstippledSmoothLines(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType$Default() { return sType(KHRLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rectangularLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bresenhamLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #smoothLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledRectangularLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledBresenhamLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledSmoothLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLineRasterizationFeaturesKHR set(
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
    public VkPhysicalDeviceLineRasterizationFeaturesKHR set(VkPhysicalDeviceLineRasterizationFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR malloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR calloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #rectangularLines}. */
    public static int nrectangularLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.RECTANGULARLINES); }
    /** Unsafe version of {@link #bresenhamLines}. */
    public static int nbresenhamLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.BRESENHAMLINES); }
    /** Unsafe version of {@link #smoothLines}. */
    public static int nsmoothLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.SMOOTHLINES); }
    /** Unsafe version of {@link #stippledRectangularLines}. */
    public static int nstippledRectangularLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STIPPLEDRECTANGULARLINES); }
    /** Unsafe version of {@link #stippledBresenhamLines}. */
    public static int nstippledBresenhamLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STIPPLEDBRESENHAMLINES); }
    /** Unsafe version of {@link #stippledSmoothLines}. */
    public static int nstippledSmoothLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STIPPLEDSMOOTHLINES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #rectangularLines(boolean) rectangularLines}. */
    public static void nrectangularLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.RECTANGULARLINES, value); }
    /** Unsafe version of {@link #bresenhamLines(boolean) bresenhamLines}. */
    public static void nbresenhamLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.BRESENHAMLINES, value); }
    /** Unsafe version of {@link #smoothLines(boolean) smoothLines}. */
    public static void nsmoothLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.SMOOTHLINES, value); }
    /** Unsafe version of {@link #stippledRectangularLines(boolean) stippledRectangularLines}. */
    public static void nstippledRectangularLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STIPPLEDRECTANGULARLINES, value); }
    /** Unsafe version of {@link #stippledBresenhamLines(boolean) stippledBresenhamLines}. */
    public static void nstippledBresenhamLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STIPPLEDBRESENHAMLINES, value); }
    /** Unsafe version of {@link #stippledSmoothLines(boolean) stippledSmoothLines}. */
    public static void nstippledSmoothLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesKHR.STIPPLEDSMOOTHLINES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLineRasterizationFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLineRasterizationFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLineRasterizationFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLineRasterizationFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#rectangularLines} field. */
        @NativeType("VkBool32")
        public boolean rectangularLines() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nrectangularLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#bresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean bresenhamLines() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nbresenhamLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#smoothLines} field. */
        @NativeType("VkBool32")
        public boolean smoothLines() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nsmoothLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#stippledRectangularLines} field. */
        @NativeType("VkBool32")
        public boolean stippledRectangularLines() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledRectangularLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#stippledBresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledBresenhamLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#stippledSmoothLines} field. */
        @NativeType("VkBool32")
        public boolean stippledSmoothLines() { return VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledSmoothLines(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#sType} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR} value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#sType} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer sType$Default() { return sType(KHRLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#rectangularLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#bresenhamLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#smoothLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#stippledRectangularLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#stippledBresenhamLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesKHR#stippledSmoothLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesKHR.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    }

}