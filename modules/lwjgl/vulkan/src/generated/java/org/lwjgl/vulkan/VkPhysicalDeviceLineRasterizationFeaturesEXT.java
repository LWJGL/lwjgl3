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
 * <p>If the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceLineRasterizationFeaturesEXT {
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
public class VkPhysicalDeviceLineRasterizationFeaturesEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines">rectangular line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean rectangularLines() { return nrectangularLines(address()) != 0; }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-bresenham">Bresenham-style line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean bresenhamLines() { return nbresenhamLines(address()) != 0; }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-smooth">smooth line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean smoothLines() { return nsmoothLines(address()) != 0; }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT} lines, or with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT LINE_RASTERIZATION_MODE_DEFAULT_EXT} lines if {@link VkPhysicalDeviceLimits}{@code ::strictLines} is {@link VK10#VK_TRUE TRUE}. */
    @NativeType("VkBool32")
    public boolean stippledRectangularLines() { return nstippledRectangularLines(address()) != 0; }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT} lines. */
    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() { return nstippledBresenhamLines(address()) != 0; }
    /** indicates whether the implementation supports <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a> with {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT} lines. */
    @NativeType("VkBool32")
    public boolean stippledSmoothLines() { return nstippledSmoothLines(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT sType$Default() { return sType(EXTLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #rectangularLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT rectangularLines(@NativeType("VkBool32") boolean value) { nrectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #bresenhamLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT bresenhamLines(@NativeType("VkBool32") boolean value) { nbresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #smoothLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT smoothLines(@NativeType("VkBool32") boolean value) { nsmoothLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledRectangularLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledRectangularLines(@NativeType("VkBool32") boolean value) { nstippledRectangularLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledBresenhamLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledBresenhamLines(@NativeType("VkBool32") boolean value) { nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #stippledSmoothLines} field. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledSmoothLines(@NativeType("VkBool32") boolean value) { nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLineRasterizationFeaturesEXT set(
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
    public VkPhysicalDeviceLineRasterizationFeaturesEXT set(VkPhysicalDeviceLineRasterizationFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT malloc() {
        return wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT calloc() {
        return wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT create(long address) {
        return wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceLineRasterizationFeaturesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #rectangularLines}. */
    public static int nrectangularLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.RECTANGULARLINES); }
    /** Unsafe version of {@link #bresenhamLines}. */
    public static int nbresenhamLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.BRESENHAMLINES); }
    /** Unsafe version of {@link #smoothLines}. */
    public static int nsmoothLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.SMOOTHLINES); }
    /** Unsafe version of {@link #stippledRectangularLines}. */
    public static int nstippledRectangularLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STIPPLEDRECTANGULARLINES); }
    /** Unsafe version of {@link #stippledBresenhamLines}. */
    public static int nstippledBresenhamLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STIPPLEDBRESENHAMLINES); }
    /** Unsafe version of {@link #stippledSmoothLines}. */
    public static int nstippledSmoothLines(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STIPPLEDSMOOTHLINES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #rectangularLines(boolean) rectangularLines}. */
    public static void nrectangularLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.RECTANGULARLINES, value); }
    /** Unsafe version of {@link #bresenhamLines(boolean) bresenhamLines}. */
    public static void nbresenhamLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.BRESENHAMLINES, value); }
    /** Unsafe version of {@link #smoothLines(boolean) smoothLines}. */
    public static void nsmoothLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.SMOOTHLINES, value); }
    /** Unsafe version of {@link #stippledRectangularLines(boolean) stippledRectangularLines}. */
    public static void nstippledRectangularLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STIPPLEDRECTANGULARLINES, value); }
    /** Unsafe version of {@link #stippledBresenhamLines(boolean) stippledBresenhamLines}. */
    public static void nstippledBresenhamLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STIPPLEDBRESENHAMLINES, value); }
    /** Unsafe version of {@link #stippledSmoothLines(boolean) stippledSmoothLines}. */
    public static void nstippledSmoothLines(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceLineRasterizationFeaturesEXT.STIPPLEDSMOOTHLINES, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLineRasterizationFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLineRasterizationFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLineRasterizationFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceLineRasterizationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#rectangularLines} field. */
        @NativeType("VkBool32")
        public boolean rectangularLines() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nrectangularLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#bresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean bresenhamLines() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nbresenhamLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#smoothLines} field. */
        @NativeType("VkBool32")
        public boolean smoothLines() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nsmoothLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#stippledRectangularLines} field. */
        @NativeType("VkBool32")
        public boolean stippledRectangularLines() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledRectangularLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#stippledBresenhamLines} field. */
        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledBresenhamLines(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#stippledSmoothLines} field. */
        @NativeType("VkBool32")
        public boolean stippledSmoothLines() { return VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledSmoothLines(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#sType} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT} value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#sType} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer sType$Default() { return sType(EXTLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#rectangularLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer rectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nrectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#bresenhamLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer bresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nbresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#smoothLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer smoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nsmoothLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#stippledRectangularLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledRectangularLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#stippledBresenhamLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledBresenhamLines(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceLineRasterizationFeaturesEXT#stippledSmoothLines} field. */
        public VkPhysicalDeviceLineRasterizationFeaturesEXT.Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledSmoothLines(address(), value ? 1 : 0); return this; }

    }

}