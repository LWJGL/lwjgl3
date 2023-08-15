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
 * Structure specifying build sizes for a micromap.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTOpacityMicromap#vkGetMicromapBuildSizesEXT GetMicromapBuildSizesEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMicromapBuildSizesInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #micromapSize};
 *     VkDeviceSize {@link #buildScratchSize};
 *     VkBool32 {@link #discardable};
 * }</code></pre>
 */
public class VkMicromapBuildSizesInfoEXT extends Struct<VkMicromapBuildSizesInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MICROMAPSIZE,
        BUILDSCRATCHSIZE,
        DISCARDABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MICROMAPSIZE = layout.offsetof(2);
        BUILDSCRATCHSIZE = layout.offsetof(3);
        DISCARDABLE = layout.offsetof(4);
    }

    protected VkMicromapBuildSizesInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapBuildSizesInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapBuildSizesInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMicromapBuildSizesInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapBuildSizesInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the size in bytes required in a {@code VkMicromapEXT} for a build or update operation. */
    @NativeType("VkDeviceSize")
    public long micromapSize() { return nmicromapSize(address()); }
    /** the size in bytes required in a scratch buffer for a build operation. */
    @NativeType("VkDeviceSize")
    public long buildScratchSize() { return nbuildScratchSize(address()); }
    /** indicates whether or not the micromap object may be destroyed after an acceleration structure build or update. A false value means that acceleration structures built with this micromap <b>may</b> contain references to the data contained therein, and the application <b>must</b> not destroy the micromap until ray traversal has concluded. A true value means that the information in the micromap will be copied by value into the acceleration structure, and the micromap <b>may</b> be destroyed after the acceleration structure build concludes. */
    @NativeType("VkBool32")
    public boolean discardable() { return ndiscardable(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMicromapBuildSizesInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT} value to the {@link #sType} field. */
    public VkMicromapBuildSizesInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMicromapBuildSizesInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #micromapSize} field. */
    public VkMicromapBuildSizesInfoEXT micromapSize(@NativeType("VkDeviceSize") long value) { nmicromapSize(address(), value); return this; }
    /** Sets the specified value to the {@link #buildScratchSize} field. */
    public VkMicromapBuildSizesInfoEXT buildScratchSize(@NativeType("VkDeviceSize") long value) { nbuildScratchSize(address(), value); return this; }
    /** Sets the specified value to the {@link #discardable} field. */
    public VkMicromapBuildSizesInfoEXT discardable(@NativeType("VkBool32") boolean value) { ndiscardable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapBuildSizesInfoEXT set(
        int sType,
        long pNext,
        long micromapSize,
        long buildScratchSize,
        boolean discardable
    ) {
        sType(sType);
        pNext(pNext);
        micromapSize(micromapSize);
        buildScratchSize(buildScratchSize);
        discardable(discardable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMicromapBuildSizesInfoEXT set(VkMicromapBuildSizesInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapBuildSizesInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapBuildSizesInfoEXT malloc() {
        return new VkMicromapBuildSizesInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapBuildSizesInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapBuildSizesInfoEXT calloc() {
        return new VkMicromapBuildSizesInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapBuildSizesInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMicromapBuildSizesInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapBuildSizesInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapBuildSizesInfoEXT} instance for the specified memory address. */
    public static VkMicromapBuildSizesInfoEXT create(long address) {
        return new VkMicromapBuildSizesInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapBuildSizesInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMicromapBuildSizesInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMicromapBuildSizesInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildSizesInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapBuildSizesInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildSizesInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapBuildSizesInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildSizesInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapBuildSizesInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildSizesInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMicromapBuildSizesInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapBuildSizesInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapBuildSizesInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapBuildSizesInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapBuildSizesInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapBuildSizesInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapBuildSizesInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapBuildSizesInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildSizesInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapBuildSizesInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapBuildSizesInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildSizesInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMicromapBuildSizesInfoEXT.PNEXT); }
    /** Unsafe version of {@link #micromapSize}. */
    public static long nmicromapSize(long struct) { return UNSAFE.getLong(null, struct + VkMicromapBuildSizesInfoEXT.MICROMAPSIZE); }
    /** Unsafe version of {@link #buildScratchSize}. */
    public static long nbuildScratchSize(long struct) { return UNSAFE.getLong(null, struct + VkMicromapBuildSizesInfoEXT.BUILDSCRATCHSIZE); }
    /** Unsafe version of {@link #discardable}. */
    public static int ndiscardable(long struct) { return UNSAFE.getInt(null, struct + VkMicromapBuildSizesInfoEXT.DISCARDABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildSizesInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMicromapBuildSizesInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #micromapSize(long) micromapSize}. */
    public static void nmicromapSize(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapBuildSizesInfoEXT.MICROMAPSIZE, value); }
    /** Unsafe version of {@link #buildScratchSize(long) buildScratchSize}. */
    public static void nbuildScratchSize(long struct, long value) { UNSAFE.putLong(null, struct + VkMicromapBuildSizesInfoEXT.BUILDSCRATCHSIZE, value); }
    /** Unsafe version of {@link #discardable(boolean) discardable}. */
    public static void ndiscardable(long struct, int value) { UNSAFE.putInt(null, struct + VkMicromapBuildSizesInfoEXT.DISCARDABLE, value); }

    // -----------------------------------

    /** An array of {@link VkMicromapBuildSizesInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMicromapBuildSizesInfoEXT, Buffer> implements NativeResource {

        private static final VkMicromapBuildSizesInfoEXT ELEMENT_FACTORY = VkMicromapBuildSizesInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMicromapBuildSizesInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapBuildSizesInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapBuildSizesInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMicromapBuildSizesInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMicromapBuildSizesInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkMicromapBuildSizesInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMicromapBuildSizesInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkMicromapBuildSizesInfoEXT#micromapSize} field. */
        @NativeType("VkDeviceSize")
        public long micromapSize() { return VkMicromapBuildSizesInfoEXT.nmicromapSize(address()); }
        /** @return the value of the {@link VkMicromapBuildSizesInfoEXT#buildScratchSize} field. */
        @NativeType("VkDeviceSize")
        public long buildScratchSize() { return VkMicromapBuildSizesInfoEXT.nbuildScratchSize(address()); }
        /** @return the value of the {@link VkMicromapBuildSizesInfoEXT#discardable} field. */
        @NativeType("VkBool32")
        public boolean discardable() { return VkMicromapBuildSizesInfoEXT.ndiscardable(address()) != 0; }

        /** Sets the specified value to the {@link VkMicromapBuildSizesInfoEXT#sType} field. */
        public VkMicromapBuildSizesInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMicromapBuildSizesInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT} value to the {@link VkMicromapBuildSizesInfoEXT#sType} field. */
        public VkMicromapBuildSizesInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT); }
        /** Sets the specified value to the {@link VkMicromapBuildSizesInfoEXT#pNext} field. */
        public VkMicromapBuildSizesInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMicromapBuildSizesInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildSizesInfoEXT#micromapSize} field. */
        public VkMicromapBuildSizesInfoEXT.Buffer micromapSize(@NativeType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.nmicromapSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildSizesInfoEXT#buildScratchSize} field. */
        public VkMicromapBuildSizesInfoEXT.Buffer buildScratchSize(@NativeType("VkDeviceSize") long value) { VkMicromapBuildSizesInfoEXT.nbuildScratchSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkMicromapBuildSizesInfoEXT#discardable} field. */
        public VkMicromapBuildSizesInfoEXT.Buffer discardable(@NativeType("VkBool32") boolean value) { VkMicromapBuildSizesInfoEXT.ndiscardable(address(), value ? 1 : 0); return this; }

    }

}