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
 * Parameters for deserializing a micromap.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The source memory pointed to by {@code src} <b>must</b> contain data previously serialized using {@link EXTOpacityMicromap#vkCmdCopyMicromapToMemoryEXT CmdCopyMicromapToMemoryEXT}</li>
 * <li>{@code mode} <b>must</b> be {@link EXTOpacityMicromap#VK_COPY_MICROMAP_MODE_DESERIALIZE_EXT COPY_MICROMAP_MODE_DESERIALIZE_EXT}</li>
 * <li>The data in {@code src} <b>must</b> have a format compatible with the destination physical device as returned by {@link EXTOpacityMicromap#vkGetDeviceMicromapCompatibilityEXT GetDeviceMicromapCompatibilityEXT}</li>
 * <li>{@code dst} <b>must</b> have been created with a {@code size} greater than or equal to that used to serialize the data in {@code src}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code dst} <b>must</b> be a valid {@code VkMicromapEXT} handle</li>
 * <li>{@code mode} <b>must</b> be a valid {@code VkCopyMicromapModeEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstKHR}, {@link EXTOpacityMicromap#vkCmdCopyMemoryToMicromapEXT CmdCopyMemoryToMicromapEXT}, {@link EXTOpacityMicromap#vkCopyMemoryToMicromapEXT CopyMemoryToMicromapEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMemoryToMicromapInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkDeviceOrHostAddressConstKHR VkDeviceOrHostAddressConstKHR} {@link #src};
 *     VkMicromapEXT {@link #dst};
 *     VkCopyMicromapModeEXT {@link #mode};
 * }</code></pre>
 */
public class VkCopyMemoryToMicromapInfoEXT extends Struct<VkCopyMemoryToMicromapInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRC,
        DST,
        MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkDeviceOrHostAddressConstKHR.SIZEOF, VkDeviceOrHostAddressConstKHR.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRC = layout.offsetof(2);
        DST = layout.offsetof(3);
        MODE = layout.offsetof(4);
    }

    protected VkCopyMemoryToMicromapInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToMicromapInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToMicromapInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToMicromapInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToMicromapInfoEXT(ByteBuffer container) {
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
    /** the device or host address to memory containing the source data for the copy. */
    public VkDeviceOrHostAddressConstKHR src() { return nsrc(address()); }
    /** the target micromap for the copy. */
    @NativeType("VkMicromapEXT")
    public long dst() { return ndst(address()); }
    /** a {@code VkCopyMicromapModeEXT} value specifying additional operations to perform during the copy. */
    @NativeType("VkCopyMicromapModeEXT")
    public int mode() { return nmode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyMemoryToMicromapInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT} value to the {@link #sType} field. */
    public VkCopyMemoryToMicromapInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyMemoryToMicromapInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link #src} field. */
    public VkCopyMemoryToMicromapInfoEXT src(VkDeviceOrHostAddressConstKHR value) { nsrc(address(), value); return this; }
    /** Passes the {@link #src} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToMicromapInfoEXT src(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(src()); return this; }
    /** Sets the specified value to the {@link #dst} field. */
    public VkCopyMemoryToMicromapInfoEXT dst(@NativeType("VkMicromapEXT") long value) { ndst(address(), value); return this; }
    /** Sets the specified value to the {@link #mode} field. */
    public VkCopyMemoryToMicromapInfoEXT mode(@NativeType("VkCopyMicromapModeEXT") int value) { nmode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToMicromapInfoEXT set(
        int sType,
        long pNext,
        VkDeviceOrHostAddressConstKHR src,
        long dst,
        int mode
    ) {
        sType(sType);
        pNext(pNext);
        src(src);
        dst(dst);
        mode(mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyMemoryToMicromapInfoEXT set(VkCopyMemoryToMicromapInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToMicromapInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToMicromapInfoEXT malloc() {
        return new VkCopyMemoryToMicromapInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToMicromapInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToMicromapInfoEXT calloc() {
        return new VkCopyMemoryToMicromapInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToMicromapInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToMicromapInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToMicromapInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToMicromapInfoEXT} instance for the specified memory address. */
    public static VkCopyMemoryToMicromapInfoEXT create(long address) {
        return new VkCopyMemoryToMicromapInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToMicromapInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToMicromapInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToMicromapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToMicromapInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToMicromapInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToMicromapInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToMicromapInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToMicromapInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToMicromapInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToMicromapInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToMicromapInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToMicromapInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToMicromapInfoEXT malloc(MemoryStack stack) {
        return new VkCopyMemoryToMicromapInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToMicromapInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToMicromapInfoEXT calloc(MemoryStack stack) {
        return new VkCopyMemoryToMicromapInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToMicromapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToMicromapInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToMicromapInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToMicromapInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyMemoryToMicromapInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryToMicromapInfoEXT.PNEXT); }
    /** Unsafe version of {@link #src}. */
    public static VkDeviceOrHostAddressConstKHR nsrc(long struct) { return VkDeviceOrHostAddressConstKHR.create(struct + VkCopyMemoryToMicromapInfoEXT.SRC); }
    /** Unsafe version of {@link #dst}. */
    public static long ndst(long struct) { return memGetLong(struct + VkCopyMemoryToMicromapInfoEXT.DST); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + VkCopyMemoryToMicromapInfoEXT.MODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyMemoryToMicromapInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryToMicromapInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #src(VkDeviceOrHostAddressConstKHR) src}. */
    public static void nsrc(long struct, VkDeviceOrHostAddressConstKHR value) { memCopy(value.address(), struct + VkCopyMemoryToMicromapInfoEXT.SRC, VkDeviceOrHostAddressConstKHR.SIZEOF); }
    /** Unsafe version of {@link #dst(long) dst}. */
    public static void ndst(long struct, long value) { memPutLong(struct + VkCopyMemoryToMicromapInfoEXT.DST, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + VkCopyMemoryToMicromapInfoEXT.MODE, value); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToMicromapInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToMicromapInfoEXT, Buffer> implements NativeResource {

        private static final VkCopyMemoryToMicromapInfoEXT ELEMENT_FACTORY = VkCopyMemoryToMicromapInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToMicromapInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToMicromapInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToMicromapInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMemoryToMicromapInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryToMicromapInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkCopyMemoryToMicromapInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryToMicromapInfoEXT.npNext(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstKHR} view of the {@link VkCopyMemoryToMicromapInfoEXT#src} field. */
        public VkDeviceOrHostAddressConstKHR src() { return VkCopyMemoryToMicromapInfoEXT.nsrc(address()); }
        /** @return the value of the {@link VkCopyMemoryToMicromapInfoEXT#dst} field. */
        @NativeType("VkMicromapEXT")
        public long dst() { return VkCopyMemoryToMicromapInfoEXT.ndst(address()); }
        /** @return the value of the {@link VkCopyMemoryToMicromapInfoEXT#mode} field. */
        @NativeType("VkCopyMicromapModeEXT")
        public int mode() { return VkCopyMemoryToMicromapInfoEXT.nmode(address()); }

        /** Sets the specified value to the {@link VkCopyMemoryToMicromapInfoEXT#sType} field. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToMicromapInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT} value to the {@link VkCopyMemoryToMicromapInfoEXT#sType} field. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_MICROMAP_INFO_EXT); }
        /** Sets the specified value to the {@link VkCopyMemoryToMicromapInfoEXT#pNext} field. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToMicromapInfoEXT.npNext(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstKHR} to the {@link VkCopyMemoryToMicromapInfoEXT#src} field. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer src(VkDeviceOrHostAddressConstKHR value) { VkCopyMemoryToMicromapInfoEXT.nsrc(address(), value); return this; }
        /** Passes the {@link VkCopyMemoryToMicromapInfoEXT#src} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer src(java.util.function.Consumer<VkDeviceOrHostAddressConstKHR> consumer) { consumer.accept(src()); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToMicromapInfoEXT#dst} field. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer dst(@NativeType("VkMicromapEXT") long value) { VkCopyMemoryToMicromapInfoEXT.ndst(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToMicromapInfoEXT#mode} field. */
        public VkCopyMemoryToMicromapInfoEXT.Buffer mode(@NativeType("VkCopyMicromapModeEXT") int value) { VkCopyMemoryToMicromapInfoEXT.nmode(address(), value); return this; }

    }

}