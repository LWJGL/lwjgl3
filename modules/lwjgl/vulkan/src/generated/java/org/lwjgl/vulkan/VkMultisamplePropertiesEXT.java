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
 * Structure returning information about sample count specific additional multisampling capabilities.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSampleLocations#VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link EXTSampleLocations#vkGetPhysicalDeviceMultisamplePropertiesEXT GetPhysicalDeviceMultisamplePropertiesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMultisamplePropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkExtent2D VkExtent2D} {@link #maxSampleLocationGridSize};
 * }</code></pre>
 */
public class VkMultisamplePropertiesEXT extends Struct<VkMultisamplePropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXSAMPLELOCATIONGRIDSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSAMPLELOCATIONGRIDSIZE = layout.offsetof(2);
    }

    protected VkMultisamplePropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMultisamplePropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMultisamplePropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkMultisamplePropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultisamplePropertiesEXT(ByteBuffer container) {
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
    /** the maximum size of the pixel grid in which sample locations <b>can</b> vary. */
    public VkExtent2D maxSampleLocationGridSize() { return nmaxSampleLocationGridSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMultisamplePropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkMultisamplePropertiesEXT sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMultisamplePropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultisamplePropertiesEXT set(
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
    public VkMultisamplePropertiesEXT set(VkMultisamplePropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultisamplePropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultisamplePropertiesEXT malloc() {
        return new VkMultisamplePropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMultisamplePropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultisamplePropertiesEXT calloc() {
        return new VkMultisamplePropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMultisamplePropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkMultisamplePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultisamplePropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMultisamplePropertiesEXT} instance for the specified memory address. */
    public static VkMultisamplePropertiesEXT create(long address) {
        return new VkMultisamplePropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMultisamplePropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkMultisamplePropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkMultisamplePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultisamplePropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultisamplePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultisamplePropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultisamplePropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultisamplePropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMultisamplePropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultisamplePropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMultisamplePropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkMultisamplePropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkMultisamplePropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultisamplePropertiesEXT malloc(MemoryStack stack) {
        return new VkMultisamplePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMultisamplePropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultisamplePropertiesEXT calloc(MemoryStack stack) {
        return new VkMultisamplePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMultisamplePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultisamplePropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultisamplePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultisamplePropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMultisamplePropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMultisamplePropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #maxSampleLocationGridSize}. */
    public static VkExtent2D nmaxSampleLocationGridSize(long struct) { return VkExtent2D.create(struct + VkMultisamplePropertiesEXT.MAXSAMPLELOCATIONGRIDSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMultisamplePropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMultisamplePropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkMultisamplePropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkMultisamplePropertiesEXT, Buffer> implements NativeResource {

        private static final VkMultisamplePropertiesEXT ELEMENT_FACTORY = VkMultisamplePropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkMultisamplePropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultisamplePropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMultisamplePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMultisamplePropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMultisamplePropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkMultisamplePropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkMultisamplePropertiesEXT.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkMultisamplePropertiesEXT#maxSampleLocationGridSize} field. */
        public VkExtent2D maxSampleLocationGridSize() { return VkMultisamplePropertiesEXT.nmaxSampleLocationGridSize(address()); }

        /** Sets the specified value to the {@link VkMultisamplePropertiesEXT#sType} field. */
        public VkMultisamplePropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMultisamplePropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSampleLocations#VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT} value to the {@link VkMultisamplePropertiesEXT#sType} field. */
        public VkMultisamplePropertiesEXT.Buffer sType$Default() { return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkMultisamplePropertiesEXT#pNext} field. */
        public VkMultisamplePropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkMultisamplePropertiesEXT.npNext(address(), value); return this; }

    }

}